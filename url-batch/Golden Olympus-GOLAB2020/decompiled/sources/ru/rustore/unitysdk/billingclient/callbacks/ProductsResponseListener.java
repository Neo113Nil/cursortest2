package ru.rustore.unitysdk.billingclient.callbacks;

import java.util.List;
import ru.rustore.sdk.billingclient.model.product.Product;

/* loaded from: classes3.dex */
public interface ProductsResponseListener {
    void OnFailure(Throwable th);

    void OnSuccess(List<Product> list);
}
