package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class p33 {
    public static final long a = v10.h(0, 0, 0, 0);
    public static final h72 b;

    static {
        pl2 pl2Var = pl2.c;
        b = new h72();
    }

    public static final r01 a(Object obj, a00 a00Var) {
        a00Var.Y(1087186730);
        if (obj instanceof r01) {
            r01 r01Var = (r01) obj;
            a00Var.q(false);
            return r01Var;
        }
        Context context = (Context) a00Var.j(AndroidCompositionLocals_androidKt.b);
        a00Var.Y(-1245195153);
        boolean f = a00Var.f(context) | a00Var.f(obj);
        Object M = a00Var.M();
        if (f || M == sz.a) {
            q01 q01Var = new q01(context);
            q01Var.c = obj;
            M = q01Var.a();
            a00Var.i0(M);
        }
        r01 r01Var2 = (r01) M;
        a00Var.q(false);
        a00Var.q(false);
        return r01Var2;
    }
}
