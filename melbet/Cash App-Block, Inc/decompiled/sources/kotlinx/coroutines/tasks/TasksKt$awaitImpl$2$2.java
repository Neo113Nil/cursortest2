package kotlinx.coroutines.tasks;

import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.request.OneShotDisposable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinVersion;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.LazySubstitutingClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName;
import kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationSettingsKt;
import kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStatesImpl;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLoadingKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AnnotationsContainerWithConstants;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.IntersectionTypeKt;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.TypeRegistry;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* loaded from: classes9.dex */
public final class TasksKt$awaitImpl$2$2 implements Function1 {
    public final Object $cancellationTokenSource;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ TasksKt$awaitImpl$2$2(Object obj, int i) {
        this.$r8$classId = i;
        this.$cancellationTokenSource = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x03c5, code lost:
    
        if (r12 != false) goto L157;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean equals;
        Object obj2;
        DeserializationContext createContext;
        ClassDescriptor deserializedClassDescriptor;
        TypeProjection computeProjection;
        int i = this.$r8$classId;
        Object obj3 = this.$cancellationTokenSource;
        switch (i) {
            case 0:
                ((OneShotDisposable) obj3).cancel();
                return Unit.INSTANCE;
            case 1:
                SimpleType simpleType = (SimpleType) obj;
                LazySubstitutingClassDescriptor lazySubstitutingClassDescriptor = (LazySubstitutingClassDescriptor) obj3;
                if (simpleType != null) {
                    return lazySubstitutingClassDescriptor.originalSubstitutor.isEmpty() ? simpleType : (SimpleType) lazySubstitutingClassDescriptor.getSubstitutor().substitute(simpleType, Variance.INVARIANT);
                }
                int i2 = LazySubstitutingClassDescriptor.$r8$clinit;
                return simpleType;
            case 2:
                ModuleDescriptorImpl moduleDescriptorImpl = (ModuleDescriptorImpl) obj3;
                FqName fqName = (FqName) obj;
                fqName.getClass();
                return moduleDescriptorImpl.packageViewDescriptorFactory.compute(moduleDescriptorImpl, fqName, moduleDescriptorImpl.storageManager);
            case 3:
                ReflectJavaClass reflectJavaClass = (ReflectJavaClass) obj3;
                Method method = (Method) obj;
                if (!method.isSynthetic()) {
                    if (reflectJavaClass.isEnum()) {
                        String name = method.getName();
                        if (Intrinsics.areEqual(name, "values")) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            parameterTypes.getClass();
                            if (parameterTypes.length == 0) {
                                equals = true;
                                break;
                            }
                            equals = false;
                            break;
                        } else {
                            if (Intrinsics.areEqual(name, "valueOf")) {
                                equals = Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
                                break;
                            }
                            equals = false;
                        }
                    }
                    return Boolean.valueOf(r2);
                }
                r2 = false;
                return Boolean.valueOf(r2);
            case 4:
                BuiltinMethodsWithDifferentJvmName builtinMethodsWithDifferentJvmName = BuiltinMethodsWithDifferentJvmName.INSTANCE;
                ((CallableMemberDescriptor) obj).getClass();
                return Boolean.valueOf(SpecialGenericSignatures.Companion.getSIGNATURE_TO_JVM_REPRESENTATION_NAME().containsKey(MethodSignatureMappingKt.computeJvmSignature((SimpleFunctionDescriptor) obj3)));
            case 5:
                FqName fqName2 = (FqName) obj;
                fqName2.getClass();
                return JavaNullabilityAnnotationSettingsKt.getDefaultReportLevelForAnnotation(fqName2, (KotlinVersion) obj3);
            case 6:
                FqName fqName3 = (FqName) obj;
                fqName3.getClass();
                return FqNamesUtilKt.findValueForMostSpecificFqname(fqName3, ((NullabilityAnnotationStatesImpl) obj3).states);
            case 7:
                CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
                if (callableMemberDescriptor != null) {
                    ((DescriptorResolverUtils.AnonymousClass1) obj3).val$errorReporter.reportCannotInferVisibility(callableMemberDescriptor);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$3("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
                return null;
            case 8:
                LazyJavaAnnotations lazyJavaAnnotations = (LazyJavaAnnotations) obj3;
                JavaAnnotation javaAnnotation = (JavaAnnotation) obj;
                javaAnnotation.getClass();
                return JavaAnnotationMapper.INSTANCE.mapOrResolveJavaAnnotation(javaAnnotation, lazyJavaAnnotations.c, lazyJavaAnnotations.areAnnotationsFreshlySupported);
            case 9:
                LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver = (LazyJavaTypeParameterResolver) obj3;
                JavaTypeParameter javaTypeParameter = (JavaTypeParameter) obj;
                javaTypeParameter.getClass();
                Map map = lazyJavaTypeParameterResolver.typeParameters;
                DeclarationDescriptor declarationDescriptor = lazyJavaTypeParameterResolver.containingDeclaration;
                Integer num = (Integer) map.get(javaTypeParameter);
                if (num != null) {
                    return new LazyJavaTypeParameterDescriptor(ContextKt.copyWithNewDefaultTypeQualifiers(ContextKt.child(lazyJavaTypeParameterResolver.c, lazyJavaTypeParameterResolver), declarationDescriptor.getAnnotations()), javaTypeParameter, lazyJavaTypeParameterResolver.typeParametersIndexOffset + num.intValue(), declarationDescriptor);
                }
                return null;
            case 10:
                JavaMethod javaMethod = (JavaMethod) obj;
                javaMethod.getClass();
                return Boolean.valueOf(((Boolean) ((ClassDeclaredMemberIndex) obj3).memberFilter.invoke(javaMethod)).booleanValue() && !JavaLoadingKt.isObjectMethodInInterface(javaMethod));
            case 11:
                LazyJavaClassDescriptor lazyJavaClassDescriptor = (LazyJavaClassDescriptor) obj3;
                LazyJavaClassDescriptor.Companion companion = LazyJavaClassDescriptor.Companion;
                ((KotlinTypeRefiner) obj).getClass();
                return new LazyJavaClassMemberScope(lazyJavaClassDescriptor.c, lazyJavaClassDescriptor, lazyJavaClassDescriptor.jClass, lazyJavaClassDescriptor.additionalSupertypeClassDescriptor != null, lazyJavaClassDescriptor.unsubstitutedMemberScope);
            case 12:
                MemberScope memberScope = (MemberScope) obj;
                int i3 = LazyJavaStaticClassScope.$r8$clinit;
                memberScope.getClass();
                return memberScope.getContributedVariables((Name) obj3, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            case 13:
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.NULLABLE;
                functionEnhancementBuilder.getClass();
                String javaUtil = ((SignatureBuildingComponents) obj3).javaUtil("Spliterator");
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
                functionEnhancementBuilder.returns(javaUtil, javaTypeQualifiers2, javaTypeQualifiers2);
                functionEnhancementBuilder.mustUseReturnValue();
                return Unit.INSTANCE;
            case 14:
                CallableMemberDescriptor callableMemberDescriptor2 = (CallableMemberDescriptor) obj;
                callableMemberDescriptor2.getClass();
                KotlinType type2 = callableMemberDescriptor2.getValueParameters().get(((ValueParameterDescriptor) obj3).getIndex()).getType();
                type2.getClass();
                return type2;
            case 15:
                final AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader = (AbstractBinaryClassAnnotationAndConstantLoader) obj3;
                final KotlinJvmBinaryClass kotlinJvmBinaryClass = (KotlinJvmBinaryClass) obj;
                int i4 = AbstractBinaryClassAnnotationAndConstantLoader.$r8$clinit;
                kotlinJvmBinaryClass.getClass();
                final HashMap hashMap = new HashMap();
                final HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                kotlinJvmBinaryClass.visitMembers(new KotlinJvmBinaryClass.MemberVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1

                    public final class AnnotationVisitorForMethod extends MemberAnnotationVisitor implements KotlinJvmBinaryClass.MethodAnnotationVisitor {
                        public final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnnotationVisitorForMethod(AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1, MemberSignature memberSignature) {
                            super(abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1, memberSignature);
                            memberSignature.getClass();
                            this.this$0 = abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1;
                        }

                        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MethodAnnotationVisitor
                        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitParameterAnnotation(int i, ClassId classId, SourceElement sourceElement) {
                            classId.getClass();
                            sourceElement.getClass();
                            MemberSignature fromMethodSignatureAndParameterIndex = MemberSignature.Companion.fromMethodSignatureAndParameterIndex(this.signature, i);
                            AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 = this.this$0;
                            List list = (List) hashMap.get(fromMethodSignatureAndParameterIndex);
                            if (list == null) {
                                list = new ArrayList();
                                hashMap.put(fromMethodSignatureAndParameterIndex, list);
                            }
                            return AbstractBinaryClassAnnotationAndConstantLoader.this.loadAnnotationIfNotSpecial(classId, sourceElement, list);
                        }
                    }

                    public class MemberAnnotationVisitor implements KotlinJvmBinaryClass.AnnotationVisitor {
                        public final ArrayList result;
                        public final MemberSignature signature;
                        public final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 this$0;

                        public MemberAnnotationVisitor(AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1, MemberSignature memberSignature) {
                            memberSignature.getClass();
                            this.this$0 = abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1;
                            this.signature = memberSignature;
                            this.result = new ArrayList();
                        }

                        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(ClassId classId, SourceElement sourceElement) {
                            classId.getClass();
                            sourceElement.getClass();
                            return AbstractBinaryClassAnnotationAndConstantLoader.this.loadAnnotationIfNotSpecial(classId, sourceElement, this.result);
                        }

                        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                        public void visitEnd() {
                            ArrayList arrayList = this.result;
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            hashMap.put(this.signature, arrayList);
                        }
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor
                    public KotlinJvmBinaryClass.AnnotationVisitor visitField(Name name2, String str, Object obj4) {
                        Object loadConstant;
                        name2.getClass();
                        str.getClass();
                        MemberSignature.Companion companion2 = MemberSignature.Companion;
                        String asString = name2.asString();
                        asString.getClass();
                        MemberSignature fromFieldNameAndDesc = companion2.fromFieldNameAndDesc(asString, str);
                        if (obj4 != null && (loadConstant = AbstractBinaryClassAnnotationAndConstantLoader.this.loadConstant(str, obj4)) != null) {
                            hashMap2.put(fromFieldNameAndDesc, loadConstant);
                        }
                        return new MemberAnnotationVisitor(this, fromFieldNameAndDesc);
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor
                    public KotlinJvmBinaryClass.MethodAnnotationVisitor visitMethod(Name name2, String str) {
                        name2.getClass();
                        str.getClass();
                        MemberSignature.Companion companion2 = MemberSignature.Companion;
                        String asString = name2.asString();
                        asString.getClass();
                        return new AnnotationVisitorForMethod(this, companion2.fromMethodNameAndDesc(asString, str));
                    }
                }, null);
                return new AnnotationsContainerWithConstants(hashMap, hashMap2, hashMap3);
            case 16:
                obj.getClass();
                ((SmartSet) obj3).add(obj);
                return Unit.INSTANCE;
            case 17:
                ModuleDescriptor moduleDescriptor = (ModuleDescriptor) obj;
                moduleDescriptor.getClass();
                SimpleType primitiveArrayKotlinType = moduleDescriptor.getBuiltIns().getPrimitiveArrayKotlinType((PrimitiveType) obj3);
                primitiveArrayKotlinType.getClass();
                return primitiveArrayKotlinType;
            case 18:
                KotlinType kotlinType = (KotlinType) obj3;
                ((ModuleDescriptor) obj).getClass();
                return kotlinType;
            case 19:
                AbstractDeserializedPackageFragmentProvider abstractDeserializedPackageFragmentProvider = (AbstractDeserializedPackageFragmentProvider) obj3;
                FqName fqName4 = (FqName) obj;
                fqName4.getClass();
                BuiltInsPackageFragmentImpl findPackage = abstractDeserializedPackageFragmentProvider.findPackage(fqName4);
                if (findPackage == null) {
                    return null;
                }
                DeserializationComponents deserializationComponents = abstractDeserializedPackageFragmentProvider.components;
                if (deserializationComponents != null) {
                    findPackage.initialize(deserializationComponents);
                    return findPackage;
                }
                Intrinsics.throwUninitializedPropertyAccessException("components");
                throw null;
            case 20:
                ClassDeserializer classDeserializer = (ClassDeserializer) obj3;
                ClassDeserializer.ClassKey classKey = (ClassDeserializer.ClassKey) obj;
                ClassDeserializer.Companion companion2 = ClassDeserializer.Companion;
                classKey.getClass();
                ClassId classId = classKey.classId;
                DeserializationComponents deserializationComponents2 = classDeserializer.components;
                Iterator<ClassDescriptorFactory> it = deserializationComponents2.getFictitiousClassDescriptorFactories().iterator();
                while (true) {
                    if (it.hasNext()) {
                        deserializedClassDescriptor = it.next().createClass(classId);
                        if (deserializedClassDescriptor != null) {
                        }
                    } else {
                        if (ClassDeserializer.BLACK_LIST.contains(classId)) {
                            return null;
                        }
                        ClassData classData = classKey.classData;
                        if (classData == null && (classData = deserializationComponents2.getClassDataFinder().findClassData(classId)) == null) {
                            return null;
                        }
                        NameResolver component1 = classData.component1();
                        ProtoBuf.Class component2 = classData.component2();
                        BinaryVersion component3 = classData.component3();
                        SourceElement component4 = classData.component4();
                        ClassId outerClassId = classId.getOuterClassId();
                        if (outerClassId != null) {
                            ClassDescriptor deserializeClass$default = ClassDeserializer.deserializeClass$default(classDeserializer, outerClassId, null, 2, null);
                            DeserializedClassDescriptor deserializedClassDescriptor2 = deserializeClass$default instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) deserializeClass$default : null;
                            if (deserializedClassDescriptor2 == null || !deserializedClassDescriptor2.hasNestedClass$deserialization(classId.getShortClassName())) {
                                return null;
                            }
                            createContext = deserializedClassDescriptor2.getC();
                        } else {
                            Iterator<T> it2 = PackageFragmentProviderKt.packageFragments(deserializationComponents2.getPackageFragmentProvider(), classId.getPackageFqName()).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj2 = it2.next();
                                    PackageFragmentDescriptor packageFragmentDescriptor = (PackageFragmentDescriptor) obj2;
                                    if ((packageFragmentDescriptor instanceof DeserializedPackageFragment) && !((DeserializedPackageFragment) packageFragmentDescriptor).hasTopLevelClass(classId.getShortClassName())) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            PackageFragmentDescriptor packageFragmentDescriptor2 = (PackageFragmentDescriptor) obj2;
                            if (packageFragmentDescriptor2 == null) {
                                return null;
                            }
                            DeserializationComponents deserializationComponents3 = classDeserializer.components;
                            ProtoBuf.TypeTable typeTable = component2.getTypeTable();
                            typeTable.getClass();
                            TypeTable typeTable2 = new TypeTable(typeTable);
                            VersionRequirementTable.Companion companion3 = VersionRequirementTable.Companion;
                            ProtoBuf.VersionRequirementTable versionRequirementTable = component2.getVersionRequirementTable();
                            versionRequirementTable.getClass();
                            createContext = deserializationComponents3.createContext(packageFragmentDescriptor2, component1, typeTable2, companion3.create(versionRequirementTable), component3, null);
                            component3 = component3;
                        }
                        deserializedClassDescriptor = new DeserializedClassDescriptor(createContext, component2, component1, component3, component4);
                    }
                }
                return deserializedClassDescriptor;
            case 21:
                ((ClassId) obj).getClass();
                DeserializedContainerSource deserializedContainerSource = ((DeserializedPackageFragmentImpl) obj3).containerSource;
                if (deserializedContainerSource != null) {
                    return deserializedContainerSource;
                }
                SourceElement sourceElement = SourceElement.NO_SOURCE;
                sourceElement.getClass();
                return sourceElement;
            case 22:
                KotlinTypeRefiner kotlinTypeRefiner = (KotlinTypeRefiner) obj;
                kotlinTypeRefiner.getClass();
                return ((IntersectionTypeConstructor) obj3).refine(kotlinTypeRefiner).createType();
            case 23:
                TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = (TypeParameterUpperBoundEraser) obj3;
                TypeParameterUpperBoundEraser.DataToEraseUpperBound dataToEraseUpperBound = (TypeParameterUpperBoundEraser.DataToEraseUpperBound) obj;
                TypeParameterUpperBoundEraser.Companion companion4 = TypeParameterUpperBoundEraser.Companion;
                TypeParameterDescriptor typeParameterDescriptor = dataToEraseUpperBound.typeParameter;
                ErasureTypeAttributes erasureTypeAttributes = dataToEraseUpperBound.typeAttr;
                Set<TypeParameterDescriptor> visitedTypeParameters = erasureTypeAttributes.getVisitedTypeParameters();
                if (visitedTypeParameters != null && visitedTypeParameters.contains(typeParameterDescriptor.getOriginal())) {
                    return typeParameterUpperBoundEraser.getDefaultType(erasureTypeAttributes);
                }
                SimpleType defaultType = typeParameterDescriptor.getDefaultType();
                defaultType.getClass();
                Set<TypeParameterDescriptor> extractTypeParametersFromUpperBounds = TypeUtilsKt.extractTypeParametersFromUpperBounds(defaultType, visitedTypeParameters);
                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(extractTypeParametersFromUpperBounds, 10));
                if (mapCapacity < 16) {
                    mapCapacity = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                for (TypeParameterDescriptor typeParameterDescriptor2 : extractTypeParametersFromUpperBounds) {
                    if (visitedTypeParameters == null || !visitedTypeParameters.contains(typeParameterDescriptor2)) {
                        computeProjection = typeParameterUpperBoundEraser.projectionComputer.computeProjection(typeParameterDescriptor2, erasureTypeAttributes, typeParameterUpperBoundEraser, typeParameterUpperBoundEraser.getErasedUpperBound(typeParameterDescriptor2, erasureTypeAttributes.withNewVisitedTypeParameter(typeParameterDescriptor)));
                    } else {
                        computeProjection = TypeUtils.makeStarProjection(typeParameterDescriptor2, erasureTypeAttributes);
                        computeProjection.getClass();
                    }
                    linkedHashMap.put(typeParameterDescriptor2.getTypeConstructor(), computeProjection);
                }
                TypeSubstitutor create = TypeSubstitutor.create(TypeConstructorSubstitution.Companion.createByConstructorsMap$default(TypeConstructorSubstitution.Companion, linkedHashMap, false, 2, null));
                create.getClass();
                List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
                upperBounds.getClass();
                SetBuilder substituteErasedUpperBounds = typeParameterUpperBoundEraser.substituteErasedUpperBounds(create, upperBounds, erasureTypeAttributes);
                if (substituteErasedUpperBounds.backing.isEmpty()) {
                    return typeParameterUpperBoundEraser.getDefaultType(erasureTypeAttributes);
                }
                if (!typeParameterUpperBoundEraser.options.getIntersectUpperBounds()) {
                    if (substituteErasedUpperBounds.size() == 1) {
                        return (KotlinType) CollectionsKt.single(substituteErasedUpperBounds);
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Should only be one computed upper bound if no need to intersect all bounds");
                    return null;
                }
                List list = CollectionsKt.toList(substituteErasedUpperBounds);
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((KotlinType) it3.next()).unwrap());
                }
                return IntersectionTypeKt.intersectTypes(arrayList);
            default:
                ((String) obj).getClass();
                return Integer.valueOf(((TypeRegistry) obj3).idCounter.getAndIncrement());
        }
    }
}
