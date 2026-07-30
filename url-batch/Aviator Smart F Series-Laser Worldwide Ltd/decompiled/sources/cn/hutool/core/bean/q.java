package cn.hutool.core.bean;

import cn.hutool.core.annotation.s0;
import cn.hutool.core.bean.copier.BeanCopier;
import cn.hutool.core.bean.copier.CopyOptions;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.collection.n0;
import cn.hutool.core.lang.a0;
import cn.hutool.core.lang.z;
import cn.hutool.core.map.CaseInsensitiveMap;
import cn.hutool.core.map.h1;
import cn.hutool.core.util.ModifierUtil;
import cn.hutool.core.util.e0;
import cn.hutool.core.util.y0;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.beans.PropertyEditor;
import java.beans.PropertyEditorManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public class q {
    public static Map<String, Object> beanToMap(Object obj, String... strArr) {
        int i8;
        z zVar;
        if (cn.hutool.core.util.h.isNotEmpty((Object[]) strArr)) {
            i8 = strArr.length;
            final HashSet hashSet = CollUtil.set(false, strArr);
            zVar = new z() { // from class: cn.hutool.core.bean.h
                @Override // cn.hutool.core.lang.z
                public final Object edit(Object obj2) {
                    String lambda$beanToMap$4;
                    lambda$beanToMap$4 = q.lambda$beanToMap$4(hashSet, (String) obj2);
                    return lambda$beanToMap$4;
                }
            };
        } else {
            i8 = 16;
            zVar = null;
        }
        return beanToMap(obj, (Map<String, Object>) new LinkedHashMap(i8, 1.0f), false, zVar);
    }

    public static <T> T copyProperties(Object obj, Class<T> cls, String... strArr) {
        if (obj == null) {
            return null;
        }
        T t7 = (T) y0.newInstanceIfPossible(cls);
        copyProperties(obj, t7, CopyOptions.create().setIgnoreProperties(strArr));
        return t7;
    }

    public static <T> List<T> copyToList(Collection<?> collection, final Class<T> cls, final CopyOptions copyOptions) {
        Stream stream;
        Stream map;
        Collector list;
        Object collect;
        if (collection == null) {
            return null;
        }
        if (collection.isEmpty()) {
            return new ArrayList(0);
        }
        if (cn.hutool.core.util.p.isBasicType(cls) || String.class == cls) {
            return cn.hutool.core.convert.d.toList(cls, collection);
        }
        stream = collection.stream();
        map = stream.map(new Function() { // from class: cn.hutool.core.bean.l
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object lambda$copyToList$6;
                lambda$copyToList$6 = q.lambda$copyToList$6(cls, copyOptions, obj);
                return lambda$copyToList$6;
            }
        });
        list = Collectors.toList();
        collect = map.collect(list);
        return (List) collect;
    }

    public static DynaBean createDynaBean(Object obj) {
        return new DynaBean(obj);
    }

    public static void descForEach(Class<?> cls, Consumer<? super s> consumer) {
        getBeanDesc(cls).getProps().forEach(consumer);
    }

    public static <T> T edit(T t7, z zVar) {
        if (t7 == null) {
            return null;
        }
        for (Field field : y0.getFields(t7.getClass())) {
            if (!ModifierUtil.isStatic(field)) {
                zVar.edit(field);
            }
        }
        return t7;
    }

    public static <T> T fillBean(T t7, cn.hutool.core.bean.copier.p pVar, CopyOptions copyOptions) {
        return pVar == null ? t7 : (T) BeanCopier.create(pVar, t7, copyOptions).copy();
    }

    public static <T> T fillBeanWithMap(Map<?, ?> map, T t7, boolean z7) {
        return (T) fillBeanWithMap(map, (Object) t7, false, z7);
    }

    public static <T> T fillBeanWithMapIgnoreCase(Map<?, ?> map, T t7, boolean z7) {
        return (T) fillBeanWithMap(map, t7, CopyOptions.create().setIgnoreCase(true).setIgnoreError(z7));
    }

    public static PropertyEditor findEditor(Class<?> cls) {
        return PropertyEditorManager.findEditor(cls);
    }

    public static BeanDesc getBeanDesc(Class<?> cls) {
        return BeanDescCache.INSTANCE.getBeanDesc(cls, new g(cls));
    }

    public static String getFieldName(String str) {
        if (str.startsWith("get") || str.startsWith("set")) {
            return cn.hutool.core.text.l.removePreAndLowerFirst(str, 3);
        }
        if (str.startsWith("is")) {
            return cn.hutool.core.text.l.removePreAndLowerFirst(str, 2);
        }
        throw new IllegalArgumentException("Invalid Getter or Setter name: " + str);
    }

    public static Object getFieldValue(Object obj, final String str) {
        if (obj == null || str == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof Collection) {
            try {
                return CollUtil.get((Collection) obj, Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                return CollUtil.map((Collection) obj, new Function() { // from class: cn.hutool.core.bean.p
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        Object lambda$getFieldValue$1;
                        lambda$getFieldValue$1 = q.lambda$getFieldValue$1(str, obj2);
                        return lambda$getFieldValue$1;
                    }
                }, false);
            }
        }
        if (!cn.hutool.core.util.h.isArray(obj)) {
            return y0.getFieldValue(obj, str);
        }
        try {
            return cn.hutool.core.util.h.get(obj, Integer.parseInt(str));
        } catch (NumberFormatException unused2) {
            return cn.hutool.core.util.h.map(obj, Object.class, new Function() { // from class: cn.hutool.core.bean.f
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    Object lambda$getFieldValue$2;
                    lambda$getFieldValue$2 = q.lambda$getFieldValue$2(str, obj2);
                    return lambda$getFieldValue$2;
                }
            });
        }
    }

    public static <T> T getProperty(Object obj, String str) {
        if (obj == null || cn.hutool.core.text.l.isBlank(str)) {
            return null;
        }
        return (T) BeanPath.create(str).get(obj);
    }

    public static PropertyDescriptor getPropertyDescriptor(Class<?> cls, String str) {
        return getPropertyDescriptor(cls, str, false);
    }

    public static Map<String, PropertyDescriptor> getPropertyDescriptorMap(Class<?> cls, boolean z7) {
        return BeanInfoCache.INSTANCE.getPropertyDescriptorMap(cls, z7, new n(cls, z7));
    }

    public static PropertyDescriptor[] getPropertyDescriptors(Class<?> cls) {
        try {
            return (PropertyDescriptor[]) cn.hutool.core.util.h.filter(Introspector.getBeanInfo(cls).getPropertyDescriptors(), new a0() { // from class: cn.hutool.core.bean.i
                @Override // cn.hutool.core.lang.a0
                public final boolean accept(Object obj) {
                    boolean lambda$getPropertyDescriptors$0;
                    lambda$getPropertyDescriptors$0 = q.lambda$getPropertyDescriptors$0((PropertyDescriptor) obj);
                    return lambda$getPropertyDescriptors$0;
                }
            });
        } catch (IntrospectionException e8) {
            throw new BeanException((Throwable) e8);
        }
    }

    public static boolean hasGetter(Class<?> cls) {
        if (cn.hutool.core.util.p.isNormalClass(cls)) {
            for (Method method : cls.getMethods()) {
                if (s0.a(method) == 0) {
                    String name = method.getName();
                    if ((name.startsWith("get") || name.startsWith("is")) && !"getClass".equals(name)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean hasNullField(Object obj, String... strArr) {
        if (obj == null) {
            return true;
        }
        for (Field field : y0.getFields(obj.getClass())) {
            if (!ModifierUtil.isStatic(field) && !cn.hutool.core.util.h.contains(strArr, field.getName()) && y0.getFieldValue(obj, field) == null) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasPublicField(Class<?> cls) {
        if (cn.hutool.core.util.p.isNormalClass(cls)) {
            for (Field field : cls.getFields()) {
                if (ModifierUtil.isPublic(field) && !ModifierUtil.isStatic(field)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasSetter(Class<?> cls) {
        if (cn.hutool.core.util.p.isNormalClass(cls)) {
            for (Method method : cls.getMethods()) {
                if (s0.a(method) == 1 && method.getName().startsWith("set")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, PropertyDescriptor> internalGetPropertyDescriptorMap(Class<?> cls, boolean z7) {
        PropertyDescriptor[] propertyDescriptors = getPropertyDescriptors(cls);
        Map<String, PropertyDescriptor> caseInsensitiveMap = z7 ? new CaseInsensitiveMap<>(propertyDescriptors.length, 1.0f) : new HashMap<>(propertyDescriptors.length, 1.0f);
        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
            caseInsensitiveMap.put(propertyDescriptor.getName(), propertyDescriptor);
        }
        return caseInsensitiveMap;
    }

    public static boolean isBean(Class<?> cls) {
        return hasSetter(cls) || hasPublicField(cls);
    }

    public static boolean isCommonFieldsEqual(Object obj, Object obj2, String... strArr) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        Map<String, Object> beanToMap = beanToMap(obj, new String[0]);
        Map<String, Object> beanToMap2 = beanToMap(obj2, new String[0]);
        Set<String> keySet = beanToMap.keySet();
        keySet.removeAll(Arrays.asList(strArr));
        for (String str : keySet) {
            if (beanToMap.containsKey(str) && beanToMap2.containsKey(str) && e0.notEqual(beanToMap.get(str), beanToMap2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEmpty(Object obj, String... strArr) {
        if (obj == null) {
            return true;
        }
        for (Field field : y0.getFields(obj.getClass())) {
            if (!ModifierUtil.isStatic(field) && !cn.hutool.core.util.h.contains(strArr, field.getName()) && y0.getFieldValue(obj, field) != null) {
                return false;
            }
        }
        return true;
    }

    public static boolean isMatchName(Object obj, String str, boolean z7) {
        if (obj == null || cn.hutool.core.text.l.isBlank(str)) {
            return false;
        }
        String className = cn.hutool.core.util.p.getClassName(obj, z7);
        if (z7) {
            str = cn.hutool.core.text.l.upperFirst(str);
        }
        return className.equals(str);
    }

    public static boolean isNotEmpty(Object obj, String... strArr) {
        return !isEmpty(obj, strArr);
    }

    public static boolean isReadableBean(Class<?> cls) {
        return hasGetter(cls) || hasPublicField(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$beanToMap$4(Set set, String str) {
        if (set.contains(str)) {
            return str;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$beanToMap$5(boolean z7, String str) {
        return z7 ? cn.hutool.core.text.l.toUnderlineCase(str) : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$copyToList$6(Class cls, CopyOptions copyOptions, Object obj) {
        Object newInstanceIfPossible = y0.newInstanceIfPossible(cls);
        copyProperties(obj, newInstanceIfPossible, copyOptions);
        return newInstanceIfPossible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ BeanDesc lambda$getBeanDesc$e7c7684d$1(Class cls) {
        return new BeanDesc(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$getFieldValue$1(String str, Object obj) {
        return getFieldValue(obj, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$getFieldValue$2(String str, Object obj) {
        return getFieldValue(obj, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getPropertyDescriptors$0(PropertyDescriptor propertyDescriptor) {
        return !"class".equals(propertyDescriptor.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Field lambda$trimStrFields$7(String[] strArr, Object obj, Field field) {
        String str;
        if (strArr != null && cn.hutool.core.util.h.containsIgnoreCase(strArr, field.getName())) {
            return field;
        }
        if (String.class.equals(field.getType()) && (str = (String) y0.getFieldValue(obj, field)) != null) {
            String trim = cn.hutool.core.text.l.trim(str);
            if (!str.equals(trim)) {
                y0.setFieldValue(obj, field, trim);
            }
        }
        return field;
    }

    @Deprecated
    public static <T> T mapToBean(Map<?, ?> map, Class<T> cls, boolean z7) {
        return (T) fillBeanWithMap(map, y0.newInstanceIfPossible(cls), z7);
    }

    @Deprecated
    public static <T> T mapToBeanIgnoreCase(Map<?, ?> map, Class<T> cls, boolean z7) {
        return (T) fillBeanWithMapIgnoreCase(map, y0.newInstanceIfPossible(cls), z7);
    }

    public static Object setFieldValue(Object obj, String str, Object obj2) {
        if (obj instanceof Map) {
            ((Map) obj).put(str, obj2);
        } else if (obj instanceof List) {
            n0.setOrPadding((List) obj, cn.hutool.core.convert.d.toInt(str).intValue(), obj2);
        } else {
            if (cn.hutool.core.util.h.isArray(obj)) {
                return cn.hutool.core.util.h.setOrAppend(obj, cn.hutool.core.convert.d.toInt(str).intValue(), obj2);
            }
            y0.setFieldValue(obj, str, obj2);
        }
        return obj;
    }

    public static void setProperty(Object obj, String str, Object obj2) {
        BeanPath.create(str).set(obj, obj2);
    }

    public static <T> T toBean(Object obj, Class<T> cls) {
        return (T) toBean(obj, cls, (CopyOptions) null);
    }

    public static <T> T toBeanIgnoreCase(Object obj, Class<T> cls, boolean z7) {
        return (T) toBean(obj, cls, CopyOptions.create().setIgnoreCase(true).setIgnoreError(z7));
    }

    public static <T> T toBeanIgnoreError(Object obj, Class<T> cls) {
        return (T) toBean(obj, cls, CopyOptions.create().setIgnoreError(true));
    }

    public static <T> T trimStrFields(final T t7, final String... strArr) {
        return (T) edit(t7, new z() { // from class: cn.hutool.core.bean.k
            @Override // cn.hutool.core.lang.z
            public final Object edit(Object obj) {
                Field lambda$trimStrFields$7;
                lambda$trimStrFields$7 = q.lambda$trimStrFields$7(strArr, t7, (Field) obj);
                return lambda$trimStrFields$7;
            }
        });
    }

    public static <T> T fillBeanWithMap(Map<?, ?> map, T t7, boolean z7, boolean z8) {
        return (T) fillBeanWithMap(map, t7, z7, CopyOptions.create().setIgnoreError(z8));
    }

    public static PropertyDescriptor getPropertyDescriptor(Class<?> cls, String str, boolean z7) {
        Map<String, PropertyDescriptor> propertyDescriptorMap = getPropertyDescriptorMap(cls, z7);
        if (propertyDescriptorMap == null) {
            return null;
        }
        return propertyDescriptorMap.get(str);
    }

    @Deprecated
    public static <T> T mapToBean(Map<?, ?> map, Class<T> cls, CopyOptions copyOptions) {
        return (T) fillBeanWithMap(map, y0.newInstanceIfPossible(cls), copyOptions);
    }

    public static <T> T toBean(Object obj, final Class<T> cls, CopyOptions copyOptions) {
        return (T) toBean(obj, new Supplier() { // from class: cn.hutool.core.bean.m
            @Override // java.util.function.Supplier
            public final Object get() {
                Object newInstanceIfPossible;
                newInstanceIfPossible = y0.newInstanceIfPossible(cls);
                return newInstanceIfPossible;
            }
        }, copyOptions);
    }

    public static void copyProperties(Object obj, Object obj2, String... strArr) {
        copyProperties(obj, obj2, CopyOptions.create().setIgnoreProperties(strArr));
    }

    public static <T> T fillBeanWithMap(Map<?, ?> map, T t7, CopyOptions copyOptions) {
        return (T) fillBeanWithMap(map, (Object) t7, false, copyOptions);
    }

    public static <T> T mapToBean(Map<?, ?> map, Class<T> cls, boolean z7, CopyOptions copyOptions) {
        return (T) fillBeanWithMap(map, y0.newInstanceIfPossible(cls), z7, copyOptions);
    }

    public static <T> T toBean(Object obj, Supplier<T> supplier, CopyOptions copyOptions) {
        Object obj2;
        if (obj == null || supplier == null) {
            return null;
        }
        obj2 = supplier.get();
        T t7 = (T) obj2;
        copyProperties(obj, t7, copyOptions);
        return t7;
    }

    public static void copyProperties(Object obj, Object obj2, boolean z7) {
        BeanCopier.create(obj, obj2, CopyOptions.create().setIgnoreCase(z7)).copy();
    }

    public static <T> T fillBeanWithMap(Map<?, ?> map, T t7, boolean z7, CopyOptions copyOptions) {
        if (h1.isEmpty(map)) {
            return t7;
        }
        if (z7) {
            map = h1.toCamelCaseMap(map);
        }
        copyProperties(map, t7, copyOptions);
        return t7;
    }

    public static void copyProperties(Object obj, Object obj2, CopyOptions copyOptions) {
        if (obj == null) {
            return;
        }
        BeanCopier.create(obj, obj2, (CopyOptions) e0.defaultIfNull(copyOptions, new o())).copy();
    }

    public static <T> T toBean(Class<T> cls, cn.hutool.core.bean.copier.p pVar, CopyOptions copyOptions) {
        if (cls == null || pVar == null) {
            return null;
        }
        return (T) fillBean(y0.newInstanceIfPossible(cls), pVar, copyOptions);
    }

    public static Map<String, Object> beanToMap(Object obj, boolean z7, boolean z8) {
        if (obj == null) {
            return null;
        }
        return beanToMap(obj, new LinkedHashMap(), z7, z8);
    }

    public static Map<String, Object> beanToMap(Object obj, Map<String, Object> map, final boolean z7, boolean z8) {
        if (obj == null) {
            return null;
        }
        return beanToMap(obj, map, z8, new z() { // from class: cn.hutool.core.bean.j
            @Override // cn.hutool.core.lang.z
            public final Object edit(Object obj2) {
                String lambda$beanToMap$5;
                lambda$beanToMap$5 = q.lambda$beanToMap$5(z7, (String) obj2);
                return lambda$beanToMap$5;
            }
        });
    }

    public static <T> List<T> copyToList(Collection<?> collection, Class<T> cls) {
        return copyToList(collection, cls, CopyOptions.create());
    }

    public static Map<String, Object> beanToMap(Object obj, Map<String, Object> map, boolean z7, z zVar) {
        if (obj == null) {
            return null;
        }
        return (Map) BeanCopier.create(obj, map, CopyOptions.create().setIgnoreNullValue(z7).setFieldNameEditor(zVar)).copy();
    }

    public static Map<String, Object> beanToMap(Object obj, Map<String, Object> map, CopyOptions copyOptions) {
        if (obj == null) {
            return null;
        }
        return (Map) BeanCopier.create(obj, map, copyOptions).copy();
    }
}
