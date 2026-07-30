package m3;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.moyoung.dafit.module.common.widgets.chart.CrpLineChart;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class g {
    private static final int DEFAULT_MAX_VALUE = 150;
    private static final int DEFAULT_X_LABEL_COUNT = 49;
    private static final int Y_AXIS_LABLE_UNIT = 10;
    private CrpLineChart chart;
    private Context context;

    public g(Context context, CrpLineChart crpLineChart) {
        this.context = context;
        this.chart = crpLineChart;
    }

    public static int getMaxHrv(int i8) {
        return i8 <= DEFAULT_MAX_VALUE ? DEFAULT_MAX_VALUE : ((i8 / 100) + 1) * 100;
    }

    public void addXAxisLimitLine(int i8) {
        this.chart.getXAxis().removeAllLimitLines();
        for (float f8 = 0.5f; f8 < 24.0f; f8 = (float) (f8 + 0.5d)) {
            com.orhanobut.logger.f.d("addLimitLine: " + f8);
            LimitLine limitLine = new LimitLine(f8);
            limitLine.setLineColor(i8);
            if (f8 % 3.0f == 0.0f) {
                limitLine.setLineWidth(0.8f);
            } else {
                limitLine.setLineWidth(0.4f);
            }
            this.chart.getXAxis().addLimitLine(limitLine);
        }
    }

    public void addYAxisLimitLine(int i8, int i9) {
        this.chart.getAxisLeft().removeAllLimitLines();
        float f8 = i9;
        float f9 = f8 / 15.0f;
        for (float f10 = 0.0f; f10 <= 15.0f; f10 += 1.0f) {
            LimitLine limitLine = new LimitLine(f10 * f9);
            limitLine.setLineColor(i8);
            if (f10 % 5.0f != 0.0f || f10 == 0.0f || f10 == f8) {
                limitLine.setLineWidth(0.4f);
            } else {
                limitLine.setLineWidth(0.8f);
            }
            this.chart.getAxisLeft().addLimitLine(limitLine);
        }
    }

    public void init() {
        this.chart.init(49);
        XAxis xAxis = this.chart.getXAxis();
        xAxis.setDrawLabels(false);
        xAxis.setDrawGridLines(false);
        xAxis.setDrawAxisLine(false);
        xAxis.setEnabled(true);
        addXAxisLimitLine(ContextCompat.getColor(this.context, R.color.color_hrv));
        this.chart.setXAxisTextColor(R.color.black);
        this.chart.hideXAxisLabels();
        setLeftAxis(DEFAULT_MAX_VALUE);
    }

    public void setChartData(int[] iArr) {
        com.orhanobut.logger.f.d("setChartData: " + iArr.length);
        int color = ContextCompat.getColor(this.context, R.color.color_hrv);
        ArrayList arrayList = new ArrayList();
        for (int i8 : iArr) {
            arrayList.add(Float.valueOf(i8));
        }
        arrayList.add(0, Float.valueOf(0.0f));
        this.chart.setData(arrayList, color, 1.8f);
    }

    public void setLeftAxis(int i8) {
        YAxis axisLeft = this.chart.getAxisLeft();
        axisLeft.setDrawAxisLine(false);
        axisLeft.setDrawGridLines(false);
        axisLeft.setDrawLabels(true);
        axisLeft.setLabelCount((i8 / 10) + 1, true);
        axisLeft.setDrawZeroLine(false);
        axisLeft.setAxisLineColor(-1);
        axisLeft.setValueFormatter(new k3.c(i8));
        addYAxisLimitLine(ContextCompat.getColor(this.context, R.color.color_hrv), i8);
        axisLeft.setEnabled(true);
    }

    public void setMaxValue(int i8) {
        int maxHrv = getMaxHrv(i8);
        this.chart.setMaxValue(maxHrv);
        setLeftAxis(maxHrv);
    }
}
