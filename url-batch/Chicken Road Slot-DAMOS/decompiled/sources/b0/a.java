package b0;

import n0.j1;
import o3.k1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements c1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f796a;

    /* renamed from: b, reason: collision with root package name */
    public final String f797b;

    /* renamed from: c, reason: collision with root package name */
    public final j1 f798c = n0.h.r(h3.b.f4442e);

    /* renamed from: d, reason: collision with root package name */
    public final j1 f799d = n0.h.r(Boolean.TRUE);

    public a(int i3, String str) {
        this.f796a = i3;
        this.f797b = str;
    }

    @Override // b0.c1
    public final int a(c2.o0 o0Var) {
        return e().f4446d;
    }

    @Override // b0.c1
    public final int b(c2.o0 o0Var, x2.l lVar) {
        return e().f4443a;
    }

    @Override // b0.c1
    public final int c(c2.o0 o0Var) {
        return e().f4444b;
    }

    @Override // b0.c1
    public final int d(c2.o0 o0Var, x2.l lVar) {
        return e().f4445c;
    }

    public final h3.b e() {
        return (h3.b) this.f798c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f796a == ((a) obj).f796a;
        }
        return false;
    }

    public final void f(boolean z10) {
        this.f799d.setValue(Boolean.valueOf(z10));
    }

    public final void g(k1 k1Var, int i3) {
        int i10 = this.f796a;
        if (i3 == 0 || (i3 & i10) != 0) {
            this.f798c.setValue(k1Var.f7415a.i(i10));
            f(k1Var.f7415a.u(i10));
        }
    }

    public final int hashCode() {
        return this.f796a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f797b);
        sb2.append('(');
        sb2.append(e().f4443a);
        sb2.append(", ");
        sb2.append(e().f4444b);
        sb2.append(", ");
        sb2.append(e().f4445c);
        sb2.append(", ");
        return v4.a.m(sb2, e().f4446d, ')');
    }
}
