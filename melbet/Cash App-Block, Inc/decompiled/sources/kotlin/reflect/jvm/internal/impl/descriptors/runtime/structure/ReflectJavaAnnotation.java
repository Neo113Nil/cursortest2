package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import papa.PapaEvent;

/* loaded from: classes9.dex */
public final class ReflectJavaAnnotation extends ReflectJavaElement implements JavaAnnotation {
    public final Annotation annotation;

    public ReflectJavaAnnotation(Annotation annotation) {
        annotation.getClass();
        this.annotation = annotation;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ReflectJavaAnnotation) {
            return this.annotation == ((ReflectJavaAnnotation) obj).annotation;
        }
        return false;
    }

    public final Annotation getAnnotation() {
        return this.annotation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public Collection<JavaAnnotationArgument> getArguments() {
        Annotation annotation = this.annotation;
        Method[] declaredMethods = PapaEvent.getJavaClass(PapaEvent.getAnnotationClass(annotation)).getDeclaredMethods();
        declaredMethods.getClass();
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            ReflectJavaAnnotationArgument.Factory factory = ReflectJavaAnnotationArgument.Factory;
            Object invoke = method.invoke(annotation, null);
            invoke.getClass();
            arrayList.add(factory.create(invoke, Name.identifier(method.getName())));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public ClassId getClassId() {
        return ReflectClassUtilKt.getClassId(PapaEvent.getJavaClass(PapaEvent.getAnnotationClass(this.annotation)));
    }

    public int hashCode() {
        return System.identityHashCode(this.annotation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public boolean isFreshlySupportedTypeUseAnnotation() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public boolean isIdeExternalAnnotation() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public ReflectJavaClass resolve() {
        return new ReflectJavaClass(PapaEvent.getJavaClass(PapaEvent.getAnnotationClass(this.annotation)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Boxes$$ExternalSyntheticOutline1.m(ReflectJavaAnnotation.class, sb, ": ");
        sb.append(this.annotation);
        return sb.toString();
    }
}
