package androidx.compose.foundation.layout;

import defpackage.ao;
import defpackage.c0;
import defpackage.qb2;
import defpackage.vl1;
import defpackage.zn;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class b {
    public static final FillElement a = new FillElement(2, 1.0f);
    public static final FillElement b = new FillElement(3, 1.0f);
    public static final WrapContentElement c;
    public static final WrapContentElement d;
    public static final WrapContentElement e;
    public static final WrapContentElement f;

    static {
        zn znVar = qb2.z;
        int i = 17;
        c = new WrapContentElement(1, new c0(i, znVar), znVar);
        zn znVar2 = qb2.y;
        d = new WrapContentElement(1, new c0(i, znVar2), znVar2);
        ao aoVar = qb2.t;
        int i2 = 18;
        e = new WrapContentElement(3, new c0(i2, aoVar), aoVar);
        ao aoVar2 = qb2.p;
        f = new WrapContentElement(3, new c0(i2, aoVar2), aoVar2);
    }

    public static final vl1 a(vl1 vl1Var, float f2, float f3) {
        return vl1Var.k(new UnspecifiedConstraintsElement(f2, f3));
    }

    public static final vl1 b(vl1 vl1Var, float f2) {
        return vl1Var.k(f2 == 1.0f ? b : new FillElement(3, f2));
    }

    public static final vl1 c(vl1 vl1Var, float f2) {
        return vl1Var.k(f2 == 1.0f ? a : new FillElement(2, f2));
    }

    public static final vl1 d(vl1 vl1Var, float f2) {
        return vl1Var.k(new SizeElement(0.0f, f2, 0.0f, f2, 5));
    }

    public static final vl1 e(vl1 vl1Var, float f2, float f3) {
        return vl1Var.k(new SizeElement(0.0f, f2, 0.0f, f3, 5));
    }

    public static final vl1 f(vl1 vl1Var) {
        return vl1Var.k(new SizeElement(52.0f, 32.0f, 52.0f, 32.0f, false));
    }

    public static vl1 g(vl1 vl1Var, float f2, float f3, float f4, float f5, int i) {
        return vl1Var.k(new SizeElement(f2, (i & 2) != 0 ? Float.NaN : f3, (i & 4) != 0 ? Float.NaN : f4, (i & 8) != 0 ? Float.NaN : f5, false));
    }

    public static final vl1 h(vl1 vl1Var, float f2) {
        return vl1Var.k(new SizeElement(f2, f2, f2, f2, true));
    }

    public static final vl1 i(vl1 vl1Var, float f2) {
        return vl1Var.k(new SizeElement(f2, 25.0f, f2, 25.0f, true));
    }

    public static final vl1 j(vl1 vl1Var, float f2, float f3, float f4, float f5) {
        return vl1Var.k(new SizeElement(f2, f3, f4, f5, true));
    }

    public static final vl1 k(float f2) {
        return new SizeElement(f2, 0.0f, f2, 0.0f, 10);
    }

    public static vl1 l(vl1 vl1Var) {
        zn znVar = qb2.z;
        return vl1Var.k(Intrinsics.b(znVar, znVar) ? c : Intrinsics.b(znVar, qb2.y) ? d : new WrapContentElement(1, new c0(17, znVar), znVar));
    }

    public static vl1 m(vl1 vl1Var) {
        ao aoVar = qb2.t;
        return vl1Var.k(aoVar.equals(aoVar) ? e : aoVar.equals(qb2.p) ? f : new WrapContentElement(3, new c0(18, aoVar), aoVar));
    }
}
