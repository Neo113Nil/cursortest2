package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h24 implements o14 {
    private ByteBuffer[] A;
    private ByteBuffer B;
    private ByteBuffer C;
    private byte[] D;
    private int E;
    private int F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private int K;
    private kw3 L;
    private long M;
    private boolean N;
    private boolean O;
    private final y14 P;

    /* renamed from: a, reason: collision with root package name */
    private final v14 f6015a;

    /* renamed from: b, reason: collision with root package name */
    private final r24 f6016b;

    /* renamed from: c, reason: collision with root package name */
    private final w04[] f6017c;

    /* renamed from: d, reason: collision with root package name */
    private final w04[] f6018d;

    /* renamed from: e, reason: collision with root package name */
    private final ConditionVariable f6019e;

    /* renamed from: f, reason: collision with root package name */
    private final t14 f6020f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque<a24> f6021g;

    /* renamed from: h, reason: collision with root package name */
    private g24 f6022h;

    /* renamed from: i, reason: collision with root package name */
    private final b24<k14> f6023i;

    /* renamed from: j, reason: collision with root package name */
    private final b24<n14> f6024j;

    /* renamed from: k, reason: collision with root package name */
    private l14 f6025k;

    /* renamed from: l, reason: collision with root package name */
    private x14 f6026l;

    /* renamed from: m, reason: collision with root package name */
    private x14 f6027m;

    /* renamed from: n, reason: collision with root package name */
    private AudioTrack f6028n;

    /* renamed from: o, reason: collision with root package name */
    private ef3 f6029o;

    /* renamed from: p, reason: collision with root package name */
    private a24 f6030p;

    /* renamed from: q, reason: collision with root package name */
    private a24 f6031q;

    /* renamed from: r, reason: collision with root package name */
    private final e30 f6032r;

    /* renamed from: s, reason: collision with root package name */
    private long f6033s;

    /* renamed from: t, reason: collision with root package name */
    private long f6034t;

    /* renamed from: u, reason: collision with root package name */
    private long f6035u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f6036v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f6037w;

    /* renamed from: x, reason: collision with root package name */
    private long f6038x;

    /* renamed from: y, reason: collision with root package name */
    private float f6039y;

    /* renamed from: z, reason: collision with root package name */
    private w04[] f6040z;

    public h24(t04 t04Var, w04[] w04VarArr, boolean z6) {
        y14 y14Var = new y14(w04VarArr);
        this.P = y14Var;
        int i7 = n13.f8865a;
        this.f6019e = new ConditionVariable(true);
        this.f6020f = new t14(new d24(this, null));
        v14 v14Var = new v14();
        this.f6015a = v14Var;
        r24 r24Var = new r24();
        this.f6016b = r24Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new m24(), v14Var, r24Var);
        Collections.addAll(arrayList, y14Var.e());
        this.f6017c = (w04[]) arrayList.toArray(new w04[0]);
        this.f6018d = new w04[]{new i24()};
        this.f6039y = 1.0f;
        this.f6029o = ef3.f4595c;
        this.K = 0;
        this.L = new kw3(0, 0.0f);
        e30 e30Var = e30.f4477d;
        this.f6031q = new a24(e30Var, false, 0L, 0L, null);
        this.f6032r = e30Var;
        this.F = -1;
        this.f6040z = new w04[0];
        this.A = new ByteBuffer[0];
        this.f6021g = new ArrayDeque<>();
        this.f6023i = new b24<>(100L);
        this.f6024j = new b24<>(100L);
    }

    private final void A(long j7) {
        e30 e30Var;
        boolean z6;
        h14 h14Var;
        if (K()) {
            y14 y14Var = this.P;
            e30Var = z().f2568a;
            y14Var.c(e30Var);
        } else {
            e30Var = e30.f4477d;
        }
        e30 e30Var2 = e30Var;
        if (K()) {
            y14 y14Var2 = this.P;
            boolean z7 = z().f2569b;
            y14Var2.d(z7);
            z6 = z7;
        } else {
            z6 = false;
        }
        this.f6021g.add(new a24(e30Var2, z6, Math.max(0L, j7), this.f6027m.b(y()), null));
        w04[] w04VarArr = this.f6027m.f13999i;
        ArrayList arrayList = new ArrayList();
        for (w04 w04Var : w04VarArr) {
            if (w04Var.e()) {
                arrayList.add(w04Var);
            } else {
                w04Var.c();
            }
        }
        int size = arrayList.size();
        this.f6040z = (w04[]) arrayList.toArray(new w04[size]);
        this.A = new ByteBuffer[size];
        B();
        l14 l14Var = this.f6025k;
        if (l14Var != null) {
            h14Var = ((k24) l14Var).f7340a.H0;
            h14Var.s(z6);
        }
    }

    private final void B() {
        int i7 = 0;
        while (true) {
            w04[] w04VarArr = this.f6040z;
            if (i7 >= w04VarArr.length) {
                return;
            }
            w04 w04Var = w04VarArr[i7];
            w04Var.c();
            this.A[i7] = w04Var.a();
            i7++;
        }
    }

    private final void C() {
        if (this.H) {
            return;
        }
        this.H = true;
        this.f6020f.d(y());
        this.f6028n.stop();
    }

    private final void D(long j7) {
        ByteBuffer byteBuffer;
        int length = this.f6040z.length;
        int i7 = length;
        while (i7 >= 0) {
            if (i7 > 0) {
                byteBuffer = this.A[i7 - 1];
            } else {
                byteBuffer = this.B;
                if (byteBuffer == null) {
                    byteBuffer = w04.f13656a;
                }
            }
            if (i7 == length) {
                G(byteBuffer, j7);
            } else {
                w04 w04Var = this.f6040z[i7];
                if (i7 > this.F) {
                    w04Var.h(byteBuffer);
                }
                ByteBuffer a7 = w04Var.a();
                this.A[i7] = a7;
                if (a7.hasRemaining()) {
                    i7++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i7--;
            }
        }
    }

    private final void E(e30 e30Var, boolean z6) {
        a24 z7 = z();
        if (e30Var.equals(z7.f2568a) && z6 == z7.f2569b) {
            return;
        }
        a24 a24Var = new a24(e30Var, z6, -9223372036854775807L, -9223372036854775807L, null);
        if (I()) {
            this.f6030p = a24Var;
        } else {
            this.f6031q = a24Var;
        }
    }

    private final void F() {
        if (I()) {
            if (n13.f8865a >= 21) {
                this.f6028n.setVolume(this.f6039y);
                return;
            }
            AudioTrack audioTrack = this.f6028n;
            float f7 = this.f6039y;
            audioTrack.setStereoVolume(f7, f7);
        }
    }

    private final void G(ByteBuffer byteBuffer, long j7) {
        int write;
        wx3 wx3Var;
        wx3 wx3Var2;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.C;
            boolean z6 = true;
            if (byteBuffer2 != null) {
                wu1.d(byteBuffer2 == byteBuffer);
            } else {
                this.C = byteBuffer;
                if (n13.f8865a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.D;
                    if (bArr == null || bArr.length < remaining) {
                        this.D = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.D, 0, remaining);
                    byteBuffer.position(position);
                    this.E = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            int i7 = n13.f8865a;
            if (i7 < 21) {
                int a7 = this.f6020f.a(this.f6034t);
                if (a7 > 0) {
                    write = this.f6028n.write(this.D, this.E, Math.min(remaining2, a7));
                    if (write > 0) {
                        this.E += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                } else {
                    write = 0;
                }
            } else {
                write = this.f6028n.write(byteBuffer, remaining2, 1);
            }
            this.M = SystemClock.elapsedRealtime();
            if (write < 0) {
                if ((i7 < 24 || write != -6) && write != -32) {
                    z6 = false;
                }
                n14 n14Var = new n14(write, this.f6027m.f13991a, z6);
                l14 l14Var = this.f6025k;
                if (l14Var != null) {
                    l14Var.b(n14Var);
                }
                if (n14Var.f8880f) {
                    throw n14Var;
                }
                this.f6024j.b(n14Var);
                return;
            }
            this.f6024j.a();
            if (J(this.f6028n) && this.I && this.f6025k != null && write < remaining2 && !this.O) {
                long c7 = this.f6020f.c(0L);
                k24 k24Var = (k24) this.f6025k;
                wx3Var = k24Var.f7340a.Q0;
                if (wx3Var != null) {
                    wx3Var2 = k24Var.f7340a.Q0;
                    wx3Var2.b(c7);
                }
            }
            int i8 = this.f6027m.f13993c;
            this.f6034t += write;
            if (write == remaining2) {
                this.C = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0029 -> B:4:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean H() {
        boolean z6;
        int i7;
        w04[] w04VarArr;
        if (this.F == -1) {
            this.F = 0;
            z6 = true;
            i7 = this.F;
            w04VarArr = this.f6040z;
            if (i7 < w04VarArr.length) {
                w04 w04Var = w04VarArr[i7];
                if (z6) {
                    w04Var.g();
                }
                D(-9223372036854775807L);
                if (!w04Var.f()) {
                    return false;
                }
                this.F++;
                z6 = true;
                i7 = this.F;
                w04VarArr = this.f6040z;
                if (i7 < w04VarArr.length) {
                    ByteBuffer byteBuffer = this.C;
                    if (byteBuffer != null) {
                        G(byteBuffer, -9223372036854775807L);
                        if (this.C != null) {
                            return false;
                        }
                    }
                    this.F = -1;
                    return true;
                }
            }
        } else {
            z6 = false;
            i7 = this.F;
            w04VarArr = this.f6040z;
            if (i7 < w04VarArr.length) {
            }
        }
    }

    private final boolean I() {
        return this.f6028n != null;
    }

    private static boolean J(AudioTrack audioTrack) {
        return n13.f8865a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean K() {
        if (!"audio/raw".equals(this.f6027m.f13991a.f3660l)) {
            return false;
        }
        int i7 = this.f6027m.f13991a.A;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long x() {
        int i7 = this.f6027m.f13993c;
        return this.f6033s / r0.f13992b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long y() {
        int i7 = this.f6027m.f13993c;
        return this.f6034t / r0.f13994d;
    }

    private final a24 z() {
        a24 a24Var = this.f6030p;
        return a24Var != null ? a24Var : !this.f6021g.isEmpty() ? this.f6021g.getLast() : this.f6031q;
    }

    @Override // com.google.android.gms.internal.ads.o14
    public final int a(c0 c0Var) {
        if (!"audio/raw".equals(c0Var.f3660l)) {
            int i7 = n13.f8865a;
            return 0;
        }
        boolean r7 = n13.r(c0Var.A);
        int i8 = c0Var.A;
        if (r7) {
            return i8 != 2 ? 1 : 2;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Invalid PCM encoding: ");
        sb.append(i8);
        Log.w("DefaultAudioSink", sb.toString());
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.o14
    public final void b() {
        if (I()) {
            this.f6033s = 0L;
            this.f6034t = 0L;
            this.f6035u = 0L;
            this.O = false;
            this.f6031q = new a24(z().f2568a, z().f2569b, 0L, 0L, null);
            this.f6038x = 0L;
            this.f6030p = null;
            this.f6021g.clear();
            this.B = null;
            this.C = null;
            this.H = false;
            this.G = false;
            this.F = -1;
            this.f6016b.p();
            B();
            if (this.f6020f.i()) {
                this.f6028n.pause();
            }
            if (J(this.f6028n)) {
                g24 g24Var = this.f6022h;
                Objects.requireNonNull(g24Var);
                g24Var.b(this.f6028n);
            }
            AudioTrack audioTrack = this.f6028n;
            this.f6028n = null;
            if (n13.f8865a < 21 && !this.J) {
                this.K = 0;
            }
            x14 x14Var = this.f6026l;
            if (x14Var != null) {
                this.f6027m = x14Var;
                this.f6026l = null;
            }
            this.f6020f.e();
            this.f6019e.close();
            new w14(this, "ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.f6024j.a();
        this.f6023i.a();
    }

    @Override // com.google.android.gms.internal.ads.o14
    public final long b0(boolean z6) {
        long V;
        if (!I() || this.f6037w) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.f6020f.b(z6), this.f6027m.b(y()));
        while (!this.f6021g.isEmpty() && min >= this.f6021g.getFirst().f2571d) {
            this.f6031q = this.f6021g.remove();
        }
        a24 a24Var = this.f6031q;
        long j7 = min - a24Var.f2571d;
        if (a24Var.f2568a.equals(e30.f4477d)) {
            V = this.f6031q.f2570c + j7;
        } else if (this.f6021g.isEmpty()) {
            V = this.P.a(j7) + this.f6031q.f2570c;
        } else {
            a24 first = this.f6021g.getFirst();
            V = first.f2570c - n13.V(first.f2571d - min, this.f6031q.f2568a.f4479a);
        }
        return V + this.f6027m.b(this.P.b());
    }

    @Override // com.google.android.gms.internal.ads.o14
    public final e30 c() {
        return z().f2568a;
    }

    @Override // com.google.android.gms.internal.ads.o14
    public final void d() {
        this.f6036v = true;
    }

    @Override // com.google.android.gms.internal.ads.o14
    public final void e() {
        this.I = false;
        if (I() && this.f6020f.l()) {
            this.f6028n.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.o14
    public final void f() {
        this.I = true;
        if (I()) {
            this.f6020f.g();
            this.f6028n.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.o14
    public final void g(e30 e30Var) {
        E(new e30(n13.A(e30Var.f4479a, 0.1f, 8.0f), n13.A(e30Var.f4480b, 0.1f, 8.0f)), z().f2569b);
    }

    @Override // com.google.android.gms.internal.ads.o14
    public final void h() {
        if (!this.G && I() && H()) {
            C();
            this.G = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.o14
    public final void i() {
        b();
        for (w04 w04Var : this.f6017c) {
            w04Var.d();
        }
        w04[] w04VarArr = this.f6018d;
        int length = w04VarArr.length;
        for (int i7 = 0; i7 <= 0; i7++) {
            w04VarArr[i7].d();
        }
        this.I = false;
        this.N = false;
    }

    @Override // com.google.android.gms.internal.ads.o14
    public final void j(float f7) {
        if (this.f6039y != f7) {
            this.f6039y = f7;
            F();
        }
    }

    @Override // com.google.android.gms.internal.ads.o14
    public final boolean k(ByteBuffer byteBuffer, long j7, int i7) {
        ByteBuffer byteBuffer2 = this.B;
        wu1.d(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f6026l != null) {
            if (!H()) {
                return false;
            }
            x14 x14Var = this.f6026l;
            x14 x14Var2 = this.f6027m;
            int i8 = x14Var2.f13993c;
            int i9 = x14Var.f13993c;
            if (x14Var2.f13997g == x14Var.f13997g && x14Var2.f13995e == x14Var.f13995e && x14Var2.f13996f == x14Var.f13996f && x14Var2.f13994d == x14Var.f13994d) {
                this.f6027m = x14Var;
                this.f6026l = null;
                if (J(this.f6028n)) {
                    this.f6028n.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f6028n;
                    c0 c0Var = this.f6027m.f13991a;
                    audioTrack.setOffloadDelayPadding(c0Var.B, c0Var.C);
                    this.O = true;
                }
            } else {
                C();
                if (p()) {
                    return false;
                }
                b();
            }
            A(j7);
        }
        if (!I()) {
            try {
                this.f6019e.block();
                try {
                    x14 x14Var3 = this.f6027m;
                    Objects.requireNonNull(x14Var3);
                    AudioTrack c7 = x14Var3.c(false, this.f6029o, this.K);
                    this.f6028n = c7;
                    if (J(c7)) {
                        AudioTrack audioTrack2 = this.f6028n;
                        if (this.f6022h == null) {
                            this.f6022h = new g24(this);
                        }
                        this.f6022h.a(audioTrack2);
                        AudioTrack audioTrack3 = this.f6028n;
                        c0 c0Var2 = this.f6027m.f13991a;
                        audioTrack3.setOffloadDelayPadding(c0Var2.B, c0Var2.C);
                    }
                    this.K = this.f6028n.getAudioSessionId();
                    t14 t14Var = this.f6020f;
                    AudioTrack audioTrack4 = this.f6028n;
                    x14 x14Var4 = this.f6027m;
                    int i10 = x14Var4.f13993c;
                    t14Var.f(audioTrack4, false, x14Var4.f13997g, x14Var4.f13994d, x14Var4.f13998h);
                    F();
                    int i11 = this.L.f7674a;
                    this.f6037w = true;
                } catch (k14 e7) {
                    l14 l14Var = this.f6025k;
                    if (l14Var != null) {
                        l14Var.b(e7);
                    }
                    throw e7;
                }
            } catch (k14 e8) {
                this.f6023i.b(e8);
                return false;
            }
        }
        this.f6023i.a();
        if (this.f6037w) {
            this.f6038x = Math.max(0L, j7);
            this.f6036v = false;
            this.f6037w = false;
            A(j7);
            if (this.I) {
                f();
            }
        }
        if (!this.f6020f.k(y())) {
            return false;
        }
        if (this.B == null) {
            wu1.d(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            int i12 = this.f6027m.f13993c;
            if (this.f6030p != null) {
                if (!H()) {
                    return false;
                }
                A(j7);
                this.f6030p = null;
            }
            long x6 = this.f6038x + (((x() - this.f6016b.o()) * 1000000) / this.f6027m.f13991a.f3674z);
            if (!this.f6036v && Math.abs(x6 - j7) > 200000) {
                this.f6025k.b(new m14(j7, x6));
                this.f6036v = true;
            }
            if (this.f6036v) {
                if (!H()) {
                    return false;
                }
                long j8 = j7 - x6;
                this.f6038x += j8;
                this.f6036v = false;
                A(j7);
                l14 l14Var2 = this.f6025k;
                if (l14Var2 != null && j8 != 0) {
                    ((k24) l14Var2).f7340a.h0();
                }
            }
            int i13 = this.f6027m.f13993c;
            this.f6033s += byteBuffer.remaining();
            this.B = byteBuffer;
        }
        D(j7);
        if (!this.B.hasRemaining()) {
            this.B = null;
            return true;
        }
        if (!this.f6020f.j(y())) {
            return false;
        }
        Log.w("DefaultAudioSink", "Resetting stalled audio track");
        b();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.o14
    public final void l(kw3 kw3Var) {
        if (this.L.equals(kw3Var)) {
            return;
        }
        int i7 = kw3Var.f7674a;
        if (this.f6028n != null) {
            int i8 = this.L.f7674a;
        }
        this.L = kw3Var;
    }

    @Override // com.google.android.gms.internal.ads.o14
    public final void m(l14 l14Var) {
        this.f6025k = l14Var;
    }

    @Override // com.google.android.gms.internal.ads.o14
    public final void n(c0 c0Var, int i7, int[] iArr) {
        if (!"audio/raw".equals(c0Var.f3660l)) {
            int i8 = n13.f8865a;
            throw new j14("Unable to configure passthrough for: ".concat(String.valueOf(c0Var)), c0Var);
        }
        wu1.d(n13.r(c0Var.A));
        int S = n13.S(c0Var.A, c0Var.f3673y);
        w04[] w04VarArr = this.f6017c;
        this.f6016b.q(c0Var.B, c0Var.C);
        if (n13.f8865a < 21 && c0Var.f3673y == 8 && iArr == null) {
            iArr = new int[6];
            for (int i9 = 0; i9 < 6; i9++) {
                iArr[i9] = i9;
            }
        }
        this.f6015a.o(iArr);
        u04 u04Var = new u04(c0Var.f3674z, c0Var.f3673y, c0Var.A);
        for (w04 w04Var : w04VarArr) {
            try {
                u04 b7 = w04Var.b(u04Var);
                if (true == w04Var.e()) {
                    u04Var = b7;
                }
            } catch (v04 e7) {
                throw new j14(e7, c0Var);
            }
        }
        int i10 = u04Var.f12548c;
        int i11 = u04Var.f12546a;
        int P = n13.P(u04Var.f12547b);
        int S2 = n13.S(i10, u04Var.f12547b);
        if (i10 == 0) {
            String valueOf = String.valueOf(c0Var);
            StringBuilder sb = new StringBuilder(valueOf.length() + 48);
            sb.append("Invalid output encoding (mode=0) for: ");
            sb.append(valueOf);
            throw new j14(sb.toString(), c0Var);
        }
        if (P == 0) {
            String valueOf2 = String.valueOf(c0Var);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 54);
            sb2.append("Invalid output channel config (mode=0) for: ");
            sb2.append(valueOf2);
            throw new j14(sb2.toString(), c0Var);
        }
        this.N = false;
        x14 x14Var = new x14(c0Var, S, 0, S2, i11, P, i10, 0, false, w04VarArr);
        if (I()) {
            this.f6026l = x14Var;
        } else {
            this.f6027m = x14Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.o14
    public final void o(ef3 ef3Var) {
        if (this.f6029o.equals(ef3Var)) {
            return;
        }
        this.f6029o = ef3Var;
        b();
    }

    @Override // com.google.android.gms.internal.ads.o14
    public final boolean p() {
        return I() && this.f6020f.h(y());
    }

    @Override // com.google.android.gms.internal.ads.o14
    public final boolean q() {
        return !I() || (this.G && !p());
    }

    @Override // com.google.android.gms.internal.ads.o14
    public final void r(int i7) {
        if (this.K != i7) {
            this.K = i7;
            this.J = i7 != 0;
            b();
        }
    }

    @Override // com.google.android.gms.internal.ads.o14
    public final void s(boolean z6) {
        E(z().f2568a, z6);
    }

    @Override // com.google.android.gms.internal.ads.o14
    public final boolean t(c0 c0Var) {
        return a(c0Var) != 0;
    }
}
