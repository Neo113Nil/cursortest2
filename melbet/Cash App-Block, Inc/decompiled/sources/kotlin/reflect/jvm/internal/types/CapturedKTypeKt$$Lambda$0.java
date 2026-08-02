package kotlin.reflect.jvm.internal.types;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import papa.PapaEvent;

/* loaded from: classes9.dex */
public final class CapturedKTypeKt$$Lambda$0 implements Function1 {
    public static final CapturedKTypeKt$$Lambda$0 INSTANCE = new CapturedKTypeKt$$Lambda$0(0);
    public static final CapturedKTypeKt$$Lambda$0 INSTANCE$1 = new CapturedKTypeKt$$Lambda$0(1);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CapturedKTypeKt$$Lambda$0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Class<?> declaringClass;
        KClass kClass = (KClass) obj;
        switch (this.$r8$classId) {
            case 0:
                kClass.getClass();
                if (!kClass.isInner() || (declaringClass = PapaEvent.getJavaClass(kClass).getDeclaringClass()) == null) {
                    return null;
                }
                return Reflection.factory.getOrCreateKotlinClass(declaringClass);
            default:
                kClass.getClass();
                return kClass.getTypeParameters();
        }
    }
}
