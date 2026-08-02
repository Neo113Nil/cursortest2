package kotlin.reflect.jvm.internal;

import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.maps.android.compose.MapEffectKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeParameterBase;
import kotlin.jvm.internal.PropertyReference;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.RepeatableContainer;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.types.AbstractKType;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import okhttp3.FormBody;
import okhttp3.internal.ws.RealWebSocket$connect$1;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import papa.PapaEvent;

/* loaded from: classes9.dex */
public abstract class UtilKt {
    public static final FqName JVM_STATIC = new FqName("kotlin.jvm.JvmStatic");
    public static final String SUSPEND_FUNCTION_PREFIX;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            try {
                iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrimitiveType.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrimitiveType.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrimitiveType.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrimitiveType.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrimitiveType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PrimitiveType.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        FunctionTypeKind.SuspendFunction suspendFunction = FunctionTypeKind.SuspendFunction.INSTANCE;
        sb.append(suspendFunction.getPackageFqName().asString());
        sb.append('.');
        sb.append(suspendFunction.getClassNamePrefix());
        SUSPEND_FUNCTION_PREFIX = sb.toString();
    }

    public static final ReflectKCallable asReflectCallable(KCallable kCallable) {
        if (kCallable instanceof LazyKProperty) {
            return asReflectCallable(((LazyKProperty) kCallable).getDelegate());
        }
        if (kCallable instanceof ReflectKCallable) {
            return (ReflectKCallable) kCallable;
        }
        if (kCallable instanceof CallableReference) {
            KCallable compute = ((CallableReference) kCallable).compute();
            if (compute == kCallable) {
                compute = null;
            }
            if (compute != null) {
                return asReflectCallable(compute);
            }
        }
        return null;
    }

    public static final ReflectKProperty asReflectProperty(Object obj) {
        if (obj instanceof LazyKProperty) {
            return asReflectProperty(((LazyKProperty) obj).getDelegate());
        }
        if (obj instanceof ReflectKProperty) {
            return (ReflectKProperty) obj;
        }
        if (obj instanceof PropertyReference) {
            KCallable compute = ((PropertyReference) obj).compute();
            if (compute == obj) {
                compute = null;
            }
            if (compute != null) {
                return asReflectProperty(compute);
            }
        }
        return null;
    }

    public static final List computeAnnotations(Annotated annotated) {
        Annotation annotationInstance;
        annotated.getClass();
        Annotations annotations = annotated.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (AnnotationDescriptor annotationDescriptor : annotations) {
            SourceElement source = annotationDescriptor.getSource();
            if (source instanceof ReflectAnnotationSource) {
                annotationInstance = ((ReflectAnnotationSource) source).getAnnotation();
            } else if (source instanceof RuntimeSourceElementFactory.RuntimeSourceElement) {
                ReflectJavaElement javaElement = ((RuntimeSourceElementFactory.RuntimeSourceElement) source).getJavaElement();
                ReflectJavaAnnotation reflectJavaAnnotation = javaElement instanceof ReflectJavaAnnotation ? (ReflectJavaAnnotation) javaElement : null;
                annotationInstance = reflectJavaAnnotation != null ? reflectJavaAnnotation.getAnnotation() : null;
            } else {
                annotationInstance = toAnnotationInstance(annotationDescriptor);
            }
            if (annotationInstance != null) {
                arrayList.add(annotationInstance);
            }
        }
        return unwrapKotlinRepeatableAnnotations(arrayList);
    }

    public static final Class createArrayType(Class cls) {
        cls.getClass();
        return Array.newInstance((Class<?>) cls, 0).getClass();
    }

