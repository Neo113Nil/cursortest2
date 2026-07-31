package F;

import I.C0167p;
import b0.C0352v;
import m.AbstractC0625j;
import r.AbstractC0856c;

/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public static final I.X0 f1301a = new I.X0(N.f1273f);

    /* renamed from: b, reason: collision with root package name */
    public static final I.X0 f1302b = new I.X0(N.f1274g);

    public static final long a(M m3, long j3) {
        if (C0352v.c(j3, m3.f1238a)) {
            return m3.f1239b;
        }
        if (C0352v.c(j3, m3.f1243f)) {
            return m3.f1244g;
        }
        if (C0352v.c(j3, m3.f1247j)) {
            return m3.f1248k;
        }
        if (C0352v.c(j3, m3.f1251n)) {
            return m3.f1252o;
        }
        if (C0352v.c(j3, m3.f1260w)) {
            return m3.f1261x;
        }
        if (C0352v.c(j3, m3.f1240c)) {
            return m3.f1241d;
        }
        if (C0352v.c(j3, m3.f1245h)) {
            return m3.f1246i;
        }
        if (C0352v.c(j3, m3.f1249l)) {
            return m3.f1250m;
        }
        if (C0352v.c(j3, m3.f1262y)) {
            return m3.f1263z;
        }
        if (C0352v.c(j3, m3.f1258u)) {
            return m3.f1259v;
        }
        boolean c2 = C0352v.c(j3, m3.f1253p);
        long j4 = m3.f1254q;
        if (!c2) {
            if (C0352v.c(j3, m3.f1255r)) {
                return m3.f1256s;
            }
            if (!C0352v.c(j3, m3.D) && !C0352v.c(j3, m3.f1226F) && !C0352v.c(j3, m3.f1227G) && !C0352v.c(j3, m3.f1228H) && !C0352v.c(j3, m3.f1229I) && !C0352v.c(j3, m3.f1230J)) {
                int i3 = C0352v.f5440h;
                return C0352v.f5439g;
            }
        }
        return j4;
    }

    public static final long b(long j3, C0167p c0167p) {
        c0167p.Q(-1680936624);
        long a3 = a((M) c0167p.k(f1301a), j3);
        if (a3 == 16) {
            a3 = ((C0352v) c0167p.k(V.f1382a)).f5441a;
        }
        c0167p.p(false);
        return a3;
    }

    public static final long c(M m3, int i3) {
        switch (AbstractC0625j.b(i3)) {
            case 0:
                return m3.f1251n;
            case 1:
                return m3.f1260w;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                return m3.f1262y;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                return m3.f1259v;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                return m3.f1242e;
            case 5:
                return m3.f1258u;
            case 6:
                return m3.f1252o;
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return m3.f1261x;
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                return m3.f1263z;
            case AbstractC0856c.f8037c /* 9 */:
                return m3.f1239b;
            case AbstractC0856c.f8039e /* 10 */:
                return m3.f1241d;
            case 11:
            case 12:
            case AbstractC0856c.f8041g /* 15 */:
            case 16:
            case 21:
            case 22:
            case 27:
            case 28:
            case 32:
            case 33:
            default:
                return C0352v.f5439g;
            case 13:
                return m3.f1244g;
            case 14:
                return m3.f1246i;
            case 17:
                return m3.f1254q;
            case 18:
                return m3.f1256s;
            case 19:
                return m3.f1248k;
            case 20:
                return m3.f1250m;
            case 23:
                return m3.f1223A;
            case 24:
                return m3.f1224B;
            case 25:
                return m3.f1238a;
            case 26:
                return m3.f1240c;
            case 29:
                return m3.C;
            case 30:
                return m3.f1243f;
            case 31:
                return m3.f1245h;
            case 34:
                return m3.f1253p;
            case 35:
                return m3.D;
            case 36:
                return m3.f1226F;
            case 37:
                return m3.f1227G;
            case 38:
                return m3.f1228H;
            case 39:
                return m3.f1229I;
            case 40:
                return m3.f1230J;
            case 41:
                return m3.f1225E;
            case 42:
                return m3.f1257t;
            case 43:
                return m3.f1255r;
            case 44:
                return m3.f1247j;
            case 45:
                return m3.f1249l;
        }
    }

    public static final long d(int i3, C0167p c0167p) {
        return c((M) c0167p.k(f1301a), i3);
    }

    public static M e(long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, int i3) {
        long j15 = (i3 & 1) != 0 ? H.b.f2375t : j3;
        return new M(j15, (i3 & 2) != 0 ? H.b.f2365j : j4, (i3 & 4) != 0 ? H.b.f2376u : j5, (i3 & 8) != 0 ? H.b.f2366k : j6, H.b.f2360e, (i3 & 32) != 0 ? H.b.f2378w : j7, (i3 & 64) != 0 ? H.b.f2367l : j8, H.b.f2379x, H.b.f2368m, H.b.f2354H, H.b.f2371p, H.b.f2355I, H.b.f2372q, (i3 & 8192) != 0 ? H.b.f2356a : j9, (i3 & 16384) != 0 ? H.b.f2362g : j10, (32768 & i3) != 0 ? H.b.f2380y : j11, (65536 & i3) != 0 ? H.b.f2369n : j12, (131072 & i3) != 0 ? H.b.f2353G : j13, (i3 & 262144) != 0 ? H.b.f2370o : j14, j15, H.b.f2361f, H.b.f2359d, H.b.f2357b, H.b.f2363h, H.b.f2358c, H.b.f2364i, H.b.f2373r, H.b.f2374s, H.b.f2377v, H.b.f2381z, H.b.f2352F, H.b.f2349A, H.b.f2350B, H.b.C, H.b.D, H.b.f2351E);
    }
}
