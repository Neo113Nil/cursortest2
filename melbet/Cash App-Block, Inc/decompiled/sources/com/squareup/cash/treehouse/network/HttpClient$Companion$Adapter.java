package com.squareup.cash.treehouse.network;

import app.cash.redwood.treehouse.AppLifecycle$Companion$Adapter$GeneratedOutboundService;
import app.cash.redwood.treehouse.ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService;
import app.cash.zipline.ZiplineFunction;
import app.cash.zipline.ZiplineService;
import app.cash.zipline.internal.HostService$Companion$Adapter;
import app.cash.zipline.internal.bridge.InternalSerializersKt;
import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;
import app.cash.zipline.internal.bridge.ReturningZiplineFunction;
import app.cash.zipline.internal.bridge.SuspendingZiplineFunction;
import app.cash.zipline.internal.bridge.ZiplineServiceAdapter;
import app.cash.zipline.internal.bridge.ZiplineServiceAdapterKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import com.squareup.cash.treehouse.errorreporter.ErrorReport;
import com.squareup.cash.treehouse.errorreporter.ErrorReporterService$Companion$Adapter$GeneratedOutboundService;
import com.squareup.cash.treehouse.financialservices.FinancialServicesBridge$Companion$Adapter$GeneratedOutboundService;
import com.squareup.cash.treehouse.flags.RawFlagsService$Companion$Adapter$GeneratedOutboundService;
import com.squareup.cash.treehouse.flags.RawFlagsService$Companion$Adapter$ZiplineFunction0;
import com.squareup.cash.treehouse.flows.BlockerScreenSpec;
import com.squareup.cash.treehouse.flows.FlowSpec;
import com.squareup.cash.treehouse.flows.RawFlowService;
import com.squareup.cash.treehouse.flows.RawFlowService$Companion$Adapter$GeneratedOutboundService;
import com.squareup.cash.treehouse.flows.RawFlowService$Companion$Adapter$ZiplineFunction0;
import com.squareup.cash.treehouse.hostview.HostViewService;
import com.squareup.cash.treehouse.hostview.HostViewService$Companion$Adapter$GeneratedOutboundService;
import com.squareup.cash.treehouse.hostview.LifecycleState;
import com.squareup.cash.treehouse.logger.LogMessage;
import com.squareup.cash.treehouse.logger.RawLoggerService;
import com.squareup.cash.treehouse.logger.RawLoggerService$Companion$Adapter$GeneratedOutboundService;
import com.squareup.cash.treehouse.navigation.Navigator;
import com.squareup.cash.treehouse.navigation.Navigator$Companion$Adapter$GeneratedOutboundService;
import com.squareup.cash.treehouse.navigation.TreehouseRoutingParams;
import com.squareup.cash.treehouse.network.HttpResponse;
import com.squareup.cash.treehouse.network.prefetch.PrefetchClient;
import com.squareup.cash.treehouse.network.prefetch.PrefetchClient$Companion$Adapter$GeneratedOutboundService;
import com.squareup.cash.treehouse.platform.CashContextService;
import com.squareup.cash.treehouse.platform.CashContextService$Companion$Adapter$GeneratedOutboundService;
import com.squareup.cash.treehouse.platform.RawTreehousePlatform;
import com.squareup.cash.treehouse.platform.RawTreehousePlatform$Companion$Adapter$GeneratedOutboundService;
import com.squareup.cash.treehouse.preferences.RawPreferencesService;
import com.squareup.cash.treehouse.preferences.RawPreferencesService$Companion$Adapter$GeneratedOutboundService;
import com.squareup.cash.treehouse.sqldelight.SqlDelightBridge;
import com.squareup.cash.treehouse.sqldelight.SqlDelightBridge$Companion$Adapter$GeneratedOutboundService;
import com.squareup.cash.treehouse.sqldelight.SqlType;
import com.squareup.cash.treehouse.sync.RawSyncValueService$Companion$Adapter$GeneratedOutboundService;
import com.squareup.cash.treehouse.ui.PathRoutableAppService$Companion$Adapter$GeneratedOutboundService;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.UnitSerializer;
import kotlinx.serialization.modules.SerializersModule;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class HttpClient$Companion$Adapter extends ZiplineServiceAdapter {
    public final /* synthetic */ int $r8$classId;
    public final String serialName;
    public final List serializers;
    public final String simpleName;

    public final class GeneratedOutboundService implements HttpClient, OutboundService {
        public final OutboundCallHandler callHandler;

        public GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
            this.callHandler = outboundCallHandler;
        }

        @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
        public final void close() {
            Object call = this.callHandler.call(this, 1, new Object[0]);
            call.getClass();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // com.squareup.cash.treehouse.network.HttpClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object execute(HttpRequest httpRequest, Continuation continuation) {
            HttpClient$Companion$Adapter$GeneratedOutboundService$execute$1 httpClient$Companion$Adapter$GeneratedOutboundService$execute$1;
            int i;
            if (continuation instanceof HttpClient$Companion$Adapter$GeneratedOutboundService$execute$1) {
                httpClient$Companion$Adapter$GeneratedOutboundService$execute$1 = (HttpClient$Companion$Adapter$GeneratedOutboundService$execute$1) continuation;
                int i2 = httpClient$Companion$Adapter$GeneratedOutboundService$execute$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    httpClient$Companion$Adapter$GeneratedOutboundService$execute$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = httpClient$Companion$Adapter$GeneratedOutboundService$execute$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = httpClient$Companion$Adapter$GeneratedOutboundService$execute$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        httpClient$Companion$Adapter$GeneratedOutboundService$execute$1.label = 1;
                        obj = this.callHandler.callSuspending(this, 0, new Object[]{httpRequest}, httpClient$Companion$Adapter$GeneratedOutboundService$execute$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    obj.getClass();
                    return (HttpResponse) obj;
                }
            }
            httpClient$Companion$Adapter$GeneratedOutboundService$execute$1 = new HttpClient$Companion$Adapter$GeneratedOutboundService$execute$1(this, (ContinuationImpl) continuation);
            Object obj2 = httpClient$Companion$Adapter$GeneratedOutboundService$execute$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = httpClient$Companion$Adapter$GeneratedOutboundService$execute$1.label;
            if (i != 0) {
            }
            obj2.getClass();
            return (HttpResponse) obj2;
        }

        @Override // app.cash.zipline.internal.bridge.OutboundService
        public final OutboundCallHandler getCallHandler() {
            return this.callHandler;
        }
    }

    public final class ZiplineFunction0 extends SuspendingZiplineFunction {
        public final /* synthetic */ int $r8$classId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ZiplineFunction0(String str, String str2, List list, KSerializer kSerializer, KSerializer kSerializer2, int i) {
            super(str, str2, list, kSerializer, kSerializer2);
            this.$r8$classId = i;
        }

        @Override // app.cash.zipline.internal.bridge.SuspendingZiplineFunction
        public final Object callSuspending(ZiplineService ziplineService, List list, zzmo zzmoVar) {
            switch (this.$r8$classId) {
                case 0:
                    Object obj = list.get(0);
                    obj.getClass();
                    break;
                case 1:
                    Object obj2 = list.get(0);
                    obj2.getClass();
                    Object obj3 = list.get(1);
                    obj3.getClass();
                    Object consumeResponseContext = ((RawFlowService) ziplineService).consumeResponseContext((ByteString) obj2, (ByteString) obj3, zzmoVar);
                    if (consumeResponseContext != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        break;
                    }
                    break;
                case 2:
                    Object obj4 = list.get(0);
                    obj4.getClass();
                    Object obj5 = list.get(1);
                    obj5.getClass();
                    Object advance = ((RawFlowService) ziplineService).advance((ByteString) obj4, ((Boolean) obj5).booleanValue(), zzmoVar);
                    if (advance != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        break;
                    }
                    break;
                case 3:
                    Object obj6 = list.get(0);
                    obj6.getClass();
                    Object retreat = ((RawFlowService) ziplineService).retreat((ByteString) obj6, zzmoVar);
                    if (retreat != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        break;
                    }
                    break;
                case 4:
                    Object dismiss = ((RawFlowService) ziplineService).dismiss(zzmoVar);
                    if (dismiss != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        break;
                    }
                    break;
                case 5:
                    Object navigateBackSuspending = ((Navigator) ziplineService).navigateBackSuspending(zzmoVar);
                    if (navigateBackSuspending != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        break;
                    }
                    break;
                case 6:
                    Object obj7 = list.get(0);
                    obj7.getClass();
                    Object startFlow = ((Navigator) ziplineService).startFlow((FlowSpec) obj7, zzmoVar);
                    if (startFlow != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        break;
                    }
                    break;
                case 7:
                    Object obj8 = list.get(0);
                    obj8.getClass();
                    Object obj9 = list.get(1);
                    obj9.getClass();
                    break;
                case 8:
                    Object obj10 = list.get(0);
                    obj10.getClass();
                    break;
                case 9:
                    Object obj11 = list.get(0);
                    obj11.getClass();
                    break;
                case 10:
                    Object obj12 = list.get(0);
                    obj12.getClass();
                    Object obj13 = list.get(1);
                    obj13.getClass();
                    break;
                case 11:
                    Object obj14 = list.get(0);
                    obj14.getClass();
                    Object obj15 = list.get(1);
                    obj15.getClass();
                    Object consumeResponseContext2 = ((CashContextService) ziplineService).consumeResponseContext((ByteString) obj14, (ByteString) obj15, zzmoVar);
                    if (consumeResponseContext2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        break;
                    }
                    break;
                case 12:
                    break;
                case 13:
                    Object obj16 = list.get(0);
                    obj16.getClass();
                    Object obj17 = list.get(1);
                    obj17.getClass();
                    Object consumeSubmitBlockerResponseAppResponseContext = ((CashContextService) ziplineService).consumeSubmitBlockerResponseAppResponseContext((ByteString) obj16, (ByteString) obj17, zzmoVar);
                    if (consumeSubmitBlockerResponseAppResponseContext != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        break;
                    }
                    break;
                case 14:
                    Object obj18 = list.get(0);
                    obj18.getClass();
                    Object obj19 = list.get(1);
                    obj19.getClass();
                    Object obj20 = list.get(2);
                    obj20.getClass();
                    break;
                case 15:
                    Object obj21 = list.get(0);
                    obj21.getClass();
                    Object obj22 = list.get(1);
                    obj22.getClass();
                    Object obj23 = list.get(2);
                    obj23.getClass();
                    break;
                case 16:
                    break;
                case 17:
                    Object obj24 = list.get(0);
                    obj24.getClass();
                    Object endTransaction = ((SqlDelightBridge) ziplineService).endTransaction(((Integer) obj24).intValue(), zzmoVar);
                    if (endTransaction != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        break;
                    }
                    break;
                default:
                    Object obj25 = list.get(0);
                    obj25.getClass();
                    Object rollbackTransaction = ((SqlDelightBridge) ziplineService).rollbackTransaction(((Integer) obj25).intValue(), zzmoVar);
                    if (rollbackTransaction != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        break;
                    }
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    public final class ZiplineFunction1 extends ReturningZiplineFunction {
        public final /* synthetic */ int $r8$classId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ZiplineFunction1(String str, String str2, List list, KSerializer kSerializer, int i) {
            super(str, str2, list, kSerializer);
            this.$r8$classId = i;
        }

        @Override // app.cash.zipline.internal.bridge.ReturningZiplineFunction
        public final Object call(ZiplineService ziplineService, List list) {
            switch (this.$r8$classId) {
                case 0:
                    HttpClient httpClient = (HttpClient) ziplineService;
                    httpClient.getClass();
                    list.getClass();
                    httpClient.close();
                    return Unit.INSTANCE;
                case 1:
                    RawFlowService rawFlowService = (RawFlowService) ziplineService;
                    rawFlowService.getClass();
                    list.getClass();
                    rawFlowService.close();
                    return Unit.INSTANCE;
                case 2:
                    HostViewService hostViewService = (HostViewService) ziplineService;
                    hostViewService.getClass();
                    list.getClass();
                    return hostViewService.lifecycleStateFlow();
                case 3:
                    HostViewService hostViewService2 = (HostViewService) ziplineService;
                    hostViewService2.getClass();
                    list.getClass();
                    hostViewService2.close();
                    return Unit.INSTANCE;
                case 4:
                    RawLoggerService rawLoggerService = (RawLoggerService) ziplineService;
                    rawLoggerService.getClass();
                    list.getClass();
                    Object obj = list.get(0);
                    obj.getClass();
                    rawLoggerService.log((LogMessage) obj);
                    return Unit.INSTANCE;
                case 5:
                    RawLoggerService rawLoggerService2 = (RawLoggerService) ziplineService;
                    rawLoggerService2.getClass();
                    list.getClass();
                    rawLoggerService2.close();
                    return Unit.INSTANCE;
                case 6:
                    Navigator navigator = (Navigator) ziplineService;
                    navigator.getClass();
                    list.getClass();
                    navigator.navigateBack();
                    return Unit.INSTANCE;
                case 7:
                    Navigator navigator2 = (Navigator) ziplineService;
                    navigator2.getClass();
                    list.getClass();
                    navigator2.close();
                    return Unit.INSTANCE;
                case 8:
                    PrefetchClient prefetchClient = (PrefetchClient) ziplineService;
                    prefetchClient.getClass();
                    list.getClass();
                    prefetchClient.close();
                    return Unit.INSTANCE;
                case 9:
                    CashContextService cashContextService = (CashContextService) ziplineService;
                    cashContextService.getClass();
                    list.getClass();
                    return cashContextService.getCustomerToken();
                case 10:
                    CashContextService cashContextService2 = (CashContextService) ziplineService;
                    cashContextService2.getClass();
                    list.getClass();
                    return cashContextService2.webPortalBaseUrl();
                case 11:
                    CashContextService cashContextService3 = (CashContextService) ziplineService;
                    cashContextService3.getClass();
                    list.getClass();
                    cashContextService3.close();
                    return Unit.INSTANCE;
                case 12:
                    RawTreehousePlatform rawTreehousePlatform = (RawTreehousePlatform) ziplineService;
                    rawTreehousePlatform.getClass();
                    list.getClass();
                    return rawTreehousePlatform.activityPaymentManager();
                case 13:
                    RawTreehousePlatform rawTreehousePlatform2 = (RawTreehousePlatform) ziplineService;
                    rawTreehousePlatform2.getClass();
                    list.getClass();
                    return rawTreehousePlatform2.rawBadgingService();
                case 14:
                    RawTreehousePlatform rawTreehousePlatform3 = (RawTreehousePlatform) ziplineService;
                    rawTreehousePlatform3.getClass();
                    list.getClass();
                    return rawTreehousePlatform3.rawBuildConfigService();
                case 15:
                    RawTreehousePlatform rawTreehousePlatform4 = (RawTreehousePlatform) ziplineService;
                    rawTreehousePlatform4.getClass();
                    list.getClass();
                    return rawTreehousePlatform4.rawFlagsService();
                case 16:
                    RawTreehousePlatform rawTreehousePlatform5 = (RawTreehousePlatform) ziplineService;
                    rawTreehousePlatform5.getClass();
                    list.getClass();
                    return rawTreehousePlatform5.rawPreferencesService();
                case 17:
                    RawTreehousePlatform rawTreehousePlatform6 = (RawTreehousePlatform) ziplineService;
                    rawTreehousePlatform6.getClass();
                    list.getClass();
                    return rawTreehousePlatform6.rawSyncValueService();
                case 18:
                    RawTreehousePlatform rawTreehousePlatform7 = (RawTreehousePlatform) ziplineService;
                    rawTreehousePlatform7.getClass();
                    list.getClass();
                    return rawTreehousePlatform7.contextService();
                case 19:
                    RawTreehousePlatform rawTreehousePlatform8 = (RawTreehousePlatform) ziplineService;
                    rawTreehousePlatform8.getClass();
                    list.getClass();
                    return rawTreehousePlatform8.biometricsService();
                case 20:
                    RawTreehousePlatform rawTreehousePlatform9 = (RawTreehousePlatform) ziplineService;
                    rawTreehousePlatform9.getClass();
                    list.getClass();
                    return rawTreehousePlatform9.financialServicesBridge();
                case 21:
                    RawTreehousePlatform rawTreehousePlatform10 = (RawTreehousePlatform) ziplineService;
                    rawTreehousePlatform10.getClass();
                    list.getClass();
                    return rawTreehousePlatform10.datadogService();
                case 22:
                    RawTreehousePlatform rawTreehousePlatform11 = (RawTreehousePlatform) ziplineService;
                    rawTreehousePlatform11.getClass();
                    list.getClass();
                    Object obj2 = list.get(0);
                    obj2.getClass();
                    return rawTreehousePlatform11.sqldelightBridge((String) obj2);
                case 23:
                    RawTreehousePlatform rawTreehousePlatform12 = (RawTreehousePlatform) ziplineService;
                    rawTreehousePlatform12.getClass();
                    list.getClass();
                    return rawTreehousePlatform12.activityPaymentManager2();
                case 24:
                    RawTreehousePlatform rawTreehousePlatform13 = (RawTreehousePlatform) ziplineService;
                    rawTreehousePlatform13.getClass();
                    list.getClass();
                    Object obj3 = list.get(0);
                    obj3.getClass();
                    Object obj4 = list.get(1);
                    obj4.getClass();
                    return rawTreehousePlatform13.sqlDelightBridge((String) obj3, (String) obj4);
                case 25:
                    RawTreehousePlatform rawTreehousePlatform14 = (RawTreehousePlatform) ziplineService;
                    rawTreehousePlatform14.getClass();
                    list.getClass();
                    return rawTreehousePlatform14.rawLoggerService();
                case 26:
                    RawTreehousePlatform rawTreehousePlatform15 = (RawTreehousePlatform) ziplineService;
                    rawTreehousePlatform15.getClass();
                    list.getClass();
                    return rawTreehousePlatform15.errorReporterService();
                case 27:
                    RawTreehousePlatform rawTreehousePlatform16 = (RawTreehousePlatform) ziplineService;
                    rawTreehousePlatform16.getClass();
                    list.getClass();
                    return rawTreehousePlatform16.rawClipboardService();
                case 28:
                    RawTreehousePlatform rawTreehousePlatform17 = (RawTreehousePlatform) ziplineService;
                    rawTreehousePlatform17.getClass();
                    list.getClass();
                    return rawTreehousePlatform17.timeZoneService();
                default:
                    RawTreehousePlatform rawTreehousePlatform18 = (RawTreehousePlatform) ziplineService;
                    rawTreehousePlatform18.getClass();
                    list.getClass();
                    return rawTreehousePlatform18.accessibilityCallbackService();
            }
        }
    }

    public HttpClient$Companion$Adapter(List list, int i) {
        this.$r8$classId = i;
        list.getClass();
        switch (i) {
            case 1:
                this.serialName = "com.squareup.cash.treehouse.errorreporter.ErrorReporterService";
                this.simpleName = "ErrorReporterService";
                this.serializers = list;
                break;
            case 2:
                this.serialName = "com.squareup.cash.treehouse.financialservices.FinancialServicesBridge";
                this.simpleName = "FinancialServicesBridge";
                this.serializers = list;
                break;
            case 3:
                this.serialName = "com.squareup.cash.treehouse.flags.RawFlagsService";
                this.simpleName = "RawFlagsService";
                this.serializers = list;
                break;
            case 4:
                this.serialName = "com.squareup.cash.treehouse.flows.RawFlowService";
                this.simpleName = "RawFlowService";
                this.serializers = list;
                break;
            case 5:
            default:
                this.serialName = "com.squareup.cash.treehouse.network.HttpClient";
                this.simpleName = "HttpClient";
                this.serializers = list;
                break;
            case 6:
                this.serialName = "com.squareup.cash.treehouse.logger.RawLoggerService";
                this.simpleName = "RawLoggerService";
                this.serializers = list;
                break;
            case 7:
                this.serialName = "com.squareup.cash.treehouse.navigation.Navigator";
                this.simpleName = "Navigator";
                this.serializers = list;
                break;
            case 8:
                this.serialName = "com.squareup.cash.treehouse.network.prefetch.PrefetchClient";
                this.simpleName = "PrefetchClient";
                this.serializers = list;
                break;
            case 9:
                this.serialName = "com.squareup.cash.treehouse.platform.CashContextService";
                this.simpleName = "CashContextService";
                this.serializers = list;
                break;
            case 10:
                this.serialName = "com.squareup.cash.treehouse.platform.RawTreehousePlatform";
                this.simpleName = "RawTreehousePlatform";
                this.serializers = list;
                break;
            case 11:
                this.serialName = "com.squareup.cash.treehouse.preferences.RawPreferencesService";
                this.simpleName = "RawPreferencesService";
                this.serializers = list;
                break;
            case 12:
                this.serialName = "com.squareup.cash.treehouse.sqldelight.SqlDelightBridge";
                this.simpleName = "SqlDelightBridge";
                this.serializers = list;
                break;
            case 13:
                this.serialName = "com.squareup.cash.treehouse.sync.RawSyncValueService";
                this.simpleName = "RawSyncValueService";
                this.serializers = list;
                break;
            case 14:
                this.serialName = "com.squareup.cash.treehouse.ui.PathRoutableAppService";
                this.simpleName = "PathRoutableAppService";
                this.serializers = list;
                break;
        }
    }

    @Override // app.cash.zipline.internal.bridge.ZiplineServiceAdapter
    public final String getSerialName() {
        switch (this.$r8$classId) {
        }
        return this.serialName;
    }

    @Override // app.cash.zipline.internal.bridge.ZiplineServiceAdapter
    public final List getSerializers() {
        switch (this.$r8$classId) {
        }
        return this.serializers;
    }

    @Override // app.cash.zipline.internal.bridge.ZiplineServiceAdapter
    public final String getSimpleName() {
        switch (this.$r8$classId) {
        }
        return this.simpleName;
    }

    @Override // app.cash.zipline.internal.bridge.ZiplineServiceAdapter
    public final ZiplineService outboundService(OutboundCallHandler outboundCallHandler) {
        switch (this.$r8$classId) {
            case 0:
                return new GeneratedOutboundService(outboundCallHandler);
            case 1:
                return new ErrorReporterService$Companion$Adapter$GeneratedOutboundService(outboundCallHandler);
            case 2:
                return new FinancialServicesBridge$Companion$Adapter$GeneratedOutboundService(outboundCallHandler);
            case 3:
                return new RawFlagsService$Companion$Adapter$GeneratedOutboundService(outboundCallHandler);
            case 4:
                return new RawFlowService$Companion$Adapter$GeneratedOutboundService(outboundCallHandler);
            case 5:
                return new HostViewService$Companion$Adapter$GeneratedOutboundService(outboundCallHandler);
            case 6:
                return new RawLoggerService$Companion$Adapter$GeneratedOutboundService(outboundCallHandler);
            case 7:
                return new Navigator$Companion$Adapter$GeneratedOutboundService(outboundCallHandler);
            case 8:
                return new PrefetchClient$Companion$Adapter$GeneratedOutboundService(outboundCallHandler);
            case 9:
                return new CashContextService$Companion$Adapter$GeneratedOutboundService(outboundCallHandler);
            case 10:
                return new RawTreehousePlatform$Companion$Adapter$GeneratedOutboundService(outboundCallHandler);
            case 11:
                return new RawPreferencesService$Companion$Adapter$GeneratedOutboundService(outboundCallHandler);
            case 12:
                return new SqlDelightBridge$Companion$Adapter$GeneratedOutboundService(outboundCallHandler);
            case 13:
                return new RawSyncValueService$Companion$Adapter$GeneratedOutboundService(outboundCallHandler);
            default:
                return new PathRoutableAppService$Companion$Adapter$GeneratedOutboundService(outboundCallHandler);
        }
    }

    @Override // app.cash.zipline.internal.bridge.ZiplineServiceAdapter
    public final List ziplineFunctions(SerializersModule serializersModule) {
        switch (this.$r8$classId) {
            case 0:
                serializersModule.getClass();
                KSerializer serializer = HttpRequest.Companion.serializer();
                HttpResponse.Companion companion = HttpResponse.Companion;
                KSerializer serializer2 = companion.serializer();
                List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{companion.serializer()});
                HostService$Companion$Adapter hostService$Companion$Adapter = new HostService$Companion$Adapter(ZiplineServiceAdapterKt.serialName("app.cash.zipline.internal.bridge.SuspendCallback", listOf), listOf, 12);
                UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
                List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{serializer});
                listOf2.getClass();
                serializer2.getClass();
                ZiplineFunction0 ziplineFunction0 = new ZiplineFunction0("cIK6mWjZ", "suspend fun execute(com.squareup.cash.treehouse.network.HttpRequest): com.squareup.cash.treehouse.network.HttpResponse", listOf2, serializer2, hostService$Companion$Adapter, 0);
                List listOf3 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf3.getClass();
                unitSerializer.getClass();
                return CollectionsKt__CollectionsKt.listOf((Object[]) new ZiplineFunction[]{ziplineFunction0, new ZiplineFunction1("moYx+T3e", "fun close(): kotlin.Unit", listOf3, unitSerializer, 0)});
            case 1:
                serializersModule.getClass();
                KSerializer serializer3 = ErrorReport.Companion.serializer();
                UnitSerializer unitSerializer2 = UnitSerializer.INSTANCE;
                List listOf4 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{serializer3});
                listOf4.getClass();
                unitSerializer2.getClass();
                RawFlagsService$Companion$Adapter$ZiplineFunction0 rawFlagsService$Companion$Adapter$ZiplineFunction0 = new RawFlagsService$Companion$Adapter$ZiplineFunction0("6xpeYEuQ", "fun report(com.squareup.cash.treehouse.errorreporter.ErrorReport): kotlin.Unit", listOf4, unitSerializer2, 24);
                List listOf5 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf5.getClass();
                return CollectionsKt__CollectionsKt.listOf((Object[]) new ZiplineFunction[]{rawFlagsService$Companion$Adapter$ZiplineFunction0, new RawFlagsService$Companion$Adapter$ZiplineFunction0("moYx+T3e", "fun close(): kotlin.Unit", listOf5, unitSerializer2, 25)});
            case 2:
                serializersModule.getClass();
                ReflectionFactory reflectionFactory = Reflection.factory;
                KSerializer noCompiledSerializer = SerializersKt.noCompiledSerializer(serializersModule, reflectionFactory.getOrCreateKotlinClass(ByteString.class));
                List listOf6 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{SerializersKt.noCompiledSerializer(serializersModule, reflectionFactory.getOrCreateKotlinClass(ByteString.class))});
                HostService$Companion$Adapter hostService$Companion$Adapter2 = new HostService$Companion$Adapter(ZiplineServiceAdapterKt.serialName("app.cash.zipline.internal.bridge.SuspendCallback", listOf6), listOf6, 12);
                UnitSerializer unitSerializer3 = UnitSerializer.INSTANCE;
                List listOf7 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{noCompiledSerializer});
                listOf7.getClass();
                RawFlowService$Companion$Adapter$ZiplineFunction0 rawFlowService$Companion$Adapter$ZiplineFunction0 = new RawFlowService$Companion$Adapter$ZiplineFunction0("AxzWrV6j", "suspend fun saveUserViewedDirectDepositUpsell(okio.ByteString): okio.ByteString", listOf7, noCompiledSerializer, hostService$Companion$Adapter2, 29);
                List listOf8 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf8.getClass();
                unitSerializer3.getClass();
                return CollectionsKt__CollectionsKt.listOf((Object[]) new ZiplineFunction[]{rawFlowService$Companion$Adapter$ZiplineFunction0, new RawFlagsService$Companion$Adapter$ZiplineFunction0("moYx+T3e", "fun close(): kotlin.Unit", listOf8, unitSerializer3, 26)});
            case 3:
                serializersModule.getClass();
                ReflectionFactory reflectionFactory2 = Reflection.factory;
                KSerializer requireContextual = InternalSerializersKt.requireContextual(serializersModule, reflectionFactory2.getOrCreateKotlinClass(Flow.class), CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{new HashSetSerializer(SerializersKt.noCompiledSerializer(serializersModule, reflectionFactory2.getOrCreateKotlinClass(ByteString.class)), 1)}));
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
                UnitSerializer unitSerializer4 = UnitSerializer.INSTANCE;
                List listOf9 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf9.getClass();
                RawFlagsService$Companion$Adapter$ZiplineFunction0 rawFlagsService$Companion$Adapter$ZiplineFunction02 = new RawFlagsService$Companion$Adapter$ZiplineFunction0("dGbic32M", "fun encodedClientDataFeatureFlags(): kotlinx.coroutines.flow.Flow<kotlin.collections.List<okio.ByteString>>", listOf9, requireContextual, 0);
                List listOf10 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{stringSerializer});
                listOf10.getClass();
                RawFlagsService$Companion$Adapter$ZiplineFunction0 rawFlagsService$Companion$Adapter$ZiplineFunction03 = new RawFlagsService$Companion$Adapter$ZiplineFunction0("V1TUHuue", "fun get(kotlin.String): kotlin.String?", listOf10, nullable, 27);
                List listOf11 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{stringSerializer, BooleanSerializer.INSTANCE});
                listOf11.getClass();
                RawFlagsService$Companion$Adapter$ZiplineFunction0 rawFlagsService$Companion$Adapter$ZiplineFunction04 = new RawFlagsService$Companion$Adapter$ZiplineFunction0("12C/no3/", "fun get(kotlin.String, kotlin.Boolean): kotlin.String?", listOf11, nullable, 28);
                List listOf12 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf12.getClass();
                unitSerializer4.getClass();
                return CollectionsKt__CollectionsKt.listOf((Object[]) new ZiplineFunction[]{rawFlagsService$Companion$Adapter$ZiplineFunction02, rawFlagsService$Companion$Adapter$ZiplineFunction03, rawFlagsService$Companion$Adapter$ZiplineFunction04, new RawFlagsService$Companion$Adapter$ZiplineFunction0("moYx+T3e", "fun close(): kotlin.Unit", listOf12, unitSerializer4, 29)});
            case 4:
                serializersModule.getClass();
                HashSetSerializer hashSetSerializer = new HashSetSerializer(StringSerializer.INSTANCE, 1);
                ReflectionFactory reflectionFactory3 = Reflection.factory;
                KSerializer noCompiledSerializer2 = SerializersKt.noCompiledSerializer(serializersModule, reflectionFactory3.getOrCreateKotlinClass(ByteString.class));
                List listOf13 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{SerializersKt.noCompiledSerializer(serializersModule, reflectionFactory3.getOrCreateKotlinClass(ByteString.class))});
                HostService$Companion$Adapter hostService$Companion$Adapter3 = new HostService$Companion$Adapter(ZiplineServiceAdapterKt.serialName("app.cash.zipline.internal.bridge.SuspendCallback", listOf13), listOf13, 12);
                UnitSerializer unitSerializer5 = UnitSerializer.INSTANCE;
                List listOf14 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{unitSerializer5});
                HostService$Companion$Adapter hostService$Companion$Adapter4 = new HostService$Companion$Adapter(ZiplineServiceAdapterKt.serialName("app.cash.zipline.internal.bridge.SuspendCallback", listOf14), listOf14, 12);
                List listOf15 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{hashSetSerializer});
                listOf15.getClass();
                RawFlowService$Companion$Adapter$ZiplineFunction0 rawFlowService$Companion$Adapter$ZiplineFunction02 = new RawFlowService$Companion$Adapter$ZiplineFunction0("iLd63R3w", "suspend fun produceRequestContext(kotlin.collections.List<kotlin.String>): okio.ByteString", listOf15, noCompiledSerializer2, hostService$Companion$Adapter3, 0);
                List listOf16 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{noCompiledSerializer2, noCompiledSerializer2});
                listOf16.getClass();
                unitSerializer5.getClass();
                ZiplineFunction0 ziplineFunction02 = new ZiplineFunction0("0GD3A+Hl", "suspend fun consumeResponseContext(okio.ByteString, okio.ByteString): kotlin.Unit", listOf16, unitSerializer5, hostService$Companion$Adapter4, 1);
                List listOf17 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{noCompiledSerializer2, BooleanSerializer.INSTANCE});
                listOf17.getClass();
                ZiplineFunction0 ziplineFunction03 = new ZiplineFunction0("/UgjNEL3", "suspend fun advance(okio.ByteString, kotlin.Boolean): kotlin.Unit", listOf17, unitSerializer5, hostService$Companion$Adapter4, 2);
                List listOf18 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{noCompiledSerializer2});
                listOf18.getClass();
                ZiplineFunction0 ziplineFunction04 = new ZiplineFunction0("o/OtTCJh", "suspend fun retreat(okio.ByteString): kotlin.Unit", listOf18, unitSerializer5, hostService$Companion$Adapter4, 3);
                List listOf19 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf19.getClass();
                ZiplineFunction0 ziplineFunction05 = new ZiplineFunction0("maMsP1S6", "suspend fun dismiss(): kotlin.Unit", listOf19, unitSerializer5, hostService$Companion$Adapter4, 4);
                List listOf20 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf20.getClass();
                return CollectionsKt__CollectionsKt.listOf((Object[]) new ZiplineFunction[]{rawFlowService$Companion$Adapter$ZiplineFunction02, ziplineFunction02, ziplineFunction03, ziplineFunction04, ziplineFunction05, new ZiplineFunction1("moYx+T3e", "fun close(): kotlin.Unit", listOf20, unitSerializer5, 1)});
            case 5:
                serializersModule.getClass();
                KSerializer requireContextual2 = InternalSerializersKt.requireContextual(serializersModule, Reflection.factory.getOrCreateKotlinClass(StateFlow.class), CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{LifecycleState.Companion.serializer()}));
                UnitSerializer unitSerializer6 = UnitSerializer.INSTANCE;
                List listOf21 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf21.getClass();
                ZiplineFunction1 ziplineFunction1 = new ZiplineFunction1("GEehXPYm", "fun lifecycleStateFlow(): kotlinx.coroutines.flow.StateFlow<com.squareup.cash.treehouse.hostview.LifecycleState>", listOf21, requireContextual2, 2);
                List listOf22 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf22.getClass();
                unitSerializer6.getClass();
                return CollectionsKt__CollectionsKt.listOf((Object[]) new ZiplineFunction[]{ziplineFunction1, new ZiplineFunction1("moYx+T3e", "fun close(): kotlin.Unit", listOf22, unitSerializer6, 3)});
            case 6:
                serializersModule.getClass();
                KSerializer serializer4 = LogMessage.Companion.serializer();
                UnitSerializer unitSerializer7 = UnitSerializer.INSTANCE;
                List listOf23 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{serializer4});
                listOf23.getClass();
                unitSerializer7.getClass();
                ZiplineFunction1 ziplineFunction12 = new ZiplineFunction1("s12LDI9F", "fun log(com.squareup.cash.treehouse.logger.LogMessage): kotlin.Unit", listOf23, unitSerializer7, 4);
                List listOf24 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf24.getClass();
                return CollectionsKt__CollectionsKt.listOf((Object[]) new ZiplineFunction[]{ziplineFunction12, new ZiplineFunction1("moYx+T3e", "fun close(): kotlin.Unit", listOf24, unitSerializer7, 5)});
            case 7:
                serializersModule.getClass();
                UnitSerializer unitSerializer8 = UnitSerializer.INSTANCE;
                List listOf25 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{unitSerializer8});
                HostService$Companion$Adapter hostService$Companion$Adapter5 = new HostService$Companion$Adapter(ZiplineServiceAdapterKt.serialName("app.cash.zipline.internal.bridge.SuspendCallback", listOf25), listOf25, 12);
                KSerializer serializer5 = FlowSpec.Companion.serializer();
                KSerializer serializer6 = TreehouseRoutingParams.Companion.serializer();
                BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
                List listOf26 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{booleanSerializer});
                HostService$Companion$Adapter hostService$Companion$Adapter6 = new HostService$Companion$Adapter(ZiplineServiceAdapterKt.serialName("app.cash.zipline.internal.bridge.SuspendCallback", listOf26), listOf26, 12);
                List listOf27 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf27.getClass();
                unitSerializer8.getClass();
                ZiplineFunction1 ziplineFunction13 = new ZiplineFunction1("LB9WU1Vy", "fun navigateBack(): kotlin.Unit", listOf27, unitSerializer8, 6);
                List listOf28 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf28.getClass();
                ZiplineFunction0 ziplineFunction06 = new ZiplineFunction0("rfyxBr7E", "suspend fun navigateBackSuspending(): kotlin.Unit", listOf28, unitSerializer8, hostService$Companion$Adapter5, 5);
                List listOf29 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{serializer5});
                listOf29.getClass();
                ZiplineFunction0 ziplineFunction07 = new ZiplineFunction0("W8uwaGIM", "suspend fun startFlow(com.squareup.cash.treehouse.flows.FlowSpec): kotlin.Unit", listOf29, unitSerializer8, hostService$Companion$Adapter5, 6);
                List listOf30 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{StringSerializer.INSTANCE, serializer6});
                listOf30.getClass();
                ZiplineFunction0 ziplineFunction08 = new ZiplineFunction0("o+SWE1q4", "suspend fun navigateToUrl(kotlin.String, com.squareup.cash.treehouse.navigation.TreehouseRoutingParams): kotlin.Boolean", listOf30, booleanSerializer, hostService$Companion$Adapter6, 7);
                List listOf31 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf31.getClass();
                return CollectionsKt__CollectionsKt.listOf((Object[]) new ZiplineFunction[]{ziplineFunction13, ziplineFunction06, ziplineFunction07, ziplineFunction08, new ZiplineFunction1("moYx+T3e", "fun close(): kotlin.Unit", listOf31, unitSerializer8, 7)});
            case 8:
                serializersModule.getClass();
                HttpResponse.Companion companion2 = HttpResponse.Companion;
                KSerializer serializer7 = companion2.serializer();
                List listOf32 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{companion2.serializer()});
                HostService$Companion$Adapter hostService$Companion$Adapter7 = new HostService$Companion$Adapter(ZiplineServiceAdapterKt.serialName("app.cash.zipline.internal.bridge.SuspendCallback", listOf32), listOf32, 12);
                UnitSerializer unitSerializer9 = UnitSerializer.INSTANCE;
                List listOf33 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{StringSerializer.INSTANCE});
                listOf33.getClass();
                serializer7.getClass();
                ZiplineFunction0 ziplineFunction09 = new ZiplineFunction0("NgEcor0G", "suspend fun awaitResponse(kotlin.String): com.squareup.cash.treehouse.network.HttpResponse", listOf33, serializer7, hostService$Companion$Adapter7, 8);
                List listOf34 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf34.getClass();
                unitSerializer9.getClass();
                return CollectionsKt__CollectionsKt.listOf((Object[]) new ZiplineFunction[]{ziplineFunction09, new ZiplineFunction1("moYx+T3e", "fun close(): kotlin.Unit", listOf34, unitSerializer9, 8)});
            case 9:
                serializersModule.getClass();
                StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                ReflectionFactory reflectionFactory4 = Reflection.factory;
                KSerializer noCompiledSerializer3 = SerializersKt.noCompiledSerializer(serializersModule, reflectionFactory4.getOrCreateKotlinClass(ByteString.class));
                List listOf35 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{SerializersKt.noCompiledSerializer(serializersModule, reflectionFactory4.getOrCreateKotlinClass(ByteString.class))});
                HostService$Companion$Adapter hostService$Companion$Adapter8 = new HostService$Companion$Adapter(ZiplineServiceAdapterKt.serialName("app.cash.zipline.internal.bridge.SuspendCallback", listOf35), listOf35, 12);
                HashSetSerializer hashSetSerializer2 = new HashSetSerializer(stringSerializer2, 1);
                UnitSerializer unitSerializer10 = UnitSerializer.INSTANCE;
                List listOf36 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{unitSerializer10});
                HostService$Companion$Adapter hostService$Companion$Adapter9 = new HostService$Companion$Adapter(ZiplineServiceAdapterKt.serialName("app.cash.zipline.internal.bridge.SuspendCallback", listOf36), listOf36, 12);
                List listOf37 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf37.getClass();
                ZiplineFunction1 ziplineFunction14 = new ZiplineFunction1("wma7qSaM", "fun getCustomerToken(): kotlin.String", listOf37, stringSerializer2, 9);
                List listOf38 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf38.getClass();
                ZiplineFunction1 ziplineFunction15 = new ZiplineFunction1("4wWwZG8I", "fun webPortalBaseUrl(): kotlin.String", listOf38, stringSerializer2, 10);
                List listOf39 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{noCompiledSerializer3});
                listOf39.getClass();
                ZiplineFunction0 ziplineFunction010 = new ZiplineFunction0("T4zYRpuR", "suspend fun produceRequestContext(okio.ByteString): okio.ByteString", listOf39, noCompiledSerializer3, hostService$Companion$Adapter8, 9);
                List listOf40 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{hashSetSerializer2, noCompiledSerializer3});
                listOf40.getClass();
                ZiplineFunction0 ziplineFunction011 = new ZiplineFunction0("vNuN8dpx", "suspend fun produceRequestContext(kotlin.collections.List<kotlin.String>, okio.ByteString): okio.ByteString", listOf40, noCompiledSerializer3, hostService$Companion$Adapter8, 10);
                List listOf41 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{noCompiledSerializer3, noCompiledSerializer3});
                listOf41.getClass();
                unitSerializer10.getClass();
                ZiplineFunction0 ziplineFunction012 = new ZiplineFunction0("0GD3A+Hl", "suspend fun consumeResponseContext(okio.ByteString, okio.ByteString): kotlin.Unit", listOf41, unitSerializer10, hostService$Companion$Adapter9, 11);
                List listOf42 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf42.getClass();
                ZiplineFunction0 ziplineFunction013 = new ZiplineFunction0("uDHFZ24X", "suspend fun produceSubmitBlockerRequestAppRequestContext(): okio.ByteString", listOf42, noCompiledSerializer3, hostService$Companion$Adapter8, 12);
                List listOf43 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{noCompiledSerializer3, noCompiledSerializer3});
                listOf43.getClass();
                ZiplineFunction0 ziplineFunction014 = new ZiplineFunction0("qZHUrrdL", "suspend fun consumeSubmitBlockerResponseAppResponseContext(okio.ByteString, okio.ByteString): kotlin.Unit", listOf43, unitSerializer10, hostService$Companion$Adapter9, 13);
                List listOf44 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf44.getClass();
                return CollectionsKt__CollectionsKt.listOf((Object[]) new ZiplineFunction[]{ziplineFunction14, ziplineFunction15, ziplineFunction010, ziplineFunction011, ziplineFunction012, ziplineFunction013, ziplineFunction014, new ZiplineFunction1("moYx+T3e", "fun close(): kotlin.Unit", listOf44, unitSerializer10, 11)});
            case 10:
                serializersModule.getClass();
                HostService$Companion$Adapter hostService$Companion$Adapter10 = new HostService$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 15);
                HostService$Companion$Adapter hostService$Companion$Adapter11 = new HostService$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 16);
                final HostService$Companion$Adapter hostService$Companion$Adapter12 = new HostService$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 17);
                final HostService$Companion$Adapter hostService$Companion$Adapter13 = new HostService$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 18);
                final HttpClient$Companion$Adapter httpClient$Companion$Adapter = new HttpClient$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 0);
                final HttpClient$Companion$Adapter httpClient$Companion$Adapter2 = new HttpClient$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 8);
                final HostService$Companion$Adapter hostService$Companion$Adapter14 = new HostService$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 21);
                final HostService$Companion$Adapter hostService$Companion$Adapter15 = new HostService$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 22);
                final HostService$Companion$Adapter hostService$Companion$Adapter16 = new HostService$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 23);
                HostService$Companion$Adapter hostService$Companion$Adapter17 = new HostService$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 24);
                HostService$Companion$Adapter hostService$Companion$Adapter18 = new HostService$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 26);
                HttpClient$Companion$Adapter httpClient$Companion$Adapter3 = new HttpClient$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 3);
                HttpClient$Companion$Adapter httpClient$Companion$Adapter4 = new HttpClient$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 11);
                HttpClient$Companion$Adapter httpClient$Companion$Adapter5 = new HttpClient$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 13);
                HttpClient$Companion$Adapter httpClient$Companion$Adapter6 = new HttpClient$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 9);
                HostService$Companion$Adapter hostService$Companion$Adapter19 = new HostService$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 25);
                HttpClient$Companion$Adapter httpClient$Companion$Adapter7 = new HttpClient$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 2);
                HostService$Companion$Adapter hostService$Companion$Adapter20 = new HostService$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 28);
                StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                HttpClient$Companion$Adapter httpClient$Companion$Adapter8 = new HttpClient$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 12);
                HttpClient$Companion$Adapter httpClient$Companion$Adapter9 = new HttpClient$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 6);
                HttpClient$Companion$Adapter httpClient$Companion$Adapter10 = new HttpClient$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 1);
                HostService$Companion$Adapter hostService$Companion$Adapter21 = new HostService$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 27);
                HostService$Companion$Adapter hostService$Companion$Adapter22 = new HostService$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 20);
                HostService$Companion$Adapter hostService$Companion$Adapter23 = new HostService$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 13);
                final UnitSerializer unitSerializer11 = UnitSerializer.INSTANCE;
                List listOf45 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf45.getClass();
                ZiplineFunction1 ziplineFunction16 = new ZiplineFunction1("oU/uGCFT", "fun activityPaymentManager(): com.squareup.cash.treehouse.activity.ActivityPaymentManager", listOf45, hostService$Companion$Adapter10, 12);
                List listOf46 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf46.getClass();
                ZiplineFunction1 ziplineFunction17 = new ZiplineFunction1("ViawEgKq", "fun activityPaymentManager2(): com.squareup.cash.treehouse.activity.ActivityPaymentManager2", listOf46, hostService$Companion$Adapter11, 23);
                final List listOf47 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf47.getClass();
                final String str = "fun offersRepositoryService(): com.squareup.cash.treehouse.activity.OffersRepositoryService";
                final int i = 2;
                final String str2 = "KmAE+mS5";
                ReturningZiplineFunction returningZiplineFunction = new ReturningZiplineFunction(str2, str, listOf47, hostService$Companion$Adapter12) { // from class: com.squareup.cash.treehouse.sync.RawSyncValueService$Companion$Adapter$ZiplineFunction0
                    @Override // app.cash.zipline.internal.bridge.ReturningZiplineFunction
                    public final Object call(ZiplineService ziplineService, List list) {
                        switch (i) {
                            case 0:
                                RawSyncValueService rawSyncValueService = (RawSyncValueService) ziplineService;
                                rawSyncValueService.getClass();
                                list.getClass();
                                return rawSyncValueService.encodedAllSyncValues();
                            case 1:
                                RawTreehousePlatform rawTreehousePlatform = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform.getClass();
                                list.getClass();
                                rawTreehousePlatform.close();
                                return Unit.INSTANCE;
                            case 2:
                                RawTreehousePlatform rawTreehousePlatform2 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform2.getClass();
                                list.getClass();
                                return rawTreehousePlatform2.offersRepositoryService();
                            case 3:
                                RawTreehousePlatform rawTreehousePlatform3 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform3.getClass();
                                list.getClass();
                                return rawTreehousePlatform3.rawOfflineActivityService();
                            case 4:
                                RawTreehousePlatform rawTreehousePlatform4 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform4.getClass();
                                list.getClass();
                                return rawTreehousePlatform4.cashHttpClient();
                            case 5:
                                RawTreehousePlatform rawTreehousePlatform5 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform5.getClass();
                                list.getClass();
                                return rawTreehousePlatform5.httpClient();
                            case 6:
                                RawTreehousePlatform rawTreehousePlatform6 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform6.getClass();
                                list.getClass();
                                return rawTreehousePlatform6.prefetchClient();
                            case 7:
                                RawTreehousePlatform rawTreehousePlatform7 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform7.getClass();
                                list.getClass();
                                return rawTreehousePlatform7.rawAnalyticsService();
                            case 8:
                                RawTreehousePlatform rawTreehousePlatform8 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform8.getClass();
                                list.getClass();
                                return rawTreehousePlatform8.rawAppConfigService();
                            case 9:
                                RawTreehousePlatform rawTreehousePlatform9 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform9.getClass();
                                list.getClass();
                                return rawTreehousePlatform9.rawAppMessagingService();
                            case 10:
                                RawPreferencesService rawPreferencesService = (RawPreferencesService) ziplineService;
                                rawPreferencesService.getClass();
                                list.getClass();
                                return rawPreferencesService.displayUnit();
                            case 11:
                                RawPreferencesService rawPreferencesService2 = (RawPreferencesService) ziplineService;
                                rawPreferencesService2.getClass();
                                list.getClass();
                                return rawPreferencesService2.displayUnitFlow();
                            case 12:
                                RawPreferencesService rawPreferencesService3 = (RawPreferencesService) ziplineService;
                                rawPreferencesService3.getClass();
                                list.getClass();
                                rawPreferencesService3.close();
                                return Unit.INSTANCE;
                            case 13:
                                SqlDelightBridge sqlDelightBridge = (SqlDelightBridge) ziplineService;
                                sqlDelightBridge.getClass();
                                list.getClass();
                                sqlDelightBridge.close();
                                return Unit.INSTANCE;
                            case 14:
                                RawSyncValueService rawSyncValueService2 = (RawSyncValueService) ziplineService;
                                rawSyncValueService2.getClass();
                                list.getClass();
                                Object obj = list.get(0);
                                obj.getClass();
                                return rawSyncValueService2.getSyncValues(((Integer) obj).intValue());
                            case 15:
                                RawSyncValueService rawSyncValueService3 = (RawSyncValueService) ziplineService;
                                rawSyncValueService3.getClass();
                                list.getClass();
                                rawSyncValueService3.close();
                                return Unit.INSTANCE;
                            case 16:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.getClass();
                                list.getClass();
                                Object obj2 = list.get(0);
                                obj2.getClass();
                                ByteString byteString = (ByteString) list.get(1);
                                Object obj3 = list.get(2);
                                obj3.getClass();
                                Object call = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService, 0, (String) obj2, byteString, (Navigator) obj3, (HostViewService) list.get(3));
                                call.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call;
                            case 17:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.getClass();
                                list.getClass();
                                Object obj4 = list.get(0);
                                obj4.getClass();
                                ByteString byteString2 = (ByteString) list.get(1);
                                Object obj5 = list.get(2);
                                obj5.getClass();
                                Object call2 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2, 1, (String) obj4, byteString2, (Navigator) obj5);
                                call2.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call2;
                            case 18:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.getClass();
                                list.getClass();
                                Object obj6 = list.get(0);
                                obj6.getClass();
                                Object obj7 = list.get(1);
                                obj7.getClass();
                                Object call3 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3, 2, (String) obj6, (Navigator) obj7);
                                call3.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call3;
                            case 19:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.getClass();
                                list.getClass();
                                Object obj8 = list.get(0);
                                obj8.getClass();
                                Object obj9 = list.get(1);
                                obj9.getClass();
                                Object obj10 = list.get(2);
                                obj10.getClass();
                                Object obj11 = list.get(3);
                                obj11.getClass();
                                Object call4 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4, 3, (BlockerScreenSpec) obj8, (Navigator) obj9, (HostViewService) obj10, (RawFlowService) obj11);
                                call4.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call4;
                            case 20:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.getClass();
                                list.getClass();
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.close();
                                return Unit.INSTANCE;
                            default:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.getClass();
                                list.getClass();
                                Object call5 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6, 5, new Object[0]);
                                call5.getClass();
                                return (AppLifecycle$Companion$Adapter$GeneratedOutboundService) call5;
                        }
                    }
                };
                final List listOf48 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf48.getClass();
                final String str3 = "fun rawOfflineActivityService(): com.squareup.cash.treehouse.activity.RawOfflineActivityService";
                final int i2 = 3;
                final String str4 = "FcYyfpHU";
                ReturningZiplineFunction returningZiplineFunction2 = new ReturningZiplineFunction(str4, str3, listOf48, hostService$Companion$Adapter13) { // from class: com.squareup.cash.treehouse.sync.RawSyncValueService$Companion$Adapter$ZiplineFunction0
                    @Override // app.cash.zipline.internal.bridge.ReturningZiplineFunction
                    public final Object call(ZiplineService ziplineService, List list) {
                        switch (i2) {
                            case 0:
                                RawSyncValueService rawSyncValueService = (RawSyncValueService) ziplineService;
                                rawSyncValueService.getClass();
                                list.getClass();
                                return rawSyncValueService.encodedAllSyncValues();
                            case 1:
                                RawTreehousePlatform rawTreehousePlatform = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform.getClass();
                                list.getClass();
                                rawTreehousePlatform.close();
                                return Unit.INSTANCE;
                            case 2:
                                RawTreehousePlatform rawTreehousePlatform2 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform2.getClass();
                                list.getClass();
                                return rawTreehousePlatform2.offersRepositoryService();
                            case 3:
                                RawTreehousePlatform rawTreehousePlatform3 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform3.getClass();
                                list.getClass();
                                return rawTreehousePlatform3.rawOfflineActivityService();
                            case 4:
                                RawTreehousePlatform rawTreehousePlatform4 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform4.getClass();
                                list.getClass();
                                return rawTreehousePlatform4.cashHttpClient();
                            case 5:
                                RawTreehousePlatform rawTreehousePlatform5 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform5.getClass();
                                list.getClass();
                                return rawTreehousePlatform5.httpClient();
                            case 6:
                                RawTreehousePlatform rawTreehousePlatform6 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform6.getClass();
                                list.getClass();
                                return rawTreehousePlatform6.prefetchClient();
                            case 7:
                                RawTreehousePlatform rawTreehousePlatform7 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform7.getClass();
                                list.getClass();
                                return rawTreehousePlatform7.rawAnalyticsService();
                            case 8:
                                RawTreehousePlatform rawTreehousePlatform8 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform8.getClass();
                                list.getClass();
                                return rawTreehousePlatform8.rawAppConfigService();
                            case 9:
                                RawTreehousePlatform rawTreehousePlatform9 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform9.getClass();
                                list.getClass();
                                return rawTreehousePlatform9.rawAppMessagingService();
                            case 10:
                                RawPreferencesService rawPreferencesService = (RawPreferencesService) ziplineService;
                                rawPreferencesService.getClass();
                                list.getClass();
                                return rawPreferencesService.displayUnit();
                            case 11:
                                RawPreferencesService rawPreferencesService2 = (RawPreferencesService) ziplineService;
                                rawPreferencesService2.getClass();
                                list.getClass();
                                return rawPreferencesService2.displayUnitFlow();
                            case 12:
                                RawPreferencesService rawPreferencesService3 = (RawPreferencesService) ziplineService;
                                rawPreferencesService3.getClass();
                                list.getClass();
                                rawPreferencesService3.close();
                                return Unit.INSTANCE;
                            case 13:
                                SqlDelightBridge sqlDelightBridge = (SqlDelightBridge) ziplineService;
                                sqlDelightBridge.getClass();
                                list.getClass();
                                sqlDelightBridge.close();
                                return Unit.INSTANCE;
                            case 14:
                                RawSyncValueService rawSyncValueService2 = (RawSyncValueService) ziplineService;
                                rawSyncValueService2.getClass();
                                list.getClass();
                                Object obj = list.get(0);
                                obj.getClass();
                                return rawSyncValueService2.getSyncValues(((Integer) obj).intValue());
                            case 15:
                                RawSyncValueService rawSyncValueService3 = (RawSyncValueService) ziplineService;
                                rawSyncValueService3.getClass();
                                list.getClass();
                                rawSyncValueService3.close();
                                return Unit.INSTANCE;
                            case 16:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.getClass();
                                list.getClass();
                                Object obj2 = list.get(0);
                                obj2.getClass();
                                ByteString byteString = (ByteString) list.get(1);
                                Object obj3 = list.get(2);
                                obj3.getClass();
                                Object call = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService, 0, (String) obj2, byteString, (Navigator) obj3, (HostViewService) list.get(3));
                                call.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call;
                            case 17:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.getClass();
                                list.getClass();
                                Object obj4 = list.get(0);
                                obj4.getClass();
                                ByteString byteString2 = (ByteString) list.get(1);
                                Object obj5 = list.get(2);
                                obj5.getClass();
                                Object call2 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2, 1, (String) obj4, byteString2, (Navigator) obj5);
                                call2.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call2;
                            case 18:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.getClass();
                                list.getClass();
                                Object obj6 = list.get(0);
                                obj6.getClass();
                                Object obj7 = list.get(1);
                                obj7.getClass();
                                Object call3 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3, 2, (String) obj6, (Navigator) obj7);
                                call3.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call3;
                            case 19:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.getClass();
                                list.getClass();
                                Object obj8 = list.get(0);
                                obj8.getClass();
                                Object obj9 = list.get(1);
                                obj9.getClass();
                                Object obj10 = list.get(2);
                                obj10.getClass();
                                Object obj11 = list.get(3);
                                obj11.getClass();
                                Object call4 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4, 3, (BlockerScreenSpec) obj8, (Navigator) obj9, (HostViewService) obj10, (RawFlowService) obj11);
                                call4.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call4;
                            case 20:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.getClass();
                                list.getClass();
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.close();
                                return Unit.INSTANCE;
                            default:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.getClass();
                                list.getClass();
                                Object call5 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6, 5, new Object[0]);
                                call5.getClass();
                                return (AppLifecycle$Companion$Adapter$GeneratedOutboundService) call5;
                        }
                    }
                };
                final List listOf49 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf49.getClass();
                final String str5 = "fun cashHttpClient(): com.squareup.cash.treehouse.network.HttpClient";
                final int i3 = 4;
                final String str6 = "AbQ3YEXB";
                ReturningZiplineFunction returningZiplineFunction3 = new ReturningZiplineFunction(str6, str5, listOf49, httpClient$Companion$Adapter) { // from class: com.squareup.cash.treehouse.sync.RawSyncValueService$Companion$Adapter$ZiplineFunction0
                    @Override // app.cash.zipline.internal.bridge.ReturningZiplineFunction
                    public final Object call(ZiplineService ziplineService, List list) {
                        switch (i3) {
                            case 0:
                                RawSyncValueService rawSyncValueService = (RawSyncValueService) ziplineService;
                                rawSyncValueService.getClass();
                                list.getClass();
                                return rawSyncValueService.encodedAllSyncValues();
                            case 1:
                                RawTreehousePlatform rawTreehousePlatform = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform.getClass();
                                list.getClass();
                                rawTreehousePlatform.close();
                                return Unit.INSTANCE;
                            case 2:
                                RawTreehousePlatform rawTreehousePlatform2 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform2.getClass();
                                list.getClass();
                                return rawTreehousePlatform2.offersRepositoryService();
                            case 3:
                                RawTreehousePlatform rawTreehousePlatform3 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform3.getClass();
                                list.getClass();
                                return rawTreehousePlatform3.rawOfflineActivityService();
                            case 4:
                                RawTreehousePlatform rawTreehousePlatform4 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform4.getClass();
                                list.getClass();
                                return rawTreehousePlatform4.cashHttpClient();
                            case 5:
                                RawTreehousePlatform rawTreehousePlatform5 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform5.getClass();
                                list.getClass();
                                return rawTreehousePlatform5.httpClient();
                            case 6:
                                RawTreehousePlatform rawTreehousePlatform6 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform6.getClass();
                                list.getClass();
                                return rawTreehousePlatform6.prefetchClient();
                            case 7:
                                RawTreehousePlatform rawTreehousePlatform7 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform7.getClass();
                                list.getClass();
                                return rawTreehousePlatform7.rawAnalyticsService();
                            case 8:
                                RawTreehousePlatform rawTreehousePlatform8 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform8.getClass();
                                list.getClass();
                                return rawTreehousePlatform8.rawAppConfigService();
                            case 9:
                                RawTreehousePlatform rawTreehousePlatform9 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform9.getClass();
                                list.getClass();
                                return rawTreehousePlatform9.rawAppMessagingService();
                            case 10:
                                RawPreferencesService rawPreferencesService = (RawPreferencesService) ziplineService;
                                rawPreferencesService.getClass();
                                list.getClass();
                                return rawPreferencesService.displayUnit();
                            case 11:
                                RawPreferencesService rawPreferencesService2 = (RawPreferencesService) ziplineService;
                                rawPreferencesService2.getClass();
                                list.getClass();
                                return rawPreferencesService2.displayUnitFlow();
                            case 12:
                                RawPreferencesService rawPreferencesService3 = (RawPreferencesService) ziplineService;
                                rawPreferencesService3.getClass();
                                list.getClass();
                                rawPreferencesService3.close();
                                return Unit.INSTANCE;
                            case 13:
                                SqlDelightBridge sqlDelightBridge = (SqlDelightBridge) ziplineService;
                                sqlDelightBridge.getClass();
                                list.getClass();
                                sqlDelightBridge.close();
                                return Unit.INSTANCE;
                            case 14:
                                RawSyncValueService rawSyncValueService2 = (RawSyncValueService) ziplineService;
                                rawSyncValueService2.getClass();
                                list.getClass();
                                Object obj = list.get(0);
                                obj.getClass();
                                return rawSyncValueService2.getSyncValues(((Integer) obj).intValue());
                            case 15:
                                RawSyncValueService rawSyncValueService3 = (RawSyncValueService) ziplineService;
                                rawSyncValueService3.getClass();
                                list.getClass();
                                rawSyncValueService3.close();
                                return Unit.INSTANCE;
                            case 16:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.getClass();
                                list.getClass();
                                Object obj2 = list.get(0);
                                obj2.getClass();
                                ByteString byteString = (ByteString) list.get(1);
                                Object obj3 = list.get(2);
                                obj3.getClass();
                                Object call = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService, 0, (String) obj2, byteString, (Navigator) obj3, (HostViewService) list.get(3));
                                call.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call;
                            case 17:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.getClass();
                                list.getClass();
                                Object obj4 = list.get(0);
                                obj4.getClass();
                                ByteString byteString2 = (ByteString) list.get(1);
                                Object obj5 = list.get(2);
                                obj5.getClass();
                                Object call2 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2, 1, (String) obj4, byteString2, (Navigator) obj5);
                                call2.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call2;
                            case 18:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.getClass();
                                list.getClass();
                                Object obj6 = list.get(0);
                                obj6.getClass();
                                Object obj7 = list.get(1);
                                obj7.getClass();
                                Object call3 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3, 2, (String) obj6, (Navigator) obj7);
                                call3.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call3;
                            case 19:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.getClass();
                                list.getClass();
                                Object obj8 = list.get(0);
                                obj8.getClass();
                                Object obj9 = list.get(1);
                                obj9.getClass();
                                Object obj10 = list.get(2);
                                obj10.getClass();
                                Object obj11 = list.get(3);
                                obj11.getClass();
                                Object call4 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4, 3, (BlockerScreenSpec) obj8, (Navigator) obj9, (HostViewService) obj10, (RawFlowService) obj11);
                                call4.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call4;
                            case 20:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.getClass();
                                list.getClass();
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.close();
                                return Unit.INSTANCE;
                            default:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.getClass();
                                list.getClass();
                                Object call5 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6, 5, new Object[0]);
                                call5.getClass();
                                return (AppLifecycle$Companion$Adapter$GeneratedOutboundService) call5;
                        }
                    }
                };
                final List listOf50 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf50.getClass();
                final String str7 = "fun httpClient(): com.squareup.cash.treehouse.network.HttpClient";
                final int i4 = 5;
                final String str8 = "BBNtx24X";
                ReturningZiplineFunction returningZiplineFunction4 = new ReturningZiplineFunction(str8, str7, listOf50, httpClient$Companion$Adapter) { // from class: com.squareup.cash.treehouse.sync.RawSyncValueService$Companion$Adapter$ZiplineFunction0
                    @Override // app.cash.zipline.internal.bridge.ReturningZiplineFunction
                    public final Object call(ZiplineService ziplineService, List list) {
                        switch (i4) {
                            case 0:
                                RawSyncValueService rawSyncValueService = (RawSyncValueService) ziplineService;
                                rawSyncValueService.getClass();
                                list.getClass();
                                return rawSyncValueService.encodedAllSyncValues();
                            case 1:
                                RawTreehousePlatform rawTreehousePlatform = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform.getClass();
                                list.getClass();
                                rawTreehousePlatform.close();
                                return Unit.INSTANCE;
                            case 2:
                                RawTreehousePlatform rawTreehousePlatform2 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform2.getClass();
                                list.getClass();
                                return rawTreehousePlatform2.offersRepositoryService();
                            case 3:
                                RawTreehousePlatform rawTreehousePlatform3 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform3.getClass();
                                list.getClass();
                                return rawTreehousePlatform3.rawOfflineActivityService();
                            case 4:
                                RawTreehousePlatform rawTreehousePlatform4 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform4.getClass();
                                list.getClass();
                                return rawTreehousePlatform4.cashHttpClient();
                            case 5:
                                RawTreehousePlatform rawTreehousePlatform5 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform5.getClass();
                                list.getClass();
                                return rawTreehousePlatform5.httpClient();
                            case 6:
                                RawTreehousePlatform rawTreehousePlatform6 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform6.getClass();
                                list.getClass();
                                return rawTreehousePlatform6.prefetchClient();
                            case 7:
                                RawTreehousePlatform rawTreehousePlatform7 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform7.getClass();
                                list.getClass();
                                return rawTreehousePlatform7.rawAnalyticsService();
                            case 8:
                                RawTreehousePlatform rawTreehousePlatform8 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform8.getClass();
                                list.getClass();
                                return rawTreehousePlatform8.rawAppConfigService();
                            case 9:
                                RawTreehousePlatform rawTreehousePlatform9 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform9.getClass();
                                list.getClass();
                                return rawTreehousePlatform9.rawAppMessagingService();
                            case 10:
                                RawPreferencesService rawPreferencesService = (RawPreferencesService) ziplineService;
                                rawPreferencesService.getClass();
                                list.getClass();
                                return rawPreferencesService.displayUnit();
                            case 11:
                                RawPreferencesService rawPreferencesService2 = (RawPreferencesService) ziplineService;
                                rawPreferencesService2.getClass();
                                list.getClass();
                                return rawPreferencesService2.displayUnitFlow();
                            case 12:
                                RawPreferencesService rawPreferencesService3 = (RawPreferencesService) ziplineService;
                                rawPreferencesService3.getClass();
                                list.getClass();
                                rawPreferencesService3.close();
                                return Unit.INSTANCE;
                            case 13:
                                SqlDelightBridge sqlDelightBridge = (SqlDelightBridge) ziplineService;
                                sqlDelightBridge.getClass();
                                list.getClass();
                                sqlDelightBridge.close();
                                return Unit.INSTANCE;
                            case 14:
                                RawSyncValueService rawSyncValueService2 = (RawSyncValueService) ziplineService;
                                rawSyncValueService2.getClass();
                                list.getClass();
                                Object obj = list.get(0);
                                obj.getClass();
                                return rawSyncValueService2.getSyncValues(((Integer) obj).intValue());
                            case 15:
                                RawSyncValueService rawSyncValueService3 = (RawSyncValueService) ziplineService;
                                rawSyncValueService3.getClass();
                                list.getClass();
                                rawSyncValueService3.close();
                                return Unit.INSTANCE;
                            case 16:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.getClass();
                                list.getClass();
                                Object obj2 = list.get(0);
                                obj2.getClass();
                                ByteString byteString = (ByteString) list.get(1);
                                Object obj3 = list.get(2);
                                obj3.getClass();
                                Object call = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService, 0, (String) obj2, byteString, (Navigator) obj3, (HostViewService) list.get(3));
                                call.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call;
                            case 17:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.getClass();
                                list.getClass();
                                Object obj4 = list.get(0);
                                obj4.getClass();
                                ByteString byteString2 = (ByteString) list.get(1);
                                Object obj5 = list.get(2);
                                obj5.getClass();
                                Object call2 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2, 1, (String) obj4, byteString2, (Navigator) obj5);
                                call2.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call2;
                            case 18:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.getClass();
                                list.getClass();
                                Object obj6 = list.get(0);
                                obj6.getClass();
                                Object obj7 = list.get(1);
                                obj7.getClass();
                                Object call3 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3, 2, (String) obj6, (Navigator) obj7);
                                call3.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call3;
                            case 19:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.getClass();
                                list.getClass();
                                Object obj8 = list.get(0);
                                obj8.getClass();
                                Object obj9 = list.get(1);
                                obj9.getClass();
                                Object obj10 = list.get(2);
                                obj10.getClass();
                                Object obj11 = list.get(3);
                                obj11.getClass();
                                Object call4 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4, 3, (BlockerScreenSpec) obj8, (Navigator) obj9, (HostViewService) obj10, (RawFlowService) obj11);
                                call4.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call4;
                            case 20:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.getClass();
                                list.getClass();
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.close();
                                return Unit.INSTANCE;
                            default:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.getClass();
                                list.getClass();
                                Object call5 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6, 5, new Object[0]);
                                call5.getClass();
                                return (AppLifecycle$Companion$Adapter$GeneratedOutboundService) call5;
                        }
                    }
                };
                final List listOf51 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf51.getClass();
                final String str9 = "fun prefetchClient(): com.squareup.cash.treehouse.network.prefetch.PrefetchClient";
                final int i5 = 6;
                final String str10 = "UJxV+eXc";
                ReturningZiplineFunction returningZiplineFunction5 = new ReturningZiplineFunction(str10, str9, listOf51, httpClient$Companion$Adapter2) { // from class: com.squareup.cash.treehouse.sync.RawSyncValueService$Companion$Adapter$ZiplineFunction0
                    @Override // app.cash.zipline.internal.bridge.ReturningZiplineFunction
                    public final Object call(ZiplineService ziplineService, List list) {
                        switch (i5) {
                            case 0:
                                RawSyncValueService rawSyncValueService = (RawSyncValueService) ziplineService;
                                rawSyncValueService.getClass();
                                list.getClass();
                                return rawSyncValueService.encodedAllSyncValues();
                            case 1:
                                RawTreehousePlatform rawTreehousePlatform = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform.getClass();
                                list.getClass();
                                rawTreehousePlatform.close();
                                return Unit.INSTANCE;
                            case 2:
                                RawTreehousePlatform rawTreehousePlatform2 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform2.getClass();
                                list.getClass();
                                return rawTreehousePlatform2.offersRepositoryService();
                            case 3:
                                RawTreehousePlatform rawTreehousePlatform3 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform3.getClass();
                                list.getClass();
                                return rawTreehousePlatform3.rawOfflineActivityService();
                            case 4:
                                RawTreehousePlatform rawTreehousePlatform4 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform4.getClass();
                                list.getClass();
                                return rawTreehousePlatform4.cashHttpClient();
                            case 5:
                                RawTreehousePlatform rawTreehousePlatform5 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform5.getClass();
                                list.getClass();
                                return rawTreehousePlatform5.httpClient();
                            case 6:
                                RawTreehousePlatform rawTreehousePlatform6 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform6.getClass();
                                list.getClass();
                                return rawTreehousePlatform6.prefetchClient();
                            case 7:
                                RawTreehousePlatform rawTreehousePlatform7 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform7.getClass();
                                list.getClass();
                                return rawTreehousePlatform7.rawAnalyticsService();
                            case 8:
                                RawTreehousePlatform rawTreehousePlatform8 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform8.getClass();
                                list.getClass();
                                return rawTreehousePlatform8.rawAppConfigService();
                            case 9:
                                RawTreehousePlatform rawTreehousePlatform9 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform9.getClass();
                                list.getClass();
                                return rawTreehousePlatform9.rawAppMessagingService();
                            case 10:
                                RawPreferencesService rawPreferencesService = (RawPreferencesService) ziplineService;
                                rawPreferencesService.getClass();
                                list.getClass();
                                return rawPreferencesService.displayUnit();
                            case 11:
                                RawPreferencesService rawPreferencesService2 = (RawPreferencesService) ziplineService;
                                rawPreferencesService2.getClass();
                                list.getClass();
                                return rawPreferencesService2.displayUnitFlow();
                            case 12:
                                RawPreferencesService rawPreferencesService3 = (RawPreferencesService) ziplineService;
                                rawPreferencesService3.getClass();
                                list.getClass();
                                rawPreferencesService3.close();
                                return Unit.INSTANCE;
                            case 13:
                                SqlDelightBridge sqlDelightBridge = (SqlDelightBridge) ziplineService;
                                sqlDelightBridge.getClass();
                                list.getClass();
                                sqlDelightBridge.close();
                                return Unit.INSTANCE;
                            case 14:
                                RawSyncValueService rawSyncValueService2 = (RawSyncValueService) ziplineService;
                                rawSyncValueService2.getClass();
                                list.getClass();
                                Object obj = list.get(0);
                                obj.getClass();
                                return rawSyncValueService2.getSyncValues(((Integer) obj).intValue());
                            case 15:
                                RawSyncValueService rawSyncValueService3 = (RawSyncValueService) ziplineService;
                                rawSyncValueService3.getClass();
                                list.getClass();
                                rawSyncValueService3.close();
                                return Unit.INSTANCE;
                            case 16:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.getClass();
                                list.getClass();
                                Object obj2 = list.get(0);
                                obj2.getClass();
                                ByteString byteString = (ByteString) list.get(1);
                                Object obj3 = list.get(2);
                                obj3.getClass();
                                Object call = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService, 0, (String) obj2, byteString, (Navigator) obj3, (HostViewService) list.get(3));
                                call.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call;
                            case 17:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.getClass();
                                list.getClass();
                                Object obj4 = list.get(0);
                                obj4.getClass();
                                ByteString byteString2 = (ByteString) list.get(1);
                                Object obj5 = list.get(2);
                                obj5.getClass();
                                Object call2 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2, 1, (String) obj4, byteString2, (Navigator) obj5);
                                call2.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call2;
                            case 18:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.getClass();
                                list.getClass();
                                Object obj6 = list.get(0);
                                obj6.getClass();
                                Object obj7 = list.get(1);
                                obj7.getClass();
                                Object call3 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3, 2, (String) obj6, (Navigator) obj7);
                                call3.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call3;
                            case 19:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.getClass();
                                list.getClass();
                                Object obj8 = list.get(0);
                                obj8.getClass();
                                Object obj9 = list.get(1);
                                obj9.getClass();
                                Object obj10 = list.get(2);
                                obj10.getClass();
                                Object obj11 = list.get(3);
                                obj11.getClass();
                                Object call4 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4, 3, (BlockerScreenSpec) obj8, (Navigator) obj9, (HostViewService) obj10, (RawFlowService) obj11);
                                call4.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call4;
                            case 20:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.getClass();
                                list.getClass();
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.close();
                                return Unit.INSTANCE;
                            default:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.getClass();
                                list.getClass();
                                Object call5 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6, 5, new Object[0]);
                                call5.getClass();
                                return (AppLifecycle$Companion$Adapter$GeneratedOutboundService) call5;
                        }
                    }
                };
                final List listOf52 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf52.getClass();
                final String str11 = "fun rawAnalyticsService(): com.squareup.cash.treehouse.analytics.RawAnalyticsService";
                final int i6 = 7;
                final String str12 = "8LGXsy7Y";
                ReturningZiplineFunction returningZiplineFunction6 = new ReturningZiplineFunction(str12, str11, listOf52, hostService$Companion$Adapter14) { // from class: com.squareup.cash.treehouse.sync.RawSyncValueService$Companion$Adapter$ZiplineFunction0
                    @Override // app.cash.zipline.internal.bridge.ReturningZiplineFunction
                    public final Object call(ZiplineService ziplineService, List list) {
                        switch (i6) {
                            case 0:
                                RawSyncValueService rawSyncValueService = (RawSyncValueService) ziplineService;
                                rawSyncValueService.getClass();
                                list.getClass();
                                return rawSyncValueService.encodedAllSyncValues();
                            case 1:
                                RawTreehousePlatform rawTreehousePlatform = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform.getClass();
                                list.getClass();
                                rawTreehousePlatform.close();
                                return Unit.INSTANCE;
                            case 2:
                                RawTreehousePlatform rawTreehousePlatform2 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform2.getClass();
                                list.getClass();
                                return rawTreehousePlatform2.offersRepositoryService();
                            case 3:
                                RawTreehousePlatform rawTreehousePlatform3 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform3.getClass();
                                list.getClass();
                                return rawTreehousePlatform3.rawOfflineActivityService();
                            case 4:
                                RawTreehousePlatform rawTreehousePlatform4 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform4.getClass();
                                list.getClass();
                                return rawTreehousePlatform4.cashHttpClient();
                            case 5:
                                RawTreehousePlatform rawTreehousePlatform5 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform5.getClass();
                                list.getClass();
                                return rawTreehousePlatform5.httpClient();
                            case 6:
                                RawTreehousePlatform rawTreehousePlatform6 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform6.getClass();
                                list.getClass();
                                return rawTreehousePlatform6.prefetchClient();
                            case 7:
                                RawTreehousePlatform rawTreehousePlatform7 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform7.getClass();
                                list.getClass();
                                return rawTreehousePlatform7.rawAnalyticsService();
                            case 8:
                                RawTreehousePlatform rawTreehousePlatform8 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform8.getClass();
                                list.getClass();
                                return rawTreehousePlatform8.rawAppConfigService();
                            case 9:
                                RawTreehousePlatform rawTreehousePlatform9 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform9.getClass();
                                list.getClass();
                                return rawTreehousePlatform9.rawAppMessagingService();
                            case 10:
                                RawPreferencesService rawPreferencesService = (RawPreferencesService) ziplineService;
                                rawPreferencesService.getClass();
                                list.getClass();
                                return rawPreferencesService.displayUnit();
                            case 11:
                                RawPreferencesService rawPreferencesService2 = (RawPreferencesService) ziplineService;
                                rawPreferencesService2.getClass();
                                list.getClass();
                                return rawPreferencesService2.displayUnitFlow();
                            case 12:
                                RawPreferencesService rawPreferencesService3 = (RawPreferencesService) ziplineService;
                                rawPreferencesService3.getClass();
                                list.getClass();
                                rawPreferencesService3.close();
                                return Unit.INSTANCE;
                            case 13:
                                SqlDelightBridge sqlDelightBridge = (SqlDelightBridge) ziplineService;
                                sqlDelightBridge.getClass();
                                list.getClass();
                                sqlDelightBridge.close();
                                return Unit.INSTANCE;
                            case 14:
                                RawSyncValueService rawSyncValueService2 = (RawSyncValueService) ziplineService;
                                rawSyncValueService2.getClass();
                                list.getClass();
                                Object obj = list.get(0);
                                obj.getClass();
                                return rawSyncValueService2.getSyncValues(((Integer) obj).intValue());
                            case 15:
                                RawSyncValueService rawSyncValueService3 = (RawSyncValueService) ziplineService;
                                rawSyncValueService3.getClass();
                                list.getClass();
                                rawSyncValueService3.close();
                                return Unit.INSTANCE;
                            case 16:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.getClass();
                                list.getClass();
                                Object obj2 = list.get(0);
                                obj2.getClass();
                                ByteString byteString = (ByteString) list.get(1);
                                Object obj3 = list.get(2);
                                obj3.getClass();
                                Object call = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService, 0, (String) obj2, byteString, (Navigator) obj3, (HostViewService) list.get(3));
                                call.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call;
                            case 17:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.getClass();
                                list.getClass();
                                Object obj4 = list.get(0);
                                obj4.getClass();
                                ByteString byteString2 = (ByteString) list.get(1);
                                Object obj5 = list.get(2);
                                obj5.getClass();
                                Object call2 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2, 1, (String) obj4, byteString2, (Navigator) obj5);
                                call2.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call2;
                            case 18:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.getClass();
                                list.getClass();
                                Object obj6 = list.get(0);
                                obj6.getClass();
                                Object obj7 = list.get(1);
                                obj7.getClass();
                                Object call3 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3, 2, (String) obj6, (Navigator) obj7);
                                call3.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call3;
                            case 19:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.getClass();
                                list.getClass();
                                Object obj8 = list.get(0);
                                obj8.getClass();
                                Object obj9 = list.get(1);
                                obj9.getClass();
                                Object obj10 = list.get(2);
                                obj10.getClass();
                                Object obj11 = list.get(3);
                                obj11.getClass();
                                Object call4 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4, 3, (BlockerScreenSpec) obj8, (Navigator) obj9, (HostViewService) obj10, (RawFlowService) obj11);
                                call4.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call4;
                            case 20:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.getClass();
                                list.getClass();
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.close();
                                return Unit.INSTANCE;
                            default:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.getClass();
                                list.getClass();
                                Object call5 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6, 5, new Object[0]);
                                call5.getClass();
                                return (AppLifecycle$Companion$Adapter$GeneratedOutboundService) call5;
                        }
                    }
                };
                final List listOf53 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf53.getClass();
                final String str13 = "fun rawAppConfigService(): com.squareup.cash.treehouse.appconfig.RawAppConfigService";
                final int i7 = 8;
                final String str14 = "Ly7r+I3d";
                ReturningZiplineFunction returningZiplineFunction7 = new ReturningZiplineFunction(str14, str13, listOf53, hostService$Companion$Adapter15) { // from class: com.squareup.cash.treehouse.sync.RawSyncValueService$Companion$Adapter$ZiplineFunction0
                    @Override // app.cash.zipline.internal.bridge.ReturningZiplineFunction
                    public final Object call(ZiplineService ziplineService, List list) {
                        switch (i7) {
                            case 0:
                                RawSyncValueService rawSyncValueService = (RawSyncValueService) ziplineService;
                                rawSyncValueService.getClass();
                                list.getClass();
                                return rawSyncValueService.encodedAllSyncValues();
                            case 1:
                                RawTreehousePlatform rawTreehousePlatform = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform.getClass();
                                list.getClass();
                                rawTreehousePlatform.close();
                                return Unit.INSTANCE;
                            case 2:
                                RawTreehousePlatform rawTreehousePlatform2 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform2.getClass();
                                list.getClass();
                                return rawTreehousePlatform2.offersRepositoryService();
                            case 3:
                                RawTreehousePlatform rawTreehousePlatform3 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform3.getClass();
                                list.getClass();
                                return rawTreehousePlatform3.rawOfflineActivityService();
                            case 4:
                                RawTreehousePlatform rawTreehousePlatform4 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform4.getClass();
                                list.getClass();
                                return rawTreehousePlatform4.cashHttpClient();
                            case 5:
                                RawTreehousePlatform rawTreehousePlatform5 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform5.getClass();
                                list.getClass();
                                return rawTreehousePlatform5.httpClient();
                            case 6:
                                RawTreehousePlatform rawTreehousePlatform6 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform6.getClass();
                                list.getClass();
                                return rawTreehousePlatform6.prefetchClient();
                            case 7:
                                RawTreehousePlatform rawTreehousePlatform7 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform7.getClass();
                                list.getClass();
                                return rawTreehousePlatform7.rawAnalyticsService();
                            case 8:
                                RawTreehousePlatform rawTreehousePlatform8 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform8.getClass();
                                list.getClass();
                                return rawTreehousePlatform8.rawAppConfigService();
                            case 9:
                                RawTreehousePlatform rawTreehousePlatform9 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform9.getClass();
                                list.getClass();
                                return rawTreehousePlatform9.rawAppMessagingService();
                            case 10:
                                RawPreferencesService rawPreferencesService = (RawPreferencesService) ziplineService;
                                rawPreferencesService.getClass();
                                list.getClass();
                                return rawPreferencesService.displayUnit();
                            case 11:
                                RawPreferencesService rawPreferencesService2 = (RawPreferencesService) ziplineService;
                                rawPreferencesService2.getClass();
                                list.getClass();
                                return rawPreferencesService2.displayUnitFlow();
                            case 12:
                                RawPreferencesService rawPreferencesService3 = (RawPreferencesService) ziplineService;
                                rawPreferencesService3.getClass();
                                list.getClass();
                                rawPreferencesService3.close();
                                return Unit.INSTANCE;
                            case 13:
                                SqlDelightBridge sqlDelightBridge = (SqlDelightBridge) ziplineService;
                                sqlDelightBridge.getClass();
                                list.getClass();
                                sqlDelightBridge.close();
                                return Unit.INSTANCE;
                            case 14:
                                RawSyncValueService rawSyncValueService2 = (RawSyncValueService) ziplineService;
                                rawSyncValueService2.getClass();
                                list.getClass();
                                Object obj = list.get(0);
                                obj.getClass();
                                return rawSyncValueService2.getSyncValues(((Integer) obj).intValue());
                            case 15:
                                RawSyncValueService rawSyncValueService3 = (RawSyncValueService) ziplineService;
                                rawSyncValueService3.getClass();
                                list.getClass();
                                rawSyncValueService3.close();
                                return Unit.INSTANCE;
                            case 16:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.getClass();
                                list.getClass();
                                Object obj2 = list.get(0);
                                obj2.getClass();
                                ByteString byteString = (ByteString) list.get(1);
                                Object obj3 = list.get(2);
                                obj3.getClass();
                                Object call = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService, 0, (String) obj2, byteString, (Navigator) obj3, (HostViewService) list.get(3));
                                call.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call;
                            case 17:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.getClass();
                                list.getClass();
                                Object obj4 = list.get(0);
                                obj4.getClass();
                                ByteString byteString2 = (ByteString) list.get(1);
                                Object obj5 = list.get(2);
                                obj5.getClass();
                                Object call2 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2, 1, (String) obj4, byteString2, (Navigator) obj5);
                                call2.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call2;
                            case 18:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.getClass();
                                list.getClass();
                                Object obj6 = list.get(0);
                                obj6.getClass();
                                Object obj7 = list.get(1);
                                obj7.getClass();
                                Object call3 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3, 2, (String) obj6, (Navigator) obj7);
                                call3.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call3;
                            case 19:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.getClass();
                                list.getClass();
                                Object obj8 = list.get(0);
                                obj8.getClass();
                                Object obj9 = list.get(1);
                                obj9.getClass();
                                Object obj10 = list.get(2);
                                obj10.getClass();
                                Object obj11 = list.get(3);
                                obj11.getClass();
                                Object call4 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4, 3, (BlockerScreenSpec) obj8, (Navigator) obj9, (HostViewService) obj10, (RawFlowService) obj11);
                                call4.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call4;
                            case 20:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.getClass();
                                list.getClass();
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.close();
                                return Unit.INSTANCE;
                            default:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.getClass();
                                list.getClass();
                                Object call5 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6, 5, new Object[0]);
                                call5.getClass();
                                return (AppLifecycle$Companion$Adapter$GeneratedOutboundService) call5;
                        }
                    }
                };
                final List listOf54 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf54.getClass();
                final String str15 = "fun rawAppMessagingService(): com.squareup.cash.treehouse.appmessaging.RawAppMessagingService";
                final int i8 = 9;
                final String str16 = "/FYUTemt";
                ReturningZiplineFunction returningZiplineFunction8 = new ReturningZiplineFunction(str16, str15, listOf54, hostService$Companion$Adapter16) { // from class: com.squareup.cash.treehouse.sync.RawSyncValueService$Companion$Adapter$ZiplineFunction0
                    @Override // app.cash.zipline.internal.bridge.ReturningZiplineFunction
                    public final Object call(ZiplineService ziplineService, List list) {
                        switch (i8) {
                            case 0:
                                RawSyncValueService rawSyncValueService = (RawSyncValueService) ziplineService;
                                rawSyncValueService.getClass();
                                list.getClass();
                                return rawSyncValueService.encodedAllSyncValues();
                            case 1:
                                RawTreehousePlatform rawTreehousePlatform = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform.getClass();
                                list.getClass();
                                rawTreehousePlatform.close();
                                return Unit.INSTANCE;
                            case 2:
                                RawTreehousePlatform rawTreehousePlatform2 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform2.getClass();
                                list.getClass();
                                return rawTreehousePlatform2.offersRepositoryService();
                            case 3:
                                RawTreehousePlatform rawTreehousePlatform3 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform3.getClass();
                                list.getClass();
                                return rawTreehousePlatform3.rawOfflineActivityService();
                            case 4:
                                RawTreehousePlatform rawTreehousePlatform4 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform4.getClass();
                                list.getClass();
                                return rawTreehousePlatform4.cashHttpClient();
                            case 5:
                                RawTreehousePlatform rawTreehousePlatform5 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform5.getClass();
                                list.getClass();
                                return rawTreehousePlatform5.httpClient();
                            case 6:
                                RawTreehousePlatform rawTreehousePlatform6 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform6.getClass();
                                list.getClass();
                                return rawTreehousePlatform6.prefetchClient();
                            case 7:
                                RawTreehousePlatform rawTreehousePlatform7 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform7.getClass();
                                list.getClass();
                                return rawTreehousePlatform7.rawAnalyticsService();
                            case 8:
                                RawTreehousePlatform rawTreehousePlatform8 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform8.getClass();
                                list.getClass();
                                return rawTreehousePlatform8.rawAppConfigService();
                            case 9:
                                RawTreehousePlatform rawTreehousePlatform9 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform9.getClass();
                                list.getClass();
                                return rawTreehousePlatform9.rawAppMessagingService();
                            case 10:
                                RawPreferencesService rawPreferencesService = (RawPreferencesService) ziplineService;
                                rawPreferencesService.getClass();
                                list.getClass();
                                return rawPreferencesService.displayUnit();
                            case 11:
                                RawPreferencesService rawPreferencesService2 = (RawPreferencesService) ziplineService;
                                rawPreferencesService2.getClass();
                                list.getClass();
                                return rawPreferencesService2.displayUnitFlow();
                            case 12:
                                RawPreferencesService rawPreferencesService3 = (RawPreferencesService) ziplineService;
                                rawPreferencesService3.getClass();
                                list.getClass();
                                rawPreferencesService3.close();
                                return Unit.INSTANCE;
                            case 13:
                                SqlDelightBridge sqlDelightBridge = (SqlDelightBridge) ziplineService;
                                sqlDelightBridge.getClass();
                                list.getClass();
                                sqlDelightBridge.close();
                                return Unit.INSTANCE;
                            case 14:
                                RawSyncValueService rawSyncValueService2 = (RawSyncValueService) ziplineService;
                                rawSyncValueService2.getClass();
                                list.getClass();
                                Object obj = list.get(0);
                                obj.getClass();
                                return rawSyncValueService2.getSyncValues(((Integer) obj).intValue());
                            case 15:
                                RawSyncValueService rawSyncValueService3 = (RawSyncValueService) ziplineService;
                                rawSyncValueService3.getClass();
                                list.getClass();
                                rawSyncValueService3.close();
                                return Unit.INSTANCE;
                            case 16:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.getClass();
                                list.getClass();
                                Object obj2 = list.get(0);
                                obj2.getClass();
                                ByteString byteString = (ByteString) list.get(1);
                                Object obj3 = list.get(2);
                                obj3.getClass();
                                Object call = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService, 0, (String) obj2, byteString, (Navigator) obj3, (HostViewService) list.get(3));
                                call.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call;
                            case 17:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.getClass();
                                list.getClass();
                                Object obj4 = list.get(0);
                                obj4.getClass();
                                ByteString byteString2 = (ByteString) list.get(1);
                                Object obj5 = list.get(2);
                                obj5.getClass();
                                Object call2 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2, 1, (String) obj4, byteString2, (Navigator) obj5);
                                call2.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call2;
                            case 18:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.getClass();
                                list.getClass();
                                Object obj6 = list.get(0);
                                obj6.getClass();
                                Object obj7 = list.get(1);
                                obj7.getClass();
                                Object call3 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3, 2, (String) obj6, (Navigator) obj7);
                                call3.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call3;
                            case 19:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.getClass();
                                list.getClass();
                                Object obj8 = list.get(0);
                                obj8.getClass();
                                Object obj9 = list.get(1);
                                obj9.getClass();
                                Object obj10 = list.get(2);
                                obj10.getClass();
                                Object obj11 = list.get(3);
                                obj11.getClass();
                                Object call4 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4, 3, (BlockerScreenSpec) obj8, (Navigator) obj9, (HostViewService) obj10, (RawFlowService) obj11);
                                call4.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call4;
                            case 20:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.getClass();
                                list.getClass();
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.close();
                                return Unit.INSTANCE;
                            default:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.getClass();
                                list.getClass();
                                Object call5 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6, 5, new Object[0]);
                                call5.getClass();
                                return (AppLifecycle$Companion$Adapter$GeneratedOutboundService) call5;
                        }
                    }
                };
                List listOf55 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf55.getClass();
                ZiplineFunction1 ziplineFunction18 = new ZiplineFunction1("kALXYvVy", "fun rawBadgingService(): com.squareup.cash.treehouse.badging.RawBadgingService", listOf55, hostService$Companion$Adapter17, 13);
                List listOf56 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf56.getClass();
                ZiplineFunction1 ziplineFunction19 = new ZiplineFunction1("vjNRiVVB", "fun rawBuildConfigService(): com.squareup.cash.treehouse.buildconfig.RawBuildConfigService", listOf56, hostService$Companion$Adapter18, 14);
                List listOf57 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf57.getClass();
                ZiplineFunction1 ziplineFunction110 = new ZiplineFunction1("yDGTVqaV", "fun rawFlagsService(): com.squareup.cash.treehouse.flags.RawFlagsService", listOf57, httpClient$Companion$Adapter3, 15);
                List listOf58 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf58.getClass();
                ZiplineFunction1 ziplineFunction111 = new ZiplineFunction1("cI0Q5GC8", "fun rawPreferencesService(): com.squareup.cash.treehouse.preferences.RawPreferencesService", listOf58, httpClient$Companion$Adapter4, 16);
                List listOf59 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf59.getClass();
                ZiplineFunction1 ziplineFunction112 = new ZiplineFunction1("NSKEV48L", "fun rawSyncValueService(): com.squareup.cash.treehouse.sync.RawSyncValueService", listOf59, httpClient$Companion$Adapter5, 17);
                List listOf60 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf60.getClass();
                ZiplineFunction1 ziplineFunction113 = new ZiplineFunction1("3rdXa7T/", "fun contextService(): com.squareup.cash.treehouse.platform.CashContextService", listOf60, httpClient$Companion$Adapter6, 18);
                List listOf61 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf61.getClass();
                ZiplineFunction1 ziplineFunction114 = new ZiplineFunction1("Mf1m7w4U", "fun biometricsService(): com.squareup.cash.treehouse.biometrics.BiometricsService", listOf61, hostService$Companion$Adapter19, 19);
                List listOf62 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf62.getClass();
                ZiplineFunction1 ziplineFunction115 = new ZiplineFunction1("aB8B+Glk", "fun financialServicesBridge(): com.squareup.cash.treehouse.financialservices.FinancialServicesBridge", listOf62, httpClient$Companion$Adapter7, 20);
                List listOf63 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf63.getClass();
                ZiplineFunction1 ziplineFunction116 = new ZiplineFunction1("nI0uaLl7", "fun datadogService(): com.squareup.cash.treehouse.datadog.DatadogService", listOf63, hostService$Companion$Adapter20, 21);
                List listOf64 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{stringSerializer3});
                listOf64.getClass();
                ZiplineFunction1 ziplineFunction117 = new ZiplineFunction1("hxP78Z/s", "fun sqldelightBridge(kotlin.String): com.squareup.cash.treehouse.sqldelight.SqlDelightBridge", listOf64, httpClient$Companion$Adapter8, 22);
                List listOf65 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{stringSerializer3, stringSerializer3});
                listOf65.getClass();
                ZiplineFunction1 ziplineFunction118 = new ZiplineFunction1("JUF/4lRR", "fun sqlDelightBridge(kotlin.String, kotlin.String): com.squareup.cash.treehouse.sqldelight.SqlDelightBridge", listOf65, httpClient$Companion$Adapter8, 24);
                List listOf66 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf66.getClass();
                ZiplineFunction1 ziplineFunction119 = new ZiplineFunction1("OTu080+e", "fun rawLoggerService(): com.squareup.cash.treehouse.logger.RawLoggerService", listOf66, httpClient$Companion$Adapter9, 25);
                List listOf67 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf67.getClass();
                ZiplineFunction1 ziplineFunction120 = new ZiplineFunction1("yEk2LQ1f", "fun errorReporterService(): com.squareup.cash.treehouse.errorreporter.ErrorReporterService", listOf67, httpClient$Companion$Adapter10, 26);
                List listOf68 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf68.getClass();
                ZiplineFunction1 ziplineFunction121 = new ZiplineFunction1("r5zQMubl", "fun rawClipboardService(): com.squareup.cash.treehouse.clipboard.RawClipboardService", listOf68, hostService$Companion$Adapter21, 27);
                List listOf69 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf69.getClass();
                ZiplineFunction1 ziplineFunction122 = new ZiplineFunction1("qyQVHnGN", "fun timeZoneService(): com.squareup.cash.treehouse.activity.TimeZoneService", listOf69, hostService$Companion$Adapter22, 28);
                List listOf70 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf70.getClass();
                ZiplineFunction1 ziplineFunction123 = new ZiplineFunction1("YwmSD6ij", "fun accessibilityCallbackService(): com.squareup.cash.treehouse.accessibility.AccessibilityCallbackService", listOf70, hostService$Companion$Adapter23, 29);
                final List listOf71 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf71.getClass();
                unitSerializer11.getClass();
                final String str17 = "fun close(): kotlin.Unit";
                final int i9 = 1;
                final String str18 = "moYx+T3e";
                return CollectionsKt__CollectionsKt.listOf((Object[]) new ZiplineFunction[]{ziplineFunction16, ziplineFunction17, returningZiplineFunction, returningZiplineFunction2, returningZiplineFunction3, returningZiplineFunction4, returningZiplineFunction5, returningZiplineFunction6, returningZiplineFunction7, returningZiplineFunction8, ziplineFunction18, ziplineFunction19, ziplineFunction110, ziplineFunction111, ziplineFunction112, ziplineFunction113, ziplineFunction114, ziplineFunction115, ziplineFunction116, ziplineFunction117, ziplineFunction118, ziplineFunction119, ziplineFunction120, ziplineFunction121, ziplineFunction122, ziplineFunction123, new ReturningZiplineFunction(str18, str17, listOf71, unitSerializer11) { // from class: com.squareup.cash.treehouse.sync.RawSyncValueService$Companion$Adapter$ZiplineFunction0
                    @Override // app.cash.zipline.internal.bridge.ReturningZiplineFunction
                    public final Object call(ZiplineService ziplineService, List list) {
                        switch (i9) {
                            case 0:
                                RawSyncValueService rawSyncValueService = (RawSyncValueService) ziplineService;
                                rawSyncValueService.getClass();
                                list.getClass();
                                return rawSyncValueService.encodedAllSyncValues();
                            case 1:
                                RawTreehousePlatform rawTreehousePlatform = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform.getClass();
                                list.getClass();
                                rawTreehousePlatform.close();
                                return Unit.INSTANCE;
                            case 2:
                                RawTreehousePlatform rawTreehousePlatform2 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform2.getClass();
                                list.getClass();
                                return rawTreehousePlatform2.offersRepositoryService();
                            case 3:
                                RawTreehousePlatform rawTreehousePlatform3 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform3.getClass();
                                list.getClass();
                                return rawTreehousePlatform3.rawOfflineActivityService();
                            case 4:
                                RawTreehousePlatform rawTreehousePlatform4 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform4.getClass();
                                list.getClass();
                                return rawTreehousePlatform4.cashHttpClient();
                            case 5:
                                RawTreehousePlatform rawTreehousePlatform5 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform5.getClass();
                                list.getClass();
                                return rawTreehousePlatform5.httpClient();
                            case 6:
                                RawTreehousePlatform rawTreehousePlatform6 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform6.getClass();
                                list.getClass();
                                return rawTreehousePlatform6.prefetchClient();
                            case 7:
                                RawTreehousePlatform rawTreehousePlatform7 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform7.getClass();
                                list.getClass();
                                return rawTreehousePlatform7.rawAnalyticsService();
                            case 8:
                                RawTreehousePlatform rawTreehousePlatform8 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform8.getClass();
                                list.getClass();
                                return rawTreehousePlatform8.rawAppConfigService();
                            case 9:
                                RawTreehousePlatform rawTreehousePlatform9 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform9.getClass();
                                list.getClass();
                                return rawTreehousePlatform9.rawAppMessagingService();
                            case 10:
                                RawPreferencesService rawPreferencesService = (RawPreferencesService) ziplineService;
                                rawPreferencesService.getClass();
                                list.getClass();
                                return rawPreferencesService.displayUnit();
                            case 11:
                                RawPreferencesService rawPreferencesService2 = (RawPreferencesService) ziplineService;
                                rawPreferencesService2.getClass();
                                list.getClass();
                                return rawPreferencesService2.displayUnitFlow();
                            case 12:
                                RawPreferencesService rawPreferencesService3 = (RawPreferencesService) ziplineService;
                                rawPreferencesService3.getClass();
                                list.getClass();
                                rawPreferencesService3.close();
                                return Unit.INSTANCE;
                            case 13:
                                SqlDelightBridge sqlDelightBridge = (SqlDelightBridge) ziplineService;
                                sqlDelightBridge.getClass();
                                list.getClass();
                                sqlDelightBridge.close();
                                return Unit.INSTANCE;
                            case 14:
                                RawSyncValueService rawSyncValueService2 = (RawSyncValueService) ziplineService;
                                rawSyncValueService2.getClass();
                                list.getClass();
                                Object obj = list.get(0);
                                obj.getClass();
                                return rawSyncValueService2.getSyncValues(((Integer) obj).intValue());
                            case 15:
                                RawSyncValueService rawSyncValueService3 = (RawSyncValueService) ziplineService;
                                rawSyncValueService3.getClass();
                                list.getClass();
                                rawSyncValueService3.close();
                                return Unit.INSTANCE;
                            case 16:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.getClass();
                                list.getClass();
                                Object obj2 = list.get(0);
                                obj2.getClass();
                                ByteString byteString = (ByteString) list.get(1);
                                Object obj3 = list.get(2);
                                obj3.getClass();
                                Object call = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService, 0, (String) obj2, byteString, (Navigator) obj3, (HostViewService) list.get(3));
                                call.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call;
                            case 17:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.getClass();
                                list.getClass();
                                Object obj4 = list.get(0);
                                obj4.getClass();
                                ByteString byteString2 = (ByteString) list.get(1);
                                Object obj5 = list.get(2);
                                obj5.getClass();
                                Object call2 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2, 1, (String) obj4, byteString2, (Navigator) obj5);
                                call2.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call2;
                            case 18:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.getClass();
                                list.getClass();
                                Object obj6 = list.get(0);
                                obj6.getClass();
                                Object obj7 = list.get(1);
                                obj7.getClass();
                                Object call3 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3, 2, (String) obj6, (Navigator) obj7);
                                call3.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call3;
                            case 19:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.getClass();
                                list.getClass();
                                Object obj8 = list.get(0);
                                obj8.getClass();
                                Object obj9 = list.get(1);
                                obj9.getClass();
                                Object obj10 = list.get(2);
                                obj10.getClass();
                                Object obj11 = list.get(3);
                                obj11.getClass();
                                Object call4 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4, 3, (BlockerScreenSpec) obj8, (Navigator) obj9, (HostViewService) obj10, (RawFlowService) obj11);
                                call4.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call4;
                            case 20:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.getClass();
                                list.getClass();
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.close();
                                return Unit.INSTANCE;
                            default:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.getClass();
                                list.getClass();
                                Object call5 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6, 5, new Object[0]);
                                call5.getClass();
                                return (AppLifecycle$Companion$Adapter$GeneratedOutboundService) call5;
                        }
                    }
                }});
            case 11:
                serializersModule.getClass();
                final StringSerializer stringSerializer4 = StringSerializer.INSTANCE;
                final KSerializer requireContextual3 = InternalSerializersKt.requireContextual(serializersModule, Reflection.factory.getOrCreateKotlinClass(Flow.class), CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{stringSerializer4}));
                final UnitSerializer unitSerializer12 = UnitSerializer.INSTANCE;
                final List listOf72 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf72.getClass();
                final String str19 = "fun displayUnit(): kotlin.String";
                final int i10 = 10;
                final String str20 = "BVkcx+t+";
                ReturningZiplineFunction returningZiplineFunction9 = new ReturningZiplineFunction(str20, str19, listOf72, stringSerializer4) { // from class: com.squareup.cash.treehouse.sync.RawSyncValueService$Companion$Adapter$ZiplineFunction0
                    @Override // app.cash.zipline.internal.bridge.ReturningZiplineFunction
                    public final Object call(ZiplineService ziplineService, List list) {
                        switch (i10) {
                            case 0:
                                RawSyncValueService rawSyncValueService = (RawSyncValueService) ziplineService;
                                rawSyncValueService.getClass();
                                list.getClass();
                                return rawSyncValueService.encodedAllSyncValues();
                            case 1:
                                RawTreehousePlatform rawTreehousePlatform = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform.getClass();
                                list.getClass();
                                rawTreehousePlatform.close();
                                return Unit.INSTANCE;
                            case 2:
                                RawTreehousePlatform rawTreehousePlatform2 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform2.getClass();
                                list.getClass();
                                return rawTreehousePlatform2.offersRepositoryService();
                            case 3:
                                RawTreehousePlatform rawTreehousePlatform3 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform3.getClass();
                                list.getClass();
                                return rawTreehousePlatform3.rawOfflineActivityService();
                            case 4:
                                RawTreehousePlatform rawTreehousePlatform4 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform4.getClass();
                                list.getClass();
                                return rawTreehousePlatform4.cashHttpClient();
                            case 5:
                                RawTreehousePlatform rawTreehousePlatform5 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform5.getClass();
                                list.getClass();
                                return rawTreehousePlatform5.httpClient();
                            case 6:
                                RawTreehousePlatform rawTreehousePlatform6 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform6.getClass();
                                list.getClass();
                                return rawTreehousePlatform6.prefetchClient();
                            case 7:
                                RawTreehousePlatform rawTreehousePlatform7 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform7.getClass();
                                list.getClass();
                                return rawTreehousePlatform7.rawAnalyticsService();
                            case 8:
                                RawTreehousePlatform rawTreehousePlatform8 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform8.getClass();
                                list.getClass();
                                return rawTreehousePlatform8.rawAppConfigService();
                            case 9:
                                RawTreehousePlatform rawTreehousePlatform9 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform9.getClass();
                                list.getClass();
                                return rawTreehousePlatform9.rawAppMessagingService();
                            case 10:
                                RawPreferencesService rawPreferencesService = (RawPreferencesService) ziplineService;
                                rawPreferencesService.getClass();
                                list.getClass();
                                return rawPreferencesService.displayUnit();
                            case 11:
                                RawPreferencesService rawPreferencesService2 = (RawPreferencesService) ziplineService;
                                rawPreferencesService2.getClass();
                                list.getClass();
                                return rawPreferencesService2.displayUnitFlow();
                            case 12:
                                RawPreferencesService rawPreferencesService3 = (RawPreferencesService) ziplineService;
                                rawPreferencesService3.getClass();
                                list.getClass();
                                rawPreferencesService3.close();
                                return Unit.INSTANCE;
                            case 13:
                                SqlDelightBridge sqlDelightBridge = (SqlDelightBridge) ziplineService;
                                sqlDelightBridge.getClass();
                                list.getClass();
                                sqlDelightBridge.close();
                                return Unit.INSTANCE;
                            case 14:
                                RawSyncValueService rawSyncValueService2 = (RawSyncValueService) ziplineService;
                                rawSyncValueService2.getClass();
                                list.getClass();
                                Object obj = list.get(0);
                                obj.getClass();
                                return rawSyncValueService2.getSyncValues(((Integer) obj).intValue());
                            case 15:
                                RawSyncValueService rawSyncValueService3 = (RawSyncValueService) ziplineService;
                                rawSyncValueService3.getClass();
                                list.getClass();
                                rawSyncValueService3.close();
                                return Unit.INSTANCE;
                            case 16:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.getClass();
                                list.getClass();
                                Object obj2 = list.get(0);
                                obj2.getClass();
                                ByteString byteString = (ByteString) list.get(1);
                                Object obj3 = list.get(2);
                                obj3.getClass();
                                Object call = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService, 0, (String) obj2, byteString, (Navigator) obj3, (HostViewService) list.get(3));
                                call.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call;
                            case 17:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.getClass();
                                list.getClass();
                                Object obj4 = list.get(0);
                                obj4.getClass();
                                ByteString byteString2 = (ByteString) list.get(1);
                                Object obj5 = list.get(2);
                                obj5.getClass();
                                Object call2 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2, 1, (String) obj4, byteString2, (Navigator) obj5);
                                call2.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call2;
                            case 18:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.getClass();
                                list.getClass();
                                Object obj6 = list.get(0);
                                obj6.getClass();
                                Object obj7 = list.get(1);
                                obj7.getClass();
                                Object call3 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3, 2, (String) obj6, (Navigator) obj7);
                                call3.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call3;
                            case 19:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.getClass();
                                list.getClass();
                                Object obj8 = list.get(0);
                                obj8.getClass();
                                Object obj9 = list.get(1);
                                obj9.getClass();
                                Object obj10 = list.get(2);
                                obj10.getClass();
                                Object obj11 = list.get(3);
                                obj11.getClass();
                                Object call4 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4, 3, (BlockerScreenSpec) obj8, (Navigator) obj9, (HostViewService) obj10, (RawFlowService) obj11);
                                call4.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call4;
                            case 20:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.getClass();
                                list.getClass();
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.close();
                                return Unit.INSTANCE;
                            default:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.getClass();
                                list.getClass();
                                Object call5 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6, 5, new Object[0]);
                                call5.getClass();
                                return (AppLifecycle$Companion$Adapter$GeneratedOutboundService) call5;
                        }
                    }
                };
                final List listOf73 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf73.getClass();
                final String str21 = "fun displayUnitFlow(): kotlinx.coroutines.flow.Flow<kotlin.String>";
                final int i11 = 11;
                final String str22 = "MC7Q+j4H";
                ReturningZiplineFunction returningZiplineFunction10 = new ReturningZiplineFunction(str22, str21, listOf73, requireContextual3) { // from class: com.squareup.cash.treehouse.sync.RawSyncValueService$Companion$Adapter$ZiplineFunction0
                    @Override // app.cash.zipline.internal.bridge.ReturningZiplineFunction
                    public final Object call(ZiplineService ziplineService, List list) {
                        switch (i11) {
                            case 0:
                                RawSyncValueService rawSyncValueService = (RawSyncValueService) ziplineService;
                                rawSyncValueService.getClass();
                                list.getClass();
                                return rawSyncValueService.encodedAllSyncValues();
                            case 1:
                                RawTreehousePlatform rawTreehousePlatform = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform.getClass();
                                list.getClass();
                                rawTreehousePlatform.close();
                                return Unit.INSTANCE;
                            case 2:
                                RawTreehousePlatform rawTreehousePlatform2 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform2.getClass();
                                list.getClass();
                                return rawTreehousePlatform2.offersRepositoryService();
                            case 3:
                                RawTreehousePlatform rawTreehousePlatform3 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform3.getClass();
                                list.getClass();
                                return rawTreehousePlatform3.rawOfflineActivityService();
                            case 4:
                                RawTreehousePlatform rawTreehousePlatform4 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform4.getClass();
                                list.getClass();
                                return rawTreehousePlatform4.cashHttpClient();
                            case 5:
                                RawTreehousePlatform rawTreehousePlatform5 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform5.getClass();
                                list.getClass();
                                return rawTreehousePlatform5.httpClient();
                            case 6:
                                RawTreehousePlatform rawTreehousePlatform6 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform6.getClass();
                                list.getClass();
                                return rawTreehousePlatform6.prefetchClient();
                            case 7:
                                RawTreehousePlatform rawTreehousePlatform7 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform7.getClass();
                                list.getClass();
                                return rawTreehousePlatform7.rawAnalyticsService();
                            case 8:
                                RawTreehousePlatform rawTreehousePlatform8 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform8.getClass();
                                list.getClass();
                                return rawTreehousePlatform8.rawAppConfigService();
                            case 9:
                                RawTreehousePlatform rawTreehousePlatform9 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform9.getClass();
                                list.getClass();
                                return rawTreehousePlatform9.rawAppMessagingService();
                            case 10:
                                RawPreferencesService rawPreferencesService = (RawPreferencesService) ziplineService;
                                rawPreferencesService.getClass();
                                list.getClass();
                                return rawPreferencesService.displayUnit();
                            case 11:
                                RawPreferencesService rawPreferencesService2 = (RawPreferencesService) ziplineService;
                                rawPreferencesService2.getClass();
                                list.getClass();
                                return rawPreferencesService2.displayUnitFlow();
                            case 12:
                                RawPreferencesService rawPreferencesService3 = (RawPreferencesService) ziplineService;
                                rawPreferencesService3.getClass();
                                list.getClass();
                                rawPreferencesService3.close();
                                return Unit.INSTANCE;
                            case 13:
                                SqlDelightBridge sqlDelightBridge = (SqlDelightBridge) ziplineService;
                                sqlDelightBridge.getClass();
                                list.getClass();
                                sqlDelightBridge.close();
                                return Unit.INSTANCE;
                            case 14:
                                RawSyncValueService rawSyncValueService2 = (RawSyncValueService) ziplineService;
                                rawSyncValueService2.getClass();
                                list.getClass();
                                Object obj = list.get(0);
                                obj.getClass();
                                return rawSyncValueService2.getSyncValues(((Integer) obj).intValue());
                            case 15:
                                RawSyncValueService rawSyncValueService3 = (RawSyncValueService) ziplineService;
                                rawSyncValueService3.getClass();
                                list.getClass();
                                rawSyncValueService3.close();
                                return Unit.INSTANCE;
                            case 16:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.getClass();
                                list.getClass();
                                Object obj2 = list.get(0);
                                obj2.getClass();
                                ByteString byteString = (ByteString) list.get(1);
                                Object obj3 = list.get(2);
                                obj3.getClass();
                                Object call = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService, 0, (String) obj2, byteString, (Navigator) obj3, (HostViewService) list.get(3));
                                call.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call;
                            case 17:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.getClass();
                                list.getClass();
                                Object obj4 = list.get(0);
                                obj4.getClass();
                                ByteString byteString2 = (ByteString) list.get(1);
                                Object obj5 = list.get(2);
                                obj5.getClass();
                                Object call2 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2, 1, (String) obj4, byteString2, (Navigator) obj5);
                                call2.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call2;
                            case 18:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.getClass();
                                list.getClass();
                                Object obj6 = list.get(0);
                                obj6.getClass();
                                Object obj7 = list.get(1);
                                obj7.getClass();
                                Object call3 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3, 2, (String) obj6, (Navigator) obj7);
                                call3.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call3;
                            case 19:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.getClass();
                                list.getClass();
                                Object obj8 = list.get(0);
                                obj8.getClass();
                                Object obj9 = list.get(1);
                                obj9.getClass();
                                Object obj10 = list.get(2);
                                obj10.getClass();
                                Object obj11 = list.get(3);
                                obj11.getClass();
                                Object call4 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4, 3, (BlockerScreenSpec) obj8, (Navigator) obj9, (HostViewService) obj10, (RawFlowService) obj11);
                                call4.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call4;
                            case 20:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.getClass();
                                list.getClass();
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.close();
                                return Unit.INSTANCE;
                            default:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.getClass();
                                list.getClass();
                                Object call5 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6, 5, new Object[0]);
                                call5.getClass();
                                return (AppLifecycle$Companion$Adapter$GeneratedOutboundService) call5;
                        }
                    }
                };
                final List listOf74 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf74.getClass();
                unitSerializer12.getClass();
                final String str23 = "fun close(): kotlin.Unit";
                final int i12 = 12;
                final String str24 = "moYx+T3e";
                return CollectionsKt__CollectionsKt.listOf((Object[]) new ZiplineFunction[]{returningZiplineFunction9, returningZiplineFunction10, new ReturningZiplineFunction(str24, str23, listOf74, unitSerializer12) { // from class: com.squareup.cash.treehouse.sync.RawSyncValueService$Companion$Adapter$ZiplineFunction0
                    @Override // app.cash.zipline.internal.bridge.ReturningZiplineFunction
                    public final Object call(ZiplineService ziplineService, List list) {
                        switch (i12) {
                            case 0:
                                RawSyncValueService rawSyncValueService = (RawSyncValueService) ziplineService;
                                rawSyncValueService.getClass();
                                list.getClass();
                                return rawSyncValueService.encodedAllSyncValues();
                            case 1:
                                RawTreehousePlatform rawTreehousePlatform = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform.getClass();
                                list.getClass();
                                rawTreehousePlatform.close();
                                return Unit.INSTANCE;
                            case 2:
                                RawTreehousePlatform rawTreehousePlatform2 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform2.getClass();
                                list.getClass();
                                return rawTreehousePlatform2.offersRepositoryService();
                            case 3:
                                RawTreehousePlatform rawTreehousePlatform3 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform3.getClass();
                                list.getClass();
                                return rawTreehousePlatform3.rawOfflineActivityService();
                            case 4:
                                RawTreehousePlatform rawTreehousePlatform4 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform4.getClass();
                                list.getClass();
                                return rawTreehousePlatform4.cashHttpClient();
                            case 5:
                                RawTreehousePlatform rawTreehousePlatform5 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform5.getClass();
                                list.getClass();
                                return rawTreehousePlatform5.httpClient();
                            case 6:
                                RawTreehousePlatform rawTreehousePlatform6 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform6.getClass();
                                list.getClass();
                                return rawTreehousePlatform6.prefetchClient();
                            case 7:
                                RawTreehousePlatform rawTreehousePlatform7 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform7.getClass();
                                list.getClass();
                                return rawTreehousePlatform7.rawAnalyticsService();
                            case 8:
                                RawTreehousePlatform rawTreehousePlatform8 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform8.getClass();
                                list.getClass();
                                return rawTreehousePlatform8.rawAppConfigService();
                            case 9:
                                RawTreehousePlatform rawTreehousePlatform9 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform9.getClass();
                                list.getClass();
                                return rawTreehousePlatform9.rawAppMessagingService();
                            case 10:
                                RawPreferencesService rawPreferencesService = (RawPreferencesService) ziplineService;
                                rawPreferencesService.getClass();
                                list.getClass();
                                return rawPreferencesService.displayUnit();
                            case 11:
                                RawPreferencesService rawPreferencesService2 = (RawPreferencesService) ziplineService;
                                rawPreferencesService2.getClass();
                                list.getClass();
                                return rawPreferencesService2.displayUnitFlow();
                            case 12:
                                RawPreferencesService rawPreferencesService3 = (RawPreferencesService) ziplineService;
                                rawPreferencesService3.getClass();
                                list.getClass();
                                rawPreferencesService3.close();
                                return Unit.INSTANCE;
                            case 13:
                                SqlDelightBridge sqlDelightBridge = (SqlDelightBridge) ziplineService;
                                sqlDelightBridge.getClass();
                                list.getClass();
                                sqlDelightBridge.close();
                                return Unit.INSTANCE;
                            case 14:
                                RawSyncValueService rawSyncValueService2 = (RawSyncValueService) ziplineService;
                                rawSyncValueService2.getClass();
                                list.getClass();
                                Object obj = list.get(0);
                                obj.getClass();
                                return rawSyncValueService2.getSyncValues(((Integer) obj).intValue());
                            case 15:
                                RawSyncValueService rawSyncValueService3 = (RawSyncValueService) ziplineService;
                                rawSyncValueService3.getClass();
                                list.getClass();
                                rawSyncValueService3.close();
                                return Unit.INSTANCE;
                            case 16:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.getClass();
                                list.getClass();
                                Object obj2 = list.get(0);
                                obj2.getClass();
                                ByteString byteString = (ByteString) list.get(1);
                                Object obj3 = list.get(2);
                                obj3.getClass();
                                Object call = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService, 0, (String) obj2, byteString, (Navigator) obj3, (HostViewService) list.get(3));
                                call.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call;
                            case 17:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.getClass();
                                list.getClass();
                                Object obj4 = list.get(0);
                                obj4.getClass();
                                ByteString byteString2 = (ByteString) list.get(1);
                                Object obj5 = list.get(2);
                                obj5.getClass();
                                Object call2 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2, 1, (String) obj4, byteString2, (Navigator) obj5);
                                call2.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call2;
                            case 18:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.getClass();
                                list.getClass();
                                Object obj6 = list.get(0);
                                obj6.getClass();
                                Object obj7 = list.get(1);
                                obj7.getClass();
                                Object call3 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3, 2, (String) obj6, (Navigator) obj7);
                                call3.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call3;
                            case 19:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.getClass();
                                list.getClass();
                                Object obj8 = list.get(0);
                                obj8.getClass();
                                Object obj9 = list.get(1);
                                obj9.getClass();
                                Object obj10 = list.get(2);
                                obj10.getClass();
                                Object obj11 = list.get(3);
                                obj11.getClass();
                                Object call4 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4, 3, (BlockerScreenSpec) obj8, (Navigator) obj9, (HostViewService) obj10, (RawFlowService) obj11);
                                call4.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call4;
                            case 20:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.getClass();
                                list.getClass();
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.close();
                                return Unit.INSTANCE;
                            default:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.getClass();
                                list.getClass();
                                Object call5 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6, 5, new Object[0]);
                                call5.getClass();
                                return (AppLifecycle$Companion$Adapter$GeneratedOutboundService) call5;
                        }
                    }
                }});
            case 12:
                serializersModule.getClass();
                StringSerializer stringSerializer5 = StringSerializer.INSTANCE;
                SqlType.Companion companion3 = SqlType.Companion;
                HashSetSerializer hashSetSerializer3 = new HashSetSerializer(BuiltinSerializersKt.getNullable(companion3.serializer()), 1);
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                LongSerializer longSerializer = LongSerializer.INSTANCE;
                List listOf75 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{longSerializer});
                HostService$Companion$Adapter hostService$Companion$Adapter24 = new HostService$Companion$Adapter(ZiplineServiceAdapterKt.serialName("app.cash.zipline.internal.bridge.SuspendCallback", listOf75), listOf75, 12);
                HashSetSerializer hashSetSerializer4 = new HashSetSerializer(new HashSetSerializer(BuiltinSerializersKt.getNullable(companion3.serializer()), 1), 1);
                List listOf76 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{new HashSetSerializer(new HashSetSerializer(BuiltinSerializersKt.getNullable(companion3.serializer()), 1), 1)});
                HostService$Companion$Adapter hostService$Companion$Adapter25 = new HostService$Companion$Adapter(ZiplineServiceAdapterKt.serialName("app.cash.zipline.internal.bridge.SuspendCallback", listOf76), listOf76, 12);
                List listOf77 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{intSerializer});
                HostService$Companion$Adapter hostService$Companion$Adapter26 = new HostService$Companion$Adapter(ZiplineServiceAdapterKt.serialName("app.cash.zipline.internal.bridge.SuspendCallback", listOf77), listOf77, 12);
                final UnitSerializer unitSerializer13 = UnitSerializer.INSTANCE;
                List listOf78 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{unitSerializer13});
                HostService$Companion$Adapter hostService$Companion$Adapter27 = new HostService$Companion$Adapter(ZiplineServiceAdapterKt.serialName("app.cash.zipline.internal.bridge.SuspendCallback", listOf78), listOf78, 12);
                List listOf79 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{stringSerializer5, hashSetSerializer3, intSerializer});
                listOf79.getClass();
                ZiplineFunction0 ziplineFunction015 = new ZiplineFunction0("z2VGCgxx", "suspend fun execute(kotlin.String, kotlin.collections.List<com.squareup.cash.treehouse.sqldelight.SqlType?>, kotlin.Int): kotlin.Long", listOf79, longSerializer, hostService$Companion$Adapter24, 14);
                List listOf80 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{stringSerializer5, hashSetSerializer3, intSerializer});
                listOf80.getClass();
                ZiplineFunction0 ziplineFunction016 = new ZiplineFunction0("c93+NuMj", "suspend fun executeQuery(kotlin.String, kotlin.collections.List<com.squareup.cash.treehouse.sqldelight.SqlType?>, kotlin.Int): kotlin.collections.List<kotlin.collections.List<com.squareup.cash.treehouse.sqldelight.SqlType?>>", listOf80, hashSetSerializer4, hostService$Companion$Adapter25, 15);
                List listOf81 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf81.getClass();
                ZiplineFunction0 ziplineFunction017 = new ZiplineFunction0("akHZqxpu", "suspend fun beginTransaction(): kotlin.Int", listOf81, intSerializer, hostService$Companion$Adapter26, 16);
                List listOf82 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{intSerializer});
                listOf82.getClass();
                unitSerializer13.getClass();
                ZiplineFunction0 ziplineFunction018 = new ZiplineFunction0("2GF1owqV", "suspend fun endTransaction(kotlin.Int): kotlin.Unit", listOf82, unitSerializer13, hostService$Companion$Adapter27, 17);
                List listOf83 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{intSerializer});
                listOf83.getClass();
                ZiplineFunction0 ziplineFunction019 = new ZiplineFunction0("uftUdLz4", "suspend fun rollbackTransaction(kotlin.Int): kotlin.Unit", listOf83, unitSerializer13, hostService$Companion$Adapter27, 18);
                final List listOf84 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf84.getClass();
                final String str25 = "fun close(): kotlin.Unit";
                final int i13 = 13;
                final String str26 = "moYx+T3e";
                return CollectionsKt__CollectionsKt.listOf((Object[]) new ZiplineFunction[]{ziplineFunction015, ziplineFunction016, ziplineFunction017, ziplineFunction018, ziplineFunction019, new ReturningZiplineFunction(str26, str25, listOf84, unitSerializer13) { // from class: com.squareup.cash.treehouse.sync.RawSyncValueService$Companion$Adapter$ZiplineFunction0
                    @Override // app.cash.zipline.internal.bridge.ReturningZiplineFunction
                    public final Object call(ZiplineService ziplineService, List list) {
                        switch (i13) {
                            case 0:
                                RawSyncValueService rawSyncValueService = (RawSyncValueService) ziplineService;
                                rawSyncValueService.getClass();
                                list.getClass();
                                return rawSyncValueService.encodedAllSyncValues();
                            case 1:
                                RawTreehousePlatform rawTreehousePlatform = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform.getClass();
                                list.getClass();
                                rawTreehousePlatform.close();
                                return Unit.INSTANCE;
                            case 2:
                                RawTreehousePlatform rawTreehousePlatform2 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform2.getClass();
                                list.getClass();
                                return rawTreehousePlatform2.offersRepositoryService();
                            case 3:
                                RawTreehousePlatform rawTreehousePlatform3 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform3.getClass();
                                list.getClass();
                                return rawTreehousePlatform3.rawOfflineActivityService();
                            case 4:
                                RawTreehousePlatform rawTreehousePlatform4 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform4.getClass();
                                list.getClass();
                                return rawTreehousePlatform4.cashHttpClient();
                            case 5:
                                RawTreehousePlatform rawTreehousePlatform5 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform5.getClass();
                                list.getClass();
                                return rawTreehousePlatform5.httpClient();
                            case 6:
                                RawTreehousePlatform rawTreehousePlatform6 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform6.getClass();
                                list.getClass();
                                return rawTreehousePlatform6.prefetchClient();
                            case 7:
                                RawTreehousePlatform rawTreehousePlatform7 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform7.getClass();
                                list.getClass();
                                return rawTreehousePlatform7.rawAnalyticsService();
                            case 8:
                                RawTreehousePlatform rawTreehousePlatform8 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform8.getClass();
                                list.getClass();
                                return rawTreehousePlatform8.rawAppConfigService();
                            case 9:
                                RawTreehousePlatform rawTreehousePlatform9 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform9.getClass();
                                list.getClass();
                                return rawTreehousePlatform9.rawAppMessagingService();
                            case 10:
                                RawPreferencesService rawPreferencesService = (RawPreferencesService) ziplineService;
                                rawPreferencesService.getClass();
                                list.getClass();
                                return rawPreferencesService.displayUnit();
                            case 11:
                                RawPreferencesService rawPreferencesService2 = (RawPreferencesService) ziplineService;
                                rawPreferencesService2.getClass();
                                list.getClass();
                                return rawPreferencesService2.displayUnitFlow();
                            case 12:
                                RawPreferencesService rawPreferencesService3 = (RawPreferencesService) ziplineService;
                                rawPreferencesService3.getClass();
                                list.getClass();
                                rawPreferencesService3.close();
                                return Unit.INSTANCE;
                            case 13:
                                SqlDelightBridge sqlDelightBridge = (SqlDelightBridge) ziplineService;
                                sqlDelightBridge.getClass();
                                list.getClass();
                                sqlDelightBridge.close();
                                return Unit.INSTANCE;
                            case 14:
                                RawSyncValueService rawSyncValueService2 = (RawSyncValueService) ziplineService;
                                rawSyncValueService2.getClass();
                                list.getClass();
                                Object obj = list.get(0);
                                obj.getClass();
                                return rawSyncValueService2.getSyncValues(((Integer) obj).intValue());
                            case 15:
                                RawSyncValueService rawSyncValueService3 = (RawSyncValueService) ziplineService;
                                rawSyncValueService3.getClass();
                                list.getClass();
                                rawSyncValueService3.close();
                                return Unit.INSTANCE;
                            case 16:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.getClass();
                                list.getClass();
                                Object obj2 = list.get(0);
                                obj2.getClass();
                                ByteString byteString = (ByteString) list.get(1);
                                Object obj3 = list.get(2);
                                obj3.getClass();
                                Object call = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService, 0, (String) obj2, byteString, (Navigator) obj3, (HostViewService) list.get(3));
                                call.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call;
                            case 17:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.getClass();
                                list.getClass();
                                Object obj4 = list.get(0);
                                obj4.getClass();
                                ByteString byteString2 = (ByteString) list.get(1);
                                Object obj5 = list.get(2);
                                obj5.getClass();
                                Object call2 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2, 1, (String) obj4, byteString2, (Navigator) obj5);
                                call2.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call2;
                            case 18:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.getClass();
                                list.getClass();
                                Object obj6 = list.get(0);
                                obj6.getClass();
                                Object obj7 = list.get(1);
                                obj7.getClass();
                                Object call3 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3, 2, (String) obj6, (Navigator) obj7);
                                call3.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call3;
                            case 19:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.getClass();
                                list.getClass();
                                Object obj8 = list.get(0);
                                obj8.getClass();
                                Object obj9 = list.get(1);
                                obj9.getClass();
                                Object obj10 = list.get(2);
                                obj10.getClass();
                                Object obj11 = list.get(3);
                                obj11.getClass();
                                Object call4 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4, 3, (BlockerScreenSpec) obj8, (Navigator) obj9, (HostViewService) obj10, (RawFlowService) obj11);
                                call4.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call4;
                            case 20:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.getClass();
                                list.getClass();
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.close();
                                return Unit.INSTANCE;
                            default:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.getClass();
                                list.getClass();
                                Object call5 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6, 5, new Object[0]);
                                call5.getClass();
                                return (AppLifecycle$Companion$Adapter$GeneratedOutboundService) call5;
                        }
                    }
                }});
            case 13:
                serializersModule.getClass();
                ReflectionFactory reflectionFactory5 = Reflection.factory;
                final KSerializer requireContextual4 = InternalSerializersKt.requireContextual(serializersModule, reflectionFactory5.getOrCreateKotlinClass(Flow.class), CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{new HashSetSerializer(SerializersKt.noCompiledSerializer(serializersModule, reflectionFactory5.getOrCreateKotlinClass(ByteString.class)), 1)}));
                final UnitSerializer unitSerializer14 = UnitSerializer.INSTANCE;
                final List listOf85 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf85.getClass();
                final String str27 = "fun encodedAllSyncValues(): kotlinx.coroutines.flow.Flow<kotlin.collections.List<okio.ByteString>>";
                final int i14 = 0;
                final String str28 = "sdYNdt8o";
                ReturningZiplineFunction returningZiplineFunction11 = new ReturningZiplineFunction(str28, str27, listOf85, requireContextual4) { // from class: com.squareup.cash.treehouse.sync.RawSyncValueService$Companion$Adapter$ZiplineFunction0
                    @Override // app.cash.zipline.internal.bridge.ReturningZiplineFunction
                    public final Object call(ZiplineService ziplineService, List list) {
                        switch (i14) {
                            case 0:
                                RawSyncValueService rawSyncValueService = (RawSyncValueService) ziplineService;
                                rawSyncValueService.getClass();
                                list.getClass();
                                return rawSyncValueService.encodedAllSyncValues();
                            case 1:
                                RawTreehousePlatform rawTreehousePlatform = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform.getClass();
                                list.getClass();
                                rawTreehousePlatform.close();
                                return Unit.INSTANCE;
                            case 2:
                                RawTreehousePlatform rawTreehousePlatform2 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform2.getClass();
                                list.getClass();
                                return rawTreehousePlatform2.offersRepositoryService();
                            case 3:
                                RawTreehousePlatform rawTreehousePlatform3 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform3.getClass();
                                list.getClass();
                                return rawTreehousePlatform3.rawOfflineActivityService();
                            case 4:
                                RawTreehousePlatform rawTreehousePlatform4 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform4.getClass();
                                list.getClass();
                                return rawTreehousePlatform4.cashHttpClient();
                            case 5:
                                RawTreehousePlatform rawTreehousePlatform5 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform5.getClass();
                                list.getClass();
                                return rawTreehousePlatform5.httpClient();
                            case 6:
                                RawTreehousePlatform rawTreehousePlatform6 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform6.getClass();
                                list.getClass();
                                return rawTreehousePlatform6.prefetchClient();
                            case 7:
                                RawTreehousePlatform rawTreehousePlatform7 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform7.getClass();
                                list.getClass();
                                return rawTreehousePlatform7.rawAnalyticsService();
                            case 8:
                                RawTreehousePlatform rawTreehousePlatform8 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform8.getClass();
                                list.getClass();
                                return rawTreehousePlatform8.rawAppConfigService();
                            case 9:
                                RawTreehousePlatform rawTreehousePlatform9 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform9.getClass();
                                list.getClass();
                                return rawTreehousePlatform9.rawAppMessagingService();
                            case 10:
                                RawPreferencesService rawPreferencesService = (RawPreferencesService) ziplineService;
                                rawPreferencesService.getClass();
                                list.getClass();
                                return rawPreferencesService.displayUnit();
                            case 11:
                                RawPreferencesService rawPreferencesService2 = (RawPreferencesService) ziplineService;
                                rawPreferencesService2.getClass();
                                list.getClass();
                                return rawPreferencesService2.displayUnitFlow();
                            case 12:
                                RawPreferencesService rawPreferencesService3 = (RawPreferencesService) ziplineService;
                                rawPreferencesService3.getClass();
                                list.getClass();
                                rawPreferencesService3.close();
                                return Unit.INSTANCE;
                            case 13:
                                SqlDelightBridge sqlDelightBridge = (SqlDelightBridge) ziplineService;
                                sqlDelightBridge.getClass();
                                list.getClass();
                                sqlDelightBridge.close();
                                return Unit.INSTANCE;
                            case 14:
                                RawSyncValueService rawSyncValueService2 = (RawSyncValueService) ziplineService;
                                rawSyncValueService2.getClass();
                                list.getClass();
                                Object obj = list.get(0);
                                obj.getClass();
                                return rawSyncValueService2.getSyncValues(((Integer) obj).intValue());
                            case 15:
                                RawSyncValueService rawSyncValueService3 = (RawSyncValueService) ziplineService;
                                rawSyncValueService3.getClass();
                                list.getClass();
                                rawSyncValueService3.close();
                                return Unit.INSTANCE;
                            case 16:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.getClass();
                                list.getClass();
                                Object obj2 = list.get(0);
                                obj2.getClass();
                                ByteString byteString = (ByteString) list.get(1);
                                Object obj3 = list.get(2);
                                obj3.getClass();
                                Object call = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService, 0, (String) obj2, byteString, (Navigator) obj3, (HostViewService) list.get(3));
                                call.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call;
                            case 17:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.getClass();
                                list.getClass();
                                Object obj4 = list.get(0);
                                obj4.getClass();
                                ByteString byteString2 = (ByteString) list.get(1);
                                Object obj5 = list.get(2);
                                obj5.getClass();
                                Object call2 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2, 1, (String) obj4, byteString2, (Navigator) obj5);
                                call2.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call2;
                            case 18:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.getClass();
                                list.getClass();
                                Object obj6 = list.get(0);
                                obj6.getClass();
                                Object obj7 = list.get(1);
                                obj7.getClass();
                                Object call3 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3, 2, (String) obj6, (Navigator) obj7);
                                call3.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call3;
                            case 19:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.getClass();
                                list.getClass();
                                Object obj8 = list.get(0);
                                obj8.getClass();
                                Object obj9 = list.get(1);
                                obj9.getClass();
                                Object obj10 = list.get(2);
                                obj10.getClass();
                                Object obj11 = list.get(3);
                                obj11.getClass();
                                Object call4 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4, 3, (BlockerScreenSpec) obj8, (Navigator) obj9, (HostViewService) obj10, (RawFlowService) obj11);
                                call4.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call4;
                            case 20:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.getClass();
                                list.getClass();
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.close();
                                return Unit.INSTANCE;
                            default:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.getClass();
                                list.getClass();
                                Object call5 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6, 5, new Object[0]);
                                call5.getClass();
                                return (AppLifecycle$Companion$Adapter$GeneratedOutboundService) call5;
                        }
                    }
                };
                final List listOf86 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{IntSerializer.INSTANCE});
                listOf86.getClass();
                final String str29 = "fun getSyncValues(kotlin.Int): kotlinx.coroutines.flow.Flow<kotlin.collections.List<okio.ByteString>>";
                final int i15 = 14;
                final String str30 = "bc3s44Yw";
                ReturningZiplineFunction returningZiplineFunction12 = new ReturningZiplineFunction(str30, str29, listOf86, requireContextual4) { // from class: com.squareup.cash.treehouse.sync.RawSyncValueService$Companion$Adapter$ZiplineFunction0
                    @Override // app.cash.zipline.internal.bridge.ReturningZiplineFunction
                    public final Object call(ZiplineService ziplineService, List list) {
                        switch (i15) {
                            case 0:
                                RawSyncValueService rawSyncValueService = (RawSyncValueService) ziplineService;
                                rawSyncValueService.getClass();
                                list.getClass();
                                return rawSyncValueService.encodedAllSyncValues();
                            case 1:
                                RawTreehousePlatform rawTreehousePlatform = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform.getClass();
                                list.getClass();
                                rawTreehousePlatform.close();
                                return Unit.INSTANCE;
                            case 2:
                                RawTreehousePlatform rawTreehousePlatform2 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform2.getClass();
                                list.getClass();
                                return rawTreehousePlatform2.offersRepositoryService();
                            case 3:
                                RawTreehousePlatform rawTreehousePlatform3 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform3.getClass();
                                list.getClass();
                                return rawTreehousePlatform3.rawOfflineActivityService();
                            case 4:
                                RawTreehousePlatform rawTreehousePlatform4 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform4.getClass();
                                list.getClass();
                                return rawTreehousePlatform4.cashHttpClient();
                            case 5:
                                RawTreehousePlatform rawTreehousePlatform5 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform5.getClass();
                                list.getClass();
                                return rawTreehousePlatform5.httpClient();
                            case 6:
                                RawTreehousePlatform rawTreehousePlatform6 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform6.getClass();
                                list.getClass();
                                return rawTreehousePlatform6.prefetchClient();
                            case 7:
                                RawTreehousePlatform rawTreehousePlatform7 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform7.getClass();
                                list.getClass();
                                return rawTreehousePlatform7.rawAnalyticsService();
                            case 8:
                                RawTreehousePlatform rawTreehousePlatform8 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform8.getClass();
                                list.getClass();
                                return rawTreehousePlatform8.rawAppConfigService();
                            case 9:
                                RawTreehousePlatform rawTreehousePlatform9 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform9.getClass();
                                list.getClass();
                                return rawTreehousePlatform9.rawAppMessagingService();
                            case 10:
                                RawPreferencesService rawPreferencesService = (RawPreferencesService) ziplineService;
                                rawPreferencesService.getClass();
                                list.getClass();
                                return rawPreferencesService.displayUnit();
                            case 11:
                                RawPreferencesService rawPreferencesService2 = (RawPreferencesService) ziplineService;
                                rawPreferencesService2.getClass();
                                list.getClass();
                                return rawPreferencesService2.displayUnitFlow();
                            case 12:
                                RawPreferencesService rawPreferencesService3 = (RawPreferencesService) ziplineService;
                                rawPreferencesService3.getClass();
                                list.getClass();
                                rawPreferencesService3.close();
                                return Unit.INSTANCE;
                            case 13:
                                SqlDelightBridge sqlDelightBridge = (SqlDelightBridge) ziplineService;
                                sqlDelightBridge.getClass();
                                list.getClass();
                                sqlDelightBridge.close();
                                return Unit.INSTANCE;
                            case 14:
                                RawSyncValueService rawSyncValueService2 = (RawSyncValueService) ziplineService;
                                rawSyncValueService2.getClass();
                                list.getClass();
                                Object obj = list.get(0);
                                obj.getClass();
                                return rawSyncValueService2.getSyncValues(((Integer) obj).intValue());
                            case 15:
                                RawSyncValueService rawSyncValueService3 = (RawSyncValueService) ziplineService;
                                rawSyncValueService3.getClass();
                                list.getClass();
                                rawSyncValueService3.close();
                                return Unit.INSTANCE;
                            case 16:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.getClass();
                                list.getClass();
                                Object obj2 = list.get(0);
                                obj2.getClass();
                                ByteString byteString = (ByteString) list.get(1);
                                Object obj3 = list.get(2);
                                obj3.getClass();
                                Object call = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService, 0, (String) obj2, byteString, (Navigator) obj3, (HostViewService) list.get(3));
                                call.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call;
                            case 17:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.getClass();
                                list.getClass();
                                Object obj4 = list.get(0);
                                obj4.getClass();
                                ByteString byteString2 = (ByteString) list.get(1);
                                Object obj5 = list.get(2);
                                obj5.getClass();
                                Object call2 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2, 1, (String) obj4, byteString2, (Navigator) obj5);
                                call2.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call2;
                            case 18:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.getClass();
                                list.getClass();
                                Object obj6 = list.get(0);
                                obj6.getClass();
                                Object obj7 = list.get(1);
                                obj7.getClass();
                                Object call3 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3, 2, (String) obj6, (Navigator) obj7);
                                call3.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call3;
                            case 19:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.getClass();
                                list.getClass();
                                Object obj8 = list.get(0);
                                obj8.getClass();
                                Object obj9 = list.get(1);
                                obj9.getClass();
                                Object obj10 = list.get(2);
                                obj10.getClass();
                                Object obj11 = list.get(3);
                                obj11.getClass();
                                Object call4 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4, 3, (BlockerScreenSpec) obj8, (Navigator) obj9, (HostViewService) obj10, (RawFlowService) obj11);
                                call4.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call4;
                            case 20:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.getClass();
                                list.getClass();
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.close();
                                return Unit.INSTANCE;
                            default:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.getClass();
                                list.getClass();
                                Object call5 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6, 5, new Object[0]);
                                call5.getClass();
                                return (AppLifecycle$Companion$Adapter$GeneratedOutboundService) call5;
                        }
                    }
                };
                final List listOf87 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf87.getClass();
                unitSerializer14.getClass();
                final String str31 = "fun close(): kotlin.Unit";
                final int i16 = 15;
                final String str32 = "moYx+T3e";
                return CollectionsKt__CollectionsKt.listOf((Object[]) new ZiplineFunction[]{returningZiplineFunction11, returningZiplineFunction12, new ReturningZiplineFunction(str32, str31, listOf87, unitSerializer14) { // from class: com.squareup.cash.treehouse.sync.RawSyncValueService$Companion$Adapter$ZiplineFunction0
                    @Override // app.cash.zipline.internal.bridge.ReturningZiplineFunction
                    public final Object call(ZiplineService ziplineService, List list) {
                        switch (i16) {
                            case 0:
                                RawSyncValueService rawSyncValueService = (RawSyncValueService) ziplineService;
                                rawSyncValueService.getClass();
                                list.getClass();
                                return rawSyncValueService.encodedAllSyncValues();
                            case 1:
                                RawTreehousePlatform rawTreehousePlatform = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform.getClass();
                                list.getClass();
                                rawTreehousePlatform.close();
                                return Unit.INSTANCE;
                            case 2:
                                RawTreehousePlatform rawTreehousePlatform2 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform2.getClass();
                                list.getClass();
                                return rawTreehousePlatform2.offersRepositoryService();
                            case 3:
                                RawTreehousePlatform rawTreehousePlatform3 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform3.getClass();
                                list.getClass();
                                return rawTreehousePlatform3.rawOfflineActivityService();
                            case 4:
                                RawTreehousePlatform rawTreehousePlatform4 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform4.getClass();
                                list.getClass();
                                return rawTreehousePlatform4.cashHttpClient();
                            case 5:
                                RawTreehousePlatform rawTreehousePlatform5 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform5.getClass();
                                list.getClass();
                                return rawTreehousePlatform5.httpClient();
                            case 6:
                                RawTreehousePlatform rawTreehousePlatform6 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform6.getClass();
                                list.getClass();
                                return rawTreehousePlatform6.prefetchClient();
                            case 7:
                                RawTreehousePlatform rawTreehousePlatform7 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform7.getClass();
                                list.getClass();
                                return rawTreehousePlatform7.rawAnalyticsService();
                            case 8:
                                RawTreehousePlatform rawTreehousePlatform8 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform8.getClass();
                                list.getClass();
                                return rawTreehousePlatform8.rawAppConfigService();
                            case 9:
                                RawTreehousePlatform rawTreehousePlatform9 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform9.getClass();
                                list.getClass();
                                return rawTreehousePlatform9.rawAppMessagingService();
                            case 10:
                                RawPreferencesService rawPreferencesService = (RawPreferencesService) ziplineService;
                                rawPreferencesService.getClass();
                                list.getClass();
                                return rawPreferencesService.displayUnit();
                            case 11:
                                RawPreferencesService rawPreferencesService2 = (RawPreferencesService) ziplineService;
                                rawPreferencesService2.getClass();
                                list.getClass();
                                return rawPreferencesService2.displayUnitFlow();
                            case 12:
                                RawPreferencesService rawPreferencesService3 = (RawPreferencesService) ziplineService;
                                rawPreferencesService3.getClass();
                                list.getClass();
                                rawPreferencesService3.close();
                                return Unit.INSTANCE;
                            case 13:
                                SqlDelightBridge sqlDelightBridge = (SqlDelightBridge) ziplineService;
                                sqlDelightBridge.getClass();
                                list.getClass();
                                sqlDelightBridge.close();
                                return Unit.INSTANCE;
                            case 14:
                                RawSyncValueService rawSyncValueService2 = (RawSyncValueService) ziplineService;
                                rawSyncValueService2.getClass();
                                list.getClass();
                                Object obj = list.get(0);
                                obj.getClass();
                                return rawSyncValueService2.getSyncValues(((Integer) obj).intValue());
                            case 15:
                                RawSyncValueService rawSyncValueService3 = (RawSyncValueService) ziplineService;
                                rawSyncValueService3.getClass();
                                list.getClass();
                                rawSyncValueService3.close();
                                return Unit.INSTANCE;
                            case 16:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.getClass();
                                list.getClass();
                                Object obj2 = list.get(0);
                                obj2.getClass();
                                ByteString byteString = (ByteString) list.get(1);
                                Object obj3 = list.get(2);
                                obj3.getClass();
                                Object call = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService, 0, (String) obj2, byteString, (Navigator) obj3, (HostViewService) list.get(3));
                                call.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call;
                            case 17:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.getClass();
                                list.getClass();
                                Object obj4 = list.get(0);
                                obj4.getClass();
                                ByteString byteString2 = (ByteString) list.get(1);
                                Object obj5 = list.get(2);
                                obj5.getClass();
                                Object call2 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2, 1, (String) obj4, byteString2, (Navigator) obj5);
                                call2.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call2;
                            case 18:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.getClass();
                                list.getClass();
                                Object obj6 = list.get(0);
                                obj6.getClass();
                                Object obj7 = list.get(1);
                                obj7.getClass();
                                Object call3 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3, 2, (String) obj6, (Navigator) obj7);
                                call3.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call3;
                            case 19:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.getClass();
                                list.getClass();
                                Object obj8 = list.get(0);
                                obj8.getClass();
                                Object obj9 = list.get(1);
                                obj9.getClass();
                                Object obj10 = list.get(2);
                                obj10.getClass();
                                Object obj11 = list.get(3);
                                obj11.getClass();
                                Object call4 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4, 3, (BlockerScreenSpec) obj8, (Navigator) obj9, (HostViewService) obj10, (RawFlowService) obj11);
                                call4.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call4;
                            case 20:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.getClass();
                                list.getClass();
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.close();
                                return Unit.INSTANCE;
                            default:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.getClass();
                                list.getClass();
                                Object call5 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6, 5, new Object[0]);
                                call5.getClass();
                                return (AppLifecycle$Companion$Adapter$GeneratedOutboundService) call5;
                        }
                    }
                }});
            default:
                serializersModule.getClass();
                StringSerializer stringSerializer6 = StringSerializer.INSTANCE;
                KSerializer nullable2 = BuiltinSerializersKt.getNullable(SerializersKt.noCompiledSerializer(serializersModule, Reflection.factory.getOrCreateKotlinClass(ByteString.class)));
                HttpClient$Companion$Adapter httpClient$Companion$Adapter11 = new HttpClient$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 7);
                HttpClient$Companion$Adapter httpClient$Companion$Adapter12 = new HttpClient$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), "com.squareup.cash.treehouse.hostview.HostViewService?");
                final HostService$Companion$Adapter hostService$Companion$Adapter28 = new HostService$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 5);
                KSerializer serializer8 = BlockerScreenSpec.Companion.serializer();
                HttpClient$Companion$Adapter httpClient$Companion$Adapter13 = new HttpClient$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), "com.squareup.cash.treehouse.hostview.HostViewService");
                HttpClient$Companion$Adapter httpClient$Companion$Adapter14 = new HttpClient$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 4);
                final UnitSerializer unitSerializer15 = UnitSerializer.INSTANCE;
                final HostService$Companion$Adapter hostService$Companion$Adapter29 = new HostService$Companion$Adapter(CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]), 1);
                final List listOf88 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{stringSerializer6, nullable2, httpClient$Companion$Adapter11, httpClient$Companion$Adapter12});
                listOf88.getClass();
                final String str33 = "fun getScreen(kotlin.String, okio.ByteString?, com.squareup.cash.treehouse.navigation.Navigator, com.squareup.cash.treehouse.hostview.HostViewService?): app.cash.redwood.treehouse.ZiplineTreehouseUi";
                final int i17 = 16;
                final String str34 = "CehtQlMi";
                ReturningZiplineFunction returningZiplineFunction13 = new ReturningZiplineFunction(str34, str33, listOf88, hostService$Companion$Adapter28) { // from class: com.squareup.cash.treehouse.sync.RawSyncValueService$Companion$Adapter$ZiplineFunction0
                    @Override // app.cash.zipline.internal.bridge.ReturningZiplineFunction
                    public final Object call(ZiplineService ziplineService, List list) {
                        switch (i17) {
                            case 0:
                                RawSyncValueService rawSyncValueService = (RawSyncValueService) ziplineService;
                                rawSyncValueService.getClass();
                                list.getClass();
                                return rawSyncValueService.encodedAllSyncValues();
                            case 1:
                                RawTreehousePlatform rawTreehousePlatform = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform.getClass();
                                list.getClass();
                                rawTreehousePlatform.close();
                                return Unit.INSTANCE;
                            case 2:
                                RawTreehousePlatform rawTreehousePlatform2 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform2.getClass();
                                list.getClass();
                                return rawTreehousePlatform2.offersRepositoryService();
                            case 3:
                                RawTreehousePlatform rawTreehousePlatform3 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform3.getClass();
                                list.getClass();
                                return rawTreehousePlatform3.rawOfflineActivityService();
                            case 4:
                                RawTreehousePlatform rawTreehousePlatform4 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform4.getClass();
                                list.getClass();
                                return rawTreehousePlatform4.cashHttpClient();
                            case 5:
                                RawTreehousePlatform rawTreehousePlatform5 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform5.getClass();
                                list.getClass();
                                return rawTreehousePlatform5.httpClient();
                            case 6:
                                RawTreehousePlatform rawTreehousePlatform6 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform6.getClass();
                                list.getClass();
                                return rawTreehousePlatform6.prefetchClient();
                            case 7:
                                RawTreehousePlatform rawTreehousePlatform7 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform7.getClass();
                                list.getClass();
                                return rawTreehousePlatform7.rawAnalyticsService();
                            case 8:
                                RawTreehousePlatform rawTreehousePlatform8 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform8.getClass();
                                list.getClass();
                                return rawTreehousePlatform8.rawAppConfigService();
                            case 9:
                                RawTreehousePlatform rawTreehousePlatform9 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform9.getClass();
                                list.getClass();
                                return rawTreehousePlatform9.rawAppMessagingService();
                            case 10:
                                RawPreferencesService rawPreferencesService = (RawPreferencesService) ziplineService;
                                rawPreferencesService.getClass();
                                list.getClass();
                                return rawPreferencesService.displayUnit();
                            case 11:
                                RawPreferencesService rawPreferencesService2 = (RawPreferencesService) ziplineService;
                                rawPreferencesService2.getClass();
                                list.getClass();
                                return rawPreferencesService2.displayUnitFlow();
                            case 12:
                                RawPreferencesService rawPreferencesService3 = (RawPreferencesService) ziplineService;
                                rawPreferencesService3.getClass();
                                list.getClass();
                                rawPreferencesService3.close();
                                return Unit.INSTANCE;
                            case 13:
                                SqlDelightBridge sqlDelightBridge = (SqlDelightBridge) ziplineService;
                                sqlDelightBridge.getClass();
                                list.getClass();
                                sqlDelightBridge.close();
                                return Unit.INSTANCE;
                            case 14:
                                RawSyncValueService rawSyncValueService2 = (RawSyncValueService) ziplineService;
                                rawSyncValueService2.getClass();
                                list.getClass();
                                Object obj = list.get(0);
                                obj.getClass();
                                return rawSyncValueService2.getSyncValues(((Integer) obj).intValue());
                            case 15:
                                RawSyncValueService rawSyncValueService3 = (RawSyncValueService) ziplineService;
                                rawSyncValueService3.getClass();
                                list.getClass();
                                rawSyncValueService3.close();
                                return Unit.INSTANCE;
                            case 16:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.getClass();
                                list.getClass();
                                Object obj2 = list.get(0);
                                obj2.getClass();
                                ByteString byteString = (ByteString) list.get(1);
                                Object obj3 = list.get(2);
                                obj3.getClass();
                                Object call = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService, 0, (String) obj2, byteString, (Navigator) obj3, (HostViewService) list.get(3));
                                call.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call;
                            case 17:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.getClass();
                                list.getClass();
                                Object obj4 = list.get(0);
                                obj4.getClass();
                                ByteString byteString2 = (ByteString) list.get(1);
                                Object obj5 = list.get(2);
                                obj5.getClass();
                                Object call2 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2, 1, (String) obj4, byteString2, (Navigator) obj5);
                                call2.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call2;
                            case 18:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.getClass();
                                list.getClass();
                                Object obj6 = list.get(0);
                                obj6.getClass();
                                Object obj7 = list.get(1);
                                obj7.getClass();
                                Object call3 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3, 2, (String) obj6, (Navigator) obj7);
                                call3.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call3;
                            case 19:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.getClass();
                                list.getClass();
                                Object obj8 = list.get(0);
                                obj8.getClass();
                                Object obj9 = list.get(1);
                                obj9.getClass();
                                Object obj10 = list.get(2);
                                obj10.getClass();
                                Object obj11 = list.get(3);
                                obj11.getClass();
                                Object call4 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4, 3, (BlockerScreenSpec) obj8, (Navigator) obj9, (HostViewService) obj10, (RawFlowService) obj11);
                                call4.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call4;
                            case 20:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.getClass();
                                list.getClass();
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.close();
                                return Unit.INSTANCE;
                            default:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.getClass();
                                list.getClass();
                                Object call5 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6, 5, new Object[0]);
                                call5.getClass();
                                return (AppLifecycle$Companion$Adapter$GeneratedOutboundService) call5;
                        }
                    }
                };
                final List listOf89 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{stringSerializer6, nullable2, httpClient$Companion$Adapter11});
                listOf89.getClass();
                final String str35 = "fun getScreen(kotlin.String, okio.ByteString?, com.squareup.cash.treehouse.navigation.Navigator): app.cash.redwood.treehouse.ZiplineTreehouseUi";
                final int i18 = 17;
                final String str36 = "Z1+i8LQU";
                ReturningZiplineFunction returningZiplineFunction14 = new ReturningZiplineFunction(str36, str35, listOf89, hostService$Companion$Adapter28) { // from class: com.squareup.cash.treehouse.sync.RawSyncValueService$Companion$Adapter$ZiplineFunction0
                    @Override // app.cash.zipline.internal.bridge.ReturningZiplineFunction
                    public final Object call(ZiplineService ziplineService, List list) {
                        switch (i18) {
                            case 0:
                                RawSyncValueService rawSyncValueService = (RawSyncValueService) ziplineService;
                                rawSyncValueService.getClass();
                                list.getClass();
                                return rawSyncValueService.encodedAllSyncValues();
                            case 1:
                                RawTreehousePlatform rawTreehousePlatform = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform.getClass();
                                list.getClass();
                                rawTreehousePlatform.close();
                                return Unit.INSTANCE;
                            case 2:
                                RawTreehousePlatform rawTreehousePlatform2 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform2.getClass();
                                list.getClass();
                                return rawTreehousePlatform2.offersRepositoryService();
                            case 3:
                                RawTreehousePlatform rawTreehousePlatform3 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform3.getClass();
                                list.getClass();
                                return rawTreehousePlatform3.rawOfflineActivityService();
                            case 4:
                                RawTreehousePlatform rawTreehousePlatform4 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform4.getClass();
                                list.getClass();
                                return rawTreehousePlatform4.cashHttpClient();
                            case 5:
                                RawTreehousePlatform rawTreehousePlatform5 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform5.getClass();
                                list.getClass();
                                return rawTreehousePlatform5.httpClient();
                            case 6:
                                RawTreehousePlatform rawTreehousePlatform6 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform6.getClass();
                                list.getClass();
                                return rawTreehousePlatform6.prefetchClient();
                            case 7:
                                RawTreehousePlatform rawTreehousePlatform7 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform7.getClass();
                                list.getClass();
                                return rawTreehousePlatform7.rawAnalyticsService();
                            case 8:
                                RawTreehousePlatform rawTreehousePlatform8 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform8.getClass();
                                list.getClass();
                                return rawTreehousePlatform8.rawAppConfigService();
                            case 9:
                                RawTreehousePlatform rawTreehousePlatform9 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform9.getClass();
                                list.getClass();
                                return rawTreehousePlatform9.rawAppMessagingService();
                            case 10:
                                RawPreferencesService rawPreferencesService = (RawPreferencesService) ziplineService;
                                rawPreferencesService.getClass();
                                list.getClass();
                                return rawPreferencesService.displayUnit();
                            case 11:
                                RawPreferencesService rawPreferencesService2 = (RawPreferencesService) ziplineService;
                                rawPreferencesService2.getClass();
                                list.getClass();
                                return rawPreferencesService2.displayUnitFlow();
                            case 12:
                                RawPreferencesService rawPreferencesService3 = (RawPreferencesService) ziplineService;
                                rawPreferencesService3.getClass();
                                list.getClass();
                                rawPreferencesService3.close();
                                return Unit.INSTANCE;
                            case 13:
                                SqlDelightBridge sqlDelightBridge = (SqlDelightBridge) ziplineService;
                                sqlDelightBridge.getClass();
                                list.getClass();
                                sqlDelightBridge.close();
                                return Unit.INSTANCE;
                            case 14:
                                RawSyncValueService rawSyncValueService2 = (RawSyncValueService) ziplineService;
                                rawSyncValueService2.getClass();
                                list.getClass();
                                Object obj = list.get(0);
                                obj.getClass();
                                return rawSyncValueService2.getSyncValues(((Integer) obj).intValue());
                            case 15:
                                RawSyncValueService rawSyncValueService3 = (RawSyncValueService) ziplineService;
                                rawSyncValueService3.getClass();
                                list.getClass();
                                rawSyncValueService3.close();
                                return Unit.INSTANCE;
                            case 16:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.getClass();
                                list.getClass();
                                Object obj2 = list.get(0);
                                obj2.getClass();
                                ByteString byteString = (ByteString) list.get(1);
                                Object obj3 = list.get(2);
                                obj3.getClass();
                                Object call = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService, 0, (String) obj2, byteString, (Navigator) obj3, (HostViewService) list.get(3));
                                call.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call;
                            case 17:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.getClass();
                                list.getClass();
                                Object obj4 = list.get(0);
                                obj4.getClass();
                                ByteString byteString2 = (ByteString) list.get(1);
                                Object obj5 = list.get(2);
                                obj5.getClass();
                                Object call2 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2, 1, (String) obj4, byteString2, (Navigator) obj5);
                                call2.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call2;
                            case 18:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.getClass();
                                list.getClass();
                                Object obj6 = list.get(0);
                                obj6.getClass();
                                Object obj7 = list.get(1);
                                obj7.getClass();
                                Object call3 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3, 2, (String) obj6, (Navigator) obj7);
                                call3.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call3;
                            case 19:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.getClass();
                                list.getClass();
                                Object obj8 = list.get(0);
                                obj8.getClass();
                                Object obj9 = list.get(1);
                                obj9.getClass();
                                Object obj10 = list.get(2);
                                obj10.getClass();
                                Object obj11 = list.get(3);
                                obj11.getClass();
                                Object call4 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4, 3, (BlockerScreenSpec) obj8, (Navigator) obj9, (HostViewService) obj10, (RawFlowService) obj11);
                                call4.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call4;
                            case 20:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.getClass();
                                list.getClass();
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.close();
                                return Unit.INSTANCE;
                            default:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.getClass();
                                list.getClass();
                                Object call5 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6, 5, new Object[0]);
                                call5.getClass();
                                return (AppLifecycle$Companion$Adapter$GeneratedOutboundService) call5;
                        }
                    }
                };
                final List listOf90 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{stringSerializer6, httpClient$Companion$Adapter11});
                listOf90.getClass();
                final String str37 = "fun getScreen(kotlin.String, com.squareup.cash.treehouse.navigation.Navigator): app.cash.redwood.treehouse.ZiplineTreehouseUi";
                final int i19 = 18;
                final String str38 = "q4hLmO4y";
                ReturningZiplineFunction returningZiplineFunction15 = new ReturningZiplineFunction(str38, str37, listOf90, hostService$Companion$Adapter28) { // from class: com.squareup.cash.treehouse.sync.RawSyncValueService$Companion$Adapter$ZiplineFunction0
                    @Override // app.cash.zipline.internal.bridge.ReturningZiplineFunction
                    public final Object call(ZiplineService ziplineService, List list) {
                        switch (i19) {
                            case 0:
                                RawSyncValueService rawSyncValueService = (RawSyncValueService) ziplineService;
                                rawSyncValueService.getClass();
                                list.getClass();
                                return rawSyncValueService.encodedAllSyncValues();
                            case 1:
                                RawTreehousePlatform rawTreehousePlatform = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform.getClass();
                                list.getClass();
                                rawTreehousePlatform.close();
                                return Unit.INSTANCE;
                            case 2:
                                RawTreehousePlatform rawTreehousePlatform2 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform2.getClass();
                                list.getClass();
                                return rawTreehousePlatform2.offersRepositoryService();
                            case 3:
                                RawTreehousePlatform rawTreehousePlatform3 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform3.getClass();
                                list.getClass();
                                return rawTreehousePlatform3.rawOfflineActivityService();
                            case 4:
                                RawTreehousePlatform rawTreehousePlatform4 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform4.getClass();
                                list.getClass();
                                return rawTreehousePlatform4.cashHttpClient();
                            case 5:
                                RawTreehousePlatform rawTreehousePlatform5 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform5.getClass();
                                list.getClass();
                                return rawTreehousePlatform5.httpClient();
                            case 6:
                                RawTreehousePlatform rawTreehousePlatform6 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform6.getClass();
                                list.getClass();
                                return rawTreehousePlatform6.prefetchClient();
                            case 7:
                                RawTreehousePlatform rawTreehousePlatform7 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform7.getClass();
                                list.getClass();
                                return rawTreehousePlatform7.rawAnalyticsService();
                            case 8:
                                RawTreehousePlatform rawTreehousePlatform8 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform8.getClass();
                                list.getClass();
                                return rawTreehousePlatform8.rawAppConfigService();
                            case 9:
                                RawTreehousePlatform rawTreehousePlatform9 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform9.getClass();
                                list.getClass();
                                return rawTreehousePlatform9.rawAppMessagingService();
                            case 10:
                                RawPreferencesService rawPreferencesService = (RawPreferencesService) ziplineService;
                                rawPreferencesService.getClass();
                                list.getClass();
                                return rawPreferencesService.displayUnit();
                            case 11:
                                RawPreferencesService rawPreferencesService2 = (RawPreferencesService) ziplineService;
                                rawPreferencesService2.getClass();
                                list.getClass();
                                return rawPreferencesService2.displayUnitFlow();
                            case 12:
                                RawPreferencesService rawPreferencesService3 = (RawPreferencesService) ziplineService;
                                rawPreferencesService3.getClass();
                                list.getClass();
                                rawPreferencesService3.close();
                                return Unit.INSTANCE;
                            case 13:
                                SqlDelightBridge sqlDelightBridge = (SqlDelightBridge) ziplineService;
                                sqlDelightBridge.getClass();
                                list.getClass();
                                sqlDelightBridge.close();
                                return Unit.INSTANCE;
                            case 14:
                                RawSyncValueService rawSyncValueService2 = (RawSyncValueService) ziplineService;
                                rawSyncValueService2.getClass();
                                list.getClass();
                                Object obj = list.get(0);
                                obj.getClass();
                                return rawSyncValueService2.getSyncValues(((Integer) obj).intValue());
                            case 15:
                                RawSyncValueService rawSyncValueService3 = (RawSyncValueService) ziplineService;
                                rawSyncValueService3.getClass();
                                list.getClass();
                                rawSyncValueService3.close();
                                return Unit.INSTANCE;
                            case 16:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.getClass();
                                list.getClass();
                                Object obj2 = list.get(0);
                                obj2.getClass();
                                ByteString byteString = (ByteString) list.get(1);
                                Object obj3 = list.get(2);
                                obj3.getClass();
                                Object call = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService, 0, (String) obj2, byteString, (Navigator) obj3, (HostViewService) list.get(3));
                                call.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call;
                            case 17:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.getClass();
                                list.getClass();
                                Object obj4 = list.get(0);
                                obj4.getClass();
                                ByteString byteString2 = (ByteString) list.get(1);
                                Object obj5 = list.get(2);
                                obj5.getClass();
                                Object call2 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2, 1, (String) obj4, byteString2, (Navigator) obj5);
                                call2.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call2;
                            case 18:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.getClass();
                                list.getClass();
                                Object obj6 = list.get(0);
                                obj6.getClass();
                                Object obj7 = list.get(1);
                                obj7.getClass();
                                Object call3 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3, 2, (String) obj6, (Navigator) obj7);
                                call3.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call3;
                            case 19:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.getClass();
                                list.getClass();
                                Object obj8 = list.get(0);
                                obj8.getClass();
                                Object obj9 = list.get(1);
                                obj9.getClass();
                                Object obj10 = list.get(2);
                                obj10.getClass();
                                Object obj11 = list.get(3);
                                obj11.getClass();
                                Object call4 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4, 3, (BlockerScreenSpec) obj8, (Navigator) obj9, (HostViewService) obj10, (RawFlowService) obj11);
                                call4.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call4;
                            case 20:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.getClass();
                                list.getClass();
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.close();
                                return Unit.INSTANCE;
                            default:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.getClass();
                                list.getClass();
                                Object call5 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6, 5, new Object[0]);
                                call5.getClass();
                                return (AppLifecycle$Companion$Adapter$GeneratedOutboundService) call5;
                        }
                    }
                };
                final List listOf91 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[]{serializer8, httpClient$Companion$Adapter11, httpClient$Companion$Adapter13, httpClient$Companion$Adapter14});
                listOf91.getClass();
                final String str39 = "fun getBlockerScreen(com.squareup.cash.treehouse.flows.BlockerScreenSpec, com.squareup.cash.treehouse.navigation.Navigator, com.squareup.cash.treehouse.hostview.HostViewService, com.squareup.cash.treehouse.flows.RawFlowService): app.cash.redwood.treehouse.ZiplineTreehouseUi";
                final int i20 = 19;
                final String str40 = "IfZr//Ck";
                ReturningZiplineFunction returningZiplineFunction16 = new ReturningZiplineFunction(str40, str39, listOf91, hostService$Companion$Adapter28) { // from class: com.squareup.cash.treehouse.sync.RawSyncValueService$Companion$Adapter$ZiplineFunction0
                    @Override // app.cash.zipline.internal.bridge.ReturningZiplineFunction
                    public final Object call(ZiplineService ziplineService, List list) {
                        switch (i20) {
                            case 0:
                                RawSyncValueService rawSyncValueService = (RawSyncValueService) ziplineService;
                                rawSyncValueService.getClass();
                                list.getClass();
                                return rawSyncValueService.encodedAllSyncValues();
                            case 1:
                                RawTreehousePlatform rawTreehousePlatform = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform.getClass();
                                list.getClass();
                                rawTreehousePlatform.close();
                                return Unit.INSTANCE;
                            case 2:
                                RawTreehousePlatform rawTreehousePlatform2 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform2.getClass();
                                list.getClass();
                                return rawTreehousePlatform2.offersRepositoryService();
                            case 3:
                                RawTreehousePlatform rawTreehousePlatform3 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform3.getClass();
                                list.getClass();
                                return rawTreehousePlatform3.rawOfflineActivityService();
                            case 4:
                                RawTreehousePlatform rawTreehousePlatform4 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform4.getClass();
                                list.getClass();
                                return rawTreehousePlatform4.cashHttpClient();
                            case 5:
                                RawTreehousePlatform rawTreehousePlatform5 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform5.getClass();
                                list.getClass();
                                return rawTreehousePlatform5.httpClient();
                            case 6:
                                RawTreehousePlatform rawTreehousePlatform6 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform6.getClass();
                                list.getClass();
                                return rawTreehousePlatform6.prefetchClient();
                            case 7:
                                RawTreehousePlatform rawTreehousePlatform7 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform7.getClass();
                                list.getClass();
                                return rawTreehousePlatform7.rawAnalyticsService();
                            case 8:
                                RawTreehousePlatform rawTreehousePlatform8 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform8.getClass();
                                list.getClass();
                                return rawTreehousePlatform8.rawAppConfigService();
                            case 9:
                                RawTreehousePlatform rawTreehousePlatform9 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform9.getClass();
                                list.getClass();
                                return rawTreehousePlatform9.rawAppMessagingService();
                            case 10:
                                RawPreferencesService rawPreferencesService = (RawPreferencesService) ziplineService;
                                rawPreferencesService.getClass();
                                list.getClass();
                                return rawPreferencesService.displayUnit();
                            case 11:
                                RawPreferencesService rawPreferencesService2 = (RawPreferencesService) ziplineService;
                                rawPreferencesService2.getClass();
                                list.getClass();
                                return rawPreferencesService2.displayUnitFlow();
                            case 12:
                                RawPreferencesService rawPreferencesService3 = (RawPreferencesService) ziplineService;
                                rawPreferencesService3.getClass();
                                list.getClass();
                                rawPreferencesService3.close();
                                return Unit.INSTANCE;
                            case 13:
                                SqlDelightBridge sqlDelightBridge = (SqlDelightBridge) ziplineService;
                                sqlDelightBridge.getClass();
                                list.getClass();
                                sqlDelightBridge.close();
                                return Unit.INSTANCE;
                            case 14:
                                RawSyncValueService rawSyncValueService2 = (RawSyncValueService) ziplineService;
                                rawSyncValueService2.getClass();
                                list.getClass();
                                Object obj = list.get(0);
                                obj.getClass();
                                return rawSyncValueService2.getSyncValues(((Integer) obj).intValue());
                            case 15:
                                RawSyncValueService rawSyncValueService3 = (RawSyncValueService) ziplineService;
                                rawSyncValueService3.getClass();
                                list.getClass();
                                rawSyncValueService3.close();
                                return Unit.INSTANCE;
                            case 16:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.getClass();
                                list.getClass();
                                Object obj2 = list.get(0);
                                obj2.getClass();
                                ByteString byteString = (ByteString) list.get(1);
                                Object obj3 = list.get(2);
                                obj3.getClass();
                                Object call = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService, 0, (String) obj2, byteString, (Navigator) obj3, (HostViewService) list.get(3));
                                call.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call;
                            case 17:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.getClass();
                                list.getClass();
                                Object obj4 = list.get(0);
                                obj4.getClass();
                                ByteString byteString2 = (ByteString) list.get(1);
                                Object obj5 = list.get(2);
                                obj5.getClass();
                                Object call2 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2, 1, (String) obj4, byteString2, (Navigator) obj5);
                                call2.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call2;
                            case 18:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.getClass();
                                list.getClass();
                                Object obj6 = list.get(0);
                                obj6.getClass();
                                Object obj7 = list.get(1);
                                obj7.getClass();
                                Object call3 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3, 2, (String) obj6, (Navigator) obj7);
                                call3.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call3;
                            case 19:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.getClass();
                                list.getClass();
                                Object obj8 = list.get(0);
                                obj8.getClass();
                                Object obj9 = list.get(1);
                                obj9.getClass();
                                Object obj10 = list.get(2);
                                obj10.getClass();
                                Object obj11 = list.get(3);
                                obj11.getClass();
                                Object call4 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4, 3, (BlockerScreenSpec) obj8, (Navigator) obj9, (HostViewService) obj10, (RawFlowService) obj11);
                                call4.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call4;
                            case 20:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.getClass();
                                list.getClass();
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.close();
                                return Unit.INSTANCE;
                            default:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.getClass();
                                list.getClass();
                                Object call5 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6, 5, new Object[0]);
                                call5.getClass();
                                return (AppLifecycle$Companion$Adapter$GeneratedOutboundService) call5;
                        }
                    }
                };
                final List listOf92 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf92.getClass();
                unitSerializer15.getClass();
                final String str41 = "fun close(): kotlin.Unit";
                final int i21 = 20;
                final String str42 = "moYx+T3e";
                ReturningZiplineFunction returningZiplineFunction17 = new ReturningZiplineFunction(str42, str41, listOf92, unitSerializer15) { // from class: com.squareup.cash.treehouse.sync.RawSyncValueService$Companion$Adapter$ZiplineFunction0
                    @Override // app.cash.zipline.internal.bridge.ReturningZiplineFunction
                    public final Object call(ZiplineService ziplineService, List list) {
                        switch (i21) {
                            case 0:
                                RawSyncValueService rawSyncValueService = (RawSyncValueService) ziplineService;
                                rawSyncValueService.getClass();
                                list.getClass();
                                return rawSyncValueService.encodedAllSyncValues();
                            case 1:
                                RawTreehousePlatform rawTreehousePlatform = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform.getClass();
                                list.getClass();
                                rawTreehousePlatform.close();
                                return Unit.INSTANCE;
                            case 2:
                                RawTreehousePlatform rawTreehousePlatform2 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform2.getClass();
                                list.getClass();
                                return rawTreehousePlatform2.offersRepositoryService();
                            case 3:
                                RawTreehousePlatform rawTreehousePlatform3 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform3.getClass();
                                list.getClass();
                                return rawTreehousePlatform3.rawOfflineActivityService();
                            case 4:
                                RawTreehousePlatform rawTreehousePlatform4 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform4.getClass();
                                list.getClass();
                                return rawTreehousePlatform4.cashHttpClient();
                            case 5:
                                RawTreehousePlatform rawTreehousePlatform5 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform5.getClass();
                                list.getClass();
                                return rawTreehousePlatform5.httpClient();
                            case 6:
                                RawTreehousePlatform rawTreehousePlatform6 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform6.getClass();
                                list.getClass();
                                return rawTreehousePlatform6.prefetchClient();
                            case 7:
                                RawTreehousePlatform rawTreehousePlatform7 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform7.getClass();
                                list.getClass();
                                return rawTreehousePlatform7.rawAnalyticsService();
                            case 8:
                                RawTreehousePlatform rawTreehousePlatform8 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform8.getClass();
                                list.getClass();
                                return rawTreehousePlatform8.rawAppConfigService();
                            case 9:
                                RawTreehousePlatform rawTreehousePlatform9 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform9.getClass();
                                list.getClass();
                                return rawTreehousePlatform9.rawAppMessagingService();
                            case 10:
                                RawPreferencesService rawPreferencesService = (RawPreferencesService) ziplineService;
                                rawPreferencesService.getClass();
                                list.getClass();
                                return rawPreferencesService.displayUnit();
                            case 11:
                                RawPreferencesService rawPreferencesService2 = (RawPreferencesService) ziplineService;
                                rawPreferencesService2.getClass();
                                list.getClass();
                                return rawPreferencesService2.displayUnitFlow();
                            case 12:
                                RawPreferencesService rawPreferencesService3 = (RawPreferencesService) ziplineService;
                                rawPreferencesService3.getClass();
                                list.getClass();
                                rawPreferencesService3.close();
                                return Unit.INSTANCE;
                            case 13:
                                SqlDelightBridge sqlDelightBridge = (SqlDelightBridge) ziplineService;
                                sqlDelightBridge.getClass();
                                list.getClass();
                                sqlDelightBridge.close();
                                return Unit.INSTANCE;
                            case 14:
                                RawSyncValueService rawSyncValueService2 = (RawSyncValueService) ziplineService;
                                rawSyncValueService2.getClass();
                                list.getClass();
                                Object obj = list.get(0);
                                obj.getClass();
                                return rawSyncValueService2.getSyncValues(((Integer) obj).intValue());
                            case 15:
                                RawSyncValueService rawSyncValueService3 = (RawSyncValueService) ziplineService;
                                rawSyncValueService3.getClass();
                                list.getClass();
                                rawSyncValueService3.close();
                                return Unit.INSTANCE;
                            case 16:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.getClass();
                                list.getClass();
                                Object obj2 = list.get(0);
                                obj2.getClass();
                                ByteString byteString = (ByteString) list.get(1);
                                Object obj3 = list.get(2);
                                obj3.getClass();
                                Object call = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService, 0, (String) obj2, byteString, (Navigator) obj3, (HostViewService) list.get(3));
                                call.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call;
                            case 17:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.getClass();
                                list.getClass();
                                Object obj4 = list.get(0);
                                obj4.getClass();
                                ByteString byteString2 = (ByteString) list.get(1);
                                Object obj5 = list.get(2);
                                obj5.getClass();
                                Object call2 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2, 1, (String) obj4, byteString2, (Navigator) obj5);
                                call2.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call2;
                            case 18:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.getClass();
                                list.getClass();
                                Object obj6 = list.get(0);
                                obj6.getClass();
                                Object obj7 = list.get(1);
                                obj7.getClass();
                                Object call3 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3, 2, (String) obj6, (Navigator) obj7);
                                call3.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call3;
                            case 19:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.getClass();
                                list.getClass();
                                Object obj8 = list.get(0);
                                obj8.getClass();
                                Object obj9 = list.get(1);
                                obj9.getClass();
                                Object obj10 = list.get(2);
                                obj10.getClass();
                                Object obj11 = list.get(3);
                                obj11.getClass();
                                Object call4 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4, 3, (BlockerScreenSpec) obj8, (Navigator) obj9, (HostViewService) obj10, (RawFlowService) obj11);
                                call4.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call4;
                            case 20:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.getClass();
                                list.getClass();
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.close();
                                return Unit.INSTANCE;
                            default:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.getClass();
                                list.getClass();
                                Object call5 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6, 5, new Object[0]);
                                call5.getClass();
                                return (AppLifecycle$Companion$Adapter$GeneratedOutboundService) call5;
                        }
                    }
                };
                final List listOf93 = CollectionsKt__CollectionsKt.listOf((Object[]) new KSerializer[0]);
                listOf93.getClass();
                final String str43 = "val appLifecycle: app.cash.redwood.treehouse.AppLifecycle";
                final int i22 = 21;
                final String str44 = "odhmO/d6";
                return CollectionsKt__CollectionsKt.listOf((Object[]) new ZiplineFunction[]{returningZiplineFunction13, returningZiplineFunction14, returningZiplineFunction15, returningZiplineFunction16, returningZiplineFunction17, new ReturningZiplineFunction(str44, str43, listOf93, hostService$Companion$Adapter29) { // from class: com.squareup.cash.treehouse.sync.RawSyncValueService$Companion$Adapter$ZiplineFunction0
                    @Override // app.cash.zipline.internal.bridge.ReturningZiplineFunction
                    public final Object call(ZiplineService ziplineService, List list) {
                        switch (i22) {
                            case 0:
                                RawSyncValueService rawSyncValueService = (RawSyncValueService) ziplineService;
                                rawSyncValueService.getClass();
                                list.getClass();
                                return rawSyncValueService.encodedAllSyncValues();
                            case 1:
                                RawTreehousePlatform rawTreehousePlatform = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform.getClass();
                                list.getClass();
                                rawTreehousePlatform.close();
                                return Unit.INSTANCE;
                            case 2:
                                RawTreehousePlatform rawTreehousePlatform2 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform2.getClass();
                                list.getClass();
                                return rawTreehousePlatform2.offersRepositoryService();
                            case 3:
                                RawTreehousePlatform rawTreehousePlatform3 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform3.getClass();
                                list.getClass();
                                return rawTreehousePlatform3.rawOfflineActivityService();
                            case 4:
                                RawTreehousePlatform rawTreehousePlatform4 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform4.getClass();
                                list.getClass();
                                return rawTreehousePlatform4.cashHttpClient();
                            case 5:
                                RawTreehousePlatform rawTreehousePlatform5 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform5.getClass();
                                list.getClass();
                                return rawTreehousePlatform5.httpClient();
                            case 6:
                                RawTreehousePlatform rawTreehousePlatform6 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform6.getClass();
                                list.getClass();
                                return rawTreehousePlatform6.prefetchClient();
                            case 7:
                                RawTreehousePlatform rawTreehousePlatform7 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform7.getClass();
                                list.getClass();
                                return rawTreehousePlatform7.rawAnalyticsService();
                            case 8:
                                RawTreehousePlatform rawTreehousePlatform8 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform8.getClass();
                                list.getClass();
                                return rawTreehousePlatform8.rawAppConfigService();
                            case 9:
                                RawTreehousePlatform rawTreehousePlatform9 = (RawTreehousePlatform) ziplineService;
                                rawTreehousePlatform9.getClass();
                                list.getClass();
                                return rawTreehousePlatform9.rawAppMessagingService();
                            case 10:
                                RawPreferencesService rawPreferencesService = (RawPreferencesService) ziplineService;
                                rawPreferencesService.getClass();
                                list.getClass();
                                return rawPreferencesService.displayUnit();
                            case 11:
                                RawPreferencesService rawPreferencesService2 = (RawPreferencesService) ziplineService;
                                rawPreferencesService2.getClass();
                                list.getClass();
                                return rawPreferencesService2.displayUnitFlow();
                            case 12:
                                RawPreferencesService rawPreferencesService3 = (RawPreferencesService) ziplineService;
                                rawPreferencesService3.getClass();
                                list.getClass();
                                rawPreferencesService3.close();
                                return Unit.INSTANCE;
                            case 13:
                                SqlDelightBridge sqlDelightBridge = (SqlDelightBridge) ziplineService;
                                sqlDelightBridge.getClass();
                                list.getClass();
                                sqlDelightBridge.close();
                                return Unit.INSTANCE;
                            case 14:
                                RawSyncValueService rawSyncValueService2 = (RawSyncValueService) ziplineService;
                                rawSyncValueService2.getClass();
                                list.getClass();
                                Object obj = list.get(0);
                                obj.getClass();
                                return rawSyncValueService2.getSyncValues(((Integer) obj).intValue());
                            case 15:
                                RawSyncValueService rawSyncValueService3 = (RawSyncValueService) ziplineService;
                                rawSyncValueService3.getClass();
                                list.getClass();
                                rawSyncValueService3.close();
                                return Unit.INSTANCE;
                            case 16:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.getClass();
                                list.getClass();
                                Object obj2 = list.get(0);
                                obj2.getClass();
                                ByteString byteString = (ByteString) list.get(1);
                                Object obj3 = list.get(2);
                                obj3.getClass();
                                Object call = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService, 0, (String) obj2, byteString, (Navigator) obj3, (HostViewService) list.get(3));
                                call.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call;
                            case 17:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.getClass();
                                list.getClass();
                                Object obj4 = list.get(0);
                                obj4.getClass();
                                ByteString byteString2 = (ByteString) list.get(1);
                                Object obj5 = list.get(2);
                                obj5.getClass();
                                Object call2 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2, 1, (String) obj4, byteString2, (Navigator) obj5);
                                call2.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call2;
                            case 18:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.getClass();
                                list.getClass();
                                Object obj6 = list.get(0);
                                obj6.getClass();
                                Object obj7 = list.get(1);
                                obj7.getClass();
                                Object call3 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService3, 2, (String) obj6, (Navigator) obj7);
                                call3.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call3;
                            case 19:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.getClass();
                                list.getClass();
                                Object obj8 = list.get(0);
                                obj8.getClass();
                                Object obj9 = list.get(1);
                                obj9.getClass();
                                Object obj10 = list.get(2);
                                obj10.getClass();
                                Object obj11 = list.get(3);
                                obj11.getClass();
                                Object call4 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService4, 3, (BlockerScreenSpec) obj8, (Navigator) obj9, (HostViewService) obj10, (RawFlowService) obj11);
                                call4.getClass();
                                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call4;
                            case 20:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.getClass();
                                list.getClass();
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService5.close();
                                return Unit.INSTANCE;
                            default:
                                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) ziplineService;
                                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.getClass();
                                list.getClass();
                                Object call5 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService6, 5, new Object[0]);
                                call5.getClass();
                                return (AppLifecycle$Companion$Adapter$GeneratedOutboundService) call5;
                        }
                    }
                }});
        }
    }

    public HttpClient$Companion$Adapter(List list, String str) {
        this.$r8$classId = 5;
        list.getClass();
        this.serialName = str;
        this.simpleName = "HostViewService";
        this.serializers = list;
    }
}
