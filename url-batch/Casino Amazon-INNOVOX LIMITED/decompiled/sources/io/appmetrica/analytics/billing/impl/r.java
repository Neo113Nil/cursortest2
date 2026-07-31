package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.BillingConfig;
import io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class r implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final g f584a;

    /* JADX WARN: Multi-variable type inference failed */
    public r() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final t fromModel(RemoteBillingConfig remoteBillingConfig) {
        t tVar = new t();
        tVar.f586a = remoteBillingConfig.getCom.facebook.react.uimanager.ViewProps.ENABLED java.lang.String();
        BillingConfig billingConfig = remoteBillingConfig.getCom.onesignal.core.internal.config.ConfigModelStoreKt.CONFIG_NAME_SPACE java.lang.String();
        tVar.b = billingConfig != null ? this.f584a.fromModel(billingConfig) : null;
        return tVar;
    }

    public r(g gVar) {
        this.f584a = gVar;
    }

    public /* synthetic */ r(g gVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new g() : gVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RemoteBillingConfig toModel(t tVar) {
        boolean z = tVar.f586a;
        g gVar = this.f584a;
        s sVar = tVar.b;
        gVar.getClass();
        return new RemoteBillingConfig(z, new BillingConfig(sVar.f585a, sVar.b));
    }
}
