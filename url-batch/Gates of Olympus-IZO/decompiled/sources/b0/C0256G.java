package b0;

/* renamed from: b0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0256G extends AbstractC0257H {

    /* renamed from: a, reason: collision with root package name */
    public final a0.e f4213a;

    /* renamed from: b, reason: collision with root package name */
    public final C0278k f4214b;

    public C0256G(a0.e eVar) {
        C0278k c0278k;
        this.f4213a = eVar;
        if (M1.B.H(eVar)) {
            c0278k = null;
        } else {
            c0278k = AbstractC0259J.g();
            InterfaceC0258I.a(c0278k, eVar);
        }
        this.f4214b = c0278k;
    }

    @Override // b0.AbstractC0257H
    public final a0.d a() {
        a0.e eVar = this.f4213a;
        return new a0.d(eVar.f3495a, eVar.f3496b, eVar.f3497c, eVar.f3498d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0256G) {
            return Z1.i.a(this.f4213a, ((C0256G) obj).f4213a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4213a.hashCode();
    }
}
