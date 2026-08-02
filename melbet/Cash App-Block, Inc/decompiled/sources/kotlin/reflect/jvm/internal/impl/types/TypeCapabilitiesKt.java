package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes9.dex */
public final class TypeCapabilitiesKt {
    public static final CustomTypeParameter getCustomTypeParameter(KotlinType kotlinType) {
        kotlinType.getClass();
        Object unwrap2 = kotlinType.unwrap();
        CustomTypeParameter customTypeParameter = unwrap2 instanceof CustomTypeParameter ? (CustomTypeParameter) unwrap2 : null;
        if (customTypeParameter == null || !customTypeParameter.isTypeParameter()) {
            return null;
        }
        return customTypeParameter;
    }

    public static final boolean isCustomTypeParameter(KotlinType kotlinType) {
        kotlinType.getClass();
        Object unwrap2 = kotlinType.unwrap();
        CustomTypeParameter customTypeParameter = unwrap2 instanceof CustomTypeParameter ? (CustomTypeParameter) unwrap2 : null;
        if (customTypeParameter != null) {
            return customTypeParameter.isTypeParameter();
        }
        return false;
    }
}
