package d1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface j extends l {
    @Override // d1.l
    default boolean a(Function1 function1) {
        return ((Boolean) function1.invoke(this)).booleanValue();
    }

    @Override // d1.l
    default Object b(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }
}
