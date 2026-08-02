package kotlin.reflect.jvm.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KotlinKProperty;
import kotlin.reflect.jvm.internal.KotlinKPropertyN;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.CompositePackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaRetentionAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JvmPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt$$Lambda$0;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.constants.PrimitiveTypeUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImplKt;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.commonmark.internal.BlockContent;

/* loaded from: classes9.dex */
public final class KotlinKPropertyN$$Lambda$0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final Object arg$0;

    public /* synthetic */ KotlinKPropertyN$$Lambda$0(Object obj, int i) {
        this.$r8$classId = i;
        this.arg$0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BlockContent blockContent;
        String property;
        List list;
        Map mapOf;
        ?? r9;
        int i = this.$r8$classId;
        int i2 = 0;
        Object obj = this.arg$0;
        switch (i) {
            case 0:
                return new KotlinKPropertyN.Getter((KotlinKPropertyN) obj);
            case 1:
                return KotlinKPropertyKt.computeCallerForAccessor((KotlinKProperty.Getter) obj, true);
            case 2:
                ReflectKParameter reflectKParameter = (ReflectKParameter) obj;
                Member member = reflectKParameter.getCallable().getCaller().getMember();
                if (member instanceof Method) {
                    if (!Modifier.isStatic(((Method) member).getModifiers())) {
                        Path$$ExternalSyntheticBUOutline0.m$3(member, "Only static methods are supported for now: ");
                        return null;
                    }
                    blockContent = new BlockContent((Executable) member, reflectKParameter.getIndex(), 1);
                } else {
                    if (!(member instanceof Constructor)) {
                        f$$ExternalSyntheticLambda0.m$1(member, "Unsupported parameter owner: ");
                        return null;
                    }
                    Constructor constructor = (Constructor) member;
                    Class declaringClass = constructor.getDeclaringClass();
                    declaringClass.getClass();
                    if (Reflection.factory.getOrCreateKotlinClass(declaringClass).isInner() && (property = System.getProperty("java.version")) != null && StringsKt__StringsJVMKt.startsWith(property, "1.", false)) {
                        i2 = -1;
                    } else if (constructor.getDeclaringClass().isEnum()) {
                        i2 = (constructor.getParameterAnnotations().length - constructor.getParameterTypes().length) + 2;
                    }
                    blockContent = new BlockContent((Executable) member, reflectKParameter.getIndex() + i2, 1);
                }
                int i3 = blockContent.lineCount;
                Executable executable = (Executable) blockContent.sb;
                if (executable instanceof Method) {
                    Annotation[] annotationArr = ((Method) executable).getParameterAnnotations()[i3];
                    annotationArr.getClass();
                    list = ArraysKt___ArraysKt.toList(annotationArr);
                } else if (executable instanceof Constructor) {
                    Annotation[] annotationArr2 = ((Constructor) executable).getParameterAnnotations()[i3];
                    annotationArr2.getClass();
                    list = ArraysKt___ArraysKt.toList(annotationArr2);
                } else {
                    list = EmptyList.INSTANCE;
                }
                return UtilKt.unwrapKotlinRepeatableAnnotations(list);
            case 3:
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    i2 += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(i2);
            case 4:
                ReflectionTypes.Companion companion = ReflectionTypes.Companion;
                return ((ModuleDescriptor) obj).getPackage(StandardNames.KOTLIN_REFLECT_FQ_NAME).getMemberScope();
            case 5:
                JvmBuiltIns jvmBuiltIns = (JvmBuiltIns) obj;
                Function0 function0 = jvmBuiltIns.settingsComputation;
                if (function0 == null) {
                    a$$ExternalSyntheticBUOutline0.m$1((Object) "JvmBuiltins instance has not been initialized properly");
                    return null;
                }
                JvmBuiltIns.Settings settings = (JvmBuiltIns.Settings) function0.invoke();
                jvmBuiltIns.settingsComputation = null;
                return settings;
            case 6:
                ScopesHolderForClass scopesHolderForClass = (ScopesHolderForClass) obj;
                return (MemberScope) scopesHolderForClass.scopeFactory.invoke(scopesHolderForClass.kotlinTypeRefinerForOwnerModule);
            case 7:
                BuiltInAnnotationDescriptor builtInAnnotationDescriptor = (BuiltInAnnotationDescriptor) obj;
                return builtInAnnotationDescriptor.builtIns.getBuiltInClassByFqName(builtInAnnotationDescriptor.getFqName()).getDefaultType();
            case 8:
                int i4 = AbstractTypeAliasDescriptor.$r8$clinit;
                return ((AbstractTypeAliasDescriptor) obj).getTypeAliasConstructors();
            case 9:
                StringBuilder sb = new StringBuilder("Scope for type parameter ");
                AbstractTypeParameterDescriptor.AnonymousClass2 anonymousClass2 = (AbstractTypeParameterDescriptor.AnonymousClass2) obj;
                sb.append(anonymousClass2.val$name.asString());
                return TypeIntersectionScope.create(sb.toString(), AbstractTypeParameterDescriptor.this.getUpperBounds());
            case 10:
                EnumEntrySyntheticClassDescriptor.EnumEntryScope enumEntryScope = (EnumEntrySyntheticClassDescriptor.EnumEntryScope) obj;
                HashSet hashSet = new HashSet();
                for (Name name : (Set) enumEntryScope.this$0.enumMemberNames.invoke()) {
                    NoLookupLocation noLookupLocation = NoLookupLocation.FOR_NON_TRACKED_SCOPE;
                    hashSet.addAll(enumEntryScope.getContributedFunctions(name, noLookupLocation));
                    hashSet.addAll(enumEntryScope.getContributedVariables(name, noLookupLocation));
                }
                return hashSet;
            case 11:
                ModuleDescriptorImpl moduleDescriptorImpl = (ModuleDescriptorImpl) obj;
                ModuleDependencies moduleDependencies = moduleDescriptorImpl.dependencies;
                if (moduleDependencies == null) {
                    String name2 = moduleDescriptorImpl.getName().toString();
                    name2.getClass();
                    f$$ExternalSyntheticLambda0.m$1("Dependencies of module ", name2, " were not set before querying module content");
                    return null;
                }
                List<ModuleDescriptorImpl> allDependencies = moduleDependencies.getAllDependencies();
                moduleDescriptorImpl.assertValid();
                allDependencies.contains(moduleDescriptorImpl);
                List<ModuleDescriptorImpl> list2 = allDependencies;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((ModuleDescriptorImpl) it.next()).getClass();
                }
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    PackageFragmentProvider packageFragmentProvider = ((ModuleDescriptorImpl) it2.next()).packageFragmentProviderForModuleContent;
                    packageFragmentProvider.getClass();
                    arrayList.add(packageFragmentProvider);
                }
                return new CompositePackageFragmentProvider(arrayList, "CompositeProvider@ModuleDescriptor for " + moduleDescriptorImpl.getName());
            case 12:
                int i5 = ValueParameterDescriptorImpl.WithDestructuringDeclaration.$r8$clinit;
                return ((ValueParameterDescriptorImpl.WithDestructuringDeclaration) obj).getDestructuringVariables();
            case 13:
                Jsr305Settings jsr305Settings = (Jsr305Settings) obj;
                ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                createListBuilder.add(jsr305Settings.globalLevel.getDescription());
                ReportLevel reportLevel = jsr305Settings.migrationLevel;
                if (reportLevel != null) {
                    createListBuilder.add("under-migration:" + reportLevel.getDescription());
                }
                for (Map.Entry entry2 : jsr305Settings.userDefinedLevelForSpecificAnnotation.entrySet()) {
                    createListBuilder.add("@" + entry2.getKey() + ':' + ((ReportLevel) entry2.getValue()).getDescription());
                }
                return (String[]) CollectionsKt__CollectionsJVMKt.build(createListBuilder).toArray(new String[0]);
            case 14:
                KProperty[] kPropertyArr = JavaRetentionAnnotationDescriptor.$$delegatedProperties;
                ConstantValue<?> mapJavaRetentionArgument$descriptors_jvm = JavaAnnotationTargetMapper.INSTANCE.mapJavaRetentionArgument$descriptors_jvm(((JavaRetentionAnnotationDescriptor) obj).firstArgument);
                mapOf = mapJavaRetentionArgument$descriptors_jvm != null ? MapsKt__MapsJVMKt.mapOf(new Pair(JavaAnnotationMapper.INSTANCE.getRETENTION_ANNOTATION_VALUE$descriptors_jvm(), mapJavaRetentionArgument$descriptors_jvm)) : null;
                if (mapOf != null) {
                    return mapOf;
                }
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                return emptyMap;
            case 15:
                KProperty[] kPropertyArr2 = JavaTargetAnnotationDescriptor.$$delegatedProperties;
                JavaAnnotationArgument javaAnnotationArgument = ((JavaTargetAnnotationDescriptor) obj).firstArgument;
                ConstantValue<?> mapJavaTargetArguments$descriptors_jvm = javaAnnotationArgument instanceof JavaArrayAnnotationArgument ? JavaAnnotationTargetMapper.INSTANCE.mapJavaTargetArguments$descriptors_jvm(((JavaArrayAnnotationArgument) javaAnnotationArgument).getElements()) : javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument ? JavaAnnotationTargetMapper.INSTANCE.mapJavaTargetArguments$descriptors_jvm(CollectionsKt__CollectionsJVMKt.listOf(javaAnnotationArgument)) : null;
                mapOf = mapJavaTargetArguments$descriptors_jvm != null ? MapsKt__MapsJVMKt.mapOf(new Pair(JavaAnnotationMapper.INSTANCE.getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm(), mapJavaTargetArguments$descriptors_jvm)) : null;
                if (mapOf != null) {
                    return mapOf;
                }
                EmptyMap emptyMap2 = EmptyMap.INSTANCE;
                emptyMap2.getClass();
                return emptyMap2;
            case 16:
                JvmPackageScope jvmPackageScope = (JvmPackageScope) obj;
                LazyJavaPackageFragment lazyJavaPackageFragment = jvmPackageScope.packageFragment;
                Collection<KotlinJvmBinaryClass> values = lazyJavaPackageFragment.getBinaryClasses$descriptors_jvm().values();
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = values.iterator();
                while (it3.hasNext()) {
                    MemberScope createKotlinPackagePartScope = jvmPackageScope.c.getComponents().getDeserializedDescriptorResolver().createKotlinPackagePartScope(lazyJavaPackageFragment, (KotlinJvmBinaryClass) it3.next());
                    if (createKotlinPackagePartScope != null) {
                        arrayList2.add(createKotlinPackagePartScope);
                    }
                }
                return (MemberScope[]) ScopeUtilsKt.listOfNonEmptyScopes(arrayList2).toArray(new MemberScope[0]);
            case 17:
                int i6 = DescriptorRendererImpl.$r8$clinit;
                DescriptorRenderer withOptions = ((DescriptorRendererImpl) obj).withOptions(RenderingUtilsKt$$Lambda$0.INSTANCE$14);
                withOptions.getClass();
                return (DescriptorRendererImpl) withOptions;
            case 18:
                KotlinType type2 = ((TypeProjection) obj).getType();
                type2.getClass();
                return type2;
            case 19:
                IntegerLiteralTypeConstructor integerLiteralTypeConstructor = (IntegerLiteralTypeConstructor) obj;
                IntegerLiteralTypeConstructor.Companion companion2 = IntegerLiteralTypeConstructor.Companion;
                SimpleType defaultType = integerLiteralTypeConstructor.getBuiltIns().getComparable().getDefaultType();
                defaultType.getClass();
                ArrayList mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(TypeSubstitutionKt.replace$default(defaultType, CollectionsKt__CollectionsJVMKt.listOf(new TypeProjectionImpl(Variance.IN_VARIANCE, integerLiteralTypeConstructor.f1534type)), null, 2, null));
                Collection<KotlinType> allSignedLiteralTypes = PrimitiveTypeUtilKt.getAllSignedLiteralTypes(integerLiteralTypeConstructor.module);
                if (!(allSignedLiteralTypes instanceof Collection) || !allSignedLiteralTypes.isEmpty()) {
                    Iterator it4 = allSignedLiteralTypes.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (integerLiteralTypeConstructor.possibleTypes.contains((KotlinType) it4.next())) {
                                mutableListOf.add(integerLiteralTypeConstructor.getBuiltIns().getNumberType());
                            }
                        }
                    }
                }
                return mutableListOf;
            case 20:
                final GivenFunctionsMemberScope givenFunctionsMemberScope = (GivenFunctionsMemberScope) obj;
                KProperty[] kPropertyArr3 = GivenFunctionsMemberScope.$$delegatedProperties;
                List computeDeclaredFunctions = givenFunctionsMemberScope.computeDeclaredFunctions();
                List list3 = computeDeclaredFunctions;
                final ArrayList arrayList3 = new ArrayList(3);
                Collection<KotlinType> supertypes = givenFunctionsMemberScope.containingClass.getTypeConstructor().getSupertypes();
                supertypes.getClass();
                ArrayList arrayList4 = new ArrayList();
                Iterator it5 = supertypes.iterator();
                while (it5.hasNext()) {
                    CollectionsKt__MutableCollectionsKt.addAll(ResolutionScope.DefaultImpls.getContributedDescriptors$default(((KotlinType) it5.next()).getMemberScope(), null, null, 3, null), arrayList4);
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it6 = arrayList4.iterator();
                while (it6.hasNext()) {
                    Object next = it6.next();
                    if (next instanceof CallableMemberDescriptor) {
                        arrayList5.add(next);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it7 = arrayList5.iterator();
                while (it7.hasNext()) {
                    Object next2 = it7.next();
                    Name name3 = ((CallableMemberDescriptor) next2).getName();
                    Object obj2 = linkedHashMap.get(name3);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(name3, obj2);
                    }
                    ((List) obj2).add(next2);
                }
                for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                    Object key = entry3.getKey();
                    key.getClass();
                    Name name4 = (Name) key;
                    List list4 = (List) entry3.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj3 : list4) {
                        Boolean valueOf = Boolean.valueOf(((CallableMemberDescriptor) obj3) instanceof FunctionDescriptor);
                        Object obj4 = linkedHashMap2.get(valueOf);
                        if (obj4 == null) {
                            obj4 = new ArrayList();
                            linkedHashMap2.put(valueOf, obj4);
                        }
                        ((List) obj4).add(obj3);
                    }
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        boolean booleanValue = ((Boolean) entry4.getKey()).booleanValue();
                        List list5 = (List) entry4.getValue();
                        OverridingUtil overridingUtil = OverridingUtil.DEFAULT;
                        List list6 = list5;
                        if (booleanValue) {
                            r9 = new ArrayList();
                            for (Object obj5 : computeDeclaredFunctions) {
                                if (Intrinsics.areEqual(((FunctionDescriptor) obj5).getName(), name4)) {
                                    r9.add(obj5);
                                }
                            }
                        } else {
                            r9 = EmptyList.INSTANCE;
                        }
                        overridingUtil.generateOverridesInFunctionGroup(name4, list6, (Collection) r9, givenFunctionsMemberScope.containingClass, new NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope$createFakeOverrides$4
                            @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
                            public void addFakeOverride(CallableMemberDescriptor callableMemberDescriptor) {
                                callableMemberDescriptor.getClass();
                                OverridingUtil.resolveUnknownVisibilityForMember(callableMemberDescriptor, null);
                                arrayList3.add(callableMemberDescriptor);
                            }

                            @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
                            public final void conflict(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
                                callableMemberDescriptor.getClass();
                                callableMemberDescriptor2.getClass();
                                throw new IllegalStateException(("Conflict in scope of " + givenFunctionsMemberScope.containingClass + ": " + callableMemberDescriptor + " vs " + callableMemberDescriptor2).toString());
                            }
                        });
                    }
                }
                return CollectionsKt.plus((Iterable) kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList3), (Collection) list3);
            case 21:
                return ((TypeSubstitutor) obj).getSubstitution().buildSubstitutor();
            case 22:
                SubstitutingScope substitutingScope = (SubstitutingScope) obj;
                return substitutingScope.substitute(ResolutionScope.DefaultImpls.getContributedDescriptors$default(substitutingScope.workerScope, null, null, 3, null));
            case 23:
                Collection<ClassId> allClassIds = ((DeserializedPackageFragmentImpl) obj).getClassDataFinder().getAllClassIds();
                ArrayList arrayList6 = new ArrayList();
                for (Object obj6 : allClassIds) {
                    ClassId classId = (ClassId) obj6;
                    if (!classId.isNestedClass() && !ClassDeserializer.Companion.getBLACK_LIST().contains(classId)) {
                        arrayList6.add(obj6);
                    }
                }
                ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList6, 10));
                Iterator it8 = arrayList6.iterator();
                while (it8.hasNext()) {
                    arrayList7.add(((ClassId) it8.next()).getShortClassName());
                }
                return arrayList7;
            case 24:
                HashSet hashSet2 = new HashSet();
                DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
                Iterator<KotlinType> it9 = deserializedClassDescriptor.getTypeConstructor().getSupertypes().iterator();
                while (it9.hasNext()) {
                    for (DeclarationDescriptor declarationDescriptor : ResolutionScope.DefaultImpls.getContributedDescriptors$default(it9.next().getMemberScope(), null, null, 3, null)) {
                        if ((declarationDescriptor instanceof SimpleFunctionDescriptor) || (declarationDescriptor instanceof PropertyDescriptor)) {
                            hashSet2.add(((CallableMemberDescriptor) declarationDescriptor).getName());
                        }
                    }
                }
                List<ProtoBuf.Function> functionList = deserializedClassDescriptor.getClassProto().getFunctionList();
                functionList.getClass();
                Iterator it10 = functionList.iterator();
                while (it10.hasNext()) {
                    hashSet2.add(NameResolverUtilKt.getName(deserializedClassDescriptor.getC().getNameResolver(), ((ProtoBuf.Function) it10.next()).getName()));
                }
                List<ProtoBuf.Property> propertyList = deserializedClassDescriptor.getClassProto().getPropertyList();
                propertyList.getClass();
                Iterator it11 = propertyList.iterator();
                while (it11.hasNext()) {
                    hashSet2.add(NameResolverUtilKt.getName(deserializedClassDescriptor.getC().getNameResolver(), ((ProtoBuf.Property) it11.next()).getName()));
                }
                return SetsKt___SetsKt.plus((Set) hashSet2, (Iterable) hashSet2);
            case 25:
                DeserializedMemberScope deserializedMemberScope = (DeserializedMemberScope) obj;
                KProperty[] kPropertyArr4 = DeserializedMemberScope.$$delegatedProperties;
                Set nonDeclaredClassifierNames = deserializedMemberScope.getNonDeclaredClassifierNames();
                if (nonDeclaredClassifierNames == null) {
                    return null;
                }
                return SetsKt___SetsKt.plus((Set) SetsKt___SetsKt.plus((Set) deserializedMemberScope.getClassNames$deserialization(), (Iterable) deserializedMemberScope.impl.getTypeAliasNames()), (Iterable) nonDeclaredClassifierNames);
            case 26:
                DeserializedTypeParameterDescriptor deserializedTypeParameterDescriptor = (DeserializedTypeParameterDescriptor) obj;
                DeserializationContext deserializationContext = deserializedTypeParameterDescriptor.c;
                return CollectionsKt.toList(deserializationContext.getComponents().getAnnotationAndConstantLoader().loadTypeParameterAnnotations(deserializedTypeParameterDescriptor.proto, deserializationContext.getNameResolver()));
            case 27:
                return new AbstractTypeConstructor.Supertypes(((AbstractTypeConstructor) obj).computeSupertypes());
            case 28:
                return StarProjectionImplKt.starProjectionType(((StarProjectionImpl) obj).typeParameter);
            default:
                TypeParameterUpperBoundEraser.Companion companion3 = TypeParameterUpperBoundEraser.Companion;
                return ErrorUtils.createErrorType(ErrorTypeKind.CANNOT_COMPUTE_ERASED_BOUND, ((TypeParameterUpperBoundEraser) obj).toString());
        }
    }
}
