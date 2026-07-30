package androidx.compose.foundation.selection;

import m.g0;
import m.l0;
import p.j;
import s0.l;
import s0.o;
import y1.f;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a {
    public static final o a(o oVar, boolean z8, j jVar, boolean z9, f fVar, q6.a aVar) {
        return oVar.j(new SelectableElement(z8, jVar, z9, fVar, aVar));
    }

    public static final o b(g0 g0Var, q6.a aVar, f fVar, z1.a aVar2, boolean z8) {
        if (g0Var instanceof l0) {
            return new TriStateToggleableElement(aVar2, null, (l0) g0Var, z8, fVar, aVar);
        }
        if (g0Var == null) {
            return new TriStateToggleableElement(aVar2, null, null, z8, fVar, aVar);
        }
        return s0.a.a(l.f8103a, new b(g0Var, aVar, fVar, aVar2, z8));
    }
}
