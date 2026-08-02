package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: io.appmetrica.analytics.impl.pe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0873pe {

    /* renamed from: a, reason: collision with root package name */
    public final String f12579a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12580b;

    /* renamed from: c, reason: collision with root package name */
    public final List f12581c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f12582d;

    public C0873pe(ECommerceOrder eCommerceOrder) {
        this(UUID.randomUUID().toString(), eCommerceOrder.getIdentifier(), a(eCommerceOrder.getCartItems()), CollectionUtils.mapCopyOfNullableMap(eCommerceOrder.getPayload()));
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C0732k3((ECommerceCartItem) it.next()));
        }
        return arrayList;
    }

    public final String toString() {
        return "OrderWrapper{uuid='" + this.f12579a + "', identifier='" + this.f12580b + "', cartItems=" + this.f12581c + ", payload=" + this.f12582d + '}';
    }

    public C0873pe(String str, String str2, ArrayList arrayList, Map map) {
        this.f12579a = str;
        this.f12580b = str2;
        this.f12581c = arrayList;
        this.f12582d = map;
    }
}
