package io.appmetrica.analytics.billingv8.impl;

import C3.v;
import E1.A;
import E1.AbstractC0028d;
import E1.C0029e;
import E1.C0037m;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class e extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f9605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0037m f9606b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A f9607c;

    public e(f fVar, C0037m c0037m, A a3) {
        this.f9605a = fVar;
        this.f9606b = c0037m;
        this.f9607c = a3;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        f fVar = this.f9605a;
        C0037m c0037m = this.f9606b;
        List list = this.f9607c.f478a;
        fVar.getClass();
        if (c0037m.f633a != 0 || list.isEmpty()) {
            fVar.f9614g.onUpdateFinished();
        } else {
            UtilsProvider utilsProvider = fVar.f9610c;
            InterfaceC1328a interfaceC1328a = fVar.f9611d;
            List list2 = fVar.f9612e;
            d dVar = fVar.f9613f;
            k kVar = new k(utilsProvider, interfaceC1328a, list2, list, dVar, fVar.f9614g);
            dVar.f9604b.add(kVar);
            if (((C0029e) fVar.f9609b).y()) {
                AbstractC0028d abstractC0028d = fVar.f9609b;
                v vVar = new v(3);
                vVar.f321b = fVar.f9608a;
                abstractC0028d.f(vVar.b(), kVar);
            } else {
                fVar.f9613f.a(kVar);
                fVar.f9614g.onUpdateFinished();
            }
        }
        f fVar2 = this.f9605a;
        fVar2.f9613f.a(fVar2);
    }
}
