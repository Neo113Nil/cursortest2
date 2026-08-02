package c0;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import io.flutter.embedding.android.KeyboardMap;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: A, reason: collision with root package name */
    public boolean f5408A;

    /* renamed from: B, reason: collision with root package name */
    public long f5409B;

    /* renamed from: a, reason: collision with root package name */
    public final t1.h f5410a;

    /* renamed from: b, reason: collision with root package name */
    public final W.D f5411b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f5412c;

    /* renamed from: d, reason: collision with root package name */
    public final AudioTrack f5413d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5414e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5415f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5416g;

    /* renamed from: h, reason: collision with root package name */
    public final w f5417h;

    /* renamed from: i, reason: collision with root package name */
    public float f5418i;

    /* renamed from: j, reason: collision with root package name */
    public long f5419j;

    /* renamed from: k, reason: collision with root package name */
    public long f5420k;

    /* renamed from: l, reason: collision with root package name */
    public long f5421l;

    /* renamed from: m, reason: collision with root package name */
    public Method f5422m;
    public long n;
    public long o;

    /* renamed from: p, reason: collision with root package name */
    public long f5423p;

    /* renamed from: q, reason: collision with root package name */
    public long f5424q;

    /* renamed from: r, reason: collision with root package name */
    public long f5425r;

    /* renamed from: s, reason: collision with root package name */
    public int f5426s;

    /* renamed from: t, reason: collision with root package name */
    public int f5427t;

    /* renamed from: u, reason: collision with root package name */
    public long f5428u;
    public long v;

    /* renamed from: w, reason: collision with root package name */
    public long f5429w;

    /* renamed from: x, reason: collision with root package name */
    public long f5430x;

    /* renamed from: y, reason: collision with root package name */
    public long f5431y;
    public long z;

    public B(t1.h hVar, W.D d4, AudioTrack audioTrack, int i4, int i5, int i6) {
        this.f5410a = hVar;
        this.f5411b = d4;
        this.f5413d = audioTrack;
        try {
            this.f5422m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f5412c = new long[10];
        this.z = -9223372036854775807L;
        this.f5431y = -9223372036854775807L;
        this.f5417h = new w(audioTrack, hVar);
        int sampleRate = audioTrack.getSampleRate();
        this.f5414e = sampleRate;
        boolean H4 = W.J.H(i4);
        this.f5416g = H4;
        this.f5415f = H4 ? W.J.S(sampleRate, i6 / i5) : -9223372036854775807L;
        this.f5424q = 0L;
        this.f5425r = 0L;
        this.f5408A = false;
        this.f5409B = 0L;
        this.f5428u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.o = 0L;
        this.n = 0L;
        this.f5418i = 1.0f;
        this.f5419j = -9223372036854775807L;
    }

    public final long a() {
        if (this.f5428u != -9223372036854775807L) {
            return Math.min(this.f5430x, c());
        }
        this.f5411b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f5423p >= 5) {
            int playState = this.f5413d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = r4.getPlaybackHeadPosition() & KeyboardMap.kValueMask;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition != 0 || this.f5424q <= 0 || playState != 3) {
                        this.v = -9223372036854775807L;
                    } else if (this.v == -9223372036854775807L) {
                        this.v = elapsedRealtime;
                    }
                }
                long j4 = this.f5424q;
                if (j4 > playbackHeadPosition) {
                    if (this.f5408A) {
                        this.f5409B += j4;
                        this.f5408A = false;
                    } else {
                        this.f5425r++;
                    }
                }
                this.f5424q = playbackHeadPosition;
            }
            this.f5423p = elapsedRealtime;
        }
        return this.f5424q + this.f5409B + (this.f5425r << 32);
    }

    public final long b(long j4) {
        int i4 = this.f5427t;
        int i5 = this.f5414e;
        long max = Math.max(0L, (i4 == 0 ? this.f5428u != -9223372036854775807L ? W.J.S(i5, c()) : W.J.S(i5, a()) : W.J.z(j4 + this.f5420k, this.f5418i)) - this.n);
        return this.f5428u != -9223372036854775807L ? Math.min(W.J.S(i5, this.f5430x), max) : max;
    }

    public final long c() {
        if (this.f5413d.getPlayState() == 2) {
            return this.f5429w;
        }
        this.f5411b.getClass();
        return this.f5429w + W.J.U(W.J.z(W.J.M(SystemClock.elapsedRealtime()) - this.f5428u, this.f5418i), this.f5414e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j4) {
        long j5 = this.f5419j;
        if (j5 == -9223372036854775807L || j4 < j5) {
            return;
        }
        long C4 = W.J.C(j4 - j5, this.f5418i);
        this.f5411b.getClass();
        long currentTimeMillis = System.currentTimeMillis() - W.J.Z(C4);
        this.f5419j = -9223372036854775807L;
        ((z) this.f5410a.f15398b).f5636i.e(-1, new S1.g(currentTimeMillis));
    }
}
