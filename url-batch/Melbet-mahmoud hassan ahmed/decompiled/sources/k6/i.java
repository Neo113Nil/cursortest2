package k6;

import f6.l;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i<T, R> implements b<R> {

    /* renamed from: a, reason: collision with root package name */
    private final b<T> f18288a;

    /* renamed from: b, reason: collision with root package name */
    private final l<T, R> f18289b;

    public static final class a implements Iterator<R> {

        /* renamed from: f, reason: collision with root package name */
        private final Iterator<T> f18290f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ i<T, R> f18291g;

        a(i<T, R> iVar) {
            this.f18291g = iVar;
            this.f18290f = ((i) iVar).f18288a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f18290f.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((i) this.f18291g).f18289b.invoke(this.f18290f.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(b<? extends T> bVar, l<? super T, ? extends R> lVar) {
        kotlin.jvm.internal.i.d(bVar, "sequence");
        kotlin.jvm.internal.i.d(lVar, "transformer");
        this.f18288a = bVar;
        this.f18289b = lVar;
    }

    @Override // k6.b
    public Iterator<R> iterator() {
        return new a(this);
    }
}
