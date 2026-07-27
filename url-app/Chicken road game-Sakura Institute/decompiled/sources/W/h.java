package W;

import S.n;
import Z.C0316m;
import b0.C0494b;
import e0.AbstractC0557b;
import p0.AbstractC0954O;
import p0.AbstractC0960V;
import p0.C0949J;
import p0.InterfaceC0944E;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import r0.G;
import r0.InterfaceC1074o;
import r0.InterfaceC1081w;
import r0.O;
import u3.l;
import w2.C1294c;
import z2.C1412P;

/* loaded from: classes.dex */
public final class h extends n implements InterfaceC1081w, InterfaceC1074o {

    /* renamed from: t, reason: collision with root package name */
    public AbstractC0557b f4199t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4200u;

    /* renamed from: v, reason: collision with root package name */
    public S.c f4201v;

    /* renamed from: w, reason: collision with root package name */
    public C0949J f4202w;

    /* renamed from: x, reason: collision with root package name */
    public float f4203x;

    /* renamed from: y, reason: collision with root package name */
    public C0316m f4204y;

    public static boolean C0(long j4) {
        if (!Y.f.a(j4, 9205357640488583168L)) {
            float b4 = Y.f.b(j4);
            if (!Float.isInfinite(b4) && !Float.isNaN(b4)) {
                return true;
            }
        }
        return false;
    }

    public static boolean D0(long j4) {
        if (!Y.f.a(j4, 9205357640488583168L)) {
            float d4 = Y.f.d(j4);
            if (!Float.isInfinite(d4) && !Float.isNaN(d4)) {
                return true;
            }
        }
        return false;
    }

    public final boolean B0() {
        return this.f4200u && this.f4199t.d() != 9205357640488583168L;
    }

    public final long E0(long j4) {
        boolean z4 = false;
        boolean z5 = M0.a.e(j4) && M0.a.d(j4);
        if (M0.a.g(j4) && M0.a.f(j4)) {
            z4 = true;
        }
        if ((!B0() && z5) || z4) {
            return M0.a.b(j4, M0.a.i(j4), 0, M0.a.h(j4), 0, 10);
        }
        long d4 = this.f4199t.d();
        long N3 = l.N(u3.d.s(j4, D0(d4) ? Math.round(Y.f.d(d4)) : M0.a.k(j4)), u3.d.r(j4, C0(d4) ? Math.round(Y.f.b(d4)) : M0.a.j(j4)));
        if (B0()) {
            long N4 = l.N(!D0(this.f4199t.d()) ? Y.f.d(N3) : Y.f.d(this.f4199t.d()), !C0(this.f4199t.d()) ? Y.f.b(N3) : Y.f.b(this.f4199t.d()));
            N3 = (Y.f.d(N3) == 0.0f || Y.f.b(N3) == 0.0f) ? 0L : AbstractC0960V.i(N4, this.f4202w.c(N4, N3));
        }
        return M0.a.b(j4, u3.d.s(j4, Math.round(Y.f.d(N3))), 0, u3.d.r(j4, Math.round(Y.f.b(N3))), 0, 10);
    }

    @Override // r0.InterfaceC1074o
    public final void a(G g4) {
        long d4 = this.f4199t.d();
        boolean D02 = D0(d4);
        C0494b c0494b = g4.f9624d;
        long N3 = l.N(D02 ? Y.f.d(d4) : Y.f.d(c0494b.h()), C0(d4) ? Y.f.b(d4) : Y.f.b(c0494b.h()));
        long i2 = (Y.f.d(c0494b.h()) == 0.0f || Y.f.b(c0494b.h()) == 0.0f) ? 0L : AbstractC0960V.i(N3, this.f4202w.c(N3, c0494b.h()));
        long a4 = this.f4201v.a(u3.d.c(Math.round(Y.f.d(i2)), Math.round(Y.f.b(i2))), u3.d.c(Math.round(Y.f.d(c0494b.h())), Math.round(Y.f.b(c0494b.h()))), g4.getLayoutDirection());
        float f4 = (int) (a4 >> 32);
        float f5 = (int) (a4 & 4294967295L);
        ((C1294c) c0494b.f5603e.f987e).r(f4, f5);
        try {
            this.f4199t.c(g4, i2, this.f4203x, this.f4204y);
            ((C1294c) c0494b.f5603e.f987e).r(-f4, -f5);
            g4.a();
        } catch (Throwable th) {
            ((C1294c) c0494b.f5603e.f987e).r(-f4, -f5);
            throw th;
        }
    }

    @Override // r0.InterfaceC1081w
    public final int b(O o4, InterfaceC0944E interfaceC0944E, int i2) {
        if (!B0()) {
            return interfaceC0944E.X(i2);
        }
        long E02 = E0(u3.d.b(0, i2, 7));
        return Math.max(M0.a.k(E02), interfaceC0944E.X(i2));
    }

    @Override // r0.InterfaceC1081w
    public final int c(O o4, InterfaceC0944E interfaceC0944E, int i2) {
        if (!B0()) {
            return interfaceC0944E.S(i2);
        }
        long E02 = E0(u3.d.b(0, i2, 7));
        return Math.max(M0.a.k(E02), interfaceC0944E.S(i2));
    }

    @Override // r0.InterfaceC1081w
    public final int d(O o4, InterfaceC0944E interfaceC0944E, int i2) {
        if (!B0()) {
            return interfaceC0944E.Z(i2);
        }
        long E02 = E0(u3.d.b(i2, 0, 13));
        return Math.max(M0.a.j(E02), interfaceC0944E.Z(i2));
    }

    @Override // r0.InterfaceC1081w
    public final int f(O o4, InterfaceC0944E interfaceC0944E, int i2) {
        if (!B0()) {
            return interfaceC0944E.b(i2);
        }
        long E02 = E0(u3.d.b(i2, 0, 13));
        return Math.max(M0.a.j(E02), interfaceC0944E.b(i2));
    }

    @Override // r0.InterfaceC1081w
    public final InterfaceC0946G i(InterfaceC0947H interfaceC0947H, InterfaceC0944E interfaceC0944E, long j4) {
        InterfaceC0946G t4;
        AbstractC0954O a4 = interfaceC0944E.a(E0(j4));
        t4 = interfaceC0947H.t(a4.f9005d, a4.f9006e, C1412P.c(), new P0.n(a4, 1));
        return t4;
    }

    @Override // S.n
    public final boolean q0() {
        return false;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f4199t + ", sizeToIntrinsics=" + this.f4200u + ", alignment=" + this.f4201v + ", alpha=" + this.f4203x + ", colorFilter=" + this.f4204y + ')';
    }
}
