package t2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class S extends W {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(S.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final Q f10391e;

    public S(Q q3) {
        this.f10391e = q3;
    }

    @Override // t2.Q
    public final void c(Throwable th) {
        if (f.compareAndSet(this, 0, 1)) {
            this.f10391e.c(th);
        }
    }
}
