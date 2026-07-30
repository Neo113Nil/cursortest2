package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j1 {
    public static i1 a(Object obj) {
        v vVar = (v) obj;
        i1 i1Var = vVar.unknownFields;
        if (i1Var != i1.f843f) {
            return i1Var;
        }
        i1 i1Var2 = new i1(0, new int[8], new Object[8], true);
        vVar.unknownFields = i1Var2;
        return i1Var2;
    }

    public static boolean b(Object obj, a0.p pVar) {
        int i7 = pVar.f118b;
        j jVar = (j) pVar.f121e;
        int i8 = i7 >>> 3;
        int i9 = i7 & 7;
        if (i9 == 0) {
            pVar.A(0);
            ((i1) obj).c(i8 << 3, Long.valueOf(jVar.n()));
            return true;
        }
        if (i9 == 1) {
            pVar.A(1);
            ((i1) obj).c((i8 << 3) | 1, Long.valueOf(jVar.k()));
            return true;
        }
        if (i9 == 2) {
            ((i1) obj).c((i8 << 3) | 2, pVar.i());
            return true;
        }
        if (i9 != 3) {
            if (i9 == 4) {
                return false;
            }
            if (i9 != 5) {
                throw z.b();
            }
            pVar.A(5);
            ((i1) obj).c((i8 << 3) | 5, Integer.valueOf(jVar.j()));
            return true;
        }
        i1 i1Var = new i1(0, new int[8], new Object[8], true);
        int i10 = i8 << 3;
        int i11 = i10 | 4;
        while (pVar.c() != Integer.MAX_VALUE && b(i1Var, pVar)) {
        }
        if (i11 != pVar.f118b) {
            throw new z("Protocol message end-group tag did not match expected tag.");
        }
        i1Var.f848e = false;
        ((i1) obj).c(i10 | 3, i1Var);
        return true;
    }
}
