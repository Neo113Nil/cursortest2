package o6;

import kotlinx.coroutines.internal.y;

/* loaded from: classes.dex */
public class n<E> extends a<E> {
    public n(f6.l<? super E, v5.q> lVar) {
        super(lVar);
    }

    @Override // o6.c
    protected Object i(E e7) {
        q<?> k7;
        do {
            Object i7 = super.i(e7);
            y yVar = b.f19900b;
            if (i7 == yVar) {
                return yVar;
            }
            if (i7 != b.f19901c) {
                if (i7 instanceof j) {
                    return i7;
                }
                throw new IllegalStateException(kotlin.jvm.internal.i.i("Invalid offerInternal result ", i7).toString());
            }
            k7 = k(e7);
            if (k7 == null) {
                return yVar;
            }
        } while (!(k7 instanceof j));
        return k7;
    }

    @Override // o6.a
    protected final boolean r() {
        return true;
    }

    @Override // o6.a
    protected final boolean s() {
        return true;
    }
}
