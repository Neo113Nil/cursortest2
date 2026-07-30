package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.xP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4173xP {

    /* renamed from: a, reason: collision with root package name */
    public final Mu f35149a;

    /* renamed from: b, reason: collision with root package name */
    public final T2 f35150b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f35151c;

    /* renamed from: d, reason: collision with root package name */
    public final AudioTrack f35152d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35153e;

    /* renamed from: f, reason: collision with root package name */
    public final long f35154f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f35155g;

    /* renamed from: h, reason: collision with root package name */
    public final C3742pP f35156h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public long f35157j;

    /* renamed from: k, reason: collision with root package name */
    public long f35158k;

    /* renamed from: l, reason: collision with root package name */
    public long f35159l;

    /* renamed from: m, reason: collision with root package name */
    public Method f35160m;

    /* renamed from: n, reason: collision with root package name */
    public long f35161n;

    /* renamed from: o, reason: collision with root package name */
    public long f35162o;

    /* renamed from: p, reason: collision with root package name */
    public long f35163p;

    /* renamed from: q, reason: collision with root package name */
    public long f35164q;

    /* renamed from: r, reason: collision with root package name */
    public long f35165r;

    /* renamed from: s, reason: collision with root package name */
    public int f35166s;

    /* renamed from: t, reason: collision with root package name */
    public int f35167t;

    /* renamed from: u, reason: collision with root package name */
    public long f35168u;

    /* renamed from: v, reason: collision with root package name */
    public long f35169v;

    /* renamed from: w, reason: collision with root package name */
    public long f35170w;

    /* renamed from: x, reason: collision with root package name */
    public long f35171x;

    /* renamed from: y, reason: collision with root package name */
    public long f35172y;

    /* renamed from: z, reason: collision with root package name */
    public long f35173z;

    public C4173xP(Mu mu, T2 t22, AudioTrack audioTrack, int i, int i4, int i9) {
        this.f35149a = mu;
        this.f35150b = t22;
        this.f35152d = audioTrack;
        try {
            this.f35160m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f35151c = new long[10];
        this.f35173z = com.anythink.basead.exoplayer.b.f6539b;
        this.f35172y = com.anythink.basead.exoplayer.b.f6539b;
        this.f35156h = new C3742pP(audioTrack, mu);
        int sampleRate = audioTrack.getSampleRate();
        this.f35153e = sampleRate;
        boolean d2 = AbstractC3548lu.d(i);
        this.f35155g = d2;
        this.f35154f = d2 ? AbstractC3548lu.v(sampleRate, i9 / i4) : -9223372036854775807L;
        this.f35164q = 0L;
        this.f35165r = 0L;
        this.f35168u = com.anythink.basead.exoplayer.b.f6539b;
        this.f35169v = com.anythink.basead.exoplayer.b.f6539b;
        this.f35162o = 0L;
        this.f35161n = 0L;
        this.i = 1.0f;
        this.f35157j = com.anythink.basead.exoplayer.b.f6539b;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x035d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a() {
        float f6;
        AudioTrack audioTrack;
        long j9;
        T2 t22;
        long j10;
        C3742pP c3742pP;
        boolean z8;
        boolean z9;
        C4173xP c4173xP;
        long c4;
        int playState;
        int i;
        C3742pP c3742pP2;
        int i4;
        String str;
        long j11;
        AudioTimestamp audioTimestamp;
        boolean z10;
        long j12;
        Method method;
        int i9 = 1;
        float f9 = this.i;
        AudioTrack audioTrack2 = this.f35152d;
        int playState2 = audioTrack2.getPlayState();
        C3742pP c3742pP3 = this.f35156h;
        T2 t23 = this.f35150b;
        if (playState2 == 3) {
            t23.getClass();
            long nanoTime = System.nanoTime() / 1000;
            j9 = 1000;
            if (nanoTime - this.f35159l >= 30000) {
                long v6 = AbstractC3548lu.v(this.f35153e, d());
                if (v6 != 0) {
                    int i10 = this.f35166s;
                    if (f9 == 1.0f) {
                        c3742pP2 = c3742pP3;
                        i4 = 2;
                    } else {
                        c3742pP2 = c3742pP3;
                        i4 = 2;
                        v6 = Math.round(v6 / f9);
                    }
                    long[] jArr = this.f35151c;
                    jArr[i10] = v6 - nanoTime;
                    this.f35166s = (this.f35166s + 1) % 10;
                    int i11 = this.f35167t;
                    if (i11 < 10) {
                        this.f35167t = i11 + 1;
                    }
                    this.f35159l = nanoTime;
                    this.f35158k = 0L;
                    int i12 = 0;
                    while (true) {
                        int i13 = this.f35167t;
                        if (i12 >= i13) {
                            break;
                        }
                        this.f35158k = (jArr[i12] / i13) + this.f35158k;
                        i12++;
                        f9 = f9;
                        jArr = jArr;
                        i9 = i9;
                    }
                } else {
                    f6 = f9;
                    audioTrack = audioTrack2;
                }
            } else {
                c3742pP2 = c3742pP3;
                i4 = 2;
            }
            int i14 = i9;
            float f10 = f9;
            long j13 = this.f35161n;
            if (this.f35155g && (method = this.f35160m) != null && nanoTime - this.f35162o >= 500000) {
                try {
                    Integer num = (Integer) method.invoke(audioTrack2, new Object[0]);
                    String str2 = AbstractC3548lu.f32613a;
                    long intValue = (num.intValue() * 1000) - this.f35154f;
                    this.f35161n = intValue;
                    long max = Math.max(intValue, 0L);
                    this.f35161n = max;
                    if (max > 10000000) {
                        StringBuilder sb = new StringBuilder(String.valueOf(max).length() + 41);
                        sb.append("Ignoring impossibly large audio latency: ");
                        sb.append(max);
                        AbstractC3217fl.I("AudioTrackAudioOutput", sb.toString());
                        this.f35161n = 0L;
                    }
                } catch (Exception unused) {
                    this.f35160m = null;
                }
                this.f35162o = nanoTime;
            }
            int i15 = j13 != this.f35161n ? i14 : 0;
            long c9 = c(nanoTime);
            if (i15 == 0) {
                c3742pP = c3742pP2;
                j10 = 0;
                if (nanoTime - c3742pP.f33406g < c3742pP.f33405f) {
                    audioTrack = audioTrack2;
                    f6 = f10;
                    t22 = t23;
                    z8 = false;
                    t22.getClass();
                    long nanoTime2 = System.nanoTime() / j9;
                    z9 = c3742pP.f33403d == 2 ? true : z8;
                    if (z9) {
                        P4 p42 = c3742pP.f33400a;
                        c4 = AbstractC3548lu.y(nanoTime2 - (((AudioTimestamp) p42.f26838e).nanoTime / j9), f6) + AbstractC3548lu.v(c3742pP.f33401b, p42.f26836c);
                        c4173xP = this;
                    } else {
                        c4173xP = this;
                        c4 = c4173xP.c(nanoTime2);
                    }
                    playState = audioTrack.getPlayState();
                    if (playState == 3) {
                        if (z9 || ((i = c3742pP.f33403d) != 0 && i != 1)) {
                            c4173xP.b(c4);
                        }
                        long j14 = c4173xP.f35173z;
                        if (j14 != com.anythink.basead.exoplayer.b.f6539b) {
                            long j15 = c4 - c4173xP.f35172y;
                            long y6 = AbstractC3548lu.y(nanoTime2 - j14, f6);
                            long j16 = c4173xP.f35172y + y6;
                            long abs = Math.abs(j16 - c4);
                            if (j15 != j10 && abs < 1000000) {
                                long j17 = (y6 * 10) / 100;
                                c4 = Math.max(j16 - j17, Math.min(c4, j16 + j17));
                            }
                        }
                        c4173xP.f35173z = nanoTime2;
                        c4173xP.f35172y = c4;
                    } else if (playState == 1) {
                        c4173xP.b(c4);
                        return c4;
                    }
                    return c4;
                }
            } else {
                j10 = 0;
                c3742pP = c3742pP2;
            }
            c3742pP.f33406g = nanoTime;
            P4 p43 = c3742pP.f33400a;
            AudioTrack audioTrack3 = (AudioTrack) p43.f26837d;
            AudioTimestamp audioTimestamp2 = (AudioTimestamp) p43.f26838e;
            boolean timestamp = audioTrack3.getTimestamp(audioTimestamp2);
            if (timestamp) {
                str = "AudioTrackAudioOutput";
                long j18 = audioTimestamp2.framePosition;
                j11 = nanoTime;
                if (p43.f26835b > j18) {
                    p43.f26834a++;
                }
                p43.f26835b = j18;
                p43.f26836c = j18 + (p43.f26834a << 32);
            } else {
                str = "AudioTrackAudioOutput";
                j11 = nanoTime;
            }
            int i16 = c3742pP.f33401b;
            if (timestamp) {
                long j19 = audioTimestamp2.nanoTime / 1000;
                audioTrack = audioTrack2;
                t22 = t23;
                f6 = f10;
                long y8 = AbstractC3548lu.y(j11 - (((AudioTimestamp) p43.f26838e).nanoTime / 1000), f6) + AbstractC3548lu.v(i16, p43.f26836c);
                long abs2 = Math.abs(j19 - j11);
                Mu mu = c3742pP.f33402c;
                String str3 = str;
                if (abs2 > 5000000) {
                    long j20 = p43.f26836c;
                    long c10 = ((C4119wP) mu.f26395u).c();
                    z10 = timestamp;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(j20).length() + 52 + String.valueOf(j19).length() + 2 + String.valueOf(j11).length() + 2 + String.valueOf(c9).length() + 2 + String.valueOf(c10).length());
                    com.anythink.basead.b.c.i.x(sb2, "Spurious audio timestamp (system clock mismatch): ", j20, ", ");
                    sb2.append(j19);
                    j12 = j11;
                    com.anythink.basead.b.c.i.x(sb2, ", ", j12, ", ");
                    sb2.append(c9);
                    sb2.append(", ");
                    sb2.append(c10);
                    AbstractC3217fl.I(str3, sb2.toString());
                    c3742pP = c3742pP;
                    c3742pP.a(4);
                    audioTimestamp = audioTimestamp2;
                } else {
                    z10 = timestamp;
                    if (Math.abs(y8 - c9) > 5000000) {
                        long j21 = p43.f26836c;
                        audioTimestamp = audioTimestamp2;
                        long c11 = ((C4119wP) mu.f26395u).c();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(j21).length() + 54 + String.valueOf(j19).length() + 2 + String.valueOf(j11).length() + 2 + String.valueOf(c9).length() + 2 + String.valueOf(c11).length());
                        com.anythink.basead.b.c.i.x(sb3, "Spurious audio timestamp (frame position mismatch): ", j21, ", ");
                        sb3.append(j19);
                        j12 = j11;
                        com.anythink.basead.b.c.i.x(sb3, ", ", j12, ", ");
                        sb3.append(c9);
                        sb3.append(", ");
                        sb3.append(c11);
                        AbstractC3217fl.I(str3, sb3.toString());
                        c3742pP.a(4);
                    } else {
                        audioTimestamp = audioTimestamp2;
                        j12 = j11;
                        if (c3742pP.f33403d == 4) {
                            c3742pP.a(0);
                        }
                    }
                }
            } else {
                audioTrack = audioTrack2;
                f6 = f10;
                t22 = t23;
                audioTimestamp = audioTimestamp2;
                z10 = timestamp;
                j12 = j11;
            }
            int i17 = c3742pP.f33403d;
            if (i17 == 0) {
                AudioTimestamp audioTimestamp3 = audioTimestamp;
                z8 = false;
                if (z10) {
                    long j22 = audioTimestamp3.nanoTime;
                    if (j22 / 1000 >= c3742pP.f33404e) {
                        c3742pP.f33407h = p43.f26836c;
                        c3742pP.i = j22 / 1000;
                        c3742pP.a(1);
                    }
                } else if (j12 - c3742pP.f33404e > 500000) {
                    c3742pP.a(3);
                }
            } else if (i17 != i14) {
                if (i17 != i4) {
                    if (i17 == 3 && z10) {
                        z8 = false;
                        c3742pP.a(0);
                    }
                    z8 = false;
                } else {
                    z8 = false;
                    if (!z10) {
                        c3742pP.a(0);
                    }
                }
            } else if (z10) {
                long j23 = p43.f26836c;
                long j24 = c3742pP.f33407h;
                if (j23 > j24) {
                    if (Math.abs((AbstractC3548lu.y(j12 - (((AudioTimestamp) p43.f26838e).nanoTime / 1000), f6) + AbstractC3548lu.v(i16, p43.f26836c)) - (AbstractC3548lu.y(j12 - c3742pP.i, f6) + AbstractC3548lu.v(i16, j24))) < 1000) {
                        c3742pP.a(2);
                        z8 = false;
                    }
                }
                if (j12 - c3742pP.f33404e > 2000000) {
                    c3742pP.a(3);
                } else {
                    c3742pP.f33407h = p43.f26836c;
                    c3742pP.i = audioTimestamp.nanoTime / 1000;
                }
                z8 = false;
            } else {
                z8 = false;
                c3742pP.a(0);
            }
            t22.getClass();
            long nanoTime22 = System.nanoTime() / j9;
            if (c3742pP.f33403d == 2) {
            }
            if (z9) {
            }
            playState = audioTrack.getPlayState();
            if (playState == 3) {
            }
            return c4;
        }
        f6 = f9;
        audioTrack = audioTrack2;
        j9 = 1000;
        c3742pP = c3742pP3;
        t22 = t23;
        z8 = false;
        j10 = 0;
        t22.getClass();
        long nanoTime222 = System.nanoTime() / j9;
        if (c3742pP.f33403d == 2) {
        }
        if (z9) {
        }
        playState = audioTrack.getPlayState();
        if (playState == 3) {
        }
        return c4;
    }

    public final void b(long j9) {
        long j10 = this.f35157j;
        if (j10 == com.anythink.basead.exoplayer.b.f6539b || j9 < j10) {
            return;
        }
        float f6 = this.i;
        long j11 = j9 - j10;
        String str = AbstractC3548lu.f32613a;
        if (f6 != 1.0f) {
            j11 = Math.round(j11 / f6);
        }
        long t9 = AbstractC3548lu.t(j11);
        this.f35150b.getClass();
        long currentTimeMillis = System.currentTimeMillis() - t9;
        this.f35157j = com.anythink.basead.exoplayer.b.f6539b;
        C4119wP c4119wP = (C4119wP) this.f35149a.f26395u;
        C3759pp c3759pp = c4119wP.i;
        c3759pp.getClass();
        if (Thread.currentThread() == c3759pp.f33512a) {
            S0 s02 = new S0();
            s02.f27467n = currentTimeMillis;
            C3759pp c3759pp2 = c4119wP.i;
            c3759pp2.c(-1, s02);
            c3759pp2.d();
        }
    }

    public final long c(long j9) {
        int i = this.f35167t;
        int i4 = this.f35153e;
        long max = Math.max(0L, (i == 0 ? this.f35168u != com.anythink.basead.exoplayer.b.f6539b ? AbstractC3548lu.v(i4, e()) : AbstractC3548lu.v(i4, d()) : AbstractC3548lu.y(j9 + this.f35158k, this.i)) - this.f35161n);
        return this.f35168u != com.anythink.basead.exoplayer.b.f6539b ? Math.min(AbstractC3548lu.v(i4, this.f35171x), max) : max;
    }

    public final long d() {
        if (this.f35168u != com.anythink.basead.exoplayer.b.f6539b) {
            return Math.min(this.f35171x, e());
        }
        this.f35150b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f35163p >= 5) {
            int playState = this.f35152d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = r4.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition != 0 || this.f35164q <= 0 || playState != 3) {
                        this.f35169v = com.anythink.basead.exoplayer.b.f6539b;
                    } else if (this.f35169v == com.anythink.basead.exoplayer.b.f6539b) {
                        this.f35169v = elapsedRealtime;
                    }
                }
                if (this.f35164q > playbackHeadPosition) {
                    this.f35165r++;
                }
                this.f35164q = playbackHeadPosition;
            }
            this.f35163p = elapsedRealtime;
        }
        return this.f35164q + (this.f35165r << 32);
    }

    public final long e() {
        if (this.f35152d.getPlayState() == 2) {
            return this.f35170w;
        }
        this.f35150b.getClass();
        return this.f35170w + AbstractC3548lu.w(AbstractC3548lu.y(AbstractC3548lu.u(SystemClock.elapsedRealtime()) - this.f35168u, this.i), this.f35153e, 1000000L, RoundingMode.UP);
    }
}
