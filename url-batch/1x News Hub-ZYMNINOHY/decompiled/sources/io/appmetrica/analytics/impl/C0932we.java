package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: io.appmetrica.analytics.impl.we, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0932we {

    /* renamed from: a, reason: collision with root package name */
    public final String f8568a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8569b;

    /* renamed from: c, reason: collision with root package name */
    public final List f8570c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f8571d;

    public C0932we(ECommerceOrder eCommerceOrder) {
        this(UUID.randomUUID().toString(), eCommerceOrder.getIdentifier(), a(eCommerceOrder.getCartItems()), CollectionUtils.mapCopyOfNullableMap(eCommerceOrder.getPayload()));
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C0817s3((ECommerceCartItem) it.next()));
        }
        return arrayList;
    }

    public final String toString() {
        return "OrderWrapper{uuid='" + this.f8568a + "', identifier='" + this.f8569b + "', cartItems=" + this.f8570c + ", payload=" + this.f8571d + '}';
    }

    public C0932we(String str, String str2, ArrayList arrayList, Map map) {
        this.f8568a = str;
        this.f8569b = str2;
        this.f8570c = arrayList;
        this.f8571d = map;
    }
}
