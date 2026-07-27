package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.e3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0606e3 extends Hi {
    public C0606e3(Context context, String str) {
        super(context, str, "bool");
    }

    @Override // io.appmetrica.analytics.impl.Hi
    public final Object a(int i2) {
        return Boolean.valueOf(this.f6882a.getResources().getBoolean(i2));
    }

    public final Boolean b(int i2) {
        return Boolean.valueOf(this.f6882a.getResources().getBoolean(i2));
    }
}
