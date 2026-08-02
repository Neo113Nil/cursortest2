package io.flutter.plugins.inapppurchase;

import E.AbstractC0005f;
import a.AbstractC0124a;
import java.util.List;
import kotlin.jvm.internal.i;
import x.AbstractC1514c;

/* loaded from: classes.dex */
public final class PlatformUnfetchedProduct {
    public static final Companion Companion = new Companion(null);
    private final String productId;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final PlatformUnfetchedProduct fromList(List<? extends Object> list) {
            return new PlatformUnfetchedProduct((String) AbstractC0005f.h(list, "pigeonVar_list", 0, "null cannot be cast to non-null type kotlin.String"));
        }

        private Companion() {
        }
    }

    public PlatformUnfetchedProduct(String productId) {
        i.e(productId, "productId");
        this.productId = productId;
    }

    public static /* synthetic */ PlatformUnfetchedProduct copy$default(PlatformUnfetchedProduct platformUnfetchedProduct, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = platformUnfetchedProduct.productId;
        }
        return platformUnfetchedProduct.copy(str);
    }

    public final String component1() {
        return this.productId;
    }

    public final PlatformUnfetchedProduct copy(String productId) {
        i.e(productId, "productId");
        return new PlatformUnfetchedProduct(productId);
    }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(PlatformUnfetchedProduct.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return MessagesPigeonUtils.INSTANCE.deepEquals(this.productId, ((PlatformUnfetchedProduct) obj).productId);
    }

    public final String getProductId() {
        return this.productId;
    }

    public int hashCode() {
        return (PlatformUnfetchedProduct.class.hashCode() * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.productId);
    }

    public final List<Object> toList() {
        return AbstractC0124a.H(this.productId);
    }

    public String toString() {
        return AbstractC1514c.a("PlatformUnfetchedProduct(productId=", this.productId, ")");
    }
}
