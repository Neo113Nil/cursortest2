package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.sc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0826sc implements InterfaceC0689n4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0689n4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0852tc a(Context context, C0612k5 c0612k5, X3 x3, C0922w4 c0922w4) {
        Gg gg;
        C0878uc c0878uc = new C0878uc(x3.f6856b, x3.f6855a);
        Hg hg = new Hg(new C0956xc());
        synchronized (c0612k5) {
            gg = (Gg) c0612k5.a(c0878uc, c0922w4, hg, c0612k5.f7702a);
        }
        return new C0852tc(context, gg);
    }
}
