package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class z93<V> implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final ga3<V> f15037f;

    /* renamed from: g, reason: collision with root package name */
    final cc3<? extends V> f15038g;

    z93(ga3<V> ga3Var, cc3<? extends V> cc3Var) {
        this.f15037f = ga3Var;
        this.f15038g = cc3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object g7;
        u93 u93Var;
        obj = ((ga3) this.f15037f).f5520f;
        if (obj != this) {
            return;
        }
        g7 = ga3.g(this.f15038g);
        u93Var = ga3.f5518k;
        if (u93Var.d(this.f15037f, this, g7)) {
            ga3.D(this.f15037f);
        }
    }
}
