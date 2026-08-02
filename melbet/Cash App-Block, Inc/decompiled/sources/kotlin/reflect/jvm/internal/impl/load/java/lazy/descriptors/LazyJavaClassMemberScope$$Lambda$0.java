package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;

/* loaded from: classes9.dex */
public final class LazyJavaClassMemberScope$$Lambda$0 implements Function0 {
    public final /* synthetic */ int $r8$classId = 1;
    public final LazyJavaClassMemberScope arg$0;
    public final LazyJavaResolverContext arg$1;

    public LazyJavaClassMemberScope$$Lambda$0(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.arg$1 = lazyJavaResolverContext;
        this.arg$0 = lazyJavaClassMemberScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        ?? r4;
        Pair pair;
        int i = this.$r8$classId;
        LazyJavaResolverContext lazyJavaResolverContext = this.arg$1;
        switch (i) {
            case 0:
                ?? r3 = this.arg$0;
                JavaClass javaClass = r3.jClass;
                LazyJavaResolverContext lazyJavaResolverContext2 = r3.c;
                ClassDescriptor classDescriptor = r3.ownerDescriptor;
                Collection<JavaConstructor> constructors = javaClass.getConstructors();
                ArrayList arrayList = new ArrayList(constructors.size());
                for (JavaConstructor javaConstructor : constructors) {
                    JavaClassConstructorDescriptor createJavaConstructor = JavaClassConstructorDescriptor.createJavaConstructor(classDescriptor, LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext2, javaConstructor), false, lazyJavaResolverContext2.getComponents().getSourceElementFactory().source(javaConstructor));
                    createJavaConstructor.getClass();
                    LazyJavaResolverContext childForMethod = ContextKt.childForMethod(lazyJavaResolverContext2, createJavaConstructor, javaConstructor, classDescriptor.getDeclaredTypeParameters().size());
                    LazyJavaScope.ResolvedValueParameters resolveValueParameters = LazyJavaScope.resolveValueParameters(childForMethod, createJavaConstructor, javaConstructor.getValueParameters());
                    List<TypeParameterDescriptor> declaredTypeParameters = classDescriptor.getDeclaredTypeParameters();
                    declaredTypeParameters.getClass();
                    List<TypeParameterDescriptor> list = declaredTypeParameters;
                    List<JavaTypeParameter> typeParameters = javaConstructor.getTypeParameters();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(typeParameters, 10));
                    Iterator it = typeParameters.iterator();
                    while (it.hasNext()) {
                        TypeParameterDescriptor resolveTypeParameter = childForMethod.getTypeParameterResolver().resolveTypeParameter((JavaTypeParameter) it.next());
                        resolveTypeParameter.getClass();
                        arrayList2.add(resolveTypeParameter);
                    }
                    createJavaConstructor.initialize(resolveValueParameters.getDescriptors(), UtilsKt.toDescriptorVisibility(javaConstructor.getVisibility()), CollectionsKt.plus((Iterable) arrayList2, (Collection) list));
                    createJavaConstructor.setHasStableParameterNames(false);
                    createJavaConstructor.setHasSynthesizedParameterNames(resolveValueParameters.getHasSynthesizedNames());
                    createJavaConstructor.setReturnType(classDescriptor.getDefaultType());
                    childForMethod.getComponents().getJavaResolverCache().recordConstructor(javaConstructor, createJavaConstructor);
                    arrayList.add(createJavaConstructor);
                }
                if (javaClass.isRecord()) {
                    JavaClassConstructorDescriptor createJavaConstructor2 = JavaClassConstructorDescriptor.createJavaConstructor(classDescriptor, Annotations.Companion.getEMPTY(), true, lazyJavaResolverContext2.getComponents().getSourceElementFactory().source(javaClass));
                    createJavaConstructor2.getClass();
                    Collection<JavaRecordComponent> recordComponents = javaClass.getRecordComponents();
                    ArrayList arrayList3 = new ArrayList(recordComponents.size());
                    JavaTypeAttributes attributes$default = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 6, null);
                    int i2 = 0;
                    for (JavaRecordComponent javaRecordComponent : recordComponents) {
                        int i3 = i2 + 1;
                        KotlinType transformJavaType = lazyJavaResolverContext2.getTypeResolver().transformJavaType(javaRecordComponent.getType(), attributes$default);
                        arrayList3.add(new ValueParameterDescriptorImpl(createJavaConstructor2, null, i2, Annotations.Companion.getEMPTY(), javaRecordComponent.getName(), transformJavaType, false, false, false, javaRecordComponent.isVararg() ? lazyJavaResolverContext2.getComponents().getModule().getBuiltIns().getArrayElementType(transformJavaType) : null, lazyJavaResolverContext2.getComponents().getSourceElementFactory().source(javaRecordComponent)));
                        i2 = i3;
                    }
                    boolean z = false;
                    createJavaConstructor2.setHasSynthesizedParameterNames(false);
                    DescriptorVisibility visibility = classDescriptor.getVisibility();
                    visibility.getClass();
                    if (visibility.equals(JavaDescriptorVisibilities.PROTECTED_STATIC_VISIBILITY)) {
                        visibility = JavaDescriptorVisibilities.PROTECTED_AND_PACKAGE;
                        visibility.getClass();
                    }
                    createJavaConstructor2.initialize(arrayList3, visibility);
                    createJavaConstructor2.setHasStableParameterNames(false);
                    createJavaConstructor2.setReturnType(classDescriptor.getDefaultType());
                    Object obj2 = null;
                    String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(createJavaConstructor2, false, false, 2, null);
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (!Intrinsics.areEqual(MethodSignatureMappingKt.computeJvmDescriptor$default((ClassConstructorDescriptor) it2.next(), z, z, 2, obj2), computeJvmDescriptor$default)) {
                                obj2 = null;
                                z = false;
                            }
                        }
                    }
                    arrayList.add(createJavaConstructor2);
                    lazyJavaResolverContext.getComponents().getJavaResolverCache().recordConstructor(javaClass, createJavaConstructor2);
                }
                lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().generateConstructors(classDescriptor, arrayList, lazyJavaResolverContext);
                SignatureEnhancement signatureEnhancement = lazyJavaResolverContext.getComponents().getSignatureEnhancement();
                boolean isEmpty = arrayList.isEmpty();
                ArrayList arrayList4 = arrayList;
                if (isEmpty) {
                    boolean isAnnotationType = javaClass.isAnnotationType();
                    if ((javaClass.isInterface() || !javaClass.hasDefaultConstructor()) && !isAnnotationType) {
                        obj = null;
                    } else {
                        ?? createJavaConstructor3 = JavaClassConstructorDescriptor.createJavaConstructor(classDescriptor, Annotations.Companion.getEMPTY(), true, lazyJavaResolverContext2.getComponents().getSourceElementFactory().source(javaClass));
                        createJavaConstructor3.getClass();
                        if (isAnnotationType) {
                            Collection<JavaMethod> methods = javaClass.getMethods();
                            r4 = new ArrayList(methods.size());
                            JavaTypeAttributes attributes$default2 = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, true, false, null, 6, null);
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj3 : methods) {
                                if (Intrinsics.areEqual(((JavaMethod) obj3).getName(), JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME)) {
                                    arrayList5.add(obj3);
                                } else {
                                    arrayList6.add(obj3);
                                }
                            }
                            arrayList5.size();
                            JavaMethod javaMethod = (JavaMethod) CollectionsKt.firstOrNull((List) arrayList5);
                            if (javaMethod != null) {
                                JavaType returnType = javaMethod.getReturnType();
                                if (returnType instanceof JavaArrayType) {
                                    JavaArrayType javaArrayType = (JavaArrayType) returnType;
                                    pair = new Pair(lazyJavaResolverContext2.getTypeResolver().transformArrayType(javaArrayType, attributes$default2, true), lazyJavaResolverContext2.getTypeResolver().transformJavaType(javaArrayType.getComponentType(), attributes$default2));
                                } else {
                                    pair = new Pair(lazyJavaResolverContext2.getTypeResolver().transformJavaType(returnType, attributes$default2), null);
                                }
                                r3.addAnnotationValueParameter(r4, createJavaConstructor3, 0, javaMethod, (KotlinType) pair.first, (KotlinType) pair.second);
                            }
                            int i4 = javaMethod != null ? 1 : 0;
                            Iterator it3 = arrayList6.iterator();
                            int i5 = 0;
                            while (it3.hasNext()) {
                                JavaMethod javaMethod2 = (JavaMethod) it3.next();
                                r3.addAnnotationValueParameter(r4, createJavaConstructor3, i5 + i4, javaMethod2, lazyJavaResolverContext2.getTypeResolver().transformJavaType(javaMethod2.getReturnType(), attributes$default2), null);
                                i5++;
                            }
                        } else {
                            r4 = Collections.EMPTY_LIST;
                        }
                        createJavaConstructor3.setHasSynthesizedParameterNames(false);
                        DescriptorVisibility visibility2 = classDescriptor.getVisibility();
                        visibility2.getClass();
                        if (visibility2.equals(JavaDescriptorVisibilities.PROTECTED_STATIC_VISIBILITY)) {
                            visibility2 = JavaDescriptorVisibilities.PROTECTED_AND_PACKAGE;
                            visibility2.getClass();
                        }
                        createJavaConstructor3.initialize(r4, visibility2);
                        createJavaConstructor3.setHasStableParameterNames(true);
                        createJavaConstructor3.setReturnType(classDescriptor.getDefaultType());
                        lazyJavaResolverContext2.getComponents().getJavaResolverCache().recordConstructor(javaClass, createJavaConstructor3);
                        obj = createJavaConstructor3;
                    }
                    arrayList4 = CollectionsKt__CollectionsKt.listOfNotNull(obj);
                }
                return CollectionsKt.toList(signatureEnhancement.enhanceSignatures(lazyJavaResolverContext, arrayList4));
            default:
                int i6 = LazyJavaClassMemberScope.$r8$clinit;
                return CollectionsKt.toSet(lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().getNestedClassNames(this.arg$0.ownerDescriptor, lazyJavaResolverContext));
        }
    }

    public LazyJavaClassMemberScope$$Lambda$0(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        this.arg$0 = lazyJavaClassMemberScope;
        this.arg$1 = lazyJavaResolverContext;
    }
}
