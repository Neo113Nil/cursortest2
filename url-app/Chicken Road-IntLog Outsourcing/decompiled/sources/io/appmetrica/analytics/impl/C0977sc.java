package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.sc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0977sc implements InterfaceC0840n4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0840n4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1003tc a(Context context, C0763k5 c0763k5, X3 x32, C1073w4 c1073w4) {
        Gg gg;
        C1029uc c1029uc = new C1029uc(x32.f7693b, x32.f7692a);
        Hg hg = new Hg(new C1107xc());
        synchronized (c0763k5) {
            gg = (Gg) c0763k5.a(c1029uc, c1073w4, hg, c0763k5.f8602a);
        }
        return new C1003tc(context, gg);
    }
}
