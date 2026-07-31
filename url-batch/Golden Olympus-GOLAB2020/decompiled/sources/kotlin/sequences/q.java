package kotlin.sequences;

import i2.InterfaceC2471a;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    private final Sequence f41241a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f41242b;

    public static final class a implements Iterator, InterfaceC2471a {

        /* renamed from: b, reason: collision with root package name */
        private final Iterator f41243b;

        a() {
            this.f41243b = q.this.f41241a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f41243b.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return q.this.f41242b.invoke(this.f41243b.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public q(Sequence sequence, Function1 transformer) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        this.f41241a = sequence;
        this.f41242b = transformer;
    }

    public final Sequence d(Function1 iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return new f(this.f41241a, this.f41242b, iterator);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
