package androidx.compose.ui.draw;

import U.d;
import U.l;
import Y1.c;
import b0.C0281n;
import g0.AbstractC0393b;
import r0.D;

/* loaded from: classes.dex */
public abstract class a {
    public static final l a(l lVar, c cVar) {
        return lVar.e(new DrawBehindElement(cVar));
    }

    public static l b(l lVar, AbstractC0393b abstractC0393b, d dVar, D d3, float f3, C0281n c0281n, int i3) {
        if ((i3 & 4) != 0) {
            dVar = U.a.f3284h;
        }
        d dVar2 = dVar;
        if ((i3 & 16) != 0) {
            f3 = 1.0f;
        }
        return lVar.e(new PainterElement(abstractC0393b, true, dVar2, d3, f3, c0281n));
    }
}
