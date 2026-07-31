package o2;

import a2.AbstractC1241b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import t2.AbstractC3441l;
import t2.C3428C;

/* loaded from: classes3.dex */
public final class V extends C3428C {

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f42027f = AtomicIntegerFieldUpdater.newUpdater(V.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public V(CoroutineContext coroutineContext, kotlin.coroutines.d dVar) {
        super(coroutineContext, dVar);
    }

    private final boolean U0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f42027f;
        do {
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 != 0) {
                if (i4 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f42027f.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean V0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f42027f;
        do {
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 != 0) {
                if (i4 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f42027f.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // t2.C3428C, o2.D0
    protected void C(Object obj) {
        O0(obj);
    }

    @Override // t2.C3428C, o2.AbstractC3317a
    protected void O0(Object obj) {
        if (U0()) {
            return;
        }
        AbstractC3441l.c(AbstractC1241b.c(this.f46201e), AbstractC3311E.a(obj, this.f46201e), null, 2, null);
    }

    public final Object S0() {
        if (V0()) {
            return AbstractC1241b.f();
        }
        Object h4 = E0.h(c0());
        if (h4 instanceof C3308B) {
            throw ((C3308B) h4).f41962a;
        }
        return h4;
    }
}
