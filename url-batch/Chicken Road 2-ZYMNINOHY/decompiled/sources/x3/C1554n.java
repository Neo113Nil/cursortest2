package x3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: x3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1554n {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f16047b = AtomicIntegerFieldUpdater.newUpdater(C1554n.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f16048a;

    public C1554n(Throwable th, boolean z) {
        this.f16048a = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f16048a + ']';
    }
}
