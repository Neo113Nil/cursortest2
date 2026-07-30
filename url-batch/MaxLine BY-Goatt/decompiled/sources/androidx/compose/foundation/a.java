package androidx.compose.foundation;

import defpackage.ap;
import defpackage.bd3;
import defpackage.bn1;
import defpackage.d21;
import defpackage.fb2;
import defpackage.fk2;
import defpackage.ku;
import defpackage.sl1;
import defpackage.vl1;
import defpackage.xd1;
import defpackage.z11;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class a {
    public static vl1 a(vl1 vl1Var, xd1 xd1Var) {
        return vl1Var.k(new BackgroundElement(0L, xd1Var, ap.e, 1));
    }

    public static final vl1 b(vl1 vl1Var, long j, fk2 fk2Var) {
        return vl1Var.k(new BackgroundElement(j, null, fk2Var, 2));
    }

    public static final vl1 c(vl1 vl1Var, bn1 bn1Var, z11 z11Var, boolean z, String str, fb2 fb2Var, Function0 function0) {
        vl1 k;
        if (z11Var instanceof d21) {
            k = new ClickableElement(bn1Var, (d21) z11Var, z, str, fb2Var, function0);
        } else if (z11Var == null) {
            k = new ClickableElement(bn1Var, null, z, str, fb2Var, function0);
        } else {
            sl1 sl1Var = sl1.a;
            k = bn1Var != null ? d.a(sl1Var, bn1Var, z11Var).k(new ClickableElement(bn1Var, null, z, str, fb2Var, function0)) : bd3.n(sl1Var, new b(z11Var, z, str, fb2Var, function0));
        }
        return vl1Var.k(k);
    }

    public static /* synthetic */ vl1 d(vl1 vl1Var, bn1 bn1Var, z11 z11Var, boolean z, fb2 fb2Var, Function0 function0, int i) {
        if ((i & 16) != 0) {
            fb2Var = null;
        }
        return c(vl1Var, bn1Var, z11Var, z, null, fb2Var, function0);
    }

    public static vl1 e(int i, vl1 vl1Var, String str, Function0 function0, boolean z) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return bd3.n(vl1Var, new ku(z, str, function0));
    }
}
