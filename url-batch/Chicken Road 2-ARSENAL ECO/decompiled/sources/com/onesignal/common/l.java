package com.onesignal.common;

import android.os.Build;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class l {
    public static final l INSTANCE = new l();

    private l() {
    }

    public final String getTimeZoneId() {
        ZoneId systemDefault;
        String id;
        if (Build.VERSION.SDK_INT < 26) {
            String id2 = TimeZone.getDefault().getID();
            kotlin.jvm.internal.i.b(id2);
            return id2;
        }
        systemDefault = ZoneId.systemDefault();
        id = systemDefault.getId();
        kotlin.jvm.internal.i.b(id);
        return id;
    }

    public final int getTimeZoneOffset() {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        int rawOffset = timeZone.getRawOffset();
        if (timeZone.inDaylightTime(new Date())) {
            rawOffset += timeZone.getDSTSavings();
        }
        return rawOffset / 1000;
    }
}
