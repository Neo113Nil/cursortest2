package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes9.dex */
public interface Caller {
    Object call(Object[] objArr);

    Member getMember();

    List getParameterTypes();

    Type getReturnType();

    boolean isBoundInstanceCallWithValueClasses();
}
