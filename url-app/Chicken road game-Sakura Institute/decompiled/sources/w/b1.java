package w;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b1 implements p1.r {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f9197a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9198b;

    /* renamed from: c, reason: collision with root package name */
    public final g2.d0 f9199c;

    /* renamed from: d, reason: collision with root package name */
    public final q6.a f9200d;

    public b1(x0 x0Var, int i7, g2.d0 d0Var, q6.a aVar) {
        this.f9197a = x0Var;
        this.f9198b = i7;
        this.f9199c = d0Var;
        this.f9200d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return r6.k.a(this.f9197a, b1Var.f9197a) && this.f9198b == b1Var.f9198b && r6.k.a(this.f9199c, b1Var.f9199c) && r6.k.a(this.f9200d, b1Var.f9200d);
    }

    @Override // p1.r
    public final p1.g0 f(p1.h0 h0Var, p1.e0 e0Var, long j8) {
        p1.n0 b9 = e0Var.b(m2.a.a(j8, 0, 0, 0, Integer.MAX_VALUE, 7));
        int min = Math.min(b9.f7064g, m2.a.g(j8));
        return h0Var.C(b9.f7063f, min, e6.v.f2827f, new d0.e(h0Var, this, b9, min, 4));
    }

    public final int hashCode() {
        return this.f9200d.hashCode() + ((this.f9199c.hashCode() + l.h.c(this.f9198b, this.f9197a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f9197a + ", cursorOffset=" + this.f9198b + ", transformedText=" + this.f9199c + ", textLayoutResultProvider=" + this.f9200d + ')';
    }
}
