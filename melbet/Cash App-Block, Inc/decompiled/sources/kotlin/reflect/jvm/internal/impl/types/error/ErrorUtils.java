package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes9.dex */
public final class ErrorUtils {
    public static final ErrorClassDescriptor errorClass;
    public static final Set errorPropertyGroup;
    public static final ErrorType errorPropertyType;
    public static final ErrorType errorTypeForLoopInSupertypes;
    public static final ErrorUtils INSTANCE = new ErrorUtils();
    public static final ErrorModuleDescriptor errorModule = ErrorModuleDescriptor.INSTANCE;

    static {
        Name special = Name.special(String.format(ErrorEntity.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{"unknown class"}, 1)));
        special.getClass();
        errorClass = new ErrorClassDescriptor(special);
        errorTypeForLoopInSupertypes = createErrorType(ErrorTypeKind.CYCLIC_SUPERTYPES, new String[0]);
        errorPropertyType = createErrorType(ErrorTypeKind.ERROR_PROPERTY_TYPE, new String[0]);
        errorPropertyGroup = SetsKt__SetsJVMKt.setOf(new ErrorPropertyDescriptor());
    }

    public static final ErrorScope createErrorScope(ErrorScopeKind errorScopeKind, boolean z, String... strArr) {
        errorScopeKind.getClass();
        strArr.getClass();
        return z ? new ThrowingScope(errorScopeKind, (String[]) Arrays.copyOf(strArr, strArr.length)) : new ErrorScope(errorScopeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean isError(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            return false;
        }
        INSTANCE.getClass();
        return (declarationDescriptor instanceof ErrorClassDescriptor) || (declarationDescriptor.getContainingDeclaration() instanceof ErrorClassDescriptor) || declarationDescriptor == errorModule;
    }

    public static final boolean isUninferredTypeVariable(KotlinType kotlinType) {
        if (kotlinType == null) {
            return false;
        }
        TypeConstructor constructor = kotlinType.getConstructor();
        return (constructor instanceof ErrorTypeConstructor) && ((ErrorTypeConstructor) constructor).getKind() == ErrorTypeKind.UNINFERRED_TYPE_VARIABLE;
    }

    public final ErrorType createErrorType(ErrorTypeKind errorTypeKind, TypeConstructor typeConstructor, String... strArr) {
        errorTypeKind.getClass();
        typeConstructor.getClass();
        strArr.getClass();
        return createErrorTypeWithArguments(errorTypeKind, EmptyList.INSTANCE, typeConstructor, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final ErrorTypeConstructor createErrorTypeConstructor(ErrorTypeKind errorTypeKind, String... strArr) {
        errorTypeKind.getClass();
        strArr.getClass();
        return new ErrorTypeConstructor(errorTypeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final ErrorType createErrorTypeWithArguments(ErrorTypeKind errorTypeKind, List<? extends TypeProjection> list, TypeConstructor typeConstructor, String... strArr) {
        errorTypeKind.getClass();
        list.getClass();
        typeConstructor.getClass();
        strArr.getClass();
        return new ErrorType(typeConstructor, createErrorScope(ErrorScopeKind.ERROR_TYPE_SCOPE, typeConstructor.toString()), errorTypeKind, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final ErrorClassDescriptor getErrorClass() {
        return errorClass;
    }

    public final ModuleDescriptor getErrorModule() {
        return errorModule;
    }

    public final Set<PropertyDescriptor> getErrorPropertyGroup() {
        return errorPropertyGroup;
    }

    public final KotlinType getErrorPropertyType() {
        return errorPropertyType;
    }

    public final KotlinType getErrorTypeForLoopInSupertypes() {
        return errorTypeForLoopInSupertypes;
    }

    public final String unresolvedTypeAsItIs(KotlinType kotlinType) {
        kotlinType.getClass();
        TypeUtilsKt.isUnresolvedType(kotlinType);
        TypeConstructor constructor = kotlinType.getConstructor();
        constructor.getClass();
        return ((ErrorTypeConstructor) constructor).getParam(0);
    }

    public static final ErrorType createErrorType(ErrorTypeKind errorTypeKind, String... strArr) {
        errorTypeKind.getClass();
        strArr.getClass();
        return INSTANCE.createErrorTypeWithArguments(errorTypeKind, EmptyList.INSTANCE, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final ErrorScope createErrorScope(ErrorScopeKind errorScopeKind, String... strArr) {
        errorScopeKind.getClass();
        strArr.getClass();
        return createErrorScope(errorScopeKind, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final ErrorType createErrorTypeWithArguments(ErrorTypeKind errorTypeKind, List<? extends TypeProjection> list, String... strArr) {
        errorTypeKind.getClass();
        list.getClass();
        strArr.getClass();
        return createErrorTypeWithArguments(errorTypeKind, list, createErrorTypeConstructor(errorTypeKind, (String[]) Arrays.copyOf(strArr, strArr.length)), (String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
