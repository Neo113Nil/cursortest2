package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class z74 implements Comparable<z74> {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f15007f;

    /* renamed from: g, reason: collision with root package name */
    private final String f15008g;

    /* renamed from: h, reason: collision with root package name */
    private final d84 f15009h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f15010i;

    /* renamed from: j, reason: collision with root package name */
    private final int f15011j;

    /* renamed from: k, reason: collision with root package name */
    private final int f15012k;

    /* renamed from: l, reason: collision with root package name */
    private final int f15013l;

    /* renamed from: m, reason: collision with root package name */
    private final int f15014m;

    /* renamed from: n, reason: collision with root package name */
    private final int f15015n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f15016o;

    /* renamed from: p, reason: collision with root package name */
    private final int f15017p;

    /* renamed from: q, reason: collision with root package name */
    private final int f15018q;

    /* renamed from: r, reason: collision with root package name */
    private final int f15019r;

    /* renamed from: s, reason: collision with root package name */
    private final int f15020s;

    public z74(c0 c0Var, d84 d84Var, int i7) {
        int i8;
        int i9;
        int i10;
        this.f15009h = d84Var;
        this.f15008g = k84.k(c0Var.f3651c);
        int i11 = 0;
        this.f15010i = k84.m(i7, false);
        int i12 = 0;
        while (true) {
            i8 = Integer.MAX_VALUE;
            if (i12 >= d84Var.f9288m.size()) {
                i12 = Integer.MAX_VALUE;
                i9 = 0;
                break;
            } else {
                i9 = k84.g(c0Var, d84Var.f9288m.get(i12), false);
                if (i9 > 0) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        this.f15012k = i12;
        this.f15011j = i9;
        this.f15013l = Integer.bitCount(0);
        this.f15016o = 1 == (c0Var.f3652d & 1);
        this.f15017p = c0Var.f3673y;
        this.f15018q = c0Var.f3674z;
        this.f15019r = c0Var.f3656h;
        this.f15007f = true;
        String[] C = n13.C();
        int i13 = 0;
        while (true) {
            if (i13 >= C.length) {
                i13 = Integer.MAX_VALUE;
                i10 = 0;
                break;
            } else {
                i10 = k84.g(c0Var, C[i13], false);
                if (i10 > 0) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        this.f15014m = i13;
        this.f15015n = i10;
        while (true) {
            if (i11 < d84Var.f9292q.size()) {
                String str = c0Var.f3660l;
                if (str != null && str.equals(d84Var.f9292q.get(i11))) {
                    i8 = i11;
                    break;
                }
                i11++;
            } else {
                break;
            }
        }
        this.f15020s = i8;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(z74 z74Var) {
        s83 s83Var;
        s83 a7;
        s83 s83Var2;
        if (this.f15010i) {
            a7 = k84.f7420f;
        } else {
            s83Var = k84.f7420f;
            a7 = s83Var.a();
        }
        t63 c7 = t63.i().d(this.f15010i, z74Var.f15010i).c(Integer.valueOf(this.f15012k), Integer.valueOf(z74Var.f15012k), s83.c().a()).b(this.f15011j, z74Var.f15011j).b(this.f15013l, z74Var.f15013l).d(true, true).c(Integer.valueOf(this.f15020s), Integer.valueOf(z74Var.f15020s), s83.c().a());
        Integer valueOf = Integer.valueOf(this.f15019r);
        Integer valueOf2 = Integer.valueOf(z74Var.f15019r);
        boolean z6 = this.f15009h.f9296u;
        s83Var2 = k84.f7421g;
        t63 c8 = c7.c(valueOf, valueOf2, s83Var2).d(this.f15016o, z74Var.f15016o).c(Integer.valueOf(this.f15014m), Integer.valueOf(z74Var.f15014m), s83.c().a()).b(this.f15015n, z74Var.f15015n).c(Integer.valueOf(this.f15017p), Integer.valueOf(z74Var.f15017p), a7).c(Integer.valueOf(this.f15018q), Integer.valueOf(z74Var.f15018q), a7);
        Integer valueOf3 = Integer.valueOf(this.f15019r);
        Integer valueOf4 = Integer.valueOf(z74Var.f15019r);
        if (!n13.p(this.f15008g, z74Var.f15008g)) {
            a7 = k84.f7421g;
        }
        return c8.c(valueOf3, valueOf4, a7).a();
    }
}
