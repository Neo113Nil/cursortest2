package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import java.io.IOException;

/* loaded from: classes.dex */
final class ek implements ik, dh, dm, sk {
    private al A;
    private long B;
    private boolean[] C;
    private boolean[] D;
    private boolean E;
    private long G;
    private int I;
    private boolean J;
    private boolean K;
    private final wl L;

    /* renamed from: f, reason: collision with root package name */
    private final Uri f4624f;

    /* renamed from: g, reason: collision with root package name */
    private final tl f4625g;

    /* renamed from: h, reason: collision with root package name */
    private final int f4626h;

    /* renamed from: i, reason: collision with root package name */
    private final Handler f4627i;

    /* renamed from: j, reason: collision with root package name */
    private final fk f4628j;

    /* renamed from: k, reason: collision with root package name */
    private final jk f4629k;

    /* renamed from: l, reason: collision with root package name */
    private final long f4630l;

    /* renamed from: n, reason: collision with root package name */
    private final ck f4632n;

    /* renamed from: t, reason: collision with root package name */
    private hk f4638t;

    /* renamed from: u, reason: collision with root package name */
    private jh f4639u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f4640v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f4641w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f4642x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f4643y;

    /* renamed from: z, reason: collision with root package name */
    private int f4644z;

    /* renamed from: m, reason: collision with root package name */
    private final hm f4631m = new hm("Loader:ExtractorMediaPeriod");

    /* renamed from: o, reason: collision with root package name */
    private final lm f4633o = new lm();

    /* renamed from: p, reason: collision with root package name */
    private final Runnable f4634p = new xj(this);

    /* renamed from: q, reason: collision with root package name */
    private final Runnable f4635q = new yj(this);

    /* renamed from: r, reason: collision with root package name */
    private final Handler f4636r = new Handler();
    private long H = -9223372036854775807L;

    /* renamed from: s, reason: collision with root package name */
    private final SparseArray<tk> f4637s = new SparseArray<>();
    private long F = -1;

    public ek(Uri uri, tl tlVar, ch[] chVarArr, int i7, Handler handler, fk fkVar, jk jkVar, wl wlVar, String str, int i8, byte[] bArr) {
        this.f4624f = uri;
        this.f4625g = tlVar;
        this.f4626h = i7;
        this.f4627i = handler;
        this.f4628j = fkVar;
        this.f4629k = jkVar;
        this.L = wlVar;
        this.f4630l = i8;
        this.f4632n = new ck(chVarArr, this);
    }

