package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$updateBilling$1;
import n0.AbstractC1142d;
import n0.C1147i;
import n0.InterfaceC1144f;

/* loaded from: classes.dex */
public final class b implements InterfaceC1144f {

    /* renamed from: a, reason: collision with root package name */
    public final BillingConfig f5297a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1142d f5298b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f5299c;

    /* renamed from: d, reason: collision with root package name */
    public final d f5300d;

    /* renamed from: e, reason: collision with root package name */
    public final n f5301e;

    public b(BillingConfig billingConfig, AbstractC1142d abstractC1142d, BillingLibraryMonitor$updateBilling$1 billingLibraryMonitor$updateBilling$1, d dVar, n nVar) {
        this.f5297a = billingConfig;
        this.f5298b = abstractC1142d;
        this.f5299c = billingLibraryMonitor$updateBilling$1;
        this.f5300d = dVar;
        this.f5301e = nVar;
    }

    @Override // n0.InterfaceC1144f
    public final void onBillingServiceDisconnected() {
    }

    @Override // n0.InterfaceC1144f
    public final void onBillingSetupFinished(C1147i c1147i) {
        this.f5299c.getWorkerExecutor().execute(new a(this, c1147i));
    }
}
