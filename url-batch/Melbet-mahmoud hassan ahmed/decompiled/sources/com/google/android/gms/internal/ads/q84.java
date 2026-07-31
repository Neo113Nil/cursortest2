package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public abstract class q84 {

    /* renamed from: a, reason: collision with root package name */
    private p84 f10617a;

    /* renamed from: b, reason: collision with root package name */
    private a94 f10618b;

    public abstract r84 a(yx3[] yx3VarArr, hm0 hm0Var, s54 s54Var, ei0 ei0Var);

    public abstract void b(Object obj);

    protected final a94 c() {
        a94 a94Var = this.f10618b;
        Objects.requireNonNull(a94Var);
        return a94Var;
    }

    public final void d(p84 p84Var, a94 a94Var) {
        this.f10617a = p84Var;
        this.f10618b = a94Var;
    }

    protected final void e() {
        p84 p84Var = this.f10617a;
        if (p84Var != null) {
            p84Var.i();
        }
    }
}
