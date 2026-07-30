package com.crrepa.band.my.health.base;

import android.content.Context;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.band.provider.BandTimeSystemProvider;

/* loaded from: classes2.dex */
public class j {
    private j() {
    }

    public static String getSyncTimeFormat(Context context) {
        return BandTimeSystemProvider.is12HourTime() ? context.getString(R.string.sync_time_12) : context.getString(R.string.sync_time_24);
    }

    public static String getTrainingHeartRateTimeFormat(Context context, int i8) {
        return i8 < 60 ? BandTimeSystemProvider.is12HourTime() ? context.getString(R.string.hour_minute_second_format_12) : context.getString(R.string.hour_minute_second_format_24) : BandTimeSystemProvider.is12HourTime() ? context.getString(R.string.hour_minute_format_12) : context.getString(R.string.hour_minute_format_24);
    }
}
