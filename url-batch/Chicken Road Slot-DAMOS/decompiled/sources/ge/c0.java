package ge;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f4340a;

    static {
        String str;
        f0 f0Var;
        int i3 = le.u.f6001a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            ne.e eVar = k0.f4372a;
            he.d dVar = le.o.f5995a;
            he.d dVar2 = dVar.f4537t;
            f0Var = dVar;
            if (dVar == null) {
                f0Var = b0.f4334x;
            }
        } else {
            f0Var = b0.f4334x;
        }
        f4340a = f0Var;
    }
}
