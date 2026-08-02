package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import n0.C1147i;
import n0.C1149k;
import n0.C1152n;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f5327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1147i f5328b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f5329c;

    public j(k kVar, C1147i c1147i, List list) {
        this.f5327a = kVar;
        this.f5328b = c1147i;
        this.f5329c = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a0 A[SYNTHETIC] */
    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void runSafety() {
        LinkedHashMap linkedHashMap;
        Iterator it;
        ProductInfo productInfo;
        ProductInfo productInfo2;
        String str;
        String str2;
        String str3;
        k kVar = this.f5327a;
        C1147i c1147i = this.f5328b;
        List<Purchase> list = this.f5329c;
        kVar.getClass();
        if (c1147i.f10092a != 0) {
            kVar.f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Purchase purchase : list) {
                Iterator it2 = purchase.a().iterator();
                while (it2.hasNext()) {
                    linkedHashMap2.put((String) it2.next(), purchase);
                }
            }
            List<PurchaseHistoryRecord> list2 = kVar.f5332c;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (PurchaseHistoryRecord purchaseHistoryRecord : list2) {
                Iterator it3 = purchaseHistoryRecord.a().iterator();
                while (it3.hasNext()) {
                    linkedHashMap3.put((String) it3.next(), purchaseHistoryRecord);
                }
            }
            List list3 = kVar.f5333d;
            ArrayList arrayList = new ArrayList();
            Iterator it4 = list3.iterator();
            while (it4.hasNext()) {
                C1152n c1152n = (C1152n) it4.next();
                PurchaseHistoryRecord purchaseHistoryRecord2 = (PurchaseHistoryRecord) linkedHashMap3.get(c1152n.f10113c);
                if (purchaseHistoryRecord2 != null) {
                    Purchase purchase2 = (Purchase) linkedHashMap2.get(c1152n.f10113c);
                    String str4 = c1152n.f10114d;
                    int hashCode = str4.hashCode();
                    JSONObject jSONObject = purchaseHistoryRecord2.f2653c;
                    linkedHashMap = linkedHashMap2;
                    it = it4;
                    if (hashCode != 3541555) {
                        if (hashCode == 100343516 && str4.equals("inapp")) {
                            ProductType productType = str4.equals("inapp") ? ProductType.INAPP : str4.equals("subs") ? ProductType.SUBS : ProductType.UNKNOWN;
                            int optInt = jSONObject.optInt("quantity", 1);
                            C1149k a3 = c1152n.a();
                            long j3 = a3 != null ? a3.f10097b : 0L;
                            C1149k a4 = c1152n.a();
                            if (a4 == null || (str2 = a4.f10098c) == null) {
                                str2 = "";
                            }
                            productInfo = new ProductInfo(productType, c1152n.f10113c, optInt, j3, str2, 0L, null, 1, null, purchaseHistoryRecord2.f2652b, purchaseHistoryRecord2.b(), jSONObject.optLong("purchaseTime"), purchase2 != null ? purchase2.f2650c.optBoolean("autoRenewing") : false, (purchase2 == null || (str3 = purchase2.f2648a) == null) ? "{}" : str3);
                        }
                    } else if (str4.equals("subs")) {
                        productInfo = new ProductInfo(str4.equals("inapp") ? ProductType.INAPP : str4.equals("subs") ? ProductType.SUBS : ProductType.UNKNOWN, c1152n.f10113c, jSONObject.optInt("quantity", 1), 0L, "", 0L, null, 1, null, purchaseHistoryRecord2.f2652b, purchaseHistoryRecord2.b(), jSONObject.optLong("purchaseTime"), purchase2 != null ? purchase2.f2650c.optBoolean("autoRenewing") : false, (purchase2 == null || (str = purchase2.f2648a) == null) ? "{}" : str);
                    }
                    productInfo2 = productInfo;
                    if (productInfo2 == null) {
                        arrayList.add(productInfo2);
                    }
                    linkedHashMap2 = linkedHashMap;
                    it4 = it;
                } else {
                    linkedHashMap = linkedHashMap2;
                    it = it4;
                }
                productInfo = null;
                productInfo2 = productInfo;
                if (productInfo2 == null) {
                }
                linkedHashMap2 = linkedHashMap;
                it4 = it;
            }
            kVar.f5330a.getBillingInfoSender().sendInfo(arrayList);
            kVar.f5331b.invoke();
            kVar.f.onUpdateFinished();
        }
        k kVar2 = this.f5327a;
        kVar2.f5334e.a(kVar2);
    }
}
