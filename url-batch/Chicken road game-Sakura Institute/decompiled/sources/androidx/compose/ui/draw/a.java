package androidx.compose.ui.draw;

import e1.b;
import p1.i0;
import q6.c;
import s0.g;
import s0.o;
import z0.m;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a {
    public static final o a(o oVar, c cVar) {
        return oVar.j(new DrawBehindElement(cVar));
    }

    public static final o b(o oVar, c cVar) {
        return oVar.j(new DrawWithCacheElement(cVar));
    }

    public static final o c(o oVar, c cVar) {
        return oVar.j(new DrawWithContentElement(cVar));
    }

    public static o d(o oVar, b bVar, i0 i0Var, float f9, m mVar, int i7) {
        g gVar = s0.b.f8082j;
        if ((i7 & 16) != 0) {
            f9 = 1.0f;
        }
        return oVar.j(new PainterElement(bVar, gVar, i0Var, f9, mVar));
    }
}
