package o5;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public l5.j f6849a;

    /* renamed from: b, reason: collision with root package name */
    public l5.f f6850b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f6849a.equals(gVar.f6849a)) {
            return this.f6850b.equals(gVar.f6850b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6850b.hashCode() + (this.f6849a.hashCode() * 31);
    }
}
