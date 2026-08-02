package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import n0.AbstractC1142d;
import n0.C1147i;
import n0.InterfaceC1154p;

/* loaded from: classes.dex */
public final class i implements InterfaceC1154p {

    /* renamed from: a, reason: collision with root package name */
    public final BillingConfig f5322a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1142d f5323b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f5324c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5325d;

    /* renamed from: e, reason: collision with root package name */
    public final d f5326e;
    public final n f;

    public i(BillingConfig billingConfig, AbstractC1142d abstractC1142d, UtilsProvider utilsProvider, String str, d dVar, n nVar) {
        this.f5322a = billingConfig;
        this.f5323b = abstractC1142d;
        this.f5324c = utilsProvider;
        this.f5325d = str;
        this.f5326e = dVar;
        this.f = nVar;
    }

    @Override // n0.InterfaceC1154p
    public final void onPurchaseHistoryResponse(C1147i c1147i, List list) {
        this.f5324c.getWorkerExecutor().execute(new g(this, c1147i, list));
    }
}
