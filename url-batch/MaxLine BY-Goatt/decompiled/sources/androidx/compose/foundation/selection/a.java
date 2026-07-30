package androidx.compose.foundation.selection;

import defpackage.bn1;
import defpackage.fb2;
import defpackage.vl1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class a {
    public static final vl1 a(vl1 vl1Var, boolean z, bn1 bn1Var, boolean z2, fb2 fb2Var, Function0 function0) {
        return vl1Var.k(new SelectableElement(z, bn1Var, z2, fb2Var, function0));
    }

    public static final vl1 b(vl1 vl1Var, boolean z, bn1 bn1Var, boolean z2, fb2 fb2Var, Function1 function1) {
        return vl1Var.k(new ToggleableElement(z, bn1Var, z2, fb2Var, function1));
    }
}
