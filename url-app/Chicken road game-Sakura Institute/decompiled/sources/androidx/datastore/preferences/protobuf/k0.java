package androidx.datastore.preferences.protobuf;

import A.C0020p;

/* loaded from: classes.dex */
public final class k0 {
    public static j0 a(Object obj) {
        AbstractC0456v abstractC0456v = (AbstractC0456v) obj;
        j0 j0Var = abstractC0456v.unknownFields;
        if (j0Var != j0.f5365f) {
            return j0Var;
        }
        j0 j0Var2 = new j0(0, new int[8], new Object[8], true);
        abstractC0456v.unknownFields = j0Var2;
        return j0Var2;
    }

    public static void b(Object obj) {
        ((AbstractC0456v) obj).unknownFields.f5370e = false;
    }

    public static boolean c(Object obj, C0020p c0020p) {
        int i2 = c0020p.f172b;
        int i4 = i2 >>> 3;
        int i5 = i2 & 7;
        AbstractC0445j abstractC0445j = (AbstractC0445j) c0020p.f175e;
        if (i5 == 0) {
            c0020p.A(0);
            ((j0) obj).c(i4 << 3, Long.valueOf(abstractC0445j.n()));
            return true;
        }
        if (i5 == 1) {
            c0020p.A(1);
            ((j0) obj).c((i4 << 3) | 1, Long.valueOf(abstractC0445j.k()));
            return true;
        }
        if (i5 == 2) {
            ((j0) obj).c((i4 << 3) | 2, c0020p.i());
            return true;
        }
        if (i5 != 3) {
            if (i5 == 4) {
                return false;
            }
            if (i5 != 5) {
                throw C0460z.b();
            }
            c0020p.A(5);
            ((j0) obj).c((i4 << 3) | 5, Integer.valueOf(abstractC0445j.j()));
            return true;
        }
        j0 j0Var = new j0(0, new int[8], new Object[8], true);
        int i6 = i4 << 3;
        int i7 = i6 | 4;
        while (c0020p.c() != Integer.MAX_VALUE && c(j0Var, c0020p)) {
        }
        if (i7 != c0020p.f172b) {
            throw new C0460z("Protocol message end-group tag did not match expected tag.");
        }
        j0Var.f5370e = false;
        ((j0) obj).c(i6 | 3, j0Var);
        return true;
    }
}
