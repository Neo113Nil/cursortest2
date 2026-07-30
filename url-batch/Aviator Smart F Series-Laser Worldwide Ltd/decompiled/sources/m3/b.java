package m3;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.widgets.HeartRateMarkerView;
import com.github.mikephil.charting.components.MarkerView;
import com.moyoung.dafit.module.common.widgets.chart.CrpBarChart;
import java.util.List;

/* loaded from: classes2.dex */
public class b {
    public static final float MAX_BLOOD_OXYGEN = 100.0f;
    public static final float MIN_BLOOD_OXYGEN = 80.0f;
    private CrpBarChart chart;
    private Context context;

    public b(Context context, CrpBarChart crpBarChart) {
        this.context = context;
        this.chart = crpBarChart;
    }

    public void initChart() {
        this.chart.setup(400);
        this.chart.getXAxis().setDrawLabels(false);
        ContextCompat.getColor(this.context, R.color.color_blood_oxygen);
        this.chart.setLeftAxis();
        this.chart.setMaxValue(100.0f);
        this.chart.setMinValue(80.0f);
        int color = ContextCompat.getColor(this.context, R.color.color_heart_rate_chart_bg);
        this.chart.setDrawGridBackground(true);
        this.chart.setGridBackgroundColor(color);
    }

    public void setChartData(List<Float> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.chart.setData(false, new int[]{ContextCompat.getColor(this.context, R.color.color_blood_oxygen)}, ContextCompat.getColor(this.context, R.color.color_blood_oxygen), 0.4f, list);
    }

    public void setMarkerView(int i8, int i9) {
        this.chart.setMarkerView((MarkerView) new HeartRateMarkerView(this.context, i8, i9));
    }
}
