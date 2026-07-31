package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.util.List;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: classes13.dex */
public interface ProductDetailsResponseListener {
    void onProductDetailsResponse(@NonNull BillingResult billingResult, @NonNull List<ProductDetails> list);
}
