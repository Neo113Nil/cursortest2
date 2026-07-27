package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.hj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0700hj {

    /* renamed from: a, reason: collision with root package name */
    public final String f8327a;

    /* renamed from: b, reason: collision with root package name */
    public final List f8328b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8329c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f8330d;

    public C0700hj(ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), eCommerceScreen.getSearchQuery(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceScreen.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceScreen.getPayload()));
    }

    public final String toString() {
        return "ScreenWrapper{name='" + this.f8327a + "', categoriesPath=" + this.f8328b + ", searchQuery='" + this.f8329c + "', payload=" + this.f8330d + '}';
    }

    public C0700hj(String str, String str2, List list, Map map) {
        this.f8327a = str;
        this.f8328b = list;
        this.f8329c = str2;
        this.f8330d = map;
    }
}
