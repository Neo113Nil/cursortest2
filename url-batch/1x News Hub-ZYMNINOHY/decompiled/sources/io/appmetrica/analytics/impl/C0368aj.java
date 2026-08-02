package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* renamed from: io.appmetrica.analytics.impl.aj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0368aj extends Wg {
    public C0368aj(C0457e5 c0457e5) {
        super(c0457e5);
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        String str = w5.f6821h;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.f6835a.f7227c.j(str).b();
        return false;
    }
}
