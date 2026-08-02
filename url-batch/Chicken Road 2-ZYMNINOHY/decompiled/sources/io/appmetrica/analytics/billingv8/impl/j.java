package io.appmetrica.analytics.billingv8.impl;

import E1.C0037m;
import E1.C0040p;
import E1.C0043t;
import com.android.billingclient.api.Purchase;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f9627a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0037m f9628b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f9629c;

    public j(k kVar, C0037m c0037m, List list) {
        this.f9627a = kVar;
        this.f9628b = c0037m;
        this.f9629c = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a2 A[SYNTHETIC] */
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
        k kVar = this.f9627a;
        C0037m c0037m = this.f9628b;
        List<Purchase> list = this.f9629c;
        kVar.getClass();
        if (c0037m.f633a != 0) {
            kVar.f9635f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Purchase purchase : list) {
                ArrayList a3 = purchase.a();
                int size = a3.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = a3.get(i4);
                    i4++;
                    linkedHashMap2.put((String) obj, purchase);
                }
            }
            List<Purchase> list2 = kVar.f9632c;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Purchase purchase2 : list2) {
                ArrayList a4 = purchase2.a();
                int size2 = a4.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj2 = a4.get(i5);
                    i5++;
                    linkedHashMap3.put((String) obj2, purchase2);
                }
            }
            List list3 = kVar.f9633d;
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                C0043t c0043t = (C0043t) it2.next();
                String str4 = c0043t.f661c;
                String str5 = c0043t.f662d;
                Purchase purchase3 = (Purchase) linkedHashMap3.get(str4);
                if (purchase3 != null) {
                    JSONObject jSONObject = purchase3.f5747c;
                    Purchase purchase4 = (Purchase) linkedHashMap2.get(c0043t.f661c);
                    int hashCode = str5.hashCode();
                    linkedHashMap = linkedHashMap2;
                    it = it2;
                    if (hashCode != 3541555) {
                        if (hashCode == 100343516 && str5.equals("inapp")) {
                            ProductType productType = str5.equals("inapp") ? ProductType.INAPP : str5.equals("subs") ? ProductType.SUBS : ProductType.UNKNOWN;
                            String str6 = c0043t.f661c;
                            int optInt = jSONObject.optInt("quantity", 1);
                            C0040p a5 = c0043t.a();
                            long j4 = a5 != null ? a5.f640b : 0L;
                            C0040p a6 = c0043t.a();
                            if (a6 == null || (str2 = a6.f641c) == null) {
                                str2 = "";
                            }
                            productInfo = new ProductInfo(productType, str6, optInt, j4, str2, 0L, null, 1, null, purchase3.f5746b, purchase3.b(), jSONObject.optLong("purchaseTime"), purchase4 != null ? purchase4.f5747c.optBoolean("autoRenewing") : false, (purchase4 == null || (str3 = purchase4.f5745a) == null) ? "{}" : str3);
                        }
                    } else if (str5.equals("subs")) {
                        productInfo = new ProductInfo(str5.equals("inapp") ? ProductType.INAPP : str5.equals("subs") ? ProductType.SUBS : ProductType.UNKNOWN, c0043t.f661c, jSONObject.optInt("quantity", 1), 0L, "", 0L, null, 1, null, purchase3.f5746b, purchase3.b(), jSONObject.optLong("purchaseTime"), purchase4 != null ? purchase4.f5747c.optBoolean("autoRenewing") : false, (purchase4 == null || (str = purchase4.f5745a) == null) ? "{}" : str);
                    }
                    productInfo2 = productInfo;
                    if (productInfo2 == null) {
                        arrayList.add(productInfo2);
                    }
                    linkedHashMap2 = linkedHashMap;
                    it2 = it;
                } else {
                    linkedHashMap = linkedHashMap2;
                    it = it2;
                }
                productInfo = null;
                productInfo2 = productInfo;
                if (productInfo2 == null) {
                }
                linkedHashMap2 = linkedHashMap;
                it2 = it;
            }
            kVar.f9630a.getBillingInfoSender().sendInfo(arrayList);
            kVar.f9631b.invoke();
            kVar.f9635f.onUpdateFinished();
        }
        k kVar2 = this.f9627a;
        kVar2.f9634e.a(kVar2);
    }
}
