package androidx.compose.ui.focus;

import defpackage.to0;
import defpackage.vl1;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class a {
    public static final vl1 a(to0 to0Var) {
        return new FocusRequesterElement(to0Var);
    }

    public static final vl1 b(vl1 vl1Var, Function1 function1) {
        return vl1Var.k(new FocusChangedElement(function1));
    }
}
