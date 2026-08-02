package kotlin.reflect.jvm.internal.impl.types.checker;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import radiography.Radiography$renderScannableViewTree$1$2;

/* loaded from: classes9.dex */
public abstract class KotlinTypePreparator extends AbstractTypePreparator {

    public static final class Default extends KotlinTypePreparator {
        public static final Default INSTANCE = new Default();
    }

    public static SimpleType transformToNewType(SimpleType simpleType) {
        KotlinType type2;
        TypeConstructor constructor = simpleType.getConstructor();
        IntersectionTypeConstructor intersectionTypeConstructor = null;
        r3 = null;
        UnwrappedType unwrappedType = null;
        if (constructor instanceof CapturedTypeConstructorImpl) {
            CapturedTypeConstructorImpl capturedTypeConstructorImpl = (CapturedTypeConstructorImpl) constructor;
            TypeProjection projection = capturedTypeConstructorImpl.getProjection();
            if (projection.getProjectionKind() != Variance.IN_VARIANCE) {
                projection = null;
            }
            if (projection != null && (type2 = projection.getType()) != null) {
                unwrappedType = type2.unwrap();
            }
            UnwrappedType unwrappedType2 = unwrappedType;
            if (capturedTypeConstructorImpl.getNewTypeConstructor() == null) {
                TypeProjection projection2 = capturedTypeConstructorImpl.getProjection();
                Collection<KotlinType> supertypes = capturedTypeConstructorImpl.getSupertypes();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(supertypes, 10));
                Iterator<T> it = supertypes.iterator();
                while (it.hasNext()) {
                    arrayList.add(((KotlinType) it.next()).unwrap());
                }
                capturedTypeConstructorImpl.setNewTypeConstructor(new NewCapturedTypeConstructor(projection2, arrayList, null, 4, null));
            }
            CaptureStatus captureStatus = CaptureStatus.FOR_SUBTYPING;
            NewCapturedTypeConstructor newTypeConstructor = capturedTypeConstructorImpl.getNewTypeConstructor();
            newTypeConstructor.getClass();
            return new NewCapturedType(captureStatus, newTypeConstructor, unwrappedType2, simpleType.getAttributes(), simpleType.isMarkedNullable(), false, 32, null);
        }
        boolean z = false;
        if (constructor instanceof IntegerValueTypeConstructor) {
            Collection<KotlinType> supertypes2 = ((IntegerValueTypeConstructor) constructor).getSupertypes();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(supertypes2, 10));
            Iterator<T> it2 = supertypes2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(TypeUtils.makeNullableAsSpecified((KotlinType) it2.next(), simpleType.isMarkedNullable()));
            }
            return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(simpleType.getAttributes(), new IntersectionTypeConstructor(arrayList2), EmptyList.INSTANCE, false, simpleType.getMemberScope());
        }
        if (!(constructor instanceof IntersectionTypeConstructor) || !simpleType.isMarkedNullable()) {
            return simpleType;
        }
        IntersectionTypeConstructor intersectionTypeConstructor2 = (IntersectionTypeConstructor) constructor;
        Collection<KotlinType> supertypes3 = intersectionTypeConstructor2.getSupertypes();
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(supertypes3, 10));
        Iterator<T> it3 = supertypes3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(TypeUtilsKt.makeNullable((KotlinType) it3.next()));
            z = true;
        }
        if (z) {
            KotlinType alternativeType = intersectionTypeConstructor2.getAlternativeType();
            intersectionTypeConstructor = new IntersectionTypeConstructor(arrayList3).setAlternative(alternativeType != null ? TypeUtilsKt.makeNullable(alternativeType) : null);
        }
        if (intersectionTypeConstructor != null) {
            intersectionTypeConstructor2 = intersectionTypeConstructor;
        }
        return intersectionTypeConstructor2.createType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator
    public UnwrappedType prepareType(KotlinTypeMarker kotlinTypeMarker) {
        UnwrappedType flexibleType;
        kotlinTypeMarker.getClass();
        if (!(kotlinTypeMarker instanceof KotlinType)) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return null;
        }
        UnwrappedType unwrap2 = ((KotlinType) kotlinTypeMarker).unwrap();
        if (unwrap2 instanceof SimpleType) {
            flexibleType = transformToNewType((SimpleType) unwrap2);
        } else {
            if (!(unwrap2 instanceof FlexibleType)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            FlexibleType flexibleType2 = (FlexibleType) unwrap2;
            SimpleType transformToNewType = transformToNewType(flexibleType2.getLowerBound());
            SimpleType transformToNewType2 = transformToNewType(flexibleType2.getUpperBound());
            flexibleType = (transformToNewType == flexibleType2.getLowerBound() && transformToNewType2 == flexibleType2.getUpperBound()) ? unwrap2 : KotlinTypeFactory.flexibleType(transformToNewType, transformToNewType2);
        }
        return TypeWithEnhancementKt.inheritEnhancement(flexibleType, unwrap2, new Radiography$renderScannableViewTree$1$2(1, this, KotlinTypePreparator.class, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;", 0, 5));
    }
}
