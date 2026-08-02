package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class Hh implements InterfaceC0689n4 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0483f5 f6086a;

    public Hh(InterfaceC0483f5 interfaceC0483f5) {
        this.f6086a = interfaceC0483f5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0689n4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Fg a(Context context, C0612k5 c0612k5, X3 x3, C0922w4 c0922w4) {
        Gg gg;
        X4 x4 = new X4(x3.f6856b, x3.f6855a);
        Hg hg = new Hg(this.f6086a);
        synchronized (c0612k5) {
            gg = (Gg) c0612k5.a(x4, c0922w4, hg, c0612k5.f7702a);
        }
        return new Fg(context, gg);
    }
}
