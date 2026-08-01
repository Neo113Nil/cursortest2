package Z;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: b, reason: collision with root package name */
    public static final q.k f1012b = new q.k();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f1013a;

    public C(I i) {
        this.f1013a = i;
    }

    public static Class b(ClassLoader classLoader, String str) {
        q.k kVar = f1012b;
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
        } catch (ClassCastException e2) {
            throw new W0.b("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        } catch (ClassNotFoundException e3) {
            throw new W0.b("Unable to instantiate fragment " + str + ": make sure class name exists", e3);
        }
    }

    public final AbstractComponentCallbacksC0047q a(String str) {
        try {
            return (AbstractComponentCallbacksC0047q) c(this.f1013a.f1048t.f1219b.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e2) {
            throw new W0.b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new W0.b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new W0.b("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new W0.b("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }
}
