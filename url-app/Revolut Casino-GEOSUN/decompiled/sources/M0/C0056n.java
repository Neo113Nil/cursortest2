package M0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: M0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0056n {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f675b = AtomicIntegerFieldUpdater.newUpdater(C0056n.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f676a;

    public C0056n(Throwable th, boolean z2) {
        this.f676a = th;
        this._handled = z2 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f676a + ']';
    }
}
