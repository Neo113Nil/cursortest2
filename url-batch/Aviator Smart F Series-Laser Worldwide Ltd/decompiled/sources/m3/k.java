package m3;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.widgets.HeartRateMarkerView;
import com.github.mikephil.charting.components.MarkerView;
import com.moyoung.dafit.module.common.widgets.chart.CrpBarChart;
import java.util.List;

/* loaded from: classes2.dex */
public class k {
    public static final int MAX_TEMP = 41;
    public static final int MIN_TEMP = 35;
    private CrpBarChart chart;
    private Context context;

    public k(Context context, CrpBarChart crpBarChart) {
        this.context = context;
        this.chart = crpBarChart;
    }

    private float formatTemp(float f8, boolean z7) {
        return z7 ? (int) l2.c.celsius2Fahrenheit(f8) : f8;
    }

    private int[] getBarColor(Context context, List<Float> list, boolean z7) {
        int[] iArr = new int[list.size()];
        int[] tempSegmentColors = l2.b.getTempSegmentColors(context);
        for (int i8 = 0; i8 < list.size(); i8++) {
            float floatValue = list.get(i8).floatValue();
            iArr[i8] = floatValue < formatTemp(36.3f, z7) ? tempSegmentColors[0] : floatValue < formatTemp(37.3f, z7) ? tempSegmentColors[1] : floatValue < formatTemp(38.0f, z7) ? tempSegmentColors[2] : floatValue < formatTemp(39.0f, z7) ? tempSegmentColors[3] : floatValue < formatTemp(41.0f, z7) ? tempSegmentColors[4] : tempSegmentColors[5];
        }
        return iArr;
    }

    public void initChart(boolean z7) {
        this.chart.setup(400);
        this.chart.getXAxis().setDrawLabels(false);
        this.chart.setMinValue(formatTemp(35.0f, z7));
        this.chart.setMaxValue(formatTemp(41.0f, z7));
        ContextCompat.getColor(this.context, R.color.color_temperature);
        this.chart.setLeftAxis();
        int color = ContextCompat.getColor(this.context, R.color.color_temp_chart_bg);
        this.chart.setDrawGridBackground(true);
        this.chart.setGridBackgroundColor(color);
    }

    public void setData(List<Float> list, boolean z7) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.chart.setData(false, getBarColor(this.context, list, z7), ContextCompat.getColor(this.context, R.color.white), 0.4f, list);
    }

    public void setMarkerView(int i8, int i9) {
        this.chart.setMarkerView((MarkerView) new HeartRateMarkerView(this.context, i8, i9));
    }
}
