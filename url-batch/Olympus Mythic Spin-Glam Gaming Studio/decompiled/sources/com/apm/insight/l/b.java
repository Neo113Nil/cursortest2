package com.apm.insight.l;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: DateUtils.java */
/* loaded from: classes4.dex */
public final class b {
    private static DateFormat a;

    public static DateFormat a() {
        if (a == null) {
            a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        }
        return a;
    }
}
