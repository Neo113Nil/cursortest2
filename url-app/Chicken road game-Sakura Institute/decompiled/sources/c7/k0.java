package c7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k0 implements u0 {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1711f;

    public k0(boolean z8) {
        this.f1711f = z8;
    }

    @Override // c7.u0
    public final boolean b() {
        return this.f1711f;
    }

    @Override // c7.u0
    public final h1 c() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f1711f ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
