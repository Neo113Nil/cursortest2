package u4;

import android.graphics.RectF;
import com.github.mikephil.charting.data.i;

/* loaded from: classes3.dex */
public interface e {
    com.github.mikephil.charting.utils.e getCenterOfView();

    com.github.mikephil.charting.utils.e getCenterOffsets();

    RectF getContentRect();

    i getData();

    com.github.mikephil.charting.formatter.g getDefaultValueFormatter();

    int getHeight();

    float getMaxHighlightDistance();

    int getMaxVisibleCount();

    int getWidth();

    float getXChartMax();

    float getXChartMin();

    float getXRange();

    float getYChartMax();

    float getYChartMin();
}
