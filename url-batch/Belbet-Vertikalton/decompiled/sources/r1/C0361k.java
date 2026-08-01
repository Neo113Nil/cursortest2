package r1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: r1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0361k {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4078b = AtomicIntegerFieldUpdater.newUpdater(C0361k.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f4079a;

    public C0361k(Throwable th, boolean z2) {
        this.f4079a = th;
        this._handled = z2 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f4079a + ']';
    }
}
