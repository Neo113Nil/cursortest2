package d0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0.n2 f2378a = new g0.n2(r0.f2344h);

    /* renamed from: b, reason: collision with root package name */
    public static final g0.n2 f2379b = new g0.n2(r0.f2345i);

    public static final long a(q0 q0Var, long j8) {
        long j9 = q0Var.f2300a;
        long j10 = q0Var.f2316q;
        if (z0.u.c(j8, j9)) {
            return q0Var.f2301b;
        }
        if (z0.u.c(j8, q0Var.f2305f)) {
            return q0Var.f2306g;
        }
        if (z0.u.c(j8, q0Var.f2309j)) {
            return q0Var.f2310k;
        }
        if (z0.u.c(j8, q0Var.f2313n)) {
            return q0Var.f2314o;
        }
        if (z0.u.c(j8, q0Var.f2322w)) {
            return q0Var.f2323x;
        }
        if (z0.u.c(j8, q0Var.f2302c)) {
            return q0Var.f2303d;
        }
        if (z0.u.c(j8, q0Var.f2307h)) {
            return q0Var.f2308i;
        }
        if (z0.u.c(j8, q0Var.f2311l)) {
            return q0Var.f2312m;
        }
        if (z0.u.c(j8, q0Var.f2324y)) {
            return q0Var.f2325z;
        }
        if (z0.u.c(j8, q0Var.f2320u)) {
            return q0Var.f2321v;
        }
        if (z0.u.c(j8, q0Var.f2315p)) {
            return j10;
        }
        if (z0.u.c(j8, q0Var.f2317r)) {
            return q0Var.f2318s;
        }
        if (z0.u.c(j8, q0Var.D)) {
            return j10;
        }
        if (z0.u.c(j8, q0Var.F)) {
            return j10;
        }
        if (z0.u.c(j8, q0Var.G)) {
            return j10;
        }
        if (z0.u.c(j8, q0Var.H)) {
            return j10;
        }
        if (z0.u.c(j8, q0Var.I)) {
            return j10;
        }
        if (z0.u.c(j8, q0Var.J)) {
            return j10;
        }
        int i7 = z0.u.f10058h;
        return z0.u.f10057g;
    }

    public static final long b(long j8, g0.p pVar) {
        pVar.Q(-1680936624);
        long a3 = a((q0) pVar.k(f2378a), j8);
        if (a3 == 16) {
            a3 = ((z0.u) pVar.k(y0.f2529a)).f10059a;
        }
        pVar.p(false);
        return a3;
    }

    public static final long c(q0 q0Var, int i7) {
        switch (l.h.d(i7)) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return q0Var.f2313n;
            case 1:
                return q0Var.f2322w;
            case 2:
                return q0Var.f2324y;
            case 3:
                return q0Var.f2321v;
            case 4:
                return q0Var.f2304e;
            case 5:
                return q0Var.f2320u;
            case 6:
                return q0Var.f2314o;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return q0Var.f2323x;
            case 8:
                return q0Var.f2325z;
            case q.c.f7259c /* 9 */:
                return q0Var.f2301b;
            case q.c.f7261e /* 10 */:
                return q0Var.f2303d;
            case 11:
            case 12:
            case q.c.f7263g /* 15 */:
            case 16:
            case 21:
            case 22:
            case 27:
            case 28:
            case 32:
            case 33:
            default:
                return z0.u.f10057g;
            case 13:
                return q0Var.f2306g;
            case 14:
                return q0Var.f2308i;
            case 17:
                return q0Var.f2316q;
            case 18:
                return q0Var.f2318s;
            case 19:
                return q0Var.f2310k;
            case 20:
                return q0Var.f2312m;
            case 23:
                return q0Var.A;
            case 24:
                return q0Var.B;
            case 25:
                return q0Var.f2300a;
            case 26:
                return q0Var.f2302c;
            case 29:
                return q0Var.C;
            case 30:
                return q0Var.f2305f;
            case 31:
                return q0Var.f2307h;
            case 34:
                return q0Var.f2315p;
            case 35:
                return q0Var.D;
            case 36:
                return q0Var.F;
            case 37:
                return q0Var.G;
            case 38:
                return q0Var.H;
            case 39:
                return q0Var.I;
            case 40:
                return q0Var.J;
            case 41:
                return q0Var.E;
            case 42:
                return q0Var.f2319t;
            case 43:
                return q0Var.f2317r;
            case 44:
                return q0Var.f2309j;
            case 45:
                return q0Var.f2311l;
        }
    }

    public static final long d(int i7, g0.p pVar) {
        return c((q0) pVar.k(f2378a), i7);
    }

    public static q0 e(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, int i7) {
        long j19 = (i7 & 1) != 0 ? f0.b.f2918t : j8;
        return new q0(j19, (i7 & 2) != 0 ? f0.b.f2908j : j9, f0.b.f2919u, f0.b.f2909k, f0.b.f2903e, (i7 & 32) != 0 ? f0.b.f2921w : j10, (i7 & 64) != 0 ? f0.b.f2910l : j11, f0.b.f2922x, f0.b.f2911m, (i7 & 512) != 0 ? f0.b.H : j12, f0.b.f2914p, f0.b.I, f0.b.f2915q, (i7 & 8192) != 0 ? f0.b.f2899a : j13, (i7 & 16384) != 0 ? f0.b.f2905g : j14, (32768 & i7) != 0 ? f0.b.f2923y : j15, (65536 & i7) != 0 ? f0.b.f2912n : j16, (131072 & i7) != 0 ? f0.b.G : j17, (i7 & 262144) != 0 ? f0.b.f2913o : j18, j19, f0.b.f2904f, f0.b.f2902d, f0.b.f2900b, f0.b.f2906h, f0.b.f2901c, f0.b.f2907i, f0.b.f2916r, f0.b.f2917s, f0.b.f2920v, f0.b.f2924z, f0.b.F, f0.b.A, f0.b.B, f0.b.C, f0.b.D, f0.b.E);
    }
}
