package H1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.lifecycle.C0255w;
import androidx.lifecycle.EnumC0246m;
import androidx.work.CoroutineWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.onesignal.NotificationOpenedActivityHMS;
import com.onesignal.common.AndroidUtils;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import com.onesignal.notifications.activities.a;
import e3.C0344a;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import k.C0459s;
import l1.InterfaceFutureC0490a;
import u0.AbstractC0676f;
import u0.C0686p;
import u0.C0687q;
import w0.C0709a;
import y0.AbstractC0755a;

/* renamed from: H1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0139m implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f976f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f977g;

    public /* synthetic */ RunnableC0139m(int i7, Object obj) {
        this.f976f = i7;
        this.f977g = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0236, code lost:
    
        if (r1 != null) goto L63;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable th;
        String message;
        String str;
        switch (this.f976f) {
            case 0:
                C0140n.a((Intent) this.f977g);
                return;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                A.e eVar = (A.e) this.f977g;
                synchronized (((ArrayDeque) eVar.f10j)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) eVar.f9i).edit();
                    String str2 = (String) eVar.f7g;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) eVar.f10j).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append((String) eVar.f8h);
                    }
                    edit.putString(str2, sb.toString()).commit();
                }
                return;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                M m4 = (M) this.f977g;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + m4.f924a.getAction() + " finishing.");
                m4.f925b.c(null);
                return;
            case 3:
                ((I3.a) this.f977g).f1188b.f1196f.prefetchDefaultFontManager();
                return;
            case 4:
                J0.l lVar = (J0.l) this.f977g;
                ((K0.h) lVar.f1281d).m(new B0.b(9, lVar));
                return;
            case 5:
                AndroidUtils.INSTANCE.finishSafely((NotificationOpenedActivityHMS) this.f977g);
                return;
            case 6:
                ((CountDownLatch) this.f977g).countDown();
                return;
            case 7:
                ((PermissionsActivity) this.f977g).invalidateMenu();
                return;
            case 8:
                androidx.activity.k kVar = (androidx.activity.k) this.f977g;
                Runnable runnable = kVar.f3199g;
                if (runnable != null) {
                    runnable.run();
                    kVar.f3199g = null;
                    return;
                }
                return;
            case 9:
                androidx.lifecycle.E e4 = (androidx.lifecycle.E) this.f977g;
                C0255w c0255w = e4.f3461k;
                if (e4.f3457g == 0) {
                    e4.f3458h = true;
                    c0255w.e(EnumC0246m.ON_PAUSE);
                }
                if (e4.f3456f == 0 && e4.f3458h) {
                    c0255w.e(EnumC0246m.ON_STOP);
                    e4.f3459i = true;
                    return;
                }
                return;
            case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                com.onesignal.core.internal.application.impl.a.waitUntilActivityReady$lambda$0((com.onesignal.common.threading.c) this.f977g);
                return;
            case 11:
                com.onesignal.core.internal.purchases.impl.a.queryBoughtItems$lambda$0((com.onesignal.core.internal.purchases.impl.a) this.f977g);
                return;
            case 12:
                a.C0055a.invokeSuspend$lambda$0((com.onesignal.notifications.activities.a) this.f977g);
                return;
            case 13:
                O4.c cVar = (O4.c) this.f977g;
                if (cVar.b()) {
                    Log.d("OneSignalOtel", "OTEL export response received: success");
                    return;
                }
                synchronized (cVar.f1792d) {
                    th = cVar.f1790b;
                }
                String str3 = "unknown";
                if (th != null) {
                    try {
                    } catch (Throwable unused) {
                        message = th.getMessage();
                        break;
                    }
                    if (F5.q.B(th.getClass().getName(), "FailedExportException$HttpExportException")) {
                        Object invoke = th.getClass().getMethod("getResponse", null).invoke(th, null);
                        if (invoke == null) {
                            message = th.getMessage();
                            if (message == null) {
                            }
                            str3 = message;
                        } else {
                            Object invoke2 = invoke.getClass().getMethod("statusCode", null).invoke(invoke, null);
                            Object invoke3 = invoke.getClass().getMethod("statusMessage", null).invoke(invoke, null);
                            Object invoke4 = invoke.getClass().getMethod("responseBody", null).invoke(invoke, null);
                            byte[] bArr = invoke4 instanceof byte[] ? (byte[]) invoke4 : null;
                            String str4 = bArr != null ? new String(bArr, F5.a.f785a) : null;
                            StringBuilder sb2 = new StringBuilder("status=");
                            sb2.append(invoke2);
                            sb2.append(" message=");
                            sb2.append(invoke3);
                            if (str4 != null && !F5.j.T(str4)) {
                                str = " body=".concat(str4);
                                sb2.append(str);
                                str3 = sb2.toString();
                            }
                            str = "";
                            sb2.append(str);
                            str3 = sb2.toString();
                        }
                    } else {
                        message = th.getMessage();
                        if (message == null) {
                        }
                        str3 = message;
                    }
                }
                Log.e("OneSignalOtel", "OTEL export response received: failed - " + str3, th);
                return;
            case 14:
                ((io.flutter.plugin.platform.l) this.f977g).d(false);
                return;
            case 15:
                CoroutineWorker.a((CoroutineWorker) this.f977g);
                return;
            case 16:
                ((C0459s) this.f977g).getClass();
                return;
            default:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f977g;
                if (constraintTrackingWorker.f3597i.f6173f instanceof C0709a) {
                    return;
                }
                String b7 = constraintTrackingWorker.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                l0.q d7 = l0.q.d();
                kotlin.jvm.internal.i.d(d7, "get()");
                if (b7 == null || b7.length() == 0) {
                    d7.b(AbstractC0755a.f6223a, "No worker to delegate to.");
                    w0.j future = constraintTrackingWorker.f3597i;
                    kotlin.jvm.internal.i.d(future, "future");
                    future.i(new l0.l());
                    return;
                }
                l0.p a7 = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), b7, constraintTrackingWorker.f3594f);
                constraintTrackingWorker.f3598j = a7;
                if (a7 == null) {
                    d7.a(AbstractC0755a.f6223a, "No worker to delegate to.");
                    w0.j future2 = constraintTrackingWorker.f3597i;
                    kotlin.jvm.internal.i.d(future2, "future");
                    future2.i(new l0.l());
                    return;
                }
                m0.o a8 = m0.o.a(constraintTrackingWorker.getApplicationContext());
                C0687q t6 = a8.f5375c.t();
                String uuid = constraintTrackingWorker.getId().toString();
                kotlin.jvm.internal.i.d(uuid, "id.toString()");
                C0686p g7 = t6.g(uuid);
                if (g7 == null) {
                    w0.j future3 = constraintTrackingWorker.f3597i;
                    kotlin.jvm.internal.i.d(future3, "future");
                    String str5 = AbstractC0755a.f6223a;
                    future3.i(new l0.l());
                    return;
                }
                A a9 = a8.f5382j;
                kotlin.jvm.internal.i.d(a9, "workManagerImpl.trackers");
                B0.c cVar2 = new B0.c(a9, constraintTrackingWorker);
                cVar2.w(AbstractC0676f.n(g7));
                String uuid2 = constraintTrackingWorker.getId().toString();
                kotlin.jvm.internal.i.d(uuid2, "id.toString()");
                if (!cVar2.d(uuid2)) {
                    d7.a(AbstractC0755a.f6223a, "Constraints not met for delegate " + b7 + ". Requesting retry.");
                    w0.j future4 = constraintTrackingWorker.f3597i;
                    kotlin.jvm.internal.i.d(future4, "future");
                    future4.i(new l0.m());
                    return;
                }
                d7.a(AbstractC0755a.f6223a, "Constraints met for delegate ".concat(b7));
                try {
                    l0.p pVar = constraintTrackingWorker.f3598j;
                    kotlin.jvm.internal.i.b(pVar);
                    InterfaceFutureC0490a startWork = pVar.startWork();
                    kotlin.jvm.internal.i.d(startWork, "delegate!!.startWork()");
                    startWork.a(new G4.c(constraintTrackingWorker, 14, startWork), constraintTrackingWorker.getBackgroundExecutor());
                    return;
                } catch (Throwable th2) {
                    String str6 = AbstractC0755a.f6223a;
                    String e7 = W4.o.e("Delegated worker ", b7, " threw exception in startWork.");
                    if (d7.f5283a <= 3) {
                        Log.d(str6, e7, th2);
                    }
                    synchronized (constraintTrackingWorker.f3595g) {
                        try {
                            if (!constraintTrackingWorker.f3596h) {
                                w0.j future5 = constraintTrackingWorker.f3597i;
                                kotlin.jvm.internal.i.d(future5, "future");
                                future5.i(new l0.l());
                                return;
                            } else {
                                d7.a(str6, "Constraints were unmet, Retrying.");
                                w0.j future6 = constraintTrackingWorker.f3597i;
                                kotlin.jvm.internal.i.d(future6, "future");
                                future6.i(new l0.m());
                                return;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
        }
    }

    public /* synthetic */ RunnableC0139m(C0140n c0140n, Intent intent) {
        this.f976f = 0;
        this.f977g = intent;
    }

    public /* synthetic */ RunnableC0139m(O4.c cVar, C0344a c0344a) {
        this.f976f = 13;
        this.f977g = cVar;
    }
}
