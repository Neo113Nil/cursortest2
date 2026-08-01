package defpackage;

import androidx.fragment.app.n;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class sk {
    public static final h30 b = new h30(0);
    public final /* synthetic */ n a;

    public sk(n nVar) {
        this.a = nVar;
    }

    public static Class a(ClassLoader classLoader, String str) {
        h30 h30Var = b;
        h30 h30Var2 = (h30) h30Var.get(classLoader);
        if (h30Var2 == null) {
            h30Var2 = new h30(0);
            h30Var.put(classLoader, h30Var2);
        }
        Class cls = (Class) h30Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        h30Var2.put(str, cls2);
        return cls2;
    }

    public static Class b(ClassLoader classLoader, String str) {
        try {
            return a(classLoader, str);
        } catch (ClassCastException e) {
            o8.h(str, ": make sure class is a valid subclass of Fragment", e);
            return null;
        } catch (ClassNotFoundException e2) {
            o8.h(str, ": make sure class name exists", e2);
            return null;
        }
    }
}
