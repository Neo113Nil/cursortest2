package r;

import F.C0037e0;
import I.C0089d;
import I.C0102j0;
import r0.InterfaceC0840m;
import s0.InterfaceC0886c;

/* renamed from: r.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0790B implements InterfaceC0840m, InterfaceC0886c, s0.f {

    /* renamed from: a, reason: collision with root package name */
    public final U f6988a;

    /* renamed from: b, reason: collision with root package name */
    public final C0102j0 f6989b;

    /* renamed from: c, reason: collision with root package name */
    public final C0102j0 f6990c;

    public C0790B(U u3) {
        this.f6988a = u3;
        I.X x3 = I.X.f2228i;
        this.f6989b = C0089d.J(u3, x3);
        this.f6990c = C0089d.J(u3, x3);
    }

    @Override // r0.InterfaceC0840m
    public final r0.B b(t0.O o3, r0.z zVar, long j3) {
        C0102j0 c0102j0 = this.f6989b;
        int d3 = ((U) c0102j0.getValue()).d(o3, o3.getLayoutDirection());
        int a3 = ((U) c0102j0.getValue()).a(o3);
        int b2 = ((U) c0102j0.getValue()).b(o3, o3.getLayoutDirection()) + d3;
        int c3 = ((U) c0102j0.getValue()).c(o3) + a3;
        r0.H b3 = zVar.b(I2.l.J(-b2, -c3, j3));
        return o3.Y(I2.l.q(j3, b3.f7114d + b2), I2.l.p(j3, b3.f7115e + c3), M1.v.f2804d, new C0037e0(b3, d3, a3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0790B) {
            return Z1.i.a(((C0790B) obj).f6988a, this.f6988a);
        }
        return false;
    }

    @Override // s0.InterfaceC0886c
    public final void f(s0.g gVar) {
        U u3 = (U) gVar.e(X.f7049a);
        U u4 = this.f6988a;
        this.f6989b.setValue(new C0826x(u4, u3));
        this.f6990c.setValue(new Q(u3, u4));
    }

    @Override // s0.f
    public final s0.h getKey() {
        return X.f7049a;
    }

    @Override // s0.f
    public final Object getValue() {
        return (U) this.f6990c.getValue();
    }

    public final int hashCode() {
        return this.f6988a.hashCode();
    }
}
