package l3;

import V0.j;
import g3.C0455b;
import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* renamed from: l3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1255a implements Iterable, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final C1258d f11030a;

    /* renamed from: b, reason: collision with root package name */
    public final j f11031b;

    /* renamed from: c, reason: collision with root package name */
    public final C0455b f11032c;

    /* renamed from: d, reason: collision with root package name */
    public final Logger f11033d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f11034e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f11035f;

    /* renamed from: g, reason: collision with root package name */
    public C1259e f11036g;

    public C1255a(C1258d c1258d, j jVar) {
        C0455b c0455b = C0455b.f5738a;
        this.f11033d = Logger.getLogger(C1255a.class.getName());
        this.f11034e = new AtomicBoolean(false);
        this.f11035f = new Object();
        this.f11030a = c1258d;
        this.f11031b = jVar;
        this.f11032c = c0455b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f11034e.compareAndSet(false, true)) {
            this.f11030a.close();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1259e c1259e;
        synchronized (this.f11035f) {
            try {
                if (this.f11036g == null) {
                    this.f11036g = new C1259e(this.f11030a, this.f11032c);
                }
                c1259e = this.f11036g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1259e;
    }
}
