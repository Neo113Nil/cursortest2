package A;

import H1.z;
import H5.AbstractC0161v;
import H5.AbstractC0165z;
import H5.C0147g;
import H5.S;
import T0.B;
import T0.D;
import T0.L;
import T0.M;
import U0.AbstractBinderC0210a;
import U0.p;
import U0.t;
import android.content.Context;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.appcompat.widget.ActionMenuView;
import androidx.work.Worker;
import com.onesignal.debug.internal.crash.r;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import k.C0447f;
import k.C0450i;
import k.C0459s;
import k2.AbstractC0467a;
import l0.o;
import l1.InterfaceFutureC0490a;
import m0.q;
import n0.C0540a;
import o5.C0570j;
import t0.C0650b;
import u0.AbstractC0676f;
import u0.C0686p;
import u0.C0689s;
import w0.C0709a;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f0f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f2h;

    public /* synthetic */ a(Object obj, int i7, Object obj2) {
        this.f0f = i7;
        this.f1g = obj;
        this.f2h = obj2;
    }

    private final void a() {
        synchronized (((k1.k) this.f2h).f5166h) {
            ((k1.e) ((k1.k) this.f2h).f5167i).b(((k1.n) this.f1g).f());
        }
    }

    private final void b() {
        try {
            e();
        } catch (Error e4) {
            synchronized (((q1.h) this.f2h).f5777g) {
                ((q1.h) this.f2h).f5778h = 1;
                throw e4;
            }
        }
    }

    private final void c() {
        C0686p c0686p;
        m0.f fVar = ((C0650b) this.f2h).f5945f.f5378f;
        String str = (String) this.f1g;
        synchronized (fVar.f5354q) {
            try {
                q qVar = (q) fVar.f5348k.get(str);
                if (qVar == null) {
                    qVar = (q) fVar.f5349l.get(str);
                }
                c0686p = qVar != null ? qVar.f5397j : null;
            } finally {
            }
        }
        if (c0686p == null || !c0686p.b()) {
            return;
        }
        synchronized (((C0650b) this.f2h).f5947h) {
            ((C0650b) this.f2h).f5950k.put(i6.g.n(c0686p), c0686p);
            ((C0650b) this.f2h).f5951l.add(c0686p);
            C0650b c0650b = (C0650b) this.f2h;
            c0650b.f5952m.w(c0650b.f5951l);
        }
    }

    private final void d() {
        try {
            ((Runnable) this.f2h).run();
            synchronized (((v0.k) this.f1g).f6073i) {
                ((v0.k) this.f1g).a();
            }
        } catch (Throwable th) {
            synchronized (((v0.k) this.f1g).f6073i) {
                ((v0.k) this.f1g).a();
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f1g).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r10.f1g = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        q1.h.f5775k.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f1g), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e() {
        boolean z5 = false;
        boolean z6 = false;
        while (true) {
            try {
                synchronized (((q1.h) this.f2h).f5777g) {
                    if (!z5) {
                        q1.h hVar = (q1.h) this.f2h;
                        if (hVar.f5778h != 4) {
                            hVar.f5779i++;
                            hVar.f5778h = 4;
                            z5 = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((q1.h) this.f2h).f5777g.poll();
                    this.f1g = runnable;
                    if (runnable == null) {
                        ((q1.h) this.f2h).f5778h = 1;
                    }
                }
                if (!z6) {
                    return;
                }
            } finally {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        U0.f fVar;
        int i7 = 0;
        U0.f fVar2 = null;
        switch (this.f0f) {
            case 0:
                a6.d dVar = (a6.d) this.f1g;
                Typeface typeface = (Typeface) this.f2h;
                C0459s c0459s = (C0459s) dVar.f3172f;
                if (c0459s != null) {
                    c0459s.b(typeface);
                    return;
                }
                return;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((g) this.f1g).accept(this.f2h);
                return;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                ((C0147g) this.f2h).B((S) this.f1g);
                return;
            case 3:
                ((C0147g) this.f1g).B((I5.e) this.f2h);
                return;
            case 4:
                M5.i iVar = (M5.i) this.f2h;
                AbstractC0161v abstractC0161v = iVar.f1601h;
                while (true) {
                    try {
                        ((Runnable) this.f1g).run();
                    } catch (Throwable th) {
                        AbstractC0165z.i(C0570j.f5620f, th);
                    }
                    Runnable I6 = iVar.I();
                    if (I6 == null) {
                        return;
                    }
                    this.f1g = I6;
                    i7++;
                    if (i7 >= 16 && abstractC0161v.H()) {
                        abstractC0161v.F(iVar, this);
                        return;
                    }
                }
                break;
            case 5:
                Q0.m mVar = (Q0.m) this.f1g;
                IBinder iBinder = (IBinder) this.f2h;
                synchronized (mVar) {
                    if (iBinder == null) {
                        mVar.a("Null service connection");
                    } else {
                        try {
                            mVar.f1994c = new C0689s(iBinder);
                            mVar.f1992a = 2;
                            ((ScheduledExecutorService) mVar.f1997f.f2006c).execute(new Q0.k(mVar, i7));
                        } catch (RemoteException e4) {
                            mVar.a(e4.getMessage());
                        }
                    }
                }
                return;
            case 6:
                Q0.m mVar2 = (Q0.m) this.f1g;
                int i8 = ((Q0.n) this.f2h).f1998a;
                synchronized (mVar2) {
                    Q0.n nVar = (Q0.n) mVar2.f1996e.get(i8);
                    if (nVar != null) {
                        Log.w("MessengerIpcClient", "Timing out request: " + i8);
                        mVar2.f1996e.remove(i8);
                        nVar.b(new z("Timed out waiting for response", null));
                        mVar2.c();
                    }
                }
                return;
            case 7:
                R0.a aVar = (R0.a) this.f1g;
                D d7 = (D) this.f2h;
                S0.a aVar2 = d7.f2236a;
                B b7 = (B) d7.f2241f.f2290j.get(d7.f2237b);
                if (b7 == null) {
                    return;
                }
                if (!aVar.b()) {
                    b7.l(aVar, null);
                    return;
                }
                d7.f2240e = true;
                if (aVar2.m()) {
                    if (!d7.f2240e || (fVar = d7.f2238c) == null) {
                        return;
                    }
                    aVar2.n(fVar, d7.f2239d);
                    return;
                }
                try {
                    aVar2.n(null, aVar2.b());
                    return;
                } catch (SecurityException e7) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e7);
                    aVar2.d("Failed to get service from broker.");
                    b7.l(new R0.a(10), null);
                    return;
                }
            case 8:
                L l7 = (L) this.f2h;
                i1.g gVar = (i1.g) this.f1g;
                R0.a aVar3 = gVar.f4427g;
                if (aVar3.b()) {
                    p pVar = gVar.f4428h;
                    t.f(pVar);
                    R0.a aVar4 = pVar.f2570h;
                    if (!aVar4.b()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(aVar4)), new Exception());
                        l7.f2255j.b(aVar4);
                        l7.f2254i.l();
                        return;
                    }
                    D d8 = l7.f2255j;
                    IBinder iBinder2 = pVar.f2569g;
                    if (iBinder2 != null) {
                        int i9 = AbstractBinderC0210a.f2507d;
                        IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        fVar2 = queryLocalInterface instanceof U0.f ? (U0.f) queryLocalInterface : new U0.D(iBinder2);
                    }
                    Set set = l7.f2252g;
                    d8.getClass();
                    if (fVar2 == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        d8.b(new R0.a(4));
                    } else {
                        d8.f2238c = fVar2;
                        d8.f2239d = set;
                        if (d8.f2240e) {
                            d8.f2236a.n(fVar2, set);
                        }
                    }
                } else {
                    l7.f2255j.b(aVar3);
                }
                l7.f2254i.l();
                return;
            case 9:
                C0447f c0447f = (C0447f) this.f1g;
                C0450i c0450i = (C0450i) this.f2h;
                ActionMenuView actionMenuView = c0450i.f5010l;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    if (!c0447f.b()) {
                        if (c0447f.f4848e != null) {
                            c0447f.d(0, 0, false, false);
                        }
                    }
                    c0450i.f5021w = c0447f;
                }
                c0450i.y = null;
                return;
            case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                if (((k1.n) this.f1g).f5172d) {
                    ((k1.j) this.f2h).f5163i.l();
                    return;
                }
                try {
                    ((k1.j) this.f2h).f5163i.k(((k1.j) this.f2h).f5162h.a((k1.n) this.f1g));
                    return;
                } catch (k1.f e8) {
                    if (e8.getCause() instanceof Exception) {
                        ((k1.j) this.f2h).f5163i.j((Exception) e8.getCause());
                        return;
                    } else {
                        ((k1.j) this.f2h).f5163i.j(e8);
                        return;
                    }
                } catch (Exception e9) {
                    ((k1.j) this.f2h).f5163i.j(e9);
                    return;
                }
            case 11:
                k1.j jVar = (k1.j) this.f2h;
                k1.n nVar2 = jVar.f5163i;
                try {
                    k1.n nVar3 = (k1.n) jVar.f5162h.a((k1.n) this.f1g);
                    if (nVar3 == null) {
                        jVar.d(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    M m4 = nVar3.f5170b;
                    k1.m mVar3 = k1.i.f5159b;
                    nVar3.b(mVar3, jVar);
                    m4.c(new k1.k((Executor) mVar3, (k1.d) jVar));
                    nVar3.n();
                    m4.c(new k1.k((Executor) mVar3, (k1.b) jVar));
                    nVar3.n();
                    return;
                } catch (k1.f e10) {
                    if (e10.getCause() instanceof Exception) {
                        nVar2.j((Exception) e10.getCause());
                        return;
                    } else {
                        nVar2.j(e10);
                        return;
                    }
                } catch (Exception e11) {
                    nVar2.j(e11);
                    return;
                }
            case 12:
                synchronized (((k1.k) this.f2h).f5166h) {
                    ((k1.c) ((k1.k) this.f2h).f5167i).h((k1.n) this.f1g);
                }
                return;
            case 13:
                synchronized (((k1.k) this.f2h).f5166h) {
                    k1.d dVar2 = (k1.d) ((k1.k) this.f2h).f5167i;
                    Exception e12 = ((k1.n) this.f1g).e();
                    t.f(e12);
                    dVar2.d(e12);
                }
                return;
            case 14:
                a();
                return;
            case 15:
                k1.k kVar = (k1.k) this.f2h;
                try {
                    k1.n b8 = ((k1.g) kVar.f5166h).b(((k1.n) this.f1g).f());
                    M m7 = b8.f5170b;
                    k1.m mVar4 = k1.i.f5159b;
                    b8.b(mVar4, kVar);
                    m7.c(new k1.k((Executor) mVar4, (k1.d) kVar));
                    b8.n();
                    m7.c(new k1.k((Executor) mVar4, (k1.b) kVar));
                    b8.n();
                    return;
                } catch (CancellationException unused) {
                    kVar.a();
                    return;
                } catch (k1.f e13) {
                    if (e13.getCause() instanceof Exception) {
                        kVar.d((Exception) e13.getCause());
                        return;
                    } else {
                        kVar.d(e13);
                        return;
                    }
                } catch (Exception e14) {
                    kVar.d(e14);
                    return;
                }
            case 16:
                k1.n nVar4 = (k1.n) this.f1g;
                try {
                    nVar4.k(((Callable) this.f2h).call());
                    return;
                } catch (Exception e15) {
                    nVar4.j(e15);
                    return;
                } catch (Throwable th2) {
                    nVar4.j(new RuntimeException(th2));
                    return;
                }
            case 17:
                ((N3.j) this.f1g).d(this.f2h);
                return;
            case 18:
                ((N3.j) this.f1g).a(com.onesignal.common.threading.a.BASE_THREAD_NAME, (String) this.f2h, null);
                return;
            case 19:
                try {
                    ((Runnable) this.f1g).run();
                    return;
                } catch (Exception e16) {
                    com.onesignal.debug.internal.logging.b.error("Encountered an error while handling a Flutter method call: " + e16.toString(), e16);
                    AbstractC0467a.d((N3.j) this.f2h, e16.getMessage());
                    return;
                }
            case 20:
                C0147g c0147g = (C0147g) this.f1g;
                try {
                    c0147g.resumeWith(((InterfaceFutureC0490a) this.f2h).get());
                    return;
                } catch (Throwable th3) {
                    Throwable cause = th3.getCause();
                    if (cause == null) {
                        cause = th3;
                    }
                    if (th3 instanceof CancellationException) {
                        c0147g.m(cause);
                        return;
                    } else {
                        c0147g.resumeWith(AbstractC0676f.f(cause));
                        return;
                    }
                }
            case 21:
                try {
                    ((Worker) this.f2h).getClass();
                    throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
                } catch (Throwable th4) {
                    ((w0.j) this.f1g).j(th4);
                    return;
                }
            case 22:
                if (((q) this.f2h).f5409v.f6173f instanceof C0709a) {
                    return;
                }
                try {
                    ((InterfaceFutureC0490a) this.f1g).get();
                    l0.q.d().a(q.f5392x, "Starting work for " + ((q) this.f2h).f5397j.f6002c);
                    q qVar = (q) this.f2h;
                    qVar.f5409v.k(qVar.f5398k.startWork());
                    return;
                } catch (Throwable th5) {
                    ((q) this.f2h).f5409v.j(th5);
                    return;
                }
            case 23:
                String str = (String) this.f1g;
                q qVar2 = (q) this.f2h;
                try {
                    try {
                        o oVar = (o) qVar2.f5409v.get();
                        if (oVar == null) {
                            l0.q.d().b(q.f5392x, qVar2.f5397j.f6002c + " returned a null result. Treating it as a failure.");
                        } else {
                            l0.q.d().a(q.f5392x, qVar2.f5397j.f6002c + " returned a " + oVar + ".");
                            qVar2.f5400m = oVar;
                        }
                    } catch (Throwable th6) {
                        qVar2.b();
                        throw th6;
                    }
                } catch (InterruptedException e17) {
                    e = e17;
                    l0.q.d().c(q.f5392x, str + " failed because it threw an exception/error", e);
                } catch (CancellationException e18) {
                    l0.q d9 = l0.q.d();
                    String str2 = q.f5392x;
                    String str3 = str + " was cancelled";
                    if (d9.f5283a <= 4) {
                        Log.i(str2, str3, e18);
                    }
                } catch (ExecutionException e19) {
                    e = e19;
                    l0.q.d().c(q.f5392x, str + " failed because it threw an exception/error", e);
                }
                qVar2.b();
                return;
            case 24:
                l0.q d10 = l0.q.d();
                String str4 = C0540a.f5490d;
                StringBuilder sb = new StringBuilder("Scheduling work ");
                C0686p c0686p = (C0686p) this.f1g;
                sb.append(c0686p.f6000a);
                d10.a(str4, sb.toString());
                ((C0540a) this.f2h).f5491a.b(c0686p);
                return;
            case 25:
                b();
                return;
            case r.MIN_SDK_VERSION /* 26 */:
                c();
                return;
            case 27:
                d();
                return;
            default:
                if (((v0.o) this.f2h).f6082f.f6173f instanceof C0709a) {
                    return;
                }
                try {
                    l0.i iVar2 = (l0.i) ((w0.j) this.f1g).get();
                    if (iVar2 == null) {
                        throw new IllegalStateException("Worker was marked important (" + ((v0.o) this.f2h).f6084h.f6002c + ") but did not provide ForegroundInfo");
                    }
                    l0.q.d().a(v0.o.f6081l, "Updating notification for " + ((v0.o) this.f2h).f6084h.f6002c);
                    v0.o oVar2 = (v0.o) this.f2h;
                    w0.j jVar2 = oVar2.f6082f;
                    v0.q qVar3 = oVar2.f6086j;
                    Context context = oVar2.f6083g;
                    UUID id = oVar2.f6085i.getId();
                    qVar3.getClass();
                    w0.j jVar3 = new w0.j();
                    qVar3.f6093a.a(new v0.p(qVar3, jVar3, id, iVar2, context));
                    jVar2.k(jVar3);
                    return;
                } catch (Throwable th7) {
                    ((v0.o) this.f2h).f6082f.j(th7);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.f0f) {
            case 25:
                Runnable runnable = (Runnable) this.f1g;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i7 = ((q1.h) this.f2h).f5778h;
                sb.append(i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, int i7, boolean z5) {
        this.f0f = i7;
        this.f2h = obj;
        this.f1g = obj2;
    }

    public a(AbstractC0467a abstractC0467a, Runnable runnable, N3.j jVar) {
        this.f0f = 19;
        this.f1g = runnable;
        this.f2h = jVar;
    }

    public a(q1.h hVar) {
        this.f0f = 25;
        this.f2h = hVar;
    }
}
