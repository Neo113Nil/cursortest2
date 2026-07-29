package com.chartboost.sdk;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.c;
import com.chartboost.sdk.c.RunnableC0317c;
import com.chartboost.sdk.h;
import com.chartboost.sdk.h.a;
import com.chartboost.sdk.impl.aq;
import com.chartboost.sdk.impl.c.a;
import com.chartboost.sdk.impl.e.a;
import com.chartboost.sdk.impl.s;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class Chartboost {
    @Deprecated
    public static void closeImpression() {
    }

    public static String getSDKVersion() {
        return "7.3.1";
    }

    public static boolean hasMoreApps(String str) {
        return false;
    }

    public static void setShouldDisplayLoadingViewForMoreApps(boolean z) {
    }

    private Chartboost() {
    }

    public enum CBFramework {
        CBFrameworkUnity("Unity"),
        CBFrameworkCorona("Corona"),
        CBFrameworkAir("AIR"),
        CBFrameworkGameSalad("GameSalad"),
        CBFrameworkCordova("Cordova"),
        CBFrameworkCocoonJS("CocoonJS"),
        CBFrameworkCocos2dx("Cocos2dx"),
        CBFrameworkPrime31Unreal("Prime31Unreal"),
        CBFrameworkWeeby("Weeby"),
        CBFrameworkOther("Other");


        /* renamed from: a, reason: collision with root package name */
        private final String f3557a;

        CBFramework(String str) {
            this.f3557a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f3557a;
        }

        public boolean doesWrapperUseCustomShouldDisplayBehavior() {
            return this == CBFrameworkAir || this == CBFrameworkCocos2dx;
        }

        public boolean doesWrapperUseCustomBackgroundingBehavior() {
            return this == CBFrameworkAir;
        }
    }

    public enum CBMediation {
        CBMediationAdMarvel("AdMarvel"),
        CBMediationAdMob("AdMob"),
        CBMediationFuse("Fuse"),
        CBMediationFyber("Fyber"),
        CBMediationHeyZap("HeyZap"),
        CBMediationMoPub("MoPub"),
        CBMediationironSource("ironSource"),
        CBMediationHyprMX("HyprMX"),
        CBMediationAerServ("AerServ"),
        CBMediationOther("Other");


        /* renamed from: a, reason: collision with root package name */
        private final String f3559a;

        CBMediation(String str) {
            this.f3559a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f3559a;
        }
    }

    public enum CBPIDataUseConsent {
        UNKNOWN(-1),
        NO_BEHAVIORAL(0),
        YES_BEHAVIORAL(1);


        /* renamed from: b, reason: collision with root package name */
        private static Map<Integer, CBPIDataUseConsent> f3560b = new HashMap();

        /* renamed from: a, reason: collision with root package name */
        private int f3562a;

        static {
            for (CBPIDataUseConsent cBPIDataUseConsent : values()) {
                f3560b.put(Integer.valueOf(cBPIDataUseConsent.f3562a), cBPIDataUseConsent);
            }
        }

        CBPIDataUseConsent(int i) {
            this.f3562a = i;
        }

        public static CBPIDataUseConsent valueOf(int i) {
            CBPIDataUseConsent cBPIDataUseConsent = f3560b.get(Integer.valueOf(i));
            return cBPIDataUseConsent == null ? UNKNOWN : cBPIDataUseConsent;
        }

        public int getValue() {
            return this.f3562a;
        }
    }

    public static void startWithAppId(Activity activity, String str, String str2) {
        aq.a("Chartboost.startWithAppId", activity);
        f fVar = new f(0);
        fVar.h = activity;
        fVar.i = str;
        fVar.j = str2;
        h.b(fVar);
    }

    public static void setPIDataUseConsent(Context context, CBPIDataUseConsent cBPIDataUseConsent) {
        h.a(context, cBPIDataUseConsent);
    }

    public static CBPIDataUseConsent getPIDataUseConsent() {
        return i.x;
    }

    @Deprecated
    public static void restrictDataCollection(Context context, boolean z) {
        setPIDataUseConsent(context, z ? CBPIDataUseConsent.NO_BEHAVIORAL : CBPIDataUseConsent.UNKNOWN);
    }

    public static void onCreate(Activity activity) {
        aq.a("Chartboost.onCreate", activity);
        h a2 = h.a();
        if (a2 == null || i.s) {
            return;
        }
        a2.q.b(activity);
    }

    public static void onStart(Activity activity) {
        aq.a("Chartboost.onStart", activity);
        h a2 = h.a();
        if (a2 == null || i.s) {
            return;
        }
        a2.q.d(activity);
    }

    public static void onResume(Activity activity) {
        aq.a("Chartboost.onResume", activity);
        h a2 = h.a();
        if (a2 == null || i.s) {
            return;
        }
        a2.q.f(activity);
    }

    public static void onPause(Activity activity) {
        aq.a("Chartboost.onPause", activity);
        h a2 = h.a();
        if (a2 == null || i.s) {
            return;
        }
        a2.q.g(activity);
    }

    public static void onStop(Activity activity) {
        aq.a("Chartboost.onStop", activity);
        h a2 = h.a();
        if (a2 == null || i.s) {
            return;
        }
        a2.q.h(activity);
    }

    public static boolean onBackPressed() {
        aq.a("Chartboost.onBackPressed");
        h a2 = h.a();
        if (a2 == null) {
            return false;
        }
        return a2.q.j();
    }

    public static void onDestroy(Activity activity) {
        aq.a("Chartboost.onDestroy", activity);
        h a2 = h.a();
        if (a2 == null || i.s) {
            return;
        }
        a2.q.j(activity);
    }

    public static boolean hasRewardedVideo(String str) {
        aq.a("Chartboost.hasRewardedVideo", str);
        h a2 = h.a();
        return (a2 == null || !b.a() || a2.k.a(str) == null) ? false : true;
    }

    public static void cacheRewardedVideo(String str) {
        aq.a("Chartboost.cacheRewardedVideo", str);
        h a2 = h.a();
        if (a2 != null && b.a() && h.f()) {
            if (s.a().a(str)) {
                CBLogging.b("Chartboost", "cacheRewardedVideo location cannot be empty");
                Handler handler = a2.p;
                com.chartboost.sdk.impl.c cVar = a2.l;
                cVar.getClass();
                handler.post(cVar.new a(4, str, CBError.CBImpressionError.INVALID_LOCATION));
                return;
            }
            com.chartboost.sdk.Model.e eVar = a2.m.get();
            if ((eVar.y && eVar.E) || (eVar.e && eVar.j)) {
                com.chartboost.sdk.impl.e eVar2 = a2.k;
                eVar2.getClass();
                a2.f3667a.execute(eVar2.new a(3, str, null, null));
                return;
            }
            Handler handler2 = a2.p;
            com.chartboost.sdk.impl.c cVar2 = a2.l;
            cVar2.getClass();
            handler2.post(cVar2.new a(4, str, CBError.CBImpressionError.END_POINT_DISABLED));
        }
    }

    public static void showRewardedVideo(String str) {
        aq.a("Chartboost.showRewardedVideo", str);
        h a2 = h.a();
        if (a2 != null && b.a() && h.f()) {
            if (s.a().a(str)) {
                CBLogging.b("Chartboost", "showRewardedVideo location cannot be empty");
                Handler handler = a2.p;
                com.chartboost.sdk.impl.c cVar = a2.l;
                cVar.getClass();
                handler.post(cVar.new a(4, str, CBError.CBImpressionError.INVALID_LOCATION));
                return;
            }
            com.chartboost.sdk.Model.e eVar = a2.m.get();
            if ((eVar.y && eVar.E) || (eVar.e && eVar.j)) {
                com.chartboost.sdk.impl.e eVar2 = a2.k;
                eVar2.getClass();
                a2.f3667a.execute(eVar2.new a(4, str, null, null));
                return;
            }
            Handler handler2 = a2.p;
            com.chartboost.sdk.impl.c cVar2 = a2.l;
            cVar2.getClass();
            handler2.post(cVar2.new a(4, str, CBError.CBImpressionError.END_POINT_DISABLED));
        }
    }

    public static boolean hasInterstitial(String str) {
        aq.a("Chartboost.hasInterstitial", str);
        h a2 = h.a();
        return (a2 == null || !b.a() || a2.f.a(str) == null) ? false : true;
    }

    public static void cacheInterstitial(String str) {
        aq.a("Chartboost.cacheInterstitial", str);
        h a2 = h.a();
        if (a2 != null && b.a() && h.f()) {
            if (s.a().a(str)) {
                CBLogging.b("Chartboost", "cacheInterstitial location cannot be empty");
                Handler handler = a2.p;
                com.chartboost.sdk.impl.c cVar = a2.g;
                cVar.getClass();
                handler.post(cVar.new a(4, str, CBError.CBImpressionError.INVALID_LOCATION));
                return;
            }
            com.chartboost.sdk.Model.e eVar = a2.m.get();
            if ((eVar.y && eVar.A) || (eVar.e && eVar.g)) {
                com.chartboost.sdk.impl.e eVar2 = a2.f;
                eVar2.getClass();
                a2.f3667a.execute(eVar2.new a(3, str, null, null));
                return;
            }
            Handler handler2 = a2.p;
            com.chartboost.sdk.impl.c cVar2 = a2.g;
            cVar2.getClass();
            handler2.post(cVar2.new a(4, str, CBError.CBImpressionError.END_POINT_DISABLED));
        }
    }

    public static void showInterstitial(String str) {
        aq.a("Chartboost.showInterstitial", str);
        h a2 = h.a();
        if (a2 != null && b.a() && h.f()) {
            if (s.a().a(str)) {
                CBLogging.b("Chartboost", "showInterstitial location cannot be empty");
                Handler handler = a2.p;
                com.chartboost.sdk.impl.c cVar = a2.g;
                cVar.getClass();
                handler.post(cVar.new a(4, str, CBError.CBImpressionError.INVALID_LOCATION));
                return;
            }
            com.chartboost.sdk.Model.e eVar = a2.m.get();
            if ((eVar.y && eVar.A) || (eVar.e && eVar.g)) {
                com.chartboost.sdk.impl.e eVar2 = a2.f;
                eVar2.getClass();
                a2.f3667a.execute(eVar2.new a(4, str, null, null));
                return;
            }
            Handler handler2 = a2.p;
            com.chartboost.sdk.impl.c cVar2 = a2.g;
            cVar2.getClass();
            handler2.post(cVar2.new a(4, str, CBError.CBImpressionError.END_POINT_DISABLED));
        }
    }

    public static void cacheMoreApps(String str) {
        h a2 = h.a();
        if (a2 != null && b.a() && h.f()) {
            a2.getClass();
            h.a aVar = a2.new a(5);
            aVar.f3674b = str;
            a2.p.postDelayed(aVar, com.chartboost.sdk.Libraries.b.f3573c);
        }
    }

    public static void showMoreApps(String str) {
        cacheMoreApps(str);
    }

    public static boolean isAnyViewVisible() {
        aq.a("Chartboost.isAnyViewVisible");
        h a2 = h.a();
        return a2 != null && a2.q.e();
    }

    public static void setMediation(CBMediation cBMediation, String str) {
        aq.a("Chartboost.setMediation");
        f fVar = new f(3);
        fVar.f3664c = cBMediation;
        fVar.f3665d = str;
        h.b(fVar);
    }

    public static void setFramework(CBFramework cBFramework, String str) {
        aq.a("Chartboost.setFramework");
        f fVar = new f(4);
        fVar.f3663b = cBFramework;
        fVar.f3665d = str;
        h.b(fVar);
    }

    @Deprecated
    public static void setFrameworkVersion(String str) {
        aq.a("Chartboost.setFrameworkVersion", str);
        f fVar = new f(5);
        fVar.f3665d = str;
        h.b(fVar);
    }

    public static void setChartboostWrapperVersion(String str) {
        aq.a("Chartboost.setChartboostWrapperVersion", str);
        f fVar = new f(5);
        fVar.f3665d = str;
        h.b(fVar);
    }

    public static String getCustomId() {
        return !b.b() ? "" : i.f3677a;
    }

    public static void setCustomId(String str) {
        aq.a("Chartboost.setCustomId", str);
        f fVar = new f(6);
        fVar.e = str;
        h.b(fVar);
    }

    public static void setLoggingLevel(CBLogging.Level level) {
        aq.a("Chartboost.setLoggingLevel", level.toString());
        f fVar = new f(7);
        fVar.f = level;
        h.b(fVar);
    }

    public static CBLogging.Level getLoggingLevel() {
        b.b();
        return CBLogging.f3567a;
    }

    public static a getDelegate() {
        return i.f3679c;
    }

    public static void setDelegate(ChartboostDelegate chartboostDelegate) {
        aq.a("Chartboost.setDelegate", chartboostDelegate);
        f fVar = new f(8);
        fVar.g = chartboostDelegate;
        h.b(fVar);
    }

    public static boolean getAutoCacheAds() {
        return i.t;
    }

    public static void setAutoCacheAds(boolean z) {
        aq.a("Chartboost.setAutoCacheAds", z);
        h a2 = h.a();
        if (a2 != null) {
            a2.getClass();
            h.a aVar = a2.new a(1);
            aVar.f3675c = z;
            h.b(aVar);
        }
    }

    public static void setShouldRequestInterstitialsInFirstSession(boolean z) {
        aq.a("Chartboost.setShouldRequestInterstitialsInFirstSession", z);
        if (b.b()) {
            f fVar = new f(1);
            fVar.f3662a = z;
            h.b(fVar);
        }
    }

    public static void setShouldPrefetchVideoContent(boolean z) {
        aq.a("Chartboost.setShouldPrefetchVideoContent", z);
        h a2 = h.a();
        if (a2 == null || !b.a()) {
            return;
        }
        a2.getClass();
        h.a aVar = a2.new a(2);
        aVar.f3676d = z;
        h.b(aVar);
    }

    public static void setShouldHideSystemUI(Boolean bool) {
        aq.a("Chartboost.setHideSystemUI", bool);
        i.g = bool.booleanValue();
    }

    public static boolean isWebViewEnabled() {
        h a2 = h.a();
        return a2 == null || a2.m.get().y;
    }

    @TargetApi(14)
    public static void setActivityCallbacks(boolean z) {
        Activity a2;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
        aq.a("Chartboost.setActivityCallbacks", z);
        h a3 = h.a();
        if (a3 == null || (a2 = a3.q.a()) == null || (activityLifecycleCallbacks = a3.q.h) == null) {
            return;
        }
        if (!i.s && z) {
            a2.getApplication().registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
            i.s = true;
        } else {
            if (!i.s || z) {
                return;
            }
            a2.getApplication().unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            i.s = false;
        }
    }

    private static void showInterstitialAIR(String str, boolean z) {
        h a2 = h.a();
        if (a2 != null && b.a() && h.f()) {
            com.chartboost.sdk.Model.e eVar = a2.m.get();
            if ((eVar.y && eVar.A) || (eVar.e && eVar.g)) {
                Handler handler = a2.p;
                com.chartboost.sdk.impl.c cVar = a2.g;
                cVar.getClass();
                handler.post(cVar.new a(4, str, CBError.CBImpressionError.INTERNAL));
                return;
            }
            i.f3679c.didFailToLoadInterstitial(str, CBError.CBImpressionError.END_POINT_DISABLED);
        }
    }

    private static void showMoreAppsAIR(String str, boolean z) {
        cacheMoreApps(str);
    }

    private static void showRewardedVideoAIR(String str, boolean z) {
        h a2 = h.a();
        if (a2 != null && b.a() && h.f()) {
            com.chartboost.sdk.Model.e eVar = a2.m.get();
            if ((eVar.y && eVar.E) || (eVar.e && eVar.j)) {
                Handler handler = a2.p;
                com.chartboost.sdk.impl.c cVar = a2.g;
                cVar.getClass();
                handler.post(cVar.new a(4, str, CBError.CBImpressionError.INTERNAL));
                return;
            }
            i.f3679c.didFailToLoadRewardedVideo(str, CBError.CBImpressionError.END_POINT_DISABLED);
        }
    }

    private static void forwardTouchEventsAIR(boolean z) {
        h a2 = h.a();
        if (a2 == null) {
            return;
        }
        c cVar = a2.q;
        cVar.getClass();
        c.RunnableC0317c runnableC0317c = cVar.new RunnableC0317c(6);
        runnableC0317c.f3641c = z;
        h.b(runnableC0317c);
    }

    @TargetApi(28)
    public static void setActivityAttrs(Activity activity) {
        if (activity == null || !i.g) {
            if ((activity.getWindow().getAttributes().flags & 1024) != 0) {
                CBLogging.d("Chartboost", "Attempting to show Status and Navigation bars on a fullscreen activity. Please change your Chartboost activity theme to: \"@android:style/Theme.Translucent\"` in your Manifest file");
                return;
            }
            return;
        }
        Window window = activity.getWindow();
        int i = 2;
        if (s.a().a(16)) {
            i = Build.VERSION.SDK_INT >= 19 ? 5894 : 1798;
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
        }
        window.getDecorView().setSystemUiVisibility(i);
    }
}
