package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class Xm extends Hi {
    public Xm(Context context, String str) {
        super(context, str, "array");
    }

    @Override // io.appmetrica.analytics.impl.Hi
    public final Object a(int i2) {
        return this.f6882a.getResources().getStringArray(i2);
    }

    public final String[] b(int i2) {
        return this.f6882a.getResources().getStringArray(i2);
    }
}
