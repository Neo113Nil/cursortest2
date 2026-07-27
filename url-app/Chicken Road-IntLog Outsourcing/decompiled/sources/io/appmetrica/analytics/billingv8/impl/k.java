package io.appmetrica.analytics.billingv8.impl;

import G0.C0060j;
import G0.InterfaceC0068s;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class k implements InterfaceC0068s {

    /* renamed from: a, reason: collision with root package name */
    public final UtilsProvider f6141a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1430a f6142b;

    /* renamed from: c, reason: collision with root package name */
    public final List f6143c;

    /* renamed from: d, reason: collision with root package name */
    public final List f6144d;

    /* renamed from: e, reason: collision with root package name */
    public final d f6145e;

    /* renamed from: f, reason: collision with root package name */
    public final n f6146f;

    public k(UtilsProvider utilsProvider, InterfaceC1430a interfaceC1430a, List list, List list2, d dVar, n nVar) {
        this.f6141a = utilsProvider;
        this.f6142b = interfaceC1430a;
        this.f6143c = list;
        this.f6144d = list2;
        this.f6145e = dVar;
        this.f6146f = nVar;
    }

    @Override // G0.InterfaceC0068s
    public final void onQueryPurchasesResponse(C0060j c0060j, List list) {
        this.f6141a.getWorkerExecutor().execute(new j(this, c0060j, list));
    }
}
