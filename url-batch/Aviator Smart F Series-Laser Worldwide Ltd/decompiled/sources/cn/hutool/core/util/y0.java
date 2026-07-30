package cn.hutool.core.util;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.collection.UniqueKeySet;
import cn.hutool.core.exceptions.InvocationTargetRuntimeException;
import cn.hutool.core.exceptions.UtilException;
import cn.hutool.core.lang.func.Func0;
import cn.hutool.core.map.WeakConcurrentMap;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* loaded from: classes.dex */
public class y0 {
    private static final WeakConcurrentMap<Class<?>, Constructor<?>[]> CONSTRUCTORS_CACHE = new WeakConcurrentMap<>();
    private static final WeakConcurrentMap<Class<?>, Field[]> FIELDS_CACHE = new WeakConcurrentMap<>();
    private static final WeakConcurrentMap<Class<?>, Method[]> METHODS_CACHE = new WeakConcurrentMap<>();

    public static <T> Constructor<T> getConstructor(Class<T> cls, Class<?>... clsArr) {
        if (cls == null) {
            return null;
        }
        for (Constructor<T> constructor : getConstructors(cls)) {
            if (p.isAllAssignableFrom(constructor.getParameterTypes(), clsArr)) {
                setAccessible(constructor);
                return constructor;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Constructor<T>[] getConstructors(Class<T> cls) {
        cn.hutool.core.lang.q.notNull(cls);
        return CONSTRUCTORS_CACHE.computeIfAbsent((WeakConcurrentMap<Class<?>, Constructor<?>[]>) cls, (Func0<? extends Constructor<?>[]>) new s0(cls));
    }

    public static Constructor<?>[] getConstructorsDirectly(Class<?> cls) {
        return cls.getDeclaredConstructors();
    }

    private static List<Method> getDefaultMethodsFromInterface(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Method method : cls2.getMethods()) {
                if (!ModifierUtil.isAbstract(method)) {
                    arrayList.add(method);
                }
            }
        }
        return arrayList;
    }

    public static Field getField(Class<?> cls, final String str) {
        return (Field) h.firstMatch(new cn.hutool.core.lang.d0() { // from class: cn.hutool.core.util.w0
            @Override // cn.hutool.core.lang.d0
            public final boolean match(Object obj) {
                boolean lambda$getField$0;
                lambda$getField$0 = y0.lambda$getField$0(str, (Field) obj);
                return lambda$getField$0;
            }
        }, getFields(cls));
    }

    public static Map<String, Field> getFieldMap(Class<?> cls) {
        Field[] fields = getFields(cls);
        HashMap newHashMap = cn.hutool.core.map.h1.newHashMap(fields.length, true);
        for (Field field : fields) {
            newHashMap.put(field.getName(), field);
        }
        return newHashMap;
    }

    public static String getFieldName(Field field) {
        if (field == null) {
            return null;
        }
        cn.hutool.core.annotation.p pVar = (cn.hutool.core.annotation.p) field.getAnnotation(cn.hutool.core.annotation.p.class);
        return pVar != null ? pVar.value() : field.getName();
    }

    public static Object getFieldValue(Object obj, String str) {
        if (obj == null || cn.hutool.core.text.l.isBlank(str)) {
            return null;
        }
        return getFieldValue(obj, getField(obj instanceof Class ? (Class) obj : obj.getClass(), str));
    }

    public static Field[] getFields(Class<?> cls) {
        cn.hutool.core.lang.q.notNull(cls);
        return FIELDS_CACHE.computeIfAbsent((WeakConcurrentMap<Class<?>, Field[]>) cls, (Func0<? extends Field[]>) new x0(cls));
    }

    public static Field[] getFieldsDirectly(Class<?> cls, boolean z7) {
        cn.hutool.core.lang.q.notNull(cls);
        Field[] fieldArr = null;
        while (cls != null) {
            Field[] declaredFields = cls.getDeclaredFields();
            fieldArr = fieldArr == null ? declaredFields : (Field[]) h.append((Object[]) fieldArr, (Object[]) declaredFields);
            cls = z7 ? cls.getSuperclass() : null;
        }
        return fieldArr;
    }

    public static Object[] getFieldsValue(Object obj) {
        if (obj == null) {
            return null;
        }
        Field[] fields = getFields(obj instanceof Class ? (Class) obj : obj.getClass());
        if (fields == null) {
            return null;
        }
        Object[] objArr = new Object[fields.length];
        for (int i8 = 0; i8 < fields.length; i8++) {
            objArr[i8] = getFieldValue(obj, fields[i8]);
        }
        return objArr;
    }

    public static Method getMethod(Class<?> cls, String str, Class<?>... clsArr) {
        return getMethod(cls, false, str, clsArr);
    }

    public static Method getMethodByName(Class<?> cls, String str) {
        return getMethodByName(cls, false, str);
    }

    public static Method getMethodByNameIgnoreCase(Class<?> cls, String str) {
        return getMethodByName(cls, true, str);
    }

    public static Method getMethodIgnoreCase(Class<?> cls, String str, Class<?>... clsArr) {
        return getMethod(cls, true, str, clsArr);
    }

    public static Set<String> getMethodNames(Class<?> cls) {
        HashSet hashSet = new HashSet();
        for (Method method : getMethods(cls)) {
            hashSet.add(method.getName());
        }
        return hashSet;
    }

    public static Method getMethodOfObj(Object obj, String str, Object... objArr) {
        if (obj == null || cn.hutool.core.text.l.isBlank(str)) {
            return null;
        }
        return getMethod(obj.getClass(), str, p.getClasses(objArr));
    }

    public static Method[] getMethods(Class<?> cls, cn.hutool.core.lang.a0 a0Var) {
        if (cls == null) {
            return null;
        }
        return (Method[]) h.filter(getMethods(cls), a0Var);
    }

    public static Method[] getMethodsDirectly(Class<?> cls, boolean z7, boolean z8) {
        cn.hutool.core.lang.q.notNull(cls);
        if (cls.isInterface()) {
            return z7 ? cls.getMethods() : cls.getDeclaredMethods();
        }
        UniqueKeySet uniqueKeySet = new UniqueKeySet(true, new Function() { // from class: cn.hutool.core.util.t0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String uniqueKey;
                uniqueKey = y0.getUniqueKey((Method) obj);
                return uniqueKey;
            }
        });
        while (cls != null && (z8 || Object.class != cls)) {
            uniqueKeySet.addAllIfAbsent(Arrays.asList(cls.getDeclaredMethods()));
            uniqueKeySet.addAllIfAbsent(getDefaultMethodsFromInterface(cls));
            cls = (!z7 || cls.isInterface()) ? null : cls.getSuperclass();
        }
        return (Method[]) uniqueKeySet.toArray(new Method[0]);
    }

