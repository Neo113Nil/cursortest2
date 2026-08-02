package kotlin.reflect.jvm.internal;

import com.google.crypto.tink.subtle.Hkdf;
import java.lang.reflect.Field;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;

/* loaded from: classes9.dex */
public final class JvmPropertySignature$JavaField extends Hkdf {
    public final Field field;

    public JvmPropertySignature$JavaField(Field field) {
        field.getClass();
        this.field = field;
    }

    @Override // com.google.crypto.tink.subtle.Hkdf
    public final String asString() {
        StringBuilder sb = new StringBuilder();
        Field field = this.field;
        String name = field.getName();
        name.getClass();
        sb.append(JvmAbi.getterName(name));
        sb.append("()");
        Class<?> type2 = field.getType();
        type2.getClass();
        sb.append(ReflectClassUtilKt.getDesc(type2));
        return sb.toString();
    }

    public final Field getField() {
        return this.field;
    }
}
