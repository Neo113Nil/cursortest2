package io.noties.markwon;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsSortKt$special$$inlined$thenBy$1;
import androidx.core.text.TextUtilsCompat;
import androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3;
import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.fragment.NavHostFragment$$ExternalSyntheticLambda1;
import androidx.paging.FlowExtKt;
import androidx.paging.PageFetcher;
import androidx.paging.Pager$pageFetcher$2;
import androidx.paging.PagingConfig;
import androidx.room.util.DBUtil;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.g6$$ExternalSyntheticLambda11;
import coil3.size.DimensionKt;
import com.fillr.n;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.account.backend.AccountSwitcher$AccountSwitchInitiationSource;
import com.squareup.cash.account.backend.ManagedAccountFlipDirection;
import com.squareup.cash.account.screens.ManagedAccountAnimationInfo;
import com.squareup.cash.account.screens.SwitchFullAccountLoadingScreen;
import com.squareup.cash.activity.analytics.ActivityAnalyticsService;
import com.squareup.cash.activity.backend.RealActivityAnalyticsService;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.api.ContextKt;
import com.squareup.cash.banking.real.RealDisclosureProvider$special$$inlined$map$1;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.biometrics.Biometrics$Info;
import com.squareup.cash.biometrics.BiometricsStore$AnalyticsPayload;
import com.squareup.cash.biometrics.BiometricsStore$BiometricsResult;
import com.squareup.cash.biometrics.CashBiometricsInfo;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlanInput;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.cash.cdf.CryptoTradeSide;
import com.squareup.cash.cdf.crypto.CryptoTradeComplete;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.clientrouting.data.TargetDestination;
import com.squareup.cash.clientrouting.routers.blockers.BiometricPreauthScenarioManager$PreauthResult;
import com.squareup.cash.clientrouting.routers.blockers.RealBiometricPreauthScenarioManager$WhenMappings;
import com.squareup.cash.clientrouting.routers.blockers.RealBiometricPreauthScenarioManager$preauthenticate$1;
import com.squareup.cash.clientrouting.routers.blockers.RealBiometricPreauthScenarioManager$toPreauthResult$1;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.crypto.navigation.StablecoinExchangeType$ConvertBitcoinToStablecoin$ConvertAll;
import com.squareup.cash.crypto.scenarioplans.models.InitiateStablecoinExchangeScenarioPlanInput;
import com.squareup.cash.crypto.scenarioplans.plans.InitiateStablecoinExchangeScenarioPlan$produceResponseContext$1;
import com.squareup.cash.crypto.service.CryptoService;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.FlowStarter$$ExternalSyntheticLambda0;
import com.squareup.cash.data.db.RealAppConfigManager$update$2$2;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.data.profile.documents.RealAccountStatementsManager$syncAvailableAccountStatements$1;
import com.squareup.cash.data.profile.documents.RealAccountStatementsManager$syncCustomerStatementTypes$1;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.WebLoginConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.activity.CashActivityQueries$CountActivityQuery;
import com.squareup.cash.db2.entities.PaymentQueries;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.db2.profile.documents.CustomerStatementTypeQueries$selectForType$2;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.google.pay.CashLiteGooglePayProvisioningGateway$complete$1;
import com.squareup.cash.google.pay.GooglePayProvisioningCompletion;
import com.squareup.cash.google.pay.GooglePayProvisioningGateway;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.history.navigation.RealActivityInboundNavigator$Factory$Impl;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.keystore.AttestedKeyService;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.money.analytics.MoneyAnalyticsService$Companion$Source;
import com.squareup.cash.money.navigation.real.RealMoneyInboundNavigator$Factory$Impl;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.moneybot.presenters.RealMoneybotInboundNavigator$Factory$Impl;
import com.squareup.cash.moneybot.screens.MoneybotChatEntryPoint;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.nearby.backend.RealNearbyRepository$createPaymentTemplate$1;
import com.squareup.cash.nearby.backend.RealNearbyRepository$getNearbySession$1;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.paymentpad.screens.LitePaymentPadSheetScreen;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$PaymentPad;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sharesheet.RealShareTargetsManager$addSmsTarget$$inlined$map$1;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.data.RealIssuedCardManager;
import com.squareup.cash.wallet.presenters.SpendingInsightsListItemPresenter$refreshSpendingInsights$1;
import com.squareup.cash.work.data.api.AssignedJob;
import com.squareup.cash.work.data.api.ClockInControls;
import com.squareup.cash.work.data.api.ClockInEssentials;
import com.squareup.cash.work.data.api.LocationScopedClockInControls;
import com.squareup.cash.work.data.real.RealShiftTimeFormatter;
import com.squareup.cash.work.identifiers.JobIdentifier;
import com.squareup.cash.work.identifiers.LocationIdentifier;
import com.squareup.cash.work.presenters.WorkReviewTermsBanner$configFlow$$inlined$map$1;
import com.squareup.cash.work.presenters.shift.CardDateContext;
import com.squareup.cash.work.presenters.shift.ClockInOverlayMapper$FormattedShiftSchedule;
import com.squareup.cash.work.presenters.shift.PendingCard;
import com.squareup.cash.work.presenters.shift.data.ClockInStateResolver;
import com.squareup.cash.work.presenters.shift.data.ScheduledShiftStatus;
import com.squareup.cash.work.presenters.shift.geofence.ClockedOutGeofenceUiState;
import com.squareup.cash.work.screens.ClockInBottomSheetScreen;
import com.squareup.cash.work.tinygraph.models.Job;
import com.squareup.cash.work.tinygraph.models.MembershipWage;
import com.squareup.cash.work.tinygraph.models.MembershipWageMoney;
import com.squareup.cash.work.viewmodels.ClockInButtonState;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.cash.work.viewmodels.SellerCardViewModel;
import com.squareup.cash.work.viewmodels.ShiftCardModel;
import com.squareup.moshi.LinkedHashTreeMap;
import com.squareup.protos.cash.cryptoinvestflow.service.ExchangeRequest;
import com.squareup.protos.cash.cryptoinvestflow.service.ExchangeRequest$Amount$AllSourceAmount;
import com.squareup.protos.cash.cryptoinvestflow.service.ExchangeResponse;
import com.squareup.protos.cash.cryptoinvestflow.service.UserInteractionContext;
import com.squareup.protos.cash.nearby.api.v1.GetNearbySessionRequest;
import com.squareup.protos.cash.nearby.api.v1.NearbySessionService;
import com.squareup.protos.cash.paymenttemplate.v1.CreatePaymentTemplateRequest;
import com.squareup.protos.cash.paymenttemplate.v1.PaymentTemplateService;
import com.squareup.protos.cash.registrar.api.GetAvailableStatementsForStatementTypeRequest;
import com.squareup.protos.cash.registrar.api.GetAvailableStatementsForStatementTypeResponse;
import com.squareup.protos.cash.registrar.api.GetStatementTypesRequest;
import com.squareup.protos.cash.registrar.api.GetStatementTypesResponse;
import com.squareup.protos.cash.registrar.api.StatementType;
import com.squareup.protos.cash.spendinginsights.appapi.RefreshCardSpendingInsightsEntryPointRequest;
import com.squareup.protos.cash.spendinginsights.appapi.SpendingInsightsAppService;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.calendar.CalendarEvent;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.ConfirmPasscodeRequest;
import com.squareup.protos.franklin.app.ConfirmPasscodeResponse;
import com.squareup.protos.franklin.app.SubmitBlockerResponse;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningCompletionData;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.timecards.EmployeeJobInfo;
import com.squareup.protos.timecards.Timecard;
import com.squareup.protos.timecards.TimecardBreakDefinition;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import com.squareup.protos.wire.roster.mds.Name;
import com.squareup.protos.wire.roster.mds.Names;
import com.squareup.scannerview.SizeMap;
import com.squareup.util.cash.Countries;
import com.squareup.util.coroutines.Signal;
import com.squareup.wire.ProtoAdapter;
import com.squareup.workflow1.ui.TextControllerImpl;
import com.squareup.workflow1.ui.TextControllerKt;
import com.squareup.workflow1.ui.androidx.KeyedSavedStateRegistryOwner;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.Pool;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.registrar.api.RegistrarClientService;
import timber.log.Timber;
import xyz.block.genie.state.StateBindingsKt$$ExternalSyntheticLambda0;

/* loaded from: classes7.dex */
public final class MarkwonConfiguration implements ScenarioPlan, GooglePayProvisioningGateway, HasObservability {
    public Object imageDestinationProcessor;
    public Object linkResolver;
    public Object spansFactory;
    public Object syntaxHighlight;
    public Object theme;

