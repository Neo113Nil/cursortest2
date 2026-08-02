package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.StubTypeMarker;

/* loaded from: classes9.dex */
public final class StubTypeForBuilderInference extends AbstractStubType implements StubTypeMarker {
    public final TypeConstructor constructor;
    public final MemberScope memberScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StubTypeForBuilderInference(NewTypeVariableConstructor newTypeVariableConstructor, boolean z, TypeConstructor typeConstructor) {
        super(newTypeVariableConstructor, z);
        newTypeVariableConstructor.getClass();
        typeConstructor.getClass();
        this.constructor = typeConstructor;
        this.memberScope = newTypeVariableConstructor.getBuiltIns().getAnyType().getMemberScope();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeConstructor getConstructor() {
        return this.constructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractStubType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope getMemberScope() {
        return this.memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractStubType
    public AbstractStubType materialize(boolean z) {
        return new StubTypeForBuilderInference(getOriginalTypeVariable(), z, getConstructor());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public String toString() {
        StringBuilder sb = new StringBuilder("Stub (BI): ");
        sb.append(getOriginalTypeVariable());
        sb.append(isMarkedNullable() ? "?" : "");
        return sb.toString();
    }
}
