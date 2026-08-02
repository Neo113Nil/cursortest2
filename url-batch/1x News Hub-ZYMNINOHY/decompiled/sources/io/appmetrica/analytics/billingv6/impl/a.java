package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import n0.AbstractC1135O;
import n0.AbstractC1142d;
import n0.C1143e;
import n0.C1147i;
import n0.CallableC1159u;

/* loaded from: classes.dex */
public final class a extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f5295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1147i f5296b;

    public a(b bVar, C1147i c1147i) {
        this.f5295a = bVar;
        this.f5296b = c1147i;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        b bVar = this.f5295a;
        C1147i c1147i = this.f5296b;
        bVar.getClass();
        if (c1147i.f10092a != 0) {
            bVar.f5301e.onUpdateFinished();
            return;
        }
        for (String str : c2.f.L("inapp", "subs")) {
            BillingConfig billingConfig = bVar.f5297a;
            AbstractC1142d abstractC1142d = bVar.f5298b;
            UtilsProvider utilsProvider = bVar.f5299c;
            d dVar = bVar.f5300d;
            i iVar = new i(billingConfig, abstractC1142d, utilsProvider, str, dVar, bVar.f5301e);
            dVar.f5306b.add(iVar);
            if (bVar.f5298b.b()) {
                AbstractC1142d abstractC1142d2 = bVar.f5298b;
                if (str == null) {
                    throw new IllegalArgumentException("Product type must be set");
                }
                C1143e c1143e = (C1143e) abstractC1142d2;
                if (!c1143e.b()) {
                    C1147i c1147i2 = AbstractC1135O.f10026k;
                    c1143e.H(2, 11, c1147i2);
                    iVar.onPurchaseHistoryResponse(c1147i2, null);
                } else if (C1143e.m(new CallableC1159u(c1143e, str, iVar, 3), 30000L, new B.a(c1143e, 14, iVar), c1143e.D(), c1143e.q()) == null) {
                    C1147i n3 = c1143e.n();
                    c1143e.H(25, 11, n3);
                    iVar.onPurchaseHistoryResponse(n3, null);
                }
            } else {
                bVar.f5300d.a(iVar);
                bVar.f5301e.onUpdateFinished();
            }
        }
    }
}
