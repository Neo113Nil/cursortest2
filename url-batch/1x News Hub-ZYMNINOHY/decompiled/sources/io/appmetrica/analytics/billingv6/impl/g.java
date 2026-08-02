package io.appmetrica.analytics.billingv6.impl;

import b0.r;
import com.android.billingclient.api.PurchaseHistoryRecord;
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
    public final /* synthetic */ i f5316a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1147i f5317b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f5318c;

    public g(i iVar, C1147i c1147i, List list) {
        this.f5316a = iVar;
        this.f5317b = c1147i;
        this.f5318c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        i iVar = this.f5316a;
        C1147i c1147i = this.f5317b;
        List<PurchaseHistoryRecord> list = this.f5318c;
        iVar.getClass();
        if (c1147i.f10092a != 0 || list == null) {
            iVar.f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
                Iterator it = purchaseHistoryRecord.a().iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String str2 = iVar.f5325d;
                    BillingInfo billingInfo = new BillingInfo(kotlin.jvm.internal.j.a(str2, "inapp") ? ProductType.INAPP : kotlin.jvm.internal.j.a(str2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, str, purchaseHistoryRecord.b(), purchaseHistoryRecord.f2653c.optLong("purchaseTime"), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            Map<String, BillingInfo> billingInfoToUpdate = iVar.f5324c.getUpdatePolicy().getBillingInfoToUpdate(iVar.f5322a, linkedHashMap, iVar.f5324c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                m.a(linkedHashMap, billingInfoToUpdate, iVar.f5325d, iVar.f5324c.getBillingInfoManager());
                iVar.f.onUpdateFinished();
            } else {
                List<String> Y2 = c2.e.Y(billingInfoToUpdate.keySet());
                n nVar = iVar.f;
                h hVar = new h(linkedHashMap, billingInfoToUpdate, iVar);
                String str3 = iVar.f5325d;
                AbstractC1142d abstractC1142d = iVar.f5323b;
                UtilsProvider utilsProvider = iVar.f5324c;
                d dVar = iVar.f5326e;
                f fVar = new f(str3, abstractC1142d, utilsProvider, hVar, list, dVar, nVar);
                dVar.f5306b.add(fVar);
                if (iVar.f5323b.b()) {
                    AbstractC1142d abstractC1142d2 = iVar.f5323b;
                    r rVar = new r();
                    ArrayList arrayList = new ArrayList(c2.g.N(Y2));
                    for (String str4 : Y2) {
                        C1139a c1139a = new C1139a();
                        c1139a.f10052a = str4;
                        c1139a.f10053b = iVar.f5325d;
                        arrayList.add(c1139a.a());
                    }
                    rVar.j(arrayList);
                    abstractC1142d2.c(rVar.h(), fVar);
                } else {
                    iVar.f5326e.a(fVar);
                    nVar.onUpdateFinished();
                }
            }
        }
        i iVar2 = this.f5316a;
        iVar2.f5326e.a(iVar2);
    }
}
