package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public interface am0 {
    boolean a(Function1 function1);

    Object b(Object obj, Function2 function2);

    default am0 c(am0 am0Var) {
        return am0Var == xl0.a ? this : new aj(this, am0Var);
    }
}
