package io.flutter.plugins.inapppurchase;

import d3.j;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PlatformUserChoiceDetails {
    public static final Companion Companion = new Companion(null);
    private final String externalTransactionToken;
    private final String originalExternalTransactionId;
    private final List<PlatformUserChoiceProduct> products;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final PlatformUserChoiceDetails fromList(List<? extends Object> pigeonVar_list) {
            i.e(pigeonVar_list, "pigeonVar_list");
            String str = (String) pigeonVar_list.get(0);
            Object obj = pigeonVar_list.get(1);
            i.c(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = pigeonVar_list.get(2);
            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformUserChoiceProduct>");
            return new PlatformUserChoiceDetails(str, (String) obj, (List) obj2);
        }

        private Companion() {
        }
    }

    public PlatformUserChoiceDetails(String str, String externalTransactionToken, List<PlatformUserChoiceProduct> products) {
        i.e(externalTransactionToken, "externalTransactionToken");
        i.e(products, "products");
        this.originalExternalTransactionId = str;
        this.externalTransactionToken = externalTransactionToken;
        this.products = products;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlatformUserChoiceDetails copy$default(PlatformUserChoiceDetails platformUserChoiceDetails, String str, String str2, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = platformUserChoiceDetails.originalExternalTransactionId;
        }
        if ((i4 & 2) != 0) {
            str2 = platformUserChoiceDetails.externalTransactionToken;
        }
        if ((i4 & 4) != 0) {
            list = platformUserChoiceDetails.products;
        }
        return platformUserChoiceDetails.copy(str, str2, list);
    }

    public final String component1() {
        return this.originalExternalTransactionId;
    }

    public final String component2() {
        return this.externalTransactionToken;
    }

    public final List<PlatformUserChoiceProduct> component3() {
        return this.products;
    }

    public final PlatformUserChoiceDetails copy(String str, String externalTransactionToken, List<PlatformUserChoiceProduct> products) {
        i.e(externalTransactionToken, "externalTransactionToken");
        i.e(products, "products");
        return new PlatformUserChoiceDetails(str, externalTransactionToken, products);
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(PlatformUserChoiceDetails.class)) {
            if (this == obj) {
                return true;
            }
            PlatformUserChoiceDetails platformUserChoiceDetails = (PlatformUserChoiceDetails) obj;
            MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
            if (messagesPigeonUtils.deepEquals(this.originalExternalTransactionId, platformUserChoiceDetails.originalExternalTransactionId) && messagesPigeonUtils.deepEquals(this.externalTransactionToken, platformUserChoiceDetails.externalTransactionToken) && messagesPigeonUtils.deepEquals(this.products, platformUserChoiceDetails.products)) {
                return true;
            }
        }
        return false;
    }

    public final String getExternalTransactionToken() {
        return this.externalTransactionToken;
    }

    public final String getOriginalExternalTransactionId() {
        return this.originalExternalTransactionId;
    }

    public final List<PlatformUserChoiceProduct> getProducts() {
        return this.products;
    }

    public int hashCode() {
        int hashCode = PlatformUserChoiceDetails.class.hashCode() * 31;
        MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
        return ((((hashCode + messagesPigeonUtils.deepHash(this.originalExternalTransactionId)) * 31) + messagesPigeonUtils.deepHash(this.externalTransactionToken)) * 31) + messagesPigeonUtils.deepHash(this.products);
    }

    public final List<Object> toList() {
        return j.W(this.originalExternalTransactionId, this.externalTransactionToken, this.products);
    }

    public String toString() {
        return "PlatformUserChoiceDetails(originalExternalTransactionId=" + this.originalExternalTransactionId + ", externalTransactionToken=" + this.externalTransactionToken + ", products=" + this.products + ")";
    }

    public /* synthetic */ PlatformUserChoiceDetails(String str, String str2, List list, int i4, kotlin.jvm.internal.e eVar) {
        this((i4 & 1) != 0 ? null : str, str2, list);
    }
}
