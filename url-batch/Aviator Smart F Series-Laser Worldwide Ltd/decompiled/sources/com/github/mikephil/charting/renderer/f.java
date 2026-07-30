package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.util.Log;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.CombinedChart;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class f extends g {
    protected WeakReference<Chart> mChart;
    protected List<com.github.mikephil.charting.highlight.d> mHighlightBuffer;
    protected List<g> mRenderers;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder;

        static {
            int[] iArr = new int[CombinedChart.DrawOrder.values().length];
            $SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder = iArr;
            try {
                iArr[CombinedChart.DrawOrder.BAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder[CombinedChart.DrawOrder.BUBBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder[CombinedChart.DrawOrder.LINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder[CombinedChart.DrawOrder.CANDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder[CombinedChart.DrawOrder.SCATTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public f(CombinedChart combinedChart, com.github.mikephil.charting.animation.a aVar, com.github.mikephil.charting.utils.j jVar) {
        super(aVar, jVar);
        this.mRenderers = new ArrayList(5);
        this.mHighlightBuffer = new ArrayList();
        this.mChart = new WeakReference<>(combinedChart);
        createRenderers();
    }

    public void createRenderers() {
        this.mRenderers.clear();
        CombinedChart combinedChart = (CombinedChart) this.mChart.get();
        if (combinedChart == null) {
            return;
        }
        for (CombinedChart.DrawOrder drawOrder : combinedChart.getDrawOrder()) {
            int i8 = a.$SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder[drawOrder.ordinal()];
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 != 4) {
                            if (i8 == 5 && combinedChart.getScatterData() != null) {
                                this.mRenderers.add(new p(combinedChart, this.mAnimator, this.mViewPortHandler));
                            }
                        } else if (combinedChart.getCandleData() != null) {
                            this.mRenderers.add(new e(combinedChart, this.mAnimator, this.mViewPortHandler));
                        }
                    } else if (combinedChart.getLineData() != null) {
                        this.mRenderers.add(new j(combinedChart, this.mAnimator, this.mViewPortHandler));
                    }
                } else if (combinedChart.getBubbleData() != null) {
                    this.mRenderers.add(new d(combinedChart, this.mAnimator, this.mViewPortHandler));
                }
            } else if (combinedChart.getBarData() != null) {
                this.mRenderers.add(new b(combinedChart, this.mAnimator, this.mViewPortHandler));
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawData(Canvas canvas) {
        Iterator<g> it = this.mRenderers.iterator();
        while (it.hasNext()) {
            it.next().drawData(canvas);
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawExtras(Canvas canvas) {
        Iterator<g> it = this.mRenderers.iterator();
        while (it.hasNext()) {
            it.next().drawExtras(canvas);
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawHighlighted(Canvas canvas, com.github.mikephil.charting.highlight.d[] dVarArr) {
        Chart chart = this.mChart.get();
        if (chart == null) {
            return;
        }
        for (g gVar : this.mRenderers) {
            Object barData = gVar instanceof b ? ((b) gVar).mChart.getBarData() : gVar instanceof j ? ((j) gVar).mChart.getLineData() : gVar instanceof e ? ((e) gVar).mChart.getCandleData() : gVar instanceof p ? ((p) gVar).mChart.getScatterData() : gVar instanceof d ? ((d) gVar).mChart.getBubbleData() : null;
            int indexOf = barData == null ? -1 : ((com.github.mikephil.charting.data.j) chart.getData()).getAllData().indexOf(barData);
            this.mHighlightBuffer.clear();
            for (com.github.mikephil.charting.highlight.d dVar : dVarArr) {
                if (dVar.getDataIndex() == indexOf || dVar.getDataIndex() == -1) {
                    this.mHighlightBuffer.add(dVar);
                }
            }
            List<com.github.mikephil.charting.highlight.d> list = this.mHighlightBuffer;
            gVar.drawHighlighted(canvas, (com.github.mikephil.charting.highlight.d[]) list.toArray(new com.github.mikephil.charting.highlight.d[list.size()]));
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawValue(Canvas canvas, String str, float f8, float f9, int i8) {
        Log.e(Chart.LOG_TAG, "Erroneous call to drawValue() in CombinedChartRenderer!");
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawValues(Canvas canvas) {
        Iterator<g> it = this.mRenderers.iterator();
        while (it.hasNext()) {
            it.next().drawValues(canvas);
        }
    }

    public g getSubRenderer(int i8) {
        if (i8 >= this.mRenderers.size() || i8 < 0) {
            return null;
        }
        return this.mRenderers.get(i8);
    }

    public List<g> getSubRenderers() {
        return this.mRenderers;
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void initBuffers() {
        Iterator<g> it = this.mRenderers.iterator();
        while (it.hasNext()) {
            it.next().initBuffers();
        }
    }

    public void setSubRenderers(List<g> list) {
        this.mRenderers = list;
    }
}
