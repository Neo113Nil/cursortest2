package f1;

import R0.o;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f2253a;

    public a(o oVar) {
        this.f2253a = new AtomicReference(oVar);
    }

    @Override // f1.d
    public final Iterator iterator() {
        d dVar = (d) this.f2253a.getAndSet(null);
        if (dVar != null) {
            return dVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
