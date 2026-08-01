package n1;

import W0.n;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f3384a;

    public a(n nVar) {
        this.f3384a = new AtomicReference(nVar);
    }

    @Override // n1.d
    public final Iterator iterator() {
        d dVar = (d) this.f3384a.getAndSet(null);
        if (dVar != null) {
            return dVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
