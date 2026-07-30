package D5;

import B1.w;
import F.d;
import K0.f;
import M7.j;
import M7.q;
import N3.o;
import N3.p;
import O.C0350l;
import T0.l;
import U0.k;
import a7.C0433a;
import android.app.job.JobParameters;
import android.graphics.Typeface;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.activity.G;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.anythink.core.common.v.m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.FirebaseMessaging;
import com.icefishing.icefishingliveapp.A;
import com.icefishing.icefishingliveapp.E;
import com.icefishing.icefishingliveapp.SplashActivity;
import com.onesignal.user.internal.d;
import com.onesignal.user.internal.e;
import g1.C4523c;
import j7.e;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f701n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f702u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f703v;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.f701n = i;
        this.f702u = obj;
        this.f703v = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x02a5, code lost:
    
        if (r0 != null) goto L119;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable th;
        String message;
        String str;
        w wVar;
        switch (this.f701n) {
            case 0:
                h.e((c) this.f703v, "this$0");
                U6.c cVar = (U6.c) this.f702u;
                if (cVar.b()) {
                    Log.d("OneSignalOtel", "OTEL export response received: success");
                    return;
                }
                synchronized (cVar.f3315d) {
                    th = cVar.f3313b;
                }
                String str2 = m.f16967e;
                if (th != null) {
                    try {
                    } catch (Throwable unused) {
                        message = th.getMessage();
                        break;
                    }
                    if (q.B(th.getClass().getName(), "FailedExportException$HttpExportException")) {
                        Object invoke = th.getClass().getMethod("getResponse", new Class[0]).invoke(th, new Object[0]);
                        if (invoke == null) {
                            message = th.getMessage();
                            if (message == null) {
                            }
                            str2 = message;
                        } else {
                            Object invoke2 = invoke.getClass().getMethod("statusCode", new Class[0]).invoke(invoke, new Object[0]);
                            Object invoke3 = invoke.getClass().getMethod("statusMessage", new Class[0]).invoke(invoke, new Object[0]);
                            Object invoke4 = invoke.getClass().getMethod("responseBody", new Class[0]).invoke(invoke, new Object[0]);
                            byte[] bArr = invoke4 instanceof byte[] ? (byte[]) invoke4 : null;
                            String str3 = bArr != null ? new String(bArr, M7.a.f1916a) : null;
                            StringBuilder sb = new StringBuilder("status=");
                            sb.append(invoke2);
                            sb.append(" message=");
                            sb.append(invoke3);
                            if (str3 != null && !j.T(str3)) {
                                str = " body=".concat(str3);
                                sb.append(str);
                                str2 = sb.toString();
                            }
                            str = "";
                            sb.append(str);
                            str2 = sb.toString();
                        }
                    } else {
                        message = th.getMessage();
                        if (message == null) {
                        }
                        str2 = message;
                    }
                }
                Log.e("OneSignalOtel", "OTEL export response received: failed - " + str2, th);
                return;
            case 1:
                ((F.b) this.f702u).h((Typeface) this.f703v);
                return;
            case 2:
                ((f) this.f702u).b((S0.j) this.f703v, false);
                return;
            case 3:
                K0.q qVar = (K0.q) this.f702u;
                k kVar = (k) this.f703v;
                if (qVar.J.f3237n instanceof U0.a) {
                    kVar.cancel(true);
                    return;
                }
                return;
            case 4:
                d dVar = (d) this.f702u;
                dVar.getClass();
                M6.c cVar2 = (M6.c) this.f703v;
                cVar2.e();
                ((ConcurrentLinkedDeque) dVar.f909c).add(cVar2);
                return;
            case 5:
                p pVar = (p) this.f702u;
                Y3.a aVar = (Y3.a) this.f703v;
                if (pVar.f2191b != p.f2189d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (pVar) {
                    wVar = pVar.f2190a;
                    pVar.f2190a = null;
                    pVar.f2191b = aVar;
                }
                wVar.getClass();
                return;
            case 6:
                o oVar = (o) this.f702u;
                Y3.a aVar2 = (Y3.a) this.f703v;
                synchronized (oVar) {
                    try {
                        if (oVar.f2187b == null) {
                            oVar.f2186a.add(aVar2);
                        } else {
                            oVar.f2187b.add(aVar2.get());
                        }
                    } finally {
                    }
                }
                return;
            case 7:
                O3.a aVar3 = (O3.a) this.f702u;
                Process.setThreadPriority(aVar3.f2491c);
                StrictMode.ThreadPolicy threadPolicy = aVar3.f2492d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.f703v).run();
                return;
            case 8:
                Callable callable = (Callable) this.f702u;
                O3.h hVar = (O3.h) ((C4523c) this.f703v).f37856u;
                try {
                    hVar.j(callable.call());
                    return;
                } catch (Exception e6) {
                    hVar.k(e6);
                    return;
                }
            case 9:
                List<P0.b> list = (List) this.f702u;
                Q0.f this$0 = (Q0.f) this.f703v;
                h.e(this$0, "this$0");
                for (P0.b bVar : list) {
                    Object obj = this$0.f2705e;
                    bVar.f2682d = obj;
                    bVar.d(bVar.f2683e, obj);
                }
                return;
            case 10:
                T0.p pVar2 = (T0.p) this.f702u;
                k kVar2 = (k) this.f703v;
                if (pVar2.f3066n.f3237n instanceof U0.a) {
                    kVar2.cancel(true);
                    return;
                } else {
                    kVar2.l(pVar2.f3069w.getForegroundInfoAsync());
                    return;
                }
            case 11:
                ConstraintTrackingWorker this$02 = (ConstraintTrackingWorker) this.f702u;
                J3.a aVar4 = (J3.a) this.f703v;
                h.e(this$02, "this$0");
                synchronized (this$02.f5511u) {
                    try {
                        if (this$02.f5512v) {
                            k future = this$02.f5513w;
                            h.d(future, "future");
                            String str4 = W0.a.f3413a;
                            future.j(new J0.o());
                        } else {
                            this$02.f5513w.l(aVar4);
                        }
                    } finally {
                    }
                }
                return;
            case 12:
                r0.getLifecycle().a(new C0350l(1, (G) this.f703v, (androidx.activity.p) this.f702u));
                return;
            case 13:
                ((C0433a) this.f702u).accept((e) this.f703v);
                return;
            case 14:
                int i = SplashActivity.f37047A;
                if (((SplashActivity) this.f702u).f()) {
                    ((E) this.f703v).run();
                    return;
                }
                return;
            case 15:
                com.onesignal.internal.c.logout$lambda$5((com.onesignal.internal.c) this.f702u, (e.a) this.f703v);
                return;
            case 16:
                com.onesignal.internal.c.login$lambda$4((com.onesignal.internal.c) this.f702u, (d.a) this.f703v);
                return;
            case 17:
                int i4 = JobInfoSchedulerService.f23708n;
                ((JobInfoSchedulerService) this.f702u).jobFinished((JobParameters) this.f703v, false);
                return;
            case 18:
                h3.h hVar2 = (h3.h) this.f703v;
                A a9 = FirebaseMessaging.f36352k;
                try {
                    hVar2.b(((FirebaseMessaging) this.f702u).a());
                    return;
                } catch (Exception e9) {
                    hVar2.a(e9);
                    return;
                }
            case 19:
                h3.h hVar3 = (h3.h) this.f703v;
                try {
                    hVar3.b(((f4.k) this.f702u).b());
                    return;
                } catch (Exception e10) {
                    hVar3.a(e10);
                    return;
                }
            default:
                Runnable runnable = (Runnable) this.f703v;
                l lVar = (l) this.f702u;
                lVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    lVar.a();
                }
        }
    }
}
