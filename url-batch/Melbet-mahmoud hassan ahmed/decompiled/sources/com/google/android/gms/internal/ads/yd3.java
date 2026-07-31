package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
final class yd3 implements ce3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dd3 f14632a;

    yd3(dd3 dd3Var) {
        this.f14632a = dd3Var;
    }

    @Override // com.google.android.gms.internal.ads.ce3
    public final dd3<?> a() {
        return this.f14632a;
    }

    @Override // com.google.android.gms.internal.ads.ce3
    public final Set<Class<?>> b() {
        return Collections.singleton(this.f14632a.c());
    }

    @Override // com.google.android.gms.internal.ads.ce3
    public final Class<?> c() {
        return this.f14632a.getClass();
    }

    @Override // com.google.android.gms.internal.ads.ce3
    public final <Q> dd3<Q> d(Class<Q> cls) {
        if (this.f14632a.c().equals(cls)) {
            return this.f14632a;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    @Override // com.google.android.gms.internal.ads.ce3
    public final Class<?> g() {
        return null;
    }
}
