package m4;

import java.io.Serializable;

/* loaded from: classes.dex */
final class e0 extends h0<Comparable<?>> implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    static final e0 f19144f = new e0();

    private e0() {
    }

    @Override // m4.h0
    public <S extends Comparable<?>> h0<S> d() {
        return m0.f19182f;
    }

    @Override // m4.h0, java.util.Comparator
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        l4.j.i(comparable);
        l4.j.i(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
