package m6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public class y {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f19364b = AtomicIntegerFieldUpdater.newUpdater(y.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f19365a;

    public y(Throwable th, boolean z6) {
        this.f19365a = th;
        this._handled = z6 ? 1 : 0;
    }

    public /* synthetic */ y(Throwable th, boolean z6, int i7, kotlin.jvm.internal.e eVar) {
        this(th, (i7 & 2) != 0 ? false : z6);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean a() {
        return this._handled;
    }

    public final boolean b() {
        return f19364b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return q0.a(this) + '[' + this.f19365a + ']';
    }
}
