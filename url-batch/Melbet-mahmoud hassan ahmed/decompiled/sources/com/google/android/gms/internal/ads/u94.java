package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.v94;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

@SuppressLint({"HandlerLeak"})
/* loaded from: classes.dex */
final class u94<T extends v94> extends Handler implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final T f12713f;

    /* renamed from: g, reason: collision with root package name */
    private final long f12714g;

    /* renamed from: h, reason: collision with root package name */
    private r94<T> f12715h;

    /* renamed from: i, reason: collision with root package name */
    private IOException f12716i;

    /* renamed from: j, reason: collision with root package name */
    private int f12717j;

    /* renamed from: k, reason: collision with root package name */
    private Thread f12718k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f12719l;

    /* renamed from: m, reason: collision with root package name */
    private volatile boolean f12720m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ aa4 f12721n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u94(aa4 aa4Var, Looper looper, T t6, r94<T> r94Var, int i7, long j7) {
        super(looper);
        this.f12721n = aa4Var;
        this.f12713f = t6;
        this.f12715h = r94Var;
        this.f12714g = j7;
    }

    private final void d() {
        ExecutorService executorService;
        u94 u94Var;
        this.f12716i = null;
        executorService = this.f12721n.f2705a;
        u94Var = this.f12721n.f2706b;
        Objects.requireNonNull(u94Var);
        executorService.execute(u94Var);
    }

    public final void a(boolean z6) {
        this.f12720m = z6;
        this.f12716i = null;
        if (hasMessages(0)) {
            this.f12719l = true;
            removeMessages(0);
            if (!z6) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.f12719l = true;
                this.f12713f.f();
                Thread thread = this.f12718k;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z6) {
            this.f12721n.f2706b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            r94<T> r94Var = this.f12715h;
            Objects.requireNonNull(r94Var);
            r94Var.k(this.f12713f, elapsedRealtime, elapsedRealtime - this.f12714g, true);
            this.f12715h = null;
        }
    }

    public final void b(int i7) {
        IOException iOException = this.f12716i;
        if (iOException != null && this.f12717j > i7) {
            throw iOException;
        }
    }

    public final void c(long j7) {
        u94 u94Var;
        u94Var = this.f12721n.f2706b;
        wu1.f(u94Var == null);
        this.f12721n.f2706b = this;
        if (j7 > 0) {
            sendEmptyMessageDelayed(0, j7);
        } else {
            d();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i7;
        int i8;
        int i9;
        long j7;
        if (this.f12720m) {
            return;
        }
        int i10 = message.what;
        if (i10 == 0) {
            d();
            return;
        }
        if (i10 == 3) {
            throw ((Error) message.obj);
        }
        this.f12721n.f2706b = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j8 = elapsedRealtime - this.f12714g;
        r94<T> r94Var = this.f12715h;
        Objects.requireNonNull(r94Var);
        if (this.f12719l) {
            r94Var.k(this.f12713f, elapsedRealtime, j8, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 1) {
            try {
                r94Var.h(this.f12713f, elapsedRealtime, j8);
                return;
            } catch (RuntimeException e7) {
                oc2.a("LoadTask", "Unexpected exception handling load completed", e7);
                this.f12721n.f2707c = new z94(e7);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f12716i = iOException;
        int i12 = this.f12717j + 1;
        this.f12717j = i12;
        t94 m7 = r94Var.m(this.f12713f, elapsedRealtime, j8, iOException, i12);
        i7 = m7.f12148a;
        if (i7 == 3) {
            this.f12721n.f2707c = this.f12716i;
            return;
        }
        i8 = m7.f12148a;
        if (i8 != 2) {
            i9 = m7.f12148a;
            if (i9 == 1) {
                this.f12717j = 1;
            }
            j7 = m7.f12149b;
            c(j7 != -9223372036854775807L ? m7.f12149b : Math.min((this.f12717j - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        z94 z94Var;
        Message obtainMessage;
        boolean z6;
        try {
            synchronized (this) {
                z6 = !this.f12719l;
                this.f12718k = Thread.currentThread();
            }
            if (z6) {
                String simpleName = this.f12713f.getClass().getSimpleName();
                lz2.a(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                try {
                    this.f12713f.h();
                    lz2.b();
                } catch (Throwable th) {
                    lz2.b();
                    throw th;
                }
            }
            synchronized (this) {
                this.f12718k = null;
                Thread.interrupted();
            }
            if (this.f12720m) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e7) {
            if (this.f12720m) {
                return;
            }
            obtainMessage = obtainMessage(2, e7);
            obtainMessage.sendToTarget();
        } catch (Error e8) {
            if (!this.f12720m) {
                oc2.a("LoadTask", "Unexpected error loading stream", e8);
                obtainMessage(3, e8).sendToTarget();
            }
            throw e8;
        } catch (Exception e9) {
            if (this.f12720m) {
                return;
            }
            oc2.a("LoadTask", "Unexpected exception loading stream", e9);
            z94Var = new z94(e9);
            obtainMessage = obtainMessage(2, z94Var);
            obtainMessage.sendToTarget();
        } catch (OutOfMemoryError e10) {
            if (this.f12720m) {
                return;
            }
            oc2.a("LoadTask", "OutOfMemory error loading stream", e10);
            z94Var = new z94(e10);
            obtainMessage = obtainMessage(2, z94Var);
            obtainMessage.sendToTarget();
        }
    }
}
