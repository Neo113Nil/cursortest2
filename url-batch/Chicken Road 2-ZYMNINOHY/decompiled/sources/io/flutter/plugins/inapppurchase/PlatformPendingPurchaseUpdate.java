package io.flutter.plugins.inapppurchase;

import E.AbstractC0005f;
import d3.j;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PlatformPendingPurchaseUpdate {
    public static final Companion Companion = new Companion(null);
    private final List<String> products;
    private final String purchaseToken;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final PlatformPendingPurchaseUpdate fromList(List<? extends Object> list) {
            List list2 = (List) AbstractC0005f.h(list, "pigeonVar_list", 0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            Object obj = list.get(1);
            i.c(obj, "null cannot be cast to non-null type kotlin.String");
            return new PlatformPendingPurchaseUpdate(list2, (String) obj);
        }

        private Companion() {
        }
    }

    public PlatformPendingPurchaseUpdate(List<String> products, String purchaseToken) {
        i.e(products, "products");
        i.e(purchaseToken, "purchaseToken");
        this.products = products;
        this.purchaseToken = purchaseToken;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlatformPendingPurchaseUpdate copy$default(PlatformPendingPurchaseUpdate platformPendingPurchaseUpdate, List list, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = platformPendingPurchaseUpdate.products;
        }
        if ((i4 & 2) != 0) {
            str = platformPendingPurchaseUpdate.purchaseToken;
        }
        return platformPendingPurchaseUpdate.copy(list, str);
    }

    public final List<String> component1() {
        return this.products;
    }

    public final String component2() {
        return this.purchaseToken;
    }

    public final PlatformPendingPurchaseUpdate copy(List<String> products, String purchaseToken) {
        i.e(products, "products");
        i.e(purchaseToken, "purchaseToken");
        return new PlatformPendingPurchaseUpdate(products, purchaseToken);
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(PlatformPendingPurchaseUpdate.class)) {
            if (this == obj) {
                return true;
            }
            PlatformPendingPurchaseUpdate platformPendingPurchaseUpdate = (PlatformPendingPurchaseUpdate) obj;
            MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
            if (messagesPigeonUtils.deepEquals(this.products, platformPendingPurchaseUpdate.products) && messagesPigeonUtils.deepEquals(this.purchaseToken, platformPendingPurchaseUpdate.purchaseToken)) {
                return true;
            }
        }
        return false;
    }

    public final List<String> getProducts() {
        return this.products;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public int hashCode() {
        int hashCode = PlatformPendingPurchaseUpdate.class.hashCode() * 31;
        MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
        return ((hashCode + messagesPigeonUtils.deepHash(this.products)) * 31) + messagesPigeonUtils.deepHash(this.purchaseToken);
    }

    public final List<Object> toList() {
        return j.W(this.products, this.purchaseToken);
    }

    public String toString() {
        return "PlatformPendingPurchaseUpdate(products=" + this.products + ", purchaseToken=" + this.purchaseToken + ")";
    }
}
