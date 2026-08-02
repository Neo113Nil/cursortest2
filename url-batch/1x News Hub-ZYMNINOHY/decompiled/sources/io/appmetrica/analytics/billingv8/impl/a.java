package io.appmetrica.analytics.billingv8.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import n0.AbstractC1142d;
import n0.C1140b;
import n0.C1147i;

/* loaded from: classes.dex */
public final class a extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f5344a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1147i f5345b;

    public a(b bVar, C1147i c1147i) {
        this.f5344a = bVar;
        this.f5345b = c1147i;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        b bVar = this.f5344a;
        C1147i c1147i = this.f5345b;
        bVar.getClass();
        if (c1147i.f10092a != 0) {
            bVar.f5350e.onUpdateFinished();
            return;
        }
        if (!bVar.f5347b.b()) {
            bVar.f5350e.onUpdateFinished();
            return;
        }
        for (String str : c2.f.L("inapp", "subs")) {
            BillingConfig billingConfig = bVar.f5346a;
            AbstractC1142d abstractC1142d = bVar.f5347b;
            UtilsProvider utilsProvider = bVar.f5348c;
            d dVar = bVar.f5349d;
            i iVar = new i(billingConfig, abstractC1142d, utilsProvider, str, dVar, bVar.f5350e);
            dVar.f5355b.add(iVar);
            AbstractC1142d abstractC1142d2 = bVar.f5347b;
            C1140b c1140b = new C1140b();
            c1140b.f10054a = str;
            abstractC1142d2.d(c1140b.a(), iVar);
        }
    }
}
