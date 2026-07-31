package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private static Map<Class<?>, Integer> f908a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static Map<Class<?>, List<Constructor<? extends d>>> f909b = new HashMap();

    private static d a(Constructor<? extends d> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    private static Constructor<? extends d> b(Class<?> cls) {
        try {
            Package r02 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r02 != null ? r02.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String c7 = c(canonicalName);
            if (!name.isEmpty()) {
                c7 = name + "." + c7;
            }
            Constructor declaredConstructor = Class.forName(c7).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static String c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    private static int d(Class<?> cls) {
        Integer num = f908a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g7 = g(cls);
        f908a.put(cls, Integer.valueOf(g7));
        return g7;
    }

    private static boolean e(Class<?> cls) {
        return cls != null && h.class.isAssignableFrom(cls);
    }

    static g f(Object obj) {
        boolean z6 = obj instanceof g;
        boolean z7 = obj instanceof c;
        if (z6 && z7) {
            return new FullLifecycleObserverAdapter((c) obj, (g) obj);
        }
        if (z7) {
            return new FullLifecycleObserverAdapter((c) obj, null);
        }
        if (z6) {
            return (g) obj;
        }
        Class<?> cls = obj.getClass();
        if (d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends d>> list = f909b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(a(list.get(0), obj));
        }
        d[] dVarArr = new d[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            dVarArr[i7] = a(list.get(i7), obj);
        }
        return new CompositeGeneratedAdaptersObserver(dVarArr);
    }

    private static int g(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends d> b7 = b(cls);
        if (b7 != null) {
            f909b.put(cls, Collections.singletonList(b7));
            return 2;
        }
        if (a.f880c.d(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        ArrayList arrayList = null;
        if (e(superclass)) {
            if (d(superclass) == 1) {
                return 1;
            }
            arrayList = new ArrayList(f909b.get(superclass));
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (e(cls2)) {
                if (d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addAll(f909b.get(cls2));
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f909b.put(cls, arrayList);
        return 2;
    }
}
