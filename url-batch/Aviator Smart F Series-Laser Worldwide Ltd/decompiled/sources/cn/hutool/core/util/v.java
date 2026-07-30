package cn.hutool.core.util;

import cn.hutool.core.lang.func.Func1;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public class v {
    public static <E extends Enum<E>> boolean contains(Class<E> cls, String str) {
        return getEnumMap(cls).containsKey(str);
    }

    public static boolean equals(Enum<?> r02, String str) {
        return cn.hutool.core.text.l.equals(toString(r02), str);
    }

    public static boolean equalsIgnoreCase(Enum<?> r02, String str) {
        return cn.hutool.core.text.l.equalsIgnoreCase(toString(r02), str);
    }

    public static <E extends Enum<E>> E fromString(Class<E> cls, String str) {
        return (E) Enum.valueOf(cls, str);
    }

    public static <E extends Enum<E>> E fromStringQuietly(Class<E> cls, String str) {
        if (cls != null && !cn.hutool.core.text.l.isBlank(str)) {
            try {
                return (E) fromString(cls, str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public static <E extends Enum<E>> E getBy(Class<E> cls, Predicate<? super E> predicate) {
        Stream stream;
        Stream filter;
        Optional findFirst;
        Object orElse;
        stream = Arrays.stream(cls.getEnumConstants());
        filter = stream.filter(predicate);
        findFirst = filter.findFirst();
        orElse = findFirst.orElse(null);
        return (E) orElse;
    }

    public static <E extends Enum<E>> E getEnumAt(Class<E> cls, int i8) {
        E[] enumConstants = cls.getEnumConstants();
        if (i8 < 0 || i8 >= enumConstants.length) {
            return null;
        }
        return enumConstants[i8];
    }

    public static <E extends Enum<E>> LinkedHashMap<String, E> getEnumMap(Class<E> cls) {
        LinkedHashMap<String, E> linkedHashMap = new LinkedHashMap<>();
        for (E e8 : cls.getEnumConstants()) {
            linkedHashMap.put(e8.name(), e8);
        }
        return linkedHashMap;
    }

    public static <E extends Enum<E>, F, C> F getFieldBy(final Func1<E, F> func1, final Function<E, C> function, final C c8) {
        Stream stream;
        Stream filter;
        Optional findFirst;
        Optional map;
        Object orElse;
        Class realClass = m.e.getRealClass(func1);
        if (Enum.class.equals(realClass)) {
            realClass = m.e.getRealClass(func1);
        }
        stream = Arrays.stream(realClass.getEnumConstants());
        filter = stream.filter(new Predicate() { // from class: cn.hutool.core.util.s
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$getFieldBy$1;
                lambda$getFieldBy$1 = v.lambda$getFieldBy$1(function, c8, (Enum) obj);
                return lambda$getFieldBy$1;
            }
        });
        findFirst = filter.findFirst();
        func1.getClass();
        map = findFirst.map(new Function() { // from class: cn.hutool.core.util.t
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Func1.this.callWithRuntimeException((Enum) obj);
            }
        });
        orElse = map.orElse(null);
        return (F) orElse;
    }

    public static List<String> getFieldNames(Class<? extends Enum<?>> cls) {
        ArrayList arrayList = new ArrayList();
        for (Field field : y0.getFields(cls)) {
            String name = field.getName();
            if (!field.getType().isEnum() && !name.contains("$VALUES") && !"ordinal".equals(name) && !arrayList.contains(name)) {
                arrayList.add(name);
            }
        }
        return arrayList;
    }

    public static List<Object> getFieldValues(Class<? extends Enum<?>> cls, String str) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        if (enumArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(enumArr.length);
        for (Enum r02 : enumArr) {
            arrayList.add(y0.getFieldValue(r02, str));
        }
        return arrayList;
    }

    public static Map<String, Object> getNameFieldMap(Class<? extends Enum<?>> cls, String str) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        if (enumArr == null) {
            return null;
        }
        HashMap newHashMap = cn.hutool.core.map.h1.newHashMap(enumArr.length, true);
        for (Enum r32 : enumArr) {
            newHashMap.put(r32.name(), y0.getFieldValue(r32, str));
        }
        return newHashMap;
    }

    public static List<String> getNames(Class<? extends Enum<?>> cls) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        if (enumArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(enumArr.length);
        for (Enum r02 : enumArr) {
            arrayList.add(r02.name());
        }
        return arrayList;
    }

    public static boolean isEnum(Class<?> cls) {
        cn.hutool.core.lang.q.notNull(cls);
        return cls.isEnum();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getBy$0(Func1 func1, Object obj, Enum r22) {
        return func1.callWithRuntimeException(r22).equals(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getFieldBy$1(Function function, Object obj, Enum r22) {
        Object apply;
        apply = function.apply(r22);
        return apply.equals(obj);
    }

    public static <E extends Enum<E>> E likeValueOf(Class<E> cls, Object obj) {
        if (obj instanceof CharSequence) {
            obj = obj.toString().trim();
        }
        Field[] fields = y0.getFields(cls);
        E[] enumConstants = cls.getEnumConstants();
        for (Field field : fields) {
            String name = field.getName();
            if (!field.getType().isEnum() && !"ENUM$VALUES".equals(name) && !"ordinal".equals(name)) {
                for (E e8 : enumConstants) {
                    if (e0.equal(obj, y0.getFieldValue(e8, field))) {
                        return e8;
                    }
                }
            }
        }
        return null;
    }

    public static <E extends Enum<E>> boolean notContains(Class<E> cls, String str) {
        return !contains(cls, str);
    }

    public static String toString(Enum<?> r02) {
        if (r02 != null) {
            return r02.name();
        }
        return null;
    }

    public static <E extends Enum<E>> E fromString(Class<E> cls, String str, E e8) {
        return (E) e0.defaultIfNull((E) fromStringQuietly(cls, str), e8);
    }

    public static <E extends Enum<E>, C> E getBy(final Func1<E, C> func1, final C c8) {
        Stream stream;
        Stream filter;
        Optional findAny;
        Object orElse;
        Class realClass = m.e.getRealClass(func1);
        if (Enum.class.equals(realClass)) {
            realClass = m.e.getRealClass(func1);
        }
        stream = Arrays.stream(realClass.getEnumConstants());
        filter = stream.filter(new Predicate() { // from class: cn.hutool.core.util.u
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$getBy$0;
                lambda$getBy$0 = v.lambda$getBy$0(Func1.this, c8, (Enum) obj);
                return lambda$getBy$0;
            }
        });
        findAny = filter.findAny();
        orElse = findAny.orElse(null);
        return (E) orElse;
    }

    public static boolean isEnum(Object obj) {
        cn.hutool.core.lang.q.notNull(obj);
        return obj.getClass().isEnum();
    }

    public static <E extends Enum<E>, C> E getBy(Func1<E, C> func1, C c8, E e8) {
        return (E) e0.defaultIfNull((E) getBy(func1, c8), e8);
    }
}
