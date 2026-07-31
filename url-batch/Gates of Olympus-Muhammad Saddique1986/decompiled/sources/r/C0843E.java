package r;

/* renamed from: r.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0843E implements InterfaceC0849K {

    /* renamed from: a, reason: collision with root package name */
    public final X f7962a;

    /* renamed from: b, reason: collision with root package name */
    public final O0.b f7963b;

    public C0843E(X x3, O0.b bVar) {
        this.f7962a = x3;
        this.f7963b = bVar;
    }

    @Override // r.InterfaceC0849K
    public final float a(O0.k kVar) {
        X x3 = this.f7962a;
        O0.b bVar = this.f7963b;
        return bVar.Y(x3.c(bVar, kVar));
    }

    @Override // r.InterfaceC0849K
    public final float b(O0.k kVar) {
        X x3 = this.f7962a;
        O0.b bVar = this.f7963b;
        return bVar.Y(x3.a(bVar, kVar));
    }

    @Override // r.InterfaceC0849K
    public final float c() {
        X x3 = this.f7962a;
        O0.b bVar = this.f7963b;
        return bVar.Y(x3.d(bVar));
    }

    @Override // r.InterfaceC0849K
    public final float d() {
        X x3 = this.f7962a;
        O0.b bVar = this.f7963b;
        return bVar.Y(x3.b(bVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0843E)) {
            return false;
        }
        C0843E c0843e = (C0843E) obj;
        return f2.j.a(this.f7962a, c0843e.f7962a) && f2.j.a(this.f7963b, c0843e.f7963b);
    }

    public final int hashCode() {
        return this.f7963b.hashCode() + (this.f7962a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f7962a + ", density=" + this.f7963b + ')';
    }
}
