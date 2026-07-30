package androidx.compose.foundation.layout;

import defpackage.ao;
import defpackage.u81;
import defpackage.vl1;
import defpackage.wx1;
import defpackage.yx1;
import defpackage.zx1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class a {
    public static final zx1 a(float f, float f2, float f3, float f4) {
        return new zx1(f, f2, f3, f4);
    }

    public static zx1 b(float f) {
        return new zx1(0.0f, 0.0f, 0.0f, f);
    }

    public static vl1 c(ao aoVar) {
        return new BoxChildDataElement(aoVar);
    }

    public static vl1 d(vl1 vl1Var) {
        return vl1Var.k(new AspectRatioElement());
    }

    public static final float e(yx1 yx1Var, u81 u81Var) {
        return u81Var == u81.m ? yx1Var.b(u81Var) : yx1Var.a(u81Var);
    }

    public static final float f(yx1 yx1Var, u81 u81Var) {
        return u81Var == u81.m ? yx1Var.a(u81Var) : yx1Var.b(u81Var);
    }

    public static final vl1 g(vl1 vl1Var, yx1 yx1Var) {
        return vl1Var.k(new PaddingValuesElement(yx1Var, new wx1(1, 3)));
    }

    public static final vl1 h(vl1 vl1Var, float f) {
        return vl1Var.k(new PaddingElement(f, f, f, f, new wx1(1, 2)));
    }

    public static final vl1 i(vl1 vl1Var, float f, float f2) {
        return vl1Var.k(new PaddingElement(f, f2, f, f2, new wx1(1, 1)));
    }

    public static vl1 j(vl1 vl1Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return i(vl1Var, f, f2);
    }

    public static vl1 k(vl1 vl1Var, float f, float f2, float f3, int i) {
        return vl1Var.k(new PaddingElement((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, 0.0f, new wx1(1, 0)));
    }

    public static final vl1 l(vl1 vl1Var) {
        return vl1Var.k(new IntrinsicWidthElement());
    }
}
