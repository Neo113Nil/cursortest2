package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* loaded from: classes.dex */
public class ip0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final bp0<T> f6734a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f6735b;

    public ip0() {
        bp0<T> bp0Var = new bp0<>();
        this.f6734a = bp0Var;
        this.f6735b = new AtomicInteger(0);
        rb3.r(bp0Var, new gp0(this), wo0.f13899f);
    }

    @Deprecated
    public final int a() {
        return this.f6735b.get();
    }

    @Deprecated
    public final void c() {
        this.f6734a.f(new Exception());
    }

    @Deprecated
    public final void d(T t6) {
        this.f6734a.e(t6);
    }

    @Deprecated
    public final void e(fp0<T> fp0Var, dp0 dp0Var) {
        rb3.r(this.f6734a, new hp0(this, fp0Var, dp0Var), wo0.f13899f);
    }
}
