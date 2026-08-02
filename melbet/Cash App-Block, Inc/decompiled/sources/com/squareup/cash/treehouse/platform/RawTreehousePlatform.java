package com.squareup.cash.treehouse.platform;

import app.cash.zipline.ZiplineService;
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
public interface RawTreehousePlatform extends ZiplineService {
    AccessibilityCallbackService accessibilityCallbackService();

    ActivityPaymentManager activityPaymentManager();

    ActivityPaymentManager2 activityPaymentManager2();

    BiometricsService biometricsService();

    HttpClient cashHttpClient();

    CashContextService contextService();

    DatadogService datadogService();

    ErrorReporterService errorReporterService();

    FinancialServicesBridge financialServicesBridge();

    HttpClient httpClient();

    OffersRepositoryService offersRepositoryService();

    PrefetchClient prefetchClient();

    RawAnalyticsService rawAnalyticsService();

    RawAppConfigService rawAppConfigService();

    RawAppMessagingService rawAppMessagingService();

    RawBadgingService rawBadgingService();

    RawBuildConfigService rawBuildConfigService();

    RawClipboardService rawClipboardService();

    RawFlagsService rawFlagsService();

    RawLoggerService rawLoggerService();

    RawOfflineActivityService rawOfflineActivityService();

    RawPreferencesService rawPreferencesService();

    RawSyncValueService rawSyncValueService();

    SqlDelightBridge sqlDelightBridge(String str, String str2);

    SqlDelightBridge sqldelightBridge(String str);

    TimeZoneService timeZoneService();
}
