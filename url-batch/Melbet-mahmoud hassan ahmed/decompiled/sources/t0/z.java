package t0;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import c4.w0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import o2.m0;
import r0.s1;
import r0.u2;
import s0.u1;
import t0.a0;
import t0.g;
import t0.t;
import t0.v;

/* loaded from: classes.dex */
public final class z implements t {

    /* renamed from: c0, reason: collision with root package name */
    public static boolean f21886c0 = false;
    private int A;
    private long B;
    private long C;
    private long D;
    private long E;
    private int F;
    private boolean G;
    private boolean H;
    private long I;
    private float J;
    private t0.g[] K;
    private ByteBuffer[] L;
    private ByteBuffer M;
    private int N;
    private ByteBuffer O;
    private byte[] P;
    private int Q;
    private int R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private int W;
    private w X;
    private boolean Y;
    private long Z;

    /* renamed from: a, reason: collision with root package name */
    private final t0.f f21887a;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f21888a0;

    /* renamed from: b, reason: collision with root package name */
    private final c f21889b;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f21890b0;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f21891c;

    /* renamed from: d, reason: collision with root package name */
    private final y f21892d;

    /* renamed from: e, reason: collision with root package name */
    private final k0 f21893e;

    /* renamed from: f, reason: collision with root package name */
    private final t0.g[] f21894f;

    /* renamed from: g, reason: collision with root package name */
    private final t0.g[] f21895g;

    /* renamed from: h, reason: collision with root package name */
    private final o2.g f21896h;

    /* renamed from: i, reason: collision with root package name */
    private final v f21897i;

    /* renamed from: j, reason: collision with root package name */
    private final ArrayDeque<i> f21898j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f21899k;

    /* renamed from: l, reason: collision with root package name */
    private final int f21900l;

    /* renamed from: m, reason: collision with root package name */
    private l f21901m;

    /* renamed from: n, reason: collision with root package name */
    private final j<t.b> f21902n;

    /* renamed from: o, reason: collision with root package name */
    private final j<t.e> f21903o;

    /* renamed from: p, reason: collision with root package name */
    private final d f21904p;

    /* renamed from: q, reason: collision with root package name */
    private u1 f21905q;

    /* renamed from: r, reason: collision with root package name */
    private t.c f21906r;

    /* renamed from: s, reason: collision with root package name */
    private f f21907s;

    /* renamed from: t, reason: collision with root package name */
    private f f21908t;

    /* renamed from: u, reason: collision with root package name */
    private AudioTrack f21909u;

    /* renamed from: v, reason: collision with root package name */
    private t0.e f21910v;

    /* renamed from: w, reason: collision with root package name */
    private i f21911w;

    /* renamed from: x, reason: collision with root package name */
    private i f21912x;

    /* renamed from: y, reason: collision with root package name */
    private u2 f21913y;

    /* renamed from: z, reason: collision with root package name */
    private ByteBuffer f21914z;

