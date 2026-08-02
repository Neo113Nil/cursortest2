package com.squareup.cash.treehouse.flags;

import app.cash.zipline.ZiplineService;
import app.cash.zipline.internal.bridge.ReturningZiplineFunction;
import com.squareup.cash.treehouse.analytics.RawAnalyticsService;
import com.squareup.cash.treehouse.appconfig.RawAppConfigService;
import com.squareup.cash.treehouse.appmessaging.RawAppMessagingService;
import com.squareup.cash.treehouse.badging.RawBadgingService;
import com.squareup.cash.treehouse.biometrics.BiometricsService;
import com.squareup.cash.treehouse.buildconfig.RawBuildConfigService;
import com.squareup.cash.treehouse.clipboard.RawClipboardService;
import com.squareup.cash.treehouse.datadog.DatadogService;
import com.squareup.cash.treehouse.discover.DiscoverDataBridge$Companion$Adapter$GeneratedOutboundService;
import com.squareup.cash.treehouse.errorreporter.ErrorReport;
import com.squareup.cash.treehouse.errorreporter.ErrorReporterService;
import com.squareup.cash.treehouse.financialservices.FinancialServicesBridge;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlinx.serialization.KSerializer;

/* loaded from: classes7.dex */
public final class RawFlagsService$Companion$Adapter$ZiplineFunction0 extends ReturningZiplineFunction {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RawFlagsService$Companion$Adapter$ZiplineFunction0(String str, String str2, List list, KSerializer kSerializer, int i) {
        super(str, str2, list, kSerializer);
        this.$r8$classId = i;
    }

