package androidx.compose.foundation;

import android.view.KeyEvent;
import d0.d;
import d2.g;
import f1.b0;
import f1.i0;
import f1.p;
import j0.x1;
import t.g0;
import t.w;
import u.i;
import u.j0;
import u.y0;
import v.j;
import y0.h;
import y0.m;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a {
    public static m a(m mVar, b0 b0Var, d dVar, int i) {
        i0 i0Var = dVar;
        if ((i & 2) != 0) {
            i0Var = p.f2693a;
        }
        return mVar.d(new BackgroundElement(0L, b0Var, i0Var, 1));
    }

    public static final m b(m mVar, long j7, i0 i0Var) {
        return mVar.d(new BackgroundElement(j7, null, i0Var, 2));
    }

    public static m c(m mVar, j jVar, x1 x1Var, boolean z3, g gVar, p6.a aVar, int i) {
        if ((i & 16) != 0) {
            gVar = null;
        }
        g gVar2 = gVar;
        return mVar.d(x1Var != null ? new ClickableElement(jVar, x1Var, false, z3, gVar2, aVar) : x1Var == null ? new ClickableElement(jVar, null, false, z3, gVar2, aVar) : jVar != null ? c.a(y0.j.f8705a, jVar, x1Var).d(new ClickableElement(jVar, null, false, z3, gVar2, aVar)) : new h(new b(x1Var, z3, gVar2, aVar)));
    }

    public static m d(m mVar, p6.a aVar) {
        return mVar.d(new ClickableElement(null, null, true, true, null, aVar));
    }

    public static final boolean e(KeyEvent keyEvent) {
        long c8 = h0.a.c(keyEvent.getKeyCode());
        return o1.a.a(c8, o1.a.f5589h) || o1.a.a(c8, o1.a.f5591k) || o1.a.a(c8, o1.a.f5595o) || o1.a.a(c8, o1.a.f5590j);
    }

    public static m f(m mVar, y0 y0Var, j0 j0Var, boolean z3, i iVar, j jVar, boolean z7, t.j jVar2) {
        float f6 = w.f6884a;
        j0 j0Var2 = j0.f7027d;
        y0.j jVar3 = y0.j.f8705a;
        return mVar.d(j0Var == j0Var2 ? a.a.f(jVar3, g0.f6778c) : a.a.f(jVar3, g0.f6777b)).d(new ScrollingContainerElement(jVar2, iVar, j0Var, y0Var, jVar, z3, z7));
    }
}
