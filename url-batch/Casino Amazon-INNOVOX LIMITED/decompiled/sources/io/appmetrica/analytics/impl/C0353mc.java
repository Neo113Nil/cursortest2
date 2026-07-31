package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.mc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0353mc implements InterfaceC0217h4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0217h4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0378nc a(Context context, C0140e5 c0140e5, Q3 q3, C0445q4 c0445q4) {
        Cg cg;
        C0403oc c0403oc = new C0403oc(q3.b, q3.f1013a);
        Dg dg = new Dg(new C0477rc());
        synchronized (c0140e5) {
            cg = (Cg) c0140e5.a(c0403oc, c0445q4, dg, c0140e5.f1231a);
        }
        return new C0378nc(context, cg);
    }
}
