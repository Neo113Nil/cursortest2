package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes.dex */
final class rc3<V> extends hb3<V> implements RunnableFuture<V> {

    /* renamed from: m, reason: collision with root package name */
    private volatile ac3<?> f11104m;

    rc3(wa3<V> wa3Var) {
        this.f11104m = new pc3(this, wa3Var);
    }

    rc3(Callable<V> callable) {
        this.f11104m = new qc3(this, callable);
    }

    static <V> rc3<V> F(Runnable runnable, V v6) {
        return new rc3<>(Executors.callable(runnable, v6));
    }

    @Override // com.google.android.gms.internal.ads.ga3
    protected final String i() {
        ac3<?> ac3Var = this.f11104m;
        if (ac3Var == null) {
            return super.i();
        }
        String obj = ac3Var.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 7);
        sb.append("task=[");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.ga3
    protected final void j() {
        ac3<?> ac3Var;
        if (z() && (ac3Var = this.f11104m) != null) {
            ac3Var.g();
        }
        this.f11104m = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        ac3<?> ac3Var = this.f11104m;
        if (ac3Var != null) {
            ac3Var.run();
        }
        this.f11104m = null;
    }
}
