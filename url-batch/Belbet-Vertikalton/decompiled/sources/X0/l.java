package X0;

import java.util.List;

/* loaded from: classes.dex */
public abstract class l extends H1.l {
    public static List k0(Object... objArr) {
        j1.h.e(objArr, "elements");
        return objArr.length > 0 ? j.l0(objArr) : t.f1385a;
    }

    public static void l0() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