    public MarkwonConfiguration(String str, String str2, List list) {
        String str3;
        list.getClass();
        this.theme = list;
        Continuation continuation = null;
        List split$default = str != null ? StringsKt.split$default(str, new char[]{'-'}, 6) : null;
        split$default = (split$default == null || split$default.size() != 3) ? CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"", "", ""}) : split$default;
        this.syntaxHighlight = TextControllerKt.TextController((String) split$default.get(0));
        try {
            str3 = (String) list.get(Integer.parseInt((String) split$default.get(1)) - 1);
        } catch (NumberFormatException unused) {
            str3 = str2 == null ? "" : str2;
        }
        this.linkResolver = TextControllerKt.TextController(str3);
        this.imageDestinationProcessor = TextControllerKt.TextController((String) split$default.get(2));
        this.spansFactory = new SafeFlow(new TransitionWorker$run$1(this, continuation, 29));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$refreshSpendingInsights(MarkwonConfiguration markwonConfiguration, ContinuationImpl continuationImpl) {
        SpendingInsightsListItemPresenter$refreshSpendingInsights$1 spendingInsightsListItemPresenter$refreshSpendingInsights$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof SpendingInsightsListItemPresenter$refreshSpendingInsights$1) {
            spendingInsightsListItemPresenter$refreshSpendingInsights$1 = (SpendingInsightsListItemPresenter$refreshSpendingInsights$1) continuationImpl;
            int i2 = spendingInsightsListItemPresenter$refreshSpendingInsights$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                spendingInsightsListItemPresenter$refreshSpendingInsights$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = spendingInsightsListItemPresenter$refreshSpendingInsights$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = spendingInsightsListItemPresenter$refreshSpendingInsights$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RefreshCardSpendingInsightsEntryPointRequest refreshCardSpendingInsightsEntryPointRequest = new RefreshCardSpendingInsightsEntryPointRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), ByteString.EMPTY);
                    SpendingInsightsAppService spendingInsightsAppService = (SpendingInsightsAppService) markwonConfiguration.syntaxHighlight;
                    spendingInsightsListItemPresenter$refreshSpendingInsights$1.label = 1;
                    obj = spendingInsightsAppService.refreshCardSpendingInsightsEntryPoint(refreshCardSpendingInsightsEntryPointRequest, spendingInsightsListItemPresenter$refreshSpendingInsights$1);
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
                if (!(apiResult instanceof ApiResult.Failure)) {
                    Timber.Forest.w("Failed to refresh Spending Insights list item: " + TextUtilsCompat.errorMessaging((AndroidStringManager) markwonConfiguration.linkResolver, (ApiResult.Failure) apiResult, null), new Object[0]);
                } else {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Timber.Forest.d("Successfully refreshed Spending Insights list item", new Object[0]);
                }
                return Unit.INSTANCE;
            }
        }
        spendingInsightsListItemPresenter$refreshSpendingInsights$1 = new SpendingInsightsListItemPresenter$refreshSpendingInsights$1(markwonConfiguration, continuationImpl);
        Object obj2 = spendingInsightsListItemPresenter$refreshSpendingInsights$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = spendingInsightsListItemPresenter$refreshSpendingInsights$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
        return Unit.INSTANCE;
    }

    public static String getDisplayName(com.squareup.protos.wire.roster.mds.Unit unit) {
        Name name;
        String str;
        String str2 = unit.nickname;
        if (str2 != null) {
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null) {
                return str2;
            }
        }
        Names names = unit.name;
        if (names == null || (name = names.primary) == null || (str = name.value) == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    public static CalendarEvent getRequireCalendarEvent(ShiftSchedule shiftSchedule) {
        CalendarEvent calendarEvent;
        ShiftSchedule.Version version = shiftSchedule.published_version;
        if (version != null && (calendarEvent = version.calendar_event) != null) {
            return calendarEvent;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Shift schedule missing calendar_event");
        return null;
    }

    public static OffsetDateTime getStartDateTime(ShiftSchedule shiftSchedule) {
        String str = getRequireCalendarEvent(shiftSchedule).start_datetime;
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Shift schedule missing start_datetime");
            return null;
        }
        try {
            OffsetDateTime parse = OffsetDateTime.parse(str);
            parse.getClass();
            return parse;
        } catch (Exception e) {
            a$$ExternalSyntheticBUOutline0.m("Invalid start_datetime: ".concat(str), e);
            return null;
        }
    }

    public static String joinLocationAndJob(String str, String str2) {
        String joinToString$default = CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{str, str2}), "  ·  ", null, null, 0, null, null, 62);
        if (joinToString$default.length() == 0) {
            return null;
        }
        return joinToString$default;
    }

    public static Instant parseInstant(String str) {
        Object failure;
        try {
            Result.Companion companion = Result.Companion;
            failure = OffsetDateTime.parse(str).toInstant();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (Instant) failure;
    }

    public static Instant parseShiftEndTime(ClockInBottomSheetScreen clockInBottomSheetScreen) {
        Object failure;
        String str = clockInBottomSheetScreen.shiftStopDatetime;
        if (str == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            failure = OffsetDateTime.parse(str).toInstant();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        return (Instant) (failure instanceof Result.Failure ? null : failure);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        if (r5.length() > 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String resolveLocationJobText(ShiftSchedule shiftSchedule, List list, ArrayList arrayList) {
        String str;
        Object obj;
        Object obj2;
        ShiftSchedule.Version version = shiftSchedule.published_version;
        String str2 = null;
        if (version == null) {
            return null;
        }
        String str3 = version.job_id;
        if (str3 != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (Intrinsics.areEqual(((Job) obj2).getToken(), str3)) {
                    break;
                }
            }
            Job job = (Job) obj2;
            if (job != null) {
                str = (String) job.title$delegate.getValue();
                if (str != null) {
                }
            }
        }
        str = null;
        String str4 = version.location_id;
        if (str4 != null) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (Intrinsics.areEqual(((com.squareup.protos.wire.roster.mds.Unit) obj).token, str4)) {
                    break;
                }
            }
            com.squareup.protos.wire.roster.mds.Unit unit = (com.squareup.protos.wire.roster.mds.Unit) obj;
            if (unit != null) {
                str2 = getDisplayName(unit);
            }
        }
        return joinLocationAndJob(str2, str);
    }

    public void attachToParentRegistry(String str, SavedStateRegistryOwner savedStateRegistryOwner) {
        detachFromParentRegistry();
        this.syntaxHighlight = savedStateRegistryOwner;
        this.linkResolver = str;
        if (((LinkedHashMap) this.theme) != null) {
            return;
        }
        SavedStateRegistry savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
        savedStateRegistry.getClass();
        Lifecycle lifecycle = savedStateRegistryOwner.getLifecycle();
        lifecycle.getClass();
        try {
            savedStateRegistry.registerSavedStateProvider(str, new NavHostFragment$$ExternalSyntheticLambda1(this, 3));
            lifecycle.addObserver((CompositeGeneratedAdaptersObserver) this.spansFactory);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Error registering SavedStateProvider: key \"" + str + "\" is already in use on parent SavedStateRegistryOwner " + savedStateRegistryOwner + ".\nThis is most easily remedied by giving your container Screen rendering a unique Compatible.compatibilityKey, perhaps by wrapping it with Named.", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0178 A[LOOP:2: B:68:0x016f->B:70:0x0178, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayList buildCardList(ClockInEssentials clockInEssentials, List list, SellerCardViewModel sellerCardViewModel, String str, List list2, ArrayList arrayList) {
        ShiftSchedule shiftSchedule;
        ShiftSchedule shiftSchedule2;
        MarkwonConfiguration markwonConfiguration;
        ArrayList arrayList2;
        ListIterator listIterator;
        ListBuilder.Itr itr;
        ClockInEssentials.NextShift nextShift;
        ClockInControls clockInControls;
        boolean z = clockInEssentials instanceof ClockInEssentials.ClockedOutEssentials;
        ClockInEssentials.ClockedOutEssentials clockedOutEssentials = z ? (ClockInEssentials.ClockedOutEssentials) clockInEssentials : null;
        ScheduledShiftStatus scheduledShiftStatus = clockedOutEssentials != null ? ((ClockInStateResolver) this.linkResolver).getClockInEnabledResult(clockedOutEssentials).scheduledShiftStatus : null;
        boolean z2 = clockInEssentials instanceof ClockInEssentials.ClockedInEssentials;
        if (z2) {
            shiftSchedule2 = ((ClockInEssentials.ClockedInEssentials) clockInEssentials).shift;
        } else if (clockInEssentials instanceof ClockInEssentials.OnBreakEssentials) {
            shiftSchedule2 = ((ClockInEssentials.OnBreakEssentials) clockInEssentials).shift;
        } else {
            shiftSchedule = null;
            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            if (!z2) {
                ClockInEssentials.ClockedInEssentials clockedInEssentials = (ClockInEssentials.ClockedInEssentials) clockInEssentials;
                createListBuilder.add(buildClockedInCard(clockedInEssentials.shift, clockedInEssentials.timecard, list2, arrayList, sellerCardViewModel, str, false));
                markwonConfiguration = this;
            } else if (clockInEssentials instanceof ClockInEssentials.OnBreakEssentials) {
                ClockInEssentials.OnBreakEssentials onBreakEssentials = (ClockInEssentials.OnBreakEssentials) clockInEssentials;
                ShiftSchedule shiftSchedule3 = onBreakEssentials.shift;
                Timecard timecard = onBreakEssentials.timecard;
                markwonConfiguration = this;
                createListBuilder.add(markwonConfiguration.buildClockedInCard(shiftSchedule3, timecard, list2, arrayList, sellerCardViewModel, str, true));
            } else {
                markwonConfiguration = this;
                ProtoAdapter protoAdapter = com.squareup.protos.wire.roster.mds.Unit.ADAPTER;
            }
            int size = 3 - createListBuilder.getSize();
            boolean z3 = clockInEssentials == null && (clockInControls = clockInEssentials.getClockInControls()) != null && clockInControls.canClockInFromTeamApp;
            ClockInEssentials.ClockedOutEssentials clockedOutEssentials2 = !z ? (ClockInEssentials.ClockedOutEssentials) clockInEssentials : null;
            boolean z4 = ((clockedOutEssentials2 != null || (nextShift = clockedOutEssentials2.nextShift) == null) ? null : nextShift.shift) == null;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list) {
                if (!Intrinsics.areEqual(((ShiftSchedule) obj).id, shiftSchedule != null ? shiftSchedule.id : null)) {
                    arrayList3.add(obj);
                }
            }
            for (ShiftSchedule shiftSchedule4 : CollectionsKt.take(CollectionsKt.sortedWith(arrayList3, new LinkedHashTreeMap.AnonymousClass1(markwonConfiguration)), size)) {
                boolean isEmpty = createListBuilder.isEmpty();
                ClockInButtonState clockInButtonState = ClockInButtonState.Hidden.INSTANCE;
                if (z && isEmpty && z3 && z4) {
                    if (scheduledShiftStatus != null && scheduledShiftStatus.getCanClockIn()) {
                        clockInButtonState = new ClockInButtonState.ClockedOut(true);
                    } else if (CollectionsKt.contains((Set) markwonConfiguration.spansFactory, scheduledShiftStatus)) {
                        clockInButtonState = new ClockInButtonState.ClockedOut(false);
                    }
                }
                createListBuilder.add(new PendingCard(new ShiftCardModel(shiftSchedule4.id, str, sellerCardViewModel, "", markwonConfiguration.formatShiftTimeRange(shiftSchedule4), resolveLocationJobText(shiftSchedule4, list2, arrayList), clockInButtonState, true, getStartDateTime(shiftSchedule4), getRequireCalendarEvent(shiftSchedule4).time_zone), new CardDateContext(getStartDateTime(shiftSchedule4))));
            }
            ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
            arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(build, 10));
            listIterator = build.listIterator(0);
            while (true) {
                itr = (ListBuilder.Itr) listIterator;
                if (itr.hasNext()) {
                    return arrayList2;
                }
                PendingCard pendingCard = (PendingCard) itr.next();
                ShiftCardModel shiftCardModel = pendingCard.card;
                String formatDayDate = ((RealShiftTimeFormatter) markwonConfiguration.syntaxHighlight).formatDayDate(pendingCard.dateContext.dateTime);
                String str2 = shiftCardModel.shiftId;
                String str3 = shiftCardModel.merchantName;
                SellerCardViewModel sellerCardViewModel2 = shiftCardModel.sellerCardViewModel;
                String str4 = shiftCardModel.shiftTimeText;
                String str5 = shiftCardModel.locationAndJobText;
                ClockInButtonState clockInButtonState2 = shiftCardModel.clockInButtonState;
                boolean z5 = shiftCardModel.showDetailsButton;
                OffsetDateTime offsetDateTime = shiftCardModel.startDateTime;
                String str6 = shiftCardModel.timeZoneId;
                str3.getClass();
                sellerCardViewModel2.getClass();
                formatDayDate.getClass();
                str4.getClass();
                clockInButtonState2.getClass();
                arrayList2.add(new ShiftCardModel(str2, str3, sellerCardViewModel2, formatDayDate, str4, str5, clockInButtonState2, z5, offsetDateTime, str6));
            }
        }
        shiftSchedule = shiftSchedule2;
        ListBuilder createListBuilder2 = CollectionsKt__CollectionsJVMKt.createListBuilder();
        if (!z2) {
        }
        int size2 = 3 - createListBuilder2.getSize();
        if (clockInEssentials == null) {
        }
        if (!z) {
        }
        if (((clockedOutEssentials2 != null || (nextShift = clockedOutEssentials2.nextShift) == null) ? null : nextShift.shift) == null) {
        }
        ArrayList arrayList32 = new ArrayList();
        while (r6.hasNext()) {
        }
        while (r1.hasNext()) {
        }
        ListBuilder build2 = CollectionsKt__CollectionsJVMKt.build(createListBuilder2);
        arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(build2, 10));
        listIterator = build2.listIterator(0);
        while (true) {
            itr = (ListBuilder.Itr) listIterator;
            if (itr.hasNext()) {
            }
            PendingCard pendingCard2 = (PendingCard) itr.next();
            ShiftCardModel shiftCardModel2 = pendingCard2.card;
            String formatDayDate2 = ((RealShiftTimeFormatter) markwonConfiguration.syntaxHighlight).formatDayDate(pendingCard2.dateContext.dateTime);
            String str22 = shiftCardModel2.shiftId;
            String str32 = shiftCardModel2.merchantName;
            SellerCardViewModel sellerCardViewModel22 = shiftCardModel2.sellerCardViewModel;
            String str42 = shiftCardModel2.shiftTimeText;
            String str52 = shiftCardModel2.locationAndJobText;
            ClockInButtonState clockInButtonState22 = shiftCardModel2.clockInButtonState;
            boolean z52 = shiftCardModel2.showDetailsButton;
            OffsetDateTime offsetDateTime2 = shiftCardModel2.startDateTime;
            String str62 = shiftCardModel2.timeZoneId;
            str32.getClass();
            sellerCardViewModel22.getClass();
            formatDayDate2.getClass();
            str42.getClass();
            clockInButtonState22.getClass();
            arrayList2.add(new ShiftCardModel(str22, str32, sellerCardViewModel22, formatDayDate2, str42, str52, clockInButtonState22, z52, offsetDateTime2, str62));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (r3 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PendingCard buildClockedInCard(ShiftSchedule shiftSchedule, Timecard timecard, List list, ArrayList arrayList, SellerCardViewModel sellerCardViewModel, String str, boolean z) {
        Object obj;
        ZoneId of;
        String str2;
        Object obj2;
        Object failure;
        ZoneId zoneId;
        ClockInButtonState clockInButtonState = z ? ClockInButtonState.OnBreak.INSTANCE : ClockInButtonState.ClockedIn.INSTANCE;
        String str3 = null;
        str3 = null;
        if (shiftSchedule != null) {
            ShiftCardModel shiftCardModel = new ShiftCardModel(shiftSchedule.id, str, sellerCardViewModel, "", formatShiftTimeRange(shiftSchedule), resolveLocationJobText(shiftSchedule, list, arrayList), clockInButtonState, true, 768);
            Instant now = DimensionKt.now((AndroidClock) this.imageDestinationProcessor);
            String str4 = getRequireCalendarEvent(shiftSchedule).time_zone;
            if (str4 != null) {
                try {
                    Result.Companion companion = Result.Companion;
                    failure = ZoneId.of(str4);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                zoneId = (ZoneId) (failure instanceof Result.Failure ? null : failure);
            }
            zoneId = getStartDateTime(shiftSchedule).getOffset();
            zoneId.getClass();
            OffsetDateTime ofInstant = OffsetDateTime.ofInstant(now, zoneId);
            ofInstant.getClass();
            return new PendingCard(shiftCardModel, new CardDateContext(ofInstant));
        }
        String str5 = timecard.clockin_unit_token;
        if (str5 != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((com.squareup.protos.wire.roster.mds.Unit) obj).token, str5)) {
                    break;
                }
            }
            com.squareup.protos.wire.roster.mds.Unit unit = (com.squareup.protos.wire.roster.mds.Unit) obj;
            String str6 = unit != null ? unit.time_zone : null;
            if (str6 != null && (of = ZoneId.of(str6)) != null) {
                Long l = timecard.clockin_timestamp_ms;
                if (l == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Clocked-in card missing clockin_timestamp_ms");
                    return null;
                }
                long longValue = l.longValue();
                String str7 = ((AndroidStringManager) this.theme).get(R.string.work_dashboard_unscheduled_shift);
                EmployeeJobInfo employeeJobInfo = timecard.employee_job_info;
                if (employeeJobInfo == null || (str2 = employeeJobInfo.job_title) == null || str2.length() <= 0) {
                    str2 = null;
                }
                String str8 = timecard.clockin_unit_token;
                if (str8 != null) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        if (Intrinsics.areEqual(((com.squareup.protos.wire.roster.mds.Unit) obj2).token, str8)) {
                            break;
                        }
                    }
                    com.squareup.protos.wire.roster.mds.Unit unit2 = (com.squareup.protos.wire.roster.mds.Unit) obj2;
                    if (unit2 != null) {
                        str3 = getDisplayName(unit2);
                    }
                }
                ShiftCardModel shiftCardModel2 = new ShiftCardModel(null, str, sellerCardViewModel, "", str7, joinLocationAndJob(str3, str2), clockInButtonState, false, 768);
                OffsetDateTime ofInstant2 = OffsetDateTime.ofInstant(Instant.ofEpochMilli(longValue), of);
                ofInstant2.getClass();
                return new PendingCard(shiftCardModel2, new CardDateContext(ofInstant2));
            }
        }
        a$$ExternalSyntheticBUOutline0.m$1(Recorder$$ExternalSyntheticOutline2.m("Unscheduled clocked-in card missing valid timezone for clock-in unit token=", str5));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // com.squareup.cash.google.pay.GooglePayProvisioningGateway
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object complete(BlockersScreens.ProvisionGooglePayScreen provisionGooglePayScreen, DigitalWalletTokenProvisioningCompletionData.ProvisioningResult provisioningResult, ContinuationImpl continuationImpl) {
        CashLiteGooglePayProvisioningGateway$complete$1 cashLiteGooglePayProvisioningGateway$complete$1;
        int i;
        BlockersScreens.ProvisionGooglePayScreen provisionGooglePayScreen2;
        DigitalWalletTokenProvisioningCompletionData.ProvisioningResult provisioningResult2;
        ApiResult apiResult;
        if (continuationImpl instanceof CashLiteGooglePayProvisioningGateway$complete$1) {
            cashLiteGooglePayProvisioningGateway$complete$1 = (CashLiteGooglePayProvisioningGateway$complete$1) continuationImpl;
            int i2 = cashLiteGooglePayProvisioningGateway$complete$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cashLiteGooglePayProvisioningGateway$complete$1.label = i2 - PKIFailureInfo.systemUnavail;
                CashLiteGooglePayProvisioningGateway$complete$1 cashLiteGooglePayProvisioningGateway$complete$12 = cashLiteGooglePayProvisioningGateway$complete$1;
                Object obj = cashLiteGooglePayProvisioningGateway$complete$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashLiteGooglePayProvisioningGateway$complete$12.label;
                BlockersData blockersData = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    BlockersData blockersData2 = provisionGooglePayScreen.blockersData;
                    String str = blockersData2.blockerId;
                    if (str != null) {
                        cashLiteGooglePayProvisioningGateway$complete$12.L$0 = provisionGooglePayScreen;
                        cashLiteGooglePayProvisioningGateway$complete$12.L$1 = provisioningResult;
                        cashLiteGooglePayProvisioningGateway$complete$12.label = 1;
                        obj = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData2, (Analytics) this.imageDestinationProcessor, (AndroidStringManager) this.spansFactory, cashLiteGooglePayProvisioningGateway$complete$12, null, new DataStoreImpl$readDataOrHandleCorruption$3(this, provisionGooglePayScreen, provisioningResult, str, null, 12));
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        provisionGooglePayScreen2 = provisionGooglePayScreen;
                        provisioningResult2 = provisioningResult;
                    }
                    return GooglePayProvisioningCompletion.Failure.INSTANCE;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                provisioningResult2 = cashLiteGooglePayProvisioningGateway$complete$12.L$1;
                provisionGooglePayScreen2 = cashLiteGooglePayProvisioningGateway$complete$12.L$0;
                SafeTrace.throwOnFailure(obj);
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    SubmitBlockerResponse submitBlockerResponse = (SubmitBlockerResponse) ((ApiResult.Success) apiResult).response;
                    if (provisioningResult2 == DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.USER_CANCELED) {
                        blockersData = provisionGooglePayScreen2.blockersData;
                    } else {
                        ResponseContext mergeResponseContexts = ContextKt.mergeResponseContexts(submitBlockerResponse.app_response_context, submitBlockerResponse.blocker_response_context, submitBlockerResponse.flow_response_context);
                        if (mergeResponseContexts != null) {
                            BlockersData blockersData3 = provisionGooglePayScreen2.blockersData;
                            Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                            blockersData = blockersData3.updateFromResponseContext(mergeResponseContexts, false);
                        }
                    }
                    if (blockersData != null) {
                        return new GooglePayProvisioningCompletion.Success(blockersData);
                    }
                } else if (!(apiResult instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return GooglePayProvisioningCompletion.Failure.INSTANCE;
            }
        }
        cashLiteGooglePayProvisioningGateway$complete$1 = new CashLiteGooglePayProvisioningGateway$complete$1(this, continuationImpl);
        CashLiteGooglePayProvisioningGateway$complete$1 cashLiteGooglePayProvisioningGateway$complete$122 = cashLiteGooglePayProvisioningGateway$complete$1;
        Object obj2 = cashLiteGooglePayProvisioningGateway$complete$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashLiteGooglePayProvisioningGateway$complete$122.label;
        BlockersData blockersData4 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return GooglePayProvisioningCompletion.Failure.INSTANCE;
    }

    @Override // com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan
    public BlockersData createBlockersData() {
        return FlowStarter.startFlow$default((FlowStarter) this.linkResolver, BlockersData.Flow.CLIENT_SCENARIO, (Screen) this.imageDestinationProcessor, null, ClientScenario.EXCHANGE_CURRENCY, null, null, null, null, new FlowStarter$$ExternalSyntheticLambda0(21), 500);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createPaymentTemplate(CreatePaymentTemplateRequest createPaymentTemplateRequest, ContinuationImpl continuationImpl) {
        RealNearbyRepository$createPaymentTemplate$1 realNearbyRepository$createPaymentTemplate$1;
        int i;
        Object m3594signyxL6bBk;
        CreatePaymentTemplateRequest createPaymentTemplateRequest2;
        PaymentTemplateService paymentTemplateService;
        if (continuationImpl instanceof RealNearbyRepository$createPaymentTemplate$1) {
            realNearbyRepository$createPaymentTemplate$1 = (RealNearbyRepository$createPaymentTemplate$1) continuationImpl;
            int i2 = realNearbyRepository$createPaymentTemplate$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realNearbyRepository$createPaymentTemplate$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realNearbyRepository$createPaymentTemplate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realNearbyRepository$createPaymentTemplate$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaymentTemplateService paymentTemplateService2 = (PaymentTemplateService) this.theme;
                    RealMessageSigner realMessageSigner = (RealMessageSigner) this.imageDestinationProcessor;
                    AttestedKeyService attestedKeyService = (AttestedKeyService) ((Lazy) this.spansFactory).getValue();
                    realNearbyRepository$createPaymentTemplate$1.L$0 = createPaymentTemplateRequest;
                    realNearbyRepository$createPaymentTemplate$1.L$1 = paymentTemplateService2;
                    realNearbyRepository$createPaymentTemplate$1.label = 1;
                    m3594signyxL6bBk = realMessageSigner.m3594signyxL6bBk(createPaymentTemplateRequest, attestedKeyService, true, (r10 & 8) != 0, realNearbyRepository$createPaymentTemplate$1);
                    if (m3594signyxL6bBk != coroutineSingletons) {
                        createPaymentTemplateRequest2 = m3594signyxL6bBk;
                        paymentTemplateService = paymentTemplateService2;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                paymentTemplateService = realNearbyRepository$createPaymentTemplate$1.L$1;
                createPaymentTemplateRequest = realNearbyRepository$createPaymentTemplate$1.L$0;
                SafeTrace.throwOnFailure(obj);
                createPaymentTemplateRequest2 = ((Result) obj).value;
                if (Result.m4120exceptionOrNullimpl(createPaymentTemplateRequest2) == null) {
                    createPaymentTemplateRequest = createPaymentTemplateRequest2;
                }
                realNearbyRepository$createPaymentTemplate$1.L$0 = null;
                realNearbyRepository$createPaymentTemplate$1.L$1 = null;
                realNearbyRepository$createPaymentTemplate$1.label = 2;
                Object createPaymentTemplate = paymentTemplateService.createPaymentTemplate(createPaymentTemplateRequest, realNearbyRepository$createPaymentTemplate$1);
                return createPaymentTemplate != coroutineSingletons ? coroutineSingletons : createPaymentTemplate;
            }
        }
        realNearbyRepository$createPaymentTemplate$1 = new RealNearbyRepository$createPaymentTemplate$1(this, continuationImpl);
        Object obj2 = realNearbyRepository$createPaymentTemplate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realNearbyRepository$createPaymentTemplate$1.label;
        if (i != 0) {
        }
        if (Result.m4120exceptionOrNullimpl(createPaymentTemplateRequest2) == null) {
        }
        realNearbyRepository$createPaymentTemplate$1.L$0 = null;
        realNearbyRepository$createPaymentTemplate$1.L$1 = null;
        realNearbyRepository$createPaymentTemplate$1.label = 2;
        Object createPaymentTemplate2 = paymentTemplateService.createPaymentTemplate(createPaymentTemplateRequest, realNearbyRepository$createPaymentTemplate$1);
        if (createPaymentTemplate2 != coroutineSingletons2) {
        }
    }

    public FlowQuery$mapToList$$inlined$map$1 customerStatementTypeDetails(StatementType statementType) {
        InstrumentQueries instrumentQueries = (InstrumentQueries) this.linkResolver;
        instrumentQueries.getClass();
        CustomerStatementTypeQueries$selectForType$2 customerStatementTypeQueries$selectForType$2 = CustomerStatementTypeQueries$selectForType$2.INSTANCE;
        byte b = 0;
        return DBUtil.mapToList(DBUtil.toFlow(new OffersSheetQueries$ForSheetKeyQuery(instrumentQueries, statementType, new OfflineQueries$$ExternalSyntheticLambda0(instrumentQueries, b, (int) b), 5)), (CoroutineContext) this.syntaxHighlight);
    }

    public void detachFromParentRegistry() {
        Lifecycle lifecycle;
        SavedStateRegistry savedStateRegistry;
        SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) this.syntaxHighlight;
        if (savedStateRegistryOwner != null && (savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry()) != null) {
            String str = (String) this.linkResolver;
            str.getClass();
            savedStateRegistry.unregisterSavedStateProvider(str);
        }
        SavedStateRegistryOwner savedStateRegistryOwner2 = (SavedStateRegistryOwner) this.syntaxHighlight;
        if (savedStateRegistryOwner2 != null && (lifecycle = savedStateRegistryOwner2.getLifecycle()) != null) {
            lifecycle.removeObserver((CompositeGeneratedAdaptersObserver) this.spansFactory);
        }
        this.syntaxHighlight = null;
        this.linkResolver = null;
    }

    public void fireAnalyticsEvent(PaymentAnalyticsEvent paymentAnalyticsEvent, String str) {
        DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = (DefaultAnalyticsRequestExecutor) this.linkResolver;
        Context context = (Context) this.imageDestinationProcessor;
        context.getClass();
        defaultAnalyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(new PaymentAnalyticsRequestFactory(context, str, (Set) this.theme), paymentAnalyticsEvent, null, null, null, null, 62));
    }

    public String formatPickerBody(String str, boolean z) {
        AndroidStringManager androidStringManager = (AndroidStringManager) this.theme;
        String str2 = z ? androidStringManager.get(R.string.work_shift_clock_in_scheduled) : androidStringManager.get(R.string.work_shift_clock_in_unscheduled);
        return str != null ? Recorder$$ExternalSyntheticOutline2.m(str2, "  ·  ", str) : str2;
    }

    public String formatShiftTimeRange(ShiftSchedule shiftSchedule) {
        CalendarEvent requireCalendarEvent = getRequireCalendarEvent(shiftSchedule);
        String str = requireCalendarEvent.start_datetime;
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Shift schedule missing start_datetime");
            return null;
        }
        String str2 = requireCalendarEvent.stop_datetime;
        if (str2 == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Shift schedule missing stop_datetime");
            return null;
        }
        RealShiftTimeFormatter realShiftTimeFormatter = (RealShiftTimeFormatter) this.syntaxHighlight;
        OffsetDateTime parse = OffsetDateTime.parse(str);
        parse.getClass();
        OffsetDateTime parse2 = OffsetDateTime.parse(str2);
        parse2.getClass();
        return realShiftTimeFormatter.formatDashboardCardTimeRange(parse, parse2, requireCalendarEvent.time_zone);
    }

    public Date getDateValue() {
        try {
            List split$default = StringsKt.split$default(getValue(), new char[]{'-'}, 6);
            Calendar calendar = Calendar.getInstance();
            calendar.set(1, Integer.parseInt((String) split$default.get(0)));
            calendar.set(2, Integer.parseInt((String) split$default.get(1)) - 1);
            calendar.set(5, Integer.parseInt((String) split$default.get(2)));
            return calendar.getTime();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public ErrorReporter getErrorReporter() {
        return (ErrorReporter) this.imageDestinationProcessor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getNearbySession(GetNearbySessionRequest getNearbySessionRequest, ContinuationImpl continuationImpl) {
        RealNearbyRepository$getNearbySession$1 realNearbyRepository$getNearbySession$1;
        int i;
        Object m3594signyxL6bBk;
        GetNearbySessionRequest getNearbySessionRequest2;
        NearbySessionService nearbySessionService;
        if (continuationImpl instanceof RealNearbyRepository$getNearbySession$1) {
            realNearbyRepository$getNearbySession$1 = (RealNearbyRepository$getNearbySession$1) continuationImpl;
            int i2 = realNearbyRepository$getNearbySession$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realNearbyRepository$getNearbySession$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realNearbyRepository$getNearbySession$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realNearbyRepository$getNearbySession$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    NearbySessionService nearbySessionService2 = (NearbySessionService) this.syntaxHighlight;
                    RealMessageSigner realMessageSigner = (RealMessageSigner) this.imageDestinationProcessor;
                    AttestedKeyService attestedKeyService = (AttestedKeyService) ((Lazy) this.spansFactory).getValue();
                    realNearbyRepository$getNearbySession$1.L$0 = getNearbySessionRequest;
                    realNearbyRepository$getNearbySession$1.L$1 = nearbySessionService2;
                    realNearbyRepository$getNearbySession$1.label = 1;
                    m3594signyxL6bBk = realMessageSigner.m3594signyxL6bBk(getNearbySessionRequest, attestedKeyService, true, (r10 & 8) != 0, realNearbyRepository$getNearbySession$1);
                    if (m3594signyxL6bBk != coroutineSingletons) {
                        getNearbySessionRequest2 = m3594signyxL6bBk;
                        nearbySessionService = nearbySessionService2;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                nearbySessionService = realNearbyRepository$getNearbySession$1.L$1;
                getNearbySessionRequest = realNearbyRepository$getNearbySession$1.L$0;
                SafeTrace.throwOnFailure(obj);
                getNearbySessionRequest2 = ((Result) obj).value;
                if (Result.m4120exceptionOrNullimpl(getNearbySessionRequest2) == null) {
                    getNearbySessionRequest = getNearbySessionRequest2;
                }
                realNearbyRepository$getNearbySession$1.L$0 = null;
                realNearbyRepository$getNearbySession$1.L$1 = null;
                realNearbyRepository$getNearbySession$1.label = 2;
                Object nearbySession = nearbySessionService.getNearbySession(getNearbySessionRequest, realNearbyRepository$getNearbySession$1);
                return nearbySession != coroutineSingletons ? coroutineSingletons : nearbySession;
            }
        }
        realNearbyRepository$getNearbySession$1 = new RealNearbyRepository$getNearbySession$1(this, continuationImpl);
        Object obj2 = realNearbyRepository$getNearbySession$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realNearbyRepository$getNearbySession$1.label;
        if (i != 0) {
        }
        if (Result.m4120exceptionOrNullimpl(getNearbySessionRequest2) == null) {
        }
        realNearbyRepository$getNearbySession$1.L$0 = null;
        realNearbyRepository$getNearbySession$1.L$1 = null;
        realNearbyRepository$getNearbySession$1.label = 2;
        Object nearbySession2 = nearbySessionService.getNearbySession(getNearbySessionRequest, realNearbyRepository$getNearbySession$1);
        if (nearbySession2 != coroutineSingletons2) {
        }
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public SampleStrategy getOneErrorPerAppSessionStrategy() {
        return (SampleStrategy) this.spansFactory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RealShareTargetsManager$addSmsTarget$$inlined$map$1 getTransactions(ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter, boolean z) {
        PaymentQueries paymentQueries = (PaymentQueries) this.spansFactory;
        EmptyList emptyList = EmptyList.INSTANCE;
        paymentQueries.getClass();
        emptyList.getClass();
        int i = 3;
        CashActivityQueries$CountActivityQuery cashActivityQueries$CountActivityQuery = new CashActivityQueries$CountActivityQuery(paymentQueries, z, emptyList, emptyList, new WebLoginConfigQueries$$ExternalSyntheticLambda2(i, false));
        return new RealShareTargetsManager$addSmsTarget$$inlined$map$1(new RealShareTargetsManager$addSmsTarget$$inlined$map$1(FlowExtKt.cachedIn(new PageFetcher(new Pager$pageFetcher$2(new g6$$ExternalSyntheticLambda11(cashActivityQueries$CountActivityQuery, this, z, 14), null, 0 == true ? 1 : 0), new PagingConfig(20, 62)).flow, JobKt.plus((CoroutineContext) this.linkResolver, (CoroutineScope) this.imageDestinationProcessor)), this, ziplineHistoryDataJavaScripter, 2), this, cashActivityQueries$CountActivityQuery, i);
    }

    public String getValue() {
        String textValue = ((TextControllerImpl) this.syntaxHighlight).getTextValue();
        String textValue2 = ((TextControllerImpl) this.linkResolver).getTextValue();
        String textValue3 = ((TextControllerImpl) this.imageDestinationProcessor).getTextValue();
        int indexOf = CollectionsKt.indexOf(textValue2, (List) this.theme);
        String padStart = indexOf > -1 ? StringsKt.padStart(2, String.valueOf(indexOf + 1)) : null;
        return (textValue == null || textValue.length() == 0 || padStart == null || padStart.length() == 0 || textValue3 == null || textValue3.length() == 0) ? "" : Boxes$$ExternalSyntheticOutline1.m$1(textValue, "-", padStart, "-", textValue3);
    }

    public void goToActivity() {
        EglCore eglCore = (EglCore) this.spansFactory;
        ((RealActivityAnalyticsService) ((ActivityAnalyticsService) eglCore.eglConfig)).loadTimeClock.start();
        ((LoadTimeClock) eglCore.eglContext).start();
        ((Navigator) eglCore.eglDisplay).goTo(ActivityScreen.INSTANCE);
    }

    public void goToBanking() {
        ((Navigator) ((SizeMap) this.linkResolver).mRatios).goTo(new MoneyTabScreen(MoneyAnalyticsService$Companion$Source.TAB_BAR_BUTTON));
    }

    public void goToMoneybot() {
        n nVar = (n) this.imageDestinationProcessor;
        MoneybotChatEntryPoint moneybotChatEntryPoint = MoneybotChatEntryPoint.MONEY;
        nVar.showMoneybotChat();
    }

    public void goToPaymentPad() {
        boolean z = ((CashAppLiteReleaseModule$$ExternalSyntheticLambda0) this.theme).f$0;
        Navigator navigator = (Navigator) this.syntaxHighlight;
        if (z) {
            navigator.goTo(new LitePaymentPadSheetScreen(true));
        } else {
            navigator.goTo(PaymentScreens$HomeScreens$PaymentPad.INSTANCE);
        }
    }

    public boolean handleManagedAccountBack(FamilyProfile familyProfile) {
        familyProfile.getClass();
        if (!(familyProfile instanceof FamilyProfile.ManagedAccount)) {
            return false;
        }
        Navigator navigator = (Navigator) this.spansFactory;
        FamilyProfile.ManagedAccount managedAccount = (FamilyProfile.ManagedAccount) familyProfile;
        String str = managedAccount.sponsorAccountToken;
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        TargetDestination.ScreenDestination screenDestination = new TargetDestination.ScreenDestination(new FamilyHome(null, null, new MoneyTabScreen(null), 3));
        AccountSwitcher$AccountSwitchInitiationSource accountSwitcher$AccountSwitchInitiationSource = AccountSwitcher$AccountSwitchInitiationSource.MANAGED_ACCOUNT_BACK;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.imageDestinationProcessor;
        String str2 = managedAccount.sponsorFirstName;
        if (str2 == null) {
            str2 = "";
        }
        Map mapOf = MapsKt__MapsJVMKt.mapOf(new Pair("name", str2));
        mapOf.getClass();
        Resources resources = androidStringManager.resources;
        resources.getClass();
        String format2 = new MessageFormat(resources.getString(R.string.family_navigation_switch_back_to_sponsor)).format(mapOf);
        format2.getClass();
        navigator.goTo(new SwitchFullAccountLoadingScreen(null, str, generateToken, screenDestination, accountSwitcher$AccountSwitchInitiationSource, new ManagedAccountAnimationInfo(format2, ManagedAccountFlipDirection.TO_SPONSOR)));
        return true;
    }

    public void installChildRegistryOwnerOn(View view, String str) {
        LifecycleOwner lifecycleOwner = DBUtil.get(view);
        if (lifecycleOwner == null) {
            throw new IllegalArgumentException(("Expected " + view + '(' + str + ") to have a ViewTreeLifecycleOwner. Use WorkflowLifecycleOwner to fix that.").toString());
        }
        KeyedSavedStateRegistryOwner keyedSavedStateRegistryOwner = new KeyedSavedStateRegistryOwner(str, lifecycleOwner);
        if (((KeyedSavedStateRegistryOwner) ((LinkedHashMap) this.imageDestinationProcessor).put(str, keyedSavedStateRegistryOwner)) != null) {
            AesGcmSiv$$ExternalSyntheticLambda0.m((Object) str, (Object) " is already in use, it cannot be used to register ", (Object) view);
            return;
        }
        SavedStateRegistryOwner savedStateRegistryOwner = Countries.get(view);
        if (savedStateRegistryOwner != null) {
            AesGcmSiv$$ExternalSyntheticLambda0.m(view, " already has ViewTreeSavedStateRegistryOwner: ", savedStateRegistryOwner);
            return;
        }
        view.setTag(R.id.view_tree_saved_state_registry_owner, keyedSavedStateRegistryOwner);
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.theme;
        if (linkedHashMap == null) {
            return;
        }
        keyedSavedStateRegistryOwner.controller.performRestore((Bundle) linkedHashMap.remove(str));
    }

    public ArrayList mapBreakItems(List list) {
        List<TimecardBreakDefinition> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (TimecardBreakDefinition timecardBreakDefinition : list2) {
            String str = timecardBreakDefinition.token;
            if (str == null) {
                Path$$ExternalSyntheticBUOutline0.m$1(timecardBreakDefinition, "Break definition missing token: ");
                return null;
            }
            String str2 = timecardBreakDefinition.break_name;
            if (str2 == null) {
                a$$ExternalSyntheticBUOutline0.m1430m((Object) "Break definition missing break_name: token=".concat(str));
                return null;
            }
            Integer num = timecardBreakDefinition.expected_duration_seconds;
            if (num == null) {
                a$$ExternalSyntheticBUOutline0.m1430m((Object) "Break definition missing expected_duration_seconds: token=".concat(str));
                return null;
            }
            int intValue = num.intValue();
            Boolean bool = timecardBreakDefinition.is_paid;
            if (bool == null) {
                a$$ExternalSyntheticBUOutline0.m1430m((Object) "Break definition missing is_paid: token=".concat(str));
                return null;
            }
            boolean booleanValue = bool.booleanValue();
            String formatDuration = ((RealShiftTimeFormatter) this.syntaxHighlight).formatDuration(intValue);
            AndroidStringManager androidStringManager = (AndroidStringManager) this.theme;
            String str3 = booleanValue ? androidStringManager.get(R.string.work_shift_break_paid) : androidStringManager.get(R.string.work_shift_break_unpaid);
            Long l = timecardBreakDefinition.updated_at_timestamp_seconds;
            arrayList.add(new ClockInOverlayViewModel.PickerItem(new ClockInOverlayViewModel.BreakIdentifier(str, l != null ? l.longValue() : 0L), str2, false, Recorder$$ExternalSyntheticOutline2.m(formatDuration, "  ·  ", str3), true));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x020a, code lost:
    
        if (r14 == null) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0262 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClockInOverlayViewModel.Loaded.ClockedOut mapClockedOut(ClockInEssentials.ClockedOutEssentials clockedOutEssentials, boolean z, SellerCardViewModel sellerCardViewModel, LocationIdentifier locationIdentifier, JobIdentifier jobIdentifier, ClockedOutGeofenceUiState clockedOutGeofenceUiState) {
        Instant instant;
        ClockInOverlayMapper$FormattedShiftSchedule clockInOverlayMapper$FormattedShiftSchedule;
        List list;
        Instant instant2;
        String str;
        ClockInOverlayMapper$FormattedShiftSchedule clockInOverlayMapper$FormattedShiftSchedule2;
        ArrayList arrayList;
        ClockInStateResolver clockInStateResolver;
        Comparator comparator;
        int i;
        Instant instant3;
        ClockInOverlayViewModel.PickerItem pickerItem;
        Name name;
        ShiftSchedule.Version version;
        CalendarEvent calendarEvent;
        String str2;
        String str3;
        Iterator it;
        ClockInStateResolver clockInStateResolver2;
        Instant instant4;
        String str4;
        ClockInOverlayViewModel.PickerItem pickerItem2;
        MembershipWageMoney membershipWageMoney;
        Money money;
        String format2;
        Long longOrNull;
        ShiftSchedule shiftSchedule;
        Instant instant5;
        CalendarEvent calendarEvent2;
        String str5;
        Object failure;
        ShiftSchedule shiftSchedule2;
        ShiftSchedule.Version version2;
        Job job;
        ClockInStateResolver clockInStateResolver3 = (ClockInStateResolver) this.linkResolver;
        ClockInEssentials.NextShift nextShift = clockedOutEssentials.nextShift;
        ClockInControls clockInControls = clockedOutEssentials.clockInControls;
        String token = (nextShift == null || (job = nextShift.job) == null) ? null : job.getToken();
        String str6 = (nextShift == null || (shiftSchedule2 = nextShift.shift) == null || (version2 = shiftSchedule2.published_version) == null) ? null : version2.location_id;
        if (nextShift == null || (shiftSchedule = nextShift.shift) == null) {
            instant = null;
        } else {
            ShiftSchedule.Version version3 = shiftSchedule.published_version;
            if (version3 == null || (calendarEvent2 = version3.calendar_event) == null || (str5 = calendarEvent2.stop_datetime) == null) {
                instant5 = null;
            } else {
                try {
                    Result.Companion companion = Result.Companion;
                    failure = OffsetDateTime.parse(str5).toInstant();
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                instant5 = (Instant) failure;
            }
            instant = instant5;
        }
        List list2 = clockedOutEssentials.assignedJobs;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (true) {
            String str7 = "";
            if (!it2.hasNext()) {
                break;
            }
            AssignedJob assignedJob = (AssignedJob) it2.next();
            Job job2 = assignedJob.job;
            String token2 = job2.getToken();
            String str8 = token2.length() > 0 ? token2 : null;
            if (str8 == null) {
                it = it2;
                clockInStateResolver2 = clockInStateResolver3;
                instant4 = instant;
                pickerItem2 = null;
            } else {
                it = it2;
                JobIdentifier jobIdentifier2 = new JobIdentifier(str8);
                MembershipWage membershipWage = assignedJob.wage;
                if (membershipWage == null || (membershipWageMoney = membershipWage.hourlyWage) == null) {
                    clockInStateResolver2 = clockInStateResolver3;
                    instant4 = instant;
                } else {
                    clockInStateResolver2 = clockInStateResolver3;
                    String str9 = membershipWageMoney.amount;
                    instant4 = instant;
                    if (str9 != null && (longOrNull = StringsKt.toLongOrNull(10, str9)) != null) {
                        try {
                            String str10 = membershipWageMoney.currencyCode;
                            if (str10 != null) {
                                str7 = str10;
                            }
                            money = new Money(longOrNull, CurrencyCode.valueOf(str7), 4);
                        } catch (IllegalArgumentException unused) {
                        }
                        if (money != null && (format2 = ((MoneyFormatter) this.spansFactory).format(money)) != null) {
                            AndroidStringManager androidStringManager = (AndroidStringManager) this.theme;
                            Map mapOf = MapsKt__MapsJVMKt.mapOf(new Pair("formatted_amount", format2));
                            mapOf.getClass();
                            Resources resources = androidStringManager.resources;
                            resources.getClass();
                            str4 = new MessageFormat(resources.getString(R.string.work_shift_clock_in_hourly_rate_suffix)).format(mapOf);
                            str4.getClass();
                            pickerItem2 = new ClockInOverlayViewModel.PickerItem(jobIdentifier2, (String) job2.title$delegate.getValue(), jobIdentifier2.equals(jobIdentifier), formatPickerBody(str4, str8.equals(token)), true);
                        }
                    }
                    money = null;
                    if (money != null) {
                        AndroidStringManager androidStringManager2 = (AndroidStringManager) this.theme;
                        Map mapOf2 = MapsKt__MapsJVMKt.mapOf(new Pair("formatted_amount", format2));
                        mapOf2.getClass();
                        Resources resources2 = androidStringManager2.resources;
                        resources2.getClass();
                        str4 = new MessageFormat(resources2.getString(R.string.work_shift_clock_in_hourly_rate_suffix)).format(mapOf2);
                        str4.getClass();
                        pickerItem2 = new ClockInOverlayViewModel.PickerItem(jobIdentifier2, (String) job2.title$delegate.getValue(), jobIdentifier2.equals(jobIdentifier), formatPickerBody(str4, str8.equals(token)), true);
                    }
                }
                str4 = null;
                pickerItem2 = new ClockInOverlayViewModel.PickerItem(jobIdentifier2, (String) job2.title$delegate.getValue(), jobIdentifier2.equals(jobIdentifier), formatPickerBody(str4, str8.equals(token)), true);
            }
            if (pickerItem2 != null) {
                arrayList2.add(pickerItem2);
            }
            it2 = it;
            clockInStateResolver3 = clockInStateResolver2;
            instant = instant4;
        }
        ClockInStateResolver clockInStateResolver4 = clockInStateResolver3;
        Instant instant6 = instant;
        SemanticsSortKt$special$$inlined$thenBy$1 semanticsSortKt$special$$inlined$thenBy$1 = new SemanticsSortKt$special$$inlined$thenBy$1(new StateBindingsKt$$ExternalSyntheticLambda0(token, 4), 15);
        StringCompanionObject.INSTANCE.getClass();
        Comparator comparator2 = String.CASE_INSENSITIVE_ORDER;
        comparator2.getClass();
        int i2 = 17;
        List sortedWith = CollectionsKt.sortedWith(arrayList2, new SemanticsSortKt$special$$inlined$thenBy$1(new SemanticsSortKt$special$$inlined$thenBy$1(semanticsSortKt$special$$inlined$thenBy$1, 16), i2));
        ShiftSchedule shiftSchedule3 = nextShift != null ? nextShift.shift : null;
        RealShiftTimeFormatter realShiftTimeFormatter = (RealShiftTimeFormatter) this.syntaxHighlight;
        if (shiftSchedule3 != null && (version = shiftSchedule3.published_version) != null && (calendarEvent = version.calendar_event) != null && (str2 = calendarEvent.start_datetime) != null && (str3 = calendarEvent.stop_datetime) != null) {
            try {
                OffsetDateTime parse = OffsetDateTime.parse(str2);
                OffsetDateTime parse2 = OffsetDateTime.parse(str3);
                parse.getClass();
                String formatDate = realShiftTimeFormatter.formatDate(parse);
                parse2.getClass();
                String formatShiftTimeRange = realShiftTimeFormatter.formatShiftTimeRange(parse, parse2, calendarEvent.time_zone);
                clockInOverlayMapper$FormattedShiftSchedule = new ClockInOverlayMapper$FormattedShiftSchedule(new ClockInOverlayViewModel.ShiftScheduleDisplay(formatDate + "  ·  " + formatShiftTimeRange), formatShiftTimeRange);
            } catch (Exception unused2) {
            }
            ClockInOverlayViewModel.ShiftScheduleDisplay shiftScheduleDisplay = clockInOverlayMapper$FormattedShiftSchedule == null ? clockInOverlayMapper$FormattedShiftSchedule.display : null;
            ArrayList<com.squareup.protos.wire.roster.mds.Unit> arrayList3 = clockedOutEssentials.locations;
            ArrayList arrayList4 = new ArrayList();
            for (com.squareup.protos.wire.roster.mds.Unit unit : arrayList3) {
                String str11 = unit.token;
                if (str11 != null) {
                    if (str11.length() <= 0) {
                        str11 = null;
                    }
                    if (str11 != null) {
                        LocationIdentifier locationIdentifier2 = new LocationIdentifier(str11);
                        boolean equals = str11.equals(str6);
                        String str12 = unit.nickname;
                        if (str12 != null) {
                            if (str12.length() <= 0) {
                                str12 = null;
                            }
                        }
                        Names names = unit.name;
                        if (names == null || (name = names.primary) == null || (str12 = name.value) == null || str12.length() <= 0) {
                            str12 = null;
                        }
                        String str13 = str12 == null ? "" : str12;
                        boolean equals2 = locationIdentifier2.equals(locationIdentifier);
                        String formatPickerBody = formatPickerBody((!equals || clockInOverlayMapper$FormattedShiftSchedule == null) ? null : clockInOverlayMapper$FormattedShiftSchedule.timeRange, equals);
                        arrayList = arrayList4;
                        clockInOverlayMapper$FormattedShiftSchedule2 = clockInOverlayMapper$FormattedShiftSchedule;
                        clockInStateResolver = clockInStateResolver4;
                        instant3 = instant6;
                        comparator = comparator2;
                        i = 17;
                        pickerItem = new ClockInOverlayViewModel.PickerItem(locationIdentifier2, str13, equals2, formatPickerBody, clockInStateResolver.getClockInEnabledForLocationResult(clockInControls.hasOverridePermission, clockInControls.canEnforceEarlyOrUnscheduledClockIn, clockInControls.get(str11), instant3, equals).isEnabled);
                        if (pickerItem == null) {
                            arrayList.add(pickerItem);
                        }
                        instant6 = instant3;
                        arrayList4 = arrayList;
                        i2 = i;
                        comparator2 = comparator;
                        clockInStateResolver4 = clockInStateResolver;
                        clockInOverlayMapper$FormattedShiftSchedule = clockInOverlayMapper$FormattedShiftSchedule2;
                    }
                }
                clockInOverlayMapper$FormattedShiftSchedule2 = clockInOverlayMapper$FormattedShiftSchedule;
                arrayList = arrayList4;
                clockInStateResolver = clockInStateResolver4;
                comparator = comparator2;
                i = i2;
                instant3 = instant6;
                pickerItem = null;
                if (pickerItem == null) {
                }
                instant6 = instant3;
                arrayList4 = arrayList;
                i2 = i;
                comparator2 = comparator;
                clockInStateResolver4 = clockInStateResolver;
                clockInOverlayMapper$FormattedShiftSchedule = clockInOverlayMapper$FormattedShiftSchedule2;
            }
            ClockInStateResolver clockInStateResolver5 = clockInStateResolver4;
            Comparator comparator3 = comparator2;
            int i3 = i2;
            Instant instant7 = instant6;
            SemanticsSortKt$special$$inlined$thenBy$1 semanticsSortKt$special$$inlined$thenBy$12 = new SemanticsSortKt$special$$inlined$thenBy$1(new StateBindingsKt$$ExternalSyntheticLambda0(str6, 5), 15);
            StringCompanionObject.INSTANCE.getClass();
            comparator3.getClass();
            List sortedWith2 = CollectionsKt.sortedWith(arrayList4, new SemanticsSortKt$special$$inlined$thenBy$1(new SemanticsSortKt$special$$inlined$thenBy$1(semanticsSortKt$special$$inlined$thenBy$12, 16), i3));
            if (z) {
                list = sortedWith2;
            } else {
                ArrayList arrayList5 = new ArrayList();
                for (Object obj : sortedWith2) {
                    if (Intrinsics.areEqual(((LocationIdentifier) ((ClockInOverlayViewModel.PickerItem) obj).identifier).token, str6)) {
                        arrayList5.add(obj);
                    }
                }
                list = arrayList5;
            }
            boolean z2 = clockInControls.hasOverridePermission;
            boolean z3 = clockInControls.canEnforceEarlyOrUnscheduledClockIn;
            LocationScopedClockInControls locationScopedClockInControls = str6 == null ? clockInControls.get(str6) : null;
            if (locationIdentifier == null) {
                instant2 = instant7;
                str = locationIdentifier.token;
            } else {
                instant2 = instant7;
                str = null;
            }
            boolean shouldSendShiftToken = clockInStateResolver5.shouldSendShiftToken(z2, z3, locationScopedClockInControls, str, str6, instant2);
            String str14 = clockedOutGeofenceUiState.reasonText;
            String str15 = clockedOutGeofenceUiState.settingsLinkText;
            boolean z4 = clockedOutGeofenceUiState.isLoading;
            boolean z5 = clockedOutGeofenceUiState.isAllowed;
            ClockInOverlayViewModel.ShiftScheduleDisplay shiftScheduleDisplay2 = (512 & 2) == 0 ? null : shiftScheduleDisplay;
            boolean z6 = (512 & 16) == 0 ? false : shouldSendShiftToken;
            String str16 = (512 & 32) == 0 ? null : str14;
            String str17 = (512 & 64) == 0 ? null : str15;
            boolean z7 = (512 & 128) == 0 ? false : z4;
            if ((512 & 256) != 0) {
                z5 = true;
            }
            return new ClockInOverlayViewModel.Loaded.ClockedOut(sellerCardViewModel, shiftScheduleDisplay2, list, sortedWith, z6, str16, str17, z7, z5, false);
        }
        clockInOverlayMapper$FormattedShiftSchedule = null;
        if (clockInOverlayMapper$FormattedShiftSchedule == null) {
        }
        ArrayList<com.squareup.protos.wire.roster.mds.Unit> arrayList32 = clockedOutEssentials.locations;
        ArrayList arrayList42 = new ArrayList();
        while (r2.hasNext()) {
        }
        ClockInStateResolver clockInStateResolver52 = clockInStateResolver4;
        Comparator comparator32 = comparator2;
        int i32 = i2;
        Instant instant72 = instant6;
        SemanticsSortKt$special$$inlined$thenBy$1 semanticsSortKt$special$$inlined$thenBy$122 = new SemanticsSortKt$special$$inlined$thenBy$1(new StateBindingsKt$$ExternalSyntheticLambda0(str6, 5), 15);
        StringCompanionObject.INSTANCE.getClass();
        comparator32.getClass();
        List sortedWith22 = CollectionsKt.sortedWith(arrayList42, new SemanticsSortKt$special$$inlined$thenBy$1(new SemanticsSortKt$special$$inlined$thenBy$1(semanticsSortKt$special$$inlined$thenBy$122, 16), i32));
        if (z) {
        }
        boolean z22 = clockInControls.hasOverridePermission;
        boolean z32 = clockInControls.canEnforceEarlyOrUnscheduledClockIn;
        if (str6 == null) {
        }
        if (locationIdentifier == null) {
        }
        boolean shouldSendShiftToken2 = clockInStateResolver52.shouldSendShiftToken(z22, z32, locationScopedClockInControls, str, str6, instant2);
        String str142 = clockedOutGeofenceUiState.reasonText;
        String str152 = clockedOutGeofenceUiState.settingsLinkText;
        boolean z42 = clockedOutGeofenceUiState.isLoading;
        boolean z52 = clockedOutGeofenceUiState.isAllowed;
        if ((512 & 2) == 0) {
        }
        if ((512 & 16) == 0) {
        }
        if ((512 & 32) == 0) {
        }
        if ((512 & 64) == 0) {
        }
        if ((512 & 128) == 0) {
        }
        if ((512 & 256) != 0) {
        }
        return new ClockInOverlayViewModel.Loaded.ClockedOut(sellerCardViewModel, shiftScheduleDisplay2, list, sortedWith, z6, str16, str17, z7, z52, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e1, code lost:
    
        if (r1 == r2) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object preauthenticate(ClientScenario clientScenario, String str, ContinuationImpl continuationImpl) {
        RealBiometricPreauthScenarioManager$preauthenticate$1 realBiometricPreauthScenarioManager$preauthenticate$1;
        RealBiometricPreauthScenarioManager$preauthenticate$1 realBiometricPreauthScenarioManager$preauthenticate$12;
        Object obj;
        int i;
        Object obj2;
        ClientScenario clientScenario2;
        String str2;
        Profile profile;
        String str3;
        Object read$default;
        ClientScenario clientScenario3;
        String str4;
        String str5;
        BiometricsStore$BiometricsResult biometricsStore$BiometricsResult;
        if (continuationImpl instanceof RealBiometricPreauthScenarioManager$preauthenticate$1) {
            realBiometricPreauthScenarioManager$preauthenticate$1 = (RealBiometricPreauthScenarioManager$preauthenticate$1) continuationImpl;
            int i2 = realBiometricPreauthScenarioManager$preauthenticate$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBiometricPreauthScenarioManager$preauthenticate$1.label = i2 - PKIFailureInfo.systemUnavail;
                realBiometricPreauthScenarioManager$preauthenticate$12 = realBiometricPreauthScenarioManager$preauthenticate$1;
                Object obj3 = realBiometricPreauthScenarioManager$preauthenticate$12.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBiometricPreauthScenarioManager$preauthenticate$12.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj3);
                    RealProfileManager realProfileManager = (RealProfileManager) this.spansFactory;
                    realBiometricPreauthScenarioManager$preauthenticate$12.L$0 = clientScenario;
                    realBiometricPreauthScenarioManager$preauthenticate$12.L$1 = str;
                    realBiometricPreauthScenarioManager$preauthenticate$12.label = 1;
                    Object withContext = JobKt.withContext(realProfileManager.ioDispatcher, new RealProfileManager$profileOrNull$2(realProfileManager, continuation, 0), realBiometricPreauthScenarioManager$preauthenticate$12);
                    if (withContext != obj) {
                        obj2 = withContext;
                        clientScenario2 = clientScenario;
                        str2 = str;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        str4 = realBiometricPreauthScenarioManager$preauthenticate$12.L$2;
                        str5 = realBiometricPreauthScenarioManager$preauthenticate$12.L$1;
                        clientScenario3 = realBiometricPreauthScenarioManager$preauthenticate$12.L$0;
                        SafeTrace.throwOnFailure(obj3);
                        biometricsStore$BiometricsResult = (BiometricsStore$BiometricsResult) obj3;
                        if (biometricsStore$BiometricsResult instanceof BiometricsStore$BiometricsResult.Success) {
                            String str6 = ((BiometricsStore$BiometricsResult.Success) biometricsStore$BiometricsResult).value;
                            AppService appService = (AppService) this.imageDestinationProcessor;
                            ConfirmPasscodeRequest confirmPasscodeRequest = new ConfirmPasscodeRequest((RequestContext) null, (String) null, (List) null, str6, (InstrumentSelection) null, (String) null, 119);
                            realBiometricPreauthScenarioManager$preauthenticate$12.L$0 = null;
                            realBiometricPreauthScenarioManager$preauthenticate$12.L$1 = null;
                            realBiometricPreauthScenarioManager$preauthenticate$12.L$2 = str4;
                            realBiometricPreauthScenarioManager$preauthenticate$12.label = 3;
                            obj3 = appService.confirmPasscode(clientScenario3, str5, confirmPasscodeRequest, realBiometricPreauthScenarioManager$preauthenticate$12);
                        }
                        return BiometricPreauthScenarioManager$PreauthResult.Failed.INSTANCE;
                    }
                    if (i != 3) {
                        if (i == 4) {
                            SafeTrace.throwOnFailure(obj3);
                            return obj3;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str4 = realBiometricPreauthScenarioManager$preauthenticate$12.L$2;
                    SafeTrace.throwOnFailure(obj3);
                    ApiResult apiResult = (ApiResult) obj3;
                    if (!(apiResult instanceof ApiResult.Success)) {
                        if (!(apiResult instanceof ApiResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        return BiometricPreauthScenarioManager$PreauthResult.Failed.INSTANCE;
                    }
                    ConfirmPasscodeResponse confirmPasscodeResponse = (ConfirmPasscodeResponse) ((ApiResult.Success) apiResult).response;
                    realBiometricPreauthScenarioManager$preauthenticate$12.L$0 = null;
                    realBiometricPreauthScenarioManager$preauthenticate$12.L$1 = null;
                    realBiometricPreauthScenarioManager$preauthenticate$12.L$2 = null;
                    realBiometricPreauthScenarioManager$preauthenticate$12.label = 4;
                    Object preauthResult = toPreauthResult(confirmPasscodeResponse, str4, realBiometricPreauthScenarioManager$preauthenticate$12);
                    return preauthResult == obj ? obj : preauthResult;
                }
                String str7 = realBiometricPreauthScenarioManager$preauthenticate$12.L$1;
                ClientScenario clientScenario4 = realBiometricPreauthScenarioManager$preauthenticate$12.L$0;
                SafeTrace.throwOnFailure(obj3);
                str2 = str7;
                obj2 = obj3;
                clientScenario2 = clientScenario4;
                profile = (Profile) obj2;
                if (profile != null && (str3 = profile.verification_instrument_token) != null) {
                    AndroidBiometricsStore androidBiometricsStore = (AndroidBiometricsStore) this.syntaxHighlight;
                    Activity activity = (Activity) this.theme;
                    Biometrics$Info biometrics$Info = ((CashBiometricsInfo) this.linkResolver).unlock;
                    BiometricsStore$AnalyticsPayload biometricsStore$AnalyticsPayload = new BiometricsStore$AnalyticsPayload(str2, clientScenario2.toString());
                    realBiometricPreauthScenarioManager$preauthenticate$12.L$0 = clientScenario2;
                    realBiometricPreauthScenarioManager$preauthenticate$12.L$1 = str2;
                    realBiometricPreauthScenarioManager$preauthenticate$12.L$2 = str3;
                    realBiometricPreauthScenarioManager$preauthenticate$12.label = 2;
                    read$default = AndroidBiometricsStore.read$default(androidBiometricsStore, activity, str3, biometrics$Info, biometricsStore$AnalyticsPayload, realBiometricPreauthScenarioManager$preauthenticate$12);
                    if (read$default != obj) {
                        clientScenario3 = clientScenario2;
                        obj3 = read$default;
                        str4 = str3;
                        str5 = str2;
                        biometricsStore$BiometricsResult = (BiometricsStore$BiometricsResult) obj3;
                        if (biometricsStore$BiometricsResult instanceof BiometricsStore$BiometricsResult.Success) {
                        }
                    }
                }
                return BiometricPreauthScenarioManager$PreauthResult.Failed.INSTANCE;
            }
        }
        realBiometricPreauthScenarioManager$preauthenticate$1 = new RealBiometricPreauthScenarioManager$preauthenticate$1(this, continuationImpl);
        realBiometricPreauthScenarioManager$preauthenticate$12 = realBiometricPreauthScenarioManager$preauthenticate$1;
        Object obj32 = realBiometricPreauthScenarioManager$preauthenticate$12.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBiometricPreauthScenarioManager$preauthenticate$12.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        profile = (Profile) obj2;
        if (profile != null) {
            AndroidBiometricsStore androidBiometricsStore2 = (AndroidBiometricsStore) this.syntaxHighlight;
            Activity activity2 = (Activity) this.theme;
            Biometrics$Info biometrics$Info2 = ((CashBiometricsInfo) this.linkResolver).unlock;
            BiometricsStore$AnalyticsPayload biometricsStore$AnalyticsPayload2 = new BiometricsStore$AnalyticsPayload(str2, clientScenario2.toString());
            realBiometricPreauthScenarioManager$preauthenticate$12.L$0 = clientScenario2;
            realBiometricPreauthScenarioManager$preauthenticate$12.L$1 = str2;
            realBiometricPreauthScenarioManager$preauthenticate$12.L$2 = str3;
            realBiometricPreauthScenarioManager$preauthenticate$12.label = 2;
            read$default = AndroidBiometricsStore.read$default(androidBiometricsStore2, activity2, str3, biometrics$Info2, biometricsStore$AnalyticsPayload2, realBiometricPreauthScenarioManager$preauthenticate$12);
            if (read$default != obj) {
            }
        }
        return BiometricPreauthScenarioManager$PreauthResult.Failed.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object produceResponseContext(BlockersData blockersData, ContinuationImpl continuationImpl) {
        InitiateStablecoinExchangeScenarioPlan$produceResponseContext$1 initiateStablecoinExchangeScenarioPlan$produceResponseContext$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof InitiateStablecoinExchangeScenarioPlan$produceResponseContext$1) {
            initiateStablecoinExchangeScenarioPlan$produceResponseContext$1 = (InitiateStablecoinExchangeScenarioPlan$produceResponseContext$1) continuationImpl;
            int i2 = initiateStablecoinExchangeScenarioPlan$produceResponseContext$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                initiateStablecoinExchangeScenarioPlan$produceResponseContext$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = initiateStablecoinExchangeScenarioPlan$produceResponseContext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = initiateStablecoinExchangeScenarioPlan$produceResponseContext$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Analytics analytics = (Analytics) this.syntaxHighlight;
                    CryptoTradeComplete.CryptoTradeCompleteOrderType cryptoTradeCompleteOrderType = CryptoTradeComplete.CryptoTradeCompleteOrderType.STANDARD;
                    CryptoTradeSide cryptoTradeSide = CryptoTradeSide.BUY;
                    Locale locale = Locale.ROOT;
                    String lowerCase = "BTC".toLowerCase(locale);
                    lowerCase.getClass();
                    String lowerCase2 = "XUS".toLowerCase(locale);
                    lowerCase2.getClass();
                    analytics.track(new CryptoTradeComplete(cryptoTradeCompleteOrderType, cryptoTradeSide, lowerCase2, lowerCase), null);
                    StablecoinExchangeType$ConvertBitcoinToStablecoin$ConvertAll stablecoinExchangeType$ConvertBitcoinToStablecoin$ConvertAll = (StablecoinExchangeType$ConvertBitcoinToStablecoin$ConvertAll) this.spansFactory;
                    String str = stablecoinExchangeType$ConvertBitcoinToStablecoin$ConvertAll.targetToken;
                    String str2 = stablecoinExchangeType$ConvertBitcoinToStablecoin$ConvertAll.sourceToken;
                    CurrencyCode currencyCode = CurrencyCode.XUS;
                    str.getClass();
                    currencyCode.getClass();
                    String str3 = stablecoinExchangeType$ConvertBitcoinToStablecoin$ConvertAll.targetToken;
                    str3.getClass();
                    CurrencyCode currencyCode2 = CurrencyCode.BTC;
                    str2.getClass();
                    currencyCode2.getClass();
                    str2.getClass();
                    ExchangeRequest exchangeRequest = new ExchangeRequest(currencyCode2, currencyCode, new ExchangeRequest$Amount$AllSourceAmount(true), str2, str3, null, null, new UserInteractionContext(UserInteractionContext.Applet.XUS), null, 7136);
                    CryptoService cryptoService = (CryptoService) this.theme;
                    String str4 = blockersData.flowToken;
                    ExchangeRequest copy$default = ExchangeRequest.copy$default(exchangeRequest, null, null, null, blockersData.requestContext, null, null, null, null, null, 8127);
                    initiateStablecoinExchangeScenarioPlan$produceResponseContext$1.label = 1;
                    obj = cryptoService.initiateCryptoExchange(str4, copy$default, initiateStablecoinExchangeScenarioPlan$produceResponseContext$1);
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
                    ResponseContext responseContext = ((ExchangeResponse) ((ApiResult.Success) apiResult).response).response_context;
                    return Matcher$$ExternalSyntheticOutline0.m(responseContext, responseContext);
                }
                if (apiResult instanceof ApiResult.Failure) {
                    return apiResult;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        initiateStablecoinExchangeScenarioPlan$produceResponseContext$1 = new InitiateStablecoinExchangeScenarioPlan$produceResponseContext$1(this, continuationImpl);
        Object obj2 = initiateStablecoinExchangeScenarioPlan$produceResponseContext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = initiateStablecoinExchangeScenarioPlan$produceResponseContext$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    @Override // com.squareup.cash.google.pay.GooglePayProvisioningGateway
    public Object provision(BlockersScreens.ProvisionGooglePayScreen provisionGooglePayScreen, String str, String str2, Continuation continuation) {
        return new WorkReviewTermsBanner$configFlow$$inlined$map$1(FlowKt.take(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(((RealIssuedCardManager) ((IssuedCardManager) this.linkResolver)).getIssuedCardOrNull(), 24), 1), this, provisionGooglePayScreen, str2, str, 3);
    }

    public void pruneAllChildRegistryOwnersExcept(AbstractCollection abstractCollection) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.imageDestinationProcessor;
        Iterator it = SetsKt___SetsKt.minus(linkedHashMap.keySet(), (Iterable) abstractCollection).iterator();
        while (it.hasNext()) {
            linkedHashMap.remove((String) it.next());
        }
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.theme;
        if (linkedHashMap2 == null) {
            return;
        }
        Set minus = SetsKt___SetsKt.minus(linkedHashMap2.keySet(), (Iterable) abstractCollection);
        Set keySet = linkedHashMap2.keySet();
        Set set = minus;
        keySet.getClass();
        set.getClass();
        keySet.removeAll(CollectionsKt__MutableCollectionsKt.convertToListIfNotCollection(set));
    }

    public void showSupportArticle(String str) {
        ((Navigator) this.spansFactory).goTo(RealSupportNavigator.startSupportFlow$default((RealSupportNavigator) this.linkResolver, str, null, new MoneyTabScreen(null), null, null, null, 118));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r9, r10, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        if (r10 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object syncAvailableAccountStatements(String str, StatementType statementType, ContinuationImpl continuationImpl) {
        RealAccountStatementsManager$syncAvailableAccountStatements$1 realAccountStatementsManager$syncAvailableAccountStatements$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealAccountStatementsManager$syncAvailableAccountStatements$1) {
            realAccountStatementsManager$syncAvailableAccountStatements$1 = (RealAccountStatementsManager$syncAvailableAccountStatements$1) continuationImpl;
            int i2 = realAccountStatementsManager$syncAvailableAccountStatements$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAccountStatementsManager$syncAvailableAccountStatements$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realAccountStatementsManager$syncAvailableAccountStatements$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAccountStatementsManager$syncAvailableAccountStatements$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RegistrarClientService registrarClientService = (RegistrarClientService) this.theme;
                    GetAvailableStatementsForStatementTypeRequest getAvailableStatementsForStatementTypeRequest = new GetAvailableStatementsForStatementTypeRequest(str, statementType, ByteString.EMPTY);
                    realAccountStatementsManager$syncAvailableAccountStatements$1.label = 1;
                    obj = registrarClientService.getAvailableAccountStatements(getAvailableStatementsForStatementTypeRequest, realAccountStatementsManager$syncAvailableAccountStatements$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    return Unit.INSTANCE;
                }
                GetAvailableStatementsForStatementTypeResponse getAvailableStatementsForStatementTypeResponse = (GetAvailableStatementsForStatementTypeResponse) ((ApiResult.Success) apiResult).response;
                CoroutineContext coroutineContext = (CoroutineContext) this.syntaxHighlight;
                RealAppConfigManager$update$2$2 realAppConfigManager$update$2$2 = new RealAppConfigManager$update$2$2(this, getAvailableStatementsForStatementTypeResponse, continuation, 15);
                realAccountStatementsManager$syncAvailableAccountStatements$1.label = 2;
            }
        }
        realAccountStatementsManager$syncAvailableAccountStatements$1 = new RealAccountStatementsManager$syncAvailableAccountStatements$1(this, continuationImpl);
        Object obj2 = realAccountStatementsManager$syncAvailableAccountStatements$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAccountStatementsManager$syncAvailableAccountStatements$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r0, r3, r1) == r2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a0, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (r10 != r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        if (r10 == r2) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object syncCustomerStatementTypes(ContinuationImpl continuationImpl) {
        RealAccountStatementsManager$syncCustomerStatementTypes$1 realAccountStatementsManager$syncCustomerStatementTypes$1;
        int i;
        RegistrarClientService registrarClientService;
        CoroutineContext coroutineContext = (CoroutineContext) this.syntaxHighlight;
        if (continuationImpl instanceof RealAccountStatementsManager$syncCustomerStatementTypes$1) {
            realAccountStatementsManager$syncCustomerStatementTypes$1 = (RealAccountStatementsManager$syncCustomerStatementTypes$1) continuationImpl;
            int i2 = realAccountStatementsManager$syncCustomerStatementTypes$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAccountStatementsManager$syncCustomerStatementTypes$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realAccountStatementsManager$syncCustomerStatementTypes$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAccountStatementsManager$syncCustomerStatementTypes$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    registrarClientService = (RegistrarClientService) this.theme;
                    realAccountStatementsManager$syncCustomerStatementTypes$1.L$0 = registrarClientService;
                    realAccountStatementsManager$syncCustomerStatementTypes$1.label = 1;
                    obj = FlowKt.first(new RealDisclosureProvider$special$$inlined$map$1(DBUtil.mapToOneNotNull(DBUtil.toFlow(((InstrumentQueries) this.spansFactory).select$2()), coroutineContext), 7), realAccountStatementsManager$syncCustomerStatementTypes$1);
                } else if (i == 1) {
                    registrarClientService = realAccountStatementsManager$syncCustomerStatementTypes$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                    ApiResult apiResult = (ApiResult) obj;
                    if (!(apiResult instanceof ApiResult.Success)) {
                        return Unit.INSTANCE;
                    }
                    RealAppConfigManager$update$2$2 realAppConfigManager$update$2$2 = new RealAppConfigManager$update$2$2(this, (GetStatementTypesResponse) ((ApiResult.Success) apiResult).response, continuation, 16);
                    realAccountStatementsManager$syncCustomerStatementTypes$1.L$0 = null;
                    realAccountStatementsManager$syncCustomerStatementTypes$1.label = 3;
                }
                GetStatementTypesRequest getStatementTypesRequest = new GetStatementTypesRequest((String) obj, ByteString.EMPTY);
                realAccountStatementsManager$syncCustomerStatementTypes$1.L$0 = null;
                realAccountStatementsManager$syncCustomerStatementTypes$1.label = 2;
                obj = registrarClientService.getStatementAccounts(getStatementTypesRequest, realAccountStatementsManager$syncCustomerStatementTypes$1);
            }
        }
        realAccountStatementsManager$syncCustomerStatementTypes$1 = new RealAccountStatementsManager$syncCustomerStatementTypes$1(this, continuationImpl);
        Object obj2 = realAccountStatementsManager$syncCustomerStatementTypes$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAccountStatementsManager$syncCustomerStatementTypes$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        GetStatementTypesRequest getStatementTypesRequest2 = new GetStatementTypesRequest((String) obj2, ByteString.EMPTY);
        realAccountStatementsManager$syncCustomerStatementTypes$1.L$0 = null;
        realAccountStatementsManager$syncCustomerStatementTypes$1.label = 2;
        obj2 = registrarClientService.getStatementAccounts(getStatementTypesRequest2, realAccountStatementsManager$syncCustomerStatementTypes$1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if (r7 == r10) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object toPreauthResult(ConfirmPasscodeResponse confirmPasscodeResponse, String str, ContinuationImpl continuationImpl) {
        RealBiometricPreauthScenarioManager$toPreauthResult$1 realBiometricPreauthScenarioManager$toPreauthResult$1;
        int i;
        AndroidBiometricsStore androidBiometricsStore = (AndroidBiometricsStore) this.syntaxHighlight;
        if (continuationImpl instanceof RealBiometricPreauthScenarioManager$toPreauthResult$1) {
            realBiometricPreauthScenarioManager$toPreauthResult$1 = (RealBiometricPreauthScenarioManager$toPreauthResult$1) continuationImpl;
            int i2 = realBiometricPreauthScenarioManager$toPreauthResult$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBiometricPreauthScenarioManager$toPreauthResult$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realBiometricPreauthScenarioManager$toPreauthResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBiometricPreauthScenarioManager$toPreauthResult$1.label;
                BiometricPreauthScenarioManager$PreauthResult.Failed failed = BiometricPreauthScenarioManager$PreauthResult.Failed.INSTANCE;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ConfirmPasscodeResponse.Status status = confirmPasscodeResponse.status;
                    int i3 = status == null ? -1 : RealBiometricPreauthScenarioManager$WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            realBiometricPreauthScenarioManager$toPreauthResult$1.L$0 = null;
                            realBiometricPreauthScenarioManager$toPreauthResult$1.label = 2;
                            if (androidBiometricsStore.write(str, null, realBiometricPreauthScenarioManager$toPreauthResult$1) == coroutineSingletons) {
                            }
                        }
                        return failed;
                    }
                    String str2 = confirmPasscodeResponse.passcode_token;
                    if (str2 != null) {
                        realBiometricPreauthScenarioManager$toPreauthResult$1.L$0 = confirmPasscodeResponse;
                        realBiometricPreauthScenarioManager$toPreauthResult$1.label = 1;
                        obj = androidBiometricsStore.write(str, str2, realBiometricPreauthScenarioManager$toPreauthResult$1);
                    }
                    return new BiometricPreauthScenarioManager$PreauthResult.Success(confirmPasscodeResponse.response_context);
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return failed;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                confirmPasscodeResponse = realBiometricPreauthScenarioManager$toPreauthResult$1.L$0;
                SafeTrace.throwOnFailure(obj);
                return new BiometricPreauthScenarioManager$PreauthResult.Success(confirmPasscodeResponse.response_context);
            }
        }
        realBiometricPreauthScenarioManager$toPreauthResult$1 = new RealBiometricPreauthScenarioManager$toPreauthResult$1(this, continuationImpl);
        Object obj2 = realBiometricPreauthScenarioManager$toPreauthResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBiometricPreauthScenarioManager$toPreauthResult$1.label;
        BiometricPreauthScenarioManager$PreauthResult.Failed failed2 = BiometricPreauthScenarioManager$PreauthResult.Failed.INSTANCE;
        if (i != 0) {
        }
        return new BiometricPreauthScenarioManager$PreauthResult.Success(confirmPasscodeResponse.response_context);
    }

    public /* synthetic */ MarkwonConfiguration(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.theme = obj;
        this.syntaxHighlight = obj2;
        this.linkResolver = obj3;
        this.imageDestinationProcessor = obj4;
        this.spansFactory = obj5;
    }

    public MarkwonConfiguration(int i) {
        switch (i) {
            case 18:
                this.imageDestinationProcessor = new LinkedHashMap();
                this.spansFactory = new CompositeGeneratedAdaptersObserver(this, 4);
                break;
            default:
                this.theme = new float[16];
                this.syntaxHighlight = new float[16];
                this.linkResolver = new float[4];
                break;
        }
    }

    public MarkwonConfiguration(PaymentTemplateService paymentTemplateService, NearbySessionService nearbySessionService, AssetPublicSuffixList assetPublicSuffixList, RealMessageSigner realMessageSigner, AttestedKeyService.Factory factory) {
        this.theme = paymentTemplateService;
        this.syntaxHighlight = nearbySessionService;
        this.linkResolver = assetPublicSuffixList;
        this.imageDestinationProcessor = realMessageSigner;
        this.spansFactory = LazyKt.lazy(new MoneyTabUIKt$$ExternalSyntheticLambda5(factory, 13));
    }

    public MarkwonConfiguration(CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0, RealActivityInboundNavigator$Factory$Impl realActivityInboundNavigator$Factory$Impl, RealMoneyInboundNavigator$Factory$Impl realMoneyInboundNavigator$Factory$Impl, RealMoneybotInboundNavigator$Factory$Impl realMoneybotInboundNavigator$Factory$Impl, Navigator navigator) {
        navigator.getClass();
        this.theme = cashAppLiteReleaseModule$$ExternalSyntheticLambda0;
        this.syntaxHighlight = navigator;
        this.linkResolver = new SizeMap(navigator);
        this.imageDestinationProcessor = realMoneybotInboundNavigator$Factory$Impl.create(navigator);
        this.spansFactory = realActivityInboundNavigator$Factory$Impl.create$1(navigator);
    }

    public MarkwonConfiguration(SyncValueReader syncValueReader, CashAccountDatabaseImpl cashAccountDatabaseImpl, FeatureFlagManager featureFlagManager, Signal signal, CoroutineContext coroutineContext) {
        this.theme = featureFlagManager;
        this.syntaxHighlight = syncValueReader;
        this.linkResolver = coroutineContext;
        this.imageDestinationProcessor = signal;
        this.spansFactory = cashAccountDatabaseImpl.instrumentQueries;
    }

    public MarkwonConfiguration(CashAccountDatabaseImpl cashAccountDatabaseImpl, RegistrarClientService registrarClientService, CoroutineContext coroutineContext) {
        this.theme = registrarClientService;
        this.syntaxHighlight = coroutineContext;
        this.linkResolver = cashAccountDatabaseImpl.customerStatementTypeQueries;
        this.imageDestinationProcessor = cashAccountDatabaseImpl.availableAccountStatementQueries;
        this.spansFactory = cashAccountDatabaseImpl.profileQueries;
    }

    public MarkwonConfiguration(Analytics analytics, SessionManager sessionManager, RealSupportNavigator realSupportNavigator, AndroidStringManager androidStringManager, Navigator navigator) {
        navigator.getClass();
        this.theme = analytics;
        this.syntaxHighlight = sessionManager;
        this.linkResolver = realSupportNavigator;
        this.imageDestinationProcessor = androidStringManager;
        this.spansFactory = navigator;
    }

    public MarkwonConfiguration(Screen screen, ScenarioPlanInput scenarioPlanInput, CryptoService cryptoService, FlowStarter flowStarter, Analytics analytics) {
        screen.getClass();
        this.theme = cryptoService;
        this.syntaxHighlight = analytics;
        this.linkResolver = flowStarter;
        this.imageDestinationProcessor = screen;
        if (scenarioPlanInput instanceof InitiateStablecoinExchangeScenarioPlanInput) {
            this.spansFactory = ((InitiateStablecoinExchangeScenarioPlanInput) scenarioPlanInput).exchangeType;
        } else {
            Path$$ExternalSyntheticBUOutline0.m$3(Reflection.factory.getOrCreateKotlinClass(InitiateStablecoinExchangeScenarioPlanInput.class), "Invalid input. Input is not of type ");
            throw null;
        }
    }

    public MarkwonConfiguration(AndroidStringManager androidStringManager, RealShiftTimeFormatter realShiftTimeFormatter, ClockInStateResolver clockInStateResolver, AndroidClock androidClock) {
        this.theme = androidStringManager;
        this.syntaxHighlight = realShiftTimeFormatter;
        this.linkResolver = clockInStateResolver;
        this.imageDestinationProcessor = androidClock;
        this.spansFactory = ArraysKt___ArraysKt.toSet(new ScheduledShiftStatus[]{ScheduledShiftStatus.BeforeClockInWindow.INSTANCE, ScheduledShiftStatus.EarlyClockInBlocked.INSTANCE});
    }

    public MarkwonConfiguration(LocalizedMoneyFormatter.Factory factory, AndroidStringManager androidStringManager, RealShiftTimeFormatter realShiftTimeFormatter, ClockInStateResolver clockInStateResolver, Pool pool) {
        this.theme = androidStringManager;
        this.syntaxHighlight = realShiftTimeFormatter;
        this.linkResolver = clockInStateResolver;
        this.imageDestinationProcessor = pool;
        this.spansFactory = factory.create(MoneyFormatterConfig.COMPACT);
    }
}
