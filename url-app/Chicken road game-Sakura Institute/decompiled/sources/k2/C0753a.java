package k2;

import android.util.Log;
import b2.C0518b;
import b2.InterfaceC0520d;
import b2.g;
import b2.h;
import b2.j;
import j2.AbstractC0720j;
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

/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0753a {

    /* renamed from: a, reason: collision with root package name */
    public final Class f7419a;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f7420b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7421c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7422d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f7423e = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f7425g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f7424f = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f7426h = new HashMap();

    public C0753a(Class cls) {
        this.f7419a = cls;
        this.f7421c = cls.isAnnotationPresent(j.class);
        this.f7422d = !cls.isAnnotationPresent(g.class);
        Constructor constructor = null;
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            constructor = declaredConstructor;
        } catch (NoSuchMethodException unused) {
        }
        this.f7420b = constructor;
        for (Method method : cls.getMethods()) {
            if ((method.getName().startsWith("get") || method.getName().startsWith("is")) && !method.getDeclaringClass().equals(Object.class) && Modifier.isPublic(method.getModifiers()) && !Modifier.isStatic(method.getModifiers()) && !method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 0 && !method.isBridge() && !method.isAnnotationPresent(InterfaceC0520d.class)) {
                String e4 = e(method);
                a(e4);
                method.setAccessible(true);
                if (this.f7424f.containsKey(e4)) {
                    throw new C0518b("Found conflicting getters for name: " + method.getName());
                }
                this.f7424f.put(e4, method);
            }
        }
        for (Field field : cls.getFields()) {
            if (!field.getDeclaringClass().equals(Object.class) && Modifier.isPublic(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers()) && !field.isAnnotationPresent(InterfaceC0520d.class)) {
                String b4 = b(field);
                a(b4 == null ? field.getName() : b4);
            }
        }
        HashMap hashMap = new HashMap();
        Class cls2 = cls;
        do {
            for (Method method2 : cls2.getDeclaredMethods()) {
                if (method2.getName().startsWith("set") && !method2.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method2.getModifiers()) && method2.getReturnType().equals(Void.TYPE) && method2.getParameterTypes().length == 1 && !method2.isAnnotationPresent(InterfaceC0520d.class)) {
                    String e5 = e(method2);
                    String str = (String) this.f7423e.get(e5.toLowerCase(Locale.US));
                    if (str == null) {
                        continue;
                    } else {
                        if (!str.equals(e5)) {
                            throw new C0518b("Found setter with invalid case-sensitive name: " + method2.getName());
                        }
                        if (method2.isBridge()) {
                            hashMap.put(e5, method2);
                        } else {
                            Method method3 = (Method) this.f7425g.get(e5);
                            Method method4 = (Method) hashMap.get(e5);
                            if (method3 == null) {
                                method2.setAccessible(true);
                                this.f7425g.put(e5, method2);
                            } else if (!d(method2, method3) && (method4 == null || !d(method2, method4))) {
                                throw new C0518b("Found a conflicting setters with name: " + method2.getName() + " (conflicts with " + method3.getName() + " defined on " + method3.getDeclaringClass().getName() + ")");
                            }
                        }
                    }
                }
            }
            for (Field field2 : cls2.getDeclaredFields()) {
                String b5 = b(field2);
                b5 = b5 == null ? field2.getName() : b5;
                if (this.f7423e.containsKey(b5.toLowerCase(Locale.US)) && !this.f7426h.containsKey(b5)) {
                    field2.setAccessible(true);
                    this.f7426h.put(b5, field2);
                }
            }
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                break;
            }
        } while (!cls2.equals(Object.class));
        if (this.f7423e.isEmpty()) {
            throw new C0518b("No properties to serialize found on class ".concat(cls.getName()));
        }
    }

    public static String b(AccessibleObject accessibleObject) {
        if (accessibleObject.isAnnotationPresent(h.class)) {
            return ((h) accessibleObject.getAnnotation(h.class)).value();
        }
        return null;
    }

    public static boolean d(Method method, Method method2) {
        AbstractC0720j.b("Expected override from a base class", method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()));
        Class<?> returnType = method.getReturnType();
        Class cls = Void.TYPE;
        AbstractC0720j.b("Expected void return type", returnType.equals(cls));
        AbstractC0720j.b("Expected void return type", method2.getReturnType().equals(cls));
        Class<?>[] parameterTypes = method.getParameterTypes();
        Class<?>[] parameterTypes2 = method2.getParameterTypes();
        AbstractC0720j.b("Expected exactly one parameter", parameterTypes.length == 1);
        AbstractC0720j.b("Expected exactly one parameter", parameterTypes2.length == 1);
        return method.getName().equals(method2.getName()) && parameterTypes[0].equals(parameterTypes2[0]);
    }

    public static String e(Method method) {
        String b4 = b(method);
        if (b4 != null) {
            return b4;
        }
        String name = method.getName();
        String[] strArr = {"get", "set", "is"};
        String str = null;
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = strArr[i2];
            if (name.startsWith(str2)) {
                str = str2;
            }
        }
        if (str == null) {
            throw new IllegalArgumentException("Unknown Bean prefix for method: " + name);
        }
        char[] charArray = name.substring(str.length()).toCharArray();
        for (int i4 = 0; i4 < charArray.length && Character.isUpperCase(charArray[i4]); i4++) {
            charArray[i4] = Character.toLowerCase(charArray[i4]);
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
        String str2 = (String) this.f7423e.put(str.toLowerCase(locale), str);
        if (str2 == null || str.equals(str2)) {
            return;
        }
        throw new C0518b("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(locale));
    }

    public final Object c(Map map, Map map2) {
        Class cls = this.f7419a;
        Constructor constructor = this.f7420b;
        if (constructor == null) {
            throw new C0518b("Class " + cls.getName() + " does not define a no-argument constructor. If you are using ProGuard, make sure these constructors are not stripped.");
        }
        try {
            Object newInstance = constructor.newInstance(null);
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                HashMap hashMap = this.f7425g;
                if (hashMap.containsKey(str)) {
                    Method method = (Method) hashMap.get(str);
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    if (genericParameterTypes.length != 1) {
                        throw new IllegalStateException("Setter does not have exactly one parameter");
                    }
                    try {
                        method.invoke(newInstance, b.c(entry.getValue(), f(genericParameterTypes[0], map2)));
                    } catch (IllegalAccessException e4) {
                        throw new RuntimeException(e4);
                    } catch (InvocationTargetException e5) {
                        throw new RuntimeException(e5);
                    }
                } else {
                    HashMap hashMap2 = this.f7426h;
                    if (hashMap2.containsKey(str)) {
                        Field field = (Field) hashMap2.get(str);
                        try {
                            field.set(newInstance, b.c(entry.getValue(), f(field.getGenericType(), map2)));
                        } catch (IllegalAccessException e6) {
                            throw new RuntimeException(e6);
                        }
                    } else {
                        String str2 = "No setter/field for " + str + " found on class " + cls.getName();
                        if (this.f7423e.containsKey(str.toLowerCase(Locale.US))) {
                            str2 = str2 + " (fields/setters are case sensitive!)";
                        }
                        if (this.f7421c) {
                            throw new C0518b(str2);
                        }
                        if (this.f7422d) {
                            Log.w("ClassMapper", str2);
                        }
                    }
                }
            }
            return newInstance;
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }
}
