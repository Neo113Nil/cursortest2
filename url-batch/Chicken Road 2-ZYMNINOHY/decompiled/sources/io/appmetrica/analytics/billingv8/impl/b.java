package io.appmetrica.analytics.billingv8.impl;

import E1.AbstractC0028d;
import E1.C0037m;
import E1.InterfaceC0030f;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv8.internal.BillingLibraryMonitor$updateBilling$1;

/* loaded from: classes.dex */
public final class b implements InterfaceC0030f {

    /* renamed from: a, reason: collision with root package name */
    public final BillingConfig f9595a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0028d f9596b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f9597c;

    /* renamed from: d, reason: collision with root package name */
    public final d f9598d;

    /* renamed from: e, reason: collision with root package name */
    public final n f9599e;

    public b(BillingConfig billingConfig, AbstractC0028d abstractC0028d, BillingLibraryMonitor$updateBilling$1 billingLibraryMonitor$updateBilling$1, d dVar, n nVar) {
        this.f9595a = billingConfig;
        this.f9596b = abstractC0028d;
        this.f9597c = billingLibraryMonitor$updateBilling$1;
        this.f9598d = dVar;
        this.f9599e = nVar;
    }

    @Override // E1.InterfaceC0030f
    public final void onBillingServiceDisconnected() {
    }

    @Override // E1.InterfaceC0030f
    public final void onBillingSetupFinished(C0037m c0037m) {
        this.f9597c.getWorkerExecutor().execute(new a(this, c0037m));
    }
}
