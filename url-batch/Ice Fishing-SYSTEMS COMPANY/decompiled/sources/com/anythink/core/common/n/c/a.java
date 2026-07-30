package com.anythink.core.common.n.c;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class a extends x {

    /* renamed from: a, reason: collision with root package name */
    private static final int f15989a = 65536;

    /* renamed from: b, reason: collision with root package name */
    static a f15990b;

    /* renamed from: d, reason: collision with root package name */
    private static final long f15991d;

    /* renamed from: e, reason: collision with root package name */
    private static final long f15992e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f15993f;

    /* renamed from: g, reason: collision with root package name */
    private a f15994g;

    /* renamed from: h, reason: collision with root package name */
    private long f15995h;

    /* renamed from: com.anythink.core.common.n.c.a$2, reason: invalid class name */
    public class AnonymousClass2 implements w {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f15998a;

        public AnonymousClass2(w wVar) {
            this.f15998a = wVar;
        }

        @Override // com.anythink.core.common.n.c.w
        public final x a() {
            return a.this;
        }

        @Override // com.anythink.core.common.n.c.w
        public final long a_(c cVar, long j9) {
            a.this.c();
            try {
                try {
                    long a_ = this.f15998a.a_(cVar, j9);
                    a.this.a(true);
                    return a_;
                } catch (IOException e6) {
                    throw a.this.b(e6);
                }
            } catch (Throwable th) {
                a.this.a(false);
                throw th;
            }
        }

        @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            a.this.c();
            try {
                try {
                    this.f15998a.close();
                    a.this.a(true);
                } catch (IOException e6) {
                    throw a.this.b(e6);
                }
            } catch (Throwable th) {
                a.this.a(false);
                throw th;
            }
        }

        public final String toString() {
            return "AsyncTimeout.source(" + this.f15998a + ")";
        }
    }

    /* renamed from: com.anythink.core.common.n.c.a$a, reason: collision with other inner class name */
    public static final class C0089a extends Thread {
        public C0089a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0017, code lost:
        
            r1.a();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            while (true) {
                synchronized (a.class) {
                    try {
                        a e6 = a.e();
                        if (e6 != null) {
                            if (e6 == a.f15990b) {
                                a.f15990b = null;
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f15991d = millis;
        f15992e = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    private long b(long j9) {
        return this.f15995h - j9;
    }

    public static a e() {
        a aVar = f15990b.f15994g;
        if (aVar == null) {
            long nanoTime = System.nanoTime();
            a.class.wait(f15991d);
            if (f15990b.f15994g != null || System.nanoTime() - nanoTime < f15992e) {
                return null;
            }
            return f15990b;
        }
        long nanoTime2 = aVar.f15995h - System.nanoTime();
        if (nanoTime2 > 0) {
            long j9 = nanoTime2 / 1000000;
            a.class.wait(j9, (int) (nanoTime2 - (1000000 * j9)));
            return null;
        }
        f15990b.f15994g = aVar.f15994g;
        aVar.f15994g = null;
        return aVar;
    }

    public void a() {
    }

    public final void c() {
        if (this.f15993f) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long i_ = i_();
        boolean f_ = f_();
        if (i_ != 0 || f_) {
            this.f15993f = true;
            a(this, i_, f_);
        }
    }

    public final boolean d() {
        if (!this.f15993f) {
            return false;
        }
        this.f15993f = false;
        return a(this);
    }

    private static synchronized void a(a aVar, long j9, boolean z8) {
        a aVar2;
        synchronized (a.class) {
            try {
                if (f15990b == null) {
                    f15990b = new a();
                    new C0089a().start();
                }
                long nanoTime = System.nanoTime();
                if (j9 != 0 && z8) {
                    aVar.f15995h = Math.min(j9, aVar.g_() - nanoTime) + nanoTime;
                } else if (j9 != 0) {
                    aVar.f15995h = j9 + nanoTime;
                } else {
                    if (!z8) {
                        throw new AssertionError();
                    }
                    aVar.f15995h = aVar.g_();
                }
                long j10 = aVar.f15995h - nanoTime;
                a aVar3 = f15990b;
                while (true) {
                    aVar2 = aVar3.f15994g;
                    if (aVar2 == null || j10 < aVar2.f15995h - nanoTime) {
                        break;
                    } else {
                        aVar3 = aVar2;
                    }
                }
                aVar.f15994g = aVar2;
                aVar3.f15994g = aVar;
                if (aVar3 == f15990b) {
                    a.class.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final IOException b(IOException iOException) {
        return !d() ? iOException : a(iOException);
    }

    /* renamed from: com.anythink.core.common.n.c.a$1, reason: invalid class name */
    public class AnonymousClass1 implements v {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v f15996a;

        public AnonymousClass1(v vVar) {
            this.f15996a = vVar;
        }

        @Override // com.anythink.core.common.n.c.v
        public final void a(c cVar, long j9) {
            y.a(cVar.f16005c, 0L, j9);
            while (true) {
                long j10 = 0;
                if (j9 <= 0) {
                    return;
                }
                s sVar = cVar.f16004b;
                while (true) {
                    if (j10 >= 65536) {
                        break;
                    }
                    j10 += sVar.f16074e - sVar.f16073d;
                    if (j10 >= j9) {
                        j10 = j9;
                        break;
                    }
                    sVar = sVar.f16077h;
                }
                a.this.c();
                try {
                    try {
                        this.f15996a.a(cVar, j10);
                        j9 -= j10;
                        a.this.a(true);
                    } catch (IOException e6) {
                        throw a.this.b(e6);
                    }
                } catch (Throwable th) {
                    a.this.a(false);
                    throw th;
                }
            }
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            a.this.c();
            try {
                try {
                    this.f15996a.close();
                    a.this.a(true);
                } catch (IOException e6) {
                    throw a.this.b(e6);
                }
            } catch (Throwable th) {
                a.this.a(false);
                throw th;
            }
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Flushable
        public final void flush() {
            a.this.c();
            try {
                try {
                    this.f15996a.flush();
                    a.this.a(true);
                } catch (IOException e6) {
                    throw a.this.b(e6);
                }
            } catch (Throwable th) {
                a.this.a(false);
                throw th;
            }
        }

        public final String toString() {
            return "AsyncTimeout.sink(" + this.f15996a + ")";
        }

        @Override // com.anythink.core.common.n.c.v
        public final x a() {
            return a.this;
        }
    }

    private static synchronized boolean a(a aVar) {
        synchronized (a.class) {
            a aVar2 = f15990b;
            while (aVar2 != null) {
                a aVar3 = aVar2.f15994g;
                if (aVar3 == aVar) {
                    aVar2.f15994g = aVar.f15994g;
                    aVar.f15994g = null;
                    return false;
                }
                aVar2 = aVar3;
            }
            return true;
        }
    }

    private v a(v vVar) {
        return new AnonymousClass1(vVar);
    }

    private w a(w wVar) {
        return new AnonymousClass2(wVar);
    }

    public final void a(boolean z8) {
        if (d() && z8) {
            throw a((IOException) null);
        }
    }

    public IOException a(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}
