package c1;

/* loaded from: classes.dex */
public final class s implements H0.d, J0.c {

    /* renamed from: e, reason: collision with root package name */
    public final H0.d f2030e;

    /* renamed from: f, reason: collision with root package name */
    public final H0.i f2031f;

    public s(H0.d dVar, H0.i iVar) {
        this.f2030e = dVar;
        this.f2031f = iVar;
    }

    @Override // J0.c
    public final J0.c e() {
        H0.d dVar = this.f2030e;
        if (dVar instanceof J0.c) {
            return (J0.c) dVar;
        }
        return null;
    }

    @Override // H0.d
    public final H0.i f() {
        return this.f2031f;
    }

    @Override // H0.d
    public final void j(Object obj) {
        this.f2030e.j(obj);
    }
}
