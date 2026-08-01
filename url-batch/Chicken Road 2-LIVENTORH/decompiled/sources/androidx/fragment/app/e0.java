package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final q.j f420b = new q.j(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f421a;

    public e0(k0 k0Var) {
        this.f421a = k0Var;
    }

    public static Class b(ClassLoader classLoader, String str) {
        q.j jVar = f420b;
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
            return (u) c(this.f421a.f458t.f568o.getClassLoader(), str).getConstructor(null).newInstance(null);
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
