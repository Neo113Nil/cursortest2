package kotlin.sequences;

import i2.InterfaceC2471a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    private final Sequence f41210a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f41211b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f41212c;

    public static final class a implements Iterator, InterfaceC2471a {

        /* renamed from: b, reason: collision with root package name */
        private final Iterator f41213b;

        /* renamed from: c, reason: collision with root package name */
        private Iterator f41214c;

        a() {
            this.f41213b = f.this.f41210a.iterator();
        }

        private final boolean a() {
            Iterator it = this.f41214c;
            if (it != null && !it.hasNext()) {
                this.f41214c = null;
            }
            while (true) {
                if (this.f41214c != null) {
                    break;
                }
                if (!this.f41213b.hasNext()) {
                    return false;
                }
                Iterator it2 = (Iterator) f.this.f41212c.invoke(f.this.f41211b.invoke(this.f41213b.next()));
                if (it2.hasNext()) {
                    this.f41214c = it2;
                    break;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return a();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            Iterator it = this.f41214c;
            Intrinsics.checkNotNull(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(Sequence sequence, Function1 transformer, Function1 iterator) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f41210a = sequence;
        this.f41211b = transformer;
        this.f41212c = iterator;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
