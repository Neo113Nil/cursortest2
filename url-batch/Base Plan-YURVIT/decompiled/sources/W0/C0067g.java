package W0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: W0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0067g extends C0074n {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f952c = AtomicIntegerFieldUpdater.newUpdater(C0067g.class, "_resumed");
    private volatile int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0067g(C0066f c0066f, Throwable th, boolean z2) {
        super(th, z2);
        if (th == null) {
            th = new CancellationException("Continuation " + c0066f + " was cancelled normally");
        }
        this._resumed = 0;
    }
}
