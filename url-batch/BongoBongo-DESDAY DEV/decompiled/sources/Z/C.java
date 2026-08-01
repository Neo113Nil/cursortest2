package Z;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: b, reason: collision with root package name */
    public static final p.k f993b = new p.k();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f994a;

    public C(I i) {
        this.f994a = i;
    }

    public static Class b(ClassLoader classLoader, String str) {
        p.k kVar = f993b;
        p.k kVar2 = (p.k) kVar.getOrDefault(classLoader, null);
        if (kVar2 == null) {
            kVar2 = new p.k();
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
        } catch (ClassCastException e2) {
            throw new V0.f("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        } catch (ClassNotFoundException e3) {
            throw new V0.f("Unable to instantiate fragment " + str + ": make sure class name exists", e3);
        }
    }

    public final AbstractComponentCallbacksC0050q a(String str) {
        try {
            return (AbstractComponentCallbacksC0050q) c(this.f994a.f1030t.f1210f.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e2) {
            throw new V0.f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new V0.f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new V0.f("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new V0.f("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }
}
