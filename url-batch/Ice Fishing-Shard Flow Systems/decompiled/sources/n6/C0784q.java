package n6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: n6.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0784q {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7075b = AtomicIntegerFieldUpdater.newUpdater(C0784q.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f7076a;

    public C0784q(Throwable th, boolean z7) {
        this.f7076a = th;
        this._handled$volatile = z7 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f7076a + ']';
    }
}
