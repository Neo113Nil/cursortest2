package g7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z implements h6.d, j6.d {

    /* renamed from: f, reason: collision with root package name */
    public final h6.d f4534f;

    /* renamed from: g, reason: collision with root package name */
    public final h6.i f4535g;

    public z(h6.d dVar, h6.i iVar) {
        this.f4534f = dVar;
        this.f4535g = iVar;
    }

    @Override // j6.d
    public final j6.d getCallerFrame() {
        h6.d dVar = this.f4534f;
        if (dVar instanceof j6.d) {
            return (j6.d) dVar;
        }
        return null;
    }

    @Override // h6.d
    public final h6.i getContext() {
        return this.f4535g;
    }

    @Override // h6.d
    public final void resumeWith(Object obj) {
        this.f4534f.resumeWith(obj);
    }
}
