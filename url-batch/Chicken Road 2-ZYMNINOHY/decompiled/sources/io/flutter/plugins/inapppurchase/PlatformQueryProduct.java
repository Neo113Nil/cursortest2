package io.flutter.plugins.inapppurchase;

import E.AbstractC0005f;
import d3.j;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PlatformQueryProduct {
    public static final Companion Companion = new Companion(null);
    private final String productId;
    private final PlatformProductType productType;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final PlatformQueryProduct fromList(List<? extends Object> list) {
            String str = (String) AbstractC0005f.h(list, "pigeonVar_list", 0, "null cannot be cast to non-null type kotlin.String");
            Object obj = list.get(1);
            i.c(obj, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformProductType");
            return new PlatformQueryProduct(str, (PlatformProductType) obj);
        }

        private Companion() {
        }
    }

    public PlatformQueryProduct(String productId, PlatformProductType productType) {
        i.e(productId, "productId");
        i.e(productType, "productType");
        this.productId = productId;
        this.productType = productType;
    }

    public static /* synthetic */ PlatformQueryProduct copy$default(PlatformQueryProduct platformQueryProduct, String str, PlatformProductType platformProductType, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = platformQueryProduct.productId;
        }
        if ((i4 & 2) != 0) {
            platformProductType = platformQueryProduct.productType;
        }
        return platformQueryProduct.copy(str, platformProductType);
    }

    public final String component1() {
        return this.productId;
    }

    public final PlatformProductType component2() {
        return this.productType;
    }

    public final PlatformQueryProduct copy(String productId, PlatformProductType productType) {
        i.e(productId, "productId");
        i.e(productType, "productType");
        return new PlatformQueryProduct(productId, productType);
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(PlatformQueryProduct.class)) {
            if (this == obj) {
                return true;
            }
            PlatformQueryProduct platformQueryProduct = (PlatformQueryProduct) obj;
            MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
            if (messagesPigeonUtils.deepEquals(this.productId, platformQueryProduct.productId) && messagesPigeonUtils.deepEquals(this.productType, platformQueryProduct.productType)) {
                return true;
            }
        }
        return false;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final PlatformProductType getProductType() {
        return this.productType;
    }

    public int hashCode() {
        int hashCode = PlatformQueryProduct.class.hashCode() * 31;
        MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
        return ((hashCode + messagesPigeonUtils.deepHash(this.productId)) * 31) + messagesPigeonUtils.deepHash(this.productType);
    }

    public final List<Object> toList() {
        return j.W(this.productId, this.productType);
    }

    public String toString() {
        return "PlatformQueryProduct(productId=" + this.productId + ", productType=" + this.productType + ")";
    }
}
