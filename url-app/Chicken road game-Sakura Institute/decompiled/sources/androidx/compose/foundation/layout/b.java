package androidx.compose.foundation.layout;

import m2.k;
import q.h0;
import s0.o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class b {
    public static final h0 a(float f9, float f10, float f11, float f12) {
        return new h0(f9, f10, f11, f12);
    }

    public static h0 b(float f9) {
        return new h0(0, 0, 0, f9);
    }

    public static final float c(h0 h0Var, k kVar) {
        return kVar == k.f6322f ? h0Var.b(kVar) : h0Var.c(kVar);
    }

    public static final o d(o oVar, h0 h0Var) {
        return oVar.j(new PaddingValuesElement(h0Var));
    }

    public static final o e(o oVar, float f9) {
        return oVar.j(new PaddingElement(f9, f9, f9, f9));
    }

    public static final o f(o oVar, float f9, float f10) {
        return oVar.j(new PaddingElement(f9, f10, f9, f10));
    }

    public static o g(o oVar, float f9, float f10, int i7) {
        if ((i7 & 1) != 0) {
            f9 = 0;
        }
        if ((i7 & 2) != 0) {
            f10 = 0;
        }
        return f(oVar, f9, f10);
    }

    public static o h(o oVar, float f9, float f10, float f11, float f12, int i7) {
        if ((i7 & 1) != 0) {
            f9 = 0;
        }
        if ((i7 & 2) != 0) {
            f10 = 0;
        }
        if ((i7 & 4) != 0) {
            f11 = 0;
        }
        if ((i7 & 8) != 0) {
            f12 = 0;
        }
        return oVar.j(new PaddingElement(f9, f10, f11, f12));
    }

    public static final o i(o oVar) {
        return oVar.j(new IntrinsicWidthElement());
    }
}
