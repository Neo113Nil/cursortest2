package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vr0 {
    public static final fl2 b = new fl2(0);
    public final /* synthetic */ as0 a;

    public vr0(as0 as0Var) {
        this.a = as0Var;
    }

    public static Class a(ClassLoader classLoader, String str) {
        fl2 fl2Var = b;
        fl2 fl2Var2 = (fl2) fl2Var.get(classLoader);
        if (fl2Var2 == null) {
            fl2Var2 = new fl2(0);
            fl2Var.put(classLoader, fl2Var2);
        }
        Class cls = (Class) fl2Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        fl2Var2.put(str, cls2);
        return cls2;
    }

    public static Class b(ClassLoader classLoader, String str) {
        try {
            return a(classLoader, str);
        } catch (ClassCastException e) {
            throw new hx(q40.m("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new hx(q40.m("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }
}
