package kotlin.sequences;

import i2.InterfaceC2471a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    private final Sequence f41203a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f41204b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f41205c;

    public static final class a implements Iterator, InterfaceC2471a {

        /* renamed from: b, reason: collision with root package name */
        private final Iterator f41206b;

        /* renamed from: c, reason: collision with root package name */
        private int f41207c = -1;

        /* renamed from: d, reason: collision with root package name */
        private Object f41208d;

        a() {
            this.f41206b = e.this.f41203a.iterator();
        }

        private final void a() {
            while (this.f41206b.hasNext()) {
                Object next = this.f41206b.next();
                if (((Boolean) e.this.f41205c.invoke(next)).booleanValue() == e.this.f41204b) {
                    this.f41208d = next;
                    this.f41207c = 1;
                    return;
                }
            }
            this.f41207c = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f41207c == -1) {
                a();
            }
            return this.f41207c == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f41207c == -1) {
                a();
            }
            if (this.f41207c == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f41208d;
            this.f41208d = null;
            this.f41207c = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(Sequence sequence, boolean z4, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f41203a = sequence;
        this.f41204b = z4;
        this.f41205c = predicate;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
