package u5;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import c6.p;
import c6.s;
import c7.c0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9658e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f9659i;

    public /* synthetic */ n(int i3, Object obj, Object obj2) {
        this.f9657d = i3;
        this.f9658e = obj;
        this.f9659i = obj2;
    }

    private final void a() {
        IBinder iBinder = (IBinder) this.f9658e;
        y6.j jVar = (y6.j) this.f9659i;
        synchronized (jVar) {
            if (iBinder == null) {
                jVar.b("Null service connection");
                return;
            }
            try {
                jVar.f10649c = new s(iBinder);
                jVar.f10647a = 2;
                ((ScheduledExecutorService) jVar.f10652f.f10661i).execute(new y6.h(jVar, 1));
            } catch (RemoteException e2) {
                jVar.b(e2.getMessage());
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9657d) {
            case 0:
                if (((o) this.f9658e).E.f3948d instanceof e6.a) {
                    return;
                }
                try {
                    ((ListenableFuture) this.f9659i).get();
                    t5.o.d().a(o.G, "Starting work for " + ((o) this.f9658e).f9664s.f1841c);
                    o oVar = (o) this.f9658e;
                    oVar.E.k(oVar.f9665t.startWork());
                    return;
                } catch (Throwable th) {
                    ((o) this.f9658e).E.j(th);
                    return;
                }
            case 1:
                String str = (String) this.f9659i;
                o oVar2 = (o) this.f9658e;
                p pVar = oVar2.f9664s;
                try {
                    try {
                        t5.m mVar = (t5.m) oVar2.E.get();
                        if (mVar == null) {
                            t5.o.d().b(o.G, pVar.f1841c + " returned a null result. Treating it as a failure.");
                        } else {
                            t5.o.d().a(o.G, pVar.f1841c + " returned a " + mVar + ".");
                            oVar2.f9667v = mVar;
                        }
                    } catch (Throwable th2) {
                        oVar2.b();
                        throw th2;
                    }
                } catch (InterruptedException e2) {
                    e = e2;
                    t5.o.d().c(o.G, str + " failed because it threw an exception/error", e);
                } catch (CancellationException e9) {
                    t5.o d10 = t5.o.d();
                    String str2 = o.G;
                    String str3 = str + " was cancelled";
                    if (d10.f9314a <= 4) {
                        Log.i(str2, str3, e9);
                    }
                } catch (ExecutionException e10) {
                    e = e10;
                    t5.o.d().c(o.G, str + " failed because it threw an exception/error", e);
                }
                oVar2.b();
                return;
            case 2:
                t5.o d11 = t5.o.d();
                String str4 = v5.a.f9954d;
                StringBuilder sb2 = new StringBuilder("Scheduling work ");
                p pVar2 = (p) this.f9659i;
                sb2.append(pVar2.f1839a);
                d11.a(str4, sb2.toString());
                ((v5.a) this.f9658e).f9955a.d(pVar2);
                return;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                Task task = (Task) this.f9659i;
                boolean i3 = task.i();
                w7.j jVar = (w7.j) this.f9658e;
                if (i3) {
                    jVar.f10124r.n();
                    return;
                }
                try {
                    jVar.f10124r.l(jVar.f10123i.f(task));
                    return;
                } catch (w7.e e11) {
                    if (!(e11.getCause() instanceof Exception)) {
                        jVar.f10124r.m(e11);
                        return;
                    } else {
                        jVar.f10124r.m((Exception) e11.getCause());
                        return;
                    }
                } catch (Exception e12) {
                    jVar.f10124r.m(e12);
                    return;
                }
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                w7.j jVar2 = (w7.j) this.f9658e;
                try {
                    Task task2 = (Task) jVar2.f10123i.f((Task) this.f9659i);
                    if (task2 == null) {
                        jVar2.d(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    d6.n nVar = w7.h.f10119b;
                    task2.e(nVar, jVar2);
                    task2.c(nVar, jVar2);
                    task2.a(nVar, jVar2);
                    return;
                } catch (w7.e e13) {
                    if (!(e13.getCause() instanceof Exception)) {
                        jVar2.f10124r.m(e13);
                        return;
                    } else {
                        jVar2.f10124r.m((Exception) e13.getCause());
                        return;
                    }
                } catch (Exception e14) {
                    jVar2.f10124r.m(e14);
                    return;
                }
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                w7.k kVar = (w7.k) this.f9658e;
                synchronized (kVar.f10127i) {
                    try {
                        OnCompleteListener onCompleteListener = (OnCompleteListener) kVar.f10128r;
                        if (onCompleteListener != null) {
                            onCompleteListener.onComplete((Task) this.f9659i);
                        }
                    } finally {
                    }
                }
                return;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                w7.k kVar2 = (w7.k) this.f9658e;
                synchronized (kVar2.f10127i) {
                    try {
                        w7.c cVar = (w7.c) kVar2.f10128r;
                        if (cVar != null) {
                            Exception exception = ((Task) this.f9659i).getException();
                            c0.g(exception);
                            cVar.d(exception);
                        }
                    } finally {
                    }
                }
                return;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                w7.k kVar3 = (w7.k) this.f9658e;
                synchronized (kVar3.f10127i) {
                    try {
                        w7.d dVar = (w7.d) kVar3.f10128r;
                        if (dVar != null) {
                            dVar.b(((Task) this.f9659i).getResult());
                        }
                    } finally {
                    }
                }
                return;
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                w7.k kVar4 = (w7.k) this.f9658e;
                try {
                    w7.n d12 = ((w7.f) kVar4.f10127i).d(((Task) this.f9659i).getResult());
                    d6.n nVar2 = w7.h.f10119b;
                    d12.e(nVar2, kVar4);
                    d12.c(nVar2, kVar4);
                    d12.a(nVar2, kVar4);
                    return;
                } catch (CancellationException unused) {
                    kVar4.a();
                    return;
                } catch (w7.e e15) {
                    if (e15.getCause() instanceof Exception) {
                        kVar4.d((Exception) e15.getCause());
                        return;
                    } else {
                        ((w7.n) kVar4.f10128r).m(e15);
                        return;
                    }
                } catch (Exception e16) {
                    ((w7.n) kVar4.f10128r).m(e16);
                    return;
                }
            case 9:
                w7.n nVar3 = (w7.n) this.f9659i;
                try {
                    nVar3.l(((Callable) this.f9658e).call());
                    return;
                } catch (Exception e17) {
                    nVar3.m(e17);
                    return;
                } catch (Throwable th3) {
                    nVar3.m(new RuntimeException(th3));
                    return;
                }
            case 10:
                a();
                return;
            default:
                y6.k kVar5 = (y6.k) this.f9658e;
                y6.j jVar3 = (y6.j) this.f9659i;
                int i10 = kVar5.f10653a;
                synchronized (jVar3) {
                    SparseArray sparseArray = jVar3.f10651e;
                    y6.k kVar6 = (y6.k) sparseArray.get(i10);
                    if (kVar6 != null) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 20);
                        sb3.append("Timing out request: ");
                        sb3.append(i10);
                        Log.w("MessengerIpcClient", sb3.toString());
                        sparseArray.remove(i10);
                        kVar6.c(new b1.j("Timed out waiting for response", null, 8));
                        jVar3.d();
                    }
                }
                return;
        }
    }

    public /* synthetic */ n(int i3, Object obj, Object obj2, boolean z10) {
        this.f9657d = i3;
        this.f9659i = obj;
        this.f9658e = obj2;
    }
}
