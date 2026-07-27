package S;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public interface m extends o {
    @Override // S.o
    default Object e(Object obj, Function2 function2) {
        return function2.h(obj, this);
    }

    @Override // S.o
    default boolean g(Function1 function1) {
        return ((Boolean) function1.invoke(this)).booleanValue();
    }
}
