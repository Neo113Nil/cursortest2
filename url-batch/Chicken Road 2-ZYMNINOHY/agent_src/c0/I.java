package c0;

import E.AbstractC0005f;
import T.C0086d;
import T.C0087e;
import T.C0096n;
import T.C0097o;
import W.AbstractC0108a;
import a.AbstractC0124a;
import a0.C0132H;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import v2.a0;
import y0.AbstractC1569a;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: c0, reason: collision with root package name */
    public static final AtomicInteger f5450c0 = new AtomicInteger();

    /* renamed from: A, reason: collision with root package name */
    public long f5451A;

    /* renamed from: B, reason: collision with root package name */
    public long f5452B;

    /* renamed from: C, reason: collision with root package name */
    public long f5453C;

    /* renamed from: D, reason: collision with root package name */
    public int f5454D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f5455E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f5456F;

    /* renamed from: G, reason: collision with root package name */
    public long f5457G;

    /* renamed from: H, reason: collision with root package name */
    public float f5458H;

    /* renamed from: I, reason: collision with root package name */
    public ByteBuffer f5459I;

    /* renamed from: J, reason: collision with root package name */
    public int f5460J;

    /* renamed from: K, reason: collision with root package name */
    public ByteBuffer f5461K;
    public boolean L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f5462M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f5463N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f5464O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f5465P;

    /* renamed from: Q, reason: collision with root package name */
    public int f5466Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f5467R;

    /* renamed from: S, reason: collision with root package name */
    public C0087e f5468S;

    /* renamed from: T, reason: collision with root package name */
    public AudioDeviceInfo f5469T;

    /* renamed from: U, reason: collision with root package name */
    public int f5470U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f5471V;

    /* renamed from: W, reason: collision with root package name */
    public long f5472W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f5473X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f5474Y;

    /* renamed from: Z, reason: collision with root package name */
    public long f5475Z;

    /* renamed from: a, reason: collision with root package name */
    public final Context f5476a;

    /* renamed from: a0, reason: collision with root package name */
    public long f5477a0;

    /* renamed from: b, reason: collision with root package name */
    public final B1.j f5478b;

    /* renamed from: b0, reason: collision with root package name */
    public Handler f5479b0;

    /* renamed from: c, reason: collision with root package name */
    public final C f5480c;

    /* renamed from: d, reason: collision with root package name */
    public final O f5481d;

    /* renamed from: e, reason: collision with root package name */
    public final U.u f5482e;

    /* renamed from: f, reason: collision with root package name */
    public final N f5483f;

    /* renamed from: g, reason: collision with root package name */
    public final a0 f5484g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayDeque f5485h;

    /* renamed from: i, reason: collision with root package name */
    public int f5486i;

    /* renamed from: j, reason: collision with root package name */
    public E f5487j;

    /* renamed from: k, reason: collision with root package name */
    public final H f5488k;

    /* renamed from: l, reason: collision with root package name */
    public final H f5489l;

    /* renamed from: m, reason: collision with root package name */
    public b0.i f5490m;
    public t1.h n;
    public F o;

    /* renamed from: p, reason: collision with root package name */
    public F f5491p;

    /* renamed from: q, reason: collision with root package name */
    public U.j f5492q;

    /* renamed from: r, reason: collision with root package name */
    public C0267A f5493r;

    /* renamed from: s, reason: collision with root package name */
    public D f5494s;

    /* renamed from: t, reason: collision with root package name */
    public z f5495t;

    /* renamed from: u, reason: collision with root package name */
    public C0086d f5496u;
    public G v;

    /* renamed from: w, reason: collision with root package name */
    public G f5497w;

    /* renamed from: x, reason: collision with root package name */
    public T.I f5498x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f5499y;
    public long z;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0085, code lost:
    
        r9 = r0.getDeviceId();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public I(E1.a0 a0Var) {
        int deviceId;
        Context context = a0Var.f565a;
        this.f5476a = context == null ? null : context.getApplicationContext();
        this.f5496u = C0086d.f2771c;
        this.f5478b = (B1.j) a0Var.f568d;
        this.f5486i = 0;
        this.f5493r = (C0267A) a0Var.f570f;
        C c4 = new C();
        this.f5480c = c4;
        O o = new O();
        o.f5537m = W.J.f3264b;
        this.f5481d = o;
        this.f5482e = new U.u();
        this.f5483f = new N();
        this.f5484g = v2.I.p(o, c4);
        this.f5458H = 1.0f;
        this.f5466Q = 0;
        this.f5468S = new C0087e();
        T.I i4 = T.I.f2663d;
        this.f5497w = new G(i4, 0L, 0L);
        this.f5498x = i4;
        this.f5499y = false;
        this.f5485h = new ArrayDeque();
        this.f5488k = new H();
        this.f5489l = new H();
        int i5 = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && deviceId != 0 && deviceId != -1) {
            i5 = deviceId;
        }
        this.f5470U = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int i(int i4, ByteBuffer byteBuffer) {
        int i5;
        int i6;
        byte b4;
        int i7;
        byte b5;
        int i8;
        int i9;
        int i10;
        int i11;
        if (i4 == 20) {
            if ((byteBuffer.get(5) & 2) == 0) {
                i5 = 0;
            } else {
                byte b6 = byteBuffer.get(26);
                int i12 = 28;
                int i13 = 28;
                for (int i14 = 0; i14 < b6; i14++) {
                    i13 += byteBuffer.get(i14 + 27);
                }
                byte b7 = byteBuffer.get(i13 + 26);
                for (int i15 = 0; i15 < b7; i15++) {
                    i12 += byteBuffer.get(i13 + 27 + i15);
                }
                i5 = i13 + i12;
            }
            int i16 = byteBuffer.get(i5 + 26) + 27 + i5;
            return (int) ((AbstractC1569a.o(byteBuffer.get(i16), byteBuffer.limit() - i16 > 1 ? byteBuffer.get(i16 + 1) : (byte) 0) * 48000) / 1000000);
        }
        if (i4 != 30) {
            switch (i4) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int position = byteBuffer.position();
                    String str = W.J.f3263a;
                    int i17 = byteBuffer.getInt(position);
                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                        i17 = Integer.reverseBytes(i17);
                    }
                    if ((i17 & (-2097152)) == -2097152 && (i9 = (i17 >>> 19) & 3) != 1 && (i10 = (i17 >>> 17) & 3) != 0) {
                        int i18 = (i17 >>> 12) & 15;
                        int i19 = (i17 >>> 10) & 3;
                        if (i18 != 0 && i18 != 15 && i19 != 3) {
                            i8 = 1152;
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 != 3) {
                                        throw new IllegalArgumentException();
                                    }
                                    i8 = 384;
                                }
                            } else if (i9 != 3) {
                                i8 = 576;
                            }
                            if (i8 == -1) {
                                return i8;
                            }
                            throw new IllegalArgumentException();
                        }
                    }
                    i8 = -1;
                    if (i8 == -1) {
                    }
                    break;
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i4) {
                        case 14:
                            int position2 = byteBuffer.position();
                            int limit = byteBuffer.limit() - 10;
                            int i20 = position2;
                            while (true) {
                                if (i20 <= limit) {
                                    String str2 = W.J.f3263a;
                                    int i21 = byteBuffer.getInt(i20 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        i21 = Integer.reverseBytes(i21);
                                    }
                                    if ((i21 & (-2)) == -126718022) {
                                        i11 = i20 - position2;
                                    } else {
                                        i20++;
                                    }
                                } else {
                                    i11 = -1;
                                }
                            }
                            if (i11 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i11) + (((byteBuffer.get((byteBuffer.position() + i11) + 7) & 255) == 187 ? (byte) 1 : (byte) 0) != 0 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            byte[] bArr = new byte[16];
                            int position3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(position3);
                            return AbstractC1569a.r(new W.t(16, bArr)).f11c;
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException(AbstractC0005f.j(i4, "Unexpected audio encoding: "));
                    }
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return AbstractC1569a.f16097c[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
            }
            return 1536;
        }
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int position4 = byteBuffer.position();
        byte b8 = byteBuffer.get(position4);
        if (b8 != -2) {
            if (b8 == -1) {
                i6 = (byteBuffer.get(position4 + 4) & 7) << 4;
                b5 = byteBuffer.get(position4 + 7);
            } else if (b8 != 31) {
                i6 = (byteBuffer.get(position4 + 4) & 1) << 6;
                b4 = byteBuffer.get(position4 + 5);
            } else {
                i6 = (byteBuffer.get(position4 + 5) & 7) << 4;
                b5 = byteBuffer.get(position4 + 6);
            }
            i7 = b5 & 60;
            return (((i7 >> 2) | i6) + 1) * 32;
        }
        i6 = (byteBuffer.get(position4 + 5) & 1) << 6;
        b4 = byteBuffer.get(position4 + 4);
        i7 = b4 & 252;
        return (((i7 >> 2) | i6) + 1) * 32;
    }

    public final void a(long j4) {
        T.I i4;
        boolean v = v();
        boolean z = false;
        B1.j jVar = this.f5478b;
        if (v) {
            i4 = T.I.f2663d;
        } else {
            if (this.f5471V || !F.a(this.f5491p)) {
                i4 = T.I.f2663d;
            } else {
                int i5 = ((C0097o) this.f5491p.f5439c).f2848H;
                i4 = this.f5498x;
                U.t tVar = (U.t) jVar.f203d;
                float f4 = i4.f2664a;
                tVar.getClass();
                AbstractC0124a.h(f4 > 0.0f);
                if (tVar.f3101c != f4) {
                    tVar.f3101c = f4;
                    tVar.f3107i = true;
                }
                float f5 = i4.f2665b;
                AbstractC0124a.h(f5 > 0.0f);
                if (tVar.f3102d != f5) {
                    tVar.f3102d = f5;
                    tVar.f3107i = true;
                }
            }
            this.f5498x = i4;
        }
        T.I i6 = i4;
        if (!this.f5471V && F.a(this.f5491p)) {
            int i7 = ((C0097o) this.f5491p.f5439c).f2848H;
            z = this.f5499y;
            ((M) jVar.f202c).o = z;
        }
        this.f5499y = z;
        this.f5485h.add(new G(i6, Math.max(0L, j4), W.J.S(((C0281n) this.f5491p.f5441e).f5585b, j())));
        U.j jVar2 = (U.j) this.f5491p.f5442f;
        this.f5492q = jVar2;
        jVar2.a();
        t1.h hVar = this.n;
        if (hVar != null) {
            boolean z4 = this.f5499y;
            q qVar = ((K) hVar.f15398b).f5502P0;
            Handler handler = qVar.f5600a;
            if (handler != null) {
                handler.post(new p(qVar, z4, 0));
            }
        }
    }

    public final z b(C0281n c0281n) {
        try {
            return this.f5493r.a(c0281n);
        } catch (C0279l e4) {
            s sVar = new s(c0281n.f5585b, c0281n.f5586c, c0281n.f5584a, c0281n.f5589f, (C0097o) this.f5491p.f5439c, c0281n.f5588e, e4);
            t1.h hVar = this.n;
            if (hVar == null) {
                throw sVar;
            }
            hVar.l(sVar);
            throw sVar;
        }
    }

    public final void c(C0097o c0097o, int[] iArr) {
        U.j jVar;
        C0097o c0097o2;
        int i4;
        int i5;
        if (this.f5494s == null && this.f5476a != null) {
            D d4 = new D(this);
            this.f5494s = d4;
            C0267A c0267a = this.f5493r;
            c0267a.f();
            if (c0267a.f5402e == null) {
                W.n nVar = new W.n(Thread.currentThread());
                c0267a.f5402e = nVar;
                nVar.f3329i = false;
            }
            c0267a.f5402e.a(d4);
        }
        String str = c0097o.n;
        int i6 = c0097o.f2846F;
        int i7 = c0097o.f2848H;
        if ("audio/raw".equals(str)) {
            AbstractC0124a.h(W.J.H(i7));
            int s4 = W.J.s(i7) * i6;
            v2.F f4 = new v2.F(4);
            f4.c(this.f5484g);
            f4.b(this.f5482e);
            U.n[] nVarArr = (U.n[]) this.f5478b.f201b;
            int length = nVarArr.length;
            v2.r.b(length, nVarArr);
            f4.d(length);
            System.arraycopy(nVarArr, 0, f4.f15559a, f4.f15560b, length);
            f4.f15560b += length;
            jVar = new U.j(f4.f());
            if (jVar.equals(this.f5492q)) {
                jVar = this.f5492q;
            }
            int i8 = c0097o.f2849I;
            int i9 = c0097o.f2850J;
            O o = this.f5481d;
            o.f5533i = i8;
            o.f5534j = i9;
            this.f5480c.f5432i = iArr;
            U.k kVar = new U.k(c0097o.f2847G, i6, i7);
            try {
                v2.I i10 = jVar.f3050a;
                if (kVar.equals(U.k.f3054e)) {
                    throw new U.m(kVar);
                }
                for (int i11 = 0; i11 < i10.size(); i11++) {
                    U.n nVar2 = (U.n) i10.get(i11);
                    U.k f5 = nVar2.f(kVar);
                    if (nVar2.a()) {
                        AbstractC0124a.t(!f5.equals(U.k.f3054e));
                        kVar = f5;
                    }
                }
                int i12 = kVar.f3056b;
                int i13 = kVar.f3057c;
                C0096n a3 = c0097o.a();
                a3.f2812G = i13;
                a3.f2811F = kVar.f3055a;
                a3.f2810E = i12;
                c0097o2 = new C0097o(a3);
                i4 = s4;
                i5 = W.J.s(i13) * i12;
            } catch (U.m e4) {
                throw new r(e4, c0097o);
            }
        } else {
            jVar = new U.j(a0.f15605e);
            c0097o2 = c0097o;
            i4 = -1;
            i5 = -1;
        }
        U.j jVar2 = jVar;
        C0276i g4 = g(c0097o2);
        C0097o c0097o3 = g4.f5557a;
        try {
            C0281n c4 = this.f5493r.c(g4);
            boolean z = c4.f5588e;
            if (c4.f5584a == 0) {
                throw new r("Invalid output encoding (isOffload=" + z + ")", c0097o3);
            }
            if (c4.f5586c == 0) {
                throw new r("Invalid output channel config (isOffload=" + z + ")", c0097o3);
            }
            this.f5473X = false;
            F f6 = new F(c0097o, c0097o2, i4, i5, c4, jVar2);
            if (n()) {
                this.o = f6;
            } else {
                this.f5491p = f6;
            }
        } catch (C0275h e5) {
            throw new r(e5, c0097o);
        }
    }

    public final void d(long j4) {
        t1.h hVar;
        C0132H c0132h;
        if (this.f5461K == null) {
            return;
        }
        H h2 = this.f5489l;
        if (h2.f5447a != null && (f5450c0.get() > 0 || SystemClock.elapsedRealtime() < h2.f5449c)) {
            return;
        }
        int remaining = this.f5461K.remaining();
        try {
            boolean d4 = this.f5495t.d(j4, this.f5461K, this.f5460J);
            this.f5472W = SystemClock.elapsedRealtime();
            h2.f5447a = null;
            h2.f5448b = -9223372036854775807L;
            h2.f5449c = -9223372036854775807L;
            if (this.f5495t.c()) {
                if (this.f5453C > 0) {
                    this.f5474Y = false;
                }
                if (this.f5464O && (hVar = this.n) != null && !d4 && !this.f5474Y && (c0132h = ((K) hVar.f15398b).f13805I) != null) {
                    c0132h.f3904a.f3941S = true;
                }
            }
            if (F.a(this.f5491p)) {
                this.f5452B += remaining - this.f5461K.remaining();
            }
            if (d4) {
                if (!F.a(this.f5491p)) {
                    AbstractC0124a.t(this.f5461K == this.f5459I);
                    this.f5453C = (this.f5454D * this.f5460J) + this.f5453C;
                }
                this.f5461K = null;
            }
        } catch (C0274g e4) {
            boolean z = e4.f5556b;
            if (z) {
                if (j() <= 0) {
                    if (this.f5495t.c()) {
                        if (((C0281n) this.f5491p.f5441e).f5588e) {
                            this.f5473X = true;
                        }
                    }
                }
                r4 = true;
            }
            u uVar = new u(e4.f5555a, (C0097o) this.f5491p.f5439c, r4);
            t1.h hVar2 = this.n;
            if (hVar2 != null) {
                hVar2.l(uVar);
            }
            if (z) {
                throw uVar;
            }
            h2.a(uVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        ByteBuffer byteBuffer;
        if (!this.f5492q.d()) {
            d(Long.MIN_VALUE);
            return this.f5461K == null;
        }
        U.j jVar = this.f5492q;
        if (jVar.d() && !jVar.f3053d) {
            jVar.f3053d = true;
            ((U.n) jVar.f3051b.get(0)).e();
        }
        q(Long.MIN_VALUE);
        if (!this.f5492q.c() || ((byteBuffer = this.f5461K) != null && byteBuffer.hasRemaining())) {
        }
    }

    public final void f() {
        if (n()) {
            this.z = 0L;
            this.f5451A = 0L;
            this.f5452B = 0L;
            this.f5453C = 0L;
            this.f5474Y = false;
            this.f5454D = 0;
            this.f5497w = new G(this.f5498x, 0L, 0L);
            this.f5457G = 0L;
            this.v = null;
            this.f5485h.clear();
            this.f5459I = null;
            this.f5460J = 0;
            this.f5461K = null;
            this.f5462M = false;
            this.L = false;
            this.f5463N = false;
            this.f5481d.o = 0L;
            U.j jVar = (U.j) this.f5491p.f5442f;
            this.f5492q = jVar;
            jVar.a();
            this.f5487j = null;
            F f4 = this.o;
            if (f4 != null) {
                this.f5491p = f4;
                this.o = null;
            }
            f5450c0.incrementAndGet();
            z zVar = this.f5495t;
            if (zVar.f5632e.f5413d.getPlayState() == 3) {
                zVar.f5628a.pause();
            }
            if (Build.VERSION.SDK_INT >= 29 && zVar.c()) {
                B1.j jVar2 = zVar.f5635h;
                jVar2.getClass();
                ((z) jVar2.f203d).f5628a.unregisterStreamEventCallback((y) jVar2.f202c);
                ((Handler) jVar2.f201b).removeCallbacksAndMessages(null);
            }
            G1.c cVar = zVar.f5631d;
            if (cVar != null) {
                AudioTrack audioTrack = (AudioTrack) cVar.f835b;
                x xVar = (x) cVar.f838e;
                xVar.getClass();
                audioTrack.removeOnRoutingChangedListener(xVar);
                cVar.f838e = null;
                zVar.f5631d = null;
            }
            AudioTrack audioTrack2 = zVar.f5628a;
            W.n nVar = zVar.f5636i;
            Handler o = W.J.o(null);
            synchronized (z.f5625r) {
                try {
                    if (z.f5626s == null) {
                        z.f5626s = Executors.newSingleThreadScheduledExecutor(new W.I());
                    }
                    z.f5627t++;
                    z.f5626s.schedule(new Q1.a(audioTrack2, o, nVar, 5), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f5495t = null;
        }
        H h2 = this.f5489l;
        h2.f5447a = null;
        h2.f5448b = -9223372036854775807L;
        h2.f5449c = -9223372036854775807L;
        H h4 = this.f5488k;
        h4.f5447a = null;
        h4.f5448b = -9223372036854775807L;
        h4.f5449c = -9223372036854775807L;
        this.f5475Z = 0L;
        this.f5477a0 = 0L;
        Handler handler = this.f5479b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final C0276i g(C0097o c0097o) {
        C0276i c0276i = new C0276i(c0097o);
        c0276i.f5558b = this.f5496u;
        c0276i.f5560d = this.f5486i != 0;
        c0276i.f5559c = this.f5469T;
        c0276i.f5561e = this.f5466Q;
        c0276i.f5563g = this.f5471V;
        c0276i.f5564h = -1;
        c0276i.f5562f = this.f5470U;
        return new C0276i(c0276i);
    }

    public final int h(C0097o c0097o) {
        boolean z;
        if (!W.J.H(c0097o.f2848H) || c0097o.f2848H == 2) {
            z = false;
        } else {
            C0096n a3 = c0097o.a();
            a3.f2812G = 2;
            c0097o = new C0097o(a3);
            z = true;
        }
        int i4 = this.f5493r.b(g(c0097o)).f5572d;
        if (i4 != 1) {
            if (i4 != 2) {
                return 0;
            }
            if (!z) {
                return 2;
            }
        }
        return 1;
    }

    public final long j() {
        if (!F.a(this.f5491p)) {
            return this.f5453C;
        }
        long j4 = this.f5452B;
        long j5 = this.f5491p.f5438b;
        return ((j4 + j5) - 1) / j5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x00aa, code lost:
    
        if (m() == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0119, code lost:
    
        if (r5 == 0) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(long j4, ByteBuffer byteBuffer, int i4) {
        long j5;
        long j6;
        long j7;
        ByteBuffer byteBuffer2 = this.f5459I;
        AbstractC0124a.h(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.o != null) {
            if (e()) {
                F f4 = this.o;
                F f5 = this.f5491p;
                f4.getClass();
                if (((C0281n) f5.f5441e).equals((C0281n) f4.f5441e)) {
                    this.f5491p = this.o;
                    this.o = null;
                    z zVar = this.f5495t;
                    if (zVar != null && zVar.c() && ((C0281n) this.f5491p.f5441e).f5594k) {
                        z zVar2 = this.f5495t;
                        AudioTrack audioTrack = zVar2.f5628a;
                        int i5 = Build.VERSION.SDK_INT;
                        if (i5 >= 29 && audioTrack.getPlayState() == 3) {
                            audioTrack.setOffloadEndOfStream();
                            B b4 = zVar2.f5632e;
                            b4.f5408A = true;
                            b4.f5417h.f5614a.f5612f = true;
                        }
                        z zVar3 = this.f5495t;
                        C0097o c0097o = (C0097o) this.f5491p.f5439c;
                        int i6 = c0097o.f2849I;
                        int i7 = c0097o.f2850J;
                        if (i5 < 29) {
                            zVar3.getClass();
                        } else {
                            zVar3.f5628a.setOffloadDelayPadding(i6, i7);
                        }
                        this.f5474Y = true;
                    }
                } else {
                    p();
                    if (!l()) {
                        f();
                    }
                }
                a(j4);
            }
            return false;
        }
        boolean n = n();
        H h2 = this.f5488k;
        if (!n) {
            try {
            } catch (s e4) {
                if (e4.f5603a) {
                    throw e4;
                }
                h2.a(e4);
                return false;
            }
        }
        h2.f5447a = null;
        h2.f5448b = -9223372036854775807L;
        h2.f5449c = -9223372036854775807L;
        if (this.f5456F) {
            this.f5457G = Math.max(0L, j4);
            this.f5455E = false;
            this.f5456F = false;
            if (v()) {
                t();
            }
            a(j4);
            if (this.f5464O) {
                o();
            }
        }
        if (this.f5459I == null) {
            AbstractC0124a.h(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.hasRemaining()) {
                if (!F.a(this.f5491p) && this.f5454D == 0) {
                    int i8 = i(((C0281n) this.f5491p.f5441e).f5584a, byteBuffer);
                    this.f5454D = i8;
                }
                if (this.v != null) {
                    if (e()) {
                        a(j4);
                        this.v = null;
                    }
                    return false;
                }
                long j8 = this.f5457G;
                F f6 = this.f5491p;
                if (F.a(f6)) {
                    j5 = -9223372036854775807L;
                    j6 = 0;
                    j7 = this.z / this.f5491p.f5437a;
                } else {
                    j5 = -9223372036854775807L;
                    j6 = 0;
                    j7 = this.f5451A;
                }
                long S4 = W.J.S(((C0097o) f6.f5439c).f2847G, j7 - this.f5481d.o) + j8;
                if (!this.f5455E && Math.abs(S4 - j4) > 200000) {
                    t1.h hVar = this.n;
                    if (hVar != null) {
                        hVar.l(new t("Unexpected audio track timestamp discontinuity: expected " + S4 + ", got " + j4));
                    }
                    this.f5455E = true;
                }
                if (this.f5455E) {
                    if (e()) {
                        long j9 = j4 - S4;
                        this.f5457G += j9;
                        this.f5455E = false;
                        a(j4);
                        t1.h hVar2 = this.n;
                        if (hVar2 != null && j9 != j6) {
                            ((K) hVar2.f15398b).f5509X0 = true;
                        }
                    }
                    return false;
                }
                if (F.a(this.f5491p)) {
                    this.z += byteBuffer.remaining();
                } else {
                    this.f5451A = (this.f5454D * i4) + this.f5451A;
                }
                this.f5459I = byteBuffer;
                this.f5460J = i4;
            }
            return true;
        }
        j5 = -9223372036854775807L;
        j6 = 0;
        q(j4);
        if (!this.f5459I.hasRemaining()) {
            this.f5459I = null;
            this.f5460J = 0;
            return true;
        }
        z zVar4 = this.f5495t;
        B b5 = zVar4.f5632e;
        long b6 = zVar4.b();
        if (b5.v != j5 && b6 > j6) {
            b5.f5411b.getClass();
            if (SystemClock.elapsedRealtime() - b5.v >= 200) {
                AbstractC0108a.s("DefaultAudioSink", "Resetting stalled audio output");
                f();
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        if (!n()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.f5495t.c() && this.f5463N) {
            return false;
        }
        long j4 = j();
        long a3 = this.f5495t.a();
        z zVar = this.f5495t;
        zVar.getClass();
        return j4 > W.J.U(a3, (long) zVar.f5628a.getSampleRate(), 1000000L, RoundingMode.UP);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m() {
        z b4;
        B1.j jVar;
        boolean equals;
        LogSessionId unused;
        H h2 = this.f5488k;
        if (h2.f5447a != null && (f5450c0.get() > 0 || SystemClock.elapsedRealtime() < h2.f5449c)) {
            return false;
        }
        try {
            b4 = b((C0281n) this.f5491p.f5441e);
        } catch (s e4) {
            C0281n c0281n = (C0281n) this.f5491p.f5441e;
            if (c0281n.f5589f > 1000000) {
                C0280m a3 = c0281n.a();
                a3.f5578f = 1000000;
                C0281n c0281n2 = new C0281n(a3);
                try {
                    b4 = b(c0281n2);
                    F f4 = this.f5491p;
                    this.f5491p = new F((C0097o) f4.f5439c, (C0097o) f4.f5440d, f4.f5437a, f4.f5438b, c0281n2, (U.j) f4.f5442f);
                } catch (s e5) {
                    e4.addSuppressed(e5);
                    if (((C0281n) this.f5491p.f5441e).f5588e) {
                    }
                }
            }
            if (((C0281n) this.f5491p.f5441e).f5588e) {
                throw e4;
            }
            this.f5473X = true;
            throw e4;
        }
        this.f5495t = b4;
        E e6 = new E(this, (C0281n) this.f5491p.f5441e);
        this.f5487j = e6;
        b4.f5636i.a(e6);
        if (this.f5495t.c()) {
            F f5 = this.f5491p;
            if (((C0281n) f5.f5441e).f5594k) {
                z zVar = this.f5495t;
                C0097o c0097o = (C0097o) f5.f5439c;
                int i4 = c0097o.f2849I;
                int i5 = c0097o.f2850J;
                if (Build.VERSION.SDK_INT < 29) {
                    zVar.getClass();
                } else {
                    zVar.f5628a.setOffloadDelayPadding(i4, i5);
                }
            }
        }
        b0.i iVar = this.f5490m;
        if (iVar != null) {
            z zVar2 = this.f5495t;
            zVar2.getClass();
            if (Build.VERSION.SDK_INT >= 31) {
                LogSessionId a4 = iVar.a();
                unused = LogSessionId.LOG_SESSION_ID_NONE;
                equals = a4.equals(LogSessionId.LOG_SESSION_ID_NONE);
                if (!equals) {
                    zVar2.f5628a.setLogSessionId(a4);
                }
            }
        }
        if (n()) {
            this.f5495t.f5628a.setVolume(this.f5458H);
        }
        this.f5468S.getClass();
        AudioDeviceInfo audioDeviceInfo = this.f5469T;
        if (audioDeviceInfo != null) {
            this.f5495t.f5628a.setPreferredDevice(audioDeviceInfo);
        }
        this.f5456F = true;
        int audioSessionId = this.f5495t.f5628a.getAudioSessionId();
        boolean z = audioSessionId != this.f5466Q;
        this.f5466Q = audioSessionId;
        t1.h hVar = this.n;
        if (hVar != null) {
            int i6 = ((C0281n) this.f5491p.f5441e).f5584a;
            J j4 = new J();
            q qVar = ((K) hVar.f15398b).f5502P0;
            Handler handler = qVar.f5600a;
            if (handler != null) {
                handler.post(new RunnableC0282o(qVar, j4, 7));
            }
            if (z) {
                this.f5467R = true;
                F f6 = this.f5491p;
                C0280m a5 = ((C0281n) f6.f5441e).a();
                a5.f5580h = this.f5466Q;
                this.f5491p = new F((C0097o) f6.f5439c, (C0097o) f6.f5440d, f6.f5437a, f6.f5438b, new C0281n(a5), (U.j) f6.f5442f);
                F f7 = this.o;
                if (f7 != null) {
                    C0280m a6 = ((C0281n) f7.f5441e).a();
                    a6.f5580h = this.f5466Q;
                    this.o = new F((C0097o) f7.f5439c, (C0097o) f7.f5440d, f7.f5437a, f7.f5438b, new C0281n(a6), (U.j) f7.f5442f);
                }
                t1.h hVar2 = this.n;
                int i7 = this.f5466Q;
                K k4 = (K) hVar2.f15398b;
                if (Build.VERSION.SDK_INT >= 35 && (jVar = k4.f5504R0) != null) {
                    jVar.C(i7);
                }
                q qVar2 = k4.f5502P0;
                Handler handler2 = qVar2.f5600a;
                if (handler2 != null) {
                    handler2.post(new U.f(i7, 2, qVar2));
                }
            }
        }
        return true;
    }

    public final boolean n() {
        return this.f5495t != null;
    }

    public final void o() {
        this.f5464O = true;
        if (n()) {
            z zVar = this.f5495t;
            B b4 = zVar.f5632e;
            if (b4.f5428u != -9223372036854775807L) {
                b4.f5411b.getClass();
                b4.f5428u = W.J.M(SystemClock.elapsedRealtime());
            }
            b4.f5419j = W.J.S(b4.f5414e, b4.a());
            b4.f5417h.a(0);
            if (!zVar.f5637j || zVar.c()) {
                zVar.f5628a.play();
            }
        }
    }

    public final void p() {
        if (this.f5462M) {
            return;
        }
        this.f5462M = true;
        if (this.f5495t.c()) {
            this.f5463N = false;
        }
        z zVar = this.f5495t;
        if (zVar.f5637j) {
            return;
        }
        zVar.f5637j = true;
        B b4 = zVar.f5632e;
        long b5 = zVar.b();
        b4.f5429w = b4.a();
        b4.f5411b.getClass();
        b4.f5428u = W.J.M(SystemClock.elapsedRealtime());
        b4.f5430x = b5;
        zVar.f5628a.stop();
        zVar.o = 0;
    }

    public final void q(long j4) {
        ByteBuffer byteBuffer;
        d(j4);
        if (this.f5461K != null) {
            return;
        }
        if (!this.f5492q.d()) {
            ByteBuffer byteBuffer2 = this.f5459I;
            if (byteBuffer2 != null) {
                u(byteBuffer2);
                d(j4);
                return;
            }
            return;
        }
        while (!this.f5492q.c()) {
            do {
                U.j jVar = this.f5492q;
                if (jVar.d()) {
                    ByteBuffer byteBuffer3 = jVar.f3052c[jVar.b()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        jVar.e(U.n.f3061a);
                        byteBuffer = jVar.f3052c[jVar.b()];
                    }
                } else {
                    byteBuffer = U.n.f3061a;
                }
                if (byteBuffer.hasRemaining()) {
                    u(byteBuffer);
                    d(j4);
                } else {
                    ByteBuffer byteBuffer4 = this.f5459I;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    U.j jVar2 = this.f5492q;
                    ByteBuffer byteBuffer5 = this.f5459I;
                    if (jVar2.d() && !jVar2.f3053d) {
                        jVar2.e(byteBuffer5);
                    }
                }
            } while (this.f5461K == null);
            return;
        }
    }

    public final void r() {
        if (this.f5491p != null) {
            F f4 = this.o;
            if (f4 != null) {
                this.f5491p = f4;
                this.o = null;
            }
            try {
                C0281n c4 = this.f5493r.c(g((C0097o) this.f5491p.f5440d));
                F f5 = this.f5491p;
                this.f5491p = new F((C0097o) f5.f5439c, (C0097o) f5.f5440d, f5.f5437a, f5.f5438b, c4, (U.j) f5.f5442f);
            } catch (C0275h e4) {
                throw new IllegalStateException(new r(e4, (C0097o) this.f5491p.f5439c));
            }
        }
        f();
    }

    public final void s() {
        f();
        v2.G listIterator = this.f5484g.listIterator(0);
        while (listIterator.hasNext()) {
            ((U.n) listIterator.next()).reset();
        }
        this.f5482e.reset();
        this.f5483f.reset();
        U.j jVar = this.f5492q;
        if (jVar != null) {
            v2.I i4 = jVar.f3050a;
            for (int i5 = 0; i5 < i4.size(); i5++) {
                U.n nVar = (U.n) i4.get(i5);
                U.l lVar = U.l.f3059b;
                nVar.flush();
                nVar.reset();
            }
            jVar.f3051b.clear();
            jVar.f3052c = new ByteBuffer[0];
            U.k kVar = U.k.f3054e;
            jVar.f3053d = false;
        }
        this.f5464O = false;
        this.f5473X = false;
    }

    public final void t() {
        if (n()) {
            z zVar = this.f5495t;
            T.I i4 = this.f5498x;
            AudioTrack audioTrack = zVar.f5628a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(i4.f2664a).setPitch(i4.f2665b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e4) {
                AbstractC0108a.t("AudioTrackAudioOutput", "Failed to set playback params", e4);
            }
            B b4 = zVar.f5632e;
            b4.f5418i = audioTrack.getPlaybackParams().getSpeed();
            b4.f5417h.a(0);
            b4.f5420k = 0L;
            b4.f5427t = 0;
            b4.f5426s = 0;
            b4.f5421l = 0L;
            b4.f5431y = -9223372036854775807L;
            b4.z = -9223372036854775807L;
            PlaybackParams playbackParams = this.f5495t.f5628a.getPlaybackParams();
            this.f5498x = new T.I(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i4;
        byte b4;
        int i5;
        int i6;
        AbstractC0124a.t(this.f5461K == null);
        if (byteBuffer.hasRemaining()) {
            if (F.a(this.f5491p)) {
                int U4 = (int) W.J.U(W.J.M(20L), ((C0281n) this.f5491p.f5441e).f5585b, 1000000L, RoundingMode.UP);
                long j4 = j();
                long j5 = U4;
                if (j4 < j5) {
                    F f4 = this.f5491p;
                    int i7 = ((C0281n) f4.f5441e).f5584a;
                    int i8 = f4.f5438b;
                    int i9 = (int) j4;
                    byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i9 < U4) {
                        if (i7 != 2) {
                            if (i7 == 3) {
                                i6 = (byteBuffer.get() & 255) << 24;
                            } else if (i7 == 4) {
                                float i10 = W.J.i(byteBuffer.getFloat(), -1.0f, 1.0f);
                                i6 = (int) (i10 < 0.0f ? (-i10) * (-2.1474836E9f) : i10 * 2.1474836E9f);
                            } else if (i7 == 21) {
                                i4 = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b4 = byteBuffer.get();
                            } else if (i7 != 22) {
                                if (i7 == 268435456) {
                                    i4 = (byteBuffer.get() & 255) << 24;
                                    i5 = (byteBuffer.get() & 255) << 16;
                                } else if (i7 == 1342177280) {
                                    i4 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i5 = (byteBuffer.get() & 255) << 8;
                                } else {
                                    if (i7 != 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    i4 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i5 = byteBuffer.get() & 255;
                                }
                                i6 = i4 | i5;
                            } else {
                                i4 = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b4 = byteBuffer.get();
                            }
                            int i11 = (int) ((i6 * i9) / j5);
                            if (i7 != 2) {
                                byteBuffer2.put((byte) (i11 >> 16));
                                byteBuffer2.put((byte) (i11 >> 24));
                            } else if (i7 == 3) {
                                byteBuffer2.put((byte) (i11 >> 24));
                            } else if (i7 != 4) {
                                if (i7 == 21) {
                                    byteBuffer2.put((byte) (i11 >> 8));
                                    byteBuffer2.put((byte) (i11 >> 16));
                                    byteBuffer2.put((byte) (i11 >> 24));
                                } else if (i7 == 22) {
                                    byteBuffer2.put((byte) i11);
                                    byteBuffer2.put((byte) (i11 >> 8));
                                    byteBuffer2.put((byte) (i11 >> 16));
                                    byteBuffer2.put((byte) (i11 >> 24));
                                } else if (i7 == 268435456) {
                                    byteBuffer2.put((byte) (i11 >> 24));
                                    byteBuffer2.put((byte) (i11 >> 16));
                                } else if (i7 == 1342177280) {
                                    byteBuffer2.put((byte) (i11 >> 24));
                                    byteBuffer2.put((byte) (i11 >> 16));
                                    byteBuffer2.put((byte) (i11 >> 8));
                                } else {
                                    if (i7 != 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    byteBuffer2.put((byte) (i11 >> 24));
                                    byteBuffer2.put((byte) (i11 >> 16));
                                    byteBuffer2.put((byte) (i11 >> 8));
                                    byteBuffer2.put((byte) i11);
                                }
                            } else if (i11 < 0) {
                                byteBuffer2.putFloat((-i11) / (-2.1474836E9f));
                            } else {
                                byteBuffer2.putFloat(i11 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() != position + i8) {
                                i9++;
                                position = byteBuffer.position();
                            }
                        } else {
                            i4 = (byteBuffer.get() & 255) << 16;
                            b4 = byteBuffer.get();
                        }
                        i5 = (b4 & 255) << 24;
                        i6 = i4 | i5;
                        int i112 = (int) ((i6 * i9) / j5);
                        if (i7 != 2) {
                        }
                        if (byteBuffer.position() != position + i8) {
                        }
                    }
                    byteBuffer2.put(byteBuffer);
                    byteBuffer2.flip();
                    this.f5461K = byteBuffer2;
                }
            }
            byteBuffer2 = byteBuffer;
            this.f5461K = byteBuffer2;
        }
    }

    public final boolean v() {
        F f4 = this.f5491p;
        return f4 != null && ((C0281n) f4.f5441e).f5593j;
    }
}
