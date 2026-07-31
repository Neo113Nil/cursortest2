package r;

/* renamed from: r.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0791C implements InterfaceC0796H {

    /* renamed from: a, reason: collision with root package name */
    public final U f6991a;

    /* renamed from: b, reason: collision with root package name */
    public final M0.b f6992b;

    public C0791C(U u3, M0.b bVar) {
        this.f6991a = u3;
        this.f6992b = bVar;
    }

    @Override // r.InterfaceC0796H
    public final float a(M0.j jVar) {
        U u3 = this.f6991a;
        M0.b bVar = this.f6992b;
        return bVar.Z(u3.b(bVar, jVar));
    }

    @Override // r.InterfaceC0796H
    public final float b(M0.j jVar) {
        U u3 = this.f6991a;
        M0.b bVar = this.f6992b;
        return bVar.Z(u3.d(bVar, jVar));
    }

    @Override // r.InterfaceC0796H
    public final float c() {
        U u3 = this.f6991a;
        M0.b bVar = this.f6992b;
        return bVar.Z(u3.c(bVar));
    }

    @Override // r.InterfaceC0796H
    public final float d() {
        U u3 = this.f6991a;
        M0.b bVar = this.f6992b;
        return bVar.Z(u3.a(bVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0791C)) {
            return false;
        }
        C0791C c0791c = (C0791C) obj;
        return Z1.i.a(this.f6991a, c0791c.f6991a) && Z1.i.a(this.f6992b, c0791c.f6992b);
    }

    public final int hashCode() {
        return this.f6992b.hashCode() + (this.f6991a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f6991a + ", density=" + this.f6992b + ')';
    }
}
