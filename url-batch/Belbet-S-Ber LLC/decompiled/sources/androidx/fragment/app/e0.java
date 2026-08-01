package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final q.j f533b = new q.j(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f534a;

    public e0(k0 k0Var) {
        this.f534a = k0Var;
    }

    public static Class b(ClassLoader classLoader, String str) {
        q.j jVar = f533b;
        q.j jVar2 = (q.j) jVar.get(classLoader);
        if (jVar2 == null) {
            jVar2 = new q.j(0);
            jVar.put(classLoader, jVar2);
        }
        Class cls = (Class) jVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        jVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e4) {
            throw new t("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e4);
        } catch (ClassNotFoundException e5) {
            throw new t("Unable to instantiate fragment " + str + ": make sure class name exists", e5);
        }
    }

    public final u a(String str) {
        try {
            return (u) c(this.f534a.f570t.f674p.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e4) {
            throw new t("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (InstantiationException e5) {
            throw new t("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e5);
        } catch (NoSuchMethodException e6) {
            throw new t("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e6);
        } catch (InvocationTargetException e7) {
            throw new t("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e7);
        }
    }
}
