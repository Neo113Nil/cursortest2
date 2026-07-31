package com.yandex.mobile.ads.impl;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class xf1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f34544a = "Yandex";

    /* renamed from: b, reason: collision with root package name */
    private final String f34545b = "7.15.0";

    private xf1() {
    }

    public static xf1 a() {
        if (TextUtils.isEmpty("Yandex")) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        if (TextUtils.isEmpty("7.15.0")) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        return new xf1();
    }

    public final String b() {
        return this.f34544a;
    }

    public final String c() {
        return this.f34545b;
    }
}
