package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class ECommerceOrder {

    /* renamed from: a, reason: collision with root package name */
    private final String f37090a;

    /* renamed from: b, reason: collision with root package name */
    private final List f37091b;

    /* renamed from: c, reason: collision with root package name */
    private Map f37092c;

    public ECommerceOrder(@NonNull String str, @NonNull List<ECommerceCartItem> list) {
        this.f37090a = str;
        this.f37091b = list;
    }

    @NonNull
    public List<ECommerceCartItem> getCartItems() {
        return this.f37091b;
    }

    @NonNull
    public String getIdentifier() {
        return this.f37090a;
    }

    public Map<String, String> getPayload() {
        return this.f37092c;
    }

    public ECommerceOrder setPayload(Map<String, String> map) {
        this.f37092c = map;
        return this;
    }

    public String toString() {
        return "ECommerceOrder{identifier='" + this.f37090a + "', cartItems=" + this.f37091b + ", payload=" + this.f37092c + '}';
    }
}
