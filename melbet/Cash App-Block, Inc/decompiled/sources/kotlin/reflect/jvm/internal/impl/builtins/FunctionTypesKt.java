package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes9.dex */
public final class FunctionTypesKt {
    public static final int contextFunctionTypeParamsCount(KotlinType kotlinType) {
        kotlinType.getClass();
        AnnotationDescriptor mo4143findAnnotation = kotlinType.getAnnotations().mo4143findAnnotation(StandardNames.FqNames.contextFunctionTypeParams);
        if (mo4143findAnnotation == null) {
            return 0;
        }
        ConstantValue constantValue = (ConstantValue) MapsKt__MapsKt.getValue(mo4143findAnnotation.getAllValueArguments(), StandardNames.CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME);
        constantValue.getClass();
        return ((IntValue) constantValue).getValue().intValue();
    }

    public static final SimpleType createFunctionType(KotlinBuiltIns kotlinBuiltIns, Annotations annotations, KotlinType kotlinType, List<? extends KotlinType> list, List<? extends KotlinType> list2, List<Name> list3, KotlinType kotlinType2, boolean z) {
        kotlinBuiltIns.getClass();
        annotations.getClass();
        list.getClass();
        list2.getClass();
        kotlinType2.getClass();
        List<TypeProjection> functionTypeArgumentProjections = getFunctionTypeArgumentProjections(kotlinType, list, list2, list3, kotlinType2, kotlinBuiltIns);
        ClassDescriptor functionDescriptor = getFunctionDescriptor(kotlinBuiltIns, list.size() + list2.size() + (kotlinType == null ? 0 : 1), z);
        if (kotlinType != null) {
            annotations = withExtensionFunctionAnnotation(annotations, kotlinBuiltIns);
        }
        if (!list.isEmpty()) {
            annotations = withContextReceiversFunctionAnnotation(annotations, kotlinBuiltIns, list.size());
        }
        return KotlinTypeFactory.simpleNotNullType(TypeAttributesKt.toDefaultAttributes(annotations), functionDescriptor, functionTypeArgumentProjections);
    }

    public static final Name extractParameterNameFromFunctionTypeArgument(KotlinType kotlinType) {
        String value;
        kotlinType.getClass();
        AnnotationDescriptor mo4143findAnnotation = kotlinType.getAnnotations().mo4143findAnnotation(StandardNames.FqNames.parameterName);
        if (mo4143findAnnotation == null) {
            return null;
        }
        Object singleOrNull = CollectionsKt.singleOrNull(mo4143findAnnotation.getAllValueArguments().values());
        StringValue stringValue = singleOrNull instanceof StringValue ? (StringValue) singleOrNull : null;
        if (stringValue != null && (value = stringValue.getValue()) != null) {
            if (!Name.isValidIdentifier(value)) {
                value = null;
            }
            if (value != null) {
                return Name.identifier(value);
            }
        }
        return null;
    }

