package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.m6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2799m6 extends O4 {
    public C2799m6(@NonNull String str, double d4) {
        super(2, str, Double.valueOf(d4), new Lb(), new N4(new C2516bc(new H4(100))));
    }

    @Override // io.appmetrica.analytics.impl.O4
    public final void a(@NonNull C2555co c2555co) {
        C2608eo c2608eo = c2555co.f38804d;
        c2608eo.f38943c = ((Double) this.f38048f).doubleValue() + c2608eo.f38943c;
    }
}
