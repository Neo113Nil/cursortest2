package m4;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes.dex */
final class j<T> extends h0<T> implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    final Comparator<T> f19153f;

    j(Comparator<T> comparator) {
        this.f19153f = (Comparator) l4.j.i(comparator);
    }

    @Override // m4.h0, java.util.Comparator
    public int compare(T t6, T t7) {
        return this.f19153f.compare(t6, t7);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f19153f.equals(((j) obj).f19153f);
        }
        return false;
    }

    public int hashCode() {
        return this.f19153f.hashCode();
    }

    public String toString() {
        return this.f19153f.toString();
    }
}
