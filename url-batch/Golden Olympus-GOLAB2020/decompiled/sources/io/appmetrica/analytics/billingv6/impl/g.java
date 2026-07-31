package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.QueryProductDetailsParams;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f36909a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f36910b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f36911c;

    public g(i iVar, BillingResult billingResult, List list) {
        this.f36909a = iVar;
        this.f36910b = billingResult;
        this.f36911c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        i iVar = this.f36909a;
        BillingResult billingResult = this.f36910b;
        List<PurchaseHistoryRecord> list = this.f36911c;
        iVar.getClass();
        if (billingResult.getResponseCode() != 0 || list == null) {
            iVar.f36920f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
                for (String str : purchaseHistoryRecord.getProducts()) {
                    String str2 = iVar.f36918d;
                    BillingInfo billingInfo = new BillingInfo(Intrinsics.areEqual(str2, "inapp") ? ProductType.INAPP : Intrinsics.areEqual(str2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, str, purchaseHistoryRecord.getPurchaseToken(), purchaseHistoryRecord.getPurchaseTime(), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            Map<String, BillingInfo> billingInfoToUpdate = iVar.f36917c.getUpdatePolicy().getBillingInfoToUpdate(iVar.f36915a, linkedHashMap, iVar.f36917c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                m.a(linkedHashMap, billingInfoToUpdate, iVar.f36918d, iVar.f36917c.getBillingInfoManager());
                iVar.f36920f.onUpdateFinished();
            } else {
                List list2 = CollectionsKt.toList(billingInfoToUpdate.keySet());
                n nVar = iVar.f36920f;
                h hVar = new h(linkedHashMap, billingInfoToUpdate, iVar);
                String str3 = iVar.f36918d;
                BillingClient billingClient = iVar.f36916b;
                UtilsProvider utilsProvider = iVar.f36917c;
                d dVar = iVar.f36919e;
                f fVar = new f(str3, billingClient, utilsProvider, hVar, list, dVar, nVar);
                dVar.f36898b.add(fVar);
                if (iVar.f36916b.isReady()) {
                    BillingClient billingClient2 = iVar.f36916b;
                    QueryProductDetailsParams.Builder newBuilder = QueryProductDetailsParams.newBuilder();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) it.next()).setProductType(iVar.f36918d).build());
                    }
                    billingClient2.queryProductDetailsAsync(newBuilder.setProductList(arrayList).build(), fVar);
                } else {
                    iVar.f36919e.a(fVar);
                    nVar.onUpdateFinished();
                }
            }
        }
        i iVar2 = this.f36909a;
        iVar2.f36919e.a(iVar2);
    }
}
