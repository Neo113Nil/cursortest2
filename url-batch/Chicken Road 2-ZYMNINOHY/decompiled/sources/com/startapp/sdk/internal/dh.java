package com.startapp.sdk.internal;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AutoInterstitialPreferences;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class dh extends k6 {
    @Override // com.startapp.sdk.internal.k6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean startsWith;
        gh ghVar = fh.f6918a;
        ghVar.getClass();
        boolean z = true;
        if (activity.getClass().getName().equals(si.a(activity))) {
            ghVar.f7015r = true;
        }
        ghVar.f7013p = bundle;
        if ((ghVar.f7015r || activity.getClass().getName().equals(si.a(activity))) && ghVar.f7013p == null && ghVar.f7007h.isEmpty() && ((g6) com.startapp.sdk.components.a.a(activity).f6569j.a()).a(false, null, null, null, null, null)) {
            ghVar.f7015r = false;
        }
        com.startapp.sdk.adsbase.e eVar = ja.f7141a;
        boolean equals = activity.getClass().getName().equals(si.a(activity));
        if (bundle == null) {
            String[] split = com.startapp.sdk.adsbase.e.class.getName().split("\\.");
            if (split.length < 3) {
                startsWith = false;
            } else {
                startsWith = activity.getClass().getName().startsWith(split[0] + "." + split[1] + "." + split[2]);
            }
            if (startsWith || equals) {
                return;
            }
            eVar.f6416d++;
            if (eVar.f6413a && AdsCommonMetaData.k().H()) {
                if (eVar.f6414b == null) {
                    eVar.f6414b = new AutoInterstitialPreferences();
                }
                boolean z4 = eVar.f6415c <= 0 || System.currentTimeMillis() >= eVar.f6415c + ((long) (eVar.f6414b.getSecondsBetweenAds() * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
                int i4 = eVar.f6416d;
                if (i4 > 0 && i4 < eVar.f6414b.getActivitiesBetweenAds()) {
                    z = false;
                }
                if (z4 && z) {
                    if (eVar.f6417e == null) {
                        eVar.f6417e = new StartAppAd(activity);
                    }
                    eVar.f6417e.loadAd(StartAppAd.AdMode.AUTOMATIC, new AdPreferences().setAi(Boolean.TRUE), new ia());
                }
            }
        }
    }

    @Override // com.startapp.sdk.internal.k6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        gh ghVar = fh.f6918a;
        ghVar.getClass();
        if (activity.getClass().getName().equals(si.a(activity))) {
            ghVar.f7015r = false;
        }
        if (ghVar.f7007h.size() == 0) {
            ghVar.f7002c = false;
        }
    }

    @Override // com.startapp.sdk.internal.k6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        gh ghVar = fh.f6918a;
        ghVar.getClass();
        ghVar.f7005f = System.currentTimeMillis();
        ghVar.f7010k = null;
    }

    @Override // com.startapp.sdk.internal.k6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        gh ghVar = fh.f6918a;
        if (ghVar.f7001b && ghVar.f7003d) {
            ghVar.f7003d = false;
            p pVar = (p) com.startapp.sdk.components.a.a(activity).f6552M.a();
            if (!pVar.f7413c) {
                synchronized (pVar.f7411a) {
                    try {
                        Iterator it = pVar.f7411a.values().iterator();
                        while (it.hasNext()) {
                            ((w2) it.next()).a();
                        }
                    } finally {
                    }
                }
            }
        }
        if (ghVar.f7011l) {
            ghVar.f7011l = false;
            com.startapp.sdk.adsbase.g.f(activity);
        }
        ghVar.f7010k = activity;
    }

    @Override // com.startapp.sdk.internal.k6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        gh ghVar = fh.f6918a;
        if (ghVar.f7002c && System.currentTimeMillis() - ghVar.f7005f > MetaData.E().V()) {
            mg.f7288d.a(activity, MetaDataRequest$RequestReason.APP_IDLE);
        }
        ghVar.f7004e = false;
        ghVar.f7002c = false;
        Integer num = (Integer) ghVar.f7007h.get(Integer.valueOf(activity.hashCode()));
        if (num == null) {
            num = 0;
        }
        ghVar.f7007h.put(Integer.valueOf(activity.hashCode()), Integer.valueOf(num.intValue() + 1));
    }

    @Override // com.startapp.sdk.internal.k6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        gh ghVar = fh.f6918a;
        Integer num = (Integer) ghVar.f7007h.get(Integer.valueOf(activity.hashCode()));
        if (num != null) {
            int intValue = num.intValue() - 1;
            Integer valueOf = Integer.valueOf(intValue);
            if (intValue == 0) {
                ghVar.f7007h.remove(Integer.valueOf(activity.hashCode()));
            } else {
                ghVar.f7007h.put(Integer.valueOf(activity.hashCode()), valueOf);
            }
            if (ghVar.f7007h.size() == 0) {
                if (!ghVar.f7004e) {
                    ghVar.f7002c = true;
                }
                if (ghVar.f7001b) {
                    p pVar = (p) com.startapp.sdk.components.a.a(activity).f6552M.a();
                    try {
                        if (!pVar.f7412b && CacheMetaData.b().a().g() && MetaData.E().f0()) {
                            ((Executor) pVar.f7417g.a()).execute(new RunnableC0371l(pVar));
                        }
                        for (w2 w2Var : pVar.f7411a.values()) {
                            q2 q2Var = w2Var.f7808t;
                            Handler handler = q2Var.f7431b;
                            if (handler != null) {
                                handler.removeCallbacksAndMessages(null);
                            }
                            q2Var.f7433d = false;
                            n2 n2Var = w2Var.f7809u;
                            Handler handler2 = n2Var.f7431b;
                            if (handler2 != null) {
                                handler2.removeCallbacksAndMessages(null);
                            }
                            n2Var.f7433d = false;
                        }
                    } catch (Throwable th) {
                        d9.a(th);
                    }
                    ghVar.f7003d = true;
                }
            }
        }
    }
}
