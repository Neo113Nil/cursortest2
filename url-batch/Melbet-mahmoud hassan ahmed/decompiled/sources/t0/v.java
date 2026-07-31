package t0;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import o2.m0;

/* loaded from: classes.dex */
final class v {
    private long A;
    private long B;
    private long C;
    private boolean D;
    private long E;
    private long F;

    /* renamed from: a, reason: collision with root package name */
    private final a f21849a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f21850b;

    /* renamed from: c, reason: collision with root package name */
    private AudioTrack f21851c;

    /* renamed from: d, reason: collision with root package name */
    private int f21852d;

    /* renamed from: e, reason: collision with root package name */
    private int f21853e;

    /* renamed from: f, reason: collision with root package name */
    private u f21854f;

    /* renamed from: g, reason: collision with root package name */
    private int f21855g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f21856h;

    /* renamed from: i, reason: collision with root package name */
    private long f21857i;

    /* renamed from: j, reason: collision with root package name */
    private float f21858j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21859k;

    /* renamed from: l, reason: collision with root package name */
    private long f21860l;

    /* renamed from: m, reason: collision with root package name */
    private long f21861m;

    /* renamed from: n, reason: collision with root package name */
    private Method f21862n;

    /* renamed from: o, reason: collision with root package name */
    private long f21863o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f21864p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f21865q;

    /* renamed from: r, reason: collision with root package name */
    private long f21866r;

    /* renamed from: s, reason: collision with root package name */
    private long f21867s;

    /* renamed from: t, reason: collision with root package name */
    private long f21868t;

    /* renamed from: u, reason: collision with root package name */
    private long f21869u;

    /* renamed from: v, reason: collision with root package name */
    private int f21870v;

    /* renamed from: w, reason: collision with root package name */
    private int f21871w;

    /* renamed from: x, reason: collision with root package name */
    private long f21872x;

    /* renamed from: y, reason: collision with root package name */
    private long f21873y;

    /* renamed from: z, reason: collision with root package name */
    private long f21874z;

    public interface a {
        void a(long j7);

        void b(int i7, long j7);

        void c(long j7, long j8, long j9, long j10);

        void d(long j7, long j8, long j9, long j10);

        void e(long j7);
    }

