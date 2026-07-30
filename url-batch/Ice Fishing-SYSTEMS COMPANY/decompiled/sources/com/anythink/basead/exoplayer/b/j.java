package com.anythink.basead.exoplayer.b;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.k.af;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final int f6638a = 1;

    /* renamed from: b, reason: collision with root package name */
    private static final int f6639b = 2;

    /* renamed from: c, reason: collision with root package name */
    private static final int f6640c = 3;

    /* renamed from: d, reason: collision with root package name */
    private static final long f6641d = 5000000;

    /* renamed from: e, reason: collision with root package name */
    private static final long f6642e = 5000000;

    /* renamed from: f, reason: collision with root package name */
    private static final long f6643f = 200;

    /* renamed from: g, reason: collision with root package name */
    private static final int f6644g = 10;

    /* renamed from: h, reason: collision with root package name */
    private static final int f6645h = 30000;
    private static final int i = 500000;

    /* renamed from: A, reason: collision with root package name */
    private long f6646A;

    /* renamed from: B, reason: collision with root package name */
    private long f6647B;

    /* renamed from: C, reason: collision with root package name */
    private int f6648C;

    /* renamed from: D, reason: collision with root package name */
    private int f6649D;

    /* renamed from: E, reason: collision with root package name */
    private long f6650E;

    /* renamed from: F, reason: collision with root package name */
    private long f6651F;

    /* renamed from: G, reason: collision with root package name */
    private long f6652G;

    /* renamed from: H, reason: collision with root package name */
    private long f6653H;

    /* renamed from: j, reason: collision with root package name */
    private final a f6654j;

    /* renamed from: k, reason: collision with root package name */
    private final long[] f6655k;

    /* renamed from: l, reason: collision with root package name */
    private AudioTrack f6656l;

    /* renamed from: m, reason: collision with root package name */
    private int f6657m;

    /* renamed from: n, reason: collision with root package name */
    private int f6658n;

    /* renamed from: o, reason: collision with root package name */
    private i f6659o;

    /* renamed from: p, reason: collision with root package name */
    private int f6660p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f6661q;

    /* renamed from: r, reason: collision with root package name */
    private long f6662r;

    /* renamed from: s, reason: collision with root package name */
    private long f6663s;

    /* renamed from: t, reason: collision with root package name */
    private long f6664t;

    /* renamed from: u, reason: collision with root package name */
    private Method f6665u;

    /* renamed from: v, reason: collision with root package name */
    private long f6666v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f6667w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f6668x;

    /* renamed from: y, reason: collision with root package name */
    private long f6669y;

    /* renamed from: z, reason: collision with root package name */
    private long f6670z;

    public interface a {
        void a(int i, long j9);

        void a(long j9);

        void a(long j9, long j10, long j11, long j12);

        void b(long j9, long j10, long j11, long j12);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public j(a aVar) {
        this.f6654j = (a) C0544a.a(aVar);
        if (af.f8503a >= 18) {
            try {
                this.f6665u = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f6655k = new long[10];
    }

    private void f(long j9) {
        Method method;
        if (!this.f6668x || (method = this.f6665u) == null || j9 - this.f6669y < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) method.invoke(this.f6656l, null)).intValue() * 1000) - this.f6662r;
            this.f6666v = intValue;
            long max = Math.max(intValue, 0L);
            this.f6666v = max;
            if (max > 5000000) {
                this.f6654j.a(max);
                this.f6666v = 0L;
            }
        } catch (Exception unused) {
            this.f6665u = null;
        }
        this.f6669y = j9;
    }

    private long g(long j9) {
        return (j9 * 1000000) / this.f6660p;
    }

    private long h() {
        return g(i());
    }

    private long i() {
        if (this.f6650E != com.anythink.basead.exoplayer.b.f6539b) {
            return Math.min(this.f6653H, this.f6652G + ((((SystemClock.elapsedRealtime() * 1000) - this.f6650E) * this.f6660p) / 1000000));
        }
        int playState = this.f6656l.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = this.f6656l.getPlaybackHeadPosition() & 4294967295L;
        if (this.f6661q) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f6647B = this.f6670z;
            }
            playbackHeadPosition += this.f6647B;
        }
        if (af.f8503a <= 28) {
            if (playbackHeadPosition == 0 && this.f6670z > 0 && playState == 3) {
                if (this.f6651F == com.anythink.basead.exoplayer.b.f6539b) {
                    this.f6651F = SystemClock.elapsedRealtime();
                }
                return this.f6670z;
            }
            this.f6651F = com.anythink.basead.exoplayer.b.f6539b;
        }
        if (this.f6670z > playbackHeadPosition) {
            this.f6646A++;
        }
        this.f6670z = playbackHeadPosition;
        return playbackHeadPosition + (this.f6646A << 32);
    }

    public final void a(AudioTrack audioTrack, int i4, int i9, int i10) {
        this.f6656l = audioTrack;
        this.f6657m = i9;
        this.f6658n = i10;
        this.f6659o = new i(audioTrack);
        this.f6660p = audioTrack.getSampleRate();
        this.f6661q = af.f8503a < 23 && (i4 == 5 || i4 == 6);
        boolean b9 = af.b(i4);
        this.f6668x = b9;
        this.f6662r = b9 ? g(i10 / i9) : -9223372036854775807L;
        this.f6670z = 0L;
        this.f6646A = 0L;
        this.f6647B = 0L;
        this.f6667w = false;
        this.f6650E = com.anythink.basead.exoplayer.b.f6539b;
        this.f6651F = com.anythink.basead.exoplayer.b.f6539b;
        this.f6666v = 0L;
    }

    public final boolean b() {
        return this.f6656l.getPlayState() == 3;
    }

    public final boolean c(long j9) {
        return this.f6651F != com.anythink.basead.exoplayer.b.f6539b && j9 > 0 && SystemClock.elapsedRealtime() - this.f6651F >= f6643f;
    }

    public final void d(long j9) {
        this.f6652G = i();
        this.f6650E = SystemClock.elapsedRealtime() * 1000;
        this.f6653H = j9;
    }

    public final boolean e(long j9) {
        return j9 > i() || g();
    }

    private boolean g() {
        return this.f6661q && this.f6656l.getPlayState() == 2 && i() == 0;
    }

    public final int b(long j9) {
        return this.f6658n - ((int) (j9 - (i() * this.f6657m)));
    }

    private void e() {
        long h9 = h();
        if (h9 == 0) {
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.f6664t >= 30000) {
            long[] jArr = this.f6655k;
            int i4 = this.f6648C;
            jArr[i4] = h9 - nanoTime;
            this.f6648C = (i4 + 1) % 10;
            int i9 = this.f6649D;
            if (i9 < 10) {
                this.f6649D = i9 + 1;
            }
            this.f6664t = nanoTime;
            this.f6663s = 0L;
            int i10 = 0;
            while (true) {
                int i11 = this.f6649D;
                if (i10 >= i11) {
                    break;
                }
                this.f6663s = (this.f6655k[i10] / i11) + this.f6663s;
                i10++;
            }
        }
        if (this.f6661q) {
            return;
        }
        if (this.f6659o.a(nanoTime)) {
            long f6 = this.f6659o.f();
            long g9 = this.f6659o.g();
            if (Math.abs(f6 - nanoTime) > 5000000) {
                this.f6654j.b(g9, f6, nanoTime, h9);
                this.f6659o.a();
            } else if (Math.abs(g(g9) - h9) > 5000000) {
                this.f6654j.a(g9, f6, nanoTime, h9);
                this.f6659o.a();
            } else {
                this.f6659o.b();
            }
        }
        f(nanoTime);
    }

    public final boolean c() {
        f();
        if (this.f6650E != com.anythink.basead.exoplayer.b.f6539b) {
            return false;
        }
        this.f6659o.e();
        return true;
    }

    public final void d() {
        f();
        this.f6656l = null;
        this.f6659o = null;
    }

    private void f() {
        this.f6663s = 0L;
        this.f6649D = 0;
        this.f6648C = 0;
        this.f6664t = 0L;
    }

    public final long a(boolean z8) {
        long j9;
        if (this.f6656l.getPlayState() == 3) {
            long h9 = h();
            if (h9 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.f6664t >= 30000) {
                    long[] jArr = this.f6655k;
                    int i4 = this.f6648C;
                    jArr[i4] = h9 - nanoTime;
                    this.f6648C = (i4 + 1) % 10;
                    int i9 = this.f6649D;
                    if (i9 < 10) {
                        this.f6649D = i9 + 1;
                    }
                    this.f6664t = nanoTime;
                    this.f6663s = 0L;
                    int i10 = 0;
                    while (true) {
                        int i11 = this.f6649D;
                        if (i10 >= i11) {
                            break;
                        }
                        this.f6663s = (this.f6655k[i10] / i11) + this.f6663s;
                        i10++;
                    }
                }
                if (!this.f6661q) {
                    if (this.f6659o.a(nanoTime)) {
                        long f6 = this.f6659o.f();
                        long g9 = this.f6659o.g();
                        if (Math.abs(f6 - nanoTime) > 5000000) {
                            this.f6654j.b(g9, f6, nanoTime, h9);
                            this.f6659o.a();
                        } else if (Math.abs(g(g9) - h9) > 5000000) {
                            this.f6654j.a(g9, f6, nanoTime, h9);
                            this.f6659o.a();
                        } else {
                            this.f6659o.b();
                        }
                    }
                    f(nanoTime);
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.f6659o.c()) {
            long g10 = g(this.f6659o.g());
            return !this.f6659o.d() ? g10 : (nanoTime2 - this.f6659o.f()) + g10;
        }
        if (this.f6649D == 0) {
            j9 = h();
        } else {
            j9 = nanoTime2 + this.f6663s;
        }
        return !z8 ? j9 - this.f6666v : j9;
    }

    public final void a() {
        this.f6659o.e();
    }

    public final boolean a(long j9) {
        a aVar;
        int playState = this.f6656l.getPlayState();
        if (this.f6661q) {
            if (playState == 2) {
                this.f6667w = false;
                return false;
            }
            if (playState == 1 && i() == 0) {
                return false;
            }
        }
        boolean z8 = this.f6667w;
        boolean e6 = e(j9);
        this.f6667w = e6;
        if (z8 && !e6 && playState != 1 && (aVar = this.f6654j) != null) {
            aVar.a(this.f6658n, com.anythink.basead.exoplayer.b.a(this.f6662r));
        }
        return true;
    }

    private void a(long j9, long j10) {
        if (this.f6659o.a(j9)) {
            long f6 = this.f6659o.f();
            long g9 = this.f6659o.g();
            if (Math.abs(f6 - j9) > 5000000) {
                this.f6654j.b(g9, f6, j9, j10);
                this.f6659o.a();
            } else if (Math.abs(g(g9) - j10) > 5000000) {
                this.f6654j.a(g9, f6, j9, j10);
                this.f6659o.a();
            } else {
                this.f6659o.b();
            }
        }
    }

    private static boolean a(int i4) {
        if (af.f8503a < 23) {
            return i4 == 5 || i4 == 6;
        }
        return false;
    }
}
