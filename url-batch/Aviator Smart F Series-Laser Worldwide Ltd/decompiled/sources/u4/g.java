package u4;

import android.graphics.RectF;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.i;
import com.github.mikephil.charting.data.k;

/* loaded from: classes3.dex */
public interface g extends b {
    YAxis getAxis(YAxis.AxisDependency axisDependency);

    @Override // u4.b, u4.e
    /* synthetic */ com.github.mikephil.charting.utils.e getCenterOfView();

    @Override // u4.b, u4.e
    /* synthetic */ com.github.mikephil.charting.utils.e getCenterOffsets();

    @Override // u4.b, u4.e
    /* synthetic */ RectF getContentRect();

    @Override // u4.b
    /* synthetic */ com.github.mikephil.charting.data.c getData();

    @Override // u4.b, u4.e, u4.b
    /* synthetic */ i getData();

    @Override // u4.b, u4.e
    /* synthetic */ com.github.mikephil.charting.formatter.g getDefaultValueFormatter();

    @Override // u4.b, u4.e
    /* synthetic */ int getHeight();

    @Override // u4.b
    /* synthetic */ float getHighestVisibleX();

    k getLineData();

    @Override // u4.b
    /* synthetic */ float getLowestVisibleX();

    @Override // u4.b, u4.e
    /* synthetic */ float getMaxHighlightDistance();

    @Override // u4.b
    /* synthetic */ int getMaxVisibleCount();

    @Override // u4.b
    /* synthetic */ com.github.mikephil.charting.utils.g getTransformer(YAxis.AxisDependency axisDependency);

    @Override // u4.b, u4.e
    /* synthetic */ int getWidth();

    @Override // u4.b, u4.e
    /* synthetic */ float getXChartMax();

    @Override // u4.b, u4.e
    /* synthetic */ float getXChartMin();

    @Override // u4.b, u4.e
    /* synthetic */ float getXRange();

    @Override // u4.b
    /* synthetic */ float getYChartMax();

    @Override // u4.b
    /* synthetic */ float getYChartMin();

    @Override // u4.b
    /* synthetic */ boolean isInverted(YAxis.AxisDependency axisDependency);
}
