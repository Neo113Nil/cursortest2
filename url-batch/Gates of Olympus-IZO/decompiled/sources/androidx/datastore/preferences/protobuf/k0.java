package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class k0 {
    public static j0 a(Object obj) {
        AbstractC0211v abstractC0211v = (AbstractC0211v) obj;
        j0 j0Var = abstractC0211v.unknownFields;
        if (j0Var != j0.f3890f) {
            return j0Var;
        }
        j0 j0Var2 = new j0(0, new int[8], new Object[8], true);
        abstractC0211v.unknownFields = j0Var2;
        return j0Var2;
    }

    public static void b(Object obj) {
        ((AbstractC0211v) obj).unknownFields.f3895e = false;
    }

    public static boolean c(Object obj, J.D d3) {
        int i3 = d3.f2525a;
        int i4 = i3 >>> 3;
        int i5 = i3 & 7;
        AbstractC0200j abstractC0200j = (AbstractC0200j) d3.f2528d;
        if (i5 == 0) {
            d3.y(0);
            ((j0) obj).c(i4 << 3, Long.valueOf(abstractC0200j.n()));
            return true;
        }
        if (i5 == 1) {
            d3.y(1);
            ((j0) obj).c((i4 << 3) | 1, Long.valueOf(abstractC0200j.k()));
            return true;
        }
        if (i5 == 2) {
            ((j0) obj).c((i4 << 3) | 2, d3.g());
            return true;
        }
        if (i5 != 3) {
            if (i5 == 4) {
                return false;
            }
            if (i5 != 5) {
                throw C0215z.b();
            }
            d3.y(5);
            ((j0) obj).c((i4 << 3) | 5, Integer.valueOf(abstractC0200j.j()));
            return true;
        }
        j0 j0Var = new j0(0, new int[8], new Object[8], true);
        int i6 = i4 << 3;
        int i7 = i6 | 4;
        while (d3.a() != Integer.MAX_VALUE && c(j0Var, d3)) {
        }
        if (i7 != d3.f2525a) {
            throw new C0215z("Protocol message end-group tag did not match expected tag.");
        }
        j0Var.f3895e = false;
        ((j0) obj).c(i6 | 3, j0Var);
        return true;
    }
}
