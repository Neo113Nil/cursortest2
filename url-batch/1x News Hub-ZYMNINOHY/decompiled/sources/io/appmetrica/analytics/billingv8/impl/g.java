package io.appmetrica.analytics.billingv8.impl;

import b0.r;
import com.android.billingclient.api.Purchase;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n0.AbstractC1142d;
import n0.C1139a;
import n0.C1147i;

/* loaded from: classes.dex */
public final class g extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f5365a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1147i f5366b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f5367c;

    public g(i iVar, C1147i c1147i, List list) {
        this.f5365a = iVar;
        this.f5366b = c1147i;
        this.f5367c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        i iVar = this.f5365a;
        C1147i c1147i = this.f5366b;
        List<Purchase> list = this.f5367c;
        iVar.getClass();
        if (c1147i.f10092a != 0) {
            iVar.f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Purchase purchase : list) {
                Iterator it = purchase.a().iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String str2 = iVar.f5374d;
                    BillingInfo billingInfo = new BillingInfo(kotlin.jvm.internal.j.a(str2, "inapp") ? ProductType.INAPP : kotlin.jvm.internal.j.a(str2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, str, purchase.b(), purchase.f2650c.optLong("purchaseTime"), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            Map<String, BillingInfo> billingInfoToUpdate = iVar.f5373c.getUpdatePolicy().getBillingInfoToUpdate(iVar.f5371a, linkedHashMap, iVar.f5373c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                m.a(linkedHashMap, billingInfoToUpdate, iVar.f5374d, iVar.f5373c.getBillingInfoManager());
                iVar.f.onUpdateFinished();
            } else {
                List<String> Y2 = c2.e.Y(billingInfoToUpdate.keySet());
                n nVar = iVar.f;
                h hVar = new h(linkedHashMap, billingInfoToUpdate, iVar);
                String str3 = iVar.f5374d;
                AbstractC1142d abstractC1142d = iVar.f5372b;
                UtilsProvider utilsProvider = iVar.f5373c;
                d dVar = iVar.f5375e;
                f fVar = new f(str3, abstractC1142d, utilsProvider, hVar, list, dVar, nVar);
                dVar.f5355b.add(fVar);
                if (iVar.f5372b.b()) {
                    AbstractC1142d abstractC1142d2 = iVar.f5372b;
                    r rVar = new r();
                    ArrayList arrayList = new ArrayList(c2.g.N(Y2));
                    for (String str4 : Y2) {
                        C1139a c1139a = new C1139a();
                        c1139a.f10052a = str4;
                        c1139a.f10053b = iVar.f5374d;
                        arrayList.add(c1139a.a());
                    }
                    rVar.j(arrayList);
                    abstractC1142d2.c(rVar.h(), fVar);
                } else {
                    iVar.f5375e.a(fVar);
                    nVar.onUpdateFinished();
                }
            }
        }
        i iVar2 = this.f5365a;
        iVar2.f5375e.a(iVar2);
    }
}
