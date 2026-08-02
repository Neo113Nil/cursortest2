package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.qj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0782qj implements InterfaceC0689n4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0689n4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0678mj a(Context context, C0612k5 c0612k5, X3 x3, C0922w4 c0922w4) {
        Gg gg;
        X4 x4 = new X4(x3.f6856b, x3.f6855a);
        synchronized (c0612k5) {
            gg = (Gg) c0612k5.f7702a.get(x4.toString());
        }
        return new C0678mj(gg);
    }
}
