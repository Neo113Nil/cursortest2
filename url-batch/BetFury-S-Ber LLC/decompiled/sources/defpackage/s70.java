package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class s70 {
    public final n70 a;
    public final ArrayList b;
    public final int c;
    public final rn d;
    public final j90 e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public s70(n70 n70Var, ArrayList arrayList, int i, rn rnVar, j90 j90Var, int i2, int i3, int i4) {
        this.a = n70Var;
        this.b = arrayList;
        this.c = i;
        this.d = rnVar;
        this.e = j90Var;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public static s70 a(s70 s70Var, int i, rn rnVar, j90 j90Var, int i2) {
        if ((i2 & 1) != 0) {
            i = s70Var.c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            rnVar = s70Var.d;
        }
        rn rnVar2 = rnVar;
        if ((i2 & 4) != 0) {
            j90Var = s70Var.e;
        }
        j90 j90Var2 = j90Var;
        int i4 = s70Var.f;
        int i5 = s70Var.g;
        int i6 = s70Var.h;
        j90Var2.getClass();
        return new s70(s70Var.a, s70Var.b, i3, rnVar2, j90Var2, i4, i5, i6);
    }

    public final v90 b(j90 j90Var) {
        j90Var.getClass();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i >= size) {
            s9.u("Check failed.");
            return null;
        }
        this.i++;
        rn rnVar = this.d;
        if (rnVar != null) {
            tn tnVar = rnVar.b;
            ou ouVar = (ou) j90Var.b;
            tnVar.getClass();
            ouVar.getClass();
            ou ouVar2 = tnVar.b.h;
            if (ouVar.e != ouVar2.e || !mv.c(ouVar.d, ouVar2.d)) {
                s9.s(arrayList.get(i - 1), " must retain the same host and port", "network interceptor ");
                return null;
            }
            if (this.i != 1) {
                s9.s(arrayList.get(i - 1), " must call proceed() exactly once", "network interceptor ");
                return null;
            }
        }
        int i2 = i + 1;
        s70 a = a(this, i2, null, j90Var, 58);
        lv lvVar = (lv) arrayList.get(i);
        v90 a2 = lvVar.a(a);
        if (a2 == null) {
            throw new NullPointerException("interceptor " + lvVar + " returned null");
        }
        if (rnVar != null && i2 < arrayList.size() && a.i != 1) {
            s9.s(lvVar, " must call proceed() exactly once", "network interceptor ");
            return null;
        }
        if (a2.l != null) {
            return a2;
        }
        s9.s(lvVar, " returned a response with no body", "interceptor ");
        return null;
    }
}
