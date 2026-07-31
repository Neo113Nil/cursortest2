package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
final class t64 implements r54, rc4, r94, x94, g74 {
    private static final Map<String, String> Q;
    private static final c0 R;
    private pd4 A;
    private boolean C;
    private boolean E;
    private boolean F;
    private int G;
    private long I;
    private boolean K;
    private int L;
    private boolean M;
    private boolean N;
    private final m94 O;
    private final g94 P;

    /* renamed from: f, reason: collision with root package name */
    private final Uri f12107f;

    /* renamed from: g, reason: collision with root package name */
    private final he1 f12108g;

    /* renamed from: h, reason: collision with root package name */
    private final b34 f12109h;

    /* renamed from: i, reason: collision with root package name */
    private final c64 f12110i;

    /* renamed from: j, reason: collision with root package name */
    private final v24 f12111j;

    /* renamed from: k, reason: collision with root package name */
    private final p64 f12112k;

    /* renamed from: l, reason: collision with root package name */
    private final long f12113l;

    /* renamed from: n, reason: collision with root package name */
    private final k64 f12115n;

    /* renamed from: s, reason: collision with root package name */
    private q54 f12120s;

    /* renamed from: t, reason: collision with root package name */
    private ff4 f12121t;

    /* renamed from: w, reason: collision with root package name */
    private boolean f12124w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f12125x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f12126y;

    /* renamed from: z, reason: collision with root package name */
    private s64 f12127z;

    /* renamed from: m, reason: collision with root package name */
    private final aa4 f12114m = new aa4("ProgressiveMediaPeriod");

    /* renamed from: o, reason: collision with root package name */
    private final ay1 f12116o = new ay1(xv1.f14362a);

    /* renamed from: p, reason: collision with root package name */
    private final Runnable f12117p = new Runnable() { // from class: com.google.android.gms.internal.ads.m64
        @Override // java.lang.Runnable
        public final void run() {
            t64.this.F();
        }
    };

    /* renamed from: q, reason: collision with root package name */
    private final Runnable f12118q = new Runnable() { // from class: com.google.android.gms.internal.ads.l64
        @Override // java.lang.Runnable
        public final void run() {
            t64.this.u();
        }
    };

    /* renamed from: r, reason: collision with root package name */
    private final Handler f12119r = n13.f0(null);

    /* renamed from: v, reason: collision with root package name */
    private r64[] f12123v = new r64[0];

