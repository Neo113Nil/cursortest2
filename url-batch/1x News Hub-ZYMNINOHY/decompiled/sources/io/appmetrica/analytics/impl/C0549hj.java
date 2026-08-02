package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.hj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0549hj {

    /* renamed from: a, reason: collision with root package name */
    public final String f7450a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7451b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7452c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f7453d;

    public C0549hj(ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), eCommerceScreen.getSearchQuery(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceScreen.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceScreen.getPayload()));
    }

    public final String toString() {
        return "ScreenWrapper{name='" + this.f7450a + "', categoriesPath=" + this.f7451b + ", searchQuery='" + this.f7452c + "', payload=" + this.f7453d + '}';
    }

    public C0549hj(String str, String str2, List list, Map map) {
        this.f7450a = str;
        this.f7451b = list;
        this.f7452c = str2;
        this.f7453d = map;
    }
}
