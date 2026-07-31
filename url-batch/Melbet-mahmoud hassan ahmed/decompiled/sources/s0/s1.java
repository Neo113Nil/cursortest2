package s0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import i1.o;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import n2.q0;
import n2.y;
import r0.a2;
import r0.f2;
import r0.n2;
import r0.r2;
import r0.r3;
import r0.u2;
import r0.v2;
import r0.w3;
import s0.c;
import s0.t1;
import t0.t;
import t1.x;
import v0.h;
import v0.o;

/* loaded from: classes.dex */
public final class s1 implements c, t1.a {
    private boolean A;

    /* renamed from: a, reason: collision with root package name */
    private final Context f21540a;

    /* renamed from: b, reason: collision with root package name */
    private final t1 f21541b;

    /* renamed from: c, reason: collision with root package name */
    private final PlaybackSession f21542c;

    /* renamed from: i, reason: collision with root package name */
    private String f21548i;

    /* renamed from: j, reason: collision with root package name */
    private PlaybackMetrics.Builder f21549j;

    /* renamed from: k, reason: collision with root package name */
    private int f21550k;

    /* renamed from: n, reason: collision with root package name */
    private r2 f21553n;

    /* renamed from: o, reason: collision with root package name */
    private b f21554o;

    /* renamed from: p, reason: collision with root package name */
    private b f21555p;

    /* renamed from: q, reason: collision with root package name */
    private b f21556q;

    /* renamed from: r, reason: collision with root package name */
    private r0.s1 f21557r;

    /* renamed from: s, reason: collision with root package name */
    private r0.s1 f21558s;

    /* renamed from: t, reason: collision with root package name */
    private r0.s1 f21559t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f21560u;

    /* renamed from: v, reason: collision with root package name */
    private int f21561v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f21562w;

    /* renamed from: x, reason: collision with root package name */
    private int f21563x;

    /* renamed from: y, reason: collision with root package name */
    private int f21564y;

    /* renamed from: z, reason: collision with root package name */
    private int f21565z;

    /* renamed from: e, reason: collision with root package name */
    private final r3.d f21544e = new r3.d();

    /* renamed from: f, reason: collision with root package name */
    private final r3.b f21545f = new r3.b();

    /* renamed from: h, reason: collision with root package name */
    private final HashMap<String, Long> f21547h = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, Long> f21546g = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final long f21543d = SystemClock.elapsedRealtime();

    /* renamed from: l, reason: collision with root package name */
    private int f21551l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f21552m = 0;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f21566a;

        /* renamed from: b, reason: collision with root package name */
        public final int f21567b;

        public a(int i7, int i8) {
            this.f21566a = i7;
            this.f21567b = i8;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final r0.s1 f21568a;

        /* renamed from: b, reason: collision with root package name */
        public final int f21569b;

        /* renamed from: c, reason: collision with root package name */
        public final String f21570c;

        public b(r0.s1 s1Var, int i7, String str) {
            this.f21568a = s1Var;
            this.f21569b = i7;
            this.f21570c = str;
        }
    }

    private s1(Context context, PlaybackSession playbackSession) {
        this.f21540a = context.getApplicationContext();
        this.f21542c = playbackSession;
        r1 r1Var = new r1();
        this.f21541b = r1Var;
        r1Var.b(this);
    }

    private boolean A0(b bVar) {
        return bVar != null && bVar.f21570c.equals(this.f21541b.a());
    }

    public static s1 B0(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new s1(context, mediaMetricsManager.createPlaybackSession());
    }

