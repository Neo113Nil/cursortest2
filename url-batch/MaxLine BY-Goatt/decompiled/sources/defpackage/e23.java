package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class e23 {
    public static d23 a(Object obj) {
        vu0 vu0Var = (vu0) obj;
        d23 d23Var = vu0Var.unknownFields;
        if (d23Var != d23.f) {
            return d23Var;
        }
        d23 d23Var2 = new d23(0, new int[8], new Object[8], true);
        vu0Var.unknownFields = d23Var2;
        return d23Var2;
    }

    public static boolean b(int i, gn gnVar, Object obj) {
        int i2 = gnVar.b;
        iv ivVar = (iv) gnVar.e;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            gnVar.D(0);
            ((d23) obj).c(i3 << 3, Long.valueOf(ivVar.s()));
            return true;
        }
        if (i4 == 1) {
            gnVar.D(1);
            ((d23) obj).c((i3 << 3) | 1, Long.valueOf(ivVar.p()));
            return true;
        }
        if (i4 == 2) {
            ((d23) obj).c((i3 << 3) | 2, gnVar.l());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw u41.b();
            }
            gnVar.D(5);
            ((d23) obj).c(5 | (i3 << 3), Integer.valueOf(ivVar.o()));
            return true;
        }
        d23 d23Var = new d23(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new u41("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (gnVar.e() != Integer.MAX_VALUE && b(i7, gnVar, d23Var)) {
        }
        if (i6 != gnVar.b) {
            throw new u41("Protocol message end-group tag did not match expected tag.");
        }
        if (d23Var.e) {
            d23Var.e = false;
        }
        ((d23) obj).c(i5 | 3, d23Var);
        return true;
    }
}
