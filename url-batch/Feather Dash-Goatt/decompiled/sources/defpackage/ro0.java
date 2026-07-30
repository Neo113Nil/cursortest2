package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ro0 extends zn0 {
    public final zn0 o;
    public boolean p;

    public ro0(long j, mb1 mb1Var, Function1 function1, Function1 function12, zn0 zn0Var) {
        super(j, mb1Var, function1, function12);
        this.o = zn0Var;
        zn0Var.k();
    }

    @Override // defpackage.zn0, defpackage.ib1
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.o.l();
    }

    @Override // defpackage.zn0
    public final ka0 w() {
        ro0 ro0Var;
        zn0 zn0Var = this.o;
        if (zn0Var.m || zn0Var.c) {
            return new jb1(this);
        }
        wn0 wn0Var = this.h;
        long j = this.b;
        HashMap b = wn0Var != null ? pb1.b(zn0Var.g(), this, this.o.d()) : null;
        Object obj = pb1.c;
        synchronized (obj) {
            try {
                pb1.c(this);
                if (wn0Var == null || wn0Var.d == 0) {
                    ro0Var = this;
                    ro0Var.a();
                } else {
                    ro0Var = this;
                    ka0 z = ro0Var.z(this.o.g(), wn0Var, b, this.o.d());
                    if (!z.equals(kb1.a)) {
                        return z;
                    }
                    wn0 x = ro0Var.o.x();
                    if (x != null) {
                        x.j(wn0Var);
                    } else {
                        ro0Var.o.B(wn0Var);
                        ro0Var.h = null;
                    }
                }
                if (Intrinsics.c(ro0Var.o.g(), j) < 0) {
                    ro0Var.o.v();
                }
                zn0 zn0Var2 = ro0Var.o;
                zn0Var2.r(zn0Var2.d().b(j).a(ro0Var.j));
                ro0Var.o.A(j);
                zn0 zn0Var3 = ro0Var.o;
                int i = ro0Var.d;
                ro0Var.d = -1;
                if (i >= 0) {
                    int[] iArr = zn0Var3.k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] copyOf = Arrays.copyOf(iArr, length + 1);
                    copyOf[length] = i;
                    zn0Var3.k = copyOf;
                } else {
                    zn0Var3.getClass();
                }
                zn0 zn0Var4 = ro0Var.o;
                mb1 mb1Var = ro0Var.j;
                zn0Var4.getClass();
                synchronized (obj) {
                    zn0Var4.j = zn0Var4.j.e(mb1Var);
                    zn0 zn0Var5 = ro0Var.o;
                    int[] iArr2 = ro0Var.k;
                    zn0Var5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = zn0Var5.k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                            iArr2 = copyOf2;
                        }
                        zn0Var5.k = iArr2;
                    }
                }
                ro0Var.m = true;
                if (!ro0Var.p) {
                    ro0Var.p = true;
                    ro0Var.o.l();
                }
                return kb1.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
