package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Uf {

    /* renamed from: a, reason: collision with root package name */
    public final String f38364a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38365b;

    /* renamed from: c, reason: collision with root package name */
    public final List f38366c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f38367d;

    /* renamed from: e, reason: collision with root package name */
    public final Nf f38368e;

    /* renamed from: f, reason: collision with root package name */
    public final Nf f38369f;

    /* renamed from: g, reason: collision with root package name */
    public final List f38370g;

    public Uf(ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new Nf(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() != null ? new Nf(eCommerceProduct.getOriginalPrice()) : null, CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getPromocodes()));
    }

    public final String toString() {
        return "ProductWrapper{sku='" + this.f38364a + "', name='" + this.f38365b + "', categoriesPath=" + this.f38366c + ", payload=" + this.f38367d + ", actualPrice=" + this.f38368e + ", originalPrice=" + this.f38369f + ", promocodes=" + this.f38370g + '}';
    }

    public Uf(String str, String str2, List list, Map map, Nf nf, Nf nf2, List list2) {
        this.f38364a = str;
        this.f38365b = str2;
        this.f38366c = list;
        this.f38367d = map;
        this.f38368e = nf;
        this.f38369f = nf2;
        this.f38370g = list2;
    }
}
