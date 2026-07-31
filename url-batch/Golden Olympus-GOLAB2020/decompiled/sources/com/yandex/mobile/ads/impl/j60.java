package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.ConnectionResult;
import com.yandex.mobile.ads.impl.dw0;
import com.yandex.mobile.ads.impl.fi1;
import com.yandex.mobile.ads.impl.gw0;
import com.yandex.mobile.ads.impl.rv0;
import com.yandex.mobile.ads.impl.sj0;
import com.yandex.mobile.ads.impl.tz;
import com.yandex.mobile.ads.impl.u52;
import com.yandex.mobile.ads.impl.v30;
import com.yandex.mobile.ads.impl.wz0;
import com.yandex.mobile.ads.impl.x42;
import com.yandex.mobile.ads.impl.xv0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class j60 implements Handler.Callback, xv0.a, u52.a, gw0.d, tz.a, fi1.a {

    /* renamed from: A, reason: collision with root package name */
    private boolean f27484A;

    /* renamed from: C, reason: collision with root package name */
    private boolean f27486C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f27487D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f27488E;

    /* renamed from: F, reason: collision with root package name */
    private int f27489F;

    /* renamed from: H, reason: collision with root package name */
    private boolean f27491H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f27492I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f27493J;

    /* renamed from: K, reason: collision with root package name */
    private int f27494K;

    /* renamed from: L, reason: collision with root package name */
    private g f27495L;

    /* renamed from: M, reason: collision with root package name */
    private long f27496M;

    /* renamed from: N, reason: collision with root package name */
    private int f27497N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f27498O;

    /* renamed from: P, reason: collision with root package name */
    private c60 f27499P;

    /* renamed from: b, reason: collision with root package name */
    private final so1[] f27501b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<so1> f27502c;

    /* renamed from: d, reason: collision with root package name */
    private final to1[] f27503d;

    /* renamed from: e, reason: collision with root package name */
    private final u52 f27504e;

    /* renamed from: f, reason: collision with root package name */
    private final v52 f27505f;

    /* renamed from: g, reason: collision with root package name */
    private final kr0 f27506g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC1881di f27507h;

    /* renamed from: i, reason: collision with root package name */
    private final we0 f27508i;

    /* renamed from: j, reason: collision with root package name */
    private final HandlerThread f27509j;

    /* renamed from: k, reason: collision with root package name */
    private final Looper f27510k;

    /* renamed from: l, reason: collision with root package name */
    private final x42.d f27511l;

    /* renamed from: m, reason: collision with root package name */
    private final x42.b f27512m;

    /* renamed from: n, reason: collision with root package name */
    private final long f27513n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f27514o;

    /* renamed from: p, reason: collision with root package name */
    private final tz f27515p;

    /* renamed from: q, reason: collision with root package name */
    private final ArrayList<c> f27516q;

    /* renamed from: r, reason: collision with root package name */
    private final wo f27517r;

    /* renamed from: s, reason: collision with root package name */
    private final e f27518s;

    /* renamed from: t, reason: collision with root package name */
    private final bw0 f27519t;

    /* renamed from: u, reason: collision with root package name */
    private final gw0 f27520u;

    /* renamed from: v, reason: collision with root package name */
    private final jr0 f27521v;

    /* renamed from: w, reason: collision with root package name */
    private final long f27522w;

    /* renamed from: x, reason: collision with root package name */
    private uw1 f27523x;

    /* renamed from: y, reason: collision with root package name */
    private rh1 f27524y;

    /* renamed from: z, reason: collision with root package name */
    private d f27525z;

    /* renamed from: G, reason: collision with root package name */
    private boolean f27490G = false;

    /* renamed from: B, reason: collision with root package name */
    private boolean f27485B = false;

    /* renamed from: Q, reason: collision with root package name */
    private long f27500Q = -9223372036854775807L;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<gw0.c> f27526a;

        /* renamed from: b, reason: collision with root package name */
        private final xx1 f27527b;

        /* renamed from: c, reason: collision with root package name */
        private final int f27528c;

        /* renamed from: d, reason: collision with root package name */
        private final long f27529d;

        private a(int i4, long j4, xx1 xx1Var, ArrayList arrayList) {
            this.f27526a = arrayList;
            this.f27527b = xx1Var;
            this.f27528c = i4;
            this.f27529d = j4;
        }
    }

    private static class b {
    }

    private static final class c implements Comparable<c> {
        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            cVar.getClass();
            return 0;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private boolean f27530a;

        /* renamed from: b, reason: collision with root package name */
        public rh1 f27531b;

        /* renamed from: c, reason: collision with root package name */
        public int f27532c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f27533d;

        /* renamed from: e, reason: collision with root package name */
        public int f27534e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f27535f;

        /* renamed from: g, reason: collision with root package name */
        public int f27536g;

        public d(rh1 rh1Var) {
            this.f27531b = rh1Var;
        }

        public final void a(int i4) {
            this.f27530a |= i4 > 0;
            this.f27532c += i4;
        }
    }

    public interface e {
        void a(d dVar);
    }

    private static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final dw0.b f27537a;

        /* renamed from: b, reason: collision with root package name */
        public final long f27538b;

        /* renamed from: c, reason: collision with root package name */
        public final long f27539c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f27540d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f27541e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f27542f;

        public f(dw0.b bVar, long j4, long j5, boolean z4, boolean z5, boolean z6) {
            this.f27537a = bVar;
            this.f27538b = j4;
            this.f27539c = j5;
            this.f27540d = z4;
            this.f27541e = z5;
            this.f27542f = z6;
        }
    }

    private static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final x42 f27543a;

        /* renamed from: b, reason: collision with root package name */
        public final int f27544b;

        /* renamed from: c, reason: collision with root package name */
        public final long f27545c;

        public g(x42 x42Var, int i4, long j4) {
            this.f27543a = x42Var;
            this.f27544b = i4;
            this.f27545c = j4;
        }
    }

    public j60(so1[] so1VarArr, u52 u52Var, v52 v52Var, kr0 kr0Var, InterfaceC1881di interfaceC1881di, int i4, InterfaceC2296vc interfaceC2296vc, uw1 uw1Var, qz qzVar, long j4, Looper looper, n32 n32Var, e eVar, ei1 ei1Var) {
        this.f27518s = eVar;
        this.f27501b = so1VarArr;
        this.f27504e = u52Var;
        this.f27505f = v52Var;
        this.f27506g = kr0Var;
        this.f27507h = interfaceC1881di;
        this.f27489F = i4;
        this.f27523x = uw1Var;
        this.f27521v = qzVar;
        this.f27522w = j4;
        this.f27517r = n32Var;
        this.f27513n = kr0Var.e();
        this.f27514o = kr0Var.a();
        rh1 a4 = rh1.a(v52Var);
        this.f27524y = a4;
        this.f27525z = new d(a4);
        this.f27503d = new to1[so1VarArr.length];
        for (int i5 = 0; i5 < so1VarArr.length; i5++) {
            so1VarArr[i5].a(i5, ei1Var);
            this.f27503d[i5] = so1VarArr[i5].n();
        }
        this.f27515p = new tz(this, n32Var);
        this.f27516q = new ArrayList<>();
        this.f27502c = lx1.a();
        this.f27511l = new x42.d();
        this.f27512m = new x42.b();
        u52Var.a(this, interfaceC1881di);
        this.f27498O = true;
        Handler handler = new Handler(looper);
        this.f27519t = new bw0(interfaceC2296vc, handler);
        this.f27520u = new gw0(this, interfaceC2296vc, handler, ei1Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f27509j = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f27510k = looper2;
        this.f27508i = n32Var.a(looper2, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean e() {
        return Boolean.valueOf(this.f27484A);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void f() {
        boolean z4;
        yv0 d4 = this.f27519t.d();
        if (d4 != null) {
            if ((!d4.f35329d ? 0L : d4.f35326a.getNextLoadPositionUs()) != Long.MIN_VALUE) {
                yv0 d5 = this.f27519t.d();
                long a4 = a(d5.f35329d ? d5.f35326a.getNextLoadPositionUs() : 0L);
                if (d5 != this.f27519t.e()) {
                    long j4 = d5.f35331f.f23498b;
                }
                z4 = this.f27506g.a(a4, this.f27515p.getPlaybackParameters().f32440b);
                this.f27488E = z4;
                if (z4) {
                    this.f27519t.d().a(this.f27496M);
                }
                r();
            }
        }
        z4 = false;
        this.f27488E = z4;
        if (z4) {
        }
        r();
    }

    private void g() {
        a(this.f27520u.a(), true);
    }

    private void j() {
        this.f27525z.a(1);
        a(false, false, false, true);
        this.f27506g.f();
        b(this.f27524y.f31192a.c() ? 4 : 2);
        this.f27520u.a(this.f27507h.a());
        this.f27508i.a(2);
    }

    private void l() {
        a(true, false, true, false);
        this.f27506g.b();
        b(1);
        this.f27509j.quit();
        synchronized (this) {
            this.f27484A = true;
            notifyAll();
        }
    }

    private void m() {
        int i4;
        int i5;
        float f4 = this.f27515p.getPlaybackParameters().f32440b;
        yv0 f5 = this.f27519t.f();
        boolean z4 = true;
        for (yv0 e4 = this.f27519t.e(); e4 != null && e4.f35329d; e4 = e4.b()) {
            v52 b4 = e4.b(f4, this.f27524y.f31192a);
            v52 f6 = e4.f();
            if (f6 != null && f6.f33513c.length == b4.f33513c.length) {
                for (0; i5 < b4.f33513c.length; i5 + 1) {
                    i5 = (u82.a(b4.f33512b[i5], f6.f33512b[i5]) && u82.a(b4.f33513c[i5], f6.f33513c[i5])) ? i5 + 1 : 0;
                }
                if (e4 == f5) {
                    z4 = false;
                }
            }
            if (z4) {
                yv0 e5 = this.f27519t.e();
                boolean a4 = this.f27519t.a(e5);
                boolean[] zArr = new boolean[this.f27501b.length];
                long a5 = e5.a(b4, this.f27524y.f31209r, a4, zArr);
                rh1 rh1Var = this.f27524y;
                boolean z5 = (rh1Var.f31196e == 4 || a5 == rh1Var.f31209r) ? false : true;
                rh1 rh1Var2 = this.f27524y;
                i4 = 4;
                this.f27524y = a(rh1Var2.f31193b, a5, rh1Var2.f31194c, rh1Var2.f31195d, z5, 5);
                if (z5) {
                    b(a5);
                }
                boolean[] zArr2 = new boolean[this.f27501b.length];
                int i6 = 0;
                while (true) {
                    so1[] so1VarArr = this.f27501b;
                    if (i6 >= so1VarArr.length) {
                        break;
                    }
                    so1 so1Var = so1VarArr[i6];
                    boolean b5 = b(so1Var);
                    zArr2[i6] = b5;
                    ft1 ft1Var = e5.f35328c[i6];
                    if (b5) {
                        if (ft1Var != so1Var.g()) {
                            a(so1Var);
                        } else if (zArr[i6]) {
                            so1Var.a(this.f27496M);
                        }
                    }
                    i6++;
                }
                a(zArr2);
            } else {
                i4 = 4;
                this.f27519t.a(e4);
                if (e4.f35329d) {
                    e4.a(b4, Math.max(e4.f35331f.f23498b, e4.c(this.f27496M)));
                }
            }
            a(true);
            if (this.f27524y.f31196e != i4) {
                f();
                s();
                this.f27508i.a(2);
                return;
            }
            return;
        }
    }

    private void n() {
        yv0 e4 = this.f27519t.e();
        this.f27486C = e4 != null && e4.f35331f.f23504h && this.f27485B;
    }

    private boolean o() {
        rh1 rh1Var = this.f27524y;
        return rh1Var.f31203l && rh1Var.f31204m == 0;
    }

    private void q() {
        this.f27515p.b();
        for (so1 so1Var : this.f27501b) {
            if (b(so1Var) && so1Var.getState() == 2) {
                so1Var.stop();
            }
        }
    }

    private void r() {
        yv0 d4 = this.f27519t.d();
        boolean z4 = this.f27488E || (d4 != null && d4.f35326a.isLoading());
        rh1 rh1Var = this.f27524y;
        if (z4 != rh1Var.f31198g) {
            this.f27524y = new rh1(rh1Var.f31192a, rh1Var.f31193b, rh1Var.f31194c, rh1Var.f31195d, rh1Var.f31196e, rh1Var.f31197f, z4, rh1Var.f31199h, rh1Var.f31200i, rh1Var.f31201j, rh1Var.f31202k, rh1Var.f31203l, rh1Var.f31204m, rh1Var.f31205n, rh1Var.f31207p, rh1Var.f31208q, rh1Var.f31209r, rh1Var.f31206o);
        }
    }

    private void s() {
        long j4;
        yv0 e4 = this.f27519t.e();
        if (e4 == null) {
            return;
        }
        long readDiscontinuity = e4.f35329d ? e4.f35326a.readDiscontinuity() : -9223372036854775807L;
        if (readDiscontinuity != -9223372036854775807L) {
            b(readDiscontinuity);
            if (readDiscontinuity != this.f27524y.f31209r) {
                rh1 rh1Var = this.f27524y;
                long j5 = readDiscontinuity;
                this.f27524y = a(rh1Var.f31193b, j5, rh1Var.f31194c, j5, true, 5);
            }
        } else {
            long a4 = this.f27515p.a(e4 != this.f27519t.f());
            this.f27496M = a4;
            long c4 = e4.c(a4);
            long j6 = this.f27524y.f31209r;
            if (!this.f27516q.isEmpty() && !this.f27524y.f31193b.a()) {
                if (this.f27498O) {
                    j6--;
                    this.f27498O = false;
                }
                rh1 rh1Var2 = this.f27524y;
                int a5 = rh1Var2.f31192a.a(rh1Var2.f31193b.f35792a);
                int min = Math.min(this.f27497N, this.f27516q.size());
                c cVar = min > 0 ? this.f27516q.get(min - 1) : null;
                while (cVar != null && (a5 < 0 || (a5 == 0 && 0 > j6))) {
                    int i4 = min - 1;
                    cVar = i4 > 0 ? this.f27516q.get(min - 2) : null;
                    min = i4;
                }
                if (min < this.f27516q.size()) {
                    this.f27516q.get(min);
                }
                this.f27497N = min;
            }
            this.f27524y.f31209r = c4;
        }
        yv0 d4 = this.f27519t.d();
        rh1 rh1Var3 = this.f27524y;
        if (d4.f35329d) {
            long bufferedPositionUs = d4.f35330e ? d4.f35326a.getBufferedPositionUs() : Long.MIN_VALUE;
            j4 = bufferedPositionUs == Long.MIN_VALUE ? d4.f35331f.f23501e : bufferedPositionUs;
        } else {
            j4 = d4.f35331f.f23498b;
        }
        rh1Var3.f31207p = j4;
        rh1 rh1Var4 = this.f27524y;
        rh1Var4.f31208q = a(rh1Var4.f31207p);
        rh1 rh1Var5 = this.f27524y;
        if (rh1Var5.f31203l && rh1Var5.f31196e == 3 && a(rh1Var5.f31192a, rh1Var5.f31193b)) {
            rh1 rh1Var6 = this.f27524y;
            if (rh1Var6.f31205n.f32440b == 1.0f) {
                float a6 = ((qz) this.f27521v).a(a(rh1Var6.f31192a, rh1Var6.f31193b.f35792a, rh1Var6.f31209r), a(this.f27524y.f31207p));
                if (this.f27515p.getPlaybackParameters().f32440b != a6) {
                    this.f27515p.a(new th1(a6, this.f27524y.f31205n.f32441c));
                    a(this.f27524y.f31205n, this.f27515p.getPlaybackParameters().f32440b, false, false);
                }
            }
        }
    }

    public final void h() {
        this.f27508i.a(22);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        yv0 f4;
        try {
            switch (message.what) {
                case 0:
                    j();
                    break;
                case 1:
                    a(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    b();
                    break;
                case 3:
                    a((g) message.obj);
                    break;
                case 4:
                    b((th1) message.obj);
                    break;
                case 5:
                    this.f27523x = (uw1) message.obj;
                    break;
                case 6:
                    a(false, true);
                    break;
                case 7:
                    l();
                    return true;
                case 8:
                    c((xv0) message.obj);
                    break;
                case 9:
                    b((xv0) message.obj);
                    break;
                case 10:
                    m();
                    break;
                case 11:
                    a(message.arg1);
                    break;
                case 12:
                    e(message.arg1 != 0);
                    break;
                case 13:
                    a(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    fi1 fi1Var = (fi1) message.obj;
                    fi1Var.getClass();
                    if (fi1Var.a() != this.f27510k) {
                        this.f27508i.a(15, fi1Var).a();
                        break;
                    } else {
                        a(fi1Var);
                        int i4 = this.f27524y.f31196e;
                        if (i4 == 3 || i4 == 2) {
                            this.f27508i.a(2);
                            break;
                        }
                    }
                case 15:
                    d((fi1) message.obj);
                    break;
                case 16:
                    th1 th1Var = (th1) message.obj;
                    a(th1Var, th1Var.f32440b, true, false);
                    break;
                case 17:
                    a((a) message.obj);
                    break;
                case 18:
                    a((a) message.obj, message.arg1);
                    break;
                case 19:
                    a((b) message.obj);
                    break;
                case 20:
                    a(message.arg1, message.arg2, (xx1) message.obj);
                    break;
                case 21:
                    a((xx1) message.obj);
                    break;
                case 22:
                    g();
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    d(message.arg1 != 0);
                    break;
                case 24:
                    c(message.arg1 == 1);
                    break;
                case 25:
                    b(true);
                    break;
                default:
                    return false;
            }
        } catch (c60 e4) {
            e = e4;
            if (e.f24064d == 1 && (f4 = this.f27519t.f()) != null) {
                e = e.a(f4.f35331f.f23497a);
            }
            if (e.f24070j && this.f27499P == null) {
                ms0.b("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f27499P = e;
                we0 we0Var = this.f27508i;
                we0Var.a(we0Var.a(25, e));
            } else {
                c60 c60Var = this.f27499P;
                if (c60Var != null) {
                    c60Var.addSuppressed(e);
                    e = this.f27499P;
                }
                ms0.a("ExoPlayerImplInternal", "Playback error", e);
                a(true, false);
                this.f27524y = this.f27524y.a(e);
            }
        } catch (jv e5) {
            a(e5, e5.f27828b);
        } catch (v30.a e6) {
            a(e6, e6.f33492b);
        } catch (wf1 e7) {
            int i5 = e7.f34030c;
            if (i5 == 1) {
                r2 = e7.f34029b ? 3001 : AuthApiStatusCodes.AUTH_API_SERVER_ERROR;
            } else if (i5 == 4) {
                r2 = e7.f34029b ? 3002 : 3004;
            }
            a(e7, r2);
        } catch (IOException e8) {
            a(e8, 2000);
        } catch (RuntimeException e9) {
            c60 a4 = c60.a(e9, ((e9 instanceof IllegalStateException) || (e9 instanceof IllegalArgumentException)) ? 1004 : 1000);
            ms0.a("ExoPlayerImplInternal", "Playback error", a4);
            a(true, false);
            this.f27524y = this.f27524y.a(a4);
        }
        d dVar = this.f27525z;
        rh1 rh1Var = this.f27524y;
        boolean z4 = dVar.f27530a | (dVar.f27531b != rh1Var);
        dVar.f27530a = z4;
        dVar.f27531b = rh1Var;
        if (z4) {
            this.f27518s.a(dVar);
            this.f27525z = new d(this.f27524y);
        }
        return true;
    }

    public final void i() {
        this.f27508i.b(0).a();
    }

    public final synchronized boolean k() {
        if (!this.f27484A && this.f27509j.isAlive()) {
            this.f27508i.a(7);
            a(new i32() { // from class: com.yandex.mobile.ads.impl.Q7
                @Override // com.yandex.mobile.ads.impl.i32
                public final Object get() {
                    Boolean e4;
                    e4 = j60.this.e();
                    return e4;
                }
            }, this.f27522w);
            return this.f27484A;
        }
        return true;
    }

    public final void p() {
        this.f27508i.b(6).a();
    }

    private void a(a aVar, int i4) {
        this.f27525z.a(1);
        gw0 gw0Var = this.f27520u;
        if (i4 == -1) {
            i4 = gw0Var.b();
        }
        a(gw0Var.a(i4, aVar.f27526a, aVar.f27527b), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:257:0x049a, code lost:
    
        if (o() == false) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x051b, code lost:
    
        if (r50.f27506g.a(a(r50.f27524y.f31207p), r50.f27515p.getPlaybackParameters().f32440b, r50.f27487D, r31) == false) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x056c, code lost:
    
        if (o() == false) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x056f, code lost:
    
        if (r5 == false) goto L329;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:218:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02be A[EDGE_INSN: B:67:0x02be->B:68:0x02be BREAK  A[LOOP:0: B:35:0x0258->B:46:0x02bb], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x033a  */
    /* JADX WARN: Type inference failed for: r2v52, types: [com.yandex.mobile.ads.impl.v52] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    /* JADX WARN: Type inference failed for: r3v44, types: [int] */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29, types: [int] */
    /* JADX WARN: Type inference failed for: r5v69, types: [com.yandex.mobile.ads.impl.x60[]] */
    /* JADX WARN: Type inference failed for: r5v70, types: [com.yandex.mobile.ads.impl.r52] */
    /* JADX WARN: Type inference failed for: r5v77 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v70, types: [int] */
    /* JADX WARN: Type inference failed for: r6v73 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26, types: [int] */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44, types: [int] */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void b() {
        boolean z4;
        boolean z5;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        boolean z6;
        boolean z7;
        boolean z8;
        rh1 rh1Var;
        boolean z9;
        int i4;
        yv0 d4;
        long j9;
        long j10;
        yv0 f4;
        boolean z10;
        yv0 e4;
        yv0 b4;
        yv0 a4;
        boolean z11;
        boolean z12;
        ?? r32;
        so1[] so1VarArr;
        boolean z13;
        aw0 a5;
        long a6 = this.f27517r.a();
        this.f27508i.c();
        long j11 = Long.MIN_VALUE;
        boolean z14 = true;
        if (this.f27524y.f31192a.c() || !this.f27520u.c()) {
            z4 = false;
            z5 = true;
            j4 = Long.MIN_VALUE;
            j5 = -9223372036854775807L;
        } else {
            this.f27519t.a(this.f27496M);
            if (this.f27519t.h() && (a5 = this.f27519t.a(this.f27496M, this.f27524y)) != null) {
                yv0 a7 = this.f27519t.a(this.f27503d, this.f27504e, this.f27506g.c(), this.f27520u, a5, this.f27505f);
                a7.f35326a.a(this, a5.f23498b);
                if (this.f27519t.e() == a7) {
                    b(a5.f23498b);
                }
                a(false);
            }
            if (this.f27488E) {
                yv0 d5 = this.f27519t.d();
                if (d5 != null) {
                    if ((!d5.f35329d ? 0L : d5.f35326a.getNextLoadPositionUs()) != Long.MIN_VALUE) {
                        z13 = true;
                        this.f27488E = z13;
                        r();
                    }
                }
                z13 = false;
                this.f27488E = z13;
                r();
            } else {
                f();
            }
            yv0 f5 = this.f27519t.f();
            if (f5 != null) {
                if (f5.b() == null || this.f27486C) {
                    z4 = false;
                    j10 = -9223372036854775807L;
                    if (f5.f35331f.f23505i || this.f27486C) {
                        int i5 = 0;
                        while (true) {
                            so1[] so1VarArr2 = this.f27501b;
                            if (i5 >= so1VarArr2.length) {
                                break;
                            }
                            so1 so1Var = so1VarArr2[i5];
                            ft1 ft1Var = f5.f35328c[i5];
                            if (ft1Var != null && so1Var.g() == ft1Var && so1Var.e()) {
                                long j12 = f5.f35331f.f23501e;
                                long c4 = (j12 == -9223372036854775807L || j12 == Long.MIN_VALUE) ? -9223372036854775807L : f5.c() + f5.f35331f.f23501e;
                                so1Var.h();
                                if (so1Var instanceof j42) {
                                    ((j42) so1Var).c(c4);
                                }
                            }
                            i5++;
                        }
                    }
                } else {
                    yv0 f6 = this.f27519t.f();
                    if (f6.f35329d) {
                        int i6 = 0;
                        while (true) {
                            so1[] so1VarArr3 = this.f27501b;
                            if (i6 < so1VarArr3.length) {
                                so1 so1Var2 = so1VarArr3[i6];
                                ft1 ft1Var2 = f6.f35328c[i6];
                                if (so1Var2.g() != ft1Var2) {
                                    break;
                                }
                                if (ft1Var2 != null && !so1Var2.e()) {
                                    yv0 b5 = f6.b();
                                    if (!f6.f35331f.f23502f) {
                                        break;
                                    }
                                    if (!b5.f35329d) {
                                        break;
                                    }
                                    if (!(so1Var2 instanceof j42) && !(so1Var2 instanceof b01) && so1Var2.j() < b5.d()) {
                                        break;
                                    }
                                }
                                i6++;
                            } else if (f5.b().f35329d || this.f27496M >= f5.b().d()) {
                                v52 f7 = f5.f();
                                yv0 b6 = this.f27519t.b();
                                v52 f8 = b6.f();
                                x42 x42Var = this.f27524y.f31192a;
                                z4 = false;
                                j10 = -9223372036854775807L;
                                a(x42Var, b6.f35331f.f23497a, x42Var, f5.f35331f.f23497a, -9223372036854775807L);
                                if (!b6.f35329d || b6.f35326a.readDiscontinuity() == -9223372036854775807L) {
                                    for (int i7 = 0; i7 < this.f27501b.length; i7++) {
                                        boolean a8 = f7.a(i7);
                                        boolean a9 = f8.a(i7);
                                        if (a8 && !this.f27501b[i7].k()) {
                                            boolean z15 = ((AbstractC1811ak) this.f27503d[i7]).m() == -2;
                                            uo1 uo1Var = f7.f33512b[i7];
                                            uo1 uo1Var2 = f8.f33512b[i7];
                                            if (!a9 || !uo1Var2.equals(uo1Var) || z15) {
                                                so1 so1Var3 = this.f27501b[i7];
                                                long d6 = b6.d();
                                                so1Var3.h();
                                                if (so1Var3 instanceof j42) {
                                                    ((j42) so1Var3).c(d6);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    long d7 = b6.d();
                                    for (so1 so1Var4 : this.f27501b) {
                                        if (so1Var4.g() != null) {
                                            so1Var4.h();
                                            if (so1Var4 instanceof j42) {
                                                ((j42) so1Var4).c(d7);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        z4 = false;
                        j10 = -9223372036854775807L;
                    }
                }
                f4 = this.f27519t.f();
                if (f4 != null && this.f27519t.e() != f4 && !f4.f35332g) {
                    yv0 f9 = this.f27519t.f();
                    ?? f10 = f9.f();
                    boolean z16 = z4;
                    z12 = z16;
                    r32 = z16;
                    while (true) {
                        so1VarArr = this.f27501b;
                        if (r32 < so1VarArr.length) {
                            break;
                        }
                        so1 so1Var5 = so1VarArr[r32];
                        if (b(so1Var5)) {
                            boolean z17 = so1Var5.g() != f9.f35328c[r32] ? true : z4;
                            if (!f10.a(r32) || z17) {
                                if (!so1Var5.k()) {
                                    ?? r5 = f10.f33513c[r32];
                                    int b7 = r5 != 0 ? r5.b() : z4;
                                    yb0[] yb0VarArr = new yb0[b7];
                                    for (?? r8 = z4; r8 < b7; r8++) {
                                        yb0VarArr[r8] = r5.a(r8);
                                    }
                                    so1Var5.a(yb0VarArr, f9.f35328c[r32], f9.d(), f9.c());
                                } else if (so1Var5.a()) {
                                    a(so1Var5);
                                } else {
                                    z12 = true;
                                }
                            }
                        }
                        r32++;
                    }
                    if (!z12) {
                        a(new boolean[so1VarArr.length]);
                    }
                }
                z10 = z4;
                while (o() && !this.f27486C && (e4 = this.f27519t.e()) != null && (b4 = e4.b()) != null && this.f27496M >= b4.d() && b4.f35332g) {
                    if (z10) {
                        d dVar = this.f27525z;
                        rh1 rh1Var2 = this.f27524y;
                        boolean z18 = dVar.f27530a | (dVar.f27531b != rh1Var2 ? z14 : z4);
                        dVar.f27530a = z18;
                        dVar.f27531b = rh1Var2;
                        if (z18) {
                            this.f27518s.a(dVar);
                            this.f27525z = new d(this.f27524y);
                        }
                    }
                    a4 = this.f27519t.a();
                    a4.getClass();
                    if (this.f27524y.f31193b.f35792a.equals(a4.f35331f.f23497a.f35792a)) {
                        dw0.b bVar = this.f27524y.f31193b;
                        if (bVar.f35793b == -1) {
                            dw0.b bVar2 = a4.f35331f.f23497a;
                            if (bVar2.f35793b == -1 && bVar.f35796e != bVar2.f35796e) {
                                z11 = z14;
                                aw0 aw0Var = a4.f35331f;
                                dw0.b bVar3 = aw0Var.f23497a;
                                boolean z19 = z11;
                                long j13 = aw0Var.f23498b;
                                this.f27524y = a(bVar3, j13, aw0Var.f23499c, j13, !z19, 0);
                                n();
                                s();
                                j10 = j10;
                                j11 = j11;
                                z10 = z14;
                                z14 = z10;
                            }
                        }
                    }
                    z11 = z4;
                    aw0 aw0Var2 = a4.f35331f;
                    dw0.b bVar32 = aw0Var2.f23497a;
                    boolean z192 = z11;
                    long j132 = aw0Var2.f23498b;
                    this.f27524y = a(bVar32, j132, aw0Var2.f23499c, j132, !z192, 0);
                    n();
                    s();
                    j10 = j10;
                    j11 = j11;
                    z10 = z14;
                    z14 = z10;
                }
                long j14 = j10;
                j4 = j11;
                j5 = j14;
                z5 = z14;
            }
            z4 = false;
            j10 = -9223372036854775807L;
            f4 = this.f27519t.f();
            if (f4 != null) {
                yv0 f92 = this.f27519t.f();
                ?? f102 = f92.f();
                boolean z162 = z4;
                z12 = z162;
                r32 = z162;
                while (true) {
                    so1VarArr = this.f27501b;
                    if (r32 < so1VarArr.length) {
                    }
                    r32++;
                }
                if (!z12) {
                }
            }
            z10 = z4;
            while (o()) {
                if (z10) {
                }
                a4 = this.f27519t.a();
                a4.getClass();
                if (this.f27524y.f31193b.f35792a.equals(a4.f35331f.f23497a.f35792a)) {
                }
                z11 = z4;
                aw0 aw0Var22 = a4.f35331f;
                dw0.b bVar322 = aw0Var22.f23497a;
                boolean z1922 = z11;
                long j1322 = aw0Var22.f23498b;
                this.f27524y = a(bVar322, j1322, aw0Var22.f23499c, j1322, !z1922, 0);
                n();
                s();
                j10 = j10;
                j11 = j11;
                z10 = z14;
                z14 = z10;
            }
            long j142 = j10;
            j4 = j11;
            j5 = j142;
            z5 = z14;
        }
        int i8 = this.f27524y.f31196e;
        if (i8 == z5 || i8 == 4) {
            return;
        }
        yv0 e5 = this.f27519t.e();
        if (e5 == null) {
            this.f27508i.a(a6 + 10);
            return;
        }
        j52.a("doSomeWork");
        s();
        if (e5.f35329d) {
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            j6 = 10;
            j7 = 1000;
            e5.f35326a.discardBuffer(this.f27524y.f31209r - this.f27513n, this.f27514o);
            ?? r33 = z4;
            boolean z20 = z5;
            z6 = z20;
            while (true) {
                so1[] so1VarArr4 = this.f27501b;
                if (r33 >= so1VarArr4.length) {
                    break;
                }
                so1 so1Var6 = so1VarArr4[r33];
                if (b(so1Var6)) {
                    j9 = j5;
                    so1Var6.a(this.f27496M, elapsedRealtime);
                    z20 = (z20 && so1Var6.a()) ? true : z4;
                    boolean z21 = e5.f35328c[r33] != so1Var6.g() ? true : z4;
                    boolean z22 = (z21 || ((z21 || !so1Var6.e()) ? z4 : true) || so1Var6.d() || so1Var6.a()) ? true : z4;
                    z6 = (z6 && z22) ? true : z4;
                    if (!z22) {
                        so1Var6.i();
                    }
                } else {
                    j9 = j5;
                }
                j5 = j9;
                r33++;
            }
            j8 = j5;
            z7 = z20;
        } else {
            j6 = 10;
            j7 = 1000;
            j8 = j5;
            e5.f35326a.maybeThrowPrepareError();
            z6 = true;
            z7 = true;
        }
        long j15 = e5.f35331f.f23501e;
        boolean z23 = (z7 && e5.f35329d && (j15 == j8 || j15 <= this.f27524y.f31209r)) ? true : z4;
        if (z23 && this.f27486C) {
            this.f27486C = z4;
            a(z4, this.f27524y.f31204m, z4, 5);
        }
        if (z23 && e5.f35331f.f23505i) {
            b(4);
            q();
        } else {
            rh1 rh1Var3 = this.f27524y;
            if (rh1Var3.f31196e == 2) {
                if (this.f27494K == 0) {
                    yv0 e6 = this.f27519t.e();
                    long j16 = e6.f35331f.f23501e;
                    if (e6.f35329d) {
                        if (j16 != j8) {
                            if (this.f27524y.f31209r >= j16) {
                            }
                        }
                        b(3);
                        this.f27499P = null;
                        if (o()) {
                            this.f27487D = z4;
                            this.f27515p.a();
                            so1[] so1VarArr5 = this.f27501b;
                            int length = so1VarArr5.length;
                            for (?? r82 = z4; r82 < length; r82++) {
                                so1 so1Var7 = so1VarArr5[r82];
                                if (b(so1Var7)) {
                                    so1Var7.start();
                                }
                            }
                        }
                    }
                } else if (z6) {
                    if (rh1Var3.f31198g) {
                        long a10 = a(rh1Var3.f31192a, this.f27519t.e().f35331f.f23497a) ? ((qz) this.f27521v).a() : j8;
                        yv0 d8 = this.f27519t.d();
                        boolean z24 = (!d8.f35329d || (d8.f35330e && d8.f35326a.getBufferedPositionUs() != j4) || !d8.f35331f.f23505i) ? z4 : true;
                        boolean z25 = (!d8.f35331f.f23497a.a() || d8.f35329d) ? z4 : true;
                        if (!z24) {
                            if (!z25) {
                            }
                        }
                    }
                    b(3);
                    this.f27499P = null;
                    if (o()) {
                    }
                }
            }
            if (this.f27524y.f31196e == 3) {
                if (this.f27494K == 0) {
                    yv0 e7 = this.f27519t.e();
                    long j17 = e7.f35331f.f23501e;
                    if (e7.f35329d) {
                        if (j17 != j8) {
                            if (this.f27524y.f31209r >= j17) {
                            }
                        }
                    }
                    this.f27487D = o();
                    b(2);
                    if (this.f27487D) {
                        for (yv0 e8 = this.f27519t.e(); e8 != null; e8 = e8.b()) {
                            x60[] x60VarArr = e8.f().f33513c;
                            int length2 = x60VarArr.length;
                            for (?? r9 = z4; r9 < length2; r9++) {
                                x60 x60Var = x60VarArr[r9];
                                if (x60Var != null) {
                                    x60Var.g();
                                }
                            }
                        }
                        ((qz) this.f27521v).c();
                    }
                    q();
                }
            }
        }
        if (this.f27524y.f31196e == 2) {
            ?? r52 = z4;
            while (true) {
                so1[] so1VarArr6 = this.f27501b;
                if (r52 >= so1VarArr6.length) {
                    break;
                }
                if (b(so1VarArr6[r52]) && this.f27501b[r52].g() == e5.f35328c[r52]) {
                    this.f27501b[r52].i();
                }
                r52++;
            }
            rh1 rh1Var4 = this.f27524y;
            if (!rh1Var4.f31198g && rh1Var4.f31208q < 500000 && (d4 = this.f27519t.d()) != null) {
                if ((!d4.f35329d ? 0L : d4.f35326a.getNextLoadPositionUs()) != j4) {
                    if (this.f27500Q == j8) {
                        this.f27500Q = this.f27517r.b();
                    } else if (this.f27517r.b() - this.f27500Q >= 4000) {
                        throw new IllegalStateException("Playback stuck buffering and not loading");
                    }
                    boolean z26 = (o() || this.f27524y.f31196e != 3) ? z4 : true;
                    z8 = (!this.f27493J && this.f27492I && z26) ? true : z4;
                    rh1Var = this.f27524y;
                    if (rh1Var.f31206o == z8) {
                        z9 = z8;
                        this.f27524y = new rh1(rh1Var.f31192a, rh1Var.f31193b, rh1Var.f31194c, rh1Var.f31195d, rh1Var.f31196e, rh1Var.f31197f, rh1Var.f31198g, rh1Var.f31199h, rh1Var.f31200i, rh1Var.f31201j, rh1Var.f31202k, rh1Var.f31203l, rh1Var.f31204m, rh1Var.f31205n, rh1Var.f31207p, rh1Var.f31208q, rh1Var.f31209r, z9);
                        z4 = false;
                    } else {
                        z9 = z8;
                    }
                    this.f27492I = z4;
                    if (!z9 || (i4 = this.f27524y.f31196e) == 4) {
                    }
                    if (z26 || i4 == 2) {
                        this.f27508i.a(a6 + j6);
                    } else if (i4 == 3 && this.f27494K != 0) {
                        this.f27508i.a(a6 + j7);
                    }
                    j52.a();
                    return;
                }
            }
        }
        this.f27500Q = j8;
        if (o()) {
        }
        if (!this.f27493J) {
        }
        rh1Var = this.f27524y;
        if (rh1Var.f31206o == z8) {
        }
        this.f27492I = z4;
        if (z9) {
        }
    }

    private long c() {
        yv0 f4 = this.f27519t.f();
        if (f4 == null) {
            return 0L;
        }
        long c4 = f4.c();
        if (!f4.f35329d) {
            return c4;
        }
        int i4 = 0;
        while (true) {
            so1[] so1VarArr = this.f27501b;
            if (i4 >= so1VarArr.length) {
                return c4;
            }
            if (b(so1VarArr[i4]) && this.f27501b[i4].g() == f4.f35328c[i4]) {
                long j4 = this.f27501b[i4].j();
                if (j4 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                c4 = Math.max(j4, c4);
            }
            i4++;
        }
    }

    private void e(boolean z4) {
        this.f27490G = z4;
        if (!this.f27519t.a(this.f27524y.f31192a, z4)) {
            b(true);
        }
        a(false);
    }

    public final Looper d() {
        return this.f27510k;
    }

    private void d(final fi1 fi1Var) {
        Looper a4 = fi1Var.a();
        if (!a4.getThread().isAlive()) {
            ms0.d("TAG", "Trying to send message on a dead thread.");
            fi1Var.a(false);
        } else {
            this.f27517r.a(a4, null).a(new Runnable() { // from class: com.yandex.mobile.ads.impl.R7
                @Override // java.lang.Runnable
                public final void run() {
                    j60.this.b(fi1Var);
                }
            });
        }
    }

    private static void a(fi1 fi1Var) {
        synchronized (fi1Var) {
        }
        try {
            fi1Var.c().a(fi1Var.d(), fi1Var.b());
        } finally {
            fi1Var.a(true);
        }
    }

    private void c(xv0 xv0Var) {
        if (this.f27519t.a(xv0Var)) {
            yv0 d4 = this.f27519t.d();
            d4.a(this.f27515p.getPlaybackParameters().f32440b, this.f27524y.f31192a);
            this.f27506g.a(this.f27501b, d4.f().f33513c);
            if (d4 == this.f27519t.e()) {
                b(d4.f35331f.f23498b);
                a(new boolean[this.f27501b.length]);
                rh1 rh1Var = this.f27524y;
                dw0.b bVar = rh1Var.f31193b;
                long j4 = d4.f35331f.f23498b;
                this.f27524y = a(bVar, j4, rh1Var.f31194c, j4, false, 5);
            }
            f();
        }
    }

    private void d(boolean z4) {
        this.f27485B = z4;
        n();
        if (!this.f27486C || this.f27519t.f() == this.f27519t.e()) {
            return;
        }
        b(true);
        a(false);
    }

    private void a(so1 so1Var) {
        if (b(so1Var)) {
            this.f27515p.a(so1Var);
            if (so1Var.getState() == 2) {
                so1Var.stop();
            }
            so1Var.c();
            this.f27494K--;
        }
    }

    private void a(boolean[] zArr) {
        yv0 f4 = this.f27519t.f();
        v52 f5 = f4.f();
        for (int i4 = 0; i4 < this.f27501b.length; i4++) {
            if (!f5.a(i4) && this.f27502c.remove(this.f27501b[i4])) {
                this.f27501b[i4].b();
            }
        }
        for (int i5 = 0; i5 < this.f27501b.length; i5++) {
            if (f5.a(i5)) {
                boolean z4 = zArr[i5];
                so1 so1Var = this.f27501b[i5];
                if (!b(so1Var)) {
                    yv0 f6 = this.f27519t.f();
                    boolean z5 = f6 == this.f27519t.e();
                    v52 f7 = f6.f();
                    uo1 uo1Var = f7.f33512b[i5];
                    x60 x60Var = f7.f33513c[i5];
                    int b4 = x60Var != null ? x60Var.b() : 0;
                    yb0[] yb0VarArr = new yb0[b4];
                    for (int i6 = 0; i6 < b4; i6++) {
                        yb0VarArr[i6] = x60Var.a(i6);
                    }
                    boolean z6 = o() && this.f27524y.f31196e == 3;
                    boolean z7 = !z4 && z6;
                    this.f27494K++;
                    this.f27502c.add(so1Var);
                    so1Var.a(uo1Var, yb0VarArr, f6.f35328c[i5], this.f27496M, z7, z5, f6.d(), f6.c());
                    so1Var.a(11, new i60(this));
                    this.f27515p.b(so1Var);
                    if (z6) {
                        so1Var.start();
                    }
                }
            }
        }
        f4.f35332g = true;
    }

    public final synchronized void c(fi1 fi1Var) {
        if (!this.f27484A && this.f27509j.isAlive()) {
            this.f27508i.a(14, fi1Var).a();
            return;
        }
        ms0.d("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        fi1Var.a(false);
    }

    private void c(boolean z4) {
        if (z4 == this.f27493J) {
            return;
        }
        this.f27493J = z4;
        if (z4 || !this.f27524y.f31206o) {
            return;
        }
        this.f27508i.a(2);
    }

    private long a(x42 x42Var, Object obj, long j4) {
        long elapsedRealtime;
        x42Var.a(x42Var.a(obj, this.f27512m).f34405d, this.f27511l, 0L);
        x42.d dVar = this.f27511l;
        if (dVar.f34423g != -9223372036854775807L && dVar.a()) {
            x42.d dVar2 = this.f27511l;
            if (dVar2.f34426j) {
                long j5 = dVar2.f34424h;
                int i4 = u82.f32873a;
                if (j5 == -9223372036854775807L) {
                    elapsedRealtime = System.currentTimeMillis();
                } else {
                    elapsedRealtime = j5 + SystemClock.elapsedRealtime();
                }
                return u82.a(elapsedRealtime - this.f27511l.f34423g) - (j4 + this.f27512m.f34407f);
            }
        }
        return -9223372036854775807L;
    }

    private Pair<dw0.b, Long> a(x42 x42Var) {
        long j4 = 0;
        if (x42Var.c()) {
            return Pair.create(rh1.a(), 0L);
        }
        Pair<Object, Long> a4 = x42Var.a(this.f27511l, this.f27512m, x42Var.a(this.f27490G), -9223372036854775807L);
        dw0.b a5 = this.f27519t.a(x42Var, a4.first, 0L);
        long longValue = ((Long) a4.second).longValue();
        if (a5.a()) {
            x42Var.a(a5.f35792a, this.f27512m);
            if (a5.f35794c == this.f27512m.d(a5.f35793b)) {
                j4 = this.f27512m.b();
            }
        } else {
            j4 = longValue;
        }
        return Pair.create(a5, Long.valueOf(j4));
    }

    private long a(long j4) {
        yv0 d4 = this.f27519t.d();
        if (d4 == null) {
            return 0L;
        }
        return Math.max(0L, j4 - d4.c(this.f27496M));
    }

    private void a(IOException iOException, int i4) {
        c60 a4 = c60.a(iOException, i4);
        yv0 e4 = this.f27519t.e();
        if (e4 != null) {
            a4 = a4.a(e4.f35331f.f23497a);
        }
        ms0.a("ExoPlayerImplInternal", "Playback error", a4);
        a(false, false);
        this.f27524y = this.f27524y.a(a4);
    }

    private void a(boolean z4) {
        long j4;
        yv0 d4 = this.f27519t.d();
        dw0.b bVar = d4 == null ? this.f27524y.f31193b : d4.f35331f.f23497a;
        boolean equals = this.f27524y.f31202k.equals(bVar);
        if (!equals) {
            this.f27524y = this.f27524y.a(bVar);
        }
        rh1 rh1Var = this.f27524y;
        if (d4 == null) {
            j4 = rh1Var.f31209r;
        } else if (!d4.f35329d) {
            j4 = d4.f35331f.f23498b;
        } else {
            long bufferedPositionUs = d4.f35330e ? d4.f35326a.getBufferedPositionUs() : Long.MIN_VALUE;
            j4 = bufferedPositionUs == Long.MIN_VALUE ? d4.f35331f.f23501e : bufferedPositionUs;
        }
        rh1Var.f31207p = j4;
        rh1 rh1Var2 = this.f27524y;
        rh1Var2.f31208q = a(rh1Var2.f31207p);
        if ((!equals || z4) && d4 != null && d4.f35329d) {
            this.f27506g.a(this.f27501b, d4.f().f33513c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0211 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03ea  */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v9, types: [long] */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v23 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r22v13 */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r22v20 */
    /* JADX WARN: Type inference failed for: r22v21 */
    /* JADX WARN: Type inference failed for: r22v25 */
    /* JADX WARN: Type inference failed for: r22v27 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(x42 x42Var, boolean z4) {
        long j4;
        long j5;
        dw0.b bVar;
        x42.d dVar;
        long j6;
        boolean z5;
        int i4;
        long j7;
        Object obj;
        long j8;
        int i5;
        int i6;
        boolean z6;
        boolean z7;
        boolean z8;
        long j9;
        float f4;
        x42 x42Var2;
        long j10;
        dw0.b a4;
        boolean z9;
        ?? r7;
        long j11;
        f fVar;
        long b4;
        int i7;
        boolean z10;
        long j12;
        ?? r22;
        long j13;
        boolean z11;
        x42 x42Var3;
        g gVar;
        long j14;
        boolean z12;
        dw0.b bVar2;
        long j15;
        boolean z13;
        g gVar2;
        x42 x42Var4;
        boolean z14;
        ?? r20;
        x42 x42Var5;
        long j16;
        boolean z15;
        g gVar3;
        x42 x42Var6;
        long j17;
        boolean z16;
        g gVar4;
        rh1 rh1Var = this.f27524y;
        g gVar5 = this.f27495L;
        bw0 bw0Var = this.f27519t;
        int i8 = this.f27489F;
        boolean z17 = this.f27490G;
        x42.d dVar2 = this.f27511l;
        x42.b bVar3 = this.f27512m;
        if (x42Var.c()) {
            r20 = -9223372036854775807;
            r22 = 0;
            x42Var2 = x42Var;
            fVar = new f(rh1.a(), 0L, -9223372036854775807L, false, true, false);
            j4 = -9223372036854775807L;
        } else {
            dw0.b bVar4 = rh1Var.f31193b;
            Object obj2 = bVar4.f35792a;
            j4 = -9223372036854775807L;
            x42 x42Var7 = rh1Var.f31192a;
            boolean z18 = x42Var7.c() || x42Var7.a(bVar4.f35792a, bVar3).f34408g;
            if (!rh1Var.f31193b.a() && !z18) {
                j5 = rh1Var.f31209r;
            } else {
                j5 = rh1Var.f31194c;
            }
            if (gVar5 != null) {
                Object obj3 = obj2;
                bVar = bVar4;
                Pair<Object, Long> a5 = a(x42Var, gVar5, true, i8, z17, dVar2, bVar3);
                if (a5 == null) {
                    i5 = x42Var.a(z17);
                    dVar = dVar2;
                    obj = obj3;
                    j8 = j5;
                    i6 = -1;
                    j9 = 0;
                    z6 = false;
                    z7 = true;
                    z8 = false;
                    f4 = j9;
                    if (i5 != i6) {
                        x42Var2 = x42Var;
                        Pair<Object, Long> a6 = x42Var2.a(dVar, bVar3, i5, -9223372036854775807L);
                        obj = a6.first;
                        j8 = ((Long) a6.second).longValue();
                        j10 = -9223372036854775807L;
                    } else {
                        x42Var2 = x42Var;
                        j10 = j8;
                    }
                    a4 = bw0Var.a(x42Var2, obj, j8);
                    int i9 = a4.f35796e;
                    z9 = (bVar.f35792a.equals(obj) || bVar.a() || a4.a() || !(i9 != i6 || ((i7 = bVar.f35796e) != i6 && i9 >= i7))) ? false : true;
                    x42.b a7 = x42Var2.a(obj, bVar3);
                    r7 = (z18 && j5 == j10 && bVar.f35792a.equals(a4.f35792a) && (!(bVar.a() && a7.f(bVar.f35793b)) ? !(a4.a() && a7.f(a4.f35793b)) : a7.b(bVar.f35793b, bVar.f35794c) == 4 || a7.b(bVar.f35793b, bVar.f35794c) == 2)) ? 1 : 0;
                    if (!z9 || r7 != 0) {
                        a4 = bVar;
                    }
                    if (a4.a()) {
                        if (a4.equals(bVar)) {
                            b4 = rh1Var.f31209r;
                        } else {
                            x42Var2.a(a4.f35792a, bVar3);
                            if (a4.f35794c == bVar3.d(a4.f35793b)) {
                                b4 = bVar3.b();
                            } else {
                                j11 = f4 == true ? 1 : 0;
                            }
                        }
                        j11 = b4;
                    } else {
                        j11 = j8;
                    }
                    fVar = new f(a4, j11, j10, z6, z7, z8);
                    r22 = f4;
                } else {
                    if (gVar5.f27545c == -9223372036854775807L) {
                        i5 = x42Var.a(a5.first, bVar3).f34405d;
                        j8 = j5;
                        z10 = false;
                    } else {
                        Object obj4 = a5.first;
                        j8 = ((Long) a5.second).longValue();
                        obj3 = obj4;
                        i5 = -1;
                        z10 = true;
                    }
                    if (rh1Var.f31196e == 4) {
                        dVar = dVar2;
                        obj = obj3;
                        z8 = z10;
                        i6 = -1;
                        j12 = 0;
                        z6 = true;
                    } else {
                        dVar = dVar2;
                        obj = obj3;
                        z8 = z10;
                        i6 = -1;
                        j12 = 0;
                        z6 = false;
                    }
                    z7 = false;
                    f4 = j12;
                    if (i5 != i6) {
                    }
                    a4 = bw0Var.a(x42Var2, obj, j8);
                    int i92 = a4.f35796e;
                    if (bVar.f35792a.equals(obj)) {
                    }
                    x42.b a72 = x42Var2.a(obj, bVar3);
                    if (z18) {
                    }
                    if (!z9) {
                    }
                    a4 = bVar;
                    if (a4.a()) {
                    }
                    fVar = new f(a4, j11, j10, z6, z7, z8);
                    r22 = f4;
                }
            } else {
                bVar = bVar4;
                Object obj5 = obj2;
                if (rh1Var.f31192a.c()) {
                    i5 = x42Var.a(z17);
                    dVar = dVar2;
                } else {
                    if (x42Var.a(obj5) == -1) {
                        Object a8 = a(dVar2, bVar3, i8, z17, obj5, rh1Var.f31192a, x42Var);
                        dVar = dVar2;
                        bVar3 = bVar3;
                        obj5 = obj5;
                        if (a8 == null) {
                            i4 = x42Var.a(z17);
                            z5 = true;
                        } else {
                            i4 = x42Var.a(a8, bVar3).f34405d;
                            z5 = false;
                        }
                        j6 = 0;
                    } else {
                        dVar = dVar2;
                        if (j5 == -9223372036854775807L) {
                            i5 = x42Var.a(obj5, bVar3).f34405d;
                        } else if (z18) {
                            rh1Var.f31192a.a(bVar.f35792a, bVar3);
                            if (rh1Var.f31192a.a(bVar3.f34405d, dVar, 0L).f34432p == rh1Var.f31192a.a(bVar.f35792a)) {
                                j7 = 0;
                                Pair<Object, Long> a9 = x42Var.a(dVar, bVar3, x42Var.a(obj5, bVar3).f34405d, j5 + bVar3.f34407f);
                                obj = a9.first;
                                j8 = ((Long) a9.second).longValue();
                            } else {
                                j7 = 0;
                                obj = obj5;
                                j8 = j5;
                            }
                            i5 = -1;
                            i6 = -1;
                            z6 = false;
                            z7 = false;
                            z8 = true;
                            f4 = j7;
                            if (i5 != i6) {
                            }
                            a4 = bw0Var.a(x42Var2, obj, j8);
                            int i922 = a4.f35796e;
                            if (bVar.f35792a.equals(obj)) {
                            }
                            x42.b a722 = x42Var2.a(obj, bVar3);
                            if (z18) {
                            }
                            if (!z9) {
                            }
                            a4 = bVar;
                            if (a4.a()) {
                            }
                            fVar = new f(a4, j11, j10, z6, z7, z8);
                            r22 = f4;
                        } else {
                            j6 = 0;
                            z5 = false;
                            i4 = -1;
                        }
                    }
                    z7 = z5;
                    i5 = i4;
                    obj = obj5;
                    j8 = j5;
                    i6 = -1;
                    z6 = false;
                    j9 = j6;
                    z8 = false;
                    f4 = j9;
                    if (i5 != i6) {
                    }
                    a4 = bw0Var.a(x42Var2, obj, j8);
                    int i9222 = a4.f35796e;
                    if (bVar.f35792a.equals(obj)) {
                    }
                    x42.b a7222 = x42Var2.a(obj, bVar3);
                    if (z18) {
                    }
                    if (!z9) {
                    }
                    a4 = bVar;
                    if (a4.a()) {
                    }
                    fVar = new f(a4, j11, j10, z6, z7, z8);
                    r22 = f4;
                }
                obj = obj5;
                j8 = j5;
                i6 = -1;
                j9 = 0;
                z6 = false;
                z7 = false;
                z8 = false;
                f4 = j9;
                if (i5 != i6) {
                }
                a4 = bw0Var.a(x42Var2, obj, j8);
                int i92222 = a4.f35796e;
                if (bVar.f35792a.equals(obj)) {
                }
                x42.b a72222 = x42Var2.a(obj, bVar3);
                if (z18) {
                }
                if (!z9) {
                }
                a4 = bVar;
                if (a4.a()) {
                }
                fVar = new f(a4, j11, j10, z6, z7, z8);
                r22 = f4;
            }
        }
        dw0.b bVar5 = fVar.f27537a;
        ?? r11 = fVar.f27539c;
        boolean z19 = fVar.f27540d;
        long j18 = fVar.f27538b;
        boolean z20 = (this.f27524y.f31193b.equals(bVar5) && j18 == this.f27524y.f31209r) ? false : true;
        try {
            if (fVar.f27541e) {
                try {
                    z14 = true;
                    if (this.f27524y.f31196e != 1) {
                        try {
                            b(4);
                        } catch (Throwable th) {
                            th = th;
                            z11 = z14;
                            j13 = r11;
                            x42Var3 = x42Var2;
                            gVar = null;
                            z12 = z11;
                            j14 = j13;
                            bVar2 = bVar5;
                            gVar2 = gVar;
                            z13 = z12;
                            j15 = j14;
                            rh1 rh1Var2 = this.f27524y;
                            x42 x42Var8 = rh1Var2.f31192a;
                            dw0.b bVar6 = rh1Var2.f31193b;
                            dw0.b bVar7 = bVar2;
                            x42Var4 = x42Var3;
                            a(x42Var4, bVar7, x42Var8, bVar6, !fVar.f27542f ? j18 : j4);
                            if (!z20) {
                            }
                            rh1 rh1Var3 = this.f27524y;
                            Object obj6 = rh1Var3.f31193b.f35792a;
                            x42 x42Var9 = rh1Var3.f31192a;
                            if (z20) {
                            }
                            this.f27524y = a(bVar7, j18, j15, this.f27524y.f31195d, (z20 || !z4 || x42Var9.c() || x42Var9.a(obj6, this.f27512m).f34408g) ? false : z13, x42Var4.a(obj6) != -1 ? 3 : 4);
                            n();
                            a(x42Var4, this.f27524y.f31192a);
                            this.f27524y = this.f27524y.a(x42Var4);
                            if (!x42Var4.c()) {
                            }
                            a(false);
                            throw th;
                        }
                    }
                    a(false, false, false, true);
                } catch (Throwable th2) {
                    th = th2;
                    z14 = true;
                }
            } else {
                z14 = true;
            }
            try {
                if (!z20) {
                    try {
                        r20 = z14;
                    } catch (Throwable th3) {
                        th = th3;
                        r7 = x42Var;
                        r20 = z14;
                    }
                    try {
                        r22 = r11;
                        r11 = 0;
                        try {
                            x42Var5 = x42Var;
                            gVar4 = r11;
                            z16 = r20;
                            j17 = r22;
                            if (!this.f27519t.a(x42Var, this.f27496M, c())) {
                                b(false);
                                gVar4 = r11;
                                z16 = r20;
                                j17 = r22;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r7 = x42Var;
                            x42Var3 = r7;
                            gVar = r11;
                            z12 = r20;
                            j14 = r22;
                            bVar2 = bVar5;
                            gVar2 = gVar;
                            z13 = z12;
                            j15 = j14;
                            rh1 rh1Var22 = this.f27524y;
                            x42 x42Var82 = rh1Var22.f31192a;
                            dw0.b bVar62 = rh1Var22.f31193b;
                            dw0.b bVar72 = bVar2;
                            x42Var4 = x42Var3;
                            a(x42Var4, bVar72, x42Var82, bVar62, !fVar.f27542f ? j18 : j4);
                            if (!z20) {
                            }
                            rh1 rh1Var32 = this.f27524y;
                            Object obj62 = rh1Var32.f31193b.f35792a;
                            x42 x42Var92 = rh1Var32.f31192a;
                            if (z20) {
                            }
                            this.f27524y = a(bVar72, j18, j15, this.f27524y.f31195d, (z20 || !z4 || x42Var92.c() || x42Var92.a(obj62, this.f27512m).f34408g) ? false : z13, x42Var4.a(obj62) != -1 ? 3 : 4);
                            n();
                            a(x42Var4, this.f27524y.f31192a);
                            this.f27524y = this.f27524y.a(x42Var4);
                            if (!x42Var4.c()) {
                            }
                            a(false);
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r7 = x42Var;
                        r20 = r20;
                        r22 = r11;
                        r11 = 0;
                        x42Var3 = r7;
                        gVar = r11;
                        z12 = r20;
                        j14 = r22;
                        bVar2 = bVar5;
                        gVar2 = gVar;
                        z13 = z12;
                        j15 = j14;
                        rh1 rh1Var222 = this.f27524y;
                        x42 x42Var822 = rh1Var222.f31192a;
                        dw0.b bVar622 = rh1Var222.f31193b;
                        dw0.b bVar722 = bVar2;
                        x42Var4 = x42Var3;
                        a(x42Var4, bVar722, x42Var822, bVar622, !fVar.f27542f ? j18 : j4);
                        if (!z20) {
                        }
                        rh1 rh1Var322 = this.f27524y;
                        Object obj622 = rh1Var322.f31193b.f35792a;
                        x42 x42Var922 = rh1Var322.f31192a;
                        if (z20) {
                        }
                        this.f27524y = a(bVar722, j18, j15, this.f27524y.f31195d, (z20 || !z4 || x42Var922.c() || x42Var922.a(obj622, this.f27512m).f34408g) ? false : z13, x42Var4.a(obj622) != -1 ? 3 : 4);
                        n();
                        a(x42Var4, this.f27524y.f31192a);
                        this.f27524y = this.f27524y.a(x42Var4);
                        if (!x42Var4.c()) {
                        }
                        a(false);
                        throw th;
                    }
                } else {
                    x42Var5 = x42Var2;
                    boolean z21 = z14;
                    long j19 = r11;
                    g gVar6 = null;
                    gVar4 = gVar6;
                    z16 = z21;
                    j17 = j19;
                    if (!x42Var5.c()) {
                        try {
                            for (yv0 e4 = this.f27519t.e(); e4 != null; e4 = e4.b()) {
                                if (e4.f35331f.f23497a.equals(bVar5)) {
                                    aw0 a10 = this.f27519t.a(x42Var5, e4.f35331f);
                                    e4.f35331f = a10;
                                    xv0 xv0Var = e4.f35326a;
                                    if (xv0Var instanceof vo) {
                                        long j20 = a10.f23500d;
                                        if (j20 == j4) {
                                            j20 = Long.MIN_VALUE;
                                        }
                                        ((vo) xv0Var).a(j20);
                                    }
                                }
                            }
                            bVar2 = bVar5;
                            try {
                                j18 = a(bVar2, j18, this.f27519t.e() != this.f27519t.f() ? z21 : false, z19);
                                gVar3 = gVar6;
                                z15 = z21;
                                j16 = j19;
                                rh1 rh1Var4 = this.f27524y;
                                dw0.b bVar8 = bVar2;
                                x42Var6 = x42Var5;
                                a(x42Var6, bVar8, rh1Var4.f31192a, rh1Var4.f31193b, !fVar.f27542f ? j18 : j4);
                                if (!z20 || j16 != this.f27524y.f31194c) {
                                    rh1 rh1Var5 = this.f27524y;
                                    Object obj7 = rh1Var5.f31193b.f35792a;
                                    x42 x42Var10 = rh1Var5.f31192a;
                                    this.f27524y = a(bVar8, j18, j16, this.f27524y.f31195d, (z20 || !z4 || x42Var10.c() || x42Var10.a(obj7, this.f27512m).f34408g) ? false : z15, x42Var6.a(obj7) != -1 ? 3 : 4);
                                }
                                n();
                                a(x42Var6, this.f27524y.f31192a);
                                this.f27524y = this.f27524y.a(x42Var6);
                                if (!x42Var6.c()) {
                                    this.f27495L = gVar3;
                                }
                                a(false);
                            } catch (Throwable th6) {
                                th = th6;
                                j18 = j18;
                                x42Var3 = x42Var5;
                                gVar2 = gVar6;
                                z13 = z21;
                                j15 = j19;
                                rh1 rh1Var2222 = this.f27524y;
                                x42 x42Var8222 = rh1Var2222.f31192a;
                                dw0.b bVar6222 = rh1Var2222.f31193b;
                                dw0.b bVar7222 = bVar2;
                                x42Var4 = x42Var3;
                                a(x42Var4, bVar7222, x42Var8222, bVar6222, !fVar.f27542f ? j18 : j4);
                                if (!z20 || j15 != this.f27524y.f31194c) {
                                    rh1 rh1Var3222 = this.f27524y;
                                    Object obj6222 = rh1Var3222.f31193b.f35792a;
                                    x42 x42Var9222 = rh1Var3222.f31192a;
                                    this.f27524y = a(bVar7222, j18, j15, this.f27524y.f31195d, (z20 || !z4 || x42Var9222.c() || x42Var9222.a(obj6222, this.f27512m).f34408g) ? false : z13, x42Var4.a(obj6222) != -1 ? 3 : 4);
                                }
                                n();
                                a(x42Var4, this.f27524y.f31192a);
                                this.f27524y = this.f27524y.a(x42Var4);
                                if (!x42Var4.c()) {
                                    this.f27495L = gVar2;
                                }
                                a(false);
                                throw th;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            bVar2 = bVar5;
                        }
                    }
                }
                bVar2 = bVar5;
                gVar3 = gVar4;
                z15 = z16;
                j16 = j17;
                rh1 rh1Var42 = this.f27524y;
                dw0.b bVar82 = bVar2;
                x42Var6 = x42Var5;
                a(x42Var6, bVar82, rh1Var42.f31192a, rh1Var42.f31193b, !fVar.f27542f ? j18 : j4);
                if (!z20) {
                }
                rh1 rh1Var52 = this.f27524y;
                Object obj72 = rh1Var52.f31193b.f35792a;
                x42 x42Var102 = rh1Var52.f31192a;
                this.f27524y = a(bVar82, j18, j16, this.f27524y.f31195d, (z20 || !z4 || x42Var102.c() || x42Var102.a(obj72, this.f27512m).f34408g) ? false : z15, x42Var6.a(obj72) != -1 ? 3 : 4);
                n();
                a(x42Var6, this.f27524y.f31192a);
                this.f27524y = this.f27524y.a(x42Var6);
                if (!x42Var6.c()) {
                }
                a(false);
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Throwable th9) {
            th = th9;
            j13 = r11;
            z11 = true;
        }
    }

    private void b(xv0 xv0Var) {
        if (this.f27519t.a(xv0Var)) {
            this.f27519t.a(this.f27496M);
            f();
        }
    }

    private static boolean b(so1 so1Var) {
        return so1Var.getState() != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(fi1 fi1Var) {
        try {
            a(fi1Var);
        } catch (c60 e4) {
            ms0.a("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e4);
            throw new RuntimeException(e4);
        }
    }

    private void b(long j4) {
        yv0 e4 = this.f27519t.e();
        long d4 = e4 == null ? j4 + 1000000000000L : e4.d(j4);
        this.f27496M = d4;
        this.f27515p.a(d4);
        for (so1 so1Var : this.f27501b) {
            if (b(so1Var)) {
                so1Var.a(this.f27496M);
            }
        }
        for (yv0 e5 = this.f27519t.e(); e5 != null; e5 = e5.b()) {
            for (x60 x60Var : e5.f().f33513c) {
                if (x60Var != null) {
                    x60Var.f();
                }
            }
        }
    }

    private void a(th1 th1Var, float f4, boolean z4, boolean z5) {
        th1 th1Var2;
        int i4;
        if (z4) {
            if (z5) {
                this.f27525z.a(1);
            }
            rh1 rh1Var = this.f27524y;
            rh1 rh1Var2 = new rh1(rh1Var.f31192a, rh1Var.f31193b, rh1Var.f31194c, rh1Var.f31195d, rh1Var.f31196e, rh1Var.f31197f, rh1Var.f31198g, rh1Var.f31199h, rh1Var.f31200i, rh1Var.f31201j, rh1Var.f31202k, rh1Var.f31203l, rh1Var.f31204m, th1Var, rh1Var.f31207p, rh1Var.f31208q, rh1Var.f31209r, rh1Var.f31206o);
            th1Var2 = th1Var;
            this.f27524y = rh1Var2;
        } else {
            th1Var2 = th1Var;
        }
        float f5 = th1Var2.f32440b;
        yv0 e4 = this.f27519t.e();
        while (true) {
            i4 = 0;
            if (e4 == null) {
                break;
            }
            x60[] x60VarArr = e4.f().f33513c;
            int length = x60VarArr.length;
            while (i4 < length) {
                x60 x60Var = x60VarArr[i4];
                if (x60Var != null) {
                    x60Var.a(f5);
                }
                i4++;
            }
            e4 = e4.b();
        }
        so1[] so1VarArr = this.f27501b;
        int length2 = so1VarArr.length;
        while (i4 < length2) {
            so1 so1Var = so1VarArr[i4];
            if (so1Var != null) {
                so1Var.a(f4, th1Var2.f32440b);
            }
            i4++;
        }
    }

    private void b(boolean z4) {
        dw0.b bVar = this.f27519t.e().f35331f.f23497a;
        long a4 = a(bVar, this.f27524y.f31209r, true, false);
        if (a4 != this.f27524y.f31209r) {
            rh1 rh1Var = this.f27524y;
            this.f27524y = a(bVar, a4, rh1Var.f31194c, rh1Var.f31195d, z4, 5);
        }
    }

    private rh1 a(dw0.b bVar, long j4, long j5, long j6, boolean z4, int i4) {
        List<wz0> list;
        o52 o52Var;
        v52 v52Var;
        o52 e4;
        v52 f4;
        sj0 sj0Var;
        this.f27498O = (!this.f27498O && j4 == this.f27524y.f31209r && bVar.equals(this.f27524y.f31193b)) ? false : true;
        n();
        rh1 rh1Var = this.f27524y;
        o52 o52Var2 = rh1Var.f31199h;
        v52 v52Var2 = rh1Var.f31200i;
        List<wz0> list2 = rh1Var.f31201j;
        if (this.f27520u.c()) {
            yv0 e5 = this.f27519t.e();
            if (e5 == null) {
                e4 = o52.f29910e;
            } else {
                e4 = e5.e();
            }
            if (e5 == null) {
                f4 = this.f27505f;
            } else {
                f4 = e5.f();
            }
            x60[] x60VarArr = f4.f33513c;
            sj0.a aVar = new sj0.a();
            boolean z5 = false;
            for (x60 x60Var : x60VarArr) {
                if (x60Var != null) {
                    wz0 wz0Var = x60Var.a(0).f34989k;
                    if (wz0Var == null) {
                        aVar.b(new wz0(new wz0.b[0]));
                    } else {
                        aVar.b(wz0Var);
                        z5 = true;
                    }
                }
            }
            sj0 a4 = z5 ? aVar.a() : sj0.h();
            if (e5 != null) {
                aw0 aw0Var = e5.f35331f;
                long j7 = aw0Var.f23499c;
                if (j7 != j5) {
                    if (j5 == j7) {
                        sj0Var = a4;
                    } else {
                        sj0Var = a4;
                        aw0Var = new aw0(aw0Var.f23497a, aw0Var.f23498b, j5, aw0Var.f23500d, aw0Var.f23501e, aw0Var.f23502f, aw0Var.f23503g, aw0Var.f23504h, aw0Var.f23505i);
                    }
                    e5.f35331f = aw0Var;
                    o52Var = e4;
                    v52Var = f4;
                    list = sj0Var;
                }
            }
            sj0Var = a4;
            o52Var = e4;
            v52Var = f4;
            list = sj0Var;
        } else {
            if (!bVar.equals(this.f27524y.f31193b)) {
                o52Var2 = o52.f29910e;
                v52Var2 = this.f27505f;
                list2 = sj0.h();
            }
            list = list2;
            o52Var = o52Var2;
            v52Var = v52Var2;
        }
        if (z4) {
            d dVar = this.f27525z;
            if (!dVar.f27533d || dVar.f27534e == 5) {
                dVar.f27530a = true;
                dVar.f27533d = true;
                dVar.f27534e = i4;
            } else if (i4 != 5) {
                throw new IllegalArgumentException();
            }
        }
        rh1 rh1Var2 = this.f27524y;
        return rh1Var2.a(bVar, j4, j5, j6, a(rh1Var2.f31207p), o52Var, v52Var, list);
    }

    private void b(th1 th1Var) {
        this.f27515p.a(th1Var);
        th1 playbackParameters = this.f27515p.getPlaybackParameters();
        a(playbackParameters, playbackParameters.f32440b, true, true);
    }

    private void b(int i4) {
        rh1 rh1Var = this.f27524y;
        if (rh1Var.f31196e != i4) {
            if (i4 != 2) {
                this.f27500Q = -9223372036854775807L;
            }
            this.f27524y = rh1Var.a(i4);
        }
    }

    private void a(b bVar) {
        this.f27525z.a(1);
        gw0 gw0Var = this.f27520u;
        bVar.getClass();
        a(gw0Var.d(), false);
    }

    @Override // com.yandex.mobile.ads.impl.bx1.a
    public final void a(xv0 xv0Var) {
        this.f27508i.a(9, xv0Var).a();
    }

    public final void a(th1 th1Var) {
        this.f27508i.a(16, th1Var).a();
    }

    @Override // com.yandex.mobile.ads.impl.xv0.a
    /* renamed from: a, reason: avoid collision after fix types in other method */
    public final void a2(xv0 xv0Var) {
        this.f27508i.a(8, xv0Var).a();
    }

    @Override // com.yandex.mobile.ads.impl.u52.a
    public final void a() {
        this.f27508i.a(10);
    }

    private void a(int i4, int i5, xx1 xx1Var) {
        this.f27525z.a(1);
        a(this.f27520u.a(i4, i5, xx1Var), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(boolean z4, boolean z5, boolean z6, boolean z7) {
        long j4;
        boolean z8;
        this.f27508i.c();
        this.f27499P = null;
        this.f27487D = false;
        this.f27515p.b();
        this.f27496M = 1000000000000L;
        for (so1 so1Var : this.f27501b) {
            try {
                a(so1Var);
            } catch (c60 | RuntimeException e4) {
                ms0.a("ExoPlayerImplInternal", "Disable failed.", e4);
            }
        }
        if (z4) {
            for (so1 so1Var2 : this.f27501b) {
                if (this.f27502c.remove(so1Var2)) {
                    try {
                        so1Var2.b();
                    } catch (RuntimeException e5) {
                        ms0.a("ExoPlayerImplInternal", "Reset failed.", e5);
                    }
                }
            }
        }
        this.f27494K = 0;
        rh1 rh1Var = this.f27524y;
        dw0.b bVar = rh1Var.f31193b;
        long j5 = rh1Var.f31209r;
        if (!this.f27524y.f31193b.a()) {
            rh1 rh1Var2 = this.f27524y;
            x42.b bVar2 = this.f27512m;
            dw0.b bVar3 = rh1Var2.f31193b;
            x42 x42Var = rh1Var2.f31192a;
            if (!x42Var.c() && !x42Var.a(bVar3.f35792a, bVar2).f34408g) {
                j4 = this.f27524y.f31209r;
                if (z5) {
                    this.f27495L = null;
                    Pair<dw0.b, Long> a4 = a(this.f27524y.f31192a);
                    bVar = (dw0.b) a4.first;
                    j5 = ((Long) a4.second).longValue();
                    j4 = -9223372036854775807L;
                    if (!bVar.equals(this.f27524y.f31193b)) {
                        z8 = true;
                        long j6 = j5;
                        dw0.b bVar4 = bVar;
                        this.f27519t.c();
                        this.f27488E = false;
                        rh1 rh1Var3 = this.f27524y;
                        x42 x42Var2 = rh1Var3.f31192a;
                        int i4 = rh1Var3.f31196e;
                        c60 c60Var = z7 ? null : rh1Var3.f31197f;
                        o52 o52Var = z8 ? o52.f29910e : rh1Var3.f31199h;
                        v52 v52Var = z8 ? this.f27505f : rh1Var3.f31200i;
                        List h4 = z8 ? sj0.h() : rh1Var3.f31201j;
                        rh1 rh1Var4 = this.f27524y;
                        this.f27524y = new rh1(x42Var2, bVar4, j4, j6, i4, c60Var, false, o52Var, v52Var, h4, bVar4, rh1Var4.f31203l, rh1Var4.f31204m, rh1Var4.f31205n, j6, 0L, j6, false);
                        if (z6) {
                            this.f27520u.e();
                            return;
                        }
                        return;
                    }
                }
                z8 = false;
                long j62 = j5;
                dw0.b bVar42 = bVar;
                this.f27519t.c();
                this.f27488E = false;
                rh1 rh1Var32 = this.f27524y;
                x42 x42Var22 = rh1Var32.f31192a;
                int i42 = rh1Var32.f31196e;
                c60 c60Var2 = z7 ? null : rh1Var32.f31197f;
                o52 o52Var2 = z8 ? o52.f29910e : rh1Var32.f31199h;
                v52 v52Var2 = z8 ? this.f27505f : rh1Var32.f31200i;
                List h42 = z8 ? sj0.h() : rh1Var32.f31201j;
                rh1 rh1Var42 = this.f27524y;
                this.f27524y = new rh1(x42Var22, bVar42, j4, j62, i42, c60Var2, false, o52Var2, v52Var2, h42, bVar42, rh1Var42.f31203l, rh1Var42.f31204m, rh1Var42.f31205n, j62, 0L, j62, false);
                if (z6) {
                }
            }
        }
        j4 = this.f27524y.f31194c;
        if (z5) {
        }
        z8 = false;
        long j622 = j5;
        dw0.b bVar422 = bVar;
        this.f27519t.c();
        this.f27488E = false;
        rh1 rh1Var322 = this.f27524y;
        x42 x42Var222 = rh1Var322.f31192a;
        int i422 = rh1Var322.f31196e;
        c60 c60Var22 = z7 ? null : rh1Var322.f31197f;
        o52 o52Var22 = z8 ? o52.f29910e : rh1Var322.f31199h;
        v52 v52Var22 = z8 ? this.f27505f : rh1Var322.f31200i;
        List h422 = z8 ? sj0.h() : rh1Var322.f31201j;
        rh1 rh1Var422 = this.f27524y;
        this.f27524y = new rh1(x42Var222, bVar422, j4, j622, i422, c60Var22, false, o52Var22, v52Var22, h422, bVar422, rh1Var422.f31203l, rh1Var422.f31204m, rh1Var422.f31205n, j622, 0L, j622, false);
        if (z6) {
        }
    }

    private void a(x42 x42Var, x42 x42Var2) {
        if (x42Var.c() && x42Var2.c()) {
            return;
        }
        int size = this.f27516q.size() - 1;
        if (size < 0) {
            Collections.sort(this.f27516q);
        } else {
            this.f27516q.get(size).getClass();
            throw null;
        }
    }

    private static Pair<Object, Long> a(x42 x42Var, g gVar, boolean z4, int i4, boolean z5, x42.d dVar, x42.b bVar) {
        Pair<Object, Long> a4;
        x42 x42Var2;
        Object a5;
        x42 x42Var3 = gVar.f27543a;
        if (x42Var.c()) {
            return null;
        }
        if (x42Var3.c()) {
            x42Var3 = x42Var;
        }
        try {
            a4 = x42Var3.a(dVar, bVar, gVar.f27544b, gVar.f27545c);
            x42Var2 = x42Var3;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (x42Var.equals(x42Var2)) {
            return a4;
        }
        if (x42Var.a(a4.first) != -1) {
            return (x42Var2.a(a4.first, bVar).f34408g && x42Var2.a(bVar.f34405d, dVar, 0L).f34432p == x42Var2.a(a4.first)) ? x42Var.a(dVar, bVar, x42Var.a(a4.first, bVar).f34405d, gVar.f27545c) : a4;
        }
        if (z4 && (a5 = a(dVar, bVar, i4, z5, a4.first, x42Var2, x42Var)) != null) {
            return x42Var.a(dVar, bVar, x42Var.a(a5, bVar).f34405d, -9223372036854775807L);
        }
        return null;
    }

    static Object a(x42.d dVar, x42.b bVar, int i4, boolean z4, Object obj, x42 x42Var, x42 x42Var2) {
        int a4 = x42Var.a(obj);
        int a5 = x42Var.a();
        int i5 = 0;
        int i6 = a4;
        int i7 = -1;
        while (i5 < a5 && i7 == -1) {
            x42.d dVar2 = dVar;
            x42.b bVar2 = bVar;
            int i8 = i4;
            boolean z5 = z4;
            x42 x42Var3 = x42Var;
            i6 = x42Var3.a(i6, bVar2, dVar2, i8, z5);
            if (i6 == -1) {
                break;
            }
            i7 = x42Var2.a(x42Var3.a(i6));
            i5++;
            x42Var = x42Var3;
            bVar = bVar2;
            dVar = dVar2;
            i4 = i8;
            z4 = z5;
        }
        if (i7 == -1) {
            return null;
        }
        return x42Var2.a(i7);
    }

    private void a(g gVar) {
        long longValue;
        dw0.b a4;
        long j4;
        boolean z4;
        long j5;
        boolean z5;
        dw0.b bVar;
        long j6;
        long a5;
        long j7;
        rh1 rh1Var;
        int i4;
        long a6;
        boolean z6;
        rh1 rh1Var2;
        dw0.b bVar2;
        x42 x42Var;
        long j8;
        dw0.b bVar3;
        boolean z7;
        long j9;
        this.f27525z.a(1);
        Pair<Object, Long> a7 = a(this.f27524y.f31192a, gVar, true, this.f27489F, this.f27490G, this.f27511l, this.f27512m);
        if (a7 == null) {
            Pair<dw0.b, Long> a8 = a(this.f27524y.f31192a);
            a4 = (dw0.b) a8.first;
            longValue = ((Long) a8.second).longValue();
            z4 = !this.f27524y.f31192a.c();
            j5 = -9223372036854775807L;
            j4 = 0;
        } else {
            Object obj = a7.first;
            longValue = ((Long) a7.second).longValue();
            long j10 = gVar.f27545c == -9223372036854775807L ? -9223372036854775807L : longValue;
            a4 = this.f27519t.a(this.f27524y.f31192a, obj, longValue);
            if (a4.a()) {
                this.f27524y.f31192a.a(a4.f35792a, this.f27512m);
                longValue = this.f27512m.d(a4.f35793b) == a4.f35794c ? this.f27512m.b() : 0L;
                j4 = 0;
            } else {
                j4 = 0;
                if (gVar.f27545c != -9223372036854775807L) {
                    z4 = false;
                    j5 = j10;
                }
            }
            z4 = true;
            j5 = j10;
        }
        try {
            if (this.f27524y.f31192a.c()) {
                this.f27495L = gVar;
            } else if (a7 == null) {
                if (this.f27524y.f31196e != 1) {
                    b(4);
                }
                a(false, true, false, true);
            } else {
                if (a4.equals(this.f27524y.f31193b)) {
                    try {
                        yv0 e4 = this.f27519t.e();
                        a5 = (e4 == null || !e4.f35329d || longValue == j4) ? longValue : e4.f35326a.a(longValue, this.f27523x);
                        if (u82.b(a5) != u82.b(this.f27524y.f31209r) || ((i4 = (rh1Var = this.f27524y).f31196e) != 2 && i4 != 3)) {
                            z5 = z4;
                            j7 = j5;
                            bVar = a4;
                        }
                        long j11 = rh1Var.f31209r;
                        this.f27524y = a(a4, j11, j5, j11, z4, 2);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        z5 = z4;
                        bVar = a4;
                        j6 = longValue;
                        this.f27524y = a(bVar, j6, j5, j6, z5, 2);
                        throw th;
                    }
                }
                z5 = z4;
                j7 = j5;
                bVar = a4;
                a5 = longValue;
                try {
                    a6 = a(bVar, a5, this.f27519t.e() != this.f27519t.f(), this.f27524y.f31196e == 4);
                    z6 = z5 | (longValue != a6);
                    try {
                        rh1Var2 = this.f27524y;
                        bVar2 = bVar;
                        try {
                            x42Var = rh1Var2.f31192a;
                            j8 = j7;
                        } catch (Throwable th2) {
                            th = th2;
                            bVar = bVar2;
                            j5 = j7;
                            z5 = z6;
                            j6 = a6;
                            this.f27524y = a(bVar, j6, j5, j6, z5, 2);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    j5 = j7;
                    j6 = longValue;
                    this.f27524y = a(bVar, j6, j5, j6, z5, 2);
                    throw th;
                }
                try {
                    a(x42Var, bVar2, x42Var, rh1Var2.f31193b, j8);
                    bVar3 = bVar2;
                    j5 = j8;
                    z7 = z6;
                    j9 = a6;
                    this.f27524y = a(bVar3, j9, j5, j9, z7, 2);
                } catch (Throwable th5) {
                    th = th5;
                    bVar = bVar2;
                    j5 = j8;
                    z5 = z6;
                    j6 = a6;
                    this.f27524y = a(bVar, j6, j5, j6, z5, 2);
                    throw th;
                }
            }
            z7 = z4;
            bVar3 = a4;
            j9 = longValue;
            this.f27524y = a(bVar3, j9, j5, j9, z7, 2);
        } catch (Throwable th6) {
            th = th6;
            z5 = z4;
        }
    }

    private long a(dw0.b bVar, long j4, boolean z4, boolean z5) {
        long j5;
        yv0 yv0Var;
        q();
        this.f27487D = false;
        if (z5 || this.f27524y.f31196e == 3) {
            b(2);
        }
        yv0 e4 = this.f27519t.e();
        yv0 yv0Var2 = e4;
        while (yv0Var2 != null && !bVar.equals(yv0Var2.f35331f.f23497a)) {
            yv0Var2 = yv0Var2.b();
        }
        if (z4 || e4 != yv0Var2 || (yv0Var2 != null && yv0Var2.d(j4) < 0)) {
            for (so1 so1Var : this.f27501b) {
                a(so1Var);
            }
            if (yv0Var2 != null) {
                while (this.f27519t.e() != yv0Var2) {
                    this.f27519t.a();
                }
                this.f27519t.a(yv0Var2);
                yv0Var2.h();
                a(new boolean[this.f27501b.length]);
            }
        }
        if (yv0Var2 != null) {
            this.f27519t.a(yv0Var2);
            if (!yv0Var2.f35329d) {
                aw0 aw0Var = yv0Var2.f35331f;
                if (j4 == aw0Var.f23498b) {
                    yv0Var = yv0Var2;
                } else {
                    yv0Var = yv0Var2;
                    aw0Var = new aw0(aw0Var.f23497a, j4, aw0Var.f23499c, aw0Var.f23500d, aw0Var.f23501e, aw0Var.f23502f, aw0Var.f23503g, aw0Var.f23504h, aw0Var.f23505i);
                }
                yv0Var.f35331f = aw0Var;
            } else {
                yv0 yv0Var3 = yv0Var2;
                if (yv0Var3.f35330e) {
                    j5 = yv0Var3.f35326a.seekToUs(j4);
                    yv0Var3.f35326a.discardBuffer(j5 - this.f27513n, this.f27514o);
                    b(j5);
                    f();
                }
            }
            j5 = j4;
            b(j5);
            f();
        } else {
            this.f27519t.c();
            b(j4);
            j5 = j4;
        }
        a(false);
        this.f27508i.a(2);
        return j5;
    }

    private void a(boolean z4, AtomicBoolean atomicBoolean) {
        if (this.f27491H != z4) {
            this.f27491H = z4;
            if (!z4) {
                for (so1 so1Var : this.f27501b) {
                    if (!b(so1Var) && this.f27502c.remove(so1Var)) {
                        so1Var.b();
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
    }

    private void a(a aVar) {
        this.f27525z.a(1);
        if (aVar.f27528c != -1) {
            this.f27495L = new g(new aj1(aVar.f27526a, aVar.f27527b), aVar.f27528c, aVar.f27529d);
        }
        a(this.f27520u.a(aVar.f27526a, aVar.f27527b), false);
    }

    public final void a(int i4, long j4, xx1 xx1Var, ArrayList arrayList) {
        this.f27508i.a(17, new a(i4, j4, xx1Var, arrayList)).a();
    }

    public final void a(boolean z4, int i4) {
        this.f27508i.a(z4 ? 1 : 0, i4).a();
    }

    private void a(boolean z4, int i4, boolean z5, int i5) {
        this.f27525z.a(z5 ? 1 : 0);
        d dVar = this.f27525z;
        dVar.f27530a = true;
        dVar.f27535f = true;
        dVar.f27536g = i5;
        rh1 rh1Var = this.f27524y;
        this.f27524y = new rh1(rh1Var.f31192a, rh1Var.f31193b, rh1Var.f31194c, rh1Var.f31195d, rh1Var.f31196e, rh1Var.f31197f, rh1Var.f31198g, rh1Var.f31199h, rh1Var.f31200i, rh1Var.f31201j, rh1Var.f31202k, z4, i4, rh1Var.f31205n, rh1Var.f31207p, rh1Var.f31208q, rh1Var.f31209r, rh1Var.f31206o);
        this.f27487D = false;
        for (yv0 e4 = this.f27519t.e(); e4 != null; e4 = e4.b()) {
            for (x60 x60Var : e4.f().f33513c) {
                if (x60Var != null) {
                    x60Var.a(z4);
                }
            }
        }
        if (!o()) {
            q();
            s();
            return;
        }
        int i6 = this.f27524y.f31196e;
        if (i6 != 3) {
            if (i6 == 2) {
                this.f27508i.a(2);
                return;
            }
            return;
        }
        this.f27487D = false;
        this.f27515p.a();
        for (so1 so1Var : this.f27501b) {
            if (b(so1Var)) {
                so1Var.start();
            }
        }
        this.f27508i.a(2);
    }

    private void a(int i4) {
        this.f27489F = i4;
        if (!this.f27519t.a(this.f27524y.f31192a, i4)) {
            b(true);
        }
        a(false);
    }

    private void a(xx1 xx1Var) {
        this.f27525z.a(1);
        a(this.f27520u.a(xx1Var), false);
    }

    private boolean a(x42 x42Var, dw0.b bVar) {
        if (!bVar.a() && !x42Var.c()) {
            x42Var.a(x42Var.a(bVar.f35792a, this.f27512m).f34405d, this.f27511l, 0L);
            if (this.f27511l.a()) {
                x42.d dVar = this.f27511l;
                if (dVar.f34426j && dVar.f34423g != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private void a(boolean z4, boolean z5) {
        a(z4 || !this.f27491H, false, true, false);
        this.f27525z.a(z5 ? 1 : 0);
        this.f27506g.d();
        b(1);
    }

    private void a(x42 x42Var, dw0.b bVar, x42 x42Var2, dw0.b bVar2, long j4) {
        if (!a(x42Var, bVar)) {
            th1 th1Var = bVar.a() ? th1.f32439e : this.f27524y.f31205n;
            if (this.f27515p.getPlaybackParameters().equals(th1Var)) {
                return;
            }
            this.f27515p.a(th1Var);
            return;
        }
        x42Var.a(x42Var.a(bVar.f35792a, this.f27512m).f34405d, this.f27511l, 0L);
        jr0 jr0Var = this.f27521v;
        rv0.e eVar = this.f27511l.f34428l;
        int i4 = u82.f32873a;
        ((qz) jr0Var).a(eVar);
        if (j4 != -9223372036854775807L) {
            ((qz) this.f27521v).a(a(x42Var, bVar.f35792a, j4));
            return;
        }
        if (u82.a(!x42Var2.c() ? x42Var2.a(x42Var2.a(bVar2.f35792a, this.f27512m).f34405d, this.f27511l, 0L).f34418b : null, this.f27511l.f34418b)) {
            return;
        }
        ((qz) this.f27521v).a(-9223372036854775807L);
    }

    private synchronized void a(i32<Boolean> i32Var, long j4) {
        long b4 = this.f27517r.b() + j4;
        boolean z4 = false;
        while (!i32Var.get().booleanValue() && j4 > 0) {
            try {
                this.f27517r.getClass();
                wait(j4);
            } catch (InterruptedException unused) {
                z4 = true;
            }
            j4 = b4 - this.f27517r.b();
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }
}
