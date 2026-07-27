package W2;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final E f4221a;

    static {
        String str;
        X2.d dVar;
        int i2 = b3.u.f5690a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            d3.e eVar = J.f4225a;
            X2.d dVar2 = b3.m.f5679a;
            X2.d dVar3 = dVar2.f4364l;
            dVar = !(dVar2 instanceof E) ? C.f4219p : dVar2;
        } else {
            dVar = C.f4219p;
        }
        f4221a = dVar;
    }
}
