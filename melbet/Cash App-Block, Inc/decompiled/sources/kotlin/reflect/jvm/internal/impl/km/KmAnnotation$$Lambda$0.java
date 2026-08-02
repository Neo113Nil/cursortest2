package kotlin.reflect.jvm.internal.impl.km;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final class KmAnnotation$$Lambda$0 implements Function1 {
    public static final KmAnnotation$$Lambda$0 INSTANCE = new KmAnnotation$$Lambda$0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pair pair = (Pair) obj;
        pair.getClass();
        return ((String) pair.first) + " = " + ((KmAnnotationArgument) pair.second);
    }
}
