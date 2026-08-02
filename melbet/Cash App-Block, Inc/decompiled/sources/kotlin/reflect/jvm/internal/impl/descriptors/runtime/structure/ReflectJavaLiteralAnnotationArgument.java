package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes9.dex */
public final class ReflectJavaLiteralAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaLiteralAnnotationArgument {
    public final Object value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectJavaLiteralAnnotationArgument(Name name, Object obj) {
        super(name, null);
        obj.getClass();
        this.value = obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument
    public Object getValue() {
        return this.value;
    }
}
