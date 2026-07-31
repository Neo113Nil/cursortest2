package a1;

/* loaded from: classes.dex */
public final class s implements G0.d, I0.c {

    /* renamed from: e, reason: collision with root package name */
    public final G0.d f1172e;

    /* renamed from: f, reason: collision with root package name */
    public final G0.i f1173f;

    public s(G0.d dVar, G0.i iVar) {
        this.f1172e = dVar;
        this.f1173f = iVar;
    }

    @Override // I0.c
    public final I0.c d() {
        G0.d dVar = this.f1172e;
        if (dVar instanceof I0.c) {
            return (I0.c) dVar;
        }
        return null;
    }

    @Override // G0.d
    public final G0.i e() {
        return this.f1173f;
    }

    @Override // G0.d
    public final void g(Object obj) {
        this.f1172e.g(obj);
    }
}
