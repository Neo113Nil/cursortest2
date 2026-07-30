package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class vp {
    public static final xq a;

    static {
        String str;
        xq xqVar;
        int i = hg1.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            nq nqVar = ls.a;
            v50 v50Var = pj0.a;
            v50 v50Var2 = v50Var.j;
            xqVar = v50Var;
            if (v50Var == null) {
                xqVar = up.p;
            }
        } else {
            xqVar = up.p;
        }
        a = xqVar;
    }
}
