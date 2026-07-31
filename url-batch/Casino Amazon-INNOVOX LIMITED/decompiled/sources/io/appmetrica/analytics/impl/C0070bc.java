package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.bc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0070bc implements InterfaceC0217h4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0217h4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0569v4 a(Context context, C0140e5 c0140e5, Q3 q3, C0445q4 c0445q4) {
        C0644y4 c0644y4;
        C0594w4 c0594w4 = new C0594w4(q3.b);
        C0669z4 c0669z4 = new C0669z4();
        synchronized (c0140e5) {
            c0644y4 = (C0644y4) c0140e5.a(c0594w4, c0445q4, c0669z4, c0140e5.b);
        }
        return new C0569v4(context, c0644y4, c0445q4);
    }
}
