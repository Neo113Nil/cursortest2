package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.lj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0774lj implements InterfaceC0630g4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0630g4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0671hj a(Context context, C0554d5 c0554d5, P3 p32, C0863p4 c0863p4) {
        Bg bg;
        Q4 q4 = new Q4(p32.f10790b, p32.f10789a);
        synchronized (c0554d5) {
            bg = (Bg) c0554d5.f11650a.get(q4.toString());
        }
        return new C0671hj(bg);
    }
}
