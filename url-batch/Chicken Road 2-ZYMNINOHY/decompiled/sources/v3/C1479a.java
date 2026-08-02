package v3;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: v3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1479a implements j {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f15694a;

    public C1479a(j jVar) {
        this.f15694a = new AtomicReference(jVar);
    }

    @Override // v3.j
    public final Iterator iterator() {
        j jVar = (j) this.f15694a.getAndSet(null);
        if (jVar != null) {
            return jVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
