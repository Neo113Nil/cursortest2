package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f3 implements m.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1966a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1967b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1968c;

    public f3(boolean z8, float f9, long j8) {
        this.f1966a = z8;
        this.f1967b = f9;
        this.f1968c = j8;
    }

    @Override // m.l0
    public final r1.l a(p.i iVar) {
        return new b1(iVar, this.f1966a, this.f1967b, new z0(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj;
        if (this.f1966a == f3Var.f1966a && m2.e.a(this.f1967b, f3Var.f1967b)) {
            return z0.u.c(this.f1968c, f3Var.f1968c);
        }
        return false;
    }

    public final int hashCode() {
        int a3 = a0.m.a(this.f1967b, Boolean.hashCode(this.f1966a) * 31, 961);
        int i7 = z0.u.f10058h;
        return Long.hashCode(this.f1968c) + a3;
    }
}
