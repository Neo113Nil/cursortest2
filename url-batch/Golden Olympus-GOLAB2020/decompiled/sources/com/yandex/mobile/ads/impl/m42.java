package com.yandex.mobile.ads.impl;

import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m42 {
    public static boolean a() {
        return Intrinsics.areEqual(Thread.currentThread(), Looper.getMainLooper().getThread());
    }
}
