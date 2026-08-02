package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.hc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0542hc implements InterfaceC0689n4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0689n4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final B4 a(Context context, C0612k5 c0612k5, X3 x3, C0922w4 c0922w4) {
        E4 e4;
        C4 c4 = new C4(x3.f6856b);
        F4 f4 = new F4();
        synchronized (c0612k5) {
            e4 = (E4) c0612k5.a(c4, c0922w4, f4, c0612k5.f7703b);
        }
        return new B4(context, e4, c0922w4);
    }
}
