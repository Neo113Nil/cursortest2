package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceConfig;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class C1 implements B1, InterfaceC0490s0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f785a;
    public final Context b;
    public final A1 c;
    public final C0062b4 d;
    public final K1 e;
    public Tg f;
    public final C0171fa g;
    public final C0215h2 h;
    public final D1 i;
    public final C0152eh j;

    public C1(Context context, A1 a1) {
        this(context, a1, new C0140e5(context));
    }

    public final void a() {
        this.e.c(new J1() { // from class: io.appmetrica.analytics.impl.C1$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.impl.J1
            public final void a(Intent intent) {
                C1.this.d(intent);
            }
        });
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void b(Intent intent) {
        this.e.d(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String encodedAuthority = data == null ? null : data.getEncodedAuthority();
            if (!"io.appmetrica.analytics.IAppMetricaService".equals(action) || encodedAuthority == null || data == null || !Objects.equals(data.getPath(), "/client")) {
                return;
            }
            int parseInt = Integer.parseInt(data.getQueryParameter("pid"));
            this.d.a(encodedAuthority, Integer.valueOf(parseInt), data.getQueryParameter("psid"));
            this.h.a(parseInt);
        }
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void c(Intent intent) {
        K1 k1 = this.e;
        if (intent == null) {
            k1.getClass();
            return;
        }
        k1.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            k1.f913a.a(action, Integer.valueOf(K1.a(intent)));
        }
        for (Map.Entry entry : k1.b.entrySet()) {
            J1 j1 = (J1) entry.getKey();
            if (((I1) entry.getValue()).a(intent)) {
                j1.a(intent);
            }
        }
    }

    public final void d(Intent intent) {
        C0401oa.I.v().a(AbstractC0224hb.e(intent.getStringExtra("screen_size")));
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void onConfigurationChanged(Configuration configuration) {
        C0401oa.I.v().a(configuration);
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void onCreate() {
        if (this.f785a) {
            C0401oa.I.v().a(this.b.getResources().getConfiguration());
        } else {
            this.g.b(this.b);
            C0401oa c0401oa = C0401oa.I;
            synchronized (c0401oa) {
                c0401oa.B.initAsync();
                c0401oa.u.a(c0401oa.f1412a);
                c0401oa.u.a(new C0314ko(c0401oa.B));
                NetworkServiceLocator.init(new C0192g5(new C0459qi(c0401oa.h()), new C0446q5(c0401oa.f1412a)));
                c0401oa.l().a(c0401oa.q);
                c0401oa.E();
            }
            Xj.f1118a.e();
            C0260im c0260im = C0401oa.I.u;
            c0260im.b();
            C0209gm b = c0260im.b();
            C0660yk p = C0401oa.I.p();
            p.a(new C0130dk(new C0071bd(this.e)), b);
            c0260im.a(p);
            ((Bl) C0401oa.I.z()).getClass();
            a();
            C0401oa.I.m().init();
            C0401oa.I.c().init();
            D1 d1 = this.i;
            Context context = this.b;
            C0062b4 c0062b4 = this.d;
            d1.getClass();
            this.f = new Tg(context, c0062b4);
            Context context2 = this.b;
            AbstractC0566v1.f1524a.b(context2);
            AppMetrica.getReporter(context2, "20799a27-fa80-4b36-b2db-0f8141f24180");
            Context context3 = this.b;
            Tg tg = this.f;
            Pd r = C0401oa.k().r();
            IHandlerExecutor d = C0401oa.k().w().d();
            C0219h6 c0219h6 = new C0219h6(context3, tg, EnumC0095cb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new X(), new BlockingExecutor(), "previous");
            C0219h6 c0219h62 = new C0219h6(context3, tg, EnumC0095cb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new C0377nb(), d, "actual");
            File crashesDirectory = FileUtils.getCrashesDirectory(context3);
            if (crashesDirectory != null) {
                FileObserverC0167f6 fileObserverC0167f6 = new FileObserverC0167f6(crashesDirectory, c0219h62, new C0068ba());
                d.execute(new Vf(crashesDirectory, c0219h6));
                if (!crashesDirectory.exists()) {
                    crashesDirectory.mkdir();
                } else if (!crashesDirectory.isDirectory() && crashesDirectory.delete()) {
                    crashesDirectory.mkdir();
                }
                fileObserverC0167f6.startWatching();
                C0401oa.I.E.storeReference(fileObserverC0167f6);
            }
            r.getClass();
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context3);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                r.f1000a.init(context3, new NativeCrashServiceConfig(absolutePath));
                List<NativeCrash> allCrashes = r.f1000a.getAllCrashes();
                if (!allCrashes.isEmpty()) {
                    Kd b2 = r.b.b(context3, tg);
                    Iterator<T> it = allCrashes.iterator();
                    while (it.hasNext()) {
                        b2.newCrash((NativeCrash) it.next());
                    }
                }
                r.f1000a.setDefaultCrashHandler(r.b.a(context3, tg));
            }
            new J5(CollectionsKt.listOf(new Zg())).run();
            this.f785a = true;
        }
        C0401oa.I.l().a();
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void onDestroy() {
        Gb l = C0401oa.I.l();
        synchronized (l) {
            Iterator it = l.c.iterator();
            while (it.hasNext()) {
                ((InterfaceC0361mk) it.next()).onDestroy();
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void pauseUserSession(Bundle bundle) {
        Cf cf;
        bundle.setClassLoader(Cf.class.getClassLoader());
        String str = Cf.c;
        try {
            cf = (Cf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            cf = null;
        }
        Integer asInteger = cf != null ? cf.f798a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.h.b(asInteger.intValue());
        }
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void reportData(int i, Bundle bundle) {
        this.j.getClass();
        List list = (List) C0401oa.I.v.f1260a.get(Integer.valueOf(i));
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC0155ek) it.next()).reportData(i, bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void resumeUserSession(Bundle bundle) {
        Cf cf;
        bundle.setClassLoader(Cf.class.getClassLoader());
        String str = Cf.c;
        try {
            cf = (Cf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            cf = null;
        }
        Integer asInteger = cf != null ? cf.f798a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.h.c(asInteger.intValue());
        }
    }

    public C1(Context context, A1 a1, C0140e5 c0140e5) {
        this(context, a1, new C0062b4(context, c0140e5), new K1(), C0171fa.d, C0401oa.k().e(), new D1());
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void a(Intent intent) {
        K1 k1 = this.e;
        if (intent == null) {
            k1.getClass();
            return;
        }
        k1.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            k1.f913a.a(action, Integer.valueOf(K1.a(intent)));
        }
        for (Map.Entry entry : k1.b.entrySet()) {
            J1 j1 = (J1) entry.getKey();
            if (((I1) entry.getValue()).a(intent)) {
                j1.a(intent);
            }
        }
    }

    public C1(Context context, A1 a1, C0062b4 c0062b4, K1 k1, C0171fa c0171fa, C0215h2 c0215h2, D1 d1) {
        this.f785a = false;
        this.b = context;
        this.c = a1;
        this.d = c0062b4;
        this.e = k1;
        this.g = c0171fa;
        this.h = c0215h2;
        this.i = d1;
        this.j = new C0152eh();
    }

    public final void a(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        Q5.b(bundle);
        Tg tg = this.f;
        if (tg != null) {
            tg.a(Q5.b(bundle), bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void a(Intent intent, int i) {
        ((C0540u0) this.c).f1506a.stopSelf(i);
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void a(Intent intent, int i, int i2) {
        ((C0540u0) this.c).f1506a.stopSelf(i2);
    }
}
