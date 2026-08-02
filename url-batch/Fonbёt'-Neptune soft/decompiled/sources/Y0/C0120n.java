package Y0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: Y0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0120n {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1218b = AtomicIntegerFieldUpdater.newUpdater(C0120n.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f1219a;

    public C0120n(Throwable th, boolean z2) {
        this.f1219a = th;
        this._handled = z2 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f1219a + ']';
    }
}
