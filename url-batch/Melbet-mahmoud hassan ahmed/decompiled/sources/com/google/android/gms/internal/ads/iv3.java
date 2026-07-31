package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class iv3<T> implements kv3<T> {

    /* renamed from: a, reason: collision with root package name */
    private yv3<T> f6801a;

    public static <T> void b(yv3<T> yv3Var, yv3<T> yv3Var2) {
        iv3 iv3Var = (iv3) yv3Var;
        if (iv3Var.f6801a != null) {
            throw new IllegalStateException();
        }
        iv3Var.f6801a = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final T a() {
        yv3<T> yv3Var = this.f6801a;
        if (yv3Var != null) {
            return yv3Var.a();
        }
        throw new IllegalStateException();
    }
}
