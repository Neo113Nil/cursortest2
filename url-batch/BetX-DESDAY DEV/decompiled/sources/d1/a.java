package d1;

import O0.o;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f2093a;

    public a(o oVar) {
        this.f2093a = new AtomicReference(oVar);
    }

    @Override // d1.d
    public final Iterator iterator() {
        d dVar = (d) this.f2093a.getAndSet(null);
        if (dVar != null) {
            return dVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
