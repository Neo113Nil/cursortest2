package A0;

import B0.q;
import B0.t;
import C0.n;
import C0.p;
import C0.u;
import D4.AbstractC0020u;
import D4.AbstractC0024y;
import D4.C0007g;
import D4.Q;
import G0.C0054d;
import G0.C0060j;
import G0.C0061k;
import G0.InterfaceC0067q;
import G0.InterfaceC0068s;
import G0.O;
import G0.r;
import I1.l;
import I1.o;
import M2.C0105i;
import O1.k;
import android.content.Context;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.gms.internal.play_billing.AbstractC0357o0;
import com.google.android.gms.internal.play_billing.C;
import com.google.android.gms.internal.play_billing.C0388z;
import com.google.android.gms.internal.play_billing.S;
import com.google.android.gms.tasks.Task;
import f2.s;
import io.appmetrica.analytics.impl.C0793l9;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import k1.j;
import k1.m;
import k4.C1224j;
import l.C1234f;
import l.C1237i;
import n2.AbstractC1341c;
import s0.i;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5c;

    public /* synthetic */ a(C0054d c0054d, D3.g gVar, C0061k c0061k) {
        this.f3a = 10;
        this.f4b = c0054d;
        this.f5c = gVar;
    }

    private final void a() {
        synchronized (((l) this.f5c).f1257b) {
            try {
                I1.c cVar = (I1.c) ((l) this.f5c).f1259d;
                if (cVar != null) {
                    cVar.onComplete((Task) this.f4b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        synchronized (((l) this.f5c).f1257b) {
            try {
                I1.e eVar = (I1.e) ((l) this.f5c).f1259d;
                if (eVar != null) {
                    eVar.onSuccess(((Task) this.f4b).c());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        try {
            f();
        } catch (Error e3) {
            synchronized (((k) this.f5c).f2260b) {
                ((k) this.f5c).f2261c = 1;
                throw e3;
            }
        }
    }

    private final void d() {
        k1.l lVar = (k1.l) this.f4b;
        IBinder iBinder = (IBinder) this.f5c;
        synchronized (lVar) {
            if (iBinder == null) {
                lVar.a(0, "Null service connection");
                return;
            }
            try {
                lVar.f10701c = new t(iBinder);
                lVar.f10699a = 2;
                ((ScheduledExecutorService) lVar.f10704f.f10713c).execute(new j(lVar, 0));
            } catch (RemoteException e3) {
                lVar.a(0, e3.getMessage());
            }
        }
    }

    private final void e() {
        k1.l lVar = (k1.l) this.f4b;
        int i2 = ((m) this.f5c).f10705a;
        synchronized (lVar) {
            m mVar = (m) lVar.f10703e.get(i2);
            if (mVar != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + i2);
                lVar.f10703e.remove(i2);
                mVar.b(new s("Timed out waiting for response", null));
                lVar.c();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        ((java.lang.Runnable) r10.f4b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        r10.f4b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        O1.k.f2258f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f4b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f() {
        boolean z = false;
        boolean z5 = false;
        while (true) {
            try {
                synchronized (((k) this.f5c).f2260b) {
                    if (!z) {
                        k kVar = (k) this.f5c;
                        if (kVar.f2261c != 4) {
                            kVar.f2262d++;
                            kVar.f2261c = 4;
                            z = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((k) this.f5c).f2260b.poll();
                    this.f4b = runnable;
                    if (runnable == null) {
                        ((k) this.f5c).f2261c = 1;
                    }
                }
                if (z5) {
                    Thread.currentThread().interrupt();
                    return;
                }
                return;
            } finally {
                if (z5) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        V0.j jVar;
        int i2 = 0;
        q qVar = null;
        switch (this.f3a) {
            case 0:
                t0.f fVar = ((b) this.f5c).f7a.f11887f;
                String str = (String) this.f4b;
                synchronized (fVar.f11863l) {
                    try {
                        t0.q qVar2 = (t0.q) fVar.f11857f.get(str);
                        if (qVar2 == null) {
                            qVar2 = (t0.q) fVar.f11858g.get(str);
                        }
                        if (qVar2 != null) {
                            qVar = qVar2.f11906e;
                        }
                    } finally {
                    }
                }
                if (qVar == null || !qVar.b()) {
                    return;
                }
                synchronized (((b) this.f5c).f9c) {
                    ((b) this.f5c).f12f.put(AbstractC1477a.p(qVar), qVar);
                    ((b) this.f5c).f13g.add(qVar);
                    b bVar = (b) this.f5c;
                    bVar.f14h.d(bVar.f13g);
                }
                return;
            case 1:
                G2.f fVar2 = (G2.f) ((V0.j) this.f4b).f3212b;
                if (fVar2 != null) {
                    fVar2.c((Typeface) this.f5c);
                    return;
                }
                return;
            case 2:
                ((B.f) this.f4b).accept(this.f5c);
                return;
            case 3:
                try {
                    ((Runnable) this.f5c).run();
                    synchronized (((n) this.f4b).f346d) {
                        ((n) this.f4b).a();
                    }
                    return;
                } catch (Throwable th) {
                    synchronized (((n) this.f4b).f346d) {
                        ((n) this.f4b).a();
                        throw th;
                    }
                }
            case 4:
                if (((C0.s) this.f5c).f356a.f428a instanceof D0.a) {
                    return;
                }
                try {
                    i iVar = (i) ((D0.k) this.f4b).get();
                    if (iVar == null) {
                        throw new IllegalStateException("Worker was marked important (" + ((C0.s) this.f5c).f358c.f175c + ") but did not provide ForegroundInfo");
                    }
                    s0.s.d().a(C0.s.f355g, "Updating notification for " + ((C0.s) this.f5c).f358c.f175c);
                    C0.s sVar = (C0.s) this.f5c;
                    D0.k kVar = sVar.f356a;
                    u uVar = sVar.f360e;
                    Context context = sVar.f357b;
                    UUID id = sVar.f359d.getId();
                    uVar.getClass();
                    D0.k kVar2 = new D0.k();
                    uVar.f367a.o(new C0.t(uVar, kVar2, id, iVar, context));
                    kVar.m(kVar2);
                    return;
                } catch (Throwable th2) {
                    ((C0.s) this.f5c).f356a.l(th2);
                    return;
                }
            case 5:
                ((C0007g) this.f5c).B((Q) this.f4b);
                return;
            case 6:
                ((C0007g) this.f4b).B((E4.e) this.f5c);
                return;
            case 7:
                C0054d c0054d = (C0054d) this.f4b;
                c0054d.getClass();
                C0060j c0060j = O.f782l;
                c0054d.H(24, 9, c0060j);
                C0388z c0388z = C.f5030b;
                ((InterfaceC0068s) this.f5c).onQueryPurchasesResponse(c0060j, S.f5100e);
                return;
            case 8:
                C0054d c0054d2 = (C0054d) this.f4b;
                c0054d2.getClass();
                c0054d2.A((D3.g) this.f5c, O.f782l, 24, null);
                return;
            case 9:
                Future future = (Future) this.f4b;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                future.cancel(true);
                AbstractC0357o0.g("BillingClient", "Async task is taking too long, cancel it!");
                Runnable runnable = (Runnable) this.f5c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 10:
                C0054d c0054d3 = (C0054d) this.f4b;
                C0060j c0060j2 = O.f782l;
                c0054d3.H(24, 4, c0060j2);
                ((C0105i) ((D3.g) this.f5c).f448b).a(AbstractC1341c.j(c0060j2));
                return;
            case 11:
                C0054d c0054d4 = (C0054d) this.f4b;
                c0054d4.getClass();
                C0060j c0060j3 = O.f782l;
                c0054d4.H(24, 11, c0060j3);
                ((r) this.f5c).onPurchaseHistoryResponse(c0060j3, null);
                return;
            case 12:
                C0054d c0054d5 = (C0054d) this.f4b;
                c0054d5.getClass();
                C0060j c0060j4 = O.f782l;
                c0054d5.H(24, 7, c0060j4);
                ((InterfaceC0067q) this.f5c).onProductDetailsResponse(c0060j4, new ArrayList());
                return;
            case 13:
                C0054d c0054d6 = (C0054d) this.f4b;
                C0060j c0060j5 = (C0060j) this.f5c;
                if (c0054d6.f828e.f802b != null) {
                    c0054d6.f828e.f802b.onPurchasesUpdated(c0060j5, null);
                    return;
                } else {
                    AbstractC0357o0.g("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 14:
                C0054d c0054d7 = (C0054d) this.f4b;
                c0054d7.getClass();
                c0054d7.G((D3.g) this.f5c, O.f782l, 24, null);
                return;
            case 15:
                C0054d c0054d8 = (C0054d) this.f4b;
                c0054d8.getClass();
                C0060j c0060j6 = O.f782l;
                c0054d8.H(24, 3, c0060j6);
                ((D3.g) this.f5c).f(c0060j6);
                return;
            case 16:
                C0054d c0054d9 = (C0054d) this.f4b;
                c0054d9.getClass();
                C0060j c0060j7 = O.f782l;
                c0054d9.H(24, 13, c0060j7);
                ((D3.g) this.f5c).h(c0060j7);
                return;
            case 17:
                C0054d c0054d10 = (C0054d) this.f4b;
                c0054d10.getClass();
                c0054d10.C((D3.g) this.f5c, O.f782l, 24, null);
                return;
            case 18:
                if (((o) ((Task) this.f4b)).f1266d) {
                    ((I1.k) this.f5c).f1255d.l();
                    return;
                }
                try {
                    ((I1.k) this.f5c).f1255d.k(((I1.k) this.f5c).f1254c.j((Task) this.f4b));
                    return;
                } catch (I1.f e3) {
                    if (e3.getCause() instanceof Exception) {
                        ((I1.k) this.f5c).f1255d.j((Exception) e3.getCause());
                        return;
                    } else {
                        ((I1.k) this.f5c).f1255d.j(e3);
                        return;
                    }
                } catch (Exception e6) {
                    ((I1.k) this.f5c).f1255d.j(e6);
                    return;
                }
            case C0793l9.f8681C /* 19 */:
                I1.k kVar3 = (I1.k) this.f5c;
                try {
                    Task task = (Task) kVar3.f1254c.j((Task) this.f4b);
                    if (task == null) {
                        kVar3.c(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    p pVar = I1.i.f1250b;
                    task.a(pVar, kVar3);
                    o oVar = (o) task;
                    l lVar = new l(pVar, (I1.d) kVar3);
                    I1.n nVar = oVar.f1264b;
                    nVar.b(lVar);
                    oVar.n();
                    nVar.b(new l(pVar, (I1.b) kVar3));
                    oVar.n();
                    return;
                } catch (I1.f e7) {
                    if (e7.getCause() instanceof Exception) {
                        kVar3.f1255d.j((Exception) e7.getCause());
                        return;
                    } else {
                        kVar3.f1255d.j(e7);
                        return;
                    }
                } catch (Exception e8) {
                    kVar3.f1255d.j(e8);
                    return;
                }
            case C0793l9.f8682D /* 20 */:
                a();
                return;
            case C0793l9.f8683E /* 21 */:
                b();
                return;
            case 22:
                l lVar2 = (l) this.f5c;
                try {
                    o a6 = ((I1.g) lVar2.f1257b).a(((Task) this.f4b).c());
                    p pVar2 = I1.i.f1250b;
                    a6.a(pVar2, lVar2);
                    l lVar3 = new l(pVar2, (I1.d) lVar2);
                    I1.n nVar2 = a6.f1264b;
                    nVar2.b(lVar3);
                    a6.n();
                    nVar2.b(new l(pVar2, (I1.b) lVar2));
                    a6.n();
                    return;
                } catch (I1.f e9) {
                    if (e9.getCause() instanceof Exception) {
                        lVar2.c((Exception) e9.getCause());
                        return;
                    } else {
                        lVar2.c(e9);
                        return;
                    }
                } catch (CancellationException unused) {
                    lVar2.a();
                    return;
                } catch (Exception e10) {
                    lVar2.c(e10);
                    return;
                }
            case 23:
                o oVar2 = (o) this.f4b;
                try {
                    oVar2.k(((Callable) this.f5c).call());
                    return;
                } catch (Exception e11) {
                    oVar2.j(e11);
                    return;
                } catch (Throwable th3) {
                    oVar2.j(new RuntimeException(th3));
                    return;
                }
            case 24:
                break;
            case C0793l9.f8684F /* 25 */:
                c();
                return;
            case 26:
                d();
                return;
            case C0793l9.f8686H /* 27 */:
                e();
                return;
            case 28:
                C1237i c1237i = (C1237i) this.f5c;
                k.i iVar2 = c1237i.f10870c;
                if (iVar2 != null && (jVar = iVar2.f10590e) != null) {
                    ((ActionMenuView) jVar.f3212b).getClass();
                }
                ActionMenuView actionMenuView = c1237i.f10874g;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    C1234f c1234f = (C1234f) this.f4b;
                    if (!c1234f.b()) {
                        if (c1234f.f10639e != null) {
                            c1234f.d(0, 0, false, false);
                        }
                    }
                    c1237i.f10885r = c1234f;
                }
                c1237i.f10887t = null;
                return;
            default:
                l.r rVar = (l.r) ((WeakReference) this.f4b).get();
                if (rVar != null && rVar.f10960m) {
                    TextView textView = rVar.f10948a;
                    Typeface typeface = (Typeface) this.f5c;
                    textView.setTypeface(typeface);
                    rVar.f10959l = typeface;
                    return;
                }
                return;
        }
        while (true) {
            try {
                ((Runnable) this.f4b).run();
            } catch (Throwable th4) {
                AbstractC0024y.j(th4, C1224j.f10720a);
            }
            I4.i iVar3 = (I4.i) this.f5c;
            Runnable F2 = iVar3.F();
            if (F2 == null) {
                return;
            }
            this.f4b = F2;
            i2++;
            if (i2 >= 16) {
                AbstractC0020u abstractC0020u = iVar3.f1299c;
                if (abstractC0020u.E()) {
                    abstractC0020u.C(iVar3, this);
                    return;
                }
            }
        }
    }

    public String toString() {
        switch (this.f3a) {
            case C0793l9.f8684F /* 25 */:
                Runnable runnable = (Runnable) this.f4b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i2 = ((k) this.f5c).f2261c;
                sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(Object obj, int i2, Object obj2) {
        this.f3a = i2;
        this.f5c = obj;
        this.f4b = obj2;
    }

    public /* synthetic */ a(Object obj, Object obj2, int i2, boolean z) {
        this.f3a = i2;
        this.f4b = obj;
        this.f5c = obj2;
    }

    public a(k kVar) {
        this.f3a = 25;
        this.f5c = kVar;
    }
}
