package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rw1 extends s93 {
    public int t;
    public int v;
    public int x;
    public pw1[] s = new pw1[16];
    public int[] u = new int[16];
    public Object[] w = new Object[16];

    public final void U() {
        this.t = 0;
        this.v = 0;
        Arrays.fill(this.w, 0, this.x, (Object) null);
        this.x = 0;
    }

    public final void V(rh rhVar, zl2 zl2Var, q82 q82Var, qw1 qw1Var) {
        if (X()) {
            gn gnVar = new gn(this);
            rw1 rw1Var = (rw1) gnVar.e;
            while (true) {
                pw1 pw1Var = rw1Var.s[gnVar.b];
                m6 b = pw1Var.b(gnVar);
                rh rhVar2 = rhVar;
                zl2 zl2Var2 = zl2Var;
                q82 q82Var2 = q82Var;
                qw1 qw1Var2 = qw1Var;
                try {
                    pw1Var.a(gnVar, rhVar2, zl2Var2, q82Var2, qw1Var2);
                    int i = gnVar.b;
                    int i2 = rw1Var.t;
                    if (i < i2) {
                        pw1 pw1Var2 = rw1Var.s[i];
                        gnVar.c += pw1Var2.a;
                        gnVar.d += pw1Var2.b;
                        int i3 = i + 1;
                        gnVar.b = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        rhVar = rhVar2;
                        zl2Var = zl2Var2;
                        q82Var = q82Var2;
                        qw1Var = qw1Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        U();
    }

    public final boolean W() {
        return this.t == 0;
    }

    public final boolean X() {
        return this.t != 0;
    }

    public final void Y(pw1 pw1Var) {
        int i = this.t;
        pw1[] pw1VarArr = this.s;
        if (i == pw1VarArr.length) {
            pw1[] pw1VarArr2 = new pw1[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(pw1VarArr, 0, pw1VarArr2, 0, i);
            this.s = pw1VarArr2;
        }
        int i2 = this.v;
        int i3 = pw1Var.a;
        int i4 = pw1Var.b;
        int i5 = i2 + i3;
        int[] iArr = this.u;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            ni.d(0, 0, length, iArr, iArr2);
            this.u = iArr2;
        }
        int i7 = this.x + i4;
        Object[] objArr = this.w;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.w = objArr2;
        }
        pw1[] pw1VarArr3 = this.s;
        int i9 = this.t;
        this.t = i9 + 1;
        pw1VarArr3[i9] = pw1Var;
        this.v += pw1Var.a;
        this.x += i4;
    }
}
