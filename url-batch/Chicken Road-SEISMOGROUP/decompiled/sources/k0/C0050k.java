package k0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: k0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0050k {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f924b = AtomicIntegerFieldUpdater.newUpdater(C0050k.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f925a;

    public C0050k(Throwable th, boolean z) {
        this.f925a = th;
        this._handled = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f925a + ']';
    }
}
