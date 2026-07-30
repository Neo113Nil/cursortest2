package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class b30 {
    public final fn2 a = new fn2();

    public static void b(b30 b30Var, l30 l30Var, boolean z, Function0 function0) {
        b30Var.a.add(new my(262103052, new ku(l30Var, z, function0), true));
    }

    public final void a(y20 y20Var, a00 a00Var, int i) {
        a00Var.Z(1320309496);
        int i2 = (a00Var.f(y20Var) ? 4 : 2) | i | (a00Var.f(this) ? 32 : 16);
        if ((i2 & 19) == 18 && a00Var.B()) {
            a00Var.S();
        } else {
            fn2 fn2Var = this.a;
            int size = fn2Var.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((xt0) fn2Var.get(i3)).a(y20Var, a00Var, Integer.valueOf(i2 & 14));
            }
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new n8(i, 5, this, y20Var);
        }
    }
}
