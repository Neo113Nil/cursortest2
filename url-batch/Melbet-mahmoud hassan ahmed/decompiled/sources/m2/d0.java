package m2;

import o2.m0;
import r0.h3;
import r0.w3;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f18988a;

    /* renamed from: b, reason: collision with root package name */
    public final h3[] f18989b;

    /* renamed from: c, reason: collision with root package name */
    public final t[] f18990c;

    /* renamed from: d, reason: collision with root package name */
    public final w3 f18991d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f18992e;

    public d0(h3[] h3VarArr, t[] tVarArr, w3 w3Var, Object obj) {
        this.f18989b = h3VarArr;
        this.f18990c = (t[]) tVarArr.clone();
        this.f18991d = w3Var;
        this.f18992e = obj;
        this.f18988a = h3VarArr.length;
    }

    public boolean a(d0 d0Var) {
        if (d0Var == null || d0Var.f18990c.length != this.f18990c.length) {
            return false;
        }
        for (int i7 = 0; i7 < this.f18990c.length; i7++) {
            if (!b(d0Var, i7)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(d0 d0Var, int i7) {
        return d0Var != null && m0.c(this.f18989b[i7], d0Var.f18989b[i7]) && m0.c(this.f18990c[i7], d0Var.f18990c[i7]);
    }

    public boolean c(int i7) {
        return this.f18989b[i7] != null;
    }
}
