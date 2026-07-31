package n2;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class h0 implements i0 {

    /* renamed from: d, reason: collision with root package name */
    public static final c f19434d = h(false, -9223372036854775807L);

    /* renamed from: e, reason: collision with root package name */
    public static final c f19435e = h(true, -9223372036854775807L);

    /* renamed from: f, reason: collision with root package name */
    public static final c f19436f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f19437g;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f19438a;

    /* renamed from: b, reason: collision with root package name */
    private d<? extends e> f19439b;

    /* renamed from: c, reason: collision with root package name */
    private IOException f19440c;

    public interface b<T extends e> {
        void l(T t6, long j7, long j8);

        void m(T t6, long j7, long j8, boolean z6);

        c o(T t6, long j7, long j8, IOException iOException, int i7);
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final int f19441a;

        /* renamed from: b, reason: collision with root package name */
        private final long f19442b;

        private c(int i7, long j7) {
            this.f19441a = i7;
            this.f19442b = j7;
        }

        public boolean c() {
            int i7 = this.f19441a;
            return i7 == 0 || i7 == 1;
        }
    }

    @SuppressLint({"HandlerLeak"})
    private final class d<T extends e> extends Handler implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        public final int f19443f;

        /* renamed from: g, reason: collision with root package name */
        private final T f19444g;

        /* renamed from: h, reason: collision with root package name */
        private final long f19445h;

        /* renamed from: i, reason: collision with root package name */
        private b<T> f19446i;

        /* renamed from: j, reason: collision with root package name */
        private IOException f19447j;

        /* renamed from: k, reason: collision with root package name */
        private int f19448k;

        /* renamed from: l, reason: collision with root package name */
        private Thread f19449l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f19450m;

        /* renamed from: n, reason: collision with root package name */
        private volatile boolean f19451n;

        public d(Looper looper, T t6, b<T> bVar, int i7, long j7) {
            super(looper);
            this.f19444g = t6;
            this.f19446i = bVar;
            this.f19443f = i7;
            this.f19445h = j7;
        }

        private void b() {
            this.f19447j = null;
            h0.this.f19438a.execute((Runnable) o2.a.e(h0.this.f19439b));
        }

        private void c() {
            h0.this.f19439b = null;
        }

        private long d() {
            return Math.min((this.f19448k - 1) * 1000, 5000);
        }

        public void a(boolean z6) {
            this.f19451n = z6;
            this.f19447j = null;
            if (hasMessages(0)) {
                this.f19450m = true;
                removeMessages(0);
                if (!z6) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f19450m = true;
                    this.f19444g.c();
                    Thread thread = this.f19449l;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z6) {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((b) o2.a.e(this.f19446i)).m(this.f19444g, elapsedRealtime, elapsedRealtime - this.f19445h, true);
                this.f19446i = null;
            }
        }

        public void e(int i7) {
            IOException iOException = this.f19447j;
            if (iOException != null && this.f19448k > i7) {
                throw iOException;
            }
        }

        public void f(long j7) {
            o2.a.f(h0.this.f19439b == null);
            h0.this.f19439b = this;
            if (j7 > 0) {
                sendEmptyMessageDelayed(0, j7);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f19451n) {
                return;
            }
            int i7 = message.what;
            if (i7 == 0) {
                b();
                return;
            }
            if (i7 == 3) {
                throw ((Error) message.obj);
            }
            c();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j7 = elapsedRealtime - this.f19445h;
            b bVar = (b) o2.a.e(this.f19446i);
            if (this.f19450m) {
                bVar.m(this.f19444g, elapsedRealtime, j7, false);
                return;
            }
            int i8 = message.what;
            if (i8 == 1) {
                try {
                    bVar.l(this.f19444g, elapsedRealtime, j7);
                    return;
                } catch (RuntimeException e7) {
                    o2.r.d("LoadTask", "Unexpected exception handling load completed", e7);
                    h0.this.f19440c = new h(e7);
                    return;
                }
            }
            if (i8 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f19447j = iOException;
            int i9 = this.f19448k + 1;
            this.f19448k = i9;
            c o7 = bVar.o(this.f19444g, elapsedRealtime, j7, iOException, i9);
            if (o7.f19441a == 3) {
                h0.this.f19440c = this.f19447j;
            } else if (o7.f19441a != 2) {
                if (o7.f19441a == 1) {
                    this.f19448k = 1;
                }
                f(o7.f19442b != -9223372036854775807L ? o7.f19442b : d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar;
            Message obtainMessage;
            boolean z6;
            try {
                synchronized (this) {
                    z6 = !this.f19450m;
                    this.f19449l = Thread.currentThread();
                }
                if (z6) {
                    o2.j0.a("load:" + this.f19444g.getClass().getSimpleName());
                    try {
                        this.f19444g.a();
                        o2.j0.c();
                    } catch (Throwable th) {
                        o2.j0.c();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f19449l = null;
                    Thread.interrupted();
                }
                if (this.f19451n) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e7) {
                if (this.f19451n) {
                    return;
                }
                obtainMessage = obtainMessage(2, e7);
                obtainMessage.sendToTarget();
            } catch (Error e8) {
                if (!this.f19451n) {
                    o2.r.d("LoadTask", "Unexpected error loading stream", e8);
                    obtainMessage(3, e8).sendToTarget();
                }
                throw e8;
            } catch (Exception e9) {
                if (this.f19451n) {
                    return;
                }
                o2.r.d("LoadTask", "Unexpected exception loading stream", e9);
                hVar = new h(e9);
                obtainMessage = obtainMessage(2, hVar);
                obtainMessage.sendToTarget();
            } catch (OutOfMemoryError e10) {
                if (this.f19451n) {
                    return;
                }
                o2.r.d("LoadTask", "OutOfMemory error loading stream", e10);
                hVar = new h(e10);
                obtainMessage = obtainMessage(2, hVar);
                obtainMessage.sendToTarget();
            }
        }
    }

    public interface e {
        void a();

        void c();
    }

    public interface f {
        void k();
    }

    private static final class g implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        private final f f19453f;

        public g(f fVar) {
            this.f19453f = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f19453f.k();
        }
    }

    public static final class h extends IOException {
        public h(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    static {
        long j7 = -9223372036854775807L;
        f19436f = new c(2, j7);
        f19437g = new c(3, j7);
    }

    public h0(String str) {
        this.f19438a = o2.m0.C0("ExoPlayer:Loader:" + str);
    }

    public static c h(boolean z6, long j7) {
        return new c(z6 ? 1 : 0, j7);
    }

    @Override // n2.i0
    public void b() {
        k(Integer.MIN_VALUE);
    }

    public void f() {
        ((d) o2.a.h(this.f19439b)).a(false);
    }

    public void g() {
        this.f19440c = null;
    }

    public boolean i() {
        return this.f19440c != null;
    }

    public boolean j() {
        return this.f19439b != null;
    }

    public void k(int i7) {
        IOException iOException = this.f19440c;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.f19439b;
        if (dVar != null) {
            if (i7 == Integer.MIN_VALUE) {
                i7 = dVar.f19443f;
            }
            dVar.e(i7);
        }
    }

    public void l() {
        m(null);
    }

    public void m(f fVar) {
        d<? extends e> dVar = this.f19439b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f19438a.execute(new g(fVar));
        }
        this.f19438a.shutdown();
    }

    public <T extends e> long n(T t6, b<T> bVar, int i7) {
        Looper looper = (Looper) o2.a.h(Looper.myLooper());
        this.f19440c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, t6, bVar, i7, elapsedRealtime).f(0L);
        return elapsedRealtime;
    }
}
