package io.appmetrica.analytics.billingv8.impl;

import G0.AbstractC0053c;
import G0.C0060j;
import G0.InterfaceC0055e;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv8.internal.BillingLibraryMonitor$updateBilling$1;

/* loaded from: classes.dex */
public final class b implements InterfaceC0055e {

    /* renamed from: a, reason: collision with root package name */
    public final BillingConfig f6106a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0053c f6107b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f6108c;

    /* renamed from: d, reason: collision with root package name */
    public final d f6109d;

    /* renamed from: e, reason: collision with root package name */
    public final n f6110e;

    public b(BillingConfig billingConfig, AbstractC0053c abstractC0053c, BillingLibraryMonitor$updateBilling$1 billingLibraryMonitor$updateBilling$1, d dVar, n nVar) {
        this.f6106a = billingConfig;
        this.f6107b = abstractC0053c;
        this.f6108c = billingLibraryMonitor$updateBilling$1;
        this.f6109d = dVar;
        this.f6110e = nVar;
    }

    @Override // G0.InterfaceC0055e
    public final void onBillingServiceDisconnected() {
    }

    @Override // G0.InterfaceC0055e
    public final void onBillingSetupFinished(C0060j c0060j) {
        this.f6108c.getWorkerExecutor().execute(new a(this, c0060j));
    }
}
