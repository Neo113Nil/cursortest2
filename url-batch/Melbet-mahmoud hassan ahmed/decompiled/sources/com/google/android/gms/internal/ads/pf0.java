package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class pf0 {

    /* renamed from: h, reason: collision with root package name */
    public static final my3<pf0> f10215h = new my3() { // from class: com.google.android.gms.internal.ads.ne0
    };

    /* renamed from: a, reason: collision with root package name */
    public Object f10216a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10217b;

    /* renamed from: c, reason: collision with root package name */
    public int f10218c;

    /* renamed from: d, reason: collision with root package name */
    public long f10219d;

    /* renamed from: e, reason: collision with root package name */
    public long f10220e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10221f;

    /* renamed from: g, reason: collision with root package name */
    private y51 f10222g = y51.f14553c;

    public final int a(int i7) {
        return this.f10222g.a(i7).f9637b;
    }

    public final int b(long j7) {
        return -1;
    }

    public final int c(long j7) {
        return -1;
    }

    public final int d(int i7) {
        return this.f10222g.a(i7).a(-1);
    }

    public final int e(int i7, int i8) {
        return this.f10222g.a(i7).a(i8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pf0.class.equals(obj.getClass())) {
            pf0 pf0Var = (pf0) obj;
            if (n13.p(this.f10216a, pf0Var.f10216a) && n13.p(this.f10217b, pf0Var.f10217b) && this.f10218c == pf0Var.f10218c && this.f10219d == pf0Var.f10219d && this.f10221f == pf0Var.f10221f && n13.p(this.f10222g, pf0Var.f10222g)) {
                return true;
            }
        }
        return false;
    }

    public final long f(int i7, int i8) {
        of0 a7 = this.f10222g.a(i7);
        if (a7.f9637b != -1) {
            return a7.f9640e[i8];
        }
        return -9223372036854775807L;
    }

    public final long g(int i7) {
        long j7 = this.f10222g.a(i7).f9636a;
        return 0L;
    }

    public final long h() {
        long j7 = this.f10222g.f14556a;
        return 0L;
    }

    public final int hashCode() {
        Object obj = this.f10216a;
        int hashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
        Object obj2 = this.f10217b;
        int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
        int i7 = this.f10218c;
        long j7 = this.f10219d;
        return ((((((((hashCode + hashCode2) * 31) + i7) * 31) + ((int) ((j7 >>> 32) ^ j7))) * 961) + (this.f10221f ? 1 : 0)) * 31) + this.f10222g.hashCode();
    }

    public final long i(int i7) {
        long j7 = this.f10222g.a(i7).f9641f;
        return 0L;
    }

    public final pf0 j(Object obj, Object obj2, int i7, long j7, long j8, y51 y51Var, boolean z6) {
        this.f10216a = obj;
        this.f10217b = obj2;
        this.f10218c = 0;
        this.f10219d = j7;
        this.f10220e = 0L;
        this.f10222g = y51Var;
        this.f10221f = z6;
        return this;
    }

    public final boolean k(int i7) {
        boolean z6 = this.f10222g.a(i7).f9642g;
        return false;
    }
}