    public static final Object defaultPrimitiveValue(Type type2) {
        type2.getClass();
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            if (cls.isPrimitive()) {
                if (cls.equals(Boolean.TYPE)) {
                    return Boolean.FALSE;
                }
                if (cls.equals(Character.TYPE)) {
                    return (char) 0;
                }
                if (cls.equals(Byte.TYPE)) {
                    return (byte) 0;
                }
                if (cls.equals(Short.TYPE)) {
                    return (short) 0;
                }
                if (cls.equals(Integer.TYPE)) {
                    return 0;
                }
                if (cls.equals(Float.TYPE)) {
                    return Float.valueOf(RecyclerView.DECELERATION_RATE);
                }
                if (cls.equals(Long.TYPE)) {
                    return 0L;
                }
                if (cls.equals(Double.TYPE)) {
                    return Double.valueOf(0.0d);
                }
                if (cls.equals(Void.TYPE)) {
                    a$$ExternalSyntheticBUOutline0.m$1("Parameter with void type is illegal");
                    return null;
                }
                f$$ExternalSyntheticLambda0.m((Object) type2, "Unknown primitive: ");
            }
        }
        return null;
    }

    public static final CallableDescriptor deserializeToDescriptor(Class cls, DeserializedContainerSource deserializedContainerSource, GeneratedMessageLite.ExtendableMessage extendableMessage, NameResolver nameResolver, TypeTable typeTable, BinaryVersion binaryVersion, Function2 function2) {
        List<ProtoBuf.TypeParameter> typeParameterList;
        cls.getClass();
        extendableMessage.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        binaryVersion.getClass();
        RuntimeModuleData orCreateModule = ModuleByClassLoaderKt.getOrCreateModule(cls);
        if (extendableMessage instanceof ProtoBuf.Function) {
            typeParameterList = ((ProtoBuf.Function) extendableMessage).getTypeParameterList();
        } else {
            if (!(extendableMessage instanceof ProtoBuf.Property)) {
                Path$$ExternalSyntheticBUOutline0.m$1(extendableMessage, "Unsupported message: ");
                return null;
            }
            typeParameterList = ((ProtoBuf.Property) extendableMessage).getTypeParameterList();
        }
        List<ProtoBuf.TypeParameter> list = typeParameterList;
        DeserializationComponents deserialization = orCreateModule.getDeserialization();
        ModuleDescriptor module = orCreateModule.getModule();
        VersionRequirementTable empty = VersionRequirementTable.Companion.getEMPTY();
        list.getClass();
        return (CallableDescriptor) function2.invoke(new MemberDeserializer(new DeserializationContext(deserialization, nameResolver, module, typeTable, empty, binaryVersion, deserializedContainerSource, null, list)), extendableMessage);
    }

    public static final ReceiverParameterDescriptor getInstanceReceiverParameter(DescriptorKCallable descriptorKCallable) {
        descriptorKCallable.getClass();
        ReceiverParameterDescriptor receiverParameterDescriptor = descriptorKCallable.overriddenStorage.instanceReceiverParameter;
        if (receiverParameterDescriptor != null) {
            return receiverParameterDescriptor;
        }
        CallableMemberDescriptor descriptor = descriptorKCallable.getDescriptor();
        if (descriptor instanceof ConstructorDescriptor) {
            return ((ConstructorDescriptor) descriptor).getDispatchReceiverParameter();
        }
        if (descriptor.getDispatchReceiverParameter() == null) {
            return null;
        }
        DeclarationDescriptor containingDeclaration = descriptor.getContainingDeclaration();
        containingDeclaration.getClass();
        return ((ClassDescriptor) containingDeclaration).getThisAsReceiverParameter();
    }

    public static final KClass getUnwrappedAnnotationClass(Annotation annotation) {
        KClass annotationClass = PapaEvent.getAnnotationClass(annotation);
        if (!isJavaRepeatableContainer(annotationClass)) {
            return annotationClass;
        }
        Class<?> componentType = PapaEvent.getJavaClass(annotationClass).getDeclaredMethod("value", null).getReturnType().getComponentType();
        componentType.getClass();
        return Reflection.factory.getOrCreateKotlinClass(componentType);
    }

    public static final boolean hasInherited(Annotation annotation) {
        return PapaEvent.getJavaClass(PapaEvent.getAnnotationClass(annotation)).getAnnotation(Inherited.class) != null;
    }

    public static final boolean isInlineClassType(KType kType) {
        kType.getClass();
        KClassifier classifier = kType.getClassifier();
        KClassImpl kClassImpl = classifier instanceof KClassImpl ? (KClassImpl) classifier : null;
        return kClassImpl != null && kClassImpl.isValue();
    }

    public static final boolean isJavaRepeatableContainer(KClass kClass) {
        Method method;
        Class<?> componentType;
        Annotation annotation;
        Object invoke;
        Class javaClass = PapaEvent.getJavaClass(kClass);
        try {
            method = javaClass.getDeclaredMethod("value", (Class[]) Arrays.copyOf(new Class[0], 0));
        } catch (NoSuchMethodException unused) {
            method = null;
        }
        if (method != null && (componentType = method.getReturnType().getComponentType()) != null && componentType.isAnnotation()) {
            Annotation[] annotations = componentType.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    annotation = null;
                    break;
                }
                annotation = annotations[i];
                if (PapaEvent.getJavaClass(PapaEvent.getAnnotationClass(annotation)).getName().equals(JvmAnnotationNames.REPEATABLE_ANNOTATION.asString())) {
                    break;
                }
                i++;
            }
            if (annotation != null && (invoke = PapaEvent.getJavaClass(PapaEvent.getAnnotationClass(annotation)).getMethod("value", null).invoke(annotation, null)) != null) {
                return javaClass.equals(invoke);
            }
        }
        return false;
    }

    public static final boolean isNullableType(KType kType) {
        kType.getClass();
        if (kType.isMarkedNullable()) {
            return true;
        }
        AbstractKType abstractKType = (AbstractKType) kType;
        AbstractKType upperBoundIfFlexible = abstractKType.upperBoundIfFlexible();
        if (upperBoundIfFlexible != null && isNullableType(upperBoundIfFlexible)) {
            return true;
        }
        if (abstractKType.isDefinitelyNotNullType()) {
            return false;
        }
        KClassifier classifier = kType.getClassifier();
        if (!(classifier instanceof KTypeParameterBase)) {
            return false;
        }
        List upperBounds = ((KTypeParameterBase) classifier).getUpperBounds();
        if ((upperBounds instanceof Collection) && upperBounds.isEmpty()) {
            return false;
        }
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            if (isNullableType((KType) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isRepeatableContainerForNonInheritedAnnotation(Annotation annotation) {
        if (!isJavaRepeatableContainer(PapaEvent.getAnnotationClass(annotation))) {
            return false;
        }
        Class<?> componentType = PapaEvent.getJavaClass(PapaEvent.getAnnotationClass(annotation)).getDeclaredMethod("value", null).getReturnType().getComponentType();
        componentType.getClass();
        return PapaEvent.getJavaClass(Reflection.factory.getOrCreateKotlinClass(componentType)).getAnnotation(Inherited.class) == null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class loadClass(ClassLoader classLoader, ClassId classId, int i) {
        classLoader.getClass();
        classId.getClass();
        FqNameUnsafe unsafe = classId.asSingleFqName().toUnsafe();
        String asString = unsafe.asString();
        Integer intOrNull = StringsKt.toIntOrNull(StringsKt.substringAfter(asString, SUSPEND_FUNCTION_PREFIX, asString));
        if (intOrNull != null) {
            return loadClass(classLoader, FunctionTypeKind.Function.INSTANCE.numberedClassId(intOrNull.intValue() + 1), i);
        }
        ClassId mapKotlinToJava = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(unsafe);
        if (mapKotlinToJava == null) {
            mapKotlinToJava = classId;
        }
        if (!mapKotlinToJava.equals(classId)) {
            classLoader = ReflectClassUtilKt.getSafeClassLoader(Unit.class);
        }
        String asString2 = mapKotlinToJava.getPackageFqName().asString();
        String asString3 = mapKotlinToJava.getRelativeClassName().asString();
        if (Intrinsics.areEqual(asString2, "kotlin")) {
            switch (asString3.hashCode()) {
                case -901856463:
                    if (asString3.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (asString3.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (asString3.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (asString3.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (asString3.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (asString3.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (asString3.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (asString3.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (asString3.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (asString2.length() > 0) {
            sb.append(asString2.concat("."));
        }
        sb.append(StringsKt__StringsJVMKt.replace(asString3, '.', '$', false));
        if (i > 0) {
            sb.append(";");
        }
        return ReflectJavaClassFinderKt.tryLoadClass(classLoader, sb.toString());
    }

    public static final FormBody.Builder parseAndLoadDescriptor(ClassLoader classLoader, String str, boolean z) {
        Class cls;
        classLoader.getClass();
        str.getClass();
        RealWebSocket$connect$1 parseJvmDescriptor = parseJvmDescriptor(str);
        ArrayList<String> arrayList = (ArrayList) parseJvmDescriptor.this$0;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (String str2 : arrayList) {
            arrayList2.add(parseAndLoadType(classLoader, str2, 0, str2.length()));
        }
        if (z) {
            String str3 = (String) parseJvmDescriptor.$request;
            cls = parseAndLoadType(classLoader, str3, 0, str3.length());
        } else {
            cls = null;
        }
        return new FormBody.Builder(arrayList2, cls);
    }

    public static final Class parseAndLoadType(ClassLoader classLoader, String str, int i, int i2) {
        char charAt = str.charAt(i);
        if (charAt == 'F') {
            return Float.TYPE;
        }
        if (charAt == 'L') {
            Class<?> loadClass = classLoader.loadClass(StringsKt__StringsJVMKt.replace(str.substring(i + 1, i2 - 1), '/', '.', false));
            loadClass.getClass();
            return loadClass;
        }
        if (charAt == 'S') {
            return Short.TYPE;
        }
        if (charAt == 'V') {
            Class cls = Void.TYPE;
            cls.getClass();
            return cls;
        }
        if (charAt == 'I') {
            return Integer.TYPE;
        }
        if (charAt == 'J') {
            return Long.TYPE;
        }
        if (charAt == 'Z') {
            return Boolean.TYPE;
        }
        if (charAt == '[') {
            return createArrayType(parseAndLoadType(classLoader, str, i + 1, i2));
        }
        switch (charAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(str));
        }
    }

    public static final RealWebSocket$connect$1 parseJvmDescriptor(String str) {
        int indexOf$default;
        str.getClass();
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (str.charAt(i) != ')') {
            int i2 = i;
            while (str.charAt(i2) == '[') {
                i2++;
            }
            char charAt = str.charAt(i2);
            if (StringsKt.contains((CharSequence) "VZCBSIFJD", charAt, false)) {
                indexOf$default = i2 + 1;
            } else {
                if (charAt != 'L') {
                    throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(str));
                }
                indexOf$default = StringsKt.indexOf$default((CharSequence) str, ';', i, false, 4) + 1;
            }
            arrayList.add(str.substring(i, indexOf$default));
            i = indexOf$default;
        }
        return new RealWebSocket$connect$1(9, arrayList, str.substring(i + 1));
    }

    public static final Annotation toAnnotationInstance(AnnotationDescriptor annotationDescriptor) {
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        Class javaClass = annotationClass != null ? toJavaClass(annotationClass) : null;
        if (javaClass == null) {
            javaClass = null;
        }
        if (javaClass == null) {
            return null;
        }
        Set<Map.Entry<Name, ConstantValue<?>>> entrySet = annotationDescriptor.getAllValueArguments().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Name name = (Name) entry.getKey();
            ConstantValue constantValue = (ConstantValue) entry.getValue();
            ClassLoader classLoader = javaClass.getClassLoader();
            classLoader.getClass();
            Object runtimeValue = toRuntimeValue(constantValue, classLoader);
            Pair pair = runtimeValue != null ? new Pair(name.asString(), runtimeValue) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return (Annotation) MapEffectKt.createAnnotationInstance$default(javaClass, MapsKt__MapsKt.toMap(arrayList));
    }

    public static final Class toJavaClass(ClassDescriptor classDescriptor) {
        SourceElement source = classDescriptor.getSource();
        source.getClass();
        if (source instanceof KotlinJvmBinarySourceElement) {
            KotlinJvmBinaryClass binaryClass = ((KotlinJvmBinarySourceElement) source).getBinaryClass();
            binaryClass.getClass();
            return ((ReflectKotlinClass) binaryClass).getKlass();
        }
        if (source instanceof RuntimeSourceElementFactory.RuntimeSourceElement) {
            ReflectJavaElement javaElement = ((RuntimeSourceElementFactory.RuntimeSourceElement) source).getJavaElement();
            javaElement.getClass();
            return ((ReflectJavaClass) javaElement).getElement();
        }
        ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
        if (classId == null) {
            return null;
        }
        return loadClass(ReflectClassUtilKt.getSafeClassLoader(classDescriptor.getClass()), classId, 0);
    }

    public static final KVisibility toKVisibility(DescriptorVisibility descriptorVisibility) {
        descriptorVisibility.getClass();
        if (Intrinsics.areEqual(descriptorVisibility, DescriptorVisibilities.PUBLIC)) {
            return KVisibility.PUBLIC;
        }
        if (Intrinsics.areEqual(descriptorVisibility, DescriptorVisibilities.PROTECTED)) {
            return KVisibility.PROTECTED;
        }
        if (Intrinsics.areEqual(descriptorVisibility, DescriptorVisibilities.INTERNAL)) {
            return KVisibility.INTERNAL;
        }
        if (Intrinsics.areEqual(descriptorVisibility, DescriptorVisibilities.PRIVATE) || Intrinsics.areEqual(descriptorVisibility, DescriptorVisibilities.PRIVATE_TO_THIS)) {
            return KVisibility.PRIVATE;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object toRuntimeValue(ConstantValue constantValue, ClassLoader classLoader) {
        KotlinType type2;
        Class loadClass;
        if (constantValue instanceof AnnotationValue) {
            return toAnnotationInstance(((AnnotationValue) constantValue).getValue());
        }
        int i = 0;
        if (constantValue instanceof ArrayValue) {
            ArrayValue arrayValue = (ArrayValue) constantValue;
            TypedArrayValue typedArrayValue = arrayValue instanceof TypedArrayValue ? (TypedArrayValue) arrayValue : null;
            if (typedArrayValue != null && (type2 = typedArrayValue.getType()) != null) {
                List<? extends ConstantValue<?>> value = arrayValue.getValue();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(value, 10));
                Iterator<T> it = value.iterator();
                while (it.hasNext()) {
                    arrayList.add(toRuntimeValue((ConstantValue) it.next(), classLoader));
                }
                PrimitiveType primitiveArrayElementType = KotlinBuiltIns.getPrimitiveArrayElementType(type2);
                switch (primitiveArrayElementType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[primitiveArrayElementType.ordinal()]) {
                    case -1:
                        if (!KotlinBuiltIns.isArray(type2)) {
                            Handlers$$ExternalSyntheticBUOutline0.m(type2, "Not an array type: ");
                            return null;
                        }
                        KotlinType type3 = ((TypeProjection) CollectionsKt.single((List) type2.getArguments())).getType();
                        type3.getClass();
                        ClassifierDescriptor mo4153getDeclarationDescriptor = type3.getConstructor().mo4153getDeclarationDescriptor();
                        ClassDescriptor classDescriptor = mo4153getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) mo4153getDeclarationDescriptor : null;
                        if (classDescriptor == null) {
                            Path$$ExternalSyntheticBUOutline0.m$1(type3, "Not a class type: ");
                            return null;
                        }
                        if (KotlinBuiltIns.isString(type3)) {
                            int size = arrayValue.getValue().size();
                            String[] strArr = new String[size];
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                obj.getClass();
                                strArr[i] = obj;
                                i++;
                            }
                            return strArr;
                        }
                        if (KotlinBuiltIns.isKClass(classDescriptor)) {
                            int size2 = arrayValue.getValue().size();
                            Class[] clsArr = new Class[size2];
                            while (i < size2) {
                                Object obj2 = arrayList.get(i);
                                obj2.getClass();
                                clsArr[i] = obj2;
                                i++;
                            }
                            return clsArr;
                        }
                        ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
                        if (classId != null && (loadClass = loadClass(classLoader, classId, 0)) != null) {
                            Object newInstance = Array.newInstance((Class<?>) loadClass, arrayValue.getValue().size());
                            newInstance.getClass();
                            Object[] objArr = (Object[]) newInstance;
                            int size3 = arrayList.size();
                            while (i < size3) {
                                objArr[i] = arrayList.get(i);
                                i++;
                            }
                            return objArr;
                        }
                        break;
                    case 0:
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    case 1:
                        int size4 = arrayValue.getValue().size();
                        boolean[] zArr = new boolean[size4];
                        while (i < size4) {
                            Object obj3 = arrayList.get(i);
                            obj3.getClass();
                            zArr[i] = ((Boolean) obj3).booleanValue();
                            i++;
                        }
                        return zArr;
                    case 2:
                        int size5 = arrayValue.getValue().size();
                        char[] cArr = new char[size5];
                        while (i < size5) {
                            Object obj4 = arrayList.get(i);
                            obj4.getClass();
                            cArr[i] = ((Character) obj4).charValue();
                            i++;
                        }
                        return cArr;
                    case 3:
                        int size6 = arrayValue.getValue().size();
                        byte[] bArr = new byte[size6];
                        while (i < size6) {
                            Object obj5 = arrayList.get(i);
                            obj5.getClass();
                            bArr[i] = ((Byte) obj5).byteValue();
                            i++;
                        }
                        return bArr;
                    case 4:
                        int size7 = arrayValue.getValue().size();
                        short[] sArr = new short[size7];
                        while (i < size7) {
                            Object obj6 = arrayList.get(i);
                            obj6.getClass();
                            sArr[i] = ((Short) obj6).shortValue();
                            i++;
                        }
                        return sArr;
                    case 5:
                        int size8 = arrayValue.getValue().size();
                        int[] iArr = new int[size8];
                        while (i < size8) {
                            Object obj7 = arrayList.get(i);
                            obj7.getClass();
                            iArr[i] = ((Integer) obj7).intValue();
                            i++;
                        }
                        return iArr;
                    case 6:
                        int size9 = arrayValue.getValue().size();
                        float[] fArr = new float[size9];
                        while (i < size9) {
                            Object obj8 = arrayList.get(i);
                            obj8.getClass();
                            fArr[i] = ((Float) obj8).floatValue();
                            i++;
                        }
                        return fArr;
                    case 7:
                        int size10 = arrayValue.getValue().size();
                        long[] jArr = new long[size10];
                        while (i < size10) {
                            Object obj9 = arrayList.get(i);
                            obj9.getClass();
                            jArr[i] = ((Long) obj9).longValue();
                            i++;
                        }
                        return jArr;
                    case 8:
                        int size11 = arrayValue.getValue().size();
                        double[] dArr = new double[size11];
                        while (i < size11) {
                            Object obj10 = arrayList.get(i);
                            obj10.getClass();
                            dArr[i] = ((Double) obj10).doubleValue();
                            i++;
                        }
                        return dArr;
                }
            }
        } else if (constantValue instanceof EnumValue) {
            Pair<? extends ClassId, ? extends Name> value2 = ((EnumValue) constantValue).getValue();
            ClassId classId2 = (ClassId) value2.first;
            Name name = (Name) value2.second;
            Class loadClass2 = loadClass(classLoader, classId2, 0);
            if (loadClass2 != null) {
                return Enum.valueOf(loadClass2, name.asString());
            }
        } else {
            if (!(constantValue instanceof KClassValue)) {
                if ((constantValue instanceof ErrorValue) || (constantValue instanceof NullValue)) {
                    return null;
                }
                return constantValue.getValue();
            }
            KClassValue.Value value3 = ((KClassValue) constantValue).getValue();
            if (value3 instanceof KClassValue.Value.NormalClass) {
                KClassValue.Value.NormalClass normalClass = (KClassValue.Value.NormalClass) value3;
                return loadClass(classLoader, normalClass.getClassId(), normalClass.getArrayDimensions());
            }
            if (!(value3 instanceof KClassValue.Value.LocalClass)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            ClassifierDescriptor mo4153getDeclarationDescriptor2 = ((KClassValue.Value.LocalClass) value3).getType().getConstructor().mo4153getDeclarationDescriptor();
            ClassDescriptor classDescriptor2 = mo4153getDeclarationDescriptor2 instanceof ClassDescriptor ? (ClassDescriptor) mo4153getDeclarationDescriptor2 : null;
            if (classDescriptor2 != null) {
                return toJavaClass(classDescriptor2);
            }
        }
        return null;
    }

    public static final KType unsubstitutedUnderlyingType(KType kType) {
        kType.getClass();
        KClassifier classifier = kType.getClassifier();
        KClassImpl kClassImpl = classifier instanceof KClassImpl ? (KClassImpl) classifier : null;
        if (kClassImpl != null) {
            return (KType) ((KClassImpl.Data) kClassImpl.data.getValue()).inlineClassUnderlyingType$delegate.getValue();
        }
        return null;
    }

    public static final List unwrapKotlinRepeatableAnnotations(List list) {
        List listOf;
        list.getClass();
        List<Annotation> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (PapaEvent.getJavaClass(PapaEvent.getAnnotationClass((Annotation) it.next())).getSimpleName().equals("Container")) {
                    list = new ArrayList();
                    for (Annotation annotation : list2) {
                        KClass annotationClass = PapaEvent.getAnnotationClass(annotation);
                        Class javaClass = PapaEvent.getJavaClass(annotationClass);
                        if (!javaClass.getSimpleName().equals("Container") || javaClass.getAnnotation(RepeatableContainer.class) == null) {
                            listOf = CollectionsKt__CollectionsJVMKt.listOf(annotation);
                        } else {
                            Object invoke = PapaEvent.getJavaClass(annotationClass).getDeclaredMethod("value", null).invoke(annotation, null);
                            invoke.getClass();
                            listOf = Arrays.asList((Annotation[]) invoke);
                            listOf.getClass();
                        }
                        CollectionsKt__MutableCollectionsKt.addAll(listOf, list);
                    }
                }
            }
        }
        return list;
    }
}
