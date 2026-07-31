package F;

import I.C0113p;
import b0.C0288u;
import f.AbstractC0382a;
import h1.C0438i;
import m.AbstractC0600j;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final I.Y0 f1045a = new I.Y0(K.f1030f);

    /* renamed from: b, reason: collision with root package name */
    public static final I.Y0 f1046b = new I.Y0(K.f1031g);

    public static final long a(J j3, long j4) {
        if (C0288u.c(j4, j3.f992a)) {
            return j3.f993b;
        }
        if (C0288u.c(j4, j3.f997f)) {
            return j3.f998g;
        }
        if (C0288u.c(j4, j3.f1001j)) {
            return j3.f1002k;
        }
        if (C0288u.c(j4, j3.f1005n)) {
            return j3.f1006o;
        }
        if (C0288u.c(j4, j3.f1013w)) {
            return j3.f1014x;
        }
        if (C0288u.c(j4, j3.f994c)) {
            return j3.f995d;
        }
        if (C0288u.c(j4, j3.f999h)) {
            return j3.f1000i;
        }
        if (C0288u.c(j4, j3.f1003l)) {
            return j3.f1004m;
        }
        if (C0288u.c(j4, j3.f1015y)) {
            return j3.f1016z;
        }
        if (C0288u.c(j4, j3.f1011u)) {
            return j3.f1012v;
        }
        boolean c3 = C0288u.c(j4, j3.p);
        long j5 = j3.f1007q;
        if (!c3) {
            if (C0288u.c(j4, j3.f1008r)) {
                return j3.f1009s;
            }
            if (!C0288u.c(j4, j3.D) && !C0288u.c(j4, j3.f980F) && !C0288u.c(j4, j3.f981G) && !C0288u.c(j4, j3.f982H) && !C0288u.c(j4, j3.f983I) && !C0288u.c(j4, j3.f984J)) {
                int i3 = C0288u.f4297g;
                return C0288u.f4296f;
            }
        }
        return j5;
    }

    public static final long b(long j3, C0113p c0113p) {
        c0113p.Q(-1680936624);
        long a3 = a((J) c0113p.k(f1045a), j3);
        if (a3 == 16) {
            a3 = ((C0288u) c0113p.k(P.f1079a)).f4298a;
        }
        c0113p.p(false);
        return a3;
    }

    public static final long c(J j3, int i3) {
        switch (AbstractC0600j.a(i3)) {
            case 0:
                return j3.f1005n;
            case 1:
                return j3.f1013w;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                return j3.f1015y;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                return j3.f1012v;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                return j3.f996e;
            case 5:
                return j3.f1011u;
            case 6:
                return j3.f1006o;
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                return j3.f1014x;
            case 8:
                return j3.f1016z;
            case AbstractC0382a.f4777a /* 9 */:
                return j3.f993b;
            case AbstractC0382a.f4779c /* 10 */:
                return j3.f995d;
            case 11:
            case 12:
            case AbstractC0382a.f4781e /* 15 */:
            case 16:
            case 21:
            case 22:
            case 27:
            case 28:
            case 32:
            case 33:
            default:
                return C0288u.f4296f;
            case 13:
                return j3.f998g;
            case 14:
                return j3.f1000i;
            case 17:
                return j3.f1007q;
            case 18:
                return j3.f1009s;
            case 19:
                return j3.f1002k;
            case 20:
                return j3.f1004m;
            case 23:
                return j3.f978A;
            case 24:
                return j3.B;
            case 25:
                return j3.f992a;
            case 26:
                return j3.f994c;
            case 29:
                return j3.C;
            case 30:
                return j3.f997f;
            case 31:
                return j3.f999h;
            case 34:
                return j3.p;
            case 35:
                return j3.D;
            case 36:
                return j3.f980F;
            case 37:
                return j3.f981G;
            case 38:
                return j3.f982H;
            case 39:
                return j3.f983I;
            case 40:
                return j3.f984J;
            case 41:
                return j3.f979E;
            case 42:
                return j3.f1010t;
            case 43:
                return j3.f1008r;
            case 44:
                return j3.f1001j;
            case 45:
                return j3.f1003l;
        }
    }

    public static final long d(int i3, C0113p c0113p) {
        return c((J) c0113p.k(f1045a), i3);
    }

    public static J e(long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, int i3) {
        long j16 = (i3 & 1) != 0 ? H.b.f1643t : j3;
        return new J(j16, (i3 & 2) != 0 ? H.b.f1634j : j4, (i3 & 4) != 0 ? H.b.f1644u : j5, (i3 & 8) != 0 ? H.b.f1635k : j6, H.b.f1629e, (i3 & 32) != 0 ? H.b.f1646w : j7, (i3 & 64) != 0 ? H.b.f1636l : j8, H.b.f1647x, H.b.f1637m, (i3 & 512) != 0 ? H.b.f1623H : j9, H.b.p, H.b.f1624I, H.b.f1640q, (i3 & 8192) != 0 ? H.b.f1625a : j10, (i3 & 16384) != 0 ? H.b.f1631g : j11, (32768 & i3) != 0 ? H.b.f1648y : j12, (65536 & i3) != 0 ? H.b.f1638n : j13, (131072 & i3) != 0 ? H.b.f1622G : j14, (i3 & 262144) != 0 ? H.b.f1639o : j15, j16, H.b.f1630f, H.b.f1628d, H.b.f1626b, H.b.f1632h, H.b.f1627c, H.b.f1633i, H.b.f1641r, H.b.f1642s, H.b.f1645v, H.b.f1649z, H.b.f1621F, H.b.f1619A, H.b.B, H.b.C, H.b.D, H.b.f1620E);
    }
}
