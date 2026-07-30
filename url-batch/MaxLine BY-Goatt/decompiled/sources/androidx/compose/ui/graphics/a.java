package androidx.compose.ui.graphics;

import defpackage.ap;
import defpackage.fk2;
import defpackage.gw0;
import defpackage.vl1;
import defpackage.wy2;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class a {
    public static final vl1 a(vl1 vl1Var, Function1 function1) {
        return vl1Var.k(new BlockGraphicsLayerElement(function1));
    }

    public static vl1 b(vl1 vl1Var, float f, fk2 fk2Var, int i) {
        if ((i & 32) != 0) {
            f = 0.0f;
        }
        float f2 = f;
        long j = wy2.b;
        if ((i & 2048) != 0) {
            fk2Var = ap.e;
        }
        long j2 = gw0.a;
        return vl1Var.k(new GraphicsLayerElement(1.0f, f2, j, fk2Var, false, j2, j2));
    }

    public static vl1 c(vl1 vl1Var, float f, fk2 fk2Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        long j = wy2.b;
        if ((i & 2048) != 0) {
            fk2Var = ap.e;
        }
        long j2 = gw0.a;
        return vl1Var.k(new GraphicsLayerElement(f2, 0.0f, j, fk2Var, true, j2, j2));
    }
}
