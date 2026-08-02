package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes9.dex */
public abstract class ReflectJavaAnnotationArgument implements JavaAnnotationArgument {
    public static final Factory Factory = new Factory(null);
    public final Name name;

    public static final class Factory {
        public Factory(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final ReflectJavaAnnotationArgument create(Object obj, Name name) {
            obj.getClass();
            return ReflectClassUtilKt.isEnumClassOrSpecializedEnumEntryClass(obj.getClass()) ? new ReflectJavaEnumValueAnnotationArgument(name, (Enum) obj) : obj instanceof Annotation ? new ReflectJavaAnnotationAsAnnotationArgument(name, (Annotation) obj) : obj instanceof Object[] ? new ReflectJavaArrayAnnotationArgument(name, (Object[]) obj) : obj instanceof Class ? new ReflectJavaClassObjectAnnotationArgument(name, (Class) obj) : new ReflectJavaLiteralAnnotationArgument(name, obj);
        }
    }

    public ReflectJavaAnnotationArgument(Name name, DefaultConstructorMarker defaultConstructorMarker) {
        this.name = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument
    public Name getName() {
        return this.name;
    }
}
