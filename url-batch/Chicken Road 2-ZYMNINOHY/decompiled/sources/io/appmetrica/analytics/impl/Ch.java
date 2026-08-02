package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class Ch implements InterfaceC0630g4 {

    /* renamed from: a, reason: collision with root package name */
    public final Y4 f10163a;

    public Ch(Y4 y4) {
        this.f10163a = y4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0630g4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Ag a(Context context, C0554d5 c0554d5, P3 p32, C0863p4 c0863p4) {
        Bg bg;
        Q4 q4 = new Q4(p32.f10790b, p32.f10789a);
        Cg cg = new Cg(this.f10163a);
        synchronized (c0554d5) {
            bg = (Bg) c0554d5.a(q4, c0863p4, cg, c0554d5.f11650a);
        }
        return new Ag(context, bg);
    }
}
