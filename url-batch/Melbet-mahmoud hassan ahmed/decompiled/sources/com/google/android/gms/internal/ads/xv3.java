package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class xv3<T> implements yv3<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f14364c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile yv3<T> f14365a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f14366b = f14364c;

    private xv3(yv3<T> yv3Var) {
        this.f14365a = yv3Var;
    }

    public static <P extends yv3<T>, T> yv3<T> b(P p7) {
        if ((p7 instanceof xv3) || (p7 instanceof jv3)) {
            return p7;
        }
        Objects.requireNonNull(p7);
        return new xv3(p7);
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final T a() {
        T t6 = (T) this.f14366b;
        if (t6 != f14364c) {
            return t6;
        }
        yv3<T> yv3Var = this.f14365a;
        if (yv3Var == null) {
            return (T) this.f14366b;
        }
        T a7 = yv3Var.a();
        this.f14366b = a7;
        this.f14365a = null;
        return a7;
    }
}
