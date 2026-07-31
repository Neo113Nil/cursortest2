package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$updateBilling$1;

/* loaded from: classes3.dex */
public final class b implements BillingClientStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final BillingConfig f36889a;

    /* renamed from: b, reason: collision with root package name */
    public final BillingClient f36890b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f36891c;

    /* renamed from: d, reason: collision with root package name */
    public final d f36892d;

    /* renamed from: e, reason: collision with root package name */
    public final n f36893e;

    public b(BillingConfig billingConfig, BillingClient billingClient, BillingLibraryMonitor$updateBilling$1 billingLibraryMonitor$updateBilling$1, d dVar, n nVar) {
        this.f36889a = billingConfig;
        this.f36890b = billingClient;
        this.f36891c = billingLibraryMonitor$updateBilling$1;
        this.f36892d = dVar;
        this.f36893e = nVar;
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingServiceDisconnected() {
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingSetupFinished(BillingResult billingResult) {
        this.f36891c.getWorkerExecutor().execute(new a(this, billingResult));
    }
}
