package kotlin.sequences;

import i2.InterfaceC2471a;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    private final Sequence f41221a;

    /* renamed from: b, reason: collision with root package name */
    private final Sequence f41222b;

    /* renamed from: c, reason: collision with root package name */
    private final Function2 f41223c;

    public static final class a implements Iterator, InterfaceC2471a {

        /* renamed from: b, reason: collision with root package name */
        private final Iterator f41224b;

        /* renamed from: c, reason: collision with root package name */
        private final Iterator f41225c;

        a() {
            this.f41224b = h.this.f41221a.iterator();
            this.f41225c = h.this.f41222b.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f41224b.hasNext() && this.f41225c.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return h.this.f41223c.invoke(this.f41224b.next(), this.f41225c.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(Sequence sequence1, Sequence sequence2, Function2 transform) {
        Intrinsics.checkNotNullParameter(sequence1, "sequence1");
        Intrinsics.checkNotNullParameter(sequence2, "sequence2");
        Intrinsics.checkNotNullParameter(transform, "transform");
        this.f41221a = sequence1;
        this.f41222b = sequence2;
        this.f41223c = transform;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
