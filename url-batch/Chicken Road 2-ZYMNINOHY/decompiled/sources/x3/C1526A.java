package x3;

import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: x3.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1526A extends C3.s {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15987e = AtomicIntegerFieldUpdater.newUpdater(C1526A.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // C3.s, x3.d0
    public final void l(Object obj) {
        m(obj);
    }

    @Override // C3.s, x3.d0
    public final void m(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f15987e;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                C3.a.g(AbstractC1562w.h(obj), AbstractC0347t0.m(this.f316d));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
