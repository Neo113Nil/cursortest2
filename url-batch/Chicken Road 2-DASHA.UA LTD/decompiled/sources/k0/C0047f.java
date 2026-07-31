package k0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: k0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0047f extends C0052k {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f864c = AtomicIntegerFieldUpdater.newUpdater(C0047f.class, "_resumed");
    private volatile int _resumed;

    public C0047f(C0046e c0046e, Throwable th, boolean z2) {
        super(th, z2);
        this._resumed = 0;
    }
}
