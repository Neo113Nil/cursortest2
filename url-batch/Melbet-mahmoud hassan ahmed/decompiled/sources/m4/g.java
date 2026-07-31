package m4;

import java.io.Serializable;

/* loaded from: classes.dex */
final class g<F, T> extends h0<F> implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    final l4.f<F, ? extends T> f19149f;

    /* renamed from: g, reason: collision with root package name */
    final h0<T> f19150g;

    g(l4.f<F, ? extends T> fVar, h0<T> h0Var) {
        this.f19149f = (l4.f) l4.j.i(fVar);
        this.f19150g = (h0) l4.j.i(h0Var);
    }

    @Override // m4.h0, java.util.Comparator
    public int compare(F f7, F f8) {
        return this.f19150g.compare(this.f19149f.apply(f7), this.f19149f.apply(f8));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f19149f.equals(gVar.f19149f) && this.f19150g.equals(gVar.f19150g);
    }

    public int hashCode() {
        return l4.i.b(this.f19149f, this.f19150g);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f19150g);
        String valueOf2 = String.valueOf(this.f19149f);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
