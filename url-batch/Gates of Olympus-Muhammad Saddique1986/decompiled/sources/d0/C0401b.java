package d0;

import G1.m;
import O0.k;
import a0.AbstractC0236a;
import a0.C0238c;
import a0.C0241f;
import android.graphics.Paint;
import android.graphics.Shader;
import b0.AbstractC0347p;
import b0.C0338g;
import b0.C0339h;
import b0.C0341j;
import b0.C0344m;
import b0.C0352v;
import b0.L;
import b0.M;
import f2.j;

/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0401b implements InterfaceC0403d {

    /* renamed from: d, reason: collision with root package name */
    public final C0400a f5648d;

    /* renamed from: e, reason: collision with root package name */
    public final m f5649e;

    /* renamed from: f, reason: collision with root package name */
    public C0339h f5650f;

    /* renamed from: g, reason: collision with root package name */
    public C0339h f5651g;

    public C0401b() {
        O0.c cVar = AbstractC0402c.f5652a;
        k kVar = k.f3741d;
        C0405f c0405f = new C0405f();
        C0400a c0400a = new C0400a();
        c0400a.f5644a = cVar;
        c0400a.f5645b = kVar;
        c0400a.f5646c = c0405f;
        c0400a.f5647d = 0L;
        this.f5648d = c0400a;
        this.f5649e = new m(this);
    }

    public static C0339h b(C0401b c0401b, long j3, AbstractC0404e abstractC0404e, float f3, C0344m c0344m, int i3) {
        C0339h e3 = c0401b.e(abstractC0404e);
        if (f3 != 1.0f) {
            j3 = C0352v.b(j3, C0352v.d(j3) * f3);
        }
        if (!C0352v.c(M.c(((Paint) e3.f5415b).getColor()), j3)) {
            e3.e(j3);
        }
        if (((Shader) e3.f5416c) != null) {
            e3.f5416c = null;
            ((Paint) e3.f5415b).setShader(null);
        }
        if (!j.a((C0344m) e3.f5417d, c0344m)) {
            e3.f(c0344m);
        }
        if (!M.p(e3.f5414a, i3)) {
            e3.d(i3);
        }
        if (!M.r(((Paint) e3.f5415b).isFilterBitmap() ? 1 : 0, 1)) {
            ((Paint) e3.f5415b).setFilterBitmap(!M.r(1, 0));
        }
        return e3;
    }

    @Override // d0.InterfaceC0403d
    public final void A(long j3, long j4, long j5, long j6, AbstractC0404e abstractC0404e, float f3, C0344m c0344m, int i3) {
        this.f5648d.f5646c.m(C0238c.d(j4), C0238c.e(j4), C0241f.d(j5) + C0238c.d(j4), C0241f.b(j5) + C0238c.e(j4), AbstractC0236a.b(j6), AbstractC0236a.c(j6), b(this, j3, abstractC0404e, f3, c0344m, i3));
    }

    @Override // d0.InterfaceC0403d
    public final void F(long j3, long j4, long j5, float f3, AbstractC0404e abstractC0404e, C0344m c0344m, int i3) {
        this.f5648d.f5646c.b(C0238c.d(j4), C0238c.e(j4), C0241f.d(j5) + C0238c.d(j4), C0241f.b(j5) + C0238c.e(j4), b(this, j3, abstractC0404e, f3, c0344m, i3));
    }

    @Override // d0.InterfaceC0403d
    public final void M(long j3, float f3, long j4, float f4, AbstractC0404e abstractC0404e, C0344m c0344m, int i3) {
        this.f5648d.f5646c.j(f3, j4, b(this, j3, abstractC0404e, f4, c0344m, i3));
    }

    @Override // d0.InterfaceC0403d
    public final m S() {
        return this.f5649e;
    }

    @Override // d0.InterfaceC0403d
    public final void X(C0341j c0341j, long j3, float f3, AbstractC0404e abstractC0404e, C0344m c0344m, int i3) {
        this.f5648d.f5646c.k(c0341j, b(this, j3, abstractC0404e, f3, c0344m, i3));
    }

    @Override // O0.b
    public final float a() {
        return this.f5648d.f5644a.a();
    }

    @Override // d0.InterfaceC0403d
    public final void a0(L l3, AbstractC0347p abstractC0347p, float f3, AbstractC0404e abstractC0404e, C0344m c0344m, int i3) {
        this.f5648d.f5646c.k(l3, c(abstractC0347p, abstractC0404e, f3, c0344m, i3, 1));
    }

    public final C0339h c(AbstractC0347p abstractC0347p, AbstractC0404e abstractC0404e, float f3, C0344m c0344m, int i3, int i4) {
        C0339h e3 = e(abstractC0404e);
        if (abstractC0347p != null) {
            abstractC0347p.a(f3, d(), e3);
        } else {
            if (((Shader) e3.f5416c) != null) {
                e3.f5416c = null;
                ((Paint) e3.f5415b).setShader(null);
            }
            long c2 = M.c(((Paint) e3.f5415b).getColor());
            long j3 = C0352v.f5434b;
            if (!C0352v.c(c2, j3)) {
                e3.e(j3);
            }
            if (((Paint) e3.f5415b).getAlpha() / 255.0f != f3) {
                e3.c(f3);
            }
        }
        if (!j.a((C0344m) e3.f5417d, c0344m)) {
            e3.f(c0344m);
        }
        if (!M.p(e3.f5414a, i3)) {
            e3.d(i3);
        }
        if (!M.r(((Paint) e3.f5415b).isFilterBitmap() ? 1 : 0, i4)) {
            ((Paint) e3.f5415b).setFilterBitmap(!M.r(i4, 0));
        }
        return e3;
    }

    public final C0339h e(AbstractC0404e abstractC0404e) {
        if (j.a(abstractC0404e, C0406g.f5653a)) {
            C0339h c0339h = this.f5650f;
            if (c0339h != null) {
                return c0339h;
            }
            C0339h g3 = M.g();
            g3.i(0);
            this.f5650f = g3;
            return g3;
        }
        if (!(abstractC0404e instanceof C0407h)) {
            throw new C1.c();
        }
        C0339h c0339h2 = this.f5651g;
        if (c0339h2 == null) {
            c0339h2 = M.g();
            c0339h2.i(1);
            this.f5651g = c0339h2;
        }
        Paint paint = (Paint) c0339h2.f5415b;
        float strokeWidth = paint.getStrokeWidth();
        C0407h c0407h = (C0407h) abstractC0404e;
        float f3 = c0407h.f5654a;
        if (strokeWidth != f3) {
            ((Paint) c0339h2.f5415b).setStrokeWidth(f3);
        }
        int a3 = c0339h2.a();
        int i3 = c0407h.f5656c;
        if (!M.s(a3, i3)) {
            c0339h2.g(i3);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f4 = c0407h.f5655b;
        if (strokeMiter != f4) {
            ((Paint) c0339h2.f5415b).setStrokeMiter(f4);
        }
        int b3 = c0339h2.b();
        int i4 = c0407h.f5657d;
        if (!M.t(b3, i4)) {
            c0339h2.h(i4);
        }
        if (!j.a(null, null)) {
            ((Paint) c0339h2.f5415b).setPathEffect(null);
        }
        return c0339h2;
    }

    @Override // d0.InterfaceC0403d
    public final k getLayoutDirection() {
        return this.f5648d.f5645b;
    }

    @Override // d0.InterfaceC0403d
    public final void k0(C0338g c0338g, long j3, long j4, long j5, long j6, float f3, AbstractC0404e abstractC0404e, C0344m c0344m, int i3, int i4) {
        this.f5648d.f5646c.c(c0338g, j3, j4, j5, j6, c(null, abstractC0404e, f3, c0344m, i3, i4));
    }

    @Override // O0.b
    public final float r() {
        return this.f5648d.f5644a.r();
    }
}
