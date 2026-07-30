package kotlin.collections;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class d0 implements Iterable, g6.a {
    private final f6.a iteratorFactory;

    public d0(f6.a iteratorFactory) {
        kotlin.jvm.internal.s.checkNotNullParameter(iteratorFactory, "iteratorFactory");
        this.iteratorFactory = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public Iterator<c0> iterator() {
        return new e0((Iterator) this.iteratorFactory.invoke());
    }
}
