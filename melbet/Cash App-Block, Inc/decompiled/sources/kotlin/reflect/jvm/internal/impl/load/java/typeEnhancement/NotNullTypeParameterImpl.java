package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.NotNullTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes9.dex */
public final class NotNullTypeParameterImpl extends DelegatingSimpleType implements NotNullTypeParameter {
    public final SimpleType delegate;

    public NotNullTypeParameterImpl(SimpleType simpleType) {
        simpleType.getClass();
        this.delegate = simpleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final SimpleType getDelegate() {
        return this.delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public boolean isTypeParameter() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType makeNullableAsSpecified(boolean z) {
        return z ? this.delegate.makeNullableAsSpecified(true) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public NotNullTypeParameterImpl replaceAttributes(TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return new NotNullTypeParameterImpl(this.delegate.replaceAttributes(typeAttributes));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public NotNullTypeParameterImpl replaceDelegate(SimpleType simpleType) {
        simpleType.getClass();
        return new NotNullTypeParameterImpl(simpleType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public KotlinType substitutionResult(KotlinType kotlinType) {
        kotlinType.getClass();
        UnwrappedType unwrap2 = kotlinType.unwrap();
        if (!TypeUtilsKt.isTypeParameter(unwrap2) && !TypeUtils.isNullableType(unwrap2)) {
            return unwrap2;
        }
        if (unwrap2 instanceof SimpleType) {
            SimpleType simpleType = (SimpleType) unwrap2;
            SimpleType makeNullableAsSpecified = simpleType.makeNullableAsSpecified(false);
            return !TypeUtilsKt.isTypeParameter(simpleType) ? makeNullableAsSpecified : new NotNullTypeParameterImpl(makeNullableAsSpecified);
        }
        if (!(unwrap2 instanceof FlexibleType)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        FlexibleType flexibleType = (FlexibleType) unwrap2;
        SimpleType lowerBound = flexibleType.getLowerBound();
        SimpleType makeNullableAsSpecified2 = lowerBound.makeNullableAsSpecified(false);
        if (TypeUtilsKt.isTypeParameter(lowerBound)) {
            makeNullableAsSpecified2 = new NotNullTypeParameterImpl(makeNullableAsSpecified2);
        }
        SimpleType upperBound = flexibleType.getUpperBound();
        SimpleType makeNullableAsSpecified3 = upperBound.makeNullableAsSpecified(false);
        if (TypeUtilsKt.isTypeParameter(upperBound)) {
            makeNullableAsSpecified3 = new NotNullTypeParameterImpl(makeNullableAsSpecified3);
        }
        return TypeWithEnhancementKt.wrapEnhancement(KotlinTypeFactory.flexibleType(makeNullableAsSpecified2, makeNullableAsSpecified3), TypeWithEnhancementKt.getEnhancement(unwrap2));
    }
}
