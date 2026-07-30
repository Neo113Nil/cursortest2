package androidx.compose.ui.focus;

import q6.c;
import s0.o;
import x0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a {
    public static final o a(n nVar) {
        return new FocusRequesterElement(nVar);
    }

    public static final o b(o oVar, c cVar) {
        return oVar.j(new FocusChangedElement(cVar));
    }
}
