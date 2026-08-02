package io.flutter.plugins.inapppurchase;

import d3.j;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PlatformPurchase {
    public static final Companion Companion = new Companion(null);
    private final PlatformAccountIdentifiers accountIdentifiers;
    private final String developerPayload;
    private final boolean isAcknowledged;
    private final boolean isAutoRenewing;
    private final String orderId;
    private final String originalJson;
    private final String packageName;
    private final PlatformPendingPurchaseUpdate pendingPurchaseUpdate;
    private final List<String> products;
    private final PlatformPurchaseState purchaseState;
    private final long purchaseTime;
    private final String purchaseToken;
    private final long quantity;
    private final String signature;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final PlatformPurchase fromList(List<? extends Object> pigeonVar_list) {
            i.e(pigeonVar_list, "pigeonVar_list");
            String str = (String) pigeonVar_list.get(0);
            Object obj = pigeonVar_list.get(1);
            i.c(obj, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj;
            Object obj2 = pigeonVar_list.get(2);
            i.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            long longValue = ((Long) obj2).longValue();
            Object obj3 = pigeonVar_list.get(3);
            i.c(obj3, "null cannot be cast to non-null type kotlin.String");
            Object obj4 = pigeonVar_list.get(4);
            i.c(obj4, "null cannot be cast to non-null type kotlin.String");
            Object obj5 = pigeonVar_list.get(5);
            i.c(obj5, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            Object obj6 = pigeonVar_list.get(6);
            i.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) obj6).booleanValue();
            Object obj7 = pigeonVar_list.get(7);
            i.c(obj7, "null cannot be cast to non-null type kotlin.String");
            Object obj8 = pigeonVar_list.get(8);
            i.c(obj8, "null cannot be cast to non-null type kotlin.String");
            Object obj9 = pigeonVar_list.get(9);
            i.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue2 = ((Boolean) obj9).booleanValue();
            Object obj10 = pigeonVar_list.get(10);
            i.c(obj10, "null cannot be cast to non-null type kotlin.Long");
            long longValue2 = ((Long) obj10).longValue();
            Object obj11 = pigeonVar_list.get(11);
            i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformPurchaseState");
            return new PlatformPurchase(str, str2, longValue, (String) obj3, (String) obj4, (List) obj5, booleanValue, (String) obj7, (String) obj8, booleanValue2, longValue2, (PlatformPurchaseState) obj11, (PlatformAccountIdentifiers) pigeonVar_list.get(12), (PlatformPendingPurchaseUpdate) pigeonVar_list.get(13));
        }

        private Companion() {
        }
    }

    public PlatformPurchase(String str, String packageName, long j4, String purchaseToken, String signature, List<String> products, boolean z, String originalJson, String developerPayload, boolean z4, long j5, PlatformPurchaseState purchaseState, PlatformAccountIdentifiers platformAccountIdentifiers, PlatformPendingPurchaseUpdate platformPendingPurchaseUpdate) {
        i.e(packageName, "packageName");
        i.e(purchaseToken, "purchaseToken");
        i.e(signature, "signature");
        i.e(products, "products");
        i.e(originalJson, "originalJson");
        i.e(developerPayload, "developerPayload");
        i.e(purchaseState, "purchaseState");
        this.orderId = str;
        this.packageName = packageName;
        this.purchaseTime = j4;
        this.purchaseToken = purchaseToken;
        this.signature = signature;
        this.products = products;
        this.isAutoRenewing = z;
        this.originalJson = originalJson;
        this.developerPayload = developerPayload;
        this.isAcknowledged = z4;
        this.quantity = j5;
        this.purchaseState = purchaseState;
        this.accountIdentifiers = platformAccountIdentifiers;
        this.pendingPurchaseUpdate = platformPendingPurchaseUpdate;
    }

    public final String component1() {
        return this.orderId;
    }

    public final boolean component10() {
        return this.isAcknowledged;
    }

    public final long component11() {
        return this.quantity;
    }

    public final PlatformPurchaseState component12() {
        return this.purchaseState;
    }

    public final PlatformAccountIdentifiers component13() {
        return this.accountIdentifiers;
    }

    public final PlatformPendingPurchaseUpdate component14() {
        return this.pendingPurchaseUpdate;
    }

    public final String component2() {
        return this.packageName;
    }

    public final long component3() {
        return this.purchaseTime;
    }

    public final String component4() {
        return this.purchaseToken;
    }

    public final String component5() {
        return this.signature;
    }

    public final List<String> component6() {
        return this.products;
    }

    public final boolean component7() {
        return this.isAutoRenewing;
    }

    public final String component8() {
        return this.originalJson;
    }

    public final String component9() {
        return this.developerPayload;
    }

    public final PlatformPurchase copy(String str, String packageName, long j4, String purchaseToken, String signature, List<String> products, boolean z, String originalJson, String developerPayload, boolean z4, long j5, PlatformPurchaseState purchaseState, PlatformAccountIdentifiers platformAccountIdentifiers, PlatformPendingPurchaseUpdate platformPendingPurchaseUpdate) {
        i.e(packageName, "packageName");
        i.e(purchaseToken, "purchaseToken");
        i.e(signature, "signature");
        i.e(products, "products");
        i.e(originalJson, "originalJson");
        i.e(developerPayload, "developerPayload");
        i.e(purchaseState, "purchaseState");
        return new PlatformPurchase(str, packageName, j4, purchaseToken, signature, products, z, originalJson, developerPayload, z4, j5, purchaseState, platformAccountIdentifiers, platformPendingPurchaseUpdate);
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(PlatformPurchase.class)) {
            if (this == obj) {
                return true;
            }
            PlatformPurchase platformPurchase = (PlatformPurchase) obj;
            MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
            if (messagesPigeonUtils.deepEquals(this.orderId, platformPurchase.orderId) && messagesPigeonUtils.deepEquals(this.packageName, platformPurchase.packageName) && messagesPigeonUtils.deepEquals(Long.valueOf(this.purchaseTime), Long.valueOf(platformPurchase.purchaseTime)) && messagesPigeonUtils.deepEquals(this.purchaseToken, platformPurchase.purchaseToken) && messagesPigeonUtils.deepEquals(this.signature, platformPurchase.signature) && messagesPigeonUtils.deepEquals(this.products, platformPurchase.products) && messagesPigeonUtils.deepEquals(Boolean.valueOf(this.isAutoRenewing), Boolean.valueOf(platformPurchase.isAutoRenewing)) && messagesPigeonUtils.deepEquals(this.originalJson, platformPurchase.originalJson) && messagesPigeonUtils.deepEquals(this.developerPayload, platformPurchase.developerPayload) && messagesPigeonUtils.deepEquals(Boolean.valueOf(this.isAcknowledged), Boolean.valueOf(platformPurchase.isAcknowledged)) && messagesPigeonUtils.deepEquals(Long.valueOf(this.quantity), Long.valueOf(platformPurchase.quantity)) && messagesPigeonUtils.deepEquals(this.purchaseState, platformPurchase.purchaseState) && messagesPigeonUtils.deepEquals(this.accountIdentifiers, platformPurchase.accountIdentifiers) && messagesPigeonUtils.deepEquals(this.pendingPurchaseUpdate, platformPurchase.pendingPurchaseUpdate)) {
                return true;
            }
        }
        return false;
    }

    public final PlatformAccountIdentifiers getAccountIdentifiers() {
        return this.accountIdentifiers;
    }

    public final String getDeveloperPayload() {
        return this.developerPayload;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getOriginalJson() {
        return this.originalJson;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final PlatformPendingPurchaseUpdate getPendingPurchaseUpdate() {
        return this.pendingPurchaseUpdate;
    }

    public final List<String> getProducts() {
        return this.products;
    }

    public final PlatformPurchaseState getPurchaseState() {
        return this.purchaseState;
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
        int hashCode = PlatformPurchase.class.hashCode() * 31;
        MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
        return ((((((((((((((((((((((((((hashCode + messagesPigeonUtils.deepHash(this.orderId)) * 31) + messagesPigeonUtils.deepHash(this.packageName)) * 31) + messagesPigeonUtils.deepHash(Long.valueOf(this.purchaseTime))) * 31) + messagesPigeonUtils.deepHash(this.purchaseToken)) * 31) + messagesPigeonUtils.deepHash(this.signature)) * 31) + messagesPigeonUtils.deepHash(this.products)) * 31) + messagesPigeonUtils.deepHash(Boolean.valueOf(this.isAutoRenewing))) * 31) + messagesPigeonUtils.deepHash(this.originalJson)) * 31) + messagesPigeonUtils.deepHash(this.developerPayload)) * 31) + messagesPigeonUtils.deepHash(Boolean.valueOf(this.isAcknowledged))) * 31) + messagesPigeonUtils.deepHash(Long.valueOf(this.quantity))) * 31) + messagesPigeonUtils.deepHash(this.purchaseState)) * 31) + messagesPigeonUtils.deepHash(this.accountIdentifiers)) * 31) + messagesPigeonUtils.deepHash(this.pendingPurchaseUpdate);
    }

    public final boolean isAcknowledged() {
        return this.isAcknowledged;
    }

    public final boolean isAutoRenewing() {
        return this.isAutoRenewing;
    }

    public final List<Object> toList() {
        return j.W(this.orderId, this.packageName, Long.valueOf(this.purchaseTime), this.purchaseToken, this.signature, this.products, Boolean.valueOf(this.isAutoRenewing), this.originalJson, this.developerPayload, Boolean.valueOf(this.isAcknowledged), Long.valueOf(this.quantity), this.purchaseState, this.accountIdentifiers, this.pendingPurchaseUpdate);
    }

    public String toString() {
        return "PlatformPurchase(orderId=" + this.orderId + ", packageName=" + this.packageName + ", purchaseTime=" + this.purchaseTime + ", purchaseToken=" + this.purchaseToken + ", signature=" + this.signature + ", products=" + this.products + ", isAutoRenewing=" + this.isAutoRenewing + ", originalJson=" + this.originalJson + ", developerPayload=" + this.developerPayload + ", isAcknowledged=" + this.isAcknowledged + ", quantity=" + this.quantity + ", purchaseState=" + this.purchaseState + ", accountIdentifiers=" + this.accountIdentifiers + ", pendingPurchaseUpdate=" + this.pendingPurchaseUpdate + ")";
    }

    public /* synthetic */ PlatformPurchase(String str, String str2, long j4, String str3, String str4, List list, boolean z, String str5, String str6, boolean z4, long j5, PlatformPurchaseState platformPurchaseState, PlatformAccountIdentifiers platformAccountIdentifiers, PlatformPendingPurchaseUpdate platformPendingPurchaseUpdate, int i4, kotlin.jvm.internal.e eVar) {
        this((i4 & 1) != 0 ? null : str, str2, j4, str3, str4, list, z, str5, str6, z4, j5, platformPurchaseState, (i4 & 4096) != 0 ? null : platformAccountIdentifiers, (i4 & 8192) != 0 ? null : platformPendingPurchaseUpdate);
    }
}
