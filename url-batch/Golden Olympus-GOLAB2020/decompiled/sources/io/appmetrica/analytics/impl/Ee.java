package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class Ee {

    /* renamed from: a, reason: collision with root package name */
    public final String f37441a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37442b;

    /* renamed from: c, reason: collision with root package name */
    public final List f37443c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f37444d;

    public Ee(ECommerceOrder eCommerceOrder) {
        this(UUID.randomUUID().toString(), eCommerceOrder.getIdentifier(), a(eCommerceOrder.getCartItems()), CollectionUtils.mapCopyOfNullableMap(eCommerceOrder.getPayload()));
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new G3((ECommerceCartItem) it.next()));
        }
        return arrayList;
    }

    public final String toString() {
        return "OrderWrapper{uuid='" + this.f37441a + "', identifier='" + this.f37442b + "', cartItems=" + this.f37443c + ", payload=" + this.f37444d + '}';
    }

    public Ee(String str, String str2, ArrayList arrayList, Map map) {
        this.f37441a = str;
        this.f37442b = str2;
        this.f37443c = arrayList;
        this.f37444d = map;
    }
}
