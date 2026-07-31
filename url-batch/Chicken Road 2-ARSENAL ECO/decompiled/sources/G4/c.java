package G4;

import B1.g;
import D3.M;
import H1.u;
import android.app.job.JobParameters;
import android.graphics.Typeface;
import android.os.Process;
import android.os.StrictMode;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.FirebaseMessaging;
import com.onesignal.inAppMessages.internal.display.impl.a;
import d5.C0335e;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedDeque;
import k.C0459s;
import k1.h;
import kotlin.jvm.internal.i;
import l1.InterfaceFutureC0490a;
import m0.f;
import m0.q;
import p1.l;
import p1.m;
import q1.ThreadFactoryC0596a;
import r0.AbstractC0610b;
import s0.AbstractC0627e;
import u0.C0680j;
import v0.o;
import w0.C0709a;
import w0.j;
import y0.AbstractC0755a;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f851f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f852g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f853h;

    public /* synthetic */ c(Object obj, int i7, Object obj2) {
        this.f851f = i7;
        this.f852g = obj;
        this.f853h = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar;
        switch (this.f851f) {
            case 0:
                D1.b bVar = (D1.b) this.f852g;
                d dVar = (d) this.f853h;
                bVar.getClass();
                dVar.e();
                ((ConcurrentLinkedDeque) bVar.f369c).add(dVar);
                return;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f852g;
                h hVar = (h) this.f853h;
                M m4 = FirebaseMessaging.f3898k;
                try {
                    hVar.a(firebaseMessaging.a());
                    return;
                } catch (Exception e4) {
                    hVar.f5157a.j(e4);
                    return;
                }
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                u uVar = (u) this.f852g;
                h hVar2 = (h) this.f853h;
                try {
                    hVar2.a(uVar.a());
                    return;
                } catch (Exception e7) {
                    hVar2.f5157a.j(e7);
                    return;
                }
            case 3:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f852g;
                JobParameters jobParameters = (JobParameters) this.f853h;
                int i7 = JobInfoSchedulerService.f3840f;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 4:
                ((U4.a) this.f852g).accept((C0335e) this.f853h);
                return;
            case 5:
                ((f) this.f852g).f((C0680j) this.f853h, false);
                return;
            case 6:
                q qVar = (q) this.f852g;
                InterfaceFutureC0490a interfaceFutureC0490a = (InterfaceFutureC0490a) this.f853h;
                if (qVar.f5409v.f6173f instanceof C0709a) {
                    interfaceFutureC0490a.cancel(true);
                    return;
                }
                return;
            case 7:
                m mVar = (m) this.f852g;
                A1.a aVar = (A1.a) this.f853h;
                if (mVar.f5694b != m.f5692d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (mVar) {
                    gVar = mVar.f5693a;
                    mVar.f5693a = null;
                    mVar.f5694b = aVar;
                }
                gVar.getClass();
                return;
            case 8:
                l lVar = (l) this.f852g;
                A1.a aVar2 = (A1.a) this.f853h;
                synchronized (lVar) {
                    try {
                        if (lVar.f5690b == null) {
                            lVar.f5689a.add(aVar2);
                        } else {
                            lVar.f5690b.add(aVar2.get());
                        }
                    } finally {
                    }
                }
                return;
            case 9:
                ThreadFactoryC0596a threadFactoryC0596a = (ThreadFactoryC0596a) this.f852g;
                Runnable runnable = (Runnable) this.f853h;
                Process.setThreadPriority(threadFactoryC0596a.f5757c);
                StrictMode.ThreadPolicy threadPolicy = threadFactoryC0596a.f5758d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                Callable callable = (Callable) this.f852g;
                a6.d dVar2 = (a6.d) this.f853h;
                try {
                    Object call = callable.call();
                    q1.g gVar2 = (q1.g) dVar2.f3172f;
                    if (call == null) {
                        call = r.h.f5836l;
                    }
                    if (r.h.f5835k.B(gVar2, null, call)) {
                        r.h.d(gVar2);
                        return;
                    }
                    return;
                } catch (Exception e8) {
                    dVar2.k(e8);
                    return;
                }
            case 11:
                List<AbstractC0610b> list = (List) this.f852g;
                AbstractC0627e abstractC0627e = (AbstractC0627e) this.f853h;
                for (AbstractC0610b abstractC0610b : list) {
                    Object obj = abstractC0627e.f5873e;
                    abstractC0610b.f5844d = obj;
                    abstractC0610b.d(abstractC0610b.f5845e, obj);
                }
                return;
            case 12:
                ((C0459s) this.f852g).b((Typeface) this.f853h);
                return;
            case 13:
                o oVar = (o) this.f852g;
                j jVar = (j) this.f853h;
                if (oVar.f6082f.f6173f instanceof C0709a) {
                    jVar.cancel(true);
                    return;
                } else {
                    jVar.k(oVar.f6085i.getForegroundInfoAsync());
                    return;
                }
            default:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f852g;
                InterfaceFutureC0490a interfaceFutureC0490a2 = (InterfaceFutureC0490a) this.f853h;
                synchronized (constraintTrackingWorker.f3595g) {
                    try {
                        if (constraintTrackingWorker.f3596h) {
                            j future = constraintTrackingWorker.f3597i;
                            i.d(future, "future");
                            String str = AbstractC0755a.f6223a;
                            future.i(new l0.m());
                        } else {
                            constraintTrackingWorker.f3597i.k(interfaceFutureC0490a2);
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}
