package W4;

import d5.C0333c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class x implements AutoCloseable, c4.t {

    /* renamed from: j, reason: collision with root package name */
    public static final Logger f2849j = Logger.getLogger(x.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public final v f2851g;

    /* renamed from: h, reason: collision with root package name */
    public final C0333c f2852h;

    /* renamed from: f, reason: collision with root package name */
    public final Q4.n f2850f = new Q4.n(f2849j);

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f2853i = new AtomicBoolean(false);

    public x(v vVar, C0333c c0333c) {
        this.f2851g = vVar;
        this.f2852h = c0333c;
    }

    @Override // java.lang.AutoCloseable, c4.t
    public final void close() {
        if (this.f2853i.compareAndSet(false, true)) {
            v vVar = this.f2851g;
            C0333c c0333c = this.f2852h;
            synchronized (vVar.f2836a) {
                vVar.f2837b.remove(c0333c);
            }
            return;
        }
        this.f2850f.a(Level.WARNING, this.f2852h + " has called close() multiple times.", null);
    }

    public final String toString() {
        return "SdkObservableInstrument{callback=" + this.f2852h + "}";
    }
}
