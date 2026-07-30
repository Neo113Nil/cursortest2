package k1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public class j {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f688b = AtomicIntegerFieldUpdater.newUpdater(j.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f689a;

    public j(Throwable th, boolean z2) {
        this.f689a = th;
        this._handled = z2 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f689a + ']';
    }
}
