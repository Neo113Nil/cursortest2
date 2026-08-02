package io.appmetrica.analytics.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import io.appmetrica.analytics.impl.B1;
import io.appmetrica.analytics.impl.BinderC0970y1;
import io.appmetrica.analytics.impl.C0601jk;
import io.appmetrica.analytics.impl.C0612k5;
import io.appmetrica.analytics.impl.C0807rj;
import io.appmetrica.analytics.impl.C0833sj;
import io.appmetrica.analytics.impl.C0876ua;
import io.appmetrica.analytics.impl.C0945x1;
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
    private static L1 f8717c;

    /* renamed from: a, reason: collision with root package name */
    private final C0945x1 f8718a = new C0945x1(this);

    /* renamed from: b, reason: collision with root package name */
    private final a f8719b = new a();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        String action = intent.getAction();
        IBinder binderC0970y1 = (action == null || !action.startsWith("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK")) ? this.f8719b : new BinderC0970y1();
        L1 l12 = f8717c;
        l12.f6251a.execute(new F1(l12, intent));
        return binderC0970y1;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        L1 l12 = f8717c;
        l12.f6251a.execute(new B1(l12, configuration));
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C0876ua.a(getApplicationContext());
        BaseReleaseLogger.init(getApplicationContext());
        L1 l12 = f8717c;
        if (l12 == null) {
            Context applicationContext = getApplicationContext();
            M1 m12 = new M1(applicationContext, this.f8718a, new C0612k5(applicationContext));
            C0601jk c0601jk = C0876ua.f8420H.v;
            P1 p1 = new P1(m12);
            LinkedHashMap linkedHashMap = c0601jk.f7658a;
            Object obj = linkedHashMap.get(1);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(1, obj);
            }
            ((List) obj).add(p1);
            f8717c = new L1(C0876ua.f8420H.f8431d.b(), m12);
        } else {
            l12.f6252b.a(this.f8718a);
        }
        C0876ua c0876ua = C0876ua.f8420H;
        C0833sj c0833sj = new C0833sj(f8717c);
        synchronized (c0876ua) {
            c0876ua.f = new C0807rj(c0876ua.f8428a, c0833sj);
        }
        f8717c.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        f8717c.onDestroy();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        L1 l12 = f8717c;
        l12.f6251a.execute(new G1(l12, intent));
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i3) {
        L1 l12 = f8717c;
        l12.f6251a.execute(new D1(l12, intent, i3));
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i3, int i4) {
        L1 l12 = f8717c;
        l12.f6251a.execute(new E1(l12, intent, i3, i4));
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        L1 l12 = f8717c;
        l12.f6251a.execute(new H1(l12, intent));
        String action = intent.getAction();
        return (action == null || !action.startsWith("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK")) && intent.getData() != null;
    }
}
