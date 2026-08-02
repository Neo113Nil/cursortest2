package com.squareup.cash.tabs.views;

import android.content.Context;
import android.database.Cursor;
import android.view.Choreographer;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import app.cash.api.ApiResult;
import app.cash.paraphrase.FormattedResource;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.request.ErrorResult;
import coil3.request.ImageRequest;
import coil3.request.SuccessResult;
import com.alexvasilkov.gestures.views.GestureImageView;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.measurement.zzaag;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.cdf.app.AppNavigateOpenSpace;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.address.StablecoinNetwork;
import com.squareup.cash.crypto.address.StablecoinWithdrawalOption;
import com.squareup.cash.data.profile.RealProfileAliasRepository;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db.profile.ProfileAlias;
import com.squareup.cash.education.stories.db.StoryQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.backend.api.SpanTracking;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.offers.backend.api.OffersCollectionSpanState;
import com.squareup.cash.offers.backend.api.OffersCollectionTrackingAction;
import com.squareup.cash.onboarding.util.AliasVerifier$Args;
import com.squareup.cash.onboarding.util.AliasVerifier$Result;
import com.squareup.cash.onboarding.util.RealAliasVerifier$verify$1;
import com.squareup.cash.onboarding.util.RealAliasVerifierKt$WhenMappings;
import com.squareup.cash.payments.presenters.PaymentConfigurationTitleBuilder$WhenMappings;
import com.squareup.cash.payments.presenters.PaymentRouterData;
import com.squareup.cash.payments.screens.PaymentConfigurationStep;
import com.squareup.cash.payments.screens.PaymentConfigurationStep$TransientStep$Loading;
import com.squareup.cash.payments.screens.SkippableStep;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationTitleViewModel;
import com.squareup.cash.payments.viewmodels.TitleTapped;
import com.squareup.cash.performance.AggregatingScrollPerformanceTracker$$ExternalSyntheticLambda0;
import com.squareup.cash.performance.FrameCallbackScheduler;
import com.squareup.cash.qrcodes.screens.CashQrCodeScanner;
import com.squareup.cash.recipients.backend.api.RecipientSearchResults;
import com.squareup.cash.recipients.backend.api.RecipientVendor$Section;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.scrubbing.FakeTextFieldBuffer$BufferEntry;
import com.squareup.cash.support.backend.real.RealSupportDbQueries$getExistingEmail$1;
import com.squareup.cash.treehouse.sqldelight.SqlType;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.ui.widget.keypad.KeypadAmount;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyTracker;
import com.squareup.cash.userjourneys.tracker.UserJourney$Name;
import com.squareup.cash.userjourneys.tracker.UserJourney$Variant$Login$Login;
import com.squareup.cash.userjourneys.tracker.UserJourney$Variant$Login$SignUp;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.cash.work.applets.presenters.ShiftsTileState;
import com.squareup.cash.work.applets.presenters.ShiftsTileViewModelBuilder$UpcomingShiftDisplay;
import com.squareup.cash.work.applets.presenters.UpcomingShiftData;
import com.squareup.cash.work.data.real.RealShiftTimeFormatter;
import com.squareup.kotterknife.Lazy;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.calendar.CalendarEvent;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.VerifyEmailRequest;
import com.squareup.protos.franklin.app.VerifyEmailResponse;
import com.squareup.protos.franklin.app.VerifySmsRequest;
import com.squareup.protos.franklin.app.VerifySmsResponse;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SignInType;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import com.squareup.scannerview.TextSetter;
import com.squareup.util.android.ToastKt;
import com.squareup.util.cash.Countries;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.wire.GrpcStatus;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.lite.repository.FinancialConnectionsLiteRepositoryImpl$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.lite.repository.FinancialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1;
import com.stripe.android.financialconnections.lite.repository.FinancialConnectionsLiteRepositoryImpl$synchronize$1;
import com.stripe.android.financialconnections.lite.repository.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.UserFacingEventResponse;
import com.stripe.android.hcaptcha.analytics.CaptchaAnalyticsEvent;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.android.HandlerDispatcherKt$$ExternalSyntheticLambda0;
import kotlinx.serialization.KSerializer;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ToolbarTuckTargets implements FrameCallbackScheduler, OffsetMapping, ImageRequest.Listener, KeypadAmount.OnAmountChangedListener, SupportSQLiteQuery, CaptchaAnalyticsEvent {
    public Object endCornerCenterX$delegate;
    public Object startCornerCenterX$delegate;

    public ToolbarTuckTargets(int i) {
        switch (i) {
            case 9:
                this.startCornerCenterX$delegate = Choreographer.getInstance();
                this.endCornerCenterX$delegate = new LinkedHashMap();
                break;
            case 21:
                this.startCornerCenterX$delegate = new Lazy(24);
                this.endCornerCenterX$delegate = new Lazy(24);
                break;
            default:
                this.startCornerCenterX$delegate = Updater.mutableStateOf$default(null);
                this.endCornerCenterX$delegate = Updater.mutableStateOf$default(null);
                break;
        }
    }

    public static final RecipientVendor$Section access$mapResult(ToolbarTuckTargets toolbarTuckTargets, RecipientSearchResults recipientSearchResults) {
        if (recipientSearchResults instanceof RecipientSearchResults.LocalContacts) {
            return new RecipientVendor$Section.LocalContacts(((RecipientSearchResults.LocalContacts) recipientSearchResults).recipients, false);
        }
        if (recipientSearchResults instanceof RecipientSearchResults.ServerSuggestion) {
            RecipientSearchResults.ServerSuggestion serverSuggestion = (RecipientSearchResults.ServerSuggestion) recipientSearchResults;
            return new RecipientVendor$Section.ServerSuggestion(serverSuggestion.exactMatch, serverSuggestion.matches);
        }
        if (recipientSearchResults instanceof RecipientSearchResults.NewCustomer) {
            return new RecipientVendor$Section.LocalContacts(CollectionsKt__CollectionsJVMKt.listOf(null), true);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static PaymentConfigurationTitleViewModel.TitleViewModel getAssetTitle(StablecoinWithdrawalOption stablecoinWithdrawalOption) {
        StablecoinNetwork stablecoinNetwork = stablecoinWithdrawalOption.network;
        String str = stablecoinNetwork.assetName;
        PaymentConfigurationTitleViewModel.TitleViewModel.AvatarViewModel avatarViewModel = null;
        Image image = (stablecoinNetwork.assetIconLightUrl == null || stablecoinNetwork.assetIconDarkUrl == null) ? null : new Image(stablecoinNetwork.assetIconLightUrl, stablecoinNetwork.assetIconDarkUrl, 4);
        if (image != null) {
            Character monogram = GrpcStatus.Companion.monogram(stablecoinNetwork.assetName);
            avatarViewModel = new PaymentConfigurationTitleViewModel.TitleViewModel.AvatarViewModel(null, image, monogram != null ? String.valueOf(monogram.charValue()) : null);
        }
        return new PaymentConfigurationTitleViewModel.TitleViewModel(avatarViewModel, str, null, str, null, null, 224);
    }

    public static PaymentConfigurationTitleViewModel.TitleViewModel getNoteTitle(String str, String str2) {
        return new PaymentConfigurationTitleViewModel.TitleViewModel(null, str, str2, Recorder$$ExternalSyntheticOutline2.m$1(str, str2 == null ? "" : str2), null, TitleTapped.NoteTapped.INSTANCE, 32);
    }

    public static ListBuilder getRow(Cursor cursor) {
        Object obj;
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        int columnCount = cursor.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            int type2 = cursor.getType(i);
            Object obj2 = null;
            if (type2 != 0) {
                if (type2 == 1) {
                    obj = new SqlType.Long(cursor.getLong(i));
                } else if (type2 == 2) {
                    obj = new SqlType.Double(cursor.getDouble(i));
                } else if (type2 == 3) {
                    String string2 = cursor.getString(i);
                    string2.getClass();
                    obj2 = new SqlType.String(string2);
                } else {
                    if (type2 != 4) {
                        Path$$ExternalSyntheticBUOutline0.m();
                        return null;
                    }
                    byte[] blob = cursor.getBlob(i);
                    blob.getClass();
                    obj2 = new SqlType.Bytes(blob);
                }
                obj2 = obj;
            }
            createListBuilder.add(obj2);
        }
        return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
    }

    public static PaymentConfigurationTitleViewModel.TitleViewModel getStablecoinRecipientTitle(StablecoinWithdrawalOption stablecoinWithdrawalOption, String str, boolean z) {
        StablecoinNetwork stablecoinNetwork = stablecoinWithdrawalOption.network;
        String str2 = stablecoinNetwork.truncatedAddress;
        PaymentConfigurationTitleViewModel.TitleViewModel.AvatarViewModel avatarViewModel = null;
        if (z) {
            Image image = new Image(stablecoinNetwork.chainIconLightUrl, stablecoinNetwork.chainIconDarkUrl, 4);
            Character monogram = GrpcStatus.Companion.monogram(stablecoinNetwork.chainName);
            avatarViewModel = new PaymentConfigurationTitleViewModel.TitleViewModel.AvatarViewModel(null, image, monogram != null ? String.valueOf(monogram.charValue()) : null);
        }
        return new PaymentConfigurationTitleViewModel.TitleViewModel(avatarViewModel, str2, str, Recorder$$ExternalSyntheticOutline2.m$1(str2, str == null ? "" : str), null, null, 224);
    }

    public static boolean nativeKillSwitchActive(FinancialConnectionsSessionManifest financialConnectionsSessionManifest) {
        Map map = financialConnectionsSessionManifest.features;
        if (map == null) {
            return true;
        }
        if (map.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (Intrinsics.areEqual(entry.getKey(), "bank_connections_mobile_native_version_killswitch") && ((Boolean) entry.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static OffsetDateTime parseOffsetDateTime(String str) {
        Object failure;
        try {
            Result.Companion companion = Result.Companion;
            failure = OffsetDateTime.parse(str);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (OffsetDateTime) failure;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(SupportSQLiteProgram supportSQLiteProgram) {
        Error.Code.Companion.access$bindArgs(supportSQLiteProgram, (List) this.endCornerCenterX$delegate);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (r3 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String formatClockInTime(long j, ShiftSchedule shiftSchedule) {
        OffsetDateTime ofInstant;
        ZoneOffset offset;
        ShiftSchedule.Version version;
        CalendarEvent calendarEvent;
        String str;
        RealShiftTimeFormatter realShiftTimeFormatter = (RealShiftTimeFormatter) this.endCornerCenterX$delegate;
        Instant ofEpochMilli = Instant.ofEpochMilli(j);
        OffsetDateTime parseOffsetDateTime = (shiftSchedule == null || (version = shiftSchedule.published_version) == null || (calendarEvent = version.calendar_event) == null || (str = calendarEvent.start_datetime) == null) ? null : parseOffsetDateTime(str);
        if (parseOffsetDateTime != null && (offset = parseOffsetDateTime.getOffset()) != null) {
            ofEpochMilli.getClass();
            ofInstant = ofEpochMilli.atOffset(offset);
        }
        ofInstant = OffsetDateTime.ofInstant(ofEpochMilli, ZoneId.systemDefault());
        ofInstant.getClass();
        return realShiftTimeFormatter.formatTime(ofInstant, null);
    }

    @Override // com.stripe.android.hcaptcha.analytics.CaptchaAnalyticsEvent
    public Map getAdditionalParams() {
        return (Map) this.endCornerCenterX$delegate;
    }

    public PaymentConfigurationTitleViewModel.TitleViewModel getAmountTitle(PaymentRouterData paymentRouterData, String str, Money money, boolean z) {
        String m$1;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.startCornerCenterX$delegate;
        String format2 = money != null ? ((MoneyFormatter) this.endCornerCenterX$delegate).format(money) : null;
        Orientation orientation = paymentRouterData.orientation;
        Orientation orientation2 = Orientation.CASH;
        String str2 = orientation == orientation2 ? androidStringManager.get(R.string.payment_configuration_pay_verb) : androidStringManager.get(R.string.payment_configuration_request_verb);
        if (format2 != null) {
            m$1 = Recorder$$ExternalSyntheticOutline2.m$1(Countries.getString(androidStringManager.resources, paymentRouterData.orientation == orientation2 ? new FormattedResource(R.string.payment_configuration_pay_title, new Object[]{format2}) : new FormattedResource(R.string.payment_configuration_request_title, new Object[]{format2})), str != null ? str : "");
        } else {
            m$1 = Recorder$$ExternalSyntheticOutline2.m$1(str2, str != null ? str : "");
        }
        return new PaymentConfigurationTitleViewModel.TitleViewModel(null, str2, str, m$1, null, format2, TitleTapped.AmountTapped.INSTANCE, z);
    }

    @Override // com.stripe.android.core.networking.AnalyticsEvent
    public String getEventName() {
        return "elements.captcha.passive.error";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getExistingEmail(ContinuationImpl continuationImpl) {
        RealSupportDbQueries$getExistingEmail$1 realSupportDbQueries$getExistingEmail$1;
        int i;
        ProfileAlias profileAlias;
        if (continuationImpl instanceof RealSupportDbQueries$getExistingEmail$1) {
            realSupportDbQueries$getExistingEmail$1 = (RealSupportDbQueries$getExistingEmail$1) continuationImpl;
            int i2 = realSupportDbQueries$getExistingEmail$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSupportDbQueries$getExistingEmail$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realSupportDbQueries$getExistingEmail$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSupportDbQueries$getExistingEmail$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealProfileAliasRepository realProfileAliasRepository = (RealProfileAliasRepository) this.startCornerCenterX$delegate;
                    UiAlias.Type.Companion companion = UiAlias.Type.Companion;
                    realSupportDbQueries$getExistingEmail$1.label = 1;
                    obj = JobKt.withContext(realProfileAliasRepository.ioContext, new GooglePayPresenter$models$1$1(realProfileAliasRepository, null), realSupportDbQueries$getExistingEmail$1);
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
                profileAlias = (ProfileAlias) CollectionsKt.firstOrNull((List) obj);
                if (profileAlias == null) {
                    return profileAlias.canonical_text;
                }
                return null;
            }
        }
        realSupportDbQueries$getExistingEmail$1 = new RealSupportDbQueries$getExistingEmail$1(this, continuationImpl);
        Object obj2 = realSupportDbQueries$getExistingEmail$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSupportDbQueries$getExistingEmail$1.label;
        if (i != 0) {
        }
        profileAlias = (ProfileAlias) CollectionsKt.firstOrNull((List) obj2);
        if (profileAlias == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: getFinancialConnectionsSession-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m3757getFinancialConnectionsSessiongIAlus(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, ContinuationImpl continuationImpl) {
        FinancialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1 financialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1;
        int i;
        if (continuationImpl instanceof FinancialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1) {
            financialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1 = (FinancialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1) continuationImpl;
            int i2 = financialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                financialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = financialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = financialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                ApiRequest.Factory factory = (ApiRequest.Factory) this.endCornerCenterX$delegate;
                financialConnectionsSheetConfiguration.getClass();
                ApiRequest createGet$default = ApiRequest.Factory.createGet$default(factory, "https://api.stripe.com/v1/link_account_sessions/session_receipt", new ApiRequest.Options(new FinancialConnectionsLiteRepositoryImpl$$ExternalSyntheticLambda0(financialConnectionsSheetConfiguration, 0), new FinancialConnectionsLiteRepositoryImpl$$ExternalSyntheticLambda0(financialConnectionsSheetConfiguration, 1)), MapsKt__MapsJVMKt.mapOf(new Pair("client_secret", financialConnectionsSheetConfiguration.financialConnectionsSessionClientSecret)));
                TextSetter textSetter = (TextSetter) this.startCornerCenterX$delegate;
                KSerializer serializer = FinancialConnectionsSession.Companion.serializer();
                financialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1.label = 1;
                Object m3980execute0E7RQCE = textSetter.m3980execute0E7RQCE(createGet$default, serializer, financialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1);
                return m3980execute0E7RQCE == coroutineSingletons ? coroutineSingletons : m3980execute0E7RQCE;
            }
        }
        financialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1 = new FinancialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1(this, continuationImpl);
        Object obj2 = financialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1.label;
        if (i == 0) {
        }
    }

    public PaymentConfigurationTitleViewModel.TitleViewModel getRecipientTitle(RecipientViewModel recipientViewModel, String str) {
        String str2 = (String) recipientViewModel.recipient.abbreviatedName$delegate.getValue();
        return new PaymentConfigurationTitleViewModel.TitleViewModel(new PaymentConfigurationTitleViewModel.TitleViewModel.AvatarViewModel(recipientViewModel.accentColor, recipientViewModel.recipient.photo, String.valueOf(recipientViewModel.monogram)), str2, str, Recorder$$ExternalSyntheticOutline2.m$1(str2, str == null ? "" : str), ((AndroidStringManager) this.startCornerCenterX$delegate).get(R.string.composer_recipient_title_action), new TitleTapped.RecipientTapped(recipientViewModel), 32);
    }

    @Override // com.stripe.android.hcaptcha.analytics.CaptchaAnalyticsEvent
    public String getSiteKey() {
        return (String) this.startCornerCenterX$delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public String getSql() {
        return (String) this.startCornerCenterX$delegate;
    }

    public void onAction(OffersCollectionTrackingAction offersCollectionTrackingAction) {
        offersCollectionTrackingAction.getClass();
        if (offersCollectionTrackingAction.equals(OffersCollectionTrackingAction.StartCollectionTracking.INSTANCE)) {
            this.endCornerCenterX$delegate = OffersCollectionSpanState.copy$default((OffersCollectionSpanState) this.endCornerCenterX$delegate, RealObservabilityManager.startTrackingSpan$default((RealObservabilityManager) this.startCornerCenterX$delegate, null, "offers_collection_span", null, null, 12), null, null, 6);
            return;
        }
        if (offersCollectionTrackingAction.equals(OffersCollectionTrackingAction.EndCollectionTracking.INSTANCE)) {
            SpanTracking spanTracking = ((OffersCollectionSpanState) this.endCornerCenterX$delegate).collectionSpan;
            if (spanTracking != null) {
                SpanTracking.spanEnded$default(spanTracking, null, 3);
            }
            this.endCornerCenterX$delegate = new OffersCollectionSpanState(null, null, null);
            return;
        }
        if (offersCollectionTrackingAction instanceof OffersCollectionTrackingAction.StartLoading) {
            boolean z = ((OffersCollectionTrackingAction.StartLoading) offersCollectionTrackingAction).isFullscreen;
            SpanTracking spanTracking2 = ((OffersCollectionSpanState) this.endCornerCenterX$delegate).collectionSpan;
            if (spanTracking2 == null) {
                return;
            }
            this.endCornerCenterX$delegate = OffersCollectionSpanState.copy$default((OffersCollectionSpanState) this.endCornerCenterX$delegate, null, SpanTracking.childSpanStarted$default(spanTracking2, null, "offers_collection_loading", Thread$State$EnumUnboxingLocalUtility.m("full_screen_loading", String.valueOf(z)), 8), null, 5);
            return;
        }
        if (offersCollectionTrackingAction.equals(OffersCollectionTrackingAction.EndLoading.INSTANCE)) {
            SpanTracking spanTracking3 = ((OffersCollectionSpanState) this.endCornerCenterX$delegate).loadingSpan;
            if (spanTracking3 != null) {
                SpanTracking.spanEnded$default(spanTracking3, null, 3);
                return;
            }
            return;
        }
        if (offersCollectionTrackingAction.equals(OffersCollectionTrackingAction.StartNetworking.INSTANCE)) {
            SpanTracking spanTracking4 = ((OffersCollectionSpanState) this.endCornerCenterX$delegate).loadingSpan;
            if (spanTracking4 == null) {
                return;
            }
            this.endCornerCenterX$delegate = OffersCollectionSpanState.copy$default((OffersCollectionSpanState) this.endCornerCenterX$delegate, null, null, SpanTracking.childSpanStarted$default(spanTracking4, null, "offers_collection_networking_span", null, 12), 3);
            return;
        }
        if (!offersCollectionTrackingAction.equals(OffersCollectionTrackingAction.EndNetworking.INSTANCE)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        SpanTracking spanTracking5 = ((OffersCollectionSpanState) this.endCornerCenterX$delegate).networkSpan;
        if (spanTracking5 != null) {
            SpanTracking.spanEnded$default(spanTracking5, null, 3);
        }
    }

    @Override // com.squareup.cash.ui.widget.keypad.KeypadAmount.OnAmountChangedListener
    public void onCharacterAdded(KeypadAmount keypadAmount, char c) {
        ((AmountDisplayState) this.startCornerCenterX$delegate).add(c);
    }

    @Override // com.squareup.cash.ui.widget.keypad.KeypadAmount.OnAmountChangedListener
    public void onCharacterRemoved(KeypadAmount keypadAmount) {
        ((AmountDisplayState) this.startCornerCenterX$delegate).delete();
    }

    @Override // coil3.request.ImageRequest.Listener
    public void onError(ImageRequest imageRequest, ErrorResult errorResult) {
        Context context = ((GestureImageView) this.startCornerCenterX$delegate).getContext();
        context.getClass();
        ToastKt.toast(context, R.string.support_chat_image_detail_error, 0);
    }

    @Override // com.squareup.cash.ui.widget.keypad.KeypadAmount.OnAmountChangedListener
    public void onInvalidChange() {
        ((Shaker) this.endCornerCenterX$delegate).shake();
    }

    @Override // com.squareup.cash.ui.widget.keypad.KeypadAmount.OnAmountChangedListener
    public void onReset(KeypadAmount keypadAmount) {
        AmountDisplayState.reset$default((AmountDisplayState) this.startCornerCenterX$delegate, keypadAmount.amountText, 2);
    }

    @Override // coil3.request.ImageRequest.Listener
    public void onSuccess(SuccessResult successResult) {
        ((GestureImageView) this.endCornerCenterX$delegate).controller.updateState();
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int originalToTransformed(int i) {
        int length = ((String) this.startCornerCenterX$delegate).length();
        ArrayList arrayList = (ArrayList) this.endCornerCenterX$delegate;
        if (i == length) {
            return arrayList.size();
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            FakeTextFieldBuffer$BufferEntry fakeTextFieldBuffer$BufferEntry = (FakeTextFieldBuffer$BufferEntry) arrayList.get(i2);
            if ((fakeTextFieldBuffer$BufferEntry instanceof FakeTextFieldBuffer$BufferEntry.Original) && ((FakeTextFieldBuffer$BufferEntry.Original) fakeTextFieldBuffer$BufferEntry).originalOffset == i) {
                return i2;
            }
        }
        return i;
    }

    public void postFrameCallback(AggregatingScrollPerformanceTracker$$ExternalSyntheticLambda0 aggregatingScrollPerformanceTracker$$ExternalSyntheticLambda0) {
        aggregatingScrollPerformanceTracker$$ExternalSyntheticLambda0.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.endCornerCenterX$delegate;
        Object obj = linkedHashMap.get(aggregatingScrollPerformanceTracker$$ExternalSyntheticLambda0);
        if (obj == null) {
            obj = new HandlerDispatcherKt$$ExternalSyntheticLambda0(aggregatingScrollPerformanceTracker$$ExternalSyntheticLambda0, 2);
            linkedHashMap.put(aggregatingScrollPerformanceTracker$$ExternalSyntheticLambda0, obj);
        }
        ((Choreographer) this.startCornerCenterX$delegate).postFrameCallback((Choreographer.FrameCallback) obj);
    }

    public String preposition(PaymentConfigurationStep.NavigableStep navigableStep, PaymentRouterData paymentRouterData) {
        AndroidStringManager androidStringManager = (AndroidStringManager) this.startCornerCenterX$delegate;
        if (navigableStep.equals(SkippableStep.InputNote.INSTANCE)) {
            return androidStringManager.get(R.string.composer_amount_for_title);
        }
        if (!navigableStep.equals(PaymentConfigurationStep.NavigableStep.SelectRecipient.INSTANCE)) {
            if (!navigableStep.equals(SkippableStep.SelectStablecoinWithdrawalOption.INSTANCE) && !navigableStep.equals(PaymentConfigurationStep$TransientStep$Loading.INSTANCE) && !navigableStep.equals(SkippableStep.InputAmount.INSTANCE) && !navigableStep.equals(PaymentConfigurationStep.NavigableStep.ReviewPayment.INSTANCE) && !navigableStep.equals(PaymentConfigurationStep.NavigableStep.RequestShareOption.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
            }
            return null;
        }
        int i = PaymentConfigurationTitleBuilder$WhenMappings.$EnumSwitchMapping$0[paymentRouterData.orientation.ordinal()];
        if (i == 1) {
            return androidStringManager.get(R.string.composer_amount_to_title);
        }
        if (i == 2) {
            return androidStringManager.get(R.string.composer_amount_from_title);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public void showQrCodeScanner(boolean z) {
        ((Analytics) this.endCornerCenterX$delegate).track(new AppNavigateOpenSpace(null, null, AppNavigateOpenSpace.Space.QR_CODE, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE), null);
        ((BetterNavigator.ScreenNavigator) this.startCornerCenterX$delegate).goTo(new CashQrCodeScanner(null, z, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: synchronize-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m3758synchronize0E7RQCE(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, String str, ContinuationImpl continuationImpl) {
        FinancialConnectionsLiteRepositoryImpl$synchronize$1 financialConnectionsLiteRepositoryImpl$synchronize$1;
        int i;
        if (continuationImpl instanceof FinancialConnectionsLiteRepositoryImpl$synchronize$1) {
            financialConnectionsLiteRepositoryImpl$synchronize$1 = (FinancialConnectionsLiteRepositoryImpl$synchronize$1) continuationImpl;
            int i2 = financialConnectionsLiteRepositoryImpl$synchronize$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                financialConnectionsLiteRepositoryImpl$synchronize$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = financialConnectionsLiteRepositoryImpl$synchronize$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = financialConnectionsLiteRepositoryImpl$synchronize$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                TextSetter textSetter = (TextSetter) this.startCornerCenterX$delegate;
                ApiRequest.Factory factory = (ApiRequest.Factory) this.endCornerCenterX$delegate;
                financialConnectionsSheetConfiguration.getClass();
                ApiRequest createPost$default = ApiRequest.Factory.createPost$default(factory, "https://api.stripe.com/v1/financial_connections/sessions/synchronize", new ApiRequest.Options(new FinancialConnectionsLiteRepositoryImpl$$ExternalSyntheticLambda0(financialConnectionsSheetConfiguration, 0), new FinancialConnectionsLiteRepositoryImpl$$ExternalSyntheticLambda0(financialConnectionsSheetConfiguration, 1)), MapsKt__MapsKt.mapOf(new Pair("locale", Locale.getDefault().toLanguageTag()), new Pair("mobile", MapsKt__MapsKt.mapOf(new Pair("fullscreen", Boolean.TRUE), new Pair("hide_close_button", Boolean.FALSE), new Pair("application_id", str), new Pair("mobile_sdk_type", "fc_lite"))), new Pair("client_secret", financialConnectionsSheetConfiguration.financialConnectionsSessionClientSecret)));
                KSerializer serializer = SynchronizeSessionResponse.Companion.serializer();
                financialConnectionsLiteRepositoryImpl$synchronize$1.label = 1;
                Object m3980execute0E7RQCE = textSetter.m3980execute0E7RQCE(createPost$default, serializer, financialConnectionsLiteRepositoryImpl$synchronize$1);
                return m3980execute0E7RQCE == coroutineSingletons ? coroutineSingletons : m3980execute0E7RQCE;
            }
        }
        financialConnectionsLiteRepositoryImpl$synchronize$1 = new FinancialConnectionsLiteRepositoryImpl$synchronize$1(this, continuationImpl);
        Object obj2 = financialConnectionsLiteRepositoryImpl$synchronize$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsLiteRepositoryImpl$synchronize$1.label;
        if (i == 0) {
        }
    }

    public FinancialConnectionsEvent toEvent(UserFacingEventResponse userFacingEventResponse) {
        Object failure;
        ArrayIterator arrayIterator;
        FinancialConnectionsEvent.ErrorCode errorCode;
        String str;
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            EnumEntriesList enumEntriesList = FinancialConnectionsEvent.Name.$ENTRIES;
            enumEntriesList.getClass();
            arrayIterator = new ArrayIterator(enumEntriesList);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        while (arrayIterator.hasNext()) {
            Object next = arrayIterator.next();
            if (((FinancialConnectionsEvent.Name) next).value.equals(userFacingEventResponse.f1434type)) {
                FinancialConnectionsEvent.Name name = (FinancialConnectionsEvent.Name) next;
                UserFacingEventResponse.Error error = userFacingEventResponse.error;
                if (error == null || (str = error.errorCode) == null) {
                    errorCode = null;
                } else {
                    EnumEntriesList enumEntriesList2 = FinancialConnectionsEvent.ErrorCode.$ENTRIES;
                    enumEntriesList2.getClass();
                    ArrayIterator arrayIterator2 = new ArrayIterator(enumEntriesList2);
                    while (true) {
                        if (!arrayIterator2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = arrayIterator2.next();
                        if (((FinancialConnectionsEvent.ErrorCode) obj).value.equals(str)) {
                            break;
                        }
                    }
                    errorCode = (FinancialConnectionsEvent.ErrorCode) obj;
                    if (errorCode == null) {
                        errorCode = FinancialConnectionsEvent.ErrorCode.UNEXPECTED_ERROR;
                    }
                }
                UserFacingEventResponse.InstitutionSelected institutionSelected = userFacingEventResponse.institutionSelected;
                String str2 = institutionSelected != null ? institutionSelected.institutionName : null;
                UserFacingEventResponse.Success success = userFacingEventResponse.success;
                failure = new FinancialConnectionsEvent(name, new FinancialConnectionsEvent.Metadata(str2, success != null ? Boolean.valueOf(success.manualEntry) : null, errorCode));
                Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                    ((Logger$Companion$NOOP_LOGGER$1) this.endCornerCenterX$delegate).error("Error mapping event response", m4120exceptionOrNullimpl);
                }
                return (FinancialConnectionsEvent) (failure instanceof Result.Failure ? null : failure);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int transformedToOriginal(int i) {
        ArrayList arrayList = (ArrayList) this.endCornerCenterX$delegate;
        if (i == arrayList.size()) {
            return ((String) this.startCornerCenterX$delegate).length();
        }
        while (-1 < i) {
            Object obj = arrayList.get(i);
            FakeTextFieldBuffer$BufferEntry.Original original = obj instanceof FakeTextFieldBuffer$BufferEntry.Original ? (FakeTextFieldBuffer$BufferEntry.Original) obj : null;
            if (original != null) {
                return original.originalOffset;
            }
            i--;
        }
        return 0;
    }

    public ShiftsTileViewModelBuilder$UpcomingShiftDisplay upcomingShiftDisplay(ShiftsTileState.Loaded.ClockedOut clockedOut) {
        ShiftSchedule shiftSchedule;
        ShiftSchedule.Version version;
        CalendarEvent calendarEvent;
        String str;
        OffsetDateTime parseOffsetDateTime;
        String str2;
        OffsetDateTime parseOffsetDateTime2;
        RealShiftTimeFormatter realShiftTimeFormatter = (RealShiftTimeFormatter) this.endCornerCenterX$delegate;
        UpcomingShiftData upcomingShiftData = clockedOut.upcomingShift;
        if (upcomingShiftData == null || (shiftSchedule = upcomingShiftData.shift) == null || (version = shiftSchedule.published_version) == null || (calendarEvent = version.calendar_event) == null || (str = calendarEvent.start_datetime) == null || (parseOffsetDateTime = parseOffsetDateTime(str)) == null || (str2 = calendarEvent.stop_datetime) == null || (parseOffsetDateTime2 = parseOffsetDateTime(str2)) == null) {
            return null;
        }
        return new ShiftsTileViewModelBuilder$UpcomingShiftDisplay(realShiftTimeFormatter.formatDayDate(parseOffsetDateTime), realShiftTimeFormatter.formatShiftTimeRange(parseOffsetDateTime, parseOffsetDateTime2, calendarEvent.time_zone));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0115, code lost:
    
        if (r0 == r2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x007e, code lost:
    
        if (r0 == r2) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object verify(AliasVerifier$Args aliasVerifier$Args, ContinuationImpl continuationImpl) {
        RealAliasVerifier$verify$1 realAliasVerifier$verify$1;
        int i;
        AliasVerifier$Result.NotSuccessful.Status status;
        AliasVerifier$Result.NotSuccessful.Status status2;
        UserJourneyTracker userJourneyTracker = (UserJourneyTracker) this.endCornerCenterX$delegate;
        AppService appService = (AppService) this.startCornerCenterX$delegate;
        if (continuationImpl instanceof RealAliasVerifier$verify$1) {
            realAliasVerifier$verify$1 = (RealAliasVerifier$verify$1) continuationImpl;
            int i2 = realAliasVerifier$verify$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAliasVerifier$verify$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realAliasVerifier$verify$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAliasVerifier$verify$1.label;
                zzaag zzaagVar = UserJourney$Variant$Login$SignUp.INSTANCE;
                zzaag zzaagVar2 = UserJourney$Variant$Login$Login.INSTANCE;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AliasVerifier$Args.AliasType aliasType = aliasVerifier$Args.aliasType;
                    RequestContext requestContext = aliasVerifier$Args.requestContext;
                    String str = aliasVerifier$Args.flowToken;
                    ClientScenario clientScenario = aliasVerifier$Args.clientScenario;
                    int ordinal = aliasType.ordinal();
                    if (ordinal == 0) {
                        VerifySmsRequest verifySmsRequest = new VerifySmsRequest(null, requestContext, aliasVerifier$Args.alias, aliasVerifier$Args.code, null, requestContext.payment_tokens, ByteString.EMPTY);
                        realAliasVerifier$verify$1.label = 1;
                        obj = appService.verifySms(clientScenario, str, verifySmsRequest, realAliasVerifier$verify$1);
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        VerifyEmailRequest verifyEmailRequest = new VerifyEmailRequest(null, requestContext, aliasVerifier$Args.alias, aliasVerifier$Args.code, null, requestContext.payment_tokens, ByteString.EMPTY);
                        realAliasVerifier$verify$1.label = 2;
                        obj = appService.verifyEmail(clientScenario, str, verifyEmailRequest, realAliasVerifier$verify$1);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    ApiResult apiResult = (ApiResult) obj;
                    if (apiResult instanceof ApiResult.Failure) {
                        return new AliasVerifier$Result.NetworkFailure((ApiResult.Failure) apiResult);
                    }
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    VerifySmsResponse verifySmsResponse = (VerifySmsResponse) ((ApiResult.Success) apiResult).response;
                    SignInType signInType = verifySmsResponse.sign_in_type;
                    ResponseContext responseContext = verifySmsResponse.response_context;
                    if (signInType != null) {
                        int ordinal2 = signInType.ordinal();
                        if (ordinal2 != 1) {
                            zzaagVar = ordinal2 != 2 ? null : zzaagVar2;
                        }
                        if (zzaagVar != null) {
                            ((RealUserJourneyTracker) userJourneyTracker).setVariant(UserJourney$Name.LOGIN, zzaagVar);
                        }
                    }
                    VerifySmsResponse.Status status3 = verifySmsResponse.status;
                    if (status3 == VerifySmsResponse.Status.SUCCESS) {
                        return new AliasVerifier$Result.Successful(responseContext);
                    }
                    switch (status3 != null ? RealAliasVerifierKt$WhenMappings.$EnumSwitchMapping$1[status3.ordinal()] : -1) {
                        case -1:
                        case 1:
                            OptionalProvider$$ExternalSyntheticLambda0.m((Object) status3, "Unsupported VerifySmsResponse.Status ");
                            return null;
                        case 0:
                        default:
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        case 2:
                            Path$$ExternalSyntheticBUOutline0.m();
                            return null;
                        case 3:
                            status = AliasVerifier$Result.NotSuccessful.Status.INVALID_ALIAS;
                            break;
                        case 4:
                            status = AliasVerifier$Result.NotSuccessful.Status.INVALID_VERIFICATION_CODE;
                            break;
                        case 5:
                            status = AliasVerifier$Result.NotSuccessful.Status.EXPIRED_VERIFICATION_CODE;
                            break;
                        case 6:
                            status = AliasVerifier$Result.NotSuccessful.Status.TOO_MANY_FAILED_ATTEMPTS;
                            break;
                        case 7:
                            status = AliasVerifier$Result.NotSuccessful.Status.NOT_ELIGIBLE;
                            break;
                    }
                    return new AliasVerifier$Result.NotSuccessful(status, responseContext);
                }
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                ApiResult apiResult2 = (ApiResult) obj;
                if (apiResult2 instanceof ApiResult.Failure) {
                    return new AliasVerifier$Result.NetworkFailure((ApiResult.Failure) apiResult2);
                }
                if (!(apiResult2 instanceof ApiResult.Success)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                VerifyEmailResponse verifyEmailResponse = (VerifyEmailResponse) ((ApiResult.Success) apiResult2).response;
                SignInType signInType2 = verifyEmailResponse.sign_in_type;
                ResponseContext responseContext2 = verifyEmailResponse.response_context;
                if (signInType2 != null) {
                    int ordinal3 = signInType2.ordinal();
                    if (ordinal3 != 1) {
                        zzaagVar = ordinal3 != 2 ? null : zzaagVar2;
                    }
                    if (zzaagVar != null) {
                        ((RealUserJourneyTracker) userJourneyTracker).setVariant(UserJourney$Name.LOGIN, zzaagVar);
                    }
                }
                VerifyEmailResponse.Status status4 = verifyEmailResponse.status;
                if (status4 == VerifyEmailResponse.Status.SUCCESS) {
                    return new AliasVerifier$Result.Successful(responseContext2);
                }
                switch (status4 != null ? RealAliasVerifierKt$WhenMappings.$EnumSwitchMapping$2[status4.ordinal()] : -1) {
                    case -1:
                    case 1:
                        OptionalProvider$$ExternalSyntheticLambda0.m((Object) status4, "Unsupported VerifyEmailResponse.Status ");
                        return null;
                    case 0:
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    case 2:
                        Path$$ExternalSyntheticBUOutline0.m();
                        return null;
                    case 3:
                        status2 = AliasVerifier$Result.NotSuccessful.Status.INVALID_ALIAS;
                        break;
                    case 4:
                        status2 = AliasVerifier$Result.NotSuccessful.Status.INVALID_VERIFICATION_CODE;
                        break;
                    case 5:
                        status2 = AliasVerifier$Result.NotSuccessful.Status.EXPIRED_VERIFICATION_CODE;
                        break;
                    case 6:
                        status2 = AliasVerifier$Result.NotSuccessful.Status.TOO_MANY_FAILED_ATTEMPTS;
                        break;
                    case 7:
                        status2 = AliasVerifier$Result.NotSuccessful.Status.NOT_ELIGIBLE;
                        break;
                }
                return new AliasVerifier$Result.NotSuccessful(status2, responseContext2);
            }
        }
        realAliasVerifier$verify$1 = new RealAliasVerifier$verify$1(this, continuationImpl);
        Object obj2 = realAliasVerifier$verify$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAliasVerifier$verify$1.label;
        zzaag zzaagVar3 = UserJourney$Variant$Login$SignUp.INSTANCE;
        zzaag zzaagVar22 = UserJourney$Variant$Login$Login.INSTANCE;
        if (i != 0) {
        }
    }

    @Override // com.squareup.cash.ui.widget.keypad.KeypadAmount.OnAmountChangedListener
    public void onReset() {
        AmountDisplayState.reset$default((AmountDisplayState) this.startCornerCenterX$delegate, null, 3);
    }

    public ToolbarTuckTargets(RealFamilyAccountsManager realFamilyAccountsManager) {
        this.startCornerCenterX$delegate = realFamilyAccountsManager.isSponsored();
        this.endCornerCenterX$delegate = StateFlowKt.mapState(realFamilyAccountsManager.sponsorsFlow(), new StoryQueries$$ExternalSyntheticLambda0(29));
    }

    public ToolbarTuckTargets(CashAccountDatabaseImpl cashAccountDatabaseImpl, RealProfileAliasRepository realProfileAliasRepository, CoroutineContext coroutineContext) {
        this.startCornerCenterX$delegate = realProfileAliasRepository;
        this.endCornerCenterX$delegate = coroutineContext;
    }

    public ToolbarTuckTargets(float[] fArr, float[] fArr2) {
        fArr.getClass();
        fArr2.getClass();
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        this.startCornerCenterX$delegate = copyOf;
        float[] copyOf2 = Arrays.copyOf(fArr2, fArr2.length);
        this.endCornerCenterX$delegate = copyOf2;
        if (copyOf.length == 3) {
            if (copyOf2.length == 3) {
                if (Arrays.equals(copyOf, copyOf2)) {
                    a$$ExternalSyntheticBUOutline0.m$3("lightPosition must differ from lightAim — a zero look direction makes setLookAtM produce NaNs");
                    throw null;
                }
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("lightAim must be length 3");
            throw null;
        }
        a$$ExternalSyntheticBUOutline0.m$3("lightPosition must be length 3");
        throw null;
    }

    public ToolbarTuckTargets(RealObservabilityManager realObservabilityManager) {
        this.startCornerCenterX$delegate = realObservabilityManager;
        this.endCornerCenterX$delegate = new OffersCollectionSpanState(null, null, null);
    }

    public ToolbarTuckTargets(LocalizedMoneyFormatter.Factory factory, AndroidStringManager androidStringManager) {
        this.startCornerCenterX$delegate = androidStringManager;
        this.endCornerCenterX$delegate = factory.create(MoneyFormatterConfig.COMPACT);
    }

    public /* synthetic */ ToolbarTuckTargets(Object obj, Object obj2) {
        this.startCornerCenterX$delegate = obj;
        this.endCornerCenterX$delegate = obj2;
    }
}
