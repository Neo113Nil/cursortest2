package io.flutter.plugins.inapppurchase;

import E.AbstractC0005f;
import d3.j;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PlatformPurchasesResponse {
    public static final Companion Companion = new Companion(null);
    private final PlatformBillingResult billingResult;
    private final List<PlatformPurchase> purchases;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final PlatformPurchasesResponse fromList(List<? extends Object> list) {
            PlatformBillingResult platformBillingResult = (PlatformBillingResult) AbstractC0005f.h(list, "pigeonVar_list", 0, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingResult");
            Object obj = list.get(1);
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformPurchase>");
            return new PlatformPurchasesResponse(platformBillingResult, (List) obj);
        }

        private Companion() {
        }
    }

    public PlatformPurchasesResponse(PlatformBillingResult billingResult, List<PlatformPurchase> purchases) {
        i.e(billingResult, "billingResult");
        i.e(purchases, "purchases");
        this.billingResult = billingResult;
        this.purchases = purchases;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlatformPurchasesResponse copy$default(PlatformPurchasesResponse platformPurchasesResponse, PlatformBillingResult platformBillingResult, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            platformBillingResult = platformPurchasesResponse.billingResult;
        }
        if ((i4 & 2) != 0) {
            list = platformPurchasesResponse.purchases;
        }
        return platformPurchasesResponse.copy(platformBillingResult, list);
    }

    public final PlatformBillingResult component1() {
        return this.billingResult;
    }

    public final List<PlatformPurchase> component2() {
        return this.purchases;
    }

    public final PlatformPurchasesResponse copy(PlatformBillingResult billingResult, List<PlatformPurchase> purchases) {
        i.e(billingResult, "billingResult");
        i.e(purchases, "purchases");
        return new PlatformPurchasesResponse(billingResult, purchases);
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(PlatformPurchasesResponse.class)) {
            if (this == obj) {
                return true;
            }
            PlatformPurchasesResponse platformPurchasesResponse = (PlatformPurchasesResponse) obj;
            MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
            if (messagesPigeonUtils.deepEquals(this.billingResult, platformPurchasesResponse.billingResult) && messagesPigeonUtils.deepEquals(this.purchases, platformPurchasesResponse.purchases)) {
                return true;
            }
        }
        return false;
    }

    public final PlatformBillingResult getBillingResult() {
        return this.billingResult;
    }

    public final List<PlatformPurchase> getPurchases() {
        return this.purchases;
    }

    public int hashCode() {
        int hashCode = PlatformPurchasesResponse.class.hashCode() * 31;
        MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
        return ((hashCode + messagesPigeonUtils.deepHash(this.billingResult)) * 31) + messagesPigeonUtils.deepHash(this.purchases);
    }

    public final List<Object> toList() {
        return j.W(this.billingResult, this.purchases);
    }

    public String toString() {
        return "PlatformPurchasesResponse(billingResult=" + this.billingResult + ", purchases=" + this.purchases + ")";
    }
}
