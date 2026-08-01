package je;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m0 extends ke.d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f5204a = new AtomicReference(null);

    @Override // ke.d
    public final boolean a(ke.b bVar) {
        AtomicReference atomicReference = this.f5204a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(b0.f5142b);
        return true;
    }

    @Override // ke.d
    public final ld.a[] b(ke.b bVar) {
        this.f5204a.set(null);
        return ke.c.f5510a;
    }
}
