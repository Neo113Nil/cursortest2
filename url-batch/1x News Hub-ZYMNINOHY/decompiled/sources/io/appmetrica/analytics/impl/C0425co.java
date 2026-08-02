package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* renamed from: io.appmetrica.analytics.impl.co, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0425co extends Wg {
    public C0425co(C0457e5 c0457e5) {
        super(c0457e5);
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        String j3 = this.f6835a.f7227c.j();
        String str = w5.f6821h;
        this.f6835a.f7227c.j(str).b();
        if (TextUtils.equals(j3, str)) {
            return false;
        }
        this.f6835a.a(U3.o());
        return false;
    }
}
