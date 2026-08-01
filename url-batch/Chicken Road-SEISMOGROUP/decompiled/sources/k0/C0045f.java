package k0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: k0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0045f extends C0050k {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f917c = AtomicIntegerFieldUpdater.newUpdater(C0045f.class, "_resumed");
    private volatile int _resumed;

    public C0045f(C0044e c0044e, Throwable th, boolean z) {
        super(th, z);
        this._resumed = 0;
    }
}
