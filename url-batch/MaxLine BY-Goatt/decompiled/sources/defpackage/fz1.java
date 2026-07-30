package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class fz1 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        tw2[] tw2VarArr = sw2.b;
        a = sw2.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0024, code lost:
    
        if (r1 == r18.a) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ez1 a(ez1 ez1Var, int i, int i2, long j, rv2 rv2Var, a22 a22Var, ud1 ud1Var, int i3, int i4, hw2 hw2Var) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        rv2 rv2Var2 = rv2Var;
        a22 a22Var2 = a22Var;
        ud1 ud1Var2 = ud1Var;
        int i7 = i3;
        int i8 = i4;
        hw2 hw2Var2 = hw2Var;
        if (i5 == Integer.MIN_VALUE) {
            j2 = 0;
        } else {
            j2 = 0;
        }
        tw2[] tw2VarArr = sw2.b;
        if (((j3 & 1095216660480L) == j2 || sw2.a(j3, ez1Var.c)) && ((rv2Var2 == null || rv2Var2.equals(ez1Var.d)) && ((i6 == Integer.MIN_VALUE || i6 == ez1Var.b) && ((a22Var2 == null || a22Var2.equals(ez1Var.e)) && ((ud1Var2 == null || ud1Var2.equals(ez1Var.f)) && ((i7 == 0 || i7 == ez1Var.g) && ((i8 == Integer.MIN_VALUE || i8 == ez1Var.h) && (hw2Var2 == null || hw2Var2.equals(ez1Var.i))))))))) {
            return ez1Var;
        }
        tw2[] tw2VarArr2 = sw2.b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = ez1Var.c;
        }
        if (rv2Var2 == null) {
            rv2Var2 = ez1Var.d;
        }
        if (i5 == Integer.MIN_VALUE) {
            i5 = ez1Var.a;
        }
        if (i6 == Integer.MIN_VALUE) {
            i6 = ez1Var.b;
        }
        a22 a22Var3 = ez1Var.e;
        if (a22Var3 != null && a22Var2 == null) {
            a22Var2 = a22Var3;
        }
        if (ud1Var2 == null) {
            ud1Var2 = ez1Var.f;
        }
        if (i7 == 0) {
            i7 = ez1Var.g;
        }
        if (i8 == Integer.MIN_VALUE) {
            i8 = ez1Var.h;
        }
        if (hw2Var2 == null) {
            hw2Var2 = ez1Var.i;
        }
        return new ez1(i5, i6, j3, rv2Var2, a22Var2, ud1Var2, i7, i8, hw2Var2);
    }
}
