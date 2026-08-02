package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.lc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0767lc implements InterfaceC0630g4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0630g4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0793mc a(Context context, C0554d5 c0554d5, P3 p32, C0863p4 c0863p4) {
        Bg bg;
        C0819nc c0819nc = new C0819nc(p32.f10790b, p32.f10789a);
        Cg cg = new Cg(new C0897qc());
        synchronized (c0554d5) {
            bg = (Bg) c0554d5.a(c0819nc, c0863p4, cg, c0554d5.f11650a);
        }
        return new C0793mc(context, bg);
    }
}
