package com.yandex.mobile.ads.impl;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.mobile.ads.impl.C2095mh;
import com.yandex.mobile.ads.impl.InterfaceC1976hh;
import com.yandex.mobile.ads.impl.InterfaceC2023jh;
import com.yandex.mobile.ads.impl.pu0;
import com.yandex.mobile.ads.impl.xy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class wy implements InterfaceC2023jh {

    /* renamed from: A, reason: collision with root package name */
    private int f34254A;

    /* renamed from: B, reason: collision with root package name */
    private long f34255B;

    /* renamed from: C, reason: collision with root package name */
    private long f34256C;

    /* renamed from: D, reason: collision with root package name */
    private long f34257D;

    /* renamed from: E, reason: collision with root package name */
    private long f34258E;

    /* renamed from: F, reason: collision with root package name */
    private int f34259F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f34260G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f34261H;

    /* renamed from: I, reason: collision with root package name */
    private long f34262I;

    /* renamed from: J, reason: collision with root package name */
    private float f34263J;

    /* renamed from: K, reason: collision with root package name */
    private InterfaceC1976hh[] f34264K;

    /* renamed from: L, reason: collision with root package name */
    private ByteBuffer[] f34265L;

    /* renamed from: M, reason: collision with root package name */
    private ByteBuffer f34266M;

    /* renamed from: N, reason: collision with root package name */
    private int f34267N;

    /* renamed from: O, reason: collision with root package name */
    private ByteBuffer f34268O;

    /* renamed from: P, reason: collision with root package name */
    private byte[] f34269P;

    /* renamed from: Q, reason: collision with root package name */
    private int f34270Q;

    /* renamed from: R, reason: collision with root package name */
    private int f34271R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f34272S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f34273T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f34274U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f34275V;

    /* renamed from: W, reason: collision with root package name */
    private int f34276W;

    /* renamed from: X, reason: collision with root package name */
    private C2187qh f34277X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f34278Y;

    /* renamed from: Z, reason: collision with root package name */
    private long f34279Z;

    /* renamed from: a, reason: collision with root package name */
    private final C1904eh f34280a;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f34281a0;

    /* renamed from: b, reason: collision with root package name */
    private final c f34282b;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f34283b0;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f34284c;

    /* renamed from: d, reason: collision with root package name */
    private final qn f34285d;

    /* renamed from: e, reason: collision with root package name */
    private final w62 f34286e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC1976hh[] f34287f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC1976hh[] f34288g;

    /* renamed from: h, reason: collision with root package name */
    private final vq f34289h;

    /* renamed from: i, reason: collision with root package name */
    private final C2095mh f34290i;

    /* renamed from: j, reason: collision with root package name */
    private final ArrayDeque<i> f34291j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f34292k;

    /* renamed from: l, reason: collision with root package name */
    private final int f34293l;

    /* renamed from: m, reason: collision with root package name */
    private l f34294m;

    /* renamed from: n, reason: collision with root package name */
    private final j<InterfaceC2023jh.b> f34295n;

    /* renamed from: o, reason: collision with root package name */
    private final j<InterfaceC2023jh.e> f34296o;

    /* renamed from: p, reason: collision with root package name */
    private final xy f34297p;

    /* renamed from: q, reason: collision with root package name */
    private ei1 f34298q;

    /* renamed from: r, reason: collision with root package name */
    private InterfaceC2023jh.c f34299r;

    /* renamed from: s, reason: collision with root package name */
    private f f34300s;

    /* renamed from: t, reason: collision with root package name */
    private f f34301t;

    /* renamed from: u, reason: collision with root package name */
    private AudioTrack f34302u;

    /* renamed from: v, reason: collision with root package name */
    private C1856ch f34303v;

    /* renamed from: w, reason: collision with root package name */
    private i f34304w;

    /* renamed from: x, reason: collision with root package name */
    private i f34305x;

    /* renamed from: y, reason: collision with root package name */
    private th1 f34306y;

    /* renamed from: z, reason: collision with root package name */
    private ByteBuffer f34307z;

    final class a extends Thread {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AudioTrack f34308b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AudioTrack audioTrack) {
            super("ExoPlayer:AudioTrackReleaseThread");
            this.f34308b = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                this.f34308b.flush();
                this.f34308b.release();
            } finally {
                wy.this.f34289h.e();
            }
        }
    }

    private static final class b {
        public static void a(AudioTrack audioTrack, ei1 ei1Var) {
            LogSessionId logSessionId;
            boolean equals;
            LogSessionId a4 = ei1Var.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a4.equals(logSessionId);
            if (equals) {
                return;
            }
            audioTrack.setLogSessionId(a4);
        }
    }

    public interface c {
    }

    interface d {

        /* renamed from: a, reason: collision with root package name */
        public static final xy f34310a = new xy(new xy.a());
    }

    public static final class e {

        /* renamed from: b, reason: collision with root package name */
        private g f34312b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f34313c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f34314d;

        /* renamed from: a, reason: collision with root package name */
        private C1904eh f34311a = C1904eh.f25291d;

        /* renamed from: e, reason: collision with root package name */
        private int f34315e = 0;

        /* renamed from: f, reason: collision with root package name */
        xy f34316f = d.f34310a;

        public final wy a() {
            if (this.f34312b == null) {
                this.f34312b = new g(new InterfaceC1976hh[0], new yx1(0), new c12());
            }
            return new wy(this);
        }

        public final e b() {
            this.f34314d = false;
            return this;
        }

        public final e c() {
            this.f34313c = false;
            return this;
        }

        public final e d() {
            this.f34315e = 0;
            return this;
        }

        public final e a(C1904eh c1904eh) {
            c1904eh.getClass();
            this.f34311a = c1904eh;
            return this;
        }
    }

    private static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final yb0 f34317a;

        /* renamed from: b, reason: collision with root package name */
        public final int f34318b;

        /* renamed from: c, reason: collision with root package name */
        public final int f34319c;

        /* renamed from: d, reason: collision with root package name */
        public final int f34320d;

        /* renamed from: e, reason: collision with root package name */
        public final int f34321e;

        /* renamed from: f, reason: collision with root package name */
        public final int f34322f;

        /* renamed from: g, reason: collision with root package name */
        public final int f34323g;

        /* renamed from: h, reason: collision with root package name */
        public final int f34324h;

        /* renamed from: i, reason: collision with root package name */
        public final InterfaceC1976hh[] f34325i;

        public f(yb0 yb0Var, int i4, int i5, int i6, int i7, int i8, int i9, int i10, InterfaceC1976hh[] interfaceC1976hhArr) {
            this.f34317a = yb0Var;
            this.f34318b = i4;
            this.f34319c = i5;
            this.f34320d = i6;
            this.f34321e = i7;
            this.f34322f = i8;
            this.f34323g = i9;
            this.f34324h = i10;
            this.f34325i = interfaceC1976hhArr;
        }

        private AudioTrack b(boolean z4, C1856ch c1856ch, int i4) {
            AudioTrack.Builder offloadedPlayback;
            int i5 = u82.f32873a;
            if (i5 >= 29) {
                offloadedPlayback = new AudioTrack.Builder().setAudioAttributes(z4 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : c1856ch.a().f24214a).setAudioFormat(new AudioFormat.Builder().setSampleRate(this.f34321e).setChannelMask(this.f34322f).setEncoding(this.f34323g).build()).setTransferMode(1).setBufferSizeInBytes(this.f34324h).setSessionId(i4).setOffloadedPlayback(this.f34319c == 1);
                return offloadedPlayback.build();
            }
            if (i5 < 21) {
                int c4 = u82.c(c1856ch.f24210d);
                return i4 == 0 ? new AudioTrack(c4, this.f34321e, this.f34322f, this.f34323g, this.f34324h, 1) : new AudioTrack(c4, this.f34321e, this.f34322f, this.f34323g, this.f34324h, 1, i4);
            }
            return new AudioTrack(z4 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : c1856ch.a().f24214a, new AudioFormat.Builder().setSampleRate(this.f34321e).setChannelMask(this.f34322f).setEncoding(this.f34323g).build(), this.f34324h, 1, i4);
        }

        public final AudioTrack a(boolean z4, C1856ch c1856ch, int i4) {
            try {
                AudioTrack b4 = b(z4, c1856ch, i4);
                int state = b4.getState();
                if (state == 1) {
                    return b4;
                }
                try {
                    b4.release();
                } catch (Exception unused) {
                }
                throw new InterfaceC2023jh.b(state, this.f34321e, this.f34322f, this.f34324h, this.f34317a, this.f34319c == 1, null);
            } catch (IllegalArgumentException | UnsupportedOperationException e4) {
                throw new InterfaceC2023jh.b(0, this.f34321e, this.f34322f, this.f34324h, this.f34317a, this.f34319c == 1, e4);
            }
        }
    }

    public static class g implements c {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC1976hh[] f34326a;

        /* renamed from: b, reason: collision with root package name */
        private final yx1 f34327b;

        /* renamed from: c, reason: collision with root package name */
        private final c12 f34328c;

        public g(InterfaceC1976hh[] interfaceC1976hhArr, yx1 yx1Var, c12 c12Var) {
            InterfaceC1976hh[] interfaceC1976hhArr2 = new InterfaceC1976hh[interfaceC1976hhArr.length + 2];
            this.f34326a = interfaceC1976hhArr2;
            System.arraycopy(interfaceC1976hhArr, 0, interfaceC1976hhArr2, 0, interfaceC1976hhArr.length);
            this.f34327b = yx1Var;
            this.f34328c = c12Var;
            interfaceC1976hhArr2[interfaceC1976hhArr.length] = yx1Var;
            interfaceC1976hhArr2[interfaceC1976hhArr.length + 1] = c12Var;
        }

        public final InterfaceC1976hh[] a() {
            return this.f34326a;
        }
    }

    public static final class h extends RuntimeException {
    }

    private static final class i {

        /* renamed from: a, reason: collision with root package name */
        public final th1 f34329a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f34330b;

        /* renamed from: c, reason: collision with root package name */
        public final long f34331c;

        /* renamed from: d, reason: collision with root package name */
        public final long f34332d;

        private i(th1 th1Var, boolean z4, long j4, long j5) {
            this.f34329a = th1Var;
            this.f34330b = z4;
            this.f34331c = j4;
            this.f34332d = j5;
        }
    }

    private static final class j<T extends Exception> {

        /* renamed from: a, reason: collision with root package name */
        private T f34333a;

        /* renamed from: b, reason: collision with root package name */
        private long f34334b;
    }

    private final class k implements C2095mh.a {
        @Override // com.yandex.mobile.ads.impl.C2095mh.a
        public final void a(long j4) {
            InterfaceC2023jh.c cVar = wy.this.f34299r;
            if (cVar != null) {
                ((pu0.a) cVar).a(j4);
            }
        }

        @Override // com.yandex.mobile.ads.impl.C2095mh.a
        public final void b(long j4, long j5, long j6, long j7) {
            StringBuilder sb = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
            sb.append(j4);
            sb.append(", ");
            sb.append(j5);
            sb.append(", ");
            sb.append(j6);
            sb.append(", ");
            sb.append(j7);
            sb.append(", ");
            wy wyVar = wy.this;
            sb.append(wyVar.f34301t.f34319c == 0 ? wyVar.f34255B / r5.f34318b : wyVar.f34256C);
            sb.append(", ");
            sb.append(wy.this.j());
            ms0.d("DefaultAudioSink", sb.toString());
        }

        private k() {
        }

        @Override // com.yandex.mobile.ads.impl.C2095mh.a
        public final void a(long j4, long j5, long j6, long j7) {
            StringBuilder sb = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
            sb.append(j4);
            sb.append(", ");
            sb.append(j5);
            sb.append(", ");
            sb.append(j6);
            sb.append(", ");
            sb.append(j7);
            sb.append(", ");
            wy wyVar = wy.this;
            sb.append(wyVar.f34301t.f34319c == 0 ? wyVar.f34255B / r5.f34318b : wyVar.f34256C);
            sb.append(", ");
            sb.append(wy.this.j());
            ms0.d("DefaultAudioSink", sb.toString());
        }

        @Override // com.yandex.mobile.ads.impl.C2095mh.a
        public final void b(long j4) {
            ms0.d("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j4);
        }

        @Override // com.yandex.mobile.ads.impl.C2095mh.a
        public final void a(int i4, long j4) {
            if (wy.this.f34299r != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                wy wyVar = wy.this;
                ((pu0.a) wyVar.f34299r).a(i4, j4, elapsedRealtime - wyVar.f34279Z);
            }
        }
    }

    private final class l {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f34336a = new Handler();

        /* renamed from: b, reason: collision with root package name */
        private final AudioTrack$StreamEventCallback f34337b = new a();

        final class a extends AudioTrack$StreamEventCallback {
            a() {
            }

            public final void onDataRequest(AudioTrack audioTrack, int i4) {
                wy wyVar = wy.this;
                if (audioTrack != wyVar.f34302u) {
                    throw new IllegalStateException();
                }
                InterfaceC2023jh.c cVar = wyVar.f34299r;
                if (cVar == null || !wyVar.f34274U) {
                    return;
                }
                ((pu0.a) cVar).a();
            }

            public final void onTearDown(AudioTrack audioTrack) {
                wy wyVar = wy.this;
                if (audioTrack != wyVar.f34302u) {
                    throw new IllegalStateException();
                }
                InterfaceC2023jh.c cVar = wyVar.f34299r;
                if (cVar == null || !wyVar.f34274U) {
                    return;
                }
                ((pu0.a) cVar).a();
            }
        }

        public l() {
        }

        public final void a(AudioTrack audioTrack) {
            Handler handler = this.f34336a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new com.my.tracker.obfuscated.Z2(handler), this.f34337b);
        }

        public final void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f34337b);
            this.f34336a.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long j() {
        return this.f34301t.f34319c == 0 ? this.f34257D / r0.f34320d : this.f34258E;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean k() {
        AudioTrack a4;
        ei1 ei1Var;
        if (!this.f34289h.d()) {
            return false;
        }
        try {
            f fVar = this.f34301t;
            fVar.getClass();
            try {
                a4 = fVar.a(this.f34278Y, this.f34303v, this.f34276W);
            } catch (InterfaceC2023jh.b e4) {
                InterfaceC2023jh.c cVar = this.f34299r;
                if (cVar != null) {
                    ((pu0.a) cVar).a(e4);
                }
                throw e4;
            }
        } catch (InterfaceC2023jh.b e5) {
            f fVar2 = this.f34301t;
            if (fVar2.f34324h > 1000000) {
                f fVar3 = new f(fVar2.f34317a, fVar2.f34318b, fVar2.f34319c, fVar2.f34320d, fVar2.f34321e, fVar2.f34322f, fVar2.f34323g, 1000000, fVar2.f34325i);
                try {
                    try {
                        a4 = fVar3.a(this.f34278Y, this.f34303v, this.f34276W);
                        this.f34301t = fVar3;
                    } catch (InterfaceC2023jh.b e6) {
                        InterfaceC2023jh.c cVar2 = this.f34299r;
                        if (cVar2 != null) {
                            ((pu0.a) cVar2).a(e6);
                        }
                        throw e6;
                    }
                } catch (InterfaceC2023jh.b e7) {
                    e5.addSuppressed(e7);
                    if (this.f34301t.f34319c == 1) {
                        throw e5;
                    }
                    this.f34281a0 = true;
                    throw e5;
                }
            }
            if (this.f34301t.f34319c == 1) {
            }
        }
        this.f34302u = a4;
        if (a(a4)) {
            AudioTrack audioTrack = this.f34302u;
            if (this.f34294m == null) {
                this.f34294m = new l();
            }
            this.f34294m.a(audioTrack);
            if (this.f34293l != 3) {
                AudioTrack audioTrack2 = this.f34302u;
                yb0 yb0Var = this.f34301t.f34317a;
                audioTrack2.setOffloadDelayPadding(yb0Var.f34975C, yb0Var.f34976D);
            }
        }
        int i4 = u82.f32873a;
        if (i4 >= 31 && (ei1Var = this.f34298q) != null) {
            b.a(this.f34302u, ei1Var);
        }
        this.f34276W = this.f34302u.getAudioSessionId();
        C2095mh c2095mh = this.f34290i;
        AudioTrack audioTrack3 = this.f34302u;
        f fVar4 = this.f34301t;
        c2095mh.a(audioTrack3, fVar4.f34319c == 2, fVar4.f34323g, fVar4.f34320d, fVar4.f34324h);
        if (l()) {
            if (i4 >= 21) {
                this.f34302u.setVolume(this.f34263J);
            } else {
                AudioTrack audioTrack4 = this.f34302u;
                float f4 = this.f34263J;
                audioTrack4.setStereoVolume(f4, f4);
            }
        }
        int i5 = this.f34277X.f30776a;
        if (i5 != 0) {
            this.f34302u.attachAuxEffect(i5);
            this.f34302u.setAuxEffectSendLevel(this.f34277X.f30777b);
        }
        this.f34261H = true;
        return true;
    }

    private boolean l() {
        return this.f34302u != null;
    }

    private void m() {
        this.f34255B = 0L;
        this.f34256C = 0L;
        this.f34257D = 0L;
        this.f34258E = 0L;
        int i4 = 0;
        this.f34283b0 = false;
        this.f34259F = 0;
        this.f34305x = new i(i().f34329a, i().f34330b, 0L, 0L);
        this.f34262I = 0L;
        this.f34304w = null;
        this.f34291j.clear();
        this.f34266M = null;
        this.f34267N = 0;
        this.f34268O = null;
        this.f34273T = false;
        this.f34272S = false;
        this.f34271R = -1;
        this.f34307z = null;
        this.f34254A = 0;
        this.f34286e.j();
        while (true) {
            InterfaceC1976hh[] interfaceC1976hhArr = this.f34264K;
            if (i4 >= interfaceC1976hhArr.length) {
                return;
            }
            InterfaceC1976hh interfaceC1976hh = interfaceC1976hhArr[i4];
            interfaceC1976hh.flush();
            this.f34265L[i4] = interfaceC1976hh.c();
            i4++;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2023jh
    public final void flush() {
        if (l()) {
            m();
            if (this.f34290i.b()) {
                this.f34302u.pause();
            }
            if (a(this.f34302u)) {
                l lVar = this.f34294m;
                lVar.getClass();
                lVar.b(this.f34302u);
            }
            AudioTrack audioTrack = this.f34302u;
            this.f34302u = null;
            if (u82.f32873a < 21 && !this.f34275V) {
                this.f34276W = 0;
            }
            f fVar = this.f34300s;
            if (fVar != null) {
                this.f34301t = fVar;
                this.f34300s = null;
            }
            this.f34290i.d();
            this.f34289h.c();
            new a(audioTrack).start();
        }
        ((j) this.f34296o).f34333a = null;
        ((j) this.f34295n).f34333a = null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2023jh
    public final th1 getPlaybackParameters() {
        return this.f34292k ? this.f34306y : i().f34329a;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2023jh
    public final void pause() {
        this.f34274U = false;
        if (l() && this.f34290i.c()) {
            this.f34302u.pause();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2023jh
    public final void play() {
        this.f34274U = true;
        if (l()) {
            this.f34290i.e();
            this.f34302u.play();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2023jh
    public final void setVolume(float f4) {
        if (this.f34263J != f4) {
            this.f34263J = f4;
            if (l()) {
                if (u82.f32873a >= 21) {
                    this.f34302u.setVolume(this.f34263J);
                    return;
                }
                AudioTrack audioTrack = this.f34302u;
                float f5 = this.f34263J;
                audioTrack.setStereoVolume(f5, f5);
            }
        }
    }

    private wy(e eVar) {
        this.f34280a = eVar.f34311a;
        g gVar = eVar.f34312b;
        this.f34282b = gVar;
        int i4 = u82.f32873a;
        this.f34284c = i4 >= 21 && eVar.f34313c;
        this.f34292k = i4 >= 23 && eVar.f34314d;
        this.f34293l = i4 >= 29 ? eVar.f34315e : 0;
        this.f34297p = eVar.f34316f;
        vq vqVar = new vq(0);
        this.f34289h = vqVar;
        vqVar.e();
        this.f34290i = new C2095mh(new k());
        qn qnVar = new qn();
        this.f34285d = qnVar;
        w62 w62Var = new w62();
        this.f34286e = w62Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new mq1(), qnVar, w62Var);
        Collections.addAll(arrayList, gVar.a());
        this.f34287f = (InterfaceC1976hh[]) arrayList.toArray(new InterfaceC1976hh[0]);
        this.f34288g = new InterfaceC1976hh[]{new rb0()};
        this.f34263J = 1.0f;
        this.f34303v = C1856ch.f24207h;
        this.f34276W = 0;
        this.f34277X = new C2187qh();
        th1 th1Var = th1.f32439e;
        this.f34305x = new i(th1Var, false, 0L, 0L);
        this.f34306y = th1Var;
        this.f34271R = -1;
        this.f34264K = new InterfaceC1976hh[0];
        this.f34265L = new ByteBuffer[0];
        this.f34291j = new ArrayDeque<>();
        this.f34295n = new j<>();
        this.f34296o = new j<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r0 != 4) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r0 != 4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da A[LOOP:1: B:35:0x00d5->B:37:0x00da, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea A[EDGE_INSN: B:38:0x00ea->B:39:0x00ea BREAK  A[LOOP:1: B:35:0x00d5->B:37:0x00da], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(long j4) {
        th1 th1Var;
        int i4;
        boolean z4;
        InterfaceC1976hh[] interfaceC1976hhArr;
        InterfaceC2023jh.c cVar;
        if (!this.f34278Y && "audio/raw".equals(this.f34301t.f34317a.f34991m)) {
            int i5 = this.f34301t.f34317a.f34974B;
            if (this.f34284c) {
                int i6 = u82.f32873a;
                if (i5 != 536870912) {
                    if (i5 != 805306368) {
                    }
                }
            }
            c cVar2 = this.f34282b;
            th1Var = i().f34329a;
            g gVar = (g) cVar2;
            gVar.f34328c.b(th1Var.f32440b);
            gVar.f34328c.a(th1Var.f32441c);
            th1 th1Var2 = th1Var;
            i4 = 0;
            if (!this.f34278Y && "audio/raw".equals(this.f34301t.f34317a.f34991m)) {
                int i7 = this.f34301t.f34317a.f34974B;
                if (this.f34284c) {
                    int i8 = u82.f32873a;
                    if (i7 != 536870912) {
                        if (i7 != 805306368) {
                        }
                    }
                }
                c cVar3 = this.f34282b;
                boolean z5 = i().f34330b;
                ((g) cVar3).f34327b.a(z5);
                z4 = z5;
                this.f34291j.add(new i(th1Var2, z4, Math.max(0L, j4), (j() * 1000000) / this.f34301t.f34321e));
                InterfaceC1976hh[] interfaceC1976hhArr2 = this.f34301t.f34325i;
                ArrayList arrayList = new ArrayList();
                for (InterfaceC1976hh interfaceC1976hh : interfaceC1976hhArr2) {
                    if (interfaceC1976hh.isActive()) {
                        arrayList.add(interfaceC1976hh);
                    } else {
                        interfaceC1976hh.flush();
                    }
                }
                int size = arrayList.size();
                this.f34264K = (InterfaceC1976hh[]) arrayList.toArray(new InterfaceC1976hh[size]);
                this.f34265L = new ByteBuffer[size];
                while (true) {
                    interfaceC1976hhArr = this.f34264K;
                    if (i4 < interfaceC1976hhArr.length) {
                        break;
                    }
                    InterfaceC1976hh interfaceC1976hh2 = interfaceC1976hhArr[i4];
                    interfaceC1976hh2.flush();
                    this.f34265L[i4] = interfaceC1976hh2.c();
                    i4++;
                }
                cVar = this.f34299r;
                if (cVar == null) {
                    ((pu0.a) cVar).a(z4);
                    return;
                }
                return;
            }
            z4 = false;
            this.f34291j.add(new i(th1Var2, z4, Math.max(0L, j4), (j() * 1000000) / this.f34301t.f34321e));
            InterfaceC1976hh[] interfaceC1976hhArr22 = this.f34301t.f34325i;
            ArrayList arrayList2 = new ArrayList();
            while (r3 < r2) {
            }
            int size2 = arrayList2.size();
            this.f34264K = (InterfaceC1976hh[]) arrayList2.toArray(new InterfaceC1976hh[size2]);
            this.f34265L = new ByteBuffer[size2];
            while (true) {
                interfaceC1976hhArr = this.f34264K;
                if (i4 < interfaceC1976hhArr.length) {
                }
                InterfaceC1976hh interfaceC1976hh22 = interfaceC1976hhArr[i4];
                interfaceC1976hh22.flush();
                this.f34265L[i4] = interfaceC1976hh22.c();
                i4++;
            }
            cVar = this.f34299r;
            if (cVar == null) {
            }
        }
        th1Var = th1.f32439e;
        th1 th1Var22 = th1Var;
        i4 = 0;
        if (!this.f34278Y) {
            int i72 = this.f34301t.f34317a.f34974B;
            if (this.f34284c) {
            }
            c cVar32 = this.f34282b;
            boolean z52 = i().f34330b;
            ((g) cVar32).f34327b.a(z52);
            z4 = z52;
            this.f34291j.add(new i(th1Var22, z4, Math.max(0L, j4), (j() * 1000000) / this.f34301t.f34321e));
            InterfaceC1976hh[] interfaceC1976hhArr222 = this.f34301t.f34325i;
            ArrayList arrayList22 = new ArrayList();
            while (r3 < r2) {
            }
            int size22 = arrayList22.size();
            this.f34264K = (InterfaceC1976hh[]) arrayList22.toArray(new InterfaceC1976hh[size22]);
            this.f34265L = new ByteBuffer[size22];
            while (true) {
                interfaceC1976hhArr = this.f34264K;
                if (i4 < interfaceC1976hhArr.length) {
                }
                InterfaceC1976hh interfaceC1976hh222 = interfaceC1976hhArr[i4];
                interfaceC1976hh222.flush();
                this.f34265L[i4] = interfaceC1976hh222.c();
                i4++;
            }
            cVar = this.f34299r;
            if (cVar == null) {
            }
        }
        z4 = false;
        this.f34291j.add(new i(th1Var22, z4, Math.max(0L, j4), (j() * 1000000) / this.f34301t.f34321e));
        InterfaceC1976hh[] interfaceC1976hhArr2222 = this.f34301t.f34325i;
        ArrayList arrayList222 = new ArrayList();
        while (r3 < r2) {
        }
        int size222 = arrayList222.size();
        this.f34264K = (InterfaceC1976hh[]) arrayList222.toArray(new InterfaceC1976hh[size222]);
        this.f34265L = new ByteBuffer[size222];
        while (true) {
            interfaceC1976hhArr = this.f34264K;
            if (i4 < interfaceC1976hhArr.length) {
            }
            InterfaceC1976hh interfaceC1976hh2222 = interfaceC1976hhArr[i4];
            interfaceC1976hh2222.flush();
            this.f34265L[i4] = interfaceC1976hh2222.c();
            i4++;
        }
        cVar = this.f34299r;
        if (cVar == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0029 -> B:4:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean h() {
        boolean z4;
        int i4;
        InterfaceC1976hh[] interfaceC1976hhArr;
        if (this.f34271R == -1) {
            this.f34271R = 0;
            z4 = true;
            i4 = this.f34271R;
            interfaceC1976hhArr = this.f34264K;
            if (i4 < interfaceC1976hhArr.length) {
                InterfaceC1976hh interfaceC1976hh = interfaceC1976hhArr[i4];
                if (z4) {
                    interfaceC1976hh.d();
                }
                b(-9223372036854775807L);
                if (!interfaceC1976hh.a()) {
                    return false;
                }
                this.f34271R++;
                z4 = true;
                i4 = this.f34271R;
                interfaceC1976hhArr = this.f34264K;
                if (i4 < interfaceC1976hhArr.length) {
                    ByteBuffer byteBuffer = this.f34268O;
                    if (byteBuffer != null) {
                        a(byteBuffer, -9223372036854775807L);
                        if (this.f34268O != null) {
                            return false;
                        }
                    }
                    this.f34271R = -1;
                    return true;
                }
            }
        } else {
            z4 = false;
            i4 = this.f34271R;
            interfaceC1976hhArr = this.f34264K;
            if (i4 < interfaceC1976hhArr.length) {
            }
        }
    }

    private i i() {
        i iVar = this.f34304w;
        return iVar != null ? iVar : !this.f34291j.isEmpty() ? this.f34291j.getLast() : this.f34305x;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2023jh
    public final int b(yb0 yb0Var) {
        if (!"audio/raw".equals(yb0Var.f34991m)) {
            return ((this.f34281a0 || !a(yb0Var, this.f34303v)) && this.f34280a.a(yb0Var) == null) ? 0 : 2;
        }
        if (u82.e(yb0Var.f34974B)) {
            int i4 = yb0Var.f34974B;
            return (i4 == 2 || (this.f34284c && i4 == 4)) ? 2 : 1;
        }
        ms0.d("DefaultAudioSink", "Invalid PCM encoding: " + yb0Var.f34974B);
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2023jh
    public final void c() {
        if (u82.f32873a < 21) {
            throw new IllegalStateException();
        }
        if (!this.f34275V) {
            throw new IllegalStateException();
        }
        if (this.f34278Y) {
            return;
        }
        this.f34278Y = true;
        flush();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2023jh
    public final void d() {
        if (!this.f34272S && l() && h()) {
            if (!this.f34273T) {
                this.f34273T = true;
                this.f34290i.c(j());
                this.f34302u.stop();
                this.f34254A = 0;
            }
            this.f34272S = true;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2023jh
    public final boolean e() {
        return l() && this.f34290i.d(j());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2023jh
    public final void f() {
        if (this.f34278Y) {
            this.f34278Y = false;
            flush();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2023jh
    public final void g() {
        this.f34260G = true;
    }

    private void b(long j4) {
        ByteBuffer byteBuffer;
        int length = this.f34264K.length;
        int i4 = length;
        while (i4 >= 0) {
            if (i4 > 0) {
                byteBuffer = this.f34265L[i4 - 1];
            } else {
                byteBuffer = this.f34266M;
                if (byteBuffer == null) {
                    byteBuffer = InterfaceC1976hh.f26738a;
                }
            }
            if (i4 == length) {
                a(byteBuffer, j4);
            } else {
                InterfaceC1976hh interfaceC1976hh = this.f34264K[i4];
                if (i4 > this.f34271R) {
                    interfaceC1976hh.a(byteBuffer);
                }
                ByteBuffer c4 = interfaceC1976hh.c();
                this.f34265L[i4] = c4;
                if (c4.hasRemaining()) {
                    i4++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i4--;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2023jh
    public final void b() {
        flush();
        for (InterfaceC1976hh interfaceC1976hh : this.f34287f) {
            interfaceC1976hh.b();
        }
        for (InterfaceC1976hh interfaceC1976hh2 : this.f34288g) {
            interfaceC1976hh2.b();
        }
        this.f34274U = false;
        this.f34281a0 = false;
    }

    private void b(th1 th1Var) {
        if (l()) {
            try {
                this.f34302u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(th1Var.f32440b).setPitch(th1Var.f32441c).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e4) {
                ms0.b("DefaultAudioSink", "Failed to set playback params", e4);
            }
            th1Var = new th1(this.f34302u.getPlaybackParams().getSpeed(), this.f34302u.getPlaybackParams().getPitch());
            this.f34290i.a(th1Var.f32440b);
        }
        this.f34306y = th1Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2023jh
    public final void b(boolean z4) {
        th1 th1Var = i().f34329a;
        i i4 = i();
        if (th1Var.equals(i4.f34329a) && z4 == i4.f34330b) {
            return;
        }
        i iVar = new i(th1Var, z4, -9223372036854775807L, -9223372036854775807L);
        if (l()) {
            this.f34304w = iVar;
        } else {
            this.f34305x = iVar;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.yandex.mobile.ads.impl.InterfaceC2023jh
    public final void a(yb0 yb0Var, int[] iArr) {
        int i4;
        int intValue;
        InterfaceC1976hh[] interfaceC1976hhArr;
        int i5;
        int intValue2;
        int i6;
        int i7;
        int i8;
        int max;
        boolean z4;
        InterfaceC1976hh[] interfaceC1976hhArr2;
        int[] iArr2;
        if ("audio/raw".equals(yb0Var.f34991m)) {
            if (u82.e(yb0Var.f34974B)) {
                i7 = u82.b(yb0Var.f34974B, yb0Var.f35004z);
                int i9 = yb0Var.f34974B;
                if (this.f34284c && (i9 == 536870912 || i9 == 805306368 || i9 == 4)) {
                    interfaceC1976hhArr2 = this.f34288g;
                } else {
                    interfaceC1976hhArr2 = this.f34287f;
                }
                this.f34286e.a(yb0Var.f34975C, yb0Var.f34976D);
                if (u82.f32873a < 21 && yb0Var.f35004z == 8 && iArr == null) {
                    iArr2 = new int[6];
                    for (int i10 = 0; i10 < 6; i10++) {
                        iArr2[i10] = i10;
                    }
                } else {
                    iArr2 = iArr;
                }
                this.f34285d.a(iArr2);
                InterfaceC1976hh.a aVar = new InterfaceC1976hh.a(yb0Var.f34973A, yb0Var.f35004z, yb0Var.f34974B);
                for (InterfaceC1976hh interfaceC1976hh : interfaceC1976hhArr2) {
                    try {
                        InterfaceC1976hh.a a4 = interfaceC1976hh.a(aVar);
                        if (interfaceC1976hh.isActive()) {
                            aVar = a4;
                        }
                    } catch (InterfaceC1976hh.b e4) {
                        throw new InterfaceC2023jh.a(e4, yb0Var);
                    }
                }
                intValue = aVar.f26742c;
                int i11 = aVar.f26740a;
                int a5 = u82.a(aVar.f26741b);
                i4 = u82.b(intValue, aVar.f26741b);
                interfaceC1976hhArr = interfaceC1976hhArr2;
                i5 = i11;
                intValue2 = a5;
                i6 = 0;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            InterfaceC1976hh[] interfaceC1976hhArr3 = new InterfaceC1976hh[0];
            int i12 = yb0Var.f34973A;
            i4 = -1;
            if (a(yb0Var, this.f34303v)) {
                String str = yb0Var.f34991m;
                str.getClass();
                intValue = i01.b(str, yb0Var.f34988j);
                interfaceC1976hhArr = interfaceC1976hhArr3;
                i5 = i12;
                intValue2 = u82.a(yb0Var.f35004z);
                i6 = 1;
            } else {
                Pair<Integer, Integer> a6 = this.f34280a.a(yb0Var);
                if (a6 != null) {
                    intValue = ((Integer) a6.first).intValue();
                    interfaceC1976hhArr = interfaceC1976hhArr3;
                    i5 = i12;
                    intValue2 = ((Integer) a6.second).intValue();
                    i6 = 2;
                } else {
                    throw new InterfaceC2023jh.a("Unable to configure passthrough for: " + yb0Var, yb0Var);
                }
            }
            i7 = -1;
        }
        xy xyVar = this.f34297p;
        int minBufferSize = AudioTrack.getMinBufferSize(i5, intValue2, intValue);
        if (minBufferSize != -2) {
            double d4 = this.f34292k ? 8.0d : 1.0d;
            xyVar.getClass();
            if (i6 != 0) {
                int i13 = 80000;
                if (i6 == 1) {
                    switch (intValue) {
                        case 5:
                            i8 = i7;
                            max = pp0.a((50000000 * i13) / 1000000);
                            break;
                        case 6:
                        case 18:
                            i13 = 768000;
                            i8 = i7;
                            max = pp0.a((50000000 * i13) / 1000000);
                            break;
                        case 7:
                            i13 = 192000;
                            i8 = i7;
                            max = pp0.a((50000000 * i13) / 1000000);
                            break;
                        case 8:
                            i13 = 2250000;
                            i8 = i7;
                            max = pp0.a((50000000 * i13) / 1000000);
                            break;
                        case 9:
                            i13 = 40000;
                            i8 = i7;
                            max = pp0.a((50000000 * i13) / 1000000);
                            break;
                        case 10:
                            i13 = 100000;
                            i8 = i7;
                            max = pp0.a((50000000 * i13) / 1000000);
                            break;
                        case 11:
                            i13 = 16000;
                            i8 = i7;
                            max = pp0.a((50000000 * i13) / 1000000);
                            break;
                        case 12:
                            i13 = 7000;
                            i8 = i7;
                            max = pp0.a((50000000 * i13) / 1000000);
                            break;
                        case 13:
                        default:
                            throw new IllegalArgumentException();
                        case 14:
                            i13 = 3062500;
                            i8 = i7;
                            max = pp0.a((50000000 * i13) / 1000000);
                            break;
                        case 15:
                            i13 = 8000;
                            i8 = i7;
                            max = pp0.a((50000000 * i13) / 1000000);
                            break;
                        case 16:
                            i13 = 256000;
                            i8 = i7;
                            max = pp0.a((50000000 * i13) / 1000000);
                            break;
                        case 17:
                            i13 = 336000;
                            i8 = i7;
                            max = pp0.a((50000000 * i13) / 1000000);
                            break;
                    }
                } else if (i6 == 2) {
                    int i14 = intValue == 5 ? 500000 : 250000;
                    switch (intValue) {
                        case 5:
                            z4 = true;
                            break;
                        case 6:
                        case 18:
                            z4 = true;
                            i13 = 768000;
                            break;
                        case 7:
                            z4 = true;
                            i13 = 192000;
                            break;
                        case 8:
                            z4 = true;
                            i13 = 2250000;
                            break;
                        case 9:
                            z4 = true;
                            i13 = 40000;
                            break;
                        case 10:
                            z4 = true;
                            i13 = 100000;
                            break;
                        case 11:
                            z4 = true;
                            i13 = 16000;
                            break;
                        case 12:
                            z4 = true;
                            i13 = 7000;
                            break;
                        case 13:
                        default:
                            throw new IllegalArgumentException();
                        case 14:
                            z4 = true;
                            i13 = 3062500;
                            break;
                        case 15:
                            z4 = true;
                            i13 = 8000;
                            break;
                        case 16:
                            z4 = true;
                            i13 = 256000;
                            break;
                        case 17:
                            z4 = true;
                            i13 = 336000;
                            break;
                    }
                    max = pp0.a((i14 * i13) / 1000000);
                    i8 = i7;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                i8 = i7;
                long j4 = i5;
                long j5 = i4;
                int a7 = pp0.a(((250000 * j4) * j5) / 1000000);
                int a8 = pp0.a(((750000 * j4) * j5) / 1000000);
                int i15 = u82.f32873a;
                max = Math.max(a7, Math.min(4 * minBufferSize, a8));
            }
            int max2 = (((Math.max(minBufferSize, (int) (max * d4)) + i4) - 1) / i4) * i4;
            if (intValue == 0) {
                throw new InterfaceC2023jh.a("Invalid output encoding (mode=" + i6 + ") for: " + yb0Var, yb0Var);
            }
            if (intValue2 != 0) {
                this.f34281a0 = false;
                f fVar = new f(yb0Var, i8, i6, i4, i5, intValue2, intValue, max2, interfaceC1976hhArr);
                if (l()) {
                    this.f34300s = fVar;
                    return;
                } else {
                    this.f34301t = fVar;
                    return;
                }
            }
            throw new InterfaceC2023jh.a("Invalid output channel config (mode=" + i6 + ") for: " + yb0Var, yb0Var);
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2023jh
    public final long a(boolean z4) {
        long j4;
        if (!l() || this.f34261H) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.f34290i.a(z4), (j() * 1000000) / this.f34301t.f34321e);
        while (!this.f34291j.isEmpty() && min >= this.f34291j.getFirst().f34332d) {
            this.f34305x = this.f34291j.remove();
        }
        i iVar = this.f34305x;
        long j5 = min - iVar.f34332d;
        if (iVar.f34329a.equals(th1.f32439e)) {
            j4 = this.f34305x.f34331c + j5;
        } else if (this.f34291j.isEmpty()) {
            j4 = ((g) this.f34282b).f34328c.a(j5) + this.f34305x.f34331c;
        } else {
            i first = this.f34291j.getFirst();
            long j6 = first.f34332d - min;
            float f4 = this.f34305x.f34329a.f32440b;
            int i4 = u82.f32873a;
            if (f4 != 1.0f) {
                j6 = Math.round(j6 * f4);
            }
            j4 = first.f34331c - j6;
        }
        return ((((g) this.f34282b).f34327b.i() * 1000000) / this.f34301t.f34321e) + j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0275 A[RETURN] */
    @Override // com.yandex.mobile.ads.impl.InterfaceC2023jh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(ByteBuffer byteBuffer, long j4, int i4) {
        long j5;
        long j6;
        int a4;
        int i5;
        byte b4;
        int i6;
        byte b5;
        int i7;
        ByteBuffer byteBuffer2 = this.f34266M;
        if (byteBuffer2 != null && byteBuffer != byteBuffer2) {
            throw new IllegalArgumentException();
        }
        if (this.f34300s != null) {
            if (!h()) {
                return false;
            }
            f fVar = this.f34300s;
            f fVar2 = this.f34301t;
            fVar.getClass();
            if (fVar2.f34319c == fVar.f34319c && fVar2.f34323g == fVar.f34323g && fVar2.f34321e == fVar.f34321e && fVar2.f34322f == fVar.f34322f && fVar2.f34320d == fVar.f34320d) {
                this.f34301t = this.f34300s;
                this.f34300s = null;
                if (a(this.f34302u) && this.f34293l != 3) {
                    if (this.f34302u.getPlayState() == 3) {
                        this.f34302u.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.f34302u;
                    yb0 yb0Var = this.f34301t.f34317a;
                    audioTrack.setOffloadDelayPadding(yb0Var.f34975C, yb0Var.f34976D);
                    this.f34283b0 = true;
                }
            } else {
                if (!this.f34273T) {
                    this.f34273T = true;
                    this.f34290i.c(j());
                    this.f34302u.stop();
                    this.f34254A = 0;
                }
                if (e()) {
                    return false;
                }
                flush();
            }
            a(j4);
        }
        if (!l()) {
            try {
                if (!k()) {
                    return false;
                }
            } catch (InterfaceC2023jh.b e4) {
                if (!e4.f27647c) {
                    j<InterfaceC2023jh.b> jVar = this.f34295n;
                    jVar.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (((j) jVar).f34333a == null) {
                        ((j) jVar).f34333a = e4;
                        ((j) jVar).f34334b = 100 + elapsedRealtime;
                    }
                    if (elapsedRealtime < ((j) jVar).f34334b) {
                        return false;
                    }
                    Exception exc = ((j) jVar).f34333a;
                    if (exc != e4) {
                        exc.addSuppressed(e4);
                    }
                    Exception exc2 = ((j) jVar).f34333a;
                    ((j) jVar).f34333a = null;
                    throw exc2;
                }
                throw e4;
            }
        }
        ((j) this.f34295n).f34333a = null;
        long j7 = 0;
        if (this.f34261H) {
            this.f34262I = Math.max(0L, j4);
            this.f34260G = false;
            this.f34261H = false;
            if (this.f34292k && u82.f32873a >= 23) {
                b(this.f34306y);
            }
            a(j4);
            if (this.f34274U) {
                play();
            }
        }
        if (!this.f34290i.f(j())) {
            return false;
        }
        if (this.f34266M == null) {
            if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                if (!byteBuffer.hasRemaining()) {
                    return true;
                }
                f fVar3 = this.f34301t;
                if (fVar3.f34319c != 0 && this.f34259F == 0) {
                    int i8 = fVar3.f34323g;
                    char c4 = 16;
                    switch (i8) {
                        case 5:
                        case 6:
                        case 18:
                            j5 = 0;
                            a4 = C2146p.a(byteBuffer);
                            this.f34259F = a4;
                            if (a4 == 0) {
                                return true;
                            }
                            break;
                        case 7:
                        case 8:
                            j5 = 0;
                            int position = byteBuffer.position();
                            byte b6 = byteBuffer.get(position);
                            if (b6 == -2) {
                                i5 = (byteBuffer.get(position + 5) & 1) << 6;
                                b4 = byteBuffer.get(position + 4);
                            } else {
                                if (b6 == -1) {
                                    i5 = (byteBuffer.get(position + 4) & 7) << 4;
                                    b5 = byteBuffer.get(position + 7);
                                } else if (b6 != 31) {
                                    i5 = (byteBuffer.get(position + 4) & 1) << 6;
                                    b4 = byteBuffer.get(position + 5);
                                } else {
                                    i5 = (byteBuffer.get(position + 5) & 7) << 4;
                                    b5 = byteBuffer.get(position + 6);
                                }
                                i6 = b5 & 60;
                                a4 = (((i6 >> 2) | i5) + 1) * 32;
                                this.f34259F = a4;
                                if (a4 == 0) {
                                }
                            }
                            i6 = b4 & 252;
                            a4 = (((i6 >> 2) | i5) + 1) * 32;
                            this.f34259F = a4;
                            if (a4 == 0) {
                            }
                            break;
                        case 9:
                            j5 = 0;
                            int position2 = byteBuffer.position();
                            int i9 = u82.f32873a;
                            int i10 = byteBuffer.getInt(position2);
                            if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                i10 = Integer.reverseBytes(i10);
                            }
                            a4 = s11.b(i10);
                            if (a4 == -1) {
                                throw new IllegalArgumentException();
                            }
                            this.f34259F = a4;
                            if (a4 == 0) {
                            }
                            break;
                        case 10:
                        case 16:
                            j5 = 0;
                            a4 = 1024;
                            this.f34259F = a4;
                            if (a4 == 0) {
                            }
                            break;
                        case 11:
                        case 12:
                            j5 = 0;
                            a4 = com.ironsource.mediationsdk.metadata.a.f17688n;
                            this.f34259F = a4;
                            if (a4 == 0) {
                            }
                            break;
                        case 13:
                        default:
                            throw new IllegalStateException(C1877de.a("Unexpected audio encoding: ", i8));
                        case 14:
                            int position3 = byteBuffer.position();
                            int limit = byteBuffer.limit() - 10;
                            int i11 = position3;
                            while (true) {
                                if (i11 <= limit) {
                                    j5 = j7;
                                    int i12 = u82.f32873a;
                                    int i13 = byteBuffer.getInt(i11 + 4);
                                    char c5 = c4;
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        i13 = Integer.reverseBytes(i13);
                                    }
                                    if ((i13 & (-2)) == -126718022) {
                                        i7 = i11 - position3;
                                    } else {
                                        i11++;
                                        j7 = j5;
                                        c4 = c5;
                                    }
                                } else {
                                    j5 = j7;
                                    i7 = -1;
                                }
                            }
                            if (i7 == -1) {
                                a4 = 0;
                            } else {
                                a4 = (40 << ((byteBuffer.get((byteBuffer.position() + i7) + ((byteBuffer.get((byteBuffer.position() + i7) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                            }
                            this.f34259F = a4;
                            if (a4 == 0) {
                            }
                            break;
                        case 15:
                            a4 = UserVerificationMethods.USER_VERIFY_NONE;
                            j5 = 0;
                            this.f34259F = a4;
                            if (a4 == 0) {
                            }
                            break;
                        case 17:
                            byte[] bArr = new byte[16];
                            int position4 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(position4);
                            a4 = C2214s.a(new rf1(16, bArr)).f31503c;
                            j5 = 0;
                            this.f34259F = a4;
                            if (a4 == 0) {
                            }
                            break;
                    }
                } else {
                    j5 = 0;
                }
                if (this.f34304w != null) {
                    if (!h()) {
                        return false;
                    }
                    a(j4);
                    this.f34304w = null;
                }
                long j8 = this.f34262I;
                if (this.f34301t.f34319c == 0) {
                    j6 = this.f34255B / r6.f34318b;
                } else {
                    j6 = this.f34256C;
                }
                long i14 = (((j6 - this.f34286e.i()) * 1000000) / r6.f34317a.f34973A) + j8;
                if (!this.f34260G && Math.abs(i14 - j4) > 200000) {
                    ((pu0.a) this.f34299r).a(new InterfaceC2023jh.d(j4, i14));
                    this.f34260G = true;
                }
                if (this.f34260G) {
                    if (!h()) {
                        return false;
                    }
                    long j9 = j4 - i14;
                    this.f34262I += j9;
                    this.f34260G = false;
                    a(j4);
                    InterfaceC2023jh.c cVar = this.f34299r;
                    if (cVar != null && j9 != j5) {
                        ((pu0.a) cVar).c();
                    }
                }
                if (this.f34301t.f34319c == 0) {
                    this.f34255B += byteBuffer.remaining();
                } else {
                    this.f34256C = (this.f34259F * i4) + this.f34256C;
                }
                this.f34266M = byteBuffer;
                this.f34267N = i4;
            } else {
                throw new IllegalArgumentException();
            }
        }
        b(j4);
        if (!this.f34266M.hasRemaining()) {
            this.f34266M = null;
            this.f34267N = 0;
            return true;
        }
        if (!this.f34290i.e(j())) {
            return false;
        }
        ms0.d("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2023jh
    public final boolean a() {
        if (l()) {
            return this.f34272S && !e();
        }
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2023jh
    public final void a(C1856ch c1856ch) {
        if (this.f34303v.equals(c1856ch)) {
            return;
        }
        this.f34303v = c1856ch;
        if (this.f34278Y) {
            return;
        }
        flush();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2023jh
    public final void a(int i4) {
        if (this.f34276W != i4) {
            this.f34276W = i4;
            this.f34275V = i4 != 0;
            flush();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2023jh
    public final void a(C2187qh c2187qh) {
        if (this.f34277X.equals(c2187qh)) {
            return;
        }
        int i4 = c2187qh.f30776a;
        float f4 = c2187qh.f30777b;
        AudioTrack audioTrack = this.f34302u;
        if (audioTrack != null) {
            if (this.f34277X.f30776a != i4) {
                audioTrack.attachAuxEffect(i4);
            }
            if (i4 != 0) {
                this.f34302u.setAuxEffectSendLevel(f4);
            }
        }
        this.f34277X = c2187qh;
    }

    public final void a(InterfaceC2023jh.c cVar) {
        this.f34299r = cVar;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2023jh
    public final void a(th1 th1Var) {
        float f4 = th1Var.f32440b;
        int i4 = u82.f32873a;
        th1 th1Var2 = new th1(Math.max(0.1f, Math.min(f4, 8.0f)), Math.max(0.1f, Math.min(th1Var.f32441c, 8.0f)));
        if (this.f34292k && u82.f32873a >= 23) {
            b(th1Var2);
            return;
        }
        boolean z4 = i().f34330b;
        i i5 = i();
        if (th1Var2.equals(i5.f34329a) && z4 == i5.f34330b) {
            return;
        }
        i iVar = new i(th1Var2, z4, -9223372036854775807L, -9223372036854775807L);
        if (l()) {
            this.f34304w = iVar;
        } else {
            this.f34305x = iVar;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2023jh
    public final void a(ei1 ei1Var) {
        this.f34298q = ei1Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2023jh
    public final boolean a(yb0 yb0Var) {
        return b(yb0Var) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x00d6, code lost:
    
        if (r13 < r12) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(ByteBuffer byteBuffer, long j4) {
        ByteBuffer byteBuffer2;
        int write;
        InterfaceC2023jh.c cVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.f34268O;
            if (byteBuffer3 == null) {
                this.f34268O = byteBuffer;
                if (u82.f32873a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.f34269P;
                    if (bArr == null || bArr.length < remaining) {
                        this.f34269P = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.f34269P, 0, remaining);
                    byteBuffer.position(position);
                    this.f34270Q = 0;
                }
            } else if (byteBuffer3 != byteBuffer) {
                throw new IllegalArgumentException();
            }
            int remaining2 = byteBuffer.remaining();
            int i4 = u82.f32873a;
            if (i4 < 21) {
                int b4 = this.f34290i.b(this.f34257D);
                if (b4 > 0) {
                    write = this.f34302u.write(this.f34269P, this.f34270Q, Math.min(remaining2, b4));
                    if (write > 0) {
                        this.f34270Q += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                    byteBuffer2 = byteBuffer;
                } else {
                    byteBuffer2 = byteBuffer;
                    write = 0;
                }
            } else if (!this.f34278Y) {
                byteBuffer2 = byteBuffer;
                write = this.f34302u.write(byteBuffer2, remaining2, 1);
            } else if (j4 != -9223372036854775807L) {
                AudioTrack audioTrack = this.f34302u;
                if (i4 >= 26) {
                    byteBuffer2 = byteBuffer;
                    write = audioTrack.write(byteBuffer2, remaining2, 1, j4 * 1000);
                } else {
                    byteBuffer2 = byteBuffer;
                    if (this.f34307z == null) {
                        ByteBuffer allocate = ByteBuffer.allocate(16);
                        this.f34307z = allocate;
                        allocate.order(ByteOrder.BIG_ENDIAN);
                        this.f34307z.putInt(1431633921);
                    }
                    if (this.f34254A == 0) {
                        this.f34307z.putInt(4, remaining2);
                        this.f34307z.putLong(8, j4 * 1000);
                        this.f34307z.position(0);
                        this.f34254A = remaining2;
                    }
                    int remaining3 = this.f34307z.remaining();
                    if (remaining3 > 0) {
                        write = audioTrack.write(this.f34307z, remaining3, 1);
                        if (write < 0) {
                            this.f34254A = 0;
                        }
                    }
                    write = audioTrack.write(byteBuffer2, remaining2, 1);
                    if (write < 0) {
                        this.f34254A = 0;
                    } else {
                        this.f34254A -= write;
                    }
                }
            } else {
                throw new IllegalStateException();
            }
            this.f34279Z = SystemClock.elapsedRealtime();
            if (write >= 0) {
                ((j) this.f34296o).f34333a = null;
                if (a(this.f34302u)) {
                    if (this.f34258E > 0) {
                        this.f34283b0 = false;
                    }
                    if (this.f34274U && (cVar = this.f34299r) != null && write < remaining2 && !this.f34283b0) {
                        ((pu0.a) cVar).b();
                    }
                }
                int i5 = this.f34301t.f34319c;
                if (i5 == 0) {
                    this.f34257D += write;
                }
                if (write == remaining2) {
                    if (i5 != 0) {
                        if (byteBuffer2 != this.f34266M) {
                            throw new IllegalStateException();
                        }
                        this.f34258E = (this.f34259F * this.f34267N) + this.f34258E;
                    }
                    this.f34268O = null;
                    return;
                }
                return;
            }
            boolean z4 = (i4 >= 24 && write == -6) || write == -32;
            if (z4 && this.f34301t.f34319c == 1) {
                this.f34281a0 = true;
            }
            InterfaceC2023jh.e eVar = new InterfaceC2023jh.e(write, this.f34301t.f34317a, z4);
            InterfaceC2023jh.c cVar2 = this.f34299r;
            if (cVar2 != null) {
                ((pu0.a) cVar2).a(eVar);
            }
            if (!eVar.f27650c) {
                j<InterfaceC2023jh.e> jVar = this.f34296o;
                jVar.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (((j) jVar).f34333a == null) {
                    ((j) jVar).f34333a = eVar;
                    ((j) jVar).f34334b = 100 + elapsedRealtime;
                }
                if (elapsedRealtime >= ((j) jVar).f34334b) {
                    Exception exc = ((j) jVar).f34333a;
                    if (exc != eVar) {
                        exc.addSuppressed(eVar);
                    }
                    Exception exc2 = ((j) jVar).f34333a;
                    ((j) jVar).f34333a = null;
                    throw exc2;
                }
                return;
            }
            throw eVar;
        }
    }

    private boolean a(yb0 yb0Var, C1856ch c1856ch) {
        int a4;
        boolean isOffloadedPlaybackSupported;
        int i4;
        int i5 = u82.f32873a;
        if (i5 >= 29 && this.f34293l != 0) {
            String str = yb0Var.f34991m;
            str.getClass();
            int b4 = i01.b(str, yb0Var.f34988j);
            if (b4 == 0 || (a4 = u82.a(yb0Var.f35004z)) == 0) {
                return false;
            }
            AudioFormat build = new AudioFormat.Builder().setSampleRate(yb0Var.f34973A).setChannelMask(a4).setEncoding(b4).build();
            AudioAttributes audioAttributes = c1856ch.a().f24214a;
            if (i5 >= 31) {
                i4 = AudioManager.getPlaybackOffloadSupport(build, audioAttributes);
            } else {
                isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(build, audioAttributes);
                if (isOffloadedPlaybackSupported) {
                    i4 = (i5 == 30 && u82.f32876d.startsWith("Pixel")) ? 2 : 1;
                } else {
                    i4 = 0;
                }
            }
            if (i4 != 0) {
                if (i4 == 1) {
                    return ((yb0Var.f34975C != 0 || yb0Var.f34976D != 0) && (this.f34293l == 1)) ? false : true;
                }
                if (i4 == 2) {
                    return true;
                }
                throw new IllegalStateException();
            }
        }
        return false;
    }

    private static boolean a(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (u82.f32873a < 29) {
            return false;
        }
        isOffloadedPlayback = audioTrack.isOffloadedPlayback();
        return isOffloadedPlayback;
    }
}
