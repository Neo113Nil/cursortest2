package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class lf implements Runnable {
    public final /* synthetic */ int d;
    public Object e;
    public final Object g;

    public /* synthetic */ lf(int i, Object obj, Object obj2, boolean z) {
        this.d = i;
        this.g = obj;
        this.e = obj2;
    }

    private final void a() {
        synchronized (((iu1) this.g).g) {
            ((qr0) ((iu1) this.g).h).h(((Task) this.e).getResult());
        }
    }

    private final void b() {
        tu1 tu1Var = (tu1) this.e;
        int i = ((vu1) this.g).a;
        synchronized (tu1Var) {
            vu1 vu1Var = (vu1) tu1Var.e.get(i);
            if (vu1Var != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + i);
                tu1Var.e.remove(i);
                vu1Var.b(new d91("Timed out waiting for response", null));
                tu1Var.c();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.e).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r10.e = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        defpackage.n91.j.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.e), (java.lang.Throwable) r3);
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
    public void c() {
        boolean z = false;
        boolean z2 = false;
        while (true) {
            try {
                synchronized (((n91) this.g).e) {
                    if (!z) {
                        n91 n91Var = (n91) this.g;
                        if (n91Var.g != 4) {
                            n91Var.h++;
                            n91Var.g = 4;
                            z = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((n91) this.g).e.poll();
                    this.e = runnable;
                    if (runnable == null) {
                        ((n91) this.g).g = 1;
                    }
                }
                if (!z2) {
                    return;
                }
            } finally {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        t60 t60Var;
        t60 t60Var2 = null;
        int i = 0;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return;
            case 1:
                ((tf) this.e).H((v50) this.g, Unit.a);
                return;
            case 2:
                dh0 dh0Var = (dh0) this.g;
                ln lnVar = dh0Var.h;
                while (true) {
                    try {
                        ((Runnable) this.e).run();
                    } catch (Throwable th) {
                        m90.z(th, g.d);
                    }
                    Runnable n = dh0Var.n();
                    if (n == null) {
                        return;
                    }
                    this.e = n;
                    i++;
                    if (i >= 16 && lnVar.l(dh0Var)) {
                        lnVar.f(dh0Var, this);
                        return;
                    }
                }
                break;
            case 3:
                ((i20) this.e).a(this.g);
                return;
            case 4:
                ((tf) this.g).H((ow) this.e, Unit.a);
                return;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                try {
                    c();
                    return;
                } catch (Error e) {
                    synchronized (((n91) this.g).e) {
                        ((n91) this.g).g = 1;
                        throw e;
                    }
                }
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                fm fmVar = (fm) this.e;
                gs1 gs1Var = (gs1) this.g;
                b8 b8Var = gs1Var.d;
                es1 es1Var = (es1) gs1Var.j.j.get(gs1Var.e);
                if (es1Var == null) {
                    return;
                }
                if (fmVar.e != 0) {
                    es1Var.o(fmVar, null);
                    return;
                }
                gs1Var.i = true;
                if (b8Var.k()) {
                    if (!gs1Var.i || (t60Var = gs1Var.g) == null) {
                        return;
                    }
                    b8Var.l(t60Var, gs1Var.h);
                    return;
                }
                try {
                    b8Var.l(null, b8Var.b());
                    return;
                } catch (SecurityException e2) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e2);
                    b8Var.c("Failed to get service from broker.");
                    es1Var.o(new fm(10), null);
                    return;
                }
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                ps1 ps1Var = (ps1) this.g;
                at1 at1Var = (at1) this.e;
                fm fmVar2 = at1Var.e;
                if (fmVar2.e == 0) {
                    ht1 ht1Var = at1Var.g;
                    y90.i(ht1Var);
                    fm fmVar3 = ht1Var.g;
                    if (fmVar3.e != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(fmVar3)), new Exception());
                        ps1Var.i.a(fmVar3);
                        ps1Var.h.n();
                        return;
                    }
                    gs1 gs1Var2 = ps1Var.i;
                    IBinder iBinder = ht1Var.e;
                    if (iBinder != null) {
                        int i2 = a2.c;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        t60Var2 = queryLocalInterface instanceof t60 ? (t60) queryLocalInterface : new yu1(iBinder);
                    }
                    Set set = ps1Var.f;
                    gs1Var2.getClass();
                    if (t60Var2 == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        gs1Var2.a(new fm(4));
                    } else {
                        gs1Var2.g = t60Var2;
                        gs1Var2.h = set;
                        if (gs1Var2.i) {
                            gs1Var2.d.l(t60Var2, set);
                        }
                    }
                } else {
                    ps1Var.i.a(fmVar2);
                }
                ps1Var.h.n();
                return;
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                Task task = (Task) this.e;
                boolean i3 = task.i();
                zt1 zt1Var = (zt1) this.g;
                zu1 zu1Var = zt1Var.h;
                if (i3) {
                    zu1Var.n();
                    return;
                }
                try {
                    zu1Var.m(zt1Var.g.n(task));
                    return;
                } catch (w41 e3) {
                    if (e3.getCause() instanceof Exception) {
                        zu1Var.l((Exception) e3.getCause());
                        return;
                    } else {
                        zu1Var.l(e3);
                        return;
                    }
                } catch (Exception e4) {
                    zu1Var.l(e4);
                    return;
                }
            case 9:
                zt1 zt1Var2 = (zt1) this.g;
                zu1 zu1Var2 = zt1Var2.h;
                try {
                    Task task2 = (Task) zt1Var2.g.n((Task) this.e);
                    if (task2 == null) {
                        zt1Var2.d(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    du1 du1Var = og1.b;
                    task2.e(du1Var, zt1Var2);
                    task2.c(du1Var, zt1Var2);
                    task2.a(du1Var, zt1Var2);
                    return;
                } catch (w41 e5) {
                    if (e5.getCause() instanceof Exception) {
                        zu1Var2.l((Exception) e5.getCause());
                        return;
                    } else {
                        zu1Var2.l(e5);
                        return;
                    }
                } catch (Exception e6) {
                    zu1Var2.l(e6);
                    return;
                }
            case RequestError.EVENT_TIMEOUT /* 10 */:
                synchronized (((iu1) this.g).g) {
                    try {
                        OnCompleteListener onCompleteListener = (OnCompleteListener) ((iu1) this.g).h;
                        if (onCompleteListener != null) {
                            onCompleteListener.onComplete((Task) this.e);
                        }
                    } finally {
                    }
                }
                return;
            case RequestError.STOP_TRACKING /* 11 */:
                tu1 tu1Var = (tu1) this.e;
                IBinder iBinder2 = (IBinder) this.g;
                synchronized (tu1Var) {
                    if (iBinder2 == null) {
                        tu1Var.a("Null service connection");
                    } else {
                        try {
                            tu1Var.c = new c51(iBinder2);
                            tu1Var.a = 2;
                            ((ScheduledExecutorService) tu1Var.f.c).execute(new lu1(tu1Var, i));
                        } catch (RemoteException e7) {
                            tu1Var.a(e7.getMessage());
                        }
                    }
                }
                return;
            case 12:
                synchronized (((iu1) this.g).g) {
                    mr0 mr0Var = (mr0) ((iu1) this.g).h;
                    Exception exception = ((Task) this.e).getException();
                    y90.i(exception);
                    mr0Var.d(exception);
                }
                return;
            case 13:
                a();
                return;
            case 14:
                b();
                return;
            case 15:
                iu1 iu1Var = (iu1) this.g;
                zu1 zu1Var3 = (zu1) iu1Var.h;
                try {
                    zu1 n2 = ((if1) iu1Var.g).n(((Task) this.e).getResult());
                    du1 du1Var2 = og1.b;
                    n2.e(du1Var2, iu1Var);
                    n2.c(du1Var2, iu1Var);
                    n2.a(du1Var2, iu1Var);
                    return;
                } catch (CancellationException unused) {
                    iu1Var.a();
                    return;
                } catch (w41 e8) {
                    if (e8.getCause() instanceof Exception) {
                        iu1Var.d((Exception) e8.getCause());
                        return;
                    } else {
                        zu1Var3.l(e8);
                        return;
                    }
                } catch (Exception e9) {
                    zu1Var3.l(e9);
                    return;
                }
            default:
                zu1 zu1Var4 = (zu1) this.e;
                try {
                    zu1Var4.m(((Callable) this.g).call());
                    return;
                } catch (Exception e10) {
                    zu1Var4.l(e10);
                    return;
                } catch (Throwable th2) {
                    zu1Var4.l(new RuntimeException(th2));
                    return;
                }
        }
    }

    public String toString() {
        switch (this.d) {
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                Runnable runnable = (Runnable) this.e;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((n91) this.g).g;
                sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ lf(Object obj, int i, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    public lf(n91 n91Var) {
        this.d = 5;
        this.g = n91Var;
    }
}
