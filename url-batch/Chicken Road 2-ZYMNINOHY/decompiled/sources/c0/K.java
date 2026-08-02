package c0;

import T.C0086d;
import T.C0087e;
import T.C0096n;
import T.C0097o;
import W.AbstractC0108a;
import W.AbstractC0110c;
import a.AbstractC0124a;
import a0.AbstractC0135a;
import a0.C0136b;
import a0.C0137c;
import a0.C0138d;
import a0.S;
import a0.SurfaceHolderCallbackC0125A;
import a0.m0;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.LoudnessCodecController;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.startapp.motiondetector.SignalProcessor;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import v2.a0;
import y0.AbstractC1569a;

/* loaded from: classes.dex */
public final class K extends j0.r implements S {

    /* renamed from: O0, reason: collision with root package name */
    public final Context f5501O0;

    /* renamed from: P0, reason: collision with root package name */
    public final q f5502P0;

    /* renamed from: Q0, reason: collision with root package name */
    public final I f5503Q0;

    /* renamed from: R0, reason: collision with root package name */
    public final B1.j f5504R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f5505S0;

    /* renamed from: T0, reason: collision with root package name */
    public boolean f5506T0;
    public C0097o U0;

    /* renamed from: V0, reason: collision with root package name */
    public C0097o f5507V0;

    /* renamed from: W0, reason: collision with root package name */
    public long f5508W0;

    /* renamed from: X0, reason: collision with root package name */
    public boolean f5509X0;

    /* renamed from: Y0, reason: collision with root package name */
    public boolean f5510Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public boolean f5511Z0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f5512a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f5513b1;

    /* renamed from: c1, reason: collision with root package name */
    public boolean f5514c1;

    /* renamed from: d1, reason: collision with root package name */
    public long f5515d1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(Context context, j0.k kVar, Handler handler, SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A, I i4) {
        super(context.getApplicationContext(), 1, kVar, 44100.0f);
        B1.j jVar = Build.VERSION.SDK_INT >= 35 ? new B1.j(20) : null;
        this.f5501O0 = context.getApplicationContext();
        this.f5503Q0 = i4;
        this.f5504R0 = jVar;
        this.f5513b1 = -1000;
        this.f5502P0 = new q(handler, surfaceHolderCallbackC0125A, 0);
        this.f5515d1 = -9223372036854775807L;
        i4.n = new t1.h(28, this);
    }

    public final int D0(C0097o c0097o) {
        C0273f a3;
        I i4 = this.f5503Q0;
        if (i4.f5473X) {
            a3 = C0273f.f5551d;
        } else {
            C0278k b4 = i4.f5493r.b(i4.g(c0097o));
            S0.f fVar = new S0.f();
            fVar.f2411a = b4.f5569a;
            fVar.f2412b = b4.f5570b;
            fVar.f2413c = b4.f5571c;
            a3 = fVar.a();
        }
        if (!a3.f5552a) {
            return 0;
        }
        int i5 = a3.f5553b ? 1536 : 512;
        return a3.f5554c ? i5 | 2048 : i5;
    }

