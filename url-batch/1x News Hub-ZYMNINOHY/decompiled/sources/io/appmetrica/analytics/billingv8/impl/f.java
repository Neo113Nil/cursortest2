package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.QueryProductDetailsResult;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import n0.AbstractC1142d;
import n0.C1147i;
import n0.InterfaceC1153o;

/* loaded from: classes.dex */
public final class f implements InterfaceC1153o {

    /* renamed from: a, reason: collision with root package name */
    public final String f5359a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1142d f5360b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f5361c;

    /* renamed from: d, reason: collision with root package name */
    public final l2.a f5362d;

    /* renamed from: e, reason: collision with root package name */
    public final List f5363e;
    public final d f;

    /* renamed from: g, reason: collision with root package name */
    public final n f5364g;

    public f(String str, AbstractC1142d abstractC1142d, UtilsProvider utilsProvider, h hVar, List list, d dVar, n nVar) {
        this.f5359a = str;
        this.f5360b = abstractC1142d;
        this.f5361c = utilsProvider;
        this.f5362d = hVar;
        this.f5363e = list;
        this.f = dVar;
        this.f5364g = nVar;
    }

    public final void onProductDetailsResponse(C1147i c1147i, QueryProductDetailsResult queryProductDetailsResult) {
        this.f5361c.getWorkerExecutor().execute(new e(this, c1147i, queryProductDetailsResult));
    }

    @Override // n0.InterfaceC1153o
    public abstract /* synthetic */ void onProductDetailsResponse(C1147i c1147i, List list);
}
