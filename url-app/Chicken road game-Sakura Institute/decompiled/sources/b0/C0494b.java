package b0;

import B1.C0097d;
import M0.k;
import Z.AbstractC0319p;
import Z.C0310g;
import Z.C0311h;
import Z.C0313j;
import Z.C0316m;
import Z.C0323u;
import Z.J;
import Z.K;
import Z.r;
import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;
import y2.C1338m;

/* renamed from: b0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0494b implements InterfaceC0496d {

    /* renamed from: d, reason: collision with root package name */
    public final C0493a f5602d;

    /* renamed from: e, reason: collision with root package name */
    public final C0097d f5603e;

    /* renamed from: i, reason: collision with root package name */
    public C0311h f5604i;

    /* renamed from: j, reason: collision with root package name */
    public C0311h f5605j;

    public C0494b() {
        M0.c cVar = AbstractC0495c.f5606a;
        k kVar = k.f3555d;
        C0498f c0498f = new C0498f();
        C0493a c0493a = new C0493a();
        c0493a.f5598a = cVar;
        c0493a.f5599b = kVar;
        c0493a.f5600c = c0498f;
        c0493a.f5601d = 0L;
        this.f5602d = c0493a;
        this.f5603e = new C0097d(this);
    }

    public static C0311h a(C0494b c0494b, long j4, AbstractC0497e abstractC0497e, float f4, C0316m c0316m, int i2) {
        C0311h c4 = c0494b.c(abstractC0497e);
        if (f4 != 1.0f) {
            j4 = C0323u.b(C0323u.d(j4) * f4, j4);
        }
        if (!C0323u.c(K.c(((Paint) c4.f4525b).getColor()), j4)) {
            c4.e(j4);
        }
        if (((Shader) c4.f4526c) != null) {
            c4.h(null);
        }
        if (!Intrinsics.a((C0316m) c4.f4527d, c0316m)) {
            c4.f(c0316m);
        }
        if (!K.o(c4.f4524a, i2)) {
            c4.d(i2);
        }
        if (!K.q(((Paint) c4.f4525b).isFilterBitmap() ? 1 : 0, 1)) {
            c4.g(1);
        }
        return c4;
    }

    @Override // b0.InterfaceC0496d
    public final void B(long j4, long j5, long j6, float f4, AbstractC0497e abstractC0497e, C0316m c0316m, int i2) {
        this.f5602d.f5600c.m(Y.c.d(j5), Y.c.e(j5), Y.f.d(j6) + Y.c.d(j5), Y.f.b(j6) + Y.c.e(j5), a(this, j4, abstractC0497e, f4, c0316m, i2));
    }

    @Override // b0.InterfaceC0496d
    public final void D(C0313j c0313j, long j4, float f4, AbstractC0497e abstractC0497e, C0316m c0316m, int i2) {
        this.f5602d.f5600c.c(c0313j, a(this, j4, abstractC0497e, f4, c0316m, i2));
    }

    @Override // b0.InterfaceC0496d
    public final void O(long j4, long j5, long j6, long j7, AbstractC0497e abstractC0497e, float f4, C0316m c0316m, int i2) {
        this.f5602d.f5600c.a(Y.c.d(j5), Y.c.e(j5), Y.f.d(j6) + Y.c.d(j5), Y.f.b(j6) + Y.c.e(j5), Y.a.b(j7), Y.a.c(j7), a(this, j4, abstractC0497e, f4, c0316m, i2));
    }

    @Override // b0.InterfaceC0496d
    public final void V(long j4, float f4, long j5, float f5, AbstractC0497e abstractC0497e, C0316m c0316m, int i2) {
        this.f5602d.f5600c.e(f4, j5, a(this, j4, abstractC0497e, f5, c0316m, i2));
    }

    @Override // b0.InterfaceC0496d
    public final C0097d Y() {
        return this.f5603e;
    }

    public final C0311h b(AbstractC0319p abstractC0319p, AbstractC0497e abstractC0497e, float f4, C0316m c0316m, int i2, int i4) {
        C0311h c4 = c(abstractC0497e);
        if (abstractC0319p != null) {
            abstractC0319p.a(f4, h(), c4);
        } else {
            if (((Shader) c4.f4526c) != null) {
                c4.h(null);
            }
            long c5 = K.c(((Paint) c4.f4525b).getColor());
            long j4 = C0323u.f4542b;
            if (!C0323u.c(c5, j4)) {
                c4.e(j4);
            }
            if (((Paint) c4.f4525b).getAlpha() / 255.0f != f4) {
                c4.c(f4);
            }
        }
        if (!Intrinsics.a((C0316m) c4.f4527d, c0316m)) {
            c4.f(c0316m);
        }
        if (!K.o(c4.f4524a, i2)) {
            c4.d(i2);
        }
        if (!K.q(((Paint) c4.f4525b).isFilterBitmap() ? 1 : 0, i4)) {
            c4.g(i4);
        }
        return c4;
    }

    public final C0311h c(AbstractC0497e abstractC0497e) {
        if (Intrinsics.a(abstractC0497e, C0499g.f5607a)) {
            C0311h c0311h = this.f5604i;
            if (c0311h != null) {
                return c0311h;
            }
            C0311h g4 = K.g();
            g4.l(0);
            this.f5604i = g4;
            return g4;
        }
        if (!(abstractC0497e instanceof C0500h)) {
            throw new C1338m();
        }
        C0311h c0311h2 = this.f5605j;
        if (c0311h2 == null) {
            c0311h2 = K.g();
            c0311h2.l(1);
            this.f5605j = c0311h2;
        }
        Paint paint = (Paint) c0311h2.f4525b;
        float strokeWidth = paint.getStrokeWidth();
        C0500h c0500h = (C0500h) abstractC0497e;
        float f4 = c0500h.f5608a;
        if (strokeWidth != f4) {
            c0311h2.k(f4);
        }
        int a4 = c0311h2.a();
        int i2 = c0500h.f5610c;
        if (!K.r(a4, i2)) {
            c0311h2.i(i2);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f5 = c0500h.f5609b;
        if (strokeMiter != f5) {
            ((Paint) c0311h2.f4525b).setStrokeMiter(f5);
        }
        int b4 = c0311h2.b();
        int i4 = c0500h.f5611d;
        if (!K.s(b4, i4)) {
            c0311h2.j(i4);
        }
        if (!Intrinsics.a(null, null)) {
            ((Paint) c0311h2.f4525b).setPathEffect(null);
        }
        return c0311h2;
    }

    @Override // b0.InterfaceC0496d
    public final void c0(C0310g c0310g, long j4, long j5, long j6, long j7, float f4, AbstractC0497e abstractC0497e, C0316m c0316m, int i2, int i4) {
        this.f5602d.f5600c.i(c0310g, j4, j5, j6, j7, b(null, abstractC0497e, f4, c0316m, i2, i4));
    }

    @Override // M0.b
    public final float e() {
        return this.f5602d.f5598a.e();
    }

    @Override // b0.InterfaceC0496d
    public final k getLayoutDirection() {
        return this.f5602d.f5599b;
    }

    @Override // b0.InterfaceC0496d
    public final void m0(J j4, AbstractC0319p abstractC0319p, float f4, AbstractC0497e abstractC0497e, C0316m c0316m, int i2) {
        this.f5602d.f5600c.c(j4, b(abstractC0319p, abstractC0497e, f4, c0316m, i2, 1));
    }

    @Override // b0.InterfaceC0496d
    public final void o(long j4, long j5, long j6, float f4, int i2, float f5, C0316m c0316m, int i4) {
        r rVar = this.f5602d.f5600c;
        C0311h c0311h = this.f5605j;
        if (c0311h == null) {
            c0311h = K.g();
            c0311h.l(1);
            this.f5605j = c0311h;
        }
        C0311h c0311h2 = c0311h;
        long b4 = f5 == 1.0f ? j4 : C0323u.b(C0323u.d(j4) * f5, j4);
        if (!C0323u.c(K.c(((Paint) c0311h2.f4525b).getColor()), b4)) {
            c0311h2.e(b4);
        }
        if (((Shader) c0311h2.f4526c) != null) {
            c0311h2.h(null);
        }
        if (!Intrinsics.a((C0316m) c0311h2.f4527d, c0316m)) {
            c0311h2.f(c0316m);
        }
        if (!K.o(c0311h2.f4524a, i4)) {
            c0311h2.d(i4);
        }
        Paint paint = (Paint) c0311h2.f4525b;
        if (paint.getStrokeWidth() != f4) {
            c0311h2.k(f4);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            ((Paint) c0311h2.f4525b).setStrokeMiter(4.0f);
        }
        if (!K.r(c0311h2.a(), i2)) {
            c0311h2.i(i2);
        }
        if (!K.s(c0311h2.b(), 0)) {
            c0311h2.j(0);
        }
        if (!Intrinsics.a(null, null)) {
            ((Paint) c0311h2.f4525b).setPathEffect(null);
        }
        if (!K.q(paint.isFilterBitmap() ? 1 : 0, 1)) {
            c0311h2.g(1);
        }
        rVar.h(j5, j6, c0311h2);
    }

    @Override // M0.b
    public final float q() {
        return this.f5602d.f5598a.q();
    }
}
