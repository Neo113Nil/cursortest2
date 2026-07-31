package r0;

import android.os.Handler;
import android.util.Pair;
import m4.q;
import r0.r3;
import t1.x;

/* loaded from: classes.dex */
final class j2 {

    /* renamed from: a, reason: collision with root package name */
    private final r3.b f20690a = new r3.b();

    /* renamed from: b, reason: collision with root package name */
    private final r3.d f20691b = new r3.d();

    /* renamed from: c, reason: collision with root package name */
    private final s0.a f20692c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f20693d;

    /* renamed from: e, reason: collision with root package name */
    private long f20694e;

    /* renamed from: f, reason: collision with root package name */
    private int f20695f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f20696g;

    /* renamed from: h, reason: collision with root package name */
    private g2 f20697h;

    /* renamed from: i, reason: collision with root package name */
    private g2 f20698i;

    /* renamed from: j, reason: collision with root package name */
    private g2 f20699j;

    /* renamed from: k, reason: collision with root package name */
    private int f20700k;

    /* renamed from: l, reason: collision with root package name */
    private Object f20701l;

    /* renamed from: m, reason: collision with root package name */
    private long f20702m;

    public j2(s0.a aVar, Handler handler) {
        this.f20692c = aVar;
        this.f20693d = handler;
    }

    private static x.b A(r3 r3Var, Object obj, long j7, long j8, r3.d dVar, r3.b bVar) {
        r3Var.l(obj, bVar);
        r3Var.r(bVar.f20914h, dVar);
        int f7 = r3Var.f(obj);
        Object obj2 = obj;
        while (bVar.f20915i == 0 && bVar.f() > 0 && bVar.t(bVar.r()) && bVar.h(0L) == -1) {
            int i7 = f7 + 1;
            if (f7 >= dVar.f20942u) {
                break;
            }
            r3Var.k(i7, bVar, true);
            obj2 = o2.a.e(bVar.f20913g);
            f7 = i7;
        }
        r3Var.l(obj2, bVar);
        int h7 = bVar.h(j7);
        return h7 == -1 ? new x.b(obj2, j8, bVar.g(j7)) : new x.b(obj2, h7, bVar.n(h7), j8);
    }

    private long C(r3 r3Var, Object obj) {
        int f7;
        int i7 = r3Var.l(obj, this.f20690a).f20914h;
        Object obj2 = this.f20701l;
        if (obj2 != null && (f7 = r3Var.f(obj2)) != -1 && r3Var.j(f7, this.f20690a).f20914h == i7) {
            return this.f20702m;
        }
        g2 g2Var = this.f20697h;
        while (true) {
            if (g2Var == null) {
                g2Var = this.f20697h;
                while (g2Var != null) {
                    int f8 = r3Var.f(g2Var.f20650b);
                    if (f8 == -1 || r3Var.j(f8, this.f20690a).f20914h != i7) {
                        g2Var = g2Var.j();
                    }
                }
                long j7 = this.f20694e;
                this.f20694e = 1 + j7;
                if (this.f20697h == null) {
                    this.f20701l = obj;
                    this.f20702m = j7;
                }
                return j7;
            }
            if (g2Var.f20650b.equals(obj)) {
                break;
            }
            g2Var = g2Var.j();
        }
        return g2Var.f20654f.f20667a.f22252d;
    }

    private boolean E(r3 r3Var) {
        g2 g2Var = this.f20697h;
        if (g2Var == null) {
            return true;
        }
        int f7 = r3Var.f(g2Var.f20650b);
        while (true) {
            f7 = r3Var.h(f7, this.f20690a, this.f20691b, this.f20695f, this.f20696g);
            while (g2Var.j() != null && !g2Var.f20654f.f20673g) {
                g2Var = g2Var.j();
            }
            g2 j7 = g2Var.j();
            if (f7 == -1 || j7 == null || r3Var.f(j7.f20650b) != f7) {
                break;
            }
            g2Var = j7;
        }
        boolean z6 = z(g2Var);
        g2Var.f20654f = r(r3Var, g2Var.f20654f);
        return !z6;
    }

