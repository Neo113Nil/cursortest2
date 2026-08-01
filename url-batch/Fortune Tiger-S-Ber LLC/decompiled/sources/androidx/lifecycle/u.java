package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f605a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f606b = new HashMap();

    public static void a(Constructor constructor, q qVar) {
        try {
            u2.c.d(constructor.newInstance(qVar), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    public static int b(Class cls) {
        Constructor<?> constructor;
        boolean z3;
        HashMap hashMap = f605a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i4 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r3 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r3 != null ? r3.getName() : "";
                u2.c.d(name, "fullPackage");
                if (name.length() != 0) {
                    u2.c.d(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    u2.c.d(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                u2.c.d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String concat = b3.m.Z(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    concat = name + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException(e4);
            }
            HashMap hashMap2 = f606b;
            if (constructor != null) {
                hashMap2.put(cls, m0.a.r(constructor));
            } else {
                c cVar = c.c;
                HashMap hashMap3 = cVar.f578b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z3 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z3 = false;
                                break;
                            }
                            if (((y) declaredMethods[i5].getAnnotation(y.class)) != null) {
                                cVar.a(cls, declaredMethods);
                                z3 = true;
                                break;
                            }
                            i5++;
                        }
                    } catch (NoClassDefFoundError e5) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e5);
                    }
                }
                if (!z3) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && q.class.isAssignableFrom(superclass)) {
                        u2.c.d(superclass, "superclass");
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            u2.c.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    u2.c.d(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length2) {
                            Class<?> cls2 = interfaces[i6];
                            if (cls2 != null && q.class.isAssignableFrom(cls2)) {
                                u2.c.d(cls2, "intrface");
                                if (b(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                u2.c.b(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i6++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i4 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i4));
        return i4;
    }
}
