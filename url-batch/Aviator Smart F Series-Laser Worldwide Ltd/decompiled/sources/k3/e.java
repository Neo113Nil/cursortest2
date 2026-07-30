package k3;

import com.github.mikephil.charting.formatter.g;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.u;
import java.util.Date;

/* loaded from: classes2.dex */
public class e extends g {
    private static final int FIRST_LABEL = 0;
    private static final int SECOND_LABEL = 9;
    private static final int THIRD_LABEL = 19;
    private int lastDayIndex;
    private int month;

    public e(Date date) {
        this.month = m.getMonth(date);
        this.lastDayIndex = m.getMonthCountDay(date) - 1;
    }

    private String formatLabel(int i8) {
        StringBuilder sb = new StringBuilder();
        if (u.isEN()) {
            sb.append(i8 + 1);
            sb.append("/");
            sb.append(this.month);
        } else {
            sb.append(this.month);
            sb.append("-");
            sb.append(i8 + 1);
        }
        return sb.toString();
    }

    @Override // com.github.mikephil.charting.formatter.g
    public String getAxisLabel(float f8, com.github.mikephil.charting.components.a aVar) {
        int intValue = Float.valueOf(f8).intValue();
        return (intValue == 0 || intValue == 9 || intValue == 19 || intValue == this.lastDayIndex) ? formatLabel(intValue) : "";
    }
}
