package kotlinx.serialization.internal;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeParameterBase;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes3.dex */
public abstract class EnumsKt {
    public static final SerialDescriptor[] EMPTY_DESCRIPTOR_ARRAY = new SerialDescriptor[0];

    public static final InlineClassDescriptor InlinePrimitiveDescriptor(String str, final KSerializer kSerializer) {
        kSerializer.getClass();
        return new InlineClassDescriptor(str, new GeneratedSerializer() { // from class: kotlinx.serialization.internal.InlineClassDescriptorKt$InlinePrimitiveDescriptor$1
            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public KSerializer[] childSerializers() {
                return new KSerializer[]{KSerializer.this};
            }

            @Override // kotlinx.serialization.KSerializer
            public Object deserialize(Decoder decoder) {
                decoder.getClass();
                throw new IllegalStateException("unsupported");
            }

            @Override // kotlinx.serialization.KSerializer
            public SerialDescriptor getDescriptor() {
                throw new IllegalStateException("unsupported");
            }

            @Override // kotlinx.serialization.KSerializer
            public void serialize(Encoder encoder, Object value) {
                encoder.getClass();
                throw new IllegalStateException("unsupported");
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public /* bridge */ KSerializer[] typeParametersSerializers() {
                return TuplesKt.EMPTY_SERIALIZER_ARRAY;
            }
        });
    }

    public static final Set cachedSerialNames(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor instanceof CachedNames) {
            return ((CachedNames) serialDescriptor).getSerialNames();
        }
        HashSet hashSet = new HashSet(serialDescriptor.getElementsCount());
        int elementsCount = serialDescriptor.getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            hashSet.add(serialDescriptor.getElementName(i));
        }
        return hashSet;
    }

    public static final SerialDescriptor[] compactArray(List list) {
        SerialDescriptor[] serialDescriptorArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? EMPTY_DESCRIPTOR_ARRAY : serialDescriptorArr;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:58|(1:(2:60|(1:113)(1:64))(2:115|116))|(4:108|109|(8:82|83|(1:(3:85|(1:103)(1:(1:91)(2:88|89))|90)(2:104|(1:106)))|92|(1:102)(1:96)|97|(1:99)|101)|(1:71)(4:72|(2:74|(2:76|(1:78))(1:79))|80|81))|66|(1:68)|82|83|(2:(0)(0)|90)|92|(1:94)|102|97|(0)|101|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x00f6, code lost:
    
        if (r12 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00af, code lost:
    
        if (r11 == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0108 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0194 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0161 A[Catch: NoSuchFieldException -> 0x0191, TryCatch #0 {NoSuchFieldException -> 0x0191, blocks: (B:83:0x0153, B:85:0x0161, B:94:0x017e, B:96:0x0184, B:97:0x018a, B:99:0x018e, B:90:0x0176), top: B:82:0x0153 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018e A[Catch: NoSuchFieldException -> 0x0191, TRY_LEAVE, TryCatch #0 {NoSuchFieldException -> 0x0191, blocks: (B:83:0x0153, B:85:0x0161, B:94:0x017e, B:96:0x0184, B:97:0x018a, B:99:0x018e, B:90:0x0176), top: B:82:0x0153 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final KSerializer constructSerializerForGivenTypeArgs(Class cls, KSerializer... kSerializerArr) {
        Object obj;
        KSerializer kSerializer;
        Field field;
        Object obj2;
        KSerializer kSerializer2;
        int length;
        int i;
        Object obj3;
        Field field2;
        cls.getClass();
        if (cls.isEnum() && cls.getAnnotation(Serializable.class) == null && cls.getAnnotation(Polymorphic.class) == null) {
            Object[] enumConstants = cls.getEnumConstants();
            String canonicalName = cls.getCanonicalName();
            canonicalName.getClass();
            enumConstants.getClass();
            return new EnumSerializer(canonicalName, (Enum[]) enumConstants);
        }
        KSerializer[] kSerializerArr2 = (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length);
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        KSerializer invokeSerializerOnCompanion = obj == null ? null : invokeSerializerOnCompanion(obj, (KSerializer[]) Arrays.copyOf(kSerializerArr2, kSerializerArr2.length));
        if (invokeSerializerOnCompanion != null) {
            return invokeSerializerOnCompanion;
        }
        String canonicalName2 = cls.getCanonicalName();
        if (canonicalName2 != null && !StringsKt__StringsJVMKt.startsWith(canonicalName2, "java.", false) && !StringsKt__StringsJVMKt.startsWith(canonicalName2, "kotlin.", false)) {
            Field[] declaredFields = cls.getDeclaredFields();
            declaredFields.getClass();
            int length2 = declaredFields.length;
            Field field3 = null;
            int i2 = 0;
            boolean z = false;
            while (true) {
                if (i2 < length2) {
                    Field field4 = declaredFields[i2];
                    if (Intrinsics.areEqual(field4.getName(), "INSTANCE") && Intrinsics.areEqual(field4.getType(), cls) && Modifier.isStatic(field4.getModifiers())) {
                        if (z) {
                            break;
                        }
                        z = true;
                        field3 = field4;
                    }
                    i2++;
                }
            }
            field3 = null;
            if (field3 != null) {
                Object obj4 = field3.get(null);
                Method[] methods = cls.getMethods();
                methods.getClass();
                int length3 = methods.length;
                Method method = null;
                int i3 = 0;
                boolean z2 = false;
                while (true) {
                    if (i3 < length3) {
                        Method method2 = methods[i3];
                        if (Intrinsics.areEqual(method2.getName(), "serializer")) {
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            parameterTypes.getClass();
                            if (parameterTypes.length == 0 && Intrinsics.areEqual(method2.getReturnType(), KSerializer.class)) {
                                if (z2) {
                                    break;
                                }
                                z2 = true;
                                method = method2;
                            }
                        }
                        i3++;
                    }
                }
                method = null;
                if (method != null) {
                    Object invoke = method.invoke(obj4, null);
                    if (invoke instanceof KSerializer) {
                        kSerializer = (KSerializer) invoke;
                        if (kSerializer == null) {
                            return kSerializer;
                        }
                        KSerializer[] kSerializerArr3 = (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length);
                        Field[] declaredFields2 = cls.getDeclaredFields();
                        declaredFields2.getClass();
                        int length4 = declaredFields2.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length4) {
                                field = null;
                                break;
                            }
                            field = declaredFields2[i4];
                            if (Modifier.isStatic(field.getModifiers()) && field.getType().getAnnotation(NamedCompanion.class) != null) {
                                break;
                            }
                            i4++;
                        }
                        if (field != null) {
                            try {
                                field.setAccessible(true);
                                obj2 = field.get(null);
                            } catch (Throwable unused2) {
                            }
                            if (obj2 != null || (kSerializer2 = invokeSerializerOnCompanion(obj2, (KSerializer[]) Arrays.copyOf(kSerializerArr3, kSerializerArr3.length))) == null) {
                                Class<?>[] declaredClasses = cls.getDeclaredClasses();
                                declaredClasses.getClass();
                                length = declaredClasses.length;
                                Class<?> cls2 = null;
                                i = 0;
                                boolean z3 = false;
                                while (true) {
                                    if (i >= length) {
                                        Class<?> cls3 = declaredClasses[i];
                                        if (cls3.getSimpleName().equals("$serializer")) {
                                            if (z3) {
                                                break;
                                            }
                                            z3 = true;
                                            cls2 = cls3;
                                        }
                                        i++;
                                    } else if (!z3) {
                                    }
                                }
                                cls2 = null;
                                obj3 = (cls2 != null || (field2 = cls2.getField("INSTANCE")) == null) ? null : field2.get(null);
                                if (obj3 instanceof KSerializer) {
                                    kSerializer2 = (KSerializer) obj3;
                                }
                                kSerializer2 = null;
                            }
                            if (kSerializer2 == null) {
                                return kSerializer2;
                            }
                            if (cls.getAnnotation(Polymorphic.class) == null) {
                                Serializable serializable = (Serializable) cls.getAnnotation(Serializable.class);
                                if (serializable == null) {
                                    return null;
                                }
                                Class with = serializable.with();
                                ReflectionFactory reflectionFactory = Reflection.factory;
                                if (!reflectionFactory.getOrCreateKotlinClass(with).equals(reflectionFactory.getOrCreateKotlinClass(PolymorphicSerializer.class))) {
                                    return null;
                                }
                            }
                            return new PolymorphicSerializer(Reflection.factory.getOrCreateKotlinClass(cls));
                        }
                        obj2 = null;
                        if (obj2 != null) {
                        }
                        Class<?>[] declaredClasses2 = cls.getDeclaredClasses();
                        declaredClasses2.getClass();
                        length = declaredClasses2.length;
                        Class<?> cls22 = null;
                        i = 0;
                        boolean z32 = false;
                        while (true) {
                            if (i >= length) {
                            }
                            i++;
                        }
                        cls22 = null;
                        if (cls22 != null) {
                        }
                        if (obj3 instanceof KSerializer) {
                        }
                        kSerializer2 = null;
                        if (kSerializer2 == null) {
                        }
                    }
                }
            }
        }
        kSerializer = null;
        if (kSerializer == null) {
        }
    }

    public static final EnumSerializer createAnnotatedEnumSerializer(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr) {
        enumArr.getClass();
        EnumDescriptor enumDescriptor = new EnumDescriptor(str, enumArr.length);
        int length = enumArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Enum r5 = enumArr[i];
            int i3 = i2 + 1;
            String str2 = (String) ArraysKt___ArraysKt.getOrNull(i2, strArr);
            if (str2 == null) {
                str2 = r5.name();
            }
            enumDescriptor.addElement(str2, false);
            Annotation[] annotationArr2 = (Annotation[]) ArraysKt___ArraysKt.getOrNull(i2, annotationArr);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    annotation.getClass();
                    int i4 = enumDescriptor.added;
                    List[] listArr = enumDescriptor.propertiesAnnotations;
                    List list = listArr[i4];
                    if (list == null) {
                        list = new ArrayList(1);
                        listArr[enumDescriptor.added] = list;
                    }
                    list.add(annotation);
                }
            }
            i++;
            i2 = i3;
        }
        EnumSerializer enumSerializer = new EnumSerializer(str, enumArr);
        enumSerializer.overriddenDescriptor = enumDescriptor;
        return enumSerializer;
    }

    public static final KSerializer invokeSerializerOnCompanion(Object obj, KSerializer... kSerializerArr) {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (invoke instanceof KSerializer) {
                return (KSerializer) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final KClass kclass(KType kType) {
        kType.getClass();
        KClassifier classifier = kType.getClassifier();
        if (classifier instanceof KClass) {
            return (KClass) classifier;
        }
        if (!(classifier instanceof KTypeParameterBase)) {
            OptionalProvider$$ExternalSyntheticLambda0.m((Object) classifier, "Only KClass supported as classifier, got ");
            return null;
        }
        throw new IllegalArgumentException("Captured type parameter " + classifier + " from generic non-reified function. Such functionality cannot be supported because " + classifier + " is erased, either specify serializer explicitly or make calling function inline with reified " + classifier + '.');
    }

    public static final String notRegisteredMessage(KClass kClass) {
        kClass.getClass();
        String simpleName = kClass.getSimpleName();
        if (simpleName == null) {
            simpleName = "<local class name not available>";
        }
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Serializer for class '", simpleName, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }

    public static final void serializerNotRegistered(KClass kClass) {
        kClass.getClass();
        throw new SerializationException(notRegisteredMessage(kClass));
    }
}