    public final void E0() {
        long j4;
        long j5;
        long j6;
        m();
        I i4 = this.f5503Q0;
        B1.j jVar = i4.f5478b;
        if (!i4.n() || i4.f5456F) {
            j4 = Long.MIN_VALUE;
            j5 = Long.MIN_VALUE;
        } else {
            long min = Math.min(i4.f5495t.a(), W.J.S(((C0281n) i4.f5491p.f5441e).f5585b, i4.j()));
            ArrayDeque arrayDeque = i4.f5485h;
            while (!arrayDeque.isEmpty() && min >= ((G) arrayDeque.getFirst()).f5445c) {
                i4.f5497w = (G) arrayDeque.remove();
            }
            G g4 = i4.f5497w;
            long j7 = min - g4.f5445c;
            long z = W.J.z(j7, g4.f5443a.f2664a);
            if (arrayDeque.isEmpty()) {
                U.t tVar = (U.t) jVar.f203d;
                if (tVar.a()) {
                    if (tVar.n >= 1024) {
                        long j8 = tVar.f3111m;
                        tVar.f3108j.getClass();
                        long o = j8 - (r10.f3093i.o() * (r10.f3094j * r10.f3086b));
                        int i5 = tVar.f3106h.f3055a;
                        int i6 = tVar.f3105g.f3055a;
                        if (i5 == i6) {
                            j7 = W.J.U(j7, o, tVar.n, RoundingMode.DOWN);
                        } else {
                            j4 = Long.MIN_VALUE;
                            j7 = W.J.U(j7, o * i5, tVar.n * i6, RoundingMode.DOWN);
                        }
                    } else {
                        j4 = Long.MIN_VALUE;
                        j7 = (long) (tVar.f3101c * j7);
                    }
                    G g5 = i4.f5497w;
                    j6 = g5.f5444b + j7;
                    g5.f5446d = j7 - z;
                }
                j4 = Long.MIN_VALUE;
                G g52 = i4.f5497w;
                j6 = g52.f5444b + j7;
                g52.f5446d = j7 - z;
            } else {
                j4 = Long.MIN_VALUE;
                G g6 = i4.f5497w;
                j6 = g6.f5444b + z + g6.f5446d;
            }
            long j9 = ((M) jVar.f202c).f5527q;
            j5 = W.J.S(((C0281n) i4.f5491p.f5441e).f5585b, j9) + j6;
            long j10 = i4.f5475Z;
            if (j9 > j10) {
                long S4 = W.J.S(((C0281n) i4.f5491p.f5441e).f5585b, j9 - j10);
                i4.f5475Z = j9;
                i4.f5477a0 += S4;
                if (i4.f5479b0 == null) {
                    i4.f5479b0 = new Handler(Looper.myLooper());
                }
                i4.f5479b0.removeCallbacksAndMessages(null);
                i4.f5479b0.postDelayed(new R1.n(12, i4), 100L);
            }
        }
        if (j5 != j4) {
            if (!this.f5509X0) {
                j5 = Math.max(this.f5508W0, j5);
            }
            this.f5508W0 = j5;
            this.f5509X0 = false;
        }
    }

    @Override // j0.r
    public final C0138d I(j0.o oVar, C0097o c0097o, C0097o c0097o2) {
        C0138d b4 = oVar.b(c0097o, c0097o2);
        int i4 = b4.f4084e;
        if (this.f13803H == null && y0(c0097o2)) {
            i4 |= 32768;
        }
        "OMX.google.raw.decoder".equals(oVar.f13766a);
        if (c0097o2.o > this.f5505S0) {
            i4 |= 64;
        }
        int i5 = i4;
        return new C0138d(oVar.f13766a, c0097o, c0097o2, i5 != 0 ? 0 : b4.f4083d, i5);
    }

    @Override // j0.r
    public final float P(float f4, C0097o c0097o, C0097o[] c0097oArr) {
        int i4 = -1;
        for (C0097o c0097o2 : c0097oArr) {
            int i5 = c0097o2.f2847G;
            if (i5 != -1) {
                i4 = Math.max(i4, i5);
            }
        }
        if (i4 == -1) {
            return -1.0f;
        }
        return i4 * f4;
    }

    @Override // j0.r
    public final ArrayList Q(j0.j jVar, C0097o c0097o, boolean z) {
        a0 g4;
        if (c0097o.n == null) {
            g4 = a0.f15605e;
        } else {
            if (this.f5503Q0.h(c0097o) != 0) {
                List e4 = j0.w.e("audio/raw", false, false);
                j0.o oVar = e4.isEmpty() ? null : (j0.o) e4.get(0);
                if (oVar != null) {
                    g4 = v2.I.o(oVar);
                }
            }
            g4 = j0.w.g(jVar, c0097o, z, false);
        }
        HashMap hashMap = j0.w.f13856a;
        ArrayList arrayList = new ArrayList(g4);
        Collections.sort(arrayList, new j0.s(new R1.k(this.f5501O0, 6, c0097o)));
        return arrayList;
    }

