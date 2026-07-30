package m5;

import l3.g;
import l5.f;
import t5.s;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: d, reason: collision with root package name */
    public final s f6432d;

    public e(d dVar, f fVar, s sVar) {
        super(1, dVar, fVar);
        this.f6432d = sVar;
    }

    @Override // l3.g
    public final g a(t5.c cVar) {
        d dVar = (d) this.f5901b;
        f fVar = (f) this.f5902c;
        boolean isEmpty = fVar.isEmpty();
        s sVar = this.f6432d;
        return isEmpty ? new e(dVar, f.f6023i, sVar.d(cVar)) : new e(dVar, fVar.C(), sVar);
    }

    public final String toString() {
        return String.format("Overwrite { path=%s, source=%s, snapshot=%s }", (f) this.f5902c, (d) this.f5901b, this.f6432d);
    }
}
