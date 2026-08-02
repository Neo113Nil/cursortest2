package io.appmetrica.analytics.flutter.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;
import io.appmetrica.analytics.flutter.utils.Converter;
import io.appmetrica.analytics.flutter.utils.ECommerceConverter;

/* loaded from: classes.dex */
public class ReporterImpl implements Pigeon.ReporterPigeon {
    final Context context;

    public ReporterImpl(Context context) {
        this.context = context;
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void clearAppEnvironment(String str) {
        AppMetrica.getReporter(this.context, str).clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void pauseSession(String str) {
        AppMetrica.getReporter(this.context, str).pauseSession();
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void putAppEnvironmentValue(String str, String str2, String str3) {
        AppMetrica.getReporter(this.context, str).putAppEnvironmentValue(str2, str3);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void reportAdRevenue(String str, Pigeon.AdRevenuePigeon adRevenuePigeon) {
        AppMetrica.getReporter(this.context, str).reportAdRevenue(Converter.toNative(adRevenuePigeon));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void reportECommerce(String str, Pigeon.ECommerceEventPigeon eCommerceEventPigeon) {
        ECommerceEvent eCommerceEvent = ECommerceConverter.toNative(eCommerceEventPigeon);
        if (eCommerceEvent != null) {
            AppMetrica.getReporter(this.context, str).reportECommerce(eCommerceEvent);
        }
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void reportError(String str, Pigeon.ErrorDetailsPigeon errorDetailsPigeon, String str2) {
        AppMetrica.getReporter(this.context, str).getPluginExtension().reportError(Converter.toNative(errorDetailsPigeon), str2);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void reportErrorWithGroup(String str, String str2, Pigeon.ErrorDetailsPigeon errorDetailsPigeon, String str3) {
        AppMetrica.getReporter(this.context, str).getPluginExtension().reportError(str2, str3, errorDetailsPigeon != null ? Converter.toNative(errorDetailsPigeon) : null);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void reportEvent(String str, String str2) {
        AppMetrica.getReporter(this.context, str).reportEvent(str2);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void reportEventWithJson(String str, String str2, String str3) {
        AppMetrica.getReporter(this.context, str).reportEvent(str2, str3);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void reportRevenue(String str, Pigeon.RevenuePigeon revenuePigeon) {
        AppMetrica.getReporter(this.context, str).reportRevenue(Converter.toNative(revenuePigeon));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void reportUnhandledException(String str, Pigeon.ErrorDetailsPigeon errorDetailsPigeon) {
        AppMetrica.getReporter(this.context, str).getPluginExtension().reportUnhandledException(Converter.toNative(errorDetailsPigeon));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void reportUserProfile(String str, Pigeon.UserProfilePigeon userProfilePigeon) {
        AppMetrica.getReporter(this.context, str).reportUserProfile(Converter.toNative(userProfilePigeon));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void resumeSession(String str) {
        AppMetrica.getReporter(this.context, str).resumeSession();
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void sendEventsBuffer(String str) {
        AppMetrica.getReporter(this.context, str).sendEventsBuffer();
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void setDataSendingEnabled(String str, Boolean bool) {
        AppMetrica.getReporter(this.context, str).setDataSendingEnabled(bool.booleanValue());
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void setUserProfileID(String str, String str2) {
        AppMetrica.getReporter(this.context, str).setUserProfileID(str2);
    }
}
