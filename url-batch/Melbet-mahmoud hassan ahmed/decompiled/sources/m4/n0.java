package m4;

import java.io.Serializable;

/* loaded from: classes.dex */
final class n0<T> extends h0<T> implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    final h0<? super T> f19183f;

    n0(h0<? super T> h0Var) {
        this.f19183f = (h0) l4.j.i(h0Var);
    }

    @Override // m4.h0, java.util.Comparator
    public int compare(T t6, T t7) {
        return this.f19183f.compare(t7, t6);
    }

    @Override // m4.h0
    public <S extends T> h0<S> d() {
        return this.f19183f;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n0) {
            return this.f19183f.equals(((n0) obj).f19183f);
        }
        return false;
    }

    public int hashCode() {
        return -this.f19183f.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f19183f);
        StringBuilder sb = new StringBuilder(valueOf.length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
