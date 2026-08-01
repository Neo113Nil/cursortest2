package d1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface l {
    boolean a(Function1 function1);

    Object b(Object obj, Function2 function2);

    default l c(l lVar) {
        return lVar == i.f3304a ? this : new f(this, lVar);
    }
}
