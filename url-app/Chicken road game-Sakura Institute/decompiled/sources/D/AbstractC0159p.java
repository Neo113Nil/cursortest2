package D;

import G.C0216p;
import Z.C0323u;

/* renamed from: D.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0159p {

    /* renamed from: a, reason: collision with root package name */
    public static final q.a0 f1957a;

    /* renamed from: b, reason: collision with root package name */
    public static final q.a0 f1958b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f1959c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f1960d;

    static {
        float f4 = 24;
        float f5 = 8;
        f1957a = new q.a0(f4, f5, f4, f5);
        float f6 = 16;
        androidx.compose.foundation.layout.b.b(f6, f5, f4, f5);
        float f7 = 12;
        f1958b = new q.a0(f7, f5, f7, f5);
        androidx.compose.foundation.layout.b.b(f7, f5, f6, f5);
        f1959c = 58;
        f1960d = 40;
        float f8 = F.i.f2396a;
    }

    public static C0156o a(long j4, long j5, C0216p c0216p, int i2) {
        long j6 = (i2 & 2) != 0 ? C0323u.f4547g : j5;
        long j7 = C0323u.f4547g;
        K k4 = (K) c0216p.k(M.f1481a);
        C0156o c0156o = k4.f1365K;
        if (c0156o == null) {
            float f4 = F.i.f2396a;
            c0156o = new C0156o(M.c(k4, 26), M.c(k4, F.i.f2403h), C0323u.b(0.12f, M.c(k4, F.i.f2398c)), C0323u.b(0.38f, M.c(k4, F.i.f2400e)));
            k4.f1365K = c0156o;
        }
        return c0156o.a(j4, j6, j7, j7);
    }

    public static C0156o b(long j4, C0216p c0216p) {
        long j5 = C0323u.f4547g;
        K k4 = (K) c0216p.k(M.f1481a);
        C0156o c0156o = k4.f1366L;
        if (c0156o == null) {
            float f4 = F.k.f2413a;
            c0156o = new C0156o(M.c(k4, 32), M.c(k4, F.k.f2419g), C0323u.b(0.12f, M.c(k4, F.k.f2415c)), C0323u.b(0.38f, M.c(k4, F.k.f2416d)));
            k4.f1366L = c0156o;
        }
        return c0156o.a(j4, j5, j5, j5);
    }

    public static C0156o c(K k4) {
        C0156o c0156o = k4.f1367M;
        if (c0156o != null) {
            return c0156o;
        }
        long j4 = C0323u.f4546f;
        float f4 = F.p.f2453a;
        C0156o c0156o2 = new C0156o(j4, M.c(k4, 26), j4, C0323u.b(0.38f, M.c(k4, 18)));
        k4.f1367M = c0156o2;
        return c0156o2;
    }

    public static C0156o d(long j4, C0216p c0216p) {
        long j5 = C0323u.f4547g;
        return c((K) c0216p.k(M.f1481a)).a(j5, j4, j5, j5);
    }
}
