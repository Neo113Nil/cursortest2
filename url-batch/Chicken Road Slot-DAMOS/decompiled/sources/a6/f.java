package a6;

import android.app.job.JobParameters;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Process;
import android.os.StrictMode;
import android.util.LongSparseArray;
import androidx.lifecycle.w;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.appsflyer.attribution.RequestError;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.q;
import d2.r2;
import f8.c0;
import f8.l0;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.collections.i0;
import l8.o;
import l8.p;
import m.u;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f300e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f301i;

    public /* synthetic */ f(c0 c0Var, ListenableFuture listenableFuture, int i3) {
        this.f299d = 8;
        this.f300e = c0Var;
        this.f301i = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i0 i0Var;
        switch (this.f299d) {
            case 0:
                List<z5.b> list = (List) this.f300e;
                g gVar = (g) this.f301i;
                list.getClass();
                for (z5.b bVar : list) {
                    Object obj = gVar.f306e;
                    bVar.f10860d = obj;
                    bVar.d(bVar.f10861e, obj);
                }
                return;
            case 1:
                ((com.google.firebase.messaging.k) this.f300e).a((Intent) this.f301i);
                return;
            case 2:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f300e;
                w7.g gVar2 = (w7.g) this.f301i;
                try {
                    gVar2.a(firebaseMessaging.a());
                    return;
                } catch (Exception e2) {
                    gVar2.f10117a.m(e2);
                    return;
                }
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                q qVar = (q) this.f300e;
                w7.g gVar3 = (w7.g) this.f301i;
                try {
                    gVar3.a(qVar.a());
                    return;
                } catch (Exception e9) {
                    gVar3.f10117a.m(e9);
                    return;
                }
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                d.k kVar = (d.k) this.f300e;
                kVar.f3790d.a(new d.d((d.c0) this.f301i, kVar));
                return;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                r2 r2Var = (r2) this.f300e;
                w wVar = (w) this.f301i;
                if (r2Var.f3525i) {
                    return;
                }
                r2Var.f3526r = wVar;
                wVar.a(r2Var);
                return;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                d6.q qVar2 = (d6.q) this.f300e;
                e6.j jVar = (e6.j) this.f301i;
                if (qVar2.f3655d.f3948d instanceof e6.a) {
                    jVar.cancel(true);
                    return;
                } else {
                    jVar.k(qVar2.f3658r.getForegroundInfoAsync());
                    return;
                }
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                k7.e.o((f1.e) this.f300e, (LongSparseArray) this.f301i);
                return;
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                c0 c0Var = (c0) this.f300e;
                ListenableFuture listenableFuture = (ListenableFuture) this.f301i;
                try {
                    if (listenableFuture.isCancelled()) {
                        c0Var.f4123z = null;
                        c0Var.cancel(false);
                    } else {
                        try {
                            try {
                                l0.b(listenableFuture);
                            } catch (Throwable th) {
                                c0Var.r(th);
                            }
                        } catch (ExecutionException e10) {
                            c0Var.r(e10.getCause());
                        }
                    }
                    return;
                } finally {
                    c0Var.q(null);
                }
            case 9:
                ((c0) this.f300e).q((b8.b) this.f301i);
                return;
            case 10:
                ((u) this.f300e).c((Typeface) this.f301i);
                return;
            case RequestError.STOP_TRACKING /* 11 */:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f300e;
                ListenableFuture listenableFuture2 = (ListenableFuture) this.f301i;
                listenableFuture2.getClass();
                synchronized (constraintTrackingWorker.f790e) {
                    try {
                        boolean z10 = constraintTrackingWorker.f791i;
                        e6.j jVar2 = constraintTrackingWorker.f792r;
                        if (z10) {
                            jVar2.getClass();
                            String str = g6.a.f4274a;
                            jVar2.i(new t5.k());
                        } else {
                            jVar2.k(listenableFuture2);
                        }
                    } finally {
                    }
                }
                return;
            case 12:
                ((ge.h) this.f300e).B((he.d) this.f301i, Unit.f5554a);
                return;
            case 13:
                p pVar = (p) this.f300e;
                w8.a aVar = (w8.a) this.f301i;
                if (pVar.f5934b != p.f5932d) {
                    i0.l("provide() can be called only once.");
                    return;
                }
                synchronized (pVar) {
                    i0Var = pVar.f5933a;
                    pVar.f5933a = null;
                    pVar.f5934b = aVar;
                }
                i0Var.getClass();
                return;
            case 14:
                o oVar = (o) this.f300e;
                w8.a aVar2 = (w8.a) this.f301i;
                synchronized (oVar) {
                    try {
                        if (oVar.f5930b == null) {
                            oVar.f5929a.add(aVar2);
                        } else {
                            oVar.f5930b.add(aVar2.get());
                        }
                    } finally {
                    }
                }
                return;
            case 15:
                m8.a aVar3 = (m8.a) this.f300e;
                Runnable runnable = (Runnable) this.f301i;
                Process.setThreadPriority(aVar3.f6575c);
                StrictMode.ThreadPolicy threadPolicy = aVar3.f6576d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 16:
                Callable callable = (Callable) this.f300e;
                m8.i iVar = (m8.i) ((l.d) this.f301i).f5643e;
                try {
                    iVar.j(callable.call());
                    return;
                } catch (Exception e11) {
                    iVar.k(e11);
                    return;
                }
            case 17:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f300e;
                JobParameters jobParameters = (JobParameters) this.f301i;
                int i3 = JobInfoSchedulerService.f2101d;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 18:
                ((u5.e) this.f300e).f((c6.j) this.f301i, false);
                return;
            case 19:
                u5.o oVar2 = (u5.o) this.f300e;
                ListenableFuture listenableFuture3 = (ListenableFuture) this.f301i;
                if (oVar2.E.f3948d instanceof e6.a) {
                    listenableFuture3.cancel(true);
                    return;
                }
                return;
            default:
                Runnable runnable2 = (Runnable) this.f300e;
                d6.l lVar = (d6.l) this.f301i;
                try {
                    runnable2.run();
                    return;
                } finally {
                    lVar.a();
                }
        }
    }

    public /* synthetic */ f(int i3, Object obj, Object obj2) {
        this.f299d = i3;
        this.f300e = obj;
        this.f301i = obj2;
    }
}
