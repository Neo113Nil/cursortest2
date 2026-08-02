package io.flutter.plugins.inapppurchase;

import E.AbstractC0005f;
import d3.j;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PlatformPurchaseHistoryRecord {
    public static final Companion Companion = new Companion(null);
    private final String developerPayload;
    private final String originalJson;
    private final List<String> products;
    private final long purchaseTime;
    private final String purchaseToken;
    private final long quantity;
    private final String signature;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final PlatformPurchaseHistoryRecord fromList(List<? extends Object> list) {
            long longValue = ((Long) AbstractC0005f.h(list, "pigeonVar_list", 0, "null cannot be cast to non-null type kotlin.Long")).longValue();
            Object obj = list.get(1);
            i.c(obj, "null cannot be cast to non-null type kotlin.Long");
            long longValue2 = ((Long) obj).longValue();
            String str = (String) list.get(2);
            Object obj2 = list.get(3);
            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj2;
            Object obj3 = list.get(4);
            i.c(obj3, "null cannot be cast to non-null type kotlin.String");
            String str3 = (String) obj3;
            Object obj4 = list.get(5);
            i.c(obj4, "null cannot be cast to non-null type kotlin.String");
            Object obj5 = list.get(6);
            i.c(obj5, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            return new PlatformPurchaseHistoryRecord(longValue, longValue2, str, str2, str3, (String) obj4, (List) obj5);
        }

        private Companion() {
        }
    }

    public PlatformPurchaseHistoryRecord(long j4, long j5, String str, String originalJson, String purchaseToken, String signature, List<String> products) {
        i.e(originalJson, "originalJson");
        i.e(purchaseToken, "purchaseToken");
        i.e(signature, "signature");
        i.e(products, "products");
        this.quantity = j4;
        this.purchaseTime = j5;
        this.developerPayload = str;
        this.originalJson = originalJson;
        this.purchaseToken = purchaseToken;
        this.signature = signature;
        this.products = products;
    }

    public static /* synthetic */ PlatformPurchaseHistoryRecord copy$default(PlatformPurchaseHistoryRecord platformPurchaseHistoryRecord, long j4, long j5, String str, String str2, String str3, String str4, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = platformPurchaseHistoryRecord.quantity;
        }
        long j6 = j4;
        if ((i4 & 2) != 0) {
            j5 = platformPurchaseHistoryRecord.purchaseTime;
        }
        long j7 = j5;
        if ((i4 & 4) != 0) {
            str = platformPurchaseHistoryRecord.developerPayload;
        }
        return platformPurchaseHistoryRecord.copy(j6, j7, str, (i4 & 8) != 0 ? platformPurchaseHistoryRecord.originalJson : str2, (i4 & 16) != 0 ? platformPurchaseHistoryRecord.purchaseToken : str3, (i4 & 32) != 0 ? platformPurchaseHistoryRecord.signature : str4, (i4 & 64) != 0 ? platformPurchaseHistoryRecord.products : list);
    }

    public final long component1() {
        return this.quantity;
    }

    public final long component2() {
        return this.purchaseTime;
    }

    public final String component3() {
        return this.developerPayload;
    }

    public final String component4() {
        return this.originalJson;
    }

    public final String component5() {
        return this.purchaseToken;
    }

    public final String component6() {
        return this.signature;
    }

    public final List<String> component7() {
        return this.products;
    }

    public final PlatformPurchaseHistoryRecord copy(long j4, long j5, String str, String originalJson, String purchaseToken, String signature, List<String> products) {
        i.e(originalJson, "originalJson");
        i.e(purchaseToken, "purchaseToken");
        i.e(signature, "signature");
        i.e(products, "products");
        return new PlatformPurchaseHistoryRecord(j4, j5, str, originalJson, purchaseToken, signature, products);
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(PlatformPurchaseHistoryRecord.class)) {
            if (this == obj) {
                return true;
            }
            PlatformPurchaseHistoryRecord platformPurchaseHistoryRecord = (PlatformPurchaseHistoryRecord) obj;
            MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
            if (messagesPigeonUtils.deepEquals(Long.valueOf(this.quantity), Long.valueOf(platformPurchaseHistoryRecord.quantity)) && messagesPigeonUtils.deepEquals(Long.valueOf(this.purchaseTime), Long.valueOf(platformPurchaseHistoryRecord.purchaseTime)) && messagesPigeonUtils.deepEquals(this.developerPayload, platformPurchaseHistoryRecord.developerPayload) && messagesPigeonUtils.deepEquals(this.originalJson, platformPurchaseHistoryRecord.originalJson) && messagesPigeonUtils.deepEquals(this.purchaseToken, platformPurchaseHistoryRecord.purchaseToken) && messagesPigeonUtils.deepEquals(this.signature, platformPurchaseHistoryRecord.signature) && messagesPigeonUtils.deepEquals(this.products, platformPurchaseHistoryRecord.products)) {
                return true;
            }
        }
        return false;
    }

    public final String getDeveloperPayload() {
        return this.developerPayload;
    }

    public final String getOriginalJson() {
        return this.originalJson;
    }

    public final List<String> getProducts() {
        return this.products;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final long getQuantity() {
        return this.quantity;
    }

    public final String getSignature() {
        return this.signature;
    }

    public int hashCode() {
        int hashCode = PlatformPurchaseHistoryRecord.class.hashCode() * 31;
        MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
        return ((((((((((((hashCode + messagesPigeonUtils.deepHash(Long.valueOf(this.quantity))) * 31) + messagesPigeonUtils.deepHash(Long.valueOf(this.purchaseTime))) * 31) + messagesPigeonUtils.deepHash(this.developerPayload)) * 31) + messagesPigeonUtils.deepHash(this.originalJson)) * 31) + messagesPigeonUtils.deepHash(this.purchaseToken)) * 31) + messagesPigeonUtils.deepHash(this.signature)) * 31) + messagesPigeonUtils.deepHash(this.products);
    }

    public final List<Object> toList() {
        return j.W(Long.valueOf(this.quantity), Long.valueOf(this.purchaseTime), this.developerPayload, this.originalJson, this.purchaseToken, this.signature, this.products);
    }

    public String toString() {
        return "PlatformPurchaseHistoryRecord(quantity=" + this.quantity + ", purchaseTime=" + this.purchaseTime + ", developerPayload=" + this.developerPayload + ", originalJson=" + this.originalJson + ", purchaseToken=" + this.purchaseToken + ", signature=" + this.signature + ", products=" + this.products + ")";
    }

    public /* synthetic */ PlatformPurchaseHistoryRecord(long j4, long j5, String str, String str2, String str3, String str4, List list, int i4, kotlin.jvm.internal.e eVar) {
        this(j4, j5, (i4 & 4) != 0 ? null : str, str2, str3, str4, list);
    }
}
