package i1;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import i1.l;
import i1.v;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import o2.h0;
import o2.j0;
import o2.m0;
import r0.s1;
import r0.t1;
import s0.u1;
import u0.g;
import v0.o;

/* loaded from: classes.dex */
public abstract class o extends r0.f {
    private static final byte[] K0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private final h0<s1> A;
    private long A0;
    private final ArrayList<Long> B;
    private boolean B0;
    private final MediaCodec.BufferInfo C;
    private boolean C0;
    private final long[] D;
    private boolean D0;
    private final long[] E;
    private boolean E0;
    private final long[] F;
    private r0.r F0;
    private s1 G;
    protected u0.e G0;
    private s1 H;
    private long H0;
    private v0.o I;
    private long I0;
    private v0.o J;
    private int J0;
    private MediaCrypto K;
    private boolean L;
    private long M;
    private float N;
    private float O;
    private l P;
    private s1 Q;
    private MediaFormat R;
    private boolean S;
    private float T;
    private ArrayDeque<n> U;
    private b V;
    private n W;
    private int X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f16960a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f16961b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f16962c0;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f16963d0;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f16964e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f16965f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f16966g0;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f16967h0;

    /* renamed from: i0, reason: collision with root package name */
    private i f16968i0;

    /* renamed from: j0, reason: collision with root package name */
    private long f16969j0;

    /* renamed from: k0, reason: collision with root package name */
    private int f16970k0;

    /* renamed from: l0, reason: collision with root package name */
    private int f16971l0;

    /* renamed from: m0, reason: collision with root package name */
    private ByteBuffer f16972m0;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f16973n0;

    /* renamed from: o0, reason: collision with root package name */
    private boolean f16974o0;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f16975p0;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f16976q0;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f16977r0;

    /* renamed from: s, reason: collision with root package name */
    private final l.b f16978s;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f16979s0;

    /* renamed from: t, reason: collision with root package name */
    private final q f16980t;

    /* renamed from: t0, reason: collision with root package name */
    private int f16981t0;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f16982u;

    /* renamed from: u0, reason: collision with root package name */
    private int f16983u0;

    /* renamed from: v, reason: collision with root package name */
    private final float f16984v;

    /* renamed from: v0, reason: collision with root package name */
    private int f16985v0;

    /* renamed from: w, reason: collision with root package name */
    private final u0.g f16986w;

    /* renamed from: w0, reason: collision with root package name */
    private boolean f16987w0;

    /* renamed from: x, reason: collision with root package name */
    private final u0.g f16988x;

    /* renamed from: x0, reason: collision with root package name */
    private boolean f16989x0;

    /* renamed from: y, reason: collision with root package name */
    private final u0.g f16990y;

    /* renamed from: y0, reason: collision with root package name */
    private boolean f16991y0;

    /* renamed from: z, reason: collision with root package name */
    private final h f16992z;

    /* renamed from: z0, reason: collision with root package name */
    private long f16993z0;

    private static final class a {
        public static void a(l.a aVar, u1 u1Var) {
            LogSessionId a7 = u1Var.a();
            if (a7.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.f16942b.setString("log-session-id", a7.getStringId());
        }
    }

    public static class b extends Exception {

        /* renamed from: f, reason: collision with root package name */
        public final String f16994f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f16995g;

        /* renamed from: h, reason: collision with root package name */
        public final n f16996h;

        /* renamed from: i, reason: collision with root package name */
        public final String f16997i;

        /* renamed from: j, reason: collision with root package name */
        public final b f16998j;

        private b(String str, Throwable th, String str2, boolean z6, n nVar, String str3, b bVar) {
            super(str, th);
            this.f16994f = str2;
            this.f16995g = z6;
            this.f16996h = nVar;
            this.f16997i = str3;
            this.f16998j = bVar;
        }

        public b(s1 s1Var, Throwable th, boolean z6, int i7) {
            this("Decoder init failed: [" + i7 + "], " + s1Var, th, s1Var.f20956q, z6, null, b(i7), null);
        }

        public b(s1 s1Var, Throwable th, boolean z6, n nVar) {
            this("Decoder init failed: " + nVar.f16949a + ", " + s1Var, th, s1Var.f20956q, z6, nVar, m0.f19752a >= 21 ? d(th) : null, null);
        }

        private static String b(int i7) {
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i7 < 0 ? "neg_" : "") + Math.abs(i7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b c(b bVar) {
            return new b(getMessage(), getCause(), this.f16994f, this.f16995g, this.f16996h, this.f16997i, bVar);
        }

        private static String d(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }
    }

