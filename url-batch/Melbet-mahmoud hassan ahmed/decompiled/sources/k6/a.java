package k6;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a<T> implements b<T> {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<b<T>> f18286a;

    public a(b<? extends T> bVar) {
        kotlin.jvm.internal.i.d(bVar, "sequence");
        this.f18286a = new AtomicReference<>(bVar);
    }

    @Override // k6.b
    public Iterator<T> iterator() {
        b<T> andSet = this.f18286a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
