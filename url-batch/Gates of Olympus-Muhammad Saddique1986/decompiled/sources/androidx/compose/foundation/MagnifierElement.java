package androidx.compose.foundation;

import A.k;
import A0.l;
import A0.v;
import U.p;
import android.view.View;
import e2.InterfaceC0424c;
import f2.j;
import n.c0;
import n.d0;
import n.n0;
import t0.AbstractC0993f;
import t0.U;

/* loaded from: classes.dex */
public final class MagnifierElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final l f4767a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0424c f4768b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0424c f4769c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4770d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4771e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4772f;

    /* renamed from: g, reason: collision with root package name */
    public final float f4773g;

    /* renamed from: h, reason: collision with root package name */
    public final float f4774h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4775i;

    /* renamed from: j, reason: collision with root package name */
    public final n0 f4776j;

    public MagnifierElement(l lVar, InterfaceC0424c interfaceC0424c, InterfaceC0424c interfaceC0424c2, float f3, boolean z3, long j3, float f4, float f5, boolean z4, n0 n0Var) {
        this.f4767a = lVar;
        this.f4768b = interfaceC0424c;
        this.f4769c = interfaceC0424c2;
        this.f4770d = f3;
        this.f4771e = z3;
        this.f4772f = j3;
        this.f4773g = f4;
        this.f4774h = f5;
        this.f4775i = z4;
        this.f4776j = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) obj;
        return this.f4767a == magnifierElement.f4767a && this.f4768b == magnifierElement.f4768b && this.f4770d == magnifierElement.f4770d && this.f4771e == magnifierElement.f4771e && this.f4772f == magnifierElement.f4772f && O0.e.a(this.f4773g, magnifierElement.f4773g) && O0.e.a(this.f4774h, magnifierElement.f4774h) && this.f4775i == magnifierElement.f4775i && this.f4769c == magnifierElement.f4769c && this.f4776j.equals(magnifierElement.f4776j);
    }

    public final int hashCode() {
        int hashCode = this.f4767a.hashCode() * 31;
        InterfaceC0424c interfaceC0424c = this.f4768b;
        int e3 = k.e(k.a(this.f4774h, k.a(this.f4773g, k.c(k.e(k.a(this.f4770d, (hashCode + (interfaceC0424c != null ? interfaceC0424c.hashCode() : 0)) * 31, 31), 31, this.f4771e), 31, this.f4772f), 31), 31), 31, this.f4775i);
        InterfaceC0424c interfaceC0424c2 = this.f4769c;
        return this.f4776j.hashCode() + ((e3 + (interfaceC0424c2 != null ? interfaceC0424c2.hashCode() : 0)) * 31);
    }

    @Override // t0.U
    public final p l() {
        n0 n0Var = this.f4776j;
        return new c0(this.f4767a, this.f4768b, this.f4769c, this.f4770d, this.f4771e, this.f4772f, this.f4773g, this.f4774h, this.f4775i, n0Var);
    }

    @Override // t0.U
    public final void m(p pVar) {
        c0 c0Var = (c0) pVar;
        float f3 = c0Var.f7104t;
        long j3 = c0Var.f7106v;
        float f4 = c0Var.f7107w;
        boolean z3 = c0Var.f7105u;
        float f5 = c0Var.f7108x;
        boolean z4 = c0Var.f7109y;
        n0 n0Var = c0Var.f7110z;
        View view = c0Var.f7095A;
        O0.b bVar = c0Var.f7096B;
        c0Var.f7101q = this.f4767a;
        c0Var.f7102r = this.f4768b;
        float f6 = this.f4770d;
        c0Var.f7104t = f6;
        boolean z5 = this.f4771e;
        c0Var.f7105u = z5;
        long j4 = this.f4772f;
        c0Var.f7106v = j4;
        float f7 = this.f4773g;
        c0Var.f7107w = f7;
        float f8 = this.f4774h;
        c0Var.f7108x = f8;
        boolean z6 = this.f4775i;
        c0Var.f7109y = z6;
        c0Var.f7103s = this.f4769c;
        n0 n0Var2 = this.f4776j;
        c0Var.f7110z = n0Var2;
        View v3 = AbstractC0993f.v(c0Var);
        O0.b bVar2 = AbstractC0993f.t(c0Var).f8556t;
        if (c0Var.C != null) {
            v vVar = d0.f7118a;
            if (((!Float.isNaN(f6) || !Float.isNaN(f3)) && f6 != f3 && !n0Var2.b()) || j4 != j3 || !O0.e.a(f7, f4) || !O0.e.a(f8, f5) || z5 != z3 || z6 != z4 || !n0Var2.equals(n0Var) || !v3.equals(view) || !j.a(bVar2, bVar)) {
                c0Var.z0();
            }
        }
        c0Var.A0();
    }
}
