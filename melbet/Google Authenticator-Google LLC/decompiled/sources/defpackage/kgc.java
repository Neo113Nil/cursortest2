package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kgc extends iws {
    public static final Logger a = Logger.getLogger(kgc.class.getName());
    private static final iws l = new kfy();
    public final jxr c;
    public volatile boolean d;
    public kgb f;
    public iws g;
    private final ScheduledFuture h;
    private final Executor i;
    private kaa j;
    private kbq k;
    private iwr m;
    public List e = new ArrayList();
    public final String b = "name_resolver";

    protected kgc(Executor executor, ScheduledExecutorService scheduledExecutorService, jxs jxsVar) {
        kgc kgcVar;
        ScheduledFuture<?> scheduledFuture;
        long b;
        String str;
        executor.getClass();
        this.i = executor;
        scheduledExecutorService.getClass();
        jxr k = jxr.k();
        this.c = k;
        jxs b2 = k.b();
        if (jxsVar != null && (b2 == null || jxsVar.e(b2))) {
            b = jxsVar.b(TimeUnit.NANOSECONDS);
            str = "CallOptions";
        } else {
            if (b2 == null) {
                kgcVar = this;
                scheduledFuture = null;
                kgcVar.h = scheduledFuture;
            }
            b = b2.b(TimeUnit.NANOSECONDS);
            Logger logger = a;
            if (logger.isLoggable(Level.FINE)) {
                StringBuilder sb = new StringBuilder(String.format(Locale.US, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(b)));
                if (jxsVar == null) {
                    sb.append(" Explicit call timeout was not set.");
                } else {
                    sb.append(String.format(Locale.US, " Explicit call timeout was '%d' ns.", Long.valueOf(jxsVar.b(TimeUnit.NANOSECONDS))));
                }
                logger.logp(Level.FINE, "io.grpc.internal.DelayedClientCall", "scheduleDeadlineIfNeeded", sb.toString());
            }
            str = "Context";
        }
        long j = b;
        kgcVar = this;
        scheduledFuture = scheduledExecutorService.schedule(new kfw(kgcVar, j, str, 0), j, TimeUnit.NANOSECONDS);
        kgcVar.h = scheduledFuture;
    }

    private final void k(Runnable runnable) {
        synchronized (this) {
            if (this.d) {
                runnable.run();
            } else {
                this.e.add(runnable);
            }
        }
    }

    @Override // defpackage.iws
    public final void a(iwr iwrVar, kaa kaaVar) {
        kbq kbqVar;
        boolean z;
        kaaVar.getClass();
        hoq.I(this.m == null, "already started");
        synchronized (this) {
            iwrVar.getClass();
            this.m = iwrVar;
            kbqVar = this.k;
            z = this.d;
            if (!z) {
                kgb kgbVar = new kgb(this, iwrVar);
                this.f = kgbVar;
                this.j = kaaVar;
                iwrVar = kgbVar;
            }
        }
        if (kbqVar != null) {
            this.i.execute(new kfz(this, iwrVar, kbqVar));
        } else if (z) {
            this.g.a(iwrVar, kaaVar);
        }
    }

    @Override // defpackage.iws
    public final void c() {
        k(new iaq(this, 16, null));
    }

    @Override // defpackage.iws
    public final void d(int i) {
        if (this.d) {
            this.g.d(i);
        } else {
            k(new vz(this, i, 10, null));
        }
    }

    @Override // defpackage.iws
    public final void e(Object obj) {
        if (this.d) {
            this.g.e(obj);
        } else {
            k(new iep(this, obj, 20));
        }
    }

    public final void g(kbq kbqVar, boolean z) {
        iwr iwrVar;
        boolean z2;
        synchronized (this) {
            if (this.g == null) {
                j(l);
                iwrVar = this.m;
                this.k = kbqVar;
                z2 = false;
            } else {
                if (z) {
                    return;
                }
                iwrVar = null;
                z2 = true;
            }
            if (z2) {
                k(new iep(this, kbqVar, 19));
            } else {
                if (iwrVar != null) {
                    this.i.execute(new kfz(this, iwrVar, kbqVar));
                }
                i(iwrVar);
                h();
            }
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r0.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        kgb kgbVar;
        List list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                if (this.e.isEmpty()) {
                    break;
                }
                list = this.e;
                this.e = arrayList;
            }
            if (kgbVar == null) {
                this.i.execute(new kfx(this, kgbVar));
                return;
            }
            return;
            list.clear();
            arrayList = list;
        }
        this.e = null;
        this.d = true;
        kgbVar = this.f;
        if (kgbVar == null) {
        }
    }

    public final void i(iwr iwrVar) {
        kaa kaaVar = this.j;
        this.j = null;
        kfu kfuVar = new kfu(this, iwrVar, kaaVar, 0, null);
        jxr jxrVar = this.c;
        jxr a2 = jxrVar.a();
        try {
            kfuVar.run();
        } finally {
            jxrVar.f(a2);
        }
    }

    public final void j(iws iwsVar) {
        iws iwsVar2 = this.g;
        hoq.K(iwsVar2 == null, "realCall already set to %s", iwsVar2);
        ScheduledFuture scheduledFuture = this.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.g = iwsVar;
    }

    @Override // defpackage.iws
    public final void r(String str, Throwable th) {
        kbq kbqVar = kbq.c;
        kbq e = str != null ? kbqVar.e(str) : kbqVar.e("Call cancelled without message");
        if (th != null) {
            e = e.d(th);
        }
        g(e, false);
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.b("realCall", this.g);
        return T.toString();
    }

    protected void f() {
    }
}
