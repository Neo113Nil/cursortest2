package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class k implements PurchasesResponseListener {

    /* renamed from: a, reason: collision with root package name */
    public final UtilsProvider f36924a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f36925b;

    /* renamed from: c, reason: collision with root package name */
    public final List f36926c;

    /* renamed from: d, reason: collision with root package name */
    public final List f36927d;

    /* renamed from: e, reason: collision with root package name */
    public final d f36928e;

    /* renamed from: f, reason: collision with root package name */
    public final n f36929f;

    public k(UtilsProvider utilsProvider, Function0 function0, List list, List list2, d dVar, n nVar) {
        this.f36924a = utilsProvider;
        this.f36925b = function0;
        this.f36926c = list;
        this.f36927d = list2;
        this.f36928e = dVar;
        this.f36929f = nVar;
    }

    @Override // com.android.billingclient.api.PurchasesResponseListener
    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.f36924a.getWorkerExecutor().execute(new j(this, billingResult, list));
    }
}
