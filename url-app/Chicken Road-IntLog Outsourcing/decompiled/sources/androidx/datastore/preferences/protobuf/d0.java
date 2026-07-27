package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class d0 {
    public static c0 a(Object obj) {
        AbstractC0226v abstractC0226v = (AbstractC0226v) obj;
        c0 c0Var = abstractC0226v.unknownFields;
        if (c0Var != c0.f4422f) {
            return c0Var;
        }
        c0 c0Var2 = new c0(0, new int[8], new Object[8], true);
        abstractC0226v.unknownFields = c0Var2;
        return c0Var2;
    }

    public static void b(Object obj) {
        c0 c0Var = ((AbstractC0226v) obj).unknownFields;
        if (c0Var.f4427e) {
            c0Var.f4427e = false;
        }
    }

    public static boolean c(int i2, C0215j c0215j, Object obj) {
        int i3 = c0215j.f4462a;
        int i6 = i3 >>> 3;
        int i7 = i3 & 7;
        R4.c cVar = (R4.c) c0215j.f4465d;
        if (i7 == 0) {
            c0215j.x(0);
            ((c0) obj).c(i6 << 3, Long.valueOf(cVar.n()));
            return true;
        }
        if (i7 == 1) {
            c0215j.x(1);
            ((c0) obj).c((i6 << 3) | 1, Long.valueOf(cVar.k()));
            return true;
        }
        if (i7 == 2) {
            ((c0) obj).c((i6 << 3) | 2, c0215j.e());
            return true;
        }
        if (i7 != 3) {
            if (i7 == 4) {
                return false;
            }
            if (i7 != 5) {
                throw C0230z.b();
            }
            c0215j.x(5);
            ((c0) obj).c(5 | (i6 << 3), Integer.valueOf(cVar.j()));
            return true;
        }
        c0 c0Var = new c0(0, new int[8], new Object[8], true);
        int i8 = i6 << 3;
        int i9 = i8 | 4;
        int i10 = i2 + 1;
        if (i10 >= 100) {
            throw new C0230z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c0215j.a() != Integer.MAX_VALUE && c(i10, c0215j, c0Var)) {
        }
        if (i9 != c0215j.f4462a) {
            throw new C0230z("Protocol message end-group tag did not match expected tag.");
        }
        if (c0Var.f4427e) {
            c0Var.f4427e = false;
        }
        ((c0) obj).c(i8 | 3, c0Var);
        return true;
    }
}
