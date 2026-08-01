package m1;

import X0.q;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f3206a;

    public a(q qVar) {
        this.f3206a = new AtomicReference(qVar);
    }

    @Override // m1.d
    public final Iterator iterator() {
        d dVar = (d) this.f3206a.getAndSet(null);
        if (dVar != null) {
            return dVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
