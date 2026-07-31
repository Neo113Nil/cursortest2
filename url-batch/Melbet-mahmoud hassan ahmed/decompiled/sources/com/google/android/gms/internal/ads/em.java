package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.fm;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

@SuppressLint({"HandlerLeak"})
/* loaded from: classes.dex */
final class em<T extends fm> extends Handler implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final T f4658f;

    /* renamed from: g, reason: collision with root package name */
    private final dm<T> f4659g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4660h;

    /* renamed from: i, reason: collision with root package name */
    private final long f4661i;

    /* renamed from: j, reason: collision with root package name */
    private IOException f4662j;

    /* renamed from: k, reason: collision with root package name */
    private int f4663k;

    /* renamed from: l, reason: collision with root package name */
    private volatile Thread f4664l;

    /* renamed from: m, reason: collision with root package name */
    private volatile boolean f4665m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ hm f4666n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em(hm hmVar, Looper looper, T t6, dm<T> dmVar, int i7, long j7) {
        super(looper);
        this.f4666n = hmVar;
        this.f4658f = t6;
        this.f4659g = dmVar;
        this.f4660h = i7;
        this.f4661i = j7;
    }

    private final void d() {
        ExecutorService executorService;
        em emVar;
        this.f4662j = null;
        executorService = this.f4666n.f6330a;
        emVar = this.f4666n.f6331b;
        executorService.execute(emVar);
    }

    public final void a(boolean z6) {
        this.f4665m = z6;
        this.f4662j = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z6) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.f4658f.a();
            if (this.f4664l != null) {
                this.f4664l.interrupt();
            }
            if (!z6) {
                return;
            }
        }
        this.f4666n.f6331b = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f4659g.h(this.f4658f, elapsedRealtime, elapsedRealtime - this.f4661i, true);
    }

    public final void b(int i7) {
        IOException iOException = this.f4662j;
        if (iOException != null && this.f4663k > i7) {
            throw iOException;
        }
    }

    public final void c(long j7) {
        em emVar;
        emVar = this.f4666n.f6331b;
        jm.e(emVar == null);
        this.f4666n.f6331b = this;
        if (j7 > 0) {
            sendEmptyMessageDelayed(0, j7);
        } else {
            d();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f4665m) {
            return;
        }
        int i7 = message.what;
        if (i7 == 0) {
            d();
            return;
        }
        if (i7 == 4) {
            throw ((Error) message.obj);
        }
        this.f4666n.f6331b = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j7 = elapsedRealtime - this.f4661i;
        if (this.f4658f.b()) {
            this.f4659g.h(this.f4658f, elapsedRealtime, j7, false);
            return;
        }
        int i8 = message.what;
        if (i8 == 1) {
            this.f4659g.h(this.f4658f, elapsedRealtime, j7, false);
            return;
        }
        if (i8 == 2) {
            this.f4659g.d(this.f4658f, elapsedRealtime, j7);
            return;
        }
        if (i8 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f4662j = iOException;
        int i9 = this.f4659g.i(this.f4658f, elapsedRealtime, j7, iOException);
        if (i9 == 3) {
            this.f4666n.f6332c = this.f4662j;
        } else if (i9 != 2) {
            this.f4663k = i9 != 1 ? 1 + this.f4663k : 1;
            c(Math.min((r1 - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object e7;
        try {
            this.f4664l = Thread.currentThread();
            if (!this.f4658f.b()) {
                String simpleName = this.f4658f.getClass().getSimpleName();
                wm.a(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                try {
                    this.f4658f.c();
                    wm.b();
                } catch (Throwable th) {
                    wm.b();
                    throw th;
                }
            }
            if (this.f4665m) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e8) {
            e7 = e8;
            if (this.f4665m) {
                return;
            }
            obtainMessage(3, e7).sendToTarget();
        } catch (OutOfMemoryError e9) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e9);
            if (this.f4665m) {
                return;
            }
            e7 = new gm(e9);
            obtainMessage(3, e7).sendToTarget();
        } catch (Error e10) {
            Log.e("LoadTask", "Unexpected error loading stream", e10);
            if (!this.f4665m) {
                obtainMessage(4, e10).sendToTarget();
            }
            throw e10;
        } catch (InterruptedException unused) {
            jm.e(this.f4658f.b());
            if (this.f4665m) {
                return;
            }
            sendEmptyMessage(2);
        } catch (Exception e11) {
            Log.e("LoadTask", "Unexpected exception loading stream", e11);
            if (this.f4665m) {
                return;
            }
            e7 = new gm(e11);
            obtainMessage(3, e7).sendToTarget();
        }
    }
}