    public v(a aVar) {
        this.f21849a = (a) o2.a.e(aVar);
        if (m0.f19752a >= 18) {
            try {
                this.f21862n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f21850b = new long[10];
    }

    private boolean a() {
        return this.f21856h && ((AudioTrack) o2.a.e(this.f21851c)).getPlayState() == 2 && e() == 0;
    }

    private long b(long j7) {
        return (j7 * 1000000) / this.f21855g;
    }

    private long e() {
        AudioTrack audioTrack = (AudioTrack) o2.a.e(this.f21851c);
        if (this.f21872x != -9223372036854775807L) {
            return Math.min(this.A, this.f21874z + ((((SystemClock.elapsedRealtime() * 1000) - this.f21872x) * this.f21855g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & audioTrack.getPlaybackHeadPosition();
        if (this.f21856h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f21869u = this.f21867s;
            }
            playbackHeadPosition += this.f21869u;
        }
        if (m0.f19752a <= 29) {
            if (playbackHeadPosition == 0 && this.f21867s > 0 && playState == 3) {
                if (this.f21873y == -9223372036854775807L) {
                    this.f21873y = SystemClock.elapsedRealtime();
                }
                return this.f21867s;
            }
            this.f21873y = -9223372036854775807L;
        }
        if (this.f21867s > playbackHeadPosition) {
            this.f21868t++;
        }
        this.f21867s = playbackHeadPosition;
        return playbackHeadPosition + (this.f21868t << 32);
    }

    private long f() {
        return b(e());
    }

    private void l(long j7, long j8) {
        u uVar = (u) o2.a.e(this.f21854f);
        if (uVar.e(j7)) {
            long c7 = uVar.c();
            long b7 = uVar.b();
            if (Math.abs(c7 - j7) > 5000000) {
                this.f21849a.d(b7, c7, j7, j8);
            } else {
                if (Math.abs(b(b7) - j8) <= 5000000) {
                    uVar.a();
                    return;
                }
                this.f21849a.c(b7, c7, j7, j8);
            }
            uVar.f();
        }
    }

    private void m() {
        long f7 = f();
        if (f7 == 0) {
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.f21861m >= 30000) {
            long[] jArr = this.f21850b;
            int i7 = this.f21870v;
            jArr[i7] = f7 - nanoTime;
            this.f21870v = (i7 + 1) % 10;
            int i8 = this.f21871w;
            if (i8 < 10) {
                this.f21871w = i8 + 1;
            }
            this.f21861m = nanoTime;
            this.f21860l = 0L;
            int i9 = 0;
            while (true) {
                int i10 = this.f21871w;
                if (i9 >= i10) {
                    break;
                }
                this.f21860l += this.f21850b[i9] / i10;
                i9++;
            }
        }
        if (this.f21856h) {
            return;
        }
        l(nanoTime, f7);
        n(nanoTime);
    }

    private void n(long j7) {
        Method method;
        if (!this.f21865q || (method = this.f21862n) == null || j7 - this.f21866r < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) m0.j((Integer) method.invoke(o2.a.e(this.f21851c), new Object[0]))).intValue() * 1000) - this.f21857i;
            this.f21863o = intValue;
            long max = Math.max(intValue, 0L);
            this.f21863o = max;
            if (max > 5000000) {
                this.f21849a.e(max);
                this.f21863o = 0L;
            }
        } catch (Exception unused) {
            this.f21862n = null;
        }
        this.f21866r = j7;
    }

    private static boolean o(int i7) {
        return m0.f19752a < 23 && (i7 == 5 || i7 == 6);
    }

    private void r() {
        this.f21860l = 0L;
        this.f21871w = 0;
        this.f21870v = 0;
        this.f21861m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.f21859k = false;
    }

    public int c(long j7) {
        return this.f21853e - ((int) (j7 - (e() * this.f21852d)));
    }

    public long d(boolean z6) {
        long f7;
        if (((AudioTrack) o2.a.e(this.f21851c)).getPlayState() == 3) {
            m();
        }
        long nanoTime = System.nanoTime() / 1000;
        u uVar = (u) o2.a.e(this.f21854f);
        boolean d7 = uVar.d();
        if (d7) {
            f7 = b(uVar.b()) + m0.Z(nanoTime - uVar.c(), this.f21858j);
        } else {
            f7 = this.f21871w == 0 ? f() : this.f21860l + nanoTime;
            if (!z6) {
                f7 = Math.max(0L, f7 - this.f21863o);
            }
        }
        if (this.D != d7) {
            this.F = this.C;
            this.E = this.B;
        }
        long j7 = nanoTime - this.F;
        if (j7 < 1000000) {
            long Z = this.E + m0.Z(j7, this.f21858j);
            long j8 = (j7 * 1000) / 1000000;
            f7 = ((f7 * j8) + ((1000 - j8) * Z)) / 1000;
        }
        if (!this.f21859k) {
            long j9 = this.B;
            if (f7 > j9) {
                this.f21859k = true;
                this.f21849a.a(System.currentTimeMillis() - m0.Y0(m0.e0(m0.Y0(f7 - j9), this.f21858j)));
            }
        }
        this.C = nanoTime;
        this.B = f7;
        this.D = d7;
        return f7;
    }

    public void g(long j7) {
        this.f21874z = e();
        this.f21872x = SystemClock.elapsedRealtime() * 1000;
        this.A = j7;
    }

    public boolean h(long j7) {
        return j7 > e() || a();
    }

    public boolean i() {
        return ((AudioTrack) o2.a.e(this.f21851c)).getPlayState() == 3;
    }

    public boolean j(long j7) {
        return this.f21873y != -9223372036854775807L && j7 > 0 && SystemClock.elapsedRealtime() - this.f21873y >= 200;
    }

    public boolean k(long j7) {
        int playState = ((AudioTrack) o2.a.e(this.f21851c)).getPlayState();
        if (this.f21856h) {
            if (playState == 2) {
                this.f21864p = false;
                return false;
            }
            if (playState == 1 && e() == 0) {
                return false;
            }
        }
        boolean z6 = this.f21864p;
        boolean h7 = h(j7);
        this.f21864p = h7;
        if (z6 && !h7 && playState != 1) {
            this.f21849a.b(this.f21853e, m0.Y0(this.f21857i));
        }
        return true;
    }

    public boolean p() {
        r();
        if (this.f21872x != -9223372036854775807L) {
            return false;
        }
        ((u) o2.a.e(this.f21854f)).g();
        return true;
    }

    public void q() {
        r();
        this.f21851c = null;
        this.f21854f = null;
    }

    public void s(AudioTrack audioTrack, boolean z6, int i7, int i8, int i9) {
        this.f21851c = audioTrack;
        this.f21852d = i8;
        this.f21853e = i9;
        this.f21854f = new u(audioTrack);
        this.f21855g = audioTrack.getSampleRate();
        this.f21856h = z6 && o(i7);
        boolean t02 = m0.t0(i7);
        this.f21865q = t02;
        this.f21857i = t02 ? b(i9 / i8) : -9223372036854775807L;
        this.f21867s = 0L;
        this.f21868t = 0L;
        this.f21869u = 0L;
        this.f21864p = false;
        this.f21872x = -9223372036854775807L;
        this.f21873y = -9223372036854775807L;
        this.f21866r = 0L;
        this.f21863o = 0L;
        this.f21858j = 1.0f;
    }

    public void t(float f7) {
        this.f21858j = f7;
        u uVar = this.f21854f;
        if (uVar != null) {
            uVar.g();
        }
    }

    public void u() {
        ((u) o2.a.e(this.f21854f)).g();
    }
}
