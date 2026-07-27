package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.BillingConfig;
import io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes.dex */
public final class r implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final g f5982a;

    /* JADX WARN: Multi-variable type inference failed */
    public r() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final t fromModel(RemoteBillingConfig remoteBillingConfig) {
        t tVar = new t();
        tVar.f5987a = remoteBillingConfig.getEnabled();
        BillingConfig config = remoteBillingConfig.getConfig();
        tVar.f5988b = config != null ? this.f5982a.fromModel(config) : null;
        return tVar;
    }

    public r(g gVar) {
        this.f5982a = gVar;
    }

    public /* synthetic */ r(g gVar, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new g() : gVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RemoteBillingConfig toModel(t tVar) {
        boolean z = tVar.f5987a;
        g gVar = this.f5982a;
        s sVar = tVar.f5988b;
        gVar.getClass();
        return new RemoteBillingConfig(z, new BillingConfig(sVar.f5984a, sVar.f5985b));
    }
}
