package D4;

/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public static final B f456a;

    static {
        String str;
        E4.e eVar;
        int i2 = I4.w.f1325a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            K4.d dVar = E.f459a;
            E4.e eVar2 = I4.o.f1316a;
            E4.e eVar3 = eVar2.f660f;
            eVar = !(eVar2 instanceof B) ? RunnableC0025z.f560j : eVar2;
        } else {
            eVar = RunnableC0025z.f560j;
        }
        f456a = eVar;
    }
}
