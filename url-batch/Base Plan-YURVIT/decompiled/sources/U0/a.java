package U0;

import E0.m;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f856a;

    public a(m mVar) {
        this.f856a = new AtomicReference(mVar);
    }

    @Override // U0.d
    public final Iterator iterator() {
        d dVar = (d) this.f856a.getAndSet(null);
        if (dVar != null) {
            return dVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
