package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.BillingConfig;
import io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes.dex */
public final class r implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final g f9473a;

    /* JADX WARN: Multi-variable type inference failed */
    public r() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final t fromModel(RemoteBillingConfig remoteBillingConfig) {
        t tVar = new t();
        tVar.f9478a = remoteBillingConfig.getEnabled();
        BillingConfig config = remoteBillingConfig.getConfig();
        tVar.f9479b = config != null ? this.f9473a.fromModel(config) : null;
        return tVar;
    }

    public r(g gVar) {
        this.f9473a = gVar;
    }

    public /* synthetic */ r(g gVar, int i4, kotlin.jvm.internal.e eVar) {
        this((i4 & 1) != 0 ? new g() : gVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RemoteBillingConfig toModel(t tVar) {
        boolean z = tVar.f9478a;
        g gVar = this.f9473a;
        s sVar = tVar.f9479b;
        gVar.getClass();
        return new RemoteBillingConfig(z, new BillingConfig(sVar.f9475a, sVar.f9476b));
    }
}
