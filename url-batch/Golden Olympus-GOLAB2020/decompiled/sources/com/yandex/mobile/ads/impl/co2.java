package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class co2 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f24280a;

    final void a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context cannot be null");
        }
        if (this.f24280a) {
            return;
        }
        this.f24280a = true;
        so2.a().a(context);
        wn2.a().a(context);
        yn2.a(context);
        ho2.a().a(context);
    }

    final boolean a() {
        return this.f24280a;
    }
}
