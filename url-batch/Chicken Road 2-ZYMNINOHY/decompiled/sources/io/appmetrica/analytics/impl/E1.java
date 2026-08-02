package io.appmetrica.analytics.impl;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class E1 implements InterfaceC0569dk {

    /* renamed from: b, reason: collision with root package name */
    public static final D1 f10233b = new D1();

    /* renamed from: c, reason: collision with root package name */
    public static final int f10234c = 1;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0936s0 f10235a;

    public E1(InterfaceC0936s0 interfaceC0936s0) {
        this.f10235a = interfaceC0936s0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0569dk
    public final void reportData(int i4, Bundle bundle) {
        ((B1) this.f10235a).a(bundle);
    }
}
