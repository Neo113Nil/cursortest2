package io.appmetrica.analytics.impl;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class F1 implements InterfaceC0155ek {
    public static final E1 b = new E1();
    public static final int c = 1;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0490s0 f837a;

    public F1(InterfaceC0490s0 interfaceC0490s0) {
        this.f837a = interfaceC0490s0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0155ek
    public final void reportData(int i, Bundle bundle) {
        ((C1) this.f837a).a(bundle);
    }
}
