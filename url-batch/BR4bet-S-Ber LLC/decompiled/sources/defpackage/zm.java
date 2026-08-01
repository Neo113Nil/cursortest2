package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class zm {
    public static final w50 b = new w50(0);
    public final /* synthetic */ en a;

    public zm(en enVar) {
        this.a = enVar;
    }

    public static Class b(ClassLoader classLoader, String str) {
        w50 w50Var = b;
        w50 w50Var2 = (w50) w50Var.get(classLoader);
        if (w50Var2 == null) {
            w50Var2 = new w50(0);
            w50Var.put(classLoader, w50Var2);
        }
        Class cls = (Class) w50Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        w50Var2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new lc(f60.f("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new lc(f60.f("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final pm a(String str) {
        try {
            return (pm) c(this.a.t.s.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new lc(f60.f("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new lc(f60.f("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new lc(f60.f("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new lc(f60.f("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
