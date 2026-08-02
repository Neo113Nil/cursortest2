package kotlin.reflect.jvm.internal;

import androidx.room.Room;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class KotlinKParameter$$Lambda$1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final Object arg$0;

    public /* synthetic */ KotlinKParameter$$Lambda$1(Object obj, int i) {
        this.$r8$classId = i;
        this.arg$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.arg$0;
        switch (i) {
            case 0:
                KotlinKParameter kotlinKParameter = (KotlinKParameter) obj;
                KotlinKCallable kotlinKCallable = kotlinKParameter.callable;
                if ((kotlinKCallable.getContainer() instanceof KPackageImpl) || Room.isConstructor(kotlinKCallable)) {
                    return (Type) kotlinKCallable.getCaller().getParameterTypes().get(kotlinKParameter.index);
                }
                Path$$ExternalSyntheticBUOutline0.m$3(kotlinKCallable, "Only constructors and top-level callables are supported for now: ");
                return null;
            default:
                Function0 function0 = ((NewCapturedTypeConstructor) obj).supertypesComputation;
                if (function0 != null) {
                    return (List) function0.invoke();
                }
                return null;
        }
    }
}
