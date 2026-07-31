package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class i84 implements Comparable<i84> {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6566f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f6567g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f6568h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f6569i;

    /* renamed from: j, reason: collision with root package name */
    private final int f6570j;

    /* renamed from: k, reason: collision with root package name */
    private final int f6571k;

    /* renamed from: l, reason: collision with root package name */
    private final int f6572l;

    /* renamed from: m, reason: collision with root package name */
    private final int f6573m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f6574n;

    public i84(c0 c0Var, d84 d84Var, int i7, String str) {
        int i8;
        boolean z6 = false;
        this.f6567g = k84.m(i7, false);
        int i9 = c0Var.f3652d;
        int i10 = d84Var.B;
        this.f6568h = 1 == (i9 & 1);
        this.f6569i = (i9 & 2) != 0;
        e73<String> x6 = d84Var.f9293r.isEmpty() ? e73.x("") : d84Var.f9293r;
        int i11 = 0;
        while (true) {
            if (i11 >= x6.size()) {
                i11 = Integer.MAX_VALUE;
                i8 = 0;
                break;
            } else {
                i8 = k84.g(c0Var, x6.get(i11), false);
                if (i8 > 0) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.f6570j = i11;
        this.f6571k = i8;
        int bitCount = Integer.bitCount(0);
        this.f6572l = bitCount;
        this.f6574n = false;
        int g7 = k84.g(c0Var, str, k84.k(str) == null);
        this.f6573m = g7;
        if (i8 > 0 || ((d84Var.f9293r.isEmpty() && bitCount > 0) || this.f6568h || (this.f6569i && g7 > 0))) {
            z6 = true;
        }
        this.f6566f = z6;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(i84 i84Var) {
        t63 b7 = t63.i().d(this.f6567g, i84Var.f6567g).c(Integer.valueOf(this.f6570j), Integer.valueOf(i84Var.f6570j), s83.c().a()).b(this.f6571k, i84Var.f6571k).b(this.f6572l, i84Var.f6572l).d(this.f6568h, i84Var.f6568h).c(Boolean.valueOf(this.f6569i), Boolean.valueOf(i84Var.f6569i), this.f6571k == 0 ? s83.c() : s83.c().a()).b(this.f6573m, i84Var.f6573m);
        if (this.f6572l == 0) {
            b7 = b7.e(false, false);
        }
        return b7.a();
    }
}
