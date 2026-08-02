package u0;

import W.AbstractC0108a;
import a.AbstractC0124a;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.io.IOException;
import v0.ExecutorC1449a;

/* loaded from: classes.dex */
public final class j extends Handler implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final int f15471a;

    /* renamed from: b, reason: collision with root package name */
    public final k f15472b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15473c;

    /* renamed from: d, reason: collision with root package name */
    public i f15474d;

    /* renamed from: e, reason: collision with root package name */
    public IOException f15475e;

    /* renamed from: f, reason: collision with root package name */
    public int f15476f;

    /* renamed from: g, reason: collision with root package name */
    public Thread f15477g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15478h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f15479i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f15480j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, Looper looper, k kVar, i iVar, int i4, long j4) {
        super(looper);
        this.f15480j = nVar;
        this.f15472b = kVar;
        this.f15474d = iVar;
        this.f15471a = i4;
        this.f15473c = j4;
    }

    public final void a(boolean z) {
        this.f15479i = z;
        this.f15475e = null;
        if (hasMessages(1)) {
            this.f15478h = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f15478h = true;
                    this.f15472b.d();
                    Thread thread = this.f15477g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.f15480j.f15485b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            i iVar = this.f15474d;
            iVar.getClass();
            iVar.m(this.f15472b, elapsedRealtime, elapsedRealtime - this.f15473c, true);
            this.f15474d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = elapsedRealtime - this.f15473c;
        i iVar = this.f15474d;
        iVar.getClass();
        iVar.o(this.f15472b, elapsedRealtime, j4, this.f15476f);
        this.f15475e = null;
        n nVar = this.f15480j;
        ExecutorC1449a executorC1449a = nVar.f15484a;
        j jVar = nVar.f15485b;
        jVar.getClass();
        executorC1449a.execute(jVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f15479i) {
            return;
        }
        int i4 = message.what;
        if (i4 == 1) {
            b();
            return;
        }
        if (i4 == 4) {
            throw ((Error) message.obj);
        }
        this.f15480j.f15485b = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = elapsedRealtime - this.f15473c;
        i iVar = this.f15474d;
        iVar.getClass();
        if (this.f15478h) {
            iVar.m(this.f15472b, elapsedRealtime, j4, false);
            return;
        }
        int i5 = message.what;
        if (i5 == 2) {
            try {
                iVar.g(this.f15472b, elapsedRealtime, j4);
                return;
            } catch (RuntimeException e4) {
                AbstractC0108a.f("LoadTask", "Unexpected exception handling load completed", e4);
                this.f15480j.f15486c = new m(e4);
                return;
            }
        }
        if (i5 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f15475e = iOException;
        int i6 = this.f15476f + 1;
        this.f15476f = i6;
        g1.e p2 = iVar.p(this.f15472b, elapsedRealtime, j4, iOException, i6);
        int i7 = p2.f9026a;
        if (i7 == 3) {
            this.f15480j.f15486c = this.f15475e;
            return;
        }
        if (i7 != 2) {
            if (i7 == 1) {
                this.f15476f = 1;
            }
            long j5 = p2.f9027b;
            if (j5 == -9223372036854775807L) {
                j5 = Math.min((this.f15476f - 1) * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, 5000);
            }
            n nVar = this.f15480j;
            AbstractC0124a.t(nVar.f15485b == null);
            nVar.f15485b = this;
            if (j5 > 0) {
                sendEmptyMessageDelayed(1, j5);
            } else {
                b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.f15478h;
                this.f15477g = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.f15472b.getClass().getSimpleName()));
                try {
                    this.f15472b.c();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f15477g = null;
                Thread.interrupted();
            }
            if (this.f15479i) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e4) {
            if (this.f15479i) {
                return;
            }
            obtainMessage(3, e4).sendToTarget();
        } catch (Exception e5) {
            if (this.f15479i) {
                return;
            }
            AbstractC0108a.f("LoadTask", "Unexpected exception loading stream", e5);
            obtainMessage(3, new m(e5)).sendToTarget();
        } catch (OutOfMemoryError e6) {
            if (this.f15479i) {
                return;
            }
            AbstractC0108a.f("LoadTask", "OutOfMemory error loading stream", e6);
            obtainMessage(3, new m(e6)).sendToTarget();
        } catch (Error e7) {
            if (!this.f15479i) {
                AbstractC0108a.f("LoadTask", "Unexpected error loading stream", e7);
                obtainMessage(4, e7).sendToTarget();
            }
            throw e7;
        }
    }
}
