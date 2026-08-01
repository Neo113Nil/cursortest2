package s1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: s1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0322e extends C0327j {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4041c = AtomicIntegerFieldUpdater.newUpdater(C0322e.class, "_resumed");
    private volatile int _resumed;

    public C0322e(C0321d c0321d, Throwable th, boolean z2) {
        super(th, z2);
        this._resumed = 0;
    }
}
