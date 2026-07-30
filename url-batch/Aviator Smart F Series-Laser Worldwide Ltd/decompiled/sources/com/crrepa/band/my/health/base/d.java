package com.crrepa.band.my.health.base;

import android.content.Context;
import android.widget.TextView;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.n;
import java.util.Date;

/* loaded from: classes2.dex */
public class d {
    private d() {
    }

    public static void setBandDataMeasureDate(Context context, TextView textView, Date date) {
        textView.setText(m.format(date, context.getString(R.string.hour_minute_format_12)));
    }

    public static void setBandDataStatisticsDate(Context context, TextView textView, Date date) {
        textView.setText(m.format(date, context.getString(R.string.today_date_format)));
    }

    public static void setBandMeasureData(Context context, TextView textView, int i8) {
        textView.setText(i8 >= 0 ? String.valueOf(i8) : context.getString(R.string.data_blank));
    }

    public static void setBandMeasureFloatData(Context context, TextView textView, float f8) {
        textView.setText(0.0f <= f8 ? n.format(f8) : context.getString(R.string.data_blank));
    }
}
