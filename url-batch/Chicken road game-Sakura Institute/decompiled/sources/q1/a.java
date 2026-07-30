package q1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends a.a {

    /* renamed from: b, reason: collision with root package name */
    public f f7480b;

    @Override // a.a
    public final boolean p(h hVar) {
        return hVar == this.f7480b.getKey();
    }

    @Override // a.a
    public final Object v(h hVar) {
        if (hVar == this.f7480b.getKey()) {
            return this.f7480b.getValue();
        }
        a.a.M("Check failed.");
        throw null;
    }
}
