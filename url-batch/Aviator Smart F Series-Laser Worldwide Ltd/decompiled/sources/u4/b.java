package u4;

import android.graphics.RectF;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.i;

/* loaded from: classes3.dex */
public interface b extends e {
    @Override // u4.e
    /* synthetic */ com.github.mikephil.charting.utils.e getCenterOfView();

    @Override // u4.e
    /* synthetic */ com.github.mikephil.charting.utils.e getCenterOffsets();

    @Override // u4.e
    /* synthetic */ RectF getContentRect();

    com.github.mikephil.charting.data.c getData();

    @Override // u4.e, u4.b
    /* synthetic */ i getData();

    @Override // u4.e
    /* synthetic */ com.github.mikephil.charting.formatter.g getDefaultValueFormatter();

    @Override // u4.e
    /* synthetic */ int getHeight();

    float getHighestVisibleX();

    float getLowestVisibleX();

    @Override // u4.e
    /* synthetic */ float getMaxHighlightDistance();

    /* synthetic */ int getMaxVisibleCount();

    com.github.mikephil.charting.utils.g getTransformer(YAxis.AxisDependency axisDependency);

    @Override // u4.e
    /* synthetic */ int getWidth();

    @Override // u4.e
    /* synthetic */ float getXChartMax();

    @Override // u4.e
    /* synthetic */ float getXChartMin();

    @Override // u4.e
    /* synthetic */ float getXRange();

    /* synthetic */ float getYChartMax();

    /* synthetic */ float getYChartMin();

    boolean isInverted(YAxis.AxisDependency axisDependency);
}
