package com.onesignal.common;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {
    public static final b INSTANCE = new b();

    private b() {
    }

    public final SimpleDateFormat iso8601Format() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
    }
}
