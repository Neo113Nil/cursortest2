package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import n0.C1147i;
import n0.InterfaceC1155q;

/* loaded from: classes.dex */
public final class k implements InterfaceC1155q {

    /* renamed from: a, reason: collision with root package name */
    public final UtilsProvider f5330a;

    /* renamed from: b, reason: collision with root package name */
    public final l2.a f5331b;

    /* renamed from: c, reason: collision with root package name */
    public final List f5332c;

    /* renamed from: d, reason: collision with root package name */
    public final List f5333d;

    /* renamed from: e, reason: collision with root package name */
    public final d f5334e;
    public final n f;

    public k(UtilsProvider utilsProvider, l2.a aVar, List list, List list2, d dVar, n nVar) {
        this.f5330a = utilsProvider;
        this.f5331b = aVar;
        this.f5332c = list;
        this.f5333d = list2;
        this.f5334e = dVar;
        this.f = nVar;
    }

    @Override // n0.InterfaceC1155q
    public final void onQueryPurchasesResponse(C1147i c1147i, List list) {
        this.f5330a.getWorkerExecutor().execute(new j(this, c1147i, list));
    }
}
