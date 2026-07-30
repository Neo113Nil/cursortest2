package k3;

import android.content.Context;
import com.crrepa.band.aviator.R;
import com.github.mikephil.charting.formatter.g;
import com.moyoung.dafit.module.common.utils.k;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes2.dex */
public class b extends g {
    private Date date;
    private int interval;
    private String timeFormat;
    private int valueCount;

    public b(Context context, Date date, int i8, int i9) {
        this.date = date;
        this.interval = i8;
        this.timeFormat = context.getString(R.string.hour_minute_24_format);
        if (i8 < 60) {
            this.timeFormat = context.getString(R.string.hour_minute_second_24_format);
        }
        this.valueCount = i9;
    }

    @Override // com.github.mikephil.charting.formatter.g
    public String getAxisLabel(float f8, com.github.mikephil.charting.components.a aVar) {
        if (f8 < 0.0f) {
            return "";
        }
        int round = Math.round(f8);
        if (this.valueCount == 1 && round != 0) {
            return "";
        }
        Calendar calendar = k.getCalendar();
        calendar.setTime(this.date);
        calendar.add(13, round * this.interval);
        return m.format(calendar.getTime(), this.timeFormat);
    }
}
