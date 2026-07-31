package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class n73<K, V> extends b63<K, V> implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    final transient i73<K, ? extends z63<V>> f8970i;

    /* renamed from: j, reason: collision with root package name */
    final transient int f8971j;

    n73(i73<K, ? extends z63<V>> i73Var, int i7) {
        this.f8970i = i73Var;
        this.f8971j = i7;
    }

    @Override // com.google.android.gms.internal.ads.e83
    @Deprecated
    public final boolean a(K k7, V v6) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.e83
    public final int b() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.a63
    final /* synthetic */ Collection c() {
        return new l73(this);
    }

    @Override // com.google.android.gms.internal.ads.a63
    final Map<K, Collection<V>> e() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.android.gms.internal.ads.a63
    final Set<K> f() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.android.gms.internal.ads.a63
    public final boolean h(Object obj) {
        return obj != null && super.h(obj);
    }

    @Override // com.google.android.gms.internal.ads.e83
    @Deprecated
    public final void l() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.a63, com.google.android.gms.internal.ads.e83
    public final /* synthetic */ Map p() {
        return this.f8970i;
    }

    @Override // com.google.android.gms.internal.ads.a63, com.google.android.gms.internal.ads.e83
    public final /* bridge */ /* synthetic */ Collection t() {
        throw null;
    }
}
