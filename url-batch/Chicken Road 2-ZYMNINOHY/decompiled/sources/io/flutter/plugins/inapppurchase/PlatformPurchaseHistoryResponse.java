package io.flutter.plugins.inapppurchase;

import E.AbstractC0005f;
import d3.j;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PlatformPurchaseHistoryResponse {
    public static final Companion Companion = new Companion(null);
    private final PlatformBillingResult billingResult;
    private final List<PlatformPurchaseHistoryRecord> purchases;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final PlatformPurchaseHistoryResponse fromList(List<? extends Object> list) {
            PlatformBillingResult platformBillingResult = (PlatformBillingResult) AbstractC0005f.h(list, "pigeonVar_list", 0, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingResult");
            Object obj = list.get(1);
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformPurchaseHistoryRecord>");
            return new PlatformPurchaseHistoryResponse(platformBillingResult, (List) obj);
        }

        private Companion() {
        }
    }

    public PlatformPurchaseHistoryResponse(PlatformBillingResult billingResult, List<PlatformPurchaseHistoryRecord> purchases) {
        i.e(billingResult, "billingResult");
        i.e(purchases, "purchases");
        this.billingResult = billingResult;
        this.purchases = purchases;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlatformPurchaseHistoryResponse copy$default(PlatformPurchaseHistoryResponse platformPurchaseHistoryResponse, PlatformBillingResult platformBillingResult, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            platformBillingResult = platformPurchaseHistoryResponse.billingResult;
        }
        if ((i4 & 2) != 0) {
            list = platformPurchaseHistoryResponse.purchases;
        }
        return platformPurchaseHistoryResponse.copy(platformBillingResult, list);
    }

    public final PlatformBillingResult component1() {
        return this.billingResult;
    }

    public final List<PlatformPurchaseHistoryRecord> component2() {
        return this.purchases;
    }

    public final PlatformPurchaseHistoryResponse copy(PlatformBillingResult billingResult, List<PlatformPurchaseHistoryRecord> purchases) {
        i.e(billingResult, "billingResult");
        i.e(purchases, "purchases");
        return new PlatformPurchaseHistoryResponse(billingResult, purchases);
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(PlatformPurchaseHistoryResponse.class)) {
            if (this == obj) {
                return true;
            }
            PlatformPurchaseHistoryResponse platformPurchaseHistoryResponse = (PlatformPurchaseHistoryResponse) obj;
            MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
            if (messagesPigeonUtils.deepEquals(this.billingResult, platformPurchaseHistoryResponse.billingResult) && messagesPigeonUtils.deepEquals(this.purchases, platformPurchaseHistoryResponse.purchases)) {
                return true;
            }
        }
        return false;
    }

    public final PlatformBillingResult getBillingResult() {
        return this.billingResult;
    }

    public final List<PlatformPurchaseHistoryRecord> getPurchases() {
        return this.purchases;
    }

    public int hashCode() {
        int hashCode = PlatformPurchaseHistoryResponse.class.hashCode() * 31;
        MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
        return ((hashCode + messagesPigeonUtils.deepHash(this.billingResult)) * 31) + messagesPigeonUtils.deepHash(this.purchases);
    }

    public final List<Object> toList() {
        return j.W(this.billingResult, this.purchases);
    }

    public String toString() {
        return "PlatformPurchaseHistoryResponse(billingResult=" + this.billingResult + ", purchases=" + this.purchases + ")";
    }
}
