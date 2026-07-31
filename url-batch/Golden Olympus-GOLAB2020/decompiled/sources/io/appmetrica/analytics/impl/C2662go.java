package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.go, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2662go implements InterfaceC2763km {

    /* renamed from: a, reason: collision with root package name */
    public final UtilityServiceProvider f39112a;

    public C2662go(@NotNull UtilityServiceProvider utilityServiceProvider) {
        this.f39112a = utilityServiceProvider;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2763km
    public final void a(@NotNull C2633fm c2633fm) {
        this.f39112a.updateConfiguration(new UtilityServiceConfiguration(c2633fm.f39000v, c2633fm.f38999u));
    }
}
