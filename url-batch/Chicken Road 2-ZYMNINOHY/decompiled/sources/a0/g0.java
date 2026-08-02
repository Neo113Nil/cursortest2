package a0;

import android.os.SystemClock;
import java.util.List;
import q0.C1353B;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: u, reason: collision with root package name */
    public static final C1353B f4138u = new C1353B(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final T.T f4139a;

    /* renamed from: b, reason: collision with root package name */
    public final C1353B f4140b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4141c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4142d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4143e;

    /* renamed from: f, reason: collision with root package name */
    public final C0146l f4144f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4145g;

    /* renamed from: h, reason: collision with root package name */
    public final q0.j0 f4146h;

    /* renamed from: i, reason: collision with root package name */
    public final t0.x f4147i;

    /* renamed from: j, reason: collision with root package name */
    public final List f4148j;

    /* renamed from: k, reason: collision with root package name */
    public final C1353B f4149k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f4150l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4151m;
    public final int n;
    public final T.I o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f4152p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f4153q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f4154r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f4155s;

    /* renamed from: t, reason: collision with root package name */
    public volatile long f4156t;

    public g0(T.T t4, C1353B c1353b, long j4, long j5, int i4, C0146l c0146l, boolean z, q0.j0 j0Var, t0.x xVar, List list, C1353B c1353b2, boolean z4, int i5, int i6, T.I i7, long j6, long j7, long j8, long j9, boolean z5) {
        this.f4139a = t4;
        this.f4140b = c1353b;
        this.f4141c = j4;
        this.f4142d = j5;
        this.f4143e = i4;
        this.f4144f = c0146l;
        this.f4145g = z;
        this.f4146h = j0Var;
        this.f4147i = xVar;
        this.f4148j = list;
        this.f4149k = c1353b2;
        this.f4150l = z4;
        this.f4151m = i5;
        this.n = i6;
        this.o = i7;
        this.f4153q = j6;
        this.f4154r = j7;
        this.f4155s = j8;
        this.f4156t = j9;
        this.f4152p = z5;
    }

    public static g0 k(t0.x xVar) {
        T.P p2 = T.T.f2704a;
        q0.j0 j0Var = q0.j0.f15033d;
        v2.a0 a0Var = v2.a0.f15605e;
        T.I i4 = T.I.f2663d;
        C1353B c1353b = f4138u;
        return new g0(p2, c1353b, -9223372036854775807L, 0L, 1, null, false, j0Var, xVar, a0Var, c1353b, false, 1, 0, i4, 0L, 0L, 0L, 0L, false);
    }

    public final g0 a() {
        return new g0(this.f4139a, this.f4140b, this.f4141c, this.f4142d, this.f4143e, this.f4144f, this.f4145g, this.f4146h, this.f4147i, this.f4148j, this.f4149k, this.f4150l, this.f4151m, this.n, this.o, this.f4153q, this.f4154r, l(), SystemClock.elapsedRealtime(), this.f4152p);
    }

    public final g0 b(boolean z) {
        return new g0(this.f4139a, this.f4140b, this.f4141c, this.f4142d, this.f4143e, this.f4144f, z, this.f4146h, this.f4147i, this.f4148j, this.f4149k, this.f4150l, this.f4151m, this.n, this.o, this.f4153q, this.f4154r, this.f4155s, this.f4156t, this.f4152p);
    }

    public final g0 c(C1353B c1353b) {
        return new g0(this.f4139a, this.f4140b, this.f4141c, this.f4142d, this.f4143e, this.f4144f, this.f4145g, this.f4146h, this.f4147i, this.f4148j, c1353b, this.f4150l, this.f4151m, this.n, this.o, this.f4153q, this.f4154r, this.f4155s, this.f4156t, this.f4152p);
    }

    public final g0 d(C1353B c1353b, long j4, long j5, long j6, long j7, q0.j0 j0Var, t0.x xVar, List list) {
        return new g0(this.f4139a, c1353b, j5, j6, this.f4143e, this.f4144f, this.f4145g, j0Var, xVar, list, this.f4149k, this.f4150l, this.f4151m, this.n, this.o, this.f4153q, j7, j4, SystemClock.elapsedRealtime(), this.f4152p);
    }

    public final g0 e(int i4, boolean z, int i5) {
        return new g0(this.f4139a, this.f4140b, this.f4141c, this.f4142d, this.f4143e, this.f4144f, this.f4145g, this.f4146h, this.f4147i, this.f4148j, this.f4149k, z, i4, i5, this.o, this.f4153q, this.f4154r, this.f4155s, this.f4156t, this.f4152p);
    }

    public final g0 f(C0146l c0146l) {
        return new g0(this.f4139a, this.f4140b, this.f4141c, this.f4142d, this.f4143e, c0146l, this.f4145g, this.f4146h, this.f4147i, this.f4148j, this.f4149k, this.f4150l, this.f4151m, this.n, this.o, this.f4153q, this.f4154r, this.f4155s, this.f4156t, this.f4152p);
    }

    public final g0 g(T.I i4) {
        return new g0(this.f4139a, this.f4140b, this.f4141c, this.f4142d, this.f4143e, this.f4144f, this.f4145g, this.f4146h, this.f4147i, this.f4148j, this.f4149k, this.f4150l, this.f4151m, this.n, i4, this.f4153q, this.f4154r, this.f4155s, this.f4156t, this.f4152p);
    }

    public final g0 h(int i4) {
        return new g0(this.f4139a, this.f4140b, this.f4141c, this.f4142d, i4, this.f4144f, this.f4145g, this.f4146h, this.f4147i, this.f4148j, this.f4149k, this.f4150l, this.f4151m, this.n, this.o, this.f4153q, this.f4154r, this.f4155s, this.f4156t, this.f4152p);
    }

    public final g0 i(boolean z) {
        return new g0(this.f4139a, this.f4140b, this.f4141c, this.f4142d, this.f4143e, this.f4144f, this.f4145g, this.f4146h, this.f4147i, this.f4148j, this.f4149k, this.f4150l, this.f4151m, this.n, this.o, this.f4153q, this.f4154r, this.f4155s, this.f4156t, z);
    }

    public final g0 j(T.T t4) {
        return new g0(t4, this.f4140b, this.f4141c, this.f4142d, this.f4143e, this.f4144f, this.f4145g, this.f4146h, this.f4147i, this.f4148j, this.f4149k, this.f4150l, this.f4151m, this.n, this.o, this.f4153q, this.f4154r, this.f4155s, this.f4156t, this.f4152p);
    }

    public final long l() {
        long j4;
        long j5;
        if (!m()) {
            return this.f4155s;
        }
        do {
            j4 = this.f4156t;
            j5 = this.f4155s;
        } while (j4 != this.f4156t);
        return W.J.M(W.J.Z(j5) + ((long) ((SystemClock.elapsedRealtime() - j4) * this.o.f2664a)));
    }

    public final boolean m() {
        return this.f4143e == 3 && this.f4150l && this.n == 0;
    }
}
