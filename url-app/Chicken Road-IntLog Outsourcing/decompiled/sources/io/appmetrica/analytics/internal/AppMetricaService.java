package io.appmetrica.analytics.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import io.appmetrica.analytics.impl.B1;
import io.appmetrica.analytics.impl.BinderC1121y1;
import io.appmetrica.analytics.impl.C0752jk;
import io.appmetrica.analytics.impl.C0763k5;
import io.appmetrica.analytics.impl.C0958rj;
import io.appmetrica.analytics.impl.C0984sj;
import io.appmetrica.analytics.impl.C1027ua;
import io.appmetrica.analytics.impl.C1096x1;
import io.appmetrica.analytics.impl.D1;
import io.appmetrica.analytics.impl.E1;
import io.appmetrica.analytics.impl.F1;
import io.appmetrica.analytics.impl.G1;
import io.appmetrica.analytics.impl.H1;
import io.appmetrica.analytics.impl.L1;
import io.appmetrica.analytics.impl.M1;
import io.appmetrica.analytics.impl.P1;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public class AppMetricaService extends Service {

    /* renamed from: c, reason: collision with root package name */
    private static L1 f9679c;

    /* renamed from: a, reason: collision with root package name */
    private final C1096x1 f9680a = new C1096x1(this);

    /* renamed from: b, reason: collision with root package name */
    private final a f9681b = new a();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        String action = intent.getAction();
        IBinder binderC1121y1 = (action == null || !action.startsWith("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK")) ? this.f9681b : new BinderC1121y1();
        L1 l12 = f9679c;
        l12.f7056a.execute(new F1(l12, intent));
        return binderC1121y1;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        L1 l12 = f9679c;
        l12.f7056a.execute(new B1(l12, configuration));
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C1027ua.a(getApplicationContext());
        BaseReleaseLogger.init(getApplicationContext());
        L1 l12 = f9679c;
        if (l12 == null) {
            Context applicationContext = getApplicationContext();
            M1 m12 = new M1(applicationContext, this.f9680a, new C0763k5(applicationContext));
            C0752jk c0752jk = C1027ua.f9366H.f9395v;
            P1 p12 = new P1(m12);
            LinkedHashMap linkedHashMap = c0752jk.f8554a;
            Object obj = linkedHashMap.get(1);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(1, obj);
            }
            ((List) obj).add(p12);
            f9679c = new L1(C1027ua.f9366H.f9377d.b(), m12);
        } else {
            l12.f7057b.a(this.f9680a);
        }
        C1027ua c1027ua = C1027ua.f9366H;
        C0984sj c0984sj = new C0984sj(f9679c);
        synchronized (c1027ua) {
            c1027ua.f9379f = new C0958rj(c1027ua.f9374a, c0984sj);
        }
        f9679c.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        f9679c.onDestroy();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        L1 l12 = f9679c;
        l12.f7056a.execute(new G1(l12, intent));
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i2) {
        L1 l12 = f9679c;
        l12.f7056a.execute(new D1(l12, intent, i2));
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        L1 l12 = f9679c;
        l12.f7056a.execute(new E1(l12, intent, i2, i3));
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        L1 l12 = f9679c;
        l12.f7056a.execute(new H1(l12, intent));
        String action = intent.getAction();
        return (action == null || !action.startsWith("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK")) && intent.getData() != null;
    }
}
