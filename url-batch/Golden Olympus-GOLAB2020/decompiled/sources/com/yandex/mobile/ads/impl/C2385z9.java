package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Build;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.z9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2385z9 {
    public static final boolean a(@Nullable Context context) {
        return (context == null || (context.getApplicationInfo().flags & 2) == 0) ? false : true;
    }

    public static final boolean a(int i4) {
        return Build.VERSION.SDK_INT >= i4;
    }
}
