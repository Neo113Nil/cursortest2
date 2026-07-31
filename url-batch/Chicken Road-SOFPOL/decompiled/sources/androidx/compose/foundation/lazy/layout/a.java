package androidx.compose.foundation.lazy.layout;

import a0.l;
import f7.i;
import u.j0;
import y0.m;
import z.d;
import z.e;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a {
    public static final m a(e eVar, l lVar, j0 j0Var) {
        return new LazyLayoutBeyondBoundsModifierElement(eVar, lVar, j0Var);
    }

    public static final m b(m mVar, i iVar, d dVar, j0 j0Var, boolean z3) {
        return mVar.d(new LazyLayoutSemanticsModifier(iVar, dVar, j0Var, z3));
    }
}
