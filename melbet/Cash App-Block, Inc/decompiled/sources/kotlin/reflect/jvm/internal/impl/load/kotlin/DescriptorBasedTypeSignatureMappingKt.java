package kotlin.reflect.jvm.internal.impl.load.kotlin;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.ExpandedTypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class DescriptorBasedTypeSignatureMappingKt {
    public static final String computeInternalName(ClassDescriptor classDescriptor, TypeMappingConfiguration<?> typeMappingConfiguration) {
        classDescriptor.getClass();
        typeMappingConfiguration.getClass();
        String predefinedFullInternalNameForClass = typeMappingConfiguration.getPredefinedFullInternalNameForClass(classDescriptor);
        if (predefinedFullInternalNameForClass != null) {
            return predefinedFullInternalNameForClass;
        }
        DeclarationDescriptor containingDeclaration = classDescriptor.getContainingDeclaration();
        containingDeclaration.getClass();
        String identifier = SpecialNames.safeIdentifier(classDescriptor.getName()).getIdentifier();
        identifier.getClass();
        if (containingDeclaration instanceof PackageFragmentDescriptor) {
            FqName fqName = ((PackageFragmentDescriptor) containingDeclaration).getFqName();
            if (fqName.isRoot()) {
                return identifier;
            }
            return StringsKt__StringsJVMKt.replace(fqName.asString(), '.', '/', false) + '/' + identifier;
        }
        ClassDescriptor classDescriptor2 = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor2 == null) {
            Handlers$$ExternalSyntheticBUOutline0.m$1("Unexpected container: ", containingDeclaration, " for ", classDescriptor);
            return null;
        }
        String predefinedInternalNameForClass = typeMappingConfiguration.getPredefinedInternalNameForClass(classDescriptor2);
        if (predefinedInternalNameForClass == null) {
            predefinedInternalNameForClass = computeInternalName(classDescriptor2, typeMappingConfiguration);
        }
        return predefinedInternalNameForClass + '$' + identifier;
    }

    public static /* synthetic */ String computeInternalName$default(ClassDescriptor classDescriptor, TypeMappingConfiguration typeMappingConfiguration, int i, Object obj) {
        if ((i & 2) != 0) {
            typeMappingConfiguration = TypeMappingConfigurationImpl.INSTANCE;
        }
        return computeInternalName(classDescriptor, typeMappingConfiguration);
    }

    public static final boolean hasVoidReturnType(CallableDescriptor callableDescriptor) {
        callableDescriptor.getClass();
        if (callableDescriptor instanceof ConstructorDescriptor) {
            return true;
        }
        KotlinType returnType = callableDescriptor.getReturnType();
        returnType.getClass();
        if (!KotlinBuiltIns.isUnit(returnType)) {
            return false;
        }
        KotlinType returnType2 = callableDescriptor.getReturnType();
        returnType2.getClass();
        return (TypeUtils.isNullableType(returnType2) || (callableDescriptor instanceof PropertyGetterDescriptor)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T mapType(KotlinType kotlinType, JvmTypeFactory<T> jvmTypeFactory, TypeMappingMode typeMappingMode, TypeMappingConfiguration<? extends T> typeMappingConfiguration, JvmDescriptorTypeWriter<T> jvmDescriptorTypeWriter, Function3 function3) {
        Object obj;
        KotlinType kotlinType2;
        Object mapType;
        kotlinType.getClass();
        jvmTypeFactory.getClass();
        typeMappingMode.getClass();
        typeMappingConfiguration.getClass();
        function3.getClass();
        KotlinType preprocessType = typeMappingConfiguration.preprocessType(kotlinType);
        if (preprocessType != null) {
            return (T) mapType(preprocessType, jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
        }
        if (FunctionTypesKt.isSuspendFunctionType(kotlinType)) {
            return (T) mapType(SuspendFunctionTypesKt.transformSuspendFunctionToRuntimeFunctionType(kotlinType), jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
        }
        SimpleClassicTypeSystemContext simpleClassicTypeSystemContext = SimpleClassicTypeSystemContext.INSTANCE;
        Object mapBuiltInType = TypeSignatureMappingKt.mapBuiltInType(simpleClassicTypeSystemContext, kotlinType, jvmTypeFactory, typeMappingMode);
        if (mapBuiltInType != null) {
            T t = (T) TypeSignatureMappingKt.boxTypeIfNeeded(jvmTypeFactory, mapBuiltInType, typeMappingMode.getNeedPrimitiveBoxing());
            function3.invoke(kotlinType, t, typeMappingMode);
            return t;
        }
        TypeConstructor constructor = kotlinType.getConstructor();
        if (constructor instanceof IntersectionTypeConstructor) {
            IntersectionTypeConstructor intersectionTypeConstructor = (IntersectionTypeConstructor) constructor;
            KotlinType alternativeType = intersectionTypeConstructor.getAlternativeType();
            if (alternativeType == null) {
                alternativeType = typeMappingConfiguration.commonSupertype(intersectionTypeConstructor.getSupertypes());
            }
            return (T) mapType(TypeUtilsKt.replaceArgumentsWithStarProjections(alternativeType), jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
        }
        ClassifierDescriptor mo4153getDeclarationDescriptor = constructor.mo4153getDeclarationDescriptor();
        if (mo4153getDeclarationDescriptor == null) {
            f$$ExternalSyntheticLambda0.m((Object) kotlinType, "no descriptor for type constructor of ");
            return null;
        }
        if (ErrorUtils.isError(mo4153getDeclarationDescriptor)) {
            T t2 = (T) jvmTypeFactory.createObjectType("error/NonExistentClass");
            typeMappingConfiguration.processErrorType(kotlinType, (ClassDescriptor) mo4153getDeclarationDescriptor);
            if (jvmDescriptorTypeWriter != 0) {
                jvmDescriptorTypeWriter.writeClass(t2);
            }
            return t2;
        }
        boolean z = mo4153getDeclarationDescriptor instanceof ClassDescriptor;
        if (z && KotlinBuiltIns.isArray(kotlinType)) {
            if (kotlinType.getArguments().size() != 1) {
                a$$ExternalSyntheticBUOutline0.m("arrays must have one type argument");
                return null;
            }
            TypeProjection typeProjection = kotlinType.getArguments().get(0);
            KotlinType type2 = typeProjection.getType();
            type2.getClass();
            if (typeProjection.getProjectionKind() == Variance.IN_VARIANCE) {
                mapType = jvmTypeFactory.createObjectType("java/lang/Object");
                if (jvmDescriptorTypeWriter != 0) {
                    jvmDescriptorTypeWriter.writeArrayType();
                    jvmDescriptorTypeWriter.writeClass(mapType);
                    jvmDescriptorTypeWriter.writeArrayEnd();
                }
            } else {
                if (jvmDescriptorTypeWriter != 0) {
                    jvmDescriptorTypeWriter.writeArrayType();
                }
                Variance projectionKind = typeProjection.getProjectionKind();
                projectionKind.getClass();
                mapType = mapType(type2, jvmTypeFactory, typeMappingMode.toGenericArgumentMode(projectionKind, true), typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
                if (jvmDescriptorTypeWriter != 0) {
                    jvmDescriptorTypeWriter.writeArrayEnd();
                }
            }
            return (T) jvmTypeFactory.mo4150createFromString("[" + jvmTypeFactory.toString(mapType));
        }
        if (!z) {
            if (!(mo4153getDeclarationDescriptor instanceof TypeParameterDescriptor)) {
                if ((mo4153getDeclarationDescriptor instanceof TypeAliasDescriptor) && typeMappingMode.getMapTypeAliases()) {
                    return (T) mapType(((TypeAliasDescriptor) mo4153getDeclarationDescriptor).getExpandedType(), jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
                }
                f$$ExternalSyntheticLambda0.m((Object) kotlinType, "Unknown type ");
                return null;
            }
            KotlinType representativeUpperBound = TypeUtilsKt.getRepresentativeUpperBound((TypeParameterDescriptor) mo4153getDeclarationDescriptor);
            if (kotlinType.isMarkedNullable()) {
                representativeUpperBound = TypeUtilsKt.makeNullable(representativeUpperBound);
            }
            T t3 = (T) mapType(representativeUpperBound, jvmTypeFactory, typeMappingMode, typeMappingConfiguration, null, FunctionsKt.getDO_NOTHING_3());
            if (jvmDescriptorTypeWriter != 0) {
                Name name = mo4153getDeclarationDescriptor.getName();
                name.getClass();
                jvmDescriptorTypeWriter.writeTypeVariable(name, t3);
            }
            return t3;
        }
        if (InlineClassesUtilsKt.isInlineClass(mo4153getDeclarationDescriptor) && !typeMappingMode.getNeedInlineClassWrapping() && (kotlinType2 = (KotlinType) ExpandedTypeUtilsKt.computeExpandedTypeForInlineClass(simpleClassicTypeSystemContext, kotlinType)) != null) {
            return (T) mapType(kotlinType2, jvmTypeFactory, typeMappingMode.wrapInlineClassesMode(), typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
        }
        if (typeMappingMode.isForAnnotationParameter() && KotlinBuiltIns.isKClass((ClassDescriptor) mo4153getDeclarationDescriptor)) {
            obj = (T) jvmTypeFactory.getJavaLangClassType();
        } else {
            ClassDescriptor classDescriptor = (ClassDescriptor) mo4153getDeclarationDescriptor;
            ClassDescriptor original = classDescriptor.getOriginal();
            original.getClass();
            obj = (T) typeMappingConfiguration.getPredefinedTypeForClass(original);
            if (obj == null) {
                if (classDescriptor.getKind() == ClassKind.ENUM_ENTRY) {
                    DeclarationDescriptor containingDeclaration = classDescriptor.getContainingDeclaration();
                    containingDeclaration.getClass();
                    classDescriptor = (ClassDescriptor) containingDeclaration;
                }
                ClassDescriptor original2 = classDescriptor.getOriginal();
                original2.getClass();
                obj = (T) jvmTypeFactory.createObjectType(computeInternalName(original2, typeMappingConfiguration));
            }
        }
        function3.invoke(kotlinType, obj, typeMappingMode);
        return (T) obj;
    }

    public static /* synthetic */ Object mapType$default(KotlinType kotlinType, JvmTypeFactory jvmTypeFactory, TypeMappingMode typeMappingMode, TypeMappingConfiguration typeMappingConfiguration, JvmDescriptorTypeWriter jvmDescriptorTypeWriter, Function3 function3, int i, Object obj) {
        if ((i & 32) != 0) {
            function3 = FunctionsKt.getDO_NOTHING_3();
        }
        return mapType(kotlinType, jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
    }
}
