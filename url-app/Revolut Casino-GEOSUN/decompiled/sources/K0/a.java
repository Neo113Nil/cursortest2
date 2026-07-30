package K0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f463a;

    public a(e eVar) {
        this.f463a = new AtomicReference(eVar);
    }

    @Override // K0.b
    public final Iterator iterator() {
        b bVar = (b) this.f463a.getAndSet(null);
        if (bVar != null) {
            return bVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
