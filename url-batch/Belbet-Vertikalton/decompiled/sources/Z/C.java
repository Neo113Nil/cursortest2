package Z;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: b, reason: collision with root package name */
    public static final q.k f1425b = new q.k();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f1426a;

    public C(I i) {
        this.f1426a = i;
    }

    public static Class b(ClassLoader classLoader, String str) {
        q.k kVar = f1425b;
        q.k kVar2 = (q.k) kVar.getOrDefault(classLoader, null);
        if (kVar2 == null) {
            kVar2 = new q.k();
            kVar.put(classLoader, kVar2);
        }
        Class cls = (Class) kVar2.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        kVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new W0.c("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
        } catch (ClassNotFoundException e2) {
            throw new W0.c("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
        }
    }

    public final AbstractComponentCallbacksC0053q a(String str) {
        try {
            return (AbstractComponentCallbacksC0053q) c(this.f1426a.f1461t.f1638c.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new W0.c("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw new W0.c("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new W0.c("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new W0.c("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }
}
