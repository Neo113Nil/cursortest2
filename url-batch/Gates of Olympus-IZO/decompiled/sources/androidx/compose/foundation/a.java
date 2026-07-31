package androidx.compose.foundation;

import U.g;
import U.i;
import U.l;
import b0.InterfaceC0263N;
import n.Q;
import n.W;
import q.j;
import z0.f;

/* loaded from: classes.dex */
public abstract class a {
    public static final l a(l lVar, long j3, InterfaceC0263N interfaceC0263N) {
        return lVar.e(new BackgroundElement(j3, interfaceC0263N));
    }

    public static l b(l lVar, j jVar, Q q2, boolean z3, f fVar, Y1.a aVar, int i3) {
        if ((i3 & 16) != 0) {
            fVar = null;
        }
        return lVar.e(q2 instanceof W ? new ClickableElement(jVar, (W) q2, z3, null, fVar, aVar) : q2 == null ? new ClickableElement(jVar, null, z3, null, fVar, aVar) : jVar != null ? c.a(i.f3302a, jVar, q2).e(new ClickableElement(jVar, null, z3, null, fVar, aVar)) : new g(new b(q2, z3, null, fVar, aVar)));
    }
}
