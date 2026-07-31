package e0;

import E.F;
import a.AbstractC0235a;
import a0.AbstractC0236a;
import a0.C0238c;
import a0.C0239d;
import a0.C0240e;
import a0.C0241f;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import b0.C0339h;
import b0.C0341j;
import b0.H;
import b0.I;
import b0.J;
import b0.K;
import d0.AbstractC0402c;
import j.AbstractC0523E;
import j.C0519A;

/* renamed from: e0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0416b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0418d f5694a;

    /* renamed from: f, reason: collision with root package name */
    public Outline f5699f;

    /* renamed from: j, reason: collision with root package name */
    public float f5703j;

    /* renamed from: k, reason: collision with root package name */
    public K f5704k;

    /* renamed from: l, reason: collision with root package name */
    public C0341j f5705l;

    /* renamed from: m, reason: collision with root package name */
    public C0341j f5706m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5707n;

    /* renamed from: o, reason: collision with root package name */
    public C0339h f5708o;

    /* renamed from: p, reason: collision with root package name */
    public int f5709p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5711r;

    /* renamed from: s, reason: collision with root package name */
    public long f5712s;

    /* renamed from: t, reason: collision with root package name */
    public long f5713t;

    /* renamed from: u, reason: collision with root package name */
    public long f5714u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5715v;

    /* renamed from: w, reason: collision with root package name */
    public RectF f5716w;

    /* renamed from: b, reason: collision with root package name */
    public O0.b f5695b = AbstractC0402c.f5652a;

    /* renamed from: c, reason: collision with root package name */
    public O0.k f5696c = O0.k.f3741d;

    /* renamed from: d, reason: collision with root package name */
    public f2.k f5697d = C0415a.f5691f;

    /* renamed from: e, reason: collision with root package name */
    public final A0.l f5698e = new A0.l(17, this);

    /* renamed from: g, reason: collision with root package name */
    public boolean f5700g = true;

    /* renamed from: h, reason: collision with root package name */
    public long f5701h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f5702i = 9205357640488583168L;

    /* renamed from: q, reason: collision with root package name */
    public final F f5710q = new F();

    static {
        int i3 = j.f5794a;
        int i4 = j.f5794a;
    }

    public C0416b(InterfaceC0418d interfaceC0418d) {
        this.f5694a = interfaceC0418d;
        interfaceC0418d.K(false);
        this.f5712s = 0L;
        this.f5713t = 0L;
        this.f5714u = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.f5700g) {
            boolean z3 = this.f5715v;
            InterfaceC0418d interfaceC0418d = this.f5694a;
            Outline outline2 = null;
            if (z3 || interfaceC0418d.A() > 0.0f) {
                C0341j c0341j = this.f5705l;
                if (c0341j != null) {
                    RectF rectF = this.f5716w;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f5716w = rectF;
                    }
                    Path path = c0341j.f5420a;
                    path.computeBounds(rectF, false);
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 > 28 || path.isConvex()) {
                        outline = this.f5699f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f5699f = outline;
                        }
                        if (i3 >= 30) {
                            k.f5795a.a(outline, c0341j);
                        } else {
                            outline.setConvexPath(path);
                        }
                        this.f5707n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f5699f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f5707n = true;
                        outline = null;
                    }
                    this.f5705l = c0341j;
                    if (outline != null) {
                        outline.setAlpha(interfaceC0418d.a());
                        outline2 = outline;
                    }
                    interfaceC0418d.B(outline2, O2.d.d(Math.round(rectF.width()), Math.round(rectF.height())));
                    if (this.f5707n && this.f5715v) {
                        interfaceC0418d.K(false);
                        interfaceC0418d.o();
                    } else {
                        interfaceC0418d.K(this.f5715v);
                    }
                } else {
                    interfaceC0418d.K(this.f5715v);
                    Outline outline4 = this.f5699f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f5699f = outline4;
                    }
                    long f02 = O2.d.f0(this.f5713t);
                    long j3 = this.f5701h;
                    long j4 = this.f5702i;
                    long j5 = j4 == 9205357640488583168L ? f02 : j4;
                    outline4.setRoundRect(Math.round(C0238c.d(j3)), Math.round(C0238c.e(j3)), Math.round(C0241f.d(j5) + C0238c.d(j3)), Math.round(C0241f.b(j5) + C0238c.e(j3)), this.f5703j);
                    outline4.setAlpha(interfaceC0418d.a());
                    interfaceC0418d.B(outline4, (Math.round(C0241f.b(j5)) & 4294967295L) | (Math.round(C0241f.d(j5)) << 32));
                }
            } else {
                interfaceC0418d.K(false);
                interfaceC0418d.B(null, 0L);
            }
        }
        this.f5700g = false;
    }

    public final void b() {
        if (this.f5711r && this.f5709p == 0) {
            F f3 = this.f5710q;
            C0416b c0416b = (C0416b) f3.f923b;
            if (c0416b != null) {
                c0416b.d();
                f3.f923b = null;
            }
            C0519A c0519a = (C0519A) f3.f925d;
            if (c0519a != null) {
                Object[] objArr = c0519a.f6248b;
                long[] jArr = c0519a.f6247a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j3 = jArr[i3];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j3) < 128) {
                                    ((C0416b) objArr[(i3 << 3) + i5]).d();
                                }
                                j3 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                c0519a.b();
            }
            this.f5694a.o();
        }
    }

    public final K c() {
        K i3;
        K k3 = this.f5704k;
        C0341j c0341j = this.f5705l;
        if (k3 != null) {
            return k3;
        }
        if (c0341j != null) {
            H h3 = new H(c0341j);
            this.f5704k = h3;
            return h3;
        }
        long f02 = O2.d.f0(this.f5713t);
        long j3 = this.f5701h;
        long j4 = this.f5702i;
        if (j4 != 9205357640488583168L) {
            f02 = j4;
        }
        float d3 = C0238c.d(j3);
        float e3 = C0238c.e(j3);
        float d4 = C0241f.d(f02) + d3;
        float b3 = C0241f.b(f02) + e3;
        float f3 = this.f5703j;
        if (f3 > 0.0f) {
            long b4 = AbstractC0235a.b(f3, f3);
            long b5 = AbstractC0235a.b(AbstractC0236a.b(b4), AbstractC0236a.c(b4));
            i3 = new J(new C0240e(d3, e3, d4, b3, b5, b5, b5, b5));
        } else {
            i3 = new I(new C0239d(d3, e3, d4, b3));
        }
        this.f5704k = i3;
        return i3;
    }

    public final void d() {
        this.f5709p--;
        b();
    }

    public final void e() {
        F f3 = this.f5710q;
        f3.f924c = (C0416b) f3.f923b;
        C0519A c0519a = (C0519A) f3.f925d;
        if (c0519a != null && c0519a.h()) {
            C0519A c0519a2 = (C0519A) f3.f926e;
            if (c0519a2 == null) {
                int i3 = AbstractC0523E.f6255a;
                c0519a2 = new C0519A();
                f3.f926e = c0519a2;
            }
            c0519a2.i(c0519a);
            c0519a.b();
        }
        f3.f922a = true;
        this.f5694a.C(this.f5695b, this.f5696c, this, this.f5698e);
        f3.f922a = false;
        C0416b c0416b = (C0416b) f3.f924c;
        if (c0416b != null) {
            c0416b.d();
        }
        C0519A c0519a3 = (C0519A) f3.f926e;
        if (c0519a3 == null || !c0519a3.h()) {
            return;
        }
        Object[] objArr = c0519a3.f6248b;
        long[] jArr = c0519a3.f6247a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j3 = jArr[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j3) < 128) {
                            ((C0416b) objArr[(i4 << 3) + i6]).d();
                        }
                        j3 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        c0519a3.b();
    }

    public final void f(long j3, long j4, float f3) {
        if (C0238c.b(this.f5701h, j3) && C0241f.a(this.f5702i, j4) && this.f5703j == f3 && this.f5705l == null) {
            return;
        }
        this.f5704k = null;
        this.f5705l = null;
        this.f5700g = true;
        this.f5707n = false;
        this.f5701h = j3;
        this.f5702i = j4;
        this.f5703j = f3;
        a();
    }
}
