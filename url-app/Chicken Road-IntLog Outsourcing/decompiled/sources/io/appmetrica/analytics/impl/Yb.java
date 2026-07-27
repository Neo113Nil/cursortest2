package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class Yb extends kotlin.jvm.internal.j implements InterfaceC1441l {

    /* renamed from: a, reason: collision with root package name */
    public static final Yb f7740a = new Yb();

    public Yb() {
        super(1);
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(Object obj) {
        ((LocationControllerObserver) obj).stopLocationTracking();
        return f4.v.f5689a;
    }
}
