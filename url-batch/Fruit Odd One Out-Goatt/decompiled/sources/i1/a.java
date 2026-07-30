package i1;

import f0.l;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f384a;

    public a(e eVar) {
        this.f384a = new AtomicReference(eVar);
    }

    @Override // i1.b
    public final Iterator iterator() {
        b bVar = (b) this.f384a.getAndSet(null);
        if (bVar != null) {
            return bVar.iterator();
        }
        l.b("This sequence can be consumed only once.");
        return null;
    }
}
