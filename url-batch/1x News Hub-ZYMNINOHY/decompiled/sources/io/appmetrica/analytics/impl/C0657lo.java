package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;

/* renamed from: io.appmetrica.analytics.impl.lo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0657lo implements InterfaceC0733om {

    /* renamed from: a, reason: collision with root package name */
    public final UtilityServiceProvider f7844a;

    public C0657lo(UtilityServiceProvider utilityServiceProvider) {
        this.f7844a = utilityServiceProvider;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0733om
    public final void a(C0603jm c0603jm) {
        this.f7844a.updateConfiguration(new UtilityServiceConfiguration(c0603jm.v, c0603jm.f7681u));
    }
}
