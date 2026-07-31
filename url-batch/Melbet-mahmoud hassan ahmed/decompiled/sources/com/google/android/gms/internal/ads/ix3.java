package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;

/* loaded from: classes.dex */
final class ix3 {

    /* renamed from: a, reason: collision with root package name */
    private final pf0 f6838a = new pf0();

    /* renamed from: b, reason: collision with root package name */
    private final hh0 f6839b = new hh0();

    /* renamed from: c, reason: collision with root package name */
    private final q04 f6840c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f6841d;

    /* renamed from: e, reason: collision with root package name */
    private long f6842e;

    /* renamed from: f, reason: collision with root package name */
    private int f6843f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6844g;

    /* renamed from: h, reason: collision with root package name */
    private fx3 f6845h;

    /* renamed from: i, reason: collision with root package name */
    private fx3 f6846i;

    /* renamed from: j, reason: collision with root package name */
    private fx3 f6847j;

    /* renamed from: k, reason: collision with root package name */
    private int f6848k;

    /* renamed from: l, reason: collision with root package name */
    private Object f6849l;

    /* renamed from: m, reason: collision with root package name */
    private long f6850m;

    public ix3(q04 q04Var, Handler handler) {
        this.f6840c = q04Var;
        this.f6841d = handler;
    }

    private static s54 A(ei0 ei0Var, Object obj, long j7, long j8, pf0 pf0Var) {
        ei0Var.n(obj, pf0Var);
        int c7 = pf0Var.c(j7);
        return c7 == -1 ? new s54(obj, j8, pf0Var.b(j7)) : new s54(obj, c7, pf0Var.d(c7), j8);
    }

    private final void B() {
        final b73 q7 = e73.q();
        for (fx3 fx3Var = this.f6845h; fx3Var != null; fx3Var = fx3Var.h()) {
            q7.f(fx3Var.f5272f.f5926a);
        }
        fx3 fx3Var2 = this.f6846i;
        final s54 s54Var = fx3Var2 == null ? null : fx3Var2.f5272f.f5926a;
        this.f6841d.post(new Runnable() { // from class: com.google.android.gms.internal.ads.hx3
            @Override // java.lang.Runnable
            public final void run() {
                ix3.this.m(q7, s54Var);
            }
        });
    }

    private final boolean C(ei0 ei0Var, s54 s54Var, boolean z6) {
        int a7 = ei0Var.a(s54Var.f5772a);
        return !ei0Var.e(ei0Var.d(a7, this.f6838a, false).f10218c, this.f6839b, 0L).f6254g && ei0Var.i(a7, this.f6838a, this.f6839b, this.f6843f, this.f6844g) == -1 && z6;
    }

    private final boolean a(ei0 ei0Var, s54 s54Var) {
        if (c(s54Var)) {
            return ei0Var.e(ei0Var.n(s54Var.f5772a, this.f6838a).f10218c, this.f6839b, 0L).f6261n == ei0Var.a(s54Var.f5772a);
        }
        return false;
    }

    private final boolean b(ei0 ei0Var) {
        fx3 fx3Var = this.f6845h;
        if (fx3Var == null) {
            return true;
        }
        int a7 = ei0Var.a(fx3Var.f5268b);
        while (true) {
            a7 = ei0Var.i(a7, this.f6838a, this.f6839b, this.f6843f, this.f6844g);
            while (fx3Var.h() != null && !fx3Var.f5272f.f5932g) {
                fx3Var = fx3Var.h();
            }
            fx3 h7 = fx3Var.h();
            if (a7 == -1 || h7 == null || ei0Var.a(h7.f5268b) != a7) {
                break;
            }
            fx3Var = h7;
        }
        boolean p7 = p(fx3Var);
        fx3Var.f5272f = j(ei0Var, fx3Var.f5272f);
        return !p7;
    }

    private static final boolean c(s54 s54Var) {
        return !s54Var.b() && s54Var.f5776e == -1;
    }

    private final long v(ei0 ei0Var, Object obj, int i7) {
        ei0Var.n(obj, this.f6838a);
        this.f6838a.g(i7);
        this.f6838a.i(i7);
        return 0L;
    }

