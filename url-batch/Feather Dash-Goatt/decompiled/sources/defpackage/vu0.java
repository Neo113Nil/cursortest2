package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class vu0 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        xh1[] xh1VarArr = wh1.b;
        a = wh1.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0033, code lost:
    
        if (defpackage.wh1.a(r3, r17.c) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final uu0 a(uu0 uu0Var, int i, int i2, long j, bh1 bh1Var, hx0 hx0Var, jh0 jh0Var, int i3, int i4, lh1 lh1Var) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        bh1 bh1Var2 = bh1Var;
        hx0 hx0Var2 = hx0Var;
        jh0 jh0Var2 = jh0Var;
        int i7 = i3;
        int i8 = i4;
        lh1 lh1Var2 = lh1Var;
        if (i5 == 0 || i5 == uu0Var.a) {
            xh1[] xh1VarArr = wh1.b;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
            }
            if ((bh1Var2 == null || bh1Var2.equals(uu0Var.d)) && ((i6 == 0 || i6 == uu0Var.b) && ((hx0Var2 == null || hx0Var2.equals(uu0Var.e)) && ((jh0Var2 == null || jh0Var2.equals(uu0Var.f)) && ((i7 == 0 || i7 == uu0Var.g) && ((i8 == 0 || i8 == uu0Var.h) && (lh1Var2 == null || lh1Var2.equals(uu0Var.i)))))))) {
                return uu0Var;
            }
        } else {
            j2 = 0;
        }
        xh1[] xh1VarArr2 = wh1.b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = uu0Var.c;
        }
        if (bh1Var2 == null) {
            bh1Var2 = uu0Var.d;
        }
        if (i5 == 0) {
            i5 = uu0Var.a;
        }
        if (i6 == 0) {
            i6 = uu0Var.b;
        }
        hx0 hx0Var3 = uu0Var.e;
        if (hx0Var3 != null && hx0Var2 == null) {
            hx0Var2 = hx0Var3;
        }
        if (jh0Var2 == null) {
            jh0Var2 = uu0Var.f;
        }
        if (i7 == 0) {
            i7 = uu0Var.g;
        }
        if (i8 == 0) {
            i8 = uu0Var.h;
        }
        if (lh1Var2 == null) {
            lh1Var2 = uu0Var.i;
        }
        return new uu0(i5, i6, j3, bh1Var2, hx0Var2, jh0Var2, i7, i8, lh1Var2);
    }
}
