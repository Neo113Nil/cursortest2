package com.squareup.cash.treehouse.platform;

import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;
import com.squareup.cash.treehouse.accessibility.AccessibilityCallbackService;
import com.squareup.cash.treehouse.activity.ActivityPaymentManager;
import com.squareup.cash.treehouse.activity.ActivityPaymentManager2;
import com.squareup.cash.treehouse.activity.OffersRepositoryService;
import com.squareup.cash.treehouse.activity.RawOfflineActivityService;
import com.squareup.cash.treehouse.activity.TimeZoneService;
import com.squareup.cash.treehouse.analytics.RawAnalyticsService;
import com.squareup.cash.treehouse.appconfig.RawAppConfigService;
import com.squareup.cash.treehouse.appmessaging.RawAppMessagingService;
import com.squareup.cash.treehouse.badging.RawBadgingService;
import com.squareup.cash.treehouse.biometrics.BiometricsService;
import com.squareup.cash.treehouse.buildconfig.RawBuildConfigService;
import com.squareup.cash.treehouse.clipboard.RawClipboardService;
import com.squareup.cash.treehouse.datadog.DatadogService;
import com.squareup.cash.treehouse.errorreporter.ErrorReporterService;
import com.squareup.cash.treehouse.financialservices.FinancialServicesBridge;
import com.squareup.cash.treehouse.flags.RawFlagsService;
import com.squareup.cash.treehouse.logger.RawLoggerService;
import com.squareup.cash.treehouse.network.HttpClient;
import com.squareup.cash.treehouse.network.prefetch.PrefetchClient;
import com.squareup.cash.treehouse.preferences.RawPreferencesService;
import com.squareup.cash.treehouse.sqldelight.SqlDelightBridge;
import com.squareup.cash.treehouse.sync.RawSyncValueService;

/* loaded from: classes7.dex */
public final class RawTreehousePlatform$Companion$Adapter$GeneratedOutboundService implements RawTreehousePlatform, OutboundService {
    public final OutboundCallHandler callHandler;

    public RawTreehousePlatform$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
    public final AccessibilityCallbackService accessibilityCallbackService() {
        Object call = this.callHandler.call(this, 25, new Object[0]);
        call.getClass();
        return (AccessibilityCallbackService) call;
    }

    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
    public final ActivityPaymentManager activityPaymentManager() {
        Object call = this.callHandler.call(this, 0, new Object[0]);
        call.getClass();
        return (ActivityPaymentManager) call;
    }

    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
    public final ActivityPaymentManager2 activityPaymentManager2() {
        Object call = this.callHandler.call(this, 1, new Object[0]);
        call.getClass();
        return (ActivityPaymentManager2) call;
    }

    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
    public final BiometricsService biometricsService() {
        Object call = this.callHandler.call(this, 16, new Object[0]);
        call.getClass();
        return (BiometricsService) call;
    }

    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
    public final HttpClient cashHttpClient() {
        Object call = this.callHandler.call(this, 4, new Object[0]);
        call.getClass();
        return (HttpClient) call;
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        Object call = this.callHandler.call(this, 26, new Object[0]);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
    public final CashContextService contextService() {
        Object call = this.callHandler.call(this, 15, new Object[0]);
        call.getClass();
        return (CashContextService) call;
    }

    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
    public final DatadogService datadogService() {
        Object call = this.callHandler.call(this, 18, new Object[0]);
        call.getClass();
        return (DatadogService) call;
    }

    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
    public final ErrorReporterService errorReporterService() {
        Object call = this.callHandler.call(this, 22, new Object[0]);
        call.getClass();
        return (ErrorReporterService) call;
    }

    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
    public final FinancialServicesBridge financialServicesBridge() {
        Object call = this.callHandler.call(this, 17, new Object[0]);
        call.getClass();
        return (FinancialServicesBridge) call;
    }

    @Override // app.cash.zipline.internal.bridge.OutboundService
    public final OutboundCallHandler getCallHandler() {
        return this.callHandler;
    }

    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
    public final HttpClient httpClient() {
        Object call = this.callHandler.call(this, 5, new Object[0]);
        call.getClass();
        return (HttpClient) call;
    }

    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
    public final OffersRepositoryService offersRepositoryService() {
        Object call = this.callHandler.call(this, 2, new Object[0]);
        call.getClass();
        return (OffersRepositoryService) call;
    }

    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
    public final PrefetchClient prefetchClient() {
        Object call = this.callHandler.call(this, 6, new Object[0]);
        call.getClass();
        return (PrefetchClient) call;
    }

    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
    public final RawAnalyticsService rawAnalyticsService() {
        Object call = this.callHandler.call(this, 7, new Object[0]);
        call.getClass();
        return (RawAnalyticsService) call;
    }

    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
    public final RawAppConfigService rawAppConfigService() {
        Object call = this.callHandler.call(this, 8, new Object[0]);
        call.getClass();
        return (RawAppConfigService) call;
    }

    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
    public final RawAppMessagingService rawAppMessagingService() {
        Object call = this.callHandler.call(this, 9, new Object[0]);
        call.getClass();
        return (RawAppMessagingService) call;
    }

    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
    public final RawBadgingService rawBadgingService() {
        Object call = this.callHandler.call(this, 10, new Object[0]);
        call.getClass();
        return (RawBadgingService) call;
    }

    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
    public final RawBuildConfigService rawBuildConfigService() {
        Object call = this.callHandler.call(this, 11, new Object[0]);
        call.getClass();
        return (RawBuildConfigService) call;
    }

    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
    public final RawClipboardService rawClipboardService() {
        Object call = this.callHandler.call(this, 23, new Object[0]);
        call.getClass();
        return (RawClipboardService) call;
    }

    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
    public final RawFlagsService rawFlagsService() {
        Object call = this.callHandler.call(this, 12, new Object[0]);
        call.getClass();
        return (RawFlagsService) call;
    }

    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
    public final RawLoggerService rawLoggerService() {
        Object call = this.callHandler.call(this, 21, new Object[0]);
        call.getClass();
        return (RawLoggerService) call;
    }

    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
    public final RawOfflineActivityService rawOfflineActivityService() {
        Object call = this.callHandler.call(this, 3, new Object[0]);
        call.getClass();
        return (RawOfflineActivityService) call;
    }

    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
    public final RawPreferencesService rawPreferencesService() {
        Object call = this.callHandler.call(this, 13, new Object[0]);
        call.getClass();
        return (RawPreferencesService) call;
    }

    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
    public final RawSyncValueService rawSyncValueService() {
        Object call = this.callHandler.call(this, 14, new Object[0]);
        call.getClass();
        return (RawSyncValueService) call;
    }

    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
    public final SqlDelightBridge sqlDelightBridge(String str, String str2) {
        Object call = this.callHandler.call(this, 20, str, str2);
        call.getClass();
        return (SqlDelightBridge) call;
    }

    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
    public final SqlDelightBridge sqldelightBridge(String str) {
        Object call = this.callHandler.call(this, 19, str);
        call.getClass();
        return (SqlDelightBridge) call;
    }

    @Override // com.squareup.cash.treehouse.platform.RawTreehousePlatform
    public final TimeZoneService timeZoneService() {
        Object call = this.callHandler.call(this, 24, new Object[0]);
        call.getClass();
        return (TimeZoneService) call;
    }
}
