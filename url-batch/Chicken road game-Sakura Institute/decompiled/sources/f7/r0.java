package f7;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r0 extends g7.d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f3550a = new AtomicReference(null);

    @Override // g7.d
    public final boolean a(g7.b bVar) {
        AtomicReference atomicReference = this.f3550a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(f0.f3470b);
        return true;
    }

    @Override // g7.d
    public final h6.d[] b(g7.b bVar) {
        this.f3550a.set(null);
        return g7.c.f4480a;
    }
}
