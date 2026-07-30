package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class gl0 {
    public static final e71 a;

    static {
        e71 e71Var;
        try {
            Class.forName("java.nio.file.Files");
            e71Var = new yr1();
        } catch (ClassNotFoundException unused) {
            e71Var = new e71();
        }
        a = e71Var;
        String str = qz1.n;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        nm1.r(property);
        ClassLoader classLoader = l92.class.getClassLoader();
        classLoader.getClass();
        new l92(classLoader);
    }

    public abstract ol2 a(qz1 qz1Var);

    public abstract void b(qz1 qz1Var, qz1 qz1Var2);

    public abstract void c(qz1 qz1Var);

    public abstract void d(qz1 qz1Var);

    public final void e(qz1 qz1Var) {
        qz1Var.getClass();
        d(qz1Var);
    }

    public final boolean f(qz1 qz1Var) {
        qz1Var.getClass();
        return i(qz1Var) != null;
    }

    public abstract List g(qz1 qz1Var);

    public final yk0 h(qz1 qz1Var) {
        qz1Var.getClass();
        yk0 i = i(qz1Var);
        if (i != null) {
            return i;
        }
        ey.n(qz1Var, "no such file: ");
        return null;
    }

    public abstract yk0 i(qz1 qz1Var);

    public abstract d71 j(qz1 qz1Var);

    public abstract ol2 k(qz1 qz1Var);

    public abstract pn2 l(qz1 qz1Var);
}
