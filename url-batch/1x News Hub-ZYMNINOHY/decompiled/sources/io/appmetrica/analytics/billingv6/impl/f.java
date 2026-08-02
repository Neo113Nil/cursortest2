package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import n0.AbstractC1142d;
import n0.C1147i;
import n0.InterfaceC1153o;

/* loaded from: classes.dex */
public final class f implements InterfaceC1153o {

    /* renamed from: a, reason: collision with root package name */
    public final String f5310a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1142d f5311b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f5312c;

    /* renamed from: d, reason: collision with root package name */
    public final l2.a f5313d;

    /* renamed from: e, reason: collision with root package name */
    public final List f5314e;
    public final d f;

    /* renamed from: g, reason: collision with root package name */
    public final n f5315g;

    public f(String str, AbstractC1142d abstractC1142d, UtilsProvider utilsProvider, h hVar, List list, d dVar, n nVar) {
        this.f5310a = str;
        this.f5311b = abstractC1142d;
        this.f5312c = utilsProvider;
        this.f5313d = hVar;
        this.f5314e = list;
        this.f = dVar;
        this.f5315g = nVar;
    }

    @Override // n0.InterfaceC1153o
    public final void onProductDetailsResponse(C1147i c1147i, List list) {
        this.f5312c.getWorkerExecutor().execute(new e(this, c1147i, list));
    }
}
