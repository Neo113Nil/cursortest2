package b0;

import T.C0097o;
import T.C0104w;
import T.H;
import T.Q;
import T.S;
import T.T;
import W.AbstractC0108a;
import W.J;
import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.HashMap;
import java.util.concurrent.Executor;
import q0.C1353B;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: A, reason: collision with root package name */
    public int f5294A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f5295B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f5296a;

    /* renamed from: c, reason: collision with root package name */
    public final f f5298c;

    /* renamed from: d, reason: collision with root package name */
    public final PlaybackSession f5299d;

    /* renamed from: j, reason: collision with root package name */
    public String f5305j;

    /* renamed from: k, reason: collision with root package name */
    public PlaybackMetrics.Builder f5306k;

    /* renamed from: l, reason: collision with root package name */
    public int f5307l;
    public H o;

    /* renamed from: p, reason: collision with root package name */
    public L3.h f5309p;

    /* renamed from: q, reason: collision with root package name */
    public L3.h f5310q;

    /* renamed from: r, reason: collision with root package name */
    public L3.h f5311r;

    /* renamed from: s, reason: collision with root package name */
    public C0097o f5312s;

    /* renamed from: t, reason: collision with root package name */
    public C0097o f5313t;

    /* renamed from: u, reason: collision with root package name */
    public C0097o f5314u;
    public boolean v;

    /* renamed from: w, reason: collision with root package name */
    public int f5315w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f5316x;

    /* renamed from: y, reason: collision with root package name */
    public int f5317y;
    public int z;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f5297b = AbstractC0108a.g();

    /* renamed from: f, reason: collision with root package name */
    public final S f5301f = new S();

    /* renamed from: g, reason: collision with root package name */
    public final Q f5302g = new Q();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f5304i = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f5303h = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final long f5300e = SystemClock.elapsedRealtime();

    /* renamed from: m, reason: collision with root package name */
    public int f5308m = 0;
    public int n = 0;

    public h(Context context, PlaybackSession playbackSession) {
        this.f5296a = context.getApplicationContext();
        this.f5299d = playbackSession;
        f fVar = new f();
        this.f5298c = fVar;
        fVar.f5290d = this;
    }

    public final boolean a(L3.h hVar) {
        String str;
        if (hVar == null) {
            return false;
        }
        String str2 = (String) hVar.f1681c;
        f fVar = this.f5298c;
        synchronized (fVar) {
            str = fVar.f5292f;
        }
        return str2.equals(str);
    }

    public final void b() {
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.f5306k;
        if (builder != null && this.f5295B) {
            builder.setAudioUnderrunCount(this.f5294A);
            this.f5306k.setVideoFramesDropped(this.f5317y);
            this.f5306k.setVideoFramesPlayed(this.z);
            Long l4 = (Long) this.f5303h.get(this.f5305j);
            this.f5306k.setNetworkTransferDurationMillis(l4 == null ? 0L : l4.longValue());
            Long l5 = (Long) this.f5304i.get(this.f5305j);
            this.f5306k.setNetworkBytesRead(l5 == null ? 0L : l5.longValue());
            this.f5306k.setStreamSource((l5 == null || l5.longValue() <= 0) ? 0 : 1);
            build = this.f5306k.build();
            this.f5297b.execute(new R1.e(this, 16, build));
        }
        this.f5306k = null;
        this.f5305j = null;
        this.f5294A = 0;
        this.f5317y = 0;
        this.z = 0;
        this.f5312s = null;
        this.f5313t = null;
        this.f5314u = null;
        this.f5295B = false;
    }

    public final void c(T t4, C1353B c1353b) {
        int b4;
        PlaybackMetrics.Builder builder = this.f5306k;
        if (c1353b == null || (b4 = t4.b(c1353b.f14812a)) == -1) {
            return;
        }
        Q q4 = this.f5302g;
        int i4 = 0;
        t4.f(b4, q4, false);
        int i5 = q4.f2683c;
        S s4 = this.f5301f;
        t4.n(i5, s4);
        C0104w c0104w = s4.f2692c.f2900b;
        if (c0104w != null) {
            int F4 = J.F(c0104w.f2893a, c0104w.f2894b);
            i4 = F4 != 0 ? F4 != 1 ? F4 != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i4);
        if (s4.f2702m != -9223372036854775807L && !s4.f2700k && !s4.f2698i && !s4.a()) {
            builder.setMediaDurationMillis(J.Z(s4.f2702m));
        }
        builder.setPlaybackType(s4.a() ? 2 : 1);
        this.f5295B = true;
    }

    public final void d(C0255a c0255a, String str) {
        C1353B c1353b = c0255a.f5260d;
        if ((c1353b == null || !c1353b.b()) && str.equals(this.f5305j)) {
            b();
        }
        this.f5303h.remove(str);
        this.f5304i.remove(str);
    }

    public final void e(int i4, long j4, C0097o c0097o, int i5) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i6;
        timeSinceCreatedMillis = g.k(i4).setTimeSinceCreatedMillis(j4 - this.f5300e);
        if (c0097o != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i5 != 1) {
                i6 = 3;
                if (i5 != 2) {
                    i6 = i5 != 3 ? 1 : 4;
                }
            } else {
                i6 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i6);
            String str = c0097o.f2868m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c0097o.n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c0097o.f2866k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i7 = c0097o.f2865j;
            if (i7 != -1) {
                timeSinceCreatedMillis.setBitrate(i7);
            }
            int i8 = c0097o.f2874u;
            if (i8 != -1) {
                timeSinceCreatedMillis.setWidth(i8);
            }
            int i9 = c0097o.v;
            if (i9 != -1) {
                timeSinceCreatedMillis.setHeight(i9);
            }
            int i10 = c0097o.f2846F;
            if (i10 != -1) {
                timeSinceCreatedMillis.setChannelCount(i10);
            }
            int i11 = c0097o.f2847G;
            if (i11 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i11);
            }
            String str4 = c0097o.f2859d;
            if (str4 != null) {
                String str5 = J.f3263a;
                String[] split = str4.split(TokenBuilder.TOKEN_DELIMITER, -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f4 = c0097o.f2877y;
            if (f4 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f4);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f5295B = true;
        build = timeSinceCreatedMillis.build();
        this.f5297b.execute(new R1.e(this, 13, build));
    }
}
