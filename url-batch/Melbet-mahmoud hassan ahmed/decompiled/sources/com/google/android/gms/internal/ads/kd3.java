package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class kd3<PrimitiveT, KeyT> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<PrimitiveT> f7471a;

    public kd3(Class<PrimitiveT> cls) {
        this.f7471a = cls;
    }

    final Class<PrimitiveT> a() {
        return this.f7471a;
    }

    public abstract PrimitiveT b(KeyT keyt);
}