    class a extends Thread {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AudioTrack f21915f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, AudioTrack audioTrack) {
            super(str);
            this.f21915f = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f21915f.flush();
                this.f21915f.release();
            } finally {
                z.this.f21896h.e();
            }
        }
    }

    private static final class b {
        public static void a(AudioTrack audioTrack, u1 u1Var) {
            LogSessionId a7 = u1Var.a();
            if (a7.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(a7);
        }
    }

    public interface c {
        long a();

        boolean b(boolean z6);

        u2 c(u2 u2Var);

        long d(long j7);

        t0.g[] e();
    }

    interface d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f21917a = new a0.a().g();

        int a(int i7, int i8, int i9, int i10, int i11, double d7);
    }

    public static final class e {

        /* renamed from: b, reason: collision with root package name */
        private c f21919b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f21920c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f21921d;

        /* renamed from: a, reason: collision with root package name */
        private t0.f f21918a = t0.f.f21734c;

        /* renamed from: e, reason: collision with root package name */
        private int f21922e = 0;

        /* renamed from: f, reason: collision with root package name */
        d f21923f = d.f21917a;

        public z f() {
            if (this.f21919b == null) {
                this.f21919b = new g(new t0.g[0]);
            }
            return new z(this, null);
        }

        public e g(t0.f fVar) {
            o2.a.e(fVar);
            this.f21918a = fVar;
            return this;
        }

        public e h(boolean z6) {
            this.f21921d = z6;
            return this;
        }

        public e i(boolean z6) {
            this.f21920c = z6;
            return this;
        }

        public e j(int i7) {
            this.f21922e = i7;
            return this;
        }
    }

    private static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final s1 f21924a;

        /* renamed from: b, reason: collision with root package name */
        public final int f21925b;

        /* renamed from: c, reason: collision with root package name */
        public final int f21926c;

        /* renamed from: d, reason: collision with root package name */
        public final int f21927d;

        /* renamed from: e, reason: collision with root package name */
        public final int f21928e;

        /* renamed from: f, reason: collision with root package name */
        public final int f21929f;

        /* renamed from: g, reason: collision with root package name */
        public final int f21930g;

        /* renamed from: h, reason: collision with root package name */
        public final int f21931h;

        /* renamed from: i, reason: collision with root package name */
        public final t0.g[] f21932i;

        public f(s1 s1Var, int i7, int i8, int i9, int i10, int i11, int i12, int i13, t0.g[] gVarArr) {
            this.f21924a = s1Var;
            this.f21925b = i7;
            this.f21926c = i8;
            this.f21927d = i9;
            this.f21928e = i10;
            this.f21929f = i11;
            this.f21930g = i12;
            this.f21931h = i13;
            this.f21932i = gVarArr;
        }

        private AudioTrack d(boolean z6, t0.e eVar, int i7) {
            int i8 = m0.f19752a;
            return i8 >= 29 ? f(z6, eVar, i7) : i8 >= 21 ? e(z6, eVar, i7) : g(eVar, i7);
        }

        private AudioTrack e(boolean z6, t0.e eVar, int i7) {
            return new AudioTrack(i(eVar, z6), z.L(this.f21928e, this.f21929f, this.f21930g), this.f21931h, 1, i7);
        }

        private AudioTrack f(boolean z6, t0.e eVar, int i7) {
            return new AudioTrack.Builder().setAudioAttributes(i(eVar, z6)).setAudioFormat(z.L(this.f21928e, this.f21929f, this.f21930g)).setTransferMode(1).setBufferSizeInBytes(this.f21931h).setSessionId(i7).setOffloadedPlayback(this.f21926c == 1).build();
        }

        private AudioTrack g(t0.e eVar, int i7) {
            int f02 = m0.f0(eVar.f21710h);
            int i8 = this.f21928e;
            int i9 = this.f21929f;
            int i10 = this.f21930g;
            int i11 = this.f21931h;
            return i7 == 0 ? new AudioTrack(f02, i8, i9, i10, i11, 1) : new AudioTrack(f02, i8, i9, i10, i11, 1, i7);
        }

        private static AudioAttributes i(t0.e eVar, boolean z6) {
            return z6 ? j() : eVar.b().f21714a;
        }

        private static AudioAttributes j() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public AudioTrack a(boolean z6, t0.e eVar, int i7) {
            try {
                AudioTrack d7 = d(z6, eVar, i7);
                int state = d7.getState();
                if (state == 1) {
                    return d7;
                }
                try {
                    d7.release();
                } catch (Exception unused) {
                }
                throw new t.b(state, this.f21928e, this.f21929f, this.f21931h, this.f21924a, l(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e7) {
                throw new t.b(0, this.f21928e, this.f21929f, this.f21931h, this.f21924a, l(), e7);
            }
        }

        public boolean b(f fVar) {
            return fVar.f21926c == this.f21926c && fVar.f21930g == this.f21930g && fVar.f21928e == this.f21928e && fVar.f21929f == this.f21929f && fVar.f21927d == this.f21927d;
        }

        public f c(int i7) {
            return new f(this.f21924a, this.f21925b, this.f21926c, this.f21927d, this.f21928e, this.f21929f, this.f21930g, i7, this.f21932i);
        }

        public long h(long j7) {
            return (j7 * 1000000) / this.f21928e;
        }

        public long k(long j7) {
            return (j7 * 1000000) / this.f21924a.E;
        }

        public boolean l() {
            return this.f21926c == 1;
        }
    }

    public static class g implements c {

        /* renamed from: a, reason: collision with root package name */
        private final t0.g[] f21933a;

        /* renamed from: b, reason: collision with root package name */
        private final h0 f21934b;

        /* renamed from: c, reason: collision with root package name */
        private final j0 f21935c;

        public g(t0.g... gVarArr) {
            this(gVarArr, new h0(), new j0());
        }

        public g(t0.g[] gVarArr, h0 h0Var, j0 j0Var) {
            t0.g[] gVarArr2 = new t0.g[gVarArr.length + 2];
            this.f21933a = gVarArr2;
            System.arraycopy(gVarArr, 0, gVarArr2, 0, gVarArr.length);
            this.f21934b = h0Var;
            this.f21935c = j0Var;
            gVarArr2[gVarArr.length] = h0Var;
            gVarArr2[gVarArr.length + 1] = j0Var;
        }

        @Override // t0.z.c
        public long a() {
            return this.f21934b.q();
        }

        @Override // t0.z.c
        public boolean b(boolean z6) {
            this.f21934b.w(z6);
            return z6;
        }

        @Override // t0.z.c
        public u2 c(u2 u2Var) {
            this.f21935c.j(u2Var.f21048f);
            this.f21935c.i(u2Var.f21049g);
            return u2Var;
        }

        @Override // t0.z.c
        public long d(long j7) {
            return this.f21935c.h(j7);
        }

        @Override // t0.z.c
        public t0.g[] e() {
            return this.f21933a;
        }
    }

    public static final class h extends RuntimeException {
        private h(String str) {
            super(str);
        }

        /* synthetic */ h(String str, a aVar) {
            this(str);
        }
    }

    private static final class i {

        /* renamed from: a, reason: collision with root package name */
        public final u2 f21936a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f21937b;

        /* renamed from: c, reason: collision with root package name */
        public final long f21938c;

        /* renamed from: d, reason: collision with root package name */
        public final long f21939d;

        private i(u2 u2Var, boolean z6, long j7, long j8) {
            this.f21936a = u2Var;
            this.f21937b = z6;
            this.f21938c = j7;
            this.f21939d = j8;
        }

        /* synthetic */ i(u2 u2Var, boolean z6, long j7, long j8, a aVar) {
            this(u2Var, z6, j7, j8);
        }
    }

    private static final class j<T extends Exception> {

        /* renamed from: a, reason: collision with root package name */
        private final long f21940a;

        /* renamed from: b, reason: collision with root package name */
        private T f21941b;

        /* renamed from: c, reason: collision with root package name */
        private long f21942c;

        public j(long j7) {
            this.f21940a = j7;
        }

        public void a() {
            this.f21941b = null;
        }

        public void b(T t6) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f21941b == null) {
                this.f21941b = t6;
                this.f21942c = this.f21940a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f21942c) {
                T t7 = this.f21941b;
                if (t7 != t6) {
                    t7.addSuppressed(t6);
                }
                T t8 = this.f21941b;
                a();
                throw t8;
            }
        }
    }

    private final class k implements v.a {
        private k() {
        }

        /* synthetic */ k(z zVar, a aVar) {
            this();
        }

        @Override // t0.v.a
        public void a(long j7) {
            if (z.this.f21906r != null) {
                z.this.f21906r.a(j7);
            }
        }

        @Override // t0.v.a
        public void b(int i7, long j7) {
            if (z.this.f21906r != null) {
                z.this.f21906r.g(i7, j7, SystemClock.elapsedRealtime() - z.this.Z);
            }
        }

        @Override // t0.v.a
        public void c(long j7, long j8, long j9, long j10) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j7 + ", " + j8 + ", " + j9 + ", " + j10 + ", " + z.this.S() + ", " + z.this.T();
            if (z.f21886c0) {
                throw new h(str, null);
            }
            o2.r.i("DefaultAudioSink", str);
        }

        @Override // t0.v.a
        public void d(long j7, long j8, long j9, long j10) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j7 + ", " + j8 + ", " + j9 + ", " + j10 + ", " + z.this.S() + ", " + z.this.T();
            if (z.f21886c0) {
                throw new h(str, null);
            }
            o2.r.i("DefaultAudioSink", str);
        }

        @Override // t0.v.a
        public void e(long j7) {
            o2.r.i("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j7);
        }
    }

    private final class l {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f21944a = new Handler();

        /* renamed from: b, reason: collision with root package name */
        private final AudioTrack.StreamEventCallback f21945b;

        class a extends AudioTrack.StreamEventCallback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z f21947a;

            a(z zVar) {
                this.f21947a = zVar;
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack audioTrack, int i7) {
                o2.a.f(audioTrack == z.this.f21909u);
                if (z.this.f21906r == null || !z.this.U) {
                    return;
                }
                z.this.f21906r.f();
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(AudioTrack audioTrack) {
                o2.a.f(audioTrack == z.this.f21909u);
                if (z.this.f21906r == null || !z.this.U) {
                    return;
                }
                z.this.f21906r.f();
            }
        }

        public l() {
            this.f21945b = new a(z.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f21944a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new m2.p(handler), this.f21945b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f21945b);
            this.f21944a.removeCallbacksAndMessages(null);
        }
    }

    private z(e eVar) {
        this.f21887a = eVar.f21918a;
        c cVar = eVar.f21919b;
        this.f21889b = cVar;
        int i7 = m0.f19752a;
        this.f21891c = i7 >= 21 && eVar.f21920c;
        this.f21899k = i7 >= 23 && eVar.f21921d;
        this.f21900l = i7 >= 29 ? eVar.f21922e : 0;
        this.f21904p = eVar.f21923f;
        o2.g gVar = new o2.g(o2.d.f19699a);
        this.f21896h = gVar;
        gVar.e();
        this.f21897i = new v(new k(this, null));
        y yVar = new y();
        this.f21892d = yVar;
        k0 k0Var = new k0();
        this.f21893e = k0Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new g0(), yVar, k0Var);
        Collections.addAll(arrayList, cVar.e());
        this.f21894f = (t0.g[]) arrayList.toArray(new t0.g[0]);
        this.f21895g = new t0.g[]{new c0()};
        this.J = 1.0f;
        this.f21910v = t0.e.f21706l;
        this.W = 0;
        this.X = new w(0, 0.0f);
        u2 u2Var = u2.f21046i;
        this.f21912x = new i(u2Var, false, 0L, 0L, null);
        this.f21913y = u2Var;
        this.R = -1;
        this.K = new t0.g[0];
        this.L = new ByteBuffer[0];
        this.f21898j = new ArrayDeque<>();
        this.f21902n = new j<>(100L);
        this.f21903o = new j<>(100L);
    }

    /* synthetic */ z(e eVar, a aVar) {
        this(eVar);
    }

    private void E(long j7) {
        u2 c7 = k0() ? this.f21889b.c(M()) : u2.f21046i;
        boolean b7 = k0() ? this.f21889b.b(R()) : false;
        this.f21898j.add(new i(c7, b7, Math.max(0L, j7), this.f21908t.h(T()), null));
        j0();
        t.c cVar = this.f21906r;
        if (cVar != null) {
            cVar.b(b7);
        }
    }

    private long F(long j7) {
        while (!this.f21898j.isEmpty() && j7 >= this.f21898j.getFirst().f21939d) {
            this.f21912x = this.f21898j.remove();
        }
        i iVar = this.f21912x;
        long j8 = j7 - iVar.f21939d;
        if (iVar.f21936a.equals(u2.f21046i)) {
            return this.f21912x.f21938c + j8;
        }
        if (this.f21898j.isEmpty()) {
            return this.f21912x.f21938c + this.f21889b.d(j8);
        }
        i first = this.f21898j.getFirst();
        return first.f21938c - m0.Z(first.f21939d - j7, this.f21912x.f21936a.f21048f);
    }

    private long G(long j7) {
        return j7 + this.f21908t.h(this.f21889b.a());
    }

    private AudioTrack H(f fVar) {
        try {
            return fVar.a(this.Y, this.f21910v, this.W);
        } catch (t.b e7) {
            t.c cVar = this.f21906r;
            if (cVar != null) {
                cVar.c(e7);
            }
            throw e7;
        }
    }

    private AudioTrack I() {
        try {
            return H((f) o2.a.e(this.f21908t));
        } catch (t.b e7) {
            f fVar = this.f21908t;
            if (fVar.f21931h > 1000000) {
                f c7 = fVar.c(1000000);
                try {
                    AudioTrack H = H(c7);
                    this.f21908t = c7;
                    return H;
                } catch (t.b e8) {
                    e7.addSuppressed(e8);
                    Y();
                    throw e7;
                }
            }
            Y();
            throw e7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0029 -> B:4:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean J() {
        boolean z6;
        int i7;
        t0.g[] gVarArr;
        if (this.R == -1) {
            this.R = 0;
            z6 = true;
            i7 = this.R;
            gVarArr = this.K;
            if (i7 < gVarArr.length) {
                t0.g gVar = gVarArr[i7];
                if (z6) {
                    gVar.e();
                }
                b0(-9223372036854775807L);
                if (!gVar.c()) {
                    return false;
                }
                this.R++;
                z6 = true;
                i7 = this.R;
                gVarArr = this.K;
                if (i7 < gVarArr.length) {
                    ByteBuffer byteBuffer = this.O;
                    if (byteBuffer != null) {
                        n0(byteBuffer, -9223372036854775807L);
                        if (this.O != null) {
                            return false;
                        }
                    }
                    this.R = -1;
                    return true;
                }
            }
        } else {
            z6 = false;
            i7 = this.R;
            gVarArr = this.K;
            if (i7 < gVarArr.length) {
            }
        }
    }

    private void K() {
        int i7 = 0;
        while (true) {
            t0.g[] gVarArr = this.K;
            if (i7 >= gVarArr.length) {
                return;
            }
            t0.g gVar = gVarArr[i7];
            gVar.flush();
            this.L[i7] = gVar.d();
            i7++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AudioFormat L(int i7, int i8, int i9) {
        return new AudioFormat.Builder().setSampleRate(i7).setChannelMask(i8).setEncoding(i9).build();
    }

    private u2 M() {
        return P().f21936a;
    }

    private static int N(int i7, int i8, int i9) {
        int minBufferSize = AudioTrack.getMinBufferSize(i7, i8, i9);
        o2.a.f(minBufferSize != -2);
        return minBufferSize;
    }

    private static int O(int i7, ByteBuffer byteBuffer) {
        switch (i7) {
            case 5:
            case 6:
            case 18:
                return t0.b.d(byteBuffer);
            case w0.f2149o /* 7 */:
            case w0.f2150p /* 8 */:
                return b0.e(byteBuffer);
            case 9:
                int m7 = e0.m(m0.I(byteBuffer, byteBuffer.position()));
                if (m7 != -1) {
                    return m7;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i7);
            case 14:
                int a7 = t0.b.a(byteBuffer);
                if (a7 == -1) {
                    return 0;
                }
                return t0.b.h(byteBuffer, a7) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return t0.c.c(byteBuffer);
        }
    }

    private i P() {
        i iVar = this.f21911w;
        return iVar != null ? iVar : !this.f21898j.isEmpty() ? this.f21898j.getLast() : this.f21912x;
    }

    @SuppressLint({"InlinedApi"})
    private int Q(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        int i7 = m0.f19752a;
        if (i7 >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return (i7 == 30 && m0.f19755d.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long S() {
        return this.f21908t.f21926c == 0 ? this.B / r0.f21925b : this.C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long T() {
        return this.f21908t.f21926c == 0 ? this.D / r0.f21927d : this.E;
    }

    private boolean U() {
        u1 u1Var;
        if (!this.f21896h.d()) {
            return false;
        }
        AudioTrack I = I();
        this.f21909u = I;
        if (X(I)) {
            c0(this.f21909u);
            if (this.f21900l != 3) {
                AudioTrack audioTrack = this.f21909u;
                s1 s1Var = this.f21908t.f21924a;
                audioTrack.setOffloadDelayPadding(s1Var.G, s1Var.H);
            }
        }
        if (m0.f19752a >= 31 && (u1Var = this.f21905q) != null) {
            b.a(this.f21909u, u1Var);
        }
        this.W = this.f21909u.getAudioSessionId();
        v vVar = this.f21897i;
        AudioTrack audioTrack2 = this.f21909u;
        f fVar = this.f21908t;
        vVar.s(audioTrack2, fVar.f21926c == 2, fVar.f21930g, fVar.f21927d, fVar.f21931h);
        g0();
        int i7 = this.X.f21875a;
        if (i7 != 0) {
            this.f21909u.attachAuxEffect(i7);
            this.f21909u.setAuxEffectSendLevel(this.X.f21876b);
        }
        this.H = true;
        return true;
    }

    private static boolean V(int i7) {
        return (m0.f19752a >= 24 && i7 == -6) || i7 == -32;
    }

    private boolean W() {
        return this.f21909u != null;
    }

    private static boolean X(AudioTrack audioTrack) {
        return m0.f19752a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private void Y() {
        if (this.f21908t.l()) {
            this.f21888a0 = true;
        }
    }

    private void a0() {
        if (this.T) {
            return;
        }
        this.T = true;
        this.f21897i.g(T());
        this.f21909u.stop();
        this.A = 0;
    }

    private void b0(long j7) {
        ByteBuffer byteBuffer;
        int length = this.K.length;
        int i7 = length;
        while (i7 >= 0) {
            if (i7 > 0) {
                byteBuffer = this.L[i7 - 1];
            } else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = t0.g.f21740a;
                }
            }
            if (i7 == length) {
                n0(byteBuffer, j7);
            } else {
                t0.g gVar = this.K[i7];
                if (i7 > this.R) {
                    gVar.f(byteBuffer);
                }
                ByteBuffer d7 = gVar.d();
                this.L[i7] = d7;
                if (d7.hasRemaining()) {
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

    private void c0(AudioTrack audioTrack) {
        if (this.f21901m == null) {
            this.f21901m = new l();
        }
        this.f21901m.a(audioTrack);
    }

    private void d0() {
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        this.f21890b0 = false;
        this.F = 0;
        this.f21912x = new i(M(), R(), 0L, 0L, null);
        this.I = 0L;
        this.f21911w = null;
        this.f21898j.clear();
        this.M = null;
        this.N = 0;
        this.O = null;
        this.T = false;
        this.S = false;
        this.R = -1;
        this.f21914z = null;
        this.A = 0;
        this.f21893e.o();
        K();
    }

    private void e0(u2 u2Var, boolean z6) {
        i P = P();
        if (u2Var.equals(P.f21936a) && z6 == P.f21937b) {
            return;
        }
        i iVar = new i(u2Var, z6, -9223372036854775807L, -9223372036854775807L, null);
        if (W()) {
            this.f21911w = iVar;
        } else {
            this.f21912x = iVar;
        }
    }

    private void f0(u2 u2Var) {
        if (W()) {
            try {
                this.f21909u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(u2Var.f21048f).setPitch(u2Var.f21049g).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e7) {
                o2.r.j("DefaultAudioSink", "Failed to set playback params", e7);
            }
            u2Var = new u2(this.f21909u.getPlaybackParams().getSpeed(), this.f21909u.getPlaybackParams().getPitch());
            this.f21897i.t(u2Var.f21048f);
        }
        this.f21913y = u2Var;
    }

    private void g0() {
        if (W()) {
            if (m0.f19752a >= 21) {
                h0(this.f21909u, this.J);
            } else {
                i0(this.f21909u, this.J);
            }
        }
    }

    private static void h0(AudioTrack audioTrack, float f7) {
        audioTrack.setVolume(f7);
    }

    private static void i0(AudioTrack audioTrack, float f7) {
        audioTrack.setStereoVolume(f7, f7);
    }

    private void j0() {
        t0.g[] gVarArr = this.f21908t.f21932i;
        ArrayList arrayList = new ArrayList();
        for (t0.g gVar : gVarArr) {
            if (gVar.b()) {
                arrayList.add(gVar);
            } else {
                gVar.flush();
            }
        }
        int size = arrayList.size();
        this.K = (t0.g[]) arrayList.toArray(new t0.g[size]);
        this.L = new ByteBuffer[size];
        K();
    }

    private boolean k0() {
        return (this.Y || !"audio/raw".equals(this.f21908t.f21924a.f20956q) || l0(this.f21908t.f21924a.F)) ? false : true;
    }

    private boolean l0(int i7) {
        return this.f21891c && m0.s0(i7);
    }

    private boolean m0(s1 s1Var, t0.e eVar) {
        int f7;
        int G;
        int Q;
        if (m0.f19752a < 29 || this.f21900l == 0 || (f7 = o2.v.f((String) o2.a.e(s1Var.f20956q), s1Var.f20953n)) == 0 || (G = m0.G(s1Var.D)) == 0 || (Q = Q(L(s1Var.E, G, f7), eVar.b().f21714a)) == 0) {
            return false;
        }
        if (Q == 1) {
            return ((s1Var.G != 0 || s1Var.H != 0) && (this.f21900l == 1)) ? false : true;
        }
        if (Q == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    private void n0(ByteBuffer byteBuffer, long j7) {
        int o02;
        t.c cVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.O;
            if (byteBuffer2 != null) {
                o2.a.a(byteBuffer2 == byteBuffer);
            } else {
                this.O = byteBuffer;
                if (m0.f19752a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.P;
                    if (bArr == null || bArr.length < remaining) {
                        this.P = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.P, 0, remaining);
                    byteBuffer.position(position);
                    this.Q = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (m0.f19752a < 21) {
                int c7 = this.f21897i.c(this.D);
                if (c7 > 0) {
                    o02 = this.f21909u.write(this.P, this.Q, Math.min(remaining2, c7));
                    if (o02 > 0) {
                        this.Q += o02;
                        byteBuffer.position(byteBuffer.position() + o02);
                    }
                } else {
                    o02 = 0;
                }
            } else if (this.Y) {
                o2.a.f(j7 != -9223372036854775807L);
                o02 = p0(this.f21909u, byteBuffer, remaining2, j7);
            } else {
                o02 = o0(this.f21909u, byteBuffer, remaining2);
            }
            this.Z = SystemClock.elapsedRealtime();
            if (o02 < 0) {
                boolean V = V(o02);
                if (V) {
                    Y();
                }
                t.e eVar = new t.e(o02, this.f21908t.f21924a, V);
                t.c cVar2 = this.f21906r;
                if (cVar2 != null) {
                    cVar2.c(eVar);
                }
                if (eVar.f21836g) {
                    throw eVar;
                }
                this.f21903o.b(eVar);
                return;
            }
            this.f21903o.a();
            if (X(this.f21909u)) {
                if (this.E > 0) {
                    this.f21890b0 = false;
                }
                if (this.U && (cVar = this.f21906r) != null && o02 < remaining2 && !this.f21890b0) {
                    cVar.e();
                }
            }
            int i7 = this.f21908t.f21926c;
            if (i7 == 0) {
                this.D += o02;
            }
            if (o02 == remaining2) {
                if (i7 != 0) {
                    o2.a.f(byteBuffer == this.M);
                    this.E += this.F * this.N;
                }
                this.O = null;
            }
        }
    }

    private static int o0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i7) {
        return audioTrack.write(byteBuffer, i7, 1);
    }

    private int p0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i7, long j7) {
        if (m0.f19752a >= 26) {
            return audioTrack.write(byteBuffer, i7, 1, j7 * 1000);
        }
        if (this.f21914z == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f21914z = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f21914z.putInt(1431633921);
        }
        if (this.A == 0) {
            this.f21914z.putInt(4, i7);
            this.f21914z.putLong(8, j7 * 1000);
            this.f21914z.position(0);
            this.A = i7;
        }
        int remaining = this.f21914z.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f21914z, remaining, 1);
            if (write < 0) {
                this.A = 0;
                return write;
            }
            if (write < remaining) {
                return 0;
            }
        }
        int o02 = o0(audioTrack, byteBuffer, i7);
        if (o02 < 0) {
            this.A = 0;
            return o02;
        }
        this.A -= o02;
        return o02;
    }

    public boolean R() {
        return P().f21937b;
    }

    @Override // t0.t
    public void Z() {
        this.U = false;
        if (W() && this.f21897i.p()) {
            this.f21909u.pause();
        }
    }

    @Override // t0.t
    public void a() {
        flush();
        for (t0.g gVar : this.f21894f) {
            gVar.a();
        }
        for (t0.g gVar2 : this.f21895g) {
            gVar2.a();
        }
        this.U = false;
        this.f21888a0 = false;
    }

    @Override // t0.t
    public boolean b(s1 s1Var) {
        return i(s1Var) != 0;
    }

    @Override // t0.t
    public boolean c() {
        return !W() || (this.S && !l());
    }

    @Override // t0.t
    public u2 d() {
        return this.f21899k ? this.f21913y : M();
    }

    @Override // t0.t
    public void e(u2 u2Var) {
        u2 u2Var2 = new u2(m0.p(u2Var.f21048f, 0.1f, 8.0f), m0.p(u2Var.f21049g, 0.1f, 8.0f));
        if (!this.f21899k || m0.f19752a < 23) {
            e0(u2Var2, R());
        } else {
            f0(u2Var2);
        }
    }

    @Override // t0.t
    public void f(boolean z6) {
        e0(M(), z6);
    }

    @Override // t0.t
    public void flush() {
        if (W()) {
            d0();
            if (this.f21897i.i()) {
                this.f21909u.pause();
            }
            if (X(this.f21909u)) {
                ((l) o2.a.e(this.f21901m)).b(this.f21909u);
            }
            AudioTrack audioTrack = this.f21909u;
            this.f21909u = null;
            if (m0.f19752a < 21 && !this.V) {
                this.W = 0;
            }
            f fVar = this.f21907s;
            if (fVar != null) {
                this.f21908t = fVar;
                this.f21907s = null;
            }
            this.f21897i.q();
            this.f21896h.c();
            new a("ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.f21903o.a();
        this.f21902n.a();
    }

    @Override // t0.t
    public void g(float f7) {
        if (this.J != f7) {
            this.J = f7;
            g0();
        }
    }

    @Override // t0.t
    public void h(u1 u1Var) {
        this.f21905q = u1Var;
    }

    @Override // t0.t
    public int i(s1 s1Var) {
        if (!"audio/raw".equals(s1Var.f20956q)) {
            return ((this.f21888a0 || !m0(s1Var, this.f21910v)) && !this.f21887a.h(s1Var)) ? 0 : 2;
        }
        if (m0.t0(s1Var.F)) {
            int i7 = s1Var.F;
            return (i7 == 2 || (this.f21891c && i7 == 4)) ? 2 : 1;
        }
        o2.r.i("DefaultAudioSink", "Invalid PCM encoding: " + s1Var.F);
        return 0;
    }

    @Override // t0.t
    public void j() {
        o2.a.f(m0.f19752a >= 21);
        o2.a.f(this.V);
        if (this.Y) {
            return;
        }
        this.Y = true;
        flush();
    }

    @Override // t0.t
    public void k() {
        if (!this.S && W() && J()) {
            a0();
            this.S = true;
        }
    }

    @Override // t0.t
    public boolean l() {
        return W() && this.f21897i.h(T());
    }

    @Override // t0.t
    public void m(t0.e eVar) {
        if (this.f21910v.equals(eVar)) {
            return;
        }
        this.f21910v = eVar;
        if (this.Y) {
            return;
        }
        flush();
    }

    @Override // t0.t
    public void n(int i7) {
        if (this.W != i7) {
            this.W = i7;
            this.V = i7 != 0;
            flush();
        }
    }

    @Override // t0.t
    public void o(t.c cVar) {
        this.f21906r = cVar;
    }

    @Override // t0.t
    public void p(s1 s1Var, int i7, int[] iArr) {
        t0.g[] gVarArr;
        int i8;
        int intValue;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int a7;
        int[] iArr2;
        if ("audio/raw".equals(s1Var.f20956q)) {
            o2.a.a(m0.t0(s1Var.F));
            i10 = m0.d0(s1Var.F, s1Var.D);
            t0.g[] gVarArr2 = l0(s1Var.F) ? this.f21895g : this.f21894f;
            this.f21893e.p(s1Var.G, s1Var.H);
            if (m0.f19752a < 21 && s1Var.D == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i14 = 0; i14 < 6; i14++) {
                    iArr2[i14] = i14;
                }
            } else {
                iArr2 = iArr;
            }
            this.f21892d.n(iArr2);
            g.a aVar = new g.a(s1Var.E, s1Var.D, s1Var.F);
            for (t0.g gVar : gVarArr2) {
                try {
                    g.a g7 = gVar.g(aVar);
                    if (gVar.b()) {
                        aVar = g7;
                    }
                } catch (g.b e7) {
                    throw new t.a(e7, s1Var);
                }
            }
            int i15 = aVar.f21744c;
            int i16 = aVar.f21742a;
            int G = m0.G(aVar.f21743b);
            gVarArr = gVarArr2;
            i12 = m0.d0(i15, aVar.f21743b);
            i9 = i15;
            i8 = i16;
            intValue = G;
            i11 = 0;
        } else {
            t0.g[] gVarArr3 = new t0.g[0];
            int i17 = s1Var.E;
            if (m0(s1Var, this.f21910v)) {
                gVarArr = gVarArr3;
                i8 = i17;
                i9 = o2.v.f((String) o2.a.e(s1Var.f20956q), s1Var.f20953n);
                intValue = m0.G(s1Var.D);
                i10 = -1;
                i11 = 1;
            } else {
                Pair<Integer, Integer> f7 = this.f21887a.f(s1Var);
                if (f7 == null) {
                    throw new t.a("Unable to configure passthrough for: " + s1Var, s1Var);
                }
                int intValue2 = ((Integer) f7.first).intValue();
                gVarArr = gVarArr3;
                i8 = i17;
                intValue = ((Integer) f7.second).intValue();
                i9 = intValue2;
                i10 = -1;
                i11 = 2;
            }
            i12 = -1;
        }
        if (i7 != 0) {
            a7 = i7;
            i13 = i9;
        } else {
            i13 = i9;
            a7 = this.f21904p.a(N(i8, intValue, i9), i9, i11, i12, i8, this.f21899k ? 8.0d : 1.0d);
        }
        if (i13 == 0) {
            throw new t.a("Invalid output encoding (mode=" + i11 + ") for: " + s1Var, s1Var);
        }
        if (intValue == 0) {
            throw new t.a("Invalid output channel config (mode=" + i11 + ") for: " + s1Var, s1Var);
        }
        this.f21888a0 = false;
        f fVar = new f(s1Var, i10, i11, i12, i8, intValue, i13, a7, gVarArr);
        if (W()) {
            this.f21907s = fVar;
        } else {
            this.f21908t = fVar;
        }
    }

    @Override // t0.t
    public boolean q(ByteBuffer byteBuffer, long j7, int i7) {
        ByteBuffer byteBuffer2 = this.M;
        o2.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f21907s != null) {
            if (!J()) {
                return false;
            }
            if (this.f21907s.b(this.f21908t)) {
                this.f21908t = this.f21907s;
                this.f21907s = null;
                if (X(this.f21909u) && this.f21900l != 3) {
                    if (this.f21909u.getPlayState() == 3) {
                        this.f21909u.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.f21909u;
                    s1 s1Var = this.f21908t.f21924a;
                    audioTrack.setOffloadDelayPadding(s1Var.G, s1Var.H);
                    this.f21890b0 = true;
                }
            } else {
                a0();
                if (l()) {
                    return false;
                }
                flush();
            }
            E(j7);
        }
        if (!W()) {
            try {
                if (!U()) {
                    return false;
                }
            } catch (t.b e7) {
                if (e7.f21831g) {
                    throw e7;
                }
                this.f21902n.b(e7);
                return false;
            }
        }
        this.f21902n.a();
        if (this.H) {
            this.I = Math.max(0L, j7);
            this.G = false;
            this.H = false;
            if (this.f21899k && m0.f19752a >= 23) {
                f0(this.f21913y);
            }
            E(j7);
            if (this.U) {
                w0();
            }
        }
        if (!this.f21897i.k(T())) {
            return false;
        }
        if (this.M == null) {
            o2.a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            f fVar = this.f21908t;
            if (fVar.f21926c != 0 && this.F == 0) {
                int O = O(fVar.f21930g, byteBuffer);
                this.F = O;
                if (O == 0) {
                    return true;
                }
            }
            if (this.f21911w != null) {
                if (!J()) {
                    return false;
                }
                E(j7);
                this.f21911w = null;
            }
            long k7 = this.I + this.f21908t.k(S() - this.f21893e.n());
            if (!this.G && Math.abs(k7 - j7) > 200000) {
                this.f21906r.c(new t.d(j7, k7));
                this.G = true;
            }
            if (this.G) {
                if (!J()) {
                    return false;
                }
                long j8 = j7 - k7;
                this.I += j8;
                this.G = false;
                E(j7);
                t.c cVar = this.f21906r;
                if (cVar != null && j8 != 0) {
                    cVar.d();
                }
            }
            if (this.f21908t.f21926c == 0) {
                this.B += byteBuffer.remaining();
            } else {
                this.C += this.F * i7;
            }
            this.M = byteBuffer;
            this.N = i7;
        }
        b0(j7);
        if (!this.M.hasRemaining()) {
            this.M = null;
            this.N = 0;
            return true;
        }
        if (!this.f21897i.j(T())) {
            return false;
        }
        o2.r.i("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // t0.t
    public long r(boolean z6) {
        if (!W() || this.H) {
            return Long.MIN_VALUE;
        }
        return G(F(Math.min(this.f21897i.d(z6), this.f21908t.h(T()))));
    }

    @Override // t0.t
    public void s() {
        if (this.Y) {
            this.Y = false;
            flush();
        }
    }

    @Override // t0.t
    public void t(w wVar) {
        if (this.X.equals(wVar)) {
            return;
        }
        int i7 = wVar.f21875a;
        float f7 = wVar.f21876b;
        AudioTrack audioTrack = this.f21909u;
        if (audioTrack != null) {
            if (this.X.f21875a != i7) {
                audioTrack.attachAuxEffect(i7);
            }
            if (i7 != 0) {
                this.f21909u.setAuxEffectSendLevel(f7);
            }
        }
        this.X = wVar;
    }

    @Override // t0.t
    public void u() {
        if (m0.f19752a < 25) {
            flush();
            return;
        }
        this.f21903o.a();
        this.f21902n.a();
        if (W()) {
            d0();
            if (this.f21897i.i()) {
                this.f21909u.pause();
            }
            this.f21909u.flush();
            this.f21897i.q();
            v vVar = this.f21897i;
            AudioTrack audioTrack = this.f21909u;
            f fVar = this.f21908t;
            vVar.s(audioTrack, fVar.f21926c == 2, fVar.f21930g, fVar.f21927d, fVar.f21931h);
            this.H = true;
        }
    }

    @Override // t0.t
    public void v() {
        this.G = true;
    }

    @Override // t0.t
    public void w0() {
        this.U = true;
        if (W()) {
            this.f21897i.u();
            this.f21909u.play();
        }
    }
}
