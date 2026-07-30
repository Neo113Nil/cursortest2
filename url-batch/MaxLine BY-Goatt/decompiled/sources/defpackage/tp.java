package defpackage;

import android.graphics.Rect;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tp implements lp {
    public final /* synthetic */ o90 m;

    public tp(o90 o90Var) {
        this.m = o90Var;
    }

    @Override // defpackage.lp
    public final Object t0(ks1 ks1Var, Function0 function0, r30 r30Var) {
        View Q = s93.Q(this.m);
        long T = ks1Var.T(0L);
        w72 w72Var = (w72) function0.invoke();
        w72 g = w72Var != null ? w72Var.g(T) : null;
        if (g != null) {
            Q.requestRectangleOnScreen(new Rect((int) g.a, (int) g.b, (int) g.c, (int) g.d), false);
        }
        return Unit.a;
    }
}
