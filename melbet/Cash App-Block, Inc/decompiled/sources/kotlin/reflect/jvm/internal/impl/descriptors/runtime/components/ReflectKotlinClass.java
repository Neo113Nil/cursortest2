package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.text.StringsKt__StringsJVMKt;
import papa.PapaEvent;

/* loaded from: classes9.dex */
public final class ReflectKotlinClass implements KotlinJvmBinaryClass {
    public static final Factory Factory = new Factory(null);
    public final KotlinClassHeader classHeader;
    public final Class klass;

    public static final class Factory {
        public Factory(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final ReflectKotlinClass create(Class<?> cls) {
            cls.getClass();
            ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = new ReadKotlinClassHeaderAnnotationVisitor();
            Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
            declaredAnnotations.getClass();
            for (Annotation annotation : declaredAnnotations) {
                annotation.getClass();
                Class javaClass = PapaEvent.getJavaClass(PapaEvent.getAnnotationClass(annotation));
                KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation = readKotlinClassHeaderAnnotationVisitor.visitAnnotation(ReflectClassUtilKt.getClassId(javaClass), new ReflectAnnotationSource(annotation));
                if (visitAnnotation != null) {
                    ReflectClassStructure.processAnnotationArguments(visitAnnotation, annotation, javaClass);
                }
            }
            readKotlinClassHeaderAnnotationVisitor.visitEnd();
            KotlinClassHeader createHeaderWithDefaultMetadataVersion = readKotlinClassHeaderAnnotationVisitor.createHeaderWithDefaultMetadataVersion();
            if (createHeaderWithDefaultMetadataVersion == null) {
                return null;
            }
            return new ReflectKotlinClass(cls, createHeaderWithDefaultMetadataVersion, null);
        }
    }

