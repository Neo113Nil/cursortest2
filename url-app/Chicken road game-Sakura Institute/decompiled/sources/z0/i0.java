package z0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i0 extends j0 {

    /* renamed from: a, reason: collision with root package name */
    public final y0.e f10000a;

    /* renamed from: b, reason: collision with root package name */
    public final j f10001b;

    public i0(y0.e eVar) {
        j jVar;
        this.f10000a = eVar;
        if (u3.z.i(eVar)) {
            jVar = null;
        } else {
            jVar = l0.h();
            k0.a(jVar, eVar);
        }
        this.f10001b = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i0) {
            return r6.k.a(this.f10000a, ((i0) obj).f10000a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10000a.hashCode();
    }
}
