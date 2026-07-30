package w;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c0 implements p1.r {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f9202a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9203b;

    /* renamed from: c, reason: collision with root package name */
    public final g2.d0 f9204c;

    /* renamed from: d, reason: collision with root package name */
    public final q6.a f9205d;

    public c0(x0 x0Var, int i7, g2.d0 d0Var, q6.a aVar) {
        this.f9202a = x0Var;
        this.f9203b = i7;
        this.f9204c = d0Var;
        this.f9205d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return r6.k.a(this.f9202a, c0Var.f9202a) && this.f9203b == c0Var.f9203b && r6.k.a(this.f9204c, c0Var.f9204c) && r6.k.a(this.f9205d, c0Var.f9205d);
    }

    @Override // p1.r
    public final p1.g0 f(p1.h0 h0Var, p1.e0 e0Var, long j8) {
        long j9;
        if (e0Var.d0(m2.a.g(j8)) < m2.a.h(j8)) {
            j9 = j8;
        } else {
            j9 = j8;
            j8 = m2.a.a(j9, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        p1.n0 b9 = e0Var.b(j8);
        int min = Math.min(b9.f7063f, m2.a.h(j9));
        return h0Var.C(min, b9.f7064g, e6.v.f2827f, new d0.e(h0Var, this, b9, min, 3));
    }

    public final int hashCode() {
        return this.f9205d.hashCode() + ((this.f9204c.hashCode() + l.h.c(this.f9203b, this.f9202a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f9202a + ", cursorOffset=" + this.f9203b + ", transformedText=" + this.f9204c + ", textLayoutResultProvider=" + this.f9205d + ')';
    }
}
