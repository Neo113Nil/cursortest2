package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class Xb extends kotlin.jvm.internal.j implements InterfaceC1441l {

    /* renamed from: a, reason: collision with root package name */
    public static final Xb f7700a = new Xb();

    public Xb() {
        super(1);
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(Object obj) {
        ((LocationControllerObserver) obj).startLocationTracking();
        return f4.v.f5689a;
    }
}
