package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class D extends Handler implements Runnable {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ C4017ue f24287A;

    /* renamed from: n, reason: collision with root package name */
    public final MQ f24288n;

    /* renamed from: u, reason: collision with root package name */
    public PQ f24289u;

    /* renamed from: v, reason: collision with root package name */
    public IOException f24290v;

    /* renamed from: w, reason: collision with root package name */
    public int f24291w;

    /* renamed from: x, reason: collision with root package name */
    public Thread f24292x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f24293y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f24294z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(C4017ue c4017ue, Looper looper, MQ mq, PQ pq, long j9) {
        super(looper);
        Objects.requireNonNull(c4017ue);
        this.f24287A = c4017ue;
        this.f24288n = mq;
        this.f24289u = pq;
    }

    public final void a(boolean z8) {
        this.f24294z = z8;
        this.f24290v = null;
        if (hasMessages(1)) {
            this.f24293y = true;
            removeMessages(1);
            if (!z8) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f24293y = true;
                    this.f24288n.f26345g = true;
                    Thread thread = this.f24292x;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z8) {
            this.f24287A.f34631v = null;
            SystemClock.elapsedRealtime();
            PQ pq = this.f24289u;
            pq.getClass();
            pq.e(this.f24288n, true);
            this.f24289u = null;
        }
    }

    public final void b() {
        C3958tQ c3958tQ;
        SystemClock.elapsedRealtime();
        PQ pq = this.f24289u;
        pq.getClass();
        int i = this.f24291w;
        MQ mq = this.f24288n;
        C4164xG c4164xG = mq.f26340b;
        if (i == 0) {
            Uri uri = mq.f26347j.f30686a;
            Map map = Collections.EMPTY_MAP;
            c3958tQ = new C3958tQ();
        } else {
            Object obj = c4164xG.f35133v;
            c3958tQ = new C3958tQ();
        }
        C4228yQ c4228yQ = new C4228yQ(-1, null, AbstractC3548lu.t(mq.i), AbstractC3548lu.t(pq.f26948T));
        NP np = pq.f26964w;
        np.a(new O5(np, c3958tQ, c4228yQ, i));
        this.f24290v = null;
        C4017ue c4017ue = this.f24287A;
        D d2 = (D) c4017ue.f34631v;
        d2.getClass();
        ((I) c4017ue.f34630u).execute(d2);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long min;
        B b9;
        InterfaceC3015c1 interfaceC3015c1;
        boolean z8 = true;
        if (this.f24294z) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            b();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        C4017ue c4017ue = this.f24287A;
        c4017ue.f34631v = null;
        SystemClock.elapsedRealtime();
        PQ pq = this.f24289u;
        pq.getClass();
        if (this.f24293y) {
            pq.e(this.f24288n, false);
            return;
        }
        int i4 = message.what;
        if (i4 == 2) {
            try {
                pq.k(this.f24288n);
                return;
            } catch (RuntimeException e6) {
                AbstractC3217fl.X("LoadTask", "Unexpected exception handling load completed", e6);
                this.f24287A.f34632w = new F(e6);
                return;
            }
        }
        if (i4 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f24290v = iOException;
        int i9 = this.f24291w;
        this.f24291w = i9 + 1;
        MQ mq = this.f24288n;
        Object obj = mq.f26340b.f35133v;
        C3958tQ c3958tQ = new C3958tQ();
        String str = AbstractC3548lu.f32613a;
        for (Throwable th = iOException; th != null; th = th.getCause()) {
            if ((th instanceof W4) || (th instanceof FileNotFoundException) || (th instanceof C3522lL) || (th instanceof F) || ((th instanceof NH) && ((NH) th).f26510n == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min(i9 * 1000, 5000);
        if (min == com.anythink.basead.exoplayer.b.f6539b) {
            b9 = C4017ue.f34628z;
        } else {
            int y6 = pq.y();
            int i10 = y6 > pq.f26959r0 ? 1 : 0;
            if (pq.f26955n0 || !((interfaceC3015c1 = pq.f26947S) == null || interfaceC3015c1.a() == com.anythink.basead.exoplayer.b.f6539b)) {
                pq.f26959r0 = y6;
            } else {
                boolean z9 = pq.f26943O;
                if (!z9 || pq.q()) {
                    pq.f26952X = z9;
                    pq.f26956o0 = 0L;
                    pq.f26959r0 = 0;
                    UQ[] uqArr = pq.f26940L;
                    int length = uqArr.length;
                    int i11 = 0;
                    while (i11 < length) {
                        uqArr[i11].k(false);
                        i11++;
                        z8 = z8;
                    }
                    mq.f26344f.f27467n = 0L;
                    mq.i = 0L;
                    mq.f26346h = z8;
                    mq.f26349l = false;
                } else {
                    pq.f26958q0 = true;
                    b9 = C4017ue.f34627y;
                }
            }
            b9 = new B(i10, min);
        }
        int i12 = b9.f23935a;
        boolean z10 = i12 == 0 || i12 == 1;
        C4228yQ c4228yQ = new C4228yQ(-1, null, AbstractC3548lu.t(mq.i), AbstractC3548lu.t(pq.f26948T));
        NP np = pq.f26964w;
        np.a(new Zw(np, c3958tQ, c4228yQ, iOException, !z10));
        int i13 = b9.f23935a;
        if (i13 == 3) {
            c4017ue.f34632w = this.f24290v;
            return;
        }
        if (i13 != 2) {
            if (i13 == 1) {
                this.f24291w = 1;
            }
            long j9 = b9.f23936b;
            if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
                j9 = Math.min((this.f24291w - 1) * 1000, 5000);
            }
            C4017ue c4017ue2 = this.f24287A;
            PA.T(((D) c4017ue2.f34631v) == null);
            c4017ue2.f34631v = this;
            if (j9 > 0) {
                sendEmptyMessageDelayed(1, j9);
            } else {
                b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z8;
        try {
            synchronized (this) {
                z8 = this.f24293y;
                this.f24292x = Thread.currentThread();
            }
            if (!z8) {
                MQ mq = this.f24288n;
                String simpleName = mq.getClass().getSimpleName();
                StringBuilder sb = new StringBuilder(simpleName.length() + 5);
                sb.append("load:");
                sb.append(simpleName);
                Trace.beginSection(sb.toString());
                try {
                    mq.a();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f24292x = null;
                Thread.interrupted();
            }
            if (this.f24294z) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e6) {
            if (this.f24294z) {
                return;
            }
            obtainMessage(3, e6).sendToTarget();
        } catch (Exception e9) {
            if (this.f24294z) {
                return;
            }
            AbstractC3217fl.X("LoadTask", "Unexpected exception loading stream", e9);
            obtainMessage(3, new F(e9)).sendToTarget();
        } catch (OutOfMemoryError e10) {
            if (this.f24294z) {
                return;
            }
            AbstractC3217fl.X("LoadTask", "OutOfMemory error loading stream", e10);
            obtainMessage(3, new F(e10)).sendToTarget();
        } catch (Error e11) {
            if (!this.f24294z) {
                AbstractC3217fl.X("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        }
    }
}
