package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class pr0 {

    /* renamed from: d, reason: collision with root package name */
    public static final b f30536d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f30537e;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f30538a;

    /* renamed from: b, reason: collision with root package name */
    private c<? extends d> f30539b;

    /* renamed from: c, reason: collision with root package name */
    private IOException f30540c;

    public interface a<T extends d> {
        b a(T t4, long j4, long j5, IOException iOException, int i4);

        void a(T t4, long j4, long j5);

        void a(T t4, long j4, long j5, boolean z4);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f30541a;

        /* renamed from: b, reason: collision with root package name */
        private final long f30542b;

        private b(int i4, long j4) {
            this.f30541a = i4;
            this.f30542b = j4;
        }

        public final boolean a() {
            int i4 = this.f30541a;
            return i4 == 0 || i4 == 1;
        }
    }

    @SuppressLint({"HandlerLeak"})
    private final class c<T extends d> extends Handler implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final int f30543b;

        /* renamed from: c, reason: collision with root package name */
        private final T f30544c;

        /* renamed from: d, reason: collision with root package name */
        private final long f30545d;

        /* renamed from: e, reason: collision with root package name */
        private a<T> f30546e;

        /* renamed from: f, reason: collision with root package name */
        private IOException f30547f;

        /* renamed from: g, reason: collision with root package name */
        private int f30548g;

        /* renamed from: h, reason: collision with root package name */
        private Thread f30549h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f30550i;

        /* renamed from: j, reason: collision with root package name */
        private volatile boolean f30551j;

        public c(Looper looper, T t4, a<T> aVar, int i4, long j4) {
            super(looper);
            this.f30544c = t4;
            this.f30546e = aVar;
            this.f30543b = i4;
            this.f30545d = j4;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.f30551j) {
                return;
            }
            int i4 = message.what;
            if (i4 == 0) {
                this.f30547f = null;
                pr0 pr0Var = pr0.this;
                ExecutorService executorService = pr0Var.f30538a;
                c cVar = pr0Var.f30539b;
                cVar.getClass();
                executorService.execute(cVar);
                return;
            }
            if (i4 == 3) {
                throw ((Error) message.obj);
            }
            pr0.this.f30539b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j4 = elapsedRealtime - this.f30545d;
            a<T> aVar = this.f30546e;
            aVar.getClass();
            if (this.f30550i) {
                aVar.a(this.f30544c, elapsedRealtime, j4, false);
                return;
            }
            int i5 = message.what;
            if (i5 == 1) {
                try {
                    aVar.a(this.f30544c, elapsedRealtime, j4);
                    return;
                } catch (RuntimeException e4) {
                    ms0.a("LoadTask", "Unexpected exception handling load completed", e4);
                    pr0.this.f30540c = new g(e4);
                    return;
                }
            }
            if (i5 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f30547f = iOException;
            int i6 = this.f30548g + 1;
            this.f30548g = i6;
            b a4 = aVar.a(this.f30544c, elapsedRealtime, j4, iOException, i6);
            int i7 = a4.f30541a;
            if (i7 == 3) {
                pr0.this.f30540c = this.f30547f;
                return;
            }
            if (i7 != 2) {
                if (i7 == 1) {
                    this.f30548g = 1;
                }
                long j5 = a4.f30542b;
                if (j5 == -9223372036854775807L) {
                    j5 = Math.min((this.f30548g - 1) * 1000, 5000);
                }
                pr0 pr0Var2 = pr0.this;
                if (pr0Var2.f30539b != null) {
                    throw new IllegalStateException();
                }
                pr0Var2.f30539b = this;
                if (j5 > 0) {
                    sendEmptyMessageDelayed(0, j5);
                } else {
                    this.f30547f = null;
                    pr0Var2.f30538a.execute(this);
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z4;
            try {
                synchronized (this) {
                    z4 = this.f30550i;
                    this.f30549h = Thread.currentThread();
                }
                if (!z4) {
                    j52.a("load:".concat(this.f30544c.getClass().getSimpleName()));
                    try {
                        this.f30544c.a();
                        j52.a();
                    } catch (Throwable th) {
                        j52.a();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f30549h = null;
                    Thread.interrupted();
                }
                if (this.f30551j) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e4) {
                if (this.f30551j) {
                    return;
                }
                obtainMessage(2, e4).sendToTarget();
            } catch (Exception e5) {
                if (this.f30551j) {
                    return;
                }
                ms0.a("LoadTask", "Unexpected exception loading stream", e5);
                obtainMessage(2, new g(e5)).sendToTarget();
            } catch (OutOfMemoryError e6) {
                if (this.f30551j) {
                    return;
                }
                ms0.a("LoadTask", "OutOfMemory error loading stream", e6);
                obtainMessage(2, new g(e6)).sendToTarget();
            } catch (Error e7) {
                if (!this.f30551j) {
                    ms0.a("LoadTask", "Unexpected error loading stream", e7);
                    obtainMessage(3, e7).sendToTarget();
                }
                throw e7;
            }
        }

        public final void a(boolean z4) {
            this.f30551j = z4;
            this.f30547f = null;
            if (hasMessages(0)) {
                this.f30550i = true;
                removeMessages(0);
                if (!z4) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f30550i = true;
                        this.f30544c.b();
                        Thread thread = this.f30549h;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z4) {
                pr0.this.f30539b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                a<T> aVar = this.f30546e;
                aVar.getClass();
                aVar.a(this.f30544c, elapsedRealtime, elapsedRealtime - this.f30545d, true);
                this.f30546e = null;
            }
        }
    }

    public interface d {
        void a();

        void b();
    }

    public interface e {
        void b();
    }

    private static final class f implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final e f30553b;

        public f(e eVar) {
            this.f30553b = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f30553b.b();
        }
    }

    public static final class g extends IOException {
        public g(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    static {
        long j4 = -9223372036854775807L;
        f30536d = new b(2, j4);
        f30537e = new b(3, j4);
    }

    public pr0(String str) {
        this.f30538a = u82.d("ExoPlayer:Loader:".concat(str));
    }

    public final void a() {
        c<? extends d> cVar = this.f30539b;
        if (cVar == null) {
            throw new IllegalStateException();
        }
        cVar.a(false);
    }

    public final void b() {
        this.f30540c = null;
    }

    public final boolean c() {
        return this.f30540c != null;
    }

    public final boolean d() {
        return this.f30539b != null;
    }

    public final void a(int i4) {
        IOException iOException = this.f30540c;
        if (iOException == null) {
            c<? extends d> cVar = this.f30539b;
            if (cVar != null) {
                if (i4 == Integer.MIN_VALUE) {
                    i4 = cVar.f30543b;
                }
                IOException iOException2 = ((c) cVar).f30547f;
                if (iOException2 != null && ((c) cVar).f30548g > i4) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void a(e eVar) {
        c<? extends d> cVar = this.f30539b;
        if (cVar != null) {
            cVar.a(true);
        }
        if (eVar != null) {
            this.f30538a.execute(new f(eVar));
        }
        this.f30538a.shutdown();
    }

    public static b a(long j4, boolean z4) {
        return new b(z4 ? 1 : 0, j4);
    }

    public final <T extends d> long a(T t4, a<T> aVar, int i4) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            this.f30540c = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c<? extends d> cVar = new c<>(myLooper, t4, aVar, i4, elapsedRealtime);
            if (this.f30539b == null) {
                this.f30539b = cVar;
                ((c) cVar).f30547f = null;
                this.f30538a.execute(cVar);
                return elapsedRealtime;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }
}
