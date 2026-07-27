package io.appmetrica.analytics.billingv6.impl;

import G0.C0060j;
import G0.InterfaceC0068s;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class k implements InterfaceC0068s {

    /* renamed from: a, reason: collision with root package name */
    public final UtilsProvider f6088a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1430a f6089b;

    /* renamed from: c, reason: collision with root package name */
    public final List f6090c;

    /* renamed from: d, reason: collision with root package name */
    public final List f6091d;

    /* renamed from: e, reason: collision with root package name */
    public final d f6092e;

    /* renamed from: f, reason: collision with root package name */
    public final n f6093f;

    public k(UtilsProvider utilsProvider, InterfaceC1430a interfaceC1430a, List list, List list2, d dVar, n nVar) {
        this.f6088a = utilsProvider;
        this.f6089b = interfaceC1430a;
        this.f6090c = list;
        this.f6091d = list2;
        this.f6092e = dVar;
        this.f6093f = nVar;
    }

    @Override // G0.InterfaceC0068s
    public final void onQueryPurchasesResponse(C0060j c0060j, List list) {
        this.f6088a.getWorkerExecutor().execute(new j(this, c0060j, list));
    }
}
