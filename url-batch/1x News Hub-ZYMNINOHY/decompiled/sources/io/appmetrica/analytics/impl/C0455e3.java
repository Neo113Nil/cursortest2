package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.e3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0455e3 extends Hi {
    public C0455e3(Context context, String str) {
        super(context, str, "bool");
    }

    @Override // io.appmetrica.analytics.impl.Hi
    public final Object a(int i3) {
        return Boolean.valueOf(this.f6087a.getResources().getBoolean(i3));
    }

    public final Boolean b(int i3) {
        return Boolean.valueOf(this.f6087a.getResources().getBoolean(i3));
    }
}
