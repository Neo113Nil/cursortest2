package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class ax3 implements Handler.Callback, q54, p84, px3, ii3, sx3 {
    private boolean A;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean H;
    private boolean I;
    private boolean J;
    private int K;
    private zw3 L;
    private long M;
    private int N;
    private boolean O;
    private ll3 P;
    private final hw3 Q;
    private final gg3 R;

    /* renamed from: f, reason: collision with root package name */
    private final xx3[] f2997f;

    /* renamed from: g, reason: collision with root package name */
    private final Set<xx3> f2998g;

    /* renamed from: h, reason: collision with root package name */
    private final yx3[] f2999h;

    /* renamed from: i, reason: collision with root package name */
    private final q84 f3000i;

    /* renamed from: j, reason: collision with root package name */
    private final r84 f3001j;

    /* renamed from: k, reason: collision with root package name */
    private final dx3 f3002k;

    /* renamed from: l, reason: collision with root package name */
    private final a94 f3003l;

    /* renamed from: m, reason: collision with root package name */
    private final h52 f3004m;

    /* renamed from: n, reason: collision with root package name */
    private final HandlerThread f3005n;

    /* renamed from: o, reason: collision with root package name */
    private final Looper f3006o;

    /* renamed from: p, reason: collision with root package name */
    private final hh0 f3007p;

    /* renamed from: q, reason: collision with root package name */
    private final pf0 f3008q;

    /* renamed from: r, reason: collision with root package name */
    private final long f3009r;

    /* renamed from: s, reason: collision with root package name */
    private final jj3 f3010s;

    /* renamed from: t, reason: collision with root package name */
    private final ArrayList<xw3> f3011t;

    /* renamed from: u, reason: collision with root package name */
    private final xv1 f3012u;

    /* renamed from: v, reason: collision with root package name */
    private final ix3 f3013v;

    /* renamed from: w, reason: collision with root package name */
    private final qx3 f3014w;

    /* renamed from: x, reason: collision with root package name */
    private ay3 f3015x;

    /* renamed from: y, reason: collision with root package name */
    private rx3 f3016y;

    /* renamed from: z, reason: collision with root package name */
    private yw3 f3017z;
    private int F = 0;
    private boolean G = false;
    private boolean B = false;

    public ax3(xx3[] xx3VarArr, q84 q84Var, r84 r84Var, dx3 dx3Var, a94 a94Var, int i7, boolean z6, q04 q04Var, ay3 ay3Var, gg3 gg3Var, long j7, boolean z7, Looper looper, xv1 xv1Var, hw3 hw3Var, byte[] bArr) {
        this.Q = hw3Var;
        this.f2997f = xx3VarArr;
        this.f3000i = q84Var;
        this.f3001j = r84Var;
        this.f3002k = dx3Var;
        this.f3003l = a94Var;
        this.f3015x = ay3Var;
        this.R = gg3Var;
        this.f3012u = xv1Var;
        this.f3009r = dx3Var.zza();
        dx3Var.b();
        rx3 h7 = rx3.h(r84Var);
        this.f3016y = h7;
        this.f3017z = new yw3(h7);
        this.f2999h = new yx3[2];
        for (int i8 = 0; i8 < 2; i8++) {
            xx3VarArr[i8].f(i8);
            this.f2999h[i8] = xx3VarArr[i8].i();
        }
        this.f3010s = new jj3(this, xv1Var);
        this.f3011t = new ArrayList<>();
        this.f2998g = Collections.newSetFromMap(new IdentityHashMap());
        this.f3007p = new hh0();
        this.f3008q = new pf0();
        q84Var.d(this, a94Var);
        this.O = true;
        Handler handler = new Handler(looper);
        this.f3013v = new ix3(q04Var, handler);
        this.f3014w = new qx3(this, q04Var, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f3005n = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f3006o = looper2;
        this.f3004m = xv1Var.a(looper2, this);
    }

    private final void A() {
        this.f3010s.g();
        xx3[] xx3VarArr = this.f2997f;
        for (int i7 = 0; i7 < 2; i7++) {
            xx3 xx3Var = xx3VarArr[i7];
            if (H(xx3Var)) {
                N(xx3Var);
            }
        }
    }

    private final void B() {
        fx3 f7 = this.f3013v.f();
        boolean z6 = this.E || (f7 != null && f7.f5267a.n());
        rx3 rx3Var = this.f3016y;
        if (z6 != rx3Var.f11552g) {
            this.f3016y = new rx3(rx3Var.f11546a, rx3Var.f11547b, rx3Var.f11548c, rx3Var.f11549d, rx3Var.f11550e, rx3Var.f11551f, z6, rx3Var.f11553h, rx3Var.f11554i, rx3Var.f11555j, rx3Var.f11556k, rx3Var.f11557l, rx3Var.f11558m, rx3Var.f11559n, rx3Var.f11562q, rx3Var.f11563r, rx3Var.f11564s, rx3Var.f11560o, rx3Var.f11561p);
        }
    }

    private final void C(ei0 ei0Var, s54 s54Var, ei0 ei0Var2, s54 s54Var2, long j7) {
        if (ei0Var.o() || !L(ei0Var, s54Var)) {
            float f7 = this.f3010s.c().f4479a;
            e30 e30Var = this.f3016y.f11559n;
            if (f7 != e30Var.f4479a) {
                this.f3010s.c0(e30Var);
                return;
            }
            return;
        }
        ei0Var.e(ei0Var.n(s54Var.f5772a, this.f3008q).f10218c, this.f3007p, 0L);
        gg3 gg3Var = this.R;
        th thVar = this.f3007p.f6256i;
        int i7 = n13.f8865a;
        gg3Var.d(thVar);
        if (j7 != -9223372036854775807L) {
            this.R.e(c0(ei0Var, s54Var.f5772a, j7));
            return;
        }
        if (n13.p(!ei0Var2.o() ? ei0Var2.e(ei0Var2.n(s54Var2.f5772a, this.f3008q).f10218c, this.f3007p, 0L).f6248a : null, this.f3007p.f6248a)) {
            return;
        }
        this.R.e(-9223372036854775807L);
    }

    private final void D(hm0 hm0Var, r84 r84Var) {
        this.f3002k.d(this.f2997f, hm0Var, r84Var.f11062e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
    
        if (r5 > 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        r7 = r11.f3011t.get(r5 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009c, code lost:
    
        if (r7 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009e, code lost:
    
        if (r0 < 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a0, code lost:
    
        if (r0 != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a6, code lost:
    
        if (r3 >= 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b3, code lost:
    
        if (r5 >= r11.f3011t.size()) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b5, code lost:
    
        r0 = r11.f3011t.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bd, code lost:
    
        r11.N = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a8, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00aa, code lost:
    
        if (r5 <= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009b, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x009c, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00aa -> B:37:0x0090). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void E() {
        fx3 g7 = this.f3013v.g();
        if (g7 == null) {
            return;
        }
        long g8 = g7.f5270d ? g7.f5267a.g() : -9223372036854775807L;
        if (g8 != -9223372036854775807L) {
            s(g8);
            if (g8 != this.f3016y.f11564s) {
                rx3 rx3Var = this.f3016y;
                this.f3016y = j0(rx3Var.f11547b, g8, rx3Var.f11548c, g8, true, 5);
            }
        } else {
            long a7 = this.f3010s.a(g7 != this.f3013v.h());
            this.M = a7;
            long e7 = a7 - g7.e();
            long j7 = this.f3016y.f11564s;
            if (!this.f3011t.isEmpty() && !this.f3016y.f11547b.b()) {
                if (this.O) {
                    j7--;
                    this.O = false;
                }
                rx3 rx3Var2 = this.f3016y;
                int a8 = rx3Var2.f11546a.a(rx3Var2.f11547b.f5772a);
                int min = Math.min(this.N, this.f3011t.size());
            }
            this.f3016y.f11564s = e7;
        }
        this.f3016y.f11562q = this.f3013v.f().c();
        this.f3016y.f11563r = d0();
        rx3 rx3Var3 = this.f3016y;
        if (rx3Var3.f11557l && rx3Var3.f11550e == 3 && L(rx3Var3.f11546a, rx3Var3.f11547b)) {
            rx3 rx3Var4 = this.f3016y;
            if (rx3Var4.f11559n.f4479a == 1.0f) {
                float a9 = this.R.a(c0(rx3Var4.f11546a, rx3Var4.f11547b.f5772a, rx3Var4.f11564s), d0());
                if (this.f3010s.c().f4479a != a9) {
                    this.f3010s.c0(new e30(a9, this.f3016y.f11559n.f4480b));
                    n(this.f3016y.f11559n, this.f3010s.c().f4479a, false, false);
                }
            }
        }
    }

    private final synchronized void F(c53<Boolean> c53Var, long j7) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + 500;
        boolean z6 = false;
        for (long j8 = 500; !Boolean.valueOf(((rw3) c53Var).f11439f.A).booleanValue() && j8 > 0; j8 = elapsedRealtime - SystemClock.elapsedRealtime()) {
            try {
                wait(j8);
            } catch (InterruptedException unused) {
                z6 = true;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean G() {
        fx3 f7 = this.f3013v.f();
        return (f7 == null || f7.d() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean H(xx3 xx3Var) {
        return xx3Var.q() != 0;
    }

    private final boolean I() {
        fx3 g7 = this.f3013v.g();
        long j7 = g7.f5272f.f5930e;
        if (g7.f5270d) {
            return j7 == -9223372036854775807L || this.f3016y.f11564s < j7 || !K();
        }
        return false;
    }

    private static boolean J(rx3 rx3Var, pf0 pf0Var) {
        s54 s54Var = rx3Var.f11547b;
        ei0 ei0Var = rx3Var.f11546a;
        return ei0Var.o() || ei0Var.n(s54Var.f5772a, pf0Var).f10221f;
    }

    private final boolean K() {
        rx3 rx3Var = this.f3016y;
        return rx3Var.f11557l && rx3Var.f11558m == 0;
    }

    private final boolean L(ei0 ei0Var, s54 s54Var) {
        if (!s54Var.b() && !ei0Var.o()) {
            ei0Var.e(ei0Var.n(s54Var.f5772a, this.f3008q).f10218c, this.f3007p, 0L);
            if (this.f3007p.b()) {
                hh0 hh0Var = this.f3007p;
                if (hh0Var.f6254g && hh0Var.f6251d != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final void M(ux3 ux3Var) {
        ux3Var.j();
        try {
            ux3Var.c().m(ux3Var.a(), ux3Var.g());
        } finally {
            ux3Var.h(true);
        }
    }

    private static final void N(xx3 xx3Var) {
        if (xx3Var.q() == 2) {
            xx3Var.M();
        }
    }

    private static final void O(xx3 xx3Var, long j7) {
        xx3Var.G();
        if (xx3Var instanceof q74) {
            throw null;
        }
    }

    private static c0[] P(w74 w74Var) {
        int b7 = w74Var != null ? w74Var.b() : 0;
        c0[] c0VarArr = new c0[b7];
        for (int i7 = 0; i7 < b7; i7++) {
            c0VarArr[i7] = w74Var.c(i7);
        }
        return c0VarArr;
    }

    static Object T(hh0 hh0Var, pf0 pf0Var, int i7, boolean z6, Object obj, ei0 ei0Var, ei0 ei0Var2) {
        int a7 = ei0Var.a(obj);
        int b7 = ei0Var.b();
        int i8 = 0;
        int i9 = a7;
        int i10 = -1;
        while (true) {
            if (i8 >= b7 || i10 != -1) {
                break;
            }
            i9 = ei0Var.i(i9, pf0Var, hh0Var, i7, z6);
            if (i9 == -1) {
                i10 = -1;
                break;
            }
            i10 = ei0Var2.a(ei0Var.f(i9));
            i8++;
        }
        if (i10 == -1) {
            return null;
        }
        return ei0Var2.f(i10);
    }

    static final /* synthetic */ void b0(ux3 ux3Var) {
        try {
            M(ux3Var);
        } catch (ll3 e7) {
            oc2.a("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e7);
            throw new RuntimeException(e7);
        }
    }

    private final void c(xx3 xx3Var) {
        if (H(xx3Var)) {
            this.f3010s.b(xx3Var);
            N(xx3Var);
            xx3Var.o();
            this.K--;
        }
    }

    private final long c0(ei0 ei0Var, Object obj, long j7) {
        ei0Var.e(ei0Var.n(obj, this.f3008q).f10218c, this.f3007p, 0L);
        hh0 hh0Var = this.f3007p;
        if (hh0Var.f6251d != -9223372036854775807L && hh0Var.b()) {
            hh0 hh0Var2 = this.f3007p;
            if (hh0Var2.f6254g) {
                return nz3.c(n13.W(hh0Var2.f6252e) - this.f3007p.f6251d) - j7;
            }
        }
        return -9223372036854775807L;
    }

    private final void d() {
        e(new boolean[2]);
    }

    private final long d0() {
        return e0(this.f3016y.f11562q);
    }

    private final void e(boolean[] zArr) {
        fx3 h7 = this.f3013v.h();
        r84 i7 = h7.i();
        for (int i8 = 0; i8 < 2; i8++) {
            if (!i7.b(i8) && this.f2998g.remove(this.f2997f[i8])) {
                this.f2997f[i8].C();
            }
        }
        for (int i9 = 0; i9 < 2; i9++) {
            if (i7.b(i9)) {
                boolean z6 = zArr[i9];
                xx3 xx3Var = this.f2997f[i9];
                if (!H(xx3Var)) {
                    fx3 h8 = this.f3013v.h();
                    boolean z7 = h8 == this.f3013v.g();
                    r84 i10 = h8.i();
                    zx3 zx3Var = i10.f11059b[i9];
                    c0[] P = P(i10.f11062e[i9]);
                    boolean z8 = K() && this.f3016y.f11550e == 3;
                    boolean z9 = !z6 && z8;
                    this.K++;
                    this.f2998g.add(xx3Var);
                    xx3Var.p(zx3Var, P, h8.f5269c[i9], this.M, z9, z7, h8.f(), h8.e());
                    xx3Var.m(11, new tw3(this));
                    this.f3010s.d(xx3Var);
                    if (z8) {
                        xx3Var.e0();
                    }
                }
            }
        }
        h7.f5273g = true;
    }

    private final long e0(long j7) {
        fx3 f7 = this.f3013v.f();
        if (f7 == null) {
            return 0L;
        }
        return Math.max(0L, j7 - (this.M - f7.e()));
    }

    private final long f0(s54 s54Var, long j7, boolean z6) {
        return g0(s54Var, j7, this.f3013v.g() != this.f3013v.h(), z6);
    }

    private final void g(IOException iOException, int i7) {
        ll3 c7 = ll3.c(iOException, i7);
        fx3 g7 = this.f3013v.g();
        if (g7 != null) {
            c7 = c7.a(g7.f5272f.f5926a);
        }
        oc2.a("ExoPlayerImplInternal", "Playback error", c7);
        z(false, false);
        this.f3016y = this.f3016y.e(c7);
    }

    private final long g0(s54 s54Var, long j7, boolean z6, boolean z7) {
        A();
        this.D = false;
        if (z7 || this.f3016y.f11550e == 3) {
            x(2);
        }
        fx3 g7 = this.f3013v.g();
        fx3 fx3Var = g7;
        while (fx3Var != null && !s54Var.equals(fx3Var.f5272f.f5926a)) {
            fx3Var = fx3Var.h();
        }
        if (z6 || g7 != fx3Var || (fx3Var != null && fx3Var.e() + j7 < 0)) {
            xx3[] xx3VarArr = this.f2997f;
            for (int i7 = 0; i7 < 2; i7++) {
                c(xx3VarArr[i7]);
            }
            if (fx3Var != null) {
                while (this.f3013v.g() != fx3Var) {
                    this.f3013v.d();
                }
                this.f3013v.p(fx3Var);
                fx3Var.p(0L);
                d();
            }
        }
        ix3 ix3Var = this.f3013v;
        if (fx3Var != null) {
            ix3Var.p(fx3Var);
            if (!fx3Var.f5270d) {
                fx3Var.f5272f = fx3Var.f5272f.b(j7);
            } else if (fx3Var.f5271e) {
                j7 = fx3Var.f5267a.e(j7);
                fx3Var.f5267a.s(j7 - this.f3009r, false);
            }
            s(j7);
            o();
        } else {
            ix3Var.l();
            s(j7);
        }
        j(false);
        this.f3004m.O(2);
        return j7;
    }

    private final Pair<s54, Long> h0(ei0 ei0Var) {
        long j7 = 0;
        if (ei0Var.o()) {
            return Pair.create(rx3.i(), 0L);
        }
        Pair<Object, Long> l7 = ei0Var.l(this.f3007p, this.f3008q, ei0Var.g(this.G), -9223372036854775807L);
        s54 k7 = this.f3013v.k(ei0Var, l7.first, 0L);
        long longValue = ((Long) l7.second).longValue();
        if (k7.b()) {
            ei0Var.n(k7.f5772a, this.f3008q);
            if (k7.f5774c == this.f3008q.d(k7.f5773b)) {
                this.f3008q.h();
            }
        } else {
            j7 = longValue;
        }
        return Pair.create(k7, Long.valueOf(j7));
    }

    private static Pair<Object, Long> i0(ei0 ei0Var, zw3 zw3Var, boolean z6, int i7, boolean z7, hh0 hh0Var, pf0 pf0Var) {
        Pair<Object, Long> l7;
        int i8;
        long j7;
        ei0 ei0Var2 = zw3Var.f15282a;
        if (ei0Var.o()) {
            return null;
        }
        ei0 ei0Var3 = true == ei0Var2.o() ? ei0Var : ei0Var2;
        try {
            l7 = ei0Var3.l(hh0Var, pf0Var, zw3Var.f15283b, zw3Var.f15284c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (ei0Var.equals(ei0Var3)) {
            return l7;
        }
        if (ei0Var.a(l7.first) == -1) {
            Object T = T(hh0Var, pf0Var, i7, z7, l7.first, ei0Var3, ei0Var);
            if (T != null) {
                i8 = ei0Var.n(T, pf0Var).f10218c;
                j7 = -9223372036854775807L;
            }
            return null;
        }
        if (!ei0Var3.n(l7.first, pf0Var).f10221f || ei0Var3.e(pf0Var.f10218c, hh0Var, 0L).f6260m != ei0Var3.a(l7.first)) {
            return l7;
        }
        i8 = ei0Var.n(l7.first, pf0Var).f10218c;
        j7 = zw3Var.f15284c;
        return ei0Var.l(hh0Var, pf0Var, i8, j7);
    }

    private final void j(boolean z6) {
        fx3 f7 = this.f3013v.f();
        s54 s54Var = f7 == null ? this.f3016y.f11547b : f7.f5272f.f5926a;
        boolean z7 = !this.f3016y.f11556k.equals(s54Var);
        if (z7) {
            this.f3016y = this.f3016y.a(s54Var);
        }
        rx3 rx3Var = this.f3016y;
        rx3Var.f11562q = f7 == null ? rx3Var.f11564s : f7.c();
        this.f3016y.f11563r = d0();
        if ((z7 || z6) && f7 != null && f7.f5270d) {
            D(f7.g(), f7.i());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final rx3 j0(s54 s54Var, long j7, long j8, long j9, boolean z6, int i7) {
        List<c91> list;
        hm0 hm0Var;
        r84 r84Var;
        this.O = (!this.O && j7 == this.f3016y.f11564s && s54Var.equals(this.f3016y.f11547b)) ? false : true;
        r();
        rx3 rx3Var = this.f3016y;
        hm0 hm0Var2 = rx3Var.f11553h;
        r84 r84Var2 = rx3Var.f11554i;
        List<c91> list2 = rx3Var.f11555j;
        if (this.f3014w.i()) {
            fx3 g7 = this.f3013v.g();
            hm0Var2 = g7 == null ? hm0.f6333d : g7.g();
            r84Var2 = g7 == null ? this.f3001j : g7.i();
            w74[] w74VarArr = r84Var2.f11062e;
            b73 b73Var = new b73();
            boolean z7 = false;
            for (w74 w74Var : w74VarArr) {
                if (w74Var != null) {
                    c91 c91Var = w74Var.c(0).f3658j;
                    if (c91Var == null) {
                        b73Var.f(new c91(new b81[0]));
                    } else {
                        b73Var.f(c91Var);
                        z7 = true;
                    }
                }
            }
            e73 g8 = z7 ? b73Var.g() : e73.w();
            if (g7 != null) {
                gx3 gx3Var = g7.f5272f;
                if (gx3Var.f5928c != j8) {
                    g7.f5272f = gx3Var.a(j8);
                }
            }
            list = g8;
        } else {
            if (!s54Var.equals(this.f3016y.f11547b)) {
                hm0Var = hm0.f6333d;
                r84Var = this.f3001j;
                list = e73.w();
                if (z6) {
                    this.f3017z.d(i7);
                }
                return this.f3016y.b(s54Var, j7, j8, j9, d0(), hm0Var, r84Var, list);
            }
            list = list2;
        }
        hm0Var = hm0Var2;
        r84Var = r84Var2;
        if (z6) {
        }
        return this.f3016y.b(s54Var, j7, j8, j9, d0(), hm0Var, r84Var, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0364, code lost:
    
        if (r1.n(r2, r15.f3008q).f10221f != false) goto L194;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x018e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0354 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0337  */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.google.android.gms.internal.ads.pf0] */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.google.android.gms.internal.ads.zw3] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r15v12, types: [com.google.android.gms.internal.ads.ax3] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.google.android.gms.internal.ads.ei0] */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.google.android.gms.internal.ads.ei0] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void l(ei0 ei0Var, boolean z6) {
        s54 s54Var;
        ix3 ix3Var;
        int i7;
        Object obj;
        long j7;
        int i8;
        boolean z7;
        boolean z8;
        boolean z9;
        int i9;
        int i10;
        boolean z10;
        long j8;
        s54 k7;
        boolean equals;
        boolean z11;
        ?? r13;
        s54 s54Var2;
        boolean z12;
        boolean z13;
        ?? r15;
        long j9;
        boolean z14;
        int i11;
        int i12;
        boolean z15;
        int i13;
        boolean z16;
        boolean z17;
        ?? r9;
        long j10;
        boolean z18;
        boolean z19;
        zw3 zw3Var;
        long j11;
        rx3 rx3Var = this.f3016y;
        zw3 zw3Var2 = this.L;
        ix3 ix3Var2 = this.f3013v;
        int i14 = this.F;
        boolean z20 = this.G;
        hh0 hh0Var = this.f3007p;
        ?? r14 = this.f3008q;
        boolean z21 = true;
        if (ei0Var.o()) {
            s54Var2 = rx3.i();
            r15 = this;
            r13 = -9223372036854775807;
            z12 = false;
            z14 = true;
            z13 = false;
            r9 = -1;
            j9 = 0;
        } else {
            s54 s54Var3 = rx3Var.f11547b;
            Object obj2 = s54Var3.f5772a;
            boolean J = J(rx3Var, r14);
            long j12 = (rx3Var.f11547b.b() || J) ? rx3Var.f11548c : rx3Var.f11564s;
            if (zw3Var2 != null) {
                s54Var = s54Var3;
                ix3Var = ix3Var2;
                i12 = -1;
                Pair<Object, Long> i02 = i0(ei0Var, zw3Var2, true, i14, z20, hh0Var, r14);
                if (i02 == null) {
                    i13 = ei0Var.g(z20);
                    j7 = j12;
                    z10 = true;
                    z16 = false;
                    z17 = false;
                } else {
                    if (zw3Var2.f15284c == -9223372036854775807L) {
                        i13 = ei0Var.n(i02.first, r14).f10218c;
                        j7 = j12;
                        z15 = false;
                    } else {
                        obj2 = i02.first;
                        j7 = ((Long) i02.second).longValue();
                        z15 = true;
                        i13 = -1;
                    }
                    z16 = rx3Var.f11550e == 4;
                    z17 = z15;
                    z10 = false;
                }
                z7 = z16;
                i8 = i13;
                z9 = z17;
            } else {
                s54Var = s54Var3;
                ix3Var = ix3Var2;
                i7 = -1;
                i7 = -1;
                i12 = -1;
                if (rx3Var.f11546a.o()) {
                    i9 = ei0Var.g(z20);
                } else if (ei0Var.a(obj2) == -1) {
                    Object T = T(hh0Var, r14, i14, z20, obj2, rx3Var.f11546a, ei0Var);
                    if (T == null) {
                        i10 = ei0Var.g(z20);
                        z10 = true;
                    } else {
                        i10 = ei0Var.n(T, r14).f10218c;
                        z10 = false;
                    }
                    i8 = i10;
                    j7 = j12;
                    z7 = false;
                    z9 = false;
                } else if (j12 == -9223372036854775807L) {
                    i9 = ei0Var.n(obj2, r14).f10218c;
                } else if (J) {
                    rx3Var.f11546a.n(s54Var.f5772a, r14);
                    if (rx3Var.f11546a.e(r14.f10218c, hh0Var, 0L).f6260m == rx3Var.f11546a.a(s54Var.f5772a)) {
                        Pair<Object, Long> l7 = ei0Var.l(hh0Var, r14, ei0Var.n(obj2, r14).f10218c, j12);
                        obj2 = l7.first;
                        j7 = ((Long) l7.second).longValue();
                    } else {
                        j7 = j12;
                    }
                    obj = obj2;
                    i8 = -1;
                    z7 = false;
                    z8 = false;
                    z9 = true;
                    if (i8 == i7) {
                        Pair<Object, Long> l8 = ei0Var.l(hh0Var, r14, i8, -9223372036854775807L);
                        obj = l8.first;
                        j8 = ((Long) l8.second).longValue();
                        j7 = -9223372036854775807L;
                    } else {
                        j8 = j7;
                    }
                    k7 = ix3Var.k(ei0Var, obj, j8);
                    boolean z22 = k7.f5776e != i7 || ((i11 = s54Var.f5776e) != i7 && k7.f5773b >= i11);
                    equals = s54Var.f5772a.equals(obj);
                    z11 = (equals || s54Var.b() || k7.b() || !z22) ? false : true;
                    ei0Var.n(obj, r14);
                    if (equals && !J && j12 == j7) {
                        if (k7.b()) {
                            r14.k(k7.f5773b);
                        }
                        if (s54Var.b()) {
                            r14.k(s54Var.f5773b);
                        }
                    }
                    if (true == z11) {
                        k7 = s54Var;
                    }
                    if (k7.b()) {
                        if (k7.equals(s54Var)) {
                            j8 = rx3Var.f11564s;
                        } else {
                            ei0Var.n(k7.f5772a, r14);
                            if (k7.f5774c == r14.d(k7.f5773b)) {
                                r14.h();
                            }
                            j8 = 0;
                        }
                    }
                    r13 = j7;
                    s54Var2 = k7;
                    z12 = z7;
                    z21 = z8;
                    z13 = z9;
                    r15 = this;
                    j9 = j8;
                    z14 = true;
                    r9 = i7;
                } else {
                    obj = obj2;
                    j7 = j12;
                    i8 = -1;
                    z7 = false;
                    z8 = false;
                    z9 = false;
                    if (i8 == i7) {
                    }
                    k7 = ix3Var.k(ei0Var, obj, j8);
                    if (k7.f5776e != i7) {
                    }
                    equals = s54Var.f5772a.equals(obj);
                    if (equals) {
                    }
                    ei0Var.n(obj, r14);
                    if (equals) {
                        if (k7.b()) {
                        }
                        if (s54Var.b()) {
                        }
                    }
                    if (true == z11) {
                    }
                    if (k7.b()) {
                    }
                    r13 = j7;
                    s54Var2 = k7;
                    z12 = z7;
                    z21 = z8;
                    z13 = z9;
                    r15 = this;
                    j9 = j8;
                    z14 = true;
                    r9 = i7;
                }
                i8 = i9;
                obj = obj2;
                j7 = j12;
                z7 = false;
                z8 = false;
                z9 = false;
                if (i8 == i7) {
                }
                k7 = ix3Var.k(ei0Var, obj, j8);
                if (k7.f5776e != i7) {
                }
                equals = s54Var.f5772a.equals(obj);
                if (equals) {
                }
                ei0Var.n(obj, r14);
                if (equals) {
                }
                if (true == z11) {
                }
                if (k7.b()) {
                }
                r13 = j7;
                s54Var2 = k7;
                z12 = z7;
                z21 = z8;
                z13 = z9;
                r15 = this;
                j9 = j8;
                z14 = true;
                r9 = i7;
            }
            Object obj3 = obj2;
            z8 = z10;
            obj = obj3;
            i7 = i12;
            if (i8 == i7) {
            }
            k7 = ix3Var.k(ei0Var, obj, j8);
            if (k7.f5776e != i7) {
            }
            equals = s54Var.f5772a.equals(obj);
            if (equals) {
            }
            ei0Var.n(obj, r14);
            if (equals) {
            }
            if (true == z11) {
            }
            if (k7.b()) {
            }
            r13 = j7;
            s54Var2 = k7;
            z12 = z7;
            z21 = z8;
            z13 = z9;
            r15 = this;
            j9 = j8;
            z14 = true;
            r9 = i7;
        }
        boolean z23 = (r15.f3016y.f11547b.equals(s54Var2) && j9 == r15.f3016y.f11564s) ? false : true;
        if (z21) {
            try {
                if (r15.f3016y.f11550e != z14) {
                    r15.x(4);
                }
                r15.q(false, false, false, z14);
            } catch (Throwable th) {
                th = th;
                j10 = r13;
                r9 = 1;
                r13 = 0;
                r14 = 0;
                rx3 rx3Var2 = r15.f3016y;
                C(ei0Var, s54Var2, rx3Var2.f11546a, rx3Var2.f11547b, r9 != z13 ? -9223372036854775807L : j9);
                if (!z23 || j10 != r15.f3016y.f11548c) {
                    rx3 rx3Var3 = r15.f3016y;
                    Object obj4 = rx3Var3.f11547b.f5772a;
                    ei0 ei0Var2 = rx3Var3.f11546a;
                    boolean z24 = (z23 && z6 && !ei0Var2.o()) ? r9 : false;
                    r15.f3016y = j0(s54Var2, j9, j10, r15.f3016y.f11549d, z24, ei0Var.a(obj4) == -1 ? 4 : 3);
                }
                r();
                r15.t(ei0Var, r15.f3016y.f11546a);
                r15.f3016y = r15.f3016y.g(ei0Var);
                if (!ei0Var.o()) {
                    r15.L = r14;
                }
                r15.j(r13);
                throw th;
            }
        }
        try {
            if (z23) {
                j10 = r13;
                z18 = true;
                z19 = false;
                zw3Var = null;
                if (!ei0Var.o()) {
                    for (fx3 g7 = r15.f3013v.g(); g7 != null; g7 = g7.h()) {
                        if (g7.f5272f.f5926a.equals(s54Var2)) {
                            g7.f5272f = r15.f3013v.j(ei0Var, g7.f5272f);
                            g7.q();
                        }
                    }
                    j9 = r15.f0(s54Var2, j9, z12);
                }
            } else {
                ix3 ix3Var3 = r15.f3013v;
                long j13 = r15.M;
                fx3 h7 = ix3Var3.h();
                if (h7 != null) {
                    long e7 = h7.e();
                    if (h7.f5270d) {
                        j11 = e7;
                        int i15 = 0;
                        r13 = r13;
                        while (true) {
                            xx3[] xx3VarArr = r15.f2997f;
                            j10 = r13;
                            if (i15 >= 2) {
                                break;
                            }
                            try {
                                if (H(xx3VarArr[i15]) && r15.f2997f[i15].k() == h7.f5269c[i15]) {
                                    long d7 = r15.f2997f[i15].d();
                                    if (d7 == Long.MIN_VALUE) {
                                        j11 = Long.MIN_VALUE;
                                        break;
                                    }
                                    j11 = Math.max(d7, j11);
                                }
                                i15++;
                                r13 = j10;
                            } catch (Throwable th2) {
                                th = th2;
                                r9 = 1;
                                r13 = 0;
                                r14 = 0;
                                rx3 rx3Var22 = r15.f3016y;
                                C(ei0Var, s54Var2, rx3Var22.f11546a, rx3Var22.f11547b, r9 != z13 ? -9223372036854775807L : j9);
                                if (!z23) {
                                }
                                rx3 rx3Var32 = r15.f3016y;
                                Object obj42 = rx3Var32.f11547b.f5772a;
                                ei0 ei0Var22 = rx3Var32.f11546a;
                                if (z23) {
                                }
                                r15.f3016y = j0(s54Var2, j9, j10, r15.f3016y.f11549d, z24, ei0Var.a(obj42) == -1 ? 4 : 3);
                                r();
                                r15.t(ei0Var, r15.f3016y.f11546a);
                                r15.f3016y = r15.f3016y.g(ei0Var);
                                if (!ei0Var.o()) {
                                }
                                r15.j(r13);
                                throw th;
                            }
                        }
                    } else {
                        j10 = r13;
                        j11 = e7;
                    }
                } else {
                    j10 = r13;
                    j11 = 0;
                }
                z19 = false;
                z18 = true;
                zw3Var = null;
                if (!ix3Var3.r(ei0Var, j13, j11)) {
                    r15.v(false);
                }
            }
            rx3 rx3Var4 = r15.f3016y;
            C(ei0Var, s54Var2, rx3Var4.f11546a, rx3Var4.f11547b, z18 != z13 ? -9223372036854775807L : j9);
            if (z23 || j10 != r15.f3016y.f11548c) {
                rx3 rx3Var5 = r15.f3016y;
                Object obj5 = rx3Var5.f11547b.f5772a;
                ei0 ei0Var3 = rx3Var5.f11546a;
                if (!z23 || !z6 || ei0Var3.o() || ei0Var3.n(obj5, r15.f3008q).f10221f) {
                    z18 = false;
                }
                r15.f3016y = j0(s54Var2, j9, j10, r15.f3016y.f11549d, z18, ei0Var.a(obj5) == -1 ? 4 : 3);
            }
            r();
            r15.t(ei0Var, r15.f3016y.f11546a);
            r15.f3016y = r15.f3016y.g(ei0Var);
            if (!ei0Var.o()) {
                r15.L = zw3Var;
            }
            r15.j(z19);
        } catch (Throwable th3) {
            th = th3;
            rx3 rx3Var222 = r15.f3016y;
            C(ei0Var, s54Var2, rx3Var222.f11546a, rx3Var222.f11547b, r9 != z13 ? -9223372036854775807L : j9);
            if (!z23) {
            }
            rx3 rx3Var322 = r15.f3016y;
            Object obj422 = rx3Var322.f11547b.f5772a;
            ei0 ei0Var222 = rx3Var322.f11546a;
            if (z23) {
            }
            r15.f3016y = j0(s54Var2, j9, j10, r15.f3016y.f11549d, z24, ei0Var.a(obj422) == -1 ? 4 : 3);
            r();
            r15.t(ei0Var, r15.f3016y.f11546a);
            r15.f3016y = r15.f3016y.g(ei0Var);
            if (!ei0Var.o()) {
            }
            r15.j(r13);
            throw th;
        }
    }

    private final void m(e30 e30Var, boolean z6) {
        n(e30Var, e30Var.f4479a, true, z6);
    }

    private final void n(e30 e30Var, float f7, boolean z6, boolean z7) {
        int i7;
        ax3 ax3Var = this;
        if (z6) {
            if (z7) {
                ax3Var.f3017z.a(1);
            }
            rx3 rx3Var = ax3Var.f3016y;
            ax3Var = this;
            ax3Var.f3016y = new rx3(rx3Var.f11546a, rx3Var.f11547b, rx3Var.f11548c, rx3Var.f11549d, rx3Var.f11550e, rx3Var.f11551f, rx3Var.f11552g, rx3Var.f11553h, rx3Var.f11554i, rx3Var.f11555j, rx3Var.f11556k, rx3Var.f11557l, rx3Var.f11558m, e30Var, rx3Var.f11562q, rx3Var.f11563r, rx3Var.f11564s, rx3Var.f11560o, rx3Var.f11561p);
        }
        float f8 = e30Var.f4479a;
        fx3 g7 = ax3Var.f3013v.g();
        while (true) {
            i7 = 0;
            if (g7 == null) {
                break;
            }
            w74[] w74VarArr = g7.i().f11062e;
            int length = w74VarArr.length;
            while (i7 < length) {
                w74 w74Var = w74VarArr[i7];
                i7++;
            }
            g7 = g7.h();
        }
        xx3[] xx3VarArr = ax3Var.f2997f;
        while (i7 < 2) {
            xx3 xx3Var = xx3VarArr[i7];
            if (xx3Var != null) {
                xx3Var.n(f7, e30Var.f4479a);
            }
            i7++;
        }
    }

    private final void o() {
        long e7;
        long j7;
        boolean h7;
        if (G()) {
            fx3 f7 = this.f3013v.f();
            long e02 = e0(f7.d());
            if (f7 == this.f3013v.g()) {
                e7 = this.M;
                j7 = f7.e();
            } else {
                e7 = this.M - f7.e();
                j7 = f7.f5272f.f5927b;
            }
            h7 = this.f3002k.h(e7 - j7, e02, this.f3010s.c().f4479a);
        } else {
            h7 = false;
        }
        this.E = h7;
        if (h7) {
            this.f3013v.f().k(this.M);
        }
        B();
    }

    private final void p() {
        boolean z6;
        this.f3017z.c(this.f3016y);
        z6 = this.f3017z.f14838a;
        if (z6) {
            hw3 hw3Var = this.Q;
            hw3Var.f6445a.Q(this.f3017z);
            this.f3017z = new yw3(this.f3016y);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void q(boolean z6, boolean z7, boolean z8, boolean z9) {
        s54 s54Var;
        long j7;
        long j8;
        boolean z10;
        this.f3004m.D(2);
        this.P = null;
        this.D = false;
        this.f3010s.g();
        this.M = 0L;
        xx3[] xx3VarArr = this.f2997f;
        for (int i7 = 0; i7 < 2; i7++) {
            try {
                c(xx3VarArr[i7]);
            } catch (ll3 | RuntimeException e7) {
                oc2.a("ExoPlayerImplInternal", "Disable failed.", e7);
            }
        }
        if (z6) {
            xx3[] xx3VarArr2 = this.f2997f;
            for (int i8 = 0; i8 < 2; i8++) {
                xx3 xx3Var = xx3VarArr2[i8];
                if (this.f2998g.remove(xx3Var)) {
                    try {
                        xx3Var.C();
                    } catch (RuntimeException e8) {
                        oc2.a("ExoPlayerImplInternal", "Reset failed.", e8);
                    }
                }
            }
        }
        this.K = 0;
        rx3 rx3Var = this.f3016y;
        s54 s54Var2 = rx3Var.f11547b;
        long j9 = rx3Var.f11564s;
        long j10 = (this.f3016y.f11547b.b() || J(this.f3016y, this.f3008q)) ? this.f3016y.f11548c : this.f3016y.f11564s;
        if (z7) {
            this.L = null;
            Pair<s54, Long> h02 = h0(this.f3016y.f11546a);
            s54 s54Var3 = (s54) h02.first;
            long longValue = ((Long) h02.second).longValue();
            if (!s54Var3.equals(this.f3016y.f11547b)) {
                z10 = true;
                s54Var = s54Var3;
                j7 = longValue;
                j8 = -9223372036854775807L;
                this.f3013v.l();
                this.E = false;
                rx3 rx3Var2 = this.f3016y;
                ei0 ei0Var = rx3Var2.f11546a;
                int i9 = rx3Var2.f11550e;
                ll3 ll3Var = z9 ? null : rx3Var2.f11551f;
                hm0 hm0Var = !z10 ? hm0.f6333d : rx3Var2.f11553h;
                r84 r84Var = !z10 ? this.f3001j : rx3Var2.f11554i;
                List w6 = !z10 ? e73.w() : rx3Var2.f11555j;
                rx3 rx3Var3 = this.f3016y;
                this.f3016y = new rx3(ei0Var, s54Var, j8, j7, i9, ll3Var, false, hm0Var, r84Var, w6, s54Var, rx3Var3.f11557l, rx3Var3.f11558m, rx3Var3.f11559n, j7, 0L, j7, this.J, false);
                if (z8) {
                    return;
                }
                this.f3014w.g();
                return;
            }
            s54Var = s54Var3;
            j7 = longValue;
            j8 = -9223372036854775807L;
        } else {
            s54Var = s54Var2;
            j7 = j9;
            j8 = j10;
        }
        z10 = false;
        this.f3013v.l();
        this.E = false;
        rx3 rx3Var22 = this.f3016y;
        ei0 ei0Var2 = rx3Var22.f11546a;
        int i92 = rx3Var22.f11550e;
        ll3 ll3Var2 = z9 ? null : rx3Var22.f11551f;
        hm0 hm0Var2 = !z10 ? hm0.f6333d : rx3Var22.f11553h;
        r84 r84Var2 = !z10 ? this.f3001j : rx3Var22.f11554i;
        List w62 = !z10 ? e73.w() : rx3Var22.f11555j;
        rx3 rx3Var32 = this.f3016y;
        this.f3016y = new rx3(ei0Var2, s54Var, j8, j7, i92, ll3Var2, false, hm0Var2, r84Var2, w62, s54Var, rx3Var32.f11557l, rx3Var32.f11558m, rx3Var32.f11559n, j7, 0L, j7, this.J, false);
        if (z8) {
        }
    }

    private final void r() {
        fx3 g7 = this.f3013v.g();
        boolean z6 = false;
        if (g7 != null && g7.f5272f.f5933h && this.B) {
            z6 = true;
        }
        this.C = z6;
    }

    private final void s(long j7) {
        fx3 g7 = this.f3013v.g();
        if (g7 != null) {
            j7 += g7.e();
        }
        this.M = j7;
        this.f3010s.e(j7);
        xx3[] xx3VarArr = this.f2997f;
        for (int i7 = 0; i7 < 2; i7++) {
            xx3 xx3Var = xx3VarArr[i7];
            if (H(xx3Var)) {
                xx3Var.g(this.M);
            }
        }
        for (fx3 g8 = this.f3013v.g(); g8 != null; g8 = g8.h()) {
            for (w74 w74Var : g8.i().f11062e) {
            }
        }
    }

    private final void t(ei0 ei0Var, ei0 ei0Var2) {
        if (ei0Var.o() && ei0Var2.o()) {
            return;
        }
        int size = this.f3011t.size() - 1;
        if (size < 0) {
            Collections.sort(this.f3011t);
        } else {
            Object obj = this.f3011t.get(size).f14368f;
            nz3.c(-9223372036854775807L);
            throw null;
        }
    }

    private final void u(long j7, long j8) {
        this.f3004m.D(2);
        this.f3004m.K(2, j7 + j8);
    }

    private final void v(boolean z6) {
        s54 s54Var = this.f3013v.g().f5272f.f5926a;
        long g02 = g0(s54Var, this.f3016y.f11564s, true, false);
        if (g02 != this.f3016y.f11564s) {
            rx3 rx3Var = this.f3016y;
            this.f3016y = j0(s54Var, g02, rx3Var.f11548c, rx3Var.f11549d, z6, 5);
        }
    }

    private final void w(boolean z6, int i7, boolean z7, int i8) {
        this.f3017z.a(z7 ? 1 : 0);
        this.f3017z.b(i8);
        this.f3016y = this.f3016y.d(z6, i7);
        this.D = false;
        for (fx3 g7 = this.f3013v.g(); g7 != null; g7 = g7.h()) {
            for (w74 w74Var : g7.i().f11062e) {
            }
        }
        if (!K()) {
            A();
            E();
            return;
        }
        int i9 = this.f3016y.f11550e;
        if (i9 == 3) {
            y();
            this.f3004m.O(2);
        } else if (i9 == 2) {
            this.f3004m.O(2);
        }
    }

    private final void x(int i7) {
        rx3 rx3Var = this.f3016y;
        if (rx3Var.f11550e != i7) {
            this.f3016y = rx3Var.f(i7);
        }
    }

    private final void y() {
        this.D = false;
        this.f3010s.f();
        xx3[] xx3VarArr = this.f2997f;
        for (int i7 = 0; i7 < 2; i7++) {
            xx3 xx3Var = xx3VarArr[i7];
            if (H(xx3Var)) {
                xx3Var.e0();
            }
        }
    }

    private final void z(boolean z6, boolean z7) {
        q(z6 || !this.H, false, true, false);
        this.f3017z.a(z7 ? 1 : 0);
        this.f3002k.g();
        x(1);
    }

    public final Looper Q() {
        return this.f3006o;
    }

    final /* synthetic */ Boolean S() {
        return Boolean.valueOf(this.A);
    }

    public final void V() {
        this.f3004m.d(0).zza();
    }

    public final void W(ei0 ei0Var, int i7, long j7) {
        this.f3004m.G(3, new zw3(ei0Var, i7, j7)).zza();
    }

    public final void X(boolean z6, int i7) {
        this.f3004m.I(1, z6 ? 1 : 0, i7).zza();
    }

    public final void Y() {
        this.f3004m.d(6).zza();
    }

    public final synchronized boolean Z() {
        if (!this.A && this.f3005n.isAlive()) {
            this.f3004m.O(7);
            F(new rw3(this), 500L);
            return this.A;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ii3
    public final void a(e30 e30Var) {
        this.f3004m.G(16, e30Var).zza();
    }

    public final void a0(List<ox3> list, int i7, long j7, l74 l74Var) {
        this.f3004m.G(17, new vw3(list, l74Var, i7, j7, null, null)).zza();
    }

    @Override // com.google.android.gms.internal.ads.sx3
    public final synchronized void b(ux3 ux3Var) {
        if (!this.A && this.f3005n.isAlive()) {
            this.f3004m.G(14, ux3Var).zza();
            return;
        }
        Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        ux3Var.h(false);
    }

    @Override // com.google.android.gms.internal.ads.px3
    public final void f() {
        this.f3004m.O(22);
    }

    @Override // com.google.android.gms.internal.ads.q54
    public final void h(r54 r54Var) {
        this.f3004m.G(8, r54Var).zza();
    }

    /* JADX WARN: Code restructure failed: missing block: B:535:0x0847, code lost:
    
        if (I() != false) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x08d6, code lost:
    
        if (r2 == false) goto L460;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0434 A[Catch: all -> 0x04d1, TryCatch #0 {all -> 0x04d1, blocks: (B:191:0x042a, B:193:0x0434, B:198:0x0439, B:200:0x0440, B:201:0x0443, B:202:0x044a, B:204:0x0454, B:206:0x045c, B:210:0x0464, B:211:0x046e, B:213:0x047e, B:216:0x0487, B:219:0x0497, B:222:0x04a1), top: B:190:0x042a }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x07f6 A[Catch: RuntimeException -> 0x0a50, IOException -> 0x0a7b, w44 -> 0x0a80, if1 -> 0x0a85, dz -> 0x0a8a, t24 -> 0x0aa1, ll3 -> 0x0aaa, TryCatch #6 {dz -> 0x0a8a, if1 -> 0x0a85, ll3 -> 0x0aaa, t24 -> 0x0aa1, w44 -> 0x0a80, IOException -> 0x0a7b, RuntimeException -> 0x0a50, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:11:0x001c, B:14:0x0023, B:16:0x0027, B:21:0x0034, B:22:0x0036, B:23:0x003b, B:24:0x003f, B:26:0x0043, B:29:0x004a, B:31:0x0053, B:33:0x0061, B:34:0x0064, B:36:0x0069, B:37:0x0074, B:38:0x0083, B:39:0x0088, B:40:0x009c, B:41:0x00ae, B:43:0x00bd, B:44:0x00c1, B:45:0x00ce, B:47:0x00dd, B:48:0x00f9, B:49:0x0109, B:50:0x0112, B:52:0x0124, B:53:0x0130, B:54:0x0140, B:56:0x014c, B:59:0x0157, B:60:0x015b, B:61:0x0168, B:64:0x016f, B:66:0x0177, B:68:0x017b, B:70:0x0180, B:72:0x0188, B:74:0x0190, B:76:0x0193, B:81:0x0198, B:90:0x01a5, B:92:0x01a6, B:95:0x01ad, B:97:0x01bb, B:99:0x01c0, B:101:0x01d0, B:102:0x01d5, B:104:0x01ec, B:106:0x01f0, B:108:0x01fe, B:111:0x0208, B:113:0x020d, B:115:0x0213, B:155:0x021b, B:118:0x0223, B:120:0x0246, B:123:0x024f, B:125:0x0271, B:126:0x0274, B:127:0x0277, B:129:0x027b, B:131:0x028b, B:133:0x0291, B:136:0x0295, B:138:0x0299, B:135:0x029e, B:143:0x02a3, B:144:0x02c4, B:146:0x02cf, B:148:0x02a7, B:150:0x02b1, B:163:0x02dc, B:165:0x02e8, B:166:0x02ef, B:167:0x02f4, B:169:0x0300, B:171:0x0328, B:172:0x0349, B:173:0x035b, B:182:0x0366, B:183:0x0367, B:184:0x036e, B:185:0x0376, B:186:0x038b, B:188:0x03ad, B:196:0x04c2, B:218:0x0490, B:232:0x04d6, B:233:0x04e7, B:240:0x03d4, B:243:0x03e8, B:245:0x03f8, B:247:0x040f, B:249:0x0418, B:256:0x04e8, B:258:0x04f6, B:261:0x0500, B:263:0x050f, B:265:0x051b, B:267:0x054a, B:268:0x0551, B:269:0x0555, B:271:0x0559, B:272:0x0566, B:275:0x0677, B:277:0x067f, B:279:0x0687, B:282:0x068c, B:283:0x0698, B:285:0x069d, B:287:0x06a5, B:293:0x06b6, B:295:0x06bc, B:297:0x06d6, B:299:0x06dc, B:292:0x06e1, B:306:0x06e6, B:308:0x06ea, B:310:0x06f0, B:312:0x06f4, B:314:0x06fc, B:316:0x0702, B:318:0x070c, B:321:0x0712, B:323:0x0715, B:331:0x0570, B:333:0x0576, B:336:0x057c, B:339:0x0587, B:341:0x058c, B:344:0x059a, B:347:0x05a0, B:349:0x05a9, B:353:0x05ac, B:355:0x05b4, B:357:0x05c2, B:359:0x05d4, B:361:0x05de, B:364:0x05e8, B:366:0x05f0, B:368:0x05f3, B:374:0x05fa, B:376:0x0604, B:378:0x060e, B:380:0x061f, B:384:0x0625, B:383:0x0630, B:389:0x0633, B:391:0x0639, B:394:0x063e, B:396:0x0643, B:398:0x064b, B:400:0x0651, B:402:0x0657, B:406:0x0665, B:407:0x0671, B:409:0x0674, B:415:0x0563, B:416:0x0762, B:421:0x0771, B:423:0x077d, B:424:0x0782, B:426:0x0790, B:427:0x07a6, B:429:0x07ab, B:433:0x07f9, B:434:0x07b4, B:436:0x07bb, B:439:0x07c4, B:441:0x07ce, B:446:0x07dd, B:448:0x07e3, B:456:0x07f6, B:464:0x0804, B:466:0x080a, B:470:0x0812, B:472:0x081a, B:474:0x081e, B:475:0x0829, B:477:0x082f, B:478:0x0833, B:479:0x0909, B:482:0x0911, B:484:0x0915, B:486:0x091d, B:488:0x092b, B:490:0x0932, B:494:0x0936, B:496:0x093c, B:498:0x0945, B:501:0x094c, B:502:0x0953, B:503:0x0954, B:505:0x095c, B:506:0x0962, B:508:0x0968, B:510:0x0976, B:512:0x097a, B:515:0x098a, B:516:0x09a1, B:518:0x09a7, B:519:0x0a02, B:520:0x0982, B:521:0x096f, B:523:0x098d, B:527:0x0994, B:529:0x099a, B:530:0x0838, B:532:0x083f, B:534:0x0843, B:537:0x08b5, B:539:0x08c0, B:542:0x0850, B:544:0x0854, B:546:0x0866, B:547:0x086c, B:549:0x087a, B:552:0x0883, B:554:0x088d, B:559:0x0898, B:564:0x08c4, B:566:0x08cb, B:568:0x08cf, B:571:0x08d8, B:573:0x08e6, B:575:0x08ee, B:577:0x08f8, B:579:0x08fd, B:581:0x0902, B:583:0x07fd, B:584:0x0a0a, B:585:0x0a12, B:588:0x0a19, B:590:0x0a21, B:593:0x0a3f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:458:0x07f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x095c A[Catch: RuntimeException -> 0x0a50, IOException -> 0x0a7b, w44 -> 0x0a80, if1 -> 0x0a85, dz -> 0x0a8a, t24 -> 0x0aa1, ll3 -> 0x0aaa, TryCatch #6 {dz -> 0x0a8a, if1 -> 0x0a85, ll3 -> 0x0aaa, t24 -> 0x0aa1, w44 -> 0x0a80, IOException -> 0x0a7b, RuntimeException -> 0x0a50, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:11:0x001c, B:14:0x0023, B:16:0x0027, B:21:0x0034, B:22:0x0036, B:23:0x003b, B:24:0x003f, B:26:0x0043, B:29:0x004a, B:31:0x0053, B:33:0x0061, B:34:0x0064, B:36:0x0069, B:37:0x0074, B:38:0x0083, B:39:0x0088, B:40:0x009c, B:41:0x00ae, B:43:0x00bd, B:44:0x00c1, B:45:0x00ce, B:47:0x00dd, B:48:0x00f9, B:49:0x0109, B:50:0x0112, B:52:0x0124, B:53:0x0130, B:54:0x0140, B:56:0x014c, B:59:0x0157, B:60:0x015b, B:61:0x0168, B:64:0x016f, B:66:0x0177, B:68:0x017b, B:70:0x0180, B:72:0x0188, B:74:0x0190, B:76:0x0193, B:81:0x0198, B:90:0x01a5, B:92:0x01a6, B:95:0x01ad, B:97:0x01bb, B:99:0x01c0, B:101:0x01d0, B:102:0x01d5, B:104:0x01ec, B:106:0x01f0, B:108:0x01fe, B:111:0x0208, B:113:0x020d, B:115:0x0213, B:155:0x021b, B:118:0x0223, B:120:0x0246, B:123:0x024f, B:125:0x0271, B:126:0x0274, B:127:0x0277, B:129:0x027b, B:131:0x028b, B:133:0x0291, B:136:0x0295, B:138:0x0299, B:135:0x029e, B:143:0x02a3, B:144:0x02c4, B:146:0x02cf, B:148:0x02a7, B:150:0x02b1, B:163:0x02dc, B:165:0x02e8, B:166:0x02ef, B:167:0x02f4, B:169:0x0300, B:171:0x0328, B:172:0x0349, B:173:0x035b, B:182:0x0366, B:183:0x0367, B:184:0x036e, B:185:0x0376, B:186:0x038b, B:188:0x03ad, B:196:0x04c2, B:218:0x0490, B:232:0x04d6, B:233:0x04e7, B:240:0x03d4, B:243:0x03e8, B:245:0x03f8, B:247:0x040f, B:249:0x0418, B:256:0x04e8, B:258:0x04f6, B:261:0x0500, B:263:0x050f, B:265:0x051b, B:267:0x054a, B:268:0x0551, B:269:0x0555, B:271:0x0559, B:272:0x0566, B:275:0x0677, B:277:0x067f, B:279:0x0687, B:282:0x068c, B:283:0x0698, B:285:0x069d, B:287:0x06a5, B:293:0x06b6, B:295:0x06bc, B:297:0x06d6, B:299:0x06dc, B:292:0x06e1, B:306:0x06e6, B:308:0x06ea, B:310:0x06f0, B:312:0x06f4, B:314:0x06fc, B:316:0x0702, B:318:0x070c, B:321:0x0712, B:323:0x0715, B:331:0x0570, B:333:0x0576, B:336:0x057c, B:339:0x0587, B:341:0x058c, B:344:0x059a, B:347:0x05a0, B:349:0x05a9, B:353:0x05ac, B:355:0x05b4, B:357:0x05c2, B:359:0x05d4, B:361:0x05de, B:364:0x05e8, B:366:0x05f0, B:368:0x05f3, B:374:0x05fa, B:376:0x0604, B:378:0x060e, B:380:0x061f, B:384:0x0625, B:383:0x0630, B:389:0x0633, B:391:0x0639, B:394:0x063e, B:396:0x0643, B:398:0x064b, B:400:0x0651, B:402:0x0657, B:406:0x0665, B:407:0x0671, B:409:0x0674, B:415:0x0563, B:416:0x0762, B:421:0x0771, B:423:0x077d, B:424:0x0782, B:426:0x0790, B:427:0x07a6, B:429:0x07ab, B:433:0x07f9, B:434:0x07b4, B:436:0x07bb, B:439:0x07c4, B:441:0x07ce, B:446:0x07dd, B:448:0x07e3, B:456:0x07f6, B:464:0x0804, B:466:0x080a, B:470:0x0812, B:472:0x081a, B:474:0x081e, B:475:0x0829, B:477:0x082f, B:478:0x0833, B:479:0x0909, B:482:0x0911, B:484:0x0915, B:486:0x091d, B:488:0x092b, B:490:0x0932, B:494:0x0936, B:496:0x093c, B:498:0x0945, B:501:0x094c, B:502:0x0953, B:503:0x0954, B:505:0x095c, B:506:0x0962, B:508:0x0968, B:510:0x0976, B:512:0x097a, B:515:0x098a, B:516:0x09a1, B:518:0x09a7, B:519:0x0a02, B:520:0x0982, B:521:0x096f, B:523:0x098d, B:527:0x0994, B:529:0x099a, B:530:0x0838, B:532:0x083f, B:534:0x0843, B:537:0x08b5, B:539:0x08c0, B:542:0x0850, B:544:0x0854, B:546:0x0866, B:547:0x086c, B:549:0x087a, B:552:0x0883, B:554:0x088d, B:559:0x0898, B:564:0x08c4, B:566:0x08cb, B:568:0x08cf, B:571:0x08d8, B:573:0x08e6, B:575:0x08ee, B:577:0x08f8, B:579:0x08fd, B:581:0x0902, B:583:0x07fd, B:584:0x0a0a, B:585:0x0a12, B:588:0x0a19, B:590:0x0a21, B:593:0x0a3f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0968 A[Catch: RuntimeException -> 0x0a50, IOException -> 0x0a7b, w44 -> 0x0a80, if1 -> 0x0a85, dz -> 0x0a8a, t24 -> 0x0aa1, ll3 -> 0x0aaa, TryCatch #6 {dz -> 0x0a8a, if1 -> 0x0a85, ll3 -> 0x0aaa, t24 -> 0x0aa1, w44 -> 0x0a80, IOException -> 0x0a7b, RuntimeException -> 0x0a50, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:11:0x001c, B:14:0x0023, B:16:0x0027, B:21:0x0034, B:22:0x0036, B:23:0x003b, B:24:0x003f, B:26:0x0043, B:29:0x004a, B:31:0x0053, B:33:0x0061, B:34:0x0064, B:36:0x0069, B:37:0x0074, B:38:0x0083, B:39:0x0088, B:40:0x009c, B:41:0x00ae, B:43:0x00bd, B:44:0x00c1, B:45:0x00ce, B:47:0x00dd, B:48:0x00f9, B:49:0x0109, B:50:0x0112, B:52:0x0124, B:53:0x0130, B:54:0x0140, B:56:0x014c, B:59:0x0157, B:60:0x015b, B:61:0x0168, B:64:0x016f, B:66:0x0177, B:68:0x017b, B:70:0x0180, B:72:0x0188, B:74:0x0190, B:76:0x0193, B:81:0x0198, B:90:0x01a5, B:92:0x01a6, B:95:0x01ad, B:97:0x01bb, B:99:0x01c0, B:101:0x01d0, B:102:0x01d5, B:104:0x01ec, B:106:0x01f0, B:108:0x01fe, B:111:0x0208, B:113:0x020d, B:115:0x0213, B:155:0x021b, B:118:0x0223, B:120:0x0246, B:123:0x024f, B:125:0x0271, B:126:0x0274, B:127:0x0277, B:129:0x027b, B:131:0x028b, B:133:0x0291, B:136:0x0295, B:138:0x0299, B:135:0x029e, B:143:0x02a3, B:144:0x02c4, B:146:0x02cf, B:148:0x02a7, B:150:0x02b1, B:163:0x02dc, B:165:0x02e8, B:166:0x02ef, B:167:0x02f4, B:169:0x0300, B:171:0x0328, B:172:0x0349, B:173:0x035b, B:182:0x0366, B:183:0x0367, B:184:0x036e, B:185:0x0376, B:186:0x038b, B:188:0x03ad, B:196:0x04c2, B:218:0x0490, B:232:0x04d6, B:233:0x04e7, B:240:0x03d4, B:243:0x03e8, B:245:0x03f8, B:247:0x040f, B:249:0x0418, B:256:0x04e8, B:258:0x04f6, B:261:0x0500, B:263:0x050f, B:265:0x051b, B:267:0x054a, B:268:0x0551, B:269:0x0555, B:271:0x0559, B:272:0x0566, B:275:0x0677, B:277:0x067f, B:279:0x0687, B:282:0x068c, B:283:0x0698, B:285:0x069d, B:287:0x06a5, B:293:0x06b6, B:295:0x06bc, B:297:0x06d6, B:299:0x06dc, B:292:0x06e1, B:306:0x06e6, B:308:0x06ea, B:310:0x06f0, B:312:0x06f4, B:314:0x06fc, B:316:0x0702, B:318:0x070c, B:321:0x0712, B:323:0x0715, B:331:0x0570, B:333:0x0576, B:336:0x057c, B:339:0x0587, B:341:0x058c, B:344:0x059a, B:347:0x05a0, B:349:0x05a9, B:353:0x05ac, B:355:0x05b4, B:357:0x05c2, B:359:0x05d4, B:361:0x05de, B:364:0x05e8, B:366:0x05f0, B:368:0x05f3, B:374:0x05fa, B:376:0x0604, B:378:0x060e, B:380:0x061f, B:384:0x0625, B:383:0x0630, B:389:0x0633, B:391:0x0639, B:394:0x063e, B:396:0x0643, B:398:0x064b, B:400:0x0651, B:402:0x0657, B:406:0x0665, B:407:0x0671, B:409:0x0674, B:415:0x0563, B:416:0x0762, B:421:0x0771, B:423:0x077d, B:424:0x0782, B:426:0x0790, B:427:0x07a6, B:429:0x07ab, B:433:0x07f9, B:434:0x07b4, B:436:0x07bb, B:439:0x07c4, B:441:0x07ce, B:446:0x07dd, B:448:0x07e3, B:456:0x07f6, B:464:0x0804, B:466:0x080a, B:470:0x0812, B:472:0x081a, B:474:0x081e, B:475:0x0829, B:477:0x082f, B:478:0x0833, B:479:0x0909, B:482:0x0911, B:484:0x0915, B:486:0x091d, B:488:0x092b, B:490:0x0932, B:494:0x0936, B:496:0x093c, B:498:0x0945, B:501:0x094c, B:502:0x0953, B:503:0x0954, B:505:0x095c, B:506:0x0962, B:508:0x0968, B:510:0x0976, B:512:0x097a, B:515:0x098a, B:516:0x09a1, B:518:0x09a7, B:519:0x0a02, B:520:0x0982, B:521:0x096f, B:523:0x098d, B:527:0x0994, B:529:0x099a, B:530:0x0838, B:532:0x083f, B:534:0x0843, B:537:0x08b5, B:539:0x08c0, B:542:0x0850, B:544:0x0854, B:546:0x0866, B:547:0x086c, B:549:0x087a, B:552:0x0883, B:554:0x088d, B:559:0x0898, B:564:0x08c4, B:566:0x08cb, B:568:0x08cf, B:571:0x08d8, B:573:0x08e6, B:575:0x08ee, B:577:0x08f8, B:579:0x08fd, B:581:0x0902, B:583:0x07fd, B:584:0x0a0a, B:585:0x0a12, B:588:0x0a19, B:590:0x0a21, B:593:0x0a3f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:518:0x09a7 A[Catch: RuntimeException -> 0x0a50, IOException -> 0x0a7b, w44 -> 0x0a80, if1 -> 0x0a85, dz -> 0x0a8a, t24 -> 0x0aa1, ll3 -> 0x0aaa, TryCatch #6 {dz -> 0x0a8a, if1 -> 0x0a85, ll3 -> 0x0aaa, t24 -> 0x0aa1, w44 -> 0x0a80, IOException -> 0x0a7b, RuntimeException -> 0x0a50, blocks: (B:3:0x0006, B:4:0x0012, B:7:0x0017, B:11:0x001c, B:14:0x0023, B:16:0x0027, B:21:0x0034, B:22:0x0036, B:23:0x003b, B:24:0x003f, B:26:0x0043, B:29:0x004a, B:31:0x0053, B:33:0x0061, B:34:0x0064, B:36:0x0069, B:37:0x0074, B:38:0x0083, B:39:0x0088, B:40:0x009c, B:41:0x00ae, B:43:0x00bd, B:44:0x00c1, B:45:0x00ce, B:47:0x00dd, B:48:0x00f9, B:49:0x0109, B:50:0x0112, B:52:0x0124, B:53:0x0130, B:54:0x0140, B:56:0x014c, B:59:0x0157, B:60:0x015b, B:61:0x0168, B:64:0x016f, B:66:0x0177, B:68:0x017b, B:70:0x0180, B:72:0x0188, B:74:0x0190, B:76:0x0193, B:81:0x0198, B:90:0x01a5, B:92:0x01a6, B:95:0x01ad, B:97:0x01bb, B:99:0x01c0, B:101:0x01d0, B:102:0x01d5, B:104:0x01ec, B:106:0x01f0, B:108:0x01fe, B:111:0x0208, B:113:0x020d, B:115:0x0213, B:155:0x021b, B:118:0x0223, B:120:0x0246, B:123:0x024f, B:125:0x0271, B:126:0x0274, B:127:0x0277, B:129:0x027b, B:131:0x028b, B:133:0x0291, B:136:0x0295, B:138:0x0299, B:135:0x029e, B:143:0x02a3, B:144:0x02c4, B:146:0x02cf, B:148:0x02a7, B:150:0x02b1, B:163:0x02dc, B:165:0x02e8, B:166:0x02ef, B:167:0x02f4, B:169:0x0300, B:171:0x0328, B:172:0x0349, B:173:0x035b, B:182:0x0366, B:183:0x0367, B:184:0x036e, B:185:0x0376, B:186:0x038b, B:188:0x03ad, B:196:0x04c2, B:218:0x0490, B:232:0x04d6, B:233:0x04e7, B:240:0x03d4, B:243:0x03e8, B:245:0x03f8, B:247:0x040f, B:249:0x0418, B:256:0x04e8, B:258:0x04f6, B:261:0x0500, B:263:0x050f, B:265:0x051b, B:267:0x054a, B:268:0x0551, B:269:0x0555, B:271:0x0559, B:272:0x0566, B:275:0x0677, B:277:0x067f, B:279:0x0687, B:282:0x068c, B:283:0x0698, B:285:0x069d, B:287:0x06a5, B:293:0x06b6, B:295:0x06bc, B:297:0x06d6, B:299:0x06dc, B:292:0x06e1, B:306:0x06e6, B:308:0x06ea, B:310:0x06f0, B:312:0x06f4, B:314:0x06fc, B:316:0x0702, B:318:0x070c, B:321:0x0712, B:323:0x0715, B:331:0x0570, B:333:0x0576, B:336:0x057c, B:339:0x0587, B:341:0x058c, B:344:0x059a, B:347:0x05a0, B:349:0x05a9, B:353:0x05ac, B:355:0x05b4, B:357:0x05c2, B:359:0x05d4, B:361:0x05de, B:364:0x05e8, B:366:0x05f0, B:368:0x05f3, B:374:0x05fa, B:376:0x0604, B:378:0x060e, B:380:0x061f, B:384:0x0625, B:383:0x0630, B:389:0x0633, B:391:0x0639, B:394:0x063e, B:396:0x0643, B:398:0x064b, B:400:0x0651, B:402:0x0657, B:406:0x0665, B:407:0x0671, B:409:0x0674, B:415:0x0563, B:416:0x0762, B:421:0x0771, B:423:0x077d, B:424:0x0782, B:426:0x0790, B:427:0x07a6, B:429:0x07ab, B:433:0x07f9, B:434:0x07b4, B:436:0x07bb, B:439:0x07c4, B:441:0x07ce, B:446:0x07dd, B:448:0x07e3, B:456:0x07f6, B:464:0x0804, B:466:0x080a, B:470:0x0812, B:472:0x081a, B:474:0x081e, B:475:0x0829, B:477:0x082f, B:478:0x0833, B:479:0x0909, B:482:0x0911, B:484:0x0915, B:486:0x091d, B:488:0x092b, B:490:0x0932, B:494:0x0936, B:496:0x093c, B:498:0x0945, B:501:0x094c, B:502:0x0953, B:503:0x0954, B:505:0x095c, B:506:0x0962, B:508:0x0968, B:510:0x0976, B:512:0x097a, B:515:0x098a, B:516:0x09a1, B:518:0x09a7, B:519:0x0a02, B:520:0x0982, B:521:0x096f, B:523:0x098d, B:527:0x0994, B:529:0x099a, B:530:0x0838, B:532:0x083f, B:534:0x0843, B:537:0x08b5, B:539:0x08c0, B:542:0x0850, B:544:0x0854, B:546:0x0866, B:547:0x086c, B:549:0x087a, B:552:0x0883, B:554:0x088d, B:559:0x0898, B:564:0x08c4, B:566:0x08cb, B:568:0x08cf, B:571:0x08d8, B:573:0x08e6, B:575:0x08ee, B:577:0x08f8, B:579:0x08fd, B:581:0x0902, B:583:0x07fd, B:584:0x0a0a, B:585:0x0a12, B:588:0x0a19, B:590:0x0a21, B:593:0x0a3f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0991  */
    /* JADX WARN: Type inference failed for: r2v27, types: [com.google.android.gms.internal.ads.a94, com.google.android.gms.internal.ads.vt1] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        IOException iOException;
        int i7;
        boolean z6;
        fx3 h7;
        boolean z7;
        boolean z8;
        boolean z9;
        rx3 rx3Var;
        int i8;
        boolean z10;
        rx3 rx3Var2;
        boolean z11;
        boolean z12;
        fx3 g7;
        fx3 h8;
        gx3 i9;
        long j7;
        boolean z13;
        long j8;
        s54 s54Var;
        long j9;
        Throwable th;
        boolean z14;
        long j10;
        long j11;
        long f02;
        rx3 rx3Var3;
        int i10;
        rx3 j02;
        int i11;
        h52 h52Var;
        int i12;
        List<ox3> list;
        l74 l74Var;
        ei0 m7;
        List list2;
        l74 l74Var2;
        int i13;
        long j12;
        List<ox3> list3;
        l74 l74Var3;
        try {
        } catch (dz e7) {
            g(e7, e7.f4400g == 1 ? true != e7.f4399f ? 3003 : 3001 : 1000);
        } catch (if1 e8) {
            if1 if1Var = e8;
            i7 = if1Var.f6637f;
            iOException = if1Var;
            g(iOException, i7);
        } catch (ll3 e9) {
            ll3 ll3Var = e9;
            if (ll3Var.f8009i == 1 && (h7 = this.f3013v.h()) != null) {
                ll3Var = ll3Var.a(h7.f5272f.f5926a);
            }
            if (ll3Var.f8015o && this.P == null) {
                oc2.b("ExoPlayerImplInternal", "Recoverable renderer error", ll3Var);
                this.P = ll3Var;
                h52 h52Var2 = this.f3004m;
                h52Var2.J(h52Var2.G(25, ll3Var));
            } else {
                ll3 ll3Var2 = this.P;
                if (ll3Var2 != null) {
                    ll3Var = ll3Var2;
                }
                oc2.a("ExoPlayerImplInternal", "Playback error", ll3Var);
                z6 = true;
                z(true, false);
                this.f3016y = this.f3016y.e(ll3Var);
            }
        } catch (t24 e10) {
            t24 t24Var = e10;
            i7 = t24Var.f12064f;
            iOException = t24Var;
            g(iOException, i7);
        } catch (w44 e11) {
            iOException = e11;
            i7 = 1002;
            g(iOException, i7);
        } catch (IOException e12) {
            iOException = e12;
            i7 = 2000;
            g(iOException, i7);
        } catch (RuntimeException e13) {
            ll3 d7 = ll3.d(e13, ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) ? 1004 : 1000);
            oc2.a("ExoPlayerImplInternal", "Playback error", d7);
            z(true, false);
            this.f3016y = this.f3016y.e(d7);
        }
        switch (message.what) {
            case 0:
                this.f3017z.a(1);
                q(false, false, false, true);
                this.f3002k.a();
                x(true != this.f3016y.f11546a.o() ? 2 : 4);
                this.f3014w.f(this.f3003l);
                this.f3004m.O(2);
                z6 = true;
                p();
                return z6;
            case 1:
                w(message.arg1 != 0, message.arg2, true, 1);
                z6 = true;
                p();
                return z6;
            case 2:
                long uptimeMillis = SystemClock.uptimeMillis();
                if (!this.f3016y.f11546a.o() && this.f3014w.i()) {
                    this.f3013v.n(this.M);
                    if (this.f3013v.q() && (i9 = this.f3013v.i(this.M, this.f3016y)) != null) {
                        fx3 u6 = this.f3013v.u(this.f2999h, this.f3000i, this.f3002k.f(), this.f3014w, i9, this.f3001j);
                        u6.f5267a.o(this, i9.f5927b);
                        if (this.f3013v.g() == u6) {
                            s(u6.f());
                        }
                        j(false);
                    }
                    if (this.E) {
                        this.E = G();
                        B();
                    } else {
                        o();
                    }
                    fx3 h9 = this.f3013v.h();
                    if (h9 != null) {
                        if (h9.h() != null && !this.C) {
                            fx3 h10 = this.f3013v.h();
                            if (h10.f5270d) {
                                int i14 = 0;
                                while (true) {
                                    xx3[] xx3VarArr = this.f2997f;
                                    if (i14 < 2) {
                                        xx3 xx3Var = xx3VarArr[i14];
                                        i74 i74Var = h10.f5269c[i14];
                                        if (xx3Var.k() == i74Var) {
                                            if (i74Var == null || xx3Var.A()) {
                                                i14++;
                                            } else {
                                                h10.h();
                                                boolean z15 = h10.f5272f.f5931f;
                                            }
                                        }
                                    } else if (h9.h().f5270d || this.M >= h9.h().f()) {
                                        r84 i15 = h9.i();
                                        fx3 e14 = this.f3013v.e();
                                        r84 i16 = e14.i();
                                        if (!e14.f5270d || e14.f5267a.g() == -9223372036854775807L) {
                                            for (int i17 = 0; i17 < 2; i17++) {
                                                boolean b7 = i15.b(i17);
                                                boolean b8 = i16.b(i17);
                                                if (b7 && !this.f2997f[i17].J()) {
                                                    this.f2999h[i17].a();
                                                    zx3 zx3Var = i15.f11059b[i17];
                                                    zx3 zx3Var2 = i16.f11059b[i17];
                                                    if (!b8 || !zx3Var2.equals(zx3Var)) {
                                                        O(this.f2997f[i17], e14.f());
                                                    }
                                                }
                                            }
                                        } else {
                                            long f7 = e14.f();
                                            xx3[] xx3VarArr2 = this.f2997f;
                                            for (int i18 = 0; i18 < 2; i18++) {
                                                xx3 xx3Var2 = xx3VarArr2[i18];
                                                if (xx3Var2.k() != null) {
                                                    O(xx3Var2, f7);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (h9.f5272f.f5934i || this.C) {
                            int i19 = 0;
                            while (true) {
                                xx3[] xx3VarArr3 = this.f2997f;
                                if (i19 < 2) {
                                    xx3 xx3Var3 = xx3VarArr3[i19];
                                    i74 i74Var2 = h9.f5269c[i19];
                                    if (i74Var2 != null && xx3Var3.k() == i74Var2 && xx3Var3.A()) {
                                        long j13 = h9.f5272f.f5930e;
                                        O(xx3Var3, (j13 == -9223372036854775807L || j13 == Long.MIN_VALUE) ? -9223372036854775807L : h9.e() + h9.f5272f.f5930e);
                                    }
                                    i19++;
                                }
                            }
                        }
                    }
                    fx3 h11 = this.f3013v.h();
                    if (h11 != null && this.f3013v.g() != h11 && !h11.f5273g) {
                        fx3 h12 = this.f3013v.h();
                        r84 i20 = h12.i();
                        int i21 = 0;
                        boolean z16 = false;
                        while (true) {
                            xx3[] xx3VarArr4 = this.f2997f;
                            if (i21 < 2) {
                                xx3 xx3Var4 = xx3VarArr4[i21];
                                if (H(xx3Var4)) {
                                    i74 k7 = xx3Var4.k();
                                    i74 i74Var3 = h12.f5269c[i21];
                                    if (!i20.b(i21) || k7 != i74Var3) {
                                        if (!xx3Var4.J()) {
                                            xx3Var4.r(P(i20.f11062e[i21]), h12.f5269c[i21], h12.f(), h12.e());
                                        } else if (xx3Var4.K()) {
                                            c(xx3Var4);
                                        } else {
                                            z16 = true;
                                        }
                                    }
                                }
                                i21++;
                            } else if (!z16) {
                                d();
                            }
                        }
                    }
                    boolean z17 = false;
                    while (K() && !this.C && (g7 = this.f3013v.g()) != null && (h8 = g7.h()) != null && this.M >= h8.f() && h8.f5273g) {
                        if (z17) {
                            p();
                        }
                        fx3 g8 = this.f3013v.g();
                        fx3 d8 = this.f3013v.d();
                        gx3 gx3Var = d8.f5272f;
                        s54 s54Var2 = gx3Var.f5926a;
                        long j14 = gx3Var.f5927b;
                        rx3 j03 = j0(s54Var2, j14, gx3Var.f5928c, j14, true, 0);
                        this.f3016y = j03;
                        ei0 ei0Var = j03.f11546a;
                        C(ei0Var, d8.f5272f.f5926a, ei0Var, g8.f5272f.f5926a, -9223372036854775807L);
                        r();
                        E();
                        uptimeMillis = uptimeMillis;
                        z17 = true;
                    }
                }
                long j15 = uptimeMillis;
                int i22 = this.f3016y.f11550e;
                if (i22 != 1 && i22 != 4) {
                    fx3 g9 = this.f3013v.g();
                    if (g9 == null) {
                        u(j15, 10L);
                    } else {
                        lz2.a("doSomeWork");
                        E();
                        if (g9.f5270d) {
                            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                            g9.f5267a.s(this.f3016y.f11564s - this.f3009r, false);
                            z7 = true;
                            z8 = true;
                            int i23 = 0;
                            while (true) {
                                xx3[] xx3VarArr5 = this.f2997f;
                                if (i23 < 2) {
                                    xx3 xx3Var5 = xx3VarArr5[i23];
                                    if (H(xx3Var5)) {
                                        xx3Var5.e(this.M, elapsedRealtime);
                                        z8 = z8 && xx3Var5.K();
                                        i74 i74Var4 = g9.f5269c[i23];
                                        i74 k8 = xx3Var5.k();
                                        boolean z18 = i74Var4 == k8 && xx3Var5.A();
                                        if (i74Var4 == k8 && !z18 && !xx3Var5.f0() && !xx3Var5.K()) {
                                            z12 = false;
                                            z7 = !z7 && z12;
                                            if (z12) {
                                                xx3Var5.l();
                                            }
                                        }
                                        z12 = true;
                                        if (z7) {
                                        }
                                        if (z12) {
                                        }
                                    }
                                    i23++;
                                }
                            }
                        } else {
                            g9.f5267a.i();
                            z7 = true;
                            z8 = true;
                        }
                        long j16 = g9.f5272f.f5930e;
                        if (z8 && g9.f5270d && (j16 == -9223372036854775807L || j16 <= this.f3016y.f11564s)) {
                            if (this.C) {
                                this.C = false;
                                w(false, this.f3016y.f11558m, false, 5);
                            }
                            if (g9.f5272f.f5934i) {
                                x(4);
                                A();
                                int i24 = 2;
                                if (this.f3016y.f11550e == 2) {
                                    int i25 = 0;
                                    while (true) {
                                        xx3[] xx3VarArr6 = this.f2997f;
                                        if (i25 < i24) {
                                            if (H(xx3VarArr6[i25]) && this.f2997f[i25].k() == g9.f5269c[i25]) {
                                                this.f2997f[i25].l();
                                            }
                                            i25++;
                                            i24 = 2;
                                        } else {
                                            rx3 rx3Var4 = this.f3016y;
                                            if (!rx3Var4.f11552g && rx3Var4.f11563r < 500000 && G()) {
                                                throw new IllegalStateException("Playback stuck buffering and not loading");
                                            }
                                        }
                                    }
                                }
                                z9 = this.J;
                                rx3Var = this.f3016y;
                                if (z9 != rx3Var.f11560o) {
                                    this.f3016y = rx3Var.c(z9);
                                }
                                if ((K() || this.f3016y.f11550e != 3) && (i8 = this.f3016y.f11550e) != 2) {
                                    if (this.K != 0 || i8 == 4) {
                                        this.f3004m.D(2);
                                    } else {
                                        u(j15, 1000L);
                                    }
                                    z10 = false;
                                } else {
                                    if (this.J && this.I) {
                                        z11 = false;
                                    } else {
                                        u(j15, 10L);
                                        z11 = true;
                                    }
                                    z10 = !z11;
                                }
                                rx3Var2 = this.f3016y;
                                if (rx3Var2.f11561p != z10) {
                                    this.f3016y = new rx3(rx3Var2.f11546a, rx3Var2.f11547b, rx3Var2.f11548c, rx3Var2.f11549d, rx3Var2.f11550e, rx3Var2.f11551f, rx3Var2.f11552g, rx3Var2.f11553h, rx3Var2.f11554i, rx3Var2.f11555j, rx3Var2.f11556k, rx3Var2.f11557l, rx3Var2.f11558m, rx3Var2.f11559n, rx3Var2.f11562q, rx3Var2.f11563r, rx3Var2.f11564s, rx3Var2.f11560o, z10);
                                }
                                this.I = false;
                                lz2.b();
                            }
                        }
                        rx3 rx3Var5 = this.f3016y;
                        if (rx3Var5.f11550e == 2) {
                            if (this.K == 0) {
                                break;
                            } else if (z7) {
                                if (rx3Var5.f11552g) {
                                    long b9 = L(rx3Var5.f11546a, this.f3013v.g().f5272f.f5926a) ? this.R.b() : -9223372036854775807L;
                                    fx3 f8 = this.f3013v.f();
                                    boolean z19 = f8.r() && f8.f5272f.f5934i;
                                    boolean z20 = f8.f5272f.f5926a.b() && !f8.f5270d;
                                    if (!z19) {
                                        if (!z20) {
                                            if (this.f3002k.e(d0(), this.f3010s.c().f4479a, this.D, b9)) {
                                            }
                                        }
                                    }
                                }
                                x(3);
                                this.P = null;
                                if (K()) {
                                    y();
                                }
                                int i242 = 2;
                                if (this.f3016y.f11550e == 2) {
                                }
                                z9 = this.J;
                                rx3Var = this.f3016y;
                                if (z9 != rx3Var.f11560o) {
                                }
                                if (K()) {
                                }
                                if (this.K != 0) {
                                }
                                this.f3004m.D(2);
                                z10 = false;
                                rx3Var2 = this.f3016y;
                                if (rx3Var2.f11561p != z10) {
                                }
                                this.I = false;
                                lz2.b();
                            }
                        }
                        if (this.f3016y.f11550e == 3) {
                            if (this.K == 0) {
                                if (!I()) {
                                    this.D = K();
                                    x(2);
                                    if (this.D) {
                                        for (fx3 g10 = this.f3013v.g(); g10 != null; g10 = g10.h()) {
                                            for (w74 w74Var : g10.i().f11062e) {
                                            }
                                        }
                                        this.R.c();
                                    }
                                }
                            }
                            A();
                        }
                        int i2422 = 2;
                        if (this.f3016y.f11550e == 2) {
                        }
                        z9 = this.J;
                        rx3Var = this.f3016y;
                        if (z9 != rx3Var.f11560o) {
                        }
                        if (K()) {
                        }
                        if (this.K != 0) {
                        }
                        this.f3004m.D(2);
                        z10 = false;
                        rx3Var2 = this.f3016y;
                        if (rx3Var2.f11561p != z10) {
                        }
                        this.I = false;
                        lz2.b();
                    }
                    z6 = true;
                    p();
                    return z6;
                }
                this.f3004m.D(2);
                z6 = true;
                p();
                return z6;
            case 3:
                zw3 zw3Var = (zw3) message.obj;
                this.f3017z.a(1);
                Pair<Object, Long> i02 = i0(this.f3016y.f11546a, zw3Var, true, this.F, this.G, this.f3007p, this.f3008q);
                try {
                    if (i02 == null) {
                        Pair<s54, Long> h02 = h0(this.f3016y.f11546a);
                        s54 s54Var3 = (s54) h02.first;
                        long longValue = ((Long) h02.second).longValue();
                        z13 = !this.f3016y.f11546a.o();
                        j7 = -9223372036854775807L;
                        j8 = longValue;
                        s54Var = s54Var3;
                    } else {
                        Object obj = i02.first;
                        long longValue2 = ((Long) i02.second).longValue();
                        j7 = zw3Var.f15284c == -9223372036854775807L ? -9223372036854775807L : longValue2;
                        s54 k9 = this.f3013v.k(this.f3016y.f11546a, obj, longValue2);
                        if (k9.b()) {
                            this.f3016y.f11546a.n(k9.f5772a, this.f3008q);
                            if (this.f3008q.d(k9.f5773b) == k9.f5774c) {
                                this.f3008q.h();
                            }
                            s54Var = k9;
                            z13 = true;
                            j9 = 0;
                            if (!this.f3016y.f11546a.o()) {
                                this.L = zw3Var;
                            } else if (i02 == null) {
                                if (this.f3016y.f11550e != 1) {
                                    x(4);
                                }
                                q(false, true, false, true);
                            } else {
                                try {
                                    if (s54Var.equals(this.f3016y.f11547b)) {
                                        fx3 g11 = this.f3013v.g();
                                        j11 = (g11 == null || !g11.f5270d || j9 == 0) ? j9 : g11.f5267a.l(j9, this.f3015x);
                                        if (nz3.d(j11) == nz3.d(this.f3016y.f11564s) && ((i10 = (rx3Var3 = this.f3016y).f11550e) == 2 || i10 == 3)) {
                                            long j17 = rx3Var3.f11564s;
                                            j02 = j0(s54Var, j17, j7, j17, z13, 2);
                                            this.f3016y = j02;
                                            z6 = true;
                                            p();
                                            return z6;
                                        }
                                    } else {
                                        j11 = j9;
                                    }
                                    rx3 rx3Var6 = this.f3016y;
                                    ei0 ei0Var2 = rx3Var6.f11546a;
                                    C(ei0Var2, s54Var, ei0Var2, rx3Var6.f11547b, j7);
                                    j02 = j0(s54Var, f02, j7, f02, z13, 2);
                                    this.f3016y = j02;
                                    z6 = true;
                                    p();
                                    return z6;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z14 = z13;
                                    j10 = f02;
                                    this.f3016y = j0(s54Var, j10, j7, j10, z14, 2);
                                    throw th;
                                }
                                f02 = f0(s54Var, j11, this.f3016y.f11550e == 4);
                                z13 |= j9 != f02;
                            }
                            f02 = j9;
                            j02 = j0(s54Var, f02, j7, f02, z13, 2);
                            this.f3016y = j02;
                            z6 = true;
                            p();
                            return z6;
                        }
                        long j18 = j7;
                        z13 = zw3Var.f15284c == -9223372036854775807L;
                        j7 = j18;
                        j8 = longValue2;
                        s54Var = k9;
                    }
                    if (!this.f3016y.f11546a.o()) {
                    }
                    f02 = j9;
                    j02 = j0(s54Var, f02, j7, f02, z13, 2);
                    this.f3016y = j02;
                    z6 = true;
                    p();
                    return z6;
                } catch (Throwable th3) {
                    th = th3;
                    z14 = z13;
                    j10 = j9;
                }
                j9 = j8;
                break;
            case 4:
                this.f3010s.c0((e30) message.obj);
                m(this.f3010s.c(), true);
                z6 = true;
                p();
                return z6;
            case 5:
                this.f3015x = (ay3) message.obj;
                z6 = true;
                p();
                return z6;
            case 6:
                z(false, true);
                z6 = true;
                p();
                return z6;
            case c4.w0.f2149o /* 7 */:
                q(true, false, true, false);
                this.f3002k.c();
                x(1);
                this.f3005n.quit();
                synchronized (this) {
                    this.A = true;
                    notifyAll();
                }
                return true;
            case c4.w0.f2150p /* 8 */:
                if (this.f3013v.o((r54) message.obj)) {
                    fx3 f9 = this.f3013v.f();
                    f9.l(this.f3010s.c().f4479a, this.f3016y.f11546a);
                    D(f9.g(), f9.i());
                    if (f9 == this.f3013v.g()) {
                        s(f9.f5272f.f5927b);
                        d();
                        rx3 rx3Var7 = this.f3016y;
                        s54 s54Var4 = rx3Var7.f11547b;
                        long j19 = f9.f5272f.f5927b;
                        this.f3016y = j0(s54Var4, j19, rx3Var7.f11548c, j19, false, 5);
                    }
                    o();
                }
                z6 = true;
                p();
                return z6;
            case 9:
                if (this.f3013v.o((r54) message.obj)) {
                    this.f3013v.n(this.M);
                    o();
                }
                z6 = true;
                p();
                return z6;
            case 10:
                float f10 = this.f3010s.c().f4479a;
                fx3 g12 = this.f3013v.g();
                fx3 h13 = this.f3013v.h();
                boolean z21 = true;
                while (g12 != null && g12.f5270d) {
                    r84 j20 = g12.j(f10, this.f3016y.f11546a);
                    r84 i26 = g12.i();
                    if (i26 != null && i26.f11062e.length == j20.f11062e.length) {
                        for (int i27 = 0; i27 < j20.f11062e.length; i27++) {
                            if (j20.a(i26, i27)) {
                            }
                        }
                        z21 &= g12 != h13;
                        g12 = g12.h();
                    }
                    if (z21) {
                        fx3 g13 = this.f3013v.g();
                        boolean[] zArr = new boolean[2];
                        long b10 = g13.b(j20, this.f3016y.f11564s, this.f3013v.p(g13), zArr);
                        rx3 rx3Var8 = this.f3016y;
                        boolean z22 = (rx3Var8.f11550e == 4 || b10 == rx3Var8.f11564s) ? false : true;
                        rx3 rx3Var9 = this.f3016y;
                        i11 = 2;
                        fx3 fx3Var = g13;
                        this.f3016y = j0(rx3Var9.f11547b, b10, rx3Var9.f11548c, rx3Var9.f11549d, z22, 5);
                        if (z22) {
                            s(b10);
                        }
                        boolean[] zArr2 = new boolean[2];
                        int i28 = 0;
                        while (true) {
                            xx3[] xx3VarArr7 = this.f2997f;
                            if (i28 < 2) {
                                xx3 xx3Var6 = xx3VarArr7[i28];
                                boolean H = H(xx3Var6);
                                zArr2[i28] = H;
                                fx3 fx3Var2 = fx3Var;
                                i74 i74Var5 = fx3Var2.f5269c[i28];
                                if (H) {
                                    if (i74Var5 != xx3Var6.k()) {
                                        c(xx3Var6);
                                    } else if (zArr[i28]) {
                                        xx3Var6.g(this.M);
                                    }
                                }
                                i28++;
                                fx3Var = fx3Var2;
                            } else {
                                e(zArr2);
                            }
                        }
                    } else {
                        i11 = 2;
                        this.f3013v.p(g12);
                        if (g12.f5270d) {
                            g12.a(j20, Math.max(g12.f5272f.f5927b, this.M - g12.e()), false);
                        }
                    }
                    j(true);
                    if (this.f3016y.f11550e != 4) {
                        o();
                        E();
                        this.f3004m.O(i11);
                    }
                }
                z6 = true;
                p();
                return z6;
            case 11:
                int i29 = message.arg1;
                this.F = i29;
                if (!this.f3013v.s(this.f3016y.f11546a, i29)) {
                    v(true);
                }
                j(false);
                z6 = true;
                p();
                return z6;
            case 12:
                boolean z23 = message.arg1 != 0;
                this.G = z23;
                if (!this.f3013v.t(this.f3016y.f11546a, z23)) {
                    v(true);
                }
                j(false);
                z6 = true;
                p();
                return z6;
            case 13:
                boolean z24 = message.arg1 != 0;
                AtomicBoolean atomicBoolean = (AtomicBoolean) message.obj;
                if (this.H != z24) {
                    this.H = z24;
                    if (!z24) {
                        xx3[] xx3VarArr8 = this.f2997f;
                        for (int i30 = 0; i30 < 2; i30++) {
                            xx3 xx3Var7 = xx3VarArr8[i30];
                            if (!H(xx3Var7) && this.f2998g.remove(xx3Var7)) {
                                xx3Var7.C();
                            }
                        }
                    }
                }
                if (atomicBoolean != null) {
                    synchronized (this) {
                        atomicBoolean.set(true);
                        notifyAll();
                    }
                }
                z6 = true;
                p();
                return z6;
            case 14:
                ux3 ux3Var = (ux3) message.obj;
                if (ux3Var.b() == this.f3006o) {
                    M(ux3Var);
                    int i31 = this.f3016y.f11550e;
                    if (i31 == 3 || i31 == 2) {
                        h52Var = this.f3004m;
                        h52Var.O(2);
                    }
                } else {
                    this.f3004m.G(15, ux3Var).zza();
                }
                z6 = true;
                p();
                return z6;
            case 15:
                final ux3 ux3Var2 = (ux3) message.obj;
                Looper b11 = ux3Var2.b();
                if (b11.getThread().isAlive()) {
                    this.f3012u.a(b11, null).F(new Runnable() { // from class: com.google.android.gms.internal.ads.sw3
                        @Override // java.lang.Runnable
                        public final void run() {
                            ax3.b0(ux3Var2);
                        }
                    });
                } else {
                    Log.w("TAG", "Trying to send message on a dead thread.");
                    ux3Var2.h(false);
                }
                z6 = true;
                p();
                return z6;
            case 16:
                m((e30) message.obj, false);
                z6 = true;
                p();
                return z6;
            case 17:
                vw3 vw3Var = (vw3) message.obj;
                this.f3017z.a(1);
                i12 = vw3Var.f13524b;
                if (i12 != -1) {
                    list2 = vw3Var.f13523a;
                    l74Var2 = vw3Var.f13526d;
                    vx3 vx3Var = new vx3(list2, l74Var2, null);
                    i13 = vw3Var.f13524b;
                    j12 = vw3Var.f13525c;
                    this.L = new zw3(vx3Var, i13, j12);
                }
                qx3 qx3Var = this.f3014w;
                list = vw3Var.f13523a;
                l74Var = vw3Var.f13526d;
                m7 = qx3Var.m(list, l74Var);
                l(m7, false);
                z6 = true;
                p();
                return z6;
            case 18:
                vw3 vw3Var2 = (vw3) message.obj;
                int i32 = message.arg1;
                this.f3017z.a(1);
                qx3 qx3Var2 = this.f3014w;
                if (i32 == -1) {
                    i32 = qx3Var2.a();
                }
                list3 = vw3Var2.f13523a;
                l74Var3 = vw3Var2.f13526d;
                m7 = qx3Var2.j(i32, list3, l74Var3);
                l(m7, false);
                z6 = true;
                p();
                return z6;
            case 19:
                ww3 ww3Var = (ww3) message.obj;
                this.f3017z.a(1);
                qx3 qx3Var3 = this.f3014w;
                int i33 = ww3Var.f13958a;
                m7 = qx3Var3.k(0, 0, 0, null);
                l(m7, false);
                z6 = true;
                p();
                return z6;
            case 20:
                int i34 = message.arg1;
                int i35 = message.arg2;
                l74 l74Var4 = (l74) message.obj;
                this.f3017z.a(1);
                m7 = this.f3014w.l(i34, i35, l74Var4);
                l(m7, false);
                z6 = true;
                p();
                return z6;
            case 21:
                l74 l74Var5 = (l74) message.obj;
                this.f3017z.a(1);
                m7 = this.f3014w.n(l74Var5);
                l(m7, false);
                z6 = true;
                p();
                return z6;
            case 22:
                l(this.f3014w.b(), true);
                z6 = true;
                p();
                return z6;
            case 23:
                this.B = message.arg1 != 0;
                r();
                if (this.C && this.f3013v.h() != this.f3013v.g()) {
                    v(true);
                    j(false);
                }
                z6 = true;
                p();
                return z6;
            case 24:
                boolean z25 = message.arg1 == 1;
                if (z25 != this.J) {
                    this.J = z25;
                    rx3 rx3Var10 = this.f3016y;
                    int i36 = rx3Var10.f11550e;
                    if (!z25 && i36 != 4 && i36 != 1) {
                        h52Var = this.f3004m;
                        h52Var.O(2);
                    }
                    j02 = rx3Var10.c(z25);
                    this.f3016y = j02;
                }
                z6 = true;
                p();
                return z6;
            case 25:
                v(true);
                z6 = true;
                p();
                return z6;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.p84
    public final void i() {
        this.f3004m.O(10);
    }

    @Override // com.google.android.gms.internal.ads.j74
    public final /* bridge */ /* synthetic */ void k(r54 r54Var) {
        this.f3004m.G(9, r54Var).zza();
    }
}
