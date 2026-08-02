package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ECommerceOrder {

    /* renamed from: a, reason: collision with root package name */
    private final String f5551a;

    /* renamed from: b, reason: collision with root package name */
    private final List f5552b;

    /* renamed from: c, reason: collision with root package name */
    private Map f5553c;

    public ECommerceOrder(String str, List<ECommerceCartItem> list) {
        this.f5551a = str;
        this.f5552b = list;
    }

    public List<ECommerceCartItem> getCartItems() {
        return this.f5552b;
    }

    public String getIdentifier() {
        return this.f5551a;
    }

    public Map<String, String> getPayload() {
        return this.f5553c;
    }

    public ECommerceOrder setPayload(Map<String, String> map) {
        this.f5553c = map;
        return this;
    }

    public String toString() {
        return "ECommerceOrder{identifier='" + this.f5551a + "', cartItems=" + this.f5552b + ", payload=" + this.f5553c + '}';
    }
}
