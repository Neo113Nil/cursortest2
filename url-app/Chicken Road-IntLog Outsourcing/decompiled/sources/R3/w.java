package R3;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class w implements AutoCloseable, X2.t {

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f2669e = Logger.getLogger(w.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public final u f2671b;

    /* renamed from: c, reason: collision with root package name */
    public final Y3.c f2672c;

    /* renamed from: a, reason: collision with root package name */
    public final L3.n f2670a = new L3.n(f2669e);

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f2673d = new AtomicBoolean(false);

    public w(u uVar, Y3.c cVar) {
        this.f2671b = uVar;
        this.f2672c = cVar;
    }

    @Override // java.lang.AutoCloseable, X2.t
    public final void close() {
        if (this.f2673d.compareAndSet(false, true)) {
            u uVar = this.f2671b;
            Y3.c cVar = this.f2672c;
            synchronized (uVar.f2656a) {
                uVar.f2657b.remove(cVar);
            }
            return;
        }
        this.f2670a.a(Level.WARNING, this.f2672c + " has called close() multiple times.", null);
    }

    public final String toString() {
        return "SdkObservableInstrument{callback=" + this.f2672c + "}";
    }
}
