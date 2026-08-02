package io.appmetrica.analytics.billingv8.impl;

import E1.A;
import E1.AbstractC0028d;
import E1.C0037m;
import E1.InterfaceC0044u;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class f implements InterfaceC0044u {

    /* renamed from: a, reason: collision with root package name */
    public final String f9608a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0028d f9609b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f9610c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1328a f9611d;

    /* renamed from: e, reason: collision with root package name */
    public final List f9612e;

    /* renamed from: f, reason: collision with root package name */
    public final d f9613f;

    /* renamed from: g, reason: collision with root package name */
    public final n f9614g;

    public f(String str, AbstractC0028d abstractC0028d, UtilsProvider utilsProvider, h hVar, List list, d dVar, n nVar) {
        this.f9608a = str;
        this.f9609b = abstractC0028d;
        this.f9610c = utilsProvider;
        this.f9611d = hVar;
        this.f9612e = list;
        this.f9613f = dVar;
        this.f9614g = nVar;
    }

    @Override // E1.InterfaceC0044u
    public final void onProductDetailsResponse(C0037m c0037m, A a3) {
        this.f9610c.getWorkerExecutor().execute(new e(this, c0037m, a3));
    }
}
