package S;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public interface o {
    Object e(Object obj, Function2 function2);

    boolean g(Function1 function1);

    default o h(o oVar) {
        return oVar == l.f3977a ? this : new i(this, oVar);
    }
}