    private final gx3 w(ei0 ei0Var, fx3 fx3Var, long j7) {
        long j8;
        gx3 gx3Var = fx3Var.f5272f;
        long e7 = (fx3Var.e() + gx3Var.f5930e) - j7;
        if (gx3Var.f5932g) {
            long j9 = 0;
            int i7 = ei0Var.i(ei0Var.a(gx3Var.f5926a.f5772a), this.f6838a, this.f6839b, this.f6843f, this.f6844g);
            if (i7 == -1) {
                return null;
            }
            int i8 = ei0Var.d(i7, this.f6838a, true).f10218c;
            Object obj = this.f6838a.f10217b;
            long j10 = gx3Var.f5926a.f5775d;
            if (ei0Var.e(i8, this.f6839b, 0L).f6260m == i7) {
                Pair<Object, Long> m7 = ei0Var.m(this.f6839b, this.f6838a, i8, -9223372036854775807L, Math.max(0L, e7));
                if (m7 == null) {
                    return null;
                }
                obj = m7.first;
                long longValue = ((Long) m7.second).longValue();
                fx3 h7 = fx3Var.h();
                if (h7 == null || !h7.f5268b.equals(obj)) {
                    j10 = this.f6842e;
                    this.f6842e = 1 + j10;
                } else {
                    j10 = h7.f5272f.f5926a.f5775d;
                }
                j8 = longValue;
                j9 = -9223372036854775807L;
            } else {
                j8 = 0;
            }
            return x(ei0Var, A(ei0Var, obj, j8, j10, this.f6838a), j9, j8);
        }
        s54 s54Var = gx3Var.f5926a;
        ei0Var.n(s54Var.f5772a, this.f6838a);
        if (!s54Var.b()) {
            int d7 = this.f6838a.d(s54Var.f5776e);
            if (d7 != this.f6838a.a(s54Var.f5776e)) {
                return y(ei0Var, s54Var.f5772a, s54Var.f5776e, d7, gx3Var.f5930e, s54Var.f5775d);
            }
            v(ei0Var, s54Var.f5772a, s54Var.f5776e);
            return z(ei0Var, s54Var.f5772a, 0L, gx3Var.f5930e, s54Var.f5775d);
        }
        int i9 = s54Var.f5773b;
        if (this.f6838a.a(i9) == -1) {
            return null;
        }
        int e8 = this.f6838a.e(i9, s54Var.f5774c);
        if (e8 < 0) {
            return y(ei0Var, s54Var.f5772a, i9, e8, gx3Var.f5928c, s54Var.f5775d);
        }
        long j11 = gx3Var.f5928c;
        if (j11 == -9223372036854775807L) {
            hh0 hh0Var = this.f6839b;
            pf0 pf0Var = this.f6838a;
            Pair<Object, Long> m8 = ei0Var.m(hh0Var, pf0Var, pf0Var.f10218c, -9223372036854775807L, Math.max(0L, e7));
            if (m8 == null) {
                return null;
            }
            j11 = ((Long) m8.second).longValue();
        }
        v(ei0Var, s54Var.f5772a, s54Var.f5773b);
        return z(ei0Var, s54Var.f5772a, Math.max(0L, j11), gx3Var.f5928c, s54Var.f5775d);
    }

    private final gx3 x(ei0 ei0Var, s54 s54Var, long j7, long j8) {
        ei0Var.n(s54Var.f5772a, this.f6838a);
        boolean b7 = s54Var.b();
        Object obj = s54Var.f5772a;
        return b7 ? y(ei0Var, obj, s54Var.f5773b, s54Var.f5774c, j7, s54Var.f5775d) : z(ei0Var, obj, j8, j7, s54Var.f5775d);
    }

    private final gx3 y(ei0 ei0Var, Object obj, int i7, int i8, long j7, long j8) {
        s54 s54Var = new s54(obj, i7, i8, j8);
        long f7 = ei0Var.n(s54Var.f5772a, this.f6838a).f(s54Var.f5773b, s54Var.f5774c);
        if (i8 == this.f6838a.d(i7)) {
            this.f6838a.h();
        }
        this.f6838a.k(s54Var.f5773b);
        long j9 = 0;
        if (f7 != -9223372036854775807L && f7 <= 0) {
            j9 = Math.max(0L, (-1) + f7);
        }
        return new gx3(s54Var, j9, j7, -9223372036854775807L, f7, false, false, false, false);
    }

    private final gx3 z(ei0 ei0Var, Object obj, long j7, long j8, long j9) {
        long j10;
        long j11 = j7;
        ei0Var.n(obj, this.f6838a);
        int b7 = this.f6838a.b(j11);
        s54 s54Var = new s54(obj, j9, b7);
        boolean c7 = c(s54Var);
        boolean a7 = a(ei0Var, s54Var);
        boolean C = C(ei0Var, s54Var, c7);
        if (b7 != -1) {
            this.f6838a.k(b7);
        }
        if (b7 != -1) {
            this.f6838a.g(b7);
            j10 = 0;
        } else {
            j10 = -9223372036854775807L;
        }
        long j12 = j10 != -9223372036854775807L ? j10 : this.f6838a.f10219d;
        if (j12 != -9223372036854775807L && j11 >= j12) {
            j11 = Math.max(0L, (-1) + j12);
        }
        return new gx3(s54Var, j11, j8, j10, j12, false, c7, a7, C);
    }

