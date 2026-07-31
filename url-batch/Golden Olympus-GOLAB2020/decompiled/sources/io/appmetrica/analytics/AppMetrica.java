package io.appmetrica.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.impl.AbstractC2898q1;
import io.appmetrica.analytics.impl.C2872p1;
import io.appmetrica.analytics.impl.F0;
import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AppMetrica {
    public static void activate(@NonNull Context context, @NonNull AppMetricaConfig appMetricaConfig) {
        AbstractC2898q1.f39645a.a(context, appMetricaConfig);
    }

    public static void activateReporter(@NonNull Context context, @NonNull ReporterConfig reporterConfig) {
        AbstractC2898q1.f39645a.a(context, reporterConfig);
    }

    public static void clearAppEnvironment() {
        AbstractC2898q1.f39645a.a();
    }

    public static void enableActivityAutoTracking(@NonNull Application application) {
        AbstractC2898q1.f39645a.a(application);
    }

    public static String getDeviceId(@NonNull Context context) {
        return AbstractC2898q1.f39645a.b();
    }

    public static int getLibraryApiLevel() {
        return BuildConfig.API_LEVEL;
    }

    @NonNull
    public static String getLibraryVersion() {
        return "7.10.0";
    }

    @NonNull
    public static AppMetricaPlugins getPluginExtension() {
        return F0.f37491a;
    }

    @NonNull
    public static IReporter getReporter(@NonNull Context context, @NonNull String str) {
        return AbstractC2898q1.f39645a.a(context, str);
    }

    public static String getUuid(@NonNull Context context) {
        return AbstractC2898q1.f39645a.a(context).id;
    }

    public static void initWebViewReporting(@NonNull WebView webView) {
        AbstractC2898q1.f39645a.a(webView);
    }

    public static void pauseSession(Activity activity) {
        AbstractC2898q1.f39645a.a(activity);
    }

    public static void putAppEnvironmentValue(@NonNull String str, String str2) {
        AbstractC2898q1.f39645a.a(str, str2);
    }

    public static void putErrorEnvironmentValue(@NonNull String str, String str2) {
        AbstractC2898q1.f39645a.b(str, str2);
    }

    public static void registerAnrListener(@NonNull AnrListener anrListener) {
        AbstractC2898q1.f39645a.a(anrListener);
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        AbstractC2898q1.f39645a.a(adRevenue);
    }

    public static void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        AbstractC2898q1.f39645a.a(map);
    }

    public static void reportAppOpen(@NonNull Activity activity) {
        AbstractC2898q1.f39645a.b(activity);
    }

    public static void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        AbstractC2898q1.f39645a.a(eCommerceEvent);
    }

    public static void reportError(@NonNull String str, String str2) {
        AbstractC2898q1.f39645a.a(str, str2, (Throwable) null);
    }

    public static void reportEvent(@NonNull String str) {
        AbstractC2898q1.f39645a.b(str);
    }

    public static void reportExternalAdRevenue(@NonNull Object... objArr) {
        AbstractC2898q1.f39645a.b(objArr);
    }

    public static void reportExternalAttribution(@NonNull ExternalAttribution externalAttribution) {
        AbstractC2898q1.f39645a.a(externalAttribution);
    }

    public static void reportReferralUrl(@NonNull String str) {
        AbstractC2898q1.f39645a.d(str);
    }

    public static void reportRevenue(@NonNull Revenue revenue) {
        AbstractC2898q1.f39645a.a(revenue);
    }

    public static void reportUnhandledException(@NonNull Throwable th) {
        AbstractC2898q1.f39645a.a(th);
    }

    public static void reportUserProfile(@NonNull UserProfile userProfile) {
        AbstractC2898q1.f39645a.a(userProfile);
    }

    public static void requestDeferredDeeplink(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        AbstractC2898q1.f39645a.a(deferredDeeplinkListener);
    }

    public static void requestDeferredDeeplinkParameters(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        AbstractC2898q1.f39645a.a(deferredDeeplinkParametersListener);
    }

    public static void requestStartupParams(@NonNull Context context, @NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        C2872p1 c2872p1 = AbstractC2898q1.f39645a;
        if (list.isEmpty()) {
            list = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH);
        }
        c2872p1.a(context, startupParamsCallback, list);
    }

    public static void resumeSession(Activity activity) {
        AbstractC2898q1.f39645a.c(activity);
    }

    public static void sendEventsBuffer() {
        AbstractC2898q1.f39645a.f();
    }

    public static void setAdvIdentifiersTracking(boolean z4) {
        AbstractC2898q1.f39645a.a(z4);
    }

    public static void setDataSendingEnabled(boolean z4) {
        AbstractC2898q1.f39645a.b(z4);
    }

    public static void setLocation(Location location) {
        AbstractC2898q1.f39645a.a(location);
    }

    public static void setLocationTracking(boolean z4) {
        AbstractC2898q1.f39645a.c(z4);
    }

    public static void setUserProfileID(String str) {
        AbstractC2898q1.f39645a.e(str);
    }

    public static void reportAppOpen(@NonNull Intent intent) {
        AbstractC2898q1.f39645a.a(intent);
    }

    public static void reportError(@NonNull String str, String str2, Throwable th) {
        AbstractC2898q1.f39645a.a(str, str2, th);
    }

    public static void reportEvent(@NonNull String str, String str2) {
        AbstractC2898q1.f39645a.c(str, str2);
    }

    public static void reportAppOpen(@NonNull String str) {
        AbstractC2898q1.f39645a.a(str);
    }

    public static void reportError(@NonNull String str, Throwable th) {
        AbstractC2898q1.f39645a.a(str, th);
    }

    public static void reportEvent(@NonNull String str, Map<String, Object> map) {
        AbstractC2898q1.f39645a.a(str, map);
    }
}
