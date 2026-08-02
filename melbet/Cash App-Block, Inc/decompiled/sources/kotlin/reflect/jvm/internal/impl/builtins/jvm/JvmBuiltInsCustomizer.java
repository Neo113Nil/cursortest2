package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.knotapi.knot.utilities.PreferenceManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$22;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModalityUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilterKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import net.idrnd.face.iad.capture.internal.o0;

/* loaded from: classes9.dex */
public final class JvmBuiltInsCustomizer implements AdditionalClassPartsProvider, PlatformDependentDeclarationFilter {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(JvmBuiltInsCustomizer.class, PreferenceManager.PREF_SETTINGS, "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0), new PropertyReference1Impl(JvmBuiltInsCustomizer.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0), new PropertyReference1Impl(JvmBuiltInsCustomizer.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0)};
    public final NotNullLazyValue cloneableType$delegate;
    public final MemoizedFunctionToNotNull deprecationForSomeOfTheListMethods;
    public final JavaToKotlinClassMapper j2kClassMapper;
    public final CacheWithNotNullValues javaAnalogueClassesWithCustomSupertypeCache;
    public final SimpleType mockSerializableType;
    public final ModuleDescriptor moduleDescriptor;
    public final NotNullLazyValue notConsideredDeprecation$delegate;
    public final NotNullLazyValue settings$delegate;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class JDKMemberStatus {
        public static final /* synthetic */ JDKMemberStatus[] $VALUES;
        public static final JDKMemberStatus DEPRECATED_LIST_METHODS;
        public static final JDKMemberStatus DROP;
        public static final JDKMemberStatus HIDDEN;
        public static final JDKMemberStatus NOT_CONSIDERED;
        public static final JDKMemberStatus VISIBLE;

        static {
            JDKMemberStatus jDKMemberStatus = new JDKMemberStatus("HIDDEN", 0);
            HIDDEN = jDKMemberStatus;
            JDKMemberStatus jDKMemberStatus2 = new JDKMemberStatus("VISIBLE", 1);
            VISIBLE = jDKMemberStatus2;
            JDKMemberStatus jDKMemberStatus3 = new JDKMemberStatus("DEPRECATED_LIST_METHODS", 2);
            DEPRECATED_LIST_METHODS = jDKMemberStatus3;
            JDKMemberStatus jDKMemberStatus4 = new JDKMemberStatus("NOT_CONSIDERED", 3);
            NOT_CONSIDERED = jDKMemberStatus4;
            JDKMemberStatus jDKMemberStatus5 = new JDKMemberStatus("DROP", 4);
            DROP = jDKMemberStatus5;
            $VALUES = new JDKMemberStatus[]{jDKMemberStatus, jDKMemberStatus2, jDKMemberStatus3, jDKMemberStatus4, jDKMemberStatus5};
        }

        public static JDKMemberStatus valueOf(String str) {
            return (JDKMemberStatus) Enum.valueOf(JDKMemberStatus.class, str);
        }

        public static JDKMemberStatus[] values() {
            return (JDKMemberStatus[]) $VALUES.clone();
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JDKMemberStatus.values().length];
            try {
                JDKMemberStatus jDKMemberStatus = JDKMemberStatus.HIDDEN;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                JDKMemberStatus jDKMemberStatus2 = JDKMemberStatus.HIDDEN;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                JDKMemberStatus jDKMemberStatus3 = JDKMemberStatus.HIDDEN;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                JDKMemberStatus jDKMemberStatus4 = JDKMemberStatus.HIDDEN;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                JDKMemberStatus jDKMemberStatus5 = JDKMemberStatus.HIDDEN;
                iArr[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public JvmBuiltInsCustomizer(ModuleDescriptor moduleDescriptor, StorageManager storageManager, Function0<JvmBuiltIns.Settings> function0) {
        moduleDescriptor.getClass();
        storageManager.getClass();
        function0.getClass();
        this.moduleDescriptor = moduleDescriptor;
        this.j2kClassMapper = JavaToKotlinClassMapper.INSTANCE;
        this.settings$delegate = storageManager.createLazyValue(function0);
        final int i = 1;
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(new JvmBuiltInsCustomizer$createMockJavaIoSerializableType$mockJavaIoPackageFragment$1(moduleDescriptor, new FqName("java.io")), Name.identifier("Serializable"), Modality.ABSTRACT, ClassKind.INTERFACE, CollectionsKt__CollectionsJVMKt.listOf(new LazyWrappedType(storageManager, new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$$Lambda$1
            public final JvmBuiltInsCustomizer arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JvmBuiltInsCustomizer jvmBuiltInsCustomizer = this.arg$0;
                switch (i2) {
                    case 0:
                        return Annotations.Companion.create(CollectionsKt__CollectionsJVMKt.listOf(AnnotationUtilKt.createDeprecatedAnnotation$default(jvmBuiltInsCustomizer.moduleDescriptor.getBuiltIns(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, true, 6, null)));
                    default:
                        SimpleType anyType = jvmBuiltInsCustomizer.moduleDescriptor.getBuiltIns().getAnyType();
                        anyType.getClass();
                        return anyType;
                }
            }
        })), SourceElement.NO_SOURCE, false, storageManager);
        classDescriptorImpl.initialize(MemberScope.Empty.INSTANCE, EmptySet.INSTANCE, null);
        SimpleType defaultType = classDescriptorImpl.getDefaultType();
        defaultType.getClass();
        this.mockSerializableType = defaultType;
        this.cloneableType$delegate = storageManager.createLazyValue(new KClassImpl$Data$$Lambda$22(16, this, storageManager));
        this.javaAnalogueClassesWithCustomSupertypeCache = storageManager.createCacheWithNotNullValues();
        final int i2 = 0;
        this.notConsideredDeprecation$delegate = storageManager.createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$$Lambda$1
            public final JvmBuiltInsCustomizer arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JvmBuiltInsCustomizer jvmBuiltInsCustomizer = this.arg$0;
                switch (i22) {
                    case 0:
                        return Annotations.Companion.create(CollectionsKt__CollectionsJVMKt.listOf(AnnotationUtilKt.createDeprecatedAnnotation$default(jvmBuiltInsCustomizer.moduleDescriptor.getBuiltIns(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, true, 6, null)));
                    default:
                        SimpleType anyType = jvmBuiltInsCustomizer.moduleDescriptor.getBuiltIns().getAnyType();
                        anyType.getClass();
                        return anyType;
                }
            }
        });
        this.deprecationForSomeOfTheListMethods = storageManager.createMemoizedFunction(new JvmBuiltInsCustomizer$$Lambda$2(this, i2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public Collection<ClassConstructorDescriptor> getConstructors(ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        if (classDescriptor.getKind() != ClassKind.CLASS || !getSettings().isAdditionalBuiltInsFeatureSupported()) {
            return EmptyList.INSTANCE;
        }
        LazyJavaClassDescriptor javaAnalogue = getJavaAnalogue(classDescriptor);
        if (javaAnalogue == null) {
            return EmptyList.INSTANCE;
        }
        ClassDescriptor mapJavaToKotlin$default = JavaToKotlinClassMapper.mapJavaToKotlin$default(this.j2kClassMapper, DescriptorUtilsKt.getFqNameSafe(javaAnalogue), FallbackBuiltIns.Companion.getInstance(), null, 4, null);
        if (mapJavaToKotlin$default == null) {
            return EmptyList.INSTANCE;
        }
        TypeSubstitutor buildSubstitutor = MappingUtilKt.createMappedTypeParametersSubstitution(mapJavaToKotlin$default, javaAnalogue).buildSubstitutor();
        List<ClassConstructorDescriptor> constructors = javaAnalogue.getConstructors();
        ArrayList arrayList = new ArrayList();
        for (Object obj : constructors) {
            ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) obj;
            if (classConstructorDescriptor.getVisibility().isPublicAPI()) {
                Collection<ClassConstructorDescriptor> constructors2 = mapJavaToKotlin$default.getConstructors();
                constructors2.getClass();
                Collection<ClassConstructorDescriptor> collection = constructors2;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    for (ClassConstructorDescriptor classConstructorDescriptor2 : collection) {
                        classConstructorDescriptor2.getClass();
                        if (OverridingUtil.getBothWaysOverridability(classConstructorDescriptor2, classConstructorDescriptor.substitute(buildSubstitutor)) == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                            break;
                        }
                    }
                }
                if (classConstructorDescriptor.getValueParameters().size() == 1) {
                    List<ValueParameterDescriptor> valueParameters = classConstructorDescriptor.getValueParameters();
                    valueParameters.getClass();
                    ClassifierDescriptor mo4153getDeclarationDescriptor = ((ValueParameterDescriptor) CollectionsKt.single((List) valueParameters)).getType().getConstructor().mo4153getDeclarationDescriptor();
                    if (Intrinsics.areEqual(mo4153getDeclarationDescriptor != null ? DescriptorUtilsKt.getFqNameUnsafe(mo4153getDeclarationDescriptor) : null, DescriptorUtilsKt.getFqNameUnsafe(classDescriptor))) {
                    }
                }
                if (!KotlinBuiltIns.isDeprecated(classConstructorDescriptor) && !JvmBuiltInsSignatures.INSTANCE.getHIDDEN_CONSTRUCTOR_SIGNATURES().contains(MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, javaAnalogue, MethodSignatureMappingKt.computeJvmDescriptor$default(classConstructorDescriptor, false, false, 3, null)))) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ClassConstructorDescriptor classConstructorDescriptor3 = (ClassConstructorDescriptor) it.next();
            FunctionDescriptor.CopyBuilder<? extends FunctionDescriptor> newCopyBuilder = classConstructorDescriptor3.newCopyBuilder();
            newCopyBuilder.setOwner(classDescriptor);
            newCopyBuilder.setReturnType(classDescriptor.getDefaultType());
            newCopyBuilder.setPreserveSourceElement();
            newCopyBuilder.setSubstitution(buildSubstitutor.getSubstitution());
            if (!JvmBuiltInsSignatures.INSTANCE.getVISIBLE_CONSTRUCTOR_SIGNATURES().contains(MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, javaAnalogue, MethodSignatureMappingKt.computeJvmDescriptor$default(classConstructorDescriptor3, false, false, 3, null)))) {
                newCopyBuilder.setAdditionalAnnotations((Annotations) StorageKt.getValue(this.notConsideredDeprecation$delegate, this, $$delegatedProperties[2]));
            }
            FunctionDescriptor build = newCopyBuilder.build();
            build.getClass();
            arrayList2.add((ClassConstructorDescriptor) build);
        }
        return arrayList2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public Collection<SimpleFunctionDescriptor> getFunctions(Name name, ClassDescriptor classDescriptor) {
        Iterable<SimpleFunctionDescriptor> iterable;
        boolean booleanValue;
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        Name name2;
        Name name3;
        Annotations annotations;
        name.getClass();
        classDescriptor.getClass();
        boolean equals = name.equals(CloneableClassScope.Companion.getCLONE_NAME());
        KProperty[] kPropertyArr = $$delegatedProperties;
        int i = 1;
        if (equals && (classDescriptor instanceof DeserializedClassDescriptor) && KotlinBuiltIns.isArrayOrPrimitiveArray(classDescriptor)) {
            DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) classDescriptor;
            List<ProtoBuf.Function> functionList = deserializedClassDescriptor.getClassProto().getFunctionList();
            functionList.getClass();
            List<ProtoBuf.Function> list = functionList;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(NameResolverUtilKt.getName(deserializedClassDescriptor.getC().getNameResolver(), ((ProtoBuf.Function) it.next()).getName()), CloneableClassScope.Companion.getCLONE_NAME())) {
                        return EmptyList.INSTANCE;
                    }
                }
            }
            FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> newCopyBuilder = ((SimpleFunctionDescriptor) CollectionsKt.single(((SimpleType) StorageKt.getValue(this.cloneableType$delegate, this, kPropertyArr[1])).getMemberScope().getContributedFunctions(name, NoLookupLocation.FROM_BUILTINS))).newCopyBuilder();
            newCopyBuilder.setOwner(deserializedClassDescriptor);
            newCopyBuilder.setVisibility(DescriptorVisibilities.PUBLIC);
            newCopyBuilder.setReturnType(deserializedClassDescriptor.getDefaultType());
            newCopyBuilder.setDispatchReceiverParameter(deserializedClassDescriptor.getThisAsReceiverParameter());
            SimpleFunctionDescriptor build = newCopyBuilder.build();
            build.getClass();
            return CollectionsKt__CollectionsJVMKt.listOf(build);
        }
        if (!getSettings().isAdditionalBuiltInsFeatureSupported()) {
            return EmptyList.INSTANCE;
        }
        LazyJavaClassDescriptor javaAnalogue = getJavaAnalogue(classDescriptor);
        boolean z = false;
        if (javaAnalogue == null) {
            iterable = EmptyList.INSTANCE;
        } else {
            FqName fqNameSafe = DescriptorUtilsKt.getFqNameSafe(javaAnalogue);
            KotlinBuiltIns companion = FallbackBuiltIns.Companion.getInstance();
            JavaToKotlinClassMapper javaToKotlinClassMapper = this.j2kClassMapper;
            Collection<ClassDescriptor> mapPlatformClass = javaToKotlinClassMapper.mapPlatformClass(fqNameSafe, companion);
            ClassDescriptor classDescriptor2 = (ClassDescriptor) CollectionsKt.lastOrNull(mapPlatformClass);
            if (classDescriptor2 == null) {
                iterable = EmptyList.INSTANCE;
            } else {
                SmartSet.Companion companion2 = SmartSet.Companion;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(mapPlatformClass, 10));
                Iterator<T> it2 = mapPlatformClass.iterator();
                while (it2.hasNext()) {
                    arrayList.add(DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) it2.next()));
                }
                SmartSet create = companion2.create(arrayList);
                boolean isMutable = javaToKotlinClassMapper.isMutable(classDescriptor);
                MemberScope unsubstitutedMemberScope = ((ClassDescriptor) this.javaAnalogueClassesWithCustomSupertypeCache.computeIfAbsent(DescriptorUtilsKt.getFqNameSafe(javaAnalogue), new KClassImpl$Data$$Lambda$22(17, javaAnalogue, classDescriptor2))).getUnsubstitutedMemberScope();
                unsubstitutedMemberScope.getClass();
                Collection<? extends SimpleFunctionDescriptor> contributedFunctions = unsubstitutedMemberScope.getContributedFunctions(name, NoLookupLocation.FROM_BUILTINS);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : contributedFunctions) {
                    SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) obj;
                    if (simpleFunctionDescriptor2.getKind() == CallableMemberDescriptor.Kind.DECLARATION && simpleFunctionDescriptor2.getVisibility().isPublicAPI() && !KotlinBuiltIns.isDeprecated(simpleFunctionDescriptor2)) {
                        Collection<? extends FunctionDescriptor> overriddenDescriptors = simpleFunctionDescriptor2.getOverriddenDescriptors();
                        overriddenDescriptors.getClass();
                        Collection<? extends FunctionDescriptor> collection = overriddenDescriptors;
                        if (!(collection instanceof Collection) || !collection.isEmpty()) {
                            Iterator<T> it3 = collection.iterator();
                            while (it3.hasNext()) {
                                DeclarationDescriptor containingDeclaration = ((FunctionDescriptor) it3.next()).getContainingDeclaration();
                                containingDeclaration.getClass();
                                if (create.contains(DescriptorUtilsKt.getFqNameSafe(containingDeclaration))) {
                                    break;
                                }
                            }
                        }
                        DeclarationDescriptor containingDeclaration2 = simpleFunctionDescriptor2.getContainingDeclaration();
                        containingDeclaration2.getClass();
                        if (JvmBuiltInsSignatures.INSTANCE.getMUTABLE_METHOD_SIGNATURES().contains(MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, (ClassDescriptor) containingDeclaration2, MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor2, z, z, 3, null))) ^ isMutable) {
                            booleanValue = true;
                        } else {
                            Boolean ifAny = DFS.ifAny(CollectionsKt__CollectionsJVMKt.listOf(simpleFunctionDescriptor2), JvmBuiltInsCustomizer$$Lambda$6.INSTANCE, new JvmBuiltInsCustomizer$$Lambda$2(this, i));
                            ifAny.getClass();
                            booleanValue = ifAny.booleanValue();
                        }
                        if (!booleanValue) {
                            arrayList2.add(obj);
                        }
                    }
                    z = false;
                }
                iterable = arrayList2;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (SimpleFunctionDescriptor simpleFunctionDescriptor3 : iterable) {
            DeclarationDescriptor containingDeclaration3 = simpleFunctionDescriptor3.getContainingDeclaration();
            containingDeclaration3.getClass();
            FunctionDescriptor substitute = simpleFunctionDescriptor3.substitute(MappingUtilKt.createMappedTypeParametersSubstitution((ClassDescriptor) containingDeclaration3, classDescriptor).buildSubstitutor());
            substitute.getClass();
            FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> newCopyBuilder2 = ((SimpleFunctionDescriptor) substitute).newCopyBuilder();
            newCopyBuilder2.setOwner(classDescriptor);
            newCopyBuilder2.setDispatchReceiverParameter(classDescriptor.getThisAsReceiverParameter());
            newCopyBuilder2.setPreserveSourceElement();
            DeclarationDescriptor containingDeclaration4 = simpleFunctionDescriptor3.getContainingDeclaration();
            containingDeclaration4.getClass();
            final String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor3, false, false, 3, null);
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Object dfs = DFS.dfs(CollectionsKt__CollectionsJVMKt.listOf((ClassDescriptor) containingDeclaration4), new o0(this, 18), new DFS.AbstractNodeHandler<ClassDescriptor, JDKMemberStatus>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getJdkMethodStatus$2
                @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
                public boolean beforeChildren(ClassDescriptor classDescriptor3) {
                    classDescriptor3.getClass();
                    String signature = MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, classDescriptor3, computeJvmDescriptor$default);
                    JvmBuiltInsSignatures jvmBuiltInsSignatures = JvmBuiltInsSignatures.INSTANCE;
                    boolean contains = jvmBuiltInsSignatures.getHIDDEN_METHOD_SIGNATURES().contains(signature);
                    Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                    if (contains) {
                        ref$ObjectRef2.element = JvmBuiltInsCustomizer.JDKMemberStatus.HIDDEN;
                    } else if (jvmBuiltInsSignatures.getVISIBLE_METHOD_SIGNATURES().contains(signature)) {
                        ref$ObjectRef2.element = JvmBuiltInsCustomizer.JDKMemberStatus.VISIBLE;
                    } else if (jvmBuiltInsSignatures.getDEPRECATED_LIST_METHODS().contains(signature)) {
                        ref$ObjectRef2.element = JvmBuiltInsCustomizer.JDKMemberStatus.DEPRECATED_LIST_METHODS;
                    } else if (jvmBuiltInsSignatures.getDROP_LIST_METHOD_SIGNATURES().contains(signature)) {
                        ref$ObjectRef2.element = JvmBuiltInsCustomizer.JDKMemberStatus.DROP;
                    }
                    return ref$ObjectRef2.element == null;
                }

                @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
                public JvmBuiltInsCustomizer.JDKMemberStatus result() {
                    JvmBuiltInsCustomizer.JDKMemberStatus jDKMemberStatus = (JvmBuiltInsCustomizer.JDKMemberStatus) ref$ObjectRef.element;
                    return jDKMemberStatus == null ? JvmBuiltInsCustomizer.JDKMemberStatus.NOT_CONSIDERED : jDKMemberStatus;
                }
            });
            dfs.getClass();
            int ordinal = ((JDKMemberStatus) dfs).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        Name name4 = simpleFunctionDescriptor3.getName();
                        name2 = JvmBuiltInsCustomizerKt.GET_FIRST_LIST_NAME;
                        boolean areEqual = Intrinsics.areEqual(name4, name2);
                        MemoizedFunctionToNotNull memoizedFunctionToNotNull = this.deprecationForSomeOfTheListMethods;
                        if (areEqual) {
                            annotations = (Annotations) memoizedFunctionToNotNull.invoke(new Pair(simpleFunctionDescriptor3.getName().asString(), "first"));
                        } else {
                            name3 = JvmBuiltInsCustomizerKt.GET_LAST_LIST_NAME;
                            if (!Intrinsics.areEqual(name4, name3)) {
                                a$$ExternalSyntheticBUOutline0.m(simpleFunctionDescriptor3.getName(), "Unexpected name: ");
                                return null;
                            }
                            annotations = (Annotations) memoizedFunctionToNotNull.invoke(new Pair(simpleFunctionDescriptor3.getName().asString(), "last"));
                        }
                        newCopyBuilder2.setAdditionalAnnotations(annotations);
                    } else if (ordinal != 3) {
                        if (ordinal != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        simpleFunctionDescriptor = null;
                    } else {
                        newCopyBuilder2.setAdditionalAnnotations((Annotations) StorageKt.getValue(this.notConsideredDeprecation$delegate, this, kPropertyArr[2]));
                    }
                }
                SimpleFunctionDescriptor build2 = newCopyBuilder2.build();
                build2.getClass();
                simpleFunctionDescriptor = build2;
            } else {
                if (!ModalityUtilsKt.isFinalClass(classDescriptor)) {
                    newCopyBuilder2.setHiddenForResolutionEverywhereBesideSupercalls();
                    SimpleFunctionDescriptor build22 = newCopyBuilder2.build();
                    build22.getClass();
                    simpleFunctionDescriptor = build22;
                }
                simpleFunctionDescriptor = null;
            }
            if (simpleFunctionDescriptor != null) {
                arrayList3.add(simpleFunctionDescriptor);
            }
        }
        return arrayList3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public Set<Name> getFunctionsNames(ClassDescriptor classDescriptor) {
        LazyJavaClassMemberScope unsubstitutedMemberScope;
        Set<Name> functionNames;
        classDescriptor.getClass();
        if (!getSettings().isAdditionalBuiltInsFeatureSupported()) {
            return EmptySet.INSTANCE;
        }
        LazyJavaClassDescriptor javaAnalogue = getJavaAnalogue(classDescriptor);
        return (javaAnalogue == null || (unsubstitutedMemberScope = javaAnalogue.getUnsubstitutedMemberScope()) == null || (functionNames = unsubstitutedMemberScope.getFunctionNames()) == null) ? EmptySet.INSTANCE : functionNames;
    }

    public final LazyJavaClassDescriptor getJavaAnalogue(ClassDescriptor classDescriptor) {
        ClassId mapKotlinToJava;
        FqName asSingleFqName;
        if (KotlinBuiltIns.isAny(classDescriptor) || !KotlinBuiltIns.isUnderKotlinPackage(classDescriptor)) {
            return null;
        }
        FqNameUnsafe fqNameUnsafe = DescriptorUtilsKt.getFqNameUnsafe(classDescriptor);
        if (fqNameUnsafe.isSafe() && (mapKotlinToJava = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(fqNameUnsafe)) != null && (asSingleFqName = mapKotlinToJava.asSingleFqName()) != null) {
            ClassDescriptor resolveClassByFqName = DescriptorUtilKt.resolveClassByFqName(getSettings().getOwnerModuleDescriptor(), asSingleFqName, NoLookupLocation.FROM_BUILTINS);
            if (resolveClassByFqName instanceof LazyJavaClassDescriptor) {
                return (LazyJavaClassDescriptor) resolveClassByFqName;
            }
        }
        return null;
    }

    public final JvmBuiltIns.Settings getSettings() {
        return (JvmBuiltIns.Settings) StorageKt.getValue(this.settings$delegate, this, $$delegatedProperties[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public Collection<KotlinType> getSupertypes(ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        FqNameUnsafe fqNameUnsafe = DescriptorUtilsKt.getFqNameUnsafe(classDescriptor);
        JvmBuiltInsSignatures jvmBuiltInsSignatures = JvmBuiltInsSignatures.INSTANCE;
        boolean isArrayOrPrimitiveArray = jvmBuiltInsSignatures.isArrayOrPrimitiveArray(fqNameUnsafe);
        SimpleType simpleType = this.mockSerializableType;
        return isArrayOrPrimitiveArray ? CollectionsKt__CollectionsKt.listOf((Object[]) new KotlinType[]{(SimpleType) StorageKt.getValue(this.cloneableType$delegate, this, $$delegatedProperties[1]), simpleType}) : jvmBuiltInsSignatures.isSerializableInJava(fqNameUnsafe) ? CollectionsKt__CollectionsJVMKt.listOf(simpleType) : EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
    public boolean isFunctionAvailable(ClassDescriptor classDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor) {
        classDescriptor.getClass();
        simpleFunctionDescriptor.getClass();
        LazyJavaClassDescriptor javaAnalogue = getJavaAnalogue(classDescriptor);
        if (javaAnalogue == null || !simpleFunctionDescriptor.getAnnotations().hasAnnotation(PlatformDependentDeclarationFilterKt.getPLATFORM_DEPENDENT_ANNOTATION_FQ_NAME())) {
            return true;
        }
        if (getSettings().isAdditionalBuiltInsFeatureSupported()) {
            String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor, false, false, 3, null);
            LazyJavaClassMemberScope unsubstitutedMemberScope = javaAnalogue.getUnsubstitutedMemberScope();
            Name name = simpleFunctionDescriptor.getName();
            name.getClass();
            Collection<SimpleFunctionDescriptor> contributedFunctions = unsubstitutedMemberScope.getContributedFunctions(name, NoLookupLocation.FROM_BUILTINS);
            if (!(contributedFunctions instanceof Collection) || !contributedFunctions.isEmpty()) {
                Iterator<T> it = contributedFunctions.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(MethodSignatureMappingKt.computeJvmDescriptor$default((SimpleFunctionDescriptor) it.next(), false, false, 3, null), computeJvmDescriptor$default)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
