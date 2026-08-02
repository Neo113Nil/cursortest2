package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Mf {

    /* renamed from: a, reason: collision with root package name */
    public final String f6334a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6335b;

    /* renamed from: c, reason: collision with root package name */
    public final List f6336c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f6337d;

    /* renamed from: e, reason: collision with root package name */
    public final Ef f6338e;
    public final Ef f;

    /* renamed from: g, reason: collision with root package name */
    public final List f6339g;

    public Mf(ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new Ef(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() != null ? new Ef(eCommerceProduct.getOriginalPrice()) : null, CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getPromocodes()));
    }

    public final String toString() {
        return "ProductWrapper{sku='" + this.f6334a + "', name='" + this.f6335b + "', categoriesPath=" + this.f6336c + ", payload=" + this.f6337d + ", actualPrice=" + this.f6338e + ", originalPrice=" + this.f + ", promocodes=" + this.f6339g + '}';
    }

    public Mf(String str, String str2, List list, Map map, Ef ef, Ef ef2, List list2) {
        this.f6334a = str;
        this.f6335b = str2;
        this.f6336c = list;
        this.f6337d = map;
        this.f6338e = ef;
        this.f = ef2;
        this.f6339g = list2;
    }
}
