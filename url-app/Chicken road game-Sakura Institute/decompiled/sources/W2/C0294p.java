package W2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: W2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0294p {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4290b = AtomicIntegerFieldUpdater.newUpdater(C0294p.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f4291a;

    public C0294p(Throwable th, boolean z4) {
        this.f4291a = th;
        this._handled$volatile = z4 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f4291a + ']';
    }
}
