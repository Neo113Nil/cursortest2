package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes9.dex */
public final class ErrorType extends SimpleType {
    public final List arguments;
    public final TypeConstructor constructor;
    public final String debugMessage;
    public final String[] formatParams;
    public final boolean isMarkedNullable;
    public final ErrorTypeKind kind;
    public final MemberScope memberScope;

    public ErrorType(TypeConstructor typeConstructor, MemberScope memberScope, ErrorTypeKind errorTypeKind, List<? extends TypeProjection> list, boolean z, String... strArr) {
        typeConstructor.getClass();
        memberScope.getClass();
        errorTypeKind.getClass();
        list.getClass();
        strArr.getClass();
        this.constructor = typeConstructor;
        this.memberScope = memberScope;
        this.kind = errorTypeKind;
        this.arguments = list;
        this.isMarkedNullable = z;
        this.formatParams = strArr;
        String debugMessage = errorTypeKind.getDebugMessage();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        this.debugMessage = String.format(debugMessage, Arrays.copyOf(copyOf, copyOf.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> getArguments() {
        return this.arguments;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes getAttributes() {
        return TypeAttributes.Companion.getEmpty();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeConstructor getConstructor() {
        return this.constructor;
    }

    public final String getDebugMessage() {
        return this.debugMessage;
    }

    public final ErrorTypeKind getKind() {
        return this.kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope getMemberScope() {
        return this.memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType makeNullableAsSpecified(boolean z) {
        TypeConstructor constructor = getConstructor();
        MemberScope memberScope = getMemberScope();
        List<TypeProjection> arguments = getArguments();
        String[] strArr = this.formatParams;
        return new ErrorType(constructor, memberScope, this.kind, arguments, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final ErrorType replaceArguments(List<? extends TypeProjection> list) {
        list.getClass();
        TypeConstructor constructor = getConstructor();
        MemberScope memberScope = getMemberScope();
        boolean isMarkedNullable = isMarkedNullable();
        String[] strArr = this.formatParams;
        return new ErrorType(constructor, memberScope, this.kind, list, isMarkedNullable, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public ErrorType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType replaceAttributes(TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return this;
    }

    public ErrorType(TypeConstructor typeConstructor, MemberScope memberScope, ErrorTypeKind errorTypeKind, List list, boolean z, String[] strArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeConstructor, memberScope, errorTypeKind, (i & 8) != 0 ? EmptyList.INSTANCE : list, (i & 16) != 0 ? false : z, strArr);
    }
}
