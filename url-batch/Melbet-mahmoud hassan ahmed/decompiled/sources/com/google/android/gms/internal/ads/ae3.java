package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* loaded from: classes.dex */
final class ae3 implements ce3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ xd3 f2740a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ld3 f2741b;

    ae3(xd3 xd3Var, ld3 ld3Var) {
        this.f2740a = xd3Var;
        this.f2741b = ld3Var;
    }

    @Override // com.google.android.gms.internal.ads.ce3
    public final dd3<?> a() {
        xd3 xd3Var = this.f2740a;
        return new wd3(xd3Var, this.f2741b, xd3Var.c());
    }

    @Override // com.google.android.gms.internal.ads.ce3
    public final Set<Class<?>> b() {
        return this.f2740a.g();
    }

    @Override // com.google.android.gms.internal.ads.ce3
    public final Class<?> c() {
        return this.f2740a.getClass();
    }

    @Override // com.google.android.gms.internal.ads.ce3
    public final <Q> dd3<Q> d(Class<Q> cls) {
        try {
            return new wd3(this.f2740a, this.f2741b, cls);
        } catch (IllegalArgumentException e7) {
            throw new GeneralSecurityException("Primitive type not supported", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.ce3
    public final Class<?> g() {
        return this.f2741b.getClass();
    }
}
