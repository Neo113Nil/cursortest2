package io.appmetrica.analytics.billingv6.impl;

import C3.v;
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
    public final /* synthetic */ f f9552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0037m f9553b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f9554c;

    public e(f fVar, C0037m c0037m, List list) {
        this.f9552a = fVar;
        this.f9553b = c0037m;
        this.f9554c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        f fVar = this.f9552a;
        C0037m c0037m = this.f9553b;
        List list = this.f9554c;
        fVar.getClass();
        if (c0037m.f633a != 0 || list.isEmpty()) {
            fVar.f9561g.onUpdateFinished();
        } else {
            UtilsProvider utilsProvider = fVar.f9557c;
            InterfaceC1328a interfaceC1328a = fVar.f9558d;
            List list2 = fVar.f9559e;
            d dVar = fVar.f9560f;
            k kVar = new k(utilsProvider, interfaceC1328a, list2, list, dVar, fVar.f9561g);
            dVar.f9551b.add(kVar);
            if (((C0029e) fVar.f9556b).y()) {
                AbstractC0028d abstractC0028d = fVar.f9556b;
                v vVar = new v(3);
                vVar.f321b = fVar.f9555a;
                abstractC0028d.f(vVar.b(), kVar);
            } else {
                fVar.f9560f.a(kVar);
                fVar.f9561g.onUpdateFinished();
            }
        }
        f fVar2 = this.f9552a;
        fVar2.f9560f.a(fVar2);
    }
}
