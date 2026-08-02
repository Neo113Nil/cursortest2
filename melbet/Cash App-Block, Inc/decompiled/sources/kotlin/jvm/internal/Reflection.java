package kotlin.jvm.internal;

import java.util.Collections;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.internal.ReflectionFactoryImpl;

/* loaded from: classes3.dex */
public class Reflection {
    public static final ReflectionFactory factory;

    static {
        ReflectionFactory reflectionFactory = null;
        try {
            reflectionFactory = (ReflectionFactory) ReflectionFactoryImpl.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (reflectionFactory == null) {
            reflectionFactory = new ReflectionFactory();
        }
        factory = reflectionFactory;
    }

    public static KClass getOrCreateKotlinClass(Class cls) {
        return factory.getOrCreateKotlinClass(cls);
    }

    public static KType nullableTypeOf(Class cls) {
        ReflectionFactory reflectionFactory = factory;
        return reflectionFactory.typeOf(reflectionFactory.getOrCreateKotlinClass(cls), Collections.EMPTY_LIST, true);
    }

    public static KType typeOf(Class cls, KTypeProjection kTypeProjection) {
        ReflectionFactory reflectionFactory = factory;
        return reflectionFactory.typeOf(reflectionFactory.getOrCreateKotlinClass(cls), Collections.singletonList(kTypeProjection), false);
    }

    public static KType typeOf(Class cls) {
        ReflectionFactory reflectionFactory = factory;
        return reflectionFactory.typeOf(reflectionFactory.getOrCreateKotlinClass(cls), Collections.EMPTY_LIST, false);
    }
}
