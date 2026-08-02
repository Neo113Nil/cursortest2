package kotlin.reflect.jvm.internal.impl.types;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class TypeSubstitutionKt {
    public static final SimpleType asSimpleType(KotlinType kotlinType) {
        kotlinType.getClass();
        UnwrappedType unwrap2 = kotlinType.unwrap();
        SimpleType simpleType = unwrap2 instanceof SimpleType ? (SimpleType) unwrap2 : null;
        if (simpleType != null) {
            return simpleType;
        }
        Path$$ExternalSyntheticBUOutline0.m$1(kotlinType, "This is should be simple type: ");
        return null;
    }

    public static final KotlinType replace(KotlinType kotlinType, List<? extends TypeProjection> list, Annotations annotations, List<? extends TypeProjection> list2) {
        kotlinType.getClass();
        list.getClass();
        annotations.getClass();
        list2.getClass();
        if ((list.isEmpty() || list == kotlinType.getArguments()) && annotations == kotlinType.getAnnotations()) {
            return kotlinType;
        }
        TypeAttributes attributes = kotlinType.getAttributes();
        if ((annotations instanceof FilteredAnnotations) && ((FilteredAnnotations) annotations).isEmpty()) {
            annotations = Annotations.Companion.getEMPTY();
        }
        TypeAttributes replaceAnnotations = TypeAttributesKt.replaceAnnotations(attributes, annotations);
        UnwrappedType unwrap2 = kotlinType.unwrap();
        if (unwrap2 instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrap2;
            return KotlinTypeFactory.flexibleType(replace(flexibleType.getLowerBound(), list, replaceAnnotations), replace(flexibleType.getUpperBound(), list2, replaceAnnotations));
        }
        if (unwrap2 instanceof SimpleType) {
            return replace((SimpleType) unwrap2, list, replaceAnnotations);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static /* synthetic */ KotlinType replace$default(KotlinType kotlinType, List list, Annotations annotations, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = kotlinType.getArguments();
        }
        if ((i & 2) != 0) {
            annotations = kotlinType.getAnnotations();
        }
        if ((i & 4) != 0) {
            list2 = list;
        }
        return replace(kotlinType, list, annotations, list2);
    }

    public static /* synthetic */ SimpleType replace$default(SimpleType simpleType, List list, TypeAttributes typeAttributes, int i, Object obj) {
        if ((i & 1) != 0) {
            list = simpleType.getArguments();
        }
        if ((i & 2) != 0) {
            typeAttributes = simpleType.getAttributes();
        }
        return replace(simpleType, (List<? extends TypeProjection>) list, typeAttributes);
    }

    public static final KotlinType replace(KotlinType kotlinType, List<? extends TypeProjection> list, Annotations annotations) {
        kotlinType.getClass();
        list.getClass();
        annotations.getClass();
        return replace$default(kotlinType, list, annotations, null, 4, null);
    }

    public static final SimpleType replace(SimpleType simpleType, List<? extends TypeProjection> list, TypeAttributes typeAttributes) {
        simpleType.getClass();
        list.getClass();
        typeAttributes.getClass();
        if (list.isEmpty() && typeAttributes == simpleType.getAttributes()) {
            return simpleType;
        }
        if (list.isEmpty()) {
            return simpleType.replaceAttributes(typeAttributes);
        }
        if (simpleType instanceof ErrorType) {
            return ((ErrorType) simpleType).replaceArguments(list);
        }
        return KotlinTypeFactory.simpleType$default(typeAttributes, simpleType.getConstructor(), list, simpleType.isMarkedNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
    }
}
