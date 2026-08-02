package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* loaded from: classes9.dex */
public final class SimpleTypeWithEnhancement extends DelegatingSimpleType implements TypeWithEnhancement {
    public final SimpleType delegate;
    public final KotlinType enhancement;

    public SimpleTypeWithEnhancement(SimpleType simpleType, KotlinType kotlinType) {
        simpleType.getClass();
        kotlinType.getClass();
        this.delegate = simpleType;
        this.enhancement = kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final SimpleType getDelegate() {
        return this.delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    public KotlinType getEnhancement() {
        return this.enhancement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType makeNullableAsSpecified(boolean z) {
        UnwrappedType wrapEnhancement = TypeWithEnhancementKt.wrapEnhancement(getOrigin().makeNullableAsSpecified(z), getEnhancement().unwrap().makeNullableAsSpecified(z));
        wrapEnhancement.getClass();
        return (SimpleType) wrapEnhancement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public SimpleTypeWithEnhancement refine(KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        KotlinType refineType = kotlinTypeRefiner.refineType((KotlinTypeMarker) this.delegate);
        refineType.getClass();
        return new SimpleTypeWithEnhancement((SimpleType) refineType, kotlinTypeRefiner.refineType((KotlinTypeMarker) getEnhancement()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType replaceAttributes(TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        UnwrappedType wrapEnhancement = TypeWithEnhancementKt.wrapEnhancement(getOrigin().replaceAttributes(typeAttributes), getEnhancement());
        wrapEnhancement.getClass();
        return (SimpleType) wrapEnhancement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public SimpleTypeWithEnhancement replaceDelegate(SimpleType simpleType) {
        simpleType.getClass();
        return new SimpleTypeWithEnhancement(simpleType, getEnhancement());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public String toString() {
        return "[@EnhancedForWarnings(" + getEnhancement() + ")] " + getOrigin();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    public SimpleType getOrigin() {
        return this.delegate;
    }
}
