package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class hg1 {
    private hg1() {
    }

    public static eg1 a() {
        Handler handler = new Handler(Looper.getMainLooper());
        Intrinsics.checkNotNullParameter(handler, "handler");
        int i4 = eg1.f25287a;
        Intrinsics.checkNotNullParameter(handler, "handler");
        return new fg1(true, handler);
    }
}
