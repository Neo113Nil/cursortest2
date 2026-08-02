package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes9.dex */
public final class ReflectJavaClass$$Lambda$0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public static final ReflectJavaClass$$Lambda$0 INSTANCE$1 = new ReflectJavaClass$$Lambda$0(1);
    public static final ReflectJavaClass$$Lambda$0 INSTANCE$2 = new ReflectJavaClass$$Lambda$0(2);
    public static final ReflectJavaClass$$Lambda$0 INSTANCE = new ReflectJavaClass$$Lambda$0(0);
    public static final ReflectJavaClass$$Lambda$0 INSTANCE$3 = new ReflectJavaClass$$Lambda$0(3);

    public /* synthetic */ ReflectJavaClass$$Lambda$0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return Boolean.valueOf(((Class) obj).getSimpleName().length() == 0);
            case 1:
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                List list = ReflectClassUtilKt.PRIMITIVE_CLASSES;
                parameterizedType.getClass();
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 2:
                ParameterizedType parameterizedType2 = (ParameterizedType) obj;
                List list2 = ReflectClassUtilKt.PRIMITIVE_CLASSES;
                parameterizedType2.getClass();
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                actualTypeArguments.getClass();
                return ArraysKt___ArraysKt.asSequence(actualTypeArguments);
            default:
                String simpleName = ((Class) obj).getSimpleName();
                if (!Name.isValidIdentifier(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return Name.identifier(simpleName);
                }
                return null;
        }
    }
}
