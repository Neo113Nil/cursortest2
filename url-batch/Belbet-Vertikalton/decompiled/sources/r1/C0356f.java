package r1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: r1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0356f extends C0361k {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4072c = AtomicIntegerFieldUpdater.newUpdater(C0356f.class, "_resumed");
    private volatile int _resumed;

    public C0356f(C0355e c0355e, Throwable th, boolean z2) {
        super(th, z2);
        this._resumed = 0;
    }
}
