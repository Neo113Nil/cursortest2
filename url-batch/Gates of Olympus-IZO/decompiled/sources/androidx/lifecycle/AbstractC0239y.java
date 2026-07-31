package androidx.lifecycle;

import a.AbstractC0157a;
import h2.AbstractC0454p;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0239y {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f4048a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f4049b = new HashMap();

    public static void a(Constructor constructor, InterfaceC0235u interfaceC0235u) {
        try {
            Z1.i.e(constructor.newInstance(interfaceC0235u), "{\n            constructo…tance(`object`)\n        }");
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
        HashMap hashMap = f4048a;
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
                Z1.i.e(name, "fullPackage");
                if (name.length() != 0) {
                    Z1.i.e(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    Z1.i.e(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                Z1.i.e(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String concat = AbstractC0454p.g0(canonicalName, ".", "_").concat("_LifecycleAdapter");
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
            HashMap hashMap2 = f4049b;
            if (constructor != null) {
                hashMap2.put(cls, AbstractC0157a.M(constructor));
            } else {
                C0219d c0219d = C0219d.f4017c;
                HashMap hashMap3 = c0219d.f4019b;
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
                            if (((InterfaceC0240z) declaredMethods[i4].getAnnotation(InterfaceC0240z.class)) != null) {
                                c0219d.a(cls, declaredMethods);
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
                    if (superclass != null && InterfaceC0235u.class.isAssignableFrom(superclass)) {
                        Z1.i.e(superclass, "superclass");
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            Z1.i.c(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    Z1.i.e(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 < length2) {
                            Class<?> cls2 = interfaces[i5];
                            if (cls2 != null && InterfaceC0235u.class.isAssignableFrom(cls2)) {
                                Z1.i.e(cls2, "intrface");
                                if (b(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                Z1.i.c(obj2);
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
