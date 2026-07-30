package g5;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.formatter.g;
import com.moyoung.dafit.module.common.widgets.chart.CrpBarChart;
import java.util.List;

/* loaded from: classes4.dex */
public class a {
    public void initChart(CrpBarChart crpBarChart, int i8, int i9, g gVar) {
        crpBarChart.setup(i8);
        crpBarChart.setMaxValue(i9);
        crpBarChart.setXAxisValueFormatter(gVar);
        crpBarChart.setDrawValueAboveBar(true);
    }

    public void setChartData(CrpBarChart crpBarChart, List<Float> list, int i8, int i9) {
        Context context = crpBarChart.getContext();
        crpBarChart.setData(false, new int[]{ContextCompat.getColor(context, i8)}, ContextCompat.getColor(context, i9), 0.6f, list);
    }

    public void setXAxisStyle(CrpBarChart crpBarChart, int i8, int i9) {
        crpBarChart.setXAxisLineColor(i8);
        crpBarChart.setXAxisTextColor(i9);
        crpBarChart.setXAxisLineWidth(1);
    }
}
