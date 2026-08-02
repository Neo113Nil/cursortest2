package io.appmetrica.analytics.billingv6.impl;

import E1.AbstractC0028d;
import E1.C0025a;
import E1.C0029e;
import E1.C0037m;
import E1.C0048y;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f9562a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0037m f9563b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f9564c;

    public g(i iVar, C0037m c0037m, List list) {
        this.f9562a = iVar;
        this.f9563b = c0037m;
        this.f9564c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        i iVar = this.f9562a;
        C0037m c0037m = this.f9563b;
        List list = this.f9564c;
        iVar.getClass();
        if (c0037m.f633a != 0 || list == null) {
            iVar.f9573f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            Map<String, BillingInfo> billingInfoToUpdate = iVar.f9570c.getUpdatePolicy().getBillingInfoToUpdate(iVar.f9568a, linkedHashMap, iVar.f9570c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                m.a(linkedHashMap, billingInfoToUpdate, iVar.f9571d, iVar.f9570c.getBillingInfoManager());
                iVar.f9573f.onUpdateFinished();
            } else {
                List<String> n02 = d3.i.n0(billingInfoToUpdate.keySet());
                n nVar = iVar.f9573f;
                h hVar = new h(linkedHashMap, billingInfoToUpdate, iVar);
                String str = iVar.f9571d;
                AbstractC0028d abstractC0028d = iVar.f9569b;
                UtilsProvider utilsProvider = iVar.f9570c;
                d dVar = iVar.f9572e;
                f fVar = new f(str, abstractC0028d, utilsProvider, hVar, list, dVar, nVar);
                dVar.f9551b.add(fVar);
                if (((C0029e) iVar.f9569b).y()) {
                    AbstractC0028d abstractC0028d2 = iVar.f9569b;
                    C0048y c0048y = new C0048y();
                    ArrayList arrayList = new ArrayList(d3.k.Y(n02));
                    for (String str2 : n02) {
                        C0025a c0025a = new C0025a();
                        c0025a.f563b = str2;
                        c0025a.f564c = iVar.f9571d;
                        arrayList.add(c0025a.a());
                    }
                    c0048y.b(arrayList);
                    abstractC0028d2.e(c0048y.a(), fVar);
                } else {
                    iVar.f9572e.a(fVar);
                    nVar.onUpdateFinished();
                }
            }
        }
        i iVar2 = this.f9562a;
        iVar2.f9572e.a(iVar2);
    }
}
