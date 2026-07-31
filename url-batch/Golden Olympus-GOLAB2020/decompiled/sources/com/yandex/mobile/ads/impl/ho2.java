package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes3.dex */
public final class ho2 {

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static ho2 f26879b = new ho2();

    /* renamed from: a, reason: collision with root package name */
    private Context f26880a;

    private ho2() {
    }

    public static ho2 a() {
        return f26879b;
    }

    public final Context b() {
        return this.f26880a;
    }

    public final void a(Context context) {
        this.f26880a = context != null ? context.getApplicationContext() : null;
    }
}
