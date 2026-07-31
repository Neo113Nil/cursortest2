package k2;

/* renamed from: k2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0528A {

    /* renamed from: a, reason: collision with root package name */
    public static final B f5309a;

    static {
        String str;
        l2.d dVar;
        int i3 = p2.u.f6808a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            r2.e eVar = E.f5312a;
            l2.d dVar2 = p2.n.f6799a;
            l2.d dVar3 = dVar2.f5551i;
            dVar = !(dVar2 instanceof B) ? RunnableC0553z.f5410m : dVar2;
        } else {
            dVar = RunnableC0553z.f5410m;
        }
        f5309a = dVar;
    }
}
