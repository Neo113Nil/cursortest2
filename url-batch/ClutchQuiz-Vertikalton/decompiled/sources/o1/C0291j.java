package o1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: o1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0291j {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3347b = AtomicIntegerFieldUpdater.newUpdater(C0291j.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f3348a;

    public C0291j(Throwable th, boolean z2) {
        this.f3348a = th;
        this._handled = z2 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f3348a + ']';
    }
}
