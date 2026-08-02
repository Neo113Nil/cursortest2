package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.reflect.jvm.internal.calls.CallerImpl;

/* loaded from: classes9.dex */
public final class CallerImpl$FieldSetter$BoundInstance extends CallerImpl.Method implements BoundCaller {
    public final Object boundReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallerImpl$FieldSetter$BoundInstance(Field field, boolean z, Object obj) {
        super(field, z, false);
        field.getClass();
        this.boundReceiver = obj;
    }

    @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.Method, kotlin.reflect.jvm.internal.calls.Caller
    public final Object call(Object[] objArr) {
        objArr.getClass();
        checkArguments(objArr);
        ((Field) this.member).set(this.boundReceiver, ArraysKt___ArraysKt.first(objArr));
        return Unit.INSTANCE;
    }
}
