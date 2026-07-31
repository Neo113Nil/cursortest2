package d7;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o0 extends e7.d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f2407a = new AtomicReference(null);

    @Override // e7.d
    public final boolean a(e7.b bVar) {
        AtomicReference atomicReference = this.f2407a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(e0.f2356b);
        return true;
    }

    @Override // e7.d
    public final g6.c[] b(e7.b bVar) {
        this.f2407a.set(null);
        return e7.c.f2543a;
    }
}
