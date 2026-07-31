package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.g6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2644g6 implements InterfaceC2617f6 {

    /* renamed from: a, reason: collision with root package name */
    public final D5 f39041a;

    public C2644g6(@NotNull D5 d5) {
        this.f39041a = d5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2617f6, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    @NotNull
    public final D5 getAdRevenueProcessorsHolder() {
        return this.f39041a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final ModuleAdRevenueProcessorsHolder getAdRevenueProcessorsHolder() {
        return this.f39041a;
    }
}
