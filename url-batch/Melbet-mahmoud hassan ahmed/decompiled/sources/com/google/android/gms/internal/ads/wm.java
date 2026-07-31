package com.google.android.gms.internal.ads;

import android.os.Trace;

/* loaded from: classes.dex */
public final class wm {
    public static void a(String str) {
        if (zm.f15186a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void b() {
        if (zm.f15186a >= 18) {
            Trace.endSection();
        }
    }
}
