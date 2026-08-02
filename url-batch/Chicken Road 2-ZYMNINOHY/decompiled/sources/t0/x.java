package t0;

import T.a0;
import a.AbstractC0124a;
import a0.m0;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f15384a;

    /* renamed from: b, reason: collision with root package name */
    public final m0[] f15385b;

    /* renamed from: c, reason: collision with root package name */
    public final t[] f15386c;

    /* renamed from: d, reason: collision with root package name */
    public final a0 f15387d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f15388e;

    public x(m0[] m0VarArr, t[] tVarArr, a0 a0Var, Object obj) {
        AbstractC0124a.h(m0VarArr.length == tVarArr.length);
        this.f15385b = m0VarArr;
        this.f15386c = (t[]) tVarArr.clone();
        this.f15387d = a0Var;
        this.f15388e = obj;
        this.f15384a = m0VarArr.length;
    }

    public final boolean a(x xVar, int i4) {
        return xVar != null && Objects.equals(this.f15385b[i4], xVar.f15385b[i4]) && Objects.equals(this.f15386c[i4], xVar.f15386c[i4]);
    }

    public final boolean b(int i4) {
        return this.f15385b[i4] != null;
    }
}
