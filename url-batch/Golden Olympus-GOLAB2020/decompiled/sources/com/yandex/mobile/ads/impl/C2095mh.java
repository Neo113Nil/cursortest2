package com.yandex.mobile.ads.impl;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import ru.rustore.sdk.user.profile.UserProfileProvider;

/* renamed from: com.yandex.mobile.ads.impl.mh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2095mh {

    /* renamed from: A, reason: collision with root package name */
    private long f29056A;

    /* renamed from: B, reason: collision with root package name */
    private long f29057B;

    /* renamed from: C, reason: collision with root package name */
    private long f29058C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f29059D;

    /* renamed from: E, reason: collision with root package name */
    private long f29060E;

    /* renamed from: F, reason: collision with root package name */
    private long f29061F;

    /* renamed from: a, reason: collision with root package name */
    private final a f29062a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f29063b;

    /* renamed from: c, reason: collision with root package name */
    private AudioTrack f29064c;

    /* renamed from: d, reason: collision with root package name */
    private int f29065d;

    /* renamed from: e, reason: collision with root package name */
    private int f29066e;

    /* renamed from: f, reason: collision with root package name */
    private C2071lh f29067f;

    /* renamed from: g, reason: collision with root package name */
    private int f29068g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f29069h;

    /* renamed from: i, reason: collision with root package name */
    private long f29070i;

    /* renamed from: j, reason: collision with root package name */
    private float f29071j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f29072k;

    /* renamed from: l, reason: collision with root package name */
    private long f29073l;

    /* renamed from: m, reason: collision with root package name */
    private long f29074m;

    /* renamed from: n, reason: collision with root package name */
    private Method f29075n;

    /* renamed from: o, reason: collision with root package name */
    private long f29076o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f29077p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f29078q;

    /* renamed from: r, reason: collision with root package name */
    private long f29079r;

    /* renamed from: s, reason: collision with root package name */
    private long f29080s;

    /* renamed from: t, reason: collision with root package name */
    private long f29081t;

    /* renamed from: u, reason: collision with root package name */
    private long f29082u;

    /* renamed from: v, reason: collision with root package name */
    private int f29083v;

    /* renamed from: w, reason: collision with root package name */
    private int f29084w;

    /* renamed from: x, reason: collision with root package name */
    private long f29085x;

    /* renamed from: y, reason: collision with root package name */
    private long f29086y;

    /* renamed from: z, reason: collision with root package name */
    private long f29087z;

    /* renamed from: com.yandex.mobile.ads.impl.mh$a */
    public interface a {
        void a(int i4, long j4);

        void a(long j4);

        void a(long j4, long j5, long j6, long j7);

        void b(long j4);

        void b(long j4, long j5, long j6, long j7);
    }

    public C2095mh(a aVar) {
        this.f29062a = (a) C2253tf.a(aVar);
        if (u82.f32873a >= 18) {
            try {
                this.f29075n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f29063b = new long[10];
    }

    private long a(long j4) {
        return (j4 * 1000000) / this.f29068g;
    }

    public final int b(long j4) {
        return this.f29066e - ((int) (j4 - (a() * this.f29065d)));
    }

    public final void c(long j4) {
        this.f29087z = a();
        this.f29085x = SystemClock.elapsedRealtime() * 1000;
        this.f29056A = j4;
    }

    public final boolean d(long j4) {
        if (j4 > a()) {
            return true;
        }
        if (!this.f29069h) {
            return false;
        }
        AudioTrack audioTrack = this.f29064c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 2 && a() == 0;
    }

    public final boolean e(long j4) {
        return this.f29086y != -9223372036854775807L && j4 > 0 && SystemClock.elapsedRealtime() - this.f29086y >= 200;
    }

    public final boolean f(long j4) {
        AudioTrack audioTrack = this.f29064c;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.f29069h) {
            if (playState == 2) {
                this.f29077p = false;
                return false;
            }
            if (playState == 1 && a() == 0) {
                return false;
            }
        }
        boolean z4 = this.f29077p;
        boolean d4 = d(j4);
        this.f29077p = d4;
        if (z4 && !d4 && playState != 1) {
            this.f29062a.a(this.f29066e, u82.b(this.f29070i));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(boolean z4) {
        long j4;
        boolean d4;
        long a4;
        long j5;
        float f4;
        long j6;
        long j7;
        long round;
        Method method;
        AudioTrack audioTrack = this.f29064c;
        audioTrack.getClass();
        long j8 = 1000;
        if (audioTrack.getPlayState() == 3) {
            long a5 = a(a());
            if (a5 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.f29074m >= UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS) {
                    long[] jArr = this.f29063b;
                    int i4 = this.f29083v;
                    jArr[i4] = a5 - nanoTime;
                    this.f29083v = (i4 + 1) % 10;
                    int i5 = this.f29084w;
                    if (i5 < 10) {
                        this.f29084w = i5 + 1;
                    }
                    this.f29074m = nanoTime;
                    this.f29073l = 0L;
                    int i6 = 0;
                    while (true) {
                        int i7 = this.f29084w;
                        if (i6 >= i7) {
                            break;
                        }
                        this.f29073l = (this.f29063b[i6] / i7) + this.f29073l;
                        i6++;
                        j8 = j8;
                    }
                }
                j4 = j8;
                if (!this.f29069h) {
                    C2071lh c2071lh = this.f29067f;
                    c2071lh.getClass();
                    if (c2071lh.a(nanoTime)) {
                        long c4 = c2071lh.c();
                        long b4 = c2071lh.b();
                        if (Math.abs(c4 - nanoTime) > 5000000) {
                            this.f29062a.b(b4, c4, nanoTime, a5);
                            c2071lh.e();
                        } else if (Math.abs(a(b4) - a5) > 5000000) {
                            this.f29062a.a(b4, c4, nanoTime, a5);
                            c2071lh.e();
                        } else {
                            c2071lh.a();
                        }
                    }
                    if (this.f29078q && (method = this.f29075n) != null && nanoTime - this.f29079r >= 500000) {
                        try {
                            AudioTrack audioTrack2 = this.f29064c;
                            audioTrack2.getClass();
                            Integer num = (Integer) method.invoke(audioTrack2, null);
                            int i8 = u82.f32873a;
                            long intValue = (num.intValue() * j4) - this.f29070i;
                            this.f29076o = intValue;
                            long max = Math.max(intValue, 0L);
                            this.f29076o = max;
                            if (max > 5000000) {
                                this.f29062a.b(max);
                                this.f29076o = 0L;
                            }
                        } catch (Exception unused) {
                            this.f29075n = null;
                        }
                        this.f29079r = nanoTime;
                    }
                }
                long nanoTime2 = System.nanoTime() / j4;
                C2071lh c2071lh2 = this.f29067f;
                c2071lh2.getClass();
                d4 = c2071lh2.d();
                if (d4) {
                    a4 = this.f29084w == 0 ? a(a()) : this.f29073l + nanoTime2;
                    if (!z4) {
                        a4 = Math.max(0L, a4 - this.f29076o);
                    }
                } else {
                    long a6 = a(c2071lh2.b());
                    long c5 = nanoTime2 - c2071lh2.c();
                    float f5 = this.f29071j;
                    int i9 = u82.f32873a;
                    if (f5 != 1.0f) {
                        c5 = Math.round(c5 * f5);
                    }
                    a4 = c5 + a6;
                }
                if (this.f29059D != d4) {
                    this.f29061F = this.f29058C;
                    this.f29060E = this.f29057B;
                }
                j5 = nanoTime2 - this.f29061F;
                if (j5 >= 1000000) {
                    long j9 = this.f29060E;
                    float f6 = this.f29071j;
                    int i10 = u82.f32873a;
                    if (f6 == 1.0f) {
                        f4 = 1.0f;
                        j6 = a4;
                        j7 = 1000000;
                        round = j5;
                    } else {
                        f4 = 1.0f;
                        j6 = a4;
                        j7 = 1000000;
                        round = Math.round(j5 * f6);
                    }
                    long j10 = (j5 * j4) / j7;
                    a4 = (((j4 - j10) * (round + j9)) + (j6 * j10)) / j4;
                } else {
                    f4 = 1.0f;
                }
                if (!this.f29072k) {
                    long j11 = this.f29057B;
                    if (a4 > j11) {
                        this.f29072k = true;
                        long b5 = u82.b(a4 - j11);
                        float f7 = this.f29071j;
                        if (f7 != f4) {
                            b5 = Math.round(b5 / f7);
                        }
                        this.f29062a.a(System.currentTimeMillis() - u82.b(b5));
                    }
                }
                this.f29058C = nanoTime2;
                this.f29057B = a4;
                this.f29059D = d4;
                return a4;
            }
        }
        j4 = 1000;
        long nanoTime22 = System.nanoTime() / j4;
        C2071lh c2071lh22 = this.f29067f;
        c2071lh22.getClass();
        d4 = c2071lh22.d();
        if (d4) {
        }
        if (this.f29059D != d4) {
        }
        j5 = nanoTime22 - this.f29061F;
        if (j5 >= 1000000) {
        }
        if (!this.f29072k) {
        }
        this.f29058C = nanoTime22;
        this.f29057B = a4;
        this.f29059D = d4;
        return a4;
    }

    public final boolean b() {
        AudioTrack audioTrack = this.f29064c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final void e() {
        C2071lh c2071lh = this.f29067f;
        c2071lh.getClass();
        c2071lh.f();
    }

    public final boolean c() {
        this.f29073l = 0L;
        this.f29084w = 0;
        this.f29083v = 0;
        this.f29074m = 0L;
        this.f29058C = 0L;
        this.f29061F = 0L;
        this.f29072k = false;
        if (this.f29085x != -9223372036854775807L) {
            return false;
        }
        C2071lh c2071lh = this.f29067f;
        c2071lh.getClass();
        c2071lh.f();
        return true;
    }

    public final void d() {
        this.f29073l = 0L;
        this.f29084w = 0;
        this.f29083v = 0;
        this.f29074m = 0L;
        this.f29058C = 0L;
        this.f29061F = 0L;
        this.f29072k = false;
        this.f29064c = null;
        this.f29067f = null;
    }

    private long a() {
        AudioTrack audioTrack = this.f29064c;
        audioTrack.getClass();
        if (this.f29085x != -9223372036854775807L) {
            return Math.min(this.f29056A, this.f29087z + ((((SystemClock.elapsedRealtime() * 1000) - this.f29085x) * this.f29068g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.f29069h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f29082u = this.f29080s;
            }
            playbackHeadPosition += this.f29082u;
        }
        if (u82.f32873a <= 29) {
            if (playbackHeadPosition == 0 && this.f29080s > 0 && playState == 3) {
                if (this.f29086y == -9223372036854775807L) {
                    this.f29086y = SystemClock.elapsedRealtime();
                }
                return this.f29080s;
            }
            this.f29086y = -9223372036854775807L;
        }
        if (this.f29080s > playbackHeadPosition) {
            this.f29081t++;
        }
        this.f29080s = playbackHeadPosition;
        return playbackHeadPosition + (this.f29081t << 32);
    }

    public final void a(AudioTrack audioTrack, boolean z4, int i4, int i5, int i6) {
        this.f29064c = audioTrack;
        this.f29065d = i5;
        this.f29066e = i6;
        this.f29067f = new C2071lh(audioTrack);
        this.f29068g = audioTrack.getSampleRate();
        this.f29069h = z4 && u82.f32873a < 23 && (i4 == 5 || i4 == 6);
        boolean e4 = u82.e(i4);
        this.f29078q = e4;
        this.f29070i = e4 ? a(i6 / i5) : -9223372036854775807L;
        this.f29080s = 0L;
        this.f29081t = 0L;
        this.f29082u = 0L;
        this.f29077p = false;
        this.f29085x = -9223372036854775807L;
        this.f29086y = -9223372036854775807L;
        this.f29079r = 0L;
        this.f29076o = 0L;
        this.f29071j = 1.0f;
    }

    public final void a(float f4) {
        this.f29071j = f4;
        C2071lh c2071lh = this.f29067f;
        if (c2071lh != null) {
            c2071lh.f();
        }
    }
}
