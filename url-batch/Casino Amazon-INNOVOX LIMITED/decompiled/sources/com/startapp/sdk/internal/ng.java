package com.startapp.sdk.internal;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AutoInterstitialPreferences;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ng extends b6 {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (r1.equals((r5 == null || (r5 = r5.getComponent()) == null) ? null : r5.getClassName()) != false) goto L23;
     */
    @Override // com.startapp.sdk.internal.b6, android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        ComponentName component;
        ComponentName component2;
        qg qgVar = pg.f382a;
        qgVar.getClass();
        String name = activity.getClass().getName();
        String str = null;
        Intent b = zh.b(activity, null);
        boolean equals = name.equals((b == null || (component2 = b.getComponent()) == null) ? null : component2.getClassName());
        boolean z = true;
        if (equals) {
            qgVar.r = true;
        }
        qgVar.p = bundle;
        if (!qgVar.r) {
            String name2 = activity.getClass().getName();
            Intent b2 = zh.b(activity, null);
        }
        if (qgVar.p == null && qgVar.h.isEmpty() && ((x5) com.startapp.sdk.components.a.a(activity).i.a()).a(false, null, null, null, null, null)) {
            qgVar.r = false;
        }
        com.startapp.sdk.adsbase.e eVar = q9.f389a;
        String name3 = activity.getClass().getName();
        Intent b3 = zh.b(activity, null);
        if (b3 != null && (component = b3.getComponent()) != null) {
            str = component.getClassName();
        }
        boolean equals2 = name3.equals(str);
        if (bundle == null) {
            String[] split = com.startapp.sdk.adsbase.e.class.getName().split("\\.");
            if ((split.length < 3 ? false : activity.getClass().getName().startsWith(split[0] + "." + split[1] + "." + split[2])) || equals2) {
                return;
            }
            eVar.d++;
            if (eVar.f141a && AdsCommonMetaData.k().H()) {
                if (eVar.b == null) {
                    eVar.b = new AutoInterstitialPreferences();
                }
                boolean z2 = eVar.c <= 0 || System.currentTimeMillis() >= eVar.c + ((long) (eVar.b.getSecondsBetweenAds() * 1000));
                int i = eVar.d;
                if (i > 0 && i < eVar.b.getActivitiesBetweenAds()) {
                    z = false;
                }
                if (z2 && z) {
                    if (eVar.e == null) {
                        eVar.e = new StartAppAd(activity);
                    }
                    eVar.e.loadAd(StartAppAd.AdMode.AUTOMATIC, new AdPreferences().setAi(Boolean.TRUE), new p9());
                }
            }
        }
    }

    @Override // com.startapp.sdk.internal.b6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        ComponentName component;
        qg qgVar = pg.f382a;
        qgVar.getClass();
        String name = activity.getClass().getName();
        String str = null;
        Intent b = zh.b(activity, null);
        if (b != null && (component = b.getComponent()) != null) {
            str = component.getClassName();
        }
        if (name.equals(str)) {
            qgVar.r = false;
        }
        if (qgVar.h.isEmpty()) {
            qgVar.c = false;
        }
    }

    @Override // com.startapp.sdk.internal.b6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        qg qgVar = pg.f382a;
        qgVar.getClass();
        qgVar.f = System.currentTimeMillis();
        qgVar.k = null;
    }

    @Override // com.startapp.sdk.internal.b6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        qg qgVar = pg.f382a;
        if (qgVar.b && qgVar.e) {
            qgVar.e = false;
            p pVar = (p) com.startapp.sdk.components.a.a(activity).M.a();
            if (!pVar.c) {
                synchronized (pVar.f371a) {
                    Iterator it = pVar.f371a.values().iterator();
                    while (it.hasNext()) {
                        ((q2) it.next()).a();
                    }
                }
            }
        }
        if (qgVar.l) {
            qgVar.l = false;
            com.startapp.sdk.adsbase.g.f(activity);
        }
        qgVar.k = new WeakReference(activity);
    }

    @Override // com.startapp.sdk.internal.b6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        qg qgVar = pg.f382a;
        if (qgVar.c && System.currentTimeMillis() - qgVar.f > MetaData.A().Q()) {
            vf.d.a(activity, MetaDataRequest$RequestReason.APP_IDLE);
        }
        qgVar.d = false;
        qgVar.c = false;
        Integer num = (Integer) qgVar.h.get(Integer.valueOf(activity.hashCode()));
        if (num == null) {
            num = 0;
        }
        qgVar.h.put(Integer.valueOf(activity.hashCode()), Integer.valueOf(num.intValue() + 1));
    }

    @Override // com.startapp.sdk.internal.b6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        qg qgVar = pg.f382a;
        Integer num = (Integer) qgVar.h.get(Integer.valueOf(activity.hashCode()));
        if (num != null) {
            int intValue = num.intValue() - 1;
            Integer valueOf = Integer.valueOf(intValue);
            HashMap hashMap = qgVar.h;
            if (intValue == 0) {
                hashMap.remove(Integer.valueOf(activity.hashCode()));
            } else {
                hashMap.put(Integer.valueOf(activity.hashCode()), valueOf);
            }
            if (qgVar.h.isEmpty()) {
                if (!qgVar.d) {
                    qgVar.c = true;
                }
                if (qgVar.b) {
                    p pVar = (p) com.startapp.sdk.components.a.a(activity).M.a();
                    try {
                        if (!pVar.b && CacheMetaData.b().a().g() && MetaData.A().Z()) {
                            ((Executor) pVar.g.a()).execute(new l(pVar));
                        }
                        for (q2 q2Var : pVar.f371a.values()) {
                            k2 k2Var = q2Var.t;
                            Handler handler = k2Var.b;
                            if (handler != null) {
                                handler.removeCallbacksAndMessages(null);
                            }
                            k2Var.d = false;
                            h2 h2Var = q2Var.u;
                            Handler handler2 = h2Var.b;
                            if (handler2 != null) {
                                handler2.removeCallbacksAndMessages(null);
                            }
                            h2Var.d = false;
                        }
                    } catch (Throwable th) {
                        n8.a(th);
                    }
                    qgVar.e = true;
                }
            }
        }
    }
}
