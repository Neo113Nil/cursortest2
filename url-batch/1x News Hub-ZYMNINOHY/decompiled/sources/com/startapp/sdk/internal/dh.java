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
        gh ghVar = fh.f3800a;
        ghVar.getClass();
        boolean z = true;
        if (activity.getClass().getName().equals(si.a(activity))) {
            ghVar.f3893r = true;
        }
        ghVar.f3891p = bundle;
        if ((ghVar.f3893r || activity.getClass().getName().equals(si.a(activity))) && ghVar.f3891p == null && ghVar.f3884h.isEmpty() && ((g6) com.startapp.sdk.components.a.a(activity).f3470j.a()).a(false, null, null, null, null, null)) {
            ghVar.f3893r = false;
        }
        com.startapp.sdk.adsbase.e eVar = ja.f4014a;
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
            eVar.f3326d++;
            if (eVar.f3323a && AdsCommonMetaData.k().H()) {
                if (eVar.f3324b == null) {
                    eVar.f3324b = new AutoInterstitialPreferences();
                }
                boolean z2 = eVar.f3325c <= 0 || System.currentTimeMillis() >= eVar.f3325c + ((long) (eVar.f3324b.getSecondsBetweenAds() * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
                int i3 = eVar.f3326d;
                if (i3 > 0 && i3 < eVar.f3324b.getActivitiesBetweenAds()) {
                    z = false;
                }
                if (z2 && z) {
                    if (eVar.f3327e == null) {
                        eVar.f3327e = new StartAppAd(activity);
                    }
                    eVar.f3327e.loadAd(StartAppAd.AdMode.AUTOMATIC, new AdPreferences().setAi(Boolean.TRUE), new ia());
                }
            }
        }
    }

    @Override // com.startapp.sdk.internal.k6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        gh ghVar = fh.f3800a;
        ghVar.getClass();
        if (activity.getClass().getName().equals(si.a(activity))) {
            ghVar.f3893r = false;
        }
        if (ghVar.f3884h.size() == 0) {
            ghVar.f3880c = false;
        }
    }

    @Override // com.startapp.sdk.internal.k6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        gh ghVar = fh.f3800a;
        ghVar.getClass();
        ghVar.f = System.currentTimeMillis();
        ghVar.f3887k = null;
    }

    @Override // com.startapp.sdk.internal.k6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        gh ghVar = fh.f3800a;
        if (ghVar.f3879b && ghVar.f3881d) {
            ghVar.f3881d = false;
            p pVar = (p) com.startapp.sdk.components.a.a(activity).f3454M.a();
            if (!pVar.f4278c) {
                synchronized (pVar.f4276a) {
                    try {
                        Iterator it = pVar.f4276a.values().iterator();
                        while (it.hasNext()) {
                            ((w2) it.next()).a();
                        }
                    } finally {
                    }
                }
            }
        }
        if (ghVar.f3888l) {
            ghVar.f3888l = false;
            com.startapp.sdk.adsbase.g.f(activity);
        }
        ghVar.f3887k = activity;
    }

    @Override // com.startapp.sdk.internal.k6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        gh ghVar = fh.f3800a;
        if (ghVar.f3880c && System.currentTimeMillis() - ghVar.f > MetaData.E().V()) {
            mg.f4159d.a(activity, MetaDataRequest$RequestReason.APP_IDLE);
        }
        ghVar.f3882e = false;
        ghVar.f3880c = false;
        Integer num = (Integer) ghVar.f3884h.get(Integer.valueOf(activity.hashCode()));
        if (num == null) {
            num = 0;
        }
        ghVar.f3884h.put(Integer.valueOf(activity.hashCode()), Integer.valueOf(num.intValue() + 1));
    }

    @Override // com.startapp.sdk.internal.k6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        gh ghVar = fh.f3800a;
        Integer num = (Integer) ghVar.f3884h.get(Integer.valueOf(activity.hashCode()));
        if (num != null) {
            int intValue = num.intValue() - 1;
            Integer valueOf = Integer.valueOf(intValue);
            if (intValue == 0) {
                ghVar.f3884h.remove(Integer.valueOf(activity.hashCode()));
            } else {
                ghVar.f3884h.put(Integer.valueOf(activity.hashCode()), valueOf);
            }
            if (ghVar.f3884h.size() == 0) {
                if (!ghVar.f3882e) {
                    ghVar.f3880c = true;
                }
                if (ghVar.f3879b) {
                    p pVar = (p) com.startapp.sdk.components.a.a(activity).f3454M.a();
                    try {
                        if (!pVar.f4277b && CacheMetaData.b().a().g() && MetaData.E().f0()) {
                            ((Executor) pVar.f4281g.a()).execute(new l(pVar));
                        }
                        for (w2 w2Var : pVar.f4276a.values()) {
                            q2 q2Var = w2Var.f4663t;
                            Handler handler = q2Var.f4296b;
                            if (handler != null) {
                                handler.removeCallbacksAndMessages(null);
                            }
                            q2Var.f4298d = false;
                            n2 n2Var = w2Var.f4664u;
                            Handler handler2 = n2Var.f4296b;
                            if (handler2 != null) {
                                handler2.removeCallbacksAndMessages(null);
                            }
                            n2Var.f4298d = false;
                        }
                    } catch (Throwable th) {
                        d9.a(th);
                    }
                    ghVar.f3881d = true;
                }
            }
        }
    }
}
