package defpackage;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import androidx.work.impl.WorkDatabase;
import j$.util.Objects;
import j$.util.Optional;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.NetworkQualityThroughputListener;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iee {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public iee(ScheduledExecutorService scheduledExecutorService, iyi iyiVar, Application application) {
        this.e = hoq.v(new ewf(this, 9));
        this.f = hoq.v(new ewf(this, 10));
        this.g = hoq.v(new ewf(this, 11));
        this.a = hoq.v(new ewf(this, 12));
        this.c = hoq.v(new ewf(this, 13));
        fee d = fee.d("tiktok");
        this.b = d;
        fed fedVar = d.c;
        if (fedVar == null) {
            this.d = feg.c(iyiVar, scheduledExecutorService, d, application);
        } else {
            this.d = fedVar;
            ((feg) fedVar).f = iyiVar;
        }
    }

    public static final void b(gzp gzpVar, ExperimentalCronetEngine.Builder builder) {
        if (gzpVar.f()) {
            builder.enableNetworkQualityEstimator(((iea) gzpVar.b()).m());
        }
    }

    public static final void c(gzp gzpVar, ExperimentalCronetEngine experimentalCronetEngine, koe koeVar, koe koeVar2) {
        if (gzpVar.f() && ((iea) gzpVar.b()).m()) {
            Iterator it = ((Set) ((jrx) koeVar).a).iterator();
            while (it.hasNext()) {
                experimentalCronetEngine.addRttListener((NetworkQualityRttListener) it.next());
            }
            Iterator it2 = ((Set) ((jrx) koeVar2).a).iterator();
            while (it2.hasNext()) {
                experimentalCronetEngine.addThroughputListener((NetworkQualityThroughputListener) it2.next());
            }
        }
    }

    public static final void d(gzp gzpVar, ExperimentalCronetEngine.Builder builder) {
        if (gzpVar.f()) {
            if (((iea) gzpVar.b()).l()) {
                builder.enableHttpCache(1, r2.b());
            } else {
                builder.enableHttpCache(0, 0L);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    public static final void e(gzp gzpVar, ExperimentalCronetEngine experimentalCronetEngine) {
        if (((Boolean) gzpVar.a(new gxw(9)).d(false)).booleanValue()) {
            experimentalCronetEngine.getClass();
            if (eir.b == null) {
                synchronized (eir.a) {
                    if (eir.b == null) {
                        eir.b = new eir();
                    }
                }
            }
            eir eirVar = eir.b;
            if (!eim.a().d()) {
                ((hkf) ((hkf) eiu.a.e()).i("com/google/android/libraries/performance/primes/PrimesCronetExtension", "registerEngine", 75, "PrimesCronetExtension.java")).s("Network metric disabled. Skip initializing network monitor.");
                return;
            }
            synchronized (eirVar.c) {
                Set set = eirVar.d;
                if (set.contains(experimentalCronetEngine)) {
                    ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/PrimesCronetExtension", "registerEngine", 88, "PrimesCronetExtension.java")).s("Network monitoring is already started for the specified CronetEngine object, startNetworkMonitor() call is ignored");
                } else if (!set.isEmpty()) {
                    ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/PrimesCronetExtension", "registerEngine", 94, "PrimesCronetExtension.java")).s("Only 1 CronetEngine monitoring is supported, startNetworkMonitor() call is ignored");
                } else {
                    set.add(experimentalCronetEngine);
                    experimentalCronetEngine.addRequestFinishedListener(new eqf(eim.a().a.a().bB()));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038 A[LOOP:0: B:12:0x0032->B:14:0x0038, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055 A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:18:0x004a, B:20:0x0055, B:22:0x006f, B:23:0x0076, B:25:0x008d, B:29:0x0095), top: B:17:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095 A[Catch: all -> 0x00a8, TRY_LEAVE, TryCatch #0 {all -> 0x00a8, blocks: (B:18:0x004a, B:20:0x0055, B:22:0x006f, B:23:0x0076, B:25:0x008d, B:29:0x0095), top: B:17:0x004a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ExperimentalCronetEngine.Builder a(Context context, Set set, gzp gzpVar) {
        ExperimentalCronetEngine.Builder builder;
        Iterator it;
        StrictMode.ThreadPolicy threadPolicy;
        try {
            if (gzpVar.f()) {
                iea ieaVar = (iea) gzpVar.b();
                if (ieaVar.d() != null) {
                    context = ieaVar.d();
                }
                if (ieaVar.e() != null) {
                    builder = ieaVar.e().a();
                    if (builder == null) {
                        builder = new ExperimentalCronetEngine.Builder(context);
                    }
                    it = set.iterator();
                    while (it.hasNext()) {
                        builder.addQuicHint(((iec) it.next()).a, 443, 443);
                    }
                    threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
                    if (gzpVar.f()) {
                        builder.enableQuic(true);
                        builder.setExperimentalOptions(((ieg) this.d).a(null));
                    } else {
                        iea ieaVar2 = (iea) gzpVar.b();
                        builder.enableQuic(ieaVar2.o());
                        builder.enableBrotli(ieaVar2.i());
                        if (ieaVar2.h() != null) {
                            builder.setLibraryLoader(ieaVar2.h());
                        }
                        builder.setExperimentalOptions(((ieg) this.d).a(ieaVar2.f()));
                        if (ieaVar2.c() != 20) {
                            builder.setThreadPriority(ieaVar2.c());
                        }
                    }
                    return builder;
                }
            }
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            if (gzpVar.f()) {
            }
            return builder;
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        builder = null;
        if (builder == null) {
        }
        it = set.iterator();
        while (it.hasNext()) {
        }
        threadPolicy = StrictMode.getThreadPolicy();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void f(dsf dsfVar) {
        ixg.i(kvp.g(new kwn(this.f)), null, 0, new alg(dsfVar, this, (kqj) null, 3), 3);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void g(final ces cesVar, final int i, final Runnable runnable) {
        this.b.execute(new Runnable() { // from class: cft
            /* JADX WARN: Code restructure failed: missing block: B:67:0x01fd, code lost:
            
                ((defpackage.cgp) r2.e).f(new defpackage.cfs());
             */
            /* JADX WARN: Code restructure failed: missing block: B:68:0x0211, code lost:
            
                if (((defpackage.cgp) r2.d).l(r3) == false) goto L68;
             */
            /* JADX WARN: Code restructure failed: missing block: B:69:0x0213, code lost:
            
                ((defpackage.iyi) r2.f).x(r3, r4, true);
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                final long j;
                int i2;
                Object obj;
                cey ceyVar;
                Runnable runnable2 = runnable;
                final iee ieeVar = iee.this;
                final ces cesVar2 = cesVar;
                final int i3 = i;
                int i4 = 0;
                int i5 = 1;
                try {
                    try {
                        Object obj2 = ieeVar.e;
                        Object obj3 = ieeVar.d;
                        obj3.getClass();
                        ((cgp) obj2).f(new cfu(obj3, i4));
                        Object obj4 = ieeVar.a;
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) obj4).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            cfb y = ((iyi) ieeVar.g).y(cesVar2.a);
                            while (true) {
                                if (!((Boolean) ((cgp) obj2).f(new cfw(ieeVar, cesVar2, i5))).booleanValue()) {
                                    j = 0;
                                    break;
                                }
                                Iterable<cgc> iterable = (Iterable) ((cgp) obj2).f(new cfw(ieeVar, cesVar2, i4));
                                ArrayList arrayList = new ArrayList();
                                if (!iterable.iterator().hasNext()) {
                                    break;
                                }
                                if (y != null) {
                                    ArrayList arrayList2 = new ArrayList();
                                    ceo ceoVar = ((cgc) iterable.iterator().next()).c;
                                    String str = ceoVar.h;
                                    String str2 = ceoVar.l;
                                    for (cgc cgcVar : iterable) {
                                        int i6 = i4;
                                        ceo ceoVar2 = cgcVar.c;
                                        String str3 = ceoVar2.h;
                                        String str4 = ceoVar2.l;
                                        if (Objects.equals(str, str3) && Objects.equals(str2, str4)) {
                                            arrayList2.add(ceoVar2);
                                            arrayList.add(cgcVar);
                                        }
                                        i4 = i6;
                                    }
                                    i2 = i4;
                                    if (cesVar2.b()) {
                                        Object obj5 = ieeVar.c;
                                        obj5.getClass();
                                        cfd cfdVar = (cfd) ((cgp) obj2).f(new cfu(obj5, 1));
                                        cen b = ceo.b();
                                        obj = obj2;
                                        b.f(System.currentTimeMillis());
                                        b.h(SystemClock.elapsedRealtime());
                                        b.g("GDT_CLIENT_METRICS");
                                        b.d = str;
                                        b.e(new cem(new ccl("proto"), ceq.a.a(cfdVar)));
                                        arrayList2.add(y.a(b.a()));
                                    } else {
                                        obj = obj2;
                                    }
                                    ceyVar = y.b(new cex(arrayList2, cesVar2.b));
                                    if (str2 != null && ceyVar.b != null) {
                                        try {
                                            Class<?> cls = Class.forName(str2);
                                            if (cco.class.isAssignableFrom(cls)) {
                                                Class<?>[] clsArr = new Class[1];
                                                clsArr[i2] = Context.class;
                                                Constructor<?> constructor = cls.getConstructor(clsArr);
                                                Object[] objArr = new Object[1];
                                                objArr[i2] = obj4;
                                                cco ccoVar = (cco) constructor.newInstance(objArr);
                                                if (ccoVar != null) {
                                                    ccoVar.a();
                                                }
                                            }
                                        } catch (Exception e) {
                                            ow.r("Uploader", "Could not update pseudonymous id via ".concat(str2), e);
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                    obj = obj2;
                                    ceyVar = new cey(3, -1L, null);
                                }
                                int i7 = ceyVar.c;
                                int i8 = 2;
                                if (i7 == 2) {
                                    ((cgp) ieeVar.e).f(new cfx(ieeVar, arrayList, cesVar2, i2));
                                    ((iyi) ieeVar.f).x(cesVar2, i3 + 1, true);
                                    break;
                                }
                                Object obj6 = ieeVar.e;
                                ((cgp) obj6).f(new cfw(ieeVar, arrayList, i8));
                                if (i7 == 1) {
                                    j = Math.max(0L, ceyVar.a);
                                    if (cesVar2.b()) {
                                        ((cgp) obj6).f(new cfu(ieeVar, i8));
                                    }
                                } else {
                                    if (i7 == 4) {
                                        HashMap hashMap = new HashMap();
                                        int size = arrayList.size();
                                        for (int i9 = 0; i9 < size; i9++) {
                                            String str5 = ((cgc) arrayList.get(i9)).c.a;
                                            if (hashMap.containsKey(str5)) {
                                                hashMap.put(str5, Integer.valueOf(((Integer) hashMap.get(str5)).intValue() + 1));
                                            } else {
                                                hashMap.put(str5, 1);
                                            }
                                        }
                                        ((cgp) obj6).f(new cfw(ieeVar, hashMap, 3));
                                    }
                                    obj2 = obj;
                                    i4 = 0;
                                    i5 = 1;
                                }
                            }
                        } else {
                            ((cgp) ieeVar.e).f(new cgv() { // from class: cfv
                                @Override // defpackage.cgv
                                public final Object a() {
                                    ((iyi) iee.this.f).x(cesVar2, i3 + 1, false);
                                    return null;
                                }
                            });
                        }
                    } catch (cgu unused) {
                        ((iyi) ieeVar.f).x(cesVar2, i3 + 1, false);
                    }
                } finally {
                    runnable2.run();
                }
            }
        });
    }

    public iee(Context context, Set set, gzp gzpVar, ieg iegVar, koe koeVar, koe koeVar2, gzp gzpVar2) {
        this.a = context;
        this.b = set;
        this.c = gzpVar;
        this.d = iegVar;
        this.e = koeVar;
        this.f = koeVar2;
        this.g = gzpVar2;
    }

    public iee(dze dzeVar, FrameLayout frameLayout, iyi iyiVar, iyi iyiVar2, cbp cbpVar, View view, View view2) {
        this.a = dzeVar;
        this.g = frameLayout;
        this.b = iyiVar;
        this.f = iyiVar2;
        this.c = cbpVar;
        this.d = view;
        this.e = view2;
    }

    public iee(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7) {
        this.g = jsbVar;
        this.a = jsbVar2;
        this.b = jsbVar3;
        this.f = jsbVar4;
        this.e = jsbVar5;
        this.c = jsbVar6;
        this.d = jsbVar7;
    }

    public iee(Context context, arv arvVar, ldt ldtVar, awt awtVar, WorkDatabase workDatabase, axt axtVar, List list) {
        context.getClass();
        workDatabase.getClass();
        this.g = arvVar;
        this.e = ldtVar;
        this.c = awtVar;
        this.f = workDatabase;
        this.d = axtVar;
        this.b = list;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        new zx();
    }

    public iee(enp enpVar, hac hacVar, hac hacVar2, Executor executor, jpt jptVar, ldt ldtVar, koe koeVar) {
        this.e = new AtomicBoolean(true);
        this.g = enpVar;
        this.d = hacVar;
        this.c = hacVar2;
        this.b = executor;
        this.a = ldtVar.n(executor, jptVar, null);
        this.f = koeVar;
    }

    public iee(ScheduledExecutorService scheduledExecutorService, Map map, etp etpVar, Optional optional, iwq iwqVar, iwq iwqVar2, etd etdVar) {
        scheduledExecutorService.getClass();
        map.getClass();
        iwqVar.getClass();
        iwqVar2.getClass();
        etdVar.getClass();
        this.f = scheduledExecutorService;
        this.e = map;
        this.b = etpVar;
        this.c = optional;
        this.g = iwqVar;
        this.a = iwqVar2;
        this.d = etdVar;
    }

    public iee(jpt jptVar, gzp gzpVar, dja djaVar, gzp gzpVar2, ExecutorService executorService, gzp gzpVar3) {
        jptVar.getClass();
        executorService.getClass();
        this.b = jptVar;
        this.e = gzpVar;
        this.d = djaVar;
        this.a = gzpVar2;
        this.f = executorService;
        this.g = gzpVar3;
        this.c = gyf.a;
    }

    public iee(Context context, iyi iyiVar, cgp cgpVar, iyi iyiVar2, Executor executor, cgp cgpVar2, cgp cgpVar3) {
        this.a = context;
        this.g = iyiVar;
        this.d = cgpVar;
        this.f = iyiVar2;
        this.b = executor;
        this.e = cgpVar2;
        this.c = cgpVar3;
    }
}
