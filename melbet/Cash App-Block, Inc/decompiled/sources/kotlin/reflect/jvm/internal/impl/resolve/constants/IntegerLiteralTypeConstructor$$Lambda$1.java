package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes9.dex */
public final class IntegerLiteralTypeConstructor$$Lambda$1 implements Function1 {
    public static final IntegerLiteralTypeConstructor$$Lambda$1 INSTANCE = new IntegerLiteralTypeConstructor$$Lambda$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KotlinType kotlinType = (KotlinType) obj;
        IntegerLiteralTypeConstructor.Companion companion = IntegerLiteralTypeConstructor.Companion;
        kotlinType.getClass();
        return kotlinType.toString();
    }
}