    private void C0() {
        PlaybackMetrics.Builder builder = this.f21549j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.f21565z);
            this.f21549j.setVideoFramesDropped(this.f21563x);
            this.f21549j.setVideoFramesPlayed(this.f21564y);
            Long l7 = this.f21546g.get(this.f21548i);
            this.f21549j.setNetworkTransferDurationMillis(l7 == null ? 0L : l7.longValue());
            Long l8 = this.f21547h.get(this.f21548i);
            this.f21549j.setNetworkBytesRead(l8 == null ? 0L : l8.longValue());
            this.f21549j.setStreamSource((l8 == null || l8.longValue() <= 0) ? 0 : 1);
            this.f21542c.reportPlaybackMetrics(this.f21549j.build());
        }
        this.f21549j = null;
        this.f21548i = null;
        this.f21565z = 0;
        this.f21563x = 0;
        this.f21564y = 0;
        this.f21557r = null;
        this.f21558s = null;
        this.f21559t = null;
        this.A = false;
    }

    @SuppressLint({"SwitchIntDef"})
    private static int D0(int i7) {
        switch (o2.m0.U(i7)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private static v0.m E0(m4.q<w3.a> qVar) {
        v0.m mVar;
        m4.s0<w3.a> it = qVar.iterator();
        while (it.hasNext()) {
            w3.a next = it.next();
            for (int i7 = 0; i7 < next.f21088f; i7++) {
                if (next.e(i7) && (mVar = next.b(i7).f20959t) != null) {
                    return mVar;
                }
            }
        }
        return null;
    }

    private static int F0(v0.m mVar) {
        for (int i7 = 0; i7 < mVar.f22684i; i7++) {
            UUID uuid = mVar.i(i7).f22686g;
            if (uuid.equals(r0.j.f20686d)) {
                return 3;
            }
            if (uuid.equals(r0.j.f20687e)) {
                return 2;
            }
            if (uuid.equals(r0.j.f20685c)) {
                return 6;
            }
        }
        return 1;
    }

    private static a G0(r2 r2Var, Context context, boolean z6) {
        int i7;
        boolean z7;
        if (r2Var.f20907f == 1001) {
            return new a(20, 0);
        }
        if (r2Var instanceof r0.r) {
            r0.r rVar = (r0.r) r2Var;
            z7 = rVar.f20897i == 1;
            i7 = rVar.f20901m;
        } else {
            i7 = 0;
            z7 = false;
        }
        Throwable th = (Throwable) o2.a.e(r2Var.getCause());
        if (!(th instanceof IOException)) {
            if (z7 && (i7 == 0 || i7 == 1)) {
                return new a(35, 0);
            }
            if (z7 && i7 == 3) {
                return new a(15, 0);
            }
            if (z7 && i7 == 2) {
                return new a(23, 0);
            }
            if (th instanceof o.b) {
                return new a(13, o2.m0.V(((o.b) th).f16997i));
            }
            if (th instanceof i1.m) {
                return new a(14, o2.m0.V(((i1.m) th).f16948g));
            }
            if (th instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th instanceof t.b) {
                return new a(17, ((t.b) th).f21830f);
            }
            if (th instanceof t.e) {
                return new a(18, ((t.e) th).f21835f);
            }
            if (o2.m0.f19752a < 16 || !(th instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th).getErrorCode();
            return new a(D0(errorCode), errorCode);
        }
        if (th instanceof n2.c0) {
            return new a(5, ((n2.c0) th).f19398i);
        }
        if ((th instanceof n2.b0) || (th instanceof n2)) {
            return new a(z6 ? 10 : 11, 0);
        }
        if ((th instanceof n2.a0) || (th instanceof q0.a)) {
            if (o2.y.d(context).f() == 1) {
                return new a(3, 0);
            }
            Throwable cause = th.getCause();
            return cause instanceof UnknownHostException ? new a(6, 0) : cause instanceof SocketTimeoutException ? new a(7, 0) : ((th instanceof n2.a0) && ((n2.a0) th).f19391h == 1) ? new a(4, 0) : new a(8, 0);
        }
        if (r2Var.f20907f == 1002) {
            return new a(21, 0);
        }
        if (!(th instanceof o.a)) {
            if (!(th instanceof y.b) || !(th.getCause() instanceof FileNotFoundException)) {
                return new a(9, 0);
            }
            Throwable cause2 = ((Throwable) o2.a.e(th.getCause())).getCause();
            return (o2.m0.f19752a >= 21 && (cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
        }
        Throwable th2 = (Throwable) o2.a.e(th.getCause());
        int i8 = o2.m0.f19752a;
        if (i8 < 21 || !(th2 instanceof MediaDrm.MediaDrmStateException)) {
            return (i8 < 23 || !(th2 instanceof MediaDrmResetException)) ? (i8 < 18 || !(th2 instanceof NotProvisionedException)) ? (i8 < 18 || !(th2 instanceof DeniedByServerException)) ? th2 instanceof v0.p0 ? new a(23, 0) : th2 instanceof h.e ? new a(28, 0) : new a(30, 0) : new a(29, 0) : new a(24, 0) : new a(27, 0);
        }
        int V = o2.m0.V(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
        return new a(D0(V), V);
    }

    private static Pair<String, String> H0(String str) {
        String[] Q0 = o2.m0.Q0(str, "-");
        return Pair.create(Q0[0], Q0.length >= 2 ? Q0[1] : null);
    }

    private static int J0(Context context) {
        switch (o2.y.d(context).f()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case c4.w0.f2150p /* 8 */:
            default:
                return 1;
            case c4.w0.f2149o /* 7 */:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    private static int K0(a2 a2Var) {
        a2.h hVar = a2Var.f20393g;
        if (hVar == null) {
            return 0;
        }
        int p02 = o2.m0.p0(hVar.f20457a, hVar.f20458b);
        if (p02 == 0) {
            return 3;
        }
        if (p02 != 1) {
            return p02 != 2 ? 1 : 4;
        }
        return 5;
    }

    private static int L0(int i7) {
        if (i7 == 1) {
            return 2;
        }
        if (i7 != 2) {
            return i7 != 3 ? 1 : 4;
        }
        return 3;
    }

    private void M0(c.b bVar) {
        for (int i7 = 0; i7 < bVar.d(); i7++) {
            int b7 = bVar.b(i7);
            c.a c7 = bVar.c(b7);
            if (b7 == 0) {
                this.f21541b.c(c7);
            } else if (b7 == 11) {
                this.f21541b.g(c7, this.f21550k);
            } else {
                this.f21541b.d(c7);
            }
        }
    }

    private void N0(long j7) {
        int J0 = J0(this.f21540a);
        if (J0 != this.f21552m) {
            this.f21552m = J0;
            this.f21542c.reportNetworkEvent(new NetworkEvent.Builder().setNetworkType(J0).setTimeSinceCreatedMillis(j7 - this.f21543d).build());
        }
    }

    private void O0(long j7) {
        r2 r2Var = this.f21553n;
        if (r2Var == null) {
            return;
        }
        a G0 = G0(r2Var, this.f21540a, this.f21561v == 4);
        this.f21542c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(j7 - this.f21543d).setErrorCode(G0.f21566a).setSubErrorCode(G0.f21567b).setException(r2Var).build());
        this.A = true;
        this.f21553n = null;
    }

    private void P0(v2 v2Var, c.b bVar, long j7) {
        if (v2Var.T() != 2) {
            this.f21560u = false;
        }
        if (v2Var.h() == null) {
            this.f21562w = false;
        } else if (bVar.a(10)) {
            this.f21562w = true;
        }
        int X0 = X0(v2Var);
        if (this.f21551l != X0) {
            this.f21551l = X0;
            this.A = true;
            this.f21542c.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.f21551l).setTimeSinceCreatedMillis(j7 - this.f21543d).build());
        }
    }

    private void Q0(v2 v2Var, c.b bVar, long j7) {
        if (bVar.a(2)) {
            w3 v6 = v2Var.v();
            boolean c7 = v6.c(2);
            boolean c8 = v6.c(1);
            boolean c9 = v6.c(3);
            if (c7 || c8 || c9) {
                if (!c7) {
                    V0(j7, null, 0);
                }
                if (!c8) {
                    R0(j7, null, 0);
                }
                if (!c9) {
                    T0(j7, null, 0);
                }
            }
        }
        if (A0(this.f21554o)) {
            b bVar2 = this.f21554o;
            r0.s1 s1Var = bVar2.f21568a;
            if (s1Var.f20962w != -1) {
                V0(j7, s1Var, bVar2.f21569b);
                this.f21554o = null;
            }
        }
        if (A0(this.f21555p)) {
            b bVar3 = this.f21555p;
            R0(j7, bVar3.f21568a, bVar3.f21569b);
            this.f21555p = null;
        }
        if (A0(this.f21556q)) {
            b bVar4 = this.f21556q;
            T0(j7, bVar4.f21568a, bVar4.f21569b);
            this.f21556q = null;
        }
    }

    private void R0(long j7, r0.s1 s1Var, int i7) {
        if (o2.m0.c(this.f21558s, s1Var)) {
            return;
        }
        int i8 = (this.f21558s == null && i7 == 0) ? 1 : i7;
        this.f21558s = s1Var;
        W0(0, j7, s1Var, i8);
    }

    private void S0(v2 v2Var, c.b bVar) {
        v0.m E0;
        if (bVar.a(0)) {
            c.a c7 = bVar.c(0);
            if (this.f21549j != null) {
                U0(c7.f21393b, c7.f21395d);
            }
        }
        if (bVar.a(2) && this.f21549j != null && (E0 = E0(v2Var.v().b())) != null) {
            ((PlaybackMetrics.Builder) o2.m0.j(this.f21549j)).setDrmType(F0(E0));
        }
        if (bVar.a(1011)) {
            this.f21565z++;
        }
    }

    private void T0(long j7, r0.s1 s1Var, int i7) {
        if (o2.m0.c(this.f21559t, s1Var)) {
            return;
        }
        int i8 = (this.f21559t == null && i7 == 0) ? 1 : i7;
        this.f21559t = s1Var;
        W0(2, j7, s1Var, i8);
    }

    private void U0(r3 r3Var, x.b bVar) {
        int f7;
        PlaybackMetrics.Builder builder = this.f21549j;
        if (bVar == null || (f7 = r3Var.f(bVar.f22249a)) == -1) {
            return;
        }
        r3Var.j(f7, this.f21545f);
        r3Var.r(this.f21545f.f20914h, this.f21544e);
        builder.setStreamType(K0(this.f21544e.f20929h));
        r3.d dVar = this.f21544e;
        if (dVar.f20940s != -9223372036854775807L && !dVar.f20938q && !dVar.f20935n && !dVar.h()) {
            builder.setMediaDurationMillis(this.f21544e.f());
        }
        builder.setPlaybackType(this.f21544e.h() ? 2 : 1);
        this.A = true;
    }

    private void V0(long j7, r0.s1 s1Var, int i7) {
        if (o2.m0.c(this.f21557r, s1Var)) {
            return;
        }
        int i8 = (this.f21557r == null && i7 == 0) ? 1 : i7;
        this.f21557r = s1Var;
        W0(1, j7, s1Var, i8);
    }

    private void W0(int i7, long j7, r0.s1 s1Var, int i8) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i7).setTimeSinceCreatedMillis(j7 - this.f21543d);
        if (s1Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(L0(i8));
            String str = s1Var.f20955p;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = s1Var.f20956q;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = s1Var.f20953n;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i9 = s1Var.f20952m;
            if (i9 != -1) {
                timeSinceCreatedMillis.setBitrate(i9);
            }
            int i10 = s1Var.f20961v;
            if (i10 != -1) {
                timeSinceCreatedMillis.setWidth(i10);
            }
            int i11 = s1Var.f20962w;
            if (i11 != -1) {
                timeSinceCreatedMillis.setHeight(i11);
            }
            int i12 = s1Var.D;
            if (i12 != -1) {
                timeSinceCreatedMillis.setChannelCount(i12);
            }
            int i13 = s1Var.E;
            if (i13 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i13);
            }
            String str4 = s1Var.f20947h;
            if (str4 != null) {
                Pair<String, String> H0 = H0(str4);
                timeSinceCreatedMillis.setLanguage((String) H0.first);
                Object obj = H0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f7 = s1Var.f20963x;
            if (f7 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f7);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        this.f21542c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    private int X0(v2 v2Var) {
        int T = v2Var.T();
        if (this.f21560u) {
            return 5;
        }
        if (this.f21562w) {
            return 13;
        }
        if (T == 4) {
            return 11;
        }
        if (T == 2) {
            int i7 = this.f21551l;
            if (i7 == 0 || i7 == 2) {
                return 2;
            }
            if (v2Var.p()) {
                return v2Var.G() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (T == 3) {
            if (v2Var.p()) {
                return v2Var.G() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (T != 1 || this.f21551l == 0) {
            return this.f21551l;
        }
        return 12;
    }

    @Override // s0.c
    public /* synthetic */ void A(c.a aVar, long j7, int i7) {
        s0.b.j0(this, aVar, j7, i7);
    }

    @Override // s0.c
    public /* synthetic */ void B(c.a aVar, t1.q qVar, t1.t tVar) {
        s0.b.G(this, aVar, qVar, tVar);
    }

    @Override // s0.c
    public /* synthetic */ void C(c.a aVar, List list) {
        s0.b.o(this, aVar, list);
    }

    @Override // s0.c
    public /* synthetic */ void D(c.a aVar, boolean z6) {
        s0.b.Z(this, aVar, z6);
    }

    @Override // s0.c
    public /* synthetic */ void E(c.a aVar, r0.s1 s1Var, u0.i iVar) {
        s0.b.l0(this, aVar, s1Var, iVar);
    }

    @Override // s0.c
    public /* synthetic */ void F(c.a aVar) {
        s0.b.B(this, aVar);
    }

    @Override // s0.c
    public /* synthetic */ void G(c.a aVar, v2.b bVar) {
        s0.b.m(this, aVar, bVar);
    }

    @Override // s0.c
    public /* synthetic */ void H(c.a aVar, Exception exc) {
        s0.b.b(this, aVar, exc);
    }

    @Override // s0.c
    public void I(c.a aVar, t1.q qVar, t1.t tVar, IOException iOException, boolean z6) {
        this.f21561v = tVar.f22214a;
    }

    public LogSessionId I0() {
        return this.f21542c.getSessionId();
    }

    @Override // s0.c
    public /* synthetic */ void J(c.a aVar, float f7) {
        s0.b.n0(this, aVar, f7);
    }

    @Override // s0.c
    public /* synthetic */ void K(c.a aVar, int i7) {
        s0.b.O(this, aVar, i7);
    }

    @Override // s0.c
    public /* synthetic */ void L(c.a aVar, long j7) {
        s0.b.j(this, aVar, j7);
    }

    @Override // s0.c
    public /* synthetic */ void M(c.a aVar, boolean z6) {
        s0.b.Y(this, aVar, z6);
    }

    @Override // s0.c
    public /* synthetic */ void N(c.a aVar, Exception exc) {
        s0.b.e0(this, aVar, exc);
    }

    @Override // s0.c
    public /* synthetic */ void O(c.a aVar, Exception exc) {
        s0.b.A(this, aVar, exc);
    }

    @Override // s0.c
    public /* synthetic */ void P(c.a aVar, int i7, u0.e eVar) {
        s0.b.p(this, aVar, i7, eVar);
    }

    @Override // s0.c
    public /* synthetic */ void Q(c.a aVar, a2 a2Var, int i7) {
        s0.b.J(this, aVar, a2Var, i7);
    }

    @Override // s0.c
    public /* synthetic */ void R(c.a aVar, int i7, long j7, long j8) {
        s0.b.l(this, aVar, i7, j7, j8);
    }

    @Override // s0.c
    public /* synthetic */ void S(c.a aVar, t1.q qVar, t1.t tVar) {
        s0.b.H(this, aVar, qVar, tVar);
    }

    @Override // s0.c
    public /* synthetic */ void T(c.a aVar, boolean z6, int i7) {
        s0.b.S(this, aVar, z6, i7);
    }

    @Override // s0.c
    public /* synthetic */ void U(c.a aVar, u2 u2Var) {
        s0.b.N(this, aVar, u2Var);
    }

    @Override // s0.c
    public /* synthetic */ void V(c.a aVar, Exception exc) {
        s0.b.k(this, aVar, exc);
    }

    @Override // s0.c
    public /* synthetic */ void W(c.a aVar, int i7, u0.e eVar) {
        s0.b.q(this, aVar, i7, eVar);
    }

    @Override // s0.c
    public /* synthetic */ void X(c.a aVar, String str) {
        s0.b.e(this, aVar, str);
    }

    @Override // s0.c
    public void Y(c.a aVar, v2.e eVar, v2.e eVar2, int i7) {
        if (i7 == 1) {
            this.f21560u = true;
        }
        this.f21550k = i7;
    }

    @Override // s0.c
    public void Z(v2 v2Var, c.b bVar) {
        if (bVar.d() == 0) {
            return;
        }
        M0(bVar);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        S0(v2Var, bVar);
        O0(elapsedRealtime);
        Q0(v2Var, bVar, elapsedRealtime);
        N0(elapsedRealtime);
        P0(v2Var, bVar, elapsedRealtime);
        if (bVar.a(1028)) {
            this.f21541b.e(bVar.c(1028));
        }
    }

    @Override // s0.c
    public /* synthetic */ void a(c.a aVar, int i7, r0.s1 s1Var) {
        s0.b.s(this, aVar, i7, s1Var);
    }

    @Override // s0.c
    public /* synthetic */ void a0(c.a aVar) {
        s0.b.y(this, aVar);
    }

    @Override // s0.c
    public /* synthetic */ void b(c.a aVar) {
        s0.b.v(this, aVar);
    }

    @Override // s0.c
    public void b0(c.a aVar, u0.e eVar) {
        this.f21563x += eVar.f22404g;
        this.f21564y += eVar.f22402e;
    }

    @Override // s0.c
    public /* synthetic */ void c(c.a aVar, boolean z6, int i7) {
        s0.b.M(this, aVar, z6, i7);
    }

    @Override // s0.c
    public /* synthetic */ void c0(c.a aVar, c2.e eVar) {
        s0.b.n(this, aVar, eVar);
    }

    @Override // s0.c
    public /* synthetic */ void d(c.a aVar, int i7) {
        s0.b.P(this, aVar, i7);
    }

    @Override // s0.c
    public /* synthetic */ void d0(c.a aVar) {
        s0.b.x(this, aVar);
    }

    @Override // s0.c
    public /* synthetic */ void e(c.a aVar, int i7, boolean z6) {
        s0.b.u(this, aVar, i7, z6);
    }

    @Override // s0.c
    public void e0(c.a aVar, p2.z zVar) {
        b bVar = this.f21554o;
        if (bVar != null) {
            r0.s1 s1Var = bVar.f21568a;
            if (s1Var.f20962w == -1) {
                this.f21554o = new b(s1Var.b().j0(zVar.f20106f).Q(zVar.f20107g).E(), bVar.f21569b, bVar.f21570c);
            }
        }
    }

    @Override // s0.c
    public /* synthetic */ void f(c.a aVar, w3 w3Var) {
        s0.b.c0(this, aVar, w3Var);
    }

    @Override // s0.c
    public /* synthetic */ void f0(c.a aVar, u0.e eVar) {
        s0.b.f(this, aVar, eVar);
    }

    @Override // s0.c
    public /* synthetic */ void g(c.a aVar) {
        s0.b.X(this, aVar);
    }

    @Override // s0.c
    public /* synthetic */ void g0(c.a aVar, int i7) {
        s0.b.z(this, aVar, i7);
    }

    @Override // s0.c
    public /* synthetic */ void h(c.a aVar, boolean z6) {
        s0.b.I(this, aVar, z6);
    }

    @Override // s0.c
    public void h0(c.a aVar, r2 r2Var) {
        this.f21553n = r2Var;
    }

    @Override // s0.c
    public /* synthetic */ void i(c.a aVar, r0.s1 s1Var, u0.i iVar) {
        s0.b.i(this, aVar, s1Var, iVar);
    }

    @Override // s0.c
    public /* synthetic */ void i0(c.a aVar, j1.a aVar2) {
        s0.b.L(this, aVar, aVar2);
    }

    @Override // s0.c
    public /* synthetic */ void j(c.a aVar, int i7) {
        s0.b.b0(this, aVar, i7);
    }

    @Override // s0.c
    public /* synthetic */ void j0(c.a aVar, String str, long j7) {
        s0.b.f0(this, aVar, str, j7);
    }

    @Override // s0.c
    public /* synthetic */ void k(c.a aVar, t1.q qVar, t1.t tVar) {
        s0.b.F(this, aVar, qVar, tVar);
    }

    @Override // s0.t1.a
    public void k0(c.a aVar, String str, String str2) {
    }

    @Override // s0.c
    public /* synthetic */ void l(c.a aVar) {
        s0.b.W(this, aVar);
    }

    @Override // s0.c
    public /* synthetic */ void l0(c.a aVar, t0.e eVar) {
        s0.b.a(this, aVar, eVar);
    }

    @Override // s0.c
    public /* synthetic */ void m(c.a aVar, t1.t tVar) {
        s0.b.d0(this, aVar, tVar);
    }

    @Override // s0.c
    public /* synthetic */ void m0(c.a aVar, f2 f2Var) {
        s0.b.K(this, aVar, f2Var);
    }

    @Override // s0.c
    public /* synthetic */ void n(c.a aVar, String str) {
        s0.b.h0(this, aVar, str);
    }

    @Override // s0.c
    public /* synthetic */ void n0(c.a aVar, String str, long j7, long j8) {
        s0.b.d(this, aVar, str, j7, j8);
    }

    @Override // s0.c
    public /* synthetic */ void o(c.a aVar, int i7, int i8) {
        s0.b.a0(this, aVar, i7, i8);
    }

    @Override // s0.c
    public /* synthetic */ void o0(c.a aVar, String str, long j7) {
        s0.b.c(this, aVar, str, j7);
    }

    @Override // s0.c
    public /* synthetic */ void p(c.a aVar, int i7, int i8, int i9, float f7) {
        s0.b.m0(this, aVar, i7, i8, i9, f7);
    }

    @Override // s0.c
    public /* synthetic */ void p0(c.a aVar, r0.s1 s1Var) {
        s0.b.h(this, aVar, s1Var);
    }

    @Override // s0.c
    public void q(c.a aVar, t1.t tVar) {
        if (aVar.f21395d == null) {
            return;
        }
        b bVar = new b((r0.s1) o2.a.e(tVar.f22216c), tVar.f22217d, this.f21541b.f(aVar.f21393b, (x.b) o2.a.e(aVar.f21395d)));
        int i7 = tVar.f22215b;
        if (i7 != 0) {
            if (i7 == 1) {
                this.f21555p = bVar;
                return;
            } else if (i7 != 2) {
                if (i7 != 3) {
                    return;
                }
                this.f21556q = bVar;
                return;
            }
        }
        this.f21554o = bVar;
    }

    @Override // s0.t1.a
    public void q0(c.a aVar, String str, boolean z6) {
        x.b bVar = aVar.f21395d;
        if ((bVar == null || !bVar.b()) && str.equals(this.f21548i)) {
            C0();
        }
        this.f21546g.remove(str);
        this.f21547h.remove(str);
    }

    @Override // s0.t1.a
    public void r(c.a aVar, String str) {
        x.b bVar = aVar.f21395d;
        if (bVar == null || !bVar.b()) {
            C0();
            this.f21548i = str;
            this.f21549j = new PlaybackMetrics.Builder().setPlayerName("ExoPlayerLib").setPlayerVersion("2.18.1");
            U0(aVar.f21393b, aVar.f21395d);
        }
    }

    @Override // s0.c
    public void r0(c.a aVar, int i7, long j7, long j8) {
        x.b bVar = aVar.f21395d;
        if (bVar != null) {
            String f7 = this.f21541b.f(aVar.f21393b, (x.b) o2.a.e(bVar));
            Long l7 = this.f21547h.get(f7);
            Long l8 = this.f21546g.get(f7);
            this.f21547h.put(f7, Long.valueOf((l7 == null ? 0L : l7.longValue()) + j7));
            this.f21546g.put(f7, Long.valueOf((l8 != null ? l8.longValue() : 0L) + i7));
        }
    }

    @Override // s0.c
    public /* synthetic */ void s(c.a aVar, u0.e eVar) {
        s0.b.g(this, aVar, eVar);
    }

    @Override // s0.c
    public /* synthetic */ void s0(c.a aVar, u0.e eVar) {
        s0.b.i0(this, aVar, eVar);
    }

    @Override // s0.c
    public /* synthetic */ void t(c.a aVar) {
        s0.b.R(this, aVar);
    }

    @Override // s0.c
    public /* synthetic */ void t0(c.a aVar) {
        s0.b.w(this, aVar);
    }

    @Override // s0.t1.a
    public void u(c.a aVar, String str) {
    }

    @Override // s0.c
    public /* synthetic */ void u0(c.a aVar, r2 r2Var) {
        s0.b.Q(this, aVar, r2Var);
    }

    @Override // s0.c
    public /* synthetic */ void v(c.a aVar, int i7) {
        s0.b.V(this, aVar, i7);
    }

    @Override // s0.c
    public /* synthetic */ void v0(c.a aVar, r0.p pVar) {
        s0.b.t(this, aVar, pVar);
    }

    @Override // s0.c
    public /* synthetic */ void w(c.a aVar, String str, long j7, long j8) {
        s0.b.g0(this, aVar, str, j7, j8);
    }

    @Override // s0.c
    public /* synthetic */ void w0(c.a aVar, r0.s1 s1Var) {
        s0.b.k0(this, aVar, s1Var);
    }

    @Override // s0.c
    public /* synthetic */ void x(c.a aVar, boolean z6) {
        s0.b.D(this, aVar, z6);
    }

    @Override // s0.c
    public /* synthetic */ void x0(c.a aVar, boolean z6) {
        s0.b.E(this, aVar, z6);
    }

    @Override // s0.c
    public /* synthetic */ void y(c.a aVar, int i7, String str, long j7) {
        s0.b.r(this, aVar, i7, str, j7);
    }

    @Override // s0.c
    public /* synthetic */ void y0(c.a aVar, int i7, long j7) {
        s0.b.C(this, aVar, i7, j7);
    }

    @Override // s0.c
    public /* synthetic */ void z(c.a aVar, int i7) {
        s0.b.T(this, aVar, i7);
    }

    @Override // s0.c
    public /* synthetic */ void z0(c.a aVar, Object obj, long j7) {
        s0.b.U(this, aVar, obj, j7);
    }
}
