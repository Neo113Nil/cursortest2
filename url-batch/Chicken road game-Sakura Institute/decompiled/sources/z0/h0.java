package z0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h0 extends j0 {

    /* renamed from: a, reason: collision with root package name */
    public final y0.d f9997a;

    public h0(y0.d dVar) {
        this.f9997a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h0) {
            return r6.k.a(this.f9997a, ((h0) obj).f9997a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9997a.hashCode();
    }
}
