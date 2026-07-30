package A;

import H0.r;
import I.C0117m;
import Q0.q;
import S1.o;
import android.app.job.JobParameters;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.C0215f;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.appsflyer.attribution.RequestError;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.C0323m;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.t;
import com.onesignal.user.internal.d;
import com.onesignal.user.internal.e;
import d.C0349A;
import e2.InterfaceC0372a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.p;
import n.U;
import n5.C0761c;
import v5.C0977c;
import w.AbstractC0987g;
import x4.C1009d;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f30d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f31e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f32i;

    public /* synthetic */ j(Object obj, int i2, Object obj2) {
        this.f30d = i2;
        this.f31e = obj;
        this.f32i = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x030d, code lost:
    
        if (r3 != null) goto L137;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable th;
        String message;
        String name;
        String str;
        A4.c cVar;
        String str2 = null;
        switch (this.f30d) {
            case 0:
                ((U) this.f31e).b((Typeface) this.f32i);
                return;
            case 1:
                ((B5.a) this.f31e).accept((K5.e) this.f32i);
                return;
            case 2:
                C0977c c0977c = (C0977c) this.f31e;
                Intrinsics.checkNotNullParameter((G3.b) this.f32i, "this$0");
                if (c0977c.b()) {
                    Log.d("OneSignalOtel", "OTEL export response received: success");
                    return;
                }
                synchronized (c0977c.f8234d) {
                    th = c0977c.f8232b;
                }
                String str3 = "unknown";
                if (th != null) {
                    try {
                        name = th.getClass().getName();
                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    } catch (Throwable unused) {
                        message = th.getMessage();
                        break;
                    }
                    if (p.f(name, "FailedExportException$HttpExportException")) {
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
                            if (bArr != null) {
                                Intrinsics.checkNotNullParameter(bArr, "<this>");
                                str2 = new String(bArr, Charsets.UTF_8);
                            }
                            StringBuilder sb = new StringBuilder("status=");
                            sb.append(invoke2);
                            sb.append(" message=");
                            sb.append(invoke3);
                            if (str2 != null && !StringsKt.z(str2)) {
                                str = " body=".concat(str2);
                                sb.append(str);
                                str3 = sb.toString();
                            }
                            str = "";
                            sb.append(str);
                            str3 = sb.toString();
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
            case 3:
                ((H0.f) this.f31e).c((P0.j) this.f32i, false);
                return;
            case 4:
                r rVar = (r) this.f31e;
                O1.a aVar = (O1.a) this.f32i;
                if (rVar.f953y.f2395d instanceof R0.a) {
                    aVar.cancel(true);
                    return;
                }
                return;
            case 5:
                List<M0.b> listenersList = (List) this.f31e;
                N0.f this$0 = (N0.f) this.f32i;
                Intrinsics.checkNotNullParameter(listenersList, "$listenersList");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                for (M0.b bVar : listenersList) {
                    Object obj = this$0.f1788e;
                    bVar.f1723d = obj;
                    bVar.d(bVar.f1724e, obj);
                }
                return;
            case 6:
                q qVar = (q) this.f31e;
                R0.k kVar = (R0.k) this.f32i;
                if (qVar.f2323d.f2395d instanceof R0.a) {
                    kVar.cancel(true);
                    return;
                } else {
                    kVar.k(qVar.f2326l.getForegroundInfoAsync());
                    return;
                }
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                S1.p pVar = (S1.p) this.f31e;
                InterfaceC0372a interfaceC0372a = (InterfaceC0372a) this.f32i;
                if (pVar.f2502b != S1.p.f2500d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (pVar) {
                    cVar = pVar.f2501a;
                    pVar.f2501a = null;
                    pVar.f2502b = interfaceC0372a;
                }
                cVar.getClass();
                return;
            case S.j.BYTES_FIELD_NUMBER /* 8 */:
                o oVar = (o) this.f31e;
                InterfaceC0372a interfaceC0372a2 = (InterfaceC0372a) this.f32i;
                synchronized (oVar) {
                    try {
                        if (oVar.f2498b == null) {
                            oVar.f2497a.add(interfaceC0372a2);
                        } else {
                            oVar.f2498b.add(interfaceC0372a2.get());
                        }
                    } finally {
                    }
                }
                return;
            case 9:
                ConstraintTrackingWorker this$02 = (ConstraintTrackingWorker) this.f31e;
                O1.a innerFuture = (O1.a) this.f32i;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(innerFuture, "$innerFuture");
                synchronized (this$02.f4124e) {
                    try {
                        if (this$02.f4125i) {
                            R0.k future = this$02.f4126l;
                            Intrinsics.checkNotNullExpressionValue(future, "future");
                            String str4 = T0.a.f2561a;
                            future.i(new G0.o());
                        } else {
                            this$02.f4126l.k(innerFuture);
                        }
                        Unit unit = Unit.f6114a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 10:
                T1.a aVar2 = (T1.a) this.f31e;
                Runnable runnable = (Runnable) this.f32i;
                Process.setThreadPriority(aVar2.f2566c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.f2567d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case RequestError.STOP_TRACKING /* 11 */:
                Callable callable = (Callable) this.f31e;
                B.f fVar = (B.f) this.f32i;
                try {
                    Object call = callable.call();
                    T1.h hVar = (T1.h) fVar.f152e;
                    if (call == null) {
                        call = AbstractC0987g.f8275o;
                    }
                    if (AbstractC0987g.f8274n.i(hVar, null, call)) {
                        AbstractC0987g.d(hVar);
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    fVar.v(e7);
                    return;
                }
            case 12:
                String str5 = (String) this.f31e;
                Z.f violation = (Z.f) this.f32i;
                Intrinsics.checkNotNullParameter(violation, "$violation");
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str5, violation);
                throw violation;
            case 13:
                ViewGroup container = (ViewGroup) this.f31e;
                C0215f this$03 = (C0215f) this.f32i;
                Intrinsics.checkNotNullParameter(container, "$container");
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                container.endViewTransition(null);
                throw null;
            case 14:
                ((r4.l) this.f31e).success((String) this.f32i);
                return;
            case 15:
                ((C0323m) this.f31e).a((Intent) this.f32i);
                return;
            case 16:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f31e;
                K1.h hVar2 = (K1.h) this.f32i;
                B.f fVar2 = FirebaseMessaging.f4435m;
                try {
                    hVar2.b(firebaseMessaging.a());
                    return;
                } catch (Exception e8) {
                    hVar2.a(e8);
                    return;
                }
            case 17:
                t tVar = (t) this.f31e;
                K1.h hVar3 = (K1.h) this.f32i;
                try {
                    hVar3.b(tVar.a());
                    return;
                } catch (Exception e9) {
                    hVar3.a(e9);
                    return;
                }
            case 18:
                com.onesignal.internal.c.logout$lambda$5((com.onesignal.internal.c) this.f31e, (e.a) this.f32i);
                return;
            case 19:
                com.onesignal.internal.c.login$lambda$4((com.onesignal.internal.c) this.f31e, (d.a) this.f32i);
                return;
            case 20:
                d.o this$04 = (d.o) this.f31e;
                C0349A dispatcher = (C0349A) this.f32i;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(dispatcher, "$dispatcher");
                this$04.getLifecycle().a(new C0117m(dispatcher, 1, this$04));
                return;
            case 21:
                ((f4.a) this.f31e).f4800b.a((ArrayList) this.f32i);
                return;
            case 22:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f31e;
                JobParameters jobParameters = (JobParameters) this.f32i;
                int i2 = JobInfoSchedulerService.f4351d;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 23:
                Q0.m mVar = (Q0.m) this.f31e;
                Runnable runnable2 = (Runnable) this.f32i;
                mVar.getClass();
                try {
                    runnable2.run();
                    return;
                } finally {
                    mVar.a();
                }
            case 24:
                B6.o oVar2 = (B6.o) this.f31e;
                C0761c c0761c = (C0761c) this.f32i;
                oVar2.getClass();
                c0761c.e();
                ((ConcurrentLinkedDeque) oVar2.f230c).add(c0761c);
                return;
            default:
                String str6 = (String) this.f31e;
                K1.h hVar4 = (K1.h) this.f32i;
                HashMap hashMap = C1009d.f8340i;
                try {
                    try {
                        P1.g.f(str6).b();
                    } catch (IllegalStateException unused2) {
                    }
                    hVar4.b(null);
                    return;
                } catch (Exception e10) {
                    hVar4.a(e10);
                    return;
                }
        }
    }
}
