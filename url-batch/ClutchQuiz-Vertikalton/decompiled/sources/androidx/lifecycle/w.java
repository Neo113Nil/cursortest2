package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f1522a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f1523b = new HashMap();

    public static void a(Constructor constructor, InterfaceC0077s interfaceC0077s) {
        try {
            g1.f.d(constructor.newInstance(interfaceC0077s), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static final String b(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int indexOf = str.indexOf(".", 0);
        if (indexOf >= 0) {
            int length = str.length();
            if (length < 0) {
                throw new OutOfMemoryError();
            }
            StringBuilder sb2 = new StringBuilder(length);
            do {
                sb2.append((CharSequence) str, i, indexOf);
                sb2.append("_");
                i = indexOf + 1;
                if (indexOf >= str.length()) {
                    break;
                }
                indexOf = str.indexOf(".", i);
            } while (indexOf > 0);
            sb2.append((CharSequence) str, i, str.length());
            str = sb2.toString();
            g1.f.d(str, "toString(...)");
        }
        sb.append(str);
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }

    public static int c(Class cls) {
        Constructor<?> constructor;
        boolean z2;
        HashMap hashMap = f1522a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r3 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r3 != null ? r3.getName() : "";
                g1.f.d(name, "fullPackage");
                if (name.length() != 0) {
                    g1.f.d(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    g1.f.d(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                g1.f.d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String b2 = b(canonicalName);
                if (name.length() != 0) {
                    b2 = name + '.' + b2;
                }
                constructor = Class.forName(b2).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException(e2);
            }
            HashMap hashMap2 = f1523b;
            if (constructor != null) {
                hashMap2.put(cls, T.d.z(constructor));
            } else {
                C0062c c0062c = C0062c.f1495c;
                HashMap hashMap3 = c0062c.f1497b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z2 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z2 = false;
                                break;
                            }
                            if (((z) declaredMethods[i2].getAnnotation(z.class)) != null) {
                                c0062c.a(cls, declaredMethods);
                                z2 = true;
                                break;
                            }
                            i2++;
                        }
                    } catch (NoClassDefFoundError e3) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
                    }
                }
                if (!z2) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0077s.class.isAssignableFrom(superclass)) {
                        g1.f.d(superclass, "superclass");
                        if (c(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            g1.f.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    g1.f.d(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            Class<?> cls2 = interfaces[i3];
                            if (cls2 != null && InterfaceC0077s.class.isAssignableFrom(cls2)) {
                                g1.f.d(cls2, "intrface");
                                if (c(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                g1.f.b(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i3++;
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
