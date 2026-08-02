package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ECommerceOrder {

    /* renamed from: a, reason: collision with root package name */
    private final String f9805a;

    /* renamed from: b, reason: collision with root package name */
    private final List f9806b;

    /* renamed from: c, reason: collision with root package name */
    private Map f9807c;

    public ECommerceOrder(String str, List<ECommerceCartItem> list) {
        this.f9805a = str;
        this.f9806b = list;
    }

    public List<ECommerceCartItem> getCartItems() {
        return this.f9806b;
    }

    public String getIdentifier() {
        return this.f9805a;
    }

    public Map<String, String> getPayload() {
        return this.f9807c;
    }

    public ECommerceOrder setPayload(Map<String, String> map) {
        this.f9807c = map;
        return this;
    }

    public String toString() {
        return "ECommerceOrder{identifier='" + this.f9805a + "', cartItems=" + this.f9806b + ", payload=" + this.f9807c + '}';
    }
}
