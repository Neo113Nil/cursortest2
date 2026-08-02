package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes9.dex */
public final class ErrorTypeConstructor implements TypeConstructor {
    public final String debugText;
    public final String[] formatParams;
    public final ErrorTypeKind kind;

    public ErrorTypeConstructor(ErrorTypeKind errorTypeKind, String... strArr) {
        errorTypeKind.getClass();
        strArr.getClass();
        this.kind = errorTypeKind;
        this.formatParams = strArr;
        String debugText = ErrorEntity.ERROR_TYPE.getDebugText();
        String debugMessage = errorTypeKind.getDebugMessage();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        this.debugText = String.format(debugText, Arrays.copyOf(new Object[]{String.format(debugMessage, Arrays.copyOf(copyOf, copyOf.length))}, 1));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns getBuiltIns() {
        return DefaultBuiltIns.Companion.getInstance();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: getDeclarationDescriptor */
    public ClassifierDescriptor mo4153getDeclarationDescriptor() {
        return ErrorUtils.INSTANCE.getErrorClass();
    }

    public final ErrorTypeKind getKind() {
        return this.kind;
    }

    public final String getParam(int i) {
        return this.formatParams[i];
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<TypeParameterDescriptor> getParameters() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public Collection<KotlinType> getSupertypes() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public TypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return this;
    }

    public String toString() {
        return this.debugText;
    }
}