    public o(int i7, l.b bVar, q qVar, boolean z6, float f7) {
        super(i7);
        this.f16978s = bVar;
        this.f16980t = (q) o2.a.e(qVar);
        this.f16982u = z6;
        this.f16984v = f7;
        this.f16986w = u0.g.u();
        this.f16988x = new u0.g(0);
        this.f16990y = new u0.g(2);
        h hVar = new h();
        this.f16992z = hVar;
        this.A = new h0<>();
        this.B = new ArrayList<>();
        this.C = new MediaCodec.BufferInfo();
        this.N = 1.0f;
        this.O = 1.0f;
        this.M = -9223372036854775807L;
        this.D = new long[10];
        this.E = new long[10];
        this.F = new long[10];
        this.H0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        hVar.r(0);
        hVar.f22411h.order(ByteOrder.nativeOrder());
        this.T = -1.0f;
        this.X = 0;
        this.f16981t0 = 0;
        this.f16970k0 = -1;
        this.f16971l0 = -1;
        this.f16969j0 = -9223372036854775807L;
        this.f16993z0 = -9223372036854775807L;
        this.A0 = -9223372036854775807L;
        this.f16983u0 = 0;
        this.f16985v0 = 0;
    }

    private boolean D0() {
        return this.f16971l0 >= 0;
    }

    private void E0(s1 s1Var) {
        h0();
        String str = s1Var.f20956q;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f16992z.C(32);
        } else {
            this.f16992z.C(1);
        }
        this.f16975p0 = true;
    }

    private void F0(n nVar, MediaCrypto mediaCrypto) {
        String str = nVar.f16949a;
        int i7 = m0.f19752a;
        float v02 = i7 < 23 ? -1.0f : v0(this.O, this.G, I());
        float f7 = v02 > this.f16984v ? v02 : -1.0f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        l.a z02 = z0(nVar, this.G, mediaCrypto, f7);
        if (i7 >= 31) {
            a.a(z02, H());
        }
        try {
            j0.a("createCodec:" + str);
            this.P = this.f16978s.a(z02);
            j0.c();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.W = nVar;
            this.T = f7;
            this.Q = this.G;
            this.X = X(str);
            this.Y = Y(str, this.Q);
            this.Z = d0(str);
            this.f16960a0 = f0(str);
            this.f16961b0 = a0(str);
            this.f16962c0 = b0(str);
            this.f16963d0 = Z(str);
            this.f16964e0 = e0(str, this.Q);
            this.f16967h0 = c0(nVar) || u0();
            if (this.P.c()) {
                this.f16979s0 = true;
                this.f16981t0 = 1;
                this.f16965f0 = this.X != 0;
            }
            if ("c2.android.mp3.decoder".equals(nVar.f16949a)) {
                this.f16968i0 = new i();
            }
            if (getState() == 2) {
                this.f16969j0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.G0.f22398a++;
            N0(str, z02, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th) {
            j0.c();
            throw th;
        }
    }

    private boolean G0(long j7) {
        int size = this.B.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.B.get(i7).longValue() == j7) {
                this.B.remove(i7);
                return true;
            }
        }
        return false;
    }

