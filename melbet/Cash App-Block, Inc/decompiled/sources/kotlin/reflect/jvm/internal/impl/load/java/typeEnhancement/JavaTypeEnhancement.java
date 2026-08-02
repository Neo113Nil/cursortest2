package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.google.android.gms.internal.fido.zzfz;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.commonmark.internal.BlockContent;

/* loaded from: classes9.dex */
public final class JavaTypeEnhancement {
    public final JavaResolverSettings javaResolverSettings;

    public JavaTypeEnhancement(JavaResolverSettings javaResolverSettings) {
        javaResolverSettings.getClass();
        this.javaResolverSettings = javaResolverSettings;
    }

    public final KotlinType enhance(KotlinType kotlinType, Function1<? super Integer, JavaTypeQualifiers> function1, boolean z) {
        kotlinType.getClass();
        function1.getClass();
        return (KotlinType) enhancePossiblyFlexible(kotlinType.unwrap(), function1, 0, z).sb;
    }

    public final zzfz enhanceInflexible(SimpleType simpleType, Function1 function1, int i, TypeComponentPosition typeComponentPosition, boolean z, boolean z2) {
        ClassifierDescriptor mo4153getDeclarationDescriptor;
        TypeConstructor constructor;
        EnhancedTypeAnnotations enhancedTypeAnnotations;
        boolean z3;
        SimpleType notNullTypeParameterImpl;
        Boolean bool;
        ClassifierDescriptor classifierDescriptor;
        BlockContent blockContent;
        TypeProjection makeStarProjection;
        boolean shouldEnhance = TypeComponentPositionKt.shouldEnhance(typeComponentPosition);
        boolean z4 = (z2 && z) ? false : true;
        Object obj = null;
        if ((shouldEnhance || !simpleType.getArguments().isEmpty()) && (mo4153getDeclarationDescriptor = simpleType.getConstructor().mo4153getDeclarationDescriptor()) != null) {
            JavaTypeQualifiers javaTypeQualifiers = (JavaTypeQualifiers) function1.invoke(Integer.valueOf(i));
            ClassifierDescriptor access$enhanceMutability = TypeEnhancementKt.access$enhanceMutability(mo4153getDeclarationDescriptor, javaTypeQualifiers, typeComponentPosition);
            Boolean access$getEnhancedNullability = TypeEnhancementKt.access$getEnhancedNullability(javaTypeQualifiers, typeComponentPosition);
            if (access$enhanceMutability == null || (constructor = access$enhanceMutability.getTypeConstructor()) == null) {
                constructor = simpleType.getConstructor();
            }
            TypeConstructor typeConstructor = constructor;
            int i2 = i + 1;
            List<TypeProjection> arguments = simpleType.getArguments();
            List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
            parameters.getClass();
            List<TypeParameterDescriptor> list = parameters;
            Iterator<T> it = arguments.iterator();
            Iterator<T> it2 = list.iterator();
            ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments, 10), CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10)));
            while (it.hasNext() && it2.hasNext()) {
                Object next = it.next();
                TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) it2.next();
                TypeProjection typeProjection = (TypeProjection) next;
                if (z4) {
                    bool = access$getEnhancedNullability;
                    classifierDescriptor = access$enhanceMutability;
                    if (!typeProjection.isStarProjection()) {
                        blockContent = enhancePossiblyFlexible(typeProjection.getType().unwrap(), function1, i2, z2);
                    } else if (((JavaTypeQualifiers) function1.invoke(Integer.valueOf(i2))).getNullability() == NullabilityQualifier.FORCE_FLEXIBILITY) {
                        UnwrappedType unwrap2 = typeProjection.getType().unwrap();
                        blockContent = new BlockContent(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(unwrap2).makeNullableAsSpecified(false), FlexibleTypesKt.upperIfFlexible(unwrap2).makeNullableAsSpecified(true)), 1, 2);
                    } else {
                        blockContent = new BlockContent(null, 1, 2);
                    }
                } else {
                    bool = access$getEnhancedNullability;
                    classifierDescriptor = access$enhanceMutability;
                    blockContent = new BlockContent(obj, 0, 2);
                }
                i2 += blockContent.lineCount;
                KotlinType kotlinType = (KotlinType) blockContent.sb;
                if (kotlinType != null) {
                    Variance projectionKind = typeProjection.getProjectionKind();
                    projectionKind.getClass();
                    makeStarProjection = TypeUtilsKt.createProjection(kotlinType, projectionKind, typeParameterDescriptor);
                } else if (classifierDescriptor == null || typeProjection.isStarProjection()) {
                    makeStarProjection = classifierDescriptor != null ? TypeUtils.makeStarProjection(typeParameterDescriptor) : null;
                } else {
                    KotlinType type2 = typeProjection.getType();
                    type2.getClass();
                    Variance projectionKind2 = typeProjection.getProjectionKind();
                    projectionKind2.getClass();
                    makeStarProjection = TypeUtilsKt.createProjection(type2, projectionKind2, typeParameterDescriptor);
                }
                arrayList.add(makeStarProjection);
                access$getEnhancedNullability = bool;
                access$enhanceMutability = classifierDescriptor;
                obj = null;
            }
            Boolean bool2 = access$getEnhancedNullability;
            ClassifierDescriptor classifierDescriptor2 = access$enhanceMutability;
            int i3 = i2 - i;
            if (classifierDescriptor2 == null && bool2 == null) {
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((TypeProjection) it3.next()) == null) {
                        }
                    }
                }
                return new zzfz(null, i3, false);
            }
            Annotations annotations = simpleType.getAnnotations();
            enhancedTypeAnnotations = TypeEnhancementKt.ENHANCED_MUTABILITY_ANNOTATIONS;
            if (classifierDescriptor2 == null) {
                enhancedTypeAnnotations = null;
            }
            TypeAttributes defaultAttributes = TypeAttributesKt.toDefaultAttributes(TypeEnhancementKt.access$compositeAnnotationsOrSingle(ArraysKt___ArraysKt.filterNotNull(new Annotations[]{annotations, enhancedTypeAnnotations, bool2 != null ? TypeEnhancementKt.getENHANCED_NULLABILITY_ANNOTATIONS() : null})));
            List<TypeProjection> arguments2 = simpleType.getArguments();
            Iterator it4 = arrayList.iterator();
            Iterator<T> it5 = arguments2.iterator();
            ArrayList arrayList2 = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10), CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments2, 10)));
            while (it4.hasNext() && it5.hasNext()) {
                Object next2 = it4.next();
                TypeProjection typeProjection2 = (TypeProjection) it5.next();
                TypeProjection typeProjection3 = (TypeProjection) next2;
                if (typeProjection3 != null) {
                    typeProjection2 = typeProjection3;
                }
                arrayList2.add(typeProjection2);
            }
            SimpleType simpleType$default = KotlinTypeFactory.simpleType$default(defaultAttributes, typeConstructor, arrayList2, bool2 != null ? bool2.booleanValue() : simpleType.isMarkedNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
            if (javaTypeQualifiers.getDefinitelyNotNull()) {
                if (this.javaResolverSettings.getCorrectNullabilityForNotNullTypeParameter()) {
                    z3 = true;
                    notNullTypeParameterImpl = SpecialTypesKt.makeSimpleTypeDefinitelyNotNullOrNotNull(simpleType$default, true);
                } else {
                    z3 = true;
                    notNullTypeParameterImpl = new NotNullTypeParameterImpl(simpleType$default);
                }
                simpleType$default = notNullTypeParameterImpl;
            } else {
                z3 = true;
            }
            return new zzfz(simpleType$default, i3, (bool2 == null || !javaTypeQualifiers.isNullabilityQualifierForWarning()) ? false : z3);
        }
        return new zzfz(null, 1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [kotlin.reflect.jvm.internal.impl.types.UnwrappedType] */
    public final BlockContent enhancePossiblyFlexible(UnwrappedType unwrappedType, Function1 function1, int i, boolean z) {
        Object obj = null;
        if (KotlinTypeKt.isError(unwrappedType)) {
            return new BlockContent(null, 1, 2);
        }
        if (!(unwrappedType instanceof FlexibleType)) {
            if (!(unwrappedType instanceof SimpleType)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            zzfz enhanceInflexible = enhanceInflexible((SimpleType) unwrappedType, function1, i, TypeComponentPosition.INFLEXIBLE, false, z);
            boolean z2 = enhanceInflexible.zzc;
            KotlinType kotlinType = (SimpleType) enhanceInflexible.zza;
            if (z2) {
                kotlinType = TypeWithEnhancementKt.wrapEnhancement(unwrappedType, kotlinType);
            }
            return new BlockContent(kotlinType, enhanceInflexible.zzb, 2);
        }
        boolean z3 = unwrappedType instanceof RawType;
        FlexibleType flexibleType = (FlexibleType) unwrappedType;
        zzfz enhanceInflexible2 = enhanceInflexible(flexibleType.getLowerBound(), function1, i, TypeComponentPosition.FLEXIBLE_LOWER, z3, z);
        SimpleType simpleType = (SimpleType) enhanceInflexible2.zza;
        zzfz enhanceInflexible3 = enhanceInflexible(flexibleType.getUpperBound(), function1, i, TypeComponentPosition.FLEXIBLE_UPPER, z3, z);
        SimpleType simpleType2 = (SimpleType) enhanceInflexible3.zza;
        if (simpleType != null || simpleType2 != null) {
            if (enhanceInflexible2.zzc || enhanceInflexible3.zzc) {
                if (simpleType2 != null) {
                    ?? flexibleType2 = KotlinTypeFactory.flexibleType(simpleType == null ? simpleType2 : simpleType, simpleType2);
                    if (flexibleType2 != 0) {
                        simpleType = flexibleType2;
                        obj = TypeWithEnhancementKt.wrapEnhancement(unwrappedType, simpleType);
                    }
                }
                simpleType.getClass();
                obj = TypeWithEnhancementKt.wrapEnhancement(unwrappedType, simpleType);
            } else if (z3) {
                if (simpleType == null) {
                    simpleType = flexibleType.getLowerBound();
                }
                if (simpleType2 == null) {
                    simpleType2 = flexibleType.getUpperBound();
                }
                obj = new RawTypeImpl(simpleType, simpleType2);
            } else {
                if (simpleType == null) {
                    simpleType = flexibleType.getLowerBound();
                }
                if (simpleType2 == null) {
                    simpleType2 = flexibleType.getUpperBound();
                }
                obj = KotlinTypeFactory.flexibleType(simpleType, simpleType2);
            }
        }
        return new BlockContent(obj, enhanceInflexible2.zzb, 2);
    }
}
