package l1;

import S0.n;
import android.os.Process;
import com.google.android.gms.internal.ads.C3614n5;
import com.google.android.gms.internal.ads.T4;
import h3.l;
import i8.m;
import java.util.HashMap;
import java.util.concurrent.PriorityBlockingQueue;
import m1.C4776c;

/* renamed from: l1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4685b extends Thread {

    /* renamed from: z, reason: collision with root package name */
    public static final boolean f39023z = j.f39043a;

    /* renamed from: n, reason: collision with root package name */
    public final PriorityBlockingQueue f39024n;

    /* renamed from: u, reason: collision with root package name */
    public final PriorityBlockingQueue f39025u;

    /* renamed from: v, reason: collision with root package name */
    public final C3614n5 f39026v;

    /* renamed from: w, reason: collision with root package name */
    public final m f39027w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f39028x = false;

    /* renamed from: y, reason: collision with root package name */
    public final n f39029y;

    public C4685b(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, C3614n5 c3614n5, m mVar) {
        this.f39024n = priorityBlockingQueue;
        this.f39025u = priorityBlockingQueue2;
        this.f39026v = c3614n5;
        this.f39027w = mVar;
        n nVar = new n();
        nVar.f2914n = new HashMap();
        nVar.f2915u = mVar;
        nVar.f2916v = this;
        nVar.f2917w = priorityBlockingQueue2;
        this.f39029y = nVar;
    }

    private void a() {
        C4776c c4776c = (C4776c) this.f39024n.take();
        c4776c.a("cache-queue-take");
        c4776c.g();
        try {
            synchronized (c4776c.f39565w) {
            }
            T4 a9 = this.f39026v.a(c4776c.f39563u);
            if (a9 == null) {
                c4776c.a("cache-miss");
                if (!this.f39029y.c(c4776c)) {
                    this.f39025u.put(c4776c);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (a9.f27713e < currentTimeMillis) {
                c4776c.a("cache-hit-expired");
                c4776c.f39558D = a9;
                if (!this.f39029y.c(c4776c)) {
                    this.f39025u.put(c4776c);
                }
                return;
            }
            c4776c.a("cache-hit");
            com.bumptech.glide.manager.n f6 = C4776c.f(new com.bumptech.glide.manager.n(a9.f27709a, a9.f27715g));
            c4776c.a("cache-hit-parsed");
            if (((g) f6.f23620w) == null) {
                if (a9.f27714f < currentTimeMillis) {
                    c4776c.a("cache-hit-refresh-needed");
                    c4776c.f39558D = a9;
                    f6.f23617n = true;
                    if (this.f39029y.c(c4776c)) {
                        this.f39027w.h(c4776c, f6, null);
                    } else {
                        this.f39027w.h(c4776c, f6, new l(4, this, c4776c));
                    }
                } else {
                    this.f39027w.h(c4776c, f6, null);
                }
                return;
            }
            c4776c.a("cache-parsing-failed");
            C3614n5 c3614n5 = this.f39026v;
            String str = c4776c.f39563u;
            synchronized (c3614n5) {
                T4 a10 = c3614n5.a(str);
                if (a10 != null) {
                    a10.f27714f = 0L;
                    a10.f27713e = 0L;
                    c3614n5.f(str, a10);
                }
            }
            c4776c.f39558D = null;
            if (!this.f39029y.c(c4776c)) {
                this.f39025u.put(c4776c);
            }
        } finally {
            c4776c.g();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f39023z) {
            j.d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f39026v.d();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f39028x) {
                    Thread.currentThread().interrupt();
                    return;
                }
                j.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
