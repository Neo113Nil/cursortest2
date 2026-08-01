package s1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: s1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0327j {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4050b = AtomicIntegerFieldUpdater.newUpdater(C0327j.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f4051a;

    public C0327j(Throwable th, boolean z2) {
        this.f4051a = th;
        this._handled = z2 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f4051a + ']';
    }
}
