package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.reflect.jvm.internal.calls.CallerImpl;

/* loaded from: classes9.dex */
public final class CallerImpl$FieldSetter$BoundJvmStaticInObject extends CallerImpl.Method implements BoundCaller {
    @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.Method, kotlin.reflect.jvm.internal.calls.Caller
    public final Object call(Object[] objArr) {
        objArr.getClass();
        checkArguments(objArr);
        ((Field) this.member).set(null, ArraysKt___ArraysKt.last(objArr));
        return Unit.INSTANCE;
    }
}
