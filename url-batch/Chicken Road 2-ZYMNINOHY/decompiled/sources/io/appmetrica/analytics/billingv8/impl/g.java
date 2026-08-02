package io.appmetrica.analytics.billingv8.impl;

import E1.AbstractC0028d;
import E1.C0025a;
import E1.C0029e;
import E1.C0037m;
import E1.C0048y;
import com.android.billingclient.api.Purchase;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f9615a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0037m f9616b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f9617c;

    public g(i iVar, C0037m c0037m, List list) {
        this.f9615a = iVar;
        this.f9616b = c0037m;
        this.f9617c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        i iVar = this.f9615a;
        C0037m c0037m = this.f9616b;
        List<Purchase> list = this.f9617c;
        iVar.getClass();
        if (c0037m.f633a != 0) {
            iVar.f9626f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Purchase purchase : list) {
                ArrayList a3 = purchase.a();
                int size = a3.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = a3.get(i4);
                    i4++;
                    String str = (String) obj;
                    String str2 = iVar.f9624d;
                    BillingInfo billingInfo = new BillingInfo(kotlin.jvm.internal.i.a(str2, "inapp") ? ProductType.INAPP : kotlin.jvm.internal.i.a(str2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, str, purchase.b(), purchase.f5747c.optLong("purchaseTime"), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            Map<String, BillingInfo> billingInfoToUpdate = iVar.f9623c.getUpdatePolicy().getBillingInfoToUpdate(iVar.f9621a, linkedHashMap, iVar.f9623c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                m.a(linkedHashMap, billingInfoToUpdate, iVar.f9624d, iVar.f9623c.getBillingInfoManager());
                iVar.f9626f.onUpdateFinished();
            } else {
                List<String> n02 = d3.i.n0(billingInfoToUpdate.keySet());
                n nVar = iVar.f9626f;
                h hVar = new h(linkedHashMap, billingInfoToUpdate, iVar);
                String str3 = iVar.f9624d;
                AbstractC0028d abstractC0028d = iVar.f9622b;
                UtilsProvider utilsProvider = iVar.f9623c;
                d dVar = iVar.f9625e;
                f fVar = new f(str3, abstractC0028d, utilsProvider, hVar, list, dVar, nVar);
                dVar.f9604b.add(fVar);
                if (((C0029e) iVar.f9622b).y()) {
                    AbstractC0028d abstractC0028d2 = iVar.f9622b;
                    C0048y c0048y = new C0048y();
                    ArrayList arrayList = new ArrayList(d3.k.Y(n02));
                    for (String str4 : n02) {
                        C0025a c0025a = new C0025a();
                        c0025a.f563b = str4;
                        c0025a.f564c = iVar.f9624d;
                        arrayList.add(c0025a.a());
                    }
                    c0048y.b(arrayList);
                    abstractC0028d2.e(c0048y.a(), fVar);
                } else {
                    iVar.f9625e.a(fVar);
                    nVar.onUpdateFinished();
                }
            }
        }
        i iVar2 = this.f9615a;
        iVar2.f9625e.a(iVar2);
    }
}
