package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;

/* loaded from: classes9.dex */
public final class CapturedType extends SimpleType implements CapturedTypeMarker {
    public final TypeAttributes attributes;
    public final CapturedTypeConstructor constructor;
    public final boolean isMarkedNullable;
    public final TypeProjection typeProjection;

    public /* synthetic */ CapturedType(TypeProjection typeProjection, CapturedTypeConstructor capturedTypeConstructor, boolean z, TypeAttributes typeAttributes, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, (i & 2) != 0 ? new CapturedTypeConstructorImpl(typeProjection) : capturedTypeConstructor, (i & 4) != 0 ? false : z, (i & 8) != 0 ? TypeAttributes.Companion.getEmpty() : typeAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> getArguments() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes getAttributes() {
        return this.attributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope getMemberScope() {
        return ErrorUtils.createErrorScope(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public CapturedType makeNullableAsSpecified(boolean z) {
        if (z == isMarkedNullable()) {
            return this;
        }
        return new CapturedType(this.typeProjection, getConstructor(), z, getAttributes());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public CapturedType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        TypeProjection refine = this.typeProjection.refine(kotlinTypeRefiner);
        refine.getClass();
        return new CapturedType(refine, getConstructor(), isMarkedNullable(), getAttributes());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType replaceAttributes(TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return new CapturedType(this.typeProjection, getConstructor(), isMarkedNullable(), typeAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.typeProjection);
        sb.append(')');
        sb.append(isMarkedNullable() ? "?" : "");
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public CapturedTypeConstructor getConstructor() {
        return this.constructor;
    }

    public CapturedType(TypeProjection typeProjection, CapturedTypeConstructor capturedTypeConstructor, boolean z, TypeAttributes typeAttributes) {
        typeProjection.getClass();
        capturedTypeConstructor.getClass();
        typeAttributes.getClass();
        this.typeProjection = typeProjection;
        this.constructor = capturedTypeConstructor;
        this.isMarkedNullable = z;
        this.attributes = typeAttributes;
    }
}
