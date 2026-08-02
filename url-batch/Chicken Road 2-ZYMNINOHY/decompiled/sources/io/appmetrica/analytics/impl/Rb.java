package io.appmetrica.analytics.impl;

import c3.C0297i;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final class Rb extends kotlin.jvm.internal.j implements InterfaceC1339l {

    /* renamed from: a, reason: collision with root package name */
    public static final Rb f10882a = new Rb();

    public Rb() {
        super(1);
    }

    @Override // o3.InterfaceC1339l
    public final Object invoke(Object obj) {
        ((LocationControllerObserver) obj).stopLocationTracking();
        return C0297i.f5732a;
    }
}
