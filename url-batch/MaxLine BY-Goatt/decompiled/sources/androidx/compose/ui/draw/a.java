package androidx.compose.ui.draw;

import defpackage.ao;
import defpackage.mo;
import defpackage.q20;
import defpackage.qb2;
import defpackage.vl1;
import defpackage.xy1;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class a {
    public static final vl1 a(vl1 vl1Var, Function1 function1) {
        return vl1Var.k(new DrawBehindElement(function1));
    }

    public static final vl1 b(vl1 vl1Var, Function1 function1) {
        return vl1Var.k(new DrawWithCacheElement(function1));
    }

    public static final vl1 c(vl1 vl1Var, Function1 function1) {
        return vl1Var.k(new DrawWithContentElement(function1));
    }

    public static vl1 d(vl1 vl1Var, xy1 xy1Var, q20 q20Var, float f, mo moVar, int i) {
        ao aoVar = qb2.t;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return vl1Var.k(new PainterElement(xy1Var, aoVar, q20Var, f, moVar));
    }
}
