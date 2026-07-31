package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryPurchaseHistoryParams;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class a extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f36887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f36888b;

    public a(b bVar, BillingResult billingResult) {
        this.f36887a = bVar;
        this.f36888b = billingResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        b bVar = this.f36887a;
        BillingResult billingResult = this.f36888b;
        bVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            bVar.f36893e.onUpdateFinished();
            return;
        }
        for (String str : CollectionsKt.listOf((Object[]) new String[]{"inapp", "subs"})) {
            BillingConfig billingConfig = bVar.f36889a;
            BillingClient billingClient = bVar.f36890b;
            UtilsProvider utilsProvider = bVar.f36891c;
            d dVar = bVar.f36892d;
            i iVar = new i(billingConfig, billingClient, utilsProvider, str, dVar, bVar.f36893e);
            dVar.f36898b.add(iVar);
            if (bVar.f36890b.isReady()) {
                bVar.f36890b.queryPurchaseHistoryAsync(QueryPurchaseHistoryParams.newBuilder().setProductType(str).build(), iVar);
            } else {
                bVar.f36892d.a(iVar);
                bVar.f36893e.onUpdateFinished();
            }
        }
    }
}
