package q5;

import t5.t;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final l5.f f7535a;

    /* renamed from: b, reason: collision with root package name */
    public final h f7536b;

    public i(l5.f fVar, h hVar) {
        this.f7535a = fVar;
        this.f7536b = hVar;
    }

    public static i a(l5.f fVar) {
        return new i(fVar, h.f7529f);
    }

    public final boolean b() {
        h hVar = this.f7536b;
        return hVar.d() && hVar.f7534e.equals(t.f8922a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f7535a.equals(iVar.f7535a) && this.f7536b.equals(iVar.f7536b);
    }

    public final int hashCode() {
        return this.f7536b.hashCode() + (this.f7535a.hashCode() * 31);
    }

    public final String toString() {
        return this.f7535a + ":" + this.f7536b;
    }
}
