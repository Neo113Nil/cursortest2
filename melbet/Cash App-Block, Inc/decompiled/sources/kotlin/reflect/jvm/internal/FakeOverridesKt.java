package kotlin.reflect.jvm.internal;

import androidx.camera.video.VideoCapture$$ExternalSyntheticLambda6;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.UnsignedKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeParameterBase;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.KVisibility;
import kotlin.reflect.full.KClassifiers;
import kotlin.reflect.jvm.ReflectJvmMapping;
import kotlin.reflect.jvm.internal.EqualityMode;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.km.ClassKind;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.types.AbstractKType;
import kotlin.reflect.jvm.internal.types.DescriptorKType;
import kotlin.reflect.jvm.internal.types.KTypeSubstitutor;
import kotlin.reflect.jvm.internal.types.MutableCollectionKClass;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public abstract class FakeOverridesKt {
    public static final VideoCapture$$ExternalSyntheticLambda6 modalityIntersectionOverrideComparator = ComparisonsKt__ComparisonsKt.compareBy(UtilKt$$Lambda$0.INSTANCE$8, UtilKt$$Lambda$0.INSTANCE$9);

    public static final KTypeSubstitutor access$substitutedWith(List list, List list2) {
        if (list.size() != list2.size()) {
            return null;
        }
        if (list2.isEmpty() || list.isEmpty()) {
            return KTypeSubstitutor.EMPTY;
        }
        ArrayList zip = CollectionsKt.zip(list, list2);
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(zip, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        Iterator it = zip.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            KTypeParameterBase kTypeParameterBase = (KTypeParameterBase) pair.first;
            KTypeParameterBase kTypeParameterBase2 = (KTypeParameterBase) pair.second;
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            AbstractKType createType$default = KClassifiers.createType$default(kTypeParameterBase2, null, 7);
            companion.getClass();
            linkedHashMap.put(kTypeParameterBase, KTypeProjection.Companion.invariant(createType$default));
        }
        return new KTypeSubstitutor(linkedHashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(r0) == true) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final KType coerceFlexibleTypesAndMutabilityRecursive(KType kType, String str) {
        AbstractKType abstractKType = kType instanceof AbstractKType ? (AbstractKType) kType : null;
        if (abstractKType != null) {
            if (!(abstractKType.getClassifier() instanceof ErrorTypeParameter)) {
                DescriptorKType descriptorKType = abstractKType instanceof DescriptorKType ? (DescriptorKType) abstractKType : null;
                if (descriptorKType != null) {
                    KotlinType kotlinType = descriptorKType.f1540type;
                    if (kotlinType != null) {
                    }
                }
            }
            return kType;
        }
        KClassifier classifier = kType.getClassifier();
        if (classifier != null) {
            List<KTypeProjection> arguments = kType.getArguments();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments, 10));
            for (KTypeProjection kTypeProjection : arguments) {
                KType kType2 = kTypeProjection.f1521type;
                arrayList.add(new KTypeProjection(kType2 != null ? coerceFlexibleTypesAndMutabilityRecursive(kType2, str) : null, kTypeProjection.variance));
            }
            return KClassifiers.createType(classifier, arrayList, false, kType.getAnnotations());
        }
        StringBuilder sb = new StringBuilder("Non-denotable parameter types are not possible. Some parameter types appear non-denotable for type '");
        sb.append(kType);
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(kType.getClass());
        sb.append("' (");
        sb.append(orCreateKotlinClass);
        sb.append(") which belongs to member '");
        sb.append(str);
        sb.append('\'');
        throw new IllegalStateException(sb.toString().toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x0302, code lost:
    
        if (isStatic(r4) == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0305, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v8, types: [androidx.camera.video.VideoCapture$$ExternalSyntheticLambda6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.reflect.jvm.internal.DescriptorKCallable] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, kotlin.reflect.jvm.internal.DescriptorKCallable] */
    /* JADX WARN: Type inference failed for: r4v15, types: [kotlin.reflect.jvm.internal.CovariantOverrideComparator] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.reflect.jvm.internal.DescriptorKCallable] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.lang.Object, kotlin.reflect.jvm.internal.DescriptorKCallable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final FakeOverrideMembers computeFakeOverrideMembers(KClassImpl kClassImpl) {
        Field javaField;
        Class<?> declaringClass;
        ReceiverParameterDescriptor receiverParameterDescriptor;
        boolean z;
        KTypeSubstitutor kTypeSubstitutor;
        Field javaField2;
        Class<?> declaringClass2;
        HashMap hashMap = new HashMap();
        ReceiverParameterDescriptor thisAsReceiverParameter = kClassImpl.getDescriptor().getThisAsReceiverParameter();
        thisAsReceiverParameter.getClass();
        Class jClass = kClassImpl.getJClass();
        jClass.getClass();
        boolean z2 = jClass.getAnnotation(Metadata.class) != null;
        HashMap hashMap2 = new HashMap();
        EqualityMode.KotlinSignature kotlinSignature = EqualityMode.KotlinSignature.INSTANCE;
        if (z2) {
            for (?? r9 : getDeclaredDescriptorKCallableMembers(kClassImpl)) {
                if (r9.getVisibility() != KVisibility.PRIVATE && (!isStatic(r9) || kClassImpl.getClassKind$kotlin_reflection() != ClassKind.INTERFACE || ((r9 instanceof KProperty) && (javaField2 = ReflectJvmMapping.getJavaField((KProperty) r9)) != null && (declaringClass2 = javaField2.getDeclaringClass()) != null && declaringClass2.getAnnotation(Metadata.class) == null))) {
                    hashMap2.put(toEquatableCallableSignature(r9, kotlinSignature), r9);
                }
            }
        }
        Iterator it = kClassImpl.getSupertypes().iterator();
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            boolean hasNext = it.hasNext();
            EqualityMode.JavaSignature javaSignature = EqualityMode.JavaSignature.INSTANCE;
            if (!hasNext) {
                boolean z5 = z2;
                for (Map.Entry entry : hashMap2.entrySet()) {
                    EquatableCallableSignature equatableCallableSignature = (EquatableCallableSignature) entry.getKey();
                    DescriptorKCallable descriptorKCallable = (DescriptorKCallable) entry.getValue();
                    z3 = z3 || isStatic(descriptorKCallable);
                    z4 = z4 || Intrinsics.areEqual(descriptorKCallable.getDescriptor().getVisibility(), JavaDescriptorVisibilities.PACKAGE_VISIBILITY);
                    hashMap.put(new EquatableCallableSignature(equatableCallableSignature.kind, equatableCallableSignature.name, equatableCallableSignature.jvmNameIfFunction, equatableCallableSignature.typeParameters, equatableCallableSignature.kotlinParameterTypes, equatableCallableSignature.javaParameterTypesIfFunction, equatableCallableSignature.javaGenericParameterTypesIfFunction, equatableCallableSignature.isStatic, javaSignature), descriptorKCallable);
                }
                if (!z5) {
                    for (?? r4 : getDeclaredDescriptorKCallableMembers(kClassImpl)) {
                        if (r4.getVisibility() != KVisibility.PRIVATE && (!isStatic(r4) || kClassImpl.getClassKind$kotlin_reflection() != ClassKind.INTERFACE || ((r4 instanceof KProperty) && (javaField = ReflectJvmMapping.getJavaField((KProperty) r4)) != null && (declaringClass = javaField.getDeclaringClass()) != null && declaringClass.getAnnotation(Metadata.class) == null))) {
                            z3 = true;
                            z4 = z4 || Intrinsics.areEqual(r4.getDescriptor().getVisibility(), JavaDescriptorVisibilities.PACKAGE_VISIBILITY);
                            hashMap.put(toEquatableCallableSignature(r4, javaSignature), r4);
                        }
                    }
                }
                return new FakeOverrideMembers(hashMap, z3, z4);
            }
            KType kType = (KType) it.next();
            KClassifier classifier = kType.getClassifier();
            KClass kClass = classifier instanceof KClass ? (KClass) classifier : null;
            if (kClass == null) {
                Path$$ExternalSyntheticBUOutline0.m("Non-denotable supertypes are not possible. Supertype '", kType, "' appears non-denotable in class '", kClassImpl);
                return null;
            }
            KTypeSubstitutor kTypeSubstitutor2 = KTypeSubstitutor.EMPTY;
            KTypeSubstitutor create = UnsignedKt.create(kType);
            FakeOverrideMembers fakeOverrideMembers = getFakeOverrideMembers(kClass);
            z3 = z3 || fakeOverrideMembers.containsInheritedStatics;
            z4 = z4 || fakeOverrideMembers.containsPackagePrivate;
            Iterator it2 = fakeOverrideMembers.members.entrySet().iterator();
            while (it2.hasNext()) {
                DescriptorKCallable descriptorKCallable2 = (DescriptorKCallable) ((Map.Entry) it2.next()).getValue();
                KCallableOverriddenStorage kCallableOverriddenStorage = descriptorKCallable2.overriddenStorage;
                ReceiverParameterDescriptor receiverParameterDescriptor2 = isStatic(descriptorKCallable2) ? null : thisAsReceiverParameter;
                KTypeSubstitutor kTypeSubstitutor3 = descriptorKCallable2.overriddenStorage.typeSubstitutor;
                kTypeSubstitutor3.getClass();
                create.getClass();
                Map map = kTypeSubstitutor3.substitution;
                if (map.isEmpty()) {
                    receiverParameterDescriptor = thisAsReceiverParameter;
                    z = z2;
                    kTypeSubstitutor = create;
                } else {
                    if (create.substitution.isEmpty()) {
                        receiverParameterDescriptor = thisAsReceiverParameter;
                        z = z2;
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(map.size()));
                        for (Map.Entry entry2 : map.entrySet()) {
                            Object key = entry2.getKey();
                            KTypeProjection kTypeProjection = (KTypeProjection) entry2.getValue();
                            ReceiverParameterDescriptor receiverParameterDescriptor3 = thisAsReceiverParameter;
                            KType kType2 = kTypeProjection.f1521type;
                            boolean z6 = z2;
                            KVariance kVariance = kTypeProjection.variance;
                            if (kType2 != null && kVariance != null) {
                                kTypeProjection = create.substitute(kType2, kVariance);
                            }
                            linkedHashMap.put(key, kTypeProjection);
                            thisAsReceiverParameter = receiverParameterDescriptor3;
                            z2 = z6;
                        }
                        receiverParameterDescriptor = thisAsReceiverParameter;
                        z = z2;
                        kTypeSubstitutor3 = new KTypeSubstitutor(linkedHashMap);
                    }
                    kTypeSubstitutor = kTypeSubstitutor3;
                }
                ?? shallowCopy$kotlin_reflection = descriptorKCallable2.shallowCopy$kotlin_reflection(KCallableOverriddenStorage.copy$default(kCallableOverriddenStorage, receiverParameterDescriptor2, kTypeSubstitutor, null, false, false, false, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE));
                EquatableCallableSignature equatableCallableSignature2 = toEquatableCallableSignature(shallowCopy$kotlin_reflection, kotlinSignature);
                if (!hashMap2.containsKey(equatableCallableSignature2)) {
                    EquatableCallableSignature equatableCallableSignature3 = new EquatableCallableSignature(equatableCallableSignature2.kind, equatableCallableSignature2.name, equatableCallableSignature2.jvmNameIfFunction, equatableCallableSignature2.typeParameters, equatableCallableSignature2.kotlinParameterTypes, equatableCallableSignature2.javaParameterTypesIfFunction, equatableCallableSignature2.javaGenericParameterTypesIfFunction, equatableCallableSignature2.isStatic, javaSignature);
                    Object obj = hashMap.get(equatableCallableSignature3);
                    if (obj != null) {
                        ?? r2 = (DescriptorKCallable) obj;
                        DescriptorKCallable descriptorKCallable3 = CovariantOverrideComparator.INSTANCE.compare(r2, shallowCopy$kotlin_reflection) <= 0 ? r2 : shallowCopy$kotlin_reflection;
                        if ((r2 instanceof KFunction) && (shallowCopy$kotlin_reflection instanceof KFunction)) {
                            KCallableOverriddenStorage kCallableOverriddenStorage2 = descriptorKCallable3.overriddenStorage;
                            KFunction kFunction = (KFunction) r2;
                            boolean z7 = kFunction.isOperator() || ((KFunction) shallowCopy$kotlin_reflection).isOperator();
                            boolean z8 = kFunction.isInfix() || ((KFunction) shallowCopy$kotlin_reflection).isInfix();
                            boolean z9 = kFunction.isInline() || ((KFunction) shallowCopy$kotlin_reflection).isInline();
                            boolean z10 = kFunction.isExternal() || ((KFunction) shallowCopy$kotlin_reflection).isExternal();
                            ?? r13 = modalityIntersectionOverrideComparator;
                            r13.getClass();
                            int compare = r13.compare(r2, shallowCopy$kotlin_reflection);
                            DescriptorKCallable descriptorKCallable4 = r2;
                            if (compare > 0) {
                                descriptorKCallable4 = shallowCopy$kotlin_reflection;
                            }
                            descriptorKCallable3 = descriptorKCallable3.shallowCopy$kotlin_reflection(KCallableOverriddenStorage.copy$default(kCallableOverriddenStorage2, null, null, descriptorKCallable4.getModality$kotlin_reflection(), z10, z7, z8, z9, 11));
                        }
                        if (descriptorKCallable3 != null) {
                            shallowCopy$kotlin_reflection = descriptorKCallable3;
                        }
                    }
                    hashMap.put(equatableCallableSignature3, shallowCopy$kotlin_reflection);
                }
                thisAsReceiverParameter = receiverParameterDescriptor;
                z2 = z;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f9, code lost:
    
        r3.put(toEquatableCallableSignature(r6, r8), r6);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList getAllMembers(KClassImpl kClassImpl) {
        HashMap hashMap;
        Field javaField;
        Class<?> declaringClass;
        ReflectProperties$LazySoftVal reflectProperties$LazySoftVal = ((KClassImpl.Data) kClassImpl.data.getValue()).fakeOverrideMembers$delegate;
        KProperty kProperty = KClassImpl.Data.$$delegatedProperties[18];
        Object invoke = reflectProperties$LazySoftVal.invoke();
        invoke.getClass();
        FakeOverrideMembers fakeOverrideMembers = (FakeOverrideMembers) invoke;
        Class jClass = kClassImpl.getJClass();
        jClass.getClass();
        boolean z = jClass.getAnnotation(Metadata.class) != null;
        boolean z2 = fakeOverrideMembers.containsInheritedStatics;
        HashMap hashMap2 = fakeOverrideMembers.members;
        boolean z3 = z2 && kClassImpl.getClassKind$kotlin_reflection() != ClassKind.ENUM_CLASS && z;
        boolean z4 = fakeOverrideMembers.containsPackagePrivate || z3;
        if (z4) {
            hashMap = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.newHashMapWithExpectedSize(hashMap2.size());
            for (Map.Entry entry : hashMap2.entrySet()) {
                DescriptorKCallable descriptorKCallable = (DescriptorKCallable) entry.getValue();
                if (!z3 || !isStatic(descriptorKCallable)) {
                    if (Intrinsics.areEqual(descriptorKCallable.getDescriptor().getVisibility(), JavaDescriptorVisibilities.PACKAGE_VISIBILITY)) {
                        Package r7 = descriptorKCallable.getContainer().getJClass().getPackage();
                        Class jClass2 = kClassImpl.getJClass();
                        jClass2.getClass();
                        if (!Intrinsics.areEqual(r7, jClass2.getPackage())) {
                        }
                    }
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
        } else {
            if (z4) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            hashMap = new HashMap(hashMap2);
        }
        HashMap hashMap3 = new HashMap();
        for (DescriptorKCallable descriptorKCallable2 : getDeclaredDescriptorKCallableMembers(kClassImpl)) {
            boolean isStatic = isStatic(descriptorKCallable2);
            EqualityMode.JavaSignature javaSignature = EqualityMode.JavaSignature.INSTANCE;
            if (isStatic && kClassImpl.getClassKind$kotlin_reflection() == ClassKind.INTERFACE && (!(descriptorKCallable2 instanceof KProperty) || (javaField = ReflectJvmMapping.getJavaField((KProperty) descriptorKCallable2)) == null || (declaringClass = javaField.getDeclaringClass()) == null || declaringClass.getAnnotation(Metadata.class) != null)) {
                f$$ExternalSyntheticLambda0.m(39, descriptorKCallable2.getName(), "' appears to be declared static member in '", kClassImpl.getSimpleName(), "Kotlin doesn't have statics. '");
                return null;
            }
            if (descriptorKCallable2.getVisibility() == KVisibility.PRIVATE) {
                if (z) {
                    hashMap3.put(toEquatableCallableSignature(descriptorKCallable2, EqualityMode.KotlinSignature.INSTANCE), descriptorKCallable2);
                } else {
                    hashMap.put(toEquatableCallableSignature(descriptorKCallable2, javaSignature), descriptorKCallable2);
                }
            }
        }
        Collection values = hashMap.values();
        values.getClass();
        return CollectionsKt.plus((Iterable) hashMap3.values(), values);
    }

    public static final Collection getDeclaredDescriptorKCallableMembers(KClassImpl kClassImpl) {
        ReflectProperties$LazySoftVal reflectProperties$LazySoftVal = ((KClassImpl.Data) kClassImpl.data.getValue()).declaredMembers$delegate;
        KProperty kProperty = KClassImpl.Data.$$delegatedProperties[16];
        Object invoke = reflectProperties$LazySoftVal.invoke();
        invoke.getClass();
        return (Collection) invoke;
    }

    public static final FakeOverrideMembers getFakeOverrideMembers(KClass kClass) {
        if (kClass instanceof KClassImpl) {
            ReflectProperties$LazySoftVal reflectProperties$LazySoftVal = ((KClassImpl.Data) ((KClassImpl) kClass).data.getValue()).fakeOverrideMembers$delegate;
            KProperty kProperty = KClassImpl.Data.$$delegatedProperties[18];
            Object invoke = reflectProperties$LazySoftVal.invoke();
            invoke.getClass();
            return (FakeOverrideMembers) invoke;
        }
        if (kClass instanceof MutableCollectionKClass) {
            return getFakeOverrideMembers(((MutableCollectionKClass) kClass).klass);
        }
        a$$ExternalSyntheticBUOutline0.m(Reflection.factory.getOrCreateKotlinClass(kClass.getClass()), "Unknown type ");
        return null;
    }

    public static final boolean isStatic(DescriptorKCallable descriptorKCallable) {
        descriptorKCallable.getClass();
        return UtilKt.getInstanceReceiverParameter(descriptorKCallable) == null;
    }

    public static final void starProjectionInTopLevelTypeIsNotPossible(Object obj) {
        obj.getClass();
        throw new IllegalStateException(("Star projection in top level type is not possible. Star projection appeared in the following container: '" + obj + '\'').toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final EquatableCallableSignature toEquatableCallableSignature(DescriptorKCallable descriptorKCallable, EqualityMode equalityMode) {
        SignatureKind signatureKind;
        Field javaField;
        Class<?> declaringClass;
        List parameters = descriptorKCallable.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((ReflectKParameter) obj).getKind() != KParameter$Kind.INSTANCE) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ReflectKParameter) it.next()).getType());
        }
        boolean z = descriptorKCallable instanceof KProperty;
        if (z && (javaField = ReflectJvmMapping.getJavaField((KProperty) descriptorKCallable)) != null && (declaringClass = javaField.getDeclaringClass()) != null && declaringClass.getAnnotation(Metadata.class) == null) {
            signatureKind = SignatureKind.FIELD_IN_JAVA_CLASS;
        } else if (z) {
            signatureKind = SignatureKind.PROPERTY;
        } else {
            if (!(descriptorKCallable instanceof KFunction)) {
                a$$ExternalSyntheticBUOutline0.m(Reflection.factory.getOrCreateKotlinClass(descriptorKCallable.getClass()), "Unknown kind for ");
                return null;
            }
            signatureKind = SignatureKind.FUNCTION;
        }
        SignatureKind signatureKind2 = signatureKind;
        KFunction kFunction = descriptorKCallable instanceof KFunction ? (KFunction) descriptorKCallable : null;
        Method javaMethod = kFunction != null ? ReflectJvmMapping.getJavaMethod(kFunction) : null;
        Type[] genericParameterTypes = javaMethod != null ? javaMethod.getGenericParameterTypes() : null;
        if (genericParameterTypes == null) {
            genericParameterTypes = new Type[0];
        }
        List list = ArraysKt___ArraysKt.toList(genericParameterTypes);
        Class<?>[] parameterTypes = javaMethod != null ? javaMethod.getParameterTypes() : null;
        if (parameterTypes == null) {
            parameterTypes = new Class[0];
        }
        return new EquatableCallableSignature(signatureKind2, descriptorKCallable.getName(), javaMethod != null ? javaMethod.getName() : null, descriptorKCallable.getTypeParameters(), arrayList2, ArraysKt___ArraysKt.toList(parameterTypes), list, isStatic(descriptorKCallable), equalityMode);
    }
}
