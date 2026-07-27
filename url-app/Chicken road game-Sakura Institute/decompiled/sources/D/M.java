package D;

import G.C0216p;
import Z.C0323u;
import com.appsflyer.attribution.RequestError;
import l.AbstractC0784j;
import q.AbstractC1024c;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final G.Y0 f1481a = new G.Y0(L.f1462e);

    /* renamed from: b, reason: collision with root package name */
    public static final G.Y0 f1482b = new G.Y0(L.f1463i);

    public static final long a(K k4, long j4) {
        if (C0323u.c(j4, k4.f1374a)) {
            return k4.f1375b;
        }
        if (C0323u.c(j4, k4.f1379f)) {
            return k4.f1380g;
        }
        if (C0323u.c(j4, k4.f1383j)) {
            return k4.f1384k;
        }
        if (C0323u.c(j4, k4.f1387n)) {
            return k4.f1388o;
        }
        if (C0323u.c(j4, k4.f1396w)) {
            return k4.f1397x;
        }
        if (C0323u.c(j4, k4.f1376c)) {
            return k4.f1377d;
        }
        if (C0323u.c(j4, k4.f1381h)) {
            return k4.f1382i;
        }
        if (C0323u.c(j4, k4.f1385l)) {
            return k4.f1386m;
        }
        if (C0323u.c(j4, k4.f1398y)) {
            return k4.f1399z;
        }
        if (C0323u.c(j4, k4.f1394u)) {
            return k4.f1395v;
        }
        boolean c4 = C0323u.c(j4, k4.f1389p);
        long j5 = k4.f1390q;
        if (!c4) {
            if (C0323u.c(j4, k4.f1391r)) {
                return k4.f1392s;
            }
            if (!C0323u.c(j4, k4.f1358D) && !C0323u.c(j4, k4.f1360F) && !C0323u.c(j4, k4.f1361G) && !C0323u.c(j4, k4.f1362H) && !C0323u.c(j4, k4.f1363I) && !C0323u.c(j4, k4.f1364J)) {
                int i2 = C0323u.f4548h;
                return C0323u.f4547g;
            }
        }
        return j5;
    }

    public static final long b(long j4, C0216p c0216p) {
        c0216p.S(-1680936624);
        long a4 = a((K) c0216p.k(f1481a), j4);
        if (a4 == 16) {
            a4 = ((C0323u) c0216p.k(S.f1616a)).f4549a;
        }
        c0216p.q(false);
        return a4;
    }

    public static final long c(K k4, int i2) {
        switch (AbstractC0784j.d(i2)) {
            case 0:
                return k4.f1387n;
            case 1:
                return k4.f1396w;
            case 2:
                return k4.f1398y;
            case 3:
                return k4.f1395v;
            case 4:
                return k4.f1378e;
            case 5:
                return k4.f1394u;
            case 6:
                return k4.f1388o;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return k4.f1397x;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                return k4.f1399z;
            case AbstractC1024c.f9242c /* 9 */:
                return k4.f1375b;
            case 10:
                return k4.f1377d;
            case RequestError.STOP_TRACKING /* 11 */:
            case 12:
            case AbstractC1024c.f9246g /* 15 */:
            case 16:
            case 21:
            case 22:
            case 27:
            case 28:
            case 32:
            case 33:
            default:
                return C0323u.f4547g;
            case 13:
                return k4.f1380g;
            case 14:
                return k4.f1382i;
            case 17:
                return k4.f1390q;
            case 18:
                return k4.f1392s;
            case 19:
                return k4.f1384k;
            case 20:
                return k4.f1386m;
            case 23:
                return k4.f1356A;
            case 24:
                return k4.B;
            case 25:
                return k4.f1374a;
            case 26:
                return k4.f1376c;
            case 29:
                return k4.f1357C;
            case 30:
                return k4.f1379f;
            case 31:
                return k4.f1381h;
            case 34:
                return k4.f1389p;
            case 35:
                return k4.f1358D;
            case 36:
                return k4.f1360F;
            case 37:
                return k4.f1361G;
            case 38:
                return k4.f1362H;
            case 39:
                return k4.f1363I;
            case RequestError.NETWORK_FAILURE /* 40 */:
                return k4.f1364J;
            case RequestError.NO_DEV_KEY /* 41 */:
                return k4.f1359E;
            case 42:
                return k4.f1393t;
            case 43:
                return k4.f1391r;
            case 44:
                return k4.f1383j;
            case 45:
                return k4.f1385l;
        }
    }

    public static final long d(int i2, C0216p c0216p) {
        return c((K) c0216p.k(f1481a), i2);
    }

    public static K e(long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, int i2) {
        long j22 = (i2 & 1) != 0 ? F.b.f2369t : j4;
        return new K(j22, (i2 & 2) != 0 ? F.b.f2359j : j5, (i2 & 4) != 0 ? F.b.f2370u : j6, (i2 & 8) != 0 ? F.b.f2360k : j7, F.b.f2354e, (i2 & 32) != 0 ? F.b.f2372w : j8, (i2 & 64) != 0 ? F.b.f2361l : j9, (i2 & 128) != 0 ? F.b.f2373x : j10, (i2 & 256) != 0 ? F.b.f2362m : j11, (i2 & 512) != 0 ? F.b.f2348H : j12, (i2 & 1024) != 0 ? F.b.f2365p : j13, F.b.f2349I, F.b.f2366q, (i2 & 8192) != 0 ? F.b.f2350a : j14, (i2 & 16384) != 0 ? F.b.f2356g : j15, (32768 & i2) != 0 ? F.b.f2374y : j16, (65536 & i2) != 0 ? F.b.f2363n : j17, (131072 & i2) != 0 ? F.b.f2347G : j18, (262144 & i2) != 0 ? F.b.f2364o : j19, j22, F.b.f2355f, F.b.f2353d, F.b.f2351b, F.b.f2357h, F.b.f2352c, F.b.f2358i, (67108864 & i2) != 0 ? F.b.f2367r : j20, (i2 & 134217728) != 0 ? F.b.f2368s : j21, F.b.f2371v, F.b.f2375z, F.b.f2346F, F.b.f2342A, F.b.B, F.b.f2343C, F.b.f2344D, F.b.f2345E);
    }
}