    @Override // app.cash.zipline.internal.bridge.ReturningZiplineFunction
    public final Object call(ZiplineService ziplineService, List list) {
        switch (this.$r8$classId) {
            case 0:
                RawFlagsService rawFlagsService = (RawFlagsService) ziplineService;
                rawFlagsService.getClass();
                list.getClass();
                return rawFlagsService.encodedClientDataFeatureFlags();
            case 1:
                RawAnalyticsService rawAnalyticsService = (RawAnalyticsService) ziplineService;
                rawAnalyticsService.getClass();
                list.getClass();
                rawAnalyticsService.close();
                return Unit.INSTANCE;
            case 2:
                RawAppConfigService rawAppConfigService = (RawAppConfigService) ziplineService;
                rawAppConfigService.getClass();
                list.getClass();
                return rawAppConfigService.bankingConfigByteString();
            case 3:
                RawAppConfigService rawAppConfigService2 = (RawAppConfigService) ziplineService;
                rawAppConfigService2.getClass();
                list.getClass();
                return rawAppConfigService2.bankingConfigByteStringFlow();
            case 4:
                RawAppConfigService rawAppConfigService3 = (RawAppConfigService) ziplineService;
                rawAppConfigService3.getClass();
                list.getClass();
                return rawAppConfigService3.clientDataByteStringFlow();
            case 5:
                RawAppConfigService rawAppConfigService4 = (RawAppConfigService) ziplineService;
                rawAppConfigService4.getClass();
                list.getClass();
                rawAppConfigService4.close();
                return Unit.INSTANCE;
            case 6:
                RawAppMessagingService rawAppMessagingService = (RawAppMessagingService) ziplineService;
                rawAppMessagingService.getClass();
                list.getClass();
                rawAppMessagingService.close();
                return Unit.INSTANCE;
            case 7:
                RawAppMessagingService rawAppMessagingService2 = (RawAppMessagingService) ziplineService;
                rawAppMessagingService2.getClass();
                list.getClass();
                return rawAppMessagingService2.getDisplayActivityInlineMessage();
            case 8:
                RawBadgingService rawBadgingService = (RawBadgingService) ziplineService;
                rawBadgingService.getClass();
                list.getClass();
                rawBadgingService.close();
                return Unit.INSTANCE;
            case 9:
                BiometricsService biometricsService = (BiometricsService) ziplineService;
                biometricsService.getClass();
                list.getClass();
                return Boolean.valueOf(biometricsService.isUserEnrolled());
            case 10:
                BiometricsService biometricsService2 = (BiometricsService) ziplineService;
                biometricsService2.getClass();
                list.getClass();
                return Boolean.valueOf(biometricsService2.promptForEnrollment());
            case 11:
                BiometricsService biometricsService3 = (BiometricsService) ziplineService;
                biometricsService3.getClass();
                list.getClass();
                biometricsService3.close();
                return Unit.INSTANCE;
            case 12:
                RawBuildConfigService rawBuildConfigService = (RawBuildConfigService) ziplineService;
                rawBuildConfigService.getClass();
                list.getClass();
                return rawBuildConfigService.encodedAppVersion();
            case 13:
                RawBuildConfigService rawBuildConfigService2 = (RawBuildConfigService) ziplineService;
                rawBuildConfigService2.getClass();
                list.getClass();
                return Boolean.valueOf(rawBuildConfigService2.isDebug());
            case 14:
                RawBuildConfigService rawBuildConfigService3 = (RawBuildConfigService) ziplineService;
                rawBuildConfigService3.getClass();
                list.getClass();
                rawBuildConfigService3.close();
                return Unit.INSTANCE;
            case 15:
                RawClipboardService rawClipboardService = (RawClipboardService) ziplineService;
                rawClipboardService.getClass();
                list.getClass();
                Object obj = list.get(0);
                obj.getClass();
                rawClipboardService.copy((String) obj);
                return Unit.INSTANCE;
            case 16:
                RawClipboardService rawClipboardService2 = (RawClipboardService) ziplineService;
                rawClipboardService2.getClass();
                list.getClass();
                rawClipboardService2.close();
                return Unit.INSTANCE;
            case 17:
                DatadogService datadogService = (DatadogService) ziplineService;
                datadogService.getClass();
                list.getClass();
                Object obj2 = list.get(0);
                obj2.getClass();
                Object obj3 = list.get(1);
                obj3.getClass();
                Object obj4 = list.get(2);
                obj4.getClass();
                datadogService.startSpan((String) obj2, (String) obj3, (Map) obj4);
                return Unit.INSTANCE;
            case 18:
                DatadogService datadogService2 = (DatadogService) ziplineService;
                datadogService2.getClass();
                list.getClass();
                Object obj5 = list.get(0);
                obj5.getClass();
                Object obj6 = list.get(1);
                obj6.getClass();
                Object obj7 = list.get(2);
                obj7.getClass();
                datadogService2.endSpan((String) obj5, (String) obj6, (Map) obj7);
                return Unit.INSTANCE;
            case 19:
                DatadogService datadogService3 = (DatadogService) ziplineService;
                datadogService3.getClass();
                list.getClass();
                Object obj8 = list.get(0);
                obj8.getClass();
                datadogService3.reportError((String) obj8, (Throwable) list.get(1));
                return Unit.INSTANCE;
            case 20:
                DatadogService datadogService4 = (DatadogService) ziplineService;
                datadogService4.getClass();
                list.getClass();
                Object obj9 = list.get(0);
                obj9.getClass();
                String str = (String) list.get(1);
                Object obj10 = list.get(2);
                obj10.getClass();
                datadogService4.startTrackingView((String) obj9, str, (Map) obj10);
                return Unit.INSTANCE;
            case 21:
                DatadogService datadogService5 = (DatadogService) ziplineService;
                datadogService5.getClass();
                list.getClass();
                Object obj11 = list.get(0);
                obj11.getClass();
                Object obj12 = list.get(1);
                obj12.getClass();
                datadogService5.stopTrackingView((String) obj11, (Map) obj12);
                return Unit.INSTANCE;
            case 22:
                DatadogService datadogService6 = (DatadogService) ziplineService;
                datadogService6.getClass();
                list.getClass();
                datadogService6.close();
                return Unit.INSTANCE;
            case 23:
                DiscoverDataBridge$Companion$Adapter$GeneratedOutboundService discoverDataBridge$Companion$Adapter$GeneratedOutboundService = (DiscoverDataBridge$Companion$Adapter$GeneratedOutboundService) ziplineService;
                discoverDataBridge$Companion$Adapter$GeneratedOutboundService.getClass();
                list.getClass();
                discoverDataBridge$Companion$Adapter$GeneratedOutboundService.close();
                return Unit.INSTANCE;
            case 24:
                ErrorReporterService errorReporterService = (ErrorReporterService) ziplineService;
                errorReporterService.getClass();
                list.getClass();
                Object obj13 = list.get(0);
                obj13.getClass();
                errorReporterService.report((ErrorReport) obj13);
                return Unit.INSTANCE;
            case 25:
                ErrorReporterService errorReporterService2 = (ErrorReporterService) ziplineService;
                errorReporterService2.getClass();
                list.getClass();
                errorReporterService2.close();
                return Unit.INSTANCE;
            case 26:
                FinancialServicesBridge financialServicesBridge = (FinancialServicesBridge) ziplineService;
                financialServicesBridge.getClass();
                list.getClass();
                financialServicesBridge.close();
                return Unit.INSTANCE;
            case 27:
                RawFlagsService rawFlagsService2 = (RawFlagsService) ziplineService;
                rawFlagsService2.getClass();
                list.getClass();
                Object obj14 = list.get(0);
                obj14.getClass();
                return rawFlagsService2.get((String) obj14);
            case 28:
                RawFlagsService rawFlagsService3 = (RawFlagsService) ziplineService;
                rawFlagsService3.getClass();
                list.getClass();
                Object obj15 = list.get(0);
                obj15.getClass();
                Object obj16 = list.get(1);
                obj16.getClass();
                return rawFlagsService3.get((String) obj15, ((Boolean) obj16).booleanValue());
            default:
                RawFlagsService rawFlagsService4 = (RawFlagsService) ziplineService;
                rawFlagsService4.getClass();
                list.getClass();
                rawFlagsService4.close();
                return Unit.INSTANCE;
        }
    }
}
