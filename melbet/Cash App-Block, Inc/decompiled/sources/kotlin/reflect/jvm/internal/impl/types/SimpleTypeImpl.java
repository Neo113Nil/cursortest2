package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScope;
import kotlin.reflect.jvm.internal.impl.types.error.ThrowingScope;

/* loaded from: classes9.dex */
public final class SimpleTypeImpl extends SimpleType {
    public final List arguments;
    public final TypeConstructor constructor;
    public final boolean isMarkedNullable;
    public final MemberScope memberScope;
    public final Function1 refinedTypeFactory;

    public SimpleTypeImpl(TypeConstructor typeConstructor, List list, boolean z, MemberScope memberScope, Function1 function1) {
        typeConstructor.getClass();
        list.getClass();
        memberScope.getClass();
        function1.getClass();
        this.constructor = typeConstructor;
        this.arguments = list;
        this.isMarkedNullable = z;
        this.memberScope = memberScope;
        this.refinedTypeFactory = function1;
        if (!(memberScope instanceof ErrorScope) || (memberScope instanceof ThrowingScope)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + memberScope + '\n' + typeConstructor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final List getArguments() {
        return this.arguments;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeAttributes getAttributes() {
        return TypeAttributes.Companion.getEmpty();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeConstructor getConstructor() {
        return this.constructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final MemberScope getMemberScope() {
        return this.memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final SimpleType makeNullableAsSpecified(boolean z) {
        return z == this.isMarkedNullable ? this : z ? new NotNullSimpleType(this, 1) : new NotNullSimpleType(this, 0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final KotlinType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        SimpleType simpleType = (SimpleType) this.refinedTypeFactory.invoke(kotlinTypeRefiner);
        return simpleType == null ? this : simpleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final SimpleType replaceAttributes(TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return typeAttributes.isEmpty() ? this : new SimpleTypeWithAttributes(this, typeAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final UnwrappedType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        SimpleType simpleType = (SimpleType) this.refinedTypeFactory.invoke(kotlinTypeRefiner);
        return simpleType == null ? this : simpleType;
    }
}
