package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class wk {
    public static final u20 b = new u20(0);
    public final /* synthetic */ bl a;

    public wk(bl blVar) {
        this.a = blVar;
    }

    public static Class b(ClassLoader classLoader, String str) {
        u20 u20Var = b;
        u20 u20Var2 = (u20) u20Var.get(classLoader);
        if (u20Var2 == null) {
            u20Var2 = new u20(0);
            u20Var.put(classLoader, u20Var2);
        }
        Class cls = (Class) u20Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        u20Var2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            t8.i(str, ": make sure class is a valid subclass of Fragment", e);
            return null;
        } catch (ClassNotFoundException e2) {
            t8.i(str, ": make sure class name exists", e2);
            return null;
        }
    }

    public final mk a(String str) {
        try {
            return (mk) c(this.a.t.p.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            t8.i(str, ": make sure class name exists, is public, and has an empty constructor that is public", e);
            return null;
        } catch (InstantiationException e2) {
            t8.i(str, ": make sure class name exists, is public, and has an empty constructor that is public", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            t8.i(str, ": could not find Fragment constructor", e3);
            return null;
        } catch (InvocationTargetException e4) {
            t8.i(str, ": calling Fragment constructor caused an exception", e4);
            return null;
        }
    }
}
