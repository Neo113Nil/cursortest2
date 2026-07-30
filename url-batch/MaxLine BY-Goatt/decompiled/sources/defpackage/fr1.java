package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fr1 extends yn1 {
    public final yn1 o;
    public boolean p;

    public fr1(long j, rm2 rm2Var, Function1 function1, Function1 function12, yn1 yn1Var) {
        super(j, rm2Var, function1, function12);
        this.o = yn1Var;
        yn1Var.k();
    }

    @Override // defpackage.yn1, defpackage.nm2
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

    @Override // defpackage.yn1
    public final mi2 w() {
        fr1 fr1Var;
        yn1 yn1Var = this.o;
        if (yn1Var.m || yn1Var.c) {
            return new om2();
        }
        un1 un1Var = this.h;
        long j = this.b;
        HashMap c = un1Var != null ? tm2.c(yn1Var.g(), this, this.o.d()) : null;
        Object obj = tm2.c;
        synchronized (obj) {
            try {
                tm2.d(this);
                if (un1Var == null || un1Var.d == 0) {
                    fr1Var = this;
                    fr1Var.a();
                    Unit unit = Unit.a;
                } else {
                    fr1Var = this;
                    mi2 z = fr1Var.z(this.o.g(), un1Var, c, this.o.d());
                    if (!z.equals(pm2.a)) {
                        return z;
                    }
                    un1 x = fr1Var.o.x();
                    if (x != null) {
                        x.i(un1Var);
                    } else {
                        fr1Var.o.B(un1Var);
                        fr1Var.h = null;
                    }
                }
                if (Intrinsics.d(fr1Var.o.g(), j) < 0) {
                    fr1Var.o.v();
                }
                yn1 yn1Var2 = fr1Var.o;
                yn1Var2.r(yn1Var2.d().b(j).a(fr1Var.j));
                fr1Var.o.A(j);
                yn1 yn1Var3 = fr1Var.o;
                int i = fr1Var.d;
                fr1Var.d = -1;
                if (i >= 0) {
                    int[] iArr = yn1Var3.k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] copyOf = Arrays.copyOf(iArr, length + 1);
                    copyOf[length] = i;
                    yn1Var3.k = copyOf;
                } else {
                    yn1Var3.getClass();
                }
                yn1 yn1Var4 = fr1Var.o;
                rm2 rm2Var = fr1Var.j;
                yn1Var4.getClass();
                synchronized (obj) {
                    yn1Var4.j = yn1Var4.j.d(rm2Var);
                    Unit unit2 = Unit.a;
                    yn1 yn1Var5 = fr1Var.o;
                    int[] iArr2 = fr1Var.k;
                    yn1Var5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = yn1Var5.k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                            iArr2 = copyOf2;
                        }
                        yn1Var5.k = iArr2;
                    }
                }
                fr1Var.m = true;
                if (!fr1Var.p) {
                    fr1Var.p = true;
                    fr1Var.o.l();
                }
                return pm2.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
