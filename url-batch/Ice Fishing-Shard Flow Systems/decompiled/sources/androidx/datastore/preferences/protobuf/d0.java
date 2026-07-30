package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class d0 {
    public static c0 a(Object obj) {
        AbstractC0205v abstractC0205v = (AbstractC0205v) obj;
        c0 c0Var = abstractC0205v.unknownFields;
        if (c0Var != c0.f3485f) {
            return c0Var;
        }
        c0 c0Var2 = new c0(0, new int[8], new Object[8], true);
        abstractC0205v.unknownFields = c0Var2;
        return c0Var2;
    }

    public static boolean b(int i2, C0194j c0194j, Object obj) {
        B6.c cVar = (B6.c) c0194j.f3527d;
        int i5 = c0194j.f3524a;
        int i7 = i5 >>> 3;
        int i8 = i5 & 7;
        if (i8 == 0) {
            c0194j.x(0);
            ((c0) obj).c(i7 << 3, Long.valueOf(cVar.n()));
            return true;
        }
        if (i8 == 1) {
            c0194j.x(1);
            ((c0) obj).c((i7 << 3) | 1, Long.valueOf(cVar.k()));
            return true;
        }
        if (i8 == 2) {
            ((c0) obj).c((i7 << 3) | 2, c0194j.e());
            return true;
        }
        if (i8 != 3) {
            if (i8 == 4) {
                return false;
            }
            if (i8 != 5) {
                throw C0209z.b();
            }
            c0194j.x(5);
            ((c0) obj).c(5 | (i7 << 3), Integer.valueOf(cVar.j()));
            return true;
        }
        c0 c0Var = new c0(0, new int[8], new Object[8], true);
        int i9 = i7 << 3;
        int i10 = i9 | 4;
        int i11 = i2 + 1;
        if (i11 >= 100) {
            throw new C0209z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c0194j.a() != Integer.MAX_VALUE && b(i11, c0194j, c0Var)) {
        }
        if (i10 != c0194j.f3524a) {
            throw new C0209z("Protocol message end-group tag did not match expected tag.");
        }
        if (c0Var.f3490e) {
            c0Var.f3490e = false;
        }
        ((c0) obj).c(i9 | 3, c0Var);
        return true;
    }
}
