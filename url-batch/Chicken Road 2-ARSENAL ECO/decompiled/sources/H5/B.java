package H5;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static final C f1024a;

    static {
        String str;
        C c7;
        int i7 = M5.w.f1626a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            O5.d dVar = F.f1027a;
            I5.e eVar = M5.o.f1618a;
            I5.e eVar2 = eVar.f1227j;
            c7 = eVar;
            if (eVar == null) {
                c7 = A.f1022o;
            }
        } else {
            c7 = A.f1022o;
        }
        f1024a = c7;
    }
}
