package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class ya1 {
    public static y91 a(kc1 kc1Var, Function0 function0) {
        int ordinal = kc1Var.ordinal();
        if (ordinal == 0) {
            return new ds2(function0, null, 2, null);
        }
        if (ordinal == 1) {
            gd2 gd2Var = new gd2();
            gd2Var.m = function0;
            gd2Var.n = r13.a;
            return gd2Var;
        }
        if (ordinal != 2) {
            a.b();
            return null;
        }
        p23 p23Var = new p23();
        p23Var.m = function0;
        p23Var.n = r13.a;
        return p23Var;
    }

    public static y91 b(Function0 function0) {
        function0.getClass();
        return new ds2(function0, null, 2, null);
    }
}
