package com.onesignal.common;

import android.os.Build;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l {
    public static final l INSTANCE = new l();

    private l() {
    }

    public final String getTimeZoneId() {
        ZoneId systemDefault;
        String id2;
        if (Build.VERSION.SDK_INT < 26) {
            String id3 = TimeZone.getDefault().getID();
            id3.getClass();
            return id3;
        }
        systemDefault = ZoneId.systemDefault();
        id2 = systemDefault.getId();
        id2.getClass();
        return id2;
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
