package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;

/* loaded from: classes9.dex */
public final class KotlinTypeKt {
    public static final boolean isError(KotlinType kotlinType) {
        kotlinType.getClass();
        UnwrappedType unwrap2 = kotlinType.unwrap();
        if (unwrap2 instanceof ErrorType) {
            return true;
        }
        return (unwrap2 instanceof FlexibleType) && (((FlexibleType) unwrap2).getDelegate() instanceof ErrorType);
    }

    public static final boolean isNullable(KotlinType kotlinType) {
        kotlinType.getClass();
        return TypeUtils.isNullableType(kotlinType);
    }
}
