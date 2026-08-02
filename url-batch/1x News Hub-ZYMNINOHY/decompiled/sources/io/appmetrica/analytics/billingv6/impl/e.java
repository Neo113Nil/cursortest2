package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;
import n0.AbstractC1142d;
import n0.C1140b;
import n0.C1147i;

/* loaded from: classes.dex */
public final class e extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f5307a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1147i f5308b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f5309c;

    public e(f fVar, C1147i c1147i, List list) {
        this.f5307a = fVar;
        this.f5308b = c1147i;
        this.f5309c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        f fVar = this.f5307a;
        C1147i c1147i = this.f5308b;
        List list = this.f5309c;
        fVar.getClass();
        if (c1147i.f10092a != 0 || list.isEmpty()) {
            fVar.f5315g.onUpdateFinished();
        } else {
            UtilsProvider utilsProvider = fVar.f5312c;
            l2.a aVar = fVar.f5313d;
            List list2 = fVar.f5314e;
            d dVar = fVar.f;
            k kVar = new k(utilsProvider, aVar, list2, list, dVar, fVar.f5315g);
            dVar.f5306b.add(kVar);
            if (fVar.f5311b.b()) {
                AbstractC1142d abstractC1142d = fVar.f5311b;
                C1140b c1140b = new C1140b();
                c1140b.f10054a = fVar.f5310a;
                abstractC1142d.d(c1140b.a(), kVar);
            } else {
                fVar.f.a(kVar);
                fVar.f5315g.onUpdateFinished();
            }
        }
        f fVar2 = this.f5307a;
        fVar2.f.a(fVar2);
    }
}