    public static final List<KotlinType> getContextReceiverTypesFromFunctionType(KotlinType kotlinType) {
        kotlinType.getClass();
        isBuiltinFunctionalType(kotlinType);
        int contextFunctionTypeParamsCount = contextFunctionTypeParamsCount(kotlinType);
        if (contextFunctionTypeParamsCount == 0) {
            return EmptyList.INSTANCE;
        }
        List<TypeProjection> subList = kotlinType.getArguments().subList(0, contextFunctionTypeParamsCount);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(subList, 10));
        Iterator<T> it = subList.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeProjection) it.next()).getType());
        }
        return arrayList;
    }

    public static final ClassDescriptor getFunctionDescriptor(KotlinBuiltIns kotlinBuiltIns, int i, boolean z) {
        kotlinBuiltIns.getClass();
        ClassDescriptor suspendFunction = z ? kotlinBuiltIns.getSuspendFunction(i) : kotlinBuiltIns.getFunction(i);
        suspendFunction.getClass();
        return suspendFunction;
    }

    public static final List<TypeProjection> getFunctionTypeArgumentProjections(KotlinType kotlinType, List<? extends KotlinType> list, List<? extends KotlinType> list2, List<Name> list3, KotlinType kotlinType2, KotlinBuiltIns kotlinBuiltIns) {
        Name name;
        KotlinBuiltIns kotlinBuiltIns2;
        list.getClass();
        list2.getClass();
        kotlinType2.getClass();
        kotlinBuiltIns.getClass();
        int i = 0;
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + (kotlinType != null ? 1 : 0) + 1);
        List<? extends KotlinType> list4 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
        Iterator<T> it = list4.iterator();
        while (it.hasNext()) {
            arrayList2.add(TypeUtilsKt.asTypeProjection((KotlinType) it.next()));
        }
        arrayList.addAll(arrayList2);
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList, kotlinType != null ? TypeUtilsKt.asTypeProjection(kotlinType) : null);
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            KotlinType kotlinType3 = (KotlinType) obj;
            if (list3 == null || (name = list3.get(i)) == null || name.isSpecial()) {
                name = null;
            }
            if (name != null) {
                FqName fqName = StandardNames.FqNames.parameterName;
                Name name2 = StandardNames.NAME;
                String asString = name.asString();
                asString.getClass();
                kotlinBuiltIns2 = kotlinBuiltIns;
                kotlinType3 = TypeUtilsKt.replaceAnnotations(kotlinType3, Annotations.Companion.create(CollectionsKt.plus(kotlinType3.getAnnotations(), new BuiltInAnnotationDescriptor(kotlinBuiltIns2, fqName, MapsKt__MapsJVMKt.mapOf(new Pair(name2, new StringValue(asString))), false, 8, null))));
            } else {
                kotlinBuiltIns2 = kotlinBuiltIns;
            }
            arrayList.add(TypeUtilsKt.asTypeProjection(kotlinType3));
            i = i2;
            kotlinBuiltIns = kotlinBuiltIns2;
        }
        arrayList.add(TypeUtilsKt.asTypeProjection(kotlinType2));
        return arrayList;
    }

    public static final FunctionTypeKind getFunctionTypeKind(FqNameUnsafe fqNameUnsafe) {
        if (!fqNameUnsafe.isSafe() || fqNameUnsafe.isRoot()) {
            return null;
        }
        FunctionTypeKindExtractor functionTypeKindExtractor = FunctionTypeKindExtractor.Companion.getDefault();
        FqName parent = fqNameUnsafe.toSafe().parent();
        String asString = fqNameUnsafe.shortName().asString();
        asString.getClass();
        return functionTypeKindExtractor.getFunctionalClassKind(parent, asString);
    }

    public static final KotlinType getReceiverTypeFromFunctionType(KotlinType kotlinType) {
        kotlinType.getClass();
        isBuiltinFunctionalType(kotlinType);
        if (kotlinType.getAnnotations().mo4143findAnnotation(StandardNames.FqNames.extensionFunctionType) == null) {
            return null;
        }
        return kotlinType.getArguments().get(contextFunctionTypeParamsCount(kotlinType)).getType();
    }

    public static final KotlinType getReturnTypeFromFunctionType(KotlinType kotlinType) {
        kotlinType.getClass();
        isBuiltinFunctionalType(kotlinType);
        KotlinType type2 = ((TypeProjection) CollectionsKt.last((List) kotlinType.getArguments())).getType();
        type2.getClass();
        return type2;
    }

    public static final List<TypeProjection> getValueParameterTypesFromFunctionType(KotlinType kotlinType) {
        kotlinType.getClass();
        isBuiltinFunctionalType(kotlinType);
        return kotlinType.getArguments().subList((isBuiltinExtensionFunctionalType(kotlinType) ? 1 : 0) + contextFunctionTypeParamsCount(kotlinType), r0.size() - 1);
    }

    public static final boolean isBuiltinExtensionFunctionalType(KotlinType kotlinType) {
        kotlinType.getClass();
        return isBuiltinFunctionalType(kotlinType) && kotlinType.getAnnotations().mo4143findAnnotation(StandardNames.FqNames.extensionFunctionType) != null;
    }

    public static final boolean isBuiltinFunctionalClassDescriptor(DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        FunctionTypeKind functionTypeKind = getFunctionTypeKind(declarationDescriptor);
        return Intrinsics.areEqual(functionTypeKind, FunctionTypeKind.Function.INSTANCE) || Intrinsics.areEqual(functionTypeKind, FunctionTypeKind.SuspendFunction.INSTANCE);
    }

    public static final boolean isBuiltinFunctionalType(KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor mo4153getDeclarationDescriptor = kotlinType.getConstructor().mo4153getDeclarationDescriptor();
        return mo4153getDeclarationDescriptor != null && isBuiltinFunctionalClassDescriptor(mo4153getDeclarationDescriptor);
    }

    public static final boolean isFunctionType(KotlinType kotlinType) {
        kotlinType.getClass();
        return Intrinsics.areEqual(getFunctionTypeKind(kotlinType), FunctionTypeKind.Function.INSTANCE);
    }

    public static final boolean isNumberedFunctionClassFqName(FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        return fqNameUnsafe.startsWith(StandardNames.BUILT_INS_PACKAGE_NAME) && Intrinsics.areEqual(getFunctionTypeKind(fqNameUnsafe), FunctionTypeKind.Function.INSTANCE);
    }

    public static final boolean isSuspendFunctionType(KotlinType kotlinType) {
        kotlinType.getClass();
        return Intrinsics.areEqual(getFunctionTypeKind(kotlinType), FunctionTypeKind.SuspendFunction.INSTANCE);
    }

    public static final Annotations withContextReceiversFunctionAnnotation(Annotations annotations, KotlinBuiltIns kotlinBuiltIns, int i) {
        annotations.getClass();
        kotlinBuiltIns.getClass();
        FqName fqName = StandardNames.FqNames.contextFunctionTypeParams;
        if (annotations.hasAnnotation(fqName)) {
            return annotations;
        }
        return Annotations.Companion.create(CollectionsKt.plus(annotations, new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, MapsKt__MapsJVMKt.mapOf(new Pair(StandardNames.CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME, new IntValue(i))), false, 8, null)));
    }

    public static final Annotations withExtensionFunctionAnnotation(Annotations annotations, KotlinBuiltIns kotlinBuiltIns) {
        annotations.getClass();
        kotlinBuiltIns.getClass();
        FqName fqName = StandardNames.FqNames.extensionFunctionType;
        if (annotations.hasAnnotation(fqName)) {
            return annotations;
        }
        Annotations.Companion companion = Annotations.Companion;
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        return companion.create(CollectionsKt.plus(annotations, new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, emptyMap, false, 8, null)));
    }

    public static final FunctionTypeKind getFunctionTypeKind(DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        if ((declarationDescriptor instanceof ClassDescriptor) && KotlinBuiltIns.isUnderKotlinPackage(declarationDescriptor)) {
            return getFunctionTypeKind(DescriptorUtilsKt.getFqNameUnsafe(declarationDescriptor));
        }
        return null;
    }

    public static final FunctionTypeKind getFunctionTypeKind(KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor mo4153getDeclarationDescriptor = kotlinType.getConstructor().mo4153getDeclarationDescriptor();
        if (mo4153getDeclarationDescriptor != null) {
            return getFunctionTypeKind(mo4153getDeclarationDescriptor);
        }
        return null;
    }
}
