package d0;

import D1.C0014b;
import M0.j;
import Z1.i;
import android.graphics.Paint;
import android.graphics.Shader;
import b0.AbstractC0259J;
import b0.C0275h;
import b0.C0276i;
import b0.C0278k;
import b0.C0281n;
import b0.C0288u;
import b0.InterfaceC0258I;
import b0.InterfaceC0285r;

/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0321b implements InterfaceC0323d {

    /* renamed from: d, reason: collision with root package name */
    public final C0320a f4443d;

    /* renamed from: e, reason: collision with root package name */
    public final C0014b f4444e;

    /* renamed from: f, reason: collision with root package name */
    public C0276i f4445f;

    /* renamed from: g, reason: collision with root package name */
    public C0276i f4446g;

    public C0321b() {
        M0.c cVar = AbstractC0322c.f4447a;
        j jVar = j.f2775d;
        C0324e c0324e = new C0324e();
        C0320a c0320a = new C0320a();
        c0320a.f4439a = cVar;
        c0320a.f4440b = jVar;
        c0320a.f4441c = c0324e;
        c0320a.f4442d = 0L;
        this.f4443d = c0320a;
        this.f4444e = new C0014b(this);
    }

    public static C0276i b(C0321b c0321b, long j3, AbstractC0322c abstractC0322c, float f3, C0281n c0281n, int i3) {
        C0276i e3 = c0321b.e(abstractC0322c);
        if (f3 != 1.0f) {
            j3 = C0288u.b(j3, C0288u.d(j3) * f3);
        }
        if (!C0288u.c(AbstractC0259J.b(((Paint) e3.f4273b).getColor()), j3)) {
            e3.e(j3);
        }
        if (((Shader) e3.f4274c) != null) {
            e3.g(null);
        }
        if (!i.a((C0281n) e3.f4275d, c0281n)) {
            e3.f(c0281n);
        }
        if (!AbstractC0259J.n(e3.f4272a, i3)) {
            e3.d(i3);
        }
        if (!AbstractC0259J.p(((Paint) e3.f4273b).isFilterBitmap() ? 1 : 0, 1)) {
            ((Paint) e3.f4273b).setFilterBitmap(!AbstractC0259J.p(1, 0));
        }
        return e3;
    }

    @Override // d0.InterfaceC0323d
    public final void M(C0278k c0278k, long j3, float f3, AbstractC0322c abstractC0322c, C0281n c0281n, int i3) {
        this.f4443d.f4441c.k(c0278k, b(this, j3, abstractC0322c, f3, c0281n, i3));
    }

    @Override // d0.InterfaceC0323d
    public final C0014b P() {
        return this.f4444e;
    }

    @Override // d0.InterfaceC0323d
    public final void V(long j3, long j4, long j5, float f3, int i3, float f4, C0281n c0281n, int i4) {
        InterfaceC0285r interfaceC0285r = this.f4443d.f4441c;
        C0276i c0276i = this.f4446g;
        if (c0276i == null) {
            c0276i = AbstractC0259J.f();
            c0276i.j(1);
            this.f4446g = c0276i;
        }
        C0276i c0276i2 = c0276i;
        long b2 = f4 == 1.0f ? j3 : C0288u.b(j3, C0288u.d(j3) * f4);
        if (!C0288u.c(AbstractC0259J.b(((Paint) c0276i2.f4273b).getColor()), b2)) {
            c0276i2.e(b2);
        }
        if (((Shader) c0276i2.f4274c) != null) {
            c0276i2.g(null);
        }
        if (!i.a((C0281n) c0276i2.f4275d, c0281n)) {
            c0276i2.f(c0281n);
        }
        if (!AbstractC0259J.n(c0276i2.f4272a, i4)) {
            c0276i2.d(i4);
        }
        Paint paint = (Paint) c0276i2.f4273b;
        if (paint.getStrokeWidth() != f3) {
            ((Paint) c0276i2.f4273b).setStrokeWidth(f3);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            ((Paint) c0276i2.f4273b).setStrokeMiter(4.0f);
        }
        if (!AbstractC0259J.q(c0276i2.a(), i3)) {
            c0276i2.h(i3);
        }
        if (!AbstractC0259J.r(c0276i2.b(), 0)) {
            c0276i2.i(0);
        }
        if (!i.a(null, null)) {
            ((Paint) c0276i2.f4273b).setPathEffect(null);
        }
        if (!AbstractC0259J.p(paint.isFilterBitmap() ? 1 : 0, 1)) {
            ((Paint) c0276i2.f4273b).setFilterBitmap(!AbstractC0259J.p(1, 0));
        }
        interfaceC0285r.g(j4, j5, c0276i2);
    }

    @Override // M0.b
    public final float a() {
        return this.f4443d.f4439a.a();
    }

    public final C0276i d(AbstractC0259J abstractC0259J, AbstractC0322c abstractC0322c, float f3, C0281n c0281n, int i3, int i4) {
        C0276i e3 = e(abstractC0322c);
        if (abstractC0259J != null) {
            abstractC0259J.j(f3, c(), e3);
        } else {
            if (((Shader) e3.f4274c) != null) {
                e3.g(null);
            }
            long b2 = AbstractC0259J.b(((Paint) e3.f4273b).getColor());
            long j3 = C0288u.f4292b;
            if (!C0288u.c(b2, j3)) {
                e3.e(j3);
            }
            if (((Paint) e3.f4273b).getAlpha() / 255.0f != f3) {
                e3.c(f3);
            }
        }
        if (!i.a((C0281n) e3.f4275d, c0281n)) {
            e3.f(c0281n);
        }
        if (!AbstractC0259J.n(e3.f4272a, i3)) {
            e3.d(i3);
        }
        if (!AbstractC0259J.p(((Paint) e3.f4273b).isFilterBitmap() ? 1 : 0, i4)) {
            ((Paint) e3.f4273b).setFilterBitmap(!AbstractC0259J.p(i4, 0));
        }
        return e3;
    }

    public final C0276i e(AbstractC0322c abstractC0322c) {
        if (i.a(abstractC0322c, C0325f.f4448b)) {
            C0276i c0276i = this.f4445f;
            if (c0276i != null) {
                return c0276i;
            }
            C0276i f3 = AbstractC0259J.f();
            f3.j(0);
            this.f4445f = f3;
            return f3;
        }
        if (!(abstractC0322c instanceof C0326g)) {
            throw new L1.f();
        }
        C0276i c0276i2 = this.f4446g;
        if (c0276i2 == null) {
            c0276i2 = AbstractC0259J.f();
            c0276i2.j(1);
            this.f4446g = c0276i2;
        }
        Paint paint = (Paint) c0276i2.f4273b;
        float strokeWidth = paint.getStrokeWidth();
        C0326g c0326g = (C0326g) abstractC0322c;
        float f4 = c0326g.f4449b;
        if (strokeWidth != f4) {
            ((Paint) c0276i2.f4273b).setStrokeWidth(f4);
        }
        int a3 = c0276i2.a();
        int i3 = c0326g.f4451d;
        if (!AbstractC0259J.q(a3, i3)) {
            c0276i2.h(i3);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f5 = c0326g.f4450c;
        if (strokeMiter != f5) {
            ((Paint) c0276i2.f4273b).setStrokeMiter(f5);
        }
        int b2 = c0276i2.b();
        int i4 = c0326g.f4452e;
        if (!AbstractC0259J.r(b2, i4)) {
            c0276i2.i(i4);
        }
        if (!i.a(null, null)) {
            ((Paint) c0276i2.f4273b).setPathEffect(null);
        }
        return c0276i2;
    }

    @Override // d0.InterfaceC0323d
    public final void f(C0275h c0275h, long j3, long j4, long j5, long j6, float f3, AbstractC0322c abstractC0322c, C0281n c0281n, int i3, int i4) {
        this.f4443d.f4441c.c(c0275h, j3, j4, j5, j6, d(null, abstractC0322c, f3, c0281n, i3, i4));
    }

    @Override // d0.InterfaceC0323d
    public final void g(long j3, long j4, long j5, float f3, AbstractC0322c abstractC0322c, C0281n c0281n, int i3) {
        this.f4443d.f4441c.s(a0.c.d(j4), a0.c.e(j4), a0.f.d(j5) + a0.c.d(j4), a0.f.b(j5) + a0.c.e(j4), b(this, j3, abstractC0322c, f3, c0281n, i3));
    }

    @Override // d0.InterfaceC0323d
    public final j getLayoutDirection() {
        return this.f4443d.f4440b;
    }

    @Override // d0.InterfaceC0323d
    public final void h0(long j3, float f3, long j4, float f4, AbstractC0322c abstractC0322c, C0281n c0281n, int i3) {
        this.f4443d.f4441c.j(f3, j4, b(this, j3, abstractC0322c, f4, c0281n, i3));
    }

    @Override // M0.b
    public final float p() {
        return this.f4443d.f4439a.p();
    }

    @Override // d0.InterfaceC0323d
    public final void x(long j3, long j4, long j5, float f3, AbstractC0322c abstractC0322c, C0281n c0281n, int i3) {
        this.f4443d.f4441c.b(a0.c.d(j4), a0.c.e(j4), a0.f.d(j5) + a0.c.d(j4), a0.f.b(j5) + a0.c.e(j4), b(this, j3, abstractC0322c, f3, c0281n, i3));
    }

    @Override // d0.InterfaceC0323d
    public final void z(InterfaceC0258I interfaceC0258I, AbstractC0259J abstractC0259J, float f3, AbstractC0322c abstractC0322c, C0281n c0281n, int i3) {
        this.f4443d.f4441c.k(interfaceC0258I, d(abstractC0259J, abstractC0322c, f3, c0281n, i3, 1));
    }
}
