package q4;

import V5.g;
import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import l4.C0496b;

/* renamed from: q4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0600a implements Iterable, Closeable {

    /* renamed from: f, reason: collision with root package name */
    public final C0603d f5784f;

    /* renamed from: g, reason: collision with root package name */
    public final g f5785g;

    /* renamed from: l, reason: collision with root package name */
    public C0604e f5790l;

    /* renamed from: i, reason: collision with root package name */
    public final Logger f5787i = Logger.getLogger(C0600a.class.getName());

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f5788j = new AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    public final Object f5789k = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final C0496b f5786h = C0496b.f5291a;

    public C0600a(C0603d c0603d, g gVar) {
        this.f5784f = c0603d;
        this.f5785g = gVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5788j.compareAndSet(false, true)) {
            this.f5784f.close();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0604e c0604e;
        synchronized (this.f5789k) {
            try {
                if (this.f5790l == null) {
                    this.f5790l = new C0604e(this.f5784f, this.f5786h);
                }
                c0604e = this.f5790l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0604e;
    }
}
