package t2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: t2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1204n {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10430b = AtomicIntegerFieldUpdater.newUpdater(C1204n.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f10431a;

    public C1204n(Throwable th, boolean z) {
        this.f10431a = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f10431a + ']';
    }
}
