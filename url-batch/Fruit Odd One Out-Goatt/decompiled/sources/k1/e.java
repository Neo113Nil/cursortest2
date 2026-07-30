package k1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class e extends j {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f676c = AtomicIntegerFieldUpdater.newUpdater(e.class, "_resumed");
    private volatile int _resumed;

    public e(d dVar, Throwable th, boolean z2) {
        super(th, z2);
        this._resumed = 0;
    }
}
