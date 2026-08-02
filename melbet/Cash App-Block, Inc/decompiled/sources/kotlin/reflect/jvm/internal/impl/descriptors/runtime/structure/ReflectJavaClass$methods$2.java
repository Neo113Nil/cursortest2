package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class ReflectJavaClass$methods$2 extends FunctionReferenceImpl implements Function1 {
    public static final ReflectJavaClass$methods$2 INSTANCE = new ReflectJavaClass$methods$2(1, ReflectJavaMethod.class, "<init>", "<init>(Ljava/lang/reflect/Method;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Method method = (Method) obj;
        method.getClass();
        return new ReflectJavaMethod(method);
    }
}
