package c1;

import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import c0.w;
import f7.i0;
import i.b0;
import i.f0;
import z0.g0;
import z0.h0;
import z0.j0;
import z0.k0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final e f1528a;

    /* renamed from: f, reason: collision with root package name */
    public Outline f1533f;

    /* renamed from: j, reason: collision with root package name */
    public float f1537j;

    /* renamed from: k, reason: collision with root package name */
    public j0 f1538k;

    /* renamed from: l, reason: collision with root package name */
    public k0 f1539l;

    /* renamed from: m, reason: collision with root package name */
    public z0.j f1540m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1541n;

    /* renamed from: o, reason: collision with root package name */
    public i0 f1542o;

    /* renamed from: p, reason: collision with root package name */
    public int f1543p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1545r;

    /* renamed from: s, reason: collision with root package name */
    public long f1546s;

    /* renamed from: t, reason: collision with root package name */
    public long f1547t;

    /* renamed from: u, reason: collision with root package name */
    public long f1548u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1549v;

    /* renamed from: w, reason: collision with root package name */
    public RectF f1550w;

    /* renamed from: b, reason: collision with root package name */
    public m2.b f1529b = b1.d.f1237a;

    /* renamed from: c, reason: collision with root package name */
    public m2.k f1530c = m2.k.f6322f;

    /* renamed from: d, reason: collision with root package name */
    public r6.l f1531d = b.f1525h;

    /* renamed from: e, reason: collision with root package name */
    public final a f1532e = new a(0, this);

    /* renamed from: g, reason: collision with root package name */
    public boolean f1534g = true;

    /* renamed from: h, reason: collision with root package name */
    public long f1535h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f1536i = 9205357640488583168L;

    /* renamed from: q, reason: collision with root package name */
    public final w f1544q = new w();

    static {
        int i7 = k.f1613a;
        int i8 = k.f1613a;
    }

    public c(e eVar) {
        this.f1528a = eVar;
        eVar.y(false);
        this.f1546s = 0L;
        this.f1547t = 0L;
        this.f1548u = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.f1534g) {
            boolean z8 = this.f1549v;
            Outline outline2 = null;
            e eVar = this.f1528a;
            if (z8 || eVar.H() > 0.0f) {
                k0 k0Var = this.f1539l;
                if (k0Var != null) {
                    RectF rectF = this.f1550w;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f1550w = rectF;
                    }
                    boolean z9 = k0Var instanceof z0.j;
                    if (!z9) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((z0.j) k0Var).f10002a.computeBounds(rectF, false);
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 > 28 || ((z0.j) k0Var).f10002a.isConvex()) {
                        outline = this.f1533f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f1533f = outline;
                        }
                        if (i7 >= 30) {
                            l.f1614a.a(outline, k0Var);
                        } else {
                            if (!z9) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(((z0.j) k0Var).f10002a);
                        }
                        this.f1541n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f1533f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f1541n = true;
                        outline = null;
                    }
                    this.f1539l = k0Var;
                    if (outline != null) {
                        outline.setAlpha(eVar.a());
                        outline2 = outline;
                    }
                    eVar.v(outline2, j1.c.G(Math.round(rectF.width()), Math.round(rectF.height())));
                    if (this.f1541n && this.f1549v) {
                        eVar.y(false);
                        eVar.i();
                    } else {
                        eVar.y(this.f1549v);
                    }
                } else {
                    eVar.y(this.f1549v);
                    Outline outline4 = this.f1533f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f1533f = outline4;
                    }
                    Outline outline5 = outline4;
                    long o02 = j1.c.o0(this.f1547t);
                    long j8 = this.f1535h;
                    long j9 = this.f1536i;
                    long j10 = j9 == 9205357640488583168L ? o02 : j9;
                    outline5.setRoundRect(Math.round(y0.c.d(j8)), Math.round(y0.c.e(j8)), Math.round(y0.f.d(j10) + y0.c.d(j8)), Math.round(y0.f.b(j10) + y0.c.e(j8)), this.f1537j);
                    outline5.setAlpha(eVar.a());
                    eVar.v(outline5, (Math.round(y0.f.d(j10)) << 32) | (Math.round(y0.f.b(j10)) & 4294967295L));
                }
            } else {
                eVar.y(false);
                eVar.v(null, 0L);
            }
        }
        this.f1534g = false;
    }

    public final void b() {
        if (this.f1545r && this.f1543p == 0) {
            w wVar = this.f1544q;
            c cVar = (c) wVar.f1514b;
            if (cVar != null) {
                cVar.d();
                wVar.f1514b = null;
            }
            b0 b0Var = (b0) wVar.f1516d;
            if (b0Var != null) {
                Object[] objArr = b0Var.f4722b;
                long[] jArr = b0Var.f4721a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j8 = jArr[i7];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8 - ((~(i7 - length)) >>> 31);
                            for (int i9 = 0; i9 < i8; i9++) {
                                if ((255 & j8) < 128) {
                                    ((c) objArr[(i7 << 3) + i9]).d();
                                }
                                j8 >>= 8;
                            }
                            if (i8 != 8) {
                                break;
                            }
                        }
                        if (i7 == length) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                }
                b0Var.b();
            }
            this.f1528a.i();
        }
    }

    public final j0 c() {
        j0 h0Var;
        j0 j0Var = this.f1538k;
        k0 k0Var = this.f1539l;
        if (j0Var != null) {
            return j0Var;
        }
        if (k0Var != null) {
            g0 g0Var = new g0(k0Var);
            this.f1538k = g0Var;
            return g0Var;
        }
        long o02 = j1.c.o0(this.f1547t);
        long j8 = this.f1535h;
        long j9 = this.f1536i;
        if (j9 != 9205357640488583168L) {
            o02 = j9;
        }
        float d8 = y0.c.d(j8);
        float e9 = y0.c.e(j8);
        float d9 = y0.f.d(o02) + d8;
        float b9 = y0.f.b(o02) + e9;
        float f9 = this.f1537j;
        if (f9 > 0.0f) {
            long a3 = v1.g.a(f9, f9);
            long a9 = v1.g.a(y0.a.b(a3), y0.a.c(a3));
            h0Var = new z0.i0(new y0.e(d8, e9, d9, b9, a9, a9, a9, a9));
        } else {
            h0Var = new h0(new y0.d(d8, e9, d9, b9));
        }
        this.f1538k = h0Var;
        return h0Var;
    }

    public final void d() {
        this.f1543p--;
        b();
    }

    public final void e() {
        w wVar = this.f1544q;
        wVar.f1515c = (c) wVar.f1514b;
        b0 b0Var = (b0) wVar.f1516d;
        if (b0Var != null && b0Var.h()) {
            b0 b0Var2 = (b0) wVar.f1517e;
            if (b0Var2 == null) {
                int i7 = f0.f4740a;
                b0Var2 = new b0();
                wVar.f1517e = b0Var2;
            }
            b0Var2.i(b0Var);
            b0Var.b();
        }
        wVar.f1513a = true;
        this.f1528a.E(this.f1529b, this.f1530c, this, this.f1532e);
        wVar.f1513a = false;
        c cVar = (c) wVar.f1515c;
        if (cVar != null) {
            cVar.d();
        }
        b0 b0Var3 = (b0) wVar.f1517e;
        if (b0Var3 == null || !b0Var3.h()) {
            return;
        }
        Object[] objArr = b0Var3.f4722b;
        long[] jArr = b0Var3.f4721a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j8 = jArr[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j8) < 128) {
                            ((c) objArr[(i8 << 3) + i10]).d();
                        }
                        j8 >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                }
                if (i8 == length) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        b0Var3.b();
    }

    public final void f(float f9, long j8, long j9) {
        if (y0.c.b(this.f1535h, j8) && y0.f.a(this.f1536i, j9) && this.f1537j == f9 && this.f1539l == null) {
            return;
        }
        this.f1538k = null;
        this.f1539l = null;
        this.f1534g = true;
        this.f1541n = false;
        this.f1535h = j8;
        this.f1536i = j9;
        this.f1537j = f9;
        a();
    }
}
