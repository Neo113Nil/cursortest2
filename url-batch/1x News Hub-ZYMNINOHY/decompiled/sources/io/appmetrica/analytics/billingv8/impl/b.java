package io.appmetrica.analytics.billingv8.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv8.internal.BillingLibraryMonitor$updateBilling$1;
import n0.AbstractC1142d;
import n0.C1147i;
import n0.InterfaceC1144f;

/* loaded from: classes.dex */
public final class b implements InterfaceC1144f {

    /* renamed from: a, reason: collision with root package name */
    public final BillingConfig f5346a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1142d f5347b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f5348c;

    /* renamed from: d, reason: collision with root package name */
    public final d f5349d;

    /* renamed from: e, reason: collision with root package name */
    public final n f5350e;

    public b(BillingConfig billingConfig, AbstractC1142d abstractC1142d, BillingLibraryMonitor$updateBilling$1 billingLibraryMonitor$updateBilling$1, d dVar, n nVar) {
        this.f5346a = billingConfig;
        this.f5347b = abstractC1142d;
        this.f5348c = billingLibraryMonitor$updateBilling$1;
        this.f5349d = dVar;
        this.f5350e = nVar;
    }

    @Override // n0.InterfaceC1144f
    public final void onBillingServiceDisconnected() {
    }

    @Override // n0.InterfaceC1144f
    public final void onBillingSetupFinished(C1147i c1147i) {
        this.f5348c.getWorkerExecutor().execute(new a(this, c1147i));
    }
}
