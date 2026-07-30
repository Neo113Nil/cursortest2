package Q0;

/* loaded from: classes.dex */
public final class s implements w0.d, y0.c {

    /* renamed from: e, reason: collision with root package name */
    public final w0.d f863e;

    /* renamed from: f, reason: collision with root package name */
    public final w0.i f864f;

    public s(w0.d dVar, w0.i iVar) {
        this.f863e = dVar;
        this.f864f = iVar;
    }

    @Override // y0.c
    public final y0.c g() {
        w0.d dVar = this.f863e;
        if (dVar instanceof y0.c) {
            return (y0.c) dVar;
        }
        return null;
    }

    @Override // w0.d
    public final w0.i getContext() {
        return this.f864f;
    }

    @Override // w0.d
    public final void resumeWith(Object obj) {
        this.f863e.resumeWith(obj);
    }
}
