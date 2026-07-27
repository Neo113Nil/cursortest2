package io.appmetrica.analytics.billingv6.impl;

import G0.AbstractC0053c;
import G0.C0051a;
import G0.C0060j;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class e extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f6063a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0060j f6064b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f6065c;

    public e(f fVar, C0060j c0060j, List list) {
        this.f6063a = fVar;
        this.f6064b = c0060j;
        this.f6065c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        f fVar = this.f6063a;
        C0060j c0060j = this.f6064b;
        List list = this.f6065c;
        fVar.getClass();
        if (c0060j.f862a != 0 || list.isEmpty()) {
            fVar.f6072g.onUpdateFinished();
        } else {
            UtilsProvider utilsProvider = fVar.f6068c;
            InterfaceC1430a interfaceC1430a = fVar.f6069d;
            List list2 = fVar.f6070e;
            d dVar = fVar.f6071f;
            k kVar = new k(utilsProvider, interfaceC1430a, list2, list, dVar, fVar.f6072g);
            dVar.f6062b.add(kVar);
            if (fVar.f6067b.b()) {
                AbstractC0053c abstractC0053c = fVar.f6067b;
                C0051a c0051a = new C0051a(1);
                c0051a.f813b = fVar.f6066a;
                abstractC0053c.d(c0051a.c(), kVar);
            } else {
                fVar.f6071f.a(kVar);
                fVar.f6072g.onUpdateFinished();
            }
        }
        f fVar2 = this.f6063a;
        fVar2.f6071f.a(fVar2);
    }
}
