package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.iap.Iap;
import com.huawei.hms.iap.IapClient;
import com.huawei.hms.iap.entity.OwnedPurchasesReq;
import com.huawei.hms.iap.entity.OwnedPurchasesResult;
import com.huawei.hms.iap.entity.ProductInfo;
import com.huawei.hms.iap.entity.ProductInfoReq;
import com.huawei.hms.iap.entity.ProductInfoResult;
import com.huawei.hms.iap.entity.PurchaseResultInfo;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.my.tracker.obfuscated.C1621d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1621d {

    /* renamed from: a, reason: collision with root package name */
    final IapClient f21163a;

    /* renamed from: b, reason: collision with root package name */
    final Context f21164b;

    /* renamed from: c, reason: collision with root package name */
    final b f21165c;

    /* renamed from: d, reason: collision with root package name */
    Set f21166d;

    /* renamed from: com.my.tracker.obfuscated.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final IapClient f21167a;

        /* renamed from: b, reason: collision with root package name */
        final Context f21168b;

        a(IapClient iapClient, Context context) {
            this.f21167a = iapClient;
            this.f21168b = context;
        }

        public C1621d a(b bVar) {
            return new C1621d(this.f21167a, bVar, this.f21168b);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.d$b */
    public interface b {
        void a(List list);

        void c(List list);
    }

    /* renamed from: com.my.tracker.obfuscated.d$c */
    final class c implements z0.g {

        /* renamed from: a, reason: collision with root package name */
        final int f21169a;

        /* renamed from: b, reason: collision with root package name */
        final int f21170b;

        /* renamed from: c, reason: collision with root package name */
        final List f21171c = Collections.synchronizedList(new ArrayList());

        /* renamed from: d, reason: collision with root package name */
        final List f21172d = Collections.synchronizedList(new ArrayList());

        /* renamed from: e, reason: collision with root package name */
        String f21173e;

        public c(int i4, int i5) {
            this.f21169a = i4;
            this.f21170b = i5;
            AbstractC1708y2.a("OwnedPurchaseLoader: loader created");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Exception exc) {
            AbstractC1708y2.a("AppGalleryHelper: onLoadingPurchasesFailure ", exc);
            C1621d.this.b(this);
        }

        void b(final String str) {
            AbstractC1658m.f(new Runnable() { // from class: com.my.tracker.obfuscated.O
                @Override // java.lang.Runnable
                public final void run() {
                    C1621d.c.this.a(str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str) {
            z0.i obtainOwnedPurchaseRecord;
            AbstractC1708y2.a("OwnedPurchaseLoader: start loadPurchases");
            OwnedPurchasesReq ownedPurchasesReq = new OwnedPurchasesReq();
            ownedPurchasesReq.setPriceType(this.f21169a);
            ownedPurchasesReq.setContinuationToken(str);
            int i4 = this.f21170b;
            if (i4 == 2) {
                obtainOwnedPurchaseRecord = C1621d.this.f21163a.obtainOwnedPurchases(ownedPurchasesReq);
            } else {
                if (i4 != 3) {
                    AbstractC1708y2.a("OwnedPurchaseLoader: invalid source to load purchases");
                    C1621d.this.b(this);
                    return;
                }
                obtainOwnedPurchaseRecord = C1621d.this.f21163a.obtainOwnedPurchaseRecord(ownedPurchasesReq);
            }
            obtainOwnedPurchaseRecord.addOnFailureListener(new z0.f() { // from class: com.my.tracker.obfuscated.N
                @Override // z0.f
                public final void onFailure(Exception exc) {
                    C1621d.c.this.a(exc);
                }
            });
            obtainOwnedPurchaseRecord.addOnSuccessListener(this);
        }

        @Override // z0.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final OwnedPurchasesResult ownedPurchasesResult) {
            AbstractC1658m.a(new Runnable() { // from class: com.my.tracker.obfuscated.P
                @Override // java.lang.Runnable
                public final void run() {
                    C1621d.c.this.a(ownedPurchasesResult);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(OwnedPurchasesResult ownedPurchasesResult) {
            this.f21171c.addAll(ownedPurchasesResult.getInAppPurchaseDataList());
            this.f21172d.addAll(ownedPurchasesResult.getInAppSignature());
            String continuationToken = ownedPurchasesResult.getContinuationToken();
            if (!TextUtils.isEmpty(continuationToken)) {
                AbstractC1708y2.a("OwnedPurchaseLoader: loading more obtainOwnedPurchasesRecord by continuationToken");
                b(continuationToken);
                return;
            }
            if (this.f21171c.isEmpty()) {
                AbstractC1708y2.a("OwnedPurchaseLoader: failure load obtain owned purchases. Purchases is null. source is " + this.f21170b + " priceType is " + this.f21169a);
                C1621d.this.b(this);
                return;
            }
            if (!this.f21172d.isEmpty()) {
                this.f21173e = ownedPurchasesResult.getSignatureAlgorithm();
                C1621d.this.a(this);
                return;
            }
            AbstractC1708y2.a("OwnedPurchaseLoader: failure load obtain owned purchases. Signatures is null. source is " + this.f21170b + " priceType is " + this.f21169a);
            C1621d.this.b(this);
        }
    }

    private C1621d(IapClient iapClient, b bVar, Context context) {
        this.f21163a = iapClient;
        this.f21165c = bVar;
        this.f21164b = context;
        AbstractC1708y2.a("AppGalleryHelper AppGalleryHelper created");
    }

    static ArrayList a(List list, List list2, String str, int i4) {
        ArrayList arrayList = new ArrayList();
        long a4 = AbstractC1700w2.a();
        int i5 = 0;
        while (i5 < list.size()) {
            String str2 = str;
            int i6 = i4;
            C1630f a5 = C1630f.a((String) list.get(i5), (String) list2.get(i5), str2, i6, a4);
            if (a5 == null) {
                AbstractC1708y2.a("AppGalleryHelper: failed to create AppGalleryRawPurchase");
            } else {
                arrayList.add(a5);
            }
            i5++;
            str = str2;
            i4 = i6;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Intent intent) {
        PurchaseResultInfo parsePurchaseResultInfoFromIntent = this.f21163a.parsePurchaseResultInfoFromIntent(intent);
        int returnCode = parsePurchaseResultInfoFromIntent.getReturnCode();
        if (returnCode == 0) {
            this.f21165c.a(Collections.singletonList(C1630f.a(parsePurchaseResultInfoFromIntent.getInAppPurchaseData(), parsePurchaseResultInfoFromIntent.getInAppDataSignature(), parsePurchaseResultInfoFromIntent.getSignatureAlgorithm(), 1, AbstractC1700w2.a())));
        } else {
            AbstractC1708y2.b("AppGalleryHelper error: can not getting PurchaseResultInfo. resultCode " + returnCode);
        }
    }

    void a(c cVar) {
        this.f21165c.a(a(cVar.f21171c, cVar.f21172d, cVar.f21173e, cVar.f21170b));
        b(cVar);
    }

    void b(c cVar) {
        Set set = this.f21166d;
        if (set == null) {
            AbstractC1708y2.a("AppGalleryHelper: can't remove OwnedPurchaseLoader, purchaseLoaders list is null");
            return;
        }
        set.remove(cVar);
        if (set.isEmpty()) {
            this.f21166d = null;
        }
    }

    public void a(final Intent intent) {
        AbstractC1708y2.a("AppGalleryHelper: starting getAppGalleryPurchaseByIntent");
        AbstractC1658m.f(new Runnable() { // from class: com.my.tracker.obfuscated.I
            @Override // java.lang.Runnable
            public final void run() {
                C1621d.this.b(intent);
            }
        });
    }

    JSONObject a(List list, String str) {
        String str2;
        if (str == null) {
            str2 = "AppGalleryHelper: can't get product by id, id is null";
        } else {
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = (JSONObject) it.next();
                    try {
                    } catch (Throwable th) {
                        AbstractC1708y2.a("AppGalleryHelper: error while reading product_id", th);
                    }
                    if (jSONObject.getString("productId").equals(str)) {
                        return jSONObject;
                    }
                }
                return null;
            }
            str2 = "AppGalleryHelper: can't get product by id, productInfoListJson is null";
        }
        AbstractC1708y2.a(str2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Exception exc, List list) {
        AbstractC1708y2.a("AppGalleryHelper: error while loading products ", exc);
        this.f21165c.c(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final List list, final Exception exc) {
        AbstractC1658m.a(new Runnable() { // from class: com.my.tracker.obfuscated.J
            @Override // java.lang.Runnable
            public final void run() {
                C1621d.this.a(exc, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ProductInfoResult productInfoResult, List list) {
        List<ProductInfo> productInfoList = productInfoResult.getProductInfoList();
        if (productInfoList == null) {
            AbstractC1708y2.a("AppGalleryHelper: productInfoList is null, finish products loading");
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<ProductInfo> it = productInfoList.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C1630f c1630f = (C1630f) it2.next();
                c1630f.a(a(arrayList, c1630f.c()));
            }
        }
        this.f21165c.c(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final List list, final ProductInfoResult productInfoResult) {
        AbstractC1658m.a(new Runnable() { // from class: com.my.tracker.obfuscated.K
            @Override // java.lang.Runnable
            public final void run() {
                C1621d.this.a(productInfoResult, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ProductInfoReq productInfoReq, final List list) {
        z0.i obtainProductInfo = this.f21163a.obtainProductInfo(productInfoReq);
        obtainProductInfo.addOnFailureListener(new z0.f() { // from class: com.my.tracker.obfuscated.L
            @Override // z0.f
            public final void onFailure(Exception exc) {
                C1621d.this.a(list, exc);
            }
        });
        obtainProductInfo.addOnSuccessListener(new z0.g() { // from class: com.my.tracker.obfuscated.M
            @Override // z0.g
            public final void onSuccess(Object obj) {
                C1621d.this.a(list, (ProductInfoResult) obj);
            }
        });
    }

    public void a(List list) {
        AbstractC1708y2.a("AppGalleryHelper: start loading all products");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1630f c1630f = (C1630f) it.next();
            try {
                int i4 = c1630f.e().getInt("kind");
                if (i4 == 0) {
                    arrayList.add(c1630f);
                } else if (i4 == 1) {
                    arrayList2.add(c1630f);
                } else if (i4 == 2) {
                    arrayList3.add(c1630f);
                }
            } catch (Throwable th) {
                AbstractC1708y2.b("AppGalleryHelper: can not getting price type ", th);
            }
        }
        if (arrayList.size() > 0) {
            a(arrayList, 0);
        }
        if (arrayList2.size() > 0) {
            a(arrayList2, 1);
        }
        if (arrayList3.size() > 0) {
            a(arrayList3, 2);
        }
    }

    public void a() {
        HashSet hashSet = new HashSet();
        hashSet.add(new c(0, 2));
        hashSet.add(new c(1, 2));
        hashSet.add(new c(2, 2));
        hashSet.add(new c(0, 3));
        hashSet.add(new c(2, 3));
        this.f21166d = Collections.synchronizedSet(hashSet);
        AbstractC1708y2.a("AppGalleryHelper: purchase loaders created");
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b((String) null);
        }
    }

    void a(List list, int i4) {
        AbstractC1708y2.a("AppGalleryHelper: start loading products by price");
        HashSet hashSet = new HashSet();
        final ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext() && hashSet.size() < 200) {
            C1630f c1630f = (C1630f) it.next();
            hashSet.add(c1630f.c());
            arrayList.add(c1630f);
            it.remove();
        }
        AbstractC1708y2.a("AppGalleryHelper: product id's have been detected");
        while (it.hasNext()) {
            C1630f c1630f2 = (C1630f) it.next();
            if (hashSet.contains(c1630f2.c())) {
                arrayList.add(c1630f2);
                it.remove();
            }
        }
        AbstractC1708y2.a("AppGalleryHelper: products deduplication done");
        if (list.size() > 0) {
            AbstractC1708y2.a("AppGalleryHelper: there are still unloaded products, we are loading more");
            a(list, i4);
        }
        final ProductInfoReq productInfoReq = new ProductInfoReq();
        productInfoReq.setPriceType(i4);
        productInfoReq.setProductIds(new ArrayList(hashSet));
        AbstractC1658m.f(new Runnable() { // from class: com.my.tracker.obfuscated.H
            @Override // java.lang.Runnable
            public final void run() {
                C1621d.this.a(productInfoReq, arrayList);
            }
        });
    }

    public static a a(Context context) {
        try {
            return new a(Iap.getIapClient(context), context);
        } catch (Throwable th) {
            AbstractC1708y2.b("AppGalleryHelper: creating AppGalleryHelperBuilder failed", th);
            return null;
        }
    }

    public static JSONObject a(Object obj) {
        AbstractC1708y2.a("AppGalleryHelper: start parseProductInfoToJson");
        try {
            ProductInfo productInfo = (ProductInfo) obj;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("productId", productInfo.getProductId());
            jSONObject.put(HwPayConstant.KEY_PRODUCTNAME, productInfo.getProductName());
            jSONObject.put(HwPayConstant.KEY_PRODUCTDESC, productInfo.getProductDesc());
            jSONObject.put("currency", productInfo.getCurrency());
            jSONObject.put("price", productInfo.getPrice());
            jSONObject.put("microsPrice", productInfo.getMicrosPrice());
            jSONObject.put("priceType", productInfo.getPriceType());
            jSONObject.put("originalMicroPrice", productInfo.getOriginalMicroPrice());
            jSONObject.put("originalLocalPrice", productInfo.getOriginalLocalPrice());
            jSONObject.put("subPeriod", productInfo.getSubPeriod());
            jSONObject.put("subSpecialPrice", productInfo.getSubSpecialPrice());
            jSONObject.put("subSpecialPriceMicros", productInfo.getSubSpecialPriceMicros());
            jSONObject.put("subSpecialPeriod", productInfo.getSubSpecialPeriod());
            jSONObject.put("subSpecialPeriodCycles", productInfo.getSubSpecialPeriodCycles());
            jSONObject.put("subFreeTrialPeriod", productInfo.getSubFreeTrialPeriod());
            jSONObject.put("subGroupId", productInfo.getSubGroupId());
            jSONObject.put("subGroupTitle", productInfo.getSubGroupTitle());
            jSONObject.put("subProductLevel", productInfo.getSubProductLevel());
            jSONObject.put("status", productInfo.getStatus());
            return jSONObject;
        } catch (NoClassDefFoundError e4) {
            AbstractC1708y2.b("AppGalleryHelper: ", e4);
            return null;
        } catch (Throwable th) {
            AbstractC1708y2.b("AppGalleryHelper: ", th);
            return null;
        }
    }
}
