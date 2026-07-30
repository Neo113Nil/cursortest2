package D5;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class y implements AutoCloseable, J4.t {

    /* renamed from: m, reason: collision with root package name */
    public static final Logger f407m = Logger.getLogger(y.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public final u f409e;

    /* renamed from: i, reason: collision with root package name */
    public final K5.c f410i;

    /* renamed from: d, reason: collision with root package name */
    public final x5.n f408d = new x5.n(f407m);

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f411l = new AtomicBoolean(false);

    public y(u uVar, K5.c cVar) {
        this.f409e = uVar;
        this.f410i = cVar;
    }

    @Override // java.lang.AutoCloseable, J4.t
    public final void close() {
        if (this.f411l.compareAndSet(false, true)) {
            u uVar = this.f409e;
            K5.c cVar = this.f410i;
            synchronized (uVar.f390a) {
                uVar.f391b.remove(cVar);
            }
            return;
        }
        this.f408d.a(Level.WARNING, this.f410i + " has called close() multiple times.", null);
    }

    public final String toString() {
        return "SdkObservableInstrument{callback=" + this.f410i + "}";
    }
}
