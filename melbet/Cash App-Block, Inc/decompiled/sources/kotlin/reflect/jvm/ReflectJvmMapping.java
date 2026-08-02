package kotlin.reflect.jvm;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import kotlin.reflect.jvm.internal.ReflectKCallable;
import kotlin.reflect.jvm.internal.ReflectKProperty;
import kotlin.reflect.jvm.internal.ReflectProperties$LazySoftVal;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.types.AbstractKType;

/* loaded from: classes9.dex */
public abstract class ReflectJvmMapping {
    public static final Field getJavaField(KProperty kProperty) {
        kProperty.getClass();
        ReflectKProperty asReflectProperty = UtilKt.asReflectProperty(kProperty);
        if (asReflectProperty != null) {
            return asReflectProperty.getJavaField();
        }
        return null;
    }

    public static final Method getJavaMethod(KFunction kFunction) {
        Caller caller;
        kFunction.getClass();
        ReflectKCallable asReflectCallable = UtilKt.asReflectCallable(kFunction);
        Member member = (asReflectCallable == null || (caller = asReflectCallable.getCaller()) == null) ? null : caller.getMember();
        if (member instanceof Method) {
            return (Method) member;
        }
        return null;
    }

    public static final Type getJavaType(KType kType) {
        kType.getClass();
        if (kType instanceof AbstractKType) {
            ReflectProperties$LazySoftVal reflectProperties$LazySoftVal = ((AbstractKType) kType).computeJavaType;
            Type type2 = reflectProperties$LazySoftVal != null ? (Type) reflectProperties$LazySoftVal.invoke() : null;
            if (type2 != null) {
                return type2;
            }
        }
        return TypesJVMKt.computeJavaType(kType, false);
    }
}
