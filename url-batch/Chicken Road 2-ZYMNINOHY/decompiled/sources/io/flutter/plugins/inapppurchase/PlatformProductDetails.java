package io.flutter.plugins.inapppurchase;

import E.AbstractC0005f;
import d3.j;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PlatformProductDetails {
    public static final Companion Companion = new Companion(null);
    private final String description;
    private final String name;
    private final PlatformOneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
    private final List<PlatformOneTimePurchaseOfferDetails> oneTimePurchaseOfferDetailsList;
    private final String productId;
    private final PlatformProductType productType;
    private final List<PlatformSubscriptionOfferDetails> subscriptionOfferDetails;
    private final String title;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final PlatformProductDetails fromList(List<? extends Object> list) {
            String str = (String) AbstractC0005f.h(list, "pigeonVar_list", 0, "null cannot be cast to non-null type kotlin.String");
            Object obj = list.get(1);
            i.c(obj, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj;
            Object obj2 = list.get(2);
            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str3 = (String) obj2;
            Object obj3 = list.get(3);
            i.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformProductType");
            PlatformProductType platformProductType = (PlatformProductType) obj3;
            Object obj4 = list.get(4);
            i.c(obj4, "null cannot be cast to non-null type kotlin.String");
            return new PlatformProductDetails(str, str2, str3, platformProductType, (String) obj4, (PlatformOneTimePurchaseOfferDetails) list.get(5), (List) list.get(6), (List) list.get(7));
        }

        private Companion() {
        }
    }

    public PlatformProductDetails(String description, String name, String productId, PlatformProductType productType, String title, PlatformOneTimePurchaseOfferDetails platformOneTimePurchaseOfferDetails, List<PlatformOneTimePurchaseOfferDetails> list, List<PlatformSubscriptionOfferDetails> list2) {
        i.e(description, "description");
        i.e(name, "name");
        i.e(productId, "productId");
        i.e(productType, "productType");
        i.e(title, "title");
        this.description = description;
        this.name = name;
        this.productId = productId;
        this.productType = productType;
        this.title = title;
        this.oneTimePurchaseOfferDetails = platformOneTimePurchaseOfferDetails;
        this.oneTimePurchaseOfferDetailsList = list;
        this.subscriptionOfferDetails = list2;
    }

    public static /* synthetic */ PlatformProductDetails copy$default(PlatformProductDetails platformProductDetails, String str, String str2, String str3, PlatformProductType platformProductType, String str4, PlatformOneTimePurchaseOfferDetails platformOneTimePurchaseOfferDetails, List list, List list2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = platformProductDetails.description;
        }
        if ((i4 & 2) != 0) {
            str2 = platformProductDetails.name;
        }
        if ((i4 & 4) != 0) {
            str3 = platformProductDetails.productId;
        }
        if ((i4 & 8) != 0) {
            platformProductType = platformProductDetails.productType;
        }
        if ((i4 & 16) != 0) {
            str4 = platformProductDetails.title;
        }
        if ((i4 & 32) != 0) {
            platformOneTimePurchaseOfferDetails = platformProductDetails.oneTimePurchaseOfferDetails;
        }
        if ((i4 & 64) != 0) {
            list = platformProductDetails.oneTimePurchaseOfferDetailsList;
        }
        if ((i4 & 128) != 0) {
            list2 = platformProductDetails.subscriptionOfferDetails;
        }
        List list3 = list;
        List list4 = list2;
        String str5 = str4;
        PlatformOneTimePurchaseOfferDetails platformOneTimePurchaseOfferDetails2 = platformOneTimePurchaseOfferDetails;
        return platformProductDetails.copy(str, str2, str3, platformProductType, str5, platformOneTimePurchaseOfferDetails2, list3, list4);
    }

    public final String component1() {
        return this.description;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.productId;
    }

    public final PlatformProductType component4() {
        return this.productType;
    }

    public final String component5() {
        return this.title;
    }

    public final PlatformOneTimePurchaseOfferDetails component6() {
        return this.oneTimePurchaseOfferDetails;
    }

    public final List<PlatformOneTimePurchaseOfferDetails> component7() {
        return this.oneTimePurchaseOfferDetailsList;
    }

    public final List<PlatformSubscriptionOfferDetails> component8() {
        return this.subscriptionOfferDetails;
    }

    public final PlatformProductDetails copy(String description, String name, String productId, PlatformProductType productType, String title, PlatformOneTimePurchaseOfferDetails platformOneTimePurchaseOfferDetails, List<PlatformOneTimePurchaseOfferDetails> list, List<PlatformSubscriptionOfferDetails> list2) {
        i.e(description, "description");
        i.e(name, "name");
        i.e(productId, "productId");
        i.e(productType, "productType");
        i.e(title, "title");
        return new PlatformProductDetails(description, name, productId, productType, title, platformOneTimePurchaseOfferDetails, list, list2);
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(PlatformProductDetails.class)) {
            if (this == obj) {
                return true;
            }
            PlatformProductDetails platformProductDetails = (PlatformProductDetails) obj;
            MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
            if (messagesPigeonUtils.deepEquals(this.description, platformProductDetails.description) && messagesPigeonUtils.deepEquals(this.name, platformProductDetails.name) && messagesPigeonUtils.deepEquals(this.productId, platformProductDetails.productId) && messagesPigeonUtils.deepEquals(this.productType, platformProductDetails.productType) && messagesPigeonUtils.deepEquals(this.title, platformProductDetails.title) && messagesPigeonUtils.deepEquals(this.oneTimePurchaseOfferDetails, platformProductDetails.oneTimePurchaseOfferDetails) && messagesPigeonUtils.deepEquals(this.oneTimePurchaseOfferDetailsList, platformProductDetails.oneTimePurchaseOfferDetailsList) && messagesPigeonUtils.deepEquals(this.subscriptionOfferDetails, platformProductDetails.subscriptionOfferDetails)) {
                return true;
            }
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public final PlatformOneTimePurchaseOfferDetails getOneTimePurchaseOfferDetails() {
        return this.oneTimePurchaseOfferDetails;
    }

    public final List<PlatformOneTimePurchaseOfferDetails> getOneTimePurchaseOfferDetailsList() {
        return this.oneTimePurchaseOfferDetailsList;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final PlatformProductType getProductType() {
        return this.productType;
    }

    public final List<PlatformSubscriptionOfferDetails> getSubscriptionOfferDetails() {
        return this.subscriptionOfferDetails;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = PlatformProductDetails.class.hashCode() * 31;
        MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
        return ((((((((((((((hashCode + messagesPigeonUtils.deepHash(this.description)) * 31) + messagesPigeonUtils.deepHash(this.name)) * 31) + messagesPigeonUtils.deepHash(this.productId)) * 31) + messagesPigeonUtils.deepHash(this.productType)) * 31) + messagesPigeonUtils.deepHash(this.title)) * 31) + messagesPigeonUtils.deepHash(this.oneTimePurchaseOfferDetails)) * 31) + messagesPigeonUtils.deepHash(this.oneTimePurchaseOfferDetailsList)) * 31) + messagesPigeonUtils.deepHash(this.subscriptionOfferDetails);
    }

    public final List<Object> toList() {
        return j.W(this.description, this.name, this.productId, this.productType, this.title, this.oneTimePurchaseOfferDetails, this.oneTimePurchaseOfferDetailsList, this.subscriptionOfferDetails);
    }

    public String toString() {
        return "PlatformProductDetails(description=" + this.description + ", name=" + this.name + ", productId=" + this.productId + ", productType=" + this.productType + ", title=" + this.title + ", oneTimePurchaseOfferDetails=" + this.oneTimePurchaseOfferDetails + ", oneTimePurchaseOfferDetailsList=" + this.oneTimePurchaseOfferDetailsList + ", subscriptionOfferDetails=" + this.subscriptionOfferDetails + ")";
    }

    public /* synthetic */ PlatformProductDetails(String str, String str2, String str3, PlatformProductType platformProductType, String str4, PlatformOneTimePurchaseOfferDetails platformOneTimePurchaseOfferDetails, List list, List list2, int i4, kotlin.jvm.internal.e eVar) {
        this(str, str2, str3, platformProductType, str4, (i4 & 32) != 0 ? null : platformOneTimePurchaseOfferDetails, (i4 & 64) != 0 ? null : list, (i4 & 128) != 0 ? null : list2);
    }
}
