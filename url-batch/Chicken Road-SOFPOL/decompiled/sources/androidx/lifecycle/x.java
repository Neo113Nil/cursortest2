package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f878a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f879b = new HashMap();

    public static void a(Constructor constructor, t tVar) {
        try {
            q6.i.b(constructor.newInstance(tVar));
            throw new ClassCastException();
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (InstantiationException e9) {
            throw new RuntimeException(e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static int b(Class cls) {
        Constructor<?> constructor;
        boolean z3;
        HashMap hashMap = f878a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r32 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r32 != null ? r32.getName() : "";
                q6.i.b(name);
                if (name.length() != 0) {
                    q6.i.b(canonicalName);
                    canonicalName = canonicalName.substring(name.length() + 1);
                    q6.i.d(canonicalName, "substring(...)");
                }
                q6.i.b(canonicalName);
                String concat = y6.j.f0(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    concat = name + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e8) {
                throw new RuntimeException(e8);
            }
            HashMap hashMap2 = f879b;
            if (constructor != null) {
                hashMap2.put(cls, s6.a.x(constructor));
            } else {
                d dVar = d.f812c;
                HashMap hashMap3 = dVar.f814b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z3 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z3 = false;
                                break;
                            }
                            if (((a0) declaredMethods[i8].getAnnotation(a0.class)) != null) {
                                dVar.a(cls, declaredMethods);
                                z3 = true;
                                break;
                            }
                            i8++;
                        }
                    } catch (NoClassDefFoundError e9) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e9);
                    }
                }
                if (!z3) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && t.class.isAssignableFrom(superclass)) {
                        q6.i.b(superclass);
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            q6.i.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    q6.i.d(interfaces, "getInterfaces(...)");
                    int length2 = interfaces.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 < length2) {
                            Class<?> cls2 = interfaces[i9];
                            if (cls2 != null && t.class.isAssignableFrom(cls2)) {
                                q6.i.b(cls2);
                                if (b(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                q6.i.b(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i9++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i = 2;
        }
        hashMap.put(cls, Integer.valueOf(i));
        return i;
    }
}
