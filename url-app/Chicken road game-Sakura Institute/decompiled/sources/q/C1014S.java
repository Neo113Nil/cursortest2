package q;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: q.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1014S implements InterfaceC1021Z {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f9211a;

    /* renamed from: b, reason: collision with root package name */
    public final M0.b f9212b;

    public C1014S(m0 m0Var, M0.b bVar) {
        this.f9211a = m0Var;
        this.f9212b = bVar;
    }

    @Override // q.InterfaceC1021Z
    public final float a(M0.k kVar) {
        m0 m0Var = this.f9211a;
        M0.b bVar = this.f9212b;
        return bVar.i0(m0Var.b(bVar, kVar));
    }

    @Override // q.InterfaceC1021Z
    public final float b(M0.k kVar) {
        m0 m0Var = this.f9211a;
        M0.b bVar = this.f9212b;
        return bVar.i0(m0Var.d(bVar, kVar));
    }

    @Override // q.InterfaceC1021Z
    public final float c() {
        m0 m0Var = this.f9211a;
        M0.b bVar = this.f9212b;
        return bVar.i0(m0Var.c(bVar));
    }

    @Override // q.InterfaceC1021Z
    public final float d() {
        m0 m0Var = this.f9211a;
        M0.b bVar = this.f9212b;
        return bVar.i0(m0Var.a(bVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1014S)) {
            return false;
        }
        C1014S c1014s = (C1014S) obj;
        return Intrinsics.a(this.f9211a, c1014s.f9211a) && Intrinsics.a(this.f9212b, c1014s.f9212b);
    }

    public final int hashCode() {
        return this.f9212b.hashCode() + (this.f9211a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f9211a + ", density=" + this.f9212b + ')';
    }
}
