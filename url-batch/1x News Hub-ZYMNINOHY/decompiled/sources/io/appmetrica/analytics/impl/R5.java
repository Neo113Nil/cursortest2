package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder;

/* loaded from: classes.dex */
public final class R5 implements Q5 {

    /* renamed from: a, reason: collision with root package name */
    public final C0742p5 f6539a;

    public R5(C0742p5 c0742p5) {
        this.f6539a = c0742p5;
    }

    @Override // io.appmetrica.analytics.impl.Q5, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final C0742p5 getAdRevenueProcessorsHolder() {
        return this.f6539a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final ModuleAdRevenueProcessorsHolder getAdRevenueProcessorsHolder() {
        return this.f6539a;
    }
}
