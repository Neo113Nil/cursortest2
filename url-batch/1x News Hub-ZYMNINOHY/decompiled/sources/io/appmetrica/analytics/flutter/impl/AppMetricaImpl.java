package io.appmetrica.analytics.flutter.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;
import io.appmetrica.analytics.flutter.utils.Converter;
import io.appmetrica.analytics.flutter.utils.ECommerceConverter;
import io.appmetrica.analytics.flutter.utils.FlutterExternalAttribution;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class AppMetricaImpl implements Pigeon.AppMetricaPigeon {
    private final Context context;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    public Activity activity = null;

    /* renamed from: io.appmetrica.analytics.flutter.impl.AppMetricaImpl$1, reason: invalid class name */
    public class AnonymousClass1 implements DeferredDeeplinkListener {
        final /* synthetic */ Pigeon.Result val$result;

        public AnonymousClass1(Pigeon.Result result) {
            this.val$result = result;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onDeeplinkLoaded$0(Pigeon.Result result, String str) {
            result.success(Converter.toPigeon(str, (DeferredDeeplinkListener.Error) null, (String) null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onError$1(Pigeon.Result result, DeferredDeeplinkListener.Error error, String str) {
            result.success(Converter.toPigeon((String) null, error, str));
        }

        @Override // io.appmetrica.analytics.DeferredDeeplinkListener
        public void onDeeplinkLoaded(String str) {
            AppMetricaImpl.this.mainHandler.post(new a(this.val$result, str, 0));
        }

        @Override // io.appmetrica.analytics.DeferredDeeplinkListener
        public void onError(DeferredDeeplinkListener.Error error, String str) {
            AppMetricaImpl.this.mainHandler.post(new b(this.val$result, error, str, 0));
        }
    }

    /* renamed from: io.appmetrica.analytics.flutter.impl.AppMetricaImpl$2, reason: invalid class name */
    public class AnonymousClass2 implements DeferredDeeplinkParametersListener {
        final /* synthetic */ Pigeon.Result val$result;

        public AnonymousClass2(Pigeon.Result result) {
            this.val$result = result;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onError$1(Pigeon.Result result, DeferredDeeplinkParametersListener.Error error, String str) {
            result.success(Converter.toPigeon((Map<String, String>) null, error, str));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onParametersLoaded$0(Pigeon.Result result, Map map) {
            result.success(Converter.toPigeon((Map<String, String>) map, (DeferredDeeplinkParametersListener.Error) null, (String) null));
        }

        @Override // io.appmetrica.analytics.DeferredDeeplinkParametersListener
        public void onError(DeferredDeeplinkParametersListener.Error error, String str) {
            AppMetricaImpl.this.mainHandler.post(new b(this.val$result, error, str, 1));
        }

        @Override // io.appmetrica.analytics.DeferredDeeplinkParametersListener
        public void onParametersLoaded(Map<String, String> map) {
            AppMetricaImpl.this.mainHandler.post(new a(this.val$result, map, 1));
        }
    }

    /* renamed from: io.appmetrica.analytics.flutter.impl.AppMetricaImpl$3, reason: invalid class name */
    public class AnonymousClass3 implements StartupParamsCallback {
        final /* synthetic */ Pigeon.Result val$pigeonResult;

        public AnonymousClass3(Pigeon.Result result) {
            this.val$pigeonResult = result;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onReceive$0(Pigeon.Result result, StartupParamsCallback.Result result2) {
            result.success(Converter.toPigeon(result2, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onRequestError$1(Pigeon.Result result, StartupParamsCallback.Result result2, StartupParamsCallback.Reason reason) {
            result.success(Converter.toPigeon(result2, reason));
        }

        @Override // io.appmetrica.analytics.StartupParamsCallback
        public void onReceive(StartupParamsCallback.Result result) {
            AppMetricaImpl.this.mainHandler.post(new a(this.val$pigeonResult, result, 2));
        }

        @Override // io.appmetrica.analytics.StartupParamsCallback
        public void onRequestError(StartupParamsCallback.Reason reason, StartupParamsCallback.Result result) {
            AppMetricaImpl.this.mainHandler.post(new b(this.val$pigeonResult, result, reason, 2));
        }
    }

    public AppMetricaImpl(Context context) {
        this.context = context;
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void activate(Pigeon.AppMetricaConfigPigeon appMetricaConfigPigeon) {
        AppMetrica.activate(this.context, Converter.toNative(appMetricaConfigPigeon));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void activateReporter(Pigeon.ReporterConfigPigeon reporterConfigPigeon) {
        AppMetrica.activateReporter(this.context, Converter.toNative(reporterConfigPigeon));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void clearAppEnvironment() {
        AppMetrica.clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void enableActivityAutoTracking() {
        Activity activity = this.activity;
        if (activity != null) {
            AppMetrica.enableActivityAutoTracking(activity.getApplication());
        }
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public String getDeviceId() {
        return AppMetrica.getDeviceId(this.context);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public Long getLibraryApiLevel() {
        return Long.valueOf(AppMetrica.getLibraryApiLevel());
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public String getLibraryVersion() {
        return AppMetrica.getLibraryVersion();
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public String getUuid() {
        return AppMetrica.getUuid(this.context);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void handlePluginInitFinished() {
        AppMetrica.resumeSession(this.activity);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void pauseSession() {
        AppMetrica.pauseSession(this.activity);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void putAppEnvironmentValue(String str, String str2) {
        AppMetrica.putAppEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void putErrorEnvironmentValue(String str, String str2) {
        AppMetrica.putErrorEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void reportAdRevenue(Pigeon.AdRevenuePigeon adRevenuePigeon) {
        AppMetrica.reportAdRevenue(Converter.toNative(adRevenuePigeon));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void reportAppOpen(String str) {
        AppMetrica.reportAppOpen(str);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void reportECommerce(Pigeon.ECommerceEventPigeon eCommerceEventPigeon) {
        ECommerceEvent eCommerceEvent = ECommerceConverter.toNative(eCommerceEventPigeon);
        if (eCommerceEvent != null) {
            AppMetrica.reportECommerce(eCommerceEvent);
        }
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void reportError(Pigeon.ErrorDetailsPigeon errorDetailsPigeon, String str) {
        AppMetrica.getPluginExtension().reportError(Converter.toNative(errorDetailsPigeon), str);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void reportErrorWithGroup(String str, Pigeon.ErrorDetailsPigeon errorDetailsPigeon, String str2) {
        AppMetrica.getPluginExtension().reportError(str, str2, errorDetailsPigeon != null ? Converter.toNative(errorDetailsPigeon) : null);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void reportEvent(String str) {
        AppMetrica.reportEvent(str);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void reportEventWithJson(String str, String str2) {
        AppMetrica.reportEvent(str, str2);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void reportExternalAttribution(Pigeon.ExternalAttributionPigeon externalAttributionPigeon) {
        FlutterExternalAttribution flutterExternalAttribution = Converter.toNative(externalAttributionPigeon);
        ModulesFacade.reportExternalAttribution(flutterExternalAttribution.source, flutterExternalAttribution.data);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void reportReferralUrl(String str) {
        AppMetrica.reportReferralUrl(str);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void reportRevenue(Pigeon.RevenuePigeon revenuePigeon) {
        AppMetrica.reportRevenue(Converter.toNative(revenuePigeon));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void reportUnhandledException(Pigeon.ErrorDetailsPigeon errorDetailsPigeon) {
        AppMetrica.getPluginExtension().reportUnhandledException(Converter.toNative(errorDetailsPigeon));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void reportUserProfile(Pigeon.UserProfilePigeon userProfilePigeon) {
        AppMetrica.reportUserProfile(Converter.toNative(userProfilePigeon));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void requestDeferredDeeplink(Pigeon.Result<Pigeon.AppMetricaDeferredDeeplinkPigeon> result) {
        AppMetrica.requestDeferredDeeplink(new AnonymousClass1(result));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void requestDeferredDeeplinkParameters(Pigeon.Result<Pigeon.AppMetricaDeferredDeeplinkParametersPigeon> result) {
        AppMetrica.requestDeferredDeeplinkParameters(new AnonymousClass2(result));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void requestStartupParams(List<String> list, Pigeon.Result<Pigeon.StartupParamsPigeon> result) {
        AppMetrica.requestStartupParams(this.context, new AnonymousClass3(result), list);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void resumeSession() {
        AppMetrica.resumeSession(this.activity);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void sendEventsBuffer() {
        AppMetrica.sendEventsBuffer();
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void setAdvIdentifiersTracking(Boolean bool) {
        AppMetrica.setAdvIdentifiersTracking(bool.booleanValue());
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void setDataSendingEnabled(Boolean bool) {
        AppMetrica.setDataSendingEnabled(bool.booleanValue());
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void setLocation(Pigeon.LocationPigeon locationPigeon) {
        AppMetrica.setLocation(locationPigeon != null ? Converter.toNative(locationPigeon) : null);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void setLocationTracking(Boolean bool) {
        AppMetrica.setLocationTracking(bool.booleanValue());
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void setUserProfileID(String str) {
        AppMetrica.setUserProfileID(str);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon
    public void touchReporter(String str) {
        AppMetrica.getReporter(this.context, str);
    }
}
