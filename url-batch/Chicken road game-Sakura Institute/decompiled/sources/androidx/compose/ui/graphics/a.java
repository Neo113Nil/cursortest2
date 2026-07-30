package androidx.compose.ui.graphics;

import q6.c;
import s0.o;
import z0.d0;
import z0.l0;
import z0.p0;
import z0.s0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a {
    public static final o a(o oVar, c cVar) {
        return oVar.j(new BlockGraphicsLayerElement(cVar));
    }

    public static o b(o oVar, float f9, float f10, p0 p0Var, boolean z8, int i7) {
        if ((i7 & 4) != 0) {
            f9 = 1.0f;
        }
        float f11 = f9;
        if ((i7 & 32) != 0) {
            f10 = 0.0f;
        }
        float f12 = f10;
        long j8 = s0.f10047b;
        p0 p0Var2 = (i7 & 2048) != 0 ? l0.f10006a : p0Var;
        boolean z9 = (i7 & 4096) != 0 ? false : z8;
        long j9 = d0.f9987a;
        return oVar.j(new GraphicsLayerElement(f11, f12, j8, p0Var2, z9, j9, j9));
    }
}