    private static boolean H0(IllegalStateException illegalStateException) {
        if (m0.f19752a >= 21 && I0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private static boolean I0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    private static boolean J0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void L0(MediaCrypto mediaCrypto, boolean z6) {
        b bVar;
        if (this.U == null) {
            try {
                List<n> r02 = r0(z6);
                ArrayDeque<n> arrayDeque = new ArrayDeque<>();
                this.U = arrayDeque;
                if (this.f16982u) {
                    arrayDeque.addAll(r02);
                } else if (!r02.isEmpty()) {
                    this.U.add(r02.get(0));
                }
                this.V = null;
            } catch (v.c e7) {
                throw new b(this.G, e7, z6, -49998);
            }
        }
        if (this.U.isEmpty()) {
            throw new b(this.G, (Throwable) null, z6, -49999);
        }
        n peekFirst = this.U.peekFirst();
        while (this.P == null) {
            n peekFirst2 = this.U.peekFirst();
            if (!k1(peekFirst2)) {
                return;
            }
            try {
                F0(peekFirst2, mediaCrypto);
            } catch (Exception e8) {
                if (peekFirst2 != peekFirst) {
                    throw e8;
                }
                try {
                    o2.r.i("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                    Thread.sleep(50L);
                    F0(peekFirst2, mediaCrypto);
                } catch (Exception e9) {
                    o2.r.j("MediaCodecRenderer", "Failed to initialize decoder: " + peekFirst2, e9);
                    this.U.removeFirst();
                    b bVar2 = new b(this.G, e9, z6, peekFirst2);
                    M0(bVar2);
                    bVar = this.V;
                    if (bVar != null) {
                    }
                    if (!this.U.isEmpty()) {
                    }
                }
                o2.r.j("MediaCodecRenderer", "Failed to initialize decoder: " + peekFirst2, e9);
                this.U.removeFirst();
                b bVar22 = new b(this.G, e9, z6, peekFirst2);
                M0(bVar22);
                bVar = this.V;
                if (bVar != null) {
                    this.V = bVar22;
                } else {
                    this.V = bVar.c(bVar22);
                }
                if (!this.U.isEmpty()) {
                    throw this.V;
                }
            }
        }
        this.U = null;
    }

    private void U() {
        o2.a.f(!this.B0);
        t1 F = F();
        this.f16990y.h();
        do {
            this.f16990y.h();
            int R = R(F, this.f16990y, 0);
            if (R == -5) {
                P0(F);
                return;
            }
            if (R != -4) {
                if (R != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else {
                if (this.f16990y.m()) {
                    this.B0 = true;
                    return;
                }
                if (this.D0) {
                    s1 s1Var = (s1) o2.a.e(this.G);
                    this.H = s1Var;
                    Q0(s1Var, null);
                    this.D0 = false;
                }
                this.f16990y.s();
            }
        } while (this.f16992z.w(this.f16990y));
        this.f16976q0 = true;
    }

    @TargetApi(23)
    private void U0() {
        int i7 = this.f16985v0;
        if (i7 == 1) {
            o0();
            return;
        }
        if (i7 == 2) {
            o0();
            q1();
        } else if (i7 == 3) {
            Y0();
        } else {
            this.C0 = true;
            a1();
        }
    }

    private boolean V(long j7, long j8) {
        o2.a.f(!this.C0);
        if (this.f16992z.B()) {
            h hVar = this.f16992z;
            if (!V0(j7, j8, null, hVar.f22411h, this.f16971l0, 0, hVar.A(), this.f16992z.y(), this.f16992z.l(), this.f16992z.m(), this.H)) {
                return false;
            }
            R0(this.f16992z.z());
            this.f16992z.h();
        }
        if (this.B0) {
            this.C0 = true;
            return false;
        }
        if (this.f16976q0) {
            o2.a.f(this.f16992z.w(this.f16990y));
            this.f16976q0 = false;
        }
        if (this.f16977r0) {
            if (this.f16992z.B()) {
                return true;
            }
            h0();
            this.f16977r0 = false;
            K0();
            if (!this.f16975p0) {
                return false;
            }
        }
        U();
        if (this.f16992z.B()) {
            this.f16992z.s();
        }
        return this.f16992z.B() || this.B0 || this.f16977r0;
    }

    private void W0() {
        this.f16991y0 = true;
        MediaFormat h7 = this.P.h();
        if (this.X != 0 && h7.getInteger("width") == 32 && h7.getInteger("height") == 32) {
            this.f16966g0 = true;
            return;
        }
        if (this.f16964e0) {
            h7.setInteger("channel-count", 1);
        }
        this.R = h7;
        this.S = true;
    }

    private int X(String str) {
        int i7 = m0.f19752a;
        if (i7 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = m0.f19755d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i7 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = m0.f19753b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private boolean X0(int i7) {
        t1 F = F();
        this.f16986w.h();
        int R = R(F, this.f16986w, i7 | 4);
        if (R == -5) {
            P0(F);
            return true;
        }
        if (R != -4 || !this.f16986w.m()) {
            return false;
        }
        this.B0 = true;
        U0();
        return false;
    }

    private static boolean Y(String str, s1 s1Var) {
        return m0.f19752a < 21 && s1Var.f20958s.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private void Y0() {
        Z0();
        K0();
    }

    private static boolean Z(String str) {
        if (m0.f19752a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(m0.f19754c)) {
            String str2 = m0.f19753b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    private static boolean a0(String str) {
        int i7 = m0.f19752a;
        if (i7 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i7 <= 19) {
                String str2 = m0.f19753b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    private static boolean b0(String str) {
        return m0.f19752a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean c0(n nVar) {
        String str = nVar.f16949a;
        int i7 = m0.f19752a;
        return (i7 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i7 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i7 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || ("Amazon".equals(m0.f19754c) && "AFTS".equals(m0.f19755d) && nVar.f16955g));
    }

    private static boolean d0(String str) {
        int i7 = m0.f19752a;
        return i7 < 18 || (i7 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i7 == 19 && m0.f19755d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    private void d1() {
        this.f16970k0 = -1;
        this.f16988x.f22411h = null;
    }

    private static boolean e0(String str, s1 s1Var) {
        return m0.f19752a <= 18 && s1Var.D == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    private void e1() {
        this.f16971l0 = -1;
        this.f16972m0 = null;
    }

    private static boolean f0(String str) {
        return m0.f19752a == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void f1(v0.o oVar) {
        v0.n.a(this.I, oVar);
        this.I = oVar;
    }

    private void h0() {
        this.f16977r0 = false;
        this.f16992z.h();
        this.f16990y.h();
        this.f16976q0 = false;
        this.f16975p0 = false;
    }

    private boolean i0() {
        if (this.f16987w0) {
            this.f16983u0 = 1;
            if (this.Z || this.f16961b0) {
                this.f16985v0 = 3;
                return false;
            }
            this.f16985v0 = 1;
        }
        return true;
    }

    private void i1(v0.o oVar) {
        v0.n.a(this.J, oVar);
        this.J = oVar;
    }

    private void j0() {
        if (!this.f16987w0) {
            Y0();
        } else {
            this.f16983u0 = 1;
            this.f16985v0 = 3;
        }
    }

    private boolean j1(long j7) {
        return this.M == -9223372036854775807L || SystemClock.elapsedRealtime() - j7 < this.M;
    }

    @TargetApi(23)
    private boolean k0() {
        if (this.f16987w0) {
            this.f16983u0 = 1;
            if (this.Z || this.f16961b0) {
                this.f16985v0 = 3;
                return false;
            }
            this.f16985v0 = 2;
        } else {
            q1();
        }
        return true;
    }

    private boolean l0(long j7, long j8) {
        boolean z6;
        boolean V0;
        int b7;
        if (!D0()) {
            if (this.f16962c0 && this.f16989x0) {
                try {
                    b7 = this.P.b(this.C);
                } catch (IllegalStateException unused) {
                    U0();
                    if (this.C0) {
                        Z0();
                    }
                    return false;
                }
            } else {
                b7 = this.P.b(this.C);
            }
            if (b7 < 0) {
                if (b7 == -2) {
                    W0();
                    return true;
                }
                if (this.f16967h0 && (this.B0 || this.f16983u0 == 2)) {
                    U0();
                }
                return false;
            }
            if (this.f16966g0) {
                this.f16966g0 = false;
                this.P.d(b7, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.C;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                U0();
                return false;
            }
            this.f16971l0 = b7;
            ByteBuffer m7 = this.P.m(b7);
            this.f16972m0 = m7;
            if (m7 != null) {
                m7.position(this.C.offset);
                ByteBuffer byteBuffer = this.f16972m0;
                MediaCodec.BufferInfo bufferInfo2 = this.C;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f16963d0) {
                MediaCodec.BufferInfo bufferInfo3 = this.C;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j9 = this.f16993z0;
                    if (j9 != -9223372036854775807L) {
                        bufferInfo3.presentationTimeUs = j9;
                    }
                }
            }
            this.f16973n0 = G0(this.C.presentationTimeUs);
            long j10 = this.A0;
            long j11 = this.C.presentationTimeUs;
            this.f16974o0 = j10 == j11;
            r1(j11);
        }
        if (this.f16962c0 && this.f16989x0) {
            try {
                l lVar = this.P;
                ByteBuffer byteBuffer2 = this.f16972m0;
                int i7 = this.f16971l0;
                MediaCodec.BufferInfo bufferInfo4 = this.C;
                z6 = false;
                try {
                    V0 = V0(j7, j8, lVar, byteBuffer2, i7, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f16973n0, this.f16974o0, this.H);
                } catch (IllegalStateException unused2) {
                    U0();
                    if (this.C0) {
                        Z0();
                    }
                    return z6;
                }
            } catch (IllegalStateException unused3) {
                z6 = false;
            }
        } else {
            z6 = false;
            l lVar2 = this.P;
            ByteBuffer byteBuffer3 = this.f16972m0;
            int i8 = this.f16971l0;
            MediaCodec.BufferInfo bufferInfo5 = this.C;
            V0 = V0(j7, j8, lVar2, byteBuffer3, i8, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f16973n0, this.f16974o0, this.H);
        }
        if (V0) {
            R0(this.C.presentationTimeUs);
            boolean z7 = (this.C.flags & 4) != 0;
            e1();
            if (!z7) {
                return true;
            }
            U0();
        }
        return z6;
    }

    private boolean m0(n nVar, s1 s1Var, v0.o oVar, v0.o oVar2) {
        v0.h0 y02;
        if (oVar == oVar2) {
            return false;
        }
        if (oVar2 == null || oVar == null || m0.f19752a < 23) {
            return true;
        }
        UUID uuid = r0.j.f20687e;
        if (uuid.equals(oVar.d()) || uuid.equals(oVar2.d()) || (y02 = y0(oVar2)) == null) {
            return true;
        }
        return !nVar.f16955g && (y02.f22660c ? false : oVar2.f(s1Var.f20956q));
    }

    private boolean n0() {
        int i7;
        if (this.P == null || (i7 = this.f16983u0) == 2 || this.B0) {
            return false;
        }
        if (i7 == 0 && l1()) {
            j0();
        }
        if (this.f16970k0 < 0) {
            int o7 = this.P.o();
            this.f16970k0 = o7;
            if (o7 < 0) {
                return false;
            }
            this.f16988x.f22411h = this.P.i(o7);
            this.f16988x.h();
        }
        if (this.f16983u0 == 1) {
            if (!this.f16967h0) {
                this.f16989x0 = true;
                this.P.k(this.f16970k0, 0, 0, 0L, 4);
                d1();
            }
            this.f16983u0 = 2;
            return false;
        }
        if (this.f16965f0) {
            this.f16965f0 = false;
            ByteBuffer byteBuffer = this.f16988x.f22411h;
            byte[] bArr = K0;
            byteBuffer.put(bArr);
            this.P.k(this.f16970k0, 0, bArr.length, 0L, 0);
            d1();
            this.f16987w0 = true;
            return true;
        }
        if (this.f16981t0 == 1) {
            for (int i8 = 0; i8 < this.Q.f20958s.size(); i8++) {
                this.f16988x.f22411h.put(this.Q.f20958s.get(i8));
            }
            this.f16981t0 = 2;
        }
        int position = this.f16988x.f22411h.position();
        t1 F = F();
        try {
            int R = R(F, this.f16988x, 0);
            if (k()) {
                this.A0 = this.f16993z0;
            }
            if (R == -3) {
                return false;
            }
            if (R == -5) {
                if (this.f16981t0 == 2) {
                    this.f16988x.h();
                    this.f16981t0 = 1;
                }
                P0(F);
                return true;
            }
            if (this.f16988x.m()) {
                if (this.f16981t0 == 2) {
                    this.f16988x.h();
                    this.f16981t0 = 1;
                }
                this.B0 = true;
                if (!this.f16987w0) {
                    U0();
                    return false;
                }
                try {
                    if (!this.f16967h0) {
                        this.f16989x0 = true;
                        this.P.k(this.f16970k0, 0, 0, 0L, 4);
                        d1();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e7) {
                    throw C(e7, this.G, m0.U(e7.getErrorCode()));
                }
            }
            if (!this.f16987w0 && !this.f16988x.o()) {
                this.f16988x.h();
                if (this.f16981t0 == 2) {
                    this.f16981t0 = 1;
                }
                return true;
            }
            boolean t6 = this.f16988x.t();
            if (t6) {
                this.f16988x.f22410g.b(position);
            }
            if (this.Y && !t6) {
                o2.w.b(this.f16988x.f22411h);
                if (this.f16988x.f22411h.position() == 0) {
                    return true;
                }
                this.Y = false;
            }
            u0.g gVar = this.f16988x;
            long j7 = gVar.f22413j;
            i iVar = this.f16968i0;
            if (iVar != null) {
                j7 = iVar.d(this.G, gVar);
                this.f16993z0 = Math.max(this.f16993z0, this.f16968i0.b(this.G));
            }
            long j8 = j7;
            if (this.f16988x.l()) {
                this.B.add(Long.valueOf(j8));
            }
            if (this.D0) {
                this.A.a(j8, this.G);
                this.D0 = false;
            }
            this.f16993z0 = Math.max(this.f16993z0, j8);
            this.f16988x.s();
            if (this.f16988x.k()) {
                C0(this.f16988x);
            }
            T0(this.f16988x);
            try {
                if (t6) {
                    this.P.f(this.f16970k0, 0, this.f16988x.f22410g, j8, 0);
                } else {
                    this.P.k(this.f16970k0, 0, this.f16988x.f22411h.limit(), j8, 0);
                }
                d1();
                this.f16987w0 = true;
                this.f16981t0 = 0;
                this.G0.f22400c++;
                return true;
            } catch (MediaCodec.CryptoException e8) {
                throw C(e8, this.G, m0.U(e8.getErrorCode()));
            }
        } catch (g.a e9) {
            M0(e9);
            X0(0);
            o0();
            return true;
        }
    }

    private void o0() {
        try {
            this.P.flush();
        } finally {
            b1();
        }
    }

    protected static boolean o1(s1 s1Var) {
        int i7 = s1Var.J;
        return i7 == 0 || i7 == 2;
    }

    private boolean p1(s1 s1Var) {
        if (m0.f19752a >= 23 && this.P != null && this.f16985v0 != 3 && getState() != 0) {
            float v02 = v0(this.O, s1Var, I());
            float f7 = this.T;
            if (f7 == v02) {
                return true;
            }
            if (v02 == -1.0f) {
                j0();
                return false;
            }
            if (f7 == -1.0f && v02 <= this.f16984v) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", v02);
            this.P.l(bundle);
            this.T = v02;
        }
        return true;
    }

    private void q1() {
        try {
            this.K.setMediaDrmSession(y0(this.J).f22659b);
            f1(this.J);
            this.f16983u0 = 0;
            this.f16985v0 = 0;
        } catch (MediaCryptoException e7) {
            throw C(e7, this.G, 6006);
        }
    }

    private List<n> r0(boolean z6) {
        List<n> x02 = x0(this.f16980t, this.G, z6);
        if (x02.isEmpty() && z6) {
            x02 = x0(this.f16980t, this.G, false);
            if (!x02.isEmpty()) {
                o2.r.i("MediaCodecRenderer", "Drm session requires secure decoder for " + this.G.f20956q + ", but no secure decoder available. Trying to proceed with " + x02 + ".");
            }
        }
        return x02;
    }

    private v0.h0 y0(v0.o oVar) {
        u0.b h7 = oVar.h();
        if (h7 == null || (h7 instanceof v0.h0)) {
            return (v0.h0) h7;
        }
        throw C(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + h7), this.G, 6001);
    }

    @Override // r0.f, r0.e3
    public void A(float f7, float f8) {
        this.N = f7;
        this.O = f8;
        p1(this.Q);
    }

    protected final long A0() {
        return this.I0;
    }

    protected float B0() {
        return this.N;
    }

    protected void C0(u0.g gVar) {
    }

    @Override // r0.f
    protected void K() {
        this.G = null;
        this.H0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        this.J0 = 0;
        q0();
    }

    protected final void K0() {
        s1 s1Var;
        if (this.P != null || this.f16975p0 || (s1Var = this.G) == null) {
            return;
        }
        if (this.J == null && m1(s1Var)) {
            E0(this.G);
            return;
        }
        f1(this.J);
        String str = this.G.f20956q;
        v0.o oVar = this.I;
        if (oVar != null) {
            if (this.K == null) {
                v0.h0 y02 = y0(oVar);
                if (y02 != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(y02.f22658a, y02.f22659b);
                        this.K = mediaCrypto;
                        this.L = !y02.f22660c && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e7) {
                        throw C(e7, this.G, 6006);
                    }
                } else if (this.I.g() == null) {
                    return;
                }
            }
            if (v0.h0.f22657d) {
                int state = this.I.getState();
                if (state == 1) {
                    o.a aVar = (o.a) o2.a.e(this.I.g());
                    throw C(aVar, this.G, aVar.f22690f);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            L0(this.K, this.L);
        } catch (b e8) {
            throw C(e8, this.G, 4001);
        }
    }

    @Override // r0.f
    protected void L(boolean z6, boolean z7) {
        this.G0 = new u0.e();
    }

    @Override // r0.f
    protected void M(long j7, boolean z6) {
        this.B0 = false;
        this.C0 = false;
        this.E0 = false;
        if (this.f16975p0) {
            this.f16992z.h();
            this.f16990y.h();
            this.f16976q0 = false;
        } else {
            p0();
        }
        if (this.A.k() > 0) {
            this.D0 = true;
        }
        this.A.c();
        int i7 = this.J0;
        if (i7 != 0) {
            this.I0 = this.E[i7 - 1];
            this.H0 = this.D[i7 - 1];
            this.J0 = 0;
        }
    }

    protected abstract void M0(Exception exc);

    @Override // r0.f
    protected void N() {
        try {
            h0();
            Z0();
        } finally {
            i1(null);
        }
    }

    protected abstract void N0(String str, l.a aVar, long j7, long j8);

    @Override // r0.f
    protected void O() {
    }

    protected abstract void O0(String str);

    @Override // r0.f
    protected void P() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        if (k0() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
    
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b2, code lost:
    
        if (k0() == false) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected u0.i P0(t1 t1Var) {
        int i7;
        boolean z6 = true;
        this.D0 = true;
        s1 s1Var = (s1) o2.a.e(t1Var.f21040b);
        if (s1Var.f20956q == null) {
            throw C(new IllegalArgumentException(), s1Var, 4005);
        }
        i1(t1Var.f21039a);
        this.G = s1Var;
        if (this.f16975p0) {
            this.f16977r0 = true;
            return null;
        }
        l lVar = this.P;
        if (lVar == null) {
            this.U = null;
            K0();
            return null;
        }
        n nVar = this.W;
        s1 s1Var2 = this.Q;
        if (m0(nVar, s1Var, this.I, this.J)) {
            j0();
            return new u0.i(nVar.f16949a, s1Var2, s1Var, 0, 128);
        }
        boolean z7 = this.J != this.I;
        o2.a.f(!z7 || m0.f19752a >= 23);
        u0.i W = W(nVar, s1Var2, s1Var);
        int i8 = W.f22424d;
        if (i8 != 0) {
            if (i8 == 1) {
                if (p1(s1Var)) {
                    this.Q = s1Var;
                    if (!z7) {
                    }
                }
                i7 = 16;
            } else if (i8 == 2) {
                if (p1(s1Var)) {
                    this.f16979s0 = true;
                    this.f16981t0 = 1;
                    int i9 = this.X;
                    if (i9 != 2 && (i9 != 1 || s1Var.f20961v != s1Var2.f20961v || s1Var.f20962w != s1Var2.f20962w)) {
                        z6 = false;
                    }
                    this.f16965f0 = z6;
                    this.Q = s1Var;
                    if (z7) {
                    }
                }
                i7 = 16;
            } else {
                if (i8 != 3) {
                    throw new IllegalStateException();
                }
                if (p1(s1Var)) {
                    this.Q = s1Var;
                    if (z7) {
                    }
                }
                i7 = 16;
            }
            return (W.f22424d != 0 || (this.P == lVar && this.f16985v0 != 3)) ? W : new u0.i(nVar.f16949a, s1Var2, s1Var, 0, i7);
        }
        j0();
        i7 = 0;
        if (W.f22424d != 0) {
        }
    }

    @Override // r0.f
    protected void Q(s1[] s1VarArr, long j7, long j8) {
        if (this.I0 == -9223372036854775807L) {
            o2.a.f(this.H0 == -9223372036854775807L);
            this.H0 = j7;
            this.I0 = j8;
            return;
        }
        int i7 = this.J0;
        if (i7 == this.E.length) {
            o2.r.i("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.E[this.J0 - 1]);
        } else {
            this.J0 = i7 + 1;
        }
        long[] jArr = this.D;
        int i8 = this.J0;
        jArr[i8 - 1] = j7;
        this.E[i8 - 1] = j8;
        this.F[i8 - 1] = this.f16993z0;
    }

    protected abstract void Q0(s1 s1Var, MediaFormat mediaFormat);

    protected void R0(long j7) {
        while (true) {
            int i7 = this.J0;
            if (i7 == 0 || j7 < this.F[0]) {
                return;
            }
            long[] jArr = this.D;
            this.H0 = jArr[0];
            this.I0 = this.E[0];
            int i8 = i7 - 1;
            this.J0 = i8;
            System.arraycopy(jArr, 1, jArr, 0, i8);
            long[] jArr2 = this.E;
            System.arraycopy(jArr2, 1, jArr2, 0, this.J0);
            long[] jArr3 = this.F;
            System.arraycopy(jArr3, 1, jArr3, 0, this.J0);
            S0();
        }
    }

    protected void S0() {
    }

    protected abstract void T0(u0.g gVar);

    protected abstract boolean V0(long j7, long j8, l lVar, ByteBuffer byteBuffer, int i7, int i8, int i9, long j9, boolean z6, boolean z7, s1 s1Var);

    protected abstract u0.i W(n nVar, s1 s1Var, s1 s1Var2);

    /* JADX WARN: Multi-variable type inference failed */
    protected void Z0() {
        try {
            l lVar = this.P;
            if (lVar != null) {
                lVar.a();
                this.G0.f22399b++;
                O0(this.W.f16949a);
            }
            this.P = null;
            try {
                MediaCrypto mediaCrypto = this.K;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.P = null;
            try {
                MediaCrypto mediaCrypto2 = this.K;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    protected void a1() {
    }

    @Override // r0.g3
    public final int b(s1 s1Var) {
        try {
            return n1(this.f16980t, s1Var);
        } catch (v.c e7) {
            throw C(e7, s1Var, 4002);
        }
    }

    protected void b1() {
        d1();
        e1();
        this.f16969j0 = -9223372036854775807L;
        this.f16989x0 = false;
        this.f16987w0 = false;
        this.f16965f0 = false;
        this.f16966g0 = false;
        this.f16973n0 = false;
        this.f16974o0 = false;
        this.B.clear();
        this.f16993z0 = -9223372036854775807L;
        this.A0 = -9223372036854775807L;
        i iVar = this.f16968i0;
        if (iVar != null) {
            iVar.c();
        }
        this.f16983u0 = 0;
        this.f16985v0 = 0;
        this.f16981t0 = this.f16979s0 ? 1 : 0;
    }

    @Override // r0.e3
    public boolean c() {
        return this.C0;
    }

    protected void c1() {
        b1();
        this.F0 = null;
        this.f16968i0 = null;
        this.U = null;
        this.W = null;
        this.Q = null;
        this.R = null;
        this.S = false;
        this.f16991y0 = false;
        this.T = -1.0f;
        this.X = 0;
        this.Y = false;
        this.Z = false;
        this.f16960a0 = false;
        this.f16961b0 = false;
        this.f16962c0 = false;
        this.f16963d0 = false;
        this.f16964e0 = false;
        this.f16967h0 = false;
        this.f16979s0 = false;
        this.f16981t0 = 0;
        this.L = false;
    }

    protected m g0(Throwable th, n nVar) {
        return new m(th, nVar);
    }

    protected final void g1() {
        this.E0 = true;
    }

    protected final void h1(r0.r rVar) {
        this.F0 = rVar;
    }

    @Override // r0.e3
    public boolean i() {
        return this.G != null && (J() || D0() || (this.f16969j0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f16969j0));
    }

    protected boolean k1(n nVar) {
        return true;
    }

    protected boolean l1() {
        return false;
    }

    protected boolean m1(s1 s1Var) {
        return false;
    }

    @Override // r0.f, r0.g3
    public final int n() {
        return 8;
    }

    protected abstract int n1(q qVar, s1 s1Var);

    @Override // r0.e3
    public void o(long j7, long j8) {
        boolean z6 = false;
        if (this.E0) {
            this.E0 = false;
            U0();
        }
        r0.r rVar = this.F0;
        if (rVar != null) {
            this.F0 = null;
            throw rVar;
        }
        try {
            if (this.C0) {
                a1();
                return;
            }
            if (this.G != null || X0(2)) {
                K0();
                if (this.f16975p0) {
                    j0.a("bypassRender");
                    while (V(j7, j8)) {
                    }
                } else {
                    if (this.P == null) {
                        this.G0.f22401d += T(j7);
                        X0(1);
                        this.G0.c();
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    j0.a("drainAndFeed");
                    while (l0(j7, j8) && j1(elapsedRealtime)) {
                    }
                    while (n0() && j1(elapsedRealtime)) {
                    }
                }
                j0.c();
                this.G0.c();
            }
        } catch (IllegalStateException e7) {
            if (!H0(e7)) {
                throw e7;
            }
            M0(e7);
            if (m0.f19752a >= 21 && J0(e7)) {
                z6 = true;
            }
            if (z6) {
                Z0();
            }
            throw D(g0(e7, t0()), this.G, z6, 4003);
        }
    }

    protected final boolean p0() {
        boolean q02 = q0();
        if (q02) {
            K0();
        }
        return q02;
    }

    protected boolean q0() {
        if (this.P == null) {
            return false;
        }
        int i7 = this.f16985v0;
        if (i7 == 3 || this.Z || ((this.f16960a0 && !this.f16991y0) || (this.f16961b0 && this.f16989x0))) {
            Z0();
            return true;
        }
        if (i7 == 2) {
            int i8 = m0.f19752a;
            o2.a.f(i8 >= 23);
            if (i8 >= 23) {
                try {
                    q1();
                } catch (r0.r e7) {
                    o2.r.j("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e7);
                    Z0();
                    return true;
                }
            }
        }
        o0();
        return false;
    }

    protected final void r1(long j7) {
        boolean z6;
        s1 i7 = this.A.i(j7);
        if (i7 == null && this.S) {
            i7 = this.A.h();
        }
        if (i7 != null) {
            this.H = i7;
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6 || (this.S && this.H != null)) {
            Q0(this.H, this.R);
            this.S = false;
        }
    }

    protected final l s0() {
        return this.P;
    }

    protected final n t0() {
        return this.W;
    }

    protected boolean u0() {
        return false;
    }

    protected abstract float v0(float f7, s1 s1Var, s1[] s1VarArr);

    protected final MediaFormat w0() {
        return this.R;
    }

    protected abstract List<n> x0(q qVar, s1 s1Var, boolean z6);

    protected abstract l.a z0(n nVar, s1 s1Var, MediaCrypto mediaCrypto, float f7);
}
