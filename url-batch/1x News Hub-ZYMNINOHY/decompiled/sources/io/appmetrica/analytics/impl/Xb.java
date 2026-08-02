package io.appmetrica.analytics.impl;

import b2.C0195i;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;

/* loaded from: classes.dex */
public final class Xb extends kotlin.jvm.internal.k implements l2.l {

    /* renamed from: a, reason: collision with root package name */
    public static final Xb f6863a = new Xb();

    public Xb() {
        super(1);
    }

    @Override // l2.l
    public final Object invoke(Object obj) {
        ((LocationControllerObserver) obj).startLocationTracking();
        return C0195i.f2555a;
    }
}
