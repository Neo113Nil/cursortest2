package B2;

import D.AbstractC0289i;
import D.C0288h;
import O2.AbstractBinderC0364a;
import O2.InterfaceC0373j;
import O7.AbstractC0395u;
import O7.AbstractC0399y;
import O7.C0382g;
import O7.S;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.webkit.WebView;
import androidx.work.Worker;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C3280gu;
import com.google.android.gms.internal.ads.C3400j7;
import com.google.android.gms.internal.ads.C3686oN;
import com.google.android.gms.internal.ads.C3710ou;
import com.google.android.gms.internal.ads.C4026un;
import com.google.android.gms.internal.ads.OD;
import f3.C4508g;
import g1.C4523c;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import v7.C5139j;

/* renamed from: B2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0272f implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f227n;

    /* renamed from: u, reason: collision with root package name */
    public Object f228u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f229v;

    public /* synthetic */ RunnableC0272f(int i, Object obj, Object obj2) {
        this.f227n = i;
        this.f228u = obj;
        this.f229v = obj2;
    }

    private final void a() {
        try {
            f();
        } catch (Error e6) {
            synchronized (((O3.j) this.f229v).f2518u) {
                ((O3.j) this.f229v).f2519v = 1;
                throw e6;
            }
        }
    }

    private final void b() {
        S0.p pVar;
        K0.f fVar = ((R0.a) this.f229v).f2781n.f1535f;
        String str = (String) this.f228u;
        synchronized (fVar.f1503E) {
            try {
                K0.q qVar = (K0.q) fVar.f1509y.get(str);
                if (qVar == null) {
                    qVar = (K0.q) fVar.f1510z.get(str);
                }
                pVar = qVar != null ? qVar.f1554x : null;
            } finally {
            }
        }
        if (pVar == null || !pVar.b()) {
            return;
        }
        synchronized (((R0.a) this.f229v).f2783v) {
            ((R0.a) this.f229v).f2786y.put(U2.a.e(pVar), pVar);
            ((R0.a) this.f229v).f2787z.add(pVar);
            R0.a aVar = (R0.a) this.f229v;
            aVar.f2779A.H(aVar.f2787z);
        }
    }

    private final void c() {
        try {
            ((Runnable) this.f229v).run();
            synchronized (((T0.l) this.f228u).f3054u) {
                ((T0.l) this.f228u).a();
            }
        } catch (Throwable th) {
            synchronized (((T0.l) this.f228u).f3054u) {
                ((T0.l) this.f228u).a();
                throw th;
            }
        }
    }

    private final void d() {
        synchronized (((h3.k) this.f229v).f38214u) {
            ((h3.c) ((h3.k) this.f229v).f38216w).o((h3.n) this.f228u);
        }
    }

    private final void e() {
        synchronized (((h3.k) this.f229v).f38214u) {
            try {
                h3.d dVar = (h3.d) ((h3.k) this.f229v).f38216w;
                if (dVar != null) {
                    Exception f6 = ((h3.n) this.f228u).f();
                    O2.w.h(f6);
                    dVar.B(f6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f228u).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r10.f228u = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        O3.j.f2516y.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f228u), (java.lang.Throwable) r3);
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
    public void f() {
        boolean z8 = false;
        boolean z9 = false;
        while (true) {
            try {
                synchronized (((O3.j) this.f229v).f2518u) {
                    if (!z8) {
                        O3.j jVar = (O3.j) this.f229v;
                        if (jVar.f2519v != 4) {
                            jVar.f2520w++;
                            jVar.f2519v = 4;
                            z8 = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((O3.j) this.f229v).f2518u.poll();
                    this.f228u = runnable;
                    if (runnable == null) {
                        ((O3.j) this.f229v).f2519v = 1;
                    }
                }
                if (!z9) {
                    return;
                }
            } finally {
                if (z9) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3280gu c3280gu;
        InterfaceC0373j interfaceC0373j;
        InterfaceC0373j k6;
        Set set;
        int i = 0;
        switch (this.f227n) {
            case 0:
                BinderC0278l binderC0278l = (BinderC0278l) this.f228u;
                binderC0278l.getClass();
                C4026un c4026un = ((C4026un[]) this.f229v)[0];
                if (c4026un != null) {
                    OD c4 = C3686oN.c(c4026un);
                    C3710ou c3710ou = binderC0278l.f273y;
                    synchronized (c3710ou) {
                        c3710ou.f33231a.addFirst(c4);
                    }
                    return;
                }
                return;
            case 1:
                C0267a c0267a = (C0267a) this.f228u;
                Uri parse = Uri.parse((String) this.f229v);
                try {
                    boolean booleanValue = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.vd)).booleanValue();
                    WebView webView = c0267a.f202b;
                    Context context = c0267a.f201a;
                    parse = (!booleanValue || (c3280gu = c0267a.f204d) == null) ? c0267a.f203c.b(parse, context, webView, null) : c3280gu.a(parse, context, webView, null);
                } catch (C3400j7 e6) {
                    int i4 = t2.C.f40822b;
                    u2.i.b("Failed to append the click signal to URL: ", e6);
                    p2.j.f39798C.f39808h.d("TaggingLibraryJsInterface.recordClick", e6);
                }
                c0267a.i.b(parse.toString(), null, null, null);
                return;
            case 2:
                ((C0288h) this.f228u).f522n = this.f229v;
                return;
            case 3:
                ((Application) this.f228u).unregisterActivityLifecycleCallbacks((C0288h) this.f229v);
                return;
            case 4:
                try {
                    Method method = AbstractC0289i.f531d;
                    Object obj = this.f229v;
                    Object obj2 = this.f228u;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC0289i.f532e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e9) {
                    if (e9.getClass() == RuntimeException.class && e9.getMessage() != null && e9.getMessage().startsWith("Unable to stop")) {
                        throw e9;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 5:
                C0382g c0382g = (C0382g) this.f228u;
                try {
                    c0382g.resumeWith(((J3.a) this.f229v).get());
                    return;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        cause = th2;
                    }
                    if (th2 instanceof CancellationException) {
                        c0382g.m(cause);
                        return;
                    } else {
                        c0382g.resumeWith(com.bumptech.glide.f.e(cause));
                        return;
                    }
                }
            case 6:
                U0.k kVar = (U0.k) this.f228u;
                try {
                    kVar.j(((Worker) this.f229v).getForegroundInfo());
                    return;
                } catch (Throwable th3) {
                    kVar.k(th3);
                    return;
                }
            case 7:
                if (((K0.q) this.f229v).J.f3237n instanceof U0.a) {
                    return;
                }
                try {
                    ((U0.k) this.f228u).get();
                    J0.s.d().a(K0.q.f1539L, "Starting work for " + ((K0.q) this.f229v).f1554x.f2922c);
                    K0.q qVar = (K0.q) this.f229v;
                    qVar.J.l(qVar.f1555y.startWork());
                    return;
                } catch (Throwable th4) {
                    ((K0.q) this.f229v).J.k(th4);
                    return;
                }
            case 8:
                String str = (String) this.f228u;
                K0.q qVar2 = (K0.q) this.f229v;
                try {
                    try {
                        J0.q qVar3 = (J0.q) qVar2.J.get();
                        if (qVar3 == null) {
                            J0.s.d().b(K0.q.f1539L, qVar2.f1554x.f2922c + " returned a null result. Treating it as a failure.");
                        } else {
                            J0.s.d().a(K0.q.f1539L, qVar2.f1554x.f2922c + " returned a " + qVar3 + com.anythink.core.common.d.j.f12535z);
                            qVar2.f1540A = qVar3;
                        }
                    } catch (Throwable th5) {
                        qVar2.b();
                        throw th5;
                    }
                } catch (InterruptedException e10) {
                    e = e10;
                    J0.s.d().c(K0.q.f1539L, str + " failed because it threw an exception/error", e);
                } catch (CancellationException e11) {
                    J0.s d2 = J0.s.d();
                    String str2 = K0.q.f1539L;
                    String str3 = str + " was cancelled";
                    if (d2.f1330a <= 4) {
                        Log.i(str2, str3, e11);
                    }
                } catch (ExecutionException e12) {
                    e = e12;
                    J0.s.d().c(K0.q.f1539L, str + " failed because it threw an exception/error", e);
                }
                qVar2.b();
                return;
            case 9:
                K2.k kVar2 = (K2.k) this.f228u;
                IBinder iBinder = (IBinder) this.f229v;
                synchronized (kVar2) {
                    if (iBinder == null) {
                        kVar2.a("Null service connection");
                    } else {
                        try {
                            kVar2.f1594v = new S0.s(iBinder);
                            kVar2.f1592n = 2;
                            ((ScheduledExecutorService) kVar2.f1597y.f1606c).execute(new K2.j(kVar2, i));
                        } catch (RemoteException e13) {
                            kVar2.a(e13.getMessage());
                        }
                    }
                }
                return;
            case 10:
                K2.k kVar3 = (K2.k) this.f228u;
                int i9 = ((K2.l) this.f229v).f1598a;
                synchronized (kVar3) {
                    K2.l lVar = (K2.l) kVar3.f1596x.get(i9);
                    if (lVar != null) {
                        Log.w("MessengerIpcClient", "Timing out request: " + i9);
                        kVar3.f1596x.remove(i9);
                        lVar.b(new K2.m("Timed out waiting for response", null));
                        kVar3.c();
                    }
                }
                return;
            case 11:
                F.b bVar = (F.b) ((C4523c) this.f228u).f37856u;
                if (bVar != null) {
                    bVar.h((Typeface) this.f229v);
                    return;
                }
                return;
            case 12:
                ((L.e) this.f228u).accept(this.f229v);
                return;
            case 13:
                J0.s d3 = J0.s.d();
                String str4 = L0.a.f1693d;
                StringBuilder sb = new StringBuilder("Scheduling work ");
                S0.p pVar = (S0.p) this.f228u;
                sb.append(pVar.f2920a);
                d3.a(str4, sb.toString());
                ((L0.a) this.f229v).f1694a.a(pVar);
                return;
            case 14:
                N2.E e14 = (N2.E) this.f229v;
                N2.C c9 = (N2.C) e14.f2002f.f2049C.get(e14.f1998b);
                if (c9 == null) {
                    return;
                }
                L2.b bVar2 = (L2.b) this.f228u;
                if (!bVar2.b()) {
                    c9.l(bVar2, null);
                    return;
                }
                e14.f2001e = true;
                M2.c cVar = e14.f1997a;
                if (cVar.n()) {
                    if (!e14.f2001e || (interfaceC0373j = e14.f1999c) == null) {
                        return;
                    }
                    cVar.g(interfaceC0373j, e14.f2000d);
                    return;
                }
                try {
                    cVar.g(null, cVar.b());
                    return;
                } catch (SecurityException e15) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e15);
                    cVar.c("Failed to get service from broker.");
                    c9.l(new L2.b(10, null, null), null);
                    return;
                }
            case 15:
                C4508g c4508g = (C4508g) this.f228u;
                L2.b bVar3 = c4508g.f37707u;
                boolean b9 = bVar3.b();
                N2.N n9 = (N2.N) this.f229v;
                if (b9) {
                    O2.t tVar = c4508g.f37708v;
                    O2.w.h(tVar);
                    L2.b bVar4 = tVar.f2472v;
                    if (!bVar4.b()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar4)), new Exception());
                        n9.f2025z.b(bVar4);
                        n9.f2024y.h();
                        return;
                    }
                    N2.E e16 = n9.f2025z;
                    IBinder iBinder2 = tVar.f2471u;
                    if (iBinder2 == null) {
                        k6 = null;
                    } else {
                        int i10 = AbstractBinderC0364a.f2379n;
                        IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        k6 = queryLocalInterface instanceof InterfaceC0373j ? (InterfaceC0373j) queryLocalInterface : new O2.K(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                    }
                    e16.getClass();
                    if (k6 == null || (set = n9.f2022w) == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        e16.b(new L2.b(4, null, null));
                    } else {
                        e16.f1999c = k6;
                        e16.f2000d = set;
                        if (e16.f2001e) {
                            e16.f1997a.g(k6, set);
                        }
                    }
                } else {
                    n9.f2025z.b(bVar3);
                }
                n9.f2024y.h();
                return;
            case 16:
                a();
                return;
            case 17:
                ((C0382g) this.f229v).B((S) this.f228u);
                return;
            case 18:
                ((C0382g) this.f228u).B((P7.e) this.f229v);
                return;
            case 19:
                b();
                return;
            case 20:
                c();
                return;
            case 21:
                if (((T0.p) this.f229v).f3066n.f3237n instanceof U0.a) {
                    return;
                }
                try {
                    J0.j jVar = (J0.j) ((U0.k) this.f228u).get();
                    if (jVar == null) {
                        throw new IllegalStateException("Worker was marked important (" + ((T0.p) this.f229v).f3068v.f2922c + ") but did not provide ForegroundInfo");
                    }
                    J0.s.d().a(T0.p.f3065z, "Updating notification for " + ((T0.p) this.f229v).f3068v.f2922c);
                    T0.p pVar2 = (T0.p) this.f229v;
                    U0.k kVar4 = pVar2.f3066n;
                    T0.r rVar = pVar2.f3070x;
                    Context context2 = pVar2.f3067u;
                    UUID id = pVar2.f3069w.getId();
                    rVar.getClass();
                    U0.k kVar5 = new U0.k();
                    rVar.f3078a.i(new T0.q(rVar, kVar5, id, jVar, context2));
                    kVar4.l(kVar5);
                    return;
                } catch (Throwable th6) {
                    ((T0.p) this.f229v).f3066n.k(th6);
                    return;
                }
            case 22:
                int i11 = 0;
                while (true) {
                    try {
                        ((Runnable) this.f228u).run();
                    } catch (Throwable th7) {
                        AbstractC0399y.l(th7, C5139j.f41372n);
                    }
                    T7.i iVar = (T7.i) this.f229v;
                    Runnable B8 = iVar.B();
                    if (B8 == null) {
                        return;
                    }
                    this.f228u = B8;
                    i11++;
                    if (i11 >= 16) {
                        AbstractC0395u abstractC0395u = iVar.f3145v;
                        if (abstractC0395u.z()) {
                            abstractC0395u.p(iVar, this);
                            return;
                        }
                    }
                }
            case 23:
                Y2.e eVar = (Y2.e) this.f228u;
                Context context3 = (Context) eVar.f3963u;
                String string = Y2.e.O(context3).getString("app_set_id", null);
                long j9 = Y2.e.O((Context) eVar.f3963u).getLong("app_set_id_last_used_time", -1L);
                long j10 = j9 != -1 ? 33696000000L + j9 : -1L;
                h3.h hVar = (h3.h) this.f229v;
                if (string == null || System.currentTimeMillis() > j10) {
                    string = UUID.randomUUID().toString();
                    try {
                        if (!context3.getSharedPreferences("app_set_id_storage", 0).edit().putString("app_set_id", string).commit()) {
                            String valueOf = String.valueOf(context3.getPackageName());
                            Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(valueOf) : new String("Failed to store app set ID generated for App "));
                            throw new Y2.d("Failed to store the app set ID.");
                        }
                        Y2.e.P(context3);
                        if (!context3.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String valueOf2 = String.valueOf(context3.getPackageName());
                            Log.e("AppSet", valueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(valueOf2) : new String("Failed to store app set ID creation time for App "));
                            throw new Y2.d("Failed to store the app set ID creation time.");
                        }
                    } catch (Y2.d e17) {
                        hVar.a(e17);
                        return;
                    }
                } else {
                    try {
                        Y2.e.P(context3);
                    } catch (Y2.d e18) {
                        hVar.a(e18);
                        return;
                    }
                }
                hVar.b(new H2.b(string, 1));
                return;
            case 24:
                B1.x a9 = B1.x.a();
                a9.getClass();
                N1.p.a();
                a9.f134d.set(true);
                ((com.bumptech.glide.manager.d) this.f229v).f23607u.f23609u = true;
                ((com.bumptech.glide.manager.d) this.f229v).f23606n.getViewTreeObserver().removeOnDrawListener((com.bumptech.glide.manager.d) this.f228u);
                ((com.bumptech.glide.manager.d) this.f229v).f23607u.f23608n.clear();
                return;
            case 25:
                if (((h3.n) this.f228u).f38223d) {
                    ((h3.j) this.f229v).f38212w.m();
                    return;
                }
                try {
                    ((h3.j) this.f229v).f38212w.l(((h3.j) this.f229v).f38211v.s((h3.n) this.f228u));
                    return;
                } catch (h3.f e19) {
                    if (e19.getCause() instanceof Exception) {
                        ((h3.j) this.f229v).f38212w.k((Exception) e19.getCause());
                        return;
                    } else {
                        ((h3.j) this.f229v).f38212w.k(e19);
                        return;
                    }
                } catch (Exception e20) {
                    ((h3.j) this.f229v).f38212w.k(e20);
                    return;
                }
            case 26:
                h3.j jVar2 = (h3.j) this.f229v;
                try {
                    h3.n nVar = (h3.n) jVar2.f38211v.s((h3.n) this.f228u);
                    if (nVar == null) {
                        jVar2.B(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    N1.f fVar = h3.i.f38208b;
                    nVar.c(fVar, jVar2);
                    nVar.b(fVar, jVar2);
                    nVar.f38221b.f(new h3.k(fVar, (h3.b) jVar2));
                    nVar.o();
                    return;
                } catch (h3.f e21) {
                    if (e21.getCause() instanceof Exception) {
                        jVar2.f38212w.k((Exception) e21.getCause());
                        return;
                    } else {
                        jVar2.f38212w.k(e21);
                        return;
                    }
                } catch (Exception e22) {
                    jVar2.f38212w.k(e22);
                    return;
                }
            case 27:
                d();
                return;
            case 28:
                e();
                return;
            default:
                synchronized (((h3.k) this.f229v).f38214u) {
                    try {
                        h3.e eVar2 = (h3.e) ((h3.k) this.f229v).f38216w;
                        if (eVar2 != null) {
                            eVar2.l(((h3.n) this.f228u).g());
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public String toString() {
        switch (this.f227n) {
            case 16:
                Runnable runnable = (Runnable) this.f228u;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((O3.j) this.f229v).f2519v;
                sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ RunnableC0272f(Object obj, Object obj2, int i, boolean z8) {
        this.f227n = i;
        this.f229v = obj;
        this.f228u = obj2;
    }

    public RunnableC0272f(O3.j jVar) {
        this.f227n = 16;
        this.f229v = jVar;
    }
}
