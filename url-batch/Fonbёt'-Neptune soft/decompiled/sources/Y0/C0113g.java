package Y0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: Y0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113g extends C0120n {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1206c = AtomicIntegerFieldUpdater.newUpdater(C0113g.class, "_resumed");
    private volatile int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0113g(C0112f c0112f, Throwable th, boolean z2) {
        super(th, z2);
        if (th == null) {
            th = new CancellationException("Continuation " + c0112f + " was cancelled normally");
        }
        this._resumed = 0;
    }
}
