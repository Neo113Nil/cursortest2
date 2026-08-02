package io.appmetrica.analytics.impl;

import a.AbstractC0129a;
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

/* loaded from: classes.dex */
public final class M1 implements A1, InterfaceC0814s0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6313a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f6314b;

    /* renamed from: c, reason: collision with root package name */
    public volatile InterfaceC0995z1 f6315c;

    /* renamed from: d, reason: collision with root package name */
    public final C0560i4 f6316d;

    /* renamed from: e, reason: collision with root package name */
    public final T1 f6317e;
    public Xg f;

    /* renamed from: g, reason: collision with root package name */
    public final C0643la f6318g;

    /* renamed from: h, reason: collision with root package name */
    public final C0739p2 f6319h;

    /* renamed from: i, reason: collision with root package name */
    public final N1 f6320i;

    /* renamed from: j, reason: collision with root package name */
    public final C0572ih f6321j;

    public M1(Context context, InterfaceC0995z1 interfaceC0995z1) {
        this(context, interfaceC0995z1, new C0612k5(context));
    }

    public final void a() {
        this.f6317e.c(new Uo(2, this));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void b(Intent intent) {
        this.f6317e.d(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String encodedAuthority = data == null ? null : data.getEncodedAuthority();
            if (!"io.appmetrica.analytics.IAppMetricaService".equals(action) || encodedAuthority == null || data == null || !Objects.equals(data.getPath(), "/client")) {
                return;
            }
            int parseInt = Integer.parseInt(data.getQueryParameter("pid"));
            this.f6316d.a(encodedAuthority, Integer.valueOf(parseInt), data.getQueryParameter("psid"));
            this.f6319h.a(parseInt);
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void c(Intent intent) {
        T1 t12 = this.f6317e;
        if (intent == null) {
            t12.getClass();
            return;
        }
        t12.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            t12.f6678a.a(action, Integer.valueOf(T1.a(intent)));
        }
        for (Map.Entry entry : t12.f6679b.entrySet()) {
            S1 s12 = (S1) entry.getKey();
            if (((R1) entry.getValue()).a(intent)) {
                s12.a(intent);
            }
        }
    }

    public final void d(Intent intent) {
        C0876ua.f8420H.v().a(AbstractC0696nb.e(intent.getStringExtra("screen_size")));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onConfigurationChanged(Configuration configuration) {
        C0876ua.f8420H.v().a(configuration);
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onCreate() {
        if (this.f6313a) {
            C0876ua.f8420H.v().a(this.f6314b.getResources().getConfiguration());
        } else {
            this.f6318g.b(this.f6314b);
            C0876ua c0876ua = C0876ua.f8420H;
            synchronized (c0876ua) {
                c0876ua.f8422B.initAsync();
                c0876ua.f8446u.a(c0876ua.f8428a);
                c0876ua.f8446u.a(new C0657lo(c0876ua.f8422B));
                NetworkServiceLocator.init(new C0664m5(new C0884ui(c0876ua.h()), new C0923w5(c0876ua.f8428a)));
                c0876ua.l().a(c0876ua.f8442q);
                c0876ua.E();
            }
            AbstractC0395bk.f7096a.e();
            C0655lm c0655lm = C0876ua.f8420H.f8446u;
            c0655lm.b();
            C0603jm b3 = c0655lm.b();
            Ck p3 = C0876ua.f8420H.p();
            p3.a(new C0550hk(new C0543hd(this.f6317e)), b3);
            c0655lm.a(p3);
            ((El) C0876ua.f8420H.A()).getClass();
            a();
            C0876ua.f8420H.m().init();
            C0876ua.f8420H.c().init();
            N1 n12 = this.f6320i;
            Context context = this.f6314b;
            C0560i4 c0560i4 = this.f6316d;
            n12.getClass();
            this.f = new Xg(context, c0560i4);
            Context context2 = this.f6314b;
            AbstractC0841t1.f8332a.b(context2);
            AppMetrica.getReporter(context2, "20799a27-fa80-4b36-b2db-0f8141f24180");
            Context context3 = this.f6314b;
            Xg xg = this.f;
            Vd r3 = C0876ua.k().r();
            IHandlerExecutor e3 = C0876ua.k().x().e();
            C0691n6 c0691n6 = new C0691n6(context3, xg, EnumC0567ib.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new X(), new BlockingExecutor(), "previous");
            C0691n6 c0691n62 = new C0691n6(context3, xg, EnumC0567ib.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new C0851tb(), e3, "actual");
            File crashesDirectory = FileUtils.getCrashesDirectory(context3);
            if (crashesDirectory != null) {
                FileObserverC0639l6 fileObserverC0639l6 = new FileObserverC0639l6(crashesDirectory, c0691n62, new C0540ha());
                e3.execute(new Zf(crashesDirectory, c0691n6));
                if (!crashesDirectory.exists()) {
                    crashesDirectory.mkdir();
                } else if (!crashesDirectory.isDirectory() && crashesDirectory.delete()) {
                    crashesDirectory.mkdir();
                }
                fileObserverC0639l6.startWatching();
                C0876ua.f8420H.f8425E.storeReference(fileObserverC0639l6);
            }
            r3.getClass();
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context3);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                r3.f6793a.init(context3, new NativeCrashServiceConfig(absolutePath));
                List<NativeCrash> allCrashes = r3.f6793a.getAllCrashes();
                if (!allCrashes.isEmpty()) {
                    Qd b4 = r3.f6794b.b(context3, xg);
                    Iterator<T> it = allCrashes.iterator();
                    while (it.hasNext()) {
                        b4.newCrash((NativeCrash) it.next());
                    }
                }
                r3.f6793a.setDefaultCrashHandler(r3.f6794b.a(context3, xg));
            }
            new P5(AbstractC0129a.r(new RunnableC0444dh())).run();
            this.f6313a = true;
        }
        C0876ua.f8420H.l().a();
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onDestroy() {
        Mb l3 = C0876ua.f8420H.l();
        synchronized (l3) {
            Iterator it = l3.f6330c.iterator();
            while (it.hasNext()) {
                ((InterfaceC0757pk) it.next()).onDestroy();
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void pauseUserSession(Bundle bundle) {
        Gf gf;
        bundle.setClassLoader(Gf.class.getClassLoader());
        String str = Gf.f6043c;
        try {
            gf = (Gf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            gf = null;
        }
        Integer asInteger = gf != null ? gf.f6044a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f6319h.b(asInteger.intValue());
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void reportData(int i3, Bundle bundle) {
        this.f6321j.getClass();
        List list = (List) C0876ua.f8420H.v.f7658a.get(Integer.valueOf(i3));
        if (list == null) {
            list = c2.m.f2637a;
        }
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC0575ik) it.next()).reportData(i3, bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void resumeUserSession(Bundle bundle) {
        Gf gf;
        bundle.setClassLoader(Gf.class.getClassLoader());
        String str = Gf.f6043c;
        try {
            gf = (Gf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            gf = null;
        }
        Integer asInteger = gf != null ? gf.f6044a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f6319h.c(asInteger.intValue());
        }
    }

    public M1(Context context, InterfaceC0995z1 interfaceC0995z1, C0612k5 c0612k5) {
        this(context, interfaceC0995z1, new C0560i4(context, c0612k5), new T1(), C0643la.f7816d, C0876ua.k().e(), new N1());
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent) {
        T1 t12 = this.f6317e;
        if (intent == null) {
            t12.getClass();
            return;
        }
        t12.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            t12.f6678a.a(action, Integer.valueOf(T1.a(intent)));
        }
        for (Map.Entry entry : t12.f6679b.entrySet()) {
            S1 s12 = (S1) entry.getKey();
            if (((R1) entry.getValue()).a(intent)) {
                s12.a(intent);
            }
        }
    }

    public M1(Context context, InterfaceC0995z1 interfaceC0995z1, C0560i4 c0560i4, T1 t12, C0643la c0643la, C0739p2 c0739p2, N1 n12) {
        this.f6313a = false;
        this.f6314b = context;
        this.f6315c = interfaceC0995z1;
        this.f6316d = c0560i4;
        this.f6317e = t12;
        this.f6318g = c0643la;
        this.f6319h = c0739p2;
        this.f6320i = n12;
        this.f6321j = new C0572ih();
    }

    public final void a(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        W5.b(bundle);
        Xg xg = this.f;
        if (xg != null) {
            xg.a(W5.b(bundle), bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(InterfaceC0995z1 interfaceC0995z1) {
        this.f6315c = interfaceC0995z1;
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent, int i3) {
        ((C0945x1) this.f6315c).f8605a.stopSelfResult(i3);
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent, int i3, int i4) {
        ((C0945x1) this.f6315c).f8605a.stopSelfResult(i4);
    }
}
