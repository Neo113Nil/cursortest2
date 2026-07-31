package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class o83<K, V> extends f53<K, V> {

    /* renamed from: k, reason: collision with root package name */
    final transient c53<? extends List<V>> f9567k;

    o83(Map<K, Collection<V>> map, c53<? extends List<V>> c53Var) {
        super(map);
        this.f9567k = c53Var;
    }

    @Override // com.google.android.gms.internal.ads.a63
    final Map<K, Collection<V>> e() {
        return q();
    }

    @Override // com.google.android.gms.internal.ads.a63
    final Set<K> f() {
        return r();
    }

    @Override // com.google.android.gms.internal.ads.x53
    protected final /* bridge */ /* synthetic */ Collection i() {
        return this.f9567k.zza();
    }
}
