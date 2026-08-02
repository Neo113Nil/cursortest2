package com.squareup.cash.support.chat.presenters;

import android.content.res.Resources;
import android.icu.text.BreakIterator;
import android.icu.text.MessageFormat;
import android.net.Uri;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.emoji2.text.EmojiCompat;
import androidx.glance.layout.SpacerKt;
import androidx.glance.session.GlobalSnapshotManagerKt;
import androidx.glance.session.SessionWorkerKt;
import androidx.glance.session.TimerScopeKt;
import androidx.graphics.shapes.CubicKt;
import androidx.graphics.shapes.PointKt;
import androidx.graphics.shapes.RoundedPolygonKt;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.common.FileTypes;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.navigation.NavArgumentKt;
import androidx.navigation.compose.NavHostKt$NavHost$33$1;
import androidx.room.TransactorKt;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.RealStrongMemoryCache;
import coil3.size.DimensionKt;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.cdf.cash.CashWithdrawCancel;
import com.squareup.cash.cdf.cash.CashWithdrawDepositPreferenceSelected;
import com.squareup.cash.cdf.cash.CashWithdrawDismissAmount;
import com.squareup.cash.cdf.cash.CashWithdrawSaveAmount;
import com.squareup.cash.cdf.cash.CashWithdrawSelectInstrument;
import com.squareup.cash.cdf.cash.CashWithdrawViewKeypad;
import com.squareup.cash.cdf.customersupport.Channel;
import com.squareup.cash.cdf.customersupport.CustomerSupportChatReceivedSuggestedReplies;
import com.squareup.cash.cdf.customersupport.CustomerSupportContactComplete;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.common.viewmodels.AvatarViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.accessibility.AndroidAccessibilityManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientSupportAutomationChatBotTypingBubble;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientSupportChatBotIndicatorDelayAfterTyping;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientSupportChatEndCashbotConvo;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientSupportChatImmediateCsat;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientSupportChatUnifiedTransactionPicker;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientSupportDisableCashbotFileUpload;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientSupportUploadImageCompat;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlag$StringAmplitudeExperiment;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$SupportChatFileSizeLimit;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$SupportChatPollingInterval;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$SupportChatUserTypingEventInterval;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fileupload.api.FileError;
import com.squareup.cash.fileupload.api.FileMetadata;
import com.squareup.cash.fileupload.api.FileValidator$Result;
import com.squareup.cash.fileupload.api.ImageFormatConverter$ConversionResult;
import com.squareup.cash.fileupload.real.RealAndroidFileParser;
import com.squareup.cash.fileupload.real.RealFileValidator$Factory$Impl;
import com.squareup.cash.fileupload.real.RealImageFormatConverter$Factory$Impl;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.screens.InstrumentSelectionLoadingScreen;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.observability.backend.api.SpanTracking;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.out.sync_entity.SupportedFlows;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.permissions.AndroidPermissionManager$create$1;
import com.squareup.cash.recipients.data.RealRecipientRepository$suggestions$$inlined$map$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.securitysignals.backend.RealSecuritySignalsAggregator;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda9;
import com.squareup.cash.support.chat.backend.api.Action$OpenLink;
import com.squareup.cash.support.chat.backend.api.Action$PickTransaction;
import com.squareup.cash.support.chat.backend.api.Conversation;
import com.squareup.cash.support.chat.backend.api.Message;
import com.squareup.cash.support.chat.backend.api.MessageBody;
import com.squareup.cash.support.chat.backend.api.MessageStatus$Failed;
import com.squareup.cash.support.chat.backend.api.MessageStatus$Recorded;
import com.squareup.cash.support.chat.backend.api.MessageStatus$Sending;
import com.squareup.cash.support.chat.backend.api.PagingStatus;
import com.squareup.cash.support.chat.backend.api.PendingMessage;
import com.squareup.cash.support.chat.backend.api.RecordedMessage;
import com.squareup.cash.support.chat.backend.api.SuggestedReply;
import com.squareup.cash.support.chat.backend.api.Transcript;
import com.squareup.cash.support.chat.backend.real.RealConversationService;
import com.squareup.cash.support.chat.backend.real.SupportConversationPersistence;
import com.squareup.cash.support.chat.presenters.ChatMessageAction;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$ActionBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$ActivityBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$FileBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$ImageBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$SystemMessageBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$TextBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$TransactionBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$TypingIndicatorBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$UnknownBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatAttachmentViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel$MessageViewModel$Status$Failed;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel$MessageViewModel$Status$Recorded;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel$MessageViewModel$Status$Sending;
import com.squareup.cash.support.chat.viewmodels.ChatViewModel;
import com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.support.presenters.ArticlePresenter$models$1$1;
import com.squareup.cash.tabprovider.real.RealTabProvider$setup$1$5;
import com.squareup.cash.tax.presenters.TaxWebAppPresenter$models$1$1;
import com.squareup.cash.transfers.backend.api.CashOutCapabilityManager$CashOutCapabilities;
import com.squareup.cash.transfers.data.TransferData;
import com.squareup.cash.transfers.data.TransferType;
import com.squareup.cash.transfers.presenters.UtilsKt;
import com.squareup.cash.transfers.presenters.WithdrawPresenter;
import com.squareup.cash.transfers.screens.InstrumentNotLinkedScreen;
import com.squareup.cash.transfers.screens.TransfersRouterScreen;
import com.squareup.cash.transfers.screens.WithdrawScreen;
import com.squareup.cash.transfers.viewmodels.WithdrawViewEvent;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import com.squareup.cash.treehouse.activity.ActivityDataBridge;
import com.squareup.cash.ui.MainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory;
import com.squareup.cash.upsell.presenters.NullStateSwipeConfigProvider;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.cash.work.data.real.RealTaxFormDownloader$MetroFactory;
import com.squareup.cash.work.views.you.WorkYouViewKt$$ExternalSyntheticLambda1;
import com.squareup.protos.cash.supportal.app.SupportalAppService;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.scannerview.TextSetter;
import com.squareup.util.coroutines.ThrottleLatestKt$throttleLatest$1;
import com.squareup.util.task.RepeatTaskExecutor;
import com.squareup.wire.GrpcStatus;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ChatPresenter implements MoleculePresenter {
    public static final String ALLOWED_FILE_MIME_TYPES_REGEX = CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"image/.*", "text/.*", "application/pdf", "application/msword", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/vnd.ms-excel", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"}), "|", "(", ")", 0, null, null, 56);
    public final AndroidAccessibilityManager accessibilityManager;
    public final ActivityDataBridge activityDataBridge;
    public final StateFlow activityLifecycleStates;
    public final Analytics analytics;
    public final SupportalAppService appService;
    public final String applicationId;
    public final SupportChatScreens.FlowScreen.ChatScreen args;
    public final boolean canRequestNotificationPermission;
    public final TextSetter chatAccessibilityManager;
    public final long chatAutomationDelayAfterTypingSec;
    public final ChatStateMapper chatStateMapper;
    public final RealClientRouteParser clientRouteParser;
    public final AndroidClock clock;
    public final SupportConversationPersistence conversationPersistence;
    public final RealConversationService conversationService;
    public final ErrorReporter errorReporter;
    public final FeatureFlagManager featureFlagManager;
    public final long fileSizeLimitMb;
    public final RealStrongMemoryCache fileValidator;
    public final EglCore imageFormatConverter;
    public final Lazy isEndCashbotConvoEnabled$delegate;
    public final Lazy isImmediateCsatEnabled$delegate;
    public final IntentLauncher launcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealObservabilityManager observabilityManager;
    public final AndroidPermissionManager permissionManager;
    public final long pollingInterval;
    public final RealRouter router;
    public final Lazy shouldConvertImages$delegate;
    public final Lazy shouldDisableCashbotFileUpload$delegate;
    public final AndroidStringManager stringManager;
    public final com.squareup.kotterknife.Lazy typingIndicatorHelper;
    public final boolean unifiedTransactionPickerEnabled;

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider accessibilityManager;
        public final Provider activityDataBridge;
        public final Provider activityLifecycleStates;
        public final Provider analytics;
        public final Provider appService;
        public final Provider applicationId;
        public final RealTaxFormDownloader$MetroFactory chatAccessibilityManager;
        public final RealBrazeManager.MetroFactory chatStateMapper;
        public final Provider clientRouteParser;
        public final Provider clock;
        public final Provider conversationPersistence;
        public final Provider conversationService;
        public final Provider errorReporter;
        public final Provider featureFlagManager;
        public final Provider fileValidatorFactory;
        public final Provider imageFormatConverterFactory;
        public final Provider launcher;
        public final Provider observabilityManager;
        public final Provider permissionManager;
        public final Provider routerFactory;
        public final Provider stringManager;

        public abstract class Companion {
            public static MetroFactory create(LambdaProvider lambdaProvider, IntentLauncher.MetroFactory metroFactory, ShiftsAnalytics.MetroFactory metroFactory2, DoubleCheck doubleCheck, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider3, DoubleCheck doubleCheck3, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, RealTaxFormDownloader$MetroFactory realTaxFormDownloader$MetroFactory, MainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory mainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory, LambdaProvider lambdaProvider4, InstanceFactory instanceFactory3, DoubleCheck doubleCheck4, RepeatTaskExecutor.MetroFactory metroFactory3, DoubleCheck doubleCheck5, RealBrazeManager.MetroFactory metroFactory4, LambdaProvider lambdaProvider5, DoubleCheck doubleCheck6, LambdaProvider lambdaProvider6) {
                lambdaProvider.getClass();
                metroFactory.getClass();
                metroFactory2.getClass();
                doubleCheck.getClass();
                lambdaProvider2.getClass();
                doubleCheck2.getClass();
                lambdaProvider3.getClass();
                doubleCheck3.getClass();
                instanceFactory.getClass();
                instanceFactory2.getClass();
                mainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory.getClass();
                lambdaProvider4.getClass();
                instanceFactory3.getClass();
                doubleCheck4.getClass();
                metroFactory3.getClass();
                doubleCheck5.getClass();
                lambdaProvider5.getClass();
                doubleCheck6.getClass();
                lambdaProvider6.getClass();
                return new MetroFactory(lambdaProvider, metroFactory, metroFactory2, doubleCheck, lambdaProvider2, doubleCheck2, lambdaProvider3, doubleCheck3, instanceFactory, instanceFactory2, realTaxFormDownloader$MetroFactory, mainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory, lambdaProvider4, instanceFactory3, doubleCheck4, metroFactory3, doubleCheck5, metroFactory4, lambdaProvider5, doubleCheck6, lambdaProvider6);
            }
        }

        public MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, RealTaxFormDownloader$MetroFactory realTaxFormDownloader$MetroFactory, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16, RealBrazeManager.MetroFactory metroFactory, Provider provider17, Provider provider18, Provider provider19) {
            this.stringManager = provider;
            this.launcher = provider2;
            this.conversationService = provider3;
            this.featureFlagManager = provider4;
            this.clock = provider5;
            this.analytics = provider6;
            this.observabilityManager = provider7;
            this.appService = provider8;
            this.fileValidatorFactory = provider9;
            this.imageFormatConverterFactory = provider10;
            this.chatAccessibilityManager = realTaxFormDownloader$MetroFactory;
            this.activityLifecycleStates = provider11;
            this.applicationId = provider12;
            this.routerFactory = provider13;
            this.clientRouteParser = provider14;
            this.conversationPersistence = provider15;
            this.permissionManager = provider16;
            this.chatStateMapper = metroFactory;
            this.errorReporter = provider17;
            this.activityDataBridge = provider18;
            this.accessibilityManager = provider19;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/support/chat/presenters/ChatPresenter$SupportChatImageLoadingError", "Lcom/squareup/cash/observability/types/ReportedError;", "presenters"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public final /* data */ class SupportChatImageLoadingError extends ReportedError {
        public final String message;
        public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Support.INSTANCE);
        public final Set targets = ArraysKt___ArraysKt.toSet(new ReportedError.ErrorReportingTarget[]{ReportedError.ErrorReportingTarget.DATADOG, ReportedError.ErrorReportingTarget.LOGS});
        public final Map metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("", Thread$State$EnumUnboxingLocalUtility.m("owner_id", "#cash-support-android"));

        public SupportChatImageLoadingError(String str) {
            this.message = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SupportChatImageLoadingError) && Intrinsics.areEqual(this.message, ((SupportChatImageLoadingError) obj).message);
        }

        @Override // com.squareup.cash.observability.types.FeatureError
        public final Set getFeatures() {
            return this.features;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        @Override // com.squareup.cash.observability.types.ReportedError
        public final Map getMetadata() {
            return this.metadata;
        }

        @Override // com.squareup.cash.observability.types.ReportedError
        public final Set getTargets() {
            return this.targets;
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SupportChatImageLoadingError(message=", this.message, ")");
        }
    }

    public ChatPresenter(AndroidStringManager androidStringManager, IntentLauncher intentLauncher, RealConversationService realConversationService, FeatureFlagManager featureFlagManager, AndroidClock androidClock, Analytics analytics, RealObservabilityManager realObservabilityManager, SupportalAppService supportalAppService, RealFileValidator$Factory$Impl realFileValidator$Factory$Impl, RealImageFormatConverter$Factory$Impl realImageFormatConverter$Factory$Impl, TextSetter textSetter, StateFlow stateFlow, String str, RealRouter$Factory$Impl realRouter$Factory$Impl, RealClientRouteParser realClientRouteParser, SupportConversationPersistence supportConversationPersistence, AndroidPermissionManager androidPermissionManager, ChatStateMapper chatStateMapper, ErrorReporter errorReporter, ActivityDataBridge activityDataBridge, AndroidAccessibilityManager androidAccessibilityManager, SupportChatScreens.FlowScreen.ChatScreen chatScreen, BetterNavigator.ScreenNavigator screenNavigator, boolean z) {
        chatScreen.getClass();
        this.stringManager = androidStringManager;
        this.launcher = intentLauncher;
        this.conversationService = realConversationService;
        this.featureFlagManager = featureFlagManager;
        this.clock = androidClock;
        this.analytics = analytics;
        this.observabilityManager = realObservabilityManager;
        this.appService = supportalAppService;
        this.chatAccessibilityManager = textSetter;
        this.activityLifecycleStates = stateFlow;
        this.applicationId = str;
        this.clientRouteParser = realClientRouteParser;
        this.conversationPersistence = supportConversationPersistence;
        this.permissionManager = androidPermissionManager;
        this.chatStateMapper = chatStateMapper;
        this.errorReporter = errorReporter;
        this.activityDataBridge = activityDataBridge;
        this.accessibilityManager = androidAccessibilityManager;
        this.args = chatScreen;
        this.navigator = screenNavigator;
        this.canRequestNotificationPermission = z;
        this.typingIndicatorHelper = new com.squareup.kotterknife.Lazy(17, featureFlagManager, androidClock);
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
        long j = ((FeatureFlag$LongFeatureFlag.Value) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$SupportChatFileSizeLimit.INSTANCE)).value;
        this.fileSizeLimitMb = j;
        String str2 = ALLOWED_FILE_MIME_TYPES_REGEX;
        str2.getClass();
        RealAndroidFileParser realAndroidFileParser = (RealAndroidFileParser) realFileValidator$Factory$Impl.delegateFactory.sandboxer.invoke();
        realAndroidFileParser.getClass();
        this.fileValidator = new RealStrongMemoryCache(realAndroidFileParser, j * 1048576, str2);
        this.imageFormatConverter = realImageFormatConverter$Factory$Impl.create$1();
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        Duration.Companion companion = Duration.Companion;
        this.pollingInterval = DurationKt.toDuration(((FeatureFlag$LongFeatureFlag.Value) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$SupportChatPollingInterval.INSTANCE)).value, DurationUnit.SECONDS);
        this.chatAutomationDelayAfterTypingSec = DurationKt.toDuration(Long.parseLong(((FeatureFlag$StringAmplitudeExperiment.Value) realFeatureFlagManager.peekCurrentValue(AmplitudeExperiments$ClientSupportChatBotIndicatorDelayAfterTyping.INSTANCE)).value), DurationUnit.MILLISECONDS);
        final int i = 0;
        this.isEndCashbotConvoEnabled$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.support.chat.presenters.ChatPresenter$$ExternalSyntheticLambda0
            public final /* synthetic */ ChatPresenter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean enabled;
                int i2 = i;
                ChatPresenter chatPresenter = this.f$0;
                switch (i2) {
                    case 0:
                        enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) chatPresenter.featureFlagManager).currentValue(AmplitudeExperiments$ClientSupportChatEndCashbotConvo.INSTANCE)).enabled();
                        break;
                    case 1:
                        enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) chatPresenter.featureFlagManager).currentValue(AmplitudeExperiments$ClientSupportUploadImageCompat.INSTANCE)).enabled();
                        break;
                    case 2:
                        enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) chatPresenter.featureFlagManager).currentValue(AmplitudeExperiments$ClientSupportDisableCashbotFileUpload.INSTANCE)).enabled();
                        break;
                    default:
                        enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) chatPresenter.featureFlagManager).currentValue(AmplitudeExperiments$ClientSupportChatImmediateCsat.INSTANCE)).enabled();
                        break;
                }
                return Boolean.valueOf(enabled);
            }
        });
        final int i2 = 1;
        this.shouldConvertImages$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.support.chat.presenters.ChatPresenter$$ExternalSyntheticLambda0
            public final /* synthetic */ ChatPresenter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean enabled;
                int i22 = i2;
                ChatPresenter chatPresenter = this.f$0;
                switch (i22) {
                    case 0:
                        enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) chatPresenter.featureFlagManager).currentValue(AmplitudeExperiments$ClientSupportChatEndCashbotConvo.INSTANCE)).enabled();
                        break;
                    case 1:
                        enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) chatPresenter.featureFlagManager).currentValue(AmplitudeExperiments$ClientSupportUploadImageCompat.INSTANCE)).enabled();
                        break;
                    case 2:
                        enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) chatPresenter.featureFlagManager).currentValue(AmplitudeExperiments$ClientSupportDisableCashbotFileUpload.INSTANCE)).enabled();
                        break;
                    default:
                        enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) chatPresenter.featureFlagManager).currentValue(AmplitudeExperiments$ClientSupportChatImmediateCsat.INSTANCE)).enabled();
                        break;
                }
                return Boolean.valueOf(enabled);
            }
        });
        this.unifiedTransactionPickerEnabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.peekCurrentValue(AmplitudeExperiments$ClientSupportChatUnifiedTransactionPicker.INSTANCE)).enabled();
        final int i3 = 2;
        this.shouldDisableCashbotFileUpload$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.support.chat.presenters.ChatPresenter$$ExternalSyntheticLambda0
            public final /* synthetic */ ChatPresenter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean enabled;
                int i22 = i3;
                ChatPresenter chatPresenter = this.f$0;
                switch (i22) {
                    case 0:
                        enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) chatPresenter.featureFlagManager).currentValue(AmplitudeExperiments$ClientSupportChatEndCashbotConvo.INSTANCE)).enabled();
                        break;
                    case 1:
                        enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) chatPresenter.featureFlagManager).currentValue(AmplitudeExperiments$ClientSupportUploadImageCompat.INSTANCE)).enabled();
                        break;
                    case 2:
                        enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) chatPresenter.featureFlagManager).currentValue(AmplitudeExperiments$ClientSupportDisableCashbotFileUpload.INSTANCE)).enabled();
                        break;
                    default:
                        enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) chatPresenter.featureFlagManager).currentValue(AmplitudeExperiments$ClientSupportChatImmediateCsat.INSTANCE)).enabled();
                        break;
                }
                return Boolean.valueOf(enabled);
            }
        });
        final int i4 = 3;
        this.isImmediateCsatEnabled$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.support.chat.presenters.ChatPresenter$$ExternalSyntheticLambda0
            public final /* synthetic */ ChatPresenter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean enabled;
                int i22 = i4;
                ChatPresenter chatPresenter = this.f$0;
                switch (i22) {
                    case 0:
                        enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) chatPresenter.featureFlagManager).currentValue(AmplitudeExperiments$ClientSupportChatEndCashbotConvo.INSTANCE)).enabled();
                        break;
                    case 1:
                        enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) chatPresenter.featureFlagManager).currentValue(AmplitudeExperiments$ClientSupportUploadImageCompat.INSTANCE)).enabled();
                        break;
                    case 2:
                        enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) chatPresenter.featureFlagManager).currentValue(AmplitudeExperiments$ClientSupportDisableCashbotFileUpload.INSTANCE)).enabled();
                        break;
                    default:
                        enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) chatPresenter.featureFlagManager).currentValue(AmplitudeExperiments$ClientSupportChatImmediateCsat.INSTANCE)).enabled();
                        break;
                }
                return Boolean.valueOf(enabled);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r0.updateLastReadMessageToken(r9, r10, r1) == r11) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d6, code lost:
    
        if (r0.updateLastReadMessageToken(r9, r10, r1) == r11) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0056, code lost:
    
        if (r8 == r11) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$updateLastReadMessageIfNecessary(ChatPresenter chatPresenter, String str, List list, ContinuationImpl continuationImpl) {
        ChatPresenter$updateLastReadMessageIfNecessary$1 chatPresenter$updateLastReadMessageIfNecessary$1;
        int i;
        String str2;
        int i2;
        int i3;
        SupportConversationPersistence supportConversationPersistence = chatPresenter.conversationPersistence;
        if (continuationImpl instanceof ChatPresenter$updateLastReadMessageIfNecessary$1) {
            chatPresenter$updateLastReadMessageIfNecessary$1 = (ChatPresenter$updateLastReadMessageIfNecessary$1) continuationImpl;
            int i4 = chatPresenter$updateLastReadMessageIfNecessary$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                chatPresenter$updateLastReadMessageIfNecessary$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj = chatPresenter$updateLastReadMessageIfNecessary$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatPresenter$updateLastReadMessageIfNecessary$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    chatPresenter$updateLastReadMessageIfNecessary$1.L$0 = str;
                    chatPresenter$updateLastReadMessageIfNecessary$1.L$1 = list;
                    chatPresenter$updateLastReadMessageIfNecessary$1.label = 1;
                    obj = supportConversationPersistence.getLastReadMessageToken(chatPresenter$updateLastReadMessageIfNecessary$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = chatPresenter$updateLastReadMessageIfNecessary$1.L$1;
                    str = chatPresenter$updateLastReadMessageIfNecessary$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                str2 = (String) obj;
                if (str2 != null) {
                    chatPresenter$updateLastReadMessageIfNecessary$1.L$0 = null;
                    chatPresenter$updateLastReadMessageIfNecessary$1.L$1 = null;
                    chatPresenter$updateLastReadMessageIfNecessary$1.label = 2;
                } else {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        i2 = -1;
                        if (!listIterator.hasPrevious()) {
                            i3 = -1;
                            break;
                        }
                        Message message = (Message) listIterator.previous();
                        RecordedMessage recordedMessage = message instanceof RecordedMessage ? (RecordedMessage) message : null;
                        if (Intrinsics.areEqual(recordedMessage != null ? recordedMessage.messageToken : null, str2)) {
                            i3 = listIterator.nextIndex();
                            break;
                        }
                    }
                    ListIterator listIterator2 = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator2.hasPrevious()) {
                            break;
                        }
                        Message message2 = (Message) listIterator2.previous();
                        RecordedMessage recordedMessage2 = message2 instanceof RecordedMessage ? (RecordedMessage) message2 : null;
                        if (Intrinsics.areEqual(recordedMessage2 != null ? recordedMessage2.messageToken : null, str)) {
                            i2 = listIterator2.nextIndex();
                            break;
                        }
                    }
                    if (i2 <= i3) {
                        return Unit.INSTANCE;
                    }
                    chatPresenter$updateLastReadMessageIfNecessary$1.L$0 = null;
                    chatPresenter$updateLastReadMessageIfNecessary$1.L$1 = null;
                    chatPresenter$updateLastReadMessageIfNecessary$1.label = 3;
                }
                return coroutineSingletons;
            }
        }
        chatPresenter$updateLastReadMessageIfNecessary$1 = new ChatPresenter$updateLastReadMessageIfNecessary$1(chatPresenter, continuationImpl);
        Object obj2 = chatPresenter$updateLastReadMessageIfNecessary$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatPresenter$updateLastReadMessageIfNecessary$1.label;
        if (i != 0) {
        }
        str2 = (String) obj2;
        if (str2 != null) {
        }
        return coroutineSingletons2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r9 == r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0049, code lost:
    
        if (r9 == r2) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$validateFile(ChatPresenter chatPresenter, String str, ContinuationImpl continuationImpl) {
        ChatPresenter$validateFile$1 chatPresenter$validateFile$1;
        int i;
        FileValidator$Result fileValidator$Result;
        int i2;
        String str2;
        ImageFormatConverter$ConversionResult imageFormatConverter$ConversionResult;
        AndroidStringManager androidStringManager = chatPresenter.stringManager;
        if (continuationImpl instanceof ChatPresenter$validateFile$1) {
            chatPresenter$validateFile$1 = (ChatPresenter$validateFile$1) continuationImpl;
            int i3 = chatPresenter$validateFile$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                chatPresenter$validateFile$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = chatPresenter$validateFile$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatPresenter$validateFile$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealStrongMemoryCache realStrongMemoryCache = chatPresenter.fileValidator;
                    str.getClass();
                    chatPresenter$validateFile$1.L$0 = str;
                    chatPresenter$validateFile$1.label = 1;
                    obj = realStrongMemoryCache.m1457validate8YU3vEA(str, chatPresenter$validateFile$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        imageFormatConverter$ConversionResult = (ImageFormatConverter$ConversionResult) obj;
                        TextSetter textSetter = chatPresenter.chatAccessibilityManager;
                        ((AndroidAccessibilityManager) textSetter.textView).announceForAccessibility(((AndroidStringManager) textSetter.textSwitcher).get(R.string.support_chat_a11y_announce_attachment_selected));
                        return new MessageBody.FileBody(imageFormatConverter$ConversionResult.metadata, imageFormatConverter$ConversionResult.uri, null);
                    }
                    str = chatPresenter$validateFile$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                fileValidator$Result = (FileValidator$Result) obj;
                if (fileValidator$Result instanceof FileValidator$Result.Success) {
                    if (!(fileValidator$Result instanceof FileValidator$Result.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    FileError fileError = ((FileValidator$Result.Failure) fileValidator$Result).error;
                    int ordinal = fileError.ordinal();
                    if (ordinal == 0) {
                        i2 = R.string.support_chat_error_invalid_file;
                    } else if (ordinal == 1) {
                        i2 = R.string.support_chat_error_file_too_large;
                    } else {
                        if (ordinal != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        i2 = R.string.support_chat_error_unsupported_file_type;
                    }
                    String str3 = androidStringManager.get(i2);
                    int ordinal2 = fileError.ordinal();
                    if (ordinal2 == 0) {
                        str2 = androidStringManager.get(R.string.support_chat_error_invalid_file_message);
                    } else if (ordinal2 == 1) {
                        Object[] objArr = {new Long(chatPresenter.fileSizeLimitMb)};
                        Resources resources = androidStringManager.resources;
                        resources.getClass();
                        str2 = new MessageFormat(resources.getString(R.string.support_chat_error_file_too_large_message)).format(objArr);
                        str2.getClass();
                    } else {
                        if (ordinal2 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        str2 = androidStringManager.get(R.string.support_chat_error_unsupported_file_type_message);
                    }
                    chatPresenter.navigator.goTo(new SupportChatScreens.SupportChatDialogs.ChatErrorDialog(str3, str2));
                    return null;
                }
                FileMetadata fileMetadata = ((FileValidator$Result.Success) fileValidator$Result).metadata;
                if (!((Boolean) chatPresenter.shouldConvertImages$delegate.getValue()).booleanValue()) {
                    str.getClass();
                    imageFormatConverter$ConversionResult = new ImageFormatConverter$ConversionResult(str, fileMetadata);
                    TextSetter textSetter2 = chatPresenter.chatAccessibilityManager;
                    ((AndroidAccessibilityManager) textSetter2.textView).announceForAccessibility(((AndroidStringManager) textSetter2.textSwitcher).get(R.string.support_chat_a11y_announce_attachment_selected));
                    return new MessageBody.FileBody(imageFormatConverter$ConversionResult.metadata, imageFormatConverter$ConversionResult.uri, null);
                }
                EglCore eglCore = chatPresenter.imageFormatConverter;
                str.getClass();
                chatPresenter$validateFile$1.L$0 = null;
                chatPresenter$validateFile$1.label = 2;
                obj = eglCore.m3562convertIfNeeded5y75sic(str, fileMetadata, chatPresenter$validateFile$1);
            }
        }
        chatPresenter$validateFile$1 = new ChatPresenter$validateFile$1(chatPresenter, continuationImpl);
        Object obj2 = chatPresenter$validateFile$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatPresenter$validateFile$1.label;
        if (i != 0) {
        }
        fileValidator$Result = (FileValidator$Result) obj2;
        if (fileValidator$Result instanceof FileValidator$Result.Success) {
        }
    }

    public final void AnnounceMessagesForAccessibility(Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-13546270);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(this);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ChatPresenter$models$10$1(this, null, i3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkYouViewKt$$ExternalSyntheticLambda1(this, i, 3);
        }
    }

    public final void closeChat(boolean z) {
        if (this.canRequestNotificationPermission && z) {
            AndroidPermissionManager$create$1 create = this.permissionManager.create("android.permission.POST_NOTIFICATIONS");
            if (!create.$readonly.check()) {
                create.request();
            }
        }
        this.navigator.goTo(Back.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0955  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x099a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x09ea  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x09f2  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0a02  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0a0c  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0a12  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x09e0  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x08e6  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0a41  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0adc  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0ae5  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0b0f  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0b18  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0b31  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0b38  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0b59  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0b86  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0bc1  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0be2  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0c3c  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0bad  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0b7f  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0b1b  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0b0b  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0ad8  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x05b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0588 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:546:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04ba  */
    /* JADX WARN: Type inference failed for: r52v0, types: [app.cash.broadway.presenter.molecule.MoleculePresenter, com.squareup.cash.support.chat.presenters.ChatPresenter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r55v2 */
    /* JADX WARN: Type inference failed for: r55v3, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r55v5 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        Object obj;
        Object obj2;
        MutableState mutableState;
        Boolean bool;
        GapComposer gapComposer;
        Object obj3;
        final MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        Object obj4;
        boolean changed;
        Object rememberedValue;
        Object obj5;
        GapComposer gapComposer2;
        final MutableState mutableState5;
        Continuation continuation;
        MutableState mutableState6;
        final MutableState mutableState7;
        MutableState mutableState8;
        MutableState mutableState9;
        MutableState mutableState10;
        MutableState mutableState11;
        MutableState mutableState12;
        MutableState mutableState13;
        final MutableState mutableState14;
        MutableState mutableState15;
        GapComposer gapComposer3;
        Object rememberedValue2;
        Object obj6;
        Object rememberedValue3;
        boolean changedInstance;
        Object rememberedValue4;
        Object rememberedValue5;
        boolean changedInstance2;
        Object rememberedValue6;
        boolean changedInstance3;
        Object rememberedValue7;
        final MutableState mutableState16;
        boolean changed2;
        Object rememberedValue8;
        boolean changedInstance4;
        Object rememberedValue9;
        boolean changed3;
        Object rememberedValue10;
        String str;
        ChatPresenter chatPresenter;
        boolean z;
        Object rememberedValue11;
        Object rememberedValue12;
        Continuation continuation2;
        ?? r9;
        ChatState chatState;
        int ordinal;
        Object statusViewModel;
        ListIterator listIterator;
        ?? r55;
        int i2;
        ListIterator listIterator2;
        int i3;
        Iterator it;
        ChatContentViewModel.SuggestedRepliesViewModel suggestedRepliesViewModel;
        ChatContentViewModel.TypingIndicatorViewModel typingIndicatorViewModel;
        ChatContentViewModel.BottomBookmarkViewModel bottomBookmarkViewModel;
        boolean z2;
        MessageBody.FileBody fileBody;
        int i4;
        ChatAttachmentViewModel chatAttachmentViewModel;
        int i5;
        String str2;
        ChatMessageAction from;
        ChatViewModel.ScrollAction scrollAction;
        ChatViewModel.ScrollAction scrollAction2;
        boolean z3;
        Instant instant;
        ChatContentViewModel.TimestampDividerViewModel timestampDividerViewModel;
        Iterator it2;
        GapComposer gapComposer4;
        boolean z4;
        boolean z5;
        boolean z6;
        ChatContentViewModel.DisclaimerViewModel disclaimerViewModel;
        boolean z7;
        Boolean valueOf;
        Boolean bool2;
        RecordedMessage recordedMessage;
        String str3;
        ChatState chatState2;
        int i6;
        ArrayList arrayList;
        ViewModelKt viewModelKt;
        String str4;
        Image image;
        ColorModel.Accented accented;
        ViewModelKt viewModelKt2;
        BodyViewModel$ActionBodyViewModel.Action action;
        TimerScopeKt status;
        boolean z8;
        int ordinal2;
        ChatContentViewModel.EntryViewModel.Sender sender;
        char c;
        char c2;
        FileTypes fileTypes;
        FileTypes fileTypes2;
        boolean z9;
        ChatContentViewModel.DividerViewModel dividerViewModel;
        MessageBody.SystemMessageBody.Styling styling;
        MessageBody.SystemMessageBody.Styling styling2;
        String str5;
        RecordedMessage recordedMessage2;
        String str6;
        Continuation continuation3;
        boolean z10;
        SupportConversationPersistence supportConversationPersistence = this.conversationPersistence;
        flow.getClass();
        ?? r5 = (GapComposer) composer;
        r5.startReplaceGroup(1222733558);
        AnnounceMessagesForAccessibility(r5, (i >> 3) & 14);
        Object rememberedValue13 = r5.rememberedValue();
        Object obj7 = Composer.Companion.Empty;
        Continuation continuation4 = null;
        if (rememberedValue13 == obj7) {
            rememberedValue13 = Updater.mutableStateOf$default(null);
            r5.updateRememberedValue(rememberedValue13);
        }
        MutableState mutableState17 = (MutableState) rememberedValue13;
        Object rememberedValue14 = r5.rememberedValue();
        if (rememberedValue14 == obj7) {
            RealRecipientRepository$suggestions$$inlined$map$1 realRecipientRepository$suggestions$$inlined$map$1 = new RealRecipientRepository$suggestions$$inlined$map$1(this.activityLifecycleStates, 17);
            r5.updateRememberedValue(realRecipientRepository$suggestions$$inlined$map$1);
            rememberedValue14 = realRecipientRepository$suggestions$$inlined$map$1;
        }
        Boolean bool3 = Boolean.FALSE;
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue14, bool3, null, r5, 48, 2);
        Boolean bool4 = (Boolean) collectAsState.getValue();
        bool4.getClass();
        boolean changed4 = r5.changed(collectAsState) | r5.changedInstance(this);
        Object rememberedValue15 = r5.rememberedValue();
        int i7 = 8;
        if (changed4 || rememberedValue15 == obj7) {
            rememberedValue15 = new ArticlePresenter$models$1$1((MoleculePresenter) this, collectAsState, continuation4, i7);
            r5.updateRememberedValue(rememberedValue15);
        }
        Updater.LaunchedEffect((Composer) r5, bool4, (Function2) rememberedValue15);
        Object rememberedValue16 = r5.rememberedValue();
        if (rememberedValue16 == obj7) {
            rememberedValue16 = Updater.mutableStateOf$default(null);
            r5.updateRememberedValue(rememberedValue16);
        }
        MutableState mutableState18 = (MutableState) rememberedValue16;
        String str7 = (String) mutableState18.getValue();
        if (str7 != null) {
            r5.startReplaceGroup(-1106477359);
            Updater.LaunchedEffect((Composer) r5, str7, new TaxWebAppPresenter$models$1$1(str7, (Continuation) null, (ChatPresenter) this, mutableState18));
            r5.end(false);
        } else {
            r5.startReplaceGroup(-1106436997);
            r5.end(false);
        }
        Object rememberedValue17 = r5.rememberedValue();
        if (rememberedValue17 == obj7) {
            rememberedValue17 = Updater.mutableStateOf$default(bool3);
            r5.updateRememberedValue(rememberedValue17);
        }
        final MutableState mutableState19 = (MutableState) rememberedValue17;
        Object rememberedValue18 = r5.rememberedValue();
        if (rememberedValue18 == obj7) {
            rememberedValue18 = Updater.mutableStateOf$default(null);
            r5.updateRememberedValue(rememberedValue18);
        }
        final MutableState mutableState20 = (MutableState) rememberedValue18;
        Object[] objArr = new Object[0];
        Object rememberedValue19 = r5.rememberedValue();
        if (rememberedValue19 == obj7) {
            rememberedValue19 = new SheetKt$$ExternalSyntheticLambda9(6);
            r5.updateRememberedValue(rememberedValue19);
        }
        final MutableState mutableState21 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue19, r5, 48);
        Object rememberedValue20 = r5.rememberedValue();
        if (rememberedValue20 == obj7) {
            rememberedValue20 = Updater.mutableStateOf$default(EmptyList.INSTANCE);
            r5.updateRememberedValue(rememberedValue20);
        }
        final MutableState mutableState22 = (MutableState) rememberedValue20;
        Object rememberedValue21 = r5.rememberedValue();
        if (rememberedValue21 == obj7) {
            rememberedValue21 = Updater.mutableStateOf$default(Boolean.TRUE);
            r5.updateRememberedValue(rememberedValue21);
        }
        MutableState mutableState23 = (MutableState) rememberedValue21;
        Object rememberedValue22 = r5.rememberedValue();
        if (rememberedValue22 == obj7) {
            rememberedValue22 = Updater.mutableStateOf$default(null);
            r5.updateRememberedValue(rememberedValue22);
        }
        MutableState mutableState24 = (MutableState) rememberedValue22;
        Object rememberedValue23 = r5.rememberedValue();
        if (rememberedValue23 == obj7) {
            rememberedValue23 = Updater.mutableStateOf$default(bool3);
            r5.updateRememberedValue(rememberedValue23);
        }
        MutableState mutableState25 = (MutableState) rememberedValue23;
        Object[] objArr2 = new Object[0];
        Object rememberedValue24 = r5.rememberedValue();
        int i8 = 7;
        if (rememberedValue24 == obj7) {
            rememberedValue24 = new SheetKt$$ExternalSyntheticLambda9(i8);
            r5.updateRememberedValue(rememberedValue24);
        }
        MutableState mutableState26 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue24, r5, 48);
        Object[] objArr3 = new Object[0];
        Object rememberedValue25 = r5.rememberedValue();
        if (rememberedValue25 == obj7) {
            rememberedValue25 = new SheetKt$$ExternalSyntheticLambda9(i7);
            r5.updateRememberedValue(rememberedValue25);
        }
        final MutableState mutableState27 = (MutableState) SaverKt.rememberSaveable(objArr3, (Function0) rememberedValue25, r5, 48);
        Object rememberedValue26 = r5.rememberedValue();
        if (rememberedValue26 == obj7) {
            rememberedValue26 = supportConversationPersistence.hasUnreadMessages();
            r5.updateRememberedValue(rememberedValue26);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue26, bool3, null, r5, 48, 2);
        Object rememberedValue27 = r5.rememberedValue();
        if (rememberedValue27 == obj7) {
            rememberedValue27 = new RealRecipientRepository$suggestions$$inlined$map$1(supportConversationPersistence.lastReadMessageTokenKeyValue.observe(), 16);
            r5.updateRememberedValue(rememberedValue27);
        }
        final MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue27, null, null, r5, 48, 2);
        Object rememberedValue28 = r5.rememberedValue();
        int i9 = 24;
        int i10 = 2;
        if (rememberedValue28 == obj7) {
            RealRecipientRepository$suggestions$$inlined$map$1 realRecipientRepository$suggestions$$inlined$map$12 = new RealRecipientRepository$suggestions$$inlined$map$1(flow, 19);
            obj = obj7;
            rememberedValue28 = FlowKt.distinctUntilChanged(FlowKt.merge(new NullStateSwipeConfigProvider(realRecipientRepository$suggestions$$inlined$map$12, i9), new RealRecipientRepository$suggestions$$inlined$map$1(FlowKt.m4195debounceHG0u8IE(realRecipientRepository$suggestions$$inlined$map$12, this.chatAutomationDelayAfterTypingSec), 20)));
            r5.updateRememberedValue(rememberedValue28);
        } else {
            obj = obj7;
        }
        final MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue28, bool3, null, r5, 48, 2);
        Boolean bool5 = (Boolean) collectAsState.getValue();
        bool5.getClass();
        boolean changed5 = r5.changed(collectAsState) | r5.changedInstance(this) | r5.changed(collectAsState2);
        Object rememberedValue29 = r5.rememberedValue();
        if (changed5) {
            obj2 = obj;
        } else {
            obj2 = obj;
            if (rememberedValue29 != obj2) {
                mutableState = collectAsState2;
                obj4 = rememberedValue29;
                mutableState2 = mutableState17;
                gapComposer = r5;
                bool = bool5;
                obj3 = obj2;
                mutableState3 = mutableState24;
                mutableState4 = mutableState25;
                Updater.LaunchedEffect(gapComposer, bool, (Function2) obj4);
                changed = gapComposer.changed(((Boolean) mutableState19.getValue()).booleanValue()) | gapComposer.changed((MessageBody.FileBody) mutableState20.getValue()) | gapComposer.changed(((Boolean) collectAsState4.getValue()).booleanValue()) | gapComposer.changed((String) collectAsState3.getValue()) | gapComposer.changed(((Boolean) mutableState27.getValue()).booleanValue());
                rememberedValue = gapComposer.rememberedValue();
                if (!changed || rememberedValue == obj3) {
                    final Flow buffer$default = FlowKt.buffer$default(new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(this.conversationService.allMessages(), new RealTabProvider$setup$1$5(i10, null, 9), 1), 1, 2);
                    obj5 = obj3;
                    gapComposer2 = gapComposer;
                    mutableState5 = mutableState23;
                    continuation = null;
                    mutableState6 = mutableState18;
                    final MutableState mutableState28 = mutableState4;
                    mutableState7 = mutableState3;
                    Flow flow2 = new Flow() { // from class: com.squareup.cash.support.chat.presenters.ChatPresenter$models$lambda$43$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public final Object collect(FlowCollector flowCollector, Continuation continuation5) {
                            Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this, mutableState22, collectAsState3, mutableState2, collectAsState4, mutableState28, mutableState19, mutableState20, mutableState5, mutableState27, mutableState7), continuation5);
                            return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
                        }

                        /* renamed from: com.squareup.cash.support.chat.presenters.ChatPresenter$models$lambda$43$$inlined$map$1$2, reason: invalid class name */
                        public final class AnonymousClass2 implements FlowCollector {
                            public final /* synthetic */ State $conversation$delegate$inlined;
                            public final /* synthetic */ MutableState $currentMessages$delegate$inlined;
                            public final /* synthetic */ Object $fileAttachment$delegate$inlined;
                            public final /* synthetic */ State $hasAcceptedHandover$delegate$inlined;
                            public final /* synthetic */ MutableState $hasInput$delegate$inlined;
                            public final /* synthetic */ MutableState $isShowingTypingIndicator$delegate$inlined;
                            public final /* synthetic */ MutableState $isUserTyping$delegate$inlined;
                            public final /* synthetic */ State $lastItemVisible$delegate$inlined;
                            public final /* synthetic */ MutableState $lastMessageSentTimestamp$delegate$inlined;
                            public final /* synthetic */ MutableState $lastReadMessageToken$delegate$inlined;
                            public final /* synthetic */ int $r8$classId = 1;
                            public final /* synthetic */ Object $this_unsafeFlow;
                            public final /* synthetic */ Object this$0;

                            /* renamed from: com.squareup.cash.support.chat.presenters.ChatPresenter$models$lambda$43$$inlined$map$1$2$1, reason: invalid class name */
                            public final class AnonymousClass1 extends ContinuationImpl {
                                public int I$0;
                                public String L$10;
                                public FlowCollector L$4;
                                public Transcript L$6;
                                public List L$7;
                                public List L$8;
                                public boolean Z$0;
                                public boolean Z$1;
                                public boolean Z$2;
                                public int label;
                                public /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= PKIFailureInfo.systemUnavail;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(CoroutineScope coroutineScope, WithdrawPresenter withdrawPresenter, WithdrawViewModel.DepositPreferenceOption depositPreferenceOption, CurrencyCode currencyCode, State state, MutableState mutableState, MutableState mutableState2, State state2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, State state3, MutableState mutableState6) {
                                this.$this_unsafeFlow = withdrawPresenter;
                                this.this$0 = depositPreferenceOption;
                                this.$fileAttachment$delegate$inlined = currencyCode;
                                this.$lastItemVisible$delegate$inlined = state;
                                this.$currentMessages$delegate$inlined = mutableState;
                                this.$lastReadMessageToken$delegate$inlined = mutableState2;
                                this.$hasAcceptedHandover$delegate$inlined = state2;
                                this.$lastMessageSentTimestamp$delegate$inlined = mutableState3;
                                this.$isUserTyping$delegate$inlined = mutableState4;
                                this.$isShowingTypingIndicator$delegate$inlined = mutableState5;
                                this.$conversation$delegate$inlined = state3;
                                this.$hasInput$delegate$inlined = mutableState6;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:182:0x07ab, code lost:
                            
                                if (r2.emit(r29, r14) != r10) goto L271;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:248:0x065a, code lost:
                            
                                if (r2 == false) goto L195;
                             */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:136:0x034c  */
                            /* JADX WARN: Removed duplicated region for block: B:150:0x06f4  */
                            /* JADX WARN: Removed duplicated region for block: B:161:0x070f  */
                            /* JADX WARN: Removed duplicated region for block: B:172:0x072e  */
                            /* JADX WARN: Removed duplicated region for block: B:180:0x0755  */
                            /* JADX WARN: Removed duplicated region for block: B:185:0x0747  */
                            /* JADX WARN: Removed duplicated region for block: B:187:0x0741 A[SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:189:0x039c  */
                            /* JADX WARN: Removed duplicated region for block: B:213:0x06a5  */
                            /* JADX WARN: Removed duplicated region for block: B:230:0x062c  */
                            /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r3v48, types: [java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r7v5 */
                            /* JADX WARN: Type inference failed for: r7v6 */
                            /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                MutableState mutableState;
                                AnonymousClass1 anonymousClass1;
                                int i;
                                Object obj2;
                                MutableState mutableState2;
                                Object obj3;
                                MutableState mutableState3;
                                MutableState mutableState4;
                                State state;
                                Pair pair;
                                List list;
                                List list2;
                                FlowCollector flowCollector;
                                CoroutineSingletons coroutineSingletons;
                                Transcript transcript;
                                boolean z;
                                State state2;
                                Instant instant;
                                Conversation.BotStatus botStatus;
                                com.squareup.kotterknife.Lazy lazy;
                                boolean booleanValue;
                                RealFeatureFlagManager realFeatureFlagManager;
                                FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options;
                                Message message;
                                Conversation.BotStatus botStatus2;
                                boolean z2;
                                String str;
                                FlowCollector flowCollector2;
                                Transcript transcript2;
                                int i2;
                                Object savedInput;
                                CoroutineSingletons coroutineSingletons2;
                                List list3;
                                boolean z3;
                                Object obj4;
                                int i3;
                                boolean z4;
                                boolean z5;
                                List list4;
                                List list5;
                                Iterator it;
                                ListIterator listIterator;
                                int i4;
                                List list6;
                                Instrument instrument;
                                CashOutCapabilityManager$CashOutCapabilities.InstrumentCapability instrumentCapability;
                                boolean z6;
                                List list7;
                                CashOutCapabilityManager$CashOutCapabilities.InstrumentCapability instrumentCapability2;
                                WithdrawViewModel.DepositPreferenceOption depositPreferenceOption;
                                int i5 = this.$r8$classId;
                                State state3 = this.$conversation$delegate$inlined;
                                MutableState mutableState5 = this.$isShowingTypingIndicator$delegate$inlined;
                                Object obj5 = this.$fileAttachment$delegate$inlined;
                                Object obj6 = this.this$0;
                                Object obj7 = this.$this_unsafeFlow;
                                MutableState mutableState6 = this.$currentMessages$delegate$inlined;
                                MutableState mutableState7 = this.$lastReadMessageToken$delegate$inlined;
                                State state4 = this.$lastItemVisible$delegate$inlined;
                                MutableState mutableState8 = this.$lastMessageSentTimestamp$delegate$inlined;
                                State state5 = this.$hasAcceptedHandover$delegate$inlined;
                                MutableState mutableState9 = this.$isUserTyping$delegate$inlined;
                                MutableState mutableState10 = this.$hasInput$delegate$inlined;
                                switch (i5) {
                                    case 0:
                                        ChatPresenter chatPresenter = (ChatPresenter) obj6;
                                        Analytics analytics = chatPresenter.analytics;
                                        SupportChatScreens.FlowScreen.ChatScreen chatScreen = chatPresenter.args;
                                        if (continuation instanceof AnonymousClass1) {
                                            anonymousClass1 = (AnonymousClass1) continuation;
                                            mutableState = mutableState9;
                                            int i6 = anonymousClass1.label;
                                            if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                                                anonymousClass1.label = i6 - PKIFailureInfo.systemUnavail;
                                                Object obj8 = anonymousClass1.result;
                                                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                i = anonymousClass1.label;
                                                if (i == 0) {
                                                    if (i != 1) {
                                                        if (i == 2) {
                                                            SafeTrace.throwOnFailure(obj8);
                                                            break;
                                                        } else {
                                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                                            break;
                                                        }
                                                    } else {
                                                        boolean z7 = anonymousClass1.Z$2;
                                                        boolean z8 = anonymousClass1.Z$1;
                                                        boolean z9 = anonymousClass1.Z$0;
                                                        int i7 = anonymousClass1.I$0;
                                                        str = anonymousClass1.L$10;
                                                        List list8 = anonymousClass1.L$8;
                                                        List list9 = anonymousClass1.L$7;
                                                        Transcript transcript3 = anonymousClass1.L$6;
                                                        FlowCollector flowCollector3 = anonymousClass1.L$4;
                                                        SafeTrace.throwOnFailure(obj8);
                                                        z4 = z8;
                                                        z5 = z9;
                                                        list3 = list8;
                                                        state = state4;
                                                        list4 = list9;
                                                        state2 = state5;
                                                        z3 = z7;
                                                        transcript2 = transcript3;
                                                        flowCollector2 = flowCollector3;
                                                        mutableState2 = mutableState6;
                                                        mutableState3 = mutableState7;
                                                        obj4 = obj8;
                                                        coroutineSingletons2 = coroutineSingletons3;
                                                        i3 = i7;
                                                        obj2 = obj5;
                                                        i2 = 0;
                                                        String str2 = str;
                                                        String str3 = (String) obj4;
                                                        String str4 = ChatPresenter.ALLOWED_FILE_MIME_TYPES_REGEX;
                                                        List list10 = (List) mutableState2.getValue();
                                                        PagingStatus pagingStatus = transcript2.pagingStatus;
                                                        MessageBody.FileBody fileBody = (MessageBody.FileBody) ((MutableState) obj2).getValue();
                                                        boolean booleanValue2 = ((Boolean) mutableState.getValue()).booleanValue();
                                                        Conversation conversation = transcript2.conversation;
                                                        String str5 = (String) mutableState3.getValue();
                                                        ArrayList arrayList = new ArrayList();
                                                        for (Object obj9 : list4) {
                                                            if (obj9 instanceof RecordedMessage) {
                                                                arrayList.add(obj9);
                                                            }
                                                        }
                                                        ArrayList arrayList2 = new ArrayList();
                                                        it = arrayList.iterator();
                                                        while (it.hasNext()) {
                                                            Object next = it.next();
                                                            if (!(((RecordedMessage) next).body instanceof MessageBody.SystemMessageBody)) {
                                                                arrayList2.add(next);
                                                            }
                                                        }
                                                        listIterator = arrayList2.listIterator(arrayList2.size());
                                                        while (true) {
                                                            if (listIterator.hasPrevious()) {
                                                                i4 = -1;
                                                            } else if (Intrinsics.areEqual(((RecordedMessage) listIterator.previous()).messageToken, str5)) {
                                                                i4 = listIterator.nextIndex();
                                                            }
                                                        }
                                                        if (i4 >= 0) {
                                                            i2 = (arrayList2.size() - i4) - 1;
                                                        }
                                                        int i8 = i2;
                                                        list6 = chatScreen.ignoredPhrases;
                                                        if (list6 == null) {
                                                            list6 = EmptyList.INSTANCE;
                                                        }
                                                        ChatState chatState = new ChatState(list4, list10, false, list3, z3, pagingStatus, fileBody, str2, str3, booleanValue2, conversation, i8, list6, ((Boolean) ((MutableState) state).getValue()).booleanValue(), z5, z4, ((Boolean) chatPresenter.shouldDisableCashbotFileUpload$delegate.getValue()).booleanValue(), ((Boolean) ((MutableState) state2).getValue()).booleanValue());
                                                        ((MutableState) state3).setValue(transcript2.conversation);
                                                        anonymousClass1.L$4 = null;
                                                        anonymousClass1.L$6 = null;
                                                        anonymousClass1.L$7 = null;
                                                        anonymousClass1.L$8 = null;
                                                        anonymousClass1.L$10 = null;
                                                        anonymousClass1.I$0 = i3;
                                                        anonymousClass1.label = 2;
                                                        break;
                                                    }
                                                } else {
                                                    SafeTrace.throwOnFailure(obj8);
                                                    FlowCollector flowCollector4 = (FlowCollector) obj7;
                                                    Transcript transcript4 = (Transcript) obj;
                                                    List list11 = transcript4.messages;
                                                    obj2 = obj5;
                                                    Conversation conversation2 = transcript4.conversation;
                                                    String str6 = ChatPresenter.ALLOWED_FILE_MIME_TYPES_REGEX;
                                                    if (list11 != null) {
                                                        mutableState2 = mutableState6;
                                                        obj3 = (Message) CollectionsKt.lastOrNull(list11);
                                                    } else {
                                                        mutableState2 = mutableState6;
                                                        obj3 = null;
                                                    }
                                                    mutableState3 = mutableState7;
                                                    if (obj3 instanceof RecordedMessage) {
                                                        ArrayList arrayList3 = ((RecordedMessage) obj3).suggestedReplies;
                                                        mutableState4 = mutableState10;
                                                        state = state4;
                                                        pair = new Pair(arrayList3, Boolean.valueOf(arrayList3.size() <= 2));
                                                    } else {
                                                        mutableState4 = mutableState10;
                                                        state = state4;
                                                        pair = new Pair(EmptyList.INSTANCE, Boolean.FALSE);
                                                    }
                                                    List list12 = (List) pair.first;
                                                    boolean booleanValue3 = ((Boolean) pair.second).booleanValue();
                                                    ChatMessageAction from = RealEmojiDetector.from((List) mutableState2.getValue(), list11);
                                                    if (from instanceof ChatMessageAction.InitialMessageLoaded) {
                                                        if (((String) mutableState3.getValue()) == null) {
                                                            list5 = list11;
                                                        } else if (list11.isEmpty()) {
                                                            list5 = EmptyList.INSTANCE;
                                                        } else {
                                                            ListIterator listIterator2 = list11.listIterator(list11.size());
                                                            while (true) {
                                                                if (!listIterator2.hasPrevious()) {
                                                                    list5 = CollectionsKt.toList(list11);
                                                                } else if (Intrinsics.areEqual(SessionWorkerKt.getMessageToken((Message) listIterator2.previous()), (String) mutableState3.getValue())) {
                                                                    listIterator2.next();
                                                                    int size = list11.size() - listIterator2.nextIndex();
                                                                    if (size == 0) {
                                                                        list5 = EmptyList.INSTANCE;
                                                                    } else {
                                                                        ArrayList arrayList4 = new ArrayList(size);
                                                                        while (listIterator2.hasNext()) {
                                                                            arrayList4.add(listIterator2.next());
                                                                        }
                                                                        list5 = arrayList4;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        PointKt.logReceivedMessageActions(analytics, list5, chatScreen.flowToken);
                                                    } else if (from instanceof ChatMessageAction.NewMessageLoaded) {
                                                        List list13 = ((ChatMessageAction.NewMessageLoaded) from).newMessages;
                                                        Message message2 = (Message) CollectionsKt.first(list13);
                                                        list = list11;
                                                        list2 = list12;
                                                        if (message2.getSender() == Message.Sender.CUSTOMER || (instant = (Instant) mutableState8.getValue()) == null) {
                                                            flowCollector = flowCollector4;
                                                            coroutineSingletons = coroutineSingletons3;
                                                            transcript = transcript4;
                                                            z = booleanValue3;
                                                            state2 = state5;
                                                        } else {
                                                            RealObservabilityManager realObservabilityManager = chatPresenter.observabilityManager;
                                                            long epochMilli = instant.toEpochMilli() * 1000;
                                                            if (conversation2 == null || (botStatus = conversation2.botStatus) == null) {
                                                                botStatus = Conversation.BotStatus.UNKNOWN;
                                                            }
                                                            SpanTracking startTrackingSpan$default = RealObservabilityManager.startTrackingSpan$default(realObservabilityManager, UUID.randomUUID().toString(), "receive_new_support_chat_messages", null, Long.valueOf(epochMilli), 4);
                                                            Conversation.BotStatus botStatus3 = botStatus;
                                                            state2 = state5;
                                                            Pair pair2 = new Pair("end_kind", "receive_new_message");
                                                            coroutineSingletons = coroutineSingletons3;
                                                            Pair pair3 = new Pair("sender", message2.getSender().toString());
                                                            String messageToken = SessionWorkerKt.getMessageToken(message2);
                                                            if (messageToken == null) {
                                                                messageToken = "";
                                                            }
                                                            z = booleanValue3;
                                                            transcript = transcript4;
                                                            flowCollector = flowCollector4;
                                                            SpanTracking.spanEnded$default(startTrackingSpan$default, MapsKt__MapsKt.mapOf(pair2, pair3, new Pair("message_token", messageToken), new Pair("message_timestamp", message2.getTimestamp().toString()), new Pair("bot_status", botStatus3.toString())), 1);
                                                            mutableState8.setValue(null);
                                                        }
                                                        Message message3 = (Message) CollectionsKt.last(list13);
                                                        if (message3 instanceof RecordedMessage) {
                                                            RecordedMessage recordedMessage = (RecordedMessage) message3;
                                                            ArrayList arrayList5 = recordedMessage.suggestedReplies;
                                                            if (!arrayList5.isEmpty()) {
                                                                String str7 = chatScreen.flowToken;
                                                                String str8 = recordedMessage.messageToken;
                                                                Message.Sender sender = recordedMessage.sender;
                                                                Integer valueOf = Integer.valueOf(arrayList5.size());
                                                                ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
                                                                Iterator it2 = arrayList5.iterator();
                                                                while (it2.hasNext()) {
                                                                    arrayList6.add(((SuggestedReply) it2.next()).token);
                                                                }
                                                                analytics.track(new CustomerSupportChatReceivedSuggestedReplies(valueOf, str7, str8, CollectionsKt.joinToString$default(arrayList6, ",", null, null, 0, null, null, 62), PointKt.toCdfSender(sender)), null);
                                                            }
                                                        }
                                                        PointKt.logReceivedMessageActions(analytics, list13, chatScreen.flowToken);
                                                        lazy = chatPresenter.typingIndicatorHelper;
                                                        boolean booleanValue4 = ((Boolean) mutableState.getValue()).booleanValue();
                                                        booleanValue = ((Boolean) mutableState5.getValue()).booleanValue();
                                                        lazy.getClass();
                                                        realFeatureFlagManager = (RealFeatureFlagManager) ((FeatureFlagManager) lazy.initializer);
                                                        featureFlag$EnabledDisabledAmplitudeExperiment$Options = (FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$ClientSupportAutomationChatBotTypingBubble.INSTANCE);
                                                        featureFlag$EnabledDisabledAmplitudeExperiment$Options.getClass();
                                                        if (featureFlag$EnabledDisabledAmplitudeExperiment$Options != FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled && (message = (Message) CollectionsKt.lastOrNull(list)) != null && conversation2 != null && (botStatus2 = conversation2.botStatus) != null && ((botStatus2 == Conversation.BotStatus.READY || botStatus2 == Conversation.BotStatus.ACTIVE) && message.getSender() == Message.Sender.CUSTOMER && (booleanValue || Intrinsics.areEqual(message.getStatus(), MessageStatus$Recorded.INSTANCE)))) {
                                                            if (java.time.Duration.between(message.getTimestamp(), DimensionKt.now((AndroidClock) lazy.value)).getSeconds() <= ((FeatureFlag$LongFeatureFlag.Value) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$SupportChatPollingInterval.INSTANCE)).value * 2) {
                                                                MessageBody body = message.getBody();
                                                                if (!(body instanceof MessageBody.SelectedReplyBody) && !(body instanceof MessageBody.TransactionBody) && !(body instanceof MessageBody.ActivityItemTransactionBody)) {
                                                                    if (!(body instanceof MessageBody.TextBody) && !(body instanceof MessageBody.FileBody)) {
                                                                        if (!(body instanceof MessageBody.ActionBody) && !(body instanceof MessageBody.SystemMessageBody) && !(body instanceof MessageBody.UnknownBody)) {
                                                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                            break;
                                                                        }
                                                                    } else if (booleanValue4) {
                                                                    }
                                                                }
                                                                z2 = true;
                                                                mutableState5.setValue(Boolean.valueOf(z2));
                                                                boolean booleanValue5 = ((Boolean) mutableState4.getValue()).booleanValue();
                                                                str = (String) mutableState3.getValue();
                                                                SupportConversationPersistence supportConversationPersistence = chatPresenter.conversationPersistence;
                                                                flowCollector2 = flowCollector;
                                                                anonymousClass1.L$4 = flowCollector2;
                                                                transcript2 = transcript;
                                                                anonymousClass1.L$6 = transcript2;
                                                                anonymousClass1.L$7 = list;
                                                                anonymousClass1.L$8 = list2;
                                                                anonymousClass1.L$10 = str;
                                                                i2 = 0;
                                                                anonymousClass1.I$0 = 0;
                                                                boolean z10 = z;
                                                                anonymousClass1.Z$0 = z10;
                                                                anonymousClass1.Z$1 = z2;
                                                                anonymousClass1.Z$2 = booleanValue5;
                                                                anonymousClass1.label = 1;
                                                                savedInput = supportConversationPersistence.getSavedInput(anonymousClass1);
                                                                coroutineSingletons2 = coroutineSingletons;
                                                                if (savedInput != coroutineSingletons2) {
                                                                    list3 = list2;
                                                                    z3 = booleanValue5;
                                                                    obj4 = savedInput;
                                                                    i3 = 0;
                                                                    z4 = z2;
                                                                    z5 = z10;
                                                                    list4 = list;
                                                                    String str22 = str;
                                                                    String str32 = (String) obj4;
                                                                    String str42 = ChatPresenter.ALLOWED_FILE_MIME_TYPES_REGEX;
                                                                    List list102 = (List) mutableState2.getValue();
                                                                    PagingStatus pagingStatus2 = transcript2.pagingStatus;
                                                                    MessageBody.FileBody fileBody2 = (MessageBody.FileBody) ((MutableState) obj2).getValue();
                                                                    boolean booleanValue22 = ((Boolean) mutableState.getValue()).booleanValue();
                                                                    Conversation conversation3 = transcript2.conversation;
                                                                    String str52 = (String) mutableState3.getValue();
                                                                    ArrayList arrayList7 = new ArrayList();
                                                                    while (r9.hasNext()) {
                                                                    }
                                                                    ArrayList arrayList22 = new ArrayList();
                                                                    it = arrayList7.iterator();
                                                                    while (it.hasNext()) {
                                                                    }
                                                                    listIterator = arrayList22.listIterator(arrayList22.size());
                                                                    while (true) {
                                                                        if (listIterator.hasPrevious()) {
                                                                        }
                                                                    }
                                                                    if (i4 >= 0) {
                                                                    }
                                                                    int i82 = i2;
                                                                    list6 = chatScreen.ignoredPhrases;
                                                                    if (list6 == null) {
                                                                    }
                                                                    ChatState chatState2 = new ChatState(list4, list102, false, list3, z3, pagingStatus2, fileBody2, str22, str32, booleanValue22, conversation3, i82, list6, ((Boolean) ((MutableState) state).getValue()).booleanValue(), z5, z4, ((Boolean) chatPresenter.shouldDisableCashbotFileUpload$delegate.getValue()).booleanValue(), ((Boolean) ((MutableState) state2).getValue()).booleanValue());
                                                                    ((MutableState) state3).setValue(transcript2.conversation);
                                                                    anonymousClass1.L$4 = null;
                                                                    anonymousClass1.L$6 = null;
                                                                    anonymousClass1.L$7 = null;
                                                                    anonymousClass1.L$8 = null;
                                                                    anonymousClass1.L$10 = null;
                                                                    anonymousClass1.I$0 = i3;
                                                                    anonymousClass1.label = 2;
                                                                }
                                                                break;
                                                            }
                                                        }
                                                        z2 = false;
                                                        mutableState5.setValue(Boolean.valueOf(z2));
                                                        boolean booleanValue52 = ((Boolean) mutableState4.getValue()).booleanValue();
                                                        str = (String) mutableState3.getValue();
                                                        SupportConversationPersistence supportConversationPersistence2 = chatPresenter.conversationPersistence;
                                                        flowCollector2 = flowCollector;
                                                        anonymousClass1.L$4 = flowCollector2;
                                                        transcript2 = transcript;
                                                        anonymousClass1.L$6 = transcript2;
                                                        anonymousClass1.L$7 = list;
                                                        anonymousClass1.L$8 = list2;
                                                        anonymousClass1.L$10 = str;
                                                        i2 = 0;
                                                        anonymousClass1.I$0 = 0;
                                                        boolean z102 = z;
                                                        anonymousClass1.Z$0 = z102;
                                                        anonymousClass1.Z$1 = z2;
                                                        anonymousClass1.Z$2 = booleanValue52;
                                                        anonymousClass1.label = 1;
                                                        savedInput = supportConversationPersistence2.getSavedInput(anonymousClass1);
                                                        coroutineSingletons2 = coroutineSingletons;
                                                        if (savedInput != coroutineSingletons2) {
                                                        }
                                                    }
                                                    flowCollector = flowCollector4;
                                                    coroutineSingletons = coroutineSingletons3;
                                                    transcript = transcript4;
                                                    list = list11;
                                                    z = booleanValue3;
                                                    list2 = list12;
                                                    state2 = state5;
                                                    lazy = chatPresenter.typingIndicatorHelper;
                                                    boolean booleanValue42 = ((Boolean) mutableState.getValue()).booleanValue();
                                                    booleanValue = ((Boolean) mutableState5.getValue()).booleanValue();
                                                    lazy.getClass();
                                                    realFeatureFlagManager = (RealFeatureFlagManager) ((FeatureFlagManager) lazy.initializer);
                                                    featureFlag$EnabledDisabledAmplitudeExperiment$Options = (FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$ClientSupportAutomationChatBotTypingBubble.INSTANCE);
                                                    featureFlag$EnabledDisabledAmplitudeExperiment$Options.getClass();
                                                    if (featureFlag$EnabledDisabledAmplitudeExperiment$Options != FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled) {
                                                        if (java.time.Duration.between(message.getTimestamp(), DimensionKt.now((AndroidClock) lazy.value)).getSeconds() <= ((FeatureFlag$LongFeatureFlag.Value) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$SupportChatPollingInterval.INSTANCE)).value * 2) {
                                                        }
                                                    }
                                                    z2 = false;
                                                    mutableState5.setValue(Boolean.valueOf(z2));
                                                    boolean booleanValue522 = ((Boolean) mutableState4.getValue()).booleanValue();
                                                    str = (String) mutableState3.getValue();
                                                    SupportConversationPersistence supportConversationPersistence22 = chatPresenter.conversationPersistence;
                                                    flowCollector2 = flowCollector;
                                                    anonymousClass1.L$4 = flowCollector2;
                                                    transcript2 = transcript;
                                                    anonymousClass1.L$6 = transcript2;
                                                    anonymousClass1.L$7 = list;
                                                    anonymousClass1.L$8 = list2;
                                                    anonymousClass1.L$10 = str;
                                                    i2 = 0;
                                                    anonymousClass1.I$0 = 0;
                                                    boolean z1022 = z;
                                                    anonymousClass1.Z$0 = z1022;
                                                    anonymousClass1.Z$1 = z2;
                                                    anonymousClass1.Z$2 = booleanValue522;
                                                    anonymousClass1.label = 1;
                                                    savedInput = supportConversationPersistence22.getSavedInput(anonymousClass1);
                                                    coroutineSingletons2 = coroutineSingletons;
                                                    if (savedInput != coroutineSingletons2) {
                                                    }
                                                }
                                            }
                                        } else {
                                            mutableState = mutableState9;
                                        }
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                        Object obj82 = anonymousClass1.result;
                                        CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i = anonymousClass1.label;
                                        if (i == 0) {
                                        }
                                        break;
                                    default:
                                        WithdrawPresenter withdrawPresenter = (WithdrawPresenter) obj7;
                                        BetterNavigator.ScreenNavigator screenNavigator = withdrawPresenter.navigator;
                                        Analytics analytics2 = withdrawPresenter.analytics;
                                        WithdrawScreen withdrawScreen = withdrawPresenter.args;
                                        WithdrawViewEvent withdrawViewEvent = (WithdrawViewEvent) obj;
                                        if (Intrinsics.areEqual(withdrawViewEvent, WithdrawViewEvent.CloseClick.INSTANCE)) {
                                            analytics2.track(new CashWithdrawCancel(withdrawScreen.blockersData.flowToken), null);
                                            screenNavigator.goTo(Back.INSTANCE);
                                        } else if (withdrawViewEvent instanceof WithdrawViewEvent.ChangeInstrumentClick) {
                                            Instrument instrument2 = (Instrument) state4.getValue();
                                            if (instrument2 == null) {
                                                a$$ExternalSyntheticBUOutline0.m$3("Withdraw instrument was null when tapping instrument selector");
                                                break;
                                            } else {
                                                analytics2.track(new CashWithdrawSelectInstrument(withdrawScreen.blockersData.flowToken, NavArgumentKt.toCdfInstrumentType(instrument2.cashInstrumentType)), null);
                                                withdrawPresenter.navigator.goTo(new InstrumentSelectionLoadingScreen(BlockersData.copy$default(withdrawPresenter.args.blockersData, null, null, null, null, null, null, new TransfersRouterScreen(WithdrawScreen.copy$default(withdrawPresenter.args, null, r1, instrument2.token, r55 != null ? r7.depositPreference : null, 1)), null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -65, 65535), new InstrumentSelectionLoadingScreen.InstrumentSelectionParams.Withdraw((Money) mutableState6.getValue(), instrument2.token, r55 != null ? ((WithdrawViewModel.DepositPreferenceOption) obj6).depositPreference : null)));
                                            }
                                        } else if (withdrawViewEvent instanceof WithdrawViewEvent.OnAmountChanged) {
                                            Money parseMoneyFromString$default = Moneys.parseMoneyFromString$default(((WithdrawViewEvent.OnAmountChanged) withdrawViewEvent).amount, (CurrencyCode) obj5);
                                            mutableState6.setValue(parseMoneyFromString$default);
                                            WithdrawViewModel.DepositPreferenceOption depositPreferenceOption2 = (WithdrawViewModel.DepositPreferenceOption) mutableState7.getValue();
                                            DepositPreference depositPreference = depositPreferenceOption2 != null ? depositPreferenceOption2.depositPreference : null;
                                            if (depositPreference != null) {
                                                Iterator it3 = WithdrawPresenter.models$depositPreferenceOptionsFor(withdrawPresenter, state4, state5, parseMoneyFromString$default).iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        ?? next2 = it3.next();
                                                        if (((WithdrawViewModel.DepositPreferenceOption) next2).depositPreference == depositPreference) {
                                                            depositPreferenceOption = next2;
                                                        }
                                                    } else {
                                                        depositPreferenceOption = null;
                                                    }
                                                }
                                                WithdrawViewModel.DepositPreferenceOption depositPreferenceOption3 = depositPreferenceOption;
                                                if (depositPreferenceOption3 == null) {
                                                    depositPreferenceOption3 = (WithdrawViewModel.DepositPreferenceOption) mutableState7.getValue();
                                                }
                                                mutableState7.setValue(depositPreferenceOption3);
                                            }
                                        } else if (withdrawViewEvent instanceof WithdrawViewEvent.Expanded) {
                                            analytics2.track(new CashWithdrawViewKeypad(withdrawScreen.blockersData.flowToken), null);
                                            mutableState8.setValue((Money) mutableState6.getValue());
                                            mutableState9.setValue(WithdrawPresenter.InputMode.CHANGE_AMOUNT);
                                        } else if (withdrawViewEvent instanceof WithdrawViewEvent.Peeking) {
                                            mutableState9.setValue(WithdrawPresenter.InputMode.VIEW_AMOUNT);
                                        } else if (withdrawViewEvent instanceof WithdrawViewEvent.DepositPreferenceClick) {
                                            String str9 = withdrawScreen.blockersData.flowToken;
                                            WithdrawViewEvent.DepositPreferenceClick depositPreferenceClick = (WithdrawViewEvent.DepositPreferenceClick) withdrawViewEvent;
                                            WithdrawViewModel.DepositPreferenceOption depositPreferenceOption4 = depositPreferenceClick.depositPreferenceOption;
                                            String upperCase = depositPreferenceOption4.depositPreference.name().toUpperCase(Locale.ROOT);
                                            upperCase.getClass();
                                            analytics2.track(new CashWithdrawDepositPreferenceSelected(upperCase, str9), null);
                                            mutableState7.setValue(depositPreferenceOption4);
                                            mutableState5.setValue(((RealSecuritySignalsAggregator) withdrawPresenter.securitySignalsAggregator).buildSignalsContext(depositPreferenceClick.signalsContext));
                                            WithdrawViewModel.DepositPreferenceOption depositPreferenceOption5 = (WithdrawViewModel.DepositPreferenceOption) mutableState7.getValue();
                                            depositPreferenceOption5.getClass();
                                            if (!depositPreferenceOption5.enabled) {
                                                List list14 = (List) state3.getValue();
                                                ArrayList arrayList8 = new ArrayList();
                                                for (Object obj10 : list14) {
                                                    String str10 = ((Instrument) obj10).token;
                                                    Instrument instrument3 = (Instrument) state4.getValue();
                                                    if (!Intrinsics.areEqual(str10, instrument3 != null ? instrument3.token : null)) {
                                                        arrayList8.add(obj10);
                                                    }
                                                }
                                                Iterator it4 = arrayList8.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        ?? next3 = it4.next();
                                                        Instrument instrument4 = (Instrument) next3;
                                                        WithdrawViewModel.DepositPreferenceOption depositPreferenceOption6 = (WithdrawViewModel.DepositPreferenceOption) mutableState7.getValue();
                                                        depositPreferenceOption6.getClass();
                                                        DepositPreference depositPreference2 = depositPreferenceOption6.depositPreference;
                                                        CashOutCapabilityManager$CashOutCapabilities cashOutCapabilityManager$CashOutCapabilities = (CashOutCapabilityManager$CashOutCapabilities) state5.getValue();
                                                        if (cashOutCapabilityManager$CashOutCapabilities != null) {
                                                            Iterator it5 = cashOutCapabilityManager$CashOutCapabilities.capabilities.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    instrumentCapability2 = it5.next();
                                                                    if (((CashOutCapabilityManager$CashOutCapabilities.InstrumentCapability) instrumentCapability2).instrumentType == instrument4.cashInstrumentType) {
                                                                    }
                                                                } else {
                                                                    instrumentCapability2 = 0;
                                                                }
                                                            }
                                                            instrumentCapability = instrumentCapability2;
                                                        } else {
                                                            instrumentCapability = null;
                                                        }
                                                        CashOutCapabilityManager$CashOutCapabilities.QualifiedCapability findQualifiedCapability = instrumentCapability != null ? UtilsKt.findQualifiedCapability(instrumentCapability, instrument4) : null;
                                                        if (findQualifiedCapability == null || (list7 = findQualifiedCapability.supportedFlows) == null) {
                                                            z6 = false;
                                                        } else {
                                                            int i9 = WithdrawPresenter.WhenMappings.$EnumSwitchMapping$1[depositPreference2.ordinal()];
                                                            z6 = i9 != 1 ? i9 != 2 ? true : list7.contains(SupportedFlows.STANDARD_CASH_OUT) : list7.contains(SupportedFlows.INSTANT_CASH_OUT);
                                                        }
                                                        if (z6) {
                                                            instrument = next3;
                                                        }
                                                    } else {
                                                        instrument = null;
                                                    }
                                                }
                                                if (instrument != null) {
                                                    Money money = (Money) mutableState6.getValue();
                                                    Instrument instrument5 = (Instrument) state4.getValue();
                                                    instrument5.getClass();
                                                    withdrawPresenter.navigator.goTo(new InstrumentSelectionLoadingScreen(BlockersData.copy$default(withdrawPresenter.args.blockersData, null, null, null, null, null, null, new TransfersRouterScreen(WithdrawScreen.copy$default(withdrawPresenter.args, null, money, instrument5.token, r55 != null ? r2.depositPreference : null, 1)), null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -65, 65535), new InstrumentSelectionLoadingScreen.InstrumentSelectionParams.Withdraw(money, instrument5.token, r55 != null ? ((WithdrawViewModel.DepositPreferenceOption) mutableState7.getValue()).depositPreference : null)));
                                                } else {
                                                    Money money2 = (Money) mutableState6.getValue();
                                                    WithdrawViewModel.DepositPreferenceOption depositPreferenceOption7 = (WithdrawViewModel.DepositPreferenceOption) mutableState7.getValue();
                                                    depositPreferenceOption7.getClass();
                                                    BlockersData copy$default = BlockersData.copy$default(withdrawScreen.blockersData, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, TransferData.copy$default(withdrawPresenter.transferData, money2, depositPreferenceOption7.depositPreference, depositPreferenceOption7.fee, null, null, null, null, null, 32622), null, null, null, null, null, null, null, null, null, false, null, null, null, -1, 65531);
                                                    TransferType transferType = TransferType.CASH_OUT;
                                                    DepositPreference depositPreference3 = depositPreferenceOption7.depositPreference;
                                                    screenNavigator.goTo(new InstrumentNotLinkedScreen(copy$default, transferType, depositPreference3, WithdrawScreen.copy$default(withdrawPresenter.args, null, money2, null, depositPreference3, 1)));
                                                }
                                            } else if (withdrawPresenter.multiLinkingUxButtonsEnabled) {
                                                mutableState10.setValue(Boolean.TRUE);
                                            }
                                        } else if (Intrinsics.areEqual(withdrawViewEvent, WithdrawViewEvent.CtaClick.INSTANCE)) {
                                            mutableState10.setValue(Boolean.TRUE);
                                        } else if (!Intrinsics.areEqual(withdrawViewEvent, WithdrawViewEvent.DismissChangeAmountClick.INSTANCE)) {
                                            if (!Intrinsics.areEqual(withdrawViewEvent, WithdrawViewEvent.SaveAmountClick.INSTANCE)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                break;
                                            } else {
                                                String str11 = withdrawScreen.blockersData.flowToken;
                                                Long l = ((Money) mutableState6.getValue()).amount;
                                                Integer num = l != null ? new Integer((int) l.longValue()) : null;
                                                CurrencyCode currencyCode = ((Money) mutableState6.getValue()).currency_code;
                                                analytics2.track(new CashWithdrawSaveAmount(currencyCode != null ? com.squareup.cash.integration.analytics.UtilsKt.getAsCdfCurrencyCode(currencyCode) : null, num, str11), null);
                                            }
                                        } else if (((Money) mutableState8.getValue()) != null) {
                                            analytics2.track(new CashWithdrawDismissAmount(withdrawScreen.blockersData.flowToken), null);
                                            Money money3 = (Money) mutableState8.getValue();
                                            money3.getClass();
                                            mutableState6.setValue(money3);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }

                            public AnonymousClass2(FlowCollector flowCollector, ChatPresenter chatPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10) {
                                this.$this_unsafeFlow = flowCollector;
                                this.this$0 = chatPresenter;
                                this.$currentMessages$delegate$inlined = mutableState;
                                this.$lastReadMessageToken$delegate$inlined = mutableState2;
                                this.$lastMessageSentTimestamp$delegate$inlined = mutableState3;
                                this.$isUserTyping$delegate$inlined = mutableState4;
                                this.$isShowingTypingIndicator$delegate$inlined = mutableState5;
                                this.$hasInput$delegate$inlined = mutableState6;
                                this.$fileAttachment$delegate$inlined = mutableState7;
                                this.$lastItemVisible$delegate$inlined = mutableState8;
                                this.$hasAcceptedHandover$delegate$inlined = mutableState9;
                                this.$conversation$delegate$inlined = mutableState10;
                            }
                        }
                    };
                    mutableState8 = mutableState19;
                    mutableState9 = mutableState27;
                    mutableState10 = mutableState2;
                    mutableState11 = mutableState28;
                    mutableState12 = mutableState20;
                    mutableState13 = mutableState22;
                    gapComposer2.updateRememberedValue(flow2);
                    rememberedValue = flow2;
                } else {
                    mutableState10 = mutableState2;
                    obj5 = obj3;
                    gapComposer2 = gapComposer;
                    mutableState8 = mutableState19;
                    mutableState12 = mutableState20;
                    mutableState13 = mutableState22;
                    mutableState5 = mutableState23;
                    mutableState11 = mutableState4;
                    mutableState6 = mutableState18;
                    mutableState9 = mutableState27;
                    continuation = null;
                    mutableState7 = mutableState3;
                }
                EmptyList emptyList = EmptyList.INSTANCE;
                GapComposer gapComposer5 = gapComposer2;
                MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue, new ChatState(emptyList, emptyList, true, emptyList, false, PagingStatus.EXHAUSTED, null, null, null, false, null, 0, emptyList, true, false, false, false, false), null, gapComposer5, 0, 2);
                MutableState mutableState29 = mutableState13;
                mutableState14 = mutableState11;
                final MutableState mutableState30 = mutableState7;
                Continuation continuation5 = continuation;
                mutableState15 = mutableState;
                ChatPresenter$models$$inlined$CollectEffect$1 chatPresenter$models$$inlined$CollectEffect$1 = new ChatPresenter$models$$inlined$CollectEffect$1(flow, (Continuation) null, (ChatPresenter) this, collectAsState5, mutableState14, mutableState21, mutableState12, mutableState10, mutableState30, mutableState26, mutableState9, mutableState15, mutableState8, mutableState5, mutableState6);
                final MutableState mutableState31 = mutableState10;
                gapComposer3 = gapComposer5;
                Updater.LaunchedEffect(gapComposer3, flow, chatPresenter$models$$inlined$CollectEffect$1);
                rememberedValue2 = gapComposer3.rememberedValue();
                obj6 = obj5;
                if (rememberedValue2 == obj6) {
                    rememberedValue2 = Updater.mutableStateOf$default(continuation5);
                    gapComposer3.updateRememberedValue(rememberedValue2);
                }
                MutableState mutableState32 = (MutableState) rememberedValue2;
                rememberedValue3 = gapComposer3.rememberedValue();
                if (rememberedValue3 == obj6) {
                    rememberedValue3 = new HeroTagViewKt$$ExternalSyntheticLambda12(27, mutableState32);
                    gapComposer3.updateRememberedValue(rememberedValue3);
                }
                Function2 function2 = (Function2) rememberedValue3;
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = AnswersKt.LocalAnswerDispatcher;
                AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer3.consume(staticProvidableCompositionLocal);
                changedInstance = gapComposer3.changedInstance(answerDispatcher);
                rememberedValue4 = gapComposer3.rememberedValue();
                if (!changedInstance || rememberedValue4 == obj6) {
                    rememberedValue4 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, 23);
                    gapComposer3.updateRememberedValue(rememberedValue4);
                }
                Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue4, gapComposer3);
                rememberedValue5 = gapComposer3.rememberedValue();
                if (rememberedValue5 == obj6) {
                    rememberedValue5 = new HeroTagViewKt$$ExternalSyntheticLambda12(28, mutableState32);
                    gapComposer3.updateRememberedValue(rememberedValue5);
                }
                Function2 function22 = (Function2) rememberedValue5;
                AnswerDispatcher answerDispatcher2 = (AnswerDispatcher) gapComposer3.consume(staticProvidableCompositionLocal);
                changedInstance2 = gapComposer3.changedInstance(answerDispatcher2);
                rememberedValue6 = gapComposer3.rememberedValue();
                if (!changedInstance2 || rememberedValue6 == obj6) {
                    rememberedValue6 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function22, answerDispatcher2, 24);
                    gapComposer3.updateRememberedValue(rememberedValue6);
                }
                Updater.DisposableEffect(answerDispatcher2, (Function1) rememberedValue6, gapComposer3);
                changedInstance3 = gapComposer3.changedInstance(this) | gapComposer3.changed(mutableState15) | gapComposer3.changed(mutableState21);
                rememberedValue7 = gapComposer3.rememberedValue();
                if (!changedInstance3 || rememberedValue7 == obj6) {
                    mutableState16 = mutableState15;
                    final int i11 = 0;
                    Function2 function23 = new Function2(this) { // from class: com.squareup.cash.support.chat.presenters.ChatPresenter$$ExternalSyntheticLambda9
                        public final /* synthetic */ ChatPresenter f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj8, Object obj9) {
                            boolean booleanValue;
                            boolean booleanValue2;
                            boolean booleanValue3;
                            boolean booleanValue4;
                            boolean booleanValue5;
                            boolean booleanValue6;
                            boolean booleanValue7;
                            boolean booleanValue8;
                            int i12 = i11;
                            Back back = Back.INSTANCE;
                            MutableState mutableState33 = mutableState21;
                            MutableState mutableState34 = mutableState31;
                            MutableState mutableState35 = mutableState30;
                            MutableState mutableState36 = mutableState14;
                            State state = mutableState16;
                            ChatPresenter chatPresenter2 = this.f$0;
                            switch (i12) {
                                case 0:
                                    SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptResult chatExitPromptResult = (SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptResult) obj9;
                                    ((SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion) obj8).getClass();
                                    if (Intrinsics.areEqual(chatExitPromptResult, SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptResult.EndConversation.INSTANCE)) {
                                        chatPresenter2.navigator.goTo(back);
                                        booleanValue3 = ((Boolean) state.getValue()).booleanValue();
                                        booleanValue4 = ((Boolean) mutableState36.getValue()).booleanValue();
                                        chatPresenter2.trackChatCompletionAndExit(booleanValue3, booleanValue4, (Conversation) mutableState35.getValue(), (Instant) mutableState34.getValue());
                                        mutableState34.setValue(null);
                                    } else if (Intrinsics.areEqual(chatExitPromptResult, SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptResult.SaveAndContinue.INSTANCE)) {
                                        chatPresenter2.closeChat(((Boolean) mutableState33.getValue()).booleanValue());
                                        booleanValue = ((Boolean) state.getValue()).booleanValue();
                                        booleanValue2 = ((Boolean) mutableState36.getValue()).booleanValue();
                                        chatPresenter2.trackChatCompletionAndExit(booleanValue, booleanValue2, (Conversation) mutableState35.getValue(), (Instant) mutableState34.getValue());
                                        mutableState34.setValue(null);
                                    }
                                    break;
                                default:
                                    SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetResult chatExitPromptSheetResult = (SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetResult) obj9;
                                    ((SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion) obj8).getClass();
                                    if (Intrinsics.areEqual(chatExitPromptSheetResult, SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetResult.EndConversation.INSTANCE)) {
                                        chatPresenter2.navigator.goTo(back);
                                        booleanValue7 = ((Boolean) state.getValue()).booleanValue();
                                        booleanValue8 = ((Boolean) mutableState36.getValue()).booleanValue();
                                        chatPresenter2.trackChatCompletionAndExit(booleanValue7, booleanValue8, (Conversation) mutableState35.getValue(), (Instant) mutableState34.getValue());
                                        mutableState34.setValue(null);
                                    } else if (Intrinsics.areEqual(chatExitPromptSheetResult, SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetResult.SaveAndContinue.INSTANCE)) {
                                        chatPresenter2.closeChat(((Boolean) mutableState33.getValue()).booleanValue());
                                        booleanValue5 = ((Boolean) state.getValue()).booleanValue();
                                        booleanValue6 = ((Boolean) mutableState36.getValue()).booleanValue();
                                        chatPresenter2.trackChatCompletionAndExit(booleanValue5, booleanValue6, (Conversation) mutableState35.getValue(), (Instant) mutableState34.getValue());
                                        mutableState34.setValue(null);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    gapComposer3.updateRememberedValue(function23);
                    rememberedValue7 = function23;
                } else {
                    mutableState16 = mutableState15;
                }
                Function2 function24 = (Function2) rememberedValue7;
                AnswerDispatcher answerDispatcher3 = (AnswerDispatcher) gapComposer3.consume(staticProvidableCompositionLocal);
                changed2 = gapComposer3.changed(function24) | gapComposer3.changedInstance(answerDispatcher3);
                rememberedValue8 = gapComposer3.rememberedValue();
                if (!changed2 || rememberedValue8 == obj6) {
                    rememberedValue8 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function24, answerDispatcher3, 25);
                    gapComposer3.updateRememberedValue(rememberedValue8);
                }
                Updater.DisposableEffect(answerDispatcher3, (Function1) rememberedValue8, gapComposer3);
                changedInstance4 = gapComposer3.changedInstance(this) | gapComposer3.changed(mutableState16) | gapComposer3.changed(mutableState21);
                rememberedValue9 = gapComposer3.rememberedValue();
                if (!changedInstance4 || rememberedValue9 == obj6) {
                    final int i12 = 1;
                    Function2 function25 = new Function2(this) { // from class: com.squareup.cash.support.chat.presenters.ChatPresenter$$ExternalSyntheticLambda9
                        public final /* synthetic */ ChatPresenter f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj8, Object obj9) {
                            boolean booleanValue;
                            boolean booleanValue2;
                            boolean booleanValue3;
                            boolean booleanValue4;
                            boolean booleanValue5;
                            boolean booleanValue6;
                            boolean booleanValue7;
                            boolean booleanValue8;
                            int i122 = i12;
                            Back back = Back.INSTANCE;
                            MutableState mutableState33 = mutableState21;
                            MutableState mutableState34 = mutableState31;
                            MutableState mutableState35 = mutableState30;
                            MutableState mutableState36 = mutableState14;
                            State state = mutableState16;
                            ChatPresenter chatPresenter2 = this.f$0;
                            switch (i122) {
                                case 0:
                                    SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptResult chatExitPromptResult = (SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptResult) obj9;
                                    ((SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion) obj8).getClass();
                                    if (Intrinsics.areEqual(chatExitPromptResult, SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptResult.EndConversation.INSTANCE)) {
                                        chatPresenter2.navigator.goTo(back);
                                        booleanValue3 = ((Boolean) state.getValue()).booleanValue();
                                        booleanValue4 = ((Boolean) mutableState36.getValue()).booleanValue();
                                        chatPresenter2.trackChatCompletionAndExit(booleanValue3, booleanValue4, (Conversation) mutableState35.getValue(), (Instant) mutableState34.getValue());
                                        mutableState34.setValue(null);
                                    } else if (Intrinsics.areEqual(chatExitPromptResult, SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptResult.SaveAndContinue.INSTANCE)) {
                                        chatPresenter2.closeChat(((Boolean) mutableState33.getValue()).booleanValue());
                                        booleanValue = ((Boolean) state.getValue()).booleanValue();
                                        booleanValue2 = ((Boolean) mutableState36.getValue()).booleanValue();
                                        chatPresenter2.trackChatCompletionAndExit(booleanValue, booleanValue2, (Conversation) mutableState35.getValue(), (Instant) mutableState34.getValue());
                                        mutableState34.setValue(null);
                                    }
                                    break;
                                default:
                                    SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetResult chatExitPromptSheetResult = (SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetResult) obj9;
                                    ((SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion) obj8).getClass();
                                    if (Intrinsics.areEqual(chatExitPromptSheetResult, SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetResult.EndConversation.INSTANCE)) {
                                        chatPresenter2.navigator.goTo(back);
                                        booleanValue7 = ((Boolean) state.getValue()).booleanValue();
                                        booleanValue8 = ((Boolean) mutableState36.getValue()).booleanValue();
                                        chatPresenter2.trackChatCompletionAndExit(booleanValue7, booleanValue8, (Conversation) mutableState35.getValue(), (Instant) mutableState34.getValue());
                                        mutableState34.setValue(null);
                                    } else if (Intrinsics.areEqual(chatExitPromptSheetResult, SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetResult.SaveAndContinue.INSTANCE)) {
                                        chatPresenter2.closeChat(((Boolean) mutableState33.getValue()).booleanValue());
                                        booleanValue5 = ((Boolean) state.getValue()).booleanValue();
                                        booleanValue6 = ((Boolean) mutableState36.getValue()).booleanValue();
                                        chatPresenter2.trackChatCompletionAndExit(booleanValue5, booleanValue6, (Conversation) mutableState35.getValue(), (Instant) mutableState34.getValue());
                                        mutableState34.setValue(null);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    gapComposer3.updateRememberedValue(function25);
                    rememberedValue9 = function25;
                }
                Function2 function26 = (Function2) rememberedValue9;
                AnswerDispatcher answerDispatcher4 = (AnswerDispatcher) gapComposer3.consume(staticProvidableCompositionLocal);
                changed3 = gapComposer3.changed(function26) | gapComposer3.changedInstance(answerDispatcher4);
                rememberedValue10 = gapComposer3.rememberedValue();
                if (!changed3 || rememberedValue10 == obj6) {
                    rememberedValue10 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function26, answerDispatcher4, 26);
                    gapComposer3.updateRememberedValue(rememberedValue10);
                }
                Updater.DisposableEffect(answerDispatcher4, (Function1) rememberedValue10, gapComposer3);
                str = (String) mutableState32.getValue();
                ChatState chatState3 = (ChatState) collectAsState5.getValue();
                if (str != null || chatState3 == null) {
                    chatPresenter = this;
                    z = false;
                    gapComposer3.startReplaceGroup(-1383879796);
                    gapComposer3.end(false);
                } else {
                    gapComposer3.startReplaceGroup(-1383927846);
                    NavHostKt$NavHost$33$1 navHostKt$NavHost$33$1 = new NavHostKt$NavHost$33$1(str, chatState3, (Continuation) null, (ChatPresenter) this, mutableState14, mutableState32);
                    chatPresenter = this;
                    Updater.LaunchedEffect(str, chatState3, navHostKt$NavHost$33$1, gapComposer3);
                    z = false;
                    gapComposer3.end(false);
                }
                rememberedValue11 = gapComposer3.rememberedValue();
                if (rememberedValue11 == obj6) {
                    rememberedValue11 = Long.valueOf(((FeatureFlag$LongFeatureFlag.Value) ((RealFeatureFlagManager) chatPresenter.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$SupportChatUserTypingEventInterval.INSTANCE)).value);
                    gapComposer3.updateRememberedValue(rememberedValue11);
                }
                long longValue = ((Number) rememberedValue11).longValue();
                rememberedValue12 = gapComposer3.rememberedValue();
                if (rememberedValue12 != obj6) {
                    r9 = 1;
                    continuation2 = continuation5;
                    rememberedValue12 = FlowKt.channelFlow(new ThrottleLatestKt$throttleLatest$1(FlowKt.drop(new RealRecipientRepository$suggestions$$inlined$map$1(flow, 18), 1), longValue, continuation2));
                    gapComposer3.updateRememberedValue(rememberedValue12);
                } else {
                    continuation2 = continuation5;
                    r9 = 1;
                }
                Flow flow3 = (Flow) rememberedValue12;
                Updater.LaunchedEffect(gapComposer3, flow3, new ArticlePresenter$models$1$1(flow3, continuation2, chatPresenter, 7));
                mutableState29.setValue(((ChatState) collectAsState5.getValue()).messages);
                ChatStateMapper chatStateMapper = chatPresenter.chatStateMapper;
                chatState = (ChatState) collectAsState5.getValue();
                chatState.getClass();
                ArrayList arrayList2 = new ArrayList();
                ordinal = chatState.oldMessageStatus.ordinal();
                if (ordinal != 0) {
                    statusViewModel = !chatState.messages.isEmpty() ? new ChatContentViewModel.StatusViewModel(chatStateMapper.stringManager.get(R.string.support_chat_status_text)) : continuation2;
                } else if (ordinal == r9 || ordinal == 2) {
                    statusViewModel = ChatContentViewModel.LoadOldMessagesViewModel.INSTANCE;
                } else {
                    if (ordinal != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return continuation2;
                    }
                    statusViewModel = ChatContentViewModel.ErrorViewModel.INSTANCE;
                }
                if (statusViewModel != null) {
                    arrayList2.add(statusViewModel);
                }
                AssetPublicSuffixList assetPublicSuffixList = chatStateMapper.timestampFormatter;
                boolean z11 = chatStateMapper.chatUiUpliftEnabled;
                ArrayList arrayList3 = new ArrayList();
                List list = chatState.messages;
                listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        r55 = continuation2;
                        i2 = -1;
                        break;
                    }
                    Message message = (Message) listIterator.previous();
                    continuation3 = continuation2;
                    if (message instanceof PendingMessage) {
                        z10 = ((PendingMessage) message).status.equals(MessageStatus$Recorded.INSTANCE);
                    } else {
                        if (!(message instanceof RecordedMessage)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return continuation3;
                        }
                        z10 = ((RecordedMessage) message).sender == Message.Sender.CUSTOMER ? r9 : z;
                    }
                    if (z10) {
                        i2 = listIterator.nextIndex();
                        r55 = continuation3;
                        break;
                    }
                    continuation2 = continuation3;
                }
                listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        i3 = -1;
                        break;
                    }
                    if (Intrinsics.areEqual(((Message) listIterator2.previous()).getStatus(), MessageStatus$Sending.INSTANCE)) {
                        i3 = listIterator2.nextIndex();
                        break;
                    }
                }
                it = list.iterator();
                Message message2 = r55;
                int i13 = 0;
                boolean z12 = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw r55;
                    }
                    Message message3 = (Message) next;
                    if (message2 == null || (instant = message2.getTimestamp()) == null) {
                        instant = Instant.MIN;
                    }
                    Instant instant2 = instant;
                    instant2.getClass();
                    if (!(message3.getBody() instanceof MessageBody.SystemMessageBody) && java.time.Duration.between(instant2, message3.getTimestamp()).abs().compareTo(ChatStateKt.NEW_TIMESTAMP_THRESHOLD) > 0) {
                        it2 = it;
                        gapComposer4 = gapComposer3;
                        timestampDividerViewModel = new ChatContentViewModel.TimestampDividerViewModel(AssetPublicSuffixList.formatDate$default(chatStateMapper.timestampFormatter, message3.getTimestamp(), 14), assetPublicSuffixList.formatTime(message3.getTimestamp()), (z11 && z12) ? ChatContentViewModel.TimestampDividerViewModel.Styling.AFTER_DIVIDER : ChatContentViewModel.TimestampDividerViewModel.Styling.DEFAULT, z11);
                    } else {
                        it2 = it;
                        gapComposer4 = gapComposer3;
                        timestampDividerViewModel = r55;
                    }
                    if (timestampDividerViewModel != null) {
                        arrayList3.add(timestampDividerViewModel);
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z13 = message3 instanceof RecordedMessage;
                    if (!z13 || (str6 = (recordedMessage2 = (RecordedMessage) message3).disclaimerMarkdown) == null || StringsKt.isBlank(str6)) {
                        z5 = z4;
                        z6 = z13;
                        disclaimerViewModel = r55;
                    } else {
                        String str8 = recordedMessage2.messageToken;
                        str8.getClass();
                        z5 = z4;
                        z6 = z13;
                        disclaimerViewModel = new ChatContentViewModel.DisclaimerViewModel(str6, str8, chatStateMapper.chatUiUpliftEnabled);
                    }
                    if (disclaimerViewModel != null) {
                        arrayList3.add(disclaimerViewModel);
                        z5 = true;
                    }
                    Message message4 = (Message) CollectionsKt.getOrNull(i14, list);
                    if (!z11) {
                        valueOf = r55;
                    } else if (message4 == null) {
                        valueOf = Boolean.TRUE;
                    } else {
                        if (ChatStateMapper.sender(message4) == ChatStateMapper.sender(message3)) {
                            Instant timestamp = message3.getTimestamp();
                            if ((message4.getBody() instanceof MessageBody.SystemMessageBody) || java.time.Duration.between(timestamp, message4.getTimestamp()).abs().compareTo(ChatStateKt.NEW_TIMESTAMP_THRESHOLD) <= 0) {
                                if (!(message4 instanceof RecordedMessage) || (str3 = (recordedMessage = (RecordedMessage) message4).disclaimerMarkdown) == null || StringsKt.isBlank(str3)) {
                                    bool2 = r55;
                                } else {
                                    recordedMessage.messageToken.getClass();
                                    bool2 = Boolean.TRUE;
                                }
                                if (bool2 == null) {
                                    z7 = false;
                                    valueOf = Boolean.valueOf(z7);
                                }
                            }
                        }
                        z7 = true;
                        valueOf = Boolean.valueOf(z7);
                    }
                    AndroidStringManager androidStringManager = chatStateMapper.stringManager;
                    MessageBody body = message3.getBody();
                    List list2 = list;
                    if (body instanceof MessageBody.TextBody) {
                        viewModelKt = new BodyViewModel$TextBodyViewModel(((MessageBody.TextBody) body).text, z11);
                    } else {
                        if (body instanceof MessageBody.FileBody) {
                            MessageBody.FileBody fileBody2 = (MessageBody.FileBody) body;
                            boolean isImage = GlobalSnapshotManagerKt.isImage(fileBody2);
                            String str9 = fileBody2.uri;
                            if (isImage) {
                                Uri parse = Uri.parse(str9);
                                if (parse.getScheme() == null) {
                                    parse = parse.buildUpon().scheme("file").build();
                                    parse.getClass();
                                }
                                String uri = parse.toString();
                                uri.getClass();
                                viewModelKt = new BodyViewModel$ImageBodyViewModel(uri, z11);
                            } else {
                                FileMetadata fileMetadata = fileBody2.metadata;
                                i6 = i14;
                                chatState2 = chatState;
                                viewModelKt = new BodyViewModel$FileBodyViewModel(str9, fileMetadata.displayName, chatStateMapper.fileTypeDescriber.getDescriptionForMimeType(fileMetadata.mimeType), z11);
                            }
                        } else {
                            chatState2 = chatState;
                            i6 = i14;
                            if (body instanceof MessageBody.SelectedReplyBody) {
                                viewModelKt = new BodyViewModel$TextBodyViewModel(((MessageBody.SelectedReplyBody) body).reply.text, z11);
                            } else if (body instanceof MessageBody.ActionBody) {
                                MessageBody.ActionBody actionBody = (MessageBody.ActionBody) body;
                                String str10 = actionBody.title;
                                String str11 = actionBody.subtitle;
                                SpacerKt spacerKt = actionBody.action;
                                if (spacerKt instanceof Action$OpenLink) {
                                    action = new BodyViewModel$ActionBodyViewModel.Action.OpenLink(((Action$OpenLink) spacerKt).url);
                                } else {
                                    if (!spacerKt.equals(Action$PickTransaction.INSTANCE)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return r55;
                                    }
                                    action = BodyViewModel$ActionBodyViewModel.Action.PickTransaction.INSTANCE;
                                }
                                viewModelKt = new BodyViewModel$ActionBodyViewModel(str10, str11, action, z11);
                            } else {
                                if (body instanceof MessageBody.TransactionBody) {
                                    MessageBody.TransactionBody transactionBody = (MessageBody.TransactionBody) body;
                                    if (transactionBody instanceof MessageBody.TransactionBody.Selected) {
                                        viewModelKt2 = BodyViewModel$TransactionBodyViewModel.Loading.INSTANCE;
                                    } else if (transactionBody instanceof MessageBody.TransactionBody.Missing) {
                                        viewModelKt2 = BodyViewModel$TransactionBodyViewModel.Missing.INSTANCE;
                                    } else {
                                        if (!(transactionBody instanceof MessageBody.TransactionBody.Loaded)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return r55;
                                        }
                                        MessageBody.TransactionBody.Loaded loaded = (MessageBody.TransactionBody.Loaded) transactionBody;
                                        MessageBody.TransactionBody.AvatarComponents avatarComponents = loaded.avatarComponents;
                                        String str12 = loaded.title;
                                        String str13 = avatarComponents.displayName;
                                        if (avatarComponents.lightUrl != null) {
                                            str4 = str13;
                                            arrayList = arrayList2;
                                            image = new Image(avatarComponents.lightUrl, avatarComponents.darkUrl, 4);
                                        } else {
                                            arrayList = arrayList2;
                                            str4 = str13;
                                            image = r55;
                                        }
                                        if (avatarComponents.lightSrgb != null) {
                                            Color.ModeVariant modeVariant = new Color.ModeVariant(avatarComponents.lightSrgb, null, null, null, null, 30, null);
                                            String str14 = avatarComponents.darkSrgb;
                                            accented = new ColorModel.Accented(new Color(modeVariant, str14 != null ? new Color.ModeVariant(str14, null, null, null, null, 30, null) : r55, 4));
                                        } else {
                                            accented = r55;
                                        }
                                        viewModelKt = new BodyViewModel$TransactionBodyViewModel.Loaded(GrpcStatus.Companion.toStackedAvatar(new AvatarViewModel(image, accented, str4, (String) null, avatarComponents.colorizeAvatar, avatarComponents.fillBackground, avatarComponents.lookupKey, avatarComponents.email, avatarComponents.sms, (AvatarBadgeViewModel) null, (String) null, false, false, 31761)), str12);
                                    }
                                    viewModelKt = viewModelKt2;
                                } else {
                                    arrayList = arrayList2;
                                    if (body instanceof MessageBody.ActivityItemTransactionBody) {
                                        viewModelKt = new BodyViewModel$ActivityBodyViewModel(((MessageBody.ActivityItemTransactionBody) body).entityId);
                                    } else if (body instanceof MessageBody.SystemMessageBody) {
                                        MessageBody.SystemMessageBody systemMessageBody = (MessageBody.SystemMessageBody) body;
                                        String str15 = systemMessageBody.text;
                                        MessageBody.SystemMessageBody.Styling styling3 = systemMessageBody.styling;
                                        if ((styling3 != null ? Intrinsics.areEqual(styling3.showTimestamp, Boolean.TRUE) : false) && z11) {
                                            str15 = Boxes$$ExternalSyntheticOutline1.m$1(str15, " - ", AssetPublicSuffixList.formatDate$default(chatStateMapper.timestampFormatter, message3.getTimestamp(), 14), " ", assetPublicSuffixList.formatTime(message3.getTimestamp()));
                                        }
                                        viewModelKt = new BodyViewModel$SystemMessageBodyViewModel(str15, z11);
                                    } else {
                                        if (!Intrinsics.areEqual(body, MessageBody.UnknownBody.INSTANCE)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return r55;
                                        }
                                        viewModelKt = BodyViewModel$UnknownBodyViewModel.INSTANCE;
                                    }
                                }
                                ViewModelKt viewModelKt3 = viewModelKt;
                                ChatContentViewModel.EntryViewModel.ContentDescription createContentDescription = CubicKt.createContentDescription(message3, androidStringManager, assetPublicSuffixList);
                                status = message3.getStatus();
                                if (!z5) {
                                    if (ChatStateMapper.sender(message3) == (message2 != null ? ChatStateMapper.sender(message2) : r55)) {
                                        z8 = false;
                                        String idempotenceToken = message3.getIdempotenceToken();
                                        RecordedMessage recordedMessage3 = !z6 ? (RecordedMessage) message3 : r55;
                                        String str16 = recordedMessage3 == null ? recordedMessage3.messageToken : r55;
                                        ordinal2 = message3.getSender().ordinal();
                                        if (ordinal2 != 0) {
                                            sender = ChatContentViewModel.EntryViewModel.Sender.CUSTOMER;
                                        } else if (ordinal2 != 1) {
                                            if (ordinal2 != 2) {
                                                if (ordinal2 == 3) {
                                                    sender = ChatContentViewModel.EntryViewModel.Sender.SYSTEM;
                                                } else if (ordinal2 != 4) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return r55;
                                                }
                                            }
                                            sender = ChatContentViewModel.EntryViewModel.Sender.BOT;
                                        } else {
                                            sender = ChatContentViewModel.EntryViewModel.Sender.ADVOCATE;
                                        }
                                        ChatContentViewModel.EntryViewModel.Sender sender2 = sender;
                                        if (status instanceof MessageStatus$Failed) {
                                            c = 2;
                                            c2 = 3;
                                            if (i13 == i2) {
                                                fileTypes2 = i3 == -1 ? ChatContentViewModel$MessageViewModel$Status$Recorded.INSTANCE : r55;
                                            } else if (i13 == i3) {
                                                fileTypes2 = ChatContentViewModel$MessageViewModel$Status$Sending.INSTANCE;
                                            } else {
                                                fileTypes = r55;
                                                if (message3.getSender() != Message.Sender.SYSTEM) {
                                                    if (z11 ? message3.getSender() != Message.Sender.BOT && Intrinsics.areEqual(valueOf, Boolean.TRUE) : z8) {
                                                        z9 = true;
                                                        arrayList3.add(new ChatContentViewModel.MessageViewModel(sender2, viewModelKt3, createContentDescription, z9, idempotenceToken, str16, fileTypes, assetPublicSuffixList.formatTime(message3.getTimestamp()), chatStateMapper.chatUiUpliftEnabled, z8, ((AccessibilityManager) chatStateMapper.accessibilityManager.accessibilityManager$delegate.getValue()).isTouchExplorationEnabled()));
                                                        if (z11) {
                                                            MessageBody body2 = message3.getBody();
                                                            MessageBody.SystemMessageBody systemMessageBody2 = body2 instanceof MessageBody.SystemMessageBody ? (MessageBody.SystemMessageBody) body2 : r55;
                                                            ChatContentViewModel.TimestampDividerViewModel timestampDividerViewModel2 = (systemMessageBody2 == null || (styling2 = systemMessageBody2.styling) == null) ? false : Intrinsics.areEqual(styling2.showTimestamp, Boolean.TRUE) ? new ChatContentViewModel.TimestampDividerViewModel(AssetPublicSuffixList.formatDate$default(chatStateMapper.timestampFormatter, message3.getTimestamp(), 14), assetPublicSuffixList.formatTime(message3.getTimestamp()), ChatContentViewModel.TimestampDividerViewModel.Styling.BELOW_SYSTEM_MESSAGE, z11) : r55;
                                                            if (timestampDividerViewModel2 != null) {
                                                                arrayList3.add(timestampDividerViewModel2);
                                                            }
                                                        }
                                                        MessageBody body3 = message3.getBody();
                                                        MessageBody.SystemMessageBody systemMessageBody3 = !(body3 instanceof MessageBody.SystemMessageBody) ? (MessageBody.SystemMessageBody) body3 : r55;
                                                        dividerViewModel = !((systemMessageBody3 != null || (styling = systemMessageBody3.styling) == null) ? false : Intrinsics.areEqual(styling.showDivider, Boolean.TRUE)) ? new ChatContentViewModel.DividerViewModel(z11) : r55;
                                                        if (dividerViewModel == null) {
                                                            arrayList3.add(dividerViewModel);
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                        message2 = message3;
                                                        list = list2;
                                                        i13 = i6;
                                                        chatState = chatState2;
                                                        arrayList2 = arrayList;
                                                        gapComposer3 = gapComposer4;
                                                        it = it2;
                                                    }
                                                }
                                                z9 = false;
                                                arrayList3.add(new ChatContentViewModel.MessageViewModel(sender2, viewModelKt3, createContentDescription, z9, idempotenceToken, str16, fileTypes, assetPublicSuffixList.formatTime(message3.getTimestamp()), chatStateMapper.chatUiUpliftEnabled, z8, ((AccessibilityManager) chatStateMapper.accessibilityManager.accessibilityManager$delegate.getValue()).isTouchExplorationEnabled()));
                                                if (z11) {
                                                }
                                                MessageBody body32 = message3.getBody();
                                                if (!(body32 instanceof MessageBody.SystemMessageBody)) {
                                                }
                                                if (!((systemMessageBody3 != null || (styling = systemMessageBody3.styling) == null) ? false : Intrinsics.areEqual(styling.showDivider, Boolean.TRUE))) {
                                                }
                                                if (dividerViewModel == null) {
                                                }
                                                message2 = message3;
                                                list = list2;
                                                i13 = i6;
                                                chatState = chatState2;
                                                arrayList2 = arrayList;
                                                gapComposer3 = gapComposer4;
                                                it = it2;
                                            }
                                        } else {
                                            int ordinal3 = ((MessageStatus$Failed) status).f1206type.ordinal();
                                            if (ordinal3 == 0) {
                                                c = 2;
                                                c2 = 3;
                                                str5 = z11 ? androidStringManager.get(R.string.support_chat_message_failed_retryable_ui_uplift_enabled) : androidStringManager.get(R.string.support_chat_message_failed_retryable);
                                            } else if (ordinal3 != 1) {
                                                c = 2;
                                                c2 = 3;
                                                if (ordinal3 == 2) {
                                                    str5 = androidStringManager.get(R.string.support_chat_message_failed_file_too_large);
                                                } else {
                                                    if (ordinal3 != 3) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        return r55;
                                                    }
                                                    str5 = androidStringManager.get(R.string.support_chat_message_failed_file_unsupported);
                                                }
                                            } else {
                                                c = 2;
                                                c2 = 3;
                                                str5 = androidStringManager.get(R.string.support_chat_message_failed_invalid_file);
                                            }
                                            fileTypes2 = new ChatContentViewModel$MessageViewModel$Status$Failed(str5);
                                        }
                                        fileTypes = fileTypes2;
                                        if (message3.getSender() != Message.Sender.SYSTEM) {
                                        }
                                        z9 = false;
                                        arrayList3.add(new ChatContentViewModel.MessageViewModel(sender2, viewModelKt3, createContentDescription, z9, idempotenceToken, str16, fileTypes, assetPublicSuffixList.formatTime(message3.getTimestamp()), chatStateMapper.chatUiUpliftEnabled, z8, ((AccessibilityManager) chatStateMapper.accessibilityManager.accessibilityManager$delegate.getValue()).isTouchExplorationEnabled()));
                                        if (z11) {
                                        }
                                        MessageBody body322 = message3.getBody();
                                        if (!(body322 instanceof MessageBody.SystemMessageBody)) {
                                        }
                                        if (!((systemMessageBody3 != null || (styling = systemMessageBody3.styling) == null) ? false : Intrinsics.areEqual(styling.showDivider, Boolean.TRUE))) {
                                        }
                                        if (dividerViewModel == null) {
                                        }
                                        message2 = message3;
                                        list = list2;
                                        i13 = i6;
                                        chatState = chatState2;
                                        arrayList2 = arrayList;
                                        gapComposer3 = gapComposer4;
                                        it = it2;
                                    }
                                }
                                z8 = true;
                                String idempotenceToken2 = message3.getIdempotenceToken();
                                if (!z6) {
                                }
                                if (recordedMessage3 == null) {
                                }
                                ordinal2 = message3.getSender().ordinal();
                                if (ordinal2 != 0) {
                                }
                                ChatContentViewModel.EntryViewModel.Sender sender22 = sender;
                                if (status instanceof MessageStatus$Failed) {
                                }
                                fileTypes = fileTypes2;
                                if (message3.getSender() != Message.Sender.SYSTEM) {
                                }
                                z9 = false;
                                arrayList3.add(new ChatContentViewModel.MessageViewModel(sender22, viewModelKt3, createContentDescription, z9, idempotenceToken2, str16, fileTypes, assetPublicSuffixList.formatTime(message3.getTimestamp()), chatStateMapper.chatUiUpliftEnabled, z8, ((AccessibilityManager) chatStateMapper.accessibilityManager.accessibilityManager$delegate.getValue()).isTouchExplorationEnabled()));
                                if (z11) {
                                }
                                MessageBody body3222 = message3.getBody();
                                if (!(body3222 instanceof MessageBody.SystemMessageBody)) {
                                }
                                if (!((systemMessageBody3 != null || (styling = systemMessageBody3.styling) == null) ? false : Intrinsics.areEqual(styling.showDivider, Boolean.TRUE))) {
                                }
                                if (dividerViewModel == null) {
                                }
                                message2 = message3;
                                list = list2;
                                i13 = i6;
                                chatState = chatState2;
                                arrayList2 = arrayList;
                                gapComposer3 = gapComposer4;
                                it = it2;
                            }
                        }
                        arrayList = arrayList2;
                        ViewModelKt viewModelKt32 = viewModelKt;
                        ChatContentViewModel.EntryViewModel.ContentDescription createContentDescription2 = CubicKt.createContentDescription(message3, androidStringManager, assetPublicSuffixList);
                        status = message3.getStatus();
                        if (!z5) {
                        }
                        z8 = true;
                        String idempotenceToken22 = message3.getIdempotenceToken();
                        if (!z6) {
                        }
                        if (recordedMessage3 == null) {
                        }
                        ordinal2 = message3.getSender().ordinal();
                        if (ordinal2 != 0) {
                        }
                        ChatContentViewModel.EntryViewModel.Sender sender222 = sender;
                        if (status instanceof MessageStatus$Failed) {
                        }
                        fileTypes = fileTypes2;
                        if (message3.getSender() != Message.Sender.SYSTEM) {
                        }
                        z9 = false;
                        arrayList3.add(new ChatContentViewModel.MessageViewModel(sender222, viewModelKt32, createContentDescription2, z9, idempotenceToken22, str16, fileTypes, assetPublicSuffixList.formatTime(message3.getTimestamp()), chatStateMapper.chatUiUpliftEnabled, z8, ((AccessibilityManager) chatStateMapper.accessibilityManager.accessibilityManager$delegate.getValue()).isTouchExplorationEnabled()));
                        if (z11) {
                        }
                        MessageBody body32222 = message3.getBody();
                        if (!(body32222 instanceof MessageBody.SystemMessageBody)) {
                        }
                        if (!((systemMessageBody3 != null || (styling = systemMessageBody3.styling) == null) ? false : Intrinsics.areEqual(styling.showDivider, Boolean.TRUE))) {
                        }
                        if (dividerViewModel == null) {
                        }
                        message2 = message3;
                        list = list2;
                        i13 = i6;
                        chatState = chatState2;
                        arrayList2 = arrayList;
                        gapComposer3 = gapComposer4;
                        it = it2;
                    }
                    chatState2 = chatState;
                    arrayList = arrayList2;
                    i6 = i14;
                    ViewModelKt viewModelKt322 = viewModelKt;
                    ChatContentViewModel.EntryViewModel.ContentDescription createContentDescription22 = CubicKt.createContentDescription(message3, androidStringManager, assetPublicSuffixList);
                    status = message3.getStatus();
                    if (!z5) {
                    }
                    z8 = true;
                    String idempotenceToken222 = message3.getIdempotenceToken();
                    if (!z6) {
                    }
                    if (recordedMessage3 == null) {
                    }
                    ordinal2 = message3.getSender().ordinal();
                    if (ordinal2 != 0) {
                    }
                    ChatContentViewModel.EntryViewModel.Sender sender2222 = sender;
                    if (status instanceof MessageStatus$Failed) {
                    }
                    fileTypes = fileTypes2;
                    if (message3.getSender() != Message.Sender.SYSTEM) {
                    }
                    z9 = false;
                    arrayList3.add(new ChatContentViewModel.MessageViewModel(sender2222, viewModelKt322, createContentDescription22, z9, idempotenceToken222, str16, fileTypes, assetPublicSuffixList.formatTime(message3.getTimestamp()), chatStateMapper.chatUiUpliftEnabled, z8, ((AccessibilityManager) chatStateMapper.accessibilityManager.accessibilityManager$delegate.getValue()).isTouchExplorationEnabled()));
                    if (z11) {
                    }
                    MessageBody body322222 = message3.getBody();
                    if (!(body322222 instanceof MessageBody.SystemMessageBody)) {
                    }
                    if (!((systemMessageBody3 != null || (styling = systemMessageBody3.styling) == null) ? false : Intrinsics.areEqual(styling.showDivider, Boolean.TRUE))) {
                    }
                    if (dividerViewModel == null) {
                    }
                    message2 = message3;
                    list = list2;
                    i13 = i6;
                    chatState = chatState2;
                    arrayList2 = arrayList;
                    gapComposer3 = gapComposer4;
                    it = it2;
                }
                ArrayList arrayList4 = arrayList2;
                GapComposer gapComposer6 = gapComposer3;
                arrayList4.addAll(arrayList3);
                if (chatState.suggestedReplies.isEmpty()) {
                    List list3 = chatState.suggestedReplies;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it3 = list3.iterator();
                        while (it3.hasNext()) {
                            String str17 = ((SuggestedReply) it3.next()).text;
                            str17.getClass();
                            try {
                                EmojiCompat emojiCompat = EmojiCompat.get();
                                TransactorKt.checkState("Not initialized yet", emojiCompat.isInitialized());
                                if (emojiCompat.mHelper.mProcessor.getEmojiMatch(str17) == 1) {
                                    BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                                    characterInstance.setText(str17);
                                    int i15 = 0;
                                    while (characterInstance.next() != -1 && i15 <= 1) {
                                        i15++;
                                    }
                                    if (i15 == 1) {
                                    }
                                }
                            } catch (IllegalStateException unused) {
                            }
                            z3 = false;
                        }
                    }
                    z3 = true;
                    List<SuggestedReply> list4 = chatState.suggestedReplies;
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                    for (SuggestedReply suggestedReply : list4) {
                        arrayList5.add(new ChatContentViewModel.SuggestedRepliesViewModel.SuggestedReplyViewModel(suggestedReply.token, suggestedReply.text));
                    }
                    boolean z14 = chatStateMapper.chatUiUpliftEnabled;
                    suggestedRepliesViewModel = new ChatContentViewModel.SuggestedRepliesViewModel(arrayList5, z3, (z14 || !chatState.canUseEnhancedSuggestedReplies || z3) ? false : true, z14);
                } else {
                    suggestedRepliesViewModel = r55;
                }
                if (suggestedRepliesViewModel != null) {
                    arrayList4.add(suggestedRepliesViewModel);
                }
                AndroidStringManager androidStringManager2 = chatStateMapper.stringManager;
                if (chatState.shouldShowTypingIndicator) {
                    typingIndicatorViewModel = r55;
                } else {
                    ChatContentViewModel.EntryViewModel.ContentDescription contentDescription = new ChatContentViewModel.EntryViewModel.ContentDescription(androidStringManager2.get(R.string.support_chat_message_sender_cash_app_bot), androidStringManager2.get(R.string.support_chat_message_content_description_typing_indicator), "");
                    boolean z15 = chatStateMapper.chatUiUpliftEnabled;
                    typingIndicatorViewModel = new ChatContentViewModel.TypingIndicatorViewModel(contentDescription, new BodyViewModel$TypingIndicatorBodyViewModel(z15), !z15);
                }
                if (typingIndicatorViewModel != null) {
                    arrayList4.add(typingIndicatorViewModel);
                }
                bottomBookmarkViewModel = arrayList4.isEmpty() ? new ChatContentViewModel.BottomBookmarkViewModel(CollectionsKt.lastOrNull((List) arrayList4) instanceof ChatContentViewModel.SuggestedRepliesViewModel ? ChatContentViewModel.BottomBookmarkViewModel.Height.MINIMAL : ChatContentViewModel.BottomBookmarkViewModel.Height.NORMAL, chatStateMapper.chatUiUpliftEnabled) : r55;
                if (bottomBookmarkViewModel != null) {
                    arrayList4.add(bottomBookmarkViewModel);
                }
                if (chatState.shouldDisableCashbotFileUpload) {
                    Conversation conversation = chatState.conversation;
                    if ((conversation != null ? conversation.botStatus : r55) != Conversation.BotStatus.HANDED_OVER && !chatState.hasAcceptedHandover) {
                        z2 = false;
                        boolean z16 = chatState.initialState;
                        boolean isEmpty = arrayList4.isEmpty();
                        fileBody = chatState.fileAttachment;
                        if (fileBody != null) {
                            boolean isImage2 = GlobalSnapshotManagerKt.isImage(fileBody);
                            String str18 = fileBody.uri;
                            if (isImage2) {
                                chatAttachmentViewModel = new ChatAttachmentViewModel.ImageAttachmentViewModel(str18);
                                i4 = 1;
                            } else {
                                FileMetadata fileMetadata2 = fileBody.metadata;
                                i4 = 1;
                                chatAttachmentViewModel = new ChatAttachmentViewModel.FileAttachmentViewModel(str18, fileMetadata2.displayName, chatStateMapper.fileTypeDescriber.getDescriptionForMimeType(fileMetadata2.mimeType), true);
                            }
                        } else {
                            i4 = 1;
                            chatAttachmentViewModel = r55;
                        }
                        i5 = chatState.unreadMessageCount;
                        if (i5 > 0) {
                            AndroidStringManager androidStringManager3 = chatStateMapper.stringManager;
                            ArrayMap m = NavAction$$ExternalSyntheticOutline0.m(i4, Integer.valueOf(i5), "count");
                            Resources resources = androidStringManager3.resources;
                            resources.getClass();
                            String format2 = new MessageFormat(resources.getString(R.string.support_chat_unread_message_count)).format(m);
                            format2.getClass();
                            str2 = format2;
                        } else {
                            str2 = r55;
                        }
                        String str19 = chatState.savedInput;
                        List list5 = chatState.oldMessages;
                        List list6 = chatState.messages;
                        from = RealEmojiDetector.from(list5, list6);
                        if (!from.equals(ChatMessageAction.NoAction.INSTANCE) && !from.equals(ChatMessageAction.OldMessageLoaded.INSTANCE) && !from.equals(ChatMessageAction.MessageStatusUpdated.INSTANCE) && !from.equals(ChatMessageAction.PendingMessageDeleted.INSTANCE)) {
                            if (!from.equals(ChatMessageAction.InitialMessageLoaded.INSTANCE)) {
                                int i16 = chatState.unreadMessageCount;
                                if (i16 == 0) {
                                    scrollAction2 = new ChatViewModel.ScrollAction(ChatStateMapper.lastIndexOrZero(arrayList4));
                                } else if (i16 != 1) {
                                    Integer firstIndexOfUnreadMessage = ChatStateMapper.firstIndexOfUnreadMessage(chatState.lastReadMessageToken, arrayList4);
                                    if (firstIndexOfUnreadMessage != null) {
                                        scrollAction2 = new ChatViewModel.ScrollAction(firstIndexOfUnreadMessage.intValue(), ChatViewModel.ScrollAction.SnapPreference.SNAP_TO_START);
                                    }
                                } else {
                                    Message message5 = (Message) CollectionsKt.lastOrNull(list6);
                                    if (message5 == null || !(message5 instanceof RecordedMessage) || ((RecordedMessage) message5).disclaimerMarkdown == null) {
                                        scrollAction2 = new ChatViewModel.ScrollAction(ChatStateMapper.lastIndexOrZero(arrayList4));
                                    } else {
                                        Integer lastIndexOfDisclaimer = ChatStateMapper.lastIndexOfDisclaimer(arrayList4);
                                        if (lastIndexOfDisclaimer != null) {
                                            scrollAction2 = new ChatViewModel.ScrollAction(lastIndexOfDisclaimer.intValue(), ChatViewModel.ScrollAction.SnapPreference.SNAP_TO_START);
                                        }
                                    }
                                }
                                scrollAction = scrollAction2;
                            } else {
                                if (!(from instanceof ChatMessageAction.NewMessageLoaded)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return r55;
                                }
                                Message message6 = (Message) CollectionsKt.lastOrNull(list6);
                                if ((message6 instanceof PendingMessage) && !(((PendingMessage) message6).status instanceof MessageStatus$Failed)) {
                                    scrollAction2 = new ChatViewModel.ScrollAction(ChatStateMapper.lastIndexOrZero(arrayList4));
                                } else if (chatState.lastItemVisible) {
                                    List<Message> list7 = ((ChatMessageAction.NewMessageLoaded) from).newMessages;
                                    if (!(list7 instanceof Collection) || !list7.isEmpty()) {
                                        for (Message message7 : list7) {
                                            if ((message7 instanceof RecordedMessage) && ((RecordedMessage) message7).disclaimerMarkdown != null) {
                                                Integer lastIndexOfDisclaimer2 = ChatStateMapper.lastIndexOfDisclaimer(arrayList4);
                                                if (lastIndexOfDisclaimer2 != null) {
                                                    scrollAction2 = new ChatViewModel.ScrollAction(lastIndexOfDisclaimer2.intValue());
                                                }
                                            }
                                        }
                                    }
                                    scrollAction2 = new ChatViewModel.ScrollAction(ChatStateMapper.lastIndexOrZero(arrayList4));
                                }
                                scrollAction = scrollAction2;
                            }
                            ChatViewModel chatViewModel = new ChatViewModel(arrayList4, z16, str2, isEmpty, z2, chatAttachmentViewModel, str19, scrollAction, ChatStateMapper.firstIndexOfUnreadMessage(chatState.lastReadMessageToken, arrayList4), chatStateMapper.chatUiUpliftEnabled);
                            gapComposer6.end(false);
                            return chatViewModel;
                        }
                        scrollAction = r55;
                        ChatViewModel chatViewModel2 = new ChatViewModel(arrayList4, z16, str2, isEmpty, z2, chatAttachmentViewModel, str19, scrollAction, ChatStateMapper.firstIndexOfUnreadMessage(chatState.lastReadMessageToken, arrayList4), chatStateMapper.chatUiUpliftEnabled);
                        gapComposer6.end(false);
                        return chatViewModel2;
                    }
                }
                z2 = true;
                boolean z162 = chatState.initialState;
                boolean isEmpty2 = arrayList4.isEmpty();
                fileBody = chatState.fileAttachment;
                if (fileBody != null) {
                }
                i5 = chatState.unreadMessageCount;
                if (i5 > 0) {
                }
                String str192 = chatState.savedInput;
                List list52 = chatState.oldMessages;
                List list62 = chatState.messages;
                from = RealEmojiDetector.from(list52, list62);
                if (!from.equals(ChatMessageAction.NoAction.INSTANCE)) {
                    if (!from.equals(ChatMessageAction.InitialMessageLoaded.INSTANCE)) {
                    }
                    ChatViewModel chatViewModel22 = new ChatViewModel(arrayList4, z162, str2, isEmpty2, z2, chatAttachmentViewModel, str192, scrollAction, ChatStateMapper.firstIndexOfUnreadMessage(chatState.lastReadMessageToken, arrayList4), chatStateMapper.chatUiUpliftEnabled);
                    gapComposer6.end(false);
                    return chatViewModel22;
                }
                scrollAction = r55;
                ChatViewModel chatViewModel222 = new ChatViewModel(arrayList4, z162, str2, isEmpty2, z2, chatAttachmentViewModel, str192, scrollAction, ChatStateMapper.firstIndexOfUnreadMessage(chatState.lastReadMessageToken, arrayList4), chatStateMapper.chatUiUpliftEnabled);
                gapComposer6.end(false);
                return chatViewModel222;
            }
        }
        gapComposer = r5;
        bool = bool5;
        obj3 = obj2;
        mutableState3 = mutableState24;
        obj4 = new NavHostKt$NavHost$33$1((Object) this, (Object) collectAsState, (Object) mutableState17, (Object) mutableState3, (Object) collectAsState2, (Object) mutableState25, (Continuation) null, 17);
        mutableState = collectAsState2;
        mutableState2 = mutableState17;
        mutableState4 = mutableState25;
        gapComposer.updateRememberedValue(obj4);
        Updater.LaunchedEffect(gapComposer, bool, (Function2) obj4);
        changed = gapComposer.changed(((Boolean) mutableState19.getValue()).booleanValue()) | gapComposer.changed((MessageBody.FileBody) mutableState20.getValue()) | gapComposer.changed(((Boolean) collectAsState4.getValue()).booleanValue()) | gapComposer.changed((String) collectAsState3.getValue()) | gapComposer.changed(((Boolean) mutableState27.getValue()).booleanValue());
        rememberedValue = gapComposer.rememberedValue();
        if (changed) {
        }
        final Flow buffer$default2 = FlowKt.buffer$default(new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(this.conversationService.allMessages(), new RealTabProvider$setup$1$5(i10, null, 9), 1), 1, 2);
        obj5 = obj3;
        gapComposer2 = gapComposer;
        mutableState5 = mutableState23;
        continuation = null;
        mutableState6 = mutableState18;
        final MutableState mutableState282 = mutableState4;
        mutableState7 = mutableState3;
        Flow flow22 = new Flow() { // from class: com.squareup.cash.support.chat.presenters.ChatPresenter$models$lambda$43$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation52) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this, mutableState22, collectAsState3, mutableState2, collectAsState4, mutableState282, mutableState19, mutableState20, mutableState5, mutableState27, mutableState7), continuation52);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
            }

            /* renamed from: com.squareup.cash.support.chat.presenters.ChatPresenter$models$lambda$43$$inlined$map$1$2, reason: invalid class name */
            public final class AnonymousClass2 implements FlowCollector {
                public final /* synthetic */ State $conversation$delegate$inlined;
                public final /* synthetic */ MutableState $currentMessages$delegate$inlined;
                public final /* synthetic */ Object $fileAttachment$delegate$inlined;
                public final /* synthetic */ State $hasAcceptedHandover$delegate$inlined;
                public final /* synthetic */ MutableState $hasInput$delegate$inlined;
                public final /* synthetic */ MutableState $isShowingTypingIndicator$delegate$inlined;
                public final /* synthetic */ MutableState $isUserTyping$delegate$inlined;
                public final /* synthetic */ State $lastItemVisible$delegate$inlined;
                public final /* synthetic */ MutableState $lastMessageSentTimestamp$delegate$inlined;
                public final /* synthetic */ MutableState $lastReadMessageToken$delegate$inlined;
                public final /* synthetic */ int $r8$classId = 1;
                public final /* synthetic */ Object $this_unsafeFlow;
                public final /* synthetic */ Object this$0;

                /* renamed from: com.squareup.cash.support.chat.presenters.ChatPresenter$models$lambda$43$$inlined$map$1$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends ContinuationImpl {
                    public int I$0;
                    public String L$10;
                    public FlowCollector L$4;
                    public Transcript L$6;
                    public List L$7;
                    public List L$8;
                    public boolean Z$0;
                    public boolean Z$1;
                    public boolean Z$2;
                    public int label;
                    public /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= PKIFailureInfo.systemUnavail;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(CoroutineScope coroutineScope, WithdrawPresenter withdrawPresenter, WithdrawViewModel.DepositPreferenceOption depositPreferenceOption, CurrencyCode currencyCode, State state, MutableState mutableState, MutableState mutableState2, State state2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, State state3, MutableState mutableState6) {
                    this.$this_unsafeFlow = withdrawPresenter;
                    this.this$0 = depositPreferenceOption;
                    this.$fileAttachment$delegate$inlined = currencyCode;
                    this.$lastItemVisible$delegate$inlined = state;
                    this.$currentMessages$delegate$inlined = mutableState;
                    this.$lastReadMessageToken$delegate$inlined = mutableState2;
                    this.$hasAcceptedHandover$delegate$inlined = state2;
                    this.$lastMessageSentTimestamp$delegate$inlined = mutableState3;
                    this.$isUserTyping$delegate$inlined = mutableState4;
                    this.$isShowingTypingIndicator$delegate$inlined = mutableState5;
                    this.$conversation$delegate$inlined = state3;
                    this.$hasInput$delegate$inlined = mutableState6;
                }

                /* JADX WARN: Code restructure failed: missing block: B:182:0x07ab, code lost:
                
                    if (r2.emit(r29, r14) != r10) goto L271;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:248:0x065a, code lost:
                
                    if (r2 == false) goto L195;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:136:0x034c  */
                /* JADX WARN: Removed duplicated region for block: B:150:0x06f4  */
                /* JADX WARN: Removed duplicated region for block: B:161:0x070f  */
                /* JADX WARN: Removed duplicated region for block: B:172:0x072e  */
                /* JADX WARN: Removed duplicated region for block: B:180:0x0755  */
                /* JADX WARN: Removed duplicated region for block: B:185:0x0747  */
                /* JADX WARN: Removed duplicated region for block: B:187:0x0741 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:189:0x039c  */
                /* JADX WARN: Removed duplicated region for block: B:213:0x06a5  */
                /* JADX WARN: Removed duplicated region for block: B:230:0x062c  */
                /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r3v48, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r7v5 */
                /* JADX WARN: Type inference failed for: r7v6 */
                /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    MutableState mutableState;
                    AnonymousClass1 anonymousClass1;
                    int i;
                    Object obj2;
                    MutableState mutableState2;
                    Object obj3;
                    MutableState mutableState3;
                    MutableState mutableState4;
                    State state;
                    Pair pair;
                    List list;
                    List list2;
                    FlowCollector flowCollector;
                    CoroutineSingletons coroutineSingletons;
                    Transcript transcript;
                    boolean z;
                    State state2;
                    Instant instant;
                    Conversation.BotStatus botStatus;
                    com.squareup.kotterknife.Lazy lazy;
                    boolean booleanValue;
                    RealFeatureFlagManager realFeatureFlagManager;
                    FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options;
                    Message message;
                    Conversation.BotStatus botStatus2;
                    boolean z2;
                    String str;
                    FlowCollector flowCollector2;
                    Transcript transcript2;
                    int i2;
                    Object savedInput;
                    CoroutineSingletons coroutineSingletons2;
                    List list3;
                    boolean z3;
                    Object obj4;
                    int i3;
                    boolean z4;
                    boolean z5;
                    List list4;
                    List list5;
                    Iterator it;
                    ListIterator listIterator;
                    int i4;
                    List list6;
                    Instrument instrument;
                    CashOutCapabilityManager$CashOutCapabilities.InstrumentCapability instrumentCapability;
                    boolean z6;
                    List list7;
                    CashOutCapabilityManager$CashOutCapabilities.InstrumentCapability instrumentCapability2;
                    WithdrawViewModel.DepositPreferenceOption depositPreferenceOption;
                    int i5 = this.$r8$classId;
                    State state3 = this.$conversation$delegate$inlined;
                    MutableState mutableState5 = this.$isShowingTypingIndicator$delegate$inlined;
                    Object obj5 = this.$fileAttachment$delegate$inlined;
                    Object obj6 = this.this$0;
                    Object obj7 = this.$this_unsafeFlow;
                    MutableState mutableState6 = this.$currentMessages$delegate$inlined;
                    MutableState mutableState7 = this.$lastReadMessageToken$delegate$inlined;
                    State state4 = this.$lastItemVisible$delegate$inlined;
                    MutableState mutableState8 = this.$lastMessageSentTimestamp$delegate$inlined;
                    State state5 = this.$hasAcceptedHandover$delegate$inlined;
                    MutableState mutableState9 = this.$isUserTyping$delegate$inlined;
                    MutableState mutableState10 = this.$hasInput$delegate$inlined;
                    switch (i5) {
                        case 0:
                            ChatPresenter chatPresenter = (ChatPresenter) obj6;
                            Analytics analytics = chatPresenter.analytics;
                            SupportChatScreens.FlowScreen.ChatScreen chatScreen = chatPresenter.args;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                mutableState = mutableState9;
                                int i6 = anonymousClass1.label;
                                if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                                    anonymousClass1.label = i6 - PKIFailureInfo.systemUnavail;
                                    Object obj82 = anonymousClass1.result;
                                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i = anonymousClass1.label;
                                    if (i == 0) {
                                        if (i != 1) {
                                            if (i == 2) {
                                                SafeTrace.throwOnFailure(obj82);
                                                break;
                                            } else {
                                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                                break;
                                            }
                                        } else {
                                            boolean z7 = anonymousClass1.Z$2;
                                            boolean z8 = anonymousClass1.Z$1;
                                            boolean z9 = anonymousClass1.Z$0;
                                            int i7 = anonymousClass1.I$0;
                                            str = anonymousClass1.L$10;
                                            List list8 = anonymousClass1.L$8;
                                            List list9 = anonymousClass1.L$7;
                                            Transcript transcript3 = anonymousClass1.L$6;
                                            FlowCollector flowCollector3 = anonymousClass1.L$4;
                                            SafeTrace.throwOnFailure(obj82);
                                            z4 = z8;
                                            z5 = z9;
                                            list3 = list8;
                                            state = state4;
                                            list4 = list9;
                                            state2 = state5;
                                            z3 = z7;
                                            transcript2 = transcript3;
                                            flowCollector2 = flowCollector3;
                                            mutableState2 = mutableState6;
                                            mutableState3 = mutableState7;
                                            obj4 = obj82;
                                            coroutineSingletons2 = coroutineSingletons32;
                                            i3 = i7;
                                            obj2 = obj5;
                                            i2 = 0;
                                            String str22 = str;
                                            String str32 = (String) obj4;
                                            String str42 = ChatPresenter.ALLOWED_FILE_MIME_TYPES_REGEX;
                                            List list102 = (List) mutableState2.getValue();
                                            PagingStatus pagingStatus2 = transcript2.pagingStatus;
                                            MessageBody.FileBody fileBody2 = (MessageBody.FileBody) ((MutableState) obj2).getValue();
                                            boolean booleanValue22 = ((Boolean) mutableState.getValue()).booleanValue();
                                            Conversation conversation3 = transcript2.conversation;
                                            String str52 = (String) mutableState3.getValue();
                                            ArrayList arrayList7 = new ArrayList();
                                            for (Object obj9 : list4) {
                                                if (obj9 instanceof RecordedMessage) {
                                                    arrayList7.add(obj9);
                                                }
                                            }
                                            ArrayList arrayList22 = new ArrayList();
                                            it = arrayList7.iterator();
                                            while (it.hasNext()) {
                                                Object next = it.next();
                                                if (!(((RecordedMessage) next).body instanceof MessageBody.SystemMessageBody)) {
                                                    arrayList22.add(next);
                                                }
                                            }
                                            listIterator = arrayList22.listIterator(arrayList22.size());
                                            while (true) {
                                                if (listIterator.hasPrevious()) {
                                                    i4 = -1;
                                                } else if (Intrinsics.areEqual(((RecordedMessage) listIterator.previous()).messageToken, str52)) {
                                                    i4 = listIterator.nextIndex();
                                                }
                                            }
                                            if (i4 >= 0) {
                                                i2 = (arrayList22.size() - i4) - 1;
                                            }
                                            int i82 = i2;
                                            list6 = chatScreen.ignoredPhrases;
                                            if (list6 == null) {
                                                list6 = EmptyList.INSTANCE;
                                            }
                                            ChatState chatState2 = new ChatState(list4, list102, false, list3, z3, pagingStatus2, fileBody2, str22, str32, booleanValue22, conversation3, i82, list6, ((Boolean) ((MutableState) state).getValue()).booleanValue(), z5, z4, ((Boolean) chatPresenter.shouldDisableCashbotFileUpload$delegate.getValue()).booleanValue(), ((Boolean) ((MutableState) state2).getValue()).booleanValue());
                                            ((MutableState) state3).setValue(transcript2.conversation);
                                            anonymousClass1.L$4 = null;
                                            anonymousClass1.L$6 = null;
                                            anonymousClass1.L$7 = null;
                                            anonymousClass1.L$8 = null;
                                            anonymousClass1.L$10 = null;
                                            anonymousClass1.I$0 = i3;
                                            anonymousClass1.label = 2;
                                            break;
                                        }
                                    } else {
                                        SafeTrace.throwOnFailure(obj82);
                                        FlowCollector flowCollector4 = (FlowCollector) obj7;
                                        Transcript transcript4 = (Transcript) obj;
                                        List list11 = transcript4.messages;
                                        obj2 = obj5;
                                        Conversation conversation2 = transcript4.conversation;
                                        String str6 = ChatPresenter.ALLOWED_FILE_MIME_TYPES_REGEX;
                                        if (list11 != null) {
                                            mutableState2 = mutableState6;
                                            obj3 = (Message) CollectionsKt.lastOrNull(list11);
                                        } else {
                                            mutableState2 = mutableState6;
                                            obj3 = null;
                                        }
                                        mutableState3 = mutableState7;
                                        if (obj3 instanceof RecordedMessage) {
                                            ArrayList arrayList3 = ((RecordedMessage) obj3).suggestedReplies;
                                            mutableState4 = mutableState10;
                                            state = state4;
                                            pair = new Pair(arrayList3, Boolean.valueOf(arrayList3.size() <= 2));
                                        } else {
                                            mutableState4 = mutableState10;
                                            state = state4;
                                            pair = new Pair(EmptyList.INSTANCE, Boolean.FALSE);
                                        }
                                        List list12 = (List) pair.first;
                                        boolean booleanValue3 = ((Boolean) pair.second).booleanValue();
                                        ChatMessageAction from = RealEmojiDetector.from((List) mutableState2.getValue(), list11);
                                        if (from instanceof ChatMessageAction.InitialMessageLoaded) {
                                            if (((String) mutableState3.getValue()) == null) {
                                                list5 = list11;
                                            } else if (list11.isEmpty()) {
                                                list5 = EmptyList.INSTANCE;
                                            } else {
                                                ListIterator listIterator2 = list11.listIterator(list11.size());
                                                while (true) {
                                                    if (!listIterator2.hasPrevious()) {
                                                        list5 = CollectionsKt.toList(list11);
                                                    } else if (Intrinsics.areEqual(SessionWorkerKt.getMessageToken((Message) listIterator2.previous()), (String) mutableState3.getValue())) {
                                                        listIterator2.next();
                                                        int size = list11.size() - listIterator2.nextIndex();
                                                        if (size == 0) {
                                                            list5 = EmptyList.INSTANCE;
                                                        } else {
                                                            ArrayList arrayList4 = new ArrayList(size);
                                                            while (listIterator2.hasNext()) {
                                                                arrayList4.add(listIterator2.next());
                                                            }
                                                            list5 = arrayList4;
                                                        }
                                                    }
                                                }
                                            }
                                            PointKt.logReceivedMessageActions(analytics, list5, chatScreen.flowToken);
                                        } else if (from instanceof ChatMessageAction.NewMessageLoaded) {
                                            List list13 = ((ChatMessageAction.NewMessageLoaded) from).newMessages;
                                            Message message2 = (Message) CollectionsKt.first(list13);
                                            list = list11;
                                            list2 = list12;
                                            if (message2.getSender() == Message.Sender.CUSTOMER || (instant = (Instant) mutableState8.getValue()) == null) {
                                                flowCollector = flowCollector4;
                                                coroutineSingletons = coroutineSingletons32;
                                                transcript = transcript4;
                                                z = booleanValue3;
                                                state2 = state5;
                                            } else {
                                                RealObservabilityManager realObservabilityManager = chatPresenter.observabilityManager;
                                                long epochMilli = instant.toEpochMilli() * 1000;
                                                if (conversation2 == null || (botStatus = conversation2.botStatus) == null) {
                                                    botStatus = Conversation.BotStatus.UNKNOWN;
                                                }
                                                SpanTracking startTrackingSpan$default = RealObservabilityManager.startTrackingSpan$default(realObservabilityManager, UUID.randomUUID().toString(), "receive_new_support_chat_messages", null, Long.valueOf(epochMilli), 4);
                                                Conversation.BotStatus botStatus3 = botStatus;
                                                state2 = state5;
                                                Pair pair2 = new Pair("end_kind", "receive_new_message");
                                                coroutineSingletons = coroutineSingletons32;
                                                Pair pair3 = new Pair("sender", message2.getSender().toString());
                                                String messageToken = SessionWorkerKt.getMessageToken(message2);
                                                if (messageToken == null) {
                                                    messageToken = "";
                                                }
                                                z = booleanValue3;
                                                transcript = transcript4;
                                                flowCollector = flowCollector4;
                                                SpanTracking.spanEnded$default(startTrackingSpan$default, MapsKt__MapsKt.mapOf(pair2, pair3, new Pair("message_token", messageToken), new Pair("message_timestamp", message2.getTimestamp().toString()), new Pair("bot_status", botStatus3.toString())), 1);
                                                mutableState8.setValue(null);
                                            }
                                            Message message3 = (Message) CollectionsKt.last(list13);
                                            if (message3 instanceof RecordedMessage) {
                                                RecordedMessage recordedMessage = (RecordedMessage) message3;
                                                ArrayList arrayList5 = recordedMessage.suggestedReplies;
                                                if (!arrayList5.isEmpty()) {
                                                    String str7 = chatScreen.flowToken;
                                                    String str8 = recordedMessage.messageToken;
                                                    Message.Sender sender = recordedMessage.sender;
                                                    Integer valueOf = Integer.valueOf(arrayList5.size());
                                                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
                                                    Iterator it2 = arrayList5.iterator();
                                                    while (it2.hasNext()) {
                                                        arrayList6.add(((SuggestedReply) it2.next()).token);
                                                    }
                                                    analytics.track(new CustomerSupportChatReceivedSuggestedReplies(valueOf, str7, str8, CollectionsKt.joinToString$default(arrayList6, ",", null, null, 0, null, null, 62), PointKt.toCdfSender(sender)), null);
                                                }
                                            }
                                            PointKt.logReceivedMessageActions(analytics, list13, chatScreen.flowToken);
                                            lazy = chatPresenter.typingIndicatorHelper;
                                            boolean booleanValue42 = ((Boolean) mutableState.getValue()).booleanValue();
                                            booleanValue = ((Boolean) mutableState5.getValue()).booleanValue();
                                            lazy.getClass();
                                            realFeatureFlagManager = (RealFeatureFlagManager) ((FeatureFlagManager) lazy.initializer);
                                            featureFlag$EnabledDisabledAmplitudeExperiment$Options = (FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$ClientSupportAutomationChatBotTypingBubble.INSTANCE);
                                            featureFlag$EnabledDisabledAmplitudeExperiment$Options.getClass();
                                            if (featureFlag$EnabledDisabledAmplitudeExperiment$Options != FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled && (message = (Message) CollectionsKt.lastOrNull(list)) != null && conversation2 != null && (botStatus2 = conversation2.botStatus) != null && ((botStatus2 == Conversation.BotStatus.READY || botStatus2 == Conversation.BotStatus.ACTIVE) && message.getSender() == Message.Sender.CUSTOMER && (booleanValue || Intrinsics.areEqual(message.getStatus(), MessageStatus$Recorded.INSTANCE)))) {
                                                if (java.time.Duration.between(message.getTimestamp(), DimensionKt.now((AndroidClock) lazy.value)).getSeconds() <= ((FeatureFlag$LongFeatureFlag.Value) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$SupportChatPollingInterval.INSTANCE)).value * 2) {
                                                    MessageBody body = message.getBody();
                                                    if (!(body instanceof MessageBody.SelectedReplyBody) && !(body instanceof MessageBody.TransactionBody) && !(body instanceof MessageBody.ActivityItemTransactionBody)) {
                                                        if (!(body instanceof MessageBody.TextBody) && !(body instanceof MessageBody.FileBody)) {
                                                            if (!(body instanceof MessageBody.ActionBody) && !(body instanceof MessageBody.SystemMessageBody) && !(body instanceof MessageBody.UnknownBody)) {
                                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                break;
                                                            }
                                                        } else if (booleanValue42) {
                                                        }
                                                    }
                                                    z2 = true;
                                                    mutableState5.setValue(Boolean.valueOf(z2));
                                                    boolean booleanValue522 = ((Boolean) mutableState4.getValue()).booleanValue();
                                                    str = (String) mutableState3.getValue();
                                                    SupportConversationPersistence supportConversationPersistence22 = chatPresenter.conversationPersistence;
                                                    flowCollector2 = flowCollector;
                                                    anonymousClass1.L$4 = flowCollector2;
                                                    transcript2 = transcript;
                                                    anonymousClass1.L$6 = transcript2;
                                                    anonymousClass1.L$7 = list;
                                                    anonymousClass1.L$8 = list2;
                                                    anonymousClass1.L$10 = str;
                                                    i2 = 0;
                                                    anonymousClass1.I$0 = 0;
                                                    boolean z1022 = z;
                                                    anonymousClass1.Z$0 = z1022;
                                                    anonymousClass1.Z$1 = z2;
                                                    anonymousClass1.Z$2 = booleanValue522;
                                                    anonymousClass1.label = 1;
                                                    savedInput = supportConversationPersistence22.getSavedInput(anonymousClass1);
                                                    coroutineSingletons2 = coroutineSingletons;
                                                    if (savedInput != coroutineSingletons2) {
                                                        list3 = list2;
                                                        z3 = booleanValue522;
                                                        obj4 = savedInput;
                                                        i3 = 0;
                                                        z4 = z2;
                                                        z5 = z1022;
                                                        list4 = list;
                                                        String str222 = str;
                                                        String str322 = (String) obj4;
                                                        String str422 = ChatPresenter.ALLOWED_FILE_MIME_TYPES_REGEX;
                                                        List list1022 = (List) mutableState2.getValue();
                                                        PagingStatus pagingStatus22 = transcript2.pagingStatus;
                                                        MessageBody.FileBody fileBody22 = (MessageBody.FileBody) ((MutableState) obj2).getValue();
                                                        boolean booleanValue222 = ((Boolean) mutableState.getValue()).booleanValue();
                                                        Conversation conversation32 = transcript2.conversation;
                                                        String str522 = (String) mutableState3.getValue();
                                                        ArrayList arrayList72 = new ArrayList();
                                                        while (r9.hasNext()) {
                                                        }
                                                        ArrayList arrayList222 = new ArrayList();
                                                        it = arrayList72.iterator();
                                                        while (it.hasNext()) {
                                                        }
                                                        listIterator = arrayList222.listIterator(arrayList222.size());
                                                        while (true) {
                                                            if (listIterator.hasPrevious()) {
                                                            }
                                                        }
                                                        if (i4 >= 0) {
                                                        }
                                                        int i822 = i2;
                                                        list6 = chatScreen.ignoredPhrases;
                                                        if (list6 == null) {
                                                        }
                                                        ChatState chatState22 = new ChatState(list4, list1022, false, list3, z3, pagingStatus22, fileBody22, str222, str322, booleanValue222, conversation32, i822, list6, ((Boolean) ((MutableState) state).getValue()).booleanValue(), z5, z4, ((Boolean) chatPresenter.shouldDisableCashbotFileUpload$delegate.getValue()).booleanValue(), ((Boolean) ((MutableState) state2).getValue()).booleanValue());
                                                        ((MutableState) state3).setValue(transcript2.conversation);
                                                        anonymousClass1.L$4 = null;
                                                        anonymousClass1.L$6 = null;
                                                        anonymousClass1.L$7 = null;
                                                        anonymousClass1.L$8 = null;
                                                        anonymousClass1.L$10 = null;
                                                        anonymousClass1.I$0 = i3;
                                                        anonymousClass1.label = 2;
                                                    }
                                                    break;
                                                }
                                            }
                                            z2 = false;
                                            mutableState5.setValue(Boolean.valueOf(z2));
                                            boolean booleanValue5222 = ((Boolean) mutableState4.getValue()).booleanValue();
                                            str = (String) mutableState3.getValue();
                                            SupportConversationPersistence supportConversationPersistence222 = chatPresenter.conversationPersistence;
                                            flowCollector2 = flowCollector;
                                            anonymousClass1.L$4 = flowCollector2;
                                            transcript2 = transcript;
                                            anonymousClass1.L$6 = transcript2;
                                            anonymousClass1.L$7 = list;
                                            anonymousClass1.L$8 = list2;
                                            anonymousClass1.L$10 = str;
                                            i2 = 0;
                                            anonymousClass1.I$0 = 0;
                                            boolean z10222 = z;
                                            anonymousClass1.Z$0 = z10222;
                                            anonymousClass1.Z$1 = z2;
                                            anonymousClass1.Z$2 = booleanValue5222;
                                            anonymousClass1.label = 1;
                                            savedInput = supportConversationPersistence222.getSavedInput(anonymousClass1);
                                            coroutineSingletons2 = coroutineSingletons;
                                            if (savedInput != coroutineSingletons2) {
                                            }
                                        }
                                        flowCollector = flowCollector4;
                                        coroutineSingletons = coroutineSingletons32;
                                        transcript = transcript4;
                                        list = list11;
                                        z = booleanValue3;
                                        list2 = list12;
                                        state2 = state5;
                                        lazy = chatPresenter.typingIndicatorHelper;
                                        boolean booleanValue422 = ((Boolean) mutableState.getValue()).booleanValue();
                                        booleanValue = ((Boolean) mutableState5.getValue()).booleanValue();
                                        lazy.getClass();
                                        realFeatureFlagManager = (RealFeatureFlagManager) ((FeatureFlagManager) lazy.initializer);
                                        featureFlag$EnabledDisabledAmplitudeExperiment$Options = (FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$ClientSupportAutomationChatBotTypingBubble.INSTANCE);
                                        featureFlag$EnabledDisabledAmplitudeExperiment$Options.getClass();
                                        if (featureFlag$EnabledDisabledAmplitudeExperiment$Options != FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled) {
                                            if (java.time.Duration.between(message.getTimestamp(), DimensionKt.now((AndroidClock) lazy.value)).getSeconds() <= ((FeatureFlag$LongFeatureFlag.Value) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$SupportChatPollingInterval.INSTANCE)).value * 2) {
                                            }
                                        }
                                        z2 = false;
                                        mutableState5.setValue(Boolean.valueOf(z2));
                                        boolean booleanValue52222 = ((Boolean) mutableState4.getValue()).booleanValue();
                                        str = (String) mutableState3.getValue();
                                        SupportConversationPersistence supportConversationPersistence2222 = chatPresenter.conversationPersistence;
                                        flowCollector2 = flowCollector;
                                        anonymousClass1.L$4 = flowCollector2;
                                        transcript2 = transcript;
                                        anonymousClass1.L$6 = transcript2;
                                        anonymousClass1.L$7 = list;
                                        anonymousClass1.L$8 = list2;
                                        anonymousClass1.L$10 = str;
                                        i2 = 0;
                                        anonymousClass1.I$0 = 0;
                                        boolean z102222 = z;
                                        anonymousClass1.Z$0 = z102222;
                                        anonymousClass1.Z$1 = z2;
                                        anonymousClass1.Z$2 = booleanValue52222;
                                        anonymousClass1.label = 1;
                                        savedInput = supportConversationPersistence2222.getSavedInput(anonymousClass1);
                                        coroutineSingletons2 = coroutineSingletons;
                                        if (savedInput != coroutineSingletons2) {
                                        }
                                    }
                                }
                            } else {
                                mutableState = mutableState9;
                            }
                            anonymousClass1 = new AnonymousClass1(continuation);
                            Object obj822 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons322 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i == 0) {
                            }
                            break;
                        default:
                            WithdrawPresenter withdrawPresenter = (WithdrawPresenter) obj7;
                            BetterNavigator.ScreenNavigator screenNavigator = withdrawPresenter.navigator;
                            Analytics analytics2 = withdrawPresenter.analytics;
                            WithdrawScreen withdrawScreen = withdrawPresenter.args;
                            WithdrawViewEvent withdrawViewEvent = (WithdrawViewEvent) obj;
                            if (Intrinsics.areEqual(withdrawViewEvent, WithdrawViewEvent.CloseClick.INSTANCE)) {
                                analytics2.track(new CashWithdrawCancel(withdrawScreen.blockersData.flowToken), null);
                                screenNavigator.goTo(Back.INSTANCE);
                            } else if (withdrawViewEvent instanceof WithdrawViewEvent.ChangeInstrumentClick) {
                                Instrument instrument2 = (Instrument) state4.getValue();
                                if (instrument2 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$3("Withdraw instrument was null when tapping instrument selector");
                                    break;
                                } else {
                                    analytics2.track(new CashWithdrawSelectInstrument(withdrawScreen.blockersData.flowToken, NavArgumentKt.toCdfInstrumentType(instrument2.cashInstrumentType)), null);
                                    withdrawPresenter.navigator.goTo(new InstrumentSelectionLoadingScreen(BlockersData.copy$default(withdrawPresenter.args.blockersData, null, null, null, null, null, null, new TransfersRouterScreen(WithdrawScreen.copy$default(withdrawPresenter.args, null, r1, instrument2.token, r55 != null ? r7.depositPreference : null, 1)), null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -65, 65535), new InstrumentSelectionLoadingScreen.InstrumentSelectionParams.Withdraw((Money) mutableState6.getValue(), instrument2.token, r55 != null ? ((WithdrawViewModel.DepositPreferenceOption) obj6).depositPreference : null)));
                                }
                            } else if (withdrawViewEvent instanceof WithdrawViewEvent.OnAmountChanged) {
                                Money parseMoneyFromString$default = Moneys.parseMoneyFromString$default(((WithdrawViewEvent.OnAmountChanged) withdrawViewEvent).amount, (CurrencyCode) obj5);
                                mutableState6.setValue(parseMoneyFromString$default);
                                WithdrawViewModel.DepositPreferenceOption depositPreferenceOption2 = (WithdrawViewModel.DepositPreferenceOption) mutableState7.getValue();
                                DepositPreference depositPreference = depositPreferenceOption2 != null ? depositPreferenceOption2.depositPreference : null;
                                if (depositPreference != null) {
                                    Iterator it3 = WithdrawPresenter.models$depositPreferenceOptionsFor(withdrawPresenter, state4, state5, parseMoneyFromString$default).iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            ?? next2 = it3.next();
                                            if (((WithdrawViewModel.DepositPreferenceOption) next2).depositPreference == depositPreference) {
                                                depositPreferenceOption = next2;
                                            }
                                        } else {
                                            depositPreferenceOption = null;
                                        }
                                    }
                                    WithdrawViewModel.DepositPreferenceOption depositPreferenceOption3 = depositPreferenceOption;
                                    if (depositPreferenceOption3 == null) {
                                        depositPreferenceOption3 = (WithdrawViewModel.DepositPreferenceOption) mutableState7.getValue();
                                    }
                                    mutableState7.setValue(depositPreferenceOption3);
                                }
                            } else if (withdrawViewEvent instanceof WithdrawViewEvent.Expanded) {
                                analytics2.track(new CashWithdrawViewKeypad(withdrawScreen.blockersData.flowToken), null);
                                mutableState8.setValue((Money) mutableState6.getValue());
                                mutableState9.setValue(WithdrawPresenter.InputMode.CHANGE_AMOUNT);
                            } else if (withdrawViewEvent instanceof WithdrawViewEvent.Peeking) {
                                mutableState9.setValue(WithdrawPresenter.InputMode.VIEW_AMOUNT);
                            } else if (withdrawViewEvent instanceof WithdrawViewEvent.DepositPreferenceClick) {
                                String str9 = withdrawScreen.blockersData.flowToken;
                                WithdrawViewEvent.DepositPreferenceClick depositPreferenceClick = (WithdrawViewEvent.DepositPreferenceClick) withdrawViewEvent;
                                WithdrawViewModel.DepositPreferenceOption depositPreferenceOption4 = depositPreferenceClick.depositPreferenceOption;
                                String upperCase = depositPreferenceOption4.depositPreference.name().toUpperCase(Locale.ROOT);
                                upperCase.getClass();
                                analytics2.track(new CashWithdrawDepositPreferenceSelected(upperCase, str9), null);
                                mutableState7.setValue(depositPreferenceOption4);
                                mutableState5.setValue(((RealSecuritySignalsAggregator) withdrawPresenter.securitySignalsAggregator).buildSignalsContext(depositPreferenceClick.signalsContext));
                                WithdrawViewModel.DepositPreferenceOption depositPreferenceOption5 = (WithdrawViewModel.DepositPreferenceOption) mutableState7.getValue();
                                depositPreferenceOption5.getClass();
                                if (!depositPreferenceOption5.enabled) {
                                    List list14 = (List) state3.getValue();
                                    ArrayList arrayList8 = new ArrayList();
                                    for (Object obj10 : list14) {
                                        String str10 = ((Instrument) obj10).token;
                                        Instrument instrument3 = (Instrument) state4.getValue();
                                        if (!Intrinsics.areEqual(str10, instrument3 != null ? instrument3.token : null)) {
                                            arrayList8.add(obj10);
                                        }
                                    }
                                    Iterator it4 = arrayList8.iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            ?? next3 = it4.next();
                                            Instrument instrument4 = (Instrument) next3;
                                            WithdrawViewModel.DepositPreferenceOption depositPreferenceOption6 = (WithdrawViewModel.DepositPreferenceOption) mutableState7.getValue();
                                            depositPreferenceOption6.getClass();
                                            DepositPreference depositPreference2 = depositPreferenceOption6.depositPreference;
                                            CashOutCapabilityManager$CashOutCapabilities cashOutCapabilityManager$CashOutCapabilities = (CashOutCapabilityManager$CashOutCapabilities) state5.getValue();
                                            if (cashOutCapabilityManager$CashOutCapabilities != null) {
                                                Iterator it5 = cashOutCapabilityManager$CashOutCapabilities.capabilities.iterator();
                                                while (true) {
                                                    if (it5.hasNext()) {
                                                        instrumentCapability2 = it5.next();
                                                        if (((CashOutCapabilityManager$CashOutCapabilities.InstrumentCapability) instrumentCapability2).instrumentType == instrument4.cashInstrumentType) {
                                                        }
                                                    } else {
                                                        instrumentCapability2 = 0;
                                                    }
                                                }
                                                instrumentCapability = instrumentCapability2;
                                            } else {
                                                instrumentCapability = null;
                                            }
                                            CashOutCapabilityManager$CashOutCapabilities.QualifiedCapability findQualifiedCapability = instrumentCapability != null ? UtilsKt.findQualifiedCapability(instrumentCapability, instrument4) : null;
                                            if (findQualifiedCapability == null || (list7 = findQualifiedCapability.supportedFlows) == null) {
                                                z6 = false;
                                            } else {
                                                int i9 = WithdrawPresenter.WhenMappings.$EnumSwitchMapping$1[depositPreference2.ordinal()];
                                                z6 = i9 != 1 ? i9 != 2 ? true : list7.contains(SupportedFlows.STANDARD_CASH_OUT) : list7.contains(SupportedFlows.INSTANT_CASH_OUT);
                                            }
                                            if (z6) {
                                                instrument = next3;
                                            }
                                        } else {
                                            instrument = null;
                                        }
                                    }
                                    if (instrument != null) {
                                        Money money = (Money) mutableState6.getValue();
                                        Instrument instrument5 = (Instrument) state4.getValue();
                                        instrument5.getClass();
                                        withdrawPresenter.navigator.goTo(new InstrumentSelectionLoadingScreen(BlockersData.copy$default(withdrawPresenter.args.blockersData, null, null, null, null, null, null, new TransfersRouterScreen(WithdrawScreen.copy$default(withdrawPresenter.args, null, money, instrument5.token, r55 != null ? r2.depositPreference : null, 1)), null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -65, 65535), new InstrumentSelectionLoadingScreen.InstrumentSelectionParams.Withdraw(money, instrument5.token, r55 != null ? ((WithdrawViewModel.DepositPreferenceOption) mutableState7.getValue()).depositPreference : null)));
                                    } else {
                                        Money money2 = (Money) mutableState6.getValue();
                                        WithdrawViewModel.DepositPreferenceOption depositPreferenceOption7 = (WithdrawViewModel.DepositPreferenceOption) mutableState7.getValue();
                                        depositPreferenceOption7.getClass();
                                        BlockersData copy$default = BlockersData.copy$default(withdrawScreen.blockersData, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, TransferData.copy$default(withdrawPresenter.transferData, money2, depositPreferenceOption7.depositPreference, depositPreferenceOption7.fee, null, null, null, null, null, 32622), null, null, null, null, null, null, null, null, null, false, null, null, null, -1, 65531);
                                        TransferType transferType = TransferType.CASH_OUT;
                                        DepositPreference depositPreference3 = depositPreferenceOption7.depositPreference;
                                        screenNavigator.goTo(new InstrumentNotLinkedScreen(copy$default, transferType, depositPreference3, WithdrawScreen.copy$default(withdrawPresenter.args, null, money2, null, depositPreference3, 1)));
                                    }
                                } else if (withdrawPresenter.multiLinkingUxButtonsEnabled) {
                                    mutableState10.setValue(Boolean.TRUE);
                                }
                            } else if (Intrinsics.areEqual(withdrawViewEvent, WithdrawViewEvent.CtaClick.INSTANCE)) {
                                mutableState10.setValue(Boolean.TRUE);
                            } else if (!Intrinsics.areEqual(withdrawViewEvent, WithdrawViewEvent.DismissChangeAmountClick.INSTANCE)) {
                                if (!Intrinsics.areEqual(withdrawViewEvent, WithdrawViewEvent.SaveAmountClick.INSTANCE)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                } else {
                                    String str11 = withdrawScreen.blockersData.flowToken;
                                    Long l = ((Money) mutableState6.getValue()).amount;
                                    Integer num = l != null ? new Integer((int) l.longValue()) : null;
                                    CurrencyCode currencyCode = ((Money) mutableState6.getValue()).currency_code;
                                    analytics2.track(new CashWithdrawSaveAmount(currencyCode != null ? com.squareup.cash.integration.analytics.UtilsKt.getAsCdfCurrencyCode(currencyCode) : null, num, str11), null);
                                }
                            } else if (((Money) mutableState8.getValue()) != null) {
                                analytics2.track(new CashWithdrawDismissAmount(withdrawScreen.blockersData.flowToken), null);
                                Money money3 = (Money) mutableState8.getValue();
                                money3.getClass();
                                mutableState6.setValue(money3);
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }

                public AnonymousClass2(FlowCollector flowCollector, ChatPresenter chatPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = chatPresenter;
                    this.$currentMessages$delegate$inlined = mutableState;
                    this.$lastReadMessageToken$delegate$inlined = mutableState2;
                    this.$lastMessageSentTimestamp$delegate$inlined = mutableState3;
                    this.$isUserTyping$delegate$inlined = mutableState4;
                    this.$isShowingTypingIndicator$delegate$inlined = mutableState5;
                    this.$hasInput$delegate$inlined = mutableState6;
                    this.$fileAttachment$delegate$inlined = mutableState7;
                    this.$lastItemVisible$delegate$inlined = mutableState8;
                    this.$hasAcceptedHandover$delegate$inlined = mutableState9;
                    this.$conversation$delegate$inlined = mutableState10;
                }
            }
        };
        mutableState8 = mutableState19;
        mutableState9 = mutableState27;
        mutableState10 = mutableState2;
        mutableState11 = mutableState282;
        mutableState12 = mutableState20;
        mutableState13 = mutableState22;
        gapComposer2.updateRememberedValue(flow22);
        rememberedValue = flow22;
        EmptyList emptyList2 = EmptyList.INSTANCE;
        GapComposer gapComposer52 = gapComposer2;
        MutableState collectAsState52 = Updater.collectAsState((Flow) rememberedValue, new ChatState(emptyList2, emptyList2, true, emptyList2, false, PagingStatus.EXHAUSTED, null, null, null, false, null, 0, emptyList2, true, false, false, false, false), null, gapComposer52, 0, 2);
        MutableState mutableState292 = mutableState13;
        mutableState14 = mutableState11;
        final MutableState mutableState302 = mutableState7;
        Continuation continuation52 = continuation;
        mutableState15 = mutableState;
        ChatPresenter$models$$inlined$CollectEffect$1 chatPresenter$models$$inlined$CollectEffect$12 = new ChatPresenter$models$$inlined$CollectEffect$1(flow, (Continuation) null, (ChatPresenter) this, collectAsState52, mutableState14, mutableState21, mutableState12, mutableState10, mutableState302, mutableState26, mutableState9, mutableState15, mutableState8, mutableState5, mutableState6);
        final MutableState mutableState312 = mutableState10;
        gapComposer3 = gapComposer52;
        Updater.LaunchedEffect(gapComposer3, flow, chatPresenter$models$$inlined$CollectEffect$12);
        rememberedValue2 = gapComposer3.rememberedValue();
        obj6 = obj5;
        if (rememberedValue2 == obj6) {
        }
        MutableState mutableState322 = (MutableState) rememberedValue2;
        rememberedValue3 = gapComposer3.rememberedValue();
        if (rememberedValue3 == obj6) {
        }
        Function2 function27 = (Function2) rememberedValue3;
        StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = AnswersKt.LocalAnswerDispatcher;
        AnswerDispatcher answerDispatcher5 = (AnswerDispatcher) gapComposer3.consume(staticProvidableCompositionLocal2);
        changedInstance = gapComposer3.changedInstance(answerDispatcher5);
        rememberedValue4 = gapComposer3.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue4 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function27, answerDispatcher5, 23);
        gapComposer3.updateRememberedValue(rememberedValue4);
        Updater.DisposableEffect(answerDispatcher5, (Function1) rememberedValue4, gapComposer3);
        rememberedValue5 = gapComposer3.rememberedValue();
        if (rememberedValue5 == obj6) {
        }
        Function2 function222 = (Function2) rememberedValue5;
        AnswerDispatcher answerDispatcher22 = (AnswerDispatcher) gapComposer3.consume(staticProvidableCompositionLocal2);
        changedInstance2 = gapComposer3.changedInstance(answerDispatcher22);
        rememberedValue6 = gapComposer3.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue6 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function222, answerDispatcher22, 24);
        gapComposer3.updateRememberedValue(rememberedValue6);
        Updater.DisposableEffect(answerDispatcher22, (Function1) rememberedValue6, gapComposer3);
        changedInstance3 = gapComposer3.changedInstance(this) | gapComposer3.changed(mutableState15) | gapComposer3.changed(mutableState21);
        rememberedValue7 = gapComposer3.rememberedValue();
        if (changedInstance3) {
        }
        mutableState16 = mutableState15;
        final int i112 = 0;
        Function2 function232 = new Function2(this) { // from class: com.squareup.cash.support.chat.presenters.ChatPresenter$$ExternalSyntheticLambda9
            public final /* synthetic */ ChatPresenter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj8, Object obj9) {
                boolean booleanValue;
                boolean booleanValue2;
                boolean booleanValue3;
                boolean booleanValue4;
                boolean booleanValue5;
                boolean booleanValue6;
                boolean booleanValue7;
                boolean booleanValue8;
                int i122 = i112;
                Back back = Back.INSTANCE;
                MutableState mutableState33 = mutableState21;
                MutableState mutableState34 = mutableState312;
                MutableState mutableState35 = mutableState302;
                MutableState mutableState36 = mutableState14;
                State state = mutableState16;
                ChatPresenter chatPresenter2 = this.f$0;
                switch (i122) {
                    case 0:
                        SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptResult chatExitPromptResult = (SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptResult) obj9;
                        ((SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion) obj8).getClass();
                        if (Intrinsics.areEqual(chatExitPromptResult, SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptResult.EndConversation.INSTANCE)) {
                            chatPresenter2.navigator.goTo(back);
                            booleanValue3 = ((Boolean) state.getValue()).booleanValue();
                            booleanValue4 = ((Boolean) mutableState36.getValue()).booleanValue();
                            chatPresenter2.trackChatCompletionAndExit(booleanValue3, booleanValue4, (Conversation) mutableState35.getValue(), (Instant) mutableState34.getValue());
                            mutableState34.setValue(null);
                        } else if (Intrinsics.areEqual(chatExitPromptResult, SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptResult.SaveAndContinue.INSTANCE)) {
                            chatPresenter2.closeChat(((Boolean) mutableState33.getValue()).booleanValue());
                            booleanValue = ((Boolean) state.getValue()).booleanValue();
                            booleanValue2 = ((Boolean) mutableState36.getValue()).booleanValue();
                            chatPresenter2.trackChatCompletionAndExit(booleanValue, booleanValue2, (Conversation) mutableState35.getValue(), (Instant) mutableState34.getValue());
                            mutableState34.setValue(null);
                        }
                        break;
                    default:
                        SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetResult chatExitPromptSheetResult = (SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetResult) obj9;
                        ((SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion) obj8).getClass();
                        if (Intrinsics.areEqual(chatExitPromptSheetResult, SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetResult.EndConversation.INSTANCE)) {
                            chatPresenter2.navigator.goTo(back);
                            booleanValue7 = ((Boolean) state.getValue()).booleanValue();
                            booleanValue8 = ((Boolean) mutableState36.getValue()).booleanValue();
                            chatPresenter2.trackChatCompletionAndExit(booleanValue7, booleanValue8, (Conversation) mutableState35.getValue(), (Instant) mutableState34.getValue());
                            mutableState34.setValue(null);
                        } else if (Intrinsics.areEqual(chatExitPromptSheetResult, SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetResult.SaveAndContinue.INSTANCE)) {
                            chatPresenter2.closeChat(((Boolean) mutableState33.getValue()).booleanValue());
                            booleanValue5 = ((Boolean) state.getValue()).booleanValue();
                            booleanValue6 = ((Boolean) mutableState36.getValue()).booleanValue();
                            chatPresenter2.trackChatCompletionAndExit(booleanValue5, booleanValue6, (Conversation) mutableState35.getValue(), (Instant) mutableState34.getValue());
                            mutableState34.setValue(null);
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        gapComposer3.updateRememberedValue(function232);
        rememberedValue7 = function232;
        Function2 function242 = (Function2) rememberedValue7;
        AnswerDispatcher answerDispatcher32 = (AnswerDispatcher) gapComposer3.consume(staticProvidableCompositionLocal2);
        changed2 = gapComposer3.changed(function242) | gapComposer3.changedInstance(answerDispatcher32);
        rememberedValue8 = gapComposer3.rememberedValue();
        if (!changed2) {
        }
        rememberedValue8 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function242, answerDispatcher32, 25);
        gapComposer3.updateRememberedValue(rememberedValue8);
        Updater.DisposableEffect(answerDispatcher32, (Function1) rememberedValue8, gapComposer3);
        changedInstance4 = gapComposer3.changedInstance(this) | gapComposer3.changed(mutableState16) | gapComposer3.changed(mutableState21);
        rememberedValue9 = gapComposer3.rememberedValue();
        if (!changedInstance4) {
        }
        final int i122 = 1;
        Function2 function252 = new Function2(this) { // from class: com.squareup.cash.support.chat.presenters.ChatPresenter$$ExternalSyntheticLambda9
            public final /* synthetic */ ChatPresenter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj8, Object obj9) {
                boolean booleanValue;
                boolean booleanValue2;
                boolean booleanValue3;
                boolean booleanValue4;
                boolean booleanValue5;
                boolean booleanValue6;
                boolean booleanValue7;
                boolean booleanValue8;
                int i1222 = i122;
                Back back = Back.INSTANCE;
                MutableState mutableState33 = mutableState21;
                MutableState mutableState34 = mutableState312;
                MutableState mutableState35 = mutableState302;
                MutableState mutableState36 = mutableState14;
                State state = mutableState16;
                ChatPresenter chatPresenter2 = this.f$0;
                switch (i1222) {
                    case 0:
                        SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptResult chatExitPromptResult = (SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptResult) obj9;
                        ((SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion) obj8).getClass();
                        if (Intrinsics.areEqual(chatExitPromptResult, SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptResult.EndConversation.INSTANCE)) {
                            chatPresenter2.navigator.goTo(back);
                            booleanValue3 = ((Boolean) state.getValue()).booleanValue();
                            booleanValue4 = ((Boolean) mutableState36.getValue()).booleanValue();
                            chatPresenter2.trackChatCompletionAndExit(booleanValue3, booleanValue4, (Conversation) mutableState35.getValue(), (Instant) mutableState34.getValue());
                            mutableState34.setValue(null);
                        } else if (Intrinsics.areEqual(chatExitPromptResult, SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptResult.SaveAndContinue.INSTANCE)) {
                            chatPresenter2.closeChat(((Boolean) mutableState33.getValue()).booleanValue());
                            booleanValue = ((Boolean) state.getValue()).booleanValue();
                            booleanValue2 = ((Boolean) mutableState36.getValue()).booleanValue();
                            chatPresenter2.trackChatCompletionAndExit(booleanValue, booleanValue2, (Conversation) mutableState35.getValue(), (Instant) mutableState34.getValue());
                            mutableState34.setValue(null);
                        }
                        break;
                    default:
                        SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetResult chatExitPromptSheetResult = (SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetResult) obj9;
                        ((SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion) obj8).getClass();
                        if (Intrinsics.areEqual(chatExitPromptSheetResult, SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetResult.EndConversation.INSTANCE)) {
                            chatPresenter2.navigator.goTo(back);
                            booleanValue7 = ((Boolean) state.getValue()).booleanValue();
                            booleanValue8 = ((Boolean) mutableState36.getValue()).booleanValue();
                            chatPresenter2.trackChatCompletionAndExit(booleanValue7, booleanValue8, (Conversation) mutableState35.getValue(), (Instant) mutableState34.getValue());
                            mutableState34.setValue(null);
                        } else if (Intrinsics.areEqual(chatExitPromptSheetResult, SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetResult.SaveAndContinue.INSTANCE)) {
                            chatPresenter2.closeChat(((Boolean) mutableState33.getValue()).booleanValue());
                            booleanValue5 = ((Boolean) state.getValue()).booleanValue();
                            booleanValue6 = ((Boolean) mutableState36.getValue()).booleanValue();
                            chatPresenter2.trackChatCompletionAndExit(booleanValue5, booleanValue6, (Conversation) mutableState35.getValue(), (Instant) mutableState34.getValue());
                            mutableState34.setValue(null);
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        gapComposer3.updateRememberedValue(function252);
        rememberedValue9 = function252;
        Function2 function262 = (Function2) rememberedValue9;
        AnswerDispatcher answerDispatcher42 = (AnswerDispatcher) gapComposer3.consume(staticProvidableCompositionLocal2);
        changed3 = gapComposer3.changed(function262) | gapComposer3.changedInstance(answerDispatcher42);
        rememberedValue10 = gapComposer3.rememberedValue();
        if (!changed3) {
        }
        rememberedValue10 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function262, answerDispatcher42, 26);
        gapComposer3.updateRememberedValue(rememberedValue10);
        Updater.DisposableEffect(answerDispatcher42, (Function1) rememberedValue10, gapComposer3);
        str = (String) mutableState322.getValue();
        ChatState chatState32 = (ChatState) collectAsState52.getValue();
        if (str != null) {
        }
        chatPresenter = this;
        z = false;
        gapComposer3.startReplaceGroup(-1383879796);
        gapComposer3.end(false);
        rememberedValue11 = gapComposer3.rememberedValue();
        if (rememberedValue11 == obj6) {
        }
        long longValue2 = ((Number) rememberedValue11).longValue();
        rememberedValue12 = gapComposer3.rememberedValue();
        if (rememberedValue12 != obj6) {
        }
        Flow flow32 = (Flow) rememberedValue12;
        Updater.LaunchedEffect(gapComposer3, flow32, new ArticlePresenter$models$1$1(flow32, continuation2, chatPresenter, 7));
        mutableState292.setValue(((ChatState) collectAsState52.getValue()).messages);
        ChatStateMapper chatStateMapper2 = chatPresenter.chatStateMapper;
        chatState = (ChatState) collectAsState52.getValue();
        chatState.getClass();
        ArrayList arrayList22 = new ArrayList();
        ordinal = chatState.oldMessageStatus.ordinal();
        if (ordinal != 0) {
        }
        if (statusViewModel != null) {
        }
        AssetPublicSuffixList assetPublicSuffixList2 = chatStateMapper2.timestampFormatter;
        boolean z112 = chatStateMapper2.chatUiUpliftEnabled;
        ArrayList arrayList32 = new ArrayList();
        List list8 = chatState.messages;
        listIterator = list8.listIterator(list8.size());
        while (true) {
            if (listIterator.hasPrevious()) {
            }
            continuation2 = continuation3;
        }
        listIterator2 = list8.listIterator(list8.size());
        while (true) {
            if (listIterator2.hasPrevious()) {
            }
        }
        it = list8.iterator();
        Message message22 = r55;
        int i132 = 0;
        boolean z122 = false;
        while (it.hasNext()) {
        }
        ArrayList arrayList42 = arrayList22;
        GapComposer gapComposer62 = gapComposer3;
        arrayList42.addAll(arrayList32);
        if (chatState.suggestedReplies.isEmpty()) {
        }
        if (suggestedRepliesViewModel != null) {
        }
        AndroidStringManager androidStringManager22 = chatStateMapper2.stringManager;
        if (chatState.shouldShowTypingIndicator) {
        }
        if (typingIndicatorViewModel != null) {
        }
        if (arrayList42.isEmpty()) {
        }
        if (bottomBookmarkViewModel != null) {
        }
        if (chatState.shouldDisableCashbotFileUpload) {
        }
        z2 = true;
        boolean z1622 = chatState.initialState;
        boolean isEmpty22 = arrayList42.isEmpty();
        fileBody = chatState.fileAttachment;
        if (fileBody != null) {
        }
        i5 = chatState.unreadMessageCount;
        if (i5 > 0) {
        }
        String str1922 = chatState.savedInput;
        List list522 = chatState.oldMessages;
        List list622 = chatState.messages;
        from = RealEmojiDetector.from(list522, list622);
        if (!from.equals(ChatMessageAction.NoAction.INSTANCE)) {
        }
        scrollAction = r55;
        ChatViewModel chatViewModel2222 = new ChatViewModel(arrayList42, z1622, str2, isEmpty22, z2, chatAttachmentViewModel, str1922, scrollAction, ChatStateMapper.firstIndexOfUnreadMessage(chatState.lastReadMessageToken, arrayList42), chatStateMapper2.chatUiUpliftEnabled);
        gapComposer62.end(false);
        return chatViewModel2222;
    }

    public final void trackChatCompletionAndExit(boolean z, boolean z2, Conversation conversation, Instant instant) {
        Conversation.BotStatus botStatus;
        Conversation.BotStatus botStatus2;
        this.analytics.track(new CustomerSupportContactComplete(Channel.CHAT, this.args.flowToken, null, Boolean.valueOf(z), Boolean.valueOf(z2), (conversation == null || (botStatus2 = conversation.botStatus) == null) ? null : RoundedPolygonKt.access$toChatBotStatus(botStatus2)), null);
        if (instant != null) {
            long epochMilli = instant.toEpochMilli() * 1000;
            if (conversation == null || (botStatus = conversation.botStatus) == null) {
                botStatus = Conversation.BotStatus.UNKNOWN;
            }
            SpanTracking.spanEnded$default(RealObservabilityManager.startTrackingSpan$default(this.observabilityManager, UUID.randomUUID().toString(), "receive_new_support_chat_messages", null, Long.valueOf(epochMilli), 4), MapsKt__MapsKt.mapOf(new Pair("end_kind", "exit_chat"), new Pair("bot_status", botStatus.toString())), 1);
        }
    }
}
