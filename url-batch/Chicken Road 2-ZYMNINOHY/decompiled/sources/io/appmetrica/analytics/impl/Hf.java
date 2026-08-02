package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Hf {

    /* renamed from: a, reason: collision with root package name */
    public final String f10366a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10367b;

    /* renamed from: c, reason: collision with root package name */
    public final List f10368c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f10369d;

    /* renamed from: e, reason: collision with root package name */
    public final C1133zf f10370e;

    /* renamed from: f, reason: collision with root package name */
    public final C1133zf f10371f;

    /* renamed from: g, reason: collision with root package name */
    public final List f10372g;

    public Hf(ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new C1133zf(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() != null ? new C1133zf(eCommerceProduct.getOriginalPrice()) : null, CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getPromocodes()));
    }

    public final String toString() {
        return "ProductWrapper{sku='" + this.f10366a + "', name='" + this.f10367b + "', categoriesPath=" + this.f10368c + ", payload=" + this.f10369d + ", actualPrice=" + this.f10370e + ", originalPrice=" + this.f10371f + ", promocodes=" + this.f10372g + '}';
    }

    public Hf(String str, String str2, List list, Map map, C1133zf c1133zf, C1133zf c1133zf2, List list2) {
        this.f10366a = str;
        this.f10367b = str2;
        this.f10368c = list;
        this.f10369d = map;
        this.f10370e = c1133zf;
        this.f10371f = c1133zf2;
        this.f10372g = list2;
    }
}
