package defpackage;

import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class fq {
    public static final zd0 b = new zd0(0);
    public final /* synthetic */ c a;

    public fq(c cVar) {
        this.a = cVar;
    }

    public static Class b(ClassLoader classLoader, String str) {
        zd0 zd0Var = b;
        zd0 zd0Var2 = (zd0) zd0Var.get(classLoader);
        if (zd0Var2 == null) {
            zd0Var2 = new zd0(0);
            zd0Var.put(classLoader, zd0Var2);
        }
        Class cls = (Class) zd0Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        zd0Var2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new md(r7.c("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new md(r7.c("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final a a(String str) {
        try {
            return (a) c(this.a.t.p.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new md(r7.c("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new md(r7.c("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new md(r7.c("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new md(r7.c("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
