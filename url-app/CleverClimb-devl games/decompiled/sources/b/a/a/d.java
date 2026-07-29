package b.a.a;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* compiled from: DiskLruCache.java */
/* loaded from: classes.dex */
public final class d implements Closeable, Flushable {

    /* renamed from: b, reason: collision with root package name */
    final b.a.f.a f1820b;

    /* renamed from: c, reason: collision with root package name */
    final int f1821c;

    /* renamed from: d, reason: collision with root package name */
    c.d f1822d;
    final LinkedHashMap<String, b> e;
    int f;
    boolean g;
    boolean h;
    boolean i;
    private long k;
    private long l;
    private long m;
    private final Executor n;
    private final Runnable o;
    static final /* synthetic */ boolean j = !d.class.desiredAssertionStatus();

    /* renamed from: a, reason: collision with root package name */
    static final Pattern f1819a = Pattern.compile("[a-z0-9_-]{1,120}");

    synchronized void a(a aVar, boolean z) throws IOException {
        b bVar = aVar.f1823a;
        if (bVar.f != aVar) {
            throw new IllegalStateException();
        }
        if (z && !bVar.e) {
            for (int i = 0; i < this.f1821c; i++) {
                if (!aVar.f1824b[i]) {
                    aVar.b();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!this.f1820b.b(bVar.f1830d[i])) {
                    aVar.b();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.f1821c; i2++) {
            File file = bVar.f1830d[i2];
            if (z) {
                if (this.f1820b.b(file)) {
                    File file2 = bVar.f1829c[i2];
                    this.f1820b.a(file, file2);
                    long j2 = bVar.f1828b[i2];
                    long c2 = this.f1820b.c(file2);
                    bVar.f1828b[i2] = c2;
                    this.l = (this.l - j2) + c2;
                }
            } else {
                this.f1820b.a(file);
            }
        }
        this.f++;
        bVar.f = null;
        if (bVar.e | z) {
            bVar.e = true;
            this.f1822d.b("CLEAN").i(32);
            this.f1822d.b(bVar.f1827a);
            bVar.a(this.f1822d);
            this.f1822d.i(10);
            if (z) {
                long j3 = this.m;
                this.m = 1 + j3;
                bVar.g = j3;
            }
        } else {
            this.e.remove(bVar.f1827a);
            this.f1822d.b("REMOVE").i(32);
            this.f1822d.b(bVar.f1827a);
            this.f1822d.i(10);
        }
        this.f1822d.flush();
        if (this.l > this.k || a()) {
            this.n.execute(this.o);
        }
    }

    boolean a() {
        return this.f >= 2000 && this.f >= this.e.size();
    }

    boolean a(b bVar) throws IOException {
        if (bVar.f != null) {
            bVar.f.a();
        }
        for (int i = 0; i < this.f1821c; i++) {
            this.f1820b.a(bVar.f1829c[i]);
            this.l -= bVar.f1828b[i];
            bVar.f1828b[i] = 0;
        }
        this.f++;
        this.f1822d.b("REMOVE").i(32).b(bVar.f1827a).i(10);
        this.e.remove(bVar.f1827a);
        if (a()) {
            this.n.execute(this.o);
        }
        return true;
    }

    public synchronized boolean b() {
        return this.h;
    }

    private synchronized void d() {
        if (b()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.g) {
            d();
            c();
            this.f1822d.flush();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.g && !this.h) {
            for (b bVar : (b[]) this.e.values().toArray(new b[this.e.size()])) {
                if (bVar.f != null) {
                    bVar.f.b();
                }
            }
            c();
            this.f1822d.close();
            this.f1822d = null;
            this.h = true;
            return;
        }
        this.h = true;
    }

    void c() throws IOException {
        while (this.l > this.k) {
            a(this.e.values().iterator().next());
        }
        this.i = false;
    }

    /* compiled from: DiskLruCache.java */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        final b f1823a;

        /* renamed from: b, reason: collision with root package name */
        final boolean[] f1824b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f1825c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f1826d;

        void a() {
            if (this.f1823a.f == this) {
                for (int i = 0; i < this.f1825c.f1821c; i++) {
                    try {
                        this.f1825c.f1820b.a(this.f1823a.f1830d[i]);
                    } catch (IOException unused) {
                    }
                }
                this.f1823a.f = null;
            }
        }

        public void b() throws IOException {
            synchronized (this.f1825c) {
                if (this.f1826d) {
                    throw new IllegalStateException();
                }
                if (this.f1823a.f == this) {
                    this.f1825c.a(this, false);
                }
                this.f1826d = true;
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    private final class b {

        /* renamed from: a, reason: collision with root package name */
        final String f1827a;

        /* renamed from: b, reason: collision with root package name */
        final long[] f1828b;

        /* renamed from: c, reason: collision with root package name */
        final File[] f1829c;

        /* renamed from: d, reason: collision with root package name */
        final File[] f1830d;
        boolean e;
        a f;
        long g;

        void a(c.d dVar) throws IOException {
            for (long j : this.f1828b) {
                dVar.i(32).l(j);
            }
        }
    }
}
