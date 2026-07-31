package q2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: q2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0829p {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7916b = AtomicIntegerFieldUpdater.newUpdater(C0829p.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f7917a;

    public C0829p(Throwable th, boolean z3) {
        this.f7917a = th;
        this._handled$volatile = z3 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f7917a + ']';
    }
}
