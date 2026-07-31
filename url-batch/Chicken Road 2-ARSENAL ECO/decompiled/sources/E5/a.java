package E5;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f686a;

    public a(h hVar) {
        this.f686a = new AtomicReference(hVar);
    }

    @Override // E5.f
    public final Iterator iterator() {
        f fVar = (f) this.f686a.getAndSet(null);
        if (fVar != null) {
            return fVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
