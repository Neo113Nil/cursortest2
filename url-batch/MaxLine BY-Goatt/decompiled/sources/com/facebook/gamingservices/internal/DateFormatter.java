package com.facebook.gamingservices.internal;

import android.os.Build;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class DateFormatter {
    public static final DateFormatter INSTANCE = new DateFormatter();

    private DateFormatter() {
    }

    public final ZonedDateTime format$facebook_gamingservices_release(String str) {
        str.getClass();
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ");
        ofPattern.getClass();
        return ZonedDateTime.parse(str, ofPattern);
    }
}
