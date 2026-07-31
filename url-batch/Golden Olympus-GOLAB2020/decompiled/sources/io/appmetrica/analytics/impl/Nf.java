package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import io.appmetrica.analytics.ecommerce.ECommercePrice;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes3.dex */
public final class Nf {

    /* renamed from: a, reason: collision with root package name */
    public final Y f38019a;

    /* renamed from: b, reason: collision with root package name */
    public final List f38020b;

    public Nf(ECommercePrice eCommercePrice) {
        this(new Y(eCommercePrice.getFiat()), a(eCommercePrice.getInternalComponents()));
    }

    public static LinkedList a(List list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ECommerceAmount eCommerceAmount = (ECommerceAmount) it.next();
            linkedList.add(new Y(eCommerceAmount.getAmount(), eCommerceAmount.getUnit()));
        }
        return linkedList;
    }

    public final String toString() {
        return "PriceWrapper{fiat=" + this.f38019a + ", internalComponents=" + this.f38020b + '}';
    }

    public Nf(Y y4, LinkedList linkedList) {
        this.f38019a = y4;
        this.f38020b = linkedList;
    }
}
