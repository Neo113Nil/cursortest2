package kotlin.reflect.jvm.internal;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.google.maps.android.compose.MapEffectKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.KTypesJvm;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.km.Attributes;
import kotlin.reflect.jvm.internal.impl.km.KmAnnotation;
import kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.km.KmClass;
import kotlin.reflect.jvm.internal.impl.km.KmClassifier;
import kotlin.reflect.jvm.internal.impl.km.KmConstructor;
import kotlin.reflect.jvm.internal.impl.km.KmFlexibleTypeUpperBound;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;
import kotlin.reflect.jvm.internal.impl.km.KmType;
import kotlin.reflect.jvm.internal.impl.km.KmVariance;
import kotlin.reflect.jvm.internal.impl.km.Visibility;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmExtensionsKt;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmFieldSignature;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.NameUtils;
import kotlin.reflect.jvm.internal.types.AbstractKType;
import kotlin.reflect.jvm.internal.types.FlexibleKType;
import kotlin.reflect.jvm.internal.types.MutableCollectionKClass;
import kotlin.reflect.jvm.internal.types.MutableCollectionKClassKt;
import kotlin.reflect.jvm.internal.types.SimpleKType;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.TakeWhileSequence;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.PapaEvent;

/* loaded from: classes9.dex */
public abstract class ConvertFromMetadataKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[KmVariance.values().length];
            try {
                iArr[KmVariance.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KmVariance.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KmVariance.INVARIANT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Visibility.values().length];
            try {
                iArr2[Visibility.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Visibility.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Visibility.PROTECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Visibility.PUBLIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Visibility.PRIVATE_TO_THIS.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Visibility.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final String computeJvmSignature(KmProperty kmProperty, KDeclarationContainerImpl kDeclarationContainerImpl) {
        String str;
        KotlinClassHeader classHeader;
        String jvmMethodSignature;
        JvmMethodSignature getterSignature = JvmExtensionsKt.getGetterSignature(kmProperty);
        if (getterSignature != null && (jvmMethodSignature = getterSignature.toString()) != null) {
            return jvmMethodSignature;
        }
        JvmFieldSignature fieldSignature = JvmExtensionsKt.getFieldSignature(kmProperty);
        KotlinClassHeader.Kind kind = null;
        kind = null;
        if (fieldSignature == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(JvmAbi.getterName(fieldSignature.getName()));
        if (Attributes.getVisibility(kmProperty) == Visibility.INTERNAL && (kDeclarationContainerImpl instanceof KClassImpl)) {
            KmClass kmClass = ((KClassImpl) kDeclarationContainerImpl).getKmClass();
            String moduleName = kmClass != null ? JvmExtensionsKt.getModuleName(kmClass) : null;
            if (moduleName == null) {
                moduleName = "main";
            }
            str = "$" + NameUtils.sanitizeAsJavaIdentifier(moduleName);
        } else {
            if (Attributes.getVisibility(kmProperty) == Visibility.PRIVATE && (kDeclarationContainerImpl instanceof KPackageImpl)) {
                KPackageImpl kPackageImpl = (KPackageImpl) kDeclarationContainerImpl;
                ReflectProperties$LazySoftVal reflectProperties$LazySoftVal = ((KPackageImpl.Data) kPackageImpl.data.getValue()).kotlinClass$delegate;
                KProperty kProperty = KPackageImpl.Data.$$delegatedProperties[0];
                ReflectKotlinClass reflectKotlinClass = (ReflectKotlinClass) reflectProperties$LazySoftVal.invoke();
                if (reflectKotlinClass != null && (classHeader = reflectKotlinClass.getClassHeader()) != null) {
                    kind = classHeader.getKind();
                }
                if (kind == KotlinClassHeader.Kind.MULTIFILE_CLASS_PART) {
                    str = "$".concat(kPackageImpl.jClass.getSimpleName());
                }
            }
            str = "";
        }
        sb.append(str);
        sb.append("()");
        sb.append(fieldSignature.getDescriptor());
        return sb.toString();
    }

    public static final KotlinKConstructor createUnboundConstructor(KmConstructor kmConstructor, KDeclarationContainerImpl kDeclarationContainerImpl) {
        String jvmMethodSignature;
        kmConstructor.getClass();
        JvmMethodSignature signature = JvmExtensionsKt.getSignature(kmConstructor);
        if (signature != null && (jvmMethodSignature = signature.toString()) != null) {
            return new KotlinKConstructor(kDeclarationContainerImpl, jvmMethodSignature, CallableReference.NO_RECEIVER, kmConstructor);
        }
        throw new KotlinReflectionInternalError("No signature for constructor (" + kmConstructor.getValueParameters().size() + " parameters, declared in " + kDeclarationContainerImpl + ')');
    }

    public static final KClass loadKClass(ClassLoader classLoader, String str) {
        classLoader.getClass();
        str.getClass();
        Class loadClass = UtilKt.loadClass(classLoader, toClassId(str), 0);
        if (loadClass != null) {
            return Reflection.factory.getOrCreateKotlinClass(loadClass);
        }
        return null;
    }

    public static final Annotation toAnnotation(KmAnnotation kmAnnotation, ClassLoader classLoader) {
        kmAnnotation.getClass();
        classLoader.getClass();
        Class loadClass = UtilKt.loadClass(classLoader, toClassId(kmAnnotation.getClassName()), 0);
        if (loadClass == null) {
            f$$ExternalSyntheticLambda0.m$2(kmAnnotation.getClassName(), "Annotation class not found: ");
            return null;
        }
        Map<String, KmAnnotationArgument> arguments = kmAnnotation.getArguments();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(arguments.size()));
        Iterator<T> it = arguments.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), toAnnotationArgument((KmAnnotationArgument) entry.getValue(), kmAnnotation.getClassName(), (String) entry.getKey(), classLoader));
        }
        return (Annotation) MapEffectKt.createAnnotationInstance$default(loadClass, linkedHashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0090, code lost:
    
        if (r1 == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object toAnnotationArgument(KmAnnotationArgument kmAnnotationArgument, String str, String str2, ClassLoader classLoader) {
        List parameters;
        KType type2;
        if (kmAnnotationArgument instanceof KmAnnotationArgument.AnnotationValue) {
            return toAnnotation(((KmAnnotationArgument.AnnotationValue) kmAnnotationArgument).getAnnotation(), classLoader);
        }
        int i = 0;
        Object obj = null;
        if (kmAnnotationArgument instanceof KmAnnotationArgument.ArrayKClassValue) {
            KmAnnotationArgument.ArrayKClassValue arrayKClassValue = (KmAnnotationArgument.ArrayKClassValue) kmAnnotationArgument;
            KClass loadKClass = loadKClass(classLoader, arrayKClassValue.getClassName());
            if (loadKClass == null) {
                f$$ExternalSyntheticLambda0.m$2(arrayKClassValue.getClassName(), "Unresolved class: ");
                return null;
            }
            Class javaClass = PapaEvent.getJavaClass(loadKClass);
            int arrayDimensionCount = arrayKClassValue.getArrayDimensionCount();
            while (i < arrayDimensionCount) {
                javaClass = UtilKt.createArrayType(javaClass);
                i++;
            }
            return javaClass;
        }
        if (kmAnnotationArgument instanceof KmAnnotationArgument.ArrayValue) {
            KClass loadKClass2 = loadKClass(classLoader, str);
            if (loadKClass2 != null) {
                if (!PapaEvent.getJavaClass(loadKClass2).isAnnotation()) {
                    loadKClass2 = null;
                }
                if (loadKClass2 != null) {
                    KFunction kFunction = (KFunction) CollectionsKt.singleOrNull(loadKClass2.getConstructors());
                    if (kFunction != null && (parameters = kFunction.getParameters()) != null) {
                        Iterator it = parameters.iterator();
                        boolean z = false;
                        Object obj2 = null;
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (Intrinsics.areEqual(((ReflectKParameter) next).getName(), str2)) {
                                    if (z) {
                                        break;
                                    }
                                    z = true;
                                    obj2 = next;
                                }
                            }
                        }
                        obj2 = null;
                        ReflectKParameter reflectKParameter = (ReflectKParameter) obj2;
                        if (reflectKParameter != null && (type2 = reflectKParameter.getType()) != null) {
                            KClassifier classifier = type2.getClassifier();
                            KClass kClass = classifier instanceof KClass ? (KClass) classifier : null;
                            if (kClass == null) {
                                f$$ExternalSyntheticLambda0.m$1(type2, "Array parameter type is not a class: ");
                                return null;
                            }
                            Class javaClass2 = PapaEvent.getJavaClass(kClass);
                            KmAnnotationArgument.ArrayValue arrayValue = (KmAnnotationArgument.ArrayValue) kmAnnotationArgument;
                            Object newInstance = Array.newInstance(Intrinsics.areEqual(javaClass2.getComponentType(), KClass.class) ? Class.class : javaClass2.getComponentType(), arrayValue.getElements().size());
                            Iterator<T> it2 = arrayValue.getElements().iterator();
                            while (it2.hasNext()) {
                                Array.set(newInstance, i, toAnnotationArgument((KmAnnotationArgument) it2.next(), str, null, classLoader));
                                i++;
                            }
                            newInstance.getClass();
                            return newInstance;
                        }
                    }
                    throw new KotlinReflectionInternalError(CameraSelector$$ExternalSyntheticOutline0.m("No parameter ", str2, " found in annotation constructor of ", str));
                }
            }
            throw new KotlinReflectionInternalError("Not an annotation class: ".concat(str));
        }
        if (!(kmAnnotationArgument instanceof KmAnnotationArgument.EnumValue)) {
            if (!(kmAnnotationArgument instanceof KmAnnotationArgument.KClassValue)) {
                if (kmAnnotationArgument instanceof KmAnnotationArgument.LiteralValue) {
                    return ((KmAnnotationArgument.LiteralValue) kmAnnotationArgument).getValue();
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            KmAnnotationArgument.KClassValue kClassValue = (KmAnnotationArgument.KClassValue) kmAnnotationArgument;
            Class loadClass = UtilKt.loadClass(classLoader, toClassId(kClassValue.getClassName()), 0);
            if (loadClass != null) {
                return loadClass;
            }
            f$$ExternalSyntheticLambda0.m$2(kClassValue.getClassName(), "Unresolved class: ");
            return null;
        }
        KmAnnotationArgument.EnumValue enumValue = (KmAnnotationArgument.EnumValue) kmAnnotationArgument;
        Class loadClass2 = UtilKt.loadClass(classLoader, toClassId(enumValue.getEnumClassName()), 0);
        if (loadClass2 == null) {
            f$$ExternalSyntheticLambda0.m$2(enumValue.getEnumClassName(), "Unresolved enum class: ");
            return null;
        }
        Object[] enumConstants = loadClass2.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        boolean z2 = false;
        Object obj3 = null;
        while (true) {
            if (i < length) {
                Object obj4 = enumConstants[i];
                obj4.getClass();
                if (Intrinsics.areEqual(((Enum) obj4).name(), enumValue.getEnumEntryName())) {
                    if (z2) {
                        break;
                    }
                    obj3 = obj4;
                    z2 = true;
                }
                i++;
            } else if (z2) {
                obj = obj3;
            }
        }
        if (obj != null) {
            return obj;
        }
        throw new KotlinReflectionInternalError("Unresolved enum entry: " + enumValue.getEnumClassName() + '.' + enumValue.getEnumEntryName());
    }

    public static final ClassId toClassId(String str) {
        str.getClass();
        boolean startsWith = StringsKt__StringsJVMKt.startsWith(str, ".", false);
        if (startsWith) {
            str = str.substring(1);
        }
        int lastIndexOf$default = StringsKt.lastIndexOf$default('/', 0, 6, (CharSequence) str);
        return new ClassId(new FqName(StringsKt__StringsJVMKt.replace(lastIndexOf$default == -1 ? "" : str.substring(0, lastIndexOf$default), '/', '.', false)), new FqName(StringsKt.substringAfterLast('/', str, str)), startsWith);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d0 A[LOOP:0: B:10:0x00ca->B:12:0x00d0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AbstractKType toKType(KmType kmType, ClassLoader classLoader, TypeParameterTable typeParameterTable, Function0 function0) {
        KClassifier kClassifier;
        KClassifier kClassifier2;
        Iterator<T> it;
        KmClassifier.Class r0;
        MutableCollectionKClass mutableCollectionKClass;
        KmFlexibleTypeUpperBound flexibleTypeUpperBound;
        Object obj;
        SimpleKType simpleKType;
        KType kType;
        KTypeProjection kTypeProjection;
        KType kType2;
        String name;
        ClassId classId;
        kmType.getClass();
        classLoader.getClass();
        typeParameterTable.getClass();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        List list = SequencesKt___SequencesKt.toList(new TakeWhileSequence(SequencesKt___SequencesKt.flatMapIterable(SequencesKt__SequencesKt.generateSequence(UtilKt$$Lambda$0.INSTANCE$6, kmType), UtilKt$$Lambda$0.INSTANCE$7), new ConvertFromMetadataKt$$Lambda$2(classLoader, typeParameterTable, function0, ref$ObjectRef, 0)));
        KmClassifier classifier = kmType.getClassifier();
        if (classifier instanceof KmClassifier.Class) {
            KmClassifier.Class r02 = (KmClassifier.Class) classifier;
            if (Intrinsics.areEqual(r02.getName(), "kotlin/Array")) {
                KType kType3 = ((KTypeProjection) CollectionsKt.single(list)).f1521type;
                if (kType3 == null) {
                    kType3 = StandardKTypes.ANY;
                }
                kClassifier2 = Reflection.factory.getOrCreateKotlinClass(UtilKt.createArrayType(PapaEvent.getJavaClass(KTypesJvm.getJvmErasure(kType3))));
                boolean isNullable = Attributes.isNullable(kmType);
                List<KmAnnotation> annotations = JvmExtensionsKt.getAnnotations(kmType);
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(annotations, 10));
                it = annotations.iterator();
                while (it.hasNext()) {
                    arrayList.add(toAnnotation((KmAnnotation) it.next(), classLoader));
                }
                KmType abbreviatedType = kmType.getAbbreviatedType();
                AbstractKType kType4 = abbreviatedType == null ? toKType(abbreviatedType, classLoader, typeParameterTable, null) : null;
                boolean isDefinitelyNonNull = Attributes.isDefinitelyNonNull(kmType);
                KmClassifier classifier2 = kmType.getClassifier();
                KmClassifier.Class r03 = !(classifier2 instanceof KmClassifier.Class) ? (KmClassifier.Class) classifier2 : null;
                boolean areEqual = Intrinsics.areEqual(r03 == null ? r03.getName() : null, "kotlin/Nothing");
                boolean isSuspend = Attributes.isSuspend(kmType);
                KmClassifier classifier3 = kmType.getClassifier();
                r0 = !(classifier3 instanceof KmClassifier.Class) ? (KmClassifier.Class) classifier3 : null;
                if (r0 != null && (name = r0.getName()) != null) {
                    classId = toClassId(name);
                    if (JavaToKotlinClassMap.INSTANCE.isMutable(classId)) {
                        mutableCollectionKClass = MutableCollectionKClassKt.getMutableCollectionKClass((KClass) kClassifier2, classId.asSingleFqName());
                        ref$ObjectRef.element = new SimpleKType(kClassifier2, list, isNullable, arrayList, kType4, isDefinitelyNonNull, areEqual, isSuspend, mutableCollectionKClass, function0);
                        if (Attributes.isSuspend(kmType)) {
                            Object obj2 = ref$ObjectRef.element;
                            if (obj2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("result");
                                throw null;
                            }
                            SimpleKType simpleKType2 = (SimpleKType) obj2;
                            boolean z = simpleKType2.isSuspendFunctionType;
                            List list2 = simpleKType2.arguments;
                            if (!z) {
                                Path$$ExternalSyntheticBUOutline0.m$3(simpleKType2, "Not a suspend function type: ");
                                return null;
                            }
                            KTypeProjection kTypeProjection2 = (KTypeProjection) CollectionsKt.getOrNull(list2.size() - 2, list2);
                            if (kTypeProjection2 == null || (kType = kTypeProjection2.f1521type) == null || !Intrinsics.areEqual(kType.getClassifier(), Reflection.factory.getOrCreateKotlinClass(Continuation.class)) || (kTypeProjection = (KTypeProjection) CollectionsKt.singleOrNull(kType.getArguments())) == null || (kType2 = kTypeProjection.f1521type) == null) {
                                simpleKType = null;
                            } else {
                                KClassifier kClassifier3 = simpleKType2.classifier;
                                List dropLast = CollectionsKt.dropLast(2, list2);
                                KTypeProjection.INSTANCE.getClass();
                                simpleKType = new SimpleKType(kClassifier3, CollectionsKt.plus((Collection) dropLast, (Object) KTypeProjection.Companion.invariant(kType2)), simpleKType2.isMarkedNullable, simpleKType2.annotations, simpleKType2.abbreviation, simpleKType2.isDefinitelyNotNullType, simpleKType2.isNothingType, true, simpleKType2.mutableCollectionClass, function0);
                            }
                            if (simpleKType == null) {
                                StringBuilder sb = new StringBuilder("Invalid suspend function type: ");
                                Object obj3 = ref$ObjectRef.element;
                                if (obj3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("result");
                                    throw null;
                                }
                                sb.append((SimpleKType) obj3);
                                throw new KotlinReflectionInternalError(sb.toString());
                            }
                            ref$ObjectRef.element = simpleKType;
                        }
                        flexibleTypeUpperBound = kmType.getFlexibleTypeUpperBound();
                        if (flexibleTypeUpperBound != null || !Intrinsics.areEqual(flexibleTypeUpperBound.getTypeFlexibilityId(), "kotlin.jvm.PlatformType")) {
                            obj = ref$ObjectRef.element;
                            if (obj != null) {
                                return (SimpleKType) obj;
                            }
                            Intrinsics.throwUninitializedPropertyAccessException("result");
                            throw null;
                        }
                        Object obj4 = ref$ObjectRef.element;
                        if (obj4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("result");
                            throw null;
                        }
                        SimpleKType simpleKType3 = (SimpleKType) obj4;
                        AbstractKType kType5 = toKType(flexibleTypeUpperBound.getType(), classLoader, typeParameterTable, null);
                        kType5.getClass();
                        SimpleKType simpleKType4 = (SimpleKType) kType5;
                        return simpleKType3.equals(simpleKType4) ? simpleKType3 : new FlexibleKType(simpleKType3, simpleKType4, JvmExtensionsKt.isRaw(kmType), function0);
                    }
                }
                mutableCollectionKClass = null;
                ref$ObjectRef.element = new SimpleKType(kClassifier2, list, isNullable, arrayList, kType4, isDefinitelyNonNull, areEqual, isSuspend, mutableCollectionKClass, function0);
                if (Attributes.isSuspend(kmType)) {
                }
                flexibleTypeUpperBound = kmType.getFlexibleTypeUpperBound();
                if (flexibleTypeUpperBound != null) {
                }
                obj = ref$ObjectRef.element;
                if (obj != null) {
                }
            } else {
                kClassifier = loadKClass(classLoader, r02.getName());
                if (kClassifier == null) {
                    f$$ExternalSyntheticLambda0.m$2(r02.getName(), "Class not found: ");
                    return null;
                }
            }
        } else if (classifier instanceof KmClassifier.TypeAlias) {
            kClassifier = new KTypeAliasImpl(toClassId(((KmClassifier.TypeAlias) classifier).getName()).asSingleFqName());
        } else {
            if (!(classifier instanceof KmClassifier.TypeParameter)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            KmClassifier.TypeParameter typeParameter = (KmClassifier.TypeParameter) classifier;
            kClassifier = typeParameterTable.get(typeParameter.getId());
            if (kClassifier == null) {
                kClassifier = new ErrorTypeParameter(typeParameter.getId());
            }
        }
        kClassifier2 = kClassifier;
        boolean isNullable2 = Attributes.isNullable(kmType);
        List<KmAnnotation> annotations2 = JvmExtensionsKt.getAnnotations(kmType);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(annotations2, 10));
        it = annotations2.iterator();
        while (it.hasNext()) {
        }
        KmType abbreviatedType2 = kmType.getAbbreviatedType();
        if (abbreviatedType2 == null) {
        }
        boolean isDefinitelyNonNull2 = Attributes.isDefinitelyNonNull(kmType);
        KmClassifier classifier22 = kmType.getClassifier();
        if (!(classifier22 instanceof KmClassifier.Class)) {
        }
        boolean areEqual2 = Intrinsics.areEqual(r03 == null ? r03.getName() : null, "kotlin/Nothing");
        boolean isSuspend2 = Attributes.isSuspend(kmType);
        KmClassifier classifier32 = kmType.getClassifier();
        if (!(classifier32 instanceof KmClassifier.Class)) {
        }
        if (r0 != null) {
            classId = toClassId(name);
            if (JavaToKotlinClassMap.INSTANCE.isMutable(classId)) {
            }
        }
        mutableCollectionKClass = null;
        ref$ObjectRef.element = new SimpleKType(kClassifier2, list, isNullable2, arrayList2, kType4, isDefinitelyNonNull2, areEqual2, isSuspend2, mutableCollectionKClass, function0);
        if (Attributes.isSuspend(kmType)) {
        }
        flexibleTypeUpperBound = kmType.getFlexibleTypeUpperBound();
        if (flexibleTypeUpperBound != null) {
        }
        obj = ref$ObjectRef.element;
        if (obj != null) {
        }
    }

    public static final KVariance toKVariance(KmVariance kmVariance) {
        kmVariance.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[kmVariance.ordinal()];
        if (i == 1) {
            return KVariance.IN;
        }
        if (i == 2) {
            return KVariance.OUT;
        }
        if (i == 3) {
            return KVariance.INVARIANT;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final KVisibility toKVisibility(Visibility visibility) {
        visibility.getClass();
        switch (WhenMappings.$EnumSwitchMapping$1[visibility.ordinal()]) {
            case 1:
                return KVisibility.INTERNAL;
            case 2:
                return KVisibility.PRIVATE;
            case 3:
                return KVisibility.PROTECTED;
            case 4:
                return KVisibility.PUBLIC;
            case 5:
                return KVisibility.PRIVATE;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
            case 6:
                return null;
        }
    }

    public static final String toNonLocalSimpleName(String str) {
        str.getClass();
        if (StringsKt__StringsJVMKt.startsWith(str, ".", false)) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) "Local class is not supported: ".concat(str));
            return null;
        }
        String substringAfterLast = StringsKt.substringAfterLast('/', str, str);
        return StringsKt.substringAfterLast('.', substringAfterLast, substringAfterLast);
    }
}
