package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f1 {
    public static e1 a(Object obj) {
        w wVar = (w) obj;
        e1 e1Var = wVar.unknownFields;
        if (e1Var != e1.f674f) {
            return e1Var;
        }
        e1 e1Var2 = new e1(0, new int[8], new Object[8], true);
        wVar.unknownFields = e1Var2;
        return e1Var2;
    }

    public static boolean b(int i, k kVar, Object obj) {
        int i8 = kVar.f711a;
        j jVar = (j) kVar.f714d;
        int i9 = i8 >>> 3;
        int i10 = i8 & 7;
        if (i10 == 0) {
            kVar.y(0);
            ((e1) obj).c(i9 << 3, Long.valueOf(jVar.s()));
            return true;
        }
        if (i10 == 1) {
            kVar.y(1);
            ((e1) obj).c((i9 << 3) | 1, Long.valueOf(jVar.p()));
            return true;
        }
        if (i10 == 2) {
            ((e1) obj).c((i9 << 3) | 2, kVar.g());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw a0.b();
            }
            kVar.y(5);
            ((e1) obj).c(5 | (i9 << 3), Integer.valueOf(jVar.o()));
            return true;
        }
        e1 e1Var = new e1(0, new int[8], new Object[8], true);
        int i11 = i9 << 3;
        int i12 = i11 | 4;
        int i13 = i + 1;
        if (i13 >= 100) {
            throw new a0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (kVar.a() != Integer.MAX_VALUE && b(i13, kVar, e1Var)) {
        }
        if (i12 != kVar.f711a) {
            throw new a0("Protocol message end-group tag did not match expected tag.");
        }
        if (e1Var.f679e) {
            e1Var.f679e = false;
        }
        ((e1) obj).c(i11 | 3, e1Var);
        return true;
    }
}
