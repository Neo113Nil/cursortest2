package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: b, reason: collision with root package name */
    public static final s.k f4942b = new s.k();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f4943a;

    public G(N n9) {
        this.f4943a = n9;
    }

    public static Class b(ClassLoader classLoader, String str) {
        s.k kVar = f4942b;
        s.k kVar2 = (s.k) kVar.getOrDefault(classLoader, null);
        if (kVar2 == null) {
            kVar2 = new s.k();
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
        } catch (ClassCastException e6) {
            throw new B0.c(D.y.k("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e6);
        } catch (ClassNotFoundException e9) {
            throw new B0.c(D.y.k("Unable to instantiate fragment ", str, ": make sure class name exists"), e9);
        }
    }

    public final AbstractComponentCallbacksC0485s a(String str) {
        try {
            return (AbstractComponentCallbacksC0485s) c(this.f4943a.f4980t.f5188u.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e6) {
            throw new B0.c(D.y.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e6);
        } catch (InstantiationException e9) {
            throw new B0.c(D.y.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e9);
        } catch (NoSuchMethodException e10) {
            throw new B0.c(D.y.k("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e10);
        } catch (InvocationTargetException e11) {
            throw new B0.c(D.y.k("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e11);
        }
    }
}
