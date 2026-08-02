package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.DeprecationCausedByFunctionNInfo;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfoKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2;

/* loaded from: classes9.dex */
public final class SignatureEnhancement {
    public final JavaTypeEnhancement typeEnhancement;

    public SignatureEnhancement(JavaTypeEnhancement javaTypeEnhancement) {
        javaTypeEnhancement.getClass();
        this.typeEnhancement = javaTypeEnhancement;
    }

    public final KotlinType enhance(JavaCallableMemberDescriptor javaCallableMemberDescriptor, CallableDescriptor callableDescriptor, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, TypeEnhancementInfo typeEnhancementInfo, boolean z2, Function1 function1) {
        SignatureParts signatureParts = new SignatureParts(callableDescriptor, z, lazyJavaResolverContext, annotationQualifierApplicabilityType, false);
        KotlinType kotlinType = (KotlinType) function1.invoke(javaCallableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = javaCallableMemberDescriptor.getOverriddenDescriptors();
        overriddenDescriptors.getClass();
        Collection<? extends CallableMemberDescriptor> collection = overriddenDescriptors;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
        for (CallableMemberDescriptor callableMemberDescriptor : collection) {
            callableMemberDescriptor.getClass();
            arrayList.add((KotlinType) function1.invoke(callableMemberDescriptor));
        }
        return this.typeEnhancement.enhance(kotlinType, signatureParts.computeIndexedQualifiers(kotlinType, arrayList, typeEnhancementInfo, z2), signatureParts.skipRawTypeArguments);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0323 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024e  */
    /* JADX WARN: Type inference failed for: r24v0, types: [kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement] */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <D extends CallableMemberDescriptor> Collection<D> enhanceSignatures(LazyJavaResolverContext lazyJavaResolverContext, Collection<? extends D> collection) {
        Annotations annotations;
        CallableMemberDescriptor callableMemberDescriptor;
        KotlinType kotlinType;
        PredefinedFunctionEnhancementInfo predefinedFunctionEnhancementInfo;
        KotlinType enhance;
        KotlinType returnType;
        Pair<CallableDescriptor.UserDataKey<?>, ?> pair;
        Iterator it;
        KotlinType type2;
        LazyJavaResolverContext copyWithNewDefaultTypeQualifiers;
        List<TypeEnhancementInfo> parametersInfo;
        String errorsSinceLanguageVersion;
        LazyJavaResolverContext copyWithNewDefaultTypeQualifiers2;
        PropertyDescriptorImpl propertyDescriptorImpl;
        PropertyGetterDescriptorImpl getter;
        lazyJavaResolverContext.getClass();
        collection.getClass();
        Collection<? extends D> collection2 = collection;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection2, 10));
        Iterator it2 = collection2.iterator();
        while (it2.hasNext()) {
            CallableMemberDescriptor callableMemberDescriptor2 = (CallableMemberDescriptor) it2.next();
            SignatureEnhancement$$Lambda$0 signatureEnhancement$$Lambda$0 = SignatureEnhancement$$Lambda$0.INSTANCE$3;
            if ((callableMemberDescriptor2 instanceof JavaCallableMemberDescriptor) && (callableMemberDescriptor2.getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE || callableMemberDescriptor2.getOriginal().getOverriddenDescriptors().size() != 1)) {
                ClassifierDescriptor topLevelContainingClassifier = DescriptorUtilKt.getTopLevelContainingClassifier(callableMemberDescriptor2);
                TypeEnhancementInfo typeEnhancementInfo = null;
                if (topLevelContainingClassifier == null) {
                    annotations = callableMemberDescriptor2.getAnnotations();
                } else {
                    LazyJavaClassDescriptor lazyJavaClassDescriptor = topLevelContainingClassifier instanceof LazyJavaClassDescriptor ? (LazyJavaClassDescriptor) topLevelContainingClassifier : null;
                    List<JavaAnnotation> moduleAnnotations = lazyJavaClassDescriptor != null ? lazyJavaClassDescriptor.getModuleAnnotations() : null;
                    List<JavaAnnotation> list = moduleAnnotations;
                    if (list == null || list.isEmpty()) {
                        annotations = callableMemberDescriptor2.getAnnotations();
                    } else {
                        List<JavaAnnotation> list2 = moduleAnnotations;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(new LazyJavaAnnotationDescriptor(lazyJavaResolverContext, (JavaAnnotation) it3.next(), true));
                        }
                        annotations = Annotations.Companion.create(CollectionsKt.plus((Iterable) callableMemberDescriptor2.getAnnotations(), (Iterable) arrayList2));
                    }
                }
                LazyJavaResolverContext copyWithNewDefaultTypeQualifiers3 = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, annotations);
                if (!(callableMemberDescriptor2 instanceof JavaPropertyDescriptor) || (getter = (propertyDescriptorImpl = (PropertyDescriptorImpl) callableMemberDescriptor2).getGetter()) == null || getter.isDefault()) {
                    callableMemberDescriptor = callableMemberDescriptor2;
                } else {
                    CallableMemberDescriptor getter2 = propertyDescriptorImpl.getGetter();
                    getter2.getClass();
                    callableMemberDescriptor = getter2;
                }
                if (callableMemberDescriptor2.getExtensionReceiverParameter() != null) {
                    FunctionDescriptor functionDescriptor = callableMemberDescriptor instanceof FunctionDescriptor ? (FunctionDescriptor) callableMemberDescriptor : null;
                    ValueParameterDescriptor valueParameterDescriptor = functionDescriptor != null ? (ValueParameterDescriptor) functionDescriptor.getUserData(JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER) : null;
                    kotlinType = enhance((JavaCallableMemberDescriptor) callableMemberDescriptor2, valueParameterDescriptor, false, (valueParameterDescriptor == null || (copyWithNewDefaultTypeQualifiers2 = ContextKt.copyWithNewDefaultTypeQualifiers(copyWithNewDefaultTypeQualifiers3, valueParameterDescriptor.getAnnotations())) == null) ? copyWithNewDefaultTypeQualifiers3 : copyWithNewDefaultTypeQualifiers2, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, null, false, SignatureEnhancement$$Lambda$0.INSTANCE);
                } else {
                    kotlinType = null;
                }
                JavaMethodDescriptor javaMethodDescriptor = callableMemberDescriptor2 instanceof JavaMethodDescriptor ? (JavaMethodDescriptor) callableMemberDescriptor2 : null;
                if (javaMethodDescriptor != null) {
                    SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
                    DeclarationDescriptor containingDeclaration = javaMethodDescriptor.getContainingDeclaration();
                    containingDeclaration.getClass();
                    String signature = MethodSignatureBuildingUtilsKt.signature(signatureBuildingComponents, (ClassDescriptor) containingDeclaration, MethodSignatureMappingKt.computeJvmDescriptor$default(javaMethodDescriptor, false, false, 3, null));
                    if (signature != null && (predefinedFunctionEnhancementInfo = PredefinedEnhancementInfoKt.getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE().get(signature)) != null) {
                        if (predefinedFunctionEnhancementInfo.getErrorsSinceLanguageVersion() != null && ((errorsSinceLanguageVersion = predefinedFunctionEnhancementInfo.getErrorsSinceLanguageVersion()) == null || !StringsKt__StringsJVMKt.startsWith(errorsSinceLanguageVersion, "2.", false))) {
                            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                            return null;
                        }
                        if (predefinedFunctionEnhancementInfo.getErrorsSinceLanguageVersion() != null) {
                            predefinedFunctionEnhancementInfo = predefinedFunctionEnhancementInfo.getWarningModeClone();
                        }
                        if (predefinedFunctionEnhancementInfo != null) {
                            predefinedFunctionEnhancementInfo.getParametersInfo().size();
                            ((JavaMethodDescriptor) callableMemberDescriptor2).getValueParameters().size();
                        }
                        boolean z = (!UtilsKt.isJspecifyEnabledInStrictMode(lazyJavaResolverContext.getComponents().getJavaTypeEnhancementState()) || copyWithNewDefaultTypeQualifiers3.getComponents().getSettings().getIgnoreNullabilityForErasedValueParameters()) && UtilsKt.hasErasedValueParameters(callableMemberDescriptor2);
                        List<ValueParameterDescriptor> valueParameters = callableMemberDescriptor.getValueParameters();
                        valueParameters.getClass();
                        List<ValueParameterDescriptor> list3 = valueParameters;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                        for (ValueParameterDescriptor valueParameterDescriptor2 : list3) {
                            TypeEnhancementInfo typeEnhancementInfo2 = typeEnhancementInfo;
                            TypeEnhancementInfo typeEnhancementInfo3 = (predefinedFunctionEnhancementInfo == null || (parametersInfo = predefinedFunctionEnhancementInfo.getParametersInfo()) == null) ? typeEnhancementInfo2 : (TypeEnhancementInfo) CollectionsKt.getOrNull(valueParameterDescriptor2.getIndex(), parametersInfo);
                            ArrayList arrayList4 = arrayList3;
                            arrayList4.add(enhance((JavaCallableMemberDescriptor) callableMemberDescriptor2, valueParameterDescriptor2, false, (valueParameterDescriptor2 == null || (copyWithNewDefaultTypeQualifiers = ContextKt.copyWithNewDefaultTypeQualifiers(copyWithNewDefaultTypeQualifiers3, valueParameterDescriptor2.getAnnotations())) == null) ? copyWithNewDefaultTypeQualifiers3 : copyWithNewDefaultTypeQualifiers, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, typeEnhancementInfo3, z, new TasksKt$awaitImpl$2$2(valueParameterDescriptor2, 14)));
                            arrayList3 = arrayList4;
                            typeEnhancementInfo = typeEnhancementInfo2;
                        }
                        ?? r26 = typeEnhancementInfo;
                        ArrayList arrayList5 = arrayList3;
                        PropertyDescriptor propertyDescriptor = !(callableMemberDescriptor2 instanceof PropertyDescriptor) ? (PropertyDescriptor) callableMemberDescriptor2 : r26;
                        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = (propertyDescriptor == null && JavaDescriptorUtilKt.isJavaField(propertyDescriptor)) ? AnnotationQualifierApplicabilityType.FIELD : AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE;
                        JavaCallableMemberDescriptor javaCallableMemberDescriptor = (JavaCallableMemberDescriptor) callableMemberDescriptor2;
                        enhance = enhance(javaCallableMemberDescriptor, callableMemberDescriptor, true, copyWithNewDefaultTypeQualifiers3, annotationQualifierApplicabilityType, predefinedFunctionEnhancementInfo == null ? predefinedFunctionEnhancementInfo.getReturnTypeInfo() : r26, false, SignatureEnhancement$$Lambda$0.INSTANCE$1);
                        returnType = callableMemberDescriptor2.getReturnType();
                        returnType.getClass();
                        if (!TypeUtils.contains(returnType, signatureEnhancement$$Lambda$0)) {
                            ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptor2.getExtensionReceiverParameter();
                            if (!((extensionReceiverParameter == null || (type2 = extensionReceiverParameter.getType()) == null) ? false : TypeUtils.contains(type2, signatureEnhancement$$Lambda$0))) {
                                List<ValueParameterDescriptor> valueParameters2 = callableMemberDescriptor2.getValueParameters();
                                valueParameters2.getClass();
                                List<ValueParameterDescriptor> list4 = valueParameters2;
                                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                    Iterator it4 = list4.iterator();
                                    while (it4.hasNext()) {
                                        KotlinType type3 = ((ValueParameterDescriptor) it4.next()).getType();
                                        type3.getClass();
                                        if (TypeUtils.contains(type3, signatureEnhancement$$Lambda$0)) {
                                        }
                                    }
                                }
                                pair = r26;
                                if (kotlinType == null && enhance == null) {
                                    if (!arrayList5.isEmpty()) {
                                        Iterator it5 = arrayList5.iterator();
                                        while (it5.hasNext()) {
                                            if (((KotlinType) it5.next()) != null) {
                                                break;
                                            }
                                        }
                                    }
                                    if (pair == null) {
                                        continue;
                                    }
                                }
                                if (kotlinType == null) {
                                    ReceiverParameterDescriptor extensionReceiverParameter2 = callableMemberDescriptor2.getExtensionReceiverParameter();
                                    kotlinType = extensionReceiverParameter2 != null ? extensionReceiverParameter2.getType() : r26;
                                }
                                ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
                                it = arrayList5.iterator();
                                int i = 0;
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    int i2 = i + 1;
                                    if (i < 0) {
                                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                                        throw r26;
                                    }
                                    KotlinType kotlinType2 = (KotlinType) next;
                                    if (kotlinType2 == null) {
                                        kotlinType2 = callableMemberDescriptor2.getValueParameters().get(i).getType();
                                        kotlinType2.getClass();
                                    }
                                    arrayList6.add(kotlinType2);
                                    i = i2;
                                }
                                if (enhance == null) {
                                    enhance = callableMemberDescriptor2.getReturnType();
                                    enhance.getClass();
                                }
                                callableMemberDescriptor2 = javaCallableMemberDescriptor.enhance(kotlinType, arrayList6, enhance, pair);
                                callableMemberDescriptor2.getClass();
                            }
                        }
                        pair = new Pair<>(DescriptorBasedDeprecationInfoKt.getDEPRECATED_FUNCTION_KEY(), new DeprecationCausedByFunctionNInfo(callableMemberDescriptor2));
                        if (kotlinType == null) {
                            if (!arrayList5.isEmpty()) {
                            }
                            if (pair == null) {
                            }
                        }
                        if (kotlinType == null) {
                        }
                        ArrayList arrayList62 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
                        it = arrayList5.iterator();
                        int i3 = 0;
                        while (it.hasNext()) {
                        }
                        if (enhance == null) {
                        }
                        callableMemberDescriptor2 = javaCallableMemberDescriptor.enhance(kotlinType, arrayList62, enhance, pair);
                        callableMemberDescriptor2.getClass();
                    }
                }
                predefinedFunctionEnhancementInfo = null;
                if (predefinedFunctionEnhancementInfo != null) {
                }
                if (UtilsKt.isJspecifyEnabledInStrictMode(lazyJavaResolverContext.getComponents().getJavaTypeEnhancementState())) {
                }
                List<ValueParameterDescriptor> valueParameters3 = callableMemberDescriptor.getValueParameters();
                valueParameters3.getClass();
                List<ValueParameterDescriptor> list32 = valueParameters3;
                ArrayList arrayList32 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list32, 10));
                while (r12.hasNext()) {
                }
                ?? r262 = typeEnhancementInfo;
                ArrayList arrayList52 = arrayList32;
                if (!(callableMemberDescriptor2 instanceof PropertyDescriptor)) {
                }
                AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = (propertyDescriptor == null && JavaDescriptorUtilKt.isJavaField(propertyDescriptor)) ? AnnotationQualifierApplicabilityType.FIELD : AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE;
                JavaCallableMemberDescriptor javaCallableMemberDescriptor2 = (JavaCallableMemberDescriptor) callableMemberDescriptor2;
                enhance = enhance(javaCallableMemberDescriptor2, callableMemberDescriptor, true, copyWithNewDefaultTypeQualifiers3, annotationQualifierApplicabilityType2, predefinedFunctionEnhancementInfo == null ? predefinedFunctionEnhancementInfo.getReturnTypeInfo() : r262, false, SignatureEnhancement$$Lambda$0.INSTANCE$1);
                returnType = callableMemberDescriptor2.getReturnType();
                returnType.getClass();
                if (!TypeUtils.contains(returnType, signatureEnhancement$$Lambda$0)) {
                }
                pair = new Pair<>(DescriptorBasedDeprecationInfoKt.getDEPRECATED_FUNCTION_KEY(), new DeprecationCausedByFunctionNInfo(callableMemberDescriptor2));
                if (kotlinType == null) {
                }
                if (kotlinType == null) {
                }
                ArrayList arrayList622 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList52, 10));
                it = arrayList52.iterator();
                int i32 = 0;
                while (it.hasNext()) {
                }
                if (enhance == null) {
                }
                callableMemberDescriptor2 = javaCallableMemberDescriptor2.enhance(kotlinType, arrayList622, enhance, pair);
                callableMemberDescriptor2.getClass();
            }
            arrayList.add(callableMemberDescriptor2);
        }
        return arrayList;
    }

    public final KotlinType enhanceSuperType(KotlinType kotlinType, LazyJavaResolverContext lazyJavaResolverContext) {
        kotlinType.getClass();
        lazyJavaResolverContext.getClass();
        SignatureParts signatureParts = new SignatureParts(null, false, lazyJavaResolverContext, AnnotationQualifierApplicabilityType.TYPE_USE, true);
        KotlinType enhance = this.typeEnhancement.enhance(kotlinType, signatureParts.computeIndexedQualifiers(kotlinType, EmptyList.INSTANCE, null, false), signatureParts.skipRawTypeArguments);
        return enhance == null ? kotlinType : enhance;
    }

    public final List<KotlinType> enhanceTypeParameterBounds(TypeParameterDescriptor typeParameterDescriptor, List<? extends KotlinType> list, LazyJavaResolverContext lazyJavaResolverContext) {
        TypeParameterDescriptor typeParameterDescriptor2;
        LazyJavaResolverContext lazyJavaResolverContext2;
        typeParameterDescriptor.getClass();
        list.getClass();
        lazyJavaResolverContext.getClass();
        List<? extends KotlinType> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (KotlinType kotlinType : list2) {
            if (TypeUtilsKt.contains(kotlinType, SignatureEnhancement$$Lambda$0.INSTANCE$2)) {
                typeParameterDescriptor2 = typeParameterDescriptor;
                lazyJavaResolverContext2 = lazyJavaResolverContext;
            } else {
                typeParameterDescriptor2 = typeParameterDescriptor;
                lazyJavaResolverContext2 = lazyJavaResolverContext;
                SignatureParts signatureParts = new SignatureParts(typeParameterDescriptor2, false, lazyJavaResolverContext2, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, false);
                KotlinType enhance = this.typeEnhancement.enhance(kotlinType, signatureParts.computeIndexedQualifiers(kotlinType, EmptyList.INSTANCE, null, false), signatureParts.skipRawTypeArguments);
                if (enhance != null) {
                    kotlinType = enhance;
                }
            }
            arrayList.add(kotlinType);
            typeParameterDescriptor = typeParameterDescriptor2;
            lazyJavaResolverContext = lazyJavaResolverContext2;
        }
        return arrayList;
    }
}
