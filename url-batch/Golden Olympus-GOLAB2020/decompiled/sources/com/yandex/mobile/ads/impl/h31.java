package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.i31;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
final class h31 extends i31.c<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator f26541a;

    h31(Comparator comparator) {
        this.f26541a = comparator;
    }

    @Override // com.yandex.mobile.ads.impl.i31.c
    final <K, V> Map<K, Collection<V>> b() {
        return new TreeMap(this.f26541a);
    }
}
