package ru.rustore.unitysdk.payclient.callbacks;

import java.util.List;
import ru.rustore.sdk.pay.model.Product;

/* loaded from: classes3.dex */
public interface ProductsResponseListener {
    void OnFailure(Throwable th);

    void OnSuccess(List<Product> list);
}
