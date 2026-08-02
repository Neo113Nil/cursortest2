package io.appmetrica.analytics.billingv6.impl;

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
    public final String f9555a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0028d f9556b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f9557c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1328a f9558d;

    /* renamed from: e, reason: collision with root package name */
    public final List f9559e;

    /* renamed from: f, reason: collision with root package name */
    public final d f9560f;

    /* renamed from: g, reason: collision with root package name */
    public final n f9561g;

    public f(String str, AbstractC0028d abstractC0028d, UtilsProvider utilsProvider, h hVar, List list, d dVar, n nVar) {
        this.f9555a = str;
        this.f9556b = abstractC0028d;
        this.f9557c = utilsProvider;
        this.f9558d = hVar;
        this.f9559e = list;
        this.f9560f = dVar;
        this.f9561g = nVar;
    }

    @Override // E1.InterfaceC0044u
    public abstract /* synthetic */ void onProductDetailsResponse(C0037m c0037m, A a3);

    public final void onProductDetailsResponse(C0037m c0037m, List list) {
        this.f9557c.getWorkerExecutor().execute(new e(this, c0037m, list));
    }
}
