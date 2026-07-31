package W0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: W0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0074n {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f964b = AtomicIntegerFieldUpdater.newUpdater(C0074n.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f965a;

    public C0074n(Throwable th, boolean z2) {
        this.f965a = th;
        this._handled = z2 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f965a + ']';
    }
}
