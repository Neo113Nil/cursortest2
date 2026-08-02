package kotlin.reflect.jvm.internal.impl.types;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final class TypeWithEnhancementKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final KotlinType getEnhancement(KotlinType kotlinType) {
        kotlinType.getClass();
        if (kotlinType instanceof TypeWithEnhancement) {
            return ((TypeWithEnhancement) kotlinType).getEnhancement();
        }
        return null;
    }

    public static final UnwrappedType inheritEnhancement(UnwrappedType unwrappedType, KotlinType kotlinType, Function1<? super KotlinType, ? extends KotlinType> function1) {
        unwrappedType.getClass();
        kotlinType.getClass();
        function1.getClass();
        KotlinType enhancement = getEnhancement(kotlinType);
        return wrapEnhancement(unwrappedType, enhancement != null ? (KotlinType) function1.invoke(enhancement) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final UnwrappedType wrapEnhancement(UnwrappedType unwrappedType, KotlinType kotlinType) {
        unwrappedType.getClass();
        if (unwrappedType instanceof TypeWithEnhancement) {
            return wrapEnhancement(((TypeWithEnhancement) unwrappedType).getOrigin(), kotlinType);
        }
        if (kotlinType == null || kotlinType.equals(unwrappedType)) {
            return unwrappedType;
        }
        if (unwrappedType instanceof SimpleType) {
            return new SimpleTypeWithEnhancement((SimpleType) unwrappedType, kotlinType);
        }
        if (unwrappedType instanceof FlexibleType) {
            return new FlexibleTypeWithEnhancement((FlexibleType) unwrappedType, kotlinType);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final UnwrappedType inheritEnhancement(UnwrappedType unwrappedType, KotlinType kotlinType) {
        unwrappedType.getClass();
        kotlinType.getClass();
        return wrapEnhancement(unwrappedType, getEnhancement(kotlinType));
    }
}
