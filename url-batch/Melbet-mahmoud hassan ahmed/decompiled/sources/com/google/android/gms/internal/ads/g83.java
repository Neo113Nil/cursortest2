package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
final class g83 extends k83 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator f5490a;

    g83(Comparator comparator) {
        this.f5490a = comparator;
    }

    @Override // com.google.android.gms.internal.ads.k83
    final <K, V> Map<K, Collection<V>> a() {
        return new TreeMap(this.f5490a);
    }
}
