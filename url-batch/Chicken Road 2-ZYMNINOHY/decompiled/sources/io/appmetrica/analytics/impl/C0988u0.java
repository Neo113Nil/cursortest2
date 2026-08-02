package io.appmetrica.analytics.impl;

import android.app.Service;

/* renamed from: io.appmetrica.analytics.impl.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0988u0 implements InterfaceC1119z1 {

    /* renamed from: a, reason: collision with root package name */
    public final Service f12794a;

    public C0988u0(Service service) {
        this.f12794a = service;
    }

    public final void a(int i4) {
        this.f12794a.stopSelf(i4);
    }
}
