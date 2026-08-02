package io.appmetrica.analytics.billingv8.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import n0.AbstractC1142d;
import n0.C1147i;
import n0.InterfaceC1155q;

/* loaded from: classes.dex */
public final class i implements InterfaceC1155q {

    /* renamed from: a, reason: collision with root package name */
    public final BillingConfig f5371a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1142d f5372b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f5373c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5374d;

    /* renamed from: e, reason: collision with root package name */
    public final d f5375e;
    public final n f;

    public i(BillingConfig billingConfig, AbstractC1142d abstractC1142d, UtilsProvider utilsProvider, String str, d dVar, n nVar) {
        this.f5371a = billingConfig;
        this.f5372b = abstractC1142d;
        this.f5373c = utilsProvider;
        this.f5374d = str;
        this.f5375e = dVar;
        this.f = nVar;
    }

    @Override // n0.InterfaceC1155q
    public final void onQueryPurchasesResponse(C1147i c1147i, List list) {
        this.f5373c.getWorkerExecutor().execute(new g(this, c1147i, list));
    }
}
