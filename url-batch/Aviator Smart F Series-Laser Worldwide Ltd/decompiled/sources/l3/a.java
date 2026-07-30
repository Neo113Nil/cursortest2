package l3;

import com.moyoung.dafit.module.common.widgets.chart.CrpBarChart;
import java.util.List;

/* loaded from: classes2.dex */
public class a extends g5.a {
    public static final int BAR_MAX_VALUE = 110;
    public static final int DAY_CHART_BAR_COUNT = 48;
    public static final int DEFAULT_STRESS = 10;
    public static final int WEEK_CHART_BAR_COUNT = 7;

    public int getStress(float f8) {
        return (int) (f8 - 10.0f);
    }

    @Override // g5.a
    public void setChartData(CrpBarChart crpBarChart, List<Float> list, int i8, int i9) {
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                list.set(i10, Float.valueOf(list.get(i10).floatValue() + 10.0f));
            }
        }
        super.setChartData(crpBarChart, list, i8, i9);
    }
}
