package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import papa.PapaEvent;

/* loaded from: classes9.dex */
public abstract class ReflectClassStructure {
    public static ClassLiteralValue classLiteralValue(Class cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (cls.isPrimitive()) {
            if (cls.equals(Void.TYPE)) {
                return new ClassLiteralValue(ClassId.Companion.topLevel(StandardNames.FqNames.unit.toSafe()), i);
            }
            PrimitiveType primitiveType = JvmPrimitiveType.get(cls.getName()).getPrimitiveType();
            primitiveType.getClass();
            return i > 0 ? new ClassLiteralValue(ClassId.Companion.topLevel(primitiveType.getArrayTypeFqName()), i - 1) : new ClassLiteralValue(ClassId.Companion.topLevel(primitiveType.getTypeFqName()), i);
        }
        ClassId classId = ReflectClassUtilKt.getClassId(cls);
        ClassId mapJavaToKotlin = JavaToKotlinClassMap.INSTANCE.mapJavaToKotlin(classId.asSingleFqName());
        if (mapJavaToKotlin != null) {
            classId = mapJavaToKotlin;
        }
        return new ClassLiteralValue(classId, i);
    }

    public static void processAnnotation(KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor, Annotation annotation) {
        Class javaClass = PapaEvent.getJavaClass(PapaEvent.getAnnotationClass(annotation));
        KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation = annotationVisitor.visitAnnotation(ReflectClassUtilKt.getClassId(javaClass), new ReflectAnnotationSource(annotation));
        if (visitAnnotation != null) {
            processAnnotationArguments(visitAnnotation, annotation, javaClass);
        }
    }

    public static void processAnnotationArguments(KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitor, Annotation annotation, Class cls) {
        Set set;
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            try {
                Object invoke = method.invoke(annotation, null);
                invoke.getClass();
                Name identifier = Name.identifier(method.getName());
                identifier.getClass();
                Class<?> cls2 = invoke.getClass();
                if (cls2.equals(Class.class)) {
                    annotationArgumentVisitor.visitClassLiteral(identifier, classLiteralValue((Class) invoke));
                } else {
                    set = ReflectKotlinClassKt.TYPES_ELIGIBLE_FOR_SIMPLE_VISIT;
                    if (set.contains(cls2)) {
                        annotationArgumentVisitor.visit(identifier, invoke);
                    } else if (ReflectClassUtilKt.isEnumClassOrSpecializedEnumEntryClass(cls2)) {
                        if (!cls2.isEnum()) {
                            cls2 = cls2.getEnclosingClass();
                        }
                        cls2.getClass();
                        ClassId classId = ReflectClassUtilKt.getClassId(cls2);
                        Name identifier2 = Name.identifier(((Enum) invoke).name());
                        identifier2.getClass();
                        annotationArgumentVisitor.visitEnum(identifier, classId, identifier2);
                    } else if (Annotation.class.isAssignableFrom(cls2)) {
                        Class<?>[] interfaces = cls2.getInterfaces();
                        interfaces.getClass();
                        Class cls3 = (Class) ArraysKt___ArraysKt.single(interfaces);
                        cls3.getClass();
                        KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation = annotationArgumentVisitor.visitAnnotation(identifier, ReflectClassUtilKt.getClassId(cls3));
                        if (visitAnnotation != null) {
                            processAnnotationArguments(visitAnnotation, (Annotation) invoke, cls3);
                        }
                    } else {
                        if (!cls2.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls2 + "): " + invoke);
                        }
                        KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray = annotationArgumentVisitor.visitArray(identifier);
                        if (visitArray != null) {
                            Class<?> componentType = cls2.getComponentType();
                            if (componentType.isEnum()) {
                                ClassId classId2 = ReflectClassUtilKt.getClassId(componentType);
                                for (Object obj : (Object[]) invoke) {
                                    obj.getClass();
                                    Name identifier3 = Name.identifier(((Enum) obj).name());
                                    identifier3.getClass();
                                    visitArray.visitEnum(classId2, identifier3);
                                }
                            } else if (componentType.equals(Class.class)) {
                                for (Object obj2 : (Object[]) invoke) {
                                    obj2.getClass();
                                    visitArray.visitClassLiteral(classLiteralValue((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) invoke) {
                                    KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation2 = visitArray.visitAnnotation(ReflectClassUtilKt.getClassId(componentType));
                                    if (visitAnnotation2 != null) {
                                        obj3.getClass();
                                        processAnnotationArguments(visitAnnotation2, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) invoke) {
                                    visitArray.visit(obj4);
                                }
                            }
                            visitArray.visitEnd();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        annotationArgumentVisitor.visitEnd();
    }
}
