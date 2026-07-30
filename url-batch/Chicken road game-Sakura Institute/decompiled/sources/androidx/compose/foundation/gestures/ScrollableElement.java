package androidx.compose.foundation.gestures;

import a0.m;
import b1.b;
import l1.d0;
import m.w0;
import o.e;
import o.f1;
import o.i;
import o.j0;
import o.k;
import o.x0;
import o.y0;
import p.j;
import r1.f;
import r1.s0;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class ScrollableElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f606a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f607b;

    /* renamed from: c, reason: collision with root package name */
    public final w0 f608c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f609d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f610e;

    /* renamed from: f, reason: collision with root package name */
    public final k f611f;

    /* renamed from: g, reason: collision with root package name */
    public final j f612g;

    public ScrollableElement(w0 w0Var, k kVar, j0 j0Var, y0 y0Var, j jVar, boolean z8, boolean z9) {
        this.f606a = y0Var;
        this.f607b = j0Var;
        this.f608c = w0Var;
        this.f609d = z8;
        this.f610e = z9;
        this.f611f = kVar;
        this.f612g = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return r6.k.a(this.f606a, scrollableElement.f606a) && this.f607b == scrollableElement.f607b && r6.k.a(this.f608c, scrollableElement.f608c) && this.f609d == scrollableElement.f609d && this.f610e == scrollableElement.f610e && r6.k.a(this.f611f, scrollableElement.f611f) && r6.k.a(this.f612g, scrollableElement.f612g);
    }

    public final int hashCode() {
        int hashCode = (this.f607b.hashCode() + (this.f606a.hashCode() * 31)) * 31;
        w0 w0Var = this.f608c;
        int e9 = m.e(m.e((hashCode + (w0Var != null ? w0Var.hashCode() : 0)) * 31, 31, this.f609d), 31, this.f610e);
        k kVar = this.f611f;
        int hashCode2 = (e9 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        j jVar = this.f612g;
        return (hashCode2 + (jVar != null ? jVar.hashCode() : 0)) * 31;
    }

    @Override // r1.s0
    public final n l() {
        boolean z8 = this.f610e;
        return new x0(this.f608c, this.f611f, this.f607b, this.f606a, this.f612g, this.f609d, z8);
    }

    @Override // r1.s0
    public final void m(n nVar) {
        boolean z8;
        d0 d0Var;
        x0 x0Var = (x0) nVar;
        f1 f1Var = x0Var.H;
        boolean z9 = x0Var.f6794w;
        boolean z10 = this.f609d;
        boolean z11 = true;
        boolean z12 = false;
        if (z9 != z10) {
            x0Var.I.f6422a = z10;
            x0Var.F.f6710s = z10;
            z8 = true;
        } else {
            z8 = false;
        }
        k kVar = this.f611f;
        k kVar2 = kVar == null ? x0Var.G : kVar;
        b bVar = x0Var.E;
        y0 y0Var = f1Var.f6609a;
        y0 y0Var2 = this.f606a;
        if (!r6.k.a(y0Var, y0Var2)) {
            f1Var.f6609a = y0Var2;
            z12 = true;
        }
        w0 w0Var = this.f608c;
        f1Var.f6610b = w0Var;
        j0 j0Var = f1Var.f6612d;
        j0 j0Var2 = this.f607b;
        if (j0Var != j0Var2) {
            f1Var.f6612d = j0Var2;
            z12 = true;
        }
        boolean z13 = f1Var.f6613e;
        boolean z14 = this.f610e;
        if (z13 != z14) {
            f1Var.f6613e = z14;
        } else {
            z11 = z12;
        }
        f1Var.f6611c = kVar2;
        f1Var.f6614f = bVar;
        i iVar = x0Var.J;
        iVar.f6635s = j0Var2;
        iVar.f6637u = z14;
        x0Var.C = w0Var;
        x0Var.D = kVar;
        e eVar = e.f6595i;
        j0 j0Var3 = f1Var.f6612d;
        j0 j0Var4 = j0.f6657f;
        if (j0Var3 != j0Var4) {
            j0Var4 = j0.f6658g;
        }
        x0Var.f6793v = eVar;
        boolean z15 = true;
        if (x0Var.f6794w != z10) {
            x0Var.f6794w = z10;
            if (!z10) {
                x0Var.G0();
                d0 d0Var2 = x0Var.B;
                if (d0Var2 != null) {
                    x0Var.B0(d0Var2);
                }
                x0Var.B = null;
            }
            z11 = true;
        }
        j jVar = x0Var.f6795x;
        j jVar2 = this.f612g;
        if (!r6.k.a(jVar, jVar2)) {
            x0Var.G0();
            x0Var.f6795x = jVar2;
        }
        if (x0Var.f6792u != j0Var4) {
            x0Var.f6792u = j0Var4;
        } else {
            z15 = z11;
        }
        if (z15 && (d0Var = x0Var.B) != null) {
            d0Var.C0();
        }
        if (z8) {
            x0Var.L = null;
            x0Var.M = null;
            f.o(x0Var);
        }
    }
}
