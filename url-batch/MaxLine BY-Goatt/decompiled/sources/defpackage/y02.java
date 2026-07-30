package defpackage;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class y02 extends x02 {
    public final u02 p;
    public Object q;
    public boolean r;
    public int s;

    public y02(u02 u02Var, vz2[] vz2VarArr) {
        super(u02Var.n, vz2VarArr);
        this.p = u02Var;
        this.s = u02Var.p;
    }

    public final void c(int i, uz2 uz2Var, Object obj, int i2) {
        int i3 = i2 * 5;
        vz2[] vz2VarArr = this.m;
        if (i3 <= 30) {
            int j = 1 << hl2.j(i, i3);
            if (uz2Var.h(j)) {
                vz2VarArr[i2].a(uz2Var.d, Integer.bitCount(uz2Var.a) * 2, uz2Var.f(j));
                this.n = i2;
                return;
            } else {
                int t = uz2Var.t(j);
                uz2 s = uz2Var.s(t);
                vz2VarArr[i2].a(uz2Var.d, Integer.bitCount(uz2Var.a) * 2, t);
                c(i, s, obj, i2 + 1);
                return;
            }
        }
        vz2 vz2Var = vz2VarArr[i2];
        Object[] objArr = uz2Var.d;
        vz2Var.a(objArr, objArr.length, 0);
        while (true) {
            vz2 vz2Var2 = vz2VarArr[i2];
            if (Intrinsics.b(vz2Var2.m[vz2Var2.o], obj)) {
                this.n = i2;
                return;
            } else {
                vz2VarArr[i2].o += 2;
            }
        }
    }

    @Override // defpackage.x02, java.util.Iterator
    public final Object next() {
        if (this.p.p != this.s) {
            throw new ConcurrentModificationException();
        }
        if (!this.o) {
            b71.f();
            return null;
        }
        vz2 vz2Var = this.m[this.n];
        this.q = vz2Var.m[vz2Var.o];
        this.r = true;
        return super.next();
    }

    @Override // defpackage.x02, java.util.Iterator
    public final void remove() {
        if (!this.r) {
            throw new IllegalStateException();
        }
        boolean z = this.o;
        u02 u02Var = this.p;
        if (!z) {
            s03.e(u02Var).remove(this.q);
        } else {
            if (!z) {
                b71.f();
                return;
            }
            vz2 vz2Var = this.m[this.n];
            Object obj = vz2Var.m[vz2Var.o];
            s03.e(u02Var).remove(this.q);
            c(obj != null ? obj.hashCode() : 0, u02Var.n, obj, 0);
        }
        this.q = null;
        this.r = false;
        this.s = u02Var.p;
    }
}