    @Override // j0.r
    public final long R(long j4, long j5) {
        long U4;
        I i4 = this.f5503Q0;
        boolean z = i4.l() && this.f5515d1 != -9223372036854775807L;
        if (this.f5514c1) {
            if (!i4.n()) {
                U4 = -9223372036854775807L;
            } else if (F.a(i4.f5491p)) {
                U4 = W.J.S(((C0281n) i4.f5491p.f5441e).f5585b, i4.f5495t.f5628a.getBufferSizeInFrames());
            } else {
                long bufferSizeInFrames = i4.f5495t.f5628a.getBufferSizeInFrames();
                int m4 = AbstractC1569a.m(((C0281n) i4.f5491p.f5441e).f5584a);
                AbstractC0124a.t(m4 != -2147483647);
                U4 = W.J.U(bufferSizeInFrames, 1000000L, m4, RoundingMode.DOWN);
            }
            if (this.f5512a1 && z && U4 != -9223372036854775807L) {
                float min = Math.min(U4, this.f5515d1 - j4);
                T.I i5 = i4.f5498x;
                return Math.max(10000L, (long) ((min / (i5 != null ? i5.f2664a : 1.0f)) / 2.0f));
            }
        } else if (z || this.f13846s0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // j0.r
    public final L1.h T(j0.o oVar, C0097o c0097o, MediaCrypto mediaCrypto, float f4) {
        C0097o[] c0097oArr = this.f4046j;
        c0097oArr.getClass();
        String str = oVar.f13766a;
        "OMX.google.raw.decoder".equals(str);
        int i4 = c0097o.o;
        String str2 = c0097o.n;
        int i5 = c0097o.f2846F;
        if (c0097oArr.length != 1) {
            for (C0097o c0097o2 : c0097oArr) {
                if (oVar.b(c0097o, c0097o2).f4083d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    i4 = Math.max(i4, c0097o2.o);
                }
            }
        }
        this.f5505S0 = i4;
        this.f5506T0 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str3 = oVar.f13768c;
        int i6 = this.f5505S0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        mediaFormat.setInteger("channel-count", i5);
        int i7 = c0097o.f2847G;
        mediaFormat.setInteger("sample-rate", i7);
        AbstractC0108a.r(mediaFormat, c0097o.f2870q);
        AbstractC0108a.n(mediaFormat, "max-input-size", i6);
        mediaFormat.setInteger("priority", 0);
        if (f4 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f4);
        }
        if ("audio/ac4".equals(str2)) {
            Pair c4 = AbstractC0110c.c(c0097o);
            if (c4 != null) {
                AbstractC0108a.n(mediaFormat, "profile", ((Integer) c4.first).intValue());
                AbstractC0108a.n(mediaFormat, "level", ((Integer) c4.second).intValue());
            }
            if (Build.VERSION.SDK_INT <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        int i8 = Build.VERSION.SDK_INT;
        C0096n c0096n = new C0096n();
        c0096n.f2831m = T.F.n("audio/raw");
        c0096n.f2810E = i5;
        c0096n.f2811F = i7;
        c0096n.f2812G = 4;
        if (this.f5503Q0.h(new C0097o(c0096n)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i8 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i8 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f5513b1));
        }
        G(mediaFormat);
        this.f5507V0 = (!"audio/raw".equals(oVar.f13767b) || "audio/raw".equals(str2)) ? null : c0097o;
        return new L1.h(oVar, mediaFormat, c0097o, null, mediaCrypto, this.f5504R0);
    }

    @Override // j0.r
    public final void U(Z.f fVar) {
        C0097o c0097o;
        F f4;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 29 || (c0097o = fVar.f3779c) == null || !Objects.equals(c0097o.n, "audio/opus") || !this.f13833g0) {
            return;
        }
        ByteBuffer byteBuffer = fVar.f3784h;
        byteBuffer.getClass();
        C0097o c0097o2 = fVar.f3779c;
        c0097o2.getClass();
        int i5 = c0097o2.f2849I;
        if (byteBuffer.remaining() == 8) {
            int i6 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / SignalProcessor.ONE_SECOND_NANOS);
            I i7 = this.f5503Q0;
            z zVar = i7.f5495t;
            if (zVar == null || !zVar.c() || (f4 = i7.f5491p) == null || !((C0281n) f4.f5441e).f5594k) {
                return;
            }
            z zVar2 = i7.f5495t;
            if (i4 < 29) {
                zVar2.getClass();
            } else {
                zVar2.f5628a.setOffloadDelayPadding(i5, i6);
            }
        }
    }

