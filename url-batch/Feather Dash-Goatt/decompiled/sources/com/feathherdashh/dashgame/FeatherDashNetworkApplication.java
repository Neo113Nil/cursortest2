package com.feathherdashh.dashgame;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import defpackage.af;
import defpackage.cx;
import defpackage.ej;
import defpackage.hx;
import defpackage.ik0;
import defpackage.ov;
import defpackage.wc1;
import kotlin.Pair;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class FeatherDashNetworkApplication extends Application {
    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        NotificationChannel notificationChannel = new NotificationChannel("feather_dash_rewards", "Feather Dash rewards", 3);
        NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
        synchronized (hx.a) {
            if (hx.f) {
                return;
            }
            hx.f = true;
            hx.g = getApplicationContext();
            hx.h = "Y3QpwEjUs62TcwetHHmRJf";
            Context applicationContext = getApplicationContext();
            if (!StringsKt.n("Y3QpwEjUs62TcwetHHmRJf")) {
                cx cxVar = new cx();
                AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
                appsFlyerLib.setDebugLog(true);
                appsFlyerLib.subscribeForDeepLink(new af(19));
                appsFlyerLib.init("Y3QpwEjUs62TcwetHHmRJf", cxVar, applicationContext);
                appsFlyerLib.start(applicationContext);
                return;
            }
            wc1 wc1Var = new wc1(ik0.c(new Pair("af_status", "Organic"), new Pair("af_message", "AppsFlyer dev key is missing")));
            ej ejVar = hx.b;
            if (!ejVar.W()) {
                ejVar.Y(wc1Var);
            }
            ov ovVar = ov.d;
            ovVar.getClass();
            ej ejVar2 = hx.c;
            if (!ejVar2.W()) {
                ejVar2.Y(ovVar);
            }
        }
    }
}
