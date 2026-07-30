package n6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import s6.AbstractC0898a;

/* renamed from: n6.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0766D extends s6.q {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7009m = AtomicIntegerFieldUpdater.newUpdater(C0766D.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // s6.q, n6.f0
    public final void l(Object obj) {
        m(obj);
    }

    @Override // s6.q, n6.f0
    public final void m(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f7009m;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                AbstractC0898a.g(W5.d.b(this.f7852l), AbstractC0792z.m(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
