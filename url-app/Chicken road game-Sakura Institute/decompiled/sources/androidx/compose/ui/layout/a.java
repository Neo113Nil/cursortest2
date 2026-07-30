package androidx.compose.ui.layout;

import p1.e0;
import p1.q;
import q6.c;
import q6.f;
import s0.o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a {
    public static final Object a(e0 e0Var) {
        Object g9 = e0Var.g();
        q qVar = g9 instanceof q ? (q) g9 : null;
        if (qVar != null) {
            return qVar.f7075s;
        }
        return null;
    }

    public static final o b(f fVar) {
        return new LayoutElement(fVar);
    }

    public static final o c(o oVar, String str) {
        return oVar.j(new LayoutIdElement(str));
    }

    public static final o d(o oVar, c cVar) {
        return oVar.j(new OnGloballyPositionedElement(cVar));
    }

    public static final o e(o oVar, c cVar) {
        return oVar.j(new OnSizeChangedModifier(cVar));
    }
}
