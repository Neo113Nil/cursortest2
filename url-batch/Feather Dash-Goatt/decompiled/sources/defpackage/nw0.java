package defpackage;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class nw0 extends mw0 {
    public final jw0 h;
    public Object i;
    public boolean j;
    public int k;

    public nw0(jw0 jw0Var, pj1[] pj1VarArr) {
        super(jw0Var.e, pj1VarArr);
        this.h = jw0Var;
        this.k = jw0Var.h;
    }

    public final void c(int i, oj1 oj1Var, Object obj, int i2) {
        int i3 = i2 * 5;
        pj1[] pj1VarArr = this.d;
        if (i3 <= 30) {
            int p = 1 << xa0.p(i, i3);
            if (oj1Var.h(p)) {
                pj1VarArr[i2].a(oj1Var.d, Integer.bitCount(oj1Var.a) * 2, oj1Var.f(p));
                this.e = i2;
                return;
            } else {
                int t = oj1Var.t(p);
                oj1 s = oj1Var.s(t);
                pj1VarArr[i2].a(oj1Var.d, Integer.bitCount(oj1Var.a) * 2, t);
                c(i, s, obj, i2 + 1);
                return;
            }
        }
        pj1 pj1Var = pj1VarArr[i2];
        Object[] objArr = oj1Var.d;
        pj1Var.a(objArr, objArr.length, 0);
        while (true) {
            pj1 pj1Var2 = pj1VarArr[i2];
            if (Intrinsics.a(pj1Var2.d[pj1Var2.g], obj)) {
                this.e = i2;
                return;
            } else {
                pj1VarArr[i2].g += 2;
            }
        }
    }

    @Override // defpackage.mw0, java.util.Iterator
    public final Object next() {
        if (this.h.h != this.k) {
            throw new ConcurrentModificationException();
        }
        if (!this.g) {
            dd0.c();
            return null;
        }
        pj1 pj1Var = this.d[this.e];
        this.i = pj1Var.d[pj1Var.g];
        this.j = true;
        return super.next();
    }

    @Override // defpackage.mw0, java.util.Iterator
    public final void remove() {
        if (!this.j) {
            throw new IllegalStateException();
        }
        boolean z = this.g;
        jw0 jw0Var = this.h;
        if (!z) {
            tj1.a(jw0Var).remove(this.i);
        } else {
            if (!z) {
                dd0.c();
                return;
            }
            pj1 pj1Var = this.d[this.e];
            Object obj = pj1Var.d[pj1Var.g];
            tj1.a(jw0Var).remove(this.i);
            c(obj != null ? obj.hashCode() : 0, jw0Var.e, obj, 0);
        }
        this.i = null;
        this.j = false;
        this.k = jw0Var.h;
    }
}
