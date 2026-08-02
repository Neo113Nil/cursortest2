package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;

/* renamed from: io.appmetrica.analytics.impl.jo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0727jo implements InterfaceC0751km {

    /* renamed from: a, reason: collision with root package name */
    public final UtilityServiceProvider f12178a;

    public C0727jo(UtilityServiceProvider utilityServiceProvider) {
        this.f12178a = utilityServiceProvider;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0751km
    public final void a(C0622fm c0622fm) {
        this.f12178a.updateConfiguration(new UtilityServiceConfiguration(c0622fm.v, c0622fm.f11878u));
    }
}
