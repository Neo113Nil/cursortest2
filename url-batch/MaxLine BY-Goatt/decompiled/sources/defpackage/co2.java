package defpackage;

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class co2 {
    public static final float a = ViewConfiguration.getScrollFriction();

    public static final q70 a(a00 a00Var) {
        ca0 ca0Var = (ca0) a00Var.j(p00.h);
        boolean c = a00Var.c(ca0Var.d());
        Object M = a00Var.M();
        if (c || M == sz.a) {
            M = new q70(new at0(ca0Var));
            a00Var.i0(M);
        }
        return (q70) M;
    }
}
