package io.appmetrica.analytics.impl;

import a.AbstractC0124a;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class B1 implements A1, InterfaceC0936s0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f10071a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10072b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1119z1 f10073c;

    /* renamed from: d, reason: collision with root package name */
    public final C0475a4 f10074d;

    /* renamed from: e, reason: collision with root package name */
    public final J1 f10075e;

    /* renamed from: f, reason: collision with root package name */
    public Sg f10076f;

    /* renamed from: g, reason: collision with root package name */
    public final C0584ea f10077g;

    /* renamed from: h, reason: collision with root package name */
    public final C0628g2 f10078h;

    /* renamed from: i, reason: collision with root package name */
    public final C1 f10079i;

    /* renamed from: j, reason: collision with root package name */
    public final C0566dh f10080j;

    public B1(Context context, InterfaceC1119z1 interfaceC1119z1) {
        this(context, interfaceC1119z1, new C0554d5(context));
    }

    public final void a() {
        this.f10075e.c(new Vo(2, this));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void b(Intent intent) {
        this.f10075e.d(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String encodedAuthority = data == null ? null : data.getEncodedAuthority();
            if (!"io.appmetrica.analytics.IAppMetricaService".equals(action) || encodedAuthority == null || data == null || !Objects.equals(data.getPath(), "/client")) {
                return;
            }
            int parseInt = Integer.parseInt(data.getQueryParameter("pid"));
            this.f10074d.a(encodedAuthority, Integer.valueOf(parseInt), data.getQueryParameter("psid"));
            this.f10078h.a(parseInt);
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void c(Intent intent) {
        J1 j12 = this.f10075e;
        if (intent == null) {
            j12.getClass();
            return;
        }
        j12.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            j12.f10458a.a(action, Integer.valueOf(J1.a(intent)));
        }
        for (Map.Entry entry : j12.f10459b.entrySet()) {
            I1 i12 = (I1) entry.getKey();
            if (((H1) entry.getValue()).a(intent)) {
                i12.a(intent);
            }
        }
    }

    public final void d(Intent intent) {
        C0817na.f12417I.v().a(AbstractC0637gb.e(intent.getStringExtra("screen_size")));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onConfigurationChanged(Configuration configuration) {
        C0817na.f12417I.v().a(configuration);
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onCreate() {
        if (this.f10071a) {
            C0817na.f12417I.v().a(this.f10072b.getResources().getConfiguration());
        } else {
            this.f10077g.b(this.f10072b);
            C0817na c0817na = C0817na.f12417I;
            synchronized (c0817na) {
                c0817na.f12419B.initAsync();
                c0817na.f12444u.a(c0817na.f12426a);
                c0817na.f12444u.a(new C0727jo(c0817na.f12419B));
                NetworkServiceLocator.init(c0817na.f12426a, new C0605f5(new C0877pi(c0817na.h()), new C0864p5(c0817na.f12426a)));
                c0817na.l().a(c0817na.f12440q);
                c0817na.E();
            }
            Wj.f11193a.e();
            C0674hm c0674hm = C0817na.f12417I.f12444u;
            c0674hm.b();
            C0622fm b4 = c0674hm.b();
            C1086xk p2 = C0817na.f12417I.p();
            p2.a(new C0543ck(new C0484ad(this.f10075e)), b4);
            c0674hm.a(p2);
            ((Al) C0817na.f12417I.z()).getClass();
            a();
            C0817na.f12417I.m().init();
            C0817na.f12417I.c().init();
            C1 c12 = this.f10079i;
            Context context = this.f10072b;
            C0475a4 c0475a4 = this.f10074d;
            c12.getClass();
            this.f10076f = new Sg(context, c0475a4);
            Context context2 = this.f10072b;
            AbstractC0989u1.f12795a.b(context2);
            AppMetrica.getReporter(context2, "20799a27-fa80-4b36-b2db-0f8141f24180");
            Context context3 = this.f10072b;
            Sg sg = this.f10076f;
            Od r4 = C0817na.k().r();
            IHandlerExecutor d4 = C0817na.k().w().d();
            C0632g6 c0632g6 = new C0632g6(context3, sg, EnumC0508bb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new X(), new BlockingExecutor(), "previous");
            C0632g6 c0632g62 = new C0632g6(context3, sg, EnumC0508bb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new C0792mb(), d4, "actual");
            File crashesDirectory = FileUtils.getCrashesDirectory(context3);
            if (crashesDirectory != null) {
                FileObserverC0580e6 fileObserverC0580e6 = new FileObserverC0580e6(crashesDirectory, c0632g62, new C0481aa());
                d4.execute(new Uf(crashesDirectory, c0632g6));
                if (!crashesDirectory.exists()) {
                    crashesDirectory.mkdir();
                } else if (!crashesDirectory.isDirectory() && crashesDirectory.delete()) {
                    crashesDirectory.mkdir();
                }
                fileObserverC0580e6.startWatching();
                C0817na.f12417I.f12422E.storeReference(fileObserverC0580e6);
            }
            r4.getClass();
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context3);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                r4.f10750a.init(context3, new NativeCrashServiceConfig(absolutePath));
                List<NativeCrash> allCrashes = r4.f10750a.getAllCrashes();
                if (!allCrashes.isEmpty()) {
                    Jd b5 = r4.f10751b.b(context3, sg);
                    Iterator<T> it = allCrashes.iterator();
                    while (it.hasNext()) {
                        b5.newCrash((NativeCrash) it.next());
                    }
                }
                r4.f10750a.setDefaultCrashHandler(r4.f10751b.a(context3, sg));
            }
            new I5(AbstractC0124a.H(new Yg())).run();
            this.f10071a = true;
        }
        C0817na.f12417I.l().a();
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onDestroy() {
        Fb l4 = C0817na.f12417I.l();
        synchronized (l4) {
            ArrayList arrayList = l4.f10277c;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                ((InterfaceC0775lk) obj).onDestroy();
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void pauseUserSession(Bundle bundle) {
        Bf bf;
        bundle.setClassLoader(Bf.class.getClassLoader());
        String str = Bf.f10111c;
        try {
            bf = (Bf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            bf = null;
        }
        Integer asInteger = bf != null ? bf.f10112a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f10078h.b(asInteger.intValue());
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void reportData(int i4, Bundle bundle) {
        this.f10080j.getClass();
        List list = (List) C0817na.f12417I.v.f11808a.get(Integer.valueOf(i4));
        if (list == null) {
            list = d3.q.f8333a;
        }
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC0569dk) it.next()).reportData(i4, bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void resumeUserSession(Bundle bundle) {
        Bf bf;
        bundle.setClassLoader(Bf.class.getClassLoader());
        String str = Bf.f10111c;
        try {
            bf = (Bf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            bf = null;
        }
        Integer asInteger = bf != null ? bf.f10112a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f10078h.c(asInteger.intValue());
        }
    }

    public B1(Context context, InterfaceC1119z1 interfaceC1119z1, C0554d5 c0554d5) {
        this(context, interfaceC1119z1, new C0475a4(context, c0554d5), new J1(), C0584ea.f11782d, C0817na.k().e(), new C1());
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent) {
        J1 j12 = this.f10075e;
        if (intent == null) {
            j12.getClass();
            return;
        }
        j12.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            j12.f10458a.a(action, Integer.valueOf(J1.a(intent)));
        }
        for (Map.Entry entry : j12.f10459b.entrySet()) {
            I1 i12 = (I1) entry.getKey();
            if (((H1) entry.getValue()).a(intent)) {
                i12.a(intent);
            }
        }
    }

    public B1(Context context, InterfaceC1119z1 interfaceC1119z1, C0475a4 c0475a4, J1 j12, C0584ea c0584ea, C0628g2 c0628g2, C1 c12) {
        this.f10071a = false;
        this.f10072b = context;
        this.f10073c = interfaceC1119z1;
        this.f10074d = c0475a4;
        this.f10075e = j12;
        this.f10077g = c0584ea;
        this.f10078h = c0628g2;
        this.f10079i = c12;
        this.f10080j = new C0566dh();
    }

    public final void a(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        P5.b(bundle);
        Sg sg = this.f10076f;
        if (sg != null) {
            sg.a(P5.b(bundle), bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent, int i4) {
        ((C0988u0) this.f10073c).f12794a.stopSelf(i4);
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent, int i4, int i5) {
        ((C0988u0) this.f10073c).f12794a.stopSelf(i5);
    }
}
