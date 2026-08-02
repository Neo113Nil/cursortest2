package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Constructor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class ReflectJavaClass$constructors$2 extends FunctionReferenceImpl implements Function1 {
    public static final ReflectJavaClass$constructors$2 INSTANCE = new ReflectJavaClass$constructors$2(1, ReflectJavaConstructor.class, "<init>", "<init>(Ljava/lang/reflect/Constructor;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Constructor constructor = (Constructor) obj;
        constructor.getClass();
        return new ReflectJavaConstructor(constructor);
    }
}
