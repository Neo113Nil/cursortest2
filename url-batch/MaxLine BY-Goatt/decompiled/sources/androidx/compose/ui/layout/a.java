package androidx.compose.ui.layout;

import defpackage.jj1;
import defpackage.vl1;
import defpackage.w81;
import defpackage.xt0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class a {
    public static final Object a(jj1 jj1Var) {
        Object i = jj1Var.i();
        w81 w81Var = i instanceof w81 ? (w81) i : null;
        if (w81Var != null) {
            return w81Var.A;
        }
        return null;
    }

    public static final vl1 b(xt0 xt0Var) {
        return new LayoutElement(xt0Var);
    }

    public static final vl1 c(vl1 vl1Var, String str) {
        return vl1Var.k(new LayoutIdElement(str));
    }

    public static final vl1 d(vl1 vl1Var, Function1 function1) {
        return vl1Var.k(new OnGloballyPositionedElement(function1));
    }

    public static final vl1 e(vl1 vl1Var, Function1 function1) {
        return vl1Var.k(new OnSizeChangedModifier(function1));
    }
}
