package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* renamed from: io.appmetrica.analytics.impl.aj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0519aj extends Wg {
    public C0519aj(C0608e5 c0608e5) {
        super(c0608e5);
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        String str = w5.f7655h;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.f7670a.f8087c.j(str).b();
        return false;
    }
}
