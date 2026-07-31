package t0;

import r0.InterfaceC0886H;

/* loaded from: classes.dex */
public final class l0 implements i0 {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0886H f8768d;

    /* renamed from: e, reason: collision with root package name */
    public final P f8769e;

    public l0(InterfaceC0886H interfaceC0886H, P p3) {
        this.f8768d = interfaceC0886H;
        this.f8769e = p3;
    }

    @Override // t0.i0
    public final boolean L() {
        return this.f8769e.q0().o();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return f2.j.a(this.f8768d, l0Var.f8768d) && f2.j.a(this.f8769e, l0Var.f8769e);
    }

    public final int hashCode() {
        return this.f8769e.hashCode() + (this.f8768d.hashCode() * 31);
    }

    public final String toString() {
        return "PlaceableResult(result=" + this.f8768d + ", placeable=" + this.f8769e + ')';
    }
}
