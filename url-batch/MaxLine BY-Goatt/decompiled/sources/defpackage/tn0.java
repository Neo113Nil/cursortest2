package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tn0 {
    public int a;
    public long b;
    public int c;
    public Object d;

    public tn0(zn0 zn0Var, long j, int i, int i2) {
        this.d = zn0Var;
        this.b = j;
        this.a = i;
        this.c = i2;
    }

    public static /* synthetic */ String c(int i, int i2, byte b, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + b + String.valueOf(i).length());
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rn0 a(sn0 sn0Var, boolean z, int i, int i2, int i3, int i4) {
        rn0 rn0Var;
        jj1 jj1Var;
        n31 n31Var;
        n12 n12Var;
        if (sn0Var.b) {
            zn0 zn0Var = (zn0) this.d;
            zn0Var.getClass();
            int u = q40.u(2);
            boolean z2 = true;
            if (u != 0 && u != 1) {
                if (u != 2 && u != 3) {
                    a.b();
                    return null;
                }
                if (z) {
                    jj1Var = zn0Var.a;
                    n31Var = zn0Var.e;
                    n12Var = zn0Var.b;
                } else {
                    jj1Var = (i < -1 || i2 < 0) ? null : zn0Var.c;
                    n31Var = zn0Var.f;
                    n12Var = zn0Var.d;
                }
                if (jj1Var != null) {
                    n31Var.getClass();
                    rn0Var = new rn0(jj1Var, n12Var, n31Var.a);
                    if (rn0Var != null) {
                        if (i < 0 || (i4 != 0 && (i3 - ((int) (rn0Var.c >> 32)) < 0 || i4 >= Integer.MAX_VALUE))) {
                            z2 = false;
                        }
                        rn0Var.d = z2;
                        return rn0Var;
                    }
                }
            }
            rn0Var = null;
            if (rn0Var != null) {
            }
        }
        return null;
    }

    public sn0 b(boolean z, int i, long j, n31 n31Var, int i2, int i3, int i4, boolean z2, boolean z3) {
        int i5;
        n31 a;
        int i6 = this.a;
        int i7 = this.c;
        long j2 = this.b;
        zn0 zn0Var = (zn0) this.d;
        int i8 = i3 + i4;
        if (n31Var == null) {
            return new sn0(true, true);
        }
        long j3 = n31Var.a;
        zn0Var.getClass();
        if (i2 >= Integer.MAX_VALUE || ((int) (j & 4294967295L)) - ((int) (j3 & 4294967295L)) < 0) {
            return new sn0(true, true);
        }
        if (i != 0 && (i >= Integer.MAX_VALUE || ((int) (j >> 32)) - ((int) (j3 >> 32)) < 0)) {
            return z2 ? new sn0(true, true) : new sn0(true, b(z, 0, n31.a(u10.h(j2), (((int) (j & 4294967295L)) - i7) - i4), new n31(n31.a(((int) (j3 >> 32)) - i6, (int) (j3 & 4294967295L))), i2 + 1, i8, 0, true, false).b);
        }
        int i9 = (int) (j3 & 4294967295L);
        int max = Math.max(i4, i9) + i3;
        if (z3) {
            a = null;
            i5 = i2;
        } else {
            i5 = i2;
            a = zn0Var.a(i5, max, z);
        }
        if (a == null || (i + 1 < Integer.MAX_VALUE && ((((int) (j >> 32)) - ((int) (j3 >> 32))) - i6) - ((int) (a.a >> 32)) >= 0)) {
            return new sn0(false, false);
        }
        if (z3) {
            return new sn0(true, true);
        }
        boolean z4 = b(false, 0, n31.a(u10.h(j2), (((int) (j & 4294967295L)) - i7) - Math.max(i4, i9)), a, i5 + 1, max, 0, true, true).b;
        return new sn0(z4, z4);
    }
}
