package androidx.compose.foundation;

import m.g0;
import m.l0;
import p.j;
import s0.l;
import s0.o;
import y1.f;
import z0.p0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a {
    public static final o a(o oVar, long j8, p0 p0Var) {
        return oVar.j(new BackgroundElement(j8, p0Var));
    }

    public static final o b(o oVar, j jVar, g0 g0Var, boolean z8, String str, f fVar, q6.a aVar) {
        o j8;
        if (g0Var instanceof l0) {
            j8 = new ClickableElement(jVar, (l0) g0Var, z8, str, fVar, aVar);
        } else if (g0Var == null) {
            j8 = new ClickableElement(jVar, null, z8, str, fVar, aVar);
        } else {
            l lVar = l.f8103a;
            j8 = jVar != null ? d.a(lVar, jVar, g0Var).j(new ClickableElement(jVar, null, z8, str, fVar, aVar)) : s0.a.a(lVar, new b(g0Var, z8, str, fVar, aVar));
        }
        return oVar.j(j8);
    }

    public static /* synthetic */ o c(o oVar, j jVar, g0 g0Var, boolean z8, f fVar, q6.a aVar, int i7) {
        if ((i7 & 16) != 0) {
            fVar = null;
        }
        return b(oVar, jVar, g0Var, z8, null, fVar, aVar);
    }

    public static o d(o oVar, boolean z8, String str, q6.a aVar, int i7) {
        if ((i7 & 1) != 0) {
            z8 = true;
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        return s0.a.a(oVar, new m.o(z8, str, aVar));
    }
}
