package io.appmetrica.analytics.billingv8.impl;

import C3.v;
import E1.AbstractC0028d;
import E1.C0029e;
import E1.C0037m;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class a extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f9593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0037m f9594b;

    public a(b bVar, C0037m c0037m) {
        this.f9593a = bVar;
        this.f9594b = c0037m;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        b bVar = this.f9593a;
        C0037m c0037m = this.f9594b;
        bVar.getClass();
        if (c0037m.f633a != 0) {
            bVar.f9599e.onUpdateFinished();
            return;
        }
        if (!((C0029e) bVar.f9596b).y()) {
            bVar.f9599e.onUpdateFinished();
            return;
        }
        for (String str : d3.j.W("inapp", "subs")) {
            BillingConfig billingConfig = bVar.f9595a;
            AbstractC0028d abstractC0028d = bVar.f9596b;
            UtilsProvider utilsProvider = bVar.f9597c;
            d dVar = bVar.f9598d;
            i iVar = new i(billingConfig, abstractC0028d, utilsProvider, str, dVar, bVar.f9599e);
            dVar.f9604b.add(iVar);
            AbstractC0028d abstractC0028d2 = bVar.f9596b;
            v vVar = new v(3);
            vVar.f321b = str;
            abstractC0028d2.f(vVar.b(), iVar);
        }
    }
}
