package e0;

import E.G;
import F.C0047j0;
import M1.B;
import a0.AbstractC0158a;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import b0.AbstractC0257H;
import b0.C0254E;
import b0.C0255F;
import b0.C0256G;
import b0.C0276i;
import b0.C0278k;
import d0.AbstractC0322c;
import j.AbstractC0479E;
import j.C0475A;

/* renamed from: e0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0336b {

    /* renamed from: a, reason: collision with root package name */
    public final d f4472a;

    /* renamed from: f, reason: collision with root package name */
    public Outline f4477f;

    /* renamed from: j, reason: collision with root package name */
    public float f4481j;

    /* renamed from: k, reason: collision with root package name */
    public AbstractC0257H f4482k;

    /* renamed from: l, reason: collision with root package name */
    public C0278k f4483l;

    /* renamed from: m, reason: collision with root package name */
    public C0278k f4484m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4485n;

    /* renamed from: o, reason: collision with root package name */
    public C0276i f4486o;
    public int p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4488r;

    /* renamed from: s, reason: collision with root package name */
    public long f4489s;

    /* renamed from: t, reason: collision with root package name */
    public long f4490t;

    /* renamed from: u, reason: collision with root package name */
    public long f4491u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4492v;

    /* renamed from: w, reason: collision with root package name */
    public RectF f4493w;

    /* renamed from: b, reason: collision with root package name */
    public M0.b f4473b = AbstractC0322c.f4447a;

    /* renamed from: c, reason: collision with root package name */
    public M0.j f4474c = M0.j.f2775d;

    /* renamed from: d, reason: collision with root package name */
    public Z1.j f4475d = C0335a.f4469f;

    /* renamed from: e, reason: collision with root package name */
    public final C0047j0 f4476e = new C0047j0(14, this);

    /* renamed from: g, reason: collision with root package name */
    public boolean f4478g = true;

    /* renamed from: h, reason: collision with root package name */
    public long f4479h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f4480i = 9205357640488583168L;

    /* renamed from: q, reason: collision with root package name */
    public final G f4487q = new G();

    static {
        int i3 = j.f4568a;
        int i4 = j.f4568a;
    }

    public C0336b(d dVar) {
        this.f4472a = dVar;
        dVar.J(false);
        this.f4489s = 0L;
        this.f4490t = 0L;
        this.f4491u = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.f4478g) {
            boolean z3 = this.f4492v;
            d dVar = this.f4472a;
            Outline outline2 = null;
            if (z3 || dVar.A() > 0.0f) {
                C0278k c0278k = this.f4483l;
                if (c0278k != null) {
                    RectF rectF = this.f4493w;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f4493w = rectF;
                    }
                    Path path = c0278k.f4278a;
                    path.computeBounds(rectF, false);
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 > 28 || path.isConvex()) {
                        outline = this.f4477f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f4477f = outline;
                        }
                        if (i3 >= 30) {
                            k.f4569a.a(outline, c0278k);
                        } else {
                            outline.setConvexPath(path);
                        }
                        this.f4485n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f4477f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f4485n = true;
                        outline = null;
                    }
                    this.f4483l = c0278k;
                    if (outline != null) {
                        outline.setAlpha(dVar.a());
                        outline2 = outline;
                    }
                    dVar.B(outline2, I2.l.e(Math.round(rectF.width()), Math.round(rectF.height())));
                    if (this.f4485n && this.f4492v) {
                        dVar.J(false);
                        dVar.o();
                    } else {
                        dVar.J(this.f4492v);
                    }
                } else {
                    dVar.J(this.f4492v);
                    Outline outline4 = this.f4477f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f4477f = outline4;
                    }
                    long R2 = I2.l.R(this.f4490t);
                    long j3 = this.f4479h;
                    long j4 = this.f4480i;
                    long j5 = j4 == 9205357640488583168L ? R2 : j4;
                    outline4.setRoundRect(Math.round(a0.c.d(j3)), Math.round(a0.c.e(j3)), Math.round(a0.f.d(j5) + a0.c.d(j3)), Math.round(a0.f.b(j5) + a0.c.e(j3)), this.f4481j);
                    outline4.setAlpha(dVar.a());
                    dVar.B(outline4, (Math.round(a0.f.b(j5)) & 4294967295L) | (Math.round(a0.f.d(j5)) << 32));
                }
            } else {
                dVar.J(false);
                dVar.B(null, 0L);
            }
        }
        this.f4478g = false;
    }

    public final void b() {
        if (this.f4488r && this.p == 0) {
            G g3 = this.f4487q;
            C0336b c0336b = (C0336b) g3.f622b;
            if (c0336b != null) {
                c0336b.d();
                g3.f622b = null;
            }
            C0475A c0475a = (C0475A) g3.f624d;
            if (c0475a != null) {
                Object[] objArr = c0475a.f5130b;
                long[] jArr = c0475a.f5129a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j3 = jArr[i3];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j3) < 128) {
                                    ((C0336b) objArr[(i3 << 3) + i5]).d();
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
                c0475a.b();
            }
            this.f4472a.o();
        }
    }

    public final AbstractC0257H c() {
        AbstractC0257H c0255f;
        AbstractC0257H abstractC0257H = this.f4482k;
        C0278k c0278k = this.f4483l;
        if (abstractC0257H != null) {
            return abstractC0257H;
        }
        if (c0278k != null) {
            C0254E c0254e = new C0254E(c0278k);
            this.f4482k = c0254e;
            return c0254e;
        }
        long R2 = I2.l.R(this.f4490t);
        long j3 = this.f4479h;
        long j4 = this.f4480i;
        if (j4 != 9205357640488583168L) {
            R2 = j4;
        }
        float d3 = a0.c.d(j3);
        float e3 = a0.c.e(j3);
        float d4 = a0.f.d(R2) + d3;
        float b2 = a0.f.b(R2) + e3;
        float f3 = this.f4481j;
        if (f3 > 0.0f) {
            long a3 = B.a(f3, f3);
            long a4 = B.a(AbstractC0158a.b(a3), AbstractC0158a.c(a3));
            c0255f = new C0256G(new a0.e(d3, e3, d4, b2, a4, a4, a4, a4));
        } else {
            c0255f = new C0255F(new a0.d(d3, e3, d4, b2));
        }
        this.f4482k = c0255f;
        return c0255f;
    }

    public final void d() {
        this.p--;
        b();
    }

    public final void e() {
        G g3 = this.f4487q;
        g3.f623c = (C0336b) g3.f622b;
        C0475A c0475a = (C0475A) g3.f624d;
        if (c0475a != null && c0475a.h()) {
            C0475A c0475a2 = (C0475A) g3.f625e;
            if (c0475a2 == null) {
                int i3 = AbstractC0479E.f5137a;
                c0475a2 = new C0475A();
                g3.f625e = c0475a2;
            }
            c0475a2.i(c0475a);
            c0475a.b();
        }
        g3.f621a = true;
        this.f4472a.L(this.f4473b, this.f4474c, this, this.f4476e);
        g3.f621a = false;
        C0336b c0336b = (C0336b) g3.f623c;
        if (c0336b != null) {
            c0336b.d();
        }
        C0475A c0475a3 = (C0475A) g3.f625e;
        if (c0475a3 == null || !c0475a3.h()) {
            return;
        }
        Object[] objArr = c0475a3.f5130b;
        long[] jArr = c0475a3.f5129a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j3 = jArr[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j3) < 128) {
                            ((C0336b) objArr[(i4 << 3) + i6]).d();
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
        c0475a3.b();
    }

    public final void f(long j3, long j4, float f3) {
        if (a0.c.b(this.f4479h, j3) && a0.f.a(this.f4480i, j4) && this.f4481j == f3 && this.f4483l == null) {
            return;
        }
        this.f4482k = null;
        this.f4483l = null;
        this.f4478g = true;
        this.f4485n = false;
        this.f4479h = j3;
        this.f4480i = j4;
        this.f4481j = f3;
        a();
    }
}
