package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class PQ implements AQ, Q0 {

    /* renamed from: u0, reason: collision with root package name */
    public static final Map f26928u0;

    /* renamed from: v0, reason: collision with root package name */
    public static final TP f26929v0;

    /* renamed from: A, reason: collision with root package name */
    public final long f26930A;

    /* renamed from: B, reason: collision with root package name */
    public final long f26931B;

    /* renamed from: D, reason: collision with root package name */
    public final C4017ue f26933D;

    /* renamed from: I, reason: collision with root package name */
    public Object f26938I;
    public R1 J;

    /* renamed from: N, reason: collision with root package name */
    public boolean f26942N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f26943O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f26944P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f26945Q;

    /* renamed from: R, reason: collision with root package name */
    public PE f26946R;

    /* renamed from: S, reason: collision with root package name */
    public InterfaceC3015c1 f26947S;

    /* renamed from: T, reason: collision with root package name */
    public long f26948T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f26949U;

    /* renamed from: W, reason: collision with root package name */
    public boolean f26951W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f26952X;
    public boolean Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f26953Z;

    /* renamed from: n, reason: collision with root package name */
    public final Uri f26954n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f26955n0;

    /* renamed from: o0, reason: collision with root package name */
    public long f26956o0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f26958q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f26959r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f26960s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f26961t0;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC3572mH f26962u;

    /* renamed from: v, reason: collision with root package name */
    public final T2 f26963v;

    /* renamed from: w, reason: collision with root package name */
    public final NP f26964w;

    /* renamed from: x, reason: collision with root package name */
    public final NP f26965x;

    /* renamed from: y, reason: collision with root package name */
    public final RQ f26966y;

    /* renamed from: z, reason: collision with root package name */
    public final InterfaceC3985u f26967z;

    /* renamed from: C, reason: collision with root package name */
    public final C4017ue f26932C = new C4017ue(1);

    /* renamed from: E, reason: collision with root package name */
    public final C2865Xm f26934E = new C2865Xm();

    /* renamed from: F, reason: collision with root package name */
    public final E f26935F = new E(this, 3);

    /* renamed from: G, reason: collision with root package name */
    public final E f26936G = new E(this, 1);

    /* renamed from: H, reason: collision with root package name */
    public final Handler f26937H = AbstractC3548lu.p();

    /* renamed from: M, reason: collision with root package name */
    public OQ[] f26941M = new OQ[0];

    /* renamed from: L, reason: collision with root package name */
    public UQ[] f26940L = new UQ[0];

    /* renamed from: K, reason: collision with root package name */
    public LQ[] f26939K = new LQ[0];

    /* renamed from: p0, reason: collision with root package name */
    public long f26957p0 = com.anythink.basead.exoplayer.b.f6539b;

    /* renamed from: V, reason: collision with root package name */
    public int f26950V = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f26928u0 = Collections.unmodifiableMap(hashMap);
        C4065vP c4065vP = new C4065vP();
        c4065vP.f34773a = "icy";
        c4065vP.e("application/x-icy");
        f26929v0 = new TP(c4065vP);
    }

    public PQ(Uri uri, InterfaceC3572mH interfaceC3572mH, C4017ue c4017ue, T2 t22, NP np, NP np2, RQ rq, InterfaceC3985u interfaceC3985u, int i, long j9) {
        this.f26954n = uri;
        this.f26962u = interfaceC3572mH;
        this.f26963v = t22;
        this.f26965x = np;
        this.f26964w = np2;
        this.f26966y = rq;
        this.f26967z = interfaceC3985u;
        this.f26930A = i;
        this.f26933D = c4017ue;
        this.f26931B = j9;
    }

    public final boolean A() {
        return this.f26957p0 != com.anythink.basead.exoplayer.b.f6539b;
    }

    public final void B() {
        PA.T(this.f26943O);
        this.f26946R.getClass();
        this.f26947S.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (r13 == Long.MIN_VALUE) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0065  */
    @Override // com.google.android.gms.internal.ads.AQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j9, HO ho) {
        long j10;
        boolean z8;
        B();
        if (!this.f26947S.d()) {
            return 0L;
        }
        C2961b1 c4 = this.f26947S.c(j9);
        C3070d1 c3070d1 = c4.f29379a;
        long j11 = ho.f25363a;
        if (j11 == 0) {
            return j9;
        }
        String str = AbstractC3548lu.f32613a;
        long j12 = j9 - j11;
        long j13 = Long.MAX_VALUE;
        long j14 = (((j9 ^ j12) > 0L ? 1 : ((j9 ^ j12) == 0L ? 0 : -1)) >= 0) | (((j11 ^ j9) > 0L ? 1 : ((j11 ^ j9) == 0L ? 0 : -1)) >= 0) ? j12 : ((j12 >>> 63) ^ 1) + Long.MAX_VALUE;
        long j15 = Long.MIN_VALUE;
        if (j14 == Long.MIN_VALUE) {
            if (j12 == Long.MIN_VALUE) {
                j12 = Long.MIN_VALUE;
            }
            j14 = Long.MIN_VALUE;
            if (j9 == Long.MIN_VALUE) {
                j15 = j9;
            }
            if (j9 != Long.MAX_VALUE) {
                int i = (j15 > Long.MAX_VALUE ? 1 : (j15 == Long.MAX_VALUE ? 0 : -1));
            } else {
                j13 = j9;
            }
            j10 = c3070d1.f29774a;
            z8 = j14 > j10 && j10 <= j13;
            long j16 = c4.f29380b.f29774a;
            boolean z9 = j14 > j16 && j16 <= j13;
            if (z8 || !z9) {
                if (!z8) {
                    return z9 ? j16 : j14;
                }
                return j10;
            }
            if (Math.abs(j10 - j9) <= Math.abs(j16 - j9)) {
                return j10;
            }
        }
        if (j14 == Long.MAX_VALUE) {
            if (j12 == Long.MAX_VALUE) {
                j14 = Long.MAX_VALUE;
            }
            j14 = Long.MIN_VALUE;
        }
        if (j9 == Long.MIN_VALUE) {
        }
        if (j9 != Long.MAX_VALUE) {
        }
        j10 = c3070d1.f29774a;
        if (j14 > j10) {
        }
        long j162 = c4.f29380b.f29774a;
        if (j14 > j162) {
        }
        if (z8) {
        }
        if (!z8) {
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.WQ
    public final boolean b(C3633nO c3633nO) {
        if (this.f26960s0) {
            return false;
        }
        C4017ue c4017ue = this.f26932C;
        if (((IOException) c4017ue.f34632w) != null || this.f26958q0) {
            return false;
        }
        if (this.f26943O && this.f26953Z == 0) {
            return false;
        }
        boolean a9 = this.f26934E.a();
        if (((D) c4017ue.f34631v) != null) {
            return a9;
        }
        u();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.WQ
    public final boolean c() {
        boolean z8;
        if (this.f26960s0 || ((D) this.f26932C.f34631v) == null) {
            return false;
        }
        C2865Xm c2865Xm = this.f26934E;
        synchronized (c2865Xm) {
            z8 = c2865Xm.f28692a;
        }
        return z8;
    }

    @Override // com.google.android.gms.internal.ads.WQ
    public final long d() {
        long j9;
        boolean z8;
        long j10;
        B();
        if (this.f26960s0 || this.f26953Z == 0) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.f26957p0;
        }
        if (this.f26944P) {
            int length = this.f26940L.length;
            j9 = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                PE pe = this.f26946R;
                if (((boolean[]) pe.f26883c)[i] && ((boolean[]) pe.f26884d)[i]) {
                    UQ uq = this.f26940L[i];
                    synchronized (uq) {
                        z8 = uq.f28033y;
                    }
                    if (z8) {
                        continue;
                    } else {
                        UQ uq2 = this.f26940L[i];
                        synchronized (uq2) {
                            j10 = uq2.f28030v;
                        }
                        j9 = Math.min(j9, j10);
                    }
                }
            }
        } else {
            j9 = Long.MAX_VALUE;
        }
        if (j9 == Long.MAX_VALUE) {
            j9 = z(false);
        }
        return j9 == Long.MIN_VALUE ? this.f26956o0 : j9;
    }

    /* JADX WARN: Type inference failed for: r14v4, types: [com.google.android.gms.internal.ads.zQ, java.lang.Object] */
    public final void e(MQ mq, boolean z8) {
        Object obj = mq.f26340b.f35133v;
        C3958tQ c3958tQ = new C3958tQ();
        C4228yQ c4228yQ = new C4228yQ(-1, null, AbstractC3548lu.t(mq.i), AbstractC3548lu.t(this.f26948T));
        NP np = this.f26964w;
        np.a(new C4017ue(np, c3958tQ, c4228yQ, 28));
        if (z8) {
            return;
        }
        for (UQ uq : this.f26940L) {
            uq.k(false);
        }
        if (this.f26953Z > 0) {
            ?? r14 = this.f26938I;
            r14.getClass();
            r14.e(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.WQ
    public final void f(long j9) {
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final void g(InterfaceC4282zQ interfaceC4282zQ, long j9) {
        this.f26938I = interfaceC4282zQ;
        this.f26934E.a();
        u();
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final long h(long j9) {
        boolean n9;
        int i;
        int i4;
        B();
        boolean[] zArr = (boolean[]) this.f26946R.f26883c;
        if (true != this.f26947S.d()) {
            j9 = 0;
        }
        this.f26952X = false;
        long j10 = this.f26956o0;
        this.f26956o0 = j9;
        if (A()) {
            this.f26957p0 = j9;
            return j9;
        }
        if (this.f26950V != 7 && (this.f26960s0 || ((D) this.f26932C.f34631v) != null)) {
            int length = this.f26940L.length;
            for (int i9 = 0; i9 < length; i9++) {
                UQ uq = this.f26940L[i9];
                if (this.f26939K[i9].f26162d.get() == KQ.f25974n) {
                    int i10 = uq.f28024p;
                    if (uq.f28026r + i10 != 0 || j10 != j9) {
                        if (this.f26945Q) {
                            synchronized (uq) {
                                synchronized (uq) {
                                    uq.f28026r = 0;
                                    SQ sq = uq.f28010a;
                                    sq.f27569d = sq.f27568c;
                                }
                            }
                            int i11 = uq.f28024p;
                            if (i10 >= i11 && i10 <= uq.f28023o + i11 && (((i = uq.f28031w) == -1 || i10 < i) && ((i4 = uq.f28032x) == -1 || i10 < i4))) {
                                uq.f28027s = Long.MIN_VALUE;
                                uq.f28026r = i10 - i11;
                                n9 = true;
                            }
                            n9 = false;
                        } else {
                            n9 = uq.n(j9, this.f26960s0);
                        }
                        if (n9) {
                            continue;
                        } else if (!zArr[i9] && this.f26944P) {
                        }
                    }
                }
            }
            return j9;
        }
        this.f26958q0 = false;
        this.f26957p0 = j9;
        this.f26960s0 = false;
        this.Y = false;
        C4017ue c4017ue = this.f26932C;
        if (!(((D) c4017ue.f34631v) != null)) {
            c4017ue.f34632w = null;
            for (UQ uq2 : this.f26940L) {
                uq2.k(false);
            }
            return j9;
        }
        for (UQ uq3 : this.f26940L) {
            uq3.o();
        }
        D d2 = (D) c4017ue.f34631v;
        d2.getClass();
        d2.a(false);
        return j9;
    }

    @Override // com.google.android.gms.internal.ads.WQ
    public final long i() {
        return d();
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final long j(InterfaceC3716p[] interfaceC3716pArr, boolean[] zArr, VQ[] vqArr, boolean[] zArr2, long j9) {
        boolean[] zArr3;
        InterfaceC3716p interfaceC3716p;
        B();
        PE pe = this.f26946R;
        C3041cR c3041cR = (C3041cR) pe.f26882b;
        int i = this.f26953Z;
        int i4 = 0;
        while (true) {
            int length = interfaceC3716pArr.length;
            zArr3 = (boolean[]) pe.f26884d;
            if (i4 >= length) {
                break;
            }
            VQ vq = vqArr[i4];
            if (vq != null && (interfaceC3716pArr[i4] == null || !zArr[i4])) {
                int i9 = ((NQ) vq).f26545a;
                PA.T(zArr3[i9]);
                this.f26953Z--;
                zArr3[i9] = false;
                vqArr[i4] = null;
            }
            i4++;
        }
        boolean z8 = !this.f26951W ? j9 == 0 || this.f26945Q : i != 0;
        for (int i10 = 0; i10 < interfaceC3716pArr.length; i10++) {
            if (vqArr[i10] == null && (interfaceC3716p = interfaceC3716pArr[i10]) != null) {
                PA.T(interfaceC3716p.c() == 1);
                PA.T(interfaceC3716p.s(0) == 0);
                int indexOf = c3041cR.f29711b.indexOf(interfaceC3716p.a());
                if (indexOf < 0) {
                    indexOf = -1;
                }
                PA.T(!zArr3[indexOf]);
                this.f26953Z++;
                zArr3[indexOf] = true;
                this.Y = interfaceC3716p.i().f27782u | this.Y;
                vqArr[i10] = new NQ(this, indexOf);
                zArr2[i10] = true;
                if (!z8) {
                    UQ uq = this.f26940L[indexOf];
                    z8 = (uq.f28024p + uq.f28026r == 0 || uq.n(j9, true)) ? false : true;
                }
            }
        }
        if (this.f26953Z == 0) {
            this.f26958q0 = false;
            this.f26952X = false;
            this.Y = false;
            C4017ue c4017ue = this.f26932C;
            if (((D) c4017ue.f34631v) != null) {
                for (UQ uq2 : this.f26940L) {
                    uq2.o();
                }
                D d2 = (D) c4017ue.f34631v;
                d2.getClass();
                d2.a(false);
            } else {
                this.f26960s0 = false;
                for (UQ uq3 : this.f26940L) {
                    uq3.k(false);
                }
            }
        } else if (z8) {
            j9 = h(j9);
            for (int i11 = 0; i11 < vqArr.length; i11++) {
                if (vqArr[i11] != null) {
                    zArr2[i11] = true;
                }
            }
        }
        this.f26951W = true;
        return j9;
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [com.google.android.gms.internal.ads.zQ, java.lang.Object] */
    public final void k(MQ mq) {
        if (this.f26948T == com.anythink.basead.exoplayer.b.f6539b && this.f26947S != null) {
            long z8 = z(true);
            long j9 = z8 == Long.MIN_VALUE ? 0L : z8 + 10000;
            this.f26948T = j9;
            this.f26966y.s(j9, this.f26947S, this.f26949U);
        }
        Object obj = mq.f26340b.f35133v;
        C3958tQ c3958tQ = new C3958tQ();
        C4228yQ c4228yQ = new C4228yQ(-1, null, AbstractC3548lu.t(mq.i), AbstractC3548lu.t(this.f26948T));
        NP np = this.f26964w;
        np.a(new C3602mu(np, c3958tQ, c4228yQ, 27));
        this.f26960s0 = true;
        ?? r15 = this.f26938I;
        r15.getClass();
        r15.e(this);
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final void l(long j9) {
        long j10;
        long i;
        int i4;
        if (this.f26945Q) {
            return;
        }
        B();
        if (A()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.f26946R.f26884d;
        int length = this.f26940L.length;
        int i9 = 0;
        while (i9 < length) {
            UQ uq = this.f26940L[i9];
            boolean z8 = zArr[i9];
            SQ sq = uq.f28010a;
            synchronized (uq) {
                try {
                    int i10 = uq.f28023o;
                    if (i10 != 0) {
                        long[] jArr = uq.f28021m;
                        int i11 = uq.f28025q;
                        if (j9 >= jArr[i11]) {
                            j10 = j9;
                            int h9 = uq.h(i11, (!z8 || (i4 = uq.f28026r) == i10) ? i10 : i4 + 1, j10, false);
                            i = h9 != -1 ? uq.i(h9) : -1L;
                        }
                    }
                    j10 = j9;
                } finally {
                }
            }
            sq.a(i);
            i9++;
            j9 = j10;
        }
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final void m() {
        IOException iOException;
        int i = this.f26950V == 7 ? 6 : 3;
        C4017ue c4017ue = this.f26932C;
        IOException iOException2 = (IOException) c4017ue.f34632w;
        if (iOException2 != null) {
            throw iOException2;
        }
        D d2 = (D) c4017ue.f34631v;
        if (d2 != null && (iOException = d2.f24290v) != null && d2.f24291w > i) {
            throw iOException;
        }
        if (this.f26960s0 && !this.f26943O) {
            throw W4.a(null, "Loading finished before preparation is complete.");
        }
    }

    public final void n(int i) {
        B();
        PE pe = this.f26946R;
        boolean[] zArr = (boolean[]) pe.f26885e;
        if (zArr[i]) {
            return;
        }
        TP tp = ((C3041cR) pe.f26882b).a(i).f24000d[0];
        C4228yQ c4228yQ = new C4228yQ(K4.f(tp.f27776o), tp, AbstractC3548lu.t(this.f26956o0), com.anythink.basead.exoplayer.b.f6539b);
        NP np = this.f26964w;
        np.a(new C4164xG(18, np, c4228yQ));
        zArr[i] = true;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.gms.internal.ads.zQ, java.lang.Object] */
    public final void o(int i) {
        B();
        if (this.f26958q0) {
            if ((!this.f26944P || ((boolean[]) this.f26946R.f26883c)[i]) && !this.f26940L[i].m(false)) {
                this.f26957p0 = 0L;
                this.f26958q0 = false;
                this.f26952X = true;
                this.f26956o0 = 0L;
                this.f26959r0 = 0;
                for (UQ uq : this.f26940L) {
                    uq.k(false);
                }
                ?? r52 = this.f26938I;
                r52.getClass();
                r52.e(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final C3041cR p() {
        B();
        return (C3041cR) this.f26946R.f26882b;
    }

    public final boolean q() {
        return this.f26952X || A();
    }

    public final InterfaceC3448k1 r(OQ oq) {
        int length = this.f26940L.length;
        for (int i = 0; i < length; i++) {
            if (oq.equals(this.f26941M[i])) {
                return this.f26940L[i];
            }
        }
        if (this.f26942N) {
            int i4 = oq.f26699a;
            StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 55);
            sb.append("Extractor added new track (id=");
            sb.append(i4);
            sb.append(") after finishing tracks.");
            AbstractC3217fl.I("ProgressiveMediaPeriod", sb.toString());
            return new M0();
        }
        UQ uq = new UQ(this.f26967z, this.f26963v, this.f26965x);
        LQ lq = new LQ(uq);
        uq.f28014e = this;
        int i9 = length + 1;
        OQ[] oqArr = (OQ[]) Arrays.copyOf(this.f26941M, i9);
        oqArr[length] = oq;
        String str = AbstractC3548lu.f32613a;
        this.f26941M = oqArr;
        UQ[] uqArr = (UQ[]) Arrays.copyOf(this.f26940L, i9);
        uqArr[length] = uq;
        this.f26940L = uqArr;
        LQ[] lqArr = (LQ[]) Arrays.copyOf(this.f26939K, i9);
        lqArr[length] = lq;
        this.f26939K = lqArr;
        return lq;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.zQ, java.lang.Object] */
    public final void s() {
        int i;
        if (this.f26961t0 || this.f26943O || !this.f26942N || this.f26947S == null) {
            return;
        }
        for (UQ uq : this.f26940L) {
            if (uq.l() == null) {
                return;
            }
        }
        C2865Xm c2865Xm = this.f26934E;
        synchronized (c2865Xm) {
            c2865Xm.f28692a = false;
        }
        int length = this.f26940L.length;
        int i4 = 0;
        int i9 = -1;
        for (int i10 = 0; i10 < length; i10++) {
            TP l9 = this.f26940L[i10].l();
            l9.getClass();
            int f6 = K4.f(l9.f27776o);
            char c4 = 2;
            char c9 = f6 != 1 ? f6 != 2 ? f6 != 3 ? f6 != 4 ? (char) 0 : (char) 2 : (char) 1 : (char) 4 : (char) 3;
            if (i9 == 1) {
                c4 = 3;
            } else if (i9 == 2) {
                c4 = 4;
            } else if (i9 == 3) {
                c4 = 1;
            } else if (i9 != 4) {
                c4 = 0;
            }
            if (c9 > c4) {
                i9 = f6;
            }
            if (c9 > c4) {
                i4 = i10;
            }
        }
        B8[] b8Arr = new B8[length];
        boolean[] zArr = new boolean[length];
        for (int i11 = 0; i11 < length; i11++) {
            TP l10 = this.f26940L[i11].l();
            l10.getClass();
            String str = l10.f27776o;
            boolean a9 = K4.a(str);
            boolean z8 = a9 || K4.b(str);
            zArr[i11] = z8;
            this.f26944P = z8 | this.f26944P;
            this.f26945Q = this.f26931B != com.anythink.basead.exoplayer.b.f6539b && length == 1 && K4.c(str);
            R1 r12 = this.J;
            if (r12 != null) {
                if (a9 || this.f26941M[i11].f26700b) {
                    R3 r32 = l10.f27773l;
                    R3 r33 = r32 == null ? new R3(r12) : r32.c(r12);
                    C4065vP c4065vP = new C4065vP(l10);
                    c4065vP.f34782k = r33;
                    l10 = new TP(c4065vP);
                }
                if (a9 && l10.f27770h == -1 && l10.i == -1 && (i = r12.f27294a) != -1) {
                    C4065vP c4065vP2 = new C4065vP(l10);
                    c4065vP2.f34780h = i;
                    l10 = new TP(c4065vP2);
                }
            }
            this.f26963v.getClass();
            int i12 = l10.f27780s != null ? 1 : 0;
            C4065vP c4065vP3 = new C4065vP(l10);
            c4065vP3.f34772N = i12;
            TP tp = new TP(c4065vP3);
            if (i11 != i4) {
                C4065vP c4065vP4 = new C4065vP(tp);
                c4065vP4.f34783l = Integer.toString(i4);
                tp = new TP(c4065vP4);
            }
            b8Arr[i11] = new B8(Integer.toString(i11), tp);
            this.Y = tp.f27782u | this.Y;
            UQ uq2 = this.f26940L[i11];
            synchronized (uq2) {
                if (uq2.f28028t != Long.MIN_VALUE) {
                    uq2.f28028t = Long.MIN_VALUE;
                    uq2.f28031w = -1;
                    uq2.f28032x = -1;
                }
            }
        }
        this.f26946R = new PE(new C3041cR(b8Arr), zArr);
        if (this.f26945Q && this.f26948T == com.anythink.basead.exoplayer.b.f6539b) {
            this.f26948T = this.f26931B;
            this.f26947S = new JQ(this, this.f26947S);
        }
        this.f26966y.s(this.f26948T, this.f26947S, this.f26949U);
        this.f26943O = true;
        ?? r02 = this.f26938I;
        r02.getClass();
        r02.k(this);
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final long t() {
        if (this.Y) {
            this.Y = false;
        } else {
            if (!this.f26952X) {
                return com.anythink.basead.exoplayer.b.f6539b;
            }
            if (!this.f26960s0 && y() <= this.f26959r0) {
                return com.anythink.basead.exoplayer.b.f6539b;
            }
            this.f26952X = false;
        }
        return this.f26956o0;
    }

    public final void u() {
        MQ mq = new MQ(this, this.f26954n, this.f26962u, this.f26933D, this, this.f26934E);
        if (this.f26943O) {
            PA.T(A());
            long j9 = this.f26948T;
            if (j9 != com.anythink.basead.exoplayer.b.f6539b && this.f26957p0 > j9) {
                this.f26960s0 = true;
                this.f26957p0 = com.anythink.basead.exoplayer.b.f6539b;
                return;
            }
            InterfaceC3015c1 interfaceC3015c1 = this.f26947S;
            interfaceC3015c1.getClass();
            C3070d1 c3070d1 = interfaceC3015c1.c(this.f26957p0).f29379a;
            long j10 = this.f26957p0;
            mq.f26344f.f27467n = c3070d1.f29775b;
            mq.i = j10;
            mq.f26346h = true;
            mq.f26349l = false;
            for (UQ uq : this.f26940L) {
                uq.f28027s = this.f26957p0;
            }
            this.f26957p0 = com.anythink.basead.exoplayer.b.f6539b;
        }
        this.f26959r0 = y();
        C4017ue c4017ue = this.f26932C;
        c4017ue.getClass();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        c4017ue.f34632w = null;
        D d2 = new D(c4017ue, myLooper, mq, this, SystemClock.elapsedRealtime());
        C4017ue c4017ue2 = d2.f24287A;
        PA.T(((D) c4017ue2.f34631v) == null);
        c4017ue2.f34631v = d2;
        d2.b();
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void v() {
        this.f26942N = true;
        this.f26937H.post(this.f26935F);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void w(InterfaceC3015c1 interfaceC3015c1) {
        this.f26937H.post(new RunnableC3903sP(5, this, interfaceC3015c1));
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final InterfaceC3448k1 x(int i, int i4) {
        return r(new OQ(i, false));
    }

    public final int y() {
        int i = 0;
        for (UQ uq : this.f26940L) {
            i += uq.f28024p + uq.f28023o;
        }
        return i;
    }

    public final long z(boolean z8) {
        long j9;
        int i = 0;
        long j10 = Long.MIN_VALUE;
        while (true) {
            UQ[] uqArr = this.f26940L;
            if (i >= uqArr.length) {
                return j10;
            }
            if (!z8) {
                PE pe = this.f26946R;
                pe.getClass();
                if (!((boolean[]) pe.f26884d)[i]) {
                    continue;
                    i++;
                }
            }
            UQ uq = uqArr[i];
            synchronized (uq) {
                j9 = uq.f28030v;
            }
            j10 = Math.max(j10, j9);
            i++;
        }
    }
}
