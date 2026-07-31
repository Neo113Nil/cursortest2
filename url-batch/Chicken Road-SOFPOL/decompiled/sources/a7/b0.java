package a7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b0 extends f7.q {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f243h = AtomicIntegerFieldUpdater.newUpdater(b0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // f7.q, a7.a1
    public final void y(Object obj) {
        z(obj);
    }

    @Override // f7.q, a7.a1
    public final void z(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f243h;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                f7.a.h(m.a.G(this.f2797g), x.o(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
