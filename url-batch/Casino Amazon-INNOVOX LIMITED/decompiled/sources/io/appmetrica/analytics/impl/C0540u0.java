package io.appmetrica.analytics.impl;

import android.app.Service;

/* renamed from: io.appmetrica.analytics.impl.u0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0540u0 implements A1 {

    /* renamed from: a, reason: collision with root package name */
    public final Service f1506a;

    public C0540u0(Service service) {
        this.f1506a = service;
    }

    public final void a(int i) {
        this.f1506a.stopSelf(i);
    }
}
