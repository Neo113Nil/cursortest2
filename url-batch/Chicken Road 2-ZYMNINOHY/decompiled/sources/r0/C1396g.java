package r0;

import q0.a0;
import q0.b0;

/* renamed from: r0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1396g implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final C1398i f15147a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f15148b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15149c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1398i f15151e;

    public C1396g(C1398i c1398i, C1398i c1398i2, a0 a0Var, int i4) {
        this.f15151e = c1398i;
        this.f15147a = c1398i2;
        this.f15148b = a0Var;
        this.f15149c = i4;
    }

    public final void b() {
        if (this.f15150d) {
            return;
        }
        C1398i c1398i = this.f15151e;
        f0.e eVar = c1398i.f15158g;
        int[] iArr = c1398i.f15153b;
        int i4 = this.f15149c;
        eVar.b(iArr[i4], c1398i.f15154c[i4], 0, null, c1398i.f15169t);
        this.f15150d = true;
    }

    @Override // q0.b0
    public final boolean isReady() {
        C1398i c1398i = this.f15151e;
        return !c1398i.y() && this.f15148b.x(c1398i.f15173y);
    }

    @Override // q0.b0
    public final int k(long j4) {
        C1398i c1398i = this.f15151e;
        if (c1398i.y()) {
            return 0;
        }
        boolean z = c1398i.f15173y;
        a0 a0Var = this.f15148b;
        int v = a0Var.v(j4, z);
        AbstractC1390a abstractC1390a = c1398i.v;
        if (abstractC1390a != null) {
            v = Math.min(v, abstractC1390a.e(this.f15149c + 1) - a0Var.t());
        }
        a0Var.H(v);
        if (v > 0) {
            b();
        }
        return v;
    }

    @Override // q0.b0
    public final int n(l2.e eVar, Z.f fVar, int i4) {
        C1398i c1398i = this.f15151e;
        if (c1398i.y()) {
            return -3;
        }
        AbstractC1390a abstractC1390a = c1398i.v;
        a0 a0Var = this.f15148b;
        if (abstractC1390a != null && abstractC1390a.e(this.f15149c + 1) <= a0Var.t()) {
            return -3;
        }
        b();
        return a0Var.C(eVar, fVar, i4, c1398i.f15173y);
    }

    @Override // q0.b0
    public final void a() {
    }
}
