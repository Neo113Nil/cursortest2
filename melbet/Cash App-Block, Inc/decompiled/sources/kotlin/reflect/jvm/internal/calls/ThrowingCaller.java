package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public final class ThrowingCaller implements Caller {
    public static final ThrowingCaller INSTANCE = new ThrowingCaller();

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final Object call(Object[] objArr) {
        objArr.getClass();
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final /* bridge */ /* synthetic */ Member getMember() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final List getParameterTypes() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final Type getReturnType() {
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final /* bridge */ boolean isBoundInstanceCallWithValueClasses() {
        return false;
    }
}
