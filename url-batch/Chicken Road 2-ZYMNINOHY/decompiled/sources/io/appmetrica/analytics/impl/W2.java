package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class W2 extends Ci {
    public W2(Context context, String str) {
        super(context, str, "bool");
    }

    @Override // io.appmetrica.analytics.impl.Ci
    public final Object a(int i4) {
        return Boolean.valueOf(this.f10164a.getResources().getBoolean(i4));
    }

    public final Boolean b(int i4) {
        return Boolean.valueOf(this.f10164a.getResources().getBoolean(i4));
    }
}
