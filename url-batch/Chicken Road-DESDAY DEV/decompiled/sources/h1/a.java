package h1;

import T0.o;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f2449a;

    public a(o oVar) {
        this.f2449a = new AtomicReference(oVar);
    }

    @Override // h1.d
    public final Iterator iterator() {
        d dVar = (d) this.f2449a.getAndSet(null);
        if (dVar != null) {
            return dVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
