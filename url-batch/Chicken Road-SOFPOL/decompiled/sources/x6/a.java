package x6;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f8662a;

    public a(e eVar) {
        this.f8662a = new AtomicReference(eVar);
    }

    @Override // x6.e
    public final Iterator iterator() {
        e eVar = (e) this.f8662a.getAndSet(null);
        if (eVar != null) {
            return eVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
