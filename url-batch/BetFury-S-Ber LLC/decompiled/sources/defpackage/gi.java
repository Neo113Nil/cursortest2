package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class gi {
    public static final fj a;

    static {
        String str;
        fj fjVar;
        int i = bh0.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            si siVar = ik.a;
            ss ssVar = oz.a;
            ss ssVar2 = ssVar.j;
            fjVar = ssVar;
            if (ssVar == null) {
                fjVar = fi.o;
            }
        } else {
            fjVar = fi.o;
        }
        a = fjVar;
    }
}
