package h1;

import a2.g;
import d1.l;
import k1.j;
import k1.v;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class d {
    public static final l a(l lVar) {
        return v.k(lVar, null, 520191);
    }

    public static final l b(l lVar, Function1 function1) {
        return lVar.c(new b(function1));
    }

    public static l c(l lVar, p1.b bVar, g gVar, float f3, j jVar, int i3) {
        d1.d dVar = d1.a.f3286s;
        if ((i3 & 16) != 0) {
            f3 = 1.0f;
        }
        float f10 = f3;
        if ((i3 & 32) != 0) {
            jVar = null;
        }
        return lVar.c(new e(bVar, dVar, gVar, f10, jVar));
    }
}
