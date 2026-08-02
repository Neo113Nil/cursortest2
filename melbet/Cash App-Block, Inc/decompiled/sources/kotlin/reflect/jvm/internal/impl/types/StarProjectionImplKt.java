package kotlin.reflect.jvm.internal.impl.types;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* loaded from: classes9.dex */
public final class StarProjectionImplKt {
    public static final KotlinType starProjectionType(TypeParameterDescriptor typeParameterDescriptor) {
        typeParameterDescriptor.getClass();
        DeclarationDescriptor containingDeclaration = typeParameterDescriptor.getContainingDeclaration();
        containingDeclaration.getClass();
        if (containingDeclaration instanceof ClassifierDescriptorWithTypeParameters) {
            List<TypeParameterDescriptor> parameters = ((ClassifierDescriptorWithTypeParameters) containingDeclaration).getTypeConstructor().getParameters();
            parameters.getClass();
            List<TypeParameterDescriptor> list = parameters;
            final ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((TypeParameterDescriptor) it.next()).getTypeConstructor());
            }
            List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
            upperBounds.getClass();
            KotlinBuiltIns builtIns = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor);
            KotlinType substitute = TypeSubstitutor.create(new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.StarProjectionImplKt$buildStarProjectionTypeByTypeParameters$1
                @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
                public TypeProjection get(TypeConstructor typeConstructor) {
                    typeConstructor.getClass();
                    if (!arrayList.contains(typeConstructor)) {
                        return null;
                    }
                    ClassifierDescriptor mo4153getDeclarationDescriptor = typeConstructor.mo4153getDeclarationDescriptor();
                    mo4153getDeclarationDescriptor.getClass();
                    return TypeUtils.makeStarProjection((TypeParameterDescriptor) mo4153getDeclarationDescriptor);
                }
            }).substitute((KotlinType) CollectionsKt.first((List) upperBounds), Variance.OUT_VARIANCE);
            if (substitute != null) {
                return substitute;
            }
            SimpleType defaultBound = builtIns.getDefaultBound();
            defaultBound.getClass();
            return defaultBound;
        }
        if (!(containingDeclaration instanceof FunctionDescriptor)) {
            a$$ExternalSyntheticBUOutline0.m$3("Unsupported descriptor type to build star projection type based on type parameters of it");
            return null;
        }
        List<TypeParameterDescriptor> typeParameters = ((FunctionDescriptor) containingDeclaration).getTypeParameters();
        typeParameters.getClass();
        List<TypeParameterDescriptor> list2 = typeParameters;
        final ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((TypeParameterDescriptor) it2.next()).getTypeConstructor());
        }
        List<KotlinType> upperBounds2 = typeParameterDescriptor.getUpperBounds();
        upperBounds2.getClass();
        KotlinBuiltIns builtIns2 = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor);
        KotlinType substitute2 = TypeSubstitutor.create(new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.StarProjectionImplKt$buildStarProjectionTypeByTypeParameters$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
            public TypeProjection get(TypeConstructor typeConstructor) {
                typeConstructor.getClass();
                if (!arrayList2.contains(typeConstructor)) {
                    return null;
                }
                ClassifierDescriptor mo4153getDeclarationDescriptor = typeConstructor.mo4153getDeclarationDescriptor();
                mo4153getDeclarationDescriptor.getClass();
                return TypeUtils.makeStarProjection((TypeParameterDescriptor) mo4153getDeclarationDescriptor);
            }
        }).substitute((KotlinType) CollectionsKt.first((List) upperBounds2), Variance.OUT_VARIANCE);
        if (substitute2 != null) {
            return substitute2;
        }
        SimpleType defaultBound2 = builtIns2.getDefaultBound();
        defaultBound2.getClass();
        return defaultBound2;
    }
}
