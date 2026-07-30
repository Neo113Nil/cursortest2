package v;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float f9091a;

    public b(float f9) {
        this.f9091a = f9;
    }

    @Override // v.a
    public final float a(long j8, m2.b bVar) {
        return bVar.y(this.f9091a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && m2.e.a(this.f9091a, ((b) obj).f9091a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f9091a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f9091a + ".dp)";
    }
}
