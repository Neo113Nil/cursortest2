package m4;

import java.io.Serializable;

/* loaded from: classes.dex */
final class m0 extends h0<Comparable<?>> implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    static final m0 f19182f = new m0();

    private m0() {
    }

    @Override // m4.h0
    public <S extends Comparable<?>> h0<S> d() {
        return h0.b();
    }

    @Override // m4.h0, java.util.Comparator
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        l4.j.i(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
