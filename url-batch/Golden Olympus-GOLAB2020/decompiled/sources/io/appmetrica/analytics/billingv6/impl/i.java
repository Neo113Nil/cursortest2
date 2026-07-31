package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* loaded from: classes3.dex */
public final class i implements PurchaseHistoryResponseListener {

    /* renamed from: a, reason: collision with root package name */
    public final BillingConfig f36915a;

    /* renamed from: b, reason: collision with root package name */
    public final BillingClient f36916b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f36917c;

    /* renamed from: d, reason: collision with root package name */
    public final String f36918d;

    /* renamed from: e, reason: collision with root package name */
    public final d f36919e;

    /* renamed from: f, reason: collision with root package name */
    public final n f36920f;

    public i(BillingConfig billingConfig, BillingClient billingClient, UtilsProvider utilsProvider, String str, d dVar, n nVar) {
        this.f36915a = billingConfig;
        this.f36916b = billingClient;
        this.f36917c = utilsProvider;
        this.f36918d = str;
        this.f36919e = dVar;
        this.f36920f = nVar;
    }

    @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
    public final void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
        this.f36917c.getWorkerExecutor().execute(new g(this, billingResult, list));
    }
}
