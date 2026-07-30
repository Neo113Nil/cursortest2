package m5;

import l3.g;
import l5.f;
import o5.j;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6424d;

    /* renamed from: e, reason: collision with root package name */
    public final o5.e f6425e;

    public a(f fVar, o5.e eVar, boolean z8) {
        super(3, d.f6427d, fVar);
        this.f6425e = eVar;
        this.f6424d = z8;
    }

    @Override // l3.g
    public final g a(t5.c cVar) {
        f fVar = (f) this.f5902c;
        boolean isEmpty = fVar.isEmpty();
        boolean z8 = this.f6424d;
        o5.e eVar = this.f6425e;
        if (!isEmpty) {
            j.b("operationForChild called for unrelated child.", fVar.z().equals(cVar));
            return new a(fVar.C(), eVar, z8);
        }
        if (eVar.f6846f != null) {
            j.b("affectedTree should not have overlapping affected paths.", eVar.f6847g.isEmpty());
            return this;
        }
        return new a(f.f6023i, eVar.A(new f(cVar)), z8);
    }

    public final String toString() {
        return "AckUserWrite { path=" + ((f) this.f5902c) + ", revert=" + this.f6424d + ", affectedTree=" + this.f6425e + " }";
    }
}
