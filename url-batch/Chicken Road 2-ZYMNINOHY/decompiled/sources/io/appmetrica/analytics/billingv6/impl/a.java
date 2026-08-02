package io.appmetrica.analytics.billingv6.impl;

import E1.AbstractC0028d;
import E1.C0029e;
import E1.C0037m;
import com.android.billingclient.api.QueryPurchaseHistoryParams;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class a extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f9540a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0037m f9541b;

    public a(b bVar, C0037m c0037m) {
        this.f9540a = bVar;
        this.f9541b = c0037m;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        b bVar = this.f9540a;
        C0037m c0037m = this.f9541b;
        bVar.getClass();
        if (c0037m.f633a != 0) {
            bVar.f9546e.onUpdateFinished();
            return;
        }
        for (String str : d3.j.W("inapp", "subs")) {
            BillingConfig billingConfig = bVar.f9542a;
            AbstractC0028d abstractC0028d = bVar.f9543b;
            UtilsProvider utilsProvider = bVar.f9544c;
            d dVar = bVar.f9545d;
            i iVar = new i(billingConfig, abstractC0028d, utilsProvider, str, dVar, bVar.f9546e);
            dVar.f9551b.add(iVar);
            if (((C0029e) bVar.f9543b).y()) {
                AbstractC0028d abstractC0028d2 = bVar.f9543b;
                if (str == null) {
                    throw new IllegalArgumentException("Product type must be set");
                }
                abstractC0028d2.queryPurchaseHistoryAsync(new QueryPurchaseHistoryParams(), iVar);
            } else {
                bVar.f9545d.a(iVar);
                bVar.f9546e.onUpdateFinished();
            }
        }
    }
}
