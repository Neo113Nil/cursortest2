package androidx.compose.foundation.selection;

import U.g;
import U.i;
import U.l;
import androidx.compose.foundation.c;
import n.Q;
import n.W;
import q.j;
import z0.f;

/* loaded from: classes.dex */
public abstract class b {
    public static final l a(l lVar, boolean z3, j jVar, Q q2, boolean z4, f fVar, Y1.a aVar) {
        return lVar.e(q2 instanceof W ? new SelectableElement(z3, jVar, (W) q2, z4, fVar, aVar) : q2 == null ? new SelectableElement(z3, jVar, null, z4, fVar, aVar) : jVar != null ? c.a(i.f3302a, jVar, q2).e(new SelectableElement(z3, jVar, null, z4, fVar, aVar)) : new g(new a(q2, z3, z4, fVar, aVar)));
    }
}
