package ge;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class q {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4393b = AtomicIntegerFieldUpdater.newUpdater(q.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f4394a;

    public q(Throwable th, boolean z10) {
        this.f4394a = th;
        this._handled$volatile = z10 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f4394a + ']';
    }
}
