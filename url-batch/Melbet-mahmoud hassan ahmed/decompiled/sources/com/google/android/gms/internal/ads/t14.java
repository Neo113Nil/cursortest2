package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
final class t14 {
    private long A;
    private long B;
    private long C;
    private boolean D;
    private long E;
    private long F;

    /* renamed from: a, reason: collision with root package name */
    private final s14 f12029a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f12030b;

    /* renamed from: c, reason: collision with root package name */
    private AudioTrack f12031c;

    /* renamed from: d, reason: collision with root package name */
    private int f12032d;

    /* renamed from: e, reason: collision with root package name */
    private int f12033e;

    /* renamed from: f, reason: collision with root package name */
    private r14 f12034f;

    /* renamed from: g, reason: collision with root package name */
    private int f12035g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f12036h;

    /* renamed from: i, reason: collision with root package name */
    private long f12037i;

    /* renamed from: j, reason: collision with root package name */
    private float f12038j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f12039k;

    /* renamed from: l, reason: collision with root package name */
    private long f12040l;

    /* renamed from: m, reason: collision with root package name */
    private long f12041m;

    /* renamed from: n, reason: collision with root package name */
    private Method f12042n;

    /* renamed from: o, reason: collision with root package name */
    private long f12043o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f12044p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f12045q;

    /* renamed from: r, reason: collision with root package name */
    private long f12046r;

    /* renamed from: s, reason: collision with root package name */
    private long f12047s;

    /* renamed from: t, reason: collision with root package name */
    private long f12048t;

    /* renamed from: u, reason: collision with root package name */
    private long f12049u;

    /* renamed from: v, reason: collision with root package name */
    private int f12050v;

    /* renamed from: w, reason: collision with root package name */
    private int f12051w;

    /* renamed from: x, reason: collision with root package name */
    private long f12052x;

    /* renamed from: y, reason: collision with root package name */
    private long f12053y;

    /* renamed from: z, reason: collision with root package name */
    private long f12054z;

