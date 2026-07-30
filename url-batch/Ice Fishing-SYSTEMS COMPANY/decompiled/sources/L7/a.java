package L7;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f1790a;

    public a(h hVar) {
        this.f1790a = new AtomicReference(hVar);
    }

    @Override // L7.h
    public final Iterator iterator() {
        h hVar = (h) this.f1790a.getAndSet(null);
        if (hVar != null) {
            return hVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
