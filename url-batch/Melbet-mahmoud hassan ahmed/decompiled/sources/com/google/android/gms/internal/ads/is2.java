package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class is2 {

    /* renamed from: a, reason: collision with root package name */
    private kv f6761a;

    /* renamed from: b, reason: collision with root package name */
    private pv f6762b;

    /* renamed from: c, reason: collision with root package name */
    private String f6763c;

    /* renamed from: d, reason: collision with root package name */
    private s00 f6764d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6765e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<String> f6766f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<String> f6767g;

    /* renamed from: h, reason: collision with root package name */
    private b40 f6768h;

    /* renamed from: i, reason: collision with root package name */
    private vv f6769i;

    /* renamed from: j, reason: collision with root package name */
    private u2.a f6770j;

    /* renamed from: k, reason: collision with root package name */
    private u2.g f6771k;

    /* renamed from: l, reason: collision with root package name */
    private ux f6772l;

    /* renamed from: n, reason: collision with root package name */
    private r90 f6774n;

    /* renamed from: q, reason: collision with root package name */
    private lc2 f6777q;

    /* renamed from: r, reason: collision with root package name */
    private yx f6778r;

    /* renamed from: m, reason: collision with root package name */
    private int f6773m = 1;

    /* renamed from: o, reason: collision with root package name */
    private final xr2 f6775o = new xr2();

    /* renamed from: p, reason: collision with root package name */
    private boolean f6776p = false;

    public final xr2 D() {
        return this.f6775o;
    }

    public final is2 E(ks2 ks2Var) {
        this.f6775o.a(ks2Var.f7629o.f15240a);
        this.f6761a = ks2Var.f7618d;
        this.f6762b = ks2Var.f7619e;
        this.f6778r = ks2Var.f7631q;
        this.f6763c = ks2Var.f7620f;
        this.f6764d = ks2Var.f7615a;
        this.f6766f = ks2Var.f7621g;
        this.f6767g = ks2Var.f7622h;
        this.f6768h = ks2Var.f7623i;
        this.f6769i = ks2Var.f7624j;
        F(ks2Var.f7626l);
        c(ks2Var.f7627m);
        this.f6776p = ks2Var.f7630p;
        this.f6777q = ks2Var.f7617c;
        return this;
    }

    public final is2 F(u2.a aVar) {
        this.f6770j = aVar;
        if (aVar != null) {
            this.f6765e = aVar.c();
        }
        return this;
    }

    public final is2 G(pv pvVar) {
        this.f6762b = pvVar;
        return this;
    }

    public final is2 H(String str) {
        this.f6763c = str;
        return this;
    }

    public final is2 I(vv vvVar) {
        this.f6769i = vvVar;
        return this;
    }

    public final is2 J(lc2 lc2Var) {
        this.f6777q = lc2Var;
        return this;
    }

    public final is2 K(r90 r90Var) {
        this.f6774n = r90Var;
        this.f6764d = new s00(false, true, false);
        return this;
    }

    public final is2 L(boolean z6) {
        this.f6776p = z6;
        return this;
    }

    public final is2 M(boolean z6) {
        this.f6765e = z6;
        return this;
    }

    public final is2 N(int i7) {
        this.f6773m = i7;
        return this;
    }

    public final is2 O(b40 b40Var) {
        this.f6768h = b40Var;
        return this;
    }

    public final is2 a(ArrayList<String> arrayList) {
        this.f6766f = arrayList;
        return this;
    }

    public final is2 b(ArrayList<String> arrayList) {
        this.f6767g = arrayList;
        return this;
    }

    public final is2 c(u2.g gVar) {
        this.f6771k = gVar;
        if (gVar != null) {
            this.f6765e = gVar.h();
            this.f6772l = gVar.c();
        }
        return this;
    }

    public final is2 d(kv kvVar) {
        this.f6761a = kvVar;
        return this;
    }

    public final is2 e(s00 s00Var) {
        this.f6764d = s00Var;
        return this;
    }

    public final ks2 f() {
        r3.o.j(this.f6763c, "ad unit must not be null");
        r3.o.j(this.f6762b, "ad size must not be null");
        r3.o.j(this.f6761a, "ad request must not be null");
        return new ks2(this, null);
    }

    public final String h() {
        return this.f6763c;
    }

    public final boolean m() {
        return this.f6776p;
    }

    public final is2 o(yx yxVar) {
        this.f6778r = yxVar;
        return this;
    }

    public final kv t() {
        return this.f6761a;
    }

    public final pv v() {
        return this.f6762b;
    }
}
