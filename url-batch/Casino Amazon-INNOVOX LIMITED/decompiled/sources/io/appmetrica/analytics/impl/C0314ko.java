package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;

/* renamed from: io.appmetrica.analytics.impl.ko, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0314ko implements InterfaceC0338lm {

    /* renamed from: a, reason: collision with root package name */
    public final UtilityServiceProvider f1348a;

    public C0314ko(UtilityServiceProvider utilityServiceProvider) {
        this.f1348a = utilityServiceProvider;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0338lm
    public final void a(C0209gm c0209gm) {
        this.f1348a.updateConfiguration(new UtilityServiceConfiguration(c0209gm.v, c0209gm.u));
    }
}
