package F;

import G0.q;
import G0.s;
import H0.r;
import P0.p;
import android.content.Context;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import androidx.work.Worker;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.y;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import n.U;
import n6.AbstractC0786t;
import n6.AbstractC0792z;
import n6.C0775h;
import n6.S;
import o6.C0809e;
import p1.RunnableC0825h;
import r1.InterfaceC0844c;
import s1.BinderC0864F;
import s1.C0873d;
import s1.v;
import s1.x;
import t1.AbstractBinderC0914a;
import t1.C0912I;
import t1.InterfaceC0919f;
import t1.u;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f714d;

    /* renamed from: e, reason: collision with root package name */
    public Object f715e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f716i;

    public /* synthetic */ a(int i2, Object obj, Object obj2, boolean z7) {
        this.f714d = i2;
        this.f716i = obj;
        this.f715e = obj2;
    }

    private final void a() {
        p pVar;
        H0.f fVar = ((O0.b) this.f716i).f1904d.f923f;
        String str = (String) this.f715e;
        synchronized (fVar.f898t) {
            try {
                r rVar = (r) fVar.f892n.get(str);
                if (rVar == null) {
                    rVar = (r) fVar.f893o.get(str);
                }
                pVar = rVar != null ? rVar.f941m : null;
            } finally {
            }
        }
        if (pVar == null || !pVar.b()) {
            return;
        }
        synchronized (((O0.b) this.f716i).f1906i) {
            ((O0.b) this.f716i).f1909n.put(AbstractC1053a.x(pVar), pVar);
            ((O0.b) this.f716i).f1910o.add(pVar);
            O0.b bVar = (O0.b) this.f716i;
            bVar.f1911p.Y(bVar.f1910o);
        }
    }

    private final void b() {
        try {
            ((Runnable) this.f716i).run();
            synchronized (((Q0.m) this.f715e).f2311e) {
                ((Q0.m) this.f715e).a();
            }
        } catch (Throwable th) {
            synchronized (((Q0.m) this.f715e).f2311e) {
                ((Q0.m) this.f715e).a();
                throw th;
            }
        }
    }

    private final void c() {
        IBinder iBinder = (IBinder) this.f716i;
        p1.j jVar = (p1.j) this.f715e;
        synchronized (jVar) {
            if (iBinder == null) {
                jVar.b("Null service connection");
                return;
            }
            try {
                jVar.f7181c = new P0.e(iBinder);
                jVar.f7179a = 2;
                ((ScheduledExecutorService) jVar.f7184f.f7193c).execute(new RunnableC0825h(jVar, 1));
            } catch (RemoteException e7) {
                jVar.b(e7.getMessage());
            }
        }
    }

    private final void d() {
        p1.k kVar = (p1.k) this.f716i;
        p1.j jVar = (p1.j) this.f715e;
        int i2 = kVar.f7185a;
        synchronized (jVar) {
            SparseArray sparseArray = jVar.f7183e;
            p1.k kVar2 = (p1.k) sparseArray.get(i2);
            if (kVar2 != null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 20);
                sb.append("Timing out request: ");
                sb.append(i2);
                Log.w("MessengerIpcClient", sb.toString());
                sparseArray.remove(i2);
                kVar2.c(new y("Timed out waiting for response", null));
                jVar.d();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f715e).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r10.f715e = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        T1.j.f2591n.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f715e), (java.lang.Throwable) r3);
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
        boolean z7 = false;
        boolean z8 = false;
        while (true) {
            try {
                synchronized (((T1.j) this.f716i).f2593e) {
                    if (!z7) {
                        T1.j jVar = (T1.j) this.f716i;
                        if (jVar.f2594i != 4) {
                            jVar.f2595l++;
                            jVar.f2594i = 4;
                            z7 = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((T1.j) this.f716i).f2593e.poll();
                    this.f715e = runnable;
                    if (runnable == null) {
                        ((T1.j) this.f716i).f2594i = 1;
                    }
                }
                if (!z8) {
                    return;
                }
            } finally {
                if (z8) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0919f interfaceC0919f;
        InterfaceC0919f c0912i;
        switch (this.f714d) {
            case 0:
                B.f fVar = (B.f) this.f715e;
                Typeface typeface = (Typeface) this.f716i;
                U u7 = (U) fVar.f152e;
                if (u7 != null) {
                    u7.b(typeface);
                    return;
                }
                return;
            case 1:
                ((h) this.f715e).accept(this.f716i);
                return;
            case 2:
                C0775h c0775h = (C0775h) this.f715e;
                try {
                    R5.l lVar = R5.n.f2421d;
                    c0775h.resumeWith(((O1.a) this.f716i).get());
                    return;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        cause = th;
                    }
                    if (th instanceof CancellationException) {
                        c0775h.n(cause);
                        return;
                    } else {
                        R5.l lVar2 = R5.n.f2421d;
                        c0775h.resumeWith(V6.b.n(cause));
                        return;
                    }
                }
            case 3:
                try {
                    ((Worker) this.f716i).getClass();
                    throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
                } catch (Throwable th2) {
                    ((R0.k) this.f715e).j(th2);
                    return;
                }
            case 4:
                if (((r) this.f716i).f953y.f2395d instanceof R0.a) {
                    return;
                }
                try {
                    ((O1.a) this.f715e).get();
                    s.d().a(r.f936A, "Starting work for " + ((r) this.f716i).f941m.f2222c);
                    r rVar = (r) this.f716i;
                    rVar.f953y.k(rVar.f942n.startWork());
                    return;
                } catch (Throwable th3) {
                    ((r) this.f716i).f953y.j(th3);
                    return;
                }
            case 5:
                String str = (String) this.f715e;
                r rVar2 = (r) this.f716i;
                try {
                    try {
                        q qVar = (q) rVar2.f953y.get();
                        if (qVar == null) {
                            s.d().b(r.f936A, rVar2.f941m.f2222c + " returned a null result. Treating it as a failure.");
                        } else {
                            s.d().a(r.f936A, rVar2.f941m.f2222c + " returned a " + qVar + ".");
                            rVar2.f944p = qVar;
                        }
                    } catch (Throwable th4) {
                        rVar2.b();
                        throw th4;
                    }
                } catch (InterruptedException e7) {
                    e = e7;
                    s.d().c(r.f936A, str + " failed because it threw an exception/error", e);
                } catch (CancellationException e8) {
                    s d7 = s.d();
                    String str2 = r.f936A;
                    String str3 = str + " was cancelled";
                    if (d7.f824a <= 4) {
                        Log.i(str2, str3, e8);
                    }
                } catch (ExecutionException e9) {
                    e = e9;
                    s.d().c(r.f936A, str + " failed because it threw an exception/error", e);
                }
                rVar2.b();
                return;
            case 6:
                s d8 = s.d();
                String str4 = I0.a.f1250d;
                StringBuilder sb = new StringBuilder("Scheduling work ");
                p pVar = (p) this.f715e;
                sb.append(pVar.f2220a);
                d8.a(str4, sb.toString());
                ((I0.a) this.f716i).f1251a.e(pVar);
                return;
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                K1.j jVar = (K1.j) this.f716i;
                Task task = (Task) this.f715e;
                if (task.i()) {
                    jVar.f1434l.n();
                    return;
                }
                try {
                    jVar.f1434l.l(jVar.f1433i.h(task));
                    return;
                } catch (K1.f e10) {
                    if (e10.getCause() instanceof Exception) {
                        jVar.f1434l.m((Exception) e10.getCause());
                        return;
                    } else {
                        jVar.f1434l.m(e10);
                        return;
                    }
                } catch (Exception e11) {
                    jVar.f1434l.m(e11);
                    return;
                }
            case S.j.BYTES_FIELD_NUMBER /* 8 */:
                K1.j jVar2 = (K1.j) this.f716i;
                try {
                    Task task2 = (Task) jVar2.f1433i.h((Task) this.f715e);
                    if (task2 == null) {
                        jVar2.s(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    K1.n nVar = K1.i.f1430b;
                    task2.e(nVar, jVar2);
                    task2.c(nVar, jVar2);
                    task2.a(nVar, jVar2);
                    return;
                } catch (K1.f e12) {
                    if (e12.getCause() instanceof Exception) {
                        jVar2.f1434l.m((Exception) e12.getCause());
                        return;
                    } else {
                        jVar2.f1434l.m(e12);
                        return;
                    }
                } catch (Exception e13) {
                    jVar2.f1434l.m(e13);
                    return;
                }
            case 9:
                K1.k kVar = (K1.k) this.f716i;
                synchronized (kVar.f1437i) {
                    try {
                        OnCompleteListener onCompleteListener = (OnCompleteListener) kVar.f1438l;
                        if (onCompleteListener != null) {
                            onCompleteListener.onComplete((Task) this.f715e);
                        }
                    } finally {
                    }
                }
                return;
            case 10:
                K1.k kVar2 = (K1.k) this.f716i;
                synchronized (kVar2.f1437i) {
                    try {
                        K1.d dVar = (K1.d) kVar2.f1438l;
                        if (dVar != null) {
                            Exception exception = ((Task) this.f715e).getException();
                            u.f(exception);
                            dVar.s(exception);
                        }
                    } finally {
                    }
                }
                return;
            case RequestError.STOP_TRACKING /* 11 */:
                K1.k kVar3 = (K1.k) this.f716i;
                synchronized (kVar3.f1437i) {
                    try {
                        K1.e eVar = (K1.e) kVar3.f1438l;
                        if (eVar != null) {
                            eVar.k(((Task) this.f715e).getResult());
                        }
                    } finally {
                    }
                }
                return;
            case 12:
                K1.k kVar4 = (K1.k) this.f716i;
                try {
                    K1.p f7 = ((K1.g) kVar4.f1437i).f(((Task) this.f715e).getResult());
                    K1.n nVar2 = K1.i.f1430b;
                    f7.e(nVar2, kVar4);
                    f7.c(nVar2, kVar4);
                    f7.a(nVar2, kVar4);
                    return;
                } catch (K1.f e14) {
                    if (e14.getCause() instanceof Exception) {
                        kVar4.s((Exception) e14.getCause());
                        return;
                    } else {
                        kVar4.s(e14);
                        return;
                    }
                } catch (CancellationException unused) {
                    kVar4.i();
                    return;
                } catch (Exception e15) {
                    kVar4.s(e15);
                    return;
                }
            case 13:
                K1.p pVar2 = (K1.p) this.f715e;
                try {
                    pVar2.l(((Callable) this.f716i).call());
                    return;
                } catch (Exception e16) {
                    pVar2.m(e16);
                    return;
                } catch (Throwable th5) {
                    pVar2.m(new RuntimeException(th5));
                    return;
                }
            case 14:
                ((s4.p) this.f715e).success(this.f716i);
                return;
            case 15:
                ((s4.p) this.f715e).error(com.onesignal.common.threading.a.BASE_THREAD_NAME, (String) this.f716i, null);
                return;
            case 16:
                try {
                    ((Runnable) this.f715e).run();
                    return;
                } catch (Exception e17) {
                    com.onesignal.debug.internal.logging.b.error("Encountered an error while handling a Flutter method call: " + e17.toString(), e17);
                    M2.a.d(e17.getMessage(), (r4.l) this.f716i);
                    return;
                }
            case 17:
                a();
                return;
            case 18:
                b();
                return;
            case 19:
                if (((Q0.q) this.f716i).f2323d.f2395d instanceof R0.a) {
                    return;
                }
                try {
                    G0.j jVar3 = (G0.j) ((R0.k) this.f715e).get();
                    if (jVar3 == null) {
                        throw new IllegalStateException("Worker was marked important (" + ((Q0.q) this.f716i).f2325i.f2222c + ") but did not provide ForegroundInfo");
                    }
                    s.d().a(Q0.q.f2322o, "Updating notification for " + ((Q0.q) this.f716i).f2325i.f2222c);
                    Q0.q qVar2 = (Q0.q) this.f716i;
                    R0.k kVar5 = qVar2.f2323d;
                    Q0.s sVar = qVar2.f2327m;
                    Context context = qVar2.f2324e;
                    UUID id = qVar2.f2326l.getId();
                    sVar.getClass();
                    R0.k kVar6 = new R0.k();
                    sVar.f2334a.r(new Q0.r(sVar, kVar6, id, jVar3, context));
                    kVar5.k(kVar6);
                    return;
                } catch (Throwable th6) {
                    ((Q0.q) this.f716i).f2323d.j(th6);
                    return;
                }
            case 20:
                try {
                    e();
                    return;
                } catch (Error e18) {
                    synchronized (((T1.j) this.f716i).f2593e) {
                        ((T1.j) this.f716i).f2594i = 1;
                        throw e18;
                    }
                }
            case 21:
                ((C0775h) this.f716i).B((S) this.f715e, Unit.f6114a);
                return;
            case 22:
                ((C0775h) this.f715e).B((C0809e) this.f716i, Unit.f6114a);
                return;
            case 23:
                c();
                return;
            case 24:
                d();
                return;
            case 25:
                q1.b bVar = (q1.b) this.f715e;
                x xVar = (x) this.f716i;
                C0873d c0873d = xVar.f7754f;
                InterfaceC0844c interfaceC0844c = xVar.f7749a;
                v vVar = (v) c0873d.j.get(xVar.f7750b);
                if (vVar == null) {
                    return;
                }
                if (!bVar.b()) {
                    vVar.k(bVar, null);
                    return;
                }
                xVar.f7753e = true;
                if (interfaceC0844c.b()) {
                    if (!xVar.f7753e || (interfaceC0919f = xVar.f7751c) == null) {
                        return;
                    }
                    ((com.google.android.gms.common.internal.a) interfaceC0844c).h(interfaceC0919f, xVar.f7752d);
                    return;
                }
                try {
                    com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) interfaceC0844c;
                    ((com.google.android.gms.common.internal.a) interfaceC0844c).h(null, aVar.b() ? aVar.f4376C : Collections.EMPTY_SET);
                    return;
                } catch (SecurityException e19) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e19);
                    ((com.google.android.gms.common.internal.a) interfaceC0844c).e("Failed to get service from broker.");
                    vVar.k(new q1.b(10, null, null), null);
                    return;
                }
            case com.onesignal.debug.internal.crash.f.MIN_SDK_VERSION /* 26 */:
                BinderC0864F binderC0864F = (BinderC0864F) this.f716i;
                I1.h hVar = (I1.h) this.f715e;
                binderC0864F.getClass();
                q1.b bVar2 = hVar.f1275e;
                if (bVar2.b()) {
                    t1.r rVar3 = hVar.f1276i;
                    u.f(rVar3);
                    q1.b bVar3 = rVar3.f7991i;
                    if (!bVar3.b()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar3)), new Exception());
                        binderC0864F.f7617k.b(bVar3);
                        binderC0864F.j.d();
                        return;
                    }
                    x xVar2 = binderC0864F.f7617k;
                    IBinder iBinder = rVar3.f7990e;
                    if (iBinder == null) {
                        c0912i = null;
                    } else {
                        int i2 = AbstractBinderC0914a.f7923f;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        c0912i = queryLocalInterface instanceof InterfaceC0919f ? (InterfaceC0919f) queryLocalInterface : new C0912I(iBinder);
                    }
                    Set set = binderC0864F.f7615h;
                    xVar2.getClass();
                    if (c0912i == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        xVar2.b(new q1.b(4, null, null));
                    } else {
                        xVar2.f7751c = c0912i;
                        xVar2.f7752d = set;
                        if (xVar2.f7753e) {
                            ((com.google.android.gms.common.internal.a) xVar2.f7749a).h(c0912i, set);
                        }
                    }
                } else {
                    binderC0864F.f7617k.b(bVar2);
                }
                binderC0864F.j.d();
                return;
            case 27:
                s6.g gVar = (s6.g) this.f716i;
                AbstractC0786t abstractC0786t = gVar.f7833l;
                int i5 = 0;
                while (true) {
                    try {
                        ((Runnable) this.f715e).run();
                    } catch (Throwable th7) {
                        AbstractC0792z.i(th7, kotlin.coroutines.g.f6146d);
                    }
                    Runnable I7 = gVar.I();
                    if (I7 == null) {
                        return;
                    }
                    this.f715e = I7;
                    i5++;
                    if (i5 >= 16 && abstractC0786t.G(gVar)) {
                        abstractC0786t.E(gVar, this);
                        return;
                    }
                }
                break;
            default:
                ((y.c) this.f715e).f8449d = this.f716i;
                return;
        }
    }

    public String toString() {
        switch (this.f714d) {
            case 20:
                Runnable runnable = (Runnable) this.f715e;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i2 = ((T1.j) this.f716i).f2594i;
                sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(Object obj, int i2, Object obj2) {
        this.f714d = i2;
        this.f715e = obj;
        this.f716i = obj2;
    }

    public a(M2.a aVar, Runnable runnable, r4.l lVar) {
        this.f714d = 16;
        this.f715e = runnable;
        this.f716i = lVar;
    }

    public a(T1.j jVar) {
        this.f714d = 20;
        this.f716i = jVar;
    }
}
