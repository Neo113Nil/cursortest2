package H5;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: H5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0148h extends C0156p {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1082c = AtomicIntegerFieldUpdater.newUpdater(C0148h.class, "_resumed");
    private volatile int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0148h(C0147g c0147g, Throwable th, boolean z5) {
        super(th, z5);
        if (th == null) {
            th = new CancellationException("Continuation " + c0147g + " was cancelled normally");
        }
        this._resumed = 0;
    }
}
