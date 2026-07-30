package androidx.compose.foundation;

import defpackage.b41;
import defpackage.bd3;
import defpackage.bp2;
import defpackage.d21;
import defpackage.j30;
import defpackage.o00;
import defpackage.vl1;
import defpackage.z11;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class d {
    public static final bp2 a = new bp2(o00.y);

    public static final vl1 a(vl1 vl1Var, b41 b41Var, z11 z11Var) {
        return z11Var == null ? vl1Var : z11Var instanceof d21 ? vl1Var.k(new IndicationModifierElement(b41Var, (d21) z11Var)) : bd3.n(vl1Var, new j30(2, z11Var, b41Var));
    }
}
