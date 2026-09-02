package H5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: H5.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0156p {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1092b = AtomicIntegerFieldUpdater.newUpdater(C0156p.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f1093a;

    public C0156p(Throwable th, boolean z5) {
        this.f1093a = th;
        this._handled = z5 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f1093a + ']';
    }
}
