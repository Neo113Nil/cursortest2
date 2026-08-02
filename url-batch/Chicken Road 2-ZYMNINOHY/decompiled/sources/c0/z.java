package c0;

import W.AbstractC0108a;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Build;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: r, reason: collision with root package name */
    public static final Object f5625r = new Object();

    /* renamed from: s, reason: collision with root package name */
    public static ScheduledExecutorService f5626s;

    /* renamed from: t, reason: collision with root package name */
    public static int f5627t;

    /* renamed from: a, reason: collision with root package name */
    public final AudioTrack f5628a;

    /* renamed from: b, reason: collision with root package name */
    public final C0281n f5629b;

    /* renamed from: c, reason: collision with root package name */
    public final t1.h f5630c;

    /* renamed from: d, reason: collision with root package name */
    public G1.c f5631d;

    /* renamed from: e, reason: collision with root package name */
    public final B f5632e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5633f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5634g;

    /* renamed from: h, reason: collision with root package name */
    public final B1.j f5635h;

    /* renamed from: i, reason: collision with root package name */
    public final W.n f5636i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5637j;

    /* renamed from: k, reason: collision with root package name */
    public long f5638k;

    /* renamed from: l, reason: collision with root package name */
    public long f5639l;

    /* renamed from: m, reason: collision with root package name */
    public long f5640m;
    public ByteBuffer n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public int f5641p;

    /* renamed from: q, reason: collision with root package name */
    public int f5642q;

    public z(AudioTrack audioTrack, C0281n c0281n, t1.h hVar, W.D d4) {
        this.f5628a = audioTrack;
        this.f5629b = c0281n;
        this.f5630c = hVar;
        W.n nVar = new W.n(Thread.currentThread());
        this.f5636i = nVar;
        nVar.f3329i = false;
        boolean H4 = W.J.H(c0281n.f5584a);
        this.f5633f = H4;
        if (H4) {
            this.f5634g = W.J.s(c0281n.f5584a) * Integer.bitCount(c0281n.f5586c);
        } else {
            this.f5634g = -1;
        }
        this.f5632e = new B(new t1.h(26, this), d4, audioTrack, c0281n.f5584a, this.f5634g, c0281n.f5589f);
        if (hVar != null) {
            this.f5631d = new G1.c(audioTrack, hVar);
        }
        this.f5635h = c() ? new B1.j(this) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a() {
        B b4;
        W.D d4;
        w wVar;
        AudioTrack audioTrack;
        long j4;
        boolean z;
        boolean z4;
        B b5;
        long b6;
        int playState;
        int i4;
        long j5;
        boolean z5;
        v vVar;
        boolean timestamp;
        long j6;
        boolean z6;
        AudioTimestamp audioTimestamp;
        int i5;
        int i6;
        Method method;
        Method method2;
        Integer num;
        B b7 = this.f5632e;
        W.D d5 = b7.f5411b;
        w wVar2 = b7.f5417h;
        AudioTrack audioTrack2 = b7.f5413d;
        if (audioTrack2.getPlayState() == 3) {
            long[] jArr = b7.f5412c;
            d5.getClass();
            long nanoTime = System.nanoTime() / 1000;
            j4 = 1000;
            if (nanoTime - b7.f5421l >= 30000) {
                long S4 = W.J.S(b7.f5414e, b7.a());
                if (S4 != 0) {
                    jArr[b7.f5426s] = W.J.C(S4, b7.f5418i) - nanoTime;
                    b7.f5426s = (b7.f5426s + 1) % 10;
                    int i7 = b7.f5427t;
                    if (i7 < 10) {
                        b7.f5427t = i7 + 1;
                    }
                    b7.f5421l = nanoTime;
                    b7.f5420k = 0L;
                    int i8 = 0;
                    while (true) {
                        int i9 = b7.f5427t;
                        if (i8 >= i9) {
                            break;
                        }
                        b7.f5420k = (jArr[i8] / i9) + b7.f5420k;
                        i8++;
                    }
                }
                b4 = b7;
                d4 = d5;
                wVar = wVar2;
                audioTrack = audioTrack2;
            }
            long j7 = b7.n;
            if (!b7.f5416g || (method = b7.f5422m) == null) {
                j5 = 500000;
            } else {
                j5 = 500000;
                if (nanoTime - b7.o >= 500000) {
                    try {
                        num = (Integer) method.invoke(audioTrack2, null);
                        String str = W.J.f3263a;
                    } catch (Exception unused) {
                        method2 = null;
                    }
                    try {
                        long intValue = (num.intValue() * 1000) - b7.f5415f;
                        b7.n = intValue;
                        long max = Math.max(intValue, 0L);
                        b7.n = max;
                        if (max > 10000000) {
                            AbstractC0108a.s("AudioTrackAudioOutput", "Ignoring impossibly large audio latency: " + max);
                            b7.n = 0L;
                        }
                    } catch (Exception unused2) {
                        method2 = null;
                        b7.f5422m = method2;
                        b7.o = nanoTime;
                        if (j7 == b7.n) {
                        }
                        float f4 = b7.f5418i;
                        long b8 = b7.b(nanoTime);
                        vVar = wVar2.f5614a;
                        v vVar2 = wVar2.f5614a;
                        int i10 = wVar2.f5615b;
                        if (!z5) {
                        }
                        wVar2.f5620g = nanoTime;
                        AudioTrack audioTrack3 = vVar.f5607a;
                        AudioTimestamp audioTimestamp2 = vVar.f5608b;
                        timestamp = audioTrack3.getTimestamp(audioTimestamp2);
                        if (timestamp) {
                        }
                        if (timestamp) {
                        }
                        i5 = 4;
                        i6 = wVar.f5617d;
                        if (i6 == 0) {
                        }
                        d4.getClass();
                        long nanoTime2 = System.nanoTime() / j4;
                        if (wVar.f5617d != 2) {
                        }
                        if (z4) {
                        }
                        long j8 = b6;
                        playState = audioTrack.getPlayState();
                        if (playState != 3) {
                        }
                        return j8;
                    }
                    b7.o = nanoTime;
                }
            }
            z5 = j7 == b7.n;
            float f42 = b7.f5418i;
            long b82 = b7.b(nanoTime);
            vVar = wVar2.f5614a;
            v vVar22 = wVar2.f5614a;
            int i102 = wVar2.f5615b;
            if (!z5 || nanoTime - wVar2.f5620g >= wVar2.f5619f) {
                wVar2.f5620g = nanoTime;
                AudioTrack audioTrack32 = vVar.f5607a;
                AudioTimestamp audioTimestamp22 = vVar.f5608b;
                timestamp = audioTrack32.getTimestamp(audioTimestamp22);
                if (timestamp) {
                    b4 = b7;
                    d4 = d5;
                    j6 = b82;
                } else {
                    b4 = b7;
                    long j9 = audioTimestamp22.framePosition;
                    j6 = b82;
                    long j10 = vVar.f5610d;
                    if (j10 > j9) {
                        d4 = d5;
                        if (vVar.f5612f) {
                            vVar.f5613g += j10;
                            vVar.f5612f = false;
                        } else {
                            vVar.f5609c++;
                        }
                    } else {
                        d4 = d5;
                    }
                    vVar.f5610d = j9;
                    vVar.f5611e = j9 + vVar.f5613g + (vVar.f5609c << 32);
                }
                if (timestamp) {
                    wVar = wVar2;
                    audioTrack = audioTrack2;
                    z6 = timestamp;
                    audioTimestamp = audioTimestamp22;
                } else {
                    t1.h hVar = wVar2.f5616c;
                    long j11 = audioTimestamp22.nanoTime / 1000;
                    z6 = timestamp;
                    audioTimestamp = audioTimestamp22;
                    long z7 = W.J.z(nanoTime - (vVar22.f5608b.nanoTime / 1000), f42) + W.J.S(i102, vVar22.f5611e);
                    if (Math.abs(j11 - nanoTime) <= 5000000) {
                        wVar = wVar2;
                        long j12 = j6;
                        if (Math.abs(z7 - j12) > 5000000) {
                            long j13 = vVar.f5611e;
                            hVar.getClass();
                            audioTrack = audioTrack2;
                            AbstractC0108a.s("AudioTrackAudioOutput", "Spurious audio timestamp (frame position mismatch): " + j13 + ", " + j11 + ", " + nanoTime + ", " + j12 + ", " + ((z) hVar.f15398b).b());
                            wVar = wVar;
                            i5 = 4;
                            wVar.a(4);
                        } else {
                            audioTrack = audioTrack2;
                            i5 = 4;
                            if (wVar.f5617d == 4) {
                                wVar.a(0);
                            }
                        }
                        i6 = wVar.f5617d;
                        if (i6 == 0) {
                            AudioTimestamp audioTimestamp3 = audioTimestamp;
                            z = false;
                            if (z6) {
                                long j14 = audioTimestamp3.nanoTime;
                                if (j14 / 1000 >= wVar.f5618e) {
                                    wVar.f5621h = vVar.f5611e;
                                    wVar.f5622i = j14 / 1000;
                                    wVar.a(1);
                                }
                            } else if (nanoTime - wVar.f5618e > j5) {
                                wVar.a(3);
                            }
                        } else if (i6 == 1) {
                            AudioTimestamp audioTimestamp4 = audioTimestamp;
                            if (z6) {
                                long j15 = vVar.f5611e;
                                long j16 = wVar.f5621h;
                                if (j15 > j16) {
                                    if (Math.abs((W.J.z(nanoTime - (vVar22.f5608b.nanoTime / 1000), f42) + W.J.S(i102, vVar22.f5611e)) - (W.J.z(nanoTime - wVar.f5622i, f42) + W.J.S(i102, j16))) < 1000) {
                                        wVar.a(2);
                                    }
                                }
                                if (nanoTime - wVar.f5618e > 2000000) {
                                    wVar.a(3);
                                } else {
                                    wVar.f5621h = vVar.f5611e;
                                    wVar.f5622i = audioTimestamp4.nanoTime / 1000;
                                }
                            } else {
                                z = false;
                                wVar.a(0);
                            }
                        } else if (i6 == 2) {
                            z = false;
                            if (!z6) {
                                wVar.a(0);
                            }
                        } else if (i6 != 3) {
                            if (i6 != i5) {
                                throw new IllegalStateException();
                            }
                        } else if (z6) {
                            z = false;
                            wVar.a(0);
                        }
                        d4.getClass();
                        long nanoTime22 = System.nanoTime() / j4;
                        z4 = wVar.f5617d != 2 ? true : z;
                        if (z4) {
                            b5 = b4;
                            b6 = b5.b(nanoTime22);
                        } else {
                            b5 = b4;
                            float f5 = b5.f5418i;
                            v vVar3 = wVar.f5614a;
                            b6 = W.J.z(nanoTime22 - (vVar3.f5608b.nanoTime / j4), f5) + W.J.S(wVar.f5615b, vVar3.f5611e);
                        }
                        long j82 = b6;
                        playState = audioTrack.getPlayState();
                        if (playState != 3) {
                            if (z4 || ((i4 = wVar.f5617d) != 0 && i4 != 1)) {
                                b5.d(j82);
                            }
                            long j17 = b5.z;
                            if (j17 != -9223372036854775807L) {
                                long j18 = j82 - b5.f5431y;
                                long z8 = W.J.z(nanoTime22 - j17, b5.f5418i);
                                long j19 = b5.f5431y + z8;
                                long abs = Math.abs(j19 - j82);
                                if (j18 != 0 && abs < 1000000) {
                                    long j20 = (z8 * 10) / 100;
                                    j82 = W.J.k(j82, j19 - j20, j19 + j20);
                                }
                            }
                            b5.z = nanoTime22;
                            b5.f5431y = j82;
                        } else if (playState == 1) {
                            b5.d(j82);
                        }
                        return j82;
                    }
                    long j21 = vVar.f5611e;
                    hVar.getClass();
                    AbstractC0108a.s("AudioTrackAudioOutput", "Spurious audio timestamp (system clock mismatch): " + j21 + ", " + j11 + ", " + nanoTime + ", " + j6 + ", " + ((z) hVar.f15398b).b());
                    wVar2.a(4);
                    wVar = wVar2;
                    audioTrack = audioTrack2;
                }
                i5 = 4;
                i6 = wVar.f5617d;
                if (i6 == 0) {
                }
                d4.getClass();
                long nanoTime222 = System.nanoTime() / j4;
                if (wVar.f5617d != 2) {
                }
                if (z4) {
                }
                long j822 = b6;
                playState = audioTrack.getPlayState();
                if (playState != 3) {
                }
                return j822;
            }
            b4 = b7;
            d4 = d5;
            wVar = wVar2;
            audioTrack = audioTrack2;
        } else {
            b4 = b7;
            d4 = d5;
            wVar = wVar2;
            audioTrack = audioTrack2;
            j4 = 1000;
        }
        z = false;
        d4.getClass();
        long nanoTime2222 = System.nanoTime() / j4;
        if (wVar.f5617d != 2) {
        }
        if (z4) {
        }
        long j8222 = b6;
        playState = audioTrack.getPlayState();
        if (playState != 3) {
        }
        return j8222;
    }

    public final long b() {
        if (!this.f5633f) {
            return this.f5639l;
        }
        long j4 = this.f5638k;
        long j5 = this.f5634g;
        String str = W.J.f3263a;
        return ((j4 + j5) - 1) / j5;
    }

    public final boolean c() {
        boolean isOffloadedPlayback;
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        isOffloadedPlayback = this.f5628a.isOffloadedPlayback();
        return isOffloadedPlayback;
    }

    public final boolean d(long j4, ByteBuffer byteBuffer, int i4) {
        int write;
        boolean z;
        t1.h hVar;
        C0267A c0267a;
        O2.d dVar;
        C0281n c0281n = this.f5629b;
        boolean z4 = this.f5633f;
        if (!z4 && this.f5641p == 0) {
            this.f5641p = I.i(c0281n.f5584a, byteBuffer);
        }
        b();
        AudioTrack audioTrack = this.f5628a;
        int underrunCount = audioTrack.getUnderrunCount();
        boolean z5 = underrunCount > this.f5642q;
        this.f5642q = underrunCount;
        if (z5) {
            this.f5636i.e(-1, new b0.c(9));
        }
        int remaining = byteBuffer.remaining();
        if (c0281n.f5587d) {
            if (j4 == Long.MIN_VALUE) {
                j4 = this.f5640m;
            } else {
                this.f5640m = j4;
            }
            int remaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining2, 1, 1000 * j4);
            } else {
                if (this.n == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.n = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.n.putInt(1431633921);
                }
                if (this.o == 0) {
                    this.n.putInt(4, remaining2);
                    this.n.putLong(8, j4 * 1000);
                    this.n.position(0);
                    this.o = remaining2;
                }
                int remaining3 = this.n.remaining();
                if (remaining3 > 0) {
                    int write2 = audioTrack.write(this.n, remaining3, 1);
                    if (write2 < 0) {
                        this.o = 0;
                        write = write2;
                    } else if (write2 < remaining3) {
                        write = 0;
                    }
                }
                write = audioTrack.write(byteBuffer, remaining2, 1);
                if (write < 0) {
                    this.o = 0;
                } else {
                    this.o -= write;
                }
            }
        } else {
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write >= 0) {
            z = write == remaining;
            if (z4) {
                this.f5638k += write;
                return z;
            }
            if (z) {
                this.f5639l = (this.f5641p * i4) + this.f5639l;
            }
            return z;
        }
        z = write == -6 || write == -32;
        if (z && (hVar = this.f5630c) != null && (dVar = (c0267a = (C0267A) hVar.f15398b).f5405h) != null) {
            C0270c c0270c = C0270c.f5542c;
            c0267a.f5404g = c0270c;
            dVar.a(c0270c);
        }
        throw new C0274g(write, z);
    }
}
