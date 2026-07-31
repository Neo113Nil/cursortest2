package q2;

/* renamed from: q2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0813A {

    /* renamed from: a, reason: collision with root package name */
    public static final B f7848a;

    static {
        String str;
        r2.d dVar;
        int i3 = v2.t.f9828a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            x2.e eVar = E.f7851a;
            r2.d dVar2 = v2.m.f9819a;
            r2.d dVar3 = dVar2.f8207i;
            dVar = !(dVar2 instanceof B) ? RunnableC0838z.f7950m : dVar2;
        } else {
            dVar = RunnableC0838z.f7950m;
        }
        f7848a = dVar;
    }
}
