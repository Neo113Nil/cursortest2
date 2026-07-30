package m5;

import l3.g;
import l5.f;
import t5.s;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends g {

    /* renamed from: d, reason: collision with root package name */
    public final l5.b f6426d;

    public c(d dVar, f fVar, l5.b bVar) {
        super(2, dVar, fVar);
        this.f6426d = bVar;
    }

    @Override // l3.g
    public final g a(t5.c cVar) {
        d dVar = (d) this.f5901b;
        f fVar = (f) this.f5902c;
        boolean isEmpty = fVar.isEmpty();
        l5.b bVar = this.f6426d;
        if (!isEmpty) {
            if (fVar.z().equals(cVar)) {
                return new c(dVar, fVar.C(), bVar);
            }
            return null;
        }
        l5.b x8 = bVar.x(new f(cVar));
        o5.e eVar = x8.f6007f;
        if (eVar.isEmpty()) {
            return null;
        }
        Object obj = eVar.f6846f;
        return ((s) obj) != null ? new e(dVar, f.f6023i, (s) obj) : new c(dVar, f.f6023i, x8);
    }

    public final String toString() {
        return "Merge { path=" + ((f) this.f5902c) + ", source=" + ((d) this.f5901b) + ", children=" + this.f6426d + " }";
    }
}
