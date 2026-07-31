package k2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: k2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0544p {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5377b = AtomicIntegerFieldUpdater.newUpdater(C0544p.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f5378a;

    public C0544p(Throwable th, boolean z3) {
        this.f5378a = th;
        this._handled$volatile = z3 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f5378a + ']';
    }
}
