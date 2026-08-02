package io.appmetrica.analytics.billingv6.impl;

import E1.AbstractC0028d;
import E1.C0037m;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements PurchaseHistoryResponseListener {

    /* renamed from: a, reason: collision with root package name */
    public final BillingConfig f9568a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0028d f9569b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f9570c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9571d;

    /* renamed from: e, reason: collision with root package name */
    public final d f9572e;

    /* renamed from: f, reason: collision with root package name */
    public final n f9573f;

    public i(BillingConfig billingConfig, AbstractC0028d abstractC0028d, UtilsProvider utilsProvider, String str, d dVar, n nVar) {
        this.f9568a = billingConfig;
        this.f9569b = abstractC0028d;
        this.f9570c = utilsProvider;
        this.f9571d = str;
        this.f9572e = dVar;
        this.f9573f = nVar;
    }

    public final void onPurchaseHistoryResponse(C0037m c0037m, List list) {
        this.f9570c.getWorkerExecutor().execute(new g(this, c0037m, list));
    }
}
