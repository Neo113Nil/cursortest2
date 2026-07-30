package defpackage;

import defpackage.aa2;
import java.util.Arrays;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class k1 {
    public l1[] m;
    public int n;
    public int o;
    public kq2 p;

    public final l1 c() {
        l1 l1Var;
        kq2 kq2Var;
        synchronized (this) {
            try {
                l1[] l1VarArr = this.m;
                if (l1VarArr == null) {
                    l1VarArr = f();
                    this.m = l1VarArr;
                } else if (this.n >= l1VarArr.length) {
                    Object[] copyOf = Arrays.copyOf(l1VarArr, l1VarArr.length * 2);
                    this.m = (l1[]) copyOf;
                    l1VarArr = (l1[]) copyOf;
                }
                int i = this.o;
                do {
                    l1Var = l1VarArr[i];
                    if (l1Var == null) {
                        l1Var = e();
                        l1VarArr[i] = l1Var;
                    }
                    i++;
                    if (i >= l1VarArr.length) {
                        i = 0;
                    }
                } while (!l1Var.a(this));
                this.o = i;
                this.n++;
                kq2Var = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (kq2Var != null) {
            kq2Var.w(1);
        }
        return l1Var;
    }

    public abstract l1 e();

    public abstract l1[] f();

    public final void g(l1 l1Var) {
        kq2 kq2Var;
        int i;
        o30[] b;
        synchronized (this) {
            try {
                int i2 = this.n - 1;
                this.n = i2;
                kq2Var = this.p;
                if (i2 == 0) {
                    this.o = 0;
                }
                l1Var.getClass();
                b = l1Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (o30 o30Var : b) {
            if (o30Var != null) {
                aa2.a aVar = aa2.m;
                o30Var.resumeWith(Unit.a);
            }
        }
        if (kq2Var != null) {
            kq2Var.w(-1);
        }
    }

    public final kq2 h() {
        kq2 kq2Var;
        synchronized (this) {
            kq2Var = this.p;
            if (kq2Var == null) {
                int i = this.n;
                kq2Var = new kq2(1, Integer.MAX_VALUE, hq.n);
                kq2Var.q(Integer.valueOf(i));
                this.p = kq2Var;
            }
        }
        return kq2Var;
    }
}
