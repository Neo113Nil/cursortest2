package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes9.dex */
public final class DynamicType extends FlexibleType implements DynamicTypeMarker {
    public final TypeAttributes attributes;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DynamicType(KotlinBuiltIns kotlinBuiltIns, TypeAttributes typeAttributes) {
        super(r0, r2);
        kotlinBuiltIns.getClass();
        typeAttributes.getClass();
        SimpleType nothingType = kotlinBuiltIns.getNothingType();
        nothingType.getClass();
        SimpleType nullableAnyType = kotlinBuiltIns.getNullableAnyType();
        nullableAnyType.getClass();
        this.attributes = typeAttributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes getAttributes() {
        return this.attributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public SimpleType getDelegate() {
        return getUpperBound();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public String render(DescriptorRenderer descriptorRenderer, DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRenderer.getClass();
        descriptorRendererOptions.getClass();
        return "dynamic";
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public DynamicType replaceAttributes(TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return new DynamicType(TypeUtilsKt.getBuiltIns(getDelegate()), typeAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public DynamicType makeNullableAsSpecified(boolean z) {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public DynamicType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return this;
    }
}
