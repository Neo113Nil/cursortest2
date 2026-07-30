package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class fl1 {
    public static el1 a(Object obj) {
        m40 m40Var = (m40) obj;
        el1 el1Var = m40Var.unknownFields;
        if (el1Var != el1.f) {
            return el1Var;
        }
        el1 el1Var2 = new el1(0, new int[8], new Object[8], true);
        m40Var.unknownFields = el1Var2;
        return el1Var2;
    }

    public static boolean b(int i, uh uhVar, Object obj) {
        int i2 = uhVar.a;
        th thVar = (th) uhVar.d;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            uhVar.y(0);
            ((el1) obj).c(i3 << 3, Long.valueOf(thVar.n()));
            return true;
        }
        if (i4 == 1) {
            uhVar.y(1);
            ((el1) obj).c((i3 << 3) | 1, Long.valueOf(thVar.k()));
            return true;
        }
        if (i4 == 2) {
            ((el1) obj).c((i3 << 3) | 2, uhVar.g());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw sa0.b();
            }
            uhVar.y(5);
            ((el1) obj).c(5 | (i3 << 3), Integer.valueOf(thVar.j()));
            return true;
        }
        el1 el1Var = new el1(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new sa0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (uhVar.a() != Integer.MAX_VALUE && b(i7, uhVar, el1Var)) {
        }
        if (i6 != uhVar.a) {
            throw new sa0("Protocol message end-group tag did not match expected tag.");
        }
        if (el1Var.e) {
            el1Var.e = false;
        }
        ((el1) obj).c(i5 | 3, el1Var);
        return true;
    }
}
