package kotlin.sequences;

import i2.InterfaceC2471a;
import io.jsonwebtoken.JwtParser;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements Sequence, c {

    /* renamed from: a, reason: collision with root package name */
    private final Sequence f41198a;

    /* renamed from: b, reason: collision with root package name */
    private final int f41199b;

    public static final class a implements Iterator, InterfaceC2471a {

        /* renamed from: b, reason: collision with root package name */
        private final Iterator f41200b;

        /* renamed from: c, reason: collision with root package name */
        private int f41201c;

        a(b bVar) {
            this.f41200b = bVar.f41198a.iterator();
            this.f41201c = bVar.f41199b;
        }

        private final void a() {
            while (this.f41201c > 0 && this.f41200b.hasNext()) {
                this.f41200b.next();
                this.f41201c--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f41200b.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            return this.f41200b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(Sequence sequence, int i4) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f41198a = sequence;
        this.f41199b = i4;
        if (i4 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i4 + JwtParser.SEPARATOR_CHAR).toString());
    }

    @Override // kotlin.sequences.c
    public Sequence a(int i4) {
        int i5 = this.f41199b + i4;
        return i5 < 0 ? new b(this, i4) : new b(this.f41198a, i5);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a(this);
    }
}
