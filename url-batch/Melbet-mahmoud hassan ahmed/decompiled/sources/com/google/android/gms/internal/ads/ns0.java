package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class ns0 {
    public static final my3<ns0> A;

    /* renamed from: y, reason: collision with root package name */
    public static final ns0 f9274y;

    /* renamed from: z, reason: collision with root package name */
    @Deprecated
    public static final ns0 f9275z;

    /* renamed from: a, reason: collision with root package name */
    public final int f9276a = Integer.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public final int f9277b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public final int f9278c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final int f9279d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public final int f9280e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final int f9281f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final int f9282g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final int f9283h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final int f9284i;

    /* renamed from: j, reason: collision with root package name */
    public final int f9285j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f9286k;

    /* renamed from: l, reason: collision with root package name */
    public final e73<String> f9287l;

    /* renamed from: m, reason: collision with root package name */
    public final e73<String> f9288m;

    /* renamed from: n, reason: collision with root package name */
    public final int f9289n;

    /* renamed from: o, reason: collision with root package name */
    public final int f9290o;

    /* renamed from: p, reason: collision with root package name */
    public final int f9291p;

    /* renamed from: q, reason: collision with root package name */
    public final e73<String> f9292q;

    /* renamed from: r, reason: collision with root package name */
    public final e73<String> f9293r;

    /* renamed from: s, reason: collision with root package name */
    public final int f9294s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f9295t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f9296u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f9297v;

    /* renamed from: w, reason: collision with root package name */
    public final i73<gk0, mr0> f9298w;

    /* renamed from: x, reason: collision with root package name */
    public final p73<Integer> f9299x;

    static {
        ns0 ns0Var = new ns0(new kp0());
        f9274y = ns0Var;
        f9275z = ns0Var;
        A = new my3() { // from class: com.google.android.gms.internal.ads.jo0
        };
    }

    protected ns0(kp0 kp0Var) {
        int i7;
        int i8;
        boolean z6;
        e73<String> e73Var;
        e73<String> e73Var2;
        e73<String> e73Var3;
        e73<String> e73Var4;
        int i9;
        i73<gk0, mr0> i73Var;
        p73<Integer> p73Var;
        i7 = kp0Var.f7569a;
        this.f9284i = i7;
        i8 = kp0Var.f7570b;
        this.f9285j = i8;
        z6 = kp0Var.f7571c;
        this.f9286k = z6;
        e73Var = kp0Var.f7572d;
        this.f9287l = e73Var;
        e73Var2 = kp0Var.f7573e;
        this.f9288m = e73Var2;
        this.f9289n = 0;
        this.f9290o = Integer.MAX_VALUE;
        this.f9291p = Integer.MAX_VALUE;
        e73Var3 = kp0Var.f7574f;
        this.f9292q = e73Var3;
        e73Var4 = kp0Var.f7575g;
        this.f9293r = e73Var4;
        i9 = kp0Var.f7576h;
        this.f9294s = i9;
        this.f9295t = false;
        this.f9296u = false;
        this.f9297v = false;
        i73Var = kp0Var.f7577i;
        this.f9298w = i73Var;
        p73Var = kp0Var.f7578j;
        this.f9299x = p73Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ns0 ns0Var = (ns0) obj;
            if (this.f9286k == ns0Var.f9286k && this.f9284i == ns0Var.f9284i && this.f9285j == ns0Var.f9285j && this.f9287l.equals(ns0Var.f9287l) && this.f9288m.equals(ns0Var.f9288m) && this.f9292q.equals(ns0Var.f9292q) && this.f9293r.equals(ns0Var.f9293r) && this.f9294s == ns0Var.f9294s && this.f9298w.equals(ns0Var.f9298w) && this.f9299x.equals(ns0Var.f9299x)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f9286k ? 1 : 0) - 1048002209) * 31) + this.f9284i) * 31) + this.f9285j) * 31) + this.f9287l.hashCode()) * 31) + this.f9288m.hashCode()) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31) + this.f9292q.hashCode()) * 31) + this.f9293r.hashCode()) * 31) + this.f9294s) * 923521) + this.f9298w.hashCode()) * 31) + this.f9299x.hashCode();
    }
}
