package io.appmetrica.analytics.billingv8.impl;

import G0.AbstractC0053c;
import G0.C0060j;
import G0.InterfaceC0067q;
import com.android.billingclient.api.QueryProductDetailsResult;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class f implements InterfaceC0067q {

    /* renamed from: a, reason: collision with root package name */
    public final String f6119a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0053c f6120b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f6121c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1430a f6122d;

    /* renamed from: e, reason: collision with root package name */
    public final List f6123e;

    /* renamed from: f, reason: collision with root package name */
    public final d f6124f;

    /* renamed from: g, reason: collision with root package name */
    public final n f6125g;

    public f(String str, AbstractC0053c abstractC0053c, UtilsProvider utilsProvider, h hVar, List list, d dVar, n nVar) {
        this.f6119a = str;
        this.f6120b = abstractC0053c;
        this.f6121c = utilsProvider;
        this.f6122d = hVar;
        this.f6123e = list;
        this.f6124f = dVar;
        this.f6125g = nVar;
    }

    public final void onProductDetailsResponse(C0060j c0060j, QueryProductDetailsResult queryProductDetailsResult) {
        this.f6121c.getWorkerExecutor().execute(new e(this, c0060j, queryProductDetailsResult));
    }

    @Override // G0.InterfaceC0067q
    public abstract /* synthetic */ void onProductDetailsResponse(C0060j c0060j, List list);
}
