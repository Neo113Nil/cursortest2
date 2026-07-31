package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class d54<T> extends v44 {

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<T, c54<T>> f4077g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private Handler f4078h;

    /* renamed from: i, reason: collision with root package name */
    private vt1 f4079i;

    protected d54() {
    }

    @Override // com.google.android.gms.internal.ads.v44
    protected final void p() {
        for (c54<T> c54Var : this.f4077g.values()) {
            c54Var.f3736a.k(c54Var.f3737b);
        }
    }

    @Override // com.google.android.gms.internal.ads.v44
    protected final void r() {
        for (c54<T> c54Var : this.f4077g.values()) {
            c54Var.f3736a.d(c54Var.f3737b);
        }
    }

    @Override // com.google.android.gms.internal.ads.v44
    protected void s(vt1 vt1Var) {
        this.f4079i = vt1Var;
        this.f4078h = n13.f0(null);
    }

    @Override // com.google.android.gms.internal.ads.v44
    protected void u() {
        for (c54<T> c54Var : this.f4077g.values()) {
            c54Var.f3736a.a(c54Var.f3737b);
            c54Var.f3736a.f(c54Var.f3738c);
            c54Var.f3736a.e(c54Var.f3738c);
        }
        this.f4077g.clear();
    }

    protected abstract s54 w(T t6, s54 s54Var);

    @Override // com.google.android.gms.internal.ads.v54
    public void x() {
        Iterator<c54<T>> it = this.f4077g.values().iterator();
        while (it.hasNext()) {
            it.next().f3736a.x();
        }
    }

    protected abstract void y(T t6, v54 v54Var, ei0 ei0Var);

    protected final void z(final T t6, v54 v54Var) {
        wu1.d(!this.f4077g.containsKey(t6));
        u54 u54Var = new u54() { // from class: com.google.android.gms.internal.ads.a54
            @Override // com.google.android.gms.internal.ads.u54
            public final void a(v54 v54Var2, ei0 ei0Var) {
                d54.this.y(t6, v54Var2, ei0Var);
            }
        };
        b54 b54Var = new b54(this, t6);
        this.f4077g.put(t6, new c54<>(v54Var, u54Var, b54Var));
        Handler handler = this.f4078h;
        Objects.requireNonNull(handler);
        v54Var.c(handler, b54Var);
        Handler handler2 = this.f4078h;
        Objects.requireNonNull(handler2);
        v54Var.b(handler2, b54Var);
        v54Var.i(u54Var, this.f4079i);
        if (v()) {
            return;
        }
        v54Var.k(u54Var);
    }
}