    @Override // a0.S
    public final long a() {
        if (this.f4044h == 2) {
            E0();
        }
        return this.f5508W0;
    }

    @Override // j0.r
    public final void a0(Exception exc) {
        AbstractC0108a.f("MediaCodecAudioRenderer", "Audio codec error", exc);
        q qVar = this.f5502P0;
        Handler handler = qVar.f5600a;
        if (handler != null) {
            handler.post(new RunnableC0282o(qVar, exc, 0));
        }
    }

    @Override // a0.S
    public final boolean b() {
        boolean z = this.f5511Z0;
        this.f5511Z0 = false;
        return z;
    }

    @Override // j0.r
    public final void b0(long j4, long j5, String str) {
        q qVar = this.f5502P0;
        Handler handler = qVar.f5600a;
        if (handler != null) {
            handler.post(new RunnableC0282o(qVar, str, j4, j5));
        }
    }

    @Override // j0.r, a0.AbstractC0135a, a0.i0
    public final void c(int i4, Object obj) {
        B1.j jVar;
        I i5 = this.f5503Q0;
        if (i4 == 2) {
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            if (i5.f5458H != floatValue) {
                i5.f5458H = floatValue;
                if (i5.n()) {
                    i5.f5495t.f5628a.setVolume(i5.f5458H);
                    return;
                }
                return;
            }
            return;
        }
        if (i4 == 3) {
            C0086d c0086d = (C0086d) obj;
            c0086d.getClass();
            if (i5.f5496u.equals(c0086d)) {
                return;
            }
            i5.f5496u = c0086d;
            if (i5.f5471V) {
                return;
            }
            i5.r();
            return;
        }
        if (i4 == 6) {
            C0087e c0087e = (C0087e) obj;
            c0087e.getClass();
            if (i5.f5468S.equals(c0087e)) {
                return;
            }
            if (i5.f5495t != null) {
                i5.f5468S.getClass();
            }
            i5.f5468S = c0087e;
            return;
        }
        if (i4 == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            i5.f5469T = audioDeviceInfo;
            z zVar = i5.f5495t;
            if (zVar != null) {
                zVar.f5628a.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i4 == 16) {
            obj.getClass();
            this.f5513b1 = ((Integer) obj).intValue();
            j0.l lVar = this.f13814N;
            if (lVar != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f5513b1));
                lVar.b(bundle);
                return;
            }
            return;
        }
        if (i4 == 9) {
            obj.getClass();
            i5.f5499y = ((Boolean) obj).booleanValue();
            G g4 = new G(i5.v() ? T.I.f2663d : i5.f5498x, -9223372036854775807L, -9223372036854775807L);
            if (i5.n()) {
                i5.v = g4;
                return;
            } else {
                i5.f5497w = g4;
                return;
            }
        }
        if (i4 == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (i5.f5467R) {
                if (i5.f5466Q == intValue) {
                    i5.f5467R = false;
                }
                if (Build.VERSION.SDK_INT >= 35 || (jVar = this.f5504R0) == null) {
                    return;
                }
                jVar.C(intValue);
                return;
            }
            if (i5.f5466Q != intValue) {
                i5.f5466Q = intValue;
                i5.f5465P = intValue != 0;
                i5.r();
            }
            if (Build.VERSION.SDK_INT >= 35) {
                return;
            } else {
                return;
            }
        }
        if (i4 == 19) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            AtomicInteger atomicInteger = I.f5450c0;
            if (intValue2 == 0 || intValue2 == -1) {
                intValue2 = -1;
            }
            if (i5.f5470U == intValue2) {
                return;
            }
            i5.f5470U = intValue2;
            i5.r();
            return;
        }
        if (i4 != 20) {
            super.c(i4, obj);
            return;
        }
        obj.getClass();
        C0267A c0267a = (C0267A) obj;
        if (c0267a.equals(i5.f5493r)) {
            return;
        }
        i5.f5493r.d();
        i5.f5493r = c0267a;
        D d4 = i5.f5494s;
        if (d4 != null) {
            c0267a.f();
            if (c0267a.f5402e == null) {
                W.n nVar = new W.n(Thread.currentThread());
                c0267a.f5402e = nVar;
                nVar.f3329i = false;
            }
            c0267a.f5402e.a(d4);
        }
        i5.r();
    }

    @Override // j0.r
    public final void c0(C0136b c0136b) {
        q qVar = this.f5502P0;
        Handler handler = qVar.f5600a;
        if (handler != null) {
            handler.post(new R1.e(qVar, 19, c0136b));
        }
    }

    @Override // a0.S
    public final void d(T.I i4) {
        I i5 = this.f5503Q0;
        i5.getClass();
        i5.f5498x = new T.I(W.J.i(i4.f2664a, 0.1f, 8.0f), W.J.i(i4.f2665b, 0.1f, 8.0f));
        if (i5.v()) {
            i5.t();
            return;
        }
        G g4 = new G(i4, -9223372036854775807L, -9223372036854775807L);
        if (i5.n()) {
            i5.v = g4;
        } else {
            i5.f5497w = g4;
        }
    }

    @Override // j0.r
    public final void d0(String str) {
        q qVar = this.f5502P0;
        Handler handler = qVar.f5600a;
        if (handler != null) {
            handler.post(new RunnableC0282o(qVar, str, 5));
        }
    }

    @Override // a0.S
    public final T.I e() {
        return this.f5503Q0.f5498x;
    }

    @Override // j0.r
    public final C0138d e0(l2.e eVar) {
        C0097o c0097o = (C0097o) eVar.f14271c;
        c0097o.getClass();
        this.U0 = c0097o;
        C0138d e02 = super.e0(eVar);
        q qVar = this.f5502P0;
        Handler handler = qVar.f5600a;
        if (handler != null) {
            handler.post(new RunnableC0282o(qVar, c0097o, e02));
        }
        return e02;
    }

    @Override // j0.r
    public final void f0(C0097o c0097o, MediaFormat mediaFormat) {
        C0097o c0097o2 = this.f5507V0;
        boolean z = true;
        int[] iArr = null;
        if (c0097o2 != null) {
            c0097o = c0097o2;
        } else if (this.f13814N != null) {
            mediaFormat.getClass();
            int integer = "audio/raw".equals(c0097o.n) ? c0097o.f2848H : mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : mediaFormat.containsKey("v-bits-per-sample") ? W.J.B(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            C0096n c0096n = new C0096n();
            c0096n.f2831m = T.F.n("audio/raw");
            c0096n.f2812G = integer;
            c0096n.f2813H = c0097o.f2849I;
            c0096n.f2814I = c0097o.f2850J;
            c0096n.f2829k = c0097o.f2867l;
            c0096n.f2819a = c0097o.f2856a;
            c0096n.f2820b = c0097o.f2857b;
            c0096n.f2821c = v2.I.k(c0097o.f2858c);
            c0096n.f2822d = c0097o.f2859d;
            c0096n.f2823e = c0097o.f2860e;
            c0096n.f2824f = c0097o.f2861f;
            c0096n.f2810E = mediaFormat.getInteger("channel-count");
            c0096n.f2811F = mediaFormat.getInteger("sample-rate");
            c0097o = new C0097o(c0096n);
            if (this.f5506T0) {
                int i4 = c0097o.f2846F;
                if (i4 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i4 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i4 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i4 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i4 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
        }
        try {
            int i5 = Build.VERSION.SDK_INT;
            I i6 = this.f5503Q0;
            if (i5 >= 29) {
                if (this.f13833g0) {
                    m0 m0Var = this.f4040d;
                    m0Var.getClass();
                    if (m0Var.f4195a != 0) {
                        m0 m0Var2 = this.f4040d;
                        m0Var2.getClass();
                        int i7 = m0Var2.f4195a;
                        i6.getClass();
                        if (i5 < 29) {
                            z = false;
                        }
                        AbstractC0124a.t(z);
                        i6.f5486i = i7;
                    }
                }
                i6.getClass();
                if (i5 < 29) {
                    z = false;
                }
                AbstractC0124a.t(z);
                i6.f5486i = 0;
            }
            i6.c(c0097o, iArr);
        } catch (r e4) {
            throw g(e4, e4.f5602a, false, 5001);
        }
    }

    @Override // j0.r
    public final void g0() {
        this.f5503Q0.getClass();
    }

    @Override // j0.r
    public final void i0() {
        this.f5503Q0.f5455E = true;
    }

    @Override // a0.AbstractC0135a
    public final String k() {
        return "MediaCodecAudioRenderer";
    }

    @Override // j0.r
    public final boolean l0(long j4, long j5, j0.l lVar, ByteBuffer byteBuffer, int i4, int i5, int i6, long j6, boolean z, boolean z4, C0097o c0097o) {
        int i7;
        int i8;
        byteBuffer.getClass();
        this.f5515d1 = -9223372036854775807L;
        if (this.f5507V0 != null && (i5 & 2) != 0) {
            lVar.getClass();
            lVar.f(i4);
            return true;
        }
        I i9 = this.f5503Q0;
        if (z) {
            if (lVar != null) {
                lVar.f(i4);
            }
            this.f13796D0.f4071f += i6;
            i9.f5455E = true;
            return true;
        }
        try {
            if (!i9.k(j6, byteBuffer, i6)) {
                this.f5515d1 = j6;
                return false;
            }
            if (lVar != null) {
                lVar.f(i4);
            }
            this.f13796D0.f4070e += i6;
            return true;
        } catch (s e4) {
            C0097o c0097o2 = this.U0;
            if (this.f13833g0) {
                m0 m0Var = this.f4040d;
                m0Var.getClass();
                if (m0Var.f4195a != 0) {
                    i8 = 5004;
                    throw g(e4, c0097o2, e4.f5603a, i8);
                }
            }
            i8 = 5001;
            throw g(e4, c0097o2, e4.f5603a, i8);
        } catch (u e5) {
            if (this.f13833g0) {
                m0 m0Var2 = this.f4040d;
                m0Var2.getClass();
                if (m0Var2.f4195a != 0) {
                    i7 = 5003;
                    throw g(e5, c0097o, e5.f5605b, i7);
                }
            }
            i7 = 5002;
            throw g(e5, c0097o, e5.f5605b, i7);
        }
    }

    @Override // a0.AbstractC0135a
    public final boolean m() {
        if (!this.f13846s0) {
            return false;
        }
        I i4 = this.f5503Q0;
        if (i4.n()) {
            return i4.L && !i4.l();
        }
        return true;
    }

    @Override // a0.AbstractC0135a
    public final boolean o() {
        return this.f5503Q0.l();
    }

    @Override // j0.r
    public final void o0() {
        try {
            I i4 = this.f5503Q0;
            if (!i4.L && i4.n() && i4.e()) {
                i4.p();
                i4.L = true;
            }
            long j4 = this.f13798E0.f13787e;
            if (j4 != -9223372036854775807L) {
                this.f5515d1 = j4;
            }
        } catch (u e4) {
            throw g(e4, e4.f5606c, e4.f5605b, this.f13833g0 ? 5003 : 5002);
        }
    }

    @Override // j0.r, a0.AbstractC0135a
    public final void p() {
        q qVar = this.f5502P0;
        this.f5510Y0 = true;
        this.U0 = null;
        this.f5515d1 = -9223372036854775807L;
        this.f5512a1 = false;
        try {
            this.f5503Q0.f();
            try {
                super.p();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.p();
                throw th;
            } finally {
            }
        }
    }

    @Override // a0.AbstractC0135a
    public final void q(boolean z, boolean z4) {
        C0137c c0137c = new C0137c();
        this.f13796D0 = c0137c;
        q qVar = this.f5502P0;
        Handler handler = qVar.f5600a;
        if (handler != null) {
            handler.post(new RunnableC0282o(qVar, c0137c, 6));
        }
        m0 m0Var = this.f4040d;
        m0Var.getClass();
        boolean z5 = m0Var.f4196b;
        I i4 = this.f5503Q0;
        if (z5) {
            AbstractC0124a.t(i4.f5465P);
            if (!i4.f5471V) {
                i4.f5471V = true;
                i4.r();
            }
        } else if (i4.f5471V) {
            i4.f5471V = false;
            i4.r();
        }
        b0.i iVar = this.f4042f;
        iVar.getClass();
        i4.f5490m = iVar;
        W.D d4 = this.f4043g;
        d4.getClass();
        i4.f5493r.f5403f = d4;
    }

    @Override // j0.r, a0.AbstractC0135a
    public final void r(long j4, boolean z, boolean z4) {
        super.r(j4, z, z4);
        this.f5503Q0.f();
        this.f5508W0 = j4;
        this.f5515d1 = -9223372036854775807L;
        this.f5511Z0 = false;
        this.f5512a1 = false;
        this.f5509X0 = true;
    }

    @Override // a0.AbstractC0135a
    public final void s() {
        B1.j jVar;
        this.f5503Q0.f5493r.d();
        if (Build.VERSION.SDK_INT < 35 || (jVar = this.f5504R0) == null) {
            return;
        }
        ((HashSet) jVar.f201b).clear();
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) jVar.f203d;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // a0.AbstractC0135a
    public final void t() {
        I i4 = this.f5503Q0;
        this.f5511Z0 = false;
        this.f5512a1 = false;
        this.f5515d1 = -9223372036854775807L;
        try {
            try {
                this.f13833g0 = false;
                p0();
                n0();
                e0.t tVar = this.f13803H;
                if (tVar != null) {
                    tVar.H(null);
                }
                this.f13803H = null;
            } catch (Throwable th) {
                e0.t tVar2 = this.f13803H;
                if (tVar2 != null) {
                    tVar2.H(null);
                }
                this.f13803H = null;
                throw th;
            }
        } finally {
            if (this.f5510Y0) {
                this.f5510Y0 = false;
                i4.s();
            }
        }
    }

    @Override // a0.AbstractC0135a
    public final void u() {
        this.f5503Q0.o();
        this.f5514c1 = true;
    }

    @Override // a0.AbstractC0135a
    public final void v() {
        E0();
        this.f5514c1 = false;
        I i4 = this.f5503Q0;
        i4.f5464O = false;
        if (i4.n()) {
            z zVar = i4.f5495t;
            B b4 = zVar.f5632e;
            b4.f5420k = 0L;
            b4.f5427t = 0;
            b4.f5426s = 0;
            b4.f5421l = 0L;
            b4.f5431y = -9223372036854775807L;
            b4.z = -9223372036854775807L;
            if (b4.f5428u == -9223372036854775807L) {
                b4.f5417h.a(0);
            }
            b4.f5429w = b4.a();
            if (!zVar.f5637j || zVar.c()) {
                zVar.f5628a.pause();
            }
        }
        this.f5512a1 = false;
    }

    @Override // j0.r
    public final boolean y0(C0097o c0097o) {
        m0 m0Var = this.f4040d;
        m0Var.getClass();
        if (m0Var.f4195a != 0) {
            int D02 = D0(c0097o);
            if ((D02 & 512) != 0) {
                m0 m0Var2 = this.f4040d;
                m0Var2.getClass();
                if (m0Var2.f4195a == 2 || (D02 & 1024) != 0 || (c0097o.f2849I == 0 && c0097o.f2850J == 0)) {
                    return true;
                }
            }
        }
        return this.f5503Q0.h(c0097o) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if ((r7.isEmpty() ? null : (j0.o) r7.get(0)) != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    @Override // j0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int z0(j0.j jVar, C0097o c0097o) {
        int i4;
        C0096n c0096n;
        a0 g4;
        boolean z;
        boolean z4;
        int f4 = AbstractC0135a.f(1, 0, 0, 0);
        String str = c0097o.n;
        String str2 = c0097o.n;
        if (!T.F.i(str)) {
            return AbstractC0135a.f(0, 0, 0, 0);
        }
        int i5 = c0097o.f2854O;
        boolean z5 = i5 != 0;
        boolean z6 = i5 == 0 || i5 == 2;
        int i6 = 8;
        I i7 = this.f5503Q0;
        if (z6) {
            if (z5) {
                List e4 = j0.w.e("audio/raw", false, false);
            }
            i4 = D0(c0097o);
            if (i7.h(c0097o) != 0) {
                return AbstractC0135a.f(4, 8, 32, i4);
            }
            if ("audio/raw".equals(str2) || i7.h(c0097o) != 0) {
                int i8 = c0097o.f2846F;
                int i9 = c0097o.f2847G;
                c0096n = new C0096n();
                c0096n.f2831m = T.F.n("audio/raw");
                c0096n.f2810E = i8;
                c0096n.f2811F = i9;
                c0096n.f2812G = 2;
                if (i7.h(new C0097o(c0096n)) != 0) {
                    if (str2 == null) {
                        g4 = a0.f15605e;
                    } else {
                        if (i7.h(c0097o) != 0) {
                            List e5 = j0.w.e("audio/raw", false, false);
                            j0.o oVar = e5.isEmpty() ? null : (j0.o) e5.get(0);
                            if (oVar != null) {
                                g4 = v2.I.o(oVar);
                            }
                        }
                        g4 = j0.w.g(jVar, c0097o, false, false);
                    }
                    if (!g4.isEmpty()) {
                        if (!z6) {
                            return AbstractC0135a.f(2, 0, 0, 0);
                        }
                        j0.o oVar2 = (j0.o) g4.get(0);
                        Context context = this.f5501O0;
                        boolean e6 = oVar2.e(context, c0097o);
                        if (!e6) {
                            for (int i10 = 1; i10 < g4.f15607d; i10++) {
                                j0.o oVar3 = (j0.o) g4.get(i10);
                                if (oVar3.e(context, c0097o)) {
                                    z4 = false;
                                    oVar2 = oVar3;
                                    z = true;
                                    break;
                                }
                            }
                        }
                        z = e6;
                        z4 = true;
                        int i11 = z ? 4 : 3;
                        if (z && oVar2.f(c0097o)) {
                            i6 = 16;
                        }
                        return (oVar2.f13772g ? 64 : 0) | i11 | i6 | 32 | (z4 ? 128 : 0) | i4;
                    }
                }
            }
            return f4;
        }
        i4 = 0;
        if ("audio/raw".equals(str2)) {
        }
        int i82 = c0097o.f2846F;
        int i92 = c0097o.f2847G;
        c0096n = new C0096n();
        c0096n.f2831m = T.F.n("audio/raw");
        c0096n.f2810E = i82;
        c0096n.f2811F = i92;
        c0096n.f2812G = 2;
        if (i7.h(new C0097o(c0096n)) != 0) {
        }
        return f4;
    }

    @Override // a0.AbstractC0135a
    public final S j() {
        return this;
    }
}
