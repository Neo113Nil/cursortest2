package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e1 {
    public static d1 a(Object obj) {
        v vVar = (v) obj;
        d1 d1Var = vVar.unknownFields;
        if (d1Var != d1.f524f) {
            return d1Var;
        }
        d1 d1Var2 = new d1(0, new int[8], new Object[8], true);
        vVar.unknownFields = d1Var2;
        return d1Var2;
    }

    public static boolean b(int i3, j jVar, Object obj) {
        int i10 = jVar.f564a;
        i iVar = (i) jVar.f567d;
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            jVar.y(0);
            ((d1) obj).c(i11 << 3, Long.valueOf(iVar.s()));
            return true;
        }
        if (i12 == 1) {
            jVar.y(1);
            ((d1) obj).c((i11 << 3) | 1, Long.valueOf(iVar.p()));
            return true;
        }
        if (i12 == 2) {
            ((d1) obj).c((i11 << 3) | 2, jVar.g());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                throw z.b();
            }
            jVar.y(5);
            ((d1) obj).c(5 | (i11 << 3), Integer.valueOf(iVar.o()));
            return true;
        }
        d1 d1Var = new d1(0, new int[8], new Object[8], true);
        int i13 = i11 << 3;
        int i14 = i13 | 4;
        int i15 = i3 + 1;
        if (i15 >= 100) {
            throw new z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (jVar.a() != Integer.MAX_VALUE && b(i15, jVar, d1Var)) {
        }
        if (i14 != jVar.f564a) {
            throw new z("Protocol message end-group tag did not match expected tag.");
        }
        if (d1Var.f529e) {
            d1Var.f529e = false;
        }
        ((d1) obj).c(i13 | 3, d1Var);
        return true;
    }
}
