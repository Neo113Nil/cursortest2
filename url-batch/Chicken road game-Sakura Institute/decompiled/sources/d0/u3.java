package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class u3 implements z0.v, r6.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h2 f2460a;

    public u3(h2 h2Var) {
        this.f2460a = h2Var;
    }

    @Override // r6.f
    public final d6.e a() {
        return this.f2460a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z0.v) || !(obj instanceof r6.f)) {
            return false;
        }
        return this.f2460a.equals(((r6.f) obj).a());
    }

    public final int hashCode() {
        return this.f2460a.hashCode();
    }
}
