package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;

/* loaded from: classes9.dex */
public final class ReflectJavaField extends ReflectJavaMember implements JavaField {
    public final Field member;

    public ReflectJavaField(Field field) {
        field.getClass();
        this.member = field;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    public boolean getHasConstantNotNullInitializer() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    public ReflectJavaType getType() {
        ReflectJavaType.Factory factory = ReflectJavaType.Factory;
        Type genericType = getMember().getGenericType();
        genericType.getClass();
        return factory.create(genericType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    public boolean isEnumEntry() {
        return getMember().isEnumConstant();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    public Field getMember() {
        return this.member;
    }
}
