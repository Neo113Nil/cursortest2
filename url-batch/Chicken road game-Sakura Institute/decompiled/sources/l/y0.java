package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y0 implements x {

    /* renamed from: a, reason: collision with root package name */
    public final int f5731a;

    public y0(int i7) {
        this.f5731a = i7;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y0) && ((y0) obj).f5731a == this.f5731a;
    }

    public final int hashCode() {
        return this.f5731a;
    }

    @Override // l.k
    public final z1 a(w1 w1Var) {
        return new e2(this.f5731a);
    }
}
