package X4;

import B.f;
import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class a implements Iterable, Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final d f2857d;

    /* renamed from: e, reason: collision with root package name */
    public final f f2858e;

    /* renamed from: o, reason: collision with root package name */
    public e f2863o;

    /* renamed from: l, reason: collision with root package name */
    public final Logger f2860l = Logger.getLogger(a.class.getName());

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f2861m = new AtomicBoolean(false);

    /* renamed from: n, reason: collision with root package name */
    public final Object f2862n = new Object();

    /* renamed from: i, reason: collision with root package name */
    public final S4.b f2859i = S4.b.f2507a;

    public a(d dVar, f fVar) {
        this.f2857d = dVar;
        this.f2858e = fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2861m.compareAndSet(false, true)) {
            this.f2857d.close();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        e eVar;
        synchronized (this.f2862n) {
            try {
                if (this.f2863o == null) {
                    this.f2863o = new e(this.f2857d, this.f2859i);
                }
                eVar = this.f2863o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }
}
