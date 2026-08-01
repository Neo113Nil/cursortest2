package o1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: o1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286e extends C0291j {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3338c = AtomicIntegerFieldUpdater.newUpdater(C0286e.class, "_resumed");
    private volatile int _resumed;

    public C0286e(C0285d c0285d, Throwable th, boolean z2) {
        super(th, z2);
        this._resumed = 0;
    }
}
