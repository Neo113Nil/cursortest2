package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* loaded from: classes9.dex */
public abstract class LazyJavaScope extends MemberScopeImpl {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(LazyJavaScope.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0), new PropertyReference1Impl(LazyJavaScope.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0), new PropertyReference1Impl(LazyJavaScope.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0)};
    public final NotNullLazyValue allDescriptors;
    public final LazyJavaResolverContext c;
    public final NotNullLazyValue classNamesLazy$delegate;
    public final MemoizedFunctionToNullable declaredField;
    public final MemoizedFunctionToNotNull declaredFunctions;
    public final NotNullLazyValue declaredMemberIndex;
    public final NotNullLazyValue functionNamesLazy$delegate;
    public final MemoizedFunctionToNotNull functions;
    public final LazyJavaScope mainScope;
    public final MemoizedFunctionToNotNull properties;
    public final NotNullLazyValue propertyNamesLazy$delegate;

    public static final class MethodSignatureData {
        public final List errors;
        public final boolean hasStableParameterNames;
        public final KotlinType receiverType;
        public final KotlinType returnType;
        public final List typeParameters;
        public final List valueParameters;

        public MethodSignatureData(KotlinType kotlinType, KotlinType kotlinType2, List<? extends ValueParameterDescriptor> list, List<? extends TypeParameterDescriptor> list2, boolean z, List<String> list3) {
            kotlinType.getClass();
            list.getClass();
            list2.getClass();
            list3.getClass();
            this.returnType = kotlinType;
            this.receiverType = kotlinType2;
            this.valueParameters = list;
            this.typeParameters = list2;
            this.hasStableParameterNames = z;
            this.errors = list3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodSignatureData)) {
                return false;
            }
            MethodSignatureData methodSignatureData = (MethodSignatureData) obj;
            return Intrinsics.areEqual(this.returnType, methodSignatureData.returnType) && Intrinsics.areEqual(this.receiverType, methodSignatureData.receiverType) && Intrinsics.areEqual(this.valueParameters, methodSignatureData.valueParameters) && Intrinsics.areEqual(this.typeParameters, methodSignatureData.typeParameters) && this.hasStableParameterNames == methodSignatureData.hasStableParameterNames && Intrinsics.areEqual(this.errors, methodSignatureData.errors);
        }

        public final List<String> getErrors() {
            return this.errors;
        }

        public final boolean getHasStableParameterNames() {
            return this.hasStableParameterNames;
        }

        public final KotlinType getReceiverType() {
            return this.receiverType;
        }

        public final KotlinType getReturnType() {
            return this.returnType;
        }

        public final List<TypeParameterDescriptor> getTypeParameters() {
            return this.typeParameters;
        }

        public final List<ValueParameterDescriptor> getValueParameters() {
            return this.valueParameters;
        }

        public int hashCode() {
            int hashCode = this.returnType.hashCode() * 31;
            KotlinType kotlinType = this.receiverType;
            return this.errors.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (kotlinType == null ? 0 : kotlinType.hashCode())) * 31, 31, this.valueParameters), 31, this.typeParameters), 31, this.hasStableParameterNames);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MethodSignatureData(returnType=");
            sb.append(this.returnType);
            sb.append(", receiverType=");
            sb.append(this.receiverType);
            sb.append(", valueParameters=");
            sb.append(this.valueParameters);
            sb.append(", typeParameters=");
            sb.append(this.typeParameters);
            sb.append(", hasStableParameterNames=");
            sb.append(this.hasStableParameterNames);
            sb.append(", errors=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.errors, ')');
        }
    }

    public static final class ResolvedValueParameters {
        public final List descriptors;
        public final boolean hasSynthesizedNames;

        public ResolvedValueParameters(List<? extends ValueParameterDescriptor> list, boolean z) {
            list.getClass();
            this.descriptors = list;
            this.hasSynthesizedNames = z;
        }

        public final List<ValueParameterDescriptor> getDescriptors() {
            return this.descriptors;
        }

        public final boolean getHasSynthesizedNames() {
            return this.hasSynthesizedNames;
        }
    }

    public LazyJavaScope(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaScope lazyJavaScope) {
        lazyJavaResolverContext.getClass();
        this.c = lazyJavaResolverContext;
        this.mainScope = lazyJavaScope;
        final int i = 0;
        this.allDescriptors = lazyJavaResolverContext.getStorageManager().createRecursionTolerantLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$0
            public final LazyJavaScope arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LazyJavaScope lazyJavaScope2 = this.arg$0;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LazyJavaScope.$$delegatedProperties;
                        DescriptorKindFilter descriptorKindFilter = DescriptorKindFilter.ALL;
                        Function1<Name, Boolean> all_name_filter = MemberScope.Companion.getALL_NAME_FILTER();
                        descriptorKindFilter.getClass();
                        all_name_filter.getClass();
                        NoLookupLocation noLookupLocation = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getCLASSIFIERS_MASK())) {
                            for (Name name : lazyJavaScope2.computeClassNames(descriptorKindFilter, all_name_filter)) {
                                if (((Boolean) all_name_filter.invoke(name)).booleanValue()) {
                                    CollectionsKt.addIfNotNull(linkedHashSet, lazyJavaScope2.mo4154getContributedClassifier(name, noLookupLocation));
                                }
                            }
                        }
                        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK()) && !descriptorKindFilter.getExcludes().contains(DescriptorKindExclude.NonExtensions.INSTANCE)) {
                            for (Name name2 : lazyJavaScope2.computeFunctionNames(descriptorKindFilter, all_name_filter)) {
                                if (((Boolean) all_name_filter.invoke(name2)).booleanValue()) {
                                    linkedHashSet.addAll(lazyJavaScope2.getContributedFunctions(name2, noLookupLocation));
                                }
                            }
                        }
                        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK()) && !descriptorKindFilter.getExcludes().contains(DescriptorKindExclude.NonExtensions.INSTANCE)) {
                            for (Name name3 : lazyJavaScope2.computePropertyNames(descriptorKindFilter)) {
                                if (((Boolean) all_name_filter.invoke(name3)).booleanValue()) {
                                    linkedHashSet.addAll(lazyJavaScope2.getContributedVariables(name3, noLookupLocation));
                                }
                            }
                        }
                        return kotlin.collections.CollectionsKt.toList(linkedHashSet);
                    case 1:
                        KProperty[] kPropertyArr2 = LazyJavaScope.$$delegatedProperties;
                        return lazyJavaScope2.computeMemberIndex();
                    case 2:
                        KProperty[] kPropertyArr3 = LazyJavaScope.$$delegatedProperties;
                        return lazyJavaScope2.computeFunctionNames(DescriptorKindFilter.FUNCTIONS, null);
                    case 3:
                        KProperty[] kPropertyArr4 = LazyJavaScope.$$delegatedProperties;
                        return lazyJavaScope2.computePropertyNames(DescriptorKindFilter.VARIABLES);
                    default:
                        KProperty[] kPropertyArr5 = LazyJavaScope.$$delegatedProperties;
                        return lazyJavaScope2.computeClassNames(DescriptorKindFilter.CLASSIFIERS, null);
                }
            }
        }, EmptyList.INSTANCE);
        final int i2 = 1;
        this.declaredMemberIndex = lazyJavaResolverContext.getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$0
            public final LazyJavaScope arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LazyJavaScope lazyJavaScope2 = this.arg$0;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LazyJavaScope.$$delegatedProperties;
                        DescriptorKindFilter descriptorKindFilter = DescriptorKindFilter.ALL;
                        Function1<Name, Boolean> all_name_filter = MemberScope.Companion.getALL_NAME_FILTER();
                        descriptorKindFilter.getClass();
                        all_name_filter.getClass();
                        NoLookupLocation noLookupLocation = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getCLASSIFIERS_MASK())) {
                            for (Name name : lazyJavaScope2.computeClassNames(descriptorKindFilter, all_name_filter)) {
                                if (((Boolean) all_name_filter.invoke(name)).booleanValue()) {
                                    CollectionsKt.addIfNotNull(linkedHashSet, lazyJavaScope2.mo4154getContributedClassifier(name, noLookupLocation));
                                }
                            }
                        }
                        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK()) && !descriptorKindFilter.getExcludes().contains(DescriptorKindExclude.NonExtensions.INSTANCE)) {
                            for (Name name2 : lazyJavaScope2.computeFunctionNames(descriptorKindFilter, all_name_filter)) {
                                if (((Boolean) all_name_filter.invoke(name2)).booleanValue()) {
                                    linkedHashSet.addAll(lazyJavaScope2.getContributedFunctions(name2, noLookupLocation));
                                }
                            }
                        }
                        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK()) && !descriptorKindFilter.getExcludes().contains(DescriptorKindExclude.NonExtensions.INSTANCE)) {
                            for (Name name3 : lazyJavaScope2.computePropertyNames(descriptorKindFilter)) {
                                if (((Boolean) all_name_filter.invoke(name3)).booleanValue()) {
                                    linkedHashSet.addAll(lazyJavaScope2.getContributedVariables(name3, noLookupLocation));
                                }
                            }
                        }
                        return kotlin.collections.CollectionsKt.toList(linkedHashSet);
                    case 1:
                        KProperty[] kPropertyArr2 = LazyJavaScope.$$delegatedProperties;
                        return lazyJavaScope2.computeMemberIndex();
                    case 2:
                        KProperty[] kPropertyArr3 = LazyJavaScope.$$delegatedProperties;
                        return lazyJavaScope2.computeFunctionNames(DescriptorKindFilter.FUNCTIONS, null);
                    case 3:
                        KProperty[] kPropertyArr4 = LazyJavaScope.$$delegatedProperties;
                        return lazyJavaScope2.computePropertyNames(DescriptorKindFilter.VARIABLES);
                    default:
                        KProperty[] kPropertyArr5 = LazyJavaScope.$$delegatedProperties;
                        return lazyJavaScope2.computeClassNames(DescriptorKindFilter.CLASSIFIERS, null);
                }
            }
        });
        this.declaredFunctions = lazyJavaResolverContext.getStorageManager().createMemoizedFunction(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$2
            public final LazyJavaScope arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i;
                int i4 = 0;
                LazyJavaScope lazyJavaScope2 = this.arg$0;
                Name name = (Name) obj;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = LazyJavaScope.$$delegatedProperties;
                        name.getClass();
                        LazyJavaScope lazyJavaScope3 = lazyJavaScope2.mainScope;
                        if (lazyJavaScope3 != null) {
                            return (Collection) lazyJavaScope3.declaredFunctions.invoke(name);
                        }
                        ArrayList arrayList = new ArrayList();
                        for (JavaMethod javaMethod : ((DeclaredMemberIndex) lazyJavaScope2.declaredMemberIndex.invoke()).findMethodsByName(name)) {
                            JavaMethodDescriptor resolveMethodToFunctionDescriptor = lazyJavaScope2.resolveMethodToFunctionDescriptor(javaMethod);
                            if (lazyJavaScope2.isVisibleAsFunction(resolveMethodToFunctionDescriptor)) {
                                lazyJavaScope2.c.getComponents().getJavaResolverCache().recordMethod(javaMethod, resolveMethodToFunctionDescriptor);
                                arrayList.add(resolveMethodToFunctionDescriptor);
                            }
                        }
                        lazyJavaScope2.computeImplicitlyDeclaredFunctions(name, arrayList);
                        return arrayList;
                    case 1:
                        KProperty[] kPropertyArr2 = LazyJavaScope.$$delegatedProperties;
                        name.getClass();
                        LazyJavaScope lazyJavaScope4 = lazyJavaScope2.mainScope;
                        if (lazyJavaScope4 != null) {
                            return (PropertyDescriptor) lazyJavaScope4.declaredField.invoke(name);
                        }
                        JavaField findFieldByName = ((DeclaredMemberIndex) lazyJavaScope2.declaredMemberIndex.invoke()).findFieldByName(name);
                        if (findFieldByName == null || findFieldByName.isEnumEntry()) {
                            return null;
                        }
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        boolean z = !findFieldByName.isFinal();
                        LazyJavaResolverContext lazyJavaResolverContext2 = lazyJavaScope2.c;
                        JavaPropertyDescriptor create = JavaPropertyDescriptor.create(lazyJavaScope2.getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext2, findFieldByName), Modality.FINAL, UtilsKt.toDescriptorVisibility(findFieldByName.getVisibility()), z, findFieldByName.getName(), lazyJavaResolverContext2.getComponents().getSourceElementFactory().source(findFieldByName), findFieldByName.isFinal() && findFieldByName.isStatic());
                        create.getClass();
                        ref$ObjectRef.element = create;
                        create.initialize(null, null, null, null);
                        KotlinType transformJavaType = lazyJavaResolverContext2.getTypeResolver().transformJavaType(findFieldByName.getType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null));
                        if ((KotlinBuiltIns.isPrimitiveType(transformJavaType) || KotlinBuiltIns.isString(transformJavaType)) && findFieldByName.isFinal() && findFieldByName.isStatic() && findFieldByName.getHasConstantNotNullInitializer()) {
                            transformJavaType = TypeUtils.makeNotNullable(transformJavaType);
                            transformJavaType.getClass();
                        }
                        PropertyDescriptorImpl propertyDescriptorImpl = (PropertyDescriptorImpl) ref$ObjectRef.element;
                        EmptyList emptyList = EmptyList.INSTANCE;
                        propertyDescriptorImpl.setType(transformJavaType, emptyList, lazyJavaScope2.getDispatchReceiverParameter(), null, emptyList);
                        DeclarationDescriptor ownerDescriptor = lazyJavaScope2.getOwnerDescriptor();
                        ClassDescriptor classDescriptor = ownerDescriptor instanceof ClassDescriptor ? (ClassDescriptor) ownerDescriptor : null;
                        if (classDescriptor != null) {
                            ref$ObjectRef.element = lazyJavaResolverContext2.getComponents().getSyntheticPartsProvider().modifyField(classDescriptor, (PropertyDescriptorImpl) ref$ObjectRef.element, lazyJavaResolverContext2);
                        }
                        Object obj2 = ref$ObjectRef.element;
                        if (DescriptorUtils.shouldRecordInitializerForProperty((VariableDescriptor) obj2, ((PropertyDescriptorImpl) obj2).getType())) {
                            ((PropertyDescriptorImpl) ref$ObjectRef.element).setCompileTimeInitializerFactory(new LazyJavaScope$$Lambda$10(lazyJavaScope2, findFieldByName, ref$ObjectRef, i4));
                        }
                        lazyJavaResolverContext2.getComponents().getJavaResolverCache().recordField(findFieldByName, (PropertyDescriptor) ref$ObjectRef.element);
                        return (PropertyDescriptor) ref$ObjectRef.element;
                    case 2:
                        KProperty[] kPropertyArr3 = LazyJavaScope.$$delegatedProperties;
                        name.getClass();
                        MemoizedFunctionToNotNull memoizedFunctionToNotNull = lazyJavaScope2.declaredFunctions;
                        LazyJavaResolverContext lazyJavaResolverContext3 = lazyJavaScope2.c;
                        LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) memoizedFunctionToNotNull.invoke(name));
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj3 : linkedHashSet) {
                            String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default((SimpleFunctionDescriptor) obj3, false, false, 2, null);
                            Object obj4 = linkedHashMap.get(computeJvmDescriptor$default);
                            if (obj4 == null) {
                                obj4 = new ArrayList();
                                linkedHashMap.put(computeJvmDescriptor$default, obj4);
                            }
                            ((List) obj4).add(obj3);
                        }
                        for (List list : linkedHashMap.values()) {
                            if (list.size() != 1) {
                                List list2 = list;
                                Collection selectMostSpecificInEachOverridableGroup = OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(list2, LazyJavaScope$$Lambda$9.INSTANCE);
                                linkedHashSet.removeAll(list2);
                                linkedHashSet.addAll(selectMostSpecificInEachOverridableGroup);
                            }
                        }
                        lazyJavaScope2.computeNonDeclaredFunctions(linkedHashSet, name);
                        return kotlin.collections.CollectionsKt.toList(lazyJavaResolverContext3.getComponents().getSignatureEnhancement().enhanceSignatures(lazyJavaResolverContext3, linkedHashSet));
                    default:
                        KProperty[] kPropertyArr4 = LazyJavaScope.$$delegatedProperties;
                        name.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        MemoizedFunctionToNullable memoizedFunctionToNullable = lazyJavaScope2.declaredField;
                        LazyJavaResolverContext lazyJavaResolverContext4 = lazyJavaScope2.c;
                        CollectionsKt.addIfNotNull(arrayList2, memoizedFunctionToNullable.invoke(name));
                        lazyJavaScope2.computeNonDeclaredProperties(name, arrayList2);
                        return DescriptorUtils.isAnnotationClass(lazyJavaScope2.getOwnerDescriptor()) ? kotlin.collections.CollectionsKt.toList(arrayList2) : kotlin.collections.CollectionsKt.toList(lazyJavaResolverContext4.getComponents().getSignatureEnhancement().enhanceSignatures(lazyJavaResolverContext4, arrayList2));
                }
            }
        });
        this.declaredField = lazyJavaResolverContext.getStorageManager().createMemoizedFunctionWithNullableValues(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$2
            public final LazyJavaScope arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i2;
                int i4 = 0;
                LazyJavaScope lazyJavaScope2 = this.arg$0;
                Name name = (Name) obj;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = LazyJavaScope.$$delegatedProperties;
                        name.getClass();
                        LazyJavaScope lazyJavaScope3 = lazyJavaScope2.mainScope;
                        if (lazyJavaScope3 != null) {
                            return (Collection) lazyJavaScope3.declaredFunctions.invoke(name);
                        }
                        ArrayList arrayList = new ArrayList();
                        for (JavaMethod javaMethod : ((DeclaredMemberIndex) lazyJavaScope2.declaredMemberIndex.invoke()).findMethodsByName(name)) {
                            JavaMethodDescriptor resolveMethodToFunctionDescriptor = lazyJavaScope2.resolveMethodToFunctionDescriptor(javaMethod);
                            if (lazyJavaScope2.isVisibleAsFunction(resolveMethodToFunctionDescriptor)) {
                                lazyJavaScope2.c.getComponents().getJavaResolverCache().recordMethod(javaMethod, resolveMethodToFunctionDescriptor);
                                arrayList.add(resolveMethodToFunctionDescriptor);
                            }
                        }
                        lazyJavaScope2.computeImplicitlyDeclaredFunctions(name, arrayList);
                        return arrayList;
                    case 1:
                        KProperty[] kPropertyArr2 = LazyJavaScope.$$delegatedProperties;
                        name.getClass();
                        LazyJavaScope lazyJavaScope4 = lazyJavaScope2.mainScope;
                        if (lazyJavaScope4 != null) {
                            return (PropertyDescriptor) lazyJavaScope4.declaredField.invoke(name);
                        }
                        JavaField findFieldByName = ((DeclaredMemberIndex) lazyJavaScope2.declaredMemberIndex.invoke()).findFieldByName(name);
                        if (findFieldByName == null || findFieldByName.isEnumEntry()) {
                            return null;
                        }
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        boolean z = !findFieldByName.isFinal();
                        LazyJavaResolverContext lazyJavaResolverContext2 = lazyJavaScope2.c;
                        JavaPropertyDescriptor create = JavaPropertyDescriptor.create(lazyJavaScope2.getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext2, findFieldByName), Modality.FINAL, UtilsKt.toDescriptorVisibility(findFieldByName.getVisibility()), z, findFieldByName.getName(), lazyJavaResolverContext2.getComponents().getSourceElementFactory().source(findFieldByName), findFieldByName.isFinal() && findFieldByName.isStatic());
                        create.getClass();
                        ref$ObjectRef.element = create;
                        create.initialize(null, null, null, null);
                        KotlinType transformJavaType = lazyJavaResolverContext2.getTypeResolver().transformJavaType(findFieldByName.getType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null));
                        if ((KotlinBuiltIns.isPrimitiveType(transformJavaType) || KotlinBuiltIns.isString(transformJavaType)) && findFieldByName.isFinal() && findFieldByName.isStatic() && findFieldByName.getHasConstantNotNullInitializer()) {
                            transformJavaType = TypeUtils.makeNotNullable(transformJavaType);
                            transformJavaType.getClass();
                        }
                        PropertyDescriptorImpl propertyDescriptorImpl = (PropertyDescriptorImpl) ref$ObjectRef.element;
                        EmptyList emptyList = EmptyList.INSTANCE;
                        propertyDescriptorImpl.setType(transformJavaType, emptyList, lazyJavaScope2.getDispatchReceiverParameter(), null, emptyList);
                        DeclarationDescriptor ownerDescriptor = lazyJavaScope2.getOwnerDescriptor();
                        ClassDescriptor classDescriptor = ownerDescriptor instanceof ClassDescriptor ? (ClassDescriptor) ownerDescriptor : null;
                        if (classDescriptor != null) {
                            ref$ObjectRef.element = lazyJavaResolverContext2.getComponents().getSyntheticPartsProvider().modifyField(classDescriptor, (PropertyDescriptorImpl) ref$ObjectRef.element, lazyJavaResolverContext2);
                        }
                        Object obj2 = ref$ObjectRef.element;
                        if (DescriptorUtils.shouldRecordInitializerForProperty((VariableDescriptor) obj2, ((PropertyDescriptorImpl) obj2).getType())) {
                            ((PropertyDescriptorImpl) ref$ObjectRef.element).setCompileTimeInitializerFactory(new LazyJavaScope$$Lambda$10(lazyJavaScope2, findFieldByName, ref$ObjectRef, i4));
                        }
                        lazyJavaResolverContext2.getComponents().getJavaResolverCache().recordField(findFieldByName, (PropertyDescriptor) ref$ObjectRef.element);
                        return (PropertyDescriptor) ref$ObjectRef.element;
                    case 2:
                        KProperty[] kPropertyArr3 = LazyJavaScope.$$delegatedProperties;
                        name.getClass();
                        MemoizedFunctionToNotNull memoizedFunctionToNotNull = lazyJavaScope2.declaredFunctions;
                        LazyJavaResolverContext lazyJavaResolverContext3 = lazyJavaScope2.c;
                        LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) memoizedFunctionToNotNull.invoke(name));
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj3 : linkedHashSet) {
                            String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default((SimpleFunctionDescriptor) obj3, false, false, 2, null);
                            Object obj4 = linkedHashMap.get(computeJvmDescriptor$default);
                            if (obj4 == null) {
                                obj4 = new ArrayList();
                                linkedHashMap.put(computeJvmDescriptor$default, obj4);
                            }
                            ((List) obj4).add(obj3);
                        }
                        for (List list : linkedHashMap.values()) {
                            if (list.size() != 1) {
                                List list2 = list;
                                Collection selectMostSpecificInEachOverridableGroup = OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(list2, LazyJavaScope$$Lambda$9.INSTANCE);
                                linkedHashSet.removeAll(list2);
                                linkedHashSet.addAll(selectMostSpecificInEachOverridableGroup);
                            }
                        }
                        lazyJavaScope2.computeNonDeclaredFunctions(linkedHashSet, name);
                        return kotlin.collections.CollectionsKt.toList(lazyJavaResolverContext3.getComponents().getSignatureEnhancement().enhanceSignatures(lazyJavaResolverContext3, linkedHashSet));
                    default:
                        KProperty[] kPropertyArr4 = LazyJavaScope.$$delegatedProperties;
                        name.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        MemoizedFunctionToNullable memoizedFunctionToNullable = lazyJavaScope2.declaredField;
                        LazyJavaResolverContext lazyJavaResolverContext4 = lazyJavaScope2.c;
                        CollectionsKt.addIfNotNull(arrayList2, memoizedFunctionToNullable.invoke(name));
                        lazyJavaScope2.computeNonDeclaredProperties(name, arrayList2);
                        return DescriptorUtils.isAnnotationClass(lazyJavaScope2.getOwnerDescriptor()) ? kotlin.collections.CollectionsKt.toList(arrayList2) : kotlin.collections.CollectionsKt.toList(lazyJavaResolverContext4.getComponents().getSignatureEnhancement().enhanceSignatures(lazyJavaResolverContext4, arrayList2));
                }
            }
        });
        final int i3 = 2;
        this.functions = lazyJavaResolverContext.getStorageManager().createMemoizedFunction(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$2
            public final LazyJavaScope arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i3;
                int i4 = 0;
                LazyJavaScope lazyJavaScope2 = this.arg$0;
                Name name = (Name) obj;
                switch (i32) {
                    case 0:
                        KProperty[] kPropertyArr = LazyJavaScope.$$delegatedProperties;
                        name.getClass();
                        LazyJavaScope lazyJavaScope3 = lazyJavaScope2.mainScope;
                        if (lazyJavaScope3 != null) {
                            return (Collection) lazyJavaScope3.declaredFunctions.invoke(name);
                        }
                        ArrayList arrayList = new ArrayList();
                        for (JavaMethod javaMethod : ((DeclaredMemberIndex) lazyJavaScope2.declaredMemberIndex.invoke()).findMethodsByName(name)) {
                            JavaMethodDescriptor resolveMethodToFunctionDescriptor = lazyJavaScope2.resolveMethodToFunctionDescriptor(javaMethod);
                            if (lazyJavaScope2.isVisibleAsFunction(resolveMethodToFunctionDescriptor)) {
                                lazyJavaScope2.c.getComponents().getJavaResolverCache().recordMethod(javaMethod, resolveMethodToFunctionDescriptor);
                                arrayList.add(resolveMethodToFunctionDescriptor);
                            }
                        }
                        lazyJavaScope2.computeImplicitlyDeclaredFunctions(name, arrayList);
                        return arrayList;
                    case 1:
                        KProperty[] kPropertyArr2 = LazyJavaScope.$$delegatedProperties;
                        name.getClass();
                        LazyJavaScope lazyJavaScope4 = lazyJavaScope2.mainScope;
                        if (lazyJavaScope4 != null) {
                            return (PropertyDescriptor) lazyJavaScope4.declaredField.invoke(name);
                        }
                        JavaField findFieldByName = ((DeclaredMemberIndex) lazyJavaScope2.declaredMemberIndex.invoke()).findFieldByName(name);
                        if (findFieldByName == null || findFieldByName.isEnumEntry()) {
                            return null;
                        }
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        boolean z = !findFieldByName.isFinal();
                        LazyJavaResolverContext lazyJavaResolverContext2 = lazyJavaScope2.c;
                        JavaPropertyDescriptor create = JavaPropertyDescriptor.create(lazyJavaScope2.getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext2, findFieldByName), Modality.FINAL, UtilsKt.toDescriptorVisibility(findFieldByName.getVisibility()), z, findFieldByName.getName(), lazyJavaResolverContext2.getComponents().getSourceElementFactory().source(findFieldByName), findFieldByName.isFinal() && findFieldByName.isStatic());
                        create.getClass();
                        ref$ObjectRef.element = create;
                        create.initialize(null, null, null, null);
                        KotlinType transformJavaType = lazyJavaResolverContext2.getTypeResolver().transformJavaType(findFieldByName.getType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null));
                        if ((KotlinBuiltIns.isPrimitiveType(transformJavaType) || KotlinBuiltIns.isString(transformJavaType)) && findFieldByName.isFinal() && findFieldByName.isStatic() && findFieldByName.getHasConstantNotNullInitializer()) {
                            transformJavaType = TypeUtils.makeNotNullable(transformJavaType);
                            transformJavaType.getClass();
                        }
                        PropertyDescriptorImpl propertyDescriptorImpl = (PropertyDescriptorImpl) ref$ObjectRef.element;
                        EmptyList emptyList = EmptyList.INSTANCE;
                        propertyDescriptorImpl.setType(transformJavaType, emptyList, lazyJavaScope2.getDispatchReceiverParameter(), null, emptyList);
                        DeclarationDescriptor ownerDescriptor = lazyJavaScope2.getOwnerDescriptor();
                        ClassDescriptor classDescriptor = ownerDescriptor instanceof ClassDescriptor ? (ClassDescriptor) ownerDescriptor : null;
                        if (classDescriptor != null) {
                            ref$ObjectRef.element = lazyJavaResolverContext2.getComponents().getSyntheticPartsProvider().modifyField(classDescriptor, (PropertyDescriptorImpl) ref$ObjectRef.element, lazyJavaResolverContext2);
                        }
                        Object obj2 = ref$ObjectRef.element;
                        if (DescriptorUtils.shouldRecordInitializerForProperty((VariableDescriptor) obj2, ((PropertyDescriptorImpl) obj2).getType())) {
                            ((PropertyDescriptorImpl) ref$ObjectRef.element).setCompileTimeInitializerFactory(new LazyJavaScope$$Lambda$10(lazyJavaScope2, findFieldByName, ref$ObjectRef, i4));
                        }
                        lazyJavaResolverContext2.getComponents().getJavaResolverCache().recordField(findFieldByName, (PropertyDescriptor) ref$ObjectRef.element);
                        return (PropertyDescriptor) ref$ObjectRef.element;
                    case 2:
                        KProperty[] kPropertyArr3 = LazyJavaScope.$$delegatedProperties;
                        name.getClass();
                        MemoizedFunctionToNotNull memoizedFunctionToNotNull = lazyJavaScope2.declaredFunctions;
                        LazyJavaResolverContext lazyJavaResolverContext3 = lazyJavaScope2.c;
                        LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) memoizedFunctionToNotNull.invoke(name));
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj3 : linkedHashSet) {
                            String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default((SimpleFunctionDescriptor) obj3, false, false, 2, null);
                            Object obj4 = linkedHashMap.get(computeJvmDescriptor$default);
                            if (obj4 == null) {
                                obj4 = new ArrayList();
                                linkedHashMap.put(computeJvmDescriptor$default, obj4);
                            }
                            ((List) obj4).add(obj3);
                        }
                        for (List list : linkedHashMap.values()) {
                            if (list.size() != 1) {
                                List list2 = list;
                                Collection selectMostSpecificInEachOverridableGroup = OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(list2, LazyJavaScope$$Lambda$9.INSTANCE);
                                linkedHashSet.removeAll(list2);
                                linkedHashSet.addAll(selectMostSpecificInEachOverridableGroup);
                            }
                        }
                        lazyJavaScope2.computeNonDeclaredFunctions(linkedHashSet, name);
                        return kotlin.collections.CollectionsKt.toList(lazyJavaResolverContext3.getComponents().getSignatureEnhancement().enhanceSignatures(lazyJavaResolverContext3, linkedHashSet));
                    default:
                        KProperty[] kPropertyArr4 = LazyJavaScope.$$delegatedProperties;
                        name.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        MemoizedFunctionToNullable memoizedFunctionToNullable = lazyJavaScope2.declaredField;
                        LazyJavaResolverContext lazyJavaResolverContext4 = lazyJavaScope2.c;
                        CollectionsKt.addIfNotNull(arrayList2, memoizedFunctionToNullable.invoke(name));
                        lazyJavaScope2.computeNonDeclaredProperties(name, arrayList2);
                        return DescriptorUtils.isAnnotationClass(lazyJavaScope2.getOwnerDescriptor()) ? kotlin.collections.CollectionsKt.toList(arrayList2) : kotlin.collections.CollectionsKt.toList(lazyJavaResolverContext4.getComponents().getSignatureEnhancement().enhanceSignatures(lazyJavaResolverContext4, arrayList2));
                }
            }
        });
        this.functionNamesLazy$delegate = lazyJavaResolverContext.getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$0
            public final LazyJavaScope arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LazyJavaScope lazyJavaScope2 = this.arg$0;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LazyJavaScope.$$delegatedProperties;
                        DescriptorKindFilter descriptorKindFilter = DescriptorKindFilter.ALL;
                        Function1<Name, Boolean> all_name_filter = MemberScope.Companion.getALL_NAME_FILTER();
                        descriptorKindFilter.getClass();
                        all_name_filter.getClass();
                        NoLookupLocation noLookupLocation = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getCLASSIFIERS_MASK())) {
                            for (Name name : lazyJavaScope2.computeClassNames(descriptorKindFilter, all_name_filter)) {
                                if (((Boolean) all_name_filter.invoke(name)).booleanValue()) {
                                    CollectionsKt.addIfNotNull(linkedHashSet, lazyJavaScope2.mo4154getContributedClassifier(name, noLookupLocation));
                                }
                            }
                        }
                        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK()) && !descriptorKindFilter.getExcludes().contains(DescriptorKindExclude.NonExtensions.INSTANCE)) {
                            for (Name name2 : lazyJavaScope2.computeFunctionNames(descriptorKindFilter, all_name_filter)) {
                                if (((Boolean) all_name_filter.invoke(name2)).booleanValue()) {
                                    linkedHashSet.addAll(lazyJavaScope2.getContributedFunctions(name2, noLookupLocation));
                                }
                            }
                        }
                        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK()) && !descriptorKindFilter.getExcludes().contains(DescriptorKindExclude.NonExtensions.INSTANCE)) {
                            for (Name name3 : lazyJavaScope2.computePropertyNames(descriptorKindFilter)) {
                                if (((Boolean) all_name_filter.invoke(name3)).booleanValue()) {
                                    linkedHashSet.addAll(lazyJavaScope2.getContributedVariables(name3, noLookupLocation));
                                }
                            }
                        }
                        return kotlin.collections.CollectionsKt.toList(linkedHashSet);
                    case 1:
                        KProperty[] kPropertyArr2 = LazyJavaScope.$$delegatedProperties;
                        return lazyJavaScope2.computeMemberIndex();
                    case 2:
                        KProperty[] kPropertyArr3 = LazyJavaScope.$$delegatedProperties;
                        return lazyJavaScope2.computeFunctionNames(DescriptorKindFilter.FUNCTIONS, null);
                    case 3:
                        KProperty[] kPropertyArr4 = LazyJavaScope.$$delegatedProperties;
                        return lazyJavaScope2.computePropertyNames(DescriptorKindFilter.VARIABLES);
                    default:
                        KProperty[] kPropertyArr5 = LazyJavaScope.$$delegatedProperties;
                        return lazyJavaScope2.computeClassNames(DescriptorKindFilter.CLASSIFIERS, null);
                }
            }
        });
        final int i4 = 3;
        this.propertyNamesLazy$delegate = lazyJavaResolverContext.getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$0
            public final LazyJavaScope arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                LazyJavaScope lazyJavaScope2 = this.arg$0;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LazyJavaScope.$$delegatedProperties;
                        DescriptorKindFilter descriptorKindFilter = DescriptorKindFilter.ALL;
                        Function1<Name, Boolean> all_name_filter = MemberScope.Companion.getALL_NAME_FILTER();
                        descriptorKindFilter.getClass();
                        all_name_filter.getClass();
                        NoLookupLocation noLookupLocation = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getCLASSIFIERS_MASK())) {
                            for (Name name : lazyJavaScope2.computeClassNames(descriptorKindFilter, all_name_filter)) {
                                if (((Boolean) all_name_filter.invoke(name)).booleanValue()) {
                                    CollectionsKt.addIfNotNull(linkedHashSet, lazyJavaScope2.mo4154getContributedClassifier(name, noLookupLocation));
                                }
                            }
                        }
                        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK()) && !descriptorKindFilter.getExcludes().contains(DescriptorKindExclude.NonExtensions.INSTANCE)) {
                            for (Name name2 : lazyJavaScope2.computeFunctionNames(descriptorKindFilter, all_name_filter)) {
                                if (((Boolean) all_name_filter.invoke(name2)).booleanValue()) {
                                    linkedHashSet.addAll(lazyJavaScope2.getContributedFunctions(name2, noLookupLocation));
                                }
                            }
                        }
                        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK()) && !descriptorKindFilter.getExcludes().contains(DescriptorKindExclude.NonExtensions.INSTANCE)) {
                            for (Name name3 : lazyJavaScope2.computePropertyNames(descriptorKindFilter)) {
                                if (((Boolean) all_name_filter.invoke(name3)).booleanValue()) {
                                    linkedHashSet.addAll(lazyJavaScope2.getContributedVariables(name3, noLookupLocation));
                                }
                            }
                        }
                        return kotlin.collections.CollectionsKt.toList(linkedHashSet);
                    case 1:
                        KProperty[] kPropertyArr2 = LazyJavaScope.$$delegatedProperties;
                        return lazyJavaScope2.computeMemberIndex();
                    case 2:
                        KProperty[] kPropertyArr3 = LazyJavaScope.$$delegatedProperties;
                        return lazyJavaScope2.computeFunctionNames(DescriptorKindFilter.FUNCTIONS, null);
                    case 3:
                        KProperty[] kPropertyArr4 = LazyJavaScope.$$delegatedProperties;
                        return lazyJavaScope2.computePropertyNames(DescriptorKindFilter.VARIABLES);
                    default:
                        KProperty[] kPropertyArr5 = LazyJavaScope.$$delegatedProperties;
                        return lazyJavaScope2.computeClassNames(DescriptorKindFilter.CLASSIFIERS, null);
                }
            }
        });
        final int i5 = 4;
        this.classNamesLazy$delegate = lazyJavaResolverContext.getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$0
            public final LazyJavaScope arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                LazyJavaScope lazyJavaScope2 = this.arg$0;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LazyJavaScope.$$delegatedProperties;
                        DescriptorKindFilter descriptorKindFilter = DescriptorKindFilter.ALL;
                        Function1<Name, Boolean> all_name_filter = MemberScope.Companion.getALL_NAME_FILTER();
                        descriptorKindFilter.getClass();
                        all_name_filter.getClass();
                        NoLookupLocation noLookupLocation = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getCLASSIFIERS_MASK())) {
                            for (Name name : lazyJavaScope2.computeClassNames(descriptorKindFilter, all_name_filter)) {
                                if (((Boolean) all_name_filter.invoke(name)).booleanValue()) {
                                    CollectionsKt.addIfNotNull(linkedHashSet, lazyJavaScope2.mo4154getContributedClassifier(name, noLookupLocation));
                                }
                            }
                        }
                        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK()) && !descriptorKindFilter.getExcludes().contains(DescriptorKindExclude.NonExtensions.INSTANCE)) {
                            for (Name name2 : lazyJavaScope2.computeFunctionNames(descriptorKindFilter, all_name_filter)) {
                                if (((Boolean) all_name_filter.invoke(name2)).booleanValue()) {
                                    linkedHashSet.addAll(lazyJavaScope2.getContributedFunctions(name2, noLookupLocation));
                                }
                            }
                        }
                        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK()) && !descriptorKindFilter.getExcludes().contains(DescriptorKindExclude.NonExtensions.INSTANCE)) {
                            for (Name name3 : lazyJavaScope2.computePropertyNames(descriptorKindFilter)) {
                                if (((Boolean) all_name_filter.invoke(name3)).booleanValue()) {
                                    linkedHashSet.addAll(lazyJavaScope2.getContributedVariables(name3, noLookupLocation));
                                }
                            }
                        }
                        return kotlin.collections.CollectionsKt.toList(linkedHashSet);
                    case 1:
                        KProperty[] kPropertyArr2 = LazyJavaScope.$$delegatedProperties;
                        return lazyJavaScope2.computeMemberIndex();
                    case 2:
                        KProperty[] kPropertyArr3 = LazyJavaScope.$$delegatedProperties;
                        return lazyJavaScope2.computeFunctionNames(DescriptorKindFilter.FUNCTIONS, null);
                    case 3:
                        KProperty[] kPropertyArr4 = LazyJavaScope.$$delegatedProperties;
                        return lazyJavaScope2.computePropertyNames(DescriptorKindFilter.VARIABLES);
                    default:
                        KProperty[] kPropertyArr5 = LazyJavaScope.$$delegatedProperties;
                        return lazyJavaScope2.computeClassNames(DescriptorKindFilter.CLASSIFIERS, null);
                }
            }
        });
        this.properties = lazyJavaResolverContext.getStorageManager().createMemoizedFunction(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$2
            public final LazyJavaScope arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i4;
                int i42 = 0;
                LazyJavaScope lazyJavaScope2 = this.arg$0;
                Name name = (Name) obj;
                switch (i32) {
                    case 0:
                        KProperty[] kPropertyArr = LazyJavaScope.$$delegatedProperties;
                        name.getClass();
                        LazyJavaScope lazyJavaScope3 = lazyJavaScope2.mainScope;
                        if (lazyJavaScope3 != null) {
                            return (Collection) lazyJavaScope3.declaredFunctions.invoke(name);
                        }
                        ArrayList arrayList = new ArrayList();
                        for (JavaMethod javaMethod : ((DeclaredMemberIndex) lazyJavaScope2.declaredMemberIndex.invoke()).findMethodsByName(name)) {
                            JavaMethodDescriptor resolveMethodToFunctionDescriptor = lazyJavaScope2.resolveMethodToFunctionDescriptor(javaMethod);
                            if (lazyJavaScope2.isVisibleAsFunction(resolveMethodToFunctionDescriptor)) {
                                lazyJavaScope2.c.getComponents().getJavaResolverCache().recordMethod(javaMethod, resolveMethodToFunctionDescriptor);
                                arrayList.add(resolveMethodToFunctionDescriptor);
                            }
                        }
                        lazyJavaScope2.computeImplicitlyDeclaredFunctions(name, arrayList);
                        return arrayList;
                    case 1:
                        KProperty[] kPropertyArr2 = LazyJavaScope.$$delegatedProperties;
                        name.getClass();
                        LazyJavaScope lazyJavaScope4 = lazyJavaScope2.mainScope;
                        if (lazyJavaScope4 != null) {
                            return (PropertyDescriptor) lazyJavaScope4.declaredField.invoke(name);
                        }
                        JavaField findFieldByName = ((DeclaredMemberIndex) lazyJavaScope2.declaredMemberIndex.invoke()).findFieldByName(name);
                        if (findFieldByName == null || findFieldByName.isEnumEntry()) {
                            return null;
                        }
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        boolean z = !findFieldByName.isFinal();
                        LazyJavaResolverContext lazyJavaResolverContext2 = lazyJavaScope2.c;
                        JavaPropertyDescriptor create = JavaPropertyDescriptor.create(lazyJavaScope2.getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext2, findFieldByName), Modality.FINAL, UtilsKt.toDescriptorVisibility(findFieldByName.getVisibility()), z, findFieldByName.getName(), lazyJavaResolverContext2.getComponents().getSourceElementFactory().source(findFieldByName), findFieldByName.isFinal() && findFieldByName.isStatic());
                        create.getClass();
                        ref$ObjectRef.element = create;
                        create.initialize(null, null, null, null);
                        KotlinType transformJavaType = lazyJavaResolverContext2.getTypeResolver().transformJavaType(findFieldByName.getType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null));
                        if ((KotlinBuiltIns.isPrimitiveType(transformJavaType) || KotlinBuiltIns.isString(transformJavaType)) && findFieldByName.isFinal() && findFieldByName.isStatic() && findFieldByName.getHasConstantNotNullInitializer()) {
                            transformJavaType = TypeUtils.makeNotNullable(transformJavaType);
                            transformJavaType.getClass();
                        }
                        PropertyDescriptorImpl propertyDescriptorImpl = (PropertyDescriptorImpl) ref$ObjectRef.element;
                        EmptyList emptyList = EmptyList.INSTANCE;
                        propertyDescriptorImpl.setType(transformJavaType, emptyList, lazyJavaScope2.getDispatchReceiverParameter(), null, emptyList);
                        DeclarationDescriptor ownerDescriptor = lazyJavaScope2.getOwnerDescriptor();
                        ClassDescriptor classDescriptor = ownerDescriptor instanceof ClassDescriptor ? (ClassDescriptor) ownerDescriptor : null;
                        if (classDescriptor != null) {
                            ref$ObjectRef.element = lazyJavaResolverContext2.getComponents().getSyntheticPartsProvider().modifyField(classDescriptor, (PropertyDescriptorImpl) ref$ObjectRef.element, lazyJavaResolverContext2);
                        }
                        Object obj2 = ref$ObjectRef.element;
                        if (DescriptorUtils.shouldRecordInitializerForProperty((VariableDescriptor) obj2, ((PropertyDescriptorImpl) obj2).getType())) {
                            ((PropertyDescriptorImpl) ref$ObjectRef.element).setCompileTimeInitializerFactory(new LazyJavaScope$$Lambda$10(lazyJavaScope2, findFieldByName, ref$ObjectRef, i42));
                        }
                        lazyJavaResolverContext2.getComponents().getJavaResolverCache().recordField(findFieldByName, (PropertyDescriptor) ref$ObjectRef.element);
                        return (PropertyDescriptor) ref$ObjectRef.element;
                    case 2:
                        KProperty[] kPropertyArr3 = LazyJavaScope.$$delegatedProperties;
                        name.getClass();
                        MemoizedFunctionToNotNull memoizedFunctionToNotNull = lazyJavaScope2.declaredFunctions;
                        LazyJavaResolverContext lazyJavaResolverContext3 = lazyJavaScope2.c;
                        LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) memoizedFunctionToNotNull.invoke(name));
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj3 : linkedHashSet) {
                            String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default((SimpleFunctionDescriptor) obj3, false, false, 2, null);
                            Object obj4 = linkedHashMap.get(computeJvmDescriptor$default);
                            if (obj4 == null) {
                                obj4 = new ArrayList();
                                linkedHashMap.put(computeJvmDescriptor$default, obj4);
                            }
                            ((List) obj4).add(obj3);
                        }
                        for (List list : linkedHashMap.values()) {
                            if (list.size() != 1) {
                                List list2 = list;
                                Collection selectMostSpecificInEachOverridableGroup = OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(list2, LazyJavaScope$$Lambda$9.INSTANCE);
                                linkedHashSet.removeAll(list2);
                                linkedHashSet.addAll(selectMostSpecificInEachOverridableGroup);
                            }
                        }
                        lazyJavaScope2.computeNonDeclaredFunctions(linkedHashSet, name);
                        return kotlin.collections.CollectionsKt.toList(lazyJavaResolverContext3.getComponents().getSignatureEnhancement().enhanceSignatures(lazyJavaResolverContext3, linkedHashSet));
                    default:
                        KProperty[] kPropertyArr4 = LazyJavaScope.$$delegatedProperties;
                        name.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        MemoizedFunctionToNullable memoizedFunctionToNullable = lazyJavaScope2.declaredField;
                        LazyJavaResolverContext lazyJavaResolverContext4 = lazyJavaScope2.c;
                        CollectionsKt.addIfNotNull(arrayList2, memoizedFunctionToNullable.invoke(name));
                        lazyJavaScope2.computeNonDeclaredProperties(name, arrayList2);
                        return DescriptorUtils.isAnnotationClass(lazyJavaScope2.getOwnerDescriptor()) ? kotlin.collections.CollectionsKt.toList(arrayList2) : kotlin.collections.CollectionsKt.toList(lazyJavaResolverContext4.getComponents().getSignatureEnhancement().enhanceSignatures(lazyJavaResolverContext4, arrayList2));
                }
            }
        });
    }

    public static KotlinType computeMethodReturnType(JavaMethod javaMethod, LazyJavaResolverContext lazyJavaResolverContext) {
        javaMethod.getClass();
        lazyJavaResolverContext.getClass();
        return lazyJavaResolverContext.getTypeResolver().transformJavaType(javaMethod.getReturnType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, javaMethod.getContainingClass().isAnnotationType(), false, null, 6, null));
    }

    public static ResolvedValueParameters resolveValueParameters(LazyJavaResolverContext lazyJavaResolverContext, FunctionDescriptorImpl functionDescriptorImpl, List list) {
        Pair pair;
        Name name;
        lazyJavaResolverContext.getClass();
        functionDescriptorImpl.getClass();
        list.getClass();
        IndexingIterable withIndex = kotlin.collections.CollectionsKt.withIndex(list);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(withIndex, 10));
        Iterator it = withIndex.iterator();
        boolean z = false;
        while (true) {
            ArrayIterator arrayIterator = (ArrayIterator) it;
            if (!((Iterator) arrayIterator.f1520array).hasNext()) {
                return new ResolvedValueParameters(kotlin.collections.CollectionsKt.toList(arrayList), z);
            }
            IndexedValue indexedValue = (IndexedValue) arrayIterator.next();
            int i = indexedValue.index;
            JavaValueParameter javaValueParameter = (JavaValueParameter) indexedValue.value;
            Annotations resolveAnnotations = LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext, javaValueParameter);
            JavaTypeAttributes attributes$default = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null);
            if (javaValueParameter.isVararg()) {
                JavaType type2 = javaValueParameter.getType();
                JavaArrayType javaArrayType = type2 instanceof JavaArrayType ? (JavaArrayType) type2 : null;
                if (javaArrayType == null) {
                    ZslControlImpl$$ExternalSyntheticLambda1.m(javaValueParameter, "Vararg parameter should be an array: ");
                    return null;
                }
                KotlinType transformArrayType = lazyJavaResolverContext.getTypeResolver().transformArrayType(javaArrayType, attributes$default, true);
                pair = new Pair(transformArrayType, lazyJavaResolverContext.getModule().getBuiltIns().getArrayElementType(transformArrayType));
            } else {
                pair = new Pair(lazyJavaResolverContext.getTypeResolver().transformJavaType(javaValueParameter.getType(), attributes$default), null);
            }
            KotlinType kotlinType = (KotlinType) pair.first;
            KotlinType kotlinType2 = (KotlinType) pair.second;
            if (Intrinsics.areEqual(functionDescriptorImpl.getName().asString(), "equals") && list.size() == 1 && Intrinsics.areEqual(lazyJavaResolverContext.getModule().getBuiltIns().getNullableAnyType(), kotlinType)) {
                name = Name.identifier("other");
            } else {
                name = javaValueParameter.getName();
                if (name == null) {
                    z = true;
                }
                if (name == null) {
                    name = Name.identifier("p" + i);
                    name.getClass();
                }
            }
            Name name2 = name;
            name2.getClass();
            arrayList.add(new ValueParameterDescriptorImpl(functionDescriptorImpl, null, i, resolveAnnotations, name2, kotlinType, false, false, false, kotlinType2, lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaValueParameter)));
        }
    }

    public abstract Set computeClassNames(DescriptorKindFilter descriptorKindFilter, Function1 function1);

    public abstract Set computeFunctionNames(DescriptorKindFilter descriptorKindFilter, Function1 function1);

    public void computeImplicitlyDeclaredFunctions(Name name, ArrayList arrayList) {
        name.getClass();
    }

    public abstract DeclaredMemberIndex computeMemberIndex();

    public abstract void computeNonDeclaredFunctions(LinkedHashSet linkedHashSet, Name name);

    public abstract void computeNonDeclaredProperties(Name name, ArrayList arrayList);

    public abstract Set computePropertyNames(DescriptorKindFilter descriptorKindFilter);

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getClassifierNames() {
        return (Set) StorageKt.getValue(this.classNamesLazy$delegate, this, $$delegatedProperties[2]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        return (Collection) this.allDescriptors.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return !getFunctionNames().contains(name) ? EmptyList.INSTANCE : (Collection) this.functions.invoke(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return !getVariableNames().contains(name) ? EmptyList.INSTANCE : (Collection) this.properties.invoke(name);
    }

    public abstract ReceiverParameterDescriptor getDispatchReceiverParameter();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getFunctionNames() {
        return (Set) StorageKt.getValue(this.functionNamesLazy$delegate, this, $$delegatedProperties[0]);
    }

    public abstract DeclarationDescriptor getOwnerDescriptor();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getVariableNames() {
        return (Set) StorageKt.getValue(this.propertyNamesLazy$delegate, this, $$delegatedProperties[1]);
    }

    public boolean isVisibleAsFunction(JavaMethodDescriptor javaMethodDescriptor) {
        return true;
    }

    public abstract MethodSignatureData resolveMethodSignature(JavaMethod javaMethod, ArrayList arrayList, KotlinType kotlinType, List list);

    public final JavaMethodDescriptor resolveMethodToFunctionDescriptor(JavaMethod javaMethod) {
        Map<? extends CallableDescriptor.UserDataKey<?>, ?> map;
        javaMethod.getClass();
        LazyJavaResolverContext lazyJavaResolverContext = this.c;
        JavaMethodDescriptor createJavaMethod = JavaMethodDescriptor.createJavaMethod(getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext, javaMethod), javaMethod.getName(), lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaMethod), ((DeclaredMemberIndex) this.declaredMemberIndex.invoke()).findRecordComponentByName(javaMethod.getName()) != null && javaMethod.getValueParameters().isEmpty());
        createJavaMethod.getClass();
        LazyJavaResolverContext childForMethod$default = ContextKt.childForMethod$default(this.c, createJavaMethod, javaMethod, 0, 4, null);
        List<JavaTypeParameter> typeParameters = javaMethod.getTypeParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            TypeParameterDescriptor resolveTypeParameter = childForMethod$default.getTypeParameterResolver().resolveTypeParameter((JavaTypeParameter) it.next());
            resolveTypeParameter.getClass();
            arrayList.add(resolveTypeParameter);
        }
        ResolvedValueParameters resolveValueParameters = resolveValueParameters(childForMethod$default, createJavaMethod, javaMethod.getValueParameters());
        MethodSignatureData resolveMethodSignature = resolveMethodSignature(javaMethod, arrayList, computeMethodReturnType(javaMethod, childForMethod$default), resolveValueParameters.getDescriptors());
        KotlinType receiverType = resolveMethodSignature.getReceiverType();
        ReceiverParameterDescriptor createExtensionReceiverParameterForCallable = receiverType != null ? DescriptorFactory.createExtensionReceiverParameterForCallable(createJavaMethod, receiverType, Annotations.Companion.getEMPTY()) : null;
        ReceiverParameterDescriptor dispatchReceiverParameter = getDispatchReceiverParameter();
        EmptyList emptyList = EmptyList.INSTANCE;
        List<TypeParameterDescriptor> typeParameters2 = resolveMethodSignature.getTypeParameters();
        List<ValueParameterDescriptor> valueParameters = resolveMethodSignature.getValueParameters();
        KotlinType returnType = resolveMethodSignature.getReturnType();
        Modality convertFromFlags = Modality.Companion.convertFromFlags(false, javaMethod.isAbstract(), true ^ javaMethod.isFinal());
        DescriptorVisibility descriptorVisibility = UtilsKt.toDescriptorVisibility(javaMethod.getVisibility());
        if (resolveMethodSignature.getReceiverType() != null) {
            map = MapsKt__MapsJVMKt.mapOf(new Pair(JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER, kotlin.collections.CollectionsKt.first((List) resolveValueParameters.getDescriptors())));
        } else {
            map = EmptyMap.INSTANCE;
            map.getClass();
        }
        createJavaMethod.initialize(createExtensionReceiverParameterForCallable, dispatchReceiverParameter, emptyList, typeParameters2, valueParameters, returnType, convertFromFlags, descriptorVisibility, map);
        createJavaMethod.setExternal(javaMethod.isNative());
        createJavaMethod.setParameterNamesStatus(resolveMethodSignature.getHasStableParameterNames(), resolveValueParameters.getHasSynthesizedNames());
        if (!resolveMethodSignature.getErrors().isEmpty()) {
            childForMethod$default.getComponents().getSignaturePropagator().reportSignatureErrors(createJavaMethod, resolveMethodSignature.getErrors());
        }
        return createJavaMethod;
    }

    public String toString() {
        return "Lazy scope for " + getOwnerDescriptor();
    }

    public /* synthetic */ LazyJavaScope(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaScope lazyJavaScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, (i & 2) != 0 ? null : lazyJavaScope);
    }
}