    public t14(s14 s14Var) {
        this.f12029a = s14Var;
        if (n13.f8865a >= 18) {
            try {
                this.f12042n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f12030b = new long[10];
    }

    private final long m(long j7) {
        return (j7 * 1000000) / this.f12035g;
    }

    private final long n() {
        AudioTrack audioTrack = this.f12031c;
        Objects.requireNonNull(audioTrack);
        if (this.f12052x != -9223372036854775807L) {
            return Math.min(this.A, this.f12054z + ((((SystemClock.elapsedRealtime() * 1000) - this.f12052x) * this.f12035g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.f12036h) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.f12049u = this.f12047s;
                }
                playState = 2;
            }
            playbackHeadPosition += this.f12049u;
        }
        if (n13.f8865a <= 29) {
            if (playbackHeadPosition == 0 && this.f12047s > 0 && playState == 3) {
                if (this.f12053y == -9223372036854775807L) {
                    this.f12053y = SystemClock.elapsedRealtime();
                }
                return this.f12047s;
            }
            this.f12053y = -9223372036854775807L;
        }
        if (this.f12047s > playbackHeadPosition) {
            this.f12048t++;
        }
        this.f12047s = playbackHeadPosition;
        return playbackHeadPosition + (this.f12048t << 32);
    }

    private final void o() {
        this.f12040l = 0L;
        this.f12051w = 0;
        this.f12050v = 0;
        this.f12041m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.f12039k = false;
    }

    public final int a(long j7) {
        return this.f12033e - ((int) (j7 - (n() * this.f12032d)));
    }

    public final long b(boolean z6) {
        long m7;
        l14 l14Var;
        l14 l14Var2;
        h14 h14Var;
        Method method;
        r14 r14Var;
        long x6;
        long y6;
        String sb;
        long x7;
        long y7;
        t14 t14Var = this;
        AudioTrack audioTrack = t14Var.f12031c;
        Objects.requireNonNull(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            long m8 = t14Var.m(n());
            if (m8 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - t14Var.f12041m >= 30000) {
                    long[] jArr = t14Var.f12030b;
                    int i7 = t14Var.f12050v;
                    jArr[i7] = m8 - nanoTime;
                    t14Var.f12050v = (i7 + 1) % 10;
                    int i8 = t14Var.f12051w;
                    if (i8 < 10) {
                        t14Var.f12051w = i8 + 1;
                    }
                    t14Var.f12041m = nanoTime;
                    t14Var.f12040l = 0L;
                    int i9 = 0;
                    while (true) {
                        int i10 = t14Var.f12051w;
                        if (i9 >= i10) {
                            break;
                        }
                        t14Var.f12040l += t14Var.f12030b[i9] / i10;
                        i9++;
                    }
                }
                if (!t14Var.f12036h) {
                    r14 r14Var2 = t14Var.f12034f;
                    Objects.requireNonNull(r14Var2);
                    if (r14Var2.g(nanoTime)) {
                        long b7 = r14Var2.b();
                        long a7 = r14Var2.a();
                        if (Math.abs(b7 - nanoTime) > 5000000) {
                            d24 d24Var = (d24) t14Var.f12029a;
                            x7 = d24Var.f4055a.x();
                            y7 = d24Var.f4055a.y();
                            r14Var = r14Var2;
                            StringBuilder sb2 = new StringBuilder(180);
                            sb2.append("Spurious audio timestamp (system clock mismatch): ");
                            sb2.append(a7);
                            sb2.append(", ");
                            sb2.append(b7);
                            sb2.append(", ");
                            sb2.append(nanoTime);
                            sb2.append(", ");
                            sb2.append(m8);
                            sb2.append(", ");
                            sb2.append(x7);
                            sb2.append(", ");
                            sb2.append(y7);
                            sb = sb2.toString();
                        } else {
                            r14Var = r14Var2;
                            if (Math.abs(t14Var.m(a7) - m8) > 5000000) {
                                d24 d24Var2 = (d24) t14Var.f12029a;
                                x6 = d24Var2.f4055a.x();
                                y6 = d24Var2.f4055a.y();
                                StringBuilder sb3 = new StringBuilder(182);
                                sb3.append("Spurious audio timestamp (frame position mismatch): ");
                                sb3.append(a7);
                                sb3.append(", ");
                                sb3.append(b7);
                                sb3.append(", ");
                                sb3.append(nanoTime);
                                sb3.append(", ");
                                sb3.append(m8);
                                sb3.append(", ");
                                sb3.append(x6);
                                sb3.append(", ");
                                sb3.append(y6);
                                sb = sb3.toString();
                            } else {
                                r14Var.c();
                                t14Var = this;
                            }
                        }
                        Log.w("DefaultAudioSink", sb);
                        r14Var.d();
                        t14Var = this;
                    }
                    if (t14Var.f12045q && (method = t14Var.f12042n) != null && nanoTime - t14Var.f12046r >= 500000) {
                        try {
                            AudioTrack audioTrack2 = t14Var.f12031c;
                            Objects.requireNonNull(audioTrack2);
                            Integer num = (Integer) method.invoke(audioTrack2, new Object[0]);
                            int i11 = n13.f8865a;
                            long intValue = (num.intValue() * 1000) - t14Var.f12037i;
                            t14Var.f12043o = intValue;
                            long max = Math.max(intValue, 0L);
                            t14Var.f12043o = max;
                            if (max > 5000000) {
                                StringBuilder sb4 = new StringBuilder(61);
                                sb4.append("Ignoring impossibly large audio latency: ");
                                sb4.append(max);
                                Log.w("DefaultAudioSink", sb4.toString());
                                t14Var.f12043o = 0L;
                            }
                        } catch (Exception unused) {
                            t14Var.f12042n = null;
                        }
                        t14Var.f12046r = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        r14 r14Var3 = t14Var.f12034f;
        Objects.requireNonNull(r14Var3);
        boolean f7 = r14Var3.f();
        if (f7) {
            m7 = t14Var.m(r14Var3.a()) + n13.V(nanoTime2 - r14Var3.b(), t14Var.f12038j);
        } else {
            m7 = t14Var.f12051w == 0 ? t14Var.m(n()) : t14Var.f12040l + nanoTime2;
            if (!z6) {
                m7 = Math.max(0L, m7 - t14Var.f12043o);
            }
        }
        if (t14Var.D != f7) {
            t14Var.F = t14Var.C;
            t14Var.E = t14Var.B;
        }
        long j7 = nanoTime2 - t14Var.F;
        if (j7 < 1000000) {
            long j8 = (j7 * 1000) / 1000000;
            m7 = ((m7 * j8) + ((1000 - j8) * (t14Var.E + n13.V(j7, t14Var.f12038j)))) / 1000;
        }
        if (!t14Var.f12039k) {
            long j9 = t14Var.B;
            if (m7 > j9) {
                t14Var.f12039k = true;
                long currentTimeMillis = System.currentTimeMillis() - nz3.d(n13.X(nz3.d(m7 - j9), t14Var.f12038j));
                d24 d24Var3 = (d24) t14Var.f12029a;
                l14Var = d24Var3.f4055a.f6025k;
                if (l14Var != null) {
                    l14Var2 = d24Var3.f4055a.f6025k;
                    h14Var = ((k24) l14Var2).f7340a.H0;
                    h14Var.r(currentTimeMillis);
                }
            }
        }
        t14Var.C = nanoTime2;
        t14Var.B = m7;
        t14Var.D = f7;
        return m7;
    }

    public final long c(long j7) {
        return nz3.d(m(-n()));
    }

    public final void d(long j7) {
        this.f12054z = n();
        this.f12052x = SystemClock.elapsedRealtime() * 1000;
        this.A = j7;
    }

    public final void e() {
        o();
        this.f12031c = null;
        this.f12034f = null;
    }

    public final void f(AudioTrack audioTrack, boolean z6, int i7, int i8, int i9) {
        this.f12031c = audioTrack;
        this.f12032d = i8;
        this.f12033e = i9;
        this.f12034f = new r14(audioTrack);
        this.f12035g = audioTrack.getSampleRate();
        this.f12036h = false;
        boolean r7 = n13.r(i7);
        this.f12045q = r7;
        this.f12037i = r7 ? m(i9 / i8) : -9223372036854775807L;
        this.f12047s = 0L;
        this.f12048t = 0L;
        this.f12049u = 0L;
        this.f12044p = false;
        this.f12052x = -9223372036854775807L;
        this.f12053y = -9223372036854775807L;
        this.f12046r = 0L;
        this.f12043o = 0L;
        this.f12038j = 1.0f;
    }

    public final void g() {
        r14 r14Var = this.f12034f;
        Objects.requireNonNull(r14Var);
        r14Var.e();
    }

    public final boolean h(long j7) {
        if (j7 > n()) {
            return true;
        }
        if (!this.f12036h) {
            return false;
        }
        AudioTrack audioTrack = this.f12031c;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 2 && n() == 0;
    }

    public final boolean i() {
        AudioTrack audioTrack = this.f12031c;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    public final boolean j(long j7) {
        return this.f12053y != -9223372036854775807L && j7 > 0 && SystemClock.elapsedRealtime() - this.f12053y >= 200;
    }

    public final boolean k(long j7) {
        l14 l14Var;
        long j8;
        l14 l14Var2;
        h14 h14Var;
        AudioTrack audioTrack = this.f12031c;
        Objects.requireNonNull(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.f12036h) {
            if (playState == 2) {
                this.f12044p = false;
                return false;
            }
            if (playState == 1) {
                if (n() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z6 = this.f12044p;
        boolean h7 = h(j7);
        this.f12044p = h7;
        if (z6 && !h7 && playState != 1) {
            s14 s14Var = this.f12029a;
            int i7 = this.f12033e;
            long d7 = nz3.d(this.f12037i);
            d24 d24Var = (d24) s14Var;
            l14Var = d24Var.f4055a.f6025k;
            if (l14Var != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                j8 = d24Var.f4055a.M;
                l14Var2 = d24Var.f4055a.f6025k;
                h14Var = ((k24) l14Var2).f7340a.H0;
                h14Var.t(i7, d7, elapsedRealtime - j8);
            }
        }
        return true;
    }

    public final boolean l() {
        o();
        if (this.f12052x != -9223372036854775807L) {
            return false;
        }
        r14 r14Var = this.f12034f;
        Objects.requireNonNull(r14Var);
        r14Var.e();
        return true;
    }
}
