package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class z70 {
    public static final m90 a;

    static {
        String str;
        m90 m90Var;
        int i = hs2.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            t80 t80Var = vb0.a;
            bx0 bx0Var = qh1.a;
            bx0 bx0Var2 = bx0Var.r;
            m90Var = bx0Var;
            if (bx0Var == null) {
                m90Var = y70.x;
            }
        } else {
            m90Var = y70.x;
        }
        a = m90Var;
    }
}
