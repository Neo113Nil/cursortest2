package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Field;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class ReflectJavaClass$fields$2 extends FunctionReferenceImpl implements Function1 {
    public static final ReflectJavaClass$fields$2 INSTANCE = new ReflectJavaClass$fields$2(1, ReflectJavaField.class, "<init>", "<init>(Ljava/lang/reflect/Field;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Field field = (Field) obj;
        field.getClass();
        return new ReflectJavaField(field);
    }
}