    public ReflectKotlinClass(Class cls, KotlinClassHeader kotlinClassHeader, DefaultConstructorMarker defaultConstructorMarker) {
        this.klass = cls;
        this.classHeader = kotlinClassHeader;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ReflectKotlinClass) {
            return Intrinsics.areEqual(this.klass, ((ReflectKotlinClass) obj).klass);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public KotlinClassHeader getClassHeader() {
        return this.classHeader;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public ClassId getClassId() {
        return ReflectClassUtilKt.getClassId(this.klass);
    }

    public final Class<?> getKlass() {
        return this.klass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public String getLocation() {
        return StringsKt__StringsJVMKt.replace(this.klass.getName(), '.', '/', false).concat(".class");
    }

    public int hashCode() {
        return this.klass.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public void loadClassAnnotations(KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor, byte[] bArr) {
        annotationVisitor.getClass();
        Class cls = this.klass;
        cls.getClass();
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        declaredAnnotations.getClass();
        for (Annotation annotation : declaredAnnotations) {
            annotation.getClass();
            Class javaClass = PapaEvent.getJavaClass(PapaEvent.getAnnotationClass(annotation));
            KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation = annotationVisitor.visitAnnotation(ReflectClassUtilKt.getClassId(javaClass), new ReflectAnnotationSource(annotation));
            if (visitAnnotation != null) {
                ReflectClassStructure.processAnnotationArguments(visitAnnotation, annotation, javaClass);
            }
        }
        annotationVisitor.visitEnd();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Boxes$$ExternalSyntheticOutline1.m(ReflectKotlinClass.class, sb, ": ");
        sb.append(this.klass);
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public void visitMembers(KotlinJvmBinaryClass.MemberVisitor memberVisitor, byte[] bArr) {
        Class cls;
        Constructor<?>[] constructorArr;
        int i;
        memberVisitor.getClass();
        Class cls2 = this.klass;
        cls2.getClass();
        Method[] declaredMethods = cls2.getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            Name identifier = Name.identifier(method.getName());
            identifier.getClass();
            StringBuilder sb = new StringBuilder("(");
            Class<?>[] parameterTypes = method.getParameterTypes();
            parameterTypes.getClass();
            for (Class<?> cls3 : parameterTypes) {
                cls3.getClass();
                sb.append(ReflectClassUtilKt.getDesc(cls3));
            }
            sb.append(")");
            Class<?> returnType = method.getReturnType();
            returnType.getClass();
            sb.append(ReflectClassUtilKt.getDesc(returnType));
            KotlinJvmBinaryClass.MethodAnnotationVisitor visitMethod = memberVisitor.visitMethod(identifier, sb.toString());
            if (visitMethod != null) {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                declaredAnnotations.getClass();
                for (Annotation annotation : declaredAnnotations) {
                    annotation.getClass();
                    ReflectClassStructure.processAnnotation(visitMethod, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                parameterAnnotations.getClass();
                Annotation[][] annotationArr = parameterAnnotations;
                int length = annotationArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    Annotation[] annotationArr2 = annotationArr[i2];
                    annotationArr2.getClass();
                    for (Annotation annotation2 : annotationArr2) {
                        Class javaClass = PapaEvent.getJavaClass(PapaEvent.getAnnotationClass(annotation2));
                        KotlinJvmBinaryClass.AnnotationArgumentVisitor visitParameterAnnotation = visitMethod.visitParameterAnnotation(i2, ReflectClassUtilKt.getClassId(javaClass), new ReflectAnnotationSource(annotation2));
                        if (visitParameterAnnotation != null) {
                            ReflectClassStructure.processAnnotationArguments(visitParameterAnnotation, annotation2, javaClass);
                        }
                    }
                }
                visitMethod.visitEnd();
            }
        }
        Constructor<?>[] declaredConstructors = cls2.getDeclaredConstructors();
        declaredConstructors.getClass();
        int length2 = declaredConstructors.length;
        int i3 = 0;
        while (i3 < length2) {
            Constructor<?> constructor = declaredConstructors[i3];
            Name name = SpecialNames.INIT;
            constructor.getClass();
            StringBuilder sb2 = new StringBuilder("(");
            Class<?>[] parameterTypes2 = constructor.getParameterTypes();
            parameterTypes2.getClass();
            for (Class<?> cls4 : parameterTypes2) {
                cls4.getClass();
                sb2.append(ReflectClassUtilKt.getDesc(cls4));
            }
            sb2.append(")V");
            KotlinJvmBinaryClass.MethodAnnotationVisitor visitMethod2 = memberVisitor.visitMethod(name, sb2.toString());
            if (visitMethod2 == null) {
                cls = cls2;
                constructorArr = declaredConstructors;
                i = length2;
            } else {
                Annotation[] declaredAnnotations2 = constructor.getDeclaredAnnotations();
                declaredAnnotations2.getClass();
                for (Annotation annotation3 : declaredAnnotations2) {
                    annotation3.getClass();
                    ReflectClassStructure.processAnnotation(visitMethod2, annotation3);
                }
                Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
                parameterAnnotations2.getClass();
                if (parameterAnnotations2.length != 0) {
                    int length3 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                    int length4 = parameterAnnotations2.length;
                    for (int i4 = 0; i4 < length4; i4++) {
                        Annotation[] annotationArr3 = parameterAnnotations2[i4];
                        annotationArr3.getClass();
                        int length5 = annotationArr3.length;
                        int i5 = 0;
                        while (i5 < length5) {
                            Annotation annotation4 = annotationArr3[i5];
                            Class javaClass2 = PapaEvent.getJavaClass(PapaEvent.getAnnotationClass(annotation4));
                            Class cls5 = cls2;
                            Constructor<?>[] constructorArr2 = declaredConstructors;
                            int i6 = length2;
                            KotlinJvmBinaryClass.AnnotationArgumentVisitor visitParameterAnnotation2 = visitMethod2.visitParameterAnnotation(i4 + length3, ReflectClassUtilKt.getClassId(javaClass2), new ReflectAnnotationSource(annotation4));
                            if (visitParameterAnnotation2 != null) {
                                ReflectClassStructure.processAnnotationArguments(visitParameterAnnotation2, annotation4, javaClass2);
                            }
                            i5++;
                            cls2 = cls5;
                            declaredConstructors = constructorArr2;
                            length2 = i6;
                        }
                    }
                }
                cls = cls2;
                constructorArr = declaredConstructors;
                i = length2;
                visitMethod2.visitEnd();
            }
            i3++;
            cls2 = cls;
            declaredConstructors = constructorArr;
            length2 = i;
        }
        Field[] declaredFields = cls2.getDeclaredFields();
        declaredFields.getClass();
        for (Field field : declaredFields) {
            Name identifier2 = Name.identifier(field.getName());
            identifier2.getClass();
            Class<?> type2 = field.getType();
            type2.getClass();
            KotlinJvmBinaryClass.AnnotationVisitor visitField = memberVisitor.visitField(identifier2, ReflectClassUtilKt.getDesc(type2), null);
            if (visitField != null) {
                Annotation[] declaredAnnotations3 = field.getDeclaredAnnotations();
                declaredAnnotations3.getClass();
                for (Annotation annotation5 : declaredAnnotations3) {
                    annotation5.getClass();
                    ReflectClassStructure.processAnnotation(visitField, annotation5);
                }
                visitField.visitEnd();
            }
        }
    }
}
