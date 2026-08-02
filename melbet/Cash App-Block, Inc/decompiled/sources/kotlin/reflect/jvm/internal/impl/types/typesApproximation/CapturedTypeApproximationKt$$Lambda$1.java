package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* loaded from: classes9.dex */
public final class CapturedTypeApproximationKt$$Lambda$1 implements Function1 {
    public static final CapturedTypeApproximationKt$$Lambda$1 INSTANCE = new CapturedTypeApproximationKt$$Lambda$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UnwrappedType unwrappedType = (UnwrappedType) obj;
        unwrappedType.getClass();
        return Boolean.valueOf(CapturedTypeConstructorKt.isCaptured(unwrappedType));
    }
}
