package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import n2.AbstractC0737q;

/* renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0295y {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f5249a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f5250b = new HashMap();

    public static void a(Constructor constructor, InterfaceC0291u interfaceC0291u) {
        try {
            f2.j.e(constructor.newInstance(interfaceC0291u), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    public static int b(Class cls) {
        Constructor<?> constructor;
        boolean z3;
        HashMap hashMap = f5249a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i3 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r3 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r3 != null ? r3.getName() : "";
                f2.j.e(name, "fullPackage");
                if (name.length() != 0) {
                    f2.j.e(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    f2.j.e(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                f2.j.e(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String concat = AbstractC0737q.x(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    concat = name + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(e3);
            }
            HashMap hashMap2 = f5250b;
            if (constructor != null) {
                hashMap2.put(cls, O2.l.l0(constructor));
            } else {
                C0275d c0275d = C0275d.f5218c;
                HashMap hashMap3 = c0275d.f5220b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z3 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z3 = false;
                                break;
                            }
                            if (((InterfaceC0296z) declaredMethods[i4].getAnnotation(InterfaceC0296z.class)) != null) {
                                c0275d.a(cls, declaredMethods);
                                z3 = true;
                                break;
                            }
                            i4++;
                        }
                    } catch (NoClassDefFoundError e4) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
                    }
                }
                if (!z3) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0291u.class.isAssignableFrom(superclass)) {
                        f2.j.e(superclass, "superclass");
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            f2.j.c(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    f2.j.e(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 < length2) {
                            Class<?> cls2 = interfaces[i5];
                            if (cls2 != null && InterfaceC0291u.class.isAssignableFrom(cls2)) {
                                f2.j.e(cls2, "intrface");
                                if (b(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                f2.j.c(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i5++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i3 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i3));
        return i3;
    }
}
