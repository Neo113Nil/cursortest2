package A;

import D6.y;
import G0.o;
import P0.q;
import U.p;
import a.AbstractC0169a;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.util.Log;
import androidx.lifecycle.C0258y;
import androidx.lifecycle.EnumC0248n;
import androidx.lifecycle.G;
import androidx.work.CoroutineWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import b2.C0270a;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.RequestError;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.L;
import com.google.firebase.messaging.r;
import com.google.firebase.messaging.s;
import com.onesignal.notifications.activities.a;
import io.flutter.plugin.platform.u;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import j4.C0579h;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m4.CallableC0688a;
import n.U;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f33d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f34e;

    public /* synthetic */ k(int i2, Object obj) {
        this.f33d = i2;
        this.f34e = obj;
    }

    private final void a() {
        p pVar = (p) this.f34e;
        synchronized (pVar.f2691l) {
            try {
                if (pVar.f2695p == null) {
                    return;
                }
                try {
                    F.k c7 = pVar.c();
                    int i2 = c7.f749f;
                    if (i2 == 2) {
                        synchronized (pVar.f2691l) {
                        }
                    }
                    if (i2 != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                    }
                    try {
                        int i5 = E.h.f656a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        c2.e eVar = pVar.f2690i;
                        Context context = pVar.f2688d;
                        eVar.getClass();
                        F.k[] kVarArr = {c7};
                        V6.b bVar = B.g.f153a;
                        Trace.beginSection(AbstractC0169a.G("TypefaceCompat.createFromFontInfo"));
                        try {
                            Typeface p7 = B.g.f153a.p(context, kVarArr, 0);
                            Trace.endSection();
                            MappedByteBuffer s7 = AbstractC0169a.s(pVar.f2688d, c7.f744a);
                            if (s7 == null || p7 == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                P0.i iVar = new P0.i(p7, AbstractC0169a.x(s7));
                                Trace.endSection();
                                synchronized (pVar.f2691l) {
                                    try {
                                        V6.b bVar2 = pVar.f2695p;
                                        if (bVar2 != null) {
                                            bVar2.H(iVar);
                                        }
                                    } finally {
                                    }
                                }
                                pVar.b();
                            } finally {
                                int i7 = E.h.f656a;
                            }
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (pVar.f2691l) {
                        try {
                            V6.b bVar3 = pVar.f2695p;
                            if (bVar3 != null) {
                                bVar3.G(th2);
                            }
                            pVar.b();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isEmpty;
        Object obj;
        Application application = null;
        switch (this.f33d) {
            case 0:
                ((U) this.f34e).getClass();
                return;
            case 1:
                CoroutineWorker.a((CoroutineWorker) this.f34e);
                return;
            case 2:
                s sVar = ((r) ((Map.Entry) this.f34e).getKey()).f4522a;
                if (sVar.b()) {
                    FirebaseMessaging firebaseMessaging = (FirebaseMessaging) sVar.f4526d;
                    B.f fVar = FirebaseMessaging.f4435m;
                    if (firebaseMessaging.h(firebaseMessaging.d())) {
                        synchronized (firebaseMessaging) {
                            if (!firebaseMessaging.f4447k) {
                                firebaseMessaging.g(0L);
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ConstraintTrackingWorker this$0 = (ConstraintTrackingWorker) this.f34e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f4126l.f2395d instanceof R0.a) {
                    return;
                }
                String b7 = this$0.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                G0.s d7 = G0.s.d();
                Intrinsics.checkNotNullExpressionValue(d7, "get()");
                if (b7 == null || b7.length() == 0) {
                    d7.b(T0.a.f2561a, "No worker to delegate to.");
                    R0.k future = this$0.f4126l;
                    Intrinsics.checkNotNullExpressionValue(future, "future");
                    future.i(new G0.n());
                    return;
                }
                G0.r a7 = this$0.getWorkerFactory().a(this$0.getApplicationContext(), b7, this$0.f4123d);
                this$0.f4127m = a7;
                if (a7 == null) {
                    d7.a(T0.a.f2561a, "No worker to delegate to.");
                    R0.k future2 = this$0.f4126l;
                    Intrinsics.checkNotNullExpressionValue(future2, "future");
                    future2.i(new G0.n());
                    return;
                }
                H0.p a8 = H0.p.a(this$0.getApplicationContext());
                Intrinsics.checkNotNullExpressionValue(a8, "getInstance(applicationContext)");
                q t6 = a8.f920c.t();
                String uuid = this$0.getId().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
                P0.p g7 = t6.g(uuid);
                if (g7 == null) {
                    R0.k future3 = this$0.f4126l;
                    Intrinsics.checkNotNullExpressionValue(future3, "future");
                    String str = T0.a.f2561a;
                    future3.i(new G0.n());
                    return;
                }
                P0.i iVar = a8.j;
                Intrinsics.checkNotNullExpressionValue(iVar, "workManagerImpl.trackers");
                D0.j jVar = new D0.j(iVar, this$0);
                jVar.Y(kotlin.collections.q.b(g7));
                String uuid2 = this$0.getId().toString();
                Intrinsics.checkNotNullExpressionValue(uuid2, "id.toString()");
                if (!jVar.x(uuid2)) {
                    d7.a(T0.a.f2561a, "Constraints not met for delegate " + b7 + ". Requesting retry.");
                    R0.k future4 = this$0.f4126l;
                    Intrinsics.checkNotNullExpressionValue(future4, "future");
                    future4.i(new o());
                    return;
                }
                d7.a(T0.a.f2561a, "Constraints met for delegate ".concat(b7));
                try {
                    G0.r rVar = this$0.f4127m;
                    Intrinsics.b(rVar);
                    O1.a startWork = rVar.startWork();
                    Intrinsics.checkNotNullExpressionValue(startWork, "delegate!!.startWork()");
                    startWork.a(new j(this$0, 9, startWork), this$0.getBackgroundExecutor());
                    return;
                } catch (Throwable th) {
                    String str2 = T0.a.f2561a;
                    String d8 = r4.f.d("Delegated worker ", b7, " threw exception in startWork.");
                    if (d7.f824a <= 3) {
                        Log.d(str2, d8, th);
                    }
                    synchronized (this$0.f4124e) {
                        try {
                            if (!this$0.f4125i) {
                                R0.k future5 = this$0.f4126l;
                                Intrinsics.checkNotNullExpressionValue(future5, "future");
                                future5.i(new G0.n());
                                return;
                            } else {
                                d7.a(str2, "Constraints were unmet, Retrying.");
                                R0.k future6 = this$0.f4126l;
                                Intrinsics.checkNotNullExpressionValue(future6, "future");
                                future6.i(new o());
                                return;
                            }
                        } finally {
                        }
                    }
                }
            case 4:
                a();
                return;
            case 5:
                G this$02 = (G) this.f34e;
                C0258y c0258y = this$02.f3853n;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                if (this$02.f3849e == 0) {
                    this$02.f3850i = true;
                    c0258y.e(EnumC0248n.ON_PAUSE);
                }
                if (this$02.f3848d == 0 && this$02.f3850i) {
                    c0258y.e(EnumC0248n.ON_STOP);
                    this$02.f3851l = true;
                    return;
                }
                return;
            case 6:
                AFLogger.getMediationNetwork((Function1) this.f34e);
                return;
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                y yVar = (y) this.f34e;
                synchronized (((ArrayDeque) yVar.f636l)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) yVar.f634e).edit();
                    String str3 = (String) yVar.f633d;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) yVar.f636l).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append((String) yVar.f635i);
                    }
                    edit.putString(str3, sb.toString()).apply();
                }
                return;
            case S.j.BYTES_FIELD_NUMBER /* 8 */:
                L l7 = (L) this.f34e;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + l7.f4471a.getAction() + " finishing.");
                l7.f4472b.d(null);
                return;
            case 9:
                com.onesignal.core.internal.application.impl.a.waitUntilActivityReady$lambda$0((com.onesignal.common.threading.d) this.f34e);
                return;
            case 10:
                com.onesignal.core.internal.purchases.impl.a.queryBoughtItems$lambda$0((com.onesignal.core.internal.purchases.impl.a) this.f34e);
                return;
            case RequestError.STOP_TRACKING /* 11 */:
                com.onesignal.core.internal.startup.c.scheduleStart$lambda$2((com.onesignal.core.internal.startup.c) this.f34e);
                return;
            case 12:
                com.onesignal.debug.internal.crash.b.start$lambda$0((com.onesignal.debug.internal.crash.b) this.f34e);
                return;
            case 13:
                a.C0055a.invokeSuspend$lambda$0((com.onesignal.notifications.activities.a) this.f34e);
                return;
            case 14:
                d.k this$03 = (d.k) this.f34e;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Runnable runnable = this$03.f4580e;
                if (runnable != null) {
                    runnable.run();
                    this$03.f4580e = null;
                    return;
                }
                return;
            case 15:
                d.p.a((d.p) this.f34e);
                return;
            case 16:
                f4.a aVar = (f4.a) this.f34e;
                s4.g gVar = aVar.f4800b;
                ConnectivityManager connectivityManager = (ConnectivityManager) aVar.f4799a.f6269d;
                gVar.a(l2.c.w(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
                return;
            case 17:
                g1.j jVar2 = (g1.j) this.f34e;
                ((h1.h) jVar2.f5010d).s(new A4.b(12, jVar2));
                return;
            case 18:
                ((u) this.f34e).e(false);
                return;
            case 19:
                C0579h c0579h = (C0579h) this.f34e;
                ExecutorService executorService = c0579h.f5975a;
                ConcurrentLinkedQueue concurrentLinkedQueue = c0579h.f5976b;
                AtomicBoolean atomicBoolean = c0579h.f5977c;
                if (atomicBoolean.compareAndSet(false, true)) {
                    int i2 = 19;
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
                            executorService.execute(new k(i2, c0579h));
                        }
                    }
                }
                return;
            case 20:
                ((CallableC0688a) this.f34e).f6531e.f6539f.prefetchDefaultFontManager();
                return;
            case 21:
                ((CountDownLatch) this.f34e).countDown();
                return;
            case 22:
                FlutterFirebasePluginRegistry.lambda$didReinitializeFirebaseCore$1((K1.h) this.f34e);
                return;
            default:
                Activity activity = (Activity) this.f34e;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = y.d.f8461g;
                Method method = y.d.f8460f;
                int i5 = Build.VERSION.SDK_INT;
                int i7 = 28;
                if (i5 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((i5 != 26 && i5 != 27) || method != null) && (y.d.f8459e != null || y.d.f8458d != null)) {
                    try {
                        Object obj2 = y.d.f8457c.get(activity);
                        if (obj2 != null && (obj = y.d.f8456b.get(activity)) != null) {
                            Application application2 = activity.getApplication();
                            y.c cVar = new y.c(activity);
                            application2.registerActivityLifecycleCallbacks(cVar);
                            handler.post(new F.a(cVar, i7, obj2));
                            y.c cVar2 = (i5 == 26 || i5 == 27) ? 1 : null;
                            try {
                                if (cVar2 != null) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        application = application2;
                                        cVar2 = cVar;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        application = application2;
                                        cVar2 = cVar;
                                        handler.post(new y.b(application, 1, cVar2));
                                        throw th;
                                    }
                                } else {
                                    application = application2;
                                    cVar2 = cVar;
                                    activity.recreate();
                                }
                                handler.post(new y.b(application, 1, cVar2));
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
        }
    }

    public /* synthetic */ k(Map.Entry entry, C0270a c0270a) {
        this.f33d = 2;
        this.f34e = entry;
    }
}