    static /* bridge */ /* synthetic */ void D(ek ekVar) {
        if (ekVar.K || ekVar.f4641w || ekVar.f4639u == null || !ekVar.f4640v) {
            return;
        }
        int size = ekVar.f4637s.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (ekVar.f4637s.valueAt(i7).h() == null) {
                return;
            }
        }
        ekVar.f4633o.b();
        zk[] zkVarArr = new zk[size];
        ekVar.D = new boolean[size];
        ekVar.C = new boolean[size];
        ekVar.B = ekVar.f4639u.zza();
        int i8 = 0;
        while (true) {
            boolean z6 = true;
            if (i8 >= size) {
                ekVar.A = new al(zkVarArr);
                ekVar.f4641w = true;
                ekVar.f4629k.c(new yk(ekVar.B, ekVar.f4639u.c()), null);
                ekVar.f4638t.a(ekVar);
                return;
            }
            xe h7 = ekVar.f4637s.valueAt(i8).h();
            zkVarArr[i8] = new zk(h7);
            String str = h7.f14165k;
            if (!om.b(str) && !om.a(str)) {
                z6 = false;
            }
            ekVar.D[i8] = z6;
            ekVar.E = z6 | ekVar.E;
            i8++;
        }
    }

    private final int k() {
        int size = this.f4637s.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += this.f4637s.valueAt(i8).e();
        }
        return i7;
    }

    private final long l() {
        int size = this.f4637s.size();
        long j7 = Long.MIN_VALUE;
        for (int i7 = 0; i7 < size; i7++) {
            j7 = Math.max(j7, this.f4637s.valueAt(i7).g());
        }
        return j7;
    }

    private final void n(bk bkVar) {
        if (this.F == -1) {
            this.F = bkVar.f3455i;
        }
    }

    private final void o() {
        jh jhVar;
        bk bkVar = new bk(this, this.f4624f, this.f4625g, this.f4632n, this.f4633o);
        if (this.f4641w) {
            jm.e(v());
            long j7 = this.B;
            if (j7 != -9223372036854775807L && this.H >= j7) {
                this.J = true;
                this.H = -9223372036854775807L;
                return;
            } else {
                bkVar.e(this.f4639u.a(this.H), this.H);
                this.H = -9223372036854775807L;
            }
        }
        this.I = k();
        int i7 = this.f4626h;
        if (i7 == -1) {
            i7 = (this.f4641w && this.F == -1 && ((jhVar = this.f4639u) == null || jhVar.zza() == -9223372036854775807L)) ? 6 : 3;
        }
        this.f4631m.a(bkVar, this, i7);
    }

    private final boolean v() {
        return this.H != -9223372036854775807L;
    }

    final void E() {
        this.f4631m.g(Integer.MIN_VALUE);
    }

    public final void F() {
        this.f4631m.h(new zj(this, this.f4632n));
        this.f4636r.removeCallbacksAndMessages(null);
        this.K = true;
    }

    final void G(int i7, long j7) {
        tk valueAt = this.f4637s.valueAt(i7);
        if (!this.J || j7 <= valueAt.g()) {
            valueAt.n(j7, true);
        } else {
            valueAt.l();
        }
    }

    @Override // com.google.android.gms.internal.ads.dh
    public final void a() {
        this.f4640v = true;
        this.f4636r.post(this.f4634p);
    }

    @Override // com.google.android.gms.internal.ads.dh
    public final void b(jh jhVar) {
        this.f4639u = jhVar;
        this.f4636r.post(this.f4634p);
    }

    @Override // com.google.android.gms.internal.ads.dh
    public final lh c(int i7, int i8) {
        tk tkVar = this.f4637s.get(i7);
        if (tkVar != null) {
            return tkVar;
        }
        tk tkVar2 = new tk(this.L, null);
        tkVar2.k(this);
        this.f4637s.put(i7, tkVar2);
        return tkVar2;
    }

    @Override // com.google.android.gms.internal.ads.dm
    public final /* bridge */ /* synthetic */ void d(fm fmVar, long j7, long j8) {
        n((bk) fmVar);
        this.J = true;
        if (this.B == -9223372036854775807L) {
            long l7 = l();
            long j9 = l7 == Long.MIN_VALUE ? 0L : l7 + 10000;
            this.B = j9;
            this.f4629k.c(new yk(j9, this.f4639u.c()), null);
        }
        this.f4638t.b(this);
    }

    @Override // com.google.android.gms.internal.ads.ik
    public final long e() {
        long l7;
        if (this.J) {
            return Long.MIN_VALUE;
        }
        if (v()) {
            return this.H;
        }
        if (this.E) {
            int size = this.f4637s.size();
            l7 = Long.MAX_VALUE;
            for (int i7 = 0; i7 < size; i7++) {
                if (this.D[i7]) {
                    l7 = Math.min(l7, this.f4637s.valueAt(i7).g());
                }
            }
        } else {
            l7 = l();
        }
        return l7 == Long.MIN_VALUE ? this.G : l7;
    }

    @Override // com.google.android.gms.internal.ads.ik
    public final long f() {
        if (!this.f4643y) {
            return -9223372036854775807L;
        }
        this.f4643y = false;
        return this.G;
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void g(xe xeVar) {
        this.f4636r.post(this.f4634p);
    }

    @Override // com.google.android.gms.internal.ads.dm
    public final /* bridge */ /* synthetic */ void h(fm fmVar, long j7, long j8, boolean z6) {
        n((bk) fmVar);
        if (z6 || this.f4644z <= 0) {
            return;
        }
        int size = this.f4637s.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f4637s.valueAt(i7).j(this.C[i7]);
        }
        this.f4638t.b(this);
    }

    @Override // com.google.android.gms.internal.ads.dm
    public final /* bridge */ /* synthetic */ int i(fm fmVar, long j7, long j8, IOException iOException) {
        jh jhVar;
        bk bkVar = (bk) fmVar;
        n(bkVar);
        Handler handler = this.f4627i;
        if (handler != null) {
            handler.post(new ak(this, iOException));
        }
        if (iOException instanceof bl) {
            return 3;
        }
        int k7 = k();
        int i7 = this.I;
        if (this.F == -1 && ((jhVar = this.f4639u) == null || jhVar.zza() == -9223372036854775807L)) {
            this.G = 0L;
            this.f4643y = this.f4641w;
            int size = this.f4637s.size();
            for (int i8 = 0; i8 < size; i8++) {
                this.f4637s.valueAt(i8).j(!this.f4641w || this.C[i8]);
            }
            bkVar.e(0L, 0L);
        }
        this.I = k();
        return k7 <= i7 ? 0 : 1;
    }

    final boolean j(int i7) {
        return this.J || (!v() && this.f4637s.valueAt(i7).m());
    }

    @Override // com.google.android.gms.internal.ads.ik
    public final al m() {
        return this.A;
    }

    @Override // com.google.android.gms.internal.ads.ik
    public final void p() {
        this.f4631m.g(Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.ik, com.google.android.gms.internal.ads.xk
    public final boolean q(long j7) {
        if (this.J) {
            return false;
        }
        if (this.f4641w && this.f4644z == 0) {
            return false;
        }
        boolean c7 = this.f4633o.c();
        if (this.f4631m.i()) {
            return c7;
        }
        o();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ik
    public final void r(long j7) {
    }

    @Override // com.google.android.gms.internal.ads.ik
    public final long s(long j7) {
        if (true != this.f4639u.c()) {
            j7 = 0;
        }
        this.G = j7;
        int size = this.f4637s.size();
        boolean v6 = true ^ v();
        int i7 = 0;
        while (true) {
            if (!v6) {
                this.H = j7;
                this.J = false;
                if (this.f4631m.i()) {
                    this.f4631m.f();
                } else {
                    for (int i8 = 0; i8 < size; i8++) {
                        this.f4637s.valueAt(i8).j(this.C[i8]);
                    }
                }
            } else {
                if (i7 >= size) {
                    break;
                }
                if (this.C[i7]) {
                    v6 = this.f4637s.valueAt(i7).n(j7, false);
                }
                i7++;
            }
        }
        this.f4643y = false;
        return j7;
    }

    @Override // com.google.android.gms.internal.ads.ik
    public final long t(el[] elVarArr, boolean[] zArr, uk[] ukVarArr, boolean[] zArr2, long j7) {
        el elVar;
        int i7;
        jm.e(this.f4641w);
        for (int i8 = 0; i8 < elVarArr.length; i8++) {
            uk ukVar = ukVarArr[i8];
            if (ukVar != null && (elVarArr[i8] == null || !zArr[i8])) {
                i7 = ((dk) ukVar).f4235a;
                jm.e(this.C[i7]);
                this.f4644z--;
                this.C[i7] = false;
                this.f4637s.valueAt(i7).i();
                ukVarArr[i8] = null;
            }
        }
        boolean z6 = false;
        for (int i9 = 0; i9 < elVarArr.length; i9++) {
            if (ukVarArr[i9] == null && (elVar = elVarArr[i9]) != null) {
                elVar.b();
                jm.e(elVar.a(0) == 0);
                int a7 = this.A.a(elVar.d());
                jm.e(!this.C[a7]);
                this.f4644z++;
                this.C[a7] = true;
                ukVarArr[i9] = new dk(this, a7);
                zArr2[i9] = true;
                z6 = true;
            }
        }
        if (!this.f4642x) {
            int size = this.f4637s.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!this.C[i10]) {
                    this.f4637s.valueAt(i10).i();
                }
            }
        }
        if (this.f4644z == 0) {
            this.f4643y = false;
            if (this.f4631m.i()) {
                this.f4631m.f();
            }
        } else if (!this.f4642x ? j7 != 0 : z6) {
            j7 = s(j7);
            for (int i11 = 0; i11 < ukVarArr.length; i11++) {
                if (ukVarArr[i11] != null) {
                    zArr2[i11] = true;
                }
            }
        }
        this.f4642x = true;
        return j7;
    }

    @Override // com.google.android.gms.internal.ads.ik
    public final void u(hk hkVar, long j7) {
        this.f4638t = hkVar;
        this.f4633o.c();
        o();
    }

    final int w(int i7, ye yeVar, ug ugVar, boolean z6) {
        if (this.f4643y || v()) {
            return -3;
        }
        return this.f4637s.valueAt(i7).f(yeVar, ugVar, z6, this.J, this.G);
    }

    @Override // com.google.android.gms.internal.ads.ik, com.google.android.gms.internal.ads.xk
    public final long zza() {
        if (this.f4644z == 0) {
            return Long.MIN_VALUE;
        }
        return e();
    }
}
