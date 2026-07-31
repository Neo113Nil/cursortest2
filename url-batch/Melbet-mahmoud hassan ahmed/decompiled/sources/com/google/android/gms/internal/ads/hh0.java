package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes.dex */
public final class hh0 {

    /* renamed from: o, reason: collision with root package name */
    public static final Object f6244o = new Object();

    /* renamed from: p, reason: collision with root package name */
    private static final Object f6245p = new Object();

    /* renamed from: q, reason: collision with root package name */
    private static final zo f6246q;

    /* renamed from: r, reason: collision with root package name */
    public static final my3<hh0> f6247r;

    /* renamed from: a, reason: collision with root package name */
    public Object f6248a = f6244o;

    /* renamed from: b, reason: collision with root package name */
    public zo f6249b = f6246q;

    /* renamed from: c, reason: collision with root package name */
    public long f6250c;

    /* renamed from: d, reason: collision with root package name */
    public long f6251d;

    /* renamed from: e, reason: collision with root package name */
    public long f6252e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6253f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6254g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public boolean f6255h;

    /* renamed from: i, reason: collision with root package name */
    public th f6256i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6257j;

    /* renamed from: k, reason: collision with root package name */
    public long f6258k;

    /* renamed from: l, reason: collision with root package name */
    public long f6259l;

    /* renamed from: m, reason: collision with root package name */
    public int f6260m;

    /* renamed from: n, reason: collision with root package name */
    public int f6261n;

    static {
        g4 g4Var = new g4();
        g4Var.a("androidx.media3.common.Timeline");
        g4Var.b(Uri.EMPTY);
        f6246q = g4Var.c();
        f6247r = new my3() { // from class: com.google.android.gms.internal.ads.jg0
        };
    }

    public final hh0 a(Object obj, zo zoVar, Object obj2, long j7, long j8, long j9, boolean z6, boolean z7, th thVar, long j10, long j11, int i7, int i8, long j12) {
        this.f6248a = obj;
        this.f6249b = zoVar != null ? zoVar : f6246q;
        this.f6250c = -9223372036854775807L;
        this.f6251d = -9223372036854775807L;
        this.f6252e = -9223372036854775807L;
        this.f6253f = z6;
        this.f6254g = z7;
        this.f6255h = thVar != null;
        this.f6256i = thVar;
        this.f6258k = 0L;
        this.f6259l = j11;
        this.f6260m = 0;
        this.f6261n = 0;
        this.f6257j = false;
        return this;
    }

    public final boolean b() {
        wu1.f(this.f6255h == (this.f6256i != null));
        return this.f6256i != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hh0.class.equals(obj.getClass())) {
            hh0 hh0Var = (hh0) obj;
            if (n13.p(this.f6248a, hh0Var.f6248a) && n13.p(this.f6249b, hh0Var.f6249b) && n13.p(null, null) && n13.p(this.f6256i, hh0Var.f6256i) && this.f6250c == hh0Var.f6250c && this.f6251d == hh0Var.f6251d && this.f6252e == hh0Var.f6252e && this.f6253f == hh0Var.f6253f && this.f6254g == hh0Var.f6254g && this.f6257j == hh0Var.f6257j && this.f6259l == hh0Var.f6259l && this.f6260m == hh0Var.f6260m && this.f6261n == hh0Var.f6261n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f6248a.hashCode() + 217) * 31) + this.f6249b.hashCode()) * 961;
        th thVar = this.f6256i;
        int hashCode2 = thVar == null ? 0 : thVar.hashCode();
        long j7 = this.f6250c;
        long j8 = this.f6251d;
        long j9 = this.f6252e;
        boolean z6 = this.f6253f;
        boolean z7 = this.f6254g;
        boolean z8 = this.f6257j;
        long j10 = this.f6259l;
        return (((((((((((((((((((hashCode + hashCode2) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) ((j8 >>> 32) ^ j8))) * 31) + ((int) ((j9 >>> 32) ^ j9))) * 31) + (z6 ? 1 : 0)) * 31) + (z7 ? 1 : 0)) * 31) + (z8 ? 1 : 0)) * 961) + ((int) ((j10 >>> 32) ^ j10))) * 31) + this.f6260m) * 31) + this.f6261n) * 31;
    }
}
