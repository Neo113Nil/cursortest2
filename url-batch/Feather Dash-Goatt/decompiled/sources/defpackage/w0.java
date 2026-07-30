package defpackage;

import java.util.Arrays;
import kotlin.Unit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class w0 {
    public x0[] d;
    public int e;
    public int g;
    public hf1 h;

    public final x0 a() {
        x0 x0Var;
        hf1 hf1Var;
        synchronized (this) {
            try {
                x0[] x0VarArr = this.d;
                if (x0VarArr == null) {
                    x0VarArr = c();
                    this.d = x0VarArr;
                } else if (this.e >= x0VarArr.length) {
                    Object[] copyOf = Arrays.copyOf(x0VarArr, x0VarArr.length * 2);
                    this.d = (x0[]) copyOf;
                    x0VarArr = (x0[]) copyOf;
                }
                int i = this.g;
                do {
                    x0Var = x0VarArr[i];
                    if (x0Var == null) {
                        x0Var = b();
                        x0VarArr[i] = x0Var;
                    }
                    i++;
                    if (i >= x0VarArr.length) {
                        i = 0;
                    }
                } while (!x0Var.a(this));
                this.g = i;
                this.e++;
                hf1Var = this.h;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (hf1Var != null) {
            hf1Var.w(1);
        }
        return x0Var;
    }

    public abstract x0 b();

    public abstract x0[] c();

    public final void d(x0 x0Var) {
        hf1 hf1Var;
        int i;
        dn[] b;
        synchronized (this) {
            try {
                int i2 = this.e - 1;
                this.e = i2;
                hf1Var = this.h;
                if (i2 == 0) {
                    this.g = 0;
                }
                x0Var.getClass();
                b = x0Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (dn dnVar : b) {
            if (dnVar != null) {
                i31 i31Var = k31.d;
                dnVar.l(Unit.a);
            }
        }
        if (hf1Var != null) {
            hf1Var.w(-1);
        }
    }

    public final hf1 g() {
        hf1 hf1Var;
        synchronized (this) {
            hf1Var = this.h;
            if (hf1Var == null) {
                int i = this.e;
                hf1Var = new hf1(1, Integer.MAX_VALUE, ue.e);
                hf1Var.q(Integer.valueOf(i));
                this.h = hf1Var;
            }
        }
        return hf1Var;
    }
}
