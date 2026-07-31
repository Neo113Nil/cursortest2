package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceConfig;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class J1 implements InterfaceC3079x1, InterfaceC2871p0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f37777a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f37778b;

    /* renamed from: c, reason: collision with root package name */
    public volatile InterfaceC3053w1 f37779c;

    /* renamed from: d, reason: collision with root package name */
    public final C3056w4 f37780d;

    /* renamed from: e, reason: collision with root package name */
    public final Q1 f37781e;

    /* renamed from: f, reason: collision with root package name */
    public C2628fh f37782f;

    /* renamed from: g, reason: collision with root package name */
    public final C3140za f37783g;

    /* renamed from: h, reason: collision with root package name */
    public final C2795m2 f37784h;

    /* renamed from: i, reason: collision with root package name */
    public final K1 f37785i;

    /* renamed from: j, reason: collision with root package name */
    public final C2914qh f37786j;

    public J1(@NonNull Context context, @NonNull InterfaceC3053w1 interfaceC3053w1) {
        this(context, interfaceC3053w1, new C3109y5(context));
    }

    public final void a() {
        this.f37781e.c(new P1() { // from class: io.appmetrica.analytics.impl.Po
            @Override // io.appmetrica.analytics.impl.P1
            public final void a(Intent intent) {
                J1.this.d(intent);
            }
        });
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3079x1
    public final void b(Intent intent) {
        this.f37781e.d(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String encodedAuthority = data == null ? null : data.getEncodedAuthority();
            if (!"io.appmetrica.analytics.IAppMetricaService".equals(action) || encodedAuthority == null || data == null || !Objects.equals(data.getPath(), "/client")) {
                return;
            }
            int parseInt = Integer.parseInt(data.getQueryParameter("pid"));
            this.f37780d.a(encodedAuthority, Integer.valueOf(parseInt), data.getQueryParameter("psid"));
            this.f37784h.a(parseInt);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3079x1
    public final void c(Intent intent) {
        Q1 q12 = this.f37781e;
        if (intent == null) {
            q12.getClass();
            return;
        }
        q12.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            q12.f38149a.a(action, Integer.valueOf(Q1.a(intent)));
        }
        for (Map.Entry entry : q12.f38150b.entrySet()) {
            P1 p12 = (P1) entry.getKey();
            if (((O1) entry.getValue()).a(intent)) {
                p12.a(intent);
            }
        }
    }

    public final void d(Intent intent) {
        Ia.f37730F.u().a(Bb.e(intent.getStringExtra("screen_size")));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3079x1
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        Ia.f37730F.u().a(configuration);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3079x1
    public final void onCreate() {
        if (this.f37777a) {
            Ia.f37730F.u().a(this.f37778b.getResources().getConfiguration());
        } else {
            this.f37783g.b(this.f37778b);
            Ia ia = Ia.f37730F;
            synchronized (ia) {
                ia.f37732B.initAsync();
                ia.f37756u.a(ia.f37736a);
                ia.f37756u.a(new C2662go(ia.f37732B));
                NetworkServiceLocator.init(new A5(new Ci(ia.g()), new K5(ia.f37736a)));
                ia.k().a(ia.f37752q);
                ia.C();
            }
            AbstractC2658gk.f39100a.e();
            C2686hm c2686hm = Ia.f37730F.f37756u;
            c2686hm.b();
            C2633fm b4 = c2686hm.b();
            C3124yk o4 = Ia.f37730F.o();
            o4.a(new C2761kk(new C3039vd(this.f37781e)), b4);
            c2686hm.a(o4);
            ((Al) Ia.f37730F.y()).getClass();
            a();
            Ia.f37730F.l().init();
            Ia.f37730F.b().init();
            K1 k12 = this.f37785i;
            Context context = this.f37778b;
            C3056w4 c3056w4 = this.f37780d;
            k12.getClass();
            this.f37782f = new C2628fh(context, c3056w4);
            Context context2 = this.f37778b;
            AbstractC2898q1.f39645a.b(context2);
            AppMetrica.getReporter(context2, "20799a27-fa80-4b36-b2db-0f8141f24180");
            Context context3 = this.f37778b;
            C2628fh c2628fh = this.f37782f;
            C2572de q4 = Ia.j().q();
            IHandlerExecutor e4 = Ia.j().w().e();
            C6 c6 = new C6(context3, c2628fh, EnumC3063wb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new W(), new BlockingExecutor(), "previous");
            C6 c62 = new C6(context3, c2628fh, EnumC3063wb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new Hb(), e4, "actual");
            File crashesDirectory = FileUtils.getCrashesDirectory(context3);
            if (crashesDirectory != null) {
                A6 a6 = new A6(crashesDirectory, c62, new C3036va());
                e4.execute(new RunnableC2680hg(crashesDirectory, c6));
                if (!crashesDirectory.exists()) {
                    crashesDirectory.mkdir();
                } else if (!crashesDirectory.isDirectory() && crashesDirectory.delete()) {
                    crashesDirectory.mkdir();
                }
                a6.startWatching();
                Ia.f37730F.f37735E.storeReference(a6);
            }
            q4.getClass();
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context3);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                q4.f38851a.init(context3, new NativeCrashServiceConfig(absolutePath));
                List<NativeCrash> allCrashes = q4.f38851a.getAllCrashes();
                if (!allCrashes.isEmpty()) {
                    Yd b5 = q4.f38852b.b(context3, c2628fh);
                    Iterator<T> it = allCrashes.iterator();
                    while (it.hasNext()) {
                        b5.newCrash((NativeCrash) it.next());
                    }
                }
                q4.f38851a.setDefaultCrashHandler(q4.f38852b.a(context3, c2628fh));
            }
            new RunnableC2590e6(CollectionsKt.listOf(new RunnableC2784lh())).run();
            this.f37777a = true;
        }
        Ia.f37730F.k().a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3079x1
    public final void onDestroy() {
        C2489ac k4 = Ia.f37730F.k();
        synchronized (k4) {
            ArrayList arrayList = k4.f38671c;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                ((InterfaceC2968sk) obj).onDestroy();
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3079x1
    public final void pauseUserSession(@NonNull Bundle bundle) {
        Pf pf;
        bundle.setClassLoader(Pf.class.getClassLoader());
        String str = Pf.f38131c;
        try {
            pf = (Pf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            pf = null;
        }
        Integer asInteger = pf != null ? pf.f38132a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f37784h.b(asInteger.intValue());
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3079x1
    public final void reportData(int i4, Bundle bundle) {
        this.f37786j.getClass();
        List list = (List) Ia.f37730F.f37757v.f39456a.get(Integer.valueOf(i4));
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC2787lk) it.next()).reportData(i4, bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3079x1
    public final void resumeUserSession(@NonNull Bundle bundle) {
        Pf pf;
        bundle.setClassLoader(Pf.class.getClassLoader());
        String str = Pf.f38131c;
        try {
            pf = (Pf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            pf = null;
        }
        Integer asInteger = pf != null ? pf.f38132a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f37784h.c(asInteger.intValue());
        }
    }

    public J1(Context context, InterfaceC3053w1 interfaceC3053w1, C3109y5 c3109y5) {
        this(context, interfaceC3053w1, new C3056w4(context, c3109y5), new Q1(), C3140za.f40370d, Ia.j().d(), new K1());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3079x1
    public final void a(Intent intent) {
        Q1 q12 = this.f37781e;
        if (intent == null) {
            q12.getClass();
            return;
        }
        q12.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            q12.f38149a.a(action, Integer.valueOf(Q1.a(intent)));
        }
        for (Map.Entry entry : q12.f38150b.entrySet()) {
            P1 p12 = (P1) entry.getKey();
            if (((O1) entry.getValue()).a(intent)) {
                p12.a(intent);
            }
        }
    }

    public J1(Context context, InterfaceC3053w1 interfaceC3053w1, C3056w4 c3056w4, Q1 q12, C3140za c3140za, C2795m2 c2795m2, K1 k12) {
        this.f37777a = false;
        this.f37778b = context;
        this.f37779c = interfaceC3053w1;
        this.f37780d = c3056w4;
        this.f37781e = q12;
        this.f37783g = c3140za;
        this.f37784h = c2795m2;
        this.f37785i = k12;
        this.f37786j = new C2914qh();
    }

    public final void a(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        C2773l6.b(bundle);
        C2628fh c2628fh = this.f37782f;
        if (c2628fh != null) {
            c2628fh.a(C2773l6.b(bundle), bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3079x1
    public final void a(@NonNull InterfaceC3053w1 interfaceC3053w1) {
        this.f37779c = interfaceC3053w1;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3079x1
    public final void a(Intent intent, int i4) {
        ((C3001u1) this.f37779c).f39889a.stopSelfResult(i4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3079x1
    public final void a(Intent intent, int i4, int i5) {
        ((C3001u1) this.f37779c).f39889a.stopSelfResult(i5);
    }
}
