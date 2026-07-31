package com.yandex.mobile.ads.impl;

import android.os.Trace;

/* loaded from: classes3.dex */
public final class j52 {
    public static void a(String str) {
        if (u82.f32873a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void a() {
        if (u82.f32873a >= 18) {
            Trace.endSection();
        }
    }
}
