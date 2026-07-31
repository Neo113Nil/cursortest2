package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class nj1 {

    /* renamed from: a, reason: collision with root package name */
    private final pk1 f9123a;

    /* renamed from: b, reason: collision with root package name */
    private final eu0 f9124b;

    public nj1(pk1 pk1Var, eu0 eu0Var) {
        this.f9123a = pk1Var;
        this.f9124b = eu0Var;
    }

    public static final hi1<zh1> h(uk1 uk1Var) {
        return new hi1<>(uk1Var, wo0.f13899f);
    }

    public final View a() {
        eu0 eu0Var = this.f9124b;
        if (eu0Var == null) {
            return null;
        }
        return eu0Var.L();
    }

    public final View b() {
        eu0 eu0Var = this.f9124b;
        if (eu0Var != null) {
            return eu0Var.L();
        }
        return null;
    }

    public final eu0 c() {
        return this.f9124b;
    }

    public final hi1<qf1> d(Executor executor) {
        final eu0 eu0Var = this.f9124b;
        return new hi1<>(new qf1() { // from class: com.google.android.gms.internal.ads.lj1
            @Override // com.google.android.gms.internal.ads.qf1
            public final void zza() {
                eu0 eu0Var2 = eu0.this;
                if (eu0Var2.P() != null) {
                    eu0Var2.P().a();
                }
            }
        }, executor);
    }

    public final pk1 e() {
        return this.f9123a;
    }

    public Set<hi1<va1>> f(u91 u91Var) {
        return Collections.singleton(new hi1(u91Var, wo0.f13899f));
    }

    public Set<hi1<zh1>> g(u91 u91Var) {
        return Collections.singleton(new hi1(u91Var, wo0.f13899f));
    }
}
