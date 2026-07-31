package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class gy3 extends lx3 {
    private float A;
    private boolean B;
    private List C;
    private boolean D;
    private boolean E;
    private r34 F;
    private ry0 G;

    /* renamed from: b, reason: collision with root package name */
    protected final xx3[] f5945b;

    /* renamed from: c, reason: collision with root package name */
    private final ay1 f5946c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f5947d;

    /* renamed from: e, reason: collision with root package name */
    private final qw3 f5948e;

    /* renamed from: f, reason: collision with root package name */
    private final dy3 f5949f;

    /* renamed from: g, reason: collision with root package name */
    private final fy3 f5950g;

    /* renamed from: h, reason: collision with root package name */
    private final CopyOnWriteArraySet<r80> f5951h;

    /* renamed from: i, reason: collision with root package name */
    private final q04 f5952i;

    /* renamed from: j, reason: collision with root package name */
    private final l63 f5953j;

    /* renamed from: k, reason: collision with root package name */
    private final ab3 f5954k;

    /* renamed from: l, reason: collision with root package name */
    private final ny3 f5955l;

    /* renamed from: m, reason: collision with root package name */
    private final oy3 f5956m;

    /* renamed from: n, reason: collision with root package name */
    private final py3 f5957n;

    /* renamed from: o, reason: collision with root package name */
    private c0 f5958o;

    /* renamed from: p, reason: collision with root package name */
    private c0 f5959p;

    /* renamed from: q, reason: collision with root package name */
    private AudioTrack f5960q;

    /* renamed from: r, reason: collision with root package name */
    private Object f5961r;

    /* renamed from: s, reason: collision with root package name */
    private Surface f5962s;

    /* renamed from: t, reason: collision with root package name */
    private int f5963t;

    /* renamed from: u, reason: collision with root package name */
    private int f5964u;

    /* renamed from: v, reason: collision with root package name */
    private int f5965v;

    /* renamed from: w, reason: collision with root package name */
    private cd3 f5966w;

    /* renamed from: x, reason: collision with root package name */
    private cd3 f5967x;

    /* renamed from: y, reason: collision with root package name */
    private int f5968y;

    /* renamed from: z, reason: collision with root package name */
    private ef3 f5969z;

    /* JADX WARN: Multi-variable type inference failed */
    protected gy3(by3 by3Var) {
        gy3 gy3Var;
        Context context;
        q04 q04Var;
        ef3 ef3Var;
        Looper looper;
        pt0 pt0Var;
        int a7;
        q84 q84Var;
        e64 e64Var;
        dx3 dx3Var;
        a94 a94Var;
        ay3 ay3Var;
        gg3 gg3Var;
        xv1 xv1Var;
        Looper looper2;
        Context context2;
        Context context3;
        Context context4;
        Context context5;
        Context context6;
        ay1 ay1Var = new ay1(xv1.f14362a);
        this.f5946c = ay1Var;
        try {
            context = by3Var.f3630a;
            Context applicationContext = context.getApplicationContext();
            this.f5947d = applicationContext;
            q04Var = by3Var.f3636g;
            this.f5952i = q04Var;
            ef3Var = by3Var.f3638i;
            this.f5969z = ef3Var;
            this.f5963t = 1;
            this.B = false;
            dy3 dy3Var = new dy3(this, null);
            this.f5949f = dy3Var;
            fy3 fy3Var = new fy3(null == true ? 1 : 0);
            this.f5950g = fy3Var;
            this.f5951h = new CopyOnWriteArraySet<>();
            looper = by3Var.f3637h;
            Handler handler = new Handler(looper);
            pt0Var = by3Var.f3641l;
            xx3[] a8 = pt0Var.a(handler, dy3Var, dy3Var, dy3Var, dy3Var);
            this.f5945b = a8;
            this.A = 1.0f;
            if (n13.f8865a < 21) {
                AudioTrack audioTrack = this.f5960q;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.f5960q.release();
                    this.f5960q = null;
                }
                if (this.f5960q == null) {
                    this.f5960q = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                a7 = this.f5960q.getAudioSessionId();
            } else {
                a7 = nz3.a(applicationContext);
            }
            this.f5968y = a7;
            this.C = Collections.emptyList();
            this.D = true;
            b50 b50Var = new b50();
            int[] iArr = new int[8];
            iArr[0] = 20;
            iArr[1] = 21;
            iArr[2] = 22;
            iArr[3] = 23;
            try {
                iArr[4] = 24;
                iArr[5] = 25;
                iArr[6] = 26;
                iArr[7] = 27;
                b50Var.c(iArr);
                z60 e7 = b50Var.e();
                q84Var = by3Var.f3632c;
                e64Var = by3Var.f3633d;
                dx3Var = by3Var.f3634e;
                a94Var = by3Var.f3635f;
                ay3Var = by3Var.f3639j;
                gg3Var = by3Var.f3642m;
                xv1Var = by3Var.f3631b;
                looper2 = by3Var.f3637h;
                qw3 qw3Var = new qw3(a8, q84Var, e64Var, dx3Var, a94Var, q04Var, true, ay3Var, 5000L, 15000L, gg3Var, 500L, false, xv1Var, looper2, this, e7, null);
                gy3Var = this;
                try {
                    gy3Var.f5948e = qw3Var;
                    qw3Var.O(dy3Var);
                    qw3Var.N(dy3Var);
                    context2 = by3Var.f3630a;
                    gy3Var.f5953j = new l63(context2, handler, dy3Var);
                    context3 = by3Var.f3630a;
                    gy3Var.f5954k = new ab3(context3, handler, dy3Var);
                    n13.p(null, null);
                    context4 = by3Var.f3630a;
                    ny3 ny3Var = new ny3(context4, handler, dy3Var);
                    gy3Var.f5955l = ny3Var;
                    int i7 = gy3Var.f5969z.f4597a;
                    ny3Var.f(3);
                    context5 = by3Var.f3630a;
                    gy3Var.f5956m = new oy3(context5);
                    context6 = by3Var.f3630a;
                    gy3Var.f5957n = new py3(context6);
                    gy3Var.F = S(ny3Var);
                    gy3Var.G = ry0.f11565e;
                    gy3Var.U(1, 10, Integer.valueOf(gy3Var.f5968y));
                    gy3Var.U(2, 10, Integer.valueOf(gy3Var.f5968y));
                    gy3Var.U(1, 3, gy3Var.f5969z);
                    gy3Var.U(2, 4, Integer.valueOf(gy3Var.f5963t));
                    gy3Var.U(2, 5, 0);
                    gy3Var.U(1, 9, Boolean.valueOf(gy3Var.B));
                    gy3Var.U(2, 7, fy3Var);
                    gy3Var.U(6, 8, fy3Var);
                    ay1Var.e();
                } catch (Throwable th) {
                    th = th;
                    gy3Var.f5946c.e();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                gy3Var = this;
            }
        } catch (Throwable th3) {
            th = th3;
            gy3Var = this;
        }
    }

    static /* bridge */ /* synthetic */ void B(gy3 gy3Var, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        gy3Var.W(surface);
        gy3Var.f5962s = surface;
    }

    static /* synthetic */ void E(gy3 gy3Var) {
        int a02 = gy3Var.a0();
        if (a02 == 2 || a02 == 3) {
            gy3Var.Y();
            gy3Var.f5948e.x();
            gy3Var.Q();
            gy3Var.Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int R(boolean z6, int i7) {
        return (!z6 || i7 == 1) ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static r34 S(ny3 ny3Var) {
        return new r34(0, ny3Var.b(), ny3Var.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(int i7, int i8) {
        if (i7 == this.f5964u && i8 == this.f5965v) {
            return;
        }
        this.f5964u = i7;
        this.f5965v = i8;
        this.f5952i.x(i7, i8);
        Iterator<r80> it = this.f5951h.iterator();
        while (it.hasNext()) {
            it.next().x(i7, i8);
        }
    }

    private final void U(int i7, int i8, Object obj) {
        xx3[] xx3VarArr = this.f5945b;
        int length = xx3VarArr.length;
        for (int i9 = 0; i9 < 2; i9++) {
            xx3 xx3Var = xx3VarArr[i9];
            if (xx3Var.a() == i7) {
                ux3 M = this.f5948e.M(xx3Var);
                M.f(i8);
                M.e(obj);
                M.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V() {
        U(1, 2, Float.valueOf(this.A * this.f5954k.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(Object obj) {
        boolean z6;
        ArrayList arrayList = new ArrayList();
        xx3[] xx3VarArr = this.f5945b;
        int length = xx3VarArr.length;
        int i7 = 0;
        while (true) {
            z6 = true;
            if (i7 >= 2) {
                break;
            }
            xx3 xx3Var = xx3VarArr[i7];
            if (xx3Var.a() == 2) {
                ux3 M = this.f5948e.M(xx3Var);
                M.f(1);
                M.e(obj);
                M.d();
                arrayList.add(M);
            }
            i7++;
        }
        Object obj2 = this.f5961r;
        if (obj2 == null || obj2 == obj) {
            z6 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ux3) it.next()).i(2000L);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z6 = false;
            Object obj3 = this.f5961r;
            Surface surface = this.f5962s;
            if (obj3 == surface) {
                surface.release();
                this.f5962s = null;
            }
        }
        this.f5961r = obj;
        if (z6) {
            this.f5948e.w(false, ll3.d(new bx3(3), 1003));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(boolean z6, int i7, int i8) {
        boolean z7 = z6 && i7 != -1;
        this.f5948e.v(z7, (!z7 || i7 == 1) ? 0 : 1, i8);
    }

    private final void Y() {
        this.f5946c.b();
        if (Thread.currentThread() != this.f5948e.L().getThread()) {
            String d7 = n13.d("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f5948e.L().getThread().getName());
            if (this.D) {
                throw new IllegalStateException(d7);
            }
            oc2.b("SimpleExoPlayer", d7, this.E ? null : new IllegalStateException());
            this.E = true;
        }
    }

    static /* bridge */ /* synthetic */ void z(gy3 gy3Var) {
        gy3Var.f5952i.a(gy3Var.B);
        Iterator<r80> it = gy3Var.f5951h.iterator();
        while (it.hasNext()) {
            it.next().a(gy3Var.B);
        }
    }

    public final void F(s04 s04Var) {
        this.f5952i.I(s04Var);
    }

    public final void G() {
        Y();
        boolean Q = Q();
        int b7 = this.f5954k.b(Q, 2);
        X(Q, b7, R(Q, b7));
        this.f5948e.s();
    }

    public final void H() {
        AudioTrack audioTrack;
        Y();
        if (n13.f8865a < 21 && (audioTrack = this.f5960q) != null) {
            audioTrack.release();
            this.f5960q = null;
        }
        this.f5955l.e();
        this.f5954k.d();
        this.f5948e.t();
        this.f5952i.L();
        Surface surface = this.f5962s;
        if (surface != null) {
            surface.release();
            this.f5962s = null;
        }
        this.C = Collections.emptyList();
    }

    public final void I(s04 s04Var) {
        this.f5952i.N(s04Var);
    }

    public final void J(v54 v54Var) {
        Y();
        this.f5948e.u(Collections.singletonList(v54Var), true);
    }

    public final void K(boolean z6) {
        Y();
        int b7 = this.f5954k.b(z6, a0());
        X(z6, b7, R(z6, b7));
    }

    @Deprecated
    public final void L(boolean z6) {
        this.D = false;
    }

    public final void M(Surface surface) {
        Y();
        W(surface);
        int i7 = surface == null ? 0 : -1;
        T(i7, i7);
    }

    public final void N(float f7) {
        Y();
        float A = n13.A(f7, 0.0f, 1.0f);
        if (this.A == A) {
            return;
        }
        this.A = A;
        V();
        this.f5952i.v(A);
        Iterator<r80> it = this.f5951h.iterator();
        while (it.hasNext()) {
            it.next().v(A);
        }
    }

    @Deprecated
    public final void O(boolean z6) {
        Y();
        this.f5954k.b(Q(), 1);
        this.f5948e.w(false, null);
        this.C = Collections.emptyList();
    }

    public final boolean Q() {
        Y();
        return this.f5948e.y();
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final void a(int i7, long j7) {
        Y();
        this.f5952i.K();
        this.f5948e.a(i7, j7);
    }

    public final int a0() {
        Y();
        return this.f5948e.H();
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final int b() {
        Y();
        return this.f5948e.b();
    }

    public final int b0() {
        Y();
        this.f5948e.I();
        return 2;
    }

    public final long c0() {
        Y();
        return this.f5948e.J();
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final int d() {
        Y();
        return this.f5948e.d();
    }

    public final long d0() {
        Y();
        return this.f5948e.K();
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final int e() {
        Y();
        return this.f5948e.e();
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final int f() {
        Y();
        return this.f5948e.f();
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final int h() {
        Y();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final long i() {
        Y();
        return this.f5948e.i();
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final long j() {
        Y();
        return this.f5948e.j();
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final long k() {
        Y();
        return this.f5948e.k();
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final boolean l() {
        Y();
        return this.f5948e.l();
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final boolean n() {
        Y();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final ei0 o() {
        Y();
        return this.f5948e.o();
    }
}
