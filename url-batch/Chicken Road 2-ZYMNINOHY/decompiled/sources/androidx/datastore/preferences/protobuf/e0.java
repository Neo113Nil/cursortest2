package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class e0 {
    public static d0 a(Object obj) {
        AbstractC0189w abstractC0189w = (AbstractC0189w) obj;
        d0 d0Var = abstractC0189w.unknownFields;
        if (d0Var != d0.f4626f) {
            return d0Var;
        }
        d0 d0Var2 = new d0(0, new int[8], new Object[8], true);
        abstractC0189w.unknownFields = d0Var2;
        return d0Var2;
    }

    public static boolean b(int i4, C0178k c0178k, Object obj) {
        AbstractC0177j abstractC0177j = (AbstractC0177j) c0178k.f4668d;
        int i5 = c0178k.f4665a;
        int i6 = i5 >>> 3;
        int i7 = i5 & 7;
        if (i7 == 0) {
            c0178k.x(0);
            ((d0) obj).c(i6 << 3, Long.valueOf(abstractC0177j.n()));
            return true;
        }
        if (i7 == 1) {
            c0178k.x(1);
            ((d0) obj).c((i6 << 3) | 1, Long.valueOf(abstractC0177j.k()));
            return true;
        }
        if (i7 == 2) {
            ((d0) obj).c((i6 << 3) | 2, c0178k.f());
            return true;
        }
        if (i7 != 3) {
            if (i7 == 4) {
                return false;
            }
            if (i7 != 5) {
                throw A.b();
            }
            c0178k.x(5);
            ((d0) obj).c(5 | (i6 << 3), Integer.valueOf(abstractC0177j.j()));
            return true;
        }
        d0 d0Var = new d0(0, new int[8], new Object[8], true);
        int i8 = i6 << 3;
        int i9 = i8 | 4;
        int i10 = i4 + 1;
        if (i10 >= 100) {
            throw new A("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c0178k.b() != Integer.MAX_VALUE && b(i10, c0178k, d0Var)) {
        }
        if (i9 != c0178k.f4665a) {
            throw new A("Protocol message end-group tag did not match expected tag.");
        }
        if (d0Var.f4631e) {
            d0Var.f4631e = false;
        }
        ((d0) obj).c(i8 | 3, d0Var);
        return true;
    }
}
