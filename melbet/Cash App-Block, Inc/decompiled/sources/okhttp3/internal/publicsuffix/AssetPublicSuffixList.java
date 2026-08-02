package okhttp3.internal.publicsuffix;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import android.widget.ImageView;
import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.TransactorKt;
import androidx.viewbinding.ViewBindings;
import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.request.ErrorResult;
import coil3.request.ImageRequest;
import coil3.request.SuccessResult;
import coil3.size.DimensionKt;
import com.google.android.gms.dynamic.zae;
import com.squareup.cash.R;
import com.squareup.cash.account.navigation.RealAccountInboundNavigator;
import com.squareup.cash.account.navigation.RealAccountInboundNavigator$Factory$Impl;
import com.squareup.cash.bitcoin.formatter.RealBitcoinFormatter;
import com.squareup.cash.bitcoin.screens.SendStablecoinScreen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.crypto.ContentType;
import com.squareup.cash.cdf.crypto.CryptoSendScanQr;
import com.squareup.cash.cdf.crypto.CryptoSendStart;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clipboard.RealClipboardObserver;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.address.RealCryptoInvoiceParser;
import com.squareup.cash.crypto.backend.profile.RealBitcoinProfileRepo;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.crypto.navigation.CryptoPayment;
import com.squareup.cash.crypto.navigation.CryptoPaymentSource;
import com.squareup.cash.crypto.navigation.RealCryptoFlowStarter;
import com.squareup.cash.crypto.primitives.CryptoPaymentOrigin;
import com.squareup.cash.featureflags.AmplitudeExperiments$BitcoinStablecoinMvp;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.globalsearch.presenters.RealGlobalSearchInboundNavigator$Factory$Impl;
import com.squareup.cash.history.navigation.RealActivityInboundNavigator$Factory$Impl;
import com.squareup.cash.history.presenters.RealActivityInvitePresenter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.keystore.AttestedKeyService;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.moneybot.presenters.RealMoneybotInboundNavigator$Factory$Impl;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import com.squareup.cash.multiplatform.bitcoin.parsers.solana.SolanaAddress;
import com.squareup.cash.multiplatform.bitcoin.parsers.solana.SolanaAddressParser;
import com.squareup.cash.payments.backend.api.PaymentLinkRepository$CreatePaymentLinkResult;
import com.squareup.cash.payments.backend.real.RealPaymentLinkRepository$createPaymentLink$1;
import com.squareup.cash.payments.presenters.CryptoPaymentManager;
import com.squareup.cash.payments.presenters.MainPaymentPresenter$models$4$4;
import com.squareup.cash.payments.presenters.RealStablecoinPaymentManager$WhenMappings;
import com.squareup.cash.payments.presenters.RealStablecoinPaymentManager$parseInvoice$1;
import com.squareup.cash.payments.screens.PaymentConfigurationFlow;
import com.squareup.cash.payments.screens.PaymentFlowData;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.qrcodes.presenters.RealQrCodesHandler$QrCodeResult;
import com.squareup.cash.qrcodes.presenters.RealQrCodesHandler$handle$1;
import com.squareup.cash.qrcodes.presenters.RealQrCodesHandler$handleCryptoInvoice$1;
import com.squareup.cash.qrcodes.presenters.RealQrCodesHandler$parseQrCode$1;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.storage.AndroidFileSaver$save$2;
import com.squareup.cash.support.chat.views.transcript.message.ImagePlaceholderView;
import com.squareup.cash.support.chat.views.transcript.message.MessageBodyLayout;
import com.squareup.cash.taptopay.backend.api.EmvAlertType;
import com.squareup.cash.taptopay.backend.api.EmvCardStatus;
import com.squareup.cash.taptopay.backend.api.EmvPaymentResult;
import com.squareup.cash.taptopay.backend.real.RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0;
import com.squareup.cash.timestampformatter.api.TimestampFormatter$DisplayContext;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.work.data.real.RealShiftDataFetcher$fetchSchedules$1;
import com.squareup.cash.work.data.real.RealShiftDataFetcher$fetchSchedules$2;
import com.squareup.cash.work.data.real.RealShiftDataFetcher$fetchTimecards$1;
import com.squareup.cash.work.data.real.RealShiftDataFetcher$fetchTimecards$2;
import com.squareup.cash.work.data.real.RealTeamMemberIdProvider;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.service.api.SquareMerchantToken;
import com.squareup.cash.work.service.api.scheduling.SchedulingService;
import com.squareup.cash.work.service.api.timecards.TimecardsService;
import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.cash.work.session.RealSelectedMerchantProvider;
import com.squareup.cash.work.session.SquareAccountStore$userFlow$$inlined$map$1;
import com.squareup.cash.work.tinygraph.models.Location;
import com.squareup.cash.work.tinygraph.real.RealLocationRepository;
import com.squareup.ecr.EmbeddedCardReaderEventHandler;
import com.squareup.kotterknife.Lazy;
import com.squareup.protos.cash.fiatly.api.v2.P2pCreatePaymentLinkFlowParameters;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.time.YearMonthDay;
import com.squareup.protos.franklin.api.Transfer;
import com.squareup.protos.franklin.app.AppCreationActivity;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.GetFlowRequest;
import com.squareup.protos.franklin.app.GetFlowResponse;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.protos.timecards.LocalDateRange;
import com.squareup.protos.timecards.MerchantEmployeeRequestFilter;
import com.squareup.protos.timecards.OvertimeReportByTimecardForEmployeeResponse;
import com.squareup.protos.timecards.ShiftOptions;
import com.squareup.protos.timecards.SimpleTimeWorkedCalculationRequest;
import com.squareup.protos.timecards.SimpleTimeWorkedCalculationRequest$TimeRange$LocalDateRange;
import com.squareup.protos.timecards.Timecard;
import com.squareup.protos.timecards.scheduling.GetShiftSchedulesRequest;
import com.squareup.protos.timecards.scheduling.GetShiftSchedulesResponse;
import com.squareup.protos.timecards.scheduling.OpenShiftsFilter;
import com.squareup.protos.wire.roster.mds.Unit;
import com.squareup.workflow1.ui.ViewShowRenderingKt;
import com.withpersona.sdk2.camera.CameraXController_Factory;
import com.withpersona.sdk2.inquiry.document.DocumentCameraWorker_Factory;
import com.withpersona.sdk2.inquiry.internal.DaggerInquiryComponent$InquiryComponentImpl;
import com.withpersona.sdk2.inquiry.internal.InquiryActivityModule_ContextFactory;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.StaticTemplateSession_Factory;
import com.withpersona.sdk2.inquiry.logger.Logger_Factory;
import com.withpersona.sdk2.inquiry.nfc.C0351ScanNfcWorker_Factory;
import com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.shared.di.BaseDaggerFragment;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiController;
import com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper_Factory;
import com.withpersona.sdk2.inquiry.ui.CreateReusablePersonaWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.ui.VerifyReusablePersonaWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager_Factory_Impl;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepViewModel_Factory;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepViewModel_Factory_Impl;
import dagger.android.AndroidInjector;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.internal.DoubleCheck;
import java.io.InputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyKt;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import kotlin.text.StringsKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import okhttp3.internal.platform.Android10Platform;
import okhttp3.internal.platform.Platform;
import okio.ByteString;
import okio.InputStreamSource;
import okio.Okio;
import okio.RealBufferedSource;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class AssetPublicSuffixList implements CryptoPaymentManager, ImageRequest.Listener, EmbeddedCardReaderEventHandler, AndroidInjector {
    public Object bytes;
    public Object exceptionBytes;
    public final Object listRead;
    public final Object path;
    public final Object readCompleteLatch;
    public Object readFailure;

    public AssetPublicSuffixList(DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl) {
        this.listRead = daggerInquiryComponent$InquiryComponentImpl;
        this.readCompleteLatch = InstanceFactory.create(new ScanNfcWorker_Factory_Impl(new C0351ScanNfcWorker_Factory(daggerInquiryComponent$InquiryComponentImpl.passportNfcReaderLauncherProvider, daggerInquiryComponent$InquiryComponentImpl.contextProvider, daggerInquiryComponent$InquiryComponentImpl.sandboxFlagsProvider, daggerInquiryComponent$InquiryComponentImpl.provideSdkFilesManagerProvider)));
        this.bytes = InstanceFactory.create(new CreateReusablePersonaWorker_Factory_Impl(new CameraXController_Factory(daggerInquiryComponent$InquiryComponentImpl.uiServiceProvider, daggerInquiryComponent$InquiryComponentImpl.deviceIdProvider, daggerInquiryComponent$InquiryComponentImpl.customTabsLauncherProvider)));
        this.exceptionBytes = InstanceFactory.create(new VerifyReusablePersonaWorker_Factory_Impl(new CameraXController_Factory(daggerInquiryComponent$InquiryComponentImpl.customTabsLauncherProvider, daggerInquiryComponent$InquiryComponentImpl.uiServiceProvider, daggerInquiryComponent$InquiryComponentImpl.moshiProvider)));
        Provider provider = daggerInquiryComponent$InquiryComponentImpl.uiServiceProvider;
        Logger_Factory logger_Factory = new Logger_Factory(provider, 22);
        Logger_Factory logger_Factory2 = new Logger_Factory(provider, 23);
        Provider provider2 = daggerInquiryComponent$InquiryComponentImpl.openDocumentsResultLauncherProvider;
        Provider provider3 = daggerInquiryComponent$InquiryComponentImpl.openDocumentResultLauncherProvider;
        InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory = daggerInquiryComponent$InquiryComponentImpl.contextProvider;
        this.readFailure = new ComponentWorkHelper_Factory(inquiryActivityModule_ContextFactory, logger_Factory, logger_Factory2, new DocumentCameraWorker_Factory(provider2, provider3, inquiryActivityModule_ContextFactory, 20), 1);
        this.path = InstanceFactory.create(new UiStepViewModel_Factory_Impl(new UiStepViewModel_Factory(InstanceFactory.create(new UiStepStateManager_Factory_Impl(new StuckPlayerDetector(daggerInquiryComponent$InquiryComponentImpl.contextProvider, (InstanceFactory) this.readCompleteLatch, (InstanceFactory) this.bytes, (InstanceFactory) this.exceptionBytes, daggerInquiryComponent$InquiryComponentImpl.navigationStateManagerProvider, (ComponentWorkHelper_Factory) this.readFailure, daggerInquiryComponent$InquiryComponentImpl.externalEventLoggerProvider, daggerInquiryComponent$InquiryComponentImpl.featureFlagManagerProvider, daggerInquiryComponent$InquiryComponentImpl.trackingEventsLoggerProvider, InstanceFactory.create(new PermissionRequestWorker_Factory_Impl(new StaticTemplateSession_Factory(daggerInquiryComponent$InquiryComponentImpl.permissionsHelperProvider))), 15))))));
    }

    public static String formatDate$default(AssetPublicSuffixList assetPublicSuffixList, Instant instant, int i) {
        boolean z = (i & 2) == 0;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        TimestampFormatter$DisplayContext timestampFormatter$DisplayContext = (TimestampFormatter$DisplayContext) assetPublicSuffixList.readFailure;
        instant.getClass();
        Instant ofEpochMilli = Instant.ofEpochMilli(((AndroidClock) assetPublicSuffixList.readCompleteLatch).millis());
        ZoneId zoneId = (ZoneId) assetPublicSuffixList.path;
        ZonedDateTime ofInstant = ZonedDateTime.ofInstant(ofEpochMilli, zoneId);
        ofInstant.getClass();
        ZonedDateTime of = ZonedDateTime.of(ofInstant.toLocalDate(), LocalTime.MIDNIGHT, ofInstant.getZone());
        of.getClass();
        ZonedDateTime ofInstant2 = ZonedDateTime.ofInstant(instant, zoneId);
        if (ofInstant2.isBefore(of.minusYears(1L))) {
            return formatDate$default(assetPublicSuffixList, ofInstant2, z, false, z3, 2);
        }
        if (ofInstant2.isBefore(of.minusDays(6L))) {
            return formatDate$default(assetPublicSuffixList, ofInstant2, z, z2, false, 4);
        }
        if (ofInstant2.isBefore(of.minusDays(1L))) {
            String displayName = ofInstant2.getDayOfWeek().getDisplayName(TextStyle.FULL, (Locale) assetPublicSuffixList.exceptionBytes);
            displayName.getClass();
            return displayName;
        }
        boolean isBefore = ofInstant2.isBefore(of);
        AndroidStringManager androidStringManager = (AndroidStringManager) assetPublicSuffixList.listRead;
        if (isBefore) {
            int ordinal = timestampFormatter$DisplayContext.ordinal();
            if (ordinal == 0) {
                return androidStringManager.get(R.string.timestamp_formatter_yesterday_standalone);
            }
            if (ordinal == 1) {
                return androidStringManager.get(R.string.timestamp_formatter_yesterday_in_phrase);
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        int ordinal2 = timestampFormatter$DisplayContext.ordinal();
        if (ordinal2 == 0) {
            return androidStringManager.get(R.string.timestamp_formatter_today_standalone);
        }
        if (ordinal2 == 1) {
            return androidStringManager.get(R.string.timestamp_formatter_today_in_phrase);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static PaymentScreens.PaymentConfiguration stablecoinQrScanPaymentConfigurationScreen(String str) {
        return new PaymentScreens.PaymentConfiguration((UUID) null, new Money((Long) 0L, (CurrencyCode) null, 6), Orientation.CASH, PaymentScreens$HomeScreens$Home.INSTANCE, AppCreationActivity.IN_APP_SCANNER, (String) null, (String) null, (String) null, new PaymentConfigurationFlow.StablecoinQrScanFlow(new PaymentFlowData.StablecoinQrScanFlowData(str)), (BlockersData.MoneybotContext) null, 1476);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createPaymentLink(Money money, String str, ContinuationImpl continuationImpl) {
        RealPaymentLinkRepository$createPaymentLink$1 realPaymentLinkRepository$createPaymentLink$1;
        int i;
        ApiResult apiResult;
        String str2;
        if (continuationImpl instanceof RealPaymentLinkRepository$createPaymentLink$1) {
            realPaymentLinkRepository$createPaymentLink$1 = (RealPaymentLinkRepository$createPaymentLink$1) continuationImpl;
            int i2 = realPaymentLinkRepository$createPaymentLink$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPaymentLinkRepository$createPaymentLink$1.label = i2 - PKIFailureInfo.systemUnavail;
                RealPaymentLinkRepository$createPaymentLink$1 realPaymentLinkRepository$createPaymentLink$12 = realPaymentLinkRepository$createPaymentLink$1;
                Object obj = realPaymentLinkRepository$createPaymentLink$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPaymentLinkRepository$createPaymentLink$12.label;
                Object[] objArr = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService = (AppService) this.listRead;
                    GetFlowRequest getFlowRequest = new GetFlowRequest((RequestContext) (objArr == true ? 1 : 0), (GetFlowRequest.Input) new GetFlowRequest.Input.InitiationData(ViewBindings.buildInitiationData(Flow$Type.P2P_CREATE_PAYMENT_LINK, new P2pCreatePaymentLinkFlowParameters(money, str, null, null, null, ByteString.EMPTY))), 5);
                    realPaymentLinkRepository$createPaymentLink$12.label = 1;
                    obj = appService.getFlow("/2.0/cash/get-flow", null, null, getFlowRequest, realPaymentLinkRepository$createPaymentLink$12);
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
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    GetFlowResponse getFlowResponse = (GetFlowResponse) ((ApiResult.Success) apiResult).response;
                    ResponseContext responseContext = getFlowResponse.response_context;
                    responseContext.getClass();
                    ScenarioPlan scenarioPlan = responseContext.scenario_plan;
                    List<BlockerDescriptor> list = scenarioPlan != null ? scenarioPlan.blocker_descriptors : null;
                    if (list != null && !list.isEmpty()) {
                        return new PaymentLinkRepository$CreatePaymentLinkResult.HasBlockers(getFlowResponse);
                    }
                    StatusResult statusResult = responseContext.status_result;
                    if (statusResult != null && (str2 = statusResult.redirect_uri) != null) {
                        ClientRoute parse = ((RealClientRouteParser) this.readCompleteLatch).parse(str2);
                        ClientRoute.ViewRequestWithOptions viewRequestWithOptions = parse instanceof ClientRoute.ViewRequestWithOptions ? (ClientRoute.ViewRequestWithOptions) parse : null;
                        if (viewRequestWithOptions != null) {
                            String str3 = viewRequestWithOptions.link;
                            if (!StringsKt.isBlank(str3)) {
                                return new PaymentLinkRepository$CreatePaymentLinkResult.LinkCreated(str3);
                            }
                        }
                    }
                } else if (!(apiResult instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return PaymentLinkRepository$CreatePaymentLinkResult.Failed.INSTANCE;
            }
        }
        realPaymentLinkRepository$createPaymentLink$1 = new RealPaymentLinkRepository$createPaymentLink$1(this, continuationImpl);
        RealPaymentLinkRepository$createPaymentLink$1 realPaymentLinkRepository$createPaymentLink$122 = realPaymentLinkRepository$createPaymentLink$1;
        Object obj2 = realPaymentLinkRepository$createPaymentLink$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPaymentLinkRepository$createPaymentLink$122.label;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return PaymentLinkRepository$CreatePaymentLinkResult.Failed.INSTANCE;
    }

    @Override // com.squareup.ecr.EmbeddedCardReaderEventHandler
    public void deactivateCard() {
        ((RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0) this.readCompleteLatch).invoke(EmvCardStatus.DEACTIVATED);
    }

    @Override // com.squareup.ecr.EmbeddedCardReaderEventHandler
    public void declinePayment() {
        List list;
        RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0 realEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0 = (RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0) this.exceptionBytes;
        Lazy lazy = (Lazy) this.path;
        synchronized (lazy.value) {
            list = CollectionsKt.toList((ArrayDeque) lazy.initializer);
            ((ArrayDeque) lazy.initializer).clear();
        }
        realEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0.invoke(new EmvPaymentResult.PaymentDeclined(CollectionsKt.joinToString$default(list, null, null, null, 0, null, null, 63)));
    }

    @Override // com.squareup.ecr.EmbeddedCardReaderEventHandler
    public void detectCard() {
        ((RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0) this.readCompleteLatch).invoke(EmvCardStatus.DETECTED);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00c5 -> B:10:0x0036). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchSchedules(ClosedRange closedRange, String str, String str2, ContinuationImpl continuationImpl) {
        RealShiftDataFetcher$fetchSchedules$2 realShiftDataFetcher$fetchSchedules$2;
        int i;
        String format2;
        List arrayList;
        RealShiftDataFetcher$fetchSchedules$2 realShiftDataFetcher$fetchSchedules$22;
        String str3;
        String str4;
        String str5;
        String str6;
        Object scheduleList;
        if (continuationImpl instanceof RealShiftDataFetcher$fetchSchedules$2) {
            realShiftDataFetcher$fetchSchedules$2 = (RealShiftDataFetcher$fetchSchedules$2) continuationImpl;
            int i2 = realShiftDataFetcher$fetchSchedules$2.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realShiftDataFetcher$fetchSchedules$2.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realShiftDataFetcher$fetchSchedules$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realShiftDataFetcher$fetchSchedules$2.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalDateTime atStartOfDay = ((LocalDate) closedRange.getStart()).atStartOfDay();
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
                    String format3 = atStartOfDay.format(dateTimeFormatter);
                    format2 = ((LocalDate) closedRange.getEndInclusive()).plusDays(1L).atStartOfDay().format(dateTimeFormatter);
                    arrayList = new ArrayList();
                    realShiftDataFetcher$fetchSchedules$22 = realShiftDataFetcher$fetchSchedules$2;
                    str3 = format3;
                    str4 = str2;
                    str5 = str;
                    str6 = null;
                    Transfer.Builder builder = new Transfer.Builder(17);
                    List listOf = CollectionsKt__CollectionsJVMKt.listOf(str4);
                    listOf.getClass();
                    TransactorKt.checkElementsNotNull(listOf);
                    builder.target = listOf;
                    builder.amount = str3;
                    builder.push_amount = format2;
                    builder.failed_at = ((AndroidClock) this.listRead).timeZone().toZoneId().getId();
                    builder.completed_at = OpenShiftsFilter.EXCLUDE;
                    builder.created_at = str6;
                    GetShiftSchedulesRequest build = builder.build();
                    SchedulingService schedulingService = (SchedulingService) this.readCompleteLatch;
                    SquareMerchantToken squareMerchantToken = new SquareMerchantToken(str5);
                    realShiftDataFetcher$fetchSchedules$22.L$1 = str5;
                    realShiftDataFetcher$fetchSchedules$22.L$2 = str4;
                    realShiftDataFetcher$fetchSchedules$22.L$3 = str3;
                    realShiftDataFetcher$fetchSchedules$22.L$4 = format2;
                    realShiftDataFetcher$fetchSchedules$22.L$5 = arrayList;
                    realShiftDataFetcher$fetchSchedules$22.label = 1;
                    scheduleList = schedulingService.getScheduleList(build, squareMerchantToken, realShiftDataFetcher$fetchSchedules$22);
                    if (scheduleList != coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = realShiftDataFetcher$fetchSchedules$2.L$5;
                    format2 = realShiftDataFetcher$fetchSchedules$2.L$4;
                    String str7 = realShiftDataFetcher$fetchSchedules$2.L$3;
                    String str8 = realShiftDataFetcher$fetchSchedules$2.L$2;
                    String str9 = realShiftDataFetcher$fetchSchedules$2.L$1;
                    SafeTrace.throwOnFailure(obj);
                    RealShiftDataFetcher$fetchSchedules$2 realShiftDataFetcher$fetchSchedules$23 = realShiftDataFetcher$fetchSchedules$2;
                    str3 = str7;
                    str5 = str9;
                    RealShiftDataFetcher$fetchSchedules$2 realShiftDataFetcher$fetchSchedules$24 = realShiftDataFetcher$fetchSchedules$23;
                    ApiResult apiResult = (ApiResult) obj;
                    if (apiResult instanceof ApiResult.Failure) {
                        Timber.Forest.w("Failed to fetch schedules: " + ((ApiResult.Failure) apiResult), new Object[0]);
                    }
                    GetShiftSchedulesResponse getShiftSchedulesResponse = (GetShiftSchedulesResponse) (!(apiResult instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult).response : null);
                    if (getShiftSchedulesResponse == null) {
                        CollectionsKt__MutableCollectionsKt.addAll(getShiftSchedulesResponse.shift_schedules, arrayList);
                        String str10 = getShiftSchedulesResponse.cursor;
                        if (str10 == null) {
                            return arrayList;
                        }
                        str6 = str10;
                        str4 = str8;
                        realShiftDataFetcher$fetchSchedules$22 = realShiftDataFetcher$fetchSchedules$24;
                        Transfer.Builder builder2 = new Transfer.Builder(17);
                        List listOf2 = CollectionsKt__CollectionsJVMKt.listOf(str4);
                        listOf2.getClass();
                        TransactorKt.checkElementsNotNull(listOf2);
                        builder2.target = listOf2;
                        builder2.amount = str3;
                        builder2.push_amount = format2;
                        builder2.failed_at = ((AndroidClock) this.listRead).timeZone().toZoneId().getId();
                        builder2.completed_at = OpenShiftsFilter.EXCLUDE;
                        builder2.created_at = str6;
                        GetShiftSchedulesRequest build2 = builder2.build();
                        SchedulingService schedulingService2 = (SchedulingService) this.readCompleteLatch;
                        SquareMerchantToken squareMerchantToken2 = new SquareMerchantToken(str5);
                        realShiftDataFetcher$fetchSchedules$22.L$1 = str5;
                        realShiftDataFetcher$fetchSchedules$22.L$2 = str4;
                        realShiftDataFetcher$fetchSchedules$22.L$3 = str3;
                        realShiftDataFetcher$fetchSchedules$22.L$4 = format2;
                        realShiftDataFetcher$fetchSchedules$22.L$5 = arrayList;
                        realShiftDataFetcher$fetchSchedules$22.label = 1;
                        scheduleList = schedulingService2.getScheduleList(build2, squareMerchantToken2, realShiftDataFetcher$fetchSchedules$22);
                        if (scheduleList != coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        realShiftDataFetcher$fetchSchedules$23 = realShiftDataFetcher$fetchSchedules$22;
                        str8 = str4;
                        obj = scheduleList;
                        RealShiftDataFetcher$fetchSchedules$2 realShiftDataFetcher$fetchSchedules$242 = realShiftDataFetcher$fetchSchedules$23;
                        ApiResult apiResult2 = (ApiResult) obj;
                        if (apiResult2 instanceof ApiResult.Failure) {
                        }
                        GetShiftSchedulesResponse getShiftSchedulesResponse2 = (GetShiftSchedulesResponse) (!(apiResult2 instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult2).response : null);
                        if (getShiftSchedulesResponse2 == null) {
                            a$$ExternalSyntheticBUOutline0.m$4("Failed to fetch schedules");
                            return null;
                        }
                    }
                }
            }
        }
        realShiftDataFetcher$fetchSchedules$2 = new RealShiftDataFetcher$fetchSchedules$2(this, continuationImpl);
        Object obj2 = realShiftDataFetcher$fetchSchedules$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realShiftDataFetcher$fetchSchedules$2.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0073, code lost:
    
        if (r11 == r0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010f A[LOOP:0: B:15:0x0109->B:17:0x010f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable fetchTimecards(ClosedRange closedRange, ContinuationImpl continuationImpl) {
        RealShiftDataFetcher$fetchTimecards$1 realShiftDataFetcher$fetchTimecards$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object first;
        MerchantIdentifier merchantIdentifier;
        Object first2;
        String str;
        ClosedRange closedRange2;
        Iterator it;
        AssetPublicSuffixList assetPublicSuffixList;
        Iterator it2;
        if (continuationImpl instanceof RealShiftDataFetcher$fetchTimecards$1) {
            realShiftDataFetcher$fetchTimecards$1 = (RealShiftDataFetcher$fetchTimecards$1) continuationImpl;
            int i2 = realShiftDataFetcher$fetchTimecards$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realShiftDataFetcher$fetchTimecards$1.label = i2 - PKIFailureInfo.systemUnavail;
                RealShiftDataFetcher$fetchTimecards$1 realShiftDataFetcher$fetchTimecards$12 = realShiftDataFetcher$fetchTimecards$1;
                Object obj = realShiftDataFetcher$fetchTimecards$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realShiftDataFetcher$fetchTimecards$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realShiftDataFetcher$fetchTimecards$12.L$0 = closedRange;
                    realShiftDataFetcher$fetchTimecards$12.label = 1;
                    obj = FlowKt.first(new SquareAccountStore$userFlow$$inlined$map$1(((RealSelectedMerchantProvider) this.exceptionBytes).getMerchantIdentifierFlow(), 12), realShiftDataFetcher$fetchTimecards$12);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            MerchantIdentifier merchantIdentifier2 = realShiftDataFetcher$fetchTimecards$12.L$1;
                            ClosedRange closedRange3 = realShiftDataFetcher$fetchTimecards$12.L$0;
                            SafeTrace.throwOnFailure(obj);
                            merchantIdentifier = merchantIdentifier2;
                            closedRange = closedRange3;
                            String str2 = (String) obj;
                            ChannelFlowTransformLatest allByMerchantId$default = RealLocationRepository.getAllByMerchantId$default((RealLocationRepository) this.path, merchantIdentifier.entityId);
                            realShiftDataFetcher$fetchTimecards$12.L$0 = closedRange;
                            realShiftDataFetcher$fetchTimecards$12.L$1 = merchantIdentifier;
                            realShiftDataFetcher$fetchTimecards$12.L$2 = str2;
                            realShiftDataFetcher$fetchTimecards$12.label = 3;
                            first2 = FlowKt.first(allByMerchantId$default, realShiftDataFetcher$fetchTimecards$12);
                            if (first2 != coroutineSingletons) {
                                str = str2;
                                obj = first2;
                                closedRange2 = closedRange;
                                ArrayList arrayList = new ArrayList();
                                it = ((List) obj).iterator();
                                while (it.hasNext()) {
                                }
                                String str3 = merchantIdentifier.token;
                                realShiftDataFetcher$fetchTimecards$12.L$0 = null;
                                realShiftDataFetcher$fetchTimecards$12.L$1 = null;
                                realShiftDataFetcher$fetchTimecards$12.L$2 = null;
                                realShiftDataFetcher$fetchTimecards$12.L$5 = this;
                                realShiftDataFetcher$fetchTimecards$12.label = 4;
                                obj = fetchTimecards(closedRange2, str3, str, arrayList, realShiftDataFetcher$fetchTimecards$12);
                                if (obj != coroutineSingletons) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            assetPublicSuffixList = realShiftDataFetcher$fetchTimecards$12.L$5;
                            SafeTrace.throwOnFailure(obj);
                            assetPublicSuffixList.getClass();
                            List list = ((OvertimeReportByTimecardForEmployeeResponse) obj).by_employees;
                            ArrayList arrayList2 = new ArrayList();
                            it2 = list.iterator();
                            while (it2.hasNext()) {
                                CollectionsKt__MutableCollectionsKt.addAll(((OvertimeReportByTimecardForEmployeeResponse.ByEmployee) it2.next()).by_timecards, arrayList2);
                            }
                            return arrayList2;
                        }
                        String str4 = realShiftDataFetcher$fetchTimecards$12.L$2;
                        merchantIdentifier = realShiftDataFetcher$fetchTimecards$12.L$1;
                        closedRange2 = realShiftDataFetcher$fetchTimecards$12.L$0;
                        SafeTrace.throwOnFailure(obj);
                        str = str4;
                        ArrayList arrayList3 = new ArrayList();
                        it = ((List) obj).iterator();
                        while (it.hasNext()) {
                            Unit protoModel = ((Location) it.next()).getProtoModel();
                            String str5 = protoModel != null ? protoModel.token : null;
                            if (str5 != null) {
                                arrayList3.add(str5);
                            }
                        }
                        String str32 = merchantIdentifier.token;
                        realShiftDataFetcher$fetchTimecards$12.L$0 = null;
                        realShiftDataFetcher$fetchTimecards$12.L$1 = null;
                        realShiftDataFetcher$fetchTimecards$12.L$2 = null;
                        realShiftDataFetcher$fetchTimecards$12.L$5 = this;
                        realShiftDataFetcher$fetchTimecards$12.label = 4;
                        obj = fetchTimecards(closedRange2, str32, str, arrayList3, realShiftDataFetcher$fetchTimecards$12);
                        if (obj != coroutineSingletons) {
                            assetPublicSuffixList = this;
                            assetPublicSuffixList.getClass();
                            List list2 = ((OvertimeReportByTimecardForEmployeeResponse) obj).by_employees;
                            ArrayList arrayList22 = new ArrayList();
                            it2 = list2.iterator();
                            while (it2.hasNext()) {
                            }
                            return arrayList22;
                        }
                        return coroutineSingletons;
                    }
                    closedRange = realShiftDataFetcher$fetchTimecards$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                MerchantIdentifier merchantIdentifier3 = (MerchantIdentifier) obj;
                realShiftDataFetcher$fetchTimecards$12.L$0 = closedRange;
                realShiftDataFetcher$fetchTimecards$12.L$1 = merchantIdentifier3;
                realShiftDataFetcher$fetchTimecards$12.label = 2;
                first = FlowKt.first(new SquareAccountStore$userFlow$$inlined$map$1(((RealTeamMemberIdProvider) this.readFailure).getTeamMemberId(), 13), realShiftDataFetcher$fetchTimecards$12);
                if (first != coroutineSingletons) {
                    merchantIdentifier = merchantIdentifier3;
                    obj = first;
                    String str22 = (String) obj;
                    ChannelFlowTransformLatest allByMerchantId$default2 = RealLocationRepository.getAllByMerchantId$default((RealLocationRepository) this.path, merchantIdentifier.entityId);
                    realShiftDataFetcher$fetchTimecards$12.L$0 = closedRange;
                    realShiftDataFetcher$fetchTimecards$12.L$1 = merchantIdentifier;
                    realShiftDataFetcher$fetchTimecards$12.L$2 = str22;
                    realShiftDataFetcher$fetchTimecards$12.label = 3;
                    first2 = FlowKt.first(allByMerchantId$default2, realShiftDataFetcher$fetchTimecards$12);
                    if (first2 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        realShiftDataFetcher$fetchTimecards$1 = new RealShiftDataFetcher$fetchTimecards$1(this, continuationImpl);
        RealShiftDataFetcher$fetchTimecards$1 realShiftDataFetcher$fetchTimecards$122 = realShiftDataFetcher$fetchTimecards$1;
        Object obj2 = realShiftDataFetcher$fetchTimecards$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realShiftDataFetcher$fetchTimecards$122.label;
        if (i != 0) {
        }
        MerchantIdentifier merchantIdentifier32 = (MerchantIdentifier) obj2;
        realShiftDataFetcher$fetchTimecards$122.L$0 = closedRange;
        realShiftDataFetcher$fetchTimecards$122.L$1 = merchantIdentifier32;
        realShiftDataFetcher$fetchTimecards$122.label = 2;
        first = FlowKt.first(new SquareAccountStore$userFlow$$inlined$map$1(((RealTeamMemberIdProvider) this.readFailure).getTeamMemberId(), 13), realShiftDataFetcher$fetchTimecards$122);
        if (first != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public String formatTime(Instant instant) {
        instant.getClass();
        String format2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale((Locale) this.exceptionBytes).format(ZonedDateTime.ofInstant(instant, (ZoneId) this.path));
        format2.getClass();
        return format2;
    }

    @Override // com.squareup.ecr.EmbeddedCardReaderEventHandler
    public void generateRandomNumber(int i) {
        byte[] byteArray = new BigInteger(i * 8, new Random()).toByteArray();
        RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0 realEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0 = (RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0) this.listRead;
        byteArray.getClass();
        realEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0.invoke(byteArray);
    }

    @Override // com.squareup.cash.payments.presenters.CryptoPaymentManager
    public RealBitcoinFormatter getBitcoinFormatter() {
        return (RealBitcoinFormatter) this.readFailure;
    }

    @Override // com.squareup.cash.payments.presenters.CryptoPaymentManager
    public Flow getClipboardRecipient(CryptoPaymentOrigin cryptoPaymentOrigin) {
        return new RealActivityInvitePresenter(26, ((RealClipboardObserver) this.exceptionBytes).observeClipboard(), this, cryptoPaymentOrigin);
    }

    @Override // com.squareup.cash.payments.presenters.CryptoPaymentManager
    public DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 getDisplayUnits() {
        return (DataStoreImpl$data$1$invokeSuspend$$inlined$map$1) this.path;
    }

    @Override // com.squareup.cash.payments.presenters.CryptoPaymentManager
    public String getFormattedAmount(Money money, MoneyFormatter moneyFormatter, BitcoinDisplayUnits bitcoinDisplayUnits) {
        money.getClass();
        moneyFormatter.getClass();
        bitcoinDisplayUnits.getClass();
        CurrencyCode currencyCode = money.currency_code;
        return (currencyCode == null ? -1 : RealStablecoinPaymentManager$WhenMappings.$EnumSwitchMapping$0[currencyCode.ordinal()]) == 1 ? ((RealBitcoinFormatter) this.readFailure).format(bitcoinDisplayUnits, money, true, false) : moneyFormatter.format(money);
    }

    @Override // com.squareup.cash.payments.presenters.CryptoPaymentManager
    public AppLockMonitor$special$$inlined$map$2 getInputHint() {
        return new AppLockMonitor$special$$inlined$map$2(((AndroidStringManager) this.listRead).get(R.string.usdc_send_recipient_selector_recipients_hint), 19);
    }

    @Override // com.squareup.cash.payments.presenters.CryptoPaymentManager
    public String getNoteHint() {
        return ((AndroidStringManager) this.listRead).get(R.string.usdc_sent_note_hint_external_address);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0049, code lost:
    
        if (r10 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object handle(BetterNavigator.ScreenNavigator screenNavigator, String str, ContinuationImpl continuationImpl) {
        RealQrCodesHandler$handle$1 realQrCodesHandler$handle$1;
        int i;
        RealQrCodesHandler$QrCodeResult realQrCodesHandler$QrCodeResult;
        if (continuationImpl instanceof RealQrCodesHandler$handle$1) {
            realQrCodesHandler$handle$1 = (RealQrCodesHandler$handle$1) continuationImpl;
            int i2 = realQrCodesHandler$handle$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realQrCodesHandler$handle$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realQrCodesHandler$handle$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realQrCodesHandler$handle$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realQrCodesHandler$handle$1.L$0 = screenNavigator;
                    realQrCodesHandler$handle$1.label = 1;
                    obj = parseQrCode(str, realQrCodesHandler$handle$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    screenNavigator = realQrCodesHandler$handle$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                realQrCodesHandler$QrCodeResult = (RealQrCodesHandler$QrCodeResult) obj;
                if (!(realQrCodesHandler$QrCodeResult instanceof RealQrCodesHandler$QrCodeResult.BitcoinPaymentsQrCode)) {
                    BitcoinPayments bitcoinPayments = ((RealQrCodesHandler$QrCodeResult.BitcoinPaymentsQrCode) realQrCodesHandler$QrCodeResult).invoice;
                    realQrCodesHandler$handle$1.L$0 = null;
                    realQrCodesHandler$handle$1.label = 2;
                    Object handleCryptoInvoice = handleCryptoInvoice(screenNavigator, bitcoinPayments, realQrCodesHandler$handle$1);
                    if (handleCryptoInvoice != obj2) {
                        return handleCryptoInvoice;
                    }
                } else {
                    if (!(realQrCodesHandler$QrCodeResult instanceof RealQrCodesHandler$QrCodeResult.Other)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    String str2 = ((RealQrCodesHandler$QrCodeResult.Other) realQrCodesHandler$QrCodeResult).qrCodeData;
                    realQrCodesHandler$handle$1.L$0 = null;
                    realQrCodesHandler$handle$1.label = 3;
                    Object withContext = JobKt.withContext((CoroutineContext) this.readFailure, new AndroidFileSaver$save$2(this, screenNavigator, str2, (Continuation) null), realQrCodesHandler$handle$1);
                    if (withContext != obj2) {
                        return withContext;
                    }
                }
                return obj2;
            }
        }
        realQrCodesHandler$handle$1 = new RealQrCodesHandler$handle$1(this, continuationImpl);
        Object obj3 = realQrCodesHandler$handle$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realQrCodesHandler$handle$1.label;
        if (i != 0) {
        }
        realQrCodesHandler$QrCodeResult = (RealQrCodesHandler$QrCodeResult) obj3;
        if (!(realQrCodesHandler$QrCodeResult instanceof RealQrCodesHandler$QrCodeResult.BitcoinPaymentsQrCode)) {
        }
        return obj22;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object handleCryptoInvoice(Navigator navigator, BitcoinPayments bitcoinPayments, ContinuationImpl continuationImpl) {
        RealQrCodesHandler$handleCryptoInvoice$1 realQrCodesHandler$handleCryptoInvoice$1;
        int i;
        ContentType contentType;
        Analytics analytics = (Analytics) this.path;
        if (continuationImpl instanceof RealQrCodesHandler$handleCryptoInvoice$1) {
            realQrCodesHandler$handleCryptoInvoice$1 = (RealQrCodesHandler$handleCryptoInvoice$1) continuationImpl;
            int i2 = realQrCodesHandler$handleCryptoInvoice$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realQrCodesHandler$handleCryptoInvoice$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realQrCodesHandler$handleCryptoInvoice$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realQrCodesHandler$handleCryptoInvoice$1.label;
                Money money = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    analytics.track(new CryptoSendStart(CryptoSendStart.CryptoSendStartSource.MAIN_QR_SCANNER), null);
                    boolean z = bitcoinPayments instanceof BitcoinPayments.Bitcoin;
                    if (z) {
                        contentType = ContentType.BITCOIN;
                    } else if (bitcoinPayments instanceof BitcoinPayments.Ethereum) {
                        contentType = ContentType.UNKNOWN;
                    } else if (bitcoinPayments instanceof BitcoinPayments.Lightning) {
                        contentType = ContentType.LIGHTNING;
                    } else if (bitcoinPayments instanceof BitcoinPayments.Stablecoin) {
                        contentType = ContentType.UNKNOWN;
                    } else {
                        if (bitcoinPayments != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        contentType = ContentType.UNKNOWN;
                    }
                    analytics.track(new CryptoSendScanQr(contentType), null);
                    if (z || (bitcoinPayments instanceof BitcoinPayments.Lightning)) {
                        CryptoFlowStarter cryptoFlowStarter = (CryptoFlowStarter) this.bytes;
                        CryptoPayment.InvoicePayment invoicePayment = new CryptoPayment.InvoicePayment(bitcoinPayments, CryptoPaymentSource.MAIN_KEYPAD_SCANNER_QR_CODE, money, 12);
                        realQrCodesHandler$handleCryptoInvoice$1.label = 1;
                        if (((RealCryptoFlowStarter) cryptoFlowStarter).initiateCryptoPayment(invoicePayment, PaymentScreens$HomeScreens$Home.INSTANCE, navigator) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        boolean z2 = bitcoinPayments instanceof BitcoinPayments.Ethereum;
                        Back back = Back.INSTANCE;
                        if (z2) {
                            navigator.goTo(back);
                            navigator.goTo(stablecoinQrScanPaymentConfigurationScreen(((BitcoinPayments.Ethereum) bitcoinPayments).ethereumAddress.data));
                        } else {
                            if (!(bitcoinPayments instanceof BitcoinPayments.Stablecoin)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) this.exceptionBytes)).peekCurrentValue(AmplitudeExperiments$BitcoinStablecoinMvp.INSTANCE)).enabled()) {
                                navigator.goTo(back);
                                navigator.goTo(stablecoinQrScanPaymentConfigurationScreen(((BitcoinPayments.Stablecoin) bitcoinPayments).address.data));
                            } else {
                                navigator.goTo(new SendStablecoinScreen(false, ((BitcoinPayments.Stablecoin) bitcoinPayments).address));
                            }
                        }
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Boolean.TRUE;
            }
        }
        realQrCodesHandler$handleCryptoInvoice$1 = new RealQrCodesHandler$handleCryptoInvoice$1(this, continuationImpl);
        Object obj2 = realQrCodesHandler$handleCryptoInvoice$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realQrCodesHandler$handleCryptoInvoice$1.label;
        Money money2 = null;
        if (i != 0) {
        }
        return Boolean.TRUE;
    }

    @Override // com.squareup.cash.payments.presenters.CryptoPaymentManager
    public kotlin.Unit initiatePayment(UUID uuid, Recipient.CryptoRecipientPayment cryptoRecipientPayment, Money money, Screen screen, BetterNavigator.ScreenNavigator screenNavigator, MainPaymentPresenter$models$4$4 mainPaymentPresenter$models$4$4) {
        if (!(cryptoRecipientPayment instanceof Recipient.CryptoRecipientPayment.Solana)) {
            a$$ExternalSyntheticBUOutline0.m$3("Only accepts stablecoin payments.");
            return null;
        }
        CryptoFlowStarter cryptoFlowStarter = (CryptoFlowStarter) this.readCompleteLatch;
        SolanaAddress solanaAddress = ((Recipient.CryptoRecipientPayment.Solana) cryptoRecipientPayment).address;
        String uuid2 = uuid != null ? uuid.toString() : null;
        if (screen == null) {
            screen = new MoneyTabScreen(null);
        }
        kotlin.Unit initiateStablecoinPayment = ((RealCryptoFlowStarter) cryptoFlowStarter).initiateStablecoinPayment(solanaAddress, money, uuid2, null, screen, screenNavigator);
        return initiateStablecoinPayment == CoroutineSingletons.COROUTINE_SUSPENDED ? initiateStablecoinPayment : kotlin.Unit.INSTANCE;
    }

    @Override // dagger.android.AndroidInjector
    public void inject(BaseDaggerFragment baseDaggerFragment) {
        UiStepFragment uiStepFragment = (UiStepFragment) baseDaggerFragment;
        DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl = (DaggerInquiryComponent$InquiryComponentImpl) this.listRead;
        uiStepFragment.androidInjector = daggerInquiryComponent$InquiryComponentImpl.dispatchingAndroidInjector();
        uiStepFragment.viewModelFactory = (UiStepViewModel_Factory_Impl) ((InstanceFactory) this.path).instance;
        uiStepFragment.systemUiController = (SystemUiController) daggerInquiryComponent$InquiryComponentImpl.systemUiControllerProvider.get();
    }

    @Override // com.squareup.ecr.EmbeddedCardReaderEventHandler
    public void logEvent(final String str, final String str2) {
        str.getClass();
        str2.getClass();
        Timber.Forest.i(str, str2);
        Lazy lazy = (Lazy) this.path;
        Object obj = new Object(str, str2) { // from class: com.squareup.cash.taptopay.backend.real.EmbeddedCardReaderLogCache$LogEntry
            public final String event;
            public final String params;

            {
                str.getClass();
                str2.getClass();
                this.event = str;
                this.params = str2;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof EmbeddedCardReaderLogCache$LogEntry)) {
                    return false;
                }
                EmbeddedCardReaderLogCache$LogEntry embeddedCardReaderLogCache$LogEntry = (EmbeddedCardReaderLogCache$LogEntry) obj2;
                return Intrinsics.areEqual(this.event, embeddedCardReaderLogCache$LogEntry.event) && Intrinsics.areEqual(this.params, embeddedCardReaderLogCache$LogEntry.params);
            }

            public final int hashCode() {
                return this.params.hashCode() + (this.event.hashCode() * 31);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("LogEntry(event=", this.event, ", params=", this.params, ")");
            }
        };
        lazy.getClass();
        synchronized (lazy.value) {
            try {
                ArrayDeque arrayDeque = (ArrayDeque) lazy.initializer;
                if (arrayDeque.size >= 1000) {
                    arrayDeque.removeFirst();
                }
                ((ArrayDeque) lazy.initializer).addLast(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // coil3.request.ImageRequest.Listener
    public void onError(ImageRequest imageRequest, ErrorResult errorResult) {
        ((ImagePlaceholderView) this.listRead).state.setValue(ImagePlaceholderView.State.ERROR);
        ((ImageView) this.readCompleteLatch).setClickable(false);
        ((MessageBodyLayout) this.bytes).onImageLoadFailed.invoke(errorResult.throwable.getMessage());
    }

    @Override // coil3.request.ImageRequest.Listener
    public void onSuccess(SuccessResult successResult) {
        ImageView imageView = (ImageView) this.exceptionBytes;
        imageView.setVisibility(0);
        ((ImagePlaceholderView) this.readFailure).setVisibility(8);
        imageView.setOnClickListener(new zae((MessageBodyLayout) this.bytes, (String) this.path, false, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.squareup.cash.payments.presenters.CryptoPaymentManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object parseInvoice(CryptoPaymentOrigin cryptoPaymentOrigin, String str, ContinuationImpl continuationImpl) {
        RealStablecoinPaymentManager$parseInvoice$1 realStablecoinPaymentManager$parseInvoice$1;
        int i;
        SolanaAddress solanaAddress;
        if (continuationImpl instanceof RealStablecoinPaymentManager$parseInvoice$1) {
            realStablecoinPaymentManager$parseInvoice$1 = (RealStablecoinPaymentManager$parseInvoice$1) continuationImpl;
            int i2 = realStablecoinPaymentManager$parseInvoice$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realStablecoinPaymentManager$parseInvoice$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realStablecoinPaymentManager$parseInvoice$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realStablecoinPaymentManager$parseInvoice$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SolanaAddressParser solanaAddressParser = (SolanaAddressParser) this.bytes;
                    realStablecoinPaymentManager$parseInvoice$1.label = 1;
                    obj = ((WorkCookieJar) solanaAddressParser).parse(str, realStablecoinPaymentManager$parseInvoice$1);
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
                solanaAddress = (SolanaAddress) obj;
                if (solanaAddress == null) {
                    return new CryptoPaymentManager.SelectedRecipient.SolanaPaymentRecipient(solanaAddress);
                }
                return null;
            }
        }
        realStablecoinPaymentManager$parseInvoice$1 = new RealStablecoinPaymentManager$parseInvoice$1(this, continuationImpl);
        Object obj2 = realStablecoinPaymentManager$parseInvoice$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realStablecoinPaymentManager$parseInvoice$1.label;
        if (i != 0) {
        }
        solanaAddress = (SolanaAddress) obj2;
        if (solanaAddress == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object parseQrCode(String str, ContinuationImpl continuationImpl) {
        RealQrCodesHandler$parseQrCode$1 realQrCodesHandler$parseQrCode$1;
        int i;
        if (continuationImpl instanceof RealQrCodesHandler$parseQrCode$1) {
            realQrCodesHandler$parseQrCode$1 = (RealQrCodesHandler$parseQrCode$1) continuationImpl;
            int i2 = realQrCodesHandler$parseQrCode$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realQrCodesHandler$parseQrCode$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realQrCodesHandler$parseQrCode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realQrCodesHandler$parseQrCode$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealCryptoInvoiceParser realCryptoInvoiceParser = (RealCryptoInvoiceParser) this.readCompleteLatch;
                    realQrCodesHandler$parseQrCode$1.L$0 = str;
                    realQrCodesHandler$parseQrCode$1.label = 1;
                    obj = realCryptoInvoiceParser.parse(str, false, realQrCodesHandler$parseQrCode$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = realQrCodesHandler$parseQrCode$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                BitcoinPayments bitcoinPayments = (BitcoinPayments) obj;
                return bitcoinPayments == null ? new RealQrCodesHandler$QrCodeResult.BitcoinPaymentsQrCode(bitcoinPayments) : new RealQrCodesHandler$QrCodeResult.Other(str);
            }
        }
        realQrCodesHandler$parseQrCode$1 = new RealQrCodesHandler$parseQrCode$1(this, continuationImpl);
        Object obj2 = realQrCodesHandler$parseQrCode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realQrCodesHandler$parseQrCode$1.label;
        if (i != 0) {
        }
        BitcoinPayments bitcoinPayments2 = (BitcoinPayments) obj2;
        if (bitcoinPayments2 == null) {
        }
    }

    @Override // com.squareup.ecr.EmbeddedCardReaderEventHandler
    public void playAlertTone() {
        ((RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0) this.readFailure).invoke(EmvAlertType.FAILURE);
    }

    @Override // com.squareup.ecr.EmbeddedCardReaderEventHandler
    public void playSuccessTone() {
        ((RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0) this.readFailure).invoke(EmvAlertType.SUCCESS);
    }

    public void readTheList() {
        try {
            Android10Platform android10Platform = Platform.platform;
            Android10Platform android10Platform2 = Platform.platform;
            InputStreamSource inputStreamSource = null;
            if (android10Platform2 == null) {
                android10Platform2 = null;
            }
            Context context = android10Platform2 != null ? android10Platform2.applicationContext : null;
            AssetManager assets = context != null ? context.getAssets() : null;
            if (assets != null) {
                InputStream open = assets.open((String) this.path);
                open.getClass();
                inputStreamSource = Okio.source(open);
            } else if (Build.FINGERPRINT == null) {
                a$$ExternalSyntheticBUOutline0.m$4("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            } else {
                a$$ExternalSyntheticBUOutline0.m$4("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
            }
            RealBufferedSource realBufferedSource = new RealBufferedSource(inputStreamSource);
            try {
                ByteString readByteString = realBufferedSource.readByteString(realBufferedSource.readInt());
                ByteString readByteString2 = realBufferedSource.readByteString(realBufferedSource.readInt());
                realBufferedSource.close();
                synchronized (this) {
                    readByteString.getClass();
                    this.bytes = readByteString;
                    readByteString2.getClass();
                    this.exceptionBytes = readByteString2;
                }
            } finally {
            }
        } finally {
            ((CountDownLatch) this.readCompleteLatch).countDown();
        }
    }

    @Override // com.squareup.ecr.EmbeddedCardReaderEventHandler
    public void removeCard() {
        ((RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0) this.readCompleteLatch).invoke(EmvCardStatus.REMOVED);
    }

    @Override // com.squareup.ecr.EmbeddedCardReaderEventHandler
    public void sendAuthRequest(byte[] bArr) {
        bArr.getClass();
        ((RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0) this.exceptionBytes).invoke(new EmvPaymentResult.PaymentAuthRequested(bArr));
    }

    @Override // com.squareup.ecr.EmbeddedCardReaderEventHandler
    public void sendCommandApdu(byte[] bArr) {
        bArr.getClass();
        ((StateFlowImpl) ((RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0) this.bytes).f$0.zzc).setValue(bArr);
    }

    public AssetPublicSuffixList(Analytics analytics, RealAccountInboundNavigator$Factory$Impl realAccountInboundNavigator$Factory$Impl, RealActivityInboundNavigator$Factory$Impl realActivityInboundNavigator$Factory$Impl, RealGlobalSearchInboundNavigator$Factory$Impl realGlobalSearchInboundNavigator$Factory$Impl, RealMoneybotInboundNavigator$Factory$Impl realMoneybotInboundNavigator$Factory$Impl, RealRouter$Factory$Impl realRouter$Factory$Impl, Navigator navigator) {
        navigator.getClass();
        this.listRead = analytics;
        this.readCompleteLatch = navigator;
        realRouter$Factory$Impl.create$1(navigator);
        this.bytes = new RealAccountInboundNavigator(navigator, 0);
        this.exceptionBytes = realMoneybotInboundNavigator$Factory$Impl.create(navigator);
        this.readFailure = new RealAccountInboundNavigator(navigator, 1);
        this.path = realActivityInboundNavigator$Factory$Impl.create$1(navigator);
    }

    public AssetPublicSuffixList(AndroidStringManager androidStringManager, AndroidClock androidClock, AndroidDateFormatManager androidDateFormatManager, Locale locale, TimestampFormatter$DisplayContext timestampFormatter$DisplayContext) {
        locale.getClass();
        this.listRead = androidStringManager;
        this.readCompleteLatch = androidClock;
        this.bytes = androidDateFormatManager;
        this.exceptionBytes = locale;
        this.readFailure = timestampFormatter$DisplayContext;
        this.path = ZoneId.of(androidClock.timeZone().getID());
    }

    public AssetPublicSuffixList() {
        this.listRead = new AtomicBoolean(false);
        this.readCompleteLatch = new CountDownLatch(1);
        this.path = "PublicSuffixDatabase.list";
    }

    public AssetPublicSuffixList(AndroidStringManager androidStringManager, CryptoFlowStarter cryptoFlowStarter, SolanaAddressParser solanaAddressParser, Analytics analytics, RealClipboardObserver realClipboardObserver, RealBitcoinFormatter realBitcoinFormatter, RealBitcoinProfileRepo realBitcoinProfileRepo) {
        this.listRead = androidStringManager;
        this.readCompleteLatch = cryptoFlowStarter;
        this.bytes = solanaAddressParser;
        this.exceptionBytes = realClipboardObserver;
        this.readFailure = realBitcoinFormatter;
        this.path = ViewShowRenderingKt.displayUnitProto(realBitcoinProfileRepo);
    }

    public static String formatDate$default(AssetPublicSuffixList assetPublicSuffixList, ZonedDateTime zonedDateTime, boolean z, boolean z2, boolean z3, int i) {
        String str;
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        assetPublicSuffixList.getClass();
        if (z3 && z2) {
            a$$ExternalSyntheticBUOutline0.m$1("Can't hide both day and year");
            return null;
        }
        if (z2) {
            if (z) {
                str = "M/d";
            } else if (!z) {
                str = "MMM d";
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        } else if (z3) {
            if (z) {
                str = "M/yyyy";
            } else if (!z) {
                str = "MMM yyyy";
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        } else if (z) {
            str = "M/d/yy";
        } else if (!z) {
            str = "MMM d, yyyy";
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        AndroidDateFormatManager androidDateFormatManager = (AndroidDateFormatManager) assetPublicSuffixList.bytes;
        String format2 = DateTimeFormatter.ofPattern(androidDateFormatManager.getDateFormat(str, androidDateFormatManager.clock.timeZone()).localizedPattern).withLocale((Locale) assetPublicSuffixList.exceptionBytes).format(zonedDateTime);
        format2.getClass();
        return format2;
    }

    public AssetPublicSuffixList(DoubleCheck doubleCheck, StateFlow stateFlow, CoroutineContext coroutineContext, RealMessageSigner realMessageSigner, AttestedKeyService.Factory factory) {
        this.listRead = doubleCheck;
        this.readCompleteLatch = stateFlow;
        this.bytes = coroutineContext;
        this.exceptionBytes = realMessageSigner;
        this.readFailure = factory;
        this.path = LazyKt.lazy(new MoneyTabUIKt$$ExternalSyntheticLambda5(this, 12));
    }

    public AssetPublicSuffixList(RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0 realEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0, RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0 realEmbeddedCardReaderProcessor$$ExternalSyntheticLambda02, RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0 realEmbeddedCardReaderProcessor$$ExternalSyntheticLambda03, RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0 realEmbeddedCardReaderProcessor$$ExternalSyntheticLambda04, RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0 realEmbeddedCardReaderProcessor$$ExternalSyntheticLambda05) {
        this.listRead = realEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0;
        this.readCompleteLatch = realEmbeddedCardReaderProcessor$$ExternalSyntheticLambda02;
        this.bytes = realEmbeddedCardReaderProcessor$$ExternalSyntheticLambda03;
        this.exceptionBytes = realEmbeddedCardReaderProcessor$$ExternalSyntheticLambda04;
        this.readFailure = realEmbeddedCardReaderProcessor$$ExternalSyntheticLambda05;
        this.path = new Lazy(19);
    }

    public /* synthetic */ AssetPublicSuffixList(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.listRead = obj;
        this.readCompleteLatch = obj2;
        this.bytes = obj3;
        this.exceptionBytes = obj4;
        this.readFailure = obj5;
        this.path = obj6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r10 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchSchedules(ClosedRange closedRange, ContinuationImpl continuationImpl) {
        RealShiftDataFetcher$fetchSchedules$1 realShiftDataFetcher$fetchSchedules$1;
        Object obj;
        int i;
        Object first;
        ClosedRange closedRange2;
        MerchantIdentifier merchantIdentifier;
        if (continuationImpl instanceof RealShiftDataFetcher$fetchSchedules$1) {
            realShiftDataFetcher$fetchSchedules$1 = (RealShiftDataFetcher$fetchSchedules$1) continuationImpl;
            int i2 = realShiftDataFetcher$fetchSchedules$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realShiftDataFetcher$fetchSchedules$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realShiftDataFetcher$fetchSchedules$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realShiftDataFetcher$fetchSchedules$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    realShiftDataFetcher$fetchSchedules$1.L$0 = closedRange;
                    realShiftDataFetcher$fetchSchedules$1.label = 1;
                    obj2 = FlowKt.first(new SquareAccountStore$userFlow$$inlined$map$1(((RealSelectedMerchantProvider) this.exceptionBytes).getMerchantIdentifierFlow(), 12), realShiftDataFetcher$fetchSchedules$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                SafeTrace.throwOnFailure(obj2);
                                return obj2;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        merchantIdentifier = realShiftDataFetcher$fetchSchedules$1.L$1;
                        closedRange2 = realShiftDataFetcher$fetchSchedules$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        String str = merchantIdentifier.token;
                        realShiftDataFetcher$fetchSchedules$1.L$0 = null;
                        realShiftDataFetcher$fetchSchedules$1.L$1 = null;
                        realShiftDataFetcher$fetchSchedules$1.label = 3;
                        Object fetchSchedules = fetchSchedules(closedRange2, str, (String) obj2, realShiftDataFetcher$fetchSchedules$1);
                        return fetchSchedules != obj ? obj : fetchSchedules;
                    }
                    closedRange = realShiftDataFetcher$fetchSchedules$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                }
                MerchantIdentifier merchantIdentifier2 = (MerchantIdentifier) obj2;
                realShiftDataFetcher$fetchSchedules$1.L$0 = closedRange;
                realShiftDataFetcher$fetchSchedules$1.L$1 = merchantIdentifier2;
                realShiftDataFetcher$fetchSchedules$1.label = 2;
                first = FlowKt.first(new SquareAccountStore$userFlow$$inlined$map$1(((RealTeamMemberIdProvider) this.readFailure).getTeamMemberId(), 13), realShiftDataFetcher$fetchSchedules$1);
                if (first != obj) {
                    closedRange2 = closedRange;
                    merchantIdentifier = merchantIdentifier2;
                    obj2 = first;
                    String str2 = merchantIdentifier.token;
                    realShiftDataFetcher$fetchSchedules$1.L$0 = null;
                    realShiftDataFetcher$fetchSchedules$1.L$1 = null;
                    realShiftDataFetcher$fetchSchedules$1.label = 3;
                    Object fetchSchedules2 = fetchSchedules(closedRange2, str2, (String) obj2, realShiftDataFetcher$fetchSchedules$1);
                    if (fetchSchedules2 != obj) {
                    }
                }
            }
        }
        realShiftDataFetcher$fetchSchedules$1 = new RealShiftDataFetcher$fetchSchedules$1(this, continuationImpl);
        Object obj22 = realShiftDataFetcher$fetchSchedules$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realShiftDataFetcher$fetchSchedules$1.label;
        if (i != 0) {
        }
        MerchantIdentifier merchantIdentifier22 = (MerchantIdentifier) obj22;
        realShiftDataFetcher$fetchSchedules$1.L$0 = closedRange;
        realShiftDataFetcher$fetchSchedules$1.L$1 = merchantIdentifier22;
        realShiftDataFetcher$fetchSchedules$1.label = 2;
        first = FlowKt.first(new SquareAccountStore$userFlow$$inlined$map$1(((RealTeamMemberIdProvider) this.readFailure).getTeamMemberId(), 13), realShiftDataFetcher$fetchSchedules$1);
        if (first != obj) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable fetchTimecards(ClosedRange closedRange, String str, String str2, ArrayList arrayList, ContinuationImpl continuationImpl) {
        RealShiftDataFetcher$fetchTimecards$2 realShiftDataFetcher$fetchTimecards$2;
        int i;
        ApiResult apiResult;
        OvertimeReportByTimecardForEmployeeResponse overtimeReportByTimecardForEmployeeResponse;
        if (continuationImpl instanceof RealShiftDataFetcher$fetchTimecards$2) {
            realShiftDataFetcher$fetchTimecards$2 = (RealShiftDataFetcher$fetchTimecards$2) continuationImpl;
            int i2 = realShiftDataFetcher$fetchTimecards$2.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realShiftDataFetcher$fetchTimecards$2.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realShiftDataFetcher$fetchTimecards$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realShiftDataFetcher$fetchTimecards$2.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Timecard.Builder builder = new Timecard.Builder(8);
                    List listOf = CollectionsKt__CollectionsJVMKt.listOf(str2);
                    ByteString byteString = ByteString.EMPTY;
                    builder.clockout_unit_token = new MerchantEmployeeRequestFilter(str, listOf, arrayList, byteString);
                    LocalDate localDate = (LocalDate) closedRange.getStart();
                    YearMonthDay yearMonthDay = new YearMonthDay(Integer.valueOf(localDate.getYear()), Integer.valueOf(localDate.getMonthValue()), Integer.valueOf(DimensionKt.getSafeDayOfMonth(localDate)), byteString);
                    LocalDate localDate2 = (LocalDate) closedRange.getEndInclusive();
                    builder.employee = new SimpleTimeWorkedCalculationRequest$TimeRange$LocalDateRange(new LocalDateRange(yearMonthDay, new YearMonthDay(Integer.valueOf(localDate2.getYear()), Integer.valueOf(localDate2.getMonthValue()), Integer.valueOf(DimensionKt.getSafeDayOfMonth(localDate2)), byteString), byteString));
                    Boolean bool = Boolean.TRUE;
                    builder.clockout_timestamp_ms = bool;
                    builder.employee_job_info = bool;
                    builder.merchant_token = ((AndroidClock) this.listRead).timeZone().toZoneId().getId();
                    builder.created_at_timestamp_ms = ShiftOptions.SCHEDULES_AND_TIMECARDS;
                    SimpleTimeWorkedCalculationRequest build = builder.build();
                    TimecardsService timecardsService = (TimecardsService) this.bytes;
                    SquareMerchantToken squareMerchantToken = new SquareMerchantToken(str);
                    realShiftDataFetcher$fetchTimecards$2.label = 1;
                    obj = timecardsService.overtimeReportByTimecardForEmployee(build, squareMerchantToken, realShiftDataFetcher$fetchTimecards$2);
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
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Failure) {
                    Timber.Forest.w("Failed to fetch timecards: " + ((ApiResult.Failure) apiResult), new Object[0]);
                }
                overtimeReportByTimecardForEmployeeResponse = (OvertimeReportByTimecardForEmployeeResponse) (!(apiResult instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult).response : null);
                if (overtimeReportByTimecardForEmployeeResponse == null) {
                    return overtimeReportByTimecardForEmployeeResponse;
                }
                a$$ExternalSyntheticBUOutline0.m$4("Failed to fetch timecards");
                return null;
            }
        }
        realShiftDataFetcher$fetchTimecards$2 = new RealShiftDataFetcher$fetchTimecards$2(this, continuationImpl);
        Object obj2 = realShiftDataFetcher$fetchTimecards$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realShiftDataFetcher$fetchTimecards$2.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Failure) {
        }
        overtimeReportByTimecardForEmployeeResponse = (OvertimeReportByTimecardForEmployeeResponse) (!(apiResult instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult).response : null);
        if (overtimeReportByTimecardForEmployeeResponse == null) {
        }
    }
}
