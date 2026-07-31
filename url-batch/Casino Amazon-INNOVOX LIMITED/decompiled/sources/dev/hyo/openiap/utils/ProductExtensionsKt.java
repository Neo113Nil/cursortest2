package dev.hyo.openiap.utils;

import dev.hyo.openiap.Product;
import dev.hyo.openiap.ProductAndroid;
import dev.hyo.openiap.ProductSubscriptionAndroid;
import dev.hyo.openiap.Purchase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProductExtensions.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u000e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005*\u00020\u0004¨\u0006\u0006"}, d2 = {"toProduct", "Ldev/hyo/openiap/Product;", "Ldev/hyo/openiap/ProductSubscriptionAndroid;", "toPurchaseInput", "Ldev/hyo/openiap/Purchase;", "Ldev/hyo/openiap/PurchaseInput;", "openiap_playRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductExtensionsKt {
    public static final Purchase toPurchaseInput(Purchase purchase) {
        Intrinsics.checkNotNullParameter(purchase, "<this>");
        return purchase;
    }

    public static final Product toProduct(ProductSubscriptionAndroid productSubscriptionAndroid) {
        Intrinsics.checkNotNullParameter(productSubscriptionAndroid, "<this>");
        return new ProductAndroid(productSubscriptionAndroid.getCurrency(), productSubscriptionAndroid.getDebugDescription(), productSubscriptionAndroid.getDescription(), null, productSubscriptionAndroid.getDisplayName(), productSubscriptionAndroid.getDisplayPrice(), productSubscriptionAndroid.getId(), productSubscriptionAndroid.getNameAndroid(), productSubscriptionAndroid.getOneTimePurchaseOfferDetailsAndroid(), productSubscriptionAndroid.getPlatform(), productSubscriptionAndroid.getPrice(), null, productSubscriptionAndroid.getSubscriptionOfferDetailsAndroid(), null, productSubscriptionAndroid.getTitle(), productSubscriptionAndroid.getType(), 10248, null);
    }
}
