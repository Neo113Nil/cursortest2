package D4;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: D4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0008h extends C0016p {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f515c = AtomicIntegerFieldUpdater.newUpdater(C0008h.class, "_resumed");
    private volatile int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0008h(C0007g c0007g, Throwable th, boolean z) {
        super(th, z);
        if (th == null) {
            th = new CancellationException("Continuation " + c0007g + " was cancelled normally");
        }
        this._resumed = 0;
    }
}
