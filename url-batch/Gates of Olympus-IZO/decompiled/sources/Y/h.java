package Y;

import I2.l;
import M1.v;
import U.k;
import b0.C0281n;
import d0.C0321b;
import g0.AbstractC0393b;
import r0.B;
import r0.D;
import r0.H;
import r0.M;
import r0.z;
import t0.F;
import t0.InterfaceC0907o;
import t0.InterfaceC0914w;
import t0.O;

/* loaded from: classes.dex */
public final class h extends k implements InterfaceC0914w, InterfaceC0907o {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC0393b f3402q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3403r;

    /* renamed from: s, reason: collision with root package name */
    public U.d f3404s;

    /* renamed from: t, reason: collision with root package name */
    public D f3405t;

    /* renamed from: u, reason: collision with root package name */
    public float f3406u;

    /* renamed from: v, reason: collision with root package name */
    public C0281n f3407v;

    public static boolean v0(long j3) {
        if (!a0.f.a(j3, 9205357640488583168L)) {
            float b2 = a0.f.b(j3);
            if (!Float.isInfinite(b2) && !Float.isNaN(b2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean w0(long j3) {
        if (!a0.f.a(j3, 9205357640488583168L)) {
            float d3 = a0.f.d(j3);
            if (!Float.isInfinite(d3) && !Float.isNaN(d3)) {
                return true;
            }
        }
        return false;
    }

    @Override // t0.InterfaceC0914w
    public final B b(O o3, z zVar, long j3) {
        long a3;
        boolean z3 = false;
        boolean z4 = M0.a.d(j3) && M0.a.c(j3);
        if (M0.a.f(j3) && M0.a.e(j3)) {
            z3 = true;
        }
        if (((!this.f3403r || this.f3402q.d() == 9205357640488583168L) && z4) || z3) {
            a3 = M0.a.a(j3, M0.a.h(j3), 0, M0.a.g(j3), 0, 10);
        } else {
            long d3 = this.f3402q.d();
            long h3 = I2.d.h(l.q(j3, w0(d3) ? Math.round(a0.f.d(d3)) : M0.a.j(j3)), l.p(j3, v0(d3) ? Math.round(a0.f.b(d3)) : M0.a.i(j3)));
            if (this.f3403r && this.f3402q.d() != 9205357640488583168L) {
                long h4 = I2.d.h(!w0(this.f3402q.d()) ? a0.f.d(h3) : a0.f.d(this.f3402q.d()), !v0(this.f3402q.d()) ? a0.f.b(h3) : a0.f.b(this.f3402q.d()));
                h3 = (a0.f.d(h3) == 0.0f || a0.f.b(h3) == 0.0f) ? 0L : M.i(h4, this.f3405t.a(h4, h3));
            }
            a3 = M0.a.a(j3, l.q(j3, Math.round(a0.f.d(h3))), 0, l.p(j3, Math.round(a0.f.b(h3))), 0, 10);
        }
        H b2 = zVar.b(a3);
        return o3.Y(b2.f7114d, b2.f7115e, v.f2804d, new g(b2, 0));
    }

    @Override // t0.InterfaceC0907o
    public final void d(F f3) {
        long d3 = this.f3402q.d();
        boolean w02 = w0(d3);
        C0321b c0321b = f3.f7748d;
        long h3 = I2.d.h(w02 ? a0.f.d(d3) : a0.f.d(c0321b.c()), v0(d3) ? a0.f.b(d3) : a0.f.b(c0321b.c()));
        long i3 = (a0.f.d(c0321b.c()) == 0.0f || a0.f.b(c0321b.c()) == 0.0f) ? 0L : M.i(h3, this.f3405t.a(h3, c0321b.c()));
        long a3 = this.f3404s.a(l.e(Math.round(a0.f.d(i3)), Math.round(a0.f.b(i3))), l.e(Math.round(a0.f.d(c0321b.c())), Math.round(a0.f.b(c0321b.c()))), f3.getLayoutDirection());
        float f4 = (int) (a3 >> 32);
        float f5 = (int) (a3 & 4294967295L);
        ((A2.g) c0321b.f4444e.f536b).u(f4, f5);
        try {
            this.f3402q.c(f3, i3, this.f3406u, this.f3407v);
            ((A2.g) c0321b.f4444e.f536b).u(-f4, -f5);
            f3.b();
        } catch (Throwable th) {
            ((A2.g) c0321b.f4444e.f536b).u(-f4, -f5);
            throw th;
        }
    }

    @Override // U.k
    public final boolean k0() {
        return false;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f3402q + ", sizeToIntrinsics=" + this.f3403r + ", alignment=" + this.f3404s + ", alpha=" + this.f3406u + ", colorFilter=" + this.f3407v + ')';
    }
}
