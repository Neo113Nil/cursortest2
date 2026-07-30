package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class bt0 extends ca0 {
    public int b;
    public int d;
    public int f;
    public zs0[] a = new zs0[16];
    public int[] c = new int[16];
    public Object[] e = new Object[16];

    public final void A(b9 b9Var, db1 db1Var, i21 i21Var, at0 at0Var) {
        if (C()) {
            uh uhVar = new uh(this);
            bt0 bt0Var = (bt0) uhVar.d;
            while (true) {
                zs0 zs0Var = bt0Var.a[uhVar.a];
                d3 b = zs0Var.b(uhVar);
                b9 b9Var2 = b9Var;
                db1 db1Var2 = db1Var;
                i21 i21Var2 = i21Var;
                at0 at0Var2 = at0Var;
                try {
                    zs0Var.a(uhVar, b9Var2, db1Var2, i21Var2, at0Var2);
                    int i = uhVar.a;
                    int i2 = bt0Var.b;
                    if (i < i2) {
                        zs0 zs0Var2 = bt0Var.a[i];
                        uhVar.b += zs0Var2.a;
                        uhVar.c += zs0Var2.b;
                        int i3 = i + 1;
                        uhVar.a = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        b9Var = b9Var2;
                        db1Var = db1Var2;
                        i21Var = i21Var2;
                        at0Var = at0Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        z();
    }

    public final boolean B() {
        return this.b == 0;
    }

    public final boolean C() {
        return this.b != 0;
    }

    public final void D(zs0 zs0Var) {
        int i = this.b;
        zs0[] zs0VarArr = this.a;
        if (i == zs0VarArr.length) {
            zs0[] zs0VarArr2 = new zs0[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(zs0VarArr, 0, zs0VarArr2, 0, i);
            this.a = zs0VarArr2;
        }
        int i2 = this.d;
        int i3 = zs0Var.a;
        int i4 = zs0Var.b;
        int i5 = i2 + i3;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            w9.a(iArr, iArr2, 0, 0, length);
            this.c = iArr2;
        }
        int i7 = this.f + i4;
        Object[] objArr = this.e;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.e = objArr2;
        }
        zs0[] zs0VarArr3 = this.a;
        int i9 = this.b;
        this.b = i9 + 1;
        zs0VarArr3[i9] = zs0Var;
        this.d += zs0Var.a;
        this.f += i4;
    }

    public final void z() {
        this.b = 0;
        this.d = 0;
        Arrays.fill(this.e, 0, this.f, (Object) null);
        this.f = 0;
    }
}
