package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface vl1 {
    boolean b(Function1 function1);

    Object d(Object obj, Function2 function2);

    default vl1 k(vl1 vl1Var) {
        return vl1Var == sl1.a ? this : new xw(this, vl1Var);
    }
}
