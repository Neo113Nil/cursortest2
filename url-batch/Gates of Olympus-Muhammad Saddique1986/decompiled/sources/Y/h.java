package Y;

import A.i;
import B.Y;
import S1.v;
import U.p;
import a.AbstractC0235a;
import a0.C0241f;
import b0.C0344m;
import d0.C0401b;
import g0.AbstractC0437b;
import r0.AbstractC0893O;
import r0.AbstractC0898U;
import r0.C0888J;
import r0.InterfaceC0884F;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;
import t0.G;
import t0.InterfaceC1002o;
import t0.InterfaceC1009w;
import t0.P;

/* loaded from: classes.dex */
public final class h extends p implements InterfaceC1009w, InterfaceC1002o {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC0437b f4657q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4658r;

    /* renamed from: s, reason: collision with root package name */
    public U.d f4659s;

    /* renamed from: t, reason: collision with root package name */
    public C0888J f4660t;

    /* renamed from: u, reason: collision with root package name */
    public float f4661u;

    /* renamed from: v, reason: collision with root package name */
    public C0344m f4662v;

    public static boolean A0(long j3) {
        if (!C0241f.a(j3, 9205357640488583168L)) {
            float d3 = C0241f.d(j3);
            if (!Float.isInfinite(d3) && !Float.isNaN(d3)) {
                return true;
            }
        }
        return false;
    }

    public static boolean z0(long j3) {
        if (!C0241f.a(j3, 9205357640488583168L)) {
            float b3 = C0241f.b(j3);
            if (!Float.isInfinite(b3) && !Float.isNaN(b3)) {
                return true;
            }
        }
        return false;
    }

    public final long B0(long j3) {
        boolean z3 = false;
        boolean z4 = O0.a.d(j3) && O0.a.c(j3);
        if (O0.a.f(j3) && O0.a.e(j3)) {
            z3 = true;
        }
        if ((!y0() && z4) || z3) {
            return O0.a.a(j3, O0.a.h(j3), 0, O0.a.g(j3), 0, 10);
        }
        long d3 = this.f4657q.d();
        long e3 = AbstractC0235a.e(O2.d.D(j3, A0(d3) ? Math.round(C0241f.d(d3)) : O0.a.j(j3)), O2.d.C(j3, z0(d3) ? Math.round(C0241f.b(d3)) : O0.a.i(j3)));
        if (y0()) {
            long e4 = AbstractC0235a.e(!A0(this.f4657q.d()) ? C0241f.d(e3) : C0241f.d(this.f4657q.d()), !z0(this.f4657q.d()) ? C0241f.b(e3) : C0241f.b(this.f4657q.d()));
            e3 = (C0241f.d(e3) == 0.0f || C0241f.b(e3) == 0.0f) ? 0L : AbstractC0898U.i(e4, this.f4660t.a(e4, e3));
        }
        return O0.a.a(j3, O2.d.D(j3, Math.round(C0241f.d(e3))), 0, O2.d.C(j3, Math.round(C0241f.b(e3))), 0, 10);
    }

    @Override // t0.InterfaceC1009w
    public final int b(P p3, InterfaceC0884F interfaceC0884F, int i3) {
        if (!y0()) {
            return interfaceC0884F.U(i3);
        }
        long B02 = B0(O2.d.b(0, i3, 7));
        return Math.max(O0.a.j(B02), interfaceC0884F.U(i3));
    }

    @Override // t0.InterfaceC1009w
    public final int c(P p3, InterfaceC0884F interfaceC0884F, int i3) {
        if (!y0()) {
            return interfaceC0884F.V(i3);
        }
        long B02 = B0(O2.d.b(i3, 0, 13));
        return Math.max(O0.a.i(B02), interfaceC0884F.V(i3));
    }

    @Override // t0.InterfaceC1009w
    public final int e(P p3, InterfaceC0884F interfaceC0884F, int i3) {
        if (!y0()) {
            return interfaceC0884F.O(i3);
        }
        long B02 = B0(O2.d.b(0, i3, 7));
        return Math.max(O0.a.j(B02), interfaceC0884F.O(i3));
    }

    @Override // t0.InterfaceC1009w
    public final int f(P p3, InterfaceC0884F interfaceC0884F, int i3) {
        if (!y0()) {
            return interfaceC0884F.c(i3);
        }
        long B02 = B0(O2.d.b(i3, 0, 13));
        return Math.max(O0.a.i(B02), interfaceC0884F.c(i3));
    }

    @Override // t0.InterfaceC1009w
    public final InterfaceC0886H g(InterfaceC0887I interfaceC0887I, InterfaceC0884F interfaceC0884F, long j3) {
        AbstractC0893O b3 = interfaceC0884F.b(B0(j3));
        return interfaceC0887I.i0(b3.f8126d, b3.f8127e, v.f4321d, new i(b3, 3));
    }

    @Override // t0.InterfaceC1002o
    public final void h(G g3) {
        long d3 = this.f4657q.d();
        boolean A02 = A0(d3);
        C0401b c0401b = g3.f8573d;
        long e3 = AbstractC0235a.e(A02 ? C0241f.d(d3) : C0241f.d(c0401b.d()), z0(d3) ? C0241f.b(d3) : C0241f.b(c0401b.d()));
        long i3 = (C0241f.d(c0401b.d()) == 0.0f || C0241f.b(c0401b.d()) == 0.0f) ? 0L : AbstractC0898U.i(e3, this.f4660t.a(e3, c0401b.d()));
        long a3 = this.f4659s.a(O2.d.d(Math.round(C0241f.d(i3)), Math.round(C0241f.b(i3))), O2.d.d(Math.round(C0241f.d(c0401b.d())), Math.round(C0241f.b(c0401b.d()))), g3.getLayoutDirection());
        float f3 = (int) (a3 >> 32);
        float f4 = (int) (a3 & 4294967295L);
        ((Y) c0401b.f5649e.f2116b).r(f3, f4);
        try {
            this.f4657q.c(g3, i3, this.f4661u, this.f4662v);
            ((Y) c0401b.f5649e.f2116b).r(-f3, -f4);
            g3.b();
        } catch (Throwable th) {
            ((Y) c0401b.f5649e.f2116b).r(-f3, -f4);
            throw th;
        }
    }

    @Override // U.p
    public final boolean n0() {
        return false;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f4657q + ", sizeToIntrinsics=" + this.f4658r + ", alignment=" + this.f4659s + ", alpha=" + this.f4661u + ", colorFilter=" + this.f4662v + ')';
    }

    public final boolean y0() {
        return this.f4658r && this.f4657q.d() != 9205357640488583168L;
    }
}