    /* renamed from: u, reason: collision with root package name */
    private h74[] f12122u = new h74[0];
    private long J = -9223372036854775807L;
    private long H = -1;
    private long B = -9223372036854775807L;
    private int D = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        Q = Collections.unmodifiableMap(hashMap);
        bf4 bf4Var = new bf4();
        bf4Var.h("icy");
        bf4Var.s("application/x-icy");
        R = bf4Var.y();
    }

    public t64(Uri uri, he1 he1Var, k64 k64Var, b34 b34Var, v24 v24Var, m94 m94Var, c64 c64Var, p64 p64Var, g94 g94Var, String str, int i7, byte[] bArr) {
        this.f12107f = uri;
        this.f12108g = he1Var;
        this.f12109h = b34Var;
        this.f12111j = v24Var;
        this.O = m94Var;
        this.f12110i = c64Var;
        this.f12112k = p64Var;
        this.P = g94Var;
        this.f12113l = i7;
        this.f12115n = k64Var;
    }

    private final int A() {
        int i7 = 0;
        for (h74 h74Var : this.f12122u) {
            i7 += h74Var.u();
        }
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long B() {
        long j7 = Long.MIN_VALUE;
        for (h74 h74Var : this.f12122u) {
            j7 = Math.max(j7, h74Var.w());
        }
        return j7;
    }

    private final td4 C(r64 r64Var) {
        int length = this.f12122u.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (r64Var.equals(this.f12123v[i7])) {
                return this.f12122u[i7];
            }
        }
        g94 g94Var = this.P;
        Looper looper = this.f12119r.getLooper();
        b34 b34Var = this.f12109h;
        v24 v24Var = this.f12111j;
        Objects.requireNonNull(looper);
        Objects.requireNonNull(b34Var);
        h74 h74Var = new h74(g94Var, looper, b34Var, v24Var, null);
        h74Var.G(this);
        int i8 = length + 1;
        r64[] r64VarArr = (r64[]) Arrays.copyOf(this.f12123v, i8);
        r64VarArr[length] = r64Var;
        this.f12123v = (r64[]) n13.y(r64VarArr);
        h74[] h74VarArr = (h74[]) Arrays.copyOf(this.f12122u, i8);
        h74VarArr[length] = h74Var;
        this.f12122u = (h74[]) n13.y(h74VarArr);
        return h74Var;
    }

    private final void D() {
        wu1.f(this.f12125x);
        Objects.requireNonNull(this.f12127z);
        Objects.requireNonNull(this.A);
    }

    private final void E(o64 o64Var) {
        long j7;
        if (this.H == -1) {
            j7 = o64Var.f9552l;
            this.H = j7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        if (this.N || this.f12125x || !this.f12124w || this.A == null) {
            return;
        }
        for (h74 h74Var : this.f12122u) {
            if (h74Var.x() == null) {
                return;
            }
        }
        this.f12116o.c();
        int length = this.f12122u.length;
        gk0[] gk0VarArr = new gk0[length];
        boolean[] zArr = new boolean[length];
        for (int i7 = 0; i7 < length; i7++) {
            c0 x6 = this.f12122u[i7].x();
            Objects.requireNonNull(x6);
            String str = x6.f3660l;
            boolean g7 = dy.g(str);
            boolean z6 = g7 || dy.h(str);
            zArr[i7] = z6;
            this.f12126y = z6 | this.f12126y;
            ff4 ff4Var = this.f12121t;
            if (ff4Var != null) {
                if (g7 || this.f12123v[i7].f11043b) {
                    c91 c91Var = x6.f3658j;
                    c91 c91Var2 = c91Var == null ? new c91(ff4Var) : c91Var.g(ff4Var);
                    bf4 b7 = x6.b();
                    b7.m(c91Var2);
                    x6 = b7.y();
                }
                if (g7 && x6.f3654f == -1 && x6.f3655g == -1 && ff4Var.f5100f != -1) {
                    bf4 b8 = x6.b();
                    b8.d0(ff4Var.f5100f);
                    x6 = b8.y();
                }
            }
            gk0VarArr[i7] = new gk0(x6.c(this.f12109h.a(x6)));
        }
        this.f12127z = new s64(new hm0(gk0VarArr), zArr);
        this.f12125x = true;
        q54 q54Var = this.f12120s;
        Objects.requireNonNull(q54Var);
        q54Var.h(this);
    }

    private final void G(int i7) {
        D();
        s64 s64Var = this.f12127z;
        boolean[] zArr = s64Var.f11684d;
        if (zArr[i7]) {
            return;
        }
        c0 b7 = s64Var.f11681a.b(i7).b(0);
        this.f12110i.d(dy.a(b7.f3660l), b7, 0, null, this.I);
        zArr[i7] = true;
    }

    private final void I(int i7) {
        D();
        boolean[] zArr = this.f12127z.f11682b;
        if (this.K && zArr[i7] && !this.f12122u[i7].J(false)) {
            this.J = 0L;
            this.K = false;
            this.F = true;
            this.I = 0L;
            this.L = 0;
            for (h74 h74Var : this.f12122u) {
                h74Var.E(false);
            }
            q54 q54Var = this.f12120s;
            Objects.requireNonNull(q54Var);
            q54Var.k(this);
        }
    }

    private final void J() {
        li1 li1Var;
        long j7;
        long j8;
        o64 o64Var = new o64(this, this.f12107f, this.f12108g, this.f12115n, this, this.f12116o);
        if (this.f12125x) {
            wu1.f(K());
            long j9 = this.B;
            if (j9 != -9223372036854775807L && this.J > j9) {
                this.M = true;
                this.J = -9223372036854775807L;
                return;
            }
            pd4 pd4Var = this.A;
            Objects.requireNonNull(pd4Var);
            o64.i(o64Var, pd4Var.d(this.J).f9056a.f10662b, this.J);
            for (h74 h74Var : this.f12122u) {
                h74Var.F(this.J);
            }
            this.J = -9223372036854775807L;
        }
        this.L = A();
        long a7 = this.f12114m.a(o64Var, this, m94.a(this.D));
        li1Var = o64Var.f9551k;
        c64 c64Var = this.f12110i;
        j7 = o64Var.f9541a;
        k54 k54Var = new k54(j7, li1Var, li1Var.f7985a, Collections.emptyMap(), a7, 0L, 0L);
        j8 = o64Var.f9550j;
        c64Var.l(k54Var, 1, -1, null, 0, null, j8, this.B);
    }

    private final boolean K() {
        return this.J != -9223372036854775807L;
    }

    private final boolean M() {
        return this.F || K();
    }

    @Override // com.google.android.gms.internal.ads.rc4
    public final void H() {
        this.f12124w = true;
        this.f12119r.post(this.f12117p);
    }

    @Override // com.google.android.gms.internal.ads.x94
    public final void L() {
        for (h74 h74Var : this.f12122u) {
            h74Var.D();
        }
        this.f12115n.b();
    }

    final int N(int i7, cx3 cx3Var, z51 z51Var, int i8) {
        if (M()) {
            return -3;
        }
        G(i7);
        int v6 = this.f12122u[i7].v(cx3Var, z51Var, i8, this.M);
        if (v6 == -3) {
            I(i7);
        }
        return v6;
    }

    final int O(int i7, long j7) {
        if (M()) {
            return 0;
        }
        G(i7);
        h74 h74Var = this.f12122u[i7];
        int t6 = h74Var.t(j7, this.M);
        h74Var.H(t6);
        if (t6 != 0) {
            return t6;
        }
        I(i7);
        return 0;
    }

    final td4 T() {
        return C(new r64(0, true));
    }

    @Override // com.google.android.gms.internal.ads.r54, com.google.android.gms.internal.ads.k74
    public final long a() {
        long j7;
        D();
        boolean[] zArr = this.f12127z.f11682b;
        if (this.M) {
            return Long.MIN_VALUE;
        }
        if (K()) {
            return this.J;
        }
        if (this.f12126y) {
            int length = this.f12122u.length;
            j7 = Long.MAX_VALUE;
            for (int i7 = 0; i7 < length; i7++) {
                if (zArr[i7] && !this.f12122u[i7].I()) {
                    j7 = Math.min(j7, this.f12122u[i7].w());
                }
            }
        } else {
            j7 = Long.MAX_VALUE;
        }
        if (j7 == Long.MAX_VALUE) {
            j7 = B();
        }
        return j7 == Long.MIN_VALUE ? this.I : j7;
    }

    @Override // com.google.android.gms.internal.ads.r54, com.google.android.gms.internal.ads.k74
    public final boolean b(long j7) {
        if (this.M || this.f12114m.k() || this.K) {
            return false;
        }
        if (this.f12125x && this.G == 0) {
            return false;
        }
        boolean e7 = this.f12116o.e();
        if (this.f12114m.l()) {
            return e7;
        }
        J();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.r54, com.google.android.gms.internal.ads.k74
    public final long c() {
        if (this.G == 0) {
            return Long.MIN_VALUE;
        }
        return a();
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final hm0 d() {
        D();
        return this.f12127z.f11681a;
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final long e(long j7) {
        int i7;
        D();
        boolean[] zArr = this.f12127z.f11682b;
        if (true != this.A.f()) {
            j7 = 0;
        }
        this.F = false;
        this.I = j7;
        if (K()) {
            this.J = j7;
            return j7;
        }
        if (this.D != 7) {
            int length = this.f12122u.length;
            while (i7 < length) {
                i7 = (this.f12122u[i7].K(j7, false) || (!zArr[i7] && this.f12126y)) ? i7 + 1 : 0;
            }
            return j7;
        }
        this.K = false;
        this.J = j7;
        this.M = false;
        if (this.f12114m.l()) {
            for (h74 h74Var : this.f12122u) {
                h74Var.z();
            }
            this.f12114m.g();
        } else {
            this.f12114m.h();
            for (h74 h74Var2 : this.f12122u) {
                h74Var2.E(false);
            }
        }
        return j7;
    }

    @Override // com.google.android.gms.internal.ads.r54, com.google.android.gms.internal.ads.k74
    public final void f(long j7) {
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final long g() {
        if (!this.F) {
            return -9223372036854775807L;
        }
        if (!this.M && A() <= this.L) {
            return -9223372036854775807L;
        }
        this.F = false;
        return this.I;
    }

    @Override // com.google.android.gms.internal.ads.r94
    public final /* bridge */ /* synthetic */ void h(v94 v94Var, long j7, long j8) {
        ia4 ia4Var;
        long j9;
        li1 li1Var;
        long j10;
        pd4 pd4Var;
        long unused;
        if (this.B == -9223372036854775807L && (pd4Var = this.A) != null) {
            boolean f7 = pd4Var.f();
            long B = B();
            long j11 = B == Long.MIN_VALUE ? 0L : B + 10000;
            this.B = j11;
            this.f12112k.g(j11, f7, this.C);
        }
        o64 o64Var = (o64) v94Var;
        ia4Var = o64Var.f9543c;
        j9 = o64Var.f9541a;
        li1Var = o64Var.f9551k;
        k54 k54Var = new k54(j9, li1Var, ia4Var.o(), ia4Var.p(), j7, j8, ia4Var.c());
        unused = o64Var.f9541a;
        c64 c64Var = this.f12110i;
        j10 = o64Var.f9550j;
        c64Var.h(k54Var, 1, -1, null, 0, null, j10, this.B);
        E(o64Var);
        this.M = true;
        q54 q54Var = this.f12120s;
        Objects.requireNonNull(q54Var);
        q54Var.k(this);
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final void i() {
        w();
        if (this.M && !this.f12125x) {
            throw dz.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final long j(w74[] w74VarArr, boolean[] zArr, i74[] i74VarArr, boolean[] zArr2, long j7) {
        w74 w74Var;
        int i7;
        D();
        s64 s64Var = this.f12127z;
        hm0 hm0Var = s64Var.f11681a;
        boolean[] zArr3 = s64Var.f11683c;
        int i8 = this.G;
        int i9 = 0;
        for (int i10 = 0; i10 < w74VarArr.length; i10++) {
            i74 i74Var = i74VarArr[i10];
            if (i74Var != null && (w74VarArr[i10] == null || !zArr[i10])) {
                i7 = ((q64) i74Var).f10598a;
                wu1.f(zArr3[i7]);
                this.G--;
                zArr3[i7] = false;
                i74VarArr[i10] = null;
            }
        }
        boolean z6 = !this.E ? j7 == 0 : i8 != 0;
        for (int i11 = 0; i11 < w74VarArr.length; i11++) {
            if (i74VarArr[i11] == null && (w74Var = w74VarArr[i11]) != null) {
                wu1.f(w74Var.b() == 1);
                wu1.f(w74Var.a(0) == 0);
                int a7 = hm0Var.a(w74Var.d());
                wu1.f(!zArr3[a7]);
                this.G++;
                zArr3[a7] = true;
                i74VarArr[i11] = new q64(this, a7);
                zArr2[i11] = true;
                if (!z6) {
                    h74 h74Var = this.f12122u[a7];
                    z6 = (h74Var.K(j7, true) || h74Var.s() == 0) ? false : true;
                }
            }
        }
        if (this.G == 0) {
            this.K = false;
            this.F = false;
            if (this.f12114m.l()) {
                h74[] h74VarArr = this.f12122u;
                int length = h74VarArr.length;
                while (i9 < length) {
                    h74VarArr[i9].z();
                    i9++;
                }
                this.f12114m.g();
            } else {
                for (h74 h74Var2 : this.f12122u) {
                    h74Var2.E(false);
                }
            }
        } else if (z6) {
            j7 = e(j7);
            while (i9 < i74VarArr.length) {
                if (i74VarArr[i9] != null) {
                    zArr2[i9] = true;
                }
                i9++;
            }
        }
        this.E = true;
        return j7;
    }

    @Override // com.google.android.gms.internal.ads.r94
    public final /* bridge */ /* synthetic */ void k(v94 v94Var, long j7, long j8, boolean z6) {
        ia4 ia4Var;
        long j9;
        li1 li1Var;
        long j10;
        long unused;
        o64 o64Var = (o64) v94Var;
        ia4Var = o64Var.f9543c;
        j9 = o64Var.f9541a;
        li1Var = o64Var.f9551k;
        k54 k54Var = new k54(j9, li1Var, ia4Var.o(), ia4Var.p(), j7, j8, ia4Var.c());
        unused = o64Var.f9541a;
        c64 c64Var = this.f12110i;
        j10 = o64Var.f9550j;
        c64Var.f(k54Var, 1, -1, null, 0, null, j10, this.B);
        if (z6) {
            return;
        }
        E(o64Var);
        for (h74 h74Var : this.f12122u) {
            h74Var.E(false);
        }
        if (this.G > 0) {
            q54 q54Var = this.f12120s;
            Objects.requireNonNull(q54Var);
            q54Var.k(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final long l(long j7, ay3 ay3Var) {
        D();
        if (!this.A.f()) {
            return 0L;
        }
        nd4 d7 = this.A.d(j7);
        long j8 = d7.f9056a.f10661a;
        long j9 = d7.f9057b.f10661a;
        long j10 = ay3Var.f3033a;
        if (j10 == 0 && ay3Var.f3034b == 0) {
            return j7;
        }
        long a02 = n13.a0(j7, j10, Long.MIN_VALUE);
        long T = n13.T(j7, ay3Var.f3034b, Long.MAX_VALUE);
        boolean z6 = a02 <= j8 && j8 <= T;
        boolean z7 = a02 <= j9 && j9 <= T;
        if (z6 && z7) {
            if (Math.abs(j8 - j7) > Math.abs(j9 - j7)) {
                return j9;
            }
        } else if (!z6) {
            return z7 ? j9 : a02;
        }
        return j8;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    @Override // com.google.android.gms.internal.ads.r94
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ t94 m(v94 v94Var, long j7, long j8, IOException iOException, int i7) {
        ia4 ia4Var;
        long j9;
        li1 li1Var;
        long j10;
        long j11;
        t94 b7;
        pd4 pd4Var;
        boolean z6;
        long j12;
        long unused;
        o64 o64Var = (o64) v94Var;
        E(o64Var);
        ia4Var = o64Var.f9543c;
        j9 = o64Var.f9541a;
        li1Var = o64Var.f9551k;
        k54 k54Var = new k54(j9, li1Var, ia4Var.o(), ia4Var.p(), j7, j8, ia4Var.c());
        j10 = o64Var.f9550j;
        Throwable th = new q94(k54Var, new p54(1, -1, null, 0, null, nz3.d(j10), nz3.d(this.B)), iOException, i7).f10632c;
        if (!(th instanceof dz) && !(th instanceof FileNotFoundException) && !(th instanceof pn1) && !(th instanceof z94)) {
            while (th != null) {
                if (!(th instanceof if1) || ((if1) th).f6637f != 2008) {
                    th = th.getCause();
                }
            }
            j11 = Math.min((r3.f10633d - 1) * 1000, 5000);
            if (j11 != -9223372036854775807L) {
                b7 = aa4.f2704g;
            } else {
                int A = A();
                boolean z7 = A > this.L;
                if (this.H != -1 || ((pd4Var = this.A) != null && pd4Var.b() != -9223372036854775807L)) {
                    this.L = A;
                } else if (!this.f12125x || M()) {
                    this.F = this.f12125x;
                    this.I = 0L;
                    this.L = 0;
                    for (h74 h74Var : this.f12122u) {
                        h74Var.E(false);
                    }
                    o64.i(o64Var, 0L, 0L);
                } else {
                    this.K = true;
                    b7 = aa4.f2703f;
                }
                b7 = aa4.b(z7, j11);
            }
            z6 = !b7.c();
            c64 c64Var = this.f12110i;
            j12 = o64Var.f9550j;
            c64Var.j(k54Var, 1, -1, null, 0, null, j12, this.B, iOException, z6);
            if (z6) {
                unused = o64Var.f9541a;
            }
            return b7;
        }
        j11 = -9223372036854775807L;
        if (j11 != -9223372036854775807L) {
        }
        z6 = !b7.c();
        c64 c64Var2 = this.f12110i;
        j12 = o64Var.f9550j;
        c64Var2.j(k54Var, 1, -1, null, 0, null, j12, this.B, iOException, z6);
        if (z6) {
        }
        return b7;
    }

    @Override // com.google.android.gms.internal.ads.r54, com.google.android.gms.internal.ads.k74
    public final boolean n() {
        return this.f12114m.l() && this.f12116o.d();
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final void o(q54 q54Var, long j7) {
        this.f12120s = q54Var;
        this.f12116o.e();
        J();
    }

    @Override // com.google.android.gms.internal.ads.rc4
    public final void p(final pd4 pd4Var) {
        this.f12119r.post(new Runnable() { // from class: com.google.android.gms.internal.ads.n64
            @Override // java.lang.Runnable
            public final void run() {
                t64.this.v(pd4Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.g74
    public final void q(c0 c0Var) {
        this.f12119r.post(this.f12117p);
    }

    @Override // com.google.android.gms.internal.ads.rc4
    public final td4 r(int i7, int i8) {
        return C(new r64(i7, false));
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final void s(long j7, boolean z6) {
        D();
        if (K()) {
            return;
        }
        boolean[] zArr = this.f12127z.f11683c;
        int length = this.f12122u.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.f12122u[i7].y(j7, false, zArr[i7]);
        }
    }

    final /* synthetic */ void u() {
        if (this.N) {
            return;
        }
        q54 q54Var = this.f12120s;
        Objects.requireNonNull(q54Var);
        q54Var.k(this);
    }

    final /* synthetic */ void v(pd4 pd4Var) {
        this.A = this.f12121t == null ? pd4Var : new od4(-9223372036854775807L, 0L);
        this.B = pd4Var.b();
        boolean z6 = false;
        if (this.H == -1 && pd4Var.b() == -9223372036854775807L) {
            z6 = true;
        }
        this.C = z6;
        this.D = true == z6 ? 7 : 1;
        this.f12112k.g(this.B, pd4Var.f(), this.C);
        if (this.f12125x) {
            return;
        }
        F();
    }

    final void w() {
        this.f12114m.i(m94.a(this.D));
    }

    final void x(int i7) {
        this.f12122u[i7].B();
        w();
    }

    public final void y() {
        if (this.f12125x) {
            for (h74 h74Var : this.f12122u) {
                h74Var.C();
            }
        }
        this.f12114m.j(this);
        this.f12119r.removeCallbacksAndMessages(null);
        this.f12120s = null;
        this.N = true;
    }

    final boolean z(int i7) {
        return !M() && this.f12122u[i7].J(this.M);
    }
}
