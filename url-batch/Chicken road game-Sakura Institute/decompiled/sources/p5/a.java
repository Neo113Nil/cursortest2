package p5;

import android.util.Log;
import g5.d;
import g5.g;
import g5.h;
import g5.j;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Class f7201a;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f7202b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7203c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7204d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f7205e = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f7207g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f7206f = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f7208h = new HashMap();

    public a(Class cls) {
        this.f7201a = cls;
        this.f7203c = cls.isAnnotationPresent(j.class);
        this.f7204d = !cls.isAnnotationPresent(g.class);
        Constructor constructor = null;
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            constructor = declaredConstructor;
        } catch (NoSuchMethodException unused) {
        }
        this.f7202b = constructor;
        Method[] methods = cls.getMethods();
        int length = methods.length;
        int i7 = 0;
        while (true) {
            Class cls2 = Void.TYPE;
            if (i7 >= length) {
                for (Field field : cls.getFields()) {
                    if (!field.getDeclaringClass().equals(Object.class) && Modifier.isPublic(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers()) && !field.isAnnotationPresent(d.class)) {
                        String b9 = b(field);
                        a(b9 == null ? field.getName() : b9);
                    }
                }
                HashMap hashMap = new HashMap();
                Class cls3 = cls;
                do {
                    for (Method method : cls3.getDeclaredMethods()) {
                        if (method.getName().startsWith("set") && !method.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method.getModifiers()) && method.getReturnType().equals(cls2) && method.getParameterTypes().length == 1 && !method.isAnnotationPresent(d.class)) {
                            String e9 = e(method);
                            String str = (String) this.f7205e.get(e9.toLowerCase(Locale.US));
                            if (str == null) {
                                continue;
                            } else {
                                if (!str.equals(e9)) {
                                    throw new g5.b("Found setter with invalid case-sensitive name: " + method.getName());
                                }
                                if (method.isBridge()) {
                                    hashMap.put(e9, method);
                                } else {
                                    Method method2 = (Method) this.f7207g.get(e9);
                                    Method method3 = (Method) hashMap.get(e9);
                                    if (method2 == null) {
                                        method.setAccessible(true);
                                        this.f7207g.put(e9, method);
                                    } else if (!d(method, method2) && (method3 == null || !d(method, method3))) {
                                        throw new g5.b("Found a conflicting setters with name: " + method.getName() + " (conflicts with " + method2.getName() + " defined on " + method2.getDeclaringClass().getName() + ")");
                                    }
                                }
                            }
                        }
                    }
                    for (Field field2 : cls3.getDeclaredFields()) {
                        String b10 = b(field2);
                        b10 = b10 == null ? field2.getName() : b10;
                        if (this.f7205e.containsKey(b10.toLowerCase(Locale.US)) && !this.f7208h.containsKey(b10)) {
                            field2.setAccessible(true);
                            this.f7208h.put(b10, field2);
                        }
                    }
                    cls3 = cls3.getSuperclass();
                    if (cls3 == null) {
                        break;
                    }
                } while (!cls3.equals(Object.class));
                if (this.f7205e.isEmpty()) {
                    throw new g5.b("No properties to serialize found on class ".concat(cls.getName()));
                }
                return;
            }
            Method method4 = methods[i7];
            if ((method4.getName().startsWith("get") || method4.getName().startsWith("is")) && !method4.getDeclaringClass().equals(Object.class) && Modifier.isPublic(method4.getModifiers()) && !Modifier.isStatic(method4.getModifiers()) && !method4.getReturnType().equals(cls2) && method4.getParameterTypes().length == 0 && !method4.isBridge() && !method4.isAnnotationPresent(d.class)) {
                String e10 = e(method4);
                a(e10);
                method4.setAccessible(true);
                if (this.f7206f.containsKey(e10)) {
                    throw new g5.b("Found conflicting getters for name: " + method4.getName());
                }
                this.f7206f.put(e10, method4);
            }
            i7++;
        }
    }

    public static String b(AccessibleObject accessibleObject) {
        if (accessibleObject.isAnnotationPresent(h.class)) {
            return ((h) accessibleObject.getAnnotation(h.class)).value();
        }
        return null;
    }

    public static boolean d(Method method, Method method2) {
        o5.j.b("Expected override from a base class", method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()));
        Class<?> returnType = method.getReturnType();
        Class cls = Void.TYPE;
        o5.j.b("Expected void return type", returnType.equals(cls));
        o5.j.b("Expected void return type", method2.getReturnType().equals(cls));
        Class<?>[] parameterTypes = method.getParameterTypes();
        Class<?>[] parameterTypes2 = method2.getParameterTypes();
        o5.j.b("Expected exactly one parameter", parameterTypes.length == 1);
        o5.j.b("Expected exactly one parameter", parameterTypes2.length == 1);
        return method.getName().equals(method2.getName()) && parameterTypes[0].equals(parameterTypes2[0]);
    }

    public static String e(Method method) {
        String b9 = b(method);
        if (b9 != null) {
            return b9;
        }
        String name = method.getName();
        String[] strArr = {"get", "set", "is"};
        String str = null;
        for (int i7 = 0; i7 < 3; i7++) {
            String str2 = strArr[i7];
            if (name.startsWith(str2)) {
                str = str2;
            }
        }
        if (str == null) {
            throw new IllegalArgumentException("Unknown Bean prefix for method: " + name);
        }
        char[] charArray = name.substring(str.length()).toCharArray();
        for (int i8 = 0; i8 < charArray.length && Character.isUpperCase(charArray[i8]); i8++) {
            charArray[i8] = Character.toLowerCase(charArray[i8]);
        }
        return new String(charArray);
    }

    public static Type f(Type type, Map map) {
        if (!(type instanceof TypeVariable)) {
            return type;
        }
        Type type2 = (Type) map.get(type);
        if (type2 != null) {
            return type2;
        }
        throw new IllegalStateException("Could not resolve type " + type);
    }

    public final void a(String str) {
        Locale locale = Locale.US;
        String str2 = (String) this.f7205e.put(str.toLowerCase(locale), str);
        if (str2 == null || str.equals(str2)) {
            return;
        }
        throw new g5.b("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(locale));
    }

    public final Object c(Map map, Map map2) {
        Class cls = this.f7201a;
        Constructor constructor = this.f7202b;
        if (constructor == null) {
            throw new g5.b("Class " + cls.getName() + " does not define a no-argument constructor. If you are using ProGuard, make sure these constructors are not stripped.");
        }
        try {
            Object newInstance = constructor.newInstance(null);
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                HashMap hashMap = this.f7207g;
                if (hashMap.containsKey(str)) {
                    Method method = (Method) hashMap.get(str);
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    if (genericParameterTypes.length != 1) {
                        throw new IllegalStateException("Setter does not have exactly one parameter");
                    }
                    try {
                        method.invoke(newInstance, b.c(entry.getValue(), f(genericParameterTypes[0], map2)));
                    } catch (IllegalAccessException e9) {
                        throw new RuntimeException(e9);
                    } catch (InvocationTargetException e10) {
                        throw new RuntimeException(e10);
                    }
                } else {
                    HashMap hashMap2 = this.f7208h;
                    if (hashMap2.containsKey(str)) {
                        Field field = (Field) hashMap2.get(str);
                        try {
                            field.set(newInstance, b.c(entry.getValue(), f(field.getGenericType(), map2)));
                        } catch (IllegalAccessException e11) {
                            throw new RuntimeException(e11);
                        }
                    } else {
                        String str2 = "No setter/field for " + str + " found on class " + cls.getName();
                        if (this.f7205e.containsKey(str.toLowerCase(Locale.US))) {
                            str2 = str2 + " (fields/setters are case sensitive!)";
                        }
                        if (this.f7203c) {
                            throw new g5.b(str2);
                        }
                        if (this.f7204d) {
                            Log.w("ClassMapper", str2);
                        }
                    }
                }
            }
            return newInstance;
        } catch (IllegalAccessException e12) {
            throw new RuntimeException(e12);
        } catch (InstantiationException e13) {
            throw new RuntimeException(e13);
        } catch (InvocationTargetException e14) {
            throw new RuntimeException(e14);
        }
    }
}
