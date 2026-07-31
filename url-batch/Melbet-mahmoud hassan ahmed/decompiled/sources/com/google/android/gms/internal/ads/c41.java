package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class c41 extends v61 {

    /* renamed from: i, reason: collision with root package name */
    private final View f3718i;

    /* renamed from: j, reason: collision with root package name */
    private final eu0 f3719j;

    /* renamed from: k, reason: collision with root package name */
    private final sr2 f3720k;

    /* renamed from: l, reason: collision with root package name */
    private final int f3721l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f3722m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f3723n;

    /* renamed from: o, reason: collision with root package name */
    private final t31 f3724o;

    /* renamed from: p, reason: collision with root package name */
    private xp f3725p;

    c41(u61 u61Var, View view, eu0 eu0Var, sr2 sr2Var, int i7, boolean z6, boolean z7, t31 t31Var) {
        super(u61Var);
        this.f3718i = view;
        this.f3719j = eu0Var;
        this.f3720k = sr2Var;
        this.f3721l = i7;
        this.f3722m = z6;
        this.f3723n = z7;
        this.f3724o = t31Var;
    }

    public final int h() {
        return this.f3721l;
    }

    public final View i() {
        return this.f3718i;
    }

    public final sr2 j() {
        return os2.b(this.f13139b.f11396s, this.f3720k);
    }

    public final void k(np npVar) {
        this.f3719j.R(npVar);
    }

    public final boolean l() {
        return this.f3722m;
    }

    public final boolean m() {
        return this.f3723n;
    }

    public final boolean n() {
        return this.f3719j.C0();
    }

    public final boolean o() {
        return this.f3719j.E0() != null && this.f3719j.E0().v();
    }

    public final void p(long j7, int i7) {
        this.f3724o.a(j7, i7);
    }

    public final xp q() {
        return this.f3725p;
    }

    public final void r(xp xpVar) {
        this.f3725p = xpVar;
    }
}