    public static Method getPublicMethod(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Set<String> getPublicMethodNames(Class<?> cls) {
        HashSet hashSet = new HashSet();
        Method[] publicMethods = getPublicMethods(cls);
        if (h.isNotEmpty((Object[]) publicMethods)) {
            for (Method method : publicMethods) {
                hashSet.add(method.getName());
            }
        }
        return hashSet;
    }

    public static Method[] getPublicMethods(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return cls.getMethods();
    }

    public static Object getStaticFieldValue(Field field) {
        return getFieldValue((Object) null, field);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getUniqueKey(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getReturnType().getName());
        sb.append('#');
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        for (int i8 = 0; i8 < parameterTypes.length; i8++) {
            if (i8 == 0) {
                sb.append(':');
            } else {
                sb.append(',');
            }
            sb.append(parameterTypes[i8].getName());
        }
        return sb.toString();
    }

    public static boolean hasField(Class<?> cls, String str) {
        return getField(cls, str) != null;
    }

    public static <T> T invoke(Object obj, Method method, Object... objArr) {
        try {
            return (T) invokeRaw(obj, method, objArr);
        } catch (IllegalAccessException e8) {
            throw new UtilException(e8);
        } catch (InvocationTargetException e9) {
            throw new InvocationTargetRuntimeException(e9);
        }
    }

    public static <T> T invokeRaw(Object obj, Method method, Object... objArr) {
        boolean isDefault;
        Object obj2;
        setAccessible(method);
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length;
        Object[] objArr2 = new Object[length];
        if (objArr != null) {
            for (int i8 = 0; i8 < length; i8++) {
                if (i8 >= objArr.length || (obj2 = objArr[i8]) == null) {
                    objArr2[i8] = p.getDefaultValue(parameterTypes[i8]);
                } else if (obj2 instanceof cn.hutool.core.bean.r) {
                    objArr2[i8] = null;
                } else if (parameterTypes[i8].isAssignableFrom(obj2.getClass())) {
                    objArr2[i8] = objArr[i8];
                } else {
                    Object convertWithCheck = cn.hutool.core.convert.d.convertWithCheck(parameterTypes[i8], objArr[i8], null, true);
                    if (convertWithCheck != null) {
                        objArr2[i8] = convertWithCheck;
                    } else {
                        objArr2[i8] = objArr[i8];
                    }
                }
            }
        }
        isDefault = method.isDefault();
        if (isDefault) {
            return (T) q.q.invokeSpecial(obj, method, objArr);
        }
        if (p.isStatic(method)) {
            obj = null;
        }
        return (T) method.invoke(obj, objArr2);
    }

    public static <T> T invokeStatic(Method method, Object... objArr) {
        return (T) invoke((Object) null, method, objArr);
    }

    public static <T> T invokeWithCheck(Object obj, Method method, Object... objArr) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (objArr != null) {
            cn.hutool.core.lang.q.isTrue(objArr.length == parameterTypes.length, "Params length [{}] is not fit for param length [{}] of method !", Integer.valueOf(objArr.length), Integer.valueOf(parameterTypes.length));
            for (int i8 = 0; i8 < objArr.length; i8++) {
                Class<?> cls = parameterTypes[i8];
                if (cls.isPrimitive() && objArr[i8] == null) {
                    objArr[i8] = p.getDefaultValue(cls);
                }
            }
        }
        return (T) invoke(obj, method, objArr);
    }

