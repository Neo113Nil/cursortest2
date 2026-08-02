package io.appmetrica.analytics.billingv6.impl;

import E1.C0037m;
import E1.C0043t;
import com.android.billingclient.api.Purchase;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f9574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0037m f9575b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f9576c;

    public j(k kVar, C0037m c0037m, List list) {
        this.f9574a = kVar;
        this.f9575b = c0037m;
        this.f9576c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        k kVar = this.f9574a;
        C0037m c0037m = this.f9575b;
        List<Purchase> list = this.f9576c;
        kVar.getClass();
        if (c0037m.f633a != 0) {
            kVar.f9582f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Purchase purchase : list) {
                ArrayList a3 = purchase.a();
                int size = a3.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = a3.get(i4);
                    i4++;
                    linkedHashMap.put((String) obj, purchase);
                }
            }
            List list2 = kVar.f9579c;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator it = list2.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            List list3 = kVar.f9580d;
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                if (linkedHashMap2.get(((C0043t) it2.next()).f661c) != null) {
                    throw new ClassCastException();
                }
            }
            kVar.f9577a.getBillingInfoSender().sendInfo(arrayList);
            kVar.f9578b.invoke();
            kVar.f9582f.onUpdateFinished();
        }
        k kVar2 = this.f9574a;
        kVar2.f9581e.a(kVar2);
    }
}