    public final fx3 d() {
        fx3 fx3Var = this.f6845h;
        if (fx3Var == null) {
            return null;
        }
        if (fx3Var == this.f6846i) {
            this.f6846i = fx3Var.h();
        }
        this.f6845h.n();
        int i7 = this.f6848k - 1;
        this.f6848k = i7;
        if (i7 == 0) {
            this.f6847j = null;
            fx3 fx3Var2 = this.f6845h;
            this.f6849l = fx3Var2.f5268b;
            this.f6850m = fx3Var2.f5272f.f5926a.f5775d;
        }
        this.f6845h = this.f6845h.h();
        B();
        return this.f6845h;
    }

    public final fx3 e() {
        fx3 fx3Var = this.f6846i;
        boolean z6 = false;
        if (fx3Var != null && fx3Var.h() != null) {
            z6 = true;
        }
        wu1.f(z6);
        this.f6846i = this.f6846i.h();
        B();
        return this.f6846i;
    }

    public final fx3 f() {
        return this.f6847j;
    }

    public final fx3 g() {
        return this.f6845h;
    }

    public final fx3 h() {
        return this.f6846i;
    }

    public final gx3 i(long j7, rx3 rx3Var) {
        fx3 fx3Var = this.f6847j;
        return fx3Var == null ? x(rx3Var.f11546a, rx3Var.f11547b, rx3Var.f11548c, rx3Var.f11564s) : w(rx3Var.f11546a, fx3Var, j7);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final gx3 j(ei0 ei0Var, gx3 gx3Var) {
        long j7;
        long j8;
        long j9;
        int i7;
        s54 s54Var = gx3Var.f5926a;
        boolean c7 = c(s54Var);
        boolean a7 = a(ei0Var, s54Var);
        boolean C = C(ei0Var, s54Var, c7);
        ei0Var.n(gx3Var.f5926a.f5772a, this.f6838a);
        if (s54Var.b() || (i7 = s54Var.f5776e) == -1) {
            j7 = -9223372036854775807L;
        } else {
            this.f6838a.g(i7);
            j7 = 0;
        }
        if (s54Var.b()) {
            j8 = this.f6838a.f(s54Var.f5773b, s54Var.f5774c);
        } else {
            if (j7 != -9223372036854775807L) {
                j9 = j7;
                if (s54Var.b()) {
                    int i8 = s54Var.f5776e;
                    if (i8 != -1) {
                        this.f6838a.k(i8);
                    }
                } else {
                    this.f6838a.k(s54Var.f5773b);
                }
                return new gx3(s54Var, gx3Var.f5927b, gx3Var.f5928c, j7, j9, false, c7, a7, C);
            }
            j8 = this.f6838a.f10219d;
        }
        j9 = j8;
        if (s54Var.b()) {
        }
        return new gx3(s54Var, gx3Var.f5927b, gx3Var.f5928c, j7, j9, false, c7, a7, C);
    }

    public final s54 k(ei0 ei0Var, Object obj, long j7) {
        long j8;
        int a7;
        int i7 = ei0Var.n(obj, this.f6838a).f10218c;
        Object obj2 = this.f6849l;
        if (obj2 == null || (a7 = ei0Var.a(obj2)) == -1 || ei0Var.d(a7, this.f6838a, false).f10218c != i7) {
            fx3 fx3Var = this.f6845h;
            while (true) {
                if (fx3Var == null) {
                    fx3Var = this.f6845h;
                    while (fx3Var != null) {
                        int a8 = ei0Var.a(fx3Var.f5268b);
                        if (a8 == -1 || ei0Var.d(a8, this.f6838a, false).f10218c != i7) {
                            fx3Var = fx3Var.h();
                        }
                    }
                    j8 = this.f6842e;
                    this.f6842e = 1 + j8;
                    if (this.f6845h == null) {
                        this.f6849l = obj;
                        this.f6850m = j8;
                    }
                } else {
                    if (fx3Var.f5268b.equals(obj)) {
                        break;
                    }
                    fx3Var = fx3Var.h();
                }
            }
            j8 = fx3Var.f5272f.f5926a.f5775d;
        } else {
            j8 = this.f6850m;
        }
        return A(ei0Var, obj, j7, j8, this.f6838a);
    }

    public final void l() {
        if (this.f6848k == 0) {
            return;
        }
        fx3 fx3Var = this.f6845h;
        wu1.b(fx3Var);
        this.f6849l = fx3Var.f5268b;
        this.f6850m = fx3Var.f5272f.f5926a.f5775d;
        while (fx3Var != null) {
            fx3Var.n();
            fx3Var = fx3Var.h();
        }
        this.f6845h = null;
        this.f6847j = null;
        this.f6846i = null;
        this.f6848k = 0;
        B();
    }

    final /* synthetic */ void m(b73 b73Var, s54 s54Var) {
        this.f6840c.S(b73Var.g(), s54Var);
    }

    public final void n(long j7) {
        fx3 fx3Var = this.f6847j;
        if (fx3Var != null) {
            fx3Var.m(j7);
        }
    }

    public final boolean o(r54 r54Var) {
        fx3 fx3Var = this.f6847j;
        return fx3Var != null && fx3Var.f5267a == r54Var;
    }

    public final boolean p(fx3 fx3Var) {
        boolean z6 = false;
        wu1.f(fx3Var != null);
        if (fx3Var.equals(this.f6847j)) {
            return false;
        }
        this.f6847j = fx3Var;
        while (fx3Var.h() != null) {
            fx3Var = fx3Var.h();
            if (fx3Var == this.f6846i) {
                this.f6846i = this.f6845h;
                z6 = true;
            }
            fx3Var.n();
            this.f6848k--;
        }
        this.f6847j.o(null);
        B();
        return z6;
    }

    public final boolean q() {
        fx3 fx3Var = this.f6847j;
        if (fx3Var != null) {
            return !fx3Var.f5272f.f5934i && fx3Var.r() && this.f6847j.f5272f.f5930e != -9223372036854775807L && this.f6848k < 100;
        }
        return true;
    }

    public final boolean r(ei0 ei0Var, long j7, long j8) {
        gx3 gx3Var;
        boolean z6;
        fx3 fx3Var = null;
        for (fx3 fx3Var2 = this.f6845h; fx3Var2 != null; fx3Var2 = fx3Var2.h()) {
            gx3 gx3Var2 = fx3Var2.f5272f;
            if (fx3Var == null) {
                gx3Var = j(ei0Var, gx3Var2);
            } else {
                gx3 w6 = w(ei0Var, fx3Var, j7);
                if (w6 == null) {
                    return !p(fx3Var);
                }
                if (gx3Var2.f5927b != w6.f5927b || !gx3Var2.f5926a.equals(w6.f5926a)) {
                    return !p(fx3Var);
                }
                gx3Var = w6;
            }
            fx3Var2.f5272f = gx3Var.a(gx3Var2.f5928c);
            long j9 = gx3Var2.f5930e;
            long j10 = gx3Var.f5930e;
            if (j9 != -9223372036854775807L && j9 != j10) {
                fx3Var2.q();
                long j11 = gx3Var.f5930e;
                long e7 = j11 == -9223372036854775807L ? Long.MAX_VALUE : j11 + fx3Var2.e();
                if (fx3Var2 == this.f6846i) {
                    boolean z7 = fx3Var2.f5272f.f5931f;
                    if (j8 == Long.MIN_VALUE || j8 >= e7) {
                        z6 = true;
                        return p(fx3Var2) && !z6;
                    }
                }
                z6 = false;
                if (p(fx3Var2)) {
                }
            }
            fx3Var = fx3Var2;
        }
        return true;
    }

    public final boolean s(ei0 ei0Var, int i7) {
        this.f6843f = i7;
        return b(ei0Var);
    }

    public final boolean t(ei0 ei0Var, boolean z6) {
        this.f6844g = z6;
        return b(ei0Var);
    }

    public final fx3 u(yx3[] yx3VarArr, q84 q84Var, g94 g94Var, qx3 qx3Var, gx3 gx3Var, r84 r84Var) {
        long e7;
        fx3 fx3Var = this.f6847j;
        if (fx3Var == null) {
            if (gx3Var.f5926a.b()) {
                long j7 = gx3Var.f5928c;
                if (j7 != -9223372036854775807L) {
                    e7 = j7;
                }
            }
            e7 = 0;
        } else {
            e7 = (fx3Var.e() + this.f6847j.f5272f.f5930e) - gx3Var.f5927b;
        }
        fx3 fx3Var2 = new fx3(yx3VarArr, e7, q84Var, g94Var, qx3Var, gx3Var, r84Var, null);
        fx3 fx3Var3 = this.f6847j;
        if (fx3Var3 != null) {
            fx3Var3.o(fx3Var2);
        } else {
            this.f6845h = fx3Var2;
            this.f6846i = fx3Var2;
        }
        this.f6849l = null;
        this.f6847j = fx3Var2;
        this.f6848k++;
        B();
        return fx3Var2;
    }
}
