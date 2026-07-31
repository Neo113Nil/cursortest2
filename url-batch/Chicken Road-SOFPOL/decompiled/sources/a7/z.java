package a7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f325a;

    static {
        String str;
        a0 a0Var;
        int i = f7.t.f2801a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            h7.e eVar = d0.f249a;
            b7.e eVar2 = f7.n.f2795a;
            b7.e eVar3 = eVar2.i;
            a0Var = eVar2;
            if (eVar2 == null) {
                a0Var = y.f320m;
            }
        } else {
            a0Var = y.f320m;
        }
        f325a = a0Var;
    }
}
