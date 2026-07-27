package A4;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f83a;

    public a(h hVar) {
        this.f83a = new AtomicReference(hVar);
    }

    @Override // A4.f
    public final Iterator iterator() {
        f fVar = (f) this.f83a.getAndSet(null);
        if (fVar != null) {
            return fVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
