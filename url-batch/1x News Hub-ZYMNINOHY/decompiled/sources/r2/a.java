package r2;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f10264a;

    public a(f fVar) {
        this.f10264a = new AtomicReference(fVar);
    }

    @Override // r2.f
    public final Iterator iterator() {
        f fVar = (f) this.f10264a.getAndSet(null);
        if (fVar != null) {
            return fVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
