package c;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: AsyncTimeout.java */
/* loaded from: classes.dex */
public class a extends s {

    /* renamed from: b, reason: collision with root package name */
    static a f2176b;
    private boolean e;
    private a f;
    private long g;

    /* renamed from: a, reason: collision with root package name */
    private static final long f2175a = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: d, reason: collision with root package name */
    private static final long f2177d = TimeUnit.MILLISECONDS.toNanos(f2175a);

    protected void a() {
    }

    public final void c() {
        if (this.e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long e_ = e_();
        boolean f_ = f_();
        if (e_ != 0 || f_) {
            this.e = true;
            a(this, e_, f_);
        }
    }

    private static synchronized void a(a aVar, long j, boolean z) {
        synchronized (a.class) {
            if (f2176b == null) {
                f2176b = new a();
                new C0018a().start();
            }
            long nanoTime = System.nanoTime();
            if (j != 0 && z) {
                aVar.g = Math.min(j, aVar.d() - nanoTime) + nanoTime;
            } else if (j != 0) {
                aVar.g = j + nanoTime;
            } else if (z) {
                aVar.g = aVar.d();
            } else {
                throw new AssertionError();
            }
            long b2 = aVar.b(nanoTime);
            a aVar2 = f2176b;
            while (aVar2.f != null && b2 >= aVar2.f.b(nanoTime)) {
                aVar2 = aVar2.f;
            }
            aVar.f = aVar2.f;
            aVar2.f = aVar;
            if (aVar2 == f2176b) {
                a.class.notify();
            }
        }
    }

    public final boolean d_() {
        if (!this.e) {
            return false;
        }
        this.e = false;
        return a(this);
    }

    private static synchronized boolean a(a aVar) {
        synchronized (a.class) {
            for (a aVar2 = f2176b; aVar2 != null; aVar2 = aVar2.f) {
                if (aVar2.f == aVar) {
                    aVar2.f = aVar.f;
                    aVar.f = null;
                    return false;
                }
            }
            return true;
        }
    }

    private long b(long j) {
        return this.g - j;
    }

    public final q a(final q qVar) {
        return new q() { // from class: c.a.1
            @Override // c.q
            public void a_(c cVar, long j) throws IOException {
                t.a(cVar.f2186b, 0L, j);
                while (true) {
                    long j2 = 0;
                    if (j <= 0) {
                        return;
                    }
                    n nVar = cVar.f2185a;
                    while (true) {
                        if (j2 >= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                            break;
                        }
                        j2 += cVar.f2185a.f2218c - cVar.f2185a.f2217b;
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        }
                        nVar = nVar.f;
                    }
                    a.this.c();
                    try {
                        try {
                            qVar.a_(cVar, j2);
                            j -= j2;
                            a.this.a(true);
                        } catch (IOException e) {
                            throw a.this.b(e);
                        }
                    } catch (Throwable th) {
                        a.this.a(false);
                        throw th;
                    }
                }
            }

            @Override // c.q, java.io.Flushable
            public void flush() throws IOException {
                a.this.c();
                try {
                    try {
                        qVar.flush();
                        a.this.a(true);
                    } catch (IOException e) {
                        throw a.this.b(e);
                    }
                } catch (Throwable th) {
                    a.this.a(false);
                    throw th;
                }
            }

            @Override // c.q, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                a.this.c();
                try {
                    try {
                        qVar.close();
                        a.this.a(true);
                    } catch (IOException e) {
                        throw a.this.b(e);
                    }
                } catch (Throwable th) {
                    a.this.a(false);
                    throw th;
                }
            }

            @Override // c.q
            public s a() {
                return a.this;
            }

            public String toString() {
                return "AsyncTimeout.sink(" + qVar + ")";
            }
        };
    }

    public final r a(final r rVar) {
        return new r() { // from class: c.a.2
            @Override // c.r
            public long a(c cVar, long j) throws IOException {
                a.this.c();
                try {
                    try {
                        long a2 = rVar.a(cVar, j);
                        a.this.a(true);
                        return a2;
                    } catch (IOException e) {
                        throw a.this.b(e);
                    }
                } catch (Throwable th) {
                    a.this.a(false);
                    throw th;
                }
            }

            @Override // c.r, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                try {
                    try {
                        rVar.close();
                        a.this.a(true);
                    } catch (IOException e) {
                        throw a.this.b(e);
                    }
                } catch (Throwable th) {
                    a.this.a(false);
                    throw th;
                }
            }

            @Override // c.r
            public s a() {
                return a.this;
            }

            public String toString() {
                return "AsyncTimeout.source(" + rVar + ")";
            }
        };
    }

    final void a(boolean z) throws IOException {
        if (d_() && z) {
            throw a((IOException) null);
        }
    }

    final IOException b(IOException iOException) throws IOException {
        return !d_() ? iOException : a(iOException);
    }

    protected IOException a(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* compiled from: AsyncTimeout.java */
    /* renamed from: c.a$a, reason: collision with other inner class name */
    private static final class C0018a extends Thread {
        public C0018a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0015, code lost:
        
            r1.a();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            while (true) {
                synchronized (a.class) {
                    a e = a.e();
                    if (e != null) {
                        if (e == a.f2176b) {
                            a.f2176b = null;
                            return;
                        }
                    }
                }
            }
        }
    }

    static a e() throws InterruptedException {
        a aVar = f2176b.f;
        if (aVar == null) {
            long nanoTime = System.nanoTime();
            a.class.wait(f2175a);
            if (f2176b.f != null || System.nanoTime() - nanoTime < f2177d) {
                return null;
            }
            return f2176b;
        }
        long b2 = aVar.b(System.nanoTime());
        if (b2 > 0) {
            long j = b2 / 1000000;
            a.class.wait(j, (int) (b2 - (1000000 * j)));
            return null;
        }
        f2176b.f = aVar.f;
        aVar.f = null;
        return aVar;
    }
}
