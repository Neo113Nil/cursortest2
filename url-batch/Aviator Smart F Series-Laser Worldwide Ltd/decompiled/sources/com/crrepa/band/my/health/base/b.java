package com.crrepa.band.my.health.base;

import android.content.Context;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.band.provider.BandTimeSystemProvider;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Date;

/* loaded from: classes2.dex */
public class b {
    private b() {
    }

    public static void setMeasureDate(Context context, BaseViewHolder baseViewHolder, Date date) {
        String string = context.getString(R.string.month_day_unit_format);
        String string2 = context.getString(R.string.hour_minute_format_24);
        if (BandTimeSystemProvider.is12HourTime()) {
            string2 = context.getString(R.string.hour_minute_format_12);
        }
        String format = m.format(date, string);
        String format2 = m.format(date, string2);
        baseViewHolder.setText(R.id.tv_item_measure_date, format);
        baseViewHolder.setText(R.id.tv_item_measure_time, format2);
    }
}
