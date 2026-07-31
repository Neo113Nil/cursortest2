package m6;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class o extends y {

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f19316c = AtomicIntegerFieldUpdater.newUpdater(o.class, "_resumed");
    private volatile /* synthetic */ int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o(y5.d<?> dVar, Throwable th, boolean z6) {
        super(th, z6);
        if (th == null) {
            th = new CancellationException("Continuation " + dVar + " was cancelled normally");
        }
        this._resumed = 0;
    }

    public final boolean c() {
        return f19316c.compareAndSet(this, 0, 1);
    }
}
