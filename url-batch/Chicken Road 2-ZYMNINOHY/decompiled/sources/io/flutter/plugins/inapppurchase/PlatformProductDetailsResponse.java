package io.flutter.plugins.inapppurchase;

import E.AbstractC0005f;
import d3.j;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PlatformProductDetailsResponse {
    public static final Companion Companion = new Companion(null);
    private final PlatformBillingResult billingResult;
    private final List<PlatformProductDetails> productDetails;
    private final List<PlatformUnfetchedProduct> unfetchedProductList;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final PlatformProductDetailsResponse fromList(List<? extends Object> list) {
            PlatformBillingResult platformBillingResult = (PlatformBillingResult) AbstractC0005f.h(list, "pigeonVar_list", 0, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingResult");
            Object obj = list.get(1);
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformProductDetails>");
            Object obj2 = list.get(2);
            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformUnfetchedProduct>");
            return new PlatformProductDetailsResponse(platformBillingResult, (List) obj, (List) obj2);
        }

        private Companion() {
        }
    }

    public PlatformProductDetailsResponse(PlatformBillingResult billingResult, List<PlatformProductDetails> productDetails, List<PlatformUnfetchedProduct> unfetchedProductList) {
        i.e(billingResult, "billingResult");
        i.e(productDetails, "productDetails");
        i.e(unfetchedProductList, "unfetchedProductList");
        this.billingResult = billingResult;
        this.productDetails = productDetails;
        this.unfetchedProductList = unfetchedProductList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlatformProductDetailsResponse copy$default(PlatformProductDetailsResponse platformProductDetailsResponse, PlatformBillingResult platformBillingResult, List list, List list2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            platformBillingResult = platformProductDetailsResponse.billingResult;
        }
        if ((i4 & 2) != 0) {
            list = platformProductDetailsResponse.productDetails;
        }
        if ((i4 & 4) != 0) {
            list2 = platformProductDetailsResponse.unfetchedProductList;
        }
        return platformProductDetailsResponse.copy(platformBillingResult, list, list2);
    }

    public final PlatformBillingResult component1() {
        return this.billingResult;
    }

    public final List<PlatformProductDetails> component2() {
        return this.productDetails;
    }

    public final List<PlatformUnfetchedProduct> component3() {
        return this.unfetchedProductList;
    }

    public final PlatformProductDetailsResponse copy(PlatformBillingResult billingResult, List<PlatformProductDetails> productDetails, List<PlatformUnfetchedProduct> unfetchedProductList) {
        i.e(billingResult, "billingResult");
        i.e(productDetails, "productDetails");
        i.e(unfetchedProductList, "unfetchedProductList");
        return new PlatformProductDetailsResponse(billingResult, productDetails, unfetchedProductList);
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(PlatformProductDetailsResponse.class)) {
            if (this == obj) {
                return true;
            }
            PlatformProductDetailsResponse platformProductDetailsResponse = (PlatformProductDetailsResponse) obj;
            MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
            if (messagesPigeonUtils.deepEquals(this.billingResult, platformProductDetailsResponse.billingResult) && messagesPigeonUtils.deepEquals(this.productDetails, platformProductDetailsResponse.productDetails) && messagesPigeonUtils.deepEquals(this.unfetchedProductList, platformProductDetailsResponse.unfetchedProductList)) {
                return true;
            }
        }
        return false;
    }

    public final PlatformBillingResult getBillingResult() {
        return this.billingResult;
    }

    public final List<PlatformProductDetails> getProductDetails() {
        return this.productDetails;
    }

    public final List<PlatformUnfetchedProduct> getUnfetchedProductList() {
        return this.unfetchedProductList;
    }

    public int hashCode() {
        int hashCode = PlatformProductDetailsResponse.class.hashCode() * 31;
        MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
        return ((((hashCode + messagesPigeonUtils.deepHash(this.billingResult)) * 31) + messagesPigeonUtils.deepHash(this.productDetails)) * 31) + messagesPigeonUtils.deepHash(this.unfetchedProductList);
    }

    public final List<Object> toList() {
        return j.W(this.billingResult, this.productDetails, this.unfetchedProductList);
    }

    public String toString() {
        return "PlatformProductDetailsResponse(billingResult=" + this.billingResult + ", productDetails=" + this.productDetails + ", unfetchedProductList=" + this.unfetchedProductList + ")";
    }
}
