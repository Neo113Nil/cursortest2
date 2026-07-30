package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import cn.hutool.core.convert.ConvertException;
import cn.hutool.core.lang.EnumItem;
import cn.hutool.core.map.WeakConcurrentMap;
import cn.hutool.core.util.ModifierUtil;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public class EnumConverter extends AbstractConverter<Object> {
    private static final WeakConcurrentMap<Class<?>, Map<Class<?>, Method>> VALUE_OF_METHOD_CACHE = new WeakConcurrentMap<>();
    private static final long serialVersionUID = 1;
    private final Class enumClass;

    public EnumConverter(Class cls) {
        this.enumClass = cls;
    }

    private static Map<Class<?>, Method> getMethodMap(final Class<?> cls) {
        return VALUE_OF_METHOD_CACHE.computeIfAbsent((WeakConcurrentMap<Class<?>, Map<Class<?>, Method>>) cls, (Function<? super WeakConcurrentMap<Class<?>, Map<Class<?>, Method>>, ? extends Map<Class<?>, Method>>) new Function() { // from class: cn.hutool.core.convert.impl.l
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Map lambda$getMethodMap$6;
                lambda$getMethodMap$6 = EnumConverter.lambda$getMethodMap$6(cls, (Class) obj);
                return lambda$getMethodMap$6;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getMethodMap$6(final Class cls, Class cls2) {
        Stream stream;
        Stream filter;
        Stream filter2;
        Stream filter3;
        Stream filter4;
        Collector map;
        Object collect;
        stream = Arrays.stream(cls.getMethods());
        filter = stream.filter(new Predicate() { // from class: cn.hutool.core.convert.impl.o
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ModifierUtil.isStatic((Method) obj);
            }
        });
        filter2 = filter.filter(new Predicate() { // from class: cn.hutool.core.convert.impl.p
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$null$0;
                lambda$null$0 = EnumConverter.lambda$null$0(cls, (Method) obj);
                return lambda$null$0;
            }
        });
        filter3 = filter2.filter(new Predicate() { // from class: cn.hutool.core.convert.impl.q
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$null$1;
                lambda$null$1 = EnumConverter.lambda$null$1((Method) obj);
                return lambda$null$1;
            }
        });
        filter4 = filter3.filter(new Predicate() { // from class: cn.hutool.core.convert.impl.r
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$null$2;
                lambda$null$2 = EnumConverter.lambda$null$2((Method) obj);
                return lambda$null$2;
            }
        });
        map = Collectors.toMap(new Function() { // from class: cn.hutool.core.convert.impl.k
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Class lambda$null$3;
                lambda$null$3 = EnumConverter.lambda$null$3((Method) obj);
                return lambda$null$3;
            }
        }, new Function() { // from class: cn.hutool.core.convert.impl.m
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Method lambda$null$4;
                lambda$null$4 = EnumConverter.lambda$null$4((Method) obj);
                return lambda$null$4;
            }
        }, new BinaryOperator() { // from class: cn.hutool.core.convert.impl.n
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Method lambda$null$5;
                lambda$null$5 = EnumConverter.lambda$null$5((Method) obj, (Method) obj2);
                return lambda$null$5;
            }
        });
        collect = filter4.collect(map);
        return (Map) collect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$null$0(Class cls, Method method) {
        return method.getReturnType() == cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$null$1(Method method) {
        return cn.hutool.core.annotation.s0.a(method) == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$null$2(Method method) {
        return !"valueOf".equals(method.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Class lambda$null$3(Method method) {
        return method.getParameterTypes()[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Method lambda$null$4(Method method) {
        return method;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Method lambda$null$5(Method method, Method method2) {
        return method;
    }

    protected static Enum tryConvertEnum(Object obj, Class cls) {
        if (obj == null) {
            return null;
        }
        if (EnumItem.class.isAssignableFrom(cls)) {
            s.a(cn.hutool.core.util.v.getEnumAt(cls, 0));
        }
        try {
            Map<Class<?>, Method> methodMap = getMethodMap(cls);
            if (cn.hutool.core.map.h1.isNotEmpty(methodMap)) {
                Class<?> cls2 = obj.getClass();
                for (Map.Entry<Class<?>, Method> entry : methodMap.entrySet()) {
                    if (cn.hutool.core.util.p.isAssignable(entry.getKey(), cls2)) {
                        return (Enum) cn.hutool.core.util.y0.invokeStatic(entry.getValue(), obj);
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (obj instanceof Integer) {
            return cn.hutool.core.util.v.getEnumAt(cls, ((Integer) obj).intValue());
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            return Enum.valueOf(cls, (String) obj);
        } catch (IllegalArgumentException unused2) {
            return null;
        }
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    protected Object convertInternal(Object obj) {
        Enum tryConvertEnum = tryConvertEnum(obj, this.enumClass);
        if (tryConvertEnum == null && !(obj instanceof String)) {
            tryConvertEnum = Enum.valueOf(this.enumClass, convertToStr(obj));
        }
        if (tryConvertEnum != null) {
            return tryConvertEnum;
        }
        throw new ConvertException("Can not convert {} to {}", obj, this.enumClass);
    }

    @Override // cn.hutool.core.convert.AbstractConverter, cn.hutool.core.convert.f
    public /* bridge */ /* synthetic */ Object convertWithCheck(Object obj, Object obj2, boolean z7) {
        return cn.hutool.core.convert.e.a(this, obj, obj2, z7);
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    public Class<Object> getTargetType() {
        return this.enumClass;
    }
}
