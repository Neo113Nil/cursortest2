package m1;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f3096a;

    public a(d dVar) {
        this.f3096a = new AtomicReference(dVar);
    }

    @Override // m1.d
    public final Iterator iterator() {
        d dVar = (d) this.f3096a.getAndSet(null);
        if (dVar != null) {
            return dVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
