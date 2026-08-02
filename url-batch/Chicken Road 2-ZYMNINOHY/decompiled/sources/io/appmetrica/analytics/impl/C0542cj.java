package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.cj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0542cj {

    /* renamed from: a, reason: collision with root package name */
    public final String f11619a;

    /* renamed from: b, reason: collision with root package name */
    public final List f11620b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11621c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f11622d;

    public C0542cj(ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), eCommerceScreen.getSearchQuery(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceScreen.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceScreen.getPayload()));
    }

    public final String toString() {
        return "ScreenWrapper{name='" + this.f11619a + "', categoriesPath=" + this.f11620b + ", searchQuery='" + this.f11621c + "', payload=" + this.f11622d + '}';
    }

    public C0542cj(String str, String str2, List list, Map map) {
        this.f11619a = str;
        this.f11620b = list;
        this.f11621c = str2;
        this.f11622d = map;
    }
}
