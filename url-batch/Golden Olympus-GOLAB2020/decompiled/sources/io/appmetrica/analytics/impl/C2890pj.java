package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.pj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2890pj {

    /* renamed from: a, reason: collision with root package name */
    public final String f39625a;

    /* renamed from: b, reason: collision with root package name */
    public final List f39626b;

    /* renamed from: c, reason: collision with root package name */
    public final String f39627c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f39628d;

    public C2890pj(ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), eCommerceScreen.getSearchQuery(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceScreen.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceScreen.getPayload()));
    }

    public final String toString() {
        return "ScreenWrapper{name='" + this.f39625a + "', categoriesPath=" + this.f39626b + ", searchQuery='" + this.f39627c + "', payload=" + this.f39628d + '}';
    }

    public C2890pj(String str, String str2, List list, Map map) {
        this.f39625a = str;
        this.f39626b = list;
        this.f39627c = str2;
        this.f39628d = map;
    }
}
