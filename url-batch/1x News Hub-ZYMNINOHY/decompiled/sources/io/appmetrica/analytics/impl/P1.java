package io.appmetrica.analytics.impl;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class P1 implements InterfaceC0575ik {

    /* renamed from: b, reason: collision with root package name */
    public static final O1 f6423b = new O1();

    /* renamed from: c, reason: collision with root package name */
    public static final int f6424c = 1;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0814s0 f6425a;

    public P1(InterfaceC0814s0 interfaceC0814s0) {
        this.f6425a = interfaceC0814s0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0575ik
    public final void reportData(int i3, Bundle bundle) {
        ((M1) this.f6425a).a(bundle);
    }
}
