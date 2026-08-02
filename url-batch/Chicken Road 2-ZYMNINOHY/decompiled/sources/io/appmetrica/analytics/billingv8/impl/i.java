package io.appmetrica.analytics.billingv8.impl;

import E1.AbstractC0028d;
import E1.C0037m;
import E1.InterfaceC0046w;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements InterfaceC0046w {

    /* renamed from: a, reason: collision with root package name */
    public final BillingConfig f9621a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0028d f9622b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f9623c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9624d;

    /* renamed from: e, reason: collision with root package name */
    public final d f9625e;

    /* renamed from: f, reason: collision with root package name */
    public final n f9626f;

    public i(BillingConfig billingConfig, AbstractC0028d abstractC0028d, UtilsProvider utilsProvider, String str, d dVar, n nVar) {
        this.f9621a = billingConfig;
        this.f9622b = abstractC0028d;
        this.f9623c = utilsProvider;
        this.f9624d = str;
        this.f9625e = dVar;
        this.f9626f = nVar;
    }

    @Override // E1.InterfaceC0046w
    public final void onQueryPurchasesResponse(C0037m c0037m, List list) {
        this.f9623c.getWorkerExecutor().execute(new g(this, c0037m, list));
    }
}
