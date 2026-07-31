package k0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: k0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0052k {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f871b = AtomicIntegerFieldUpdater.newUpdater(C0052k.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f872a;

    public C0052k(Throwable th, boolean z2) {
        this.f872a = th;
        this._handled = z2 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f872a + ']';
    }
}
