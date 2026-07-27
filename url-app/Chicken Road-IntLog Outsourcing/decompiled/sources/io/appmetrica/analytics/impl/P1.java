package io.appmetrica.analytics.impl;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class P1 implements InterfaceC0726ik {

    /* renamed from: b, reason: collision with root package name */
    public static final O1 f7234b = new O1();

    /* renamed from: c, reason: collision with root package name */
    public static final int f7235c = 1;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0965s0 f7236a;

    public P1(InterfaceC0965s0 interfaceC0965s0) {
        this.f7236a = interfaceC0965s0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0726ik
    public final void reportData(int i2, Bundle bundle) {
        ((M1) this.f7236a).a(bundle);
    }
}
