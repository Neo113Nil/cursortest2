package m5;

import l3.g;
import l5.f;
import o5.j;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends g {
    public b(d dVar, f fVar) {
        super(4, dVar, fVar);
        j.b("Can't have a listen complete from a user source", !(dVar.f6429a == 1));
    }

    @Override // l3.g
    public final g a(t5.c cVar) {
        d dVar = (d) this.f5901b;
        f fVar = (f) this.f5902c;
        return fVar.isEmpty() ? new b(dVar, f.f6023i) : new b(dVar, fVar.C());
    }

    public final String toString() {
        return "ListenComplete { path=" + ((f) this.f5902c) + ", source=" + ((d) this.f5901b) + " }";
    }
}
