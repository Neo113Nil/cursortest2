package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* loaded from: classes.dex */
final class zd3 implements ce3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ld3 f15086a;

    zd3(ld3 ld3Var) {
        this.f15086a = ld3Var;
    }

    @Override // com.google.android.gms.internal.ads.ce3
    public final dd3<?> a() {
        ld3 ld3Var = this.f15086a;
        return new fd3(ld3Var, ld3Var.c());
    }

    @Override // com.google.android.gms.internal.ads.ce3
    public final Set<Class<?>> b() {
        return this.f15086a.g();
    }

    @Override // com.google.android.gms.internal.ads.ce3
    public final Class<?> c() {
        return this.f15086a.getClass();
    }

    @Override // com.google.android.gms.internal.ads.ce3
    public final <Q> dd3<Q> d(Class<Q> cls) {
        try {
            return new fd3(this.f15086a, cls);
        } catch (IllegalArgumentException e7) {
            throw new GeneralSecurityException("Primitive type not supported", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.ce3
    public final Class<?> g() {
        return null;
    }
}
