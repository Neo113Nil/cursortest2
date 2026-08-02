package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;

/* loaded from: classes9.dex */
public final class ConstUtilKt {
    public static final boolean canBeUsedForConstVal(KotlinType kotlinType) {
        kotlinType.getClass();
        return ((KotlinBuiltIns.isPrimitiveType(kotlinType) || UnsignedTypes.isUnsignedType(kotlinType)) && !TypeUtils.isNullableType(kotlinType)) || KotlinBuiltIns.isString(kotlinType);
    }
}
