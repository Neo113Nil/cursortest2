package k3;

import android.content.Context;
import com.crrepa.band.aviator.R;
import com.github.mikephil.charting.formatter.g;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.u;
import java.util.Date;

/* loaded from: classes2.dex */
public class d extends g {
    private String[] axisValueArray;

    public d(Context context, Date date) {
        this.axisValueArray = getAxisValues(context, date);
    }

    private String[] getAxisValues(Context context, Date date) {
        String[] strArr = new String[7];
        if (date == null) {
            date = new Date();
        }
        String string = context.getString(R.string.month_day_format);
        if (u.isEN()) {
            string = context.getString(R.string.month_day_format_en);
        }
        for (int i8 = 0; i8 < 7; i8++) {
            strArr[6 - i8] = m.format(m.getDateOfOffsetDay(date, -i8), string);
        }
        return strArr;
    }

    @Override // com.github.mikephil.charting.formatter.g
    public String getAxisLabel(float f8, com.github.mikephil.charting.components.a aVar) {
        return this.axisValueArray[(int) (f8 % r3.length)];
    }
}
