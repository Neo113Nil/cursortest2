package O2;

/* loaded from: classes3.dex */
public abstract class a {
    public static d a(String str) {
        d b4 = b.b(str);
        if (b4 == null) {
            b4 = M2.a.h(str);
        }
        if (b4 == null) {
            b4 = L2.a.b(str);
        }
        if (b4 == null) {
            b4 = N2.a.d(str);
        }
        if (b4 == null) {
            b4 = J2.a.f(str);
        }
        return b4 == null ? K2.a.f(str) : b4;
    }

    public static d b(I2.f fVar) {
        d c4 = b.c(fVar);
        if (c4 == null) {
            c4 = M2.a.i(fVar);
        }
        if (c4 == null) {
            c4 = N2.a.e(fVar);
        }
        if (c4 == null) {
            c4 = J2.a.g(fVar);
        }
        return c4 == null ? K2.a.g(fVar) : c4;
    }
}
