package com.facebook.ads.internal.q.a;

import java.util.Locale;

/* loaded from: classes.dex */
public class r {
    public static String a(double d2) {
        return String.format(Locale.US, "%.3f", Double.valueOf(d2));
    }

    public static String a(long j) {
        double d2 = j;
        Double.isNaN(d2);
        return a(d2 / 1000.0d);
    }
}
