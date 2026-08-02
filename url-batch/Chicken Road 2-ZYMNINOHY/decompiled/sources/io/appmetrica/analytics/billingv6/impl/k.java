package io.appmetrica.analytics.billingv6.impl;

import E1.C0037m;
import E1.InterfaceC0046w;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class k implements InterfaceC0046w {

    /* renamed from: a, reason: collision with root package name */
    public final UtilsProvider f9577a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1328a f9578b;

    /* renamed from: c, reason: collision with root package name */
    public final List f9579c;

    /* renamed from: d, reason: collision with root package name */
    public final List f9580d;

    /* renamed from: e, reason: collision with root package name */
    public final d f9581e;

    /* renamed from: f, reason: collision with root package name */
    public final n f9582f;

    public k(UtilsProvider utilsProvider, InterfaceC1328a interfaceC1328a, List list, List list2, d dVar, n nVar) {
        this.f9577a = utilsProvider;
        this.f9578b = interfaceC1328a;
        this.f9579c = list;
        this.f9580d = list2;
        this.f9581e = dVar;
        this.f9582f = nVar;
    }

    @Override // E1.InterfaceC0046w
    public final void onQueryPurchasesResponse(C0037m c0037m, List list) {
        this.f9577a.getWorkerExecutor().execute(new j(this, c0037m, list));
    }
}
