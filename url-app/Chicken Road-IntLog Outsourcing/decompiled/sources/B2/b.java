package B2;

import B0.q;
import D0.k;
import D3.g;
import G2.f;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.activity.l;
import androidx.lifecycle.C0252w;
import androidx.lifecycle.EnumC0243m;
import androidx.lifecycle.F;
import androidx.work.CoroutineWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import b1.C0274k;
import b2.AbstractC0279e;
import com.onesignal.common.threading.Waiter;
import com.onesignal.core.internal.application.impl.ApplicationService;
import com.onesignal.core.internal.purchases.impl.TrackGooglePurchase;
import com.onesignal.core.internal.startup.StartupService;
import com.onesignal.debug.internal.crash.OneSignalCrashUploaderWrapper;
import com.yandex.varioqub.config.impl.B;
import io.appmetrica.analytics.impl.C0602e;
import io.appmetrica.analytics.impl.C0793l9;
import io.appmetrica.analytics.impl.C0812m2;
import io.appmetrica.analytics.impl.C0966s1;
import io.appmetrica.analytics.impl.C1069w0;
import io.flutter.plugin.platform.m;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.i;
import s0.n;
import s0.r;
import s0.s;
import t0.o;
import y2.C1563h;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f245b;

    public /* synthetic */ b(int i2, Object obj) {
        this.f244a = i2;
        this.f245b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isEmpty;
        int i2 = 23;
        switch (this.f244a) {
            case 0:
                ((e) ((c) this.f245b).f248c).f256f.prefetchDefaultFontManager();
                return;
            case 1:
                ConstraintTrackingWorker this$0 = (ConstraintTrackingWorker) this.f245b;
                i.e(this$0, "this$0");
                if (this$0.f4755d.f428a instanceof D0.a) {
                    return;
                }
                String b6 = this$0.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                s d6 = s.d();
                i.d(d6, "get()");
                if (b6 == null || b6.length() == 0) {
                    d6.b(F0.a.f672a, "No worker to delegate to.");
                    k future = this$0.f4755d;
                    i.d(future, "future");
                    future.k(new n());
                    return;
                }
                r a6 = this$0.getWorkerFactory().a(this$0.getApplicationContext(), b6, this$0.f4752a);
                this$0.f4756e = a6;
                if (a6 == null) {
                    d6.a(F0.a.f672a, "No worker to delegate to.");
                    k future2 = this$0.f4755d;
                    i.d(future2, "future");
                    future2.k(new n());
                    return;
                }
                o a7 = o.a(this$0.getApplicationContext());
                B0.r t5 = a7.f11884c.t();
                String uuid = this$0.getId().toString();
                i.d(uuid, "id.toString()");
                q g6 = t5.g(uuid);
                if (g6 == null) {
                    k future3 = this$0.f4755d;
                    i.d(future3, "future");
                    String str = F0.a.f672a;
                    future3.k(new n());
                    return;
                }
                B0.n nVar = a7.f11891j;
                i.d(nVar, "workManagerImpl.trackers");
                x0.c cVar = new x0.c(nVar, this$0);
                cVar.d(K1.b.W(g6));
                String uuid2 = this$0.getId().toString();
                i.d(uuid2, "id.toString()");
                if (!cVar.a(uuid2)) {
                    d6.a(F0.a.f672a, "Constraints not met for delegate " + b6 + ". Requesting retry.");
                    k future4 = this$0.f4755d;
                    i.d(future4, "future");
                    future4.k(new s0.o());
                    return;
                }
                d6.a(F0.a.f672a, "Constraints met for delegate ".concat(b6));
                try {
                    r rVar = this$0.f4756e;
                    i.b(rVar);
                    J1.a startWork = rVar.startWork();
                    i.d(startWork, "delegate!!.startWork()");
                    startWork.a(new B3.c(this$0, 2, startWork), this$0.getBackgroundExecutor());
                    return;
                } catch (Throwable th) {
                    String str2 = F0.a.f672a;
                    String f3 = AbstractC0279e.f("Delegated worker ", b6, " threw exception in startWork.");
                    if (d6.f11793a <= 3) {
                        Log.d(str2, f3, th);
                    }
                    synchronized (this$0.f4753b) {
                        try {
                            if (!this$0.f4754c) {
                                k future5 = this$0.f4755d;
                                i.d(future5, "future");
                                future5.k(new n());
                                return;
                            } else {
                                d6.a(str2, "Constraints were unmet, Retrying.");
                                k future6 = this$0.f4755d;
                                i.d(future6, "future");
                                future6.k(new s0.o());
                                return;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            case 2:
                ((CountDownLatch) this.f245b).countDown();
                return;
            case 3:
                ((l) this.f245b).invalidateMenu();
                return;
            case 4:
                androidx.activity.k kVar = (androidx.activity.k) this.f245b;
                Runnable runnable = kVar.f4056b;
                if (runnable != null) {
                    runnable.run();
                    kVar.f4056b = null;
                    return;
                }
                return;
            case 5:
                F this$02 = (F) this.f245b;
                i.e(this$02, "this$0");
                int i3 = this$02.f4522b;
                C0252w c0252w = this$02.f4526f;
                if (i3 == 0) {
                    this$02.f4523c = true;
                    c0252w.e(EnumC0243m.ON_PAUSE);
                }
                if (this$02.f4521a == 0 && this$02.f4523c) {
                    c0252w.e(EnumC0243m.ON_STOP);
                    this$02.f4524d = true;
                    return;
                }
                return;
            case 6:
                C0274k c0274k = (C0274k) this.f245b;
                c0274k.getClass();
                ((c1.i) c0274k.f4799d).p(new g(16, c0274k));
                return;
            case 7:
                ApplicationService.waitUntilActivityReady$lambda$0((Waiter) this.f245b);
                return;
            case 8:
                TrackGooglePurchase.queryBoughtItems$lambda$0((TrackGooglePurchase) this.f245b);
                return;
            case 9:
                StartupService.scheduleStart$lambda$2((StartupService) this.f245b);
                return;
            case 10:
                OneSignalCrashUploaderWrapper.start$lambda$0((OneSignalCrashUploaderWrapper) this.f245b);
                return;
            case 11:
                B.d dVar = (B.d) this.f245b;
                synchronized (((ArrayDeque) dVar.f109e)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) dVar.f108d).edit();
                    String str3 = (String) dVar.f106b;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) dVar.f109e).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append((String) dVar.f107c);
                    }
                    edit.putString(str3, sb.toString()).commit();
                }
                return;
            case 12:
                StringBuilder sb2 = new StringBuilder("Service took too long to process intent: ");
                f2.F f6 = (f2.F) this.f245b;
                sb2.append(f6.f5570a.getAction());
                sb2.append(" finishing.");
                Log.w("FirebaseMessaging", sb2.toString());
                f6.f5571b.d(null);
                return;
            case 13:
                ((C0602e) this.f245b).a();
                return;
            case 14:
                C0812m2.a((C0812m2) this.f245b);
                return;
            case 15:
                ((C0966s1) this.f245b).e();
                return;
            case 16:
                C0966s1.a((Object[]) this.f245b);
                return;
            case 17:
                ((C1069w0) this.f245b).o();
                return;
            case 18:
                ((m) this.f245b).g(false);
                return;
            case C0793l9.f8681C /* 19 */:
                B.a((com.yandex.varioqub.config.impl.g) this.f245b);
                return;
            case C0793l9.f8682D /* 20 */:
                B.a((B) this.f245b);
                return;
            case C0793l9.f8683E /* 21 */:
                CoroutineWorker.a((CoroutineWorker) this.f245b);
                return;
            case 22:
                ((f) this.f245b).getClass();
                return;
            default:
                C1563h c1563h = (C1563h) this.f245b;
                ExecutorService executorService = c1563h.f12366a;
                ConcurrentLinkedQueue concurrentLinkedQueue = c1563h.f12367b;
                AtomicBoolean atomicBoolean = c1563h.f12368c;
                if (atomicBoolean.compareAndSet(false, true)) {
                    try {
                        Runnable runnable2 = (Runnable) concurrentLinkedQueue.poll();
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                        if (isEmpty) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        atomicBoolean.set(false);
                        if (!concurrentLinkedQueue.isEmpty()) {
                            executorService.execute(new b(i2, c1563h));
                        }
                    }
                }
                return;
        }
    }
}
