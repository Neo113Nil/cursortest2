package androidx.datastore.preferences.protobuf;

import B.C0014o;

/* loaded from: classes.dex */
public final class k0 {
    public static j0 a(Object obj) {
        AbstractC0267v abstractC0267v = (AbstractC0267v) obj;
        j0 j0Var = abstractC0267v.unknownFields;
        if (j0Var != j0.f5091f) {
            return j0Var;
        }
        j0 j0Var2 = new j0(0, new int[8], new Object[8], true);
        abstractC0267v.unknownFields = j0Var2;
        return j0Var2;
    }

    public static void b(Object obj) {
        ((AbstractC0267v) obj).unknownFields.f5096e = false;
    }

    public static boolean c(Object obj, C0014o c0014o) {
        int i3 = c0014o.f428b;
        int i4 = i3 >>> 3;
        int i5 = i3 & 7;
        AbstractC0256j abstractC0256j = (AbstractC0256j) c0014o.f431e;
        if (i5 == 0) {
            c0014o.A(0);
            ((j0) obj).c(i4 << 3, Long.valueOf(abstractC0256j.n()));
            return true;
        }
        if (i5 == 1) {
            c0014o.A(1);
            ((j0) obj).c((i4 << 3) | 1, Long.valueOf(abstractC0256j.k()));
            return true;
        }
        if (i5 == 2) {
            ((j0) obj).c((i4 << 3) | 2, c0014o.i());
            return true;
        }
        if (i5 != 3) {
            if (i5 == 4) {
                return false;
            }
            if (i5 != 5) {
                throw C0271z.b();
            }
            c0014o.A(5);
            ((j0) obj).c((i4 << 3) | 5, Integer.valueOf(abstractC0256j.j()));
            return true;
        }
        j0 j0Var = new j0(0, new int[8], new Object[8], true);
        int i6 = i4 << 3;
        int i7 = i6 | 4;
        while (c0014o.c() != Integer.MAX_VALUE && c(j0Var, c0014o)) {
        }
        if (i7 != c0014o.f428b) {
            throw new C0271z("Protocol message end-group tag did not match expected tag.");
        }
        j0Var.f5096e = false;
        ((j0) obj).c(i6 | 3, j0Var);
        return true;
    }
}
