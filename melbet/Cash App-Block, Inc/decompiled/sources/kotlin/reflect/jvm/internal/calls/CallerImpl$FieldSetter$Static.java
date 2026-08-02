package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Field;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.reflect.jvm.internal.calls.CallerImpl;

/* loaded from: classes9.dex */
public final class CallerImpl$FieldSetter$Static extends CallerImpl.Method {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallerImpl$FieldSetter$Static(Field field, boolean z) {
        super(field, z, true);
        this.$r8$classId = 1;
        field.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.Method, kotlin.reflect.jvm.internal.calls.CallerImpl
    public void checkArguments(Object[] objArr) {
        switch (this.$r8$classId) {
            case 2:
                objArr.getClass();
                super.checkArguments(objArr);
                checkObjectInstance(ArraysKt___ArraysKt.firstOrNull(objArr));
                break;
            default:
                super.checkArguments(objArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CallerImpl$FieldSetter$Static(Field field, boolean z, boolean z2, int i) {
        super(field, z, z2);
        this.$r8$classId = i;
    }
}
