package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder;

/* loaded from: classes3.dex */
public final class L5 implements K5 {

    /* renamed from: a, reason: collision with root package name */
    public final C0269j5 f931a;

    public L5(C0269j5 c0269j5) {
        this.f931a = c0269j5;
    }

    @Override // io.appmetrica.analytics.impl.K5, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final C0269j5 getAdRevenueProcessorsHolder() {
        return this.f931a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final ModuleAdRevenueProcessorsHolder getAdRevenueProcessorsHolder() {
        return this.f931a;
    }
}
