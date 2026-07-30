package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f5296a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f5297b = new HashMap();

    public static void a(Constructor constructor, InterfaceC0512u interfaceC0512u) {
        try {
            kotlin.jvm.internal.h.d(constructor.newInstance(interfaceC0512u), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e6) {
            throw new RuntimeException(e6);
        } catch (InstantiationException e9) {
            throw new RuntimeException(e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static int b(Class cls) {
        Constructor<?> constructor;
        boolean z8;
        HashMap hashMap = f5296a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r32 = cls.getPackage();
                String name = cls.getCanonicalName();
                String fullPackage = r32 != null ? r32.getName() : "";
                kotlin.jvm.internal.h.d(fullPackage, "fullPackage");
                if (fullPackage.length() != 0) {
                    kotlin.jvm.internal.h.d(name, "name");
                    name = name.substring(fullPackage.length() + 1);
                    kotlin.jvm.internal.h.d(name, "this as java.lang.String).substring(startIndex)");
                }
                kotlin.jvm.internal.h.d(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String concat = M7.q.G(name, com.anythink.core.common.d.j.f12535z, "_").concat("_LifecycleAdapter");
                if (fullPackage.length() != 0) {
                    concat = fullPackage + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e6) {
                throw new RuntimeException(e6);
            }
            HashMap hashMap2 = f5297b;
            if (constructor != null) {
                hashMap2.put(cls, p8.g.k(constructor));
            } else {
                C0496d c0496d = C0496d.f5270c;
                HashMap hashMap3 = c0496d.f5272b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z8 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z8 = false;
                                break;
                            }
                            if (((D) declaredMethods[i4].getAnnotation(D.class)) != null) {
                                c0496d.a(cls, declaredMethods);
                                z8 = true;
                                break;
                            }
                            i4++;
                        }
                    } catch (NoClassDefFoundError e9) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e9);
                    }
                }
                if (!z8) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0512u.class.isAssignableFrom(superclass)) {
                        kotlin.jvm.internal.h.d(superclass, "superclass");
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            kotlin.jvm.internal.h.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    kotlin.jvm.internal.h.d(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 < length2) {
                            Class<?> intrface = interfaces[i9];
                            if (intrface != null && InterfaceC0512u.class.isAssignableFrom(intrface)) {
                                kotlin.jvm.internal.h.d(intrface, "intrface");
                                if (b(intrface) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(intrface);
                                kotlin.jvm.internal.h.b(obj2);
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
