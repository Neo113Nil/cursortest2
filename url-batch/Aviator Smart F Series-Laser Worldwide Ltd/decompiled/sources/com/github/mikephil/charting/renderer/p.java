package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class p extends l {
    protected u4.h mChart;
    float[] mPixelBuffer;

    public p(u4.h hVar, com.github.mikephil.charting.animation.a aVar, com.github.mikephil.charting.utils.j jVar) {
        super(aVar, jVar);
        this.mPixelBuffer = new float[2];
        this.mChart = hVar;
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawData(Canvas canvas) {
        Iterator<v4.e> it = this.mChart.getScatterData().getDataSets().iterator();
        if (it.hasNext()) {
            cn.hutool.core.convert.impl.s.a(it.next());
            throw null;
        }
    }

    protected void drawDataSet(Canvas canvas, v4.k kVar) {
        if (kVar.getEntryCount() < 1) {
            return;
        }
        this.mChart.getTransformer(kVar.getAxisDependency());
        this.mAnimator.getPhaseY();
        kVar.k();
        Log.i("MISSING", "There's no IShapeRenderer specified for ScatterDataSet");
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawExtras(Canvas canvas) {
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawHighlighted(Canvas canvas, com.github.mikephil.charting.highlight.d[] dVarArr) {
        com.github.mikephil.charting.data.p scatterData = this.mChart.getScatterData();
        for (com.github.mikephil.charting.highlight.d dVar : dVarArr) {
            cn.hutool.core.convert.impl.s.a(scatterData.getDataSetByIndex(dVar.getDataSetIndex()));
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawValue(Canvas canvas, String str, float f8, float f9, int i8) {
        this.mValuePaint.setColor(i8);
        canvas.drawText(str, f8, f9, this.mValuePaint);
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void drawValues(Canvas canvas) {
        if (isDrawingValuesAllowed(this.mChart)) {
            List<v4.e> dataSets = this.mChart.getScatterData().getDataSets();
            for (int i8 = 0; i8 < this.mChart.getScatterData().getDataSetCount(); i8++) {
                cn.hutool.core.convert.impl.s.a(dataSets.get(i8));
                if (shouldDrawValues(null)) {
                    throw null;
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void initBuffers() {
    }
}
