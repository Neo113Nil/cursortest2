package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes9.dex */
public final class ReflectJavaEnumValueAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaEnumValueAnnotationArgument {
    public final Enum value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectJavaEnumValueAnnotationArgument(Name name, Enum<?> r3) {
        super(name, null);
        r3.getClass();
        this.value = r3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument
    public Name getEntryName() {
        return Name.identifier(this.value.name());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument
    public ClassId getEnumClassId() {
        Class<?> cls = this.value.getClass();
        if (!cls.isEnum()) {
            cls = cls.getEnclosingClass();
        }
        cls.getClass();
        return ReflectClassUtilKt.getClassId(cls);
    }
}