    public static boolean isEmptyParam(Method method) {
        return cn.hutool.core.annotation.s0.a(method) == 0;
    }

    public static boolean isEqualsMethod(Method method) {
        return method != null && 1 == cn.hutool.core.annotation.s0.a(method) && "equals".equals(method.getName()) && method.getParameterTypes()[0] == Object.class;
    }

    public static boolean isGetterOrSetter(Method method, boolean z7) {
        int a8;
        if (method == null || (a8 = cn.hutool.core.annotation.s0.a(method)) > 1) {
            return false;
        }
        String name = method.getName();
        if ("getClass".equals(name)) {
            return false;
        }
        if (z7) {
            name = name.toLowerCase();
        }
        if (a8 == 0) {
            return name.startsWith("get") || name.startsWith("is");
        }
        if (a8 != 1) {
            return false;
        }
        return name.startsWith("set");
    }

    public static boolean isGetterOrSetterIgnoreCase(Method method) {
        return isGetterOrSetter(method, true);
    }

    public static boolean isHashCodeMethod(Method method) {
        return method != null && "hashCode".equals(method.getName()) && isEmptyParam(method);
    }

    public static boolean isOuterClassField(Field field) {
        return "this$0".equals(field.getName());
    }

    public static boolean isToStringMethod(Method method) {
        return method != null && "toString".equals(method.getName()) && isEmptyParam(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getField$0(String str, Field field) {
        return str.equals(getFieldName(field));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Field[] lambda$getFields$54eedd5e$1(Class cls) {
        return getFieldsDirectly(cls, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Method[] lambda$getMethods$ea73458f$1(Class cls) {
        return getMethodsDirectly(cls, true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getPublicMethods$1(HashSet hashSet, Method method) {
        return !hashSet.contains(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getPublicMethods$2(HashSet hashSet, Method method) {
        return !hashSet.contains(method.getName());
    }

    public static <T> T newInstance(String str) {
        try {
            return (T) Class.forName(str).newInstance();
        } catch (Exception e8) {
            throw new UtilException(e8, "Instance class [{}] error!", str);
        }
    }

    public static <T> T newInstanceIfPossible(Class<T> cls) {
        cn.hutool.core.lang.q.notNull(cls);
        if (cls.isPrimitive()) {
            return (T) p.getPrimitiveDefaultValue(cls);
        }
        if (cls.isAssignableFrom(AbstractMap.class)) {
            cls = (Class<T>) HashMap.class;
        } else if (cls.isAssignableFrom(List.class)) {
            cls = (Class<T>) ArrayList.class;
        } else if (cls.isAssignableFrom(Set.class)) {
            cls = (Class<T>) HashSet.class;
        }
        try {
            return (T) newInstance(cls, new Object[0]);
        } catch (Exception unused) {
            if (cls.isEnum()) {
                return cls.getEnumConstants()[0];
            }
            if (cls.isArray()) {
                return (T) Array.newInstance(cls.getComponentType(), 0);
            }
            Constructor[] constructors = getConstructors(cls);
            int length = constructors.length;
            for (int i8 = 0; i8 < length; i8++) {
                Constructor constructor = constructors[i8];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes.length != 0) {
                    setAccessible(constructor);
                    try {
                        return (T) constructor.newInstance(p.getDefaultValues(parameterTypes));
                    } catch (Exception unused2) {
                        continue;
                    }
                }
            }
            return null;
        }
    }

    public static void removeFinalModify(Field field) {
        ModifierUtil.removeFinalModify(field);
    }

    public static <T extends AccessibleObject> T setAccessible(T t7) {
        if (t7 != null && !t7.isAccessible()) {
            t7.setAccessible(true);
        }
        return t7;
    }

    public static void setFieldValue(Object obj, String str, Object obj2) {
        cn.hutool.core.lang.q.notNull(obj);
        cn.hutool.core.lang.q.notBlank(str);
        Field field = getField(obj instanceof Class ? (Class) obj : obj.getClass(), str);
        cn.hutool.core.lang.q.notNull(field, "Field [{}] is not exist in [{}]", str, obj.getClass().getName());
        setFieldValue(obj, field, obj2);
    }

    public static Method getMethod(Class<?> cls, boolean z7, String str, Class<?>... clsArr) {
        Method method = null;
        if (cls != null && !cn.hutool.core.text.l.isBlank(str)) {
            Method[] methods = getMethods(cls);
            if (h.isNotEmpty((Object[]) methods)) {
                for (Method method2 : methods) {
                    if (cn.hutool.core.text.l.equals(str, method2.getName(), z7) && p.isAllAssignableFrom(method2.getParameterTypes(), clsArr) && (method == null || method.getReturnType().isAssignableFrom(method2.getReturnType()))) {
                        method = method2;
                    }
                }
            }
        }
        return method;
    }

    public static Method getMethodByName(Class<?> cls, boolean z7, String str) {
        Method method = null;
        if (cls != null && !cn.hutool.core.text.l.isBlank(str)) {
            Method[] methods = getMethods(cls);
            if (h.isNotEmpty((Object[]) methods)) {
                for (Method method2 : methods) {
                    if (cn.hutool.core.text.l.equals(str, method2.getName(), z7) && (method == null || method.getReturnType().isAssignableFrom(method2.getReturnType()))) {
                        method = method2;
                    }
                }
            }
        }
        return method;
    }

    public static Method[] getMethods(Class<?> cls) {
        cn.hutool.core.lang.q.notNull(cls);
        return METHODS_CACHE.computeIfAbsent((WeakConcurrentMap<Class<?>, Method[]>) cls, (Func0<? extends Method[]>) new v0(cls));
    }

    public static List<Method> getPublicMethods(Class<?> cls, cn.hutool.core.lang.a0 a0Var) {
        if (cls == null) {
            return null;
        }
        Method[] publicMethods = getPublicMethods(cls);
        if (a0Var == null) {
            return CollUtil.newArrayList(publicMethods);
        }
        ArrayList arrayList = new ArrayList();
        for (Method method : publicMethods) {
            if (a0Var.accept(method)) {
                arrayList.add(method);
            }
        }
        return arrayList;
    }

    public static Object getFieldValue(Object obj, Field field) {
        if (field == null) {
            return null;
        }
        if (obj instanceof Class) {
            obj = null;
        }
        setAccessible(field);
        try {
            return field.get(obj);
        } catch (IllegalAccessException e8) {
            throw new UtilException(e8, "IllegalAccess for {}.{}", field.getDeclaringClass(), field.getName());
        }
    }

    public static Field[] getFields(Class<?> cls, cn.hutool.core.lang.a0 a0Var) {
        return (Field[]) h.filter(getFields(cls), a0Var);
    }

    public static <T> T newInstance(Class<T> cls, Object... objArr) {
        if (h.isEmpty(objArr)) {
            Constructor constructor = getConstructor(cls, new Class[0]);
            if (constructor != null) {
                try {
                    return (T) constructor.newInstance(new Object[0]);
                } catch (Exception e8) {
                    throw new UtilException(e8, "Instance class [{}] error!", cls);
                }
            }
            throw new UtilException("No constructor for [{}]", cls);
        }
        Class<?>[] classes = p.getClasses(objArr);
        Constructor constructor2 = getConstructor(cls, classes);
        if (constructor2 != null) {
            try {
                return (T) constructor2.newInstance(objArr);
            } catch (Exception e9) {
                throw new UtilException(e9, "Instance class [{}] error!", cls);
            }
        }
        throw new UtilException("No Constructor matched for parameter types: [{}]", classes);
    }

    public static <T> T invoke(Object obj, String str, Object... objArr) {
        cn.hutool.core.lang.q.notNull(obj, "Object to get method must be not null!", new Object[0]);
        cn.hutool.core.lang.q.notBlank(str, "Method name must be not blank!", new Object[0]);
        Method methodOfObj = getMethodOfObj(obj, str, objArr);
        if (methodOfObj != null) {
            return (T) invoke(obj, methodOfObj, objArr);
        }
        throw new UtilException("No such method: [{}] from [{}]", str, obj.getClass());
    }

    public static void setFieldValue(Object obj, Field field, Object obj2) {
        Object convert;
        cn.hutool.core.lang.q.notNull(field, "Field in [{}] not exist !", obj);
        Class<?> type = field.getType();
        if (obj2 != null) {
            if (!type.isAssignableFrom(obj2.getClass()) && (convert = cn.hutool.core.convert.d.convert((Class<Object>) type, obj2)) != null) {
                obj2 = convert;
            }
        } else {
            obj2 = p.getDefaultValue(type);
        }
        setAccessible(field);
        try {
            field.set(obj instanceof Class ? null : obj, obj2);
        } catch (IllegalAccessException e8) {
            throw new UtilException(e8, "IllegalAccess for {}.{}", obj, field.getName());
        }
    }

    public static List<Method> getPublicMethods(Class<?> cls, Method... methodArr) {
        final HashSet newHashSet = CollUtil.newHashSet(methodArr);
        return getPublicMethods(cls, new cn.hutool.core.lang.a0() { // from class: cn.hutool.core.util.u0
            @Override // cn.hutool.core.lang.a0
            public final boolean accept(Object obj) {
                boolean lambda$getPublicMethods$1;
                lambda$getPublicMethods$1 = y0.lambda$getPublicMethods$1(newHashSet, (Method) obj);
                return lambda$getPublicMethods$1;
            }
        });
    }

    public static List<Method> getPublicMethods(Class<?> cls, String... strArr) {
        final HashSet newHashSet = CollUtil.newHashSet(strArr);
        return getPublicMethods(cls, new cn.hutool.core.lang.a0() { // from class: cn.hutool.core.util.r0
            @Override // cn.hutool.core.lang.a0
            public final boolean accept(Object obj) {
                boolean lambda$getPublicMethods$2;
                lambda$getPublicMethods$2 = y0.lambda$getPublicMethods$2(newHashSet, (Method) obj);
                return lambda$getPublicMethods$2;
            }
        });
    }
}