    private boolean d(long j7, long j8) {
        return j7 == -9223372036854775807L || j7 == j8;
    }

    private boolean e(h2 h2Var, h2 h2Var2) {
        return h2Var.f20668b == h2Var2.f20668b && h2Var.f20667a.equals(h2Var2.f20667a);
    }

    private h2 h(s2 s2Var) {
        return k(s2Var.f20993a, s2Var.f20994b, s2Var.f20995c, s2Var.f21010r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cc, code lost:
    
        if (r0.t(r0.r()) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private h2 i(r3 r3Var, g2 g2Var, long j7) {
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        h2 h2Var = g2Var.f20654f;
        long l7 = (g2Var.l() + h2Var.f20671e) - j7;
        boolean z6 = true;
        if (!h2Var.f20673g) {
            x.b bVar = h2Var.f20667a;
            r3Var.l(bVar.f22249a, this.f20690a);
            if (!bVar.b()) {
                int n7 = this.f20690a.n(bVar.f22253e);
                boolean z7 = this.f20690a.t(bVar.f22253e) && this.f20690a.k(bVar.f22253e, n7) == 3;
                if (n7 == this.f20690a.d(bVar.f22253e) || z7) {
                    return m(r3Var, bVar.f22249a, n(r3Var, bVar.f22249a, bVar.f22253e), h2Var.f20671e, bVar.f22252d);
                }
                return l(r3Var, bVar.f22249a, bVar.f22253e, n7, h2Var.f20671e, bVar.f22252d);
            }
            int i7 = bVar.f22250b;
            int d7 = this.f20690a.d(i7);
            if (d7 == -1) {
                return null;
            }
            int o7 = this.f20690a.o(i7, bVar.f22251c);
            if (o7 < d7) {
                return l(r3Var, bVar.f22249a, i7, o7, h2Var.f20669c, bVar.f22252d);
            }
            long j13 = h2Var.f20669c;
            if (j13 == -9223372036854775807L) {
                r3.d dVar = this.f20691b;
                r3.b bVar2 = this.f20690a;
                Pair<Object, Long> o8 = r3Var.o(dVar, bVar2, bVar2.f20914h, -9223372036854775807L, Math.max(0L, l7));
                if (o8 == null) {
                    return null;
                }
                j13 = ((Long) o8.second).longValue();
            }
            return m(r3Var, bVar.f22249a, Math.max(n(r3Var, bVar.f22249a, bVar.f22250b), j13), h2Var.f20669c, bVar.f22252d);
        }
        int h7 = r3Var.h(r3Var.f(h2Var.f20667a.f22249a), this.f20690a, this.f20691b, this.f20695f, this.f20696g);
        if (h7 == -1) {
            return null;
        }
        int i8 = r3Var.k(h7, this.f20690a, true).f20914h;
        Object e7 = o2.a.e(this.f20690a.f20913g);
        long j14 = h2Var.f20667a.f22252d;
        if (r3Var.r(i8, this.f20691b).f20941t == h7) {
            Pair<Object, Long> o9 = r3Var.o(this.f20691b, this.f20690a, i8, -9223372036854775807L, Math.max(0L, l7));
            if (o9 == null) {
                return null;
            }
            e7 = o9.first;
            long longValue = ((Long) o9.second).longValue();
            g2 j15 = g2Var.j();
            if (j15 == null || !j15.f20650b.equals(e7)) {
                j12 = this.f20694e;
                this.f20694e = 1 + j12;
            } else {
                j12 = j15.f20654f.f20667a.f22252d;
            }
            j8 = longValue;
            j9 = -9223372036854775807L;
            j14 = j12;
        } else {
            j8 = 0;
            j9 = 0;
        }
        x.b A = A(r3Var, e7, j8, j14, this.f20691b, this.f20690a);
        if (j9 != -9223372036854775807L && h2Var.f20669c != -9223372036854775807L) {
            if (r3Var.l(h2Var.f20667a.f22249a, this.f20690a).f() > 0) {
                r3.b bVar3 = this.f20690a;
            }
            z6 = false;
            if (A.b() && z6) {
                j11 = h2Var.f20669c;
                j10 = j8;
                return k(r3Var, A, j11, j10);
            }
            if (z6) {
                j10 = h2Var.f20669c;
                j11 = j9;
                return k(r3Var, A, j11, j10);
            }
        }
        j10 = j8;
        j11 = j9;
        return k(r3Var, A, j11, j10);
    }

    private h2 k(r3 r3Var, x.b bVar, long j7, long j8) {
        r3Var.l(bVar.f22249a, this.f20690a);
        boolean b7 = bVar.b();
        Object obj = bVar.f22249a;
        return b7 ? l(r3Var, obj, bVar.f22250b, bVar.f22251c, j7, bVar.f22252d) : m(r3Var, obj, j8, j7, bVar.f22252d);
    }

    private h2 l(r3 r3Var, Object obj, int i7, int i8, long j7, long j8) {
        x.b bVar = new x.b(obj, i7, i8, j8);
        long e7 = r3Var.l(bVar.f22249a, this.f20690a).e(bVar.f22250b, bVar.f22251c);
        long j9 = i8 == this.f20690a.n(i7) ? this.f20690a.j() : 0L;
        return new h2(bVar, (e7 == -9223372036854775807L || j9 < e7) ? j9 : Math.max(0L, e7 - 1), j7, -9223372036854775807L, e7, this.f20690a.t(bVar.f22250b), false, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if (r9.t(r9.r()) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private h2 m(r3 r3Var, Object obj, long j7, long j8, long j9) {
        boolean z6;
        long j10;
        long j11;
        long j12;
        long j13 = j7;
        r3Var.l(obj, this.f20690a);
        int g7 = this.f20690a.g(j13);
        int i7 = 1;
        r3.b bVar = this.f20690a;
        if (g7 == -1) {
            if (bVar.f() > 0) {
                r3.b bVar2 = this.f20690a;
            }
            z6 = false;
        } else {
            if (bVar.t(g7)) {
                long i8 = this.f20690a.i(g7);
                r3.b bVar3 = this.f20690a;
                if (i8 == bVar3.f20915i && bVar3.s(g7)) {
                    g7 = -1;
                    z6 = true;
                }
            }
            z6 = false;
        }
        x.b bVar4 = new x.b(obj, j9, g7);
        boolean s7 = s(bVar4);
        boolean u6 = u(r3Var, bVar4);
        boolean t6 = t(r3Var, bVar4, s7);
        boolean z7 = g7 != -1 && this.f20690a.t(g7);
        if (g7 != -1) {
            j11 = this.f20690a.i(g7);
        } else {
            if (!z6) {
                j10 = -9223372036854775807L;
                j12 = (j10 != -9223372036854775807L || j10 == Long.MIN_VALUE) ? this.f20690a.f20915i : j10;
                if (j12 != -9223372036854775807L && j13 >= j12) {
                    if (!t6 && z6) {
                        i7 = 0;
                    }
                    j13 = Math.max(0L, j12 - i7);
                }
                return new h2(bVar4, j13, j8, j10, j12, z7, s7, u6, t6);
            }
            j11 = this.f20690a.f20915i;
        }
        j10 = j11;
        if (j10 != -9223372036854775807L) {
        }
        if (j12 != -9223372036854775807L) {
            if (!t6) {
                i7 = 0;
            }
            j13 = Math.max(0L, j12 - i7);
        }
        return new h2(bVar4, j13, j8, j10, j12, z7, s7, u6, t6);
    }

    private long n(r3 r3Var, Object obj, int i7) {
        r3Var.l(obj, this.f20690a);
        long i8 = this.f20690a.i(i7);
        return i8 == Long.MIN_VALUE ? this.f20690a.f20915i : i8 + this.f20690a.l(i7);
    }

    private boolean s(x.b bVar) {
        return !bVar.b() && bVar.f22253e == -1;
    }

    private boolean t(r3 r3Var, x.b bVar, boolean z6) {
        int f7 = r3Var.f(bVar.f22249a);
        return !r3Var.r(r3Var.j(f7, this.f20690a).f20914h, this.f20691b).f20935n && r3Var.v(f7, this.f20690a, this.f20691b, this.f20695f, this.f20696g) && z6;
    }

    private boolean u(r3 r3Var, x.b bVar) {
        if (s(bVar)) {
            return r3Var.r(r3Var.l(bVar.f22249a, this.f20690a).f20914h, this.f20691b).f20942u == r3Var.f(bVar.f22249a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(q.a aVar, x.b bVar) {
        this.f20692c.k0(aVar.h(), bVar);
    }

    private void x() {
        final q.a r7 = m4.q.r();
        for (g2 g2Var = this.f20697h; g2Var != null; g2Var = g2Var.j()) {
            r7.a(g2Var.f20654f.f20667a);
        }
        g2 g2Var2 = this.f20698i;
        final x.b bVar = g2Var2 == null ? null : g2Var2.f20654f.f20667a;
        this.f20693d.post(new Runnable() { // from class: r0.i2
            @Override // java.lang.Runnable
            public final void run() {
                j2.this.w(r7, bVar);
            }
        });
    }

    public x.b B(r3 r3Var, Object obj, long j7) {
        long C = C(r3Var, obj);
        r3Var.l(obj, this.f20690a);
        r3Var.r(this.f20690a.f20914h, this.f20691b);
        boolean z6 = false;
        for (int f7 = r3Var.f(obj); f7 >= this.f20691b.f20941t; f7--) {
            r3Var.k(f7, this.f20690a, true);
            boolean z7 = this.f20690a.f() > 0;
            z6 |= z7;
            r3.b bVar = this.f20690a;
            if (bVar.h(bVar.f20915i) != -1) {
                obj = o2.a.e(this.f20690a.f20913g);
            }
            if (z6 && (!z7 || this.f20690a.f20915i != 0)) {
                break;
            }
        }
        return A(r3Var, obj, j7, C, this.f20691b, this.f20690a);
    }

    public boolean D() {
        g2 g2Var = this.f20699j;
        return g2Var == null || (!g2Var.f20654f.f20675i && g2Var.q() && this.f20699j.f20654f.f20671e != -9223372036854775807L && this.f20700k < 100);
    }

    public boolean F(r3 r3Var, long j7, long j8) {
        h2 h2Var;
        g2 g2Var = this.f20697h;
        g2 g2Var2 = null;
        while (g2Var != null) {
            h2 h2Var2 = g2Var.f20654f;
            if (g2Var2 != null) {
                h2 i7 = i(r3Var, g2Var2, j7);
                if (i7 != null && e(h2Var2, i7)) {
                    h2Var = i7;
                }
                return !z(g2Var2);
            }
            h2Var = r(r3Var, h2Var2);
            g2Var.f20654f = h2Var.a(h2Var2.f20669c);
            if (!d(h2Var2.f20671e, h2Var.f20671e)) {
                g2Var.A();
                long j9 = h2Var.f20671e;
                return (z(g2Var) || (g2Var == this.f20698i && !g2Var.f20654f.f20672f && ((j8 > Long.MIN_VALUE ? 1 : (j8 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j8 > ((j9 > (-9223372036854775807L) ? 1 : (j9 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : g2Var.z(j9)) ? 1 : (j8 == ((j9 > (-9223372036854775807L) ? 1 : (j9 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : g2Var.z(j9)) ? 0 : -1)) >= 0))) ? false : true;
            }
            g2Var2 = g2Var;
            g2Var = g2Var.j();
        }
        return true;
    }

    public boolean G(r3 r3Var, int i7) {
        this.f20695f = i7;
        return E(r3Var);
    }

    public boolean H(r3 r3Var, boolean z6) {
        this.f20696g = z6;
        return E(r3Var);
    }

    public g2 b() {
        g2 g2Var = this.f20697h;
        if (g2Var == null) {
            return null;
        }
        if (g2Var == this.f20698i) {
            this.f20698i = g2Var.j();
        }
        this.f20697h.t();
        int i7 = this.f20700k - 1;
        this.f20700k = i7;
        if (i7 == 0) {
            this.f20699j = null;
            g2 g2Var2 = this.f20697h;
            this.f20701l = g2Var2.f20650b;
            this.f20702m = g2Var2.f20654f.f20667a.f22252d;
        }
        this.f20697h = this.f20697h.j();
        x();
        return this.f20697h;
    }

    public g2 c() {
        g2 g2Var = this.f20698i;
        o2.a.f((g2Var == null || g2Var.j() == null) ? false : true);
        this.f20698i = this.f20698i.j();
        x();
        return this.f20698i;
    }

    public void f() {
        if (this.f20700k == 0) {
            return;
        }
        g2 g2Var = (g2) o2.a.h(this.f20697h);
        this.f20701l = g2Var.f20650b;
        this.f20702m = g2Var.f20654f.f20667a.f22252d;
        while (g2Var != null) {
            g2Var.t();
            g2Var = g2Var.j();
        }
        this.f20697h = null;
        this.f20699j = null;
        this.f20698i = null;
        this.f20700k = 0;
        x();
    }

    public g2 g(g3[] g3VarArr, m2.c0 c0Var, n2.b bVar, m2 m2Var, h2 h2Var, m2.d0 d0Var) {
        g2 g2Var = this.f20699j;
        g2 g2Var2 = new g2(g3VarArr, g2Var == null ? 1000000000000L : (g2Var.l() + this.f20699j.f20654f.f20671e) - h2Var.f20668b, c0Var, bVar, m2Var, h2Var, d0Var);
        g2 g2Var3 = this.f20699j;
        if (g2Var3 != null) {
            g2Var3.w(g2Var2);
        } else {
            this.f20697h = g2Var2;
            this.f20698i = g2Var2;
        }
        this.f20701l = null;
        this.f20699j = g2Var2;
        this.f20700k++;
        x();
        return g2Var2;
    }

    public g2 j() {
        return this.f20699j;
    }

    public h2 o(long j7, s2 s2Var) {
        g2 g2Var = this.f20699j;
        return g2Var == null ? h(s2Var) : i(s2Var.f20993a, g2Var, j7);
    }

    public g2 p() {
        return this.f20697h;
    }

    public g2 q() {
        return this.f20698i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h2 r(r3 r3Var, h2 h2Var) {
        long m7;
        long j7;
        boolean z6;
        int i7;
        x.b bVar = h2Var.f20667a;
        boolean s7 = s(bVar);
        boolean u6 = u(r3Var, bVar);
        boolean t6 = t(r3Var, bVar, s7);
        r3Var.l(h2Var.f20667a.f22249a, this.f20690a);
        long i8 = (bVar.b() || (i7 = bVar.f22253e) == -1) ? -9223372036854775807L : this.f20690a.i(i7);
        if (bVar.b()) {
            m7 = this.f20690a.e(bVar.f22250b, bVar.f22251c);
        } else {
            if (i8 != -9223372036854775807L && i8 != Long.MIN_VALUE) {
                j7 = i8;
                if (bVar.b()) {
                    int i9 = bVar.f22253e;
                    z6 = i9 != -1 && this.f20690a.t(i9);
                } else {
                    z6 = this.f20690a.t(bVar.f22250b);
                }
                return new h2(bVar, h2Var.f20668b, h2Var.f20669c, i8, j7, z6, s7, u6, t6);
            }
            m7 = this.f20690a.m();
        }
        j7 = m7;
        if (bVar.b()) {
        }
        return new h2(bVar, h2Var.f20668b, h2Var.f20669c, i8, j7, z6, s7, u6, t6);
    }

    public boolean v(t1.u uVar) {
        g2 g2Var = this.f20699j;
        return g2Var != null && g2Var.f20649a == uVar;
    }

    public void y(long j7) {
        g2 g2Var = this.f20699j;
        if (g2Var != null) {
            g2Var.s(j7);
        }
    }

    public boolean z(g2 g2Var) {
        boolean z6 = false;
        o2.a.f(g2Var != null);
        if (g2Var.equals(this.f20699j)) {
            return false;
        }
        this.f20699j = g2Var;
        while (g2Var.j() != null) {
            g2Var = g2Var.j();
            if (g2Var == this.f20698i) {
                this.f20698i = this.f20697h;
                z6 = true;
            }
            g2Var.t();
            this.f20700k--;
        }
        this.f20699j.w(null);
        x();
        return z6;
    }
}
