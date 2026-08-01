package d1;

import Q0.o;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f1907a;

    public a(o oVar) {
        this.f1907a = new AtomicReference(oVar);
    }

    @Override // d1.d
    public final Iterator iterator() {
        d dVar = (d) this.f1907a.getAndSet(null);
        if (dVar != null) {
            return dVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
