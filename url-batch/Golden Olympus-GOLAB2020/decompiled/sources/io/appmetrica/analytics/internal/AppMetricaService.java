package io.appmetrica.analytics.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.A1;
import io.appmetrica.analytics.impl.Aj;
import io.appmetrica.analytics.impl.B1;
import io.appmetrica.analytics.impl.BinderC3027v1;
import io.appmetrica.analytics.impl.C1;
import io.appmetrica.analytics.impl.C2813mk;
import io.appmetrica.analytics.impl.C3001u1;
import io.appmetrica.analytics.impl.C3105y1;
import io.appmetrica.analytics.impl.C3109y5;
import io.appmetrica.analytics.impl.C3149zj;
import io.appmetrica.analytics.impl.D1;
import io.appmetrica.analytics.impl.E1;
import io.appmetrica.analytics.impl.I1;
import io.appmetrica.analytics.impl.Ia;
import io.appmetrica.analytics.impl.J1;
import io.appmetrica.analytics.impl.M1;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes3.dex */
public class AppMetricaService extends Service {

    /* renamed from: c, reason: collision with root package name */
    private static I1 f40412c;

    /* renamed from: a, reason: collision with root package name */
    private final C3001u1 f40413a = new C3001u1(this);

    /* renamed from: b, reason: collision with root package name */
    private final a f40414b = new a();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        String action = intent.getAction();
        IBinder binderC3027v1 = (action == null || !action.startsWith("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK")) ? this.f40414b : new BinderC3027v1();
        I1 i12 = f40412c;
        i12.f37688a.execute(new C1(i12, intent));
        return binderC3027v1;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        I1 i12 = f40412c;
        i12.f37688a.execute(new C3105y1(i12, configuration));
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Ia.a(getApplicationContext());
        BaseReleaseLogger.init(getApplicationContext());
        I1 i12 = f40412c;
        if (i12 == null) {
            Context applicationContext = getApplicationContext();
            J1 j12 = new J1(applicationContext, this.f40413a, new C3109y5(applicationContext));
            C2813mk c2813mk = Ia.f37730F.f37757v;
            M1 m12 = new M1(j12);
            LinkedHashMap linkedHashMap = c2813mk.f39456a;
            Object obj = linkedHashMap.get(1);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(1, obj);
            }
            ((List) obj).add(m12);
            f40412c = new I1(Ia.f37730F.f37739d.b(), j12);
        } else {
            i12.f37689b.a(this.f40413a);
        }
        Ia ia = Ia.f37730F;
        Aj aj = new Aj(f40412c);
        synchronized (ia) {
            ia.f37741f = new C3149zj(ia.f37736a, aj);
        }
        f40412c.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        f40412c.onDestroy();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        I1 i12 = f40412c;
        i12.f37688a.execute(new D1(i12, intent));
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i4) {
        I1 i12 = f40412c;
        i12.f37688a.execute(new A1(i12, intent, i4));
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        I1 i12 = f40412c;
        i12.f37688a.execute(new B1(i12, intent, i4, i5));
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        I1 i12 = f40412c;
        i12.f37688a.execute(new E1(i12, intent));
        String action = intent.getAction();
        return (action == null || !action.startsWith("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK")) && intent.getData() != null;
    }
}
