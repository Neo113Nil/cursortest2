package com.squareup.cash.tabs.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.text.android.CanvasCompatO;
import androidx.core.text.TextUtilsCompat;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.api.ApiResult;
import app.cash.badging.api.Badger2;
import app.cash.badging.api.BadgingState;
import app.cash.badging.backend.Badger;
import app.cash.badging.backend.RealBadger2;
import app.cash.badging.backend.RealBadgingStateAccessibilityHelper;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.local.screens.app.LocalTabScreen;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import app.cash.zipline.loader.ZiplineLoader$load$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.model.FillrWidget;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaey;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.common.internal.zzd;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.R;
import com.squareup.cash.account.navigation.RealAccountInboundNavigator$Factory$Impl;
import com.squareup.cash.account.settings.viewmodels.ChangePasswordViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePasscodeSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfileSecurityReadyViewModel$AuthenticatorViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfileSecurityReadyViewModel$PasswordViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfileSecurityViewModel;
import com.squareup.cash.account.settings.viewmodels.trustedcontact.TrustedContactSettingViewModel;
import com.squareup.cash.activity.backend.loader.RealActivitiesManager;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.appmessages.RealAppMessageManager;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.banking.real.RealDisclosureProvider$special$$inlined$map$1;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.cdf.account.AccountReturningLoginAccountListLoaded;
import com.squareup.cash.cdf.account.AccountReturningLoginSkipAccountSelection;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.common.moneyformatter.RoundingMode;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.contacts.RealContactSync;
import com.squareup.cash.data.profile.PasscodeSettings;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.transfers.RealTransferManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.earnings.backend.real.RealEarningsChartRepository$MetroFactory;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$SecuritySettings;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.family.navigation.RealFamilyNavigator$Factory$Impl;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$HideProfileAvatarBadging;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileLocalTabVisibility;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileSurfacesKeypadQrToProfile;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$StringAmplitudeExperiment;
import com.squareup.cash.featureflags.FeatureFlag$StringFeatureFlag$Value;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$AndroidDestinationRouting;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$GetNeighborhoodsTabContent;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$TaxesEntryPoint;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.gcl.data.RealGlobalConfigDataSource;
import com.squareup.cash.globalsearch.presenters.RealGlobalSearchInboundNavigator$Factory$Impl;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.history.navigation.RealActivityInboundNavigator$Factory$Impl;
import com.squareup.cash.initialscreenloader.backend.RealPreSignInScreenLoader;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.money.views.MoneyUiFactory;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper;
import com.squareup.cash.moneybot.presenters.RealMoneybotInboundNavigator$Factory$Impl;
import com.squareup.cash.moneybot.screens.MoneybotAutomationsScreen;
import com.squareup.cash.moneybot.screens.MoneybotChatScreen;
import com.squareup.cash.moneybot.screens.MoneybotHomeScreen;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.multiplatform.accentcolors.AccentColorsKt;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.offers.screens.OffersScreen$OffersHomeScreen;
import com.squareup.cash.offers.views.OffersStyledTextKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.home.OffersHomeV2Kt$$ExternalSyntheticLambda7;
import com.squareup.cash.onboarding.accountpicker.backend.RealSelectedAliasRegistrar;
import com.squareup.cash.onboarding.accountpicker.presenters.AccountPickerPresenter$AccountRemovalStatus;
import com.squareup.cash.onboarding.accountpicker.presenters.AccountPickerPresenter$getUpdatedAccountListConfig$1;
import com.squareup.cash.onboarding.accountpicker.presenters.AccountPickerPresenter$handleAliasFlow$1;
import com.squareup.cash.onboarding.accountpicker.presenters.AccountPickerPresenter$handlePasskeyFlow$1;
import com.squareup.cash.onboarding.accountpicker.presenters.AccountPickerPresenter$removeAccount$1;
import com.squareup.cash.onboarding.accountpicker.presenters.AccountPickerPresenter$skipAccountSelection$1;
import com.squareup.cash.onboarding.accountpicker.presenters.AccountPickerProtoParsingError;
import com.squareup.cash.onboarding.accountpicker.presenters.ValidatedAccount;
import com.squareup.cash.onboarding.accountpicker.presenters.ValidatedAccountList;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingAccountPickerScreen;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingAliasPickerScreen;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountPickerViewModel;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountViewModel;
import com.squareup.cash.overlays.OverlayKt$Overlay$1$1$1$1$1;
import com.squareup.cash.passkeys.backend.PasskeyRepository$LoginIdentifier;
import com.squareup.cash.passkeys.backend.PasskeyRepository$PasskeyAuthenticationResult;
import com.squareup.cash.passkeys.backend.RealPasskeyFeatureManager;
import com.squareup.cash.passkeys.backend.RealPasskeyRepository;
import com.squareup.cash.payments.backend.api.P2pSettingsManager$P2pSettings;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$PaymentPad;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter$models$1$1;
import com.squareup.cash.permissions.ModifiablePermissions;
import com.squareup.cash.profile.presenters.RealProfilePasscodePresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.trustedcontact.InvestingContactPresenter;
import com.squareup.cash.profile.presenters.trustedcontact.TrustedContactFlowPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.trustedcontact.TrustedContactSettingPresenter$Factory$Impl;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda8;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.profile.views.RingtoneView;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter$special$$inlined$filter$1;
import com.squareup.cash.recipients.data.RealRecipientRepository$suggestions$$inlined$map$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter$models$1$2;
import com.squareup.cash.savings.presenters.TransferInPresenter$MetroFactory;
import com.squareup.cash.session.backend.DbSessionManager$updateDb$2;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.storage.AndroidFileSaver;
import com.squareup.cash.tabs.navigation.RealTabToolbarOutboundNavigator$Factory$Impl;
import com.squareup.cash.tabs.viewmodels.TabToolbarBadgeViewModel$Text;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda28;
import com.squareup.cash.ui.BroadwayModule$ProvideBroadwayMetroFactory;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.StackedAvatarViewModelKt;
import com.squareup.cash.upsell.presenters.NullStateSwipeConfigProvider;
import com.squareup.cash.util.RealDrawerOpener$MetroFactory;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.views.WalletUiFactory$MetroFactory;
import com.squareup.cash.work.data.real.RealPayDataLoader$fetchData$1;
import com.squareup.cash.work.session.RealCurrentUserSetter;
import com.squareup.preferences.BooleanPreference;
import com.squareup.protos.cash.janus.api.GetLoginScenarioPlanRequest;
import com.squareup.protos.cash.janus.api.GetLoginScenarioPlanResponse;
import com.squareup.protos.cash.janus.api.JanusService;
import com.squareup.protos.cash.janus.api.RemoveAccountRequest;
import com.squareup.protos.cash.janus.api.RemoveAccountResponse;
import com.squareup.protos.cash.janus.api.ReturningCustomerLoginFlowService;
import com.squareup.protos.cash.local.client.app.v1.account.LocalAccount;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.AccountListConfig;
import com.squareup.protos.franklin.app.GetLinkedAccountsRequest;
import com.squareup.protos.franklin.app.GetLinkedAccountsResponse;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.ui.FullCashtag;
import com.squareup.util.android.RealBackupService;
import com.squareup.util.cash.ColorsKt;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.StateFlowKt$stateFlowOf$1;
import com.squareup.util.task.RepeatTaskExecutor;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class TabToolbarPresenter implements MoleculePresenter, HasObservability {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object badger2;
    public final Object badges;
    public final Object badgingStateAccessibilityHelper;
    public final Object balanceSnapshotManager;
    public final Object familyNavigatorFactory;
    public final Object familyProfileManager;
    public final Object featureFlagManager;
    public final Object moneyFormatter;
    public final Object moneybotAnalyticsService;
    public final Object moneybotFlagsHelper;
    public final Object navigator;
    public final Object p2pSettingsManager;
    public final Object profileManager;
    public final Object screen;
    public final Object sessionFlags;
    public final Object sessionManager;
    public final Object syncValueReader;
    public final Object tabToolbarOutboundNavigator;

    public TabToolbarPresenter(SessionManager sessionManager, RealProfileManager realProfileManager, Flow flow, Badger2 badger2, RealTabToolbarOutboundNavigator$Factory$Impl realTabToolbarOutboundNavigator$Factory$Impl, FeatureFlagManager featureFlagManager, RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, RealBadgingStateAccessibilityHelper realBadgingStateAccessibilityHelper, MoneybotFlagsHelper moneybotFlagsHelper, RealMoneybotAnalyticsService realMoneybotAnalyticsService, RealSessionFlags realSessionFlags, SyncValueReader syncValueReader, RealP2pSettingsManager realP2pSettingsManager, RealFamilyNavigator$Factory$Impl realFamilyNavigator$Factory$Impl, RealFamilyProfileManager realFamilyProfileManager, RealBalanceSnapshotManager realBalanceSnapshotManager, LocalizedMoneyFormatter.Factory factory, Navigator navigator, Screen screen) {
        navigator.getClass();
        this.sessionManager = sessionManager;
        this.profileManager = realProfileManager;
        this.badges = flow;
        this.badger2 = badger2;
        this.featureFlagManager = featureFlagManager;
        this.badgingStateAccessibilityHelper = realBadgingStateAccessibilityHelper;
        this.moneybotFlagsHelper = moneybotFlagsHelper;
        this.moneybotAnalyticsService = realMoneybotAnalyticsService;
        this.sessionFlags = realSessionFlags;
        this.syncValueReader = syncValueReader;
        this.p2pSettingsManager = realP2pSettingsManager;
        this.familyNavigatorFactory = realFamilyNavigator$Factory$Impl;
        this.familyProfileManager = realFamilyProfileManager;
        this.balanceSnapshotManager = realBalanceSnapshotManager;
        this.navigator = navigator;
        this.screen = screen;
        RealActivitiesManager.MetroFactory metroFactory = realTabToolbarOutboundNavigator$Factory$Impl.delegateFactory;
        Analytics analytics = (Analytics) metroFactory.ioDispatcher.invoke();
        RealAccountInboundNavigator$Factory$Impl realAccountInboundNavigator$Factory$Impl = (RealAccountInboundNavigator$Factory$Impl) metroFactory.badger2.invoke();
        RealActivityInboundNavigator$Factory$Impl realActivityInboundNavigator$Factory$Impl = (RealActivityInboundNavigator$Factory$Impl) metroFactory.errorReporter.invoke();
        RealGlobalSearchInboundNavigator$Factory$Impl realGlobalSearchInboundNavigator$Factory$Impl = (RealGlobalSearchInboundNavigator$Factory$Impl) metroFactory.formattingPageRequestHandlerFactory.value;
        RealMoneybotInboundNavigator$Factory$Impl realMoneybotInboundNavigator$Factory$Impl = (RealMoneybotInboundNavigator$Factory$Impl) metroFactory.appService.invoke();
        RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory.defaultGetRequestHandlerFactory.invoke();
        analytics.getClass();
        realAccountInboundNavigator$Factory$Impl.getClass();
        realActivityInboundNavigator$Factory$Impl.getClass();
        realGlobalSearchInboundNavigator$Factory$Impl.getClass();
        realMoneybotInboundNavigator$Factory$Impl.getClass();
        realRouter$Factory$Impl.getClass();
        this.tabToolbarOutboundNavigator = new AssetPublicSuffixList(analytics, realAccountInboundNavigator$Factory$Impl, realActivityInboundNavigator$Factory$Impl, realGlobalSearchInboundNavigator$Factory$Impl, realMoneybotInboundNavigator$Factory$Impl, realRouter$Factory$Impl, navigator);
        RoundingMode roundingMode = RoundingMode.DOWN;
        this.moneyFormatter = factory.createAbbreviatedUpToOneFractionDigit();
    }

    public static final ValidatedAccount access$forAccountToken(TabToolbarPresenter tabToolbarPresenter, List list, String str) {
        boolean z = false;
        Object obj = null;
        for (Object obj2 : list) {
            if (((ValidatedAccount) obj2).accountId.equals(str)) {
                if (z) {
                    a$$ExternalSyntheticBUOutline0.m$3("Collection contains more than one matching element.");
                    return null;
                }
                z = true;
                obj = obj2;
            }
        }
        if (z) {
            return (ValidatedAccount) obj;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
    
        if (r9 != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$getUpdatedAccountListConfig(TabToolbarPresenter tabToolbarPresenter, ContinuationImpl continuationImpl) {
        AccountPickerPresenter$getUpdatedAccountListConfig$1 accountPickerPresenter$getUpdatedAccountListConfig$1;
        int i;
        String appTokenOrNull;
        JanusService janusService;
        if (continuationImpl instanceof AccountPickerPresenter$getUpdatedAccountListConfig$1) {
            accountPickerPresenter$getUpdatedAccountListConfig$1 = (AccountPickerPresenter$getUpdatedAccountListConfig$1) continuationImpl;
            int i2 = accountPickerPresenter$getUpdatedAccountListConfig$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                accountPickerPresenter$getUpdatedAccountListConfig$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = accountPickerPresenter$getUpdatedAccountListConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountPickerPresenter$getUpdatedAccountListConfig$1.label;
                String str = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    JanusService janusService2 = (JanusService) tabToolbarPresenter.moneybotAnalyticsService;
                    appTokenOrNull = PlatformKt.appTokenOrNull((SessionManager) tabToolbarPresenter.sessionManager);
                    if (appTokenOrNull == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                        return null;
                    }
                    RealBackupService realBackupService = (RealBackupService) tabToolbarPresenter.familyNavigatorFactory;
                    accountPickerPresenter$getUpdatedAccountListConfig$1.L$0 = janusService2;
                    accountPickerPresenter$getUpdatedAccountListConfig$1.L$1 = appTokenOrNull;
                    accountPickerPresenter$getUpdatedAccountListConfig$1.label = 1;
                    Object readBackupTag = realBackupService.readBackupTag(accountPickerPresenter$getUpdatedAccountListConfig$1);
                    if (readBackupTag != coroutineSingletons) {
                        janusService = janusService2;
                        obj = readBackupTag;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    ApiResult apiResult = (ApiResult) obj;
                    if (!(apiResult instanceof ApiResult.Success)) {
                        if (!(apiResult instanceof ApiResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        ((BetterNavigator.ScreenNavigator) tabToolbarPresenter.badges).goTo(new FailureMessageBlockerScreen(createBlockersData$default(tabToolbarPresenter, ClientScenario.ONBOARDING, null, 6), TextUtilsCompat.errorMessaging((AndroidStringManager) tabToolbarPresenter.moneybotFlagsHelper, (ApiResult.Failure) apiResult, null).message, str, 4));
                        return null;
                    }
                    AccountListConfig accountListConfig = ((GetLinkedAccountsResponse) ((ApiResult.Success) apiResult).response).account_list_config;
                    if (accountListConfig == null) {
                        reportMissingField$default(tabToolbarPresenter, "GetLinkedAccountsResponse", "account_list_config", null, 12);
                        return null;
                    }
                    ValidatedAccountList validatedAccountList = zzaey.toValidatedAccountList(tabToolbarPresenter, accountListConfig);
                    if (validatedAccountList == null) {
                        tabToolbarPresenter.navigateToFailureScreen(null, null);
                        return null;
                    }
                    ((BooleanPreference) tabToolbarPresenter.balanceSnapshotManager).set(false);
                    ((Analytics) tabToolbarPresenter.familyProfileManager).track(new AccountReturningLoginAccountListLoaded(validatedAccountList.accounts.size()), null);
                    return validatedAccountList;
                }
                appTokenOrNull = accountPickerPresenter$getUpdatedAccountListConfig$1.L$1;
                janusService = accountPickerPresenter$getUpdatedAccountListConfig$1.L$0;
                SafeTrace.throwOnFailure(obj);
                GetLinkedAccountsRequest getLinkedAccountsRequest = new GetLinkedAccountsRequest(appTokenOrNull, (String) obj);
                accountPickerPresenter$getUpdatedAccountListConfig$1.L$0 = null;
                accountPickerPresenter$getUpdatedAccountListConfig$1.L$1 = null;
                accountPickerPresenter$getUpdatedAccountListConfig$1.label = 2;
                obj = janusService.getLinkedAccounts(getLinkedAccountsRequest, accountPickerPresenter$getUpdatedAccountListConfig$1);
            }
        }
        accountPickerPresenter$getUpdatedAccountListConfig$1 = new AccountPickerPresenter$getUpdatedAccountListConfig$1(tabToolbarPresenter, continuationImpl);
        Object obj2 = accountPickerPresenter$getUpdatedAccountListConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountPickerPresenter$getUpdatedAccountListConfig$1.label;
        String str2 = null;
        if (i != 0) {
        }
        GetLinkedAccountsRequest getLinkedAccountsRequest2 = new GetLinkedAccountsRequest(appTokenOrNull, (String) obj2);
        accountPickerPresenter$getUpdatedAccountListConfig$1.L$0 = null;
        accountPickerPresenter$getUpdatedAccountListConfig$1.L$1 = null;
        accountPickerPresenter$getUpdatedAccountListConfig$1.label = 2;
        obj2 = janusService.getLinkedAccounts(getLinkedAccountsRequest2, accountPickerPresenter$getUpdatedAccountListConfig$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$removeAccount(TabToolbarPresenter tabToolbarPresenter, String str, ContinuationImpl continuationImpl) {
        AccountPickerPresenter$removeAccount$1 accountPickerPresenter$removeAccount$1;
        int i;
        ApiResult apiResult;
        ValidatedAccountList validatedAccountList;
        if (continuationImpl instanceof AccountPickerPresenter$removeAccount$1) {
            accountPickerPresenter$removeAccount$1 = (AccountPickerPresenter$removeAccount$1) continuationImpl;
            int i2 = accountPickerPresenter$removeAccount$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                accountPickerPresenter$removeAccount$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = accountPickerPresenter$removeAccount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountPickerPresenter$removeAccount$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ReturningCustomerLoginFlowService returningCustomerLoginFlowService = (ReturningCustomerLoginFlowService) tabToolbarPresenter.sessionFlags;
                    RemoveAccountRequest removeAccountRequest = new RemoveAccountRequest(str, ByteString.EMPTY);
                    accountPickerPresenter$removeAccount$1.label = 1;
                    obj = returningCustomerLoginFlowService.removeAccount(removeAccountRequest, accountPickerPresenter$removeAccount$1);
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
                    RemoveAccountResponse removeAccountResponse = (RemoveAccountResponse) ((ApiResult.Success) apiResult).response;
                    AccountListConfig accountListConfig = removeAccountResponse.account_list_config;
                    if (accountListConfig != null && (validatedAccountList = zzaey.toValidatedAccountList(tabToolbarPresenter, accountListConfig)) != null) {
                        return validatedAccountList;
                    }
                    if (removeAccountResponse.account_list_config == null) {
                        reportMissingField$default(tabToolbarPresenter, "RemoveAccountResponse", "account_list_config", null, 8);
                        return null;
                    }
                } else if (!(apiResult instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return null;
            }
        }
        accountPickerPresenter$removeAccount$1 = new AccountPickerPresenter$removeAccount$1(tabToolbarPresenter, continuationImpl);
        Object obj2 = accountPickerPresenter$removeAccount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountPickerPresenter$removeAccount$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        if (r1 != r4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0062, code lost:
    
        if (r1 == r4) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$skipAccountSelection(TabToolbarPresenter tabToolbarPresenter, ContinuationImpl continuationImpl) {
        AccountPickerPresenter$skipAccountSelection$1 accountPickerPresenter$skipAccountSelection$1;
        int i;
        OffersHomeV2Kt$$ExternalSyntheticLambda7 offersHomeV2Kt$$ExternalSyntheticLambda7;
        Screen screen;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) tabToolbarPresenter.badges;
        if (continuationImpl instanceof AccountPickerPresenter$skipAccountSelection$1) {
            accountPickerPresenter$skipAccountSelection$1 = (AccountPickerPresenter$skipAccountSelection$1) continuationImpl;
            int i2 = accountPickerPresenter$skipAccountSelection$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                accountPickerPresenter$skipAccountSelection$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = accountPickerPresenter$skipAccountSelection$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountPickerPresenter$skipAccountSelection$1.label;
                String str = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ((Analytics) tabToolbarPresenter.familyProfileManager).track(new AccountReturningLoginSkipAccountSelection(), null);
                    RealBackupService realBackupService = (RealBackupService) tabToolbarPresenter.familyNavigatorFactory;
                    accountPickerPresenter$skipAccountSelection$1.label = 1;
                    obj = realBackupService.readBackupTag(accountPickerPresenter$skipAccountSelection$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            screenNavigator = accountPickerPresenter$skipAccountSelection$1.L$6;
                            offersHomeV2Kt$$ExternalSyntheticLambda7 = accountPickerPresenter$skipAccountSelection$1.L$5;
                            SafeTrace.throwOnFailure(obj);
                            screen = (Screen) obj;
                            if (screen == null) {
                                screen = (Screen) offersHomeV2Kt$$ExternalSyntheticLambda7.invoke();
                            }
                            screenNavigator.goTo(screen);
                            return Unit.INSTANCE;
                        }
                        SafeTrace.throwOnFailure(obj);
                        ApiResult apiResult = (ApiResult) obj;
                        BlockersData createBlockersData$default = createBlockersData$default(tabToolbarPresenter, ClientScenario.ONBOARDING, null, 6);
                        int i3 = 4;
                        if (!(apiResult instanceof ApiResult.Success)) {
                            if (apiResult instanceof ApiResult.Failure) {
                                screenNavigator.goTo(new FailureMessageBlockerScreen(createBlockersData$default, TextUtilsCompat.errorMessaging((AndroidStringManager) tabToolbarPresenter.moneybotFlagsHelper, (ApiResult.Failure) apiResult, null).message, str, i3));
                                return Unit.INSTANCE;
                            }
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        ResponseContext responseContext = ((GetLoginScenarioPlanResponse) ((ApiResult.Success) apiResult).response).response_context;
                        if (responseContext == null) {
                            reportMissingField$default(tabToolbarPresenter, "GetLoginScenarioPlanResponse", "response_context", createBlockersData$default, 4);
                            return Unit.INSTANCE;
                        }
                        ((BooleanPreference) tabToolbarPresenter.balanceSnapshotManager).set(true);
                        OffersHomeV2Kt$$ExternalSyntheticLambda7 offersHomeV2Kt$$ExternalSyntheticLambda72 = new OffersHomeV2Kt$$ExternalSyntheticLambda7(8, tabToolbarPresenter, createBlockersData$default.updateFromResponseContext(responseContext, false));
                        RealPreSignInScreenLoader realPreSignInScreenLoader = (RealPreSignInScreenLoader) tabToolbarPresenter.navigator;
                        accountPickerPresenter$skipAccountSelection$1.L$5 = offersHomeV2Kt$$ExternalSyntheticLambda72;
                        accountPickerPresenter$skipAccountSelection$1.L$6 = screenNavigator;
                        accountPickerPresenter$skipAccountSelection$1.label = 3;
                        obj = realPreSignInScreenLoader.loadPreSignInScreen(offersHomeV2Kt$$ExternalSyntheticLambda72, false, false, accountPickerPresenter$skipAccountSelection$1);
                        if (obj != coroutineSingletons) {
                            offersHomeV2Kt$$ExternalSyntheticLambda7 = offersHomeV2Kt$$ExternalSyntheticLambda72;
                            screen = (Screen) obj;
                            if (screen == null) {
                            }
                            screenNavigator.goTo(screen);
                            return Unit.INSTANCE;
                        }
                        return coroutineSingletons;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ReturningCustomerLoginFlowService returningCustomerLoginFlowService = (ReturningCustomerLoginFlowService) tabToolbarPresenter.sessionFlags;
                ClientScenario clientScenario = ClientScenario.ONBOARDING;
                BlockersData.Flow.INSTANCE.getClass();
                String generateToken = BlockersData.Flow.Companion.generateToken();
                GetLoginScenarioPlanRequest getLoginScenarioPlanRequest = new GetLoginScenarioPlanRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), (String) obj, ByteString.EMPTY);
                accountPickerPresenter$skipAccountSelection$1.label = 2;
                obj = returningCustomerLoginFlowService.getLoginScenarioPlan(clientScenario, generateToken, getLoginScenarioPlanRequest, accountPickerPresenter$skipAccountSelection$1);
            }
        }
        accountPickerPresenter$skipAccountSelection$1 = new AccountPickerPresenter$skipAccountSelection$1(tabToolbarPresenter, continuationImpl);
        Object obj2 = accountPickerPresenter$skipAccountSelection$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountPickerPresenter$skipAccountSelection$1.label;
        String str2 = null;
        if (i != 0) {
        }
        ReturningCustomerLoginFlowService returningCustomerLoginFlowService2 = (ReturningCustomerLoginFlowService) tabToolbarPresenter.sessionFlags;
        ClientScenario clientScenario2 = ClientScenario.ONBOARDING;
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken2 = BlockersData.Flow.Companion.generateToken();
        GetLoginScenarioPlanRequest getLoginScenarioPlanRequest2 = new GetLoginScenarioPlanRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), (String) obj2, ByteString.EMPTY);
        accountPickerPresenter$skipAccountSelection$1.label = 2;
        obj2 = returningCustomerLoginFlowService2.getLoginScenarioPlan(clientScenario2, generateToken2, getLoginScenarioPlanRequest2, accountPickerPresenter$skipAccountSelection$1);
    }

    public static BlockersData createBlockersData$default(TabToolbarPresenter tabToolbarPresenter, ClientScenario clientScenario, String str, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        return FlowStarter.startFlow$default((FlowStarter) tabToolbarPresenter.badgingStateAccessibilityHelper, BlockersData.Flow.ONBOARDING, (OnboardingAccountPickerScreen) tabToolbarPresenter.profileManager, null, clientScenario, str, null, null, null, new OffersStyledTextKt$$ExternalSyntheticLambda0(18), 468);
    }

    public static boolean isMainTab(Screen screen) {
        return (screen instanceof PaymentScreens$HomeScreens$PaymentPad) || (screen instanceof MoneyTabScreen) || (screen instanceof ActivityScreen) || (screen instanceof LocalTabScreen);
    }

    public static void reportMissingField$default(TabToolbarPresenter tabToolbarPresenter, String str, String str2, BlockersData blockersData, int i) {
        boolean z = (i & 4) != 0;
        if ((i & 8) != 0) {
            blockersData = null;
        }
        AccountPickerProtoParsingError accountPickerProtoParsingError = new AccountPickerProtoParsingError(str, ProtoParsingError.ErrorType.REQUIRED_FIELD_MISSING, str2, null, "AccountPicker");
        ((ErrorReporter) tabToolbarPresenter.tabToolbarOutboundNavigator).report(accountPickerProtoParsingError, (SampleStrategy) tabToolbarPresenter.moneyFormatter);
        if (z) {
            tabToolbarPresenter.navigateToFailureScreen(accountPickerProtoParsingError, blockersData);
        }
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public ErrorReporter getErrorReporter() {
        return (ErrorReporter) this.tabToolbarOutboundNavigator;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public SampleStrategy getOneErrorPerAppSessionStrategy() {
        return (SampleStrategy) this.moneyFormatter;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object handleAliasFlow(ValidatedAccount validatedAccount, ContinuationImpl continuationImpl) {
        AccountPickerPresenter$handleAliasFlow$1 accountPickerPresenter$handleAliasFlow$1;
        int i;
        UiAlias.Type type2;
        ClientScenario clientScenario;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) this.badges;
        if (continuationImpl instanceof AccountPickerPresenter$handleAliasFlow$1) {
            accountPickerPresenter$handleAliasFlow$1 = (AccountPickerPresenter$handleAliasFlow$1) continuationImpl;
            int i2 = accountPickerPresenter$handleAliasFlow$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                accountPickerPresenter$handleAliasFlow$1.label = i2 - PKIFailureInfo.systemUnavail;
                AccountPickerPresenter$handleAliasFlow$1 accountPickerPresenter$handleAliasFlow$12 = accountPickerPresenter$handleAliasFlow$1;
                Object obj = accountPickerPresenter$handleAliasFlow$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountPickerPresenter$handleAliasFlow$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ClientScenario clientScenario2 = validatedAccount.clientScenario;
                    UiAlias uiAlias = validatedAccount.preferredAlias;
                    if (uiAlias == null || uiAlias.canonical_text == null || !((type2 = uiAlias.f1363type) == UiAlias.Type.EMAIL || type2 == UiAlias.Type.SMS)) {
                        if (uiAlias != null) {
                            Pair pair = uiAlias.canonical_text == null ? new Pair(ProtoParsingError.ErrorType.REQUIRED_FIELD_MISSING, "preferred_alias.canonical_text") : new Pair(ProtoParsingError.ErrorType.UNSUPPORTED_ENUM_VALUE, "preferred_alias.type");
                            ((ErrorReporter) this.tabToolbarOutboundNavigator).report(new AccountPickerProtoParsingError("AccountListConfig.Account", (ProtoParsingError.ErrorType) pair.first, (String) pair.second, null, "AccountPicker"), (SampleStrategy) this.moneyFormatter);
                        }
                        screenNavigator.goTo(new OnboardingAliasPickerScreen(validatedAccount.proto, clientScenario2));
                        return Unit.INSTANCE;
                    }
                    RealSelectedAliasRegistrar realSelectedAliasRegistrar = (RealSelectedAliasRegistrar) this.featureFlagManager;
                    String str = validatedAccount.accountId;
                    OnboardingAccountPickerScreen onboardingAccountPickerScreen = (OnboardingAccountPickerScreen) this.profileManager;
                    accountPickerPresenter$handleAliasFlow$12.L$0 = validatedAccount;
                    accountPickerPresenter$handleAliasFlow$12.L$1 = clientScenario2;
                    accountPickerPresenter$handleAliasFlow$12.label = 1;
                    obj = realSelectedAliasRegistrar.registerSelectedAlias(uiAlias, str, clientScenario2, onboardingAccountPickerScreen, accountPickerPresenter$handleAliasFlow$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    clientScenario = clientScenario2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    clientScenario = accountPickerPresenter$handleAliasFlow$12.L$1;
                    validatedAccount = accountPickerPresenter$handleAliasFlow$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                Screen screen = (Screen) obj;
                if (validatedAccount.aliases.size() > 1) {
                    screenNavigator.goTo(new OnboardingAliasPickerScreen(validatedAccount.proto, clientScenario));
                }
                screenNavigator.goTo(screen);
                return Unit.INSTANCE;
            }
        }
        accountPickerPresenter$handleAliasFlow$1 = new AccountPickerPresenter$handleAliasFlow$1(this, continuationImpl);
        AccountPickerPresenter$handleAliasFlow$1 accountPickerPresenter$handleAliasFlow$122 = accountPickerPresenter$handleAliasFlow$1;
        Object obj2 = accountPickerPresenter$handleAliasFlow$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountPickerPresenter$handleAliasFlow$122.label;
        if (i != 0) {
        }
        Screen screen2 = (Screen) obj2;
        if (validatedAccount.aliases.size() > 1) {
        }
        screenNavigator.goTo(screen2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b3, code lost:
    
        if (handleAliasFlow(r11, r0) != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b5, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        if (r3 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object handlePasskeyFlow(ValidatedAccount validatedAccount, ContinuationImpl continuationImpl) {
        AccountPickerPresenter$handlePasskeyFlow$1 accountPickerPresenter$handlePasskeyFlow$1;
        int i;
        ClientScenario clientScenario;
        String generateToken;
        Object authenticateWithPasskey;
        PasskeyRepository$PasskeyAuthenticationResult passkeyRepository$PasskeyAuthenticationResult;
        if (continuationImpl instanceof AccountPickerPresenter$handlePasskeyFlow$1) {
            accountPickerPresenter$handlePasskeyFlow$1 = (AccountPickerPresenter$handlePasskeyFlow$1) continuationImpl;
            int i2 = accountPickerPresenter$handlePasskeyFlow$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                accountPickerPresenter$handlePasskeyFlow$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = accountPickerPresenter$handlePasskeyFlow$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountPickerPresenter$handlePasskeyFlow$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    clientScenario = validatedAccount.clientScenario;
                    BlockersData.Flow.INSTANCE.getClass();
                    generateToken = BlockersData.Flow.Companion.generateToken();
                    RealPasskeyRepository realPasskeyRepository = (RealPasskeyRepository) this.syncValueReader;
                    PasskeyRepository$LoginIdentifier.AccountToken accountToken = new PasskeyRepository$LoginIdentifier.AccountToken(validatedAccount.accountId);
                    accountPickerPresenter$handlePasskeyFlow$1.L$0 = validatedAccount;
                    accountPickerPresenter$handlePasskeyFlow$1.L$1 = clientScenario;
                    accountPickerPresenter$handlePasskeyFlow$1.L$2 = generateToken;
                    accountPickerPresenter$handlePasskeyFlow$1.label = 1;
                    authenticateWithPasskey = realPasskeyRepository.authenticateWithPasskey(accountToken, clientScenario, generateToken, accountPickerPresenter$handlePasskeyFlow$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str = accountPickerPresenter$handlePasskeyFlow$1.L$2;
                    clientScenario = accountPickerPresenter$handlePasskeyFlow$1.L$1;
                    ValidatedAccount validatedAccount2 = accountPickerPresenter$handlePasskeyFlow$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    generateToken = str;
                    validatedAccount = validatedAccount2;
                    authenticateWithPasskey = obj;
                }
                passkeyRepository$PasskeyAuthenticationResult = (PasskeyRepository$PasskeyAuthenticationResult) authenticateWithPasskey;
                if (Intrinsics.areEqual(passkeyRepository$PasskeyAuthenticationResult, PasskeyRepository$PasskeyAuthenticationResult.Error.INSTANCE) && !Intrinsics.areEqual(passkeyRepository$PasskeyAuthenticationResult, PasskeyRepository$PasskeyAuthenticationResult.NoCredentials.INSTANCE)) {
                    if (!(passkeyRepository$PasskeyAuthenticationResult instanceof PasskeyRepository$PasskeyAuthenticationResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((BetterNavigator.ScreenNavigator) this.badges).goTo(((BlockersDataNavigator) this.badger2).getNext((OnboardingAccountPickerScreen) this.profileManager, createBlockersData$default(this, clientScenario, generateToken, 4).updateFromResponseContext(((PasskeyRepository$PasskeyAuthenticationResult.Success) passkeyRepository$PasskeyAuthenticationResult).responseContext, false)));
                    return Unit.INSTANCE;
                }
                accountPickerPresenter$handlePasskeyFlow$1.L$0 = null;
                accountPickerPresenter$handlePasskeyFlow$1.L$1 = null;
                accountPickerPresenter$handlePasskeyFlow$1.L$2 = null;
                accountPickerPresenter$handlePasskeyFlow$1.label = 2;
            }
        }
        accountPickerPresenter$handlePasskeyFlow$1 = new AccountPickerPresenter$handlePasskeyFlow$1(this, continuationImpl);
        Object obj3 = accountPickerPresenter$handlePasskeyFlow$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountPickerPresenter$handlePasskeyFlow$1.label;
        if (i != 0) {
        }
        passkeyRepository$PasskeyAuthenticationResult = (PasskeyRepository$PasskeyAuthenticationResult) authenticateWithPasskey;
        if (Intrinsics.areEqual(passkeyRepository$PasskeyAuthenticationResult, PasskeyRepository$PasskeyAuthenticationResult.Error.INSTANCE)) {
        }
        accountPickerPresenter$handlePasskeyFlow$1.L$0 = null;
        accountPickerPresenter$handlePasskeyFlow$1.L$1 = null;
        accountPickerPresenter$handlePasskeyFlow$1.L$2 = null;
        accountPickerPresenter$handlePasskeyFlow$1.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0396, code lost:
    
        if (r12.equals("force_off") != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0398, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03a3, code lost:
    
        if (r12.equals("force_on") != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03f5, code lost:
    
        if (r9 != false) goto L122;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TabToolbarInternalViewModel models(Flow flow, Composer composer, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        TabToolbarInternalViewModel.ImageButton imageButton;
        int i2;
        TabToolbarPresenter tabToolbarPresenter;
        boolean z4;
        String str;
        boolean z5;
        FullCashtag fullCashtag;
        FullCashtag fullCashtag2;
        boolean z6;
        TabToolbarInternalViewModel.ToolbarButton toolbarButton;
        TabToolbarInternalViewModel.ProfileButton.Monogram monogram;
        TabToolbarBadgeViewModel$Text tabToolbarBadgeViewModel$Text;
        TabToolbarInternalViewModel.ProfileButton profileButton;
        String valueOf;
        Object obj;
        MoneybotFlagsHelper moneybotFlagsHelper = (MoneybotFlagsHelper) this.moneybotFlagsHelper;
        RealProfileManager realProfileManager = (RealProfileManager) this.profileManager;
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) this.featureFlagManager;
        Screen screen = (Screen) this.screen;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1584307812);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = (Flow) this.badges;
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            FlowExtensionsKt$combine$$inlined$combine$1 flowExtensionsKt$combine$$inlined$combine$1 = new FlowExtensionsKt$combine$$inlined$combine$1(9, ((RealBadger2) ((Badger2) this.badger2)).countFor("PROFILE"), this);
            gapComposer.updateRememberedValue(flowExtensionsKt$combine$$inlined$combine$1);
            rememberedValue2 = flowExtensionsKt$combine$$inlined$combine$1;
        }
        long j = 0;
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue2, 0L, null, gapComposer, 48, 2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = realProfileManager.profile();
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue3, null, null, gapComposer, 48, 2);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = realProfileManager.publicProfile();
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue4, null, null, gapComposer, 48, 2);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = ((RealP2pSettingsManager) this.p2pSettingsManager).select();
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue5, null, null, gapComposer, 48, 2);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == neverEqualPolicy) {
            RealRecipientRepository$suggestions$$inlined$map$1 realRecipientRepository$suggestions$$inlined$map$1 = new RealRecipientRepository$suggestions$$inlined$map$1(((SessionManager) this.sessionManager).getSessionState(), 27);
            gapComposer.updateRememberedValue(realRecipientRepository$suggestions$$inlined$map$1);
            rememberedValue6 = realRecipientRepository$suggestions$$inlined$map$1;
        }
        Boolean bool = Boolean.FALSE;
        MutableState collectAsState6 = Updater.collectAsState((Flow) rememberedValue6, bool, null, gapComposer, 48, 2);
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == neverEqualPolicy) {
            rememberedValue7 = ((RealFamilyProfileManager) this.familyProfileManager).familyProfile;
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        MutableState collectAsState7 = Updater.collectAsState((StateFlow) rememberedValue7, null, gapComposer, 1);
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (rememberedValue8 == neverEqualPolicy) {
            rememberedValue8 = Boolean.valueOf(((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$AndroidDestinationRouting.INSTANCE)).enabled());
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        boolean booleanValue = ((Boolean) rememberedValue8).booleanValue();
        Object rememberedValue9 = gapComposer.rememberedValue();
        int i3 = 23;
        if (rememberedValue9 == neverEqualPolicy) {
            rememberedValue9 = StateFlowKt.mapState(Trace.valuesStateExperiment(featureFlagManager, AmplitudeExperiments$MobileSurfacesKeypadQrToProfile.INSTANCE), new TabToolbarsKt$$ExternalSyntheticLambda28(i3));
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        MutableState collectAsState8 = Updater.collectAsState((StateFlow) rememberedValue9, null, gapComposer, 1);
        boolean changed = gapComposer.changed((FamilyProfile) collectAsState7.getValue());
        Object rememberedValue10 = gapComposer.rememberedValue();
        boolean z7 = false;
        if (changed || rememberedValue10 == neverEqualPolicy) {
            FamilyProfile familyProfile = (FamilyProfile) collectAsState7.getValue();
            if (!(screen instanceof MoneybotAutomationsScreen)) {
                boolean z8 = familyProfile instanceof FamilyProfile.ManagedAccount;
                if (!(screen instanceof OffersScreen$OffersHomeScreen) && !z8) {
                    z = false;
                    rememberedValue10 = Boolean.valueOf(z);
                    gapComposer.updateRememberedValue(rememberedValue10);
                }
            }
            z = true;
            rememberedValue10 = Boolean.valueOf(z);
            gapComposer.updateRememberedValue(rememberedValue10);
        }
        boolean booleanValue2 = ((Boolean) rememberedValue10).booleanValue();
        boolean changed2 = gapComposer.changed((FamilyProfile) collectAsState7.getValue()) | gapComposer.changed(booleanValue2);
        Object rememberedValue11 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue11 == neverEqualPolicy) {
            rememberedValue11 = ((((FamilyProfile) collectAsState7.getValue()) instanceof FamilyProfile.ManagedAccount) && (screen instanceof MoneyTabScreen)) ? TabToolbarInternalViewModel.StartButtonType.BACK : screen instanceof MoneybotAutomationsScreen ? TabToolbarInternalViewModel.StartButtonType.BACK : booleanValue2 ? TabToolbarInternalViewModel.StartButtonType.CLOSE : TabToolbarInternalViewModel.StartButtonType.NONE;
            gapComposer.updateRememberedValue(rememberedValue11);
        }
        TabToolbarInternalViewModel.StartButtonType startButtonType = (TabToolbarInternalViewModel.StartButtonType) rememberedValue11;
        Object rememberedValue12 = gapComposer.rememberedValue();
        if (rememberedValue12 == neverEqualPolicy) {
            rememberedValue12 = ((RealSessionFlags) this.sessionFlags).showModernTabs;
            gapComposer.updateRememberedValue(rememberedValue12);
        }
        if (((Boolean) Updater.collectAsState((StateFlow) rememberedValue12, null, gapComposer, 1).getValue()).booleanValue()) {
            gapComposer.startReplaceGroup(720272046);
            gapComposer.end(false);
            z3 = booleanValue2;
            z2 = false;
        } else {
            gapComposer.startReplaceGroup(720388606);
            Object rememberedValue13 = gapComposer.rememberedValue();
            if (rememberedValue13 == neverEqualPolicy) {
                rememberedValue13 = moneybotFlagsHelper.moneybotEnabled();
                gapComposer.updateRememberedValue(rememberedValue13);
            }
            z2 = false;
            z3 = booleanValue2;
            z7 = ((Boolean) Updater.collectAsState((Flow) rememberedValue13, bool, null, gapComposer, 48, 2).getValue()).booleanValue();
            gapComposer.end(false);
        }
        Object rememberedValue14 = gapComposer.rememberedValue();
        if (rememberedValue14 == neverEqualPolicy) {
            rememberedValue14 = moneybotFlagsHelper.moneybotHomeEnabled();
            gapComposer.updateRememberedValue(rememberedValue14);
        }
        boolean z9 = z7;
        boolean booleanValue3 = ((Boolean) Updater.collectAsState((Flow) rememberedValue14, bool, null, gapComposer, 48, 2).getValue()).booleanValue();
        Updater.LaunchedEffect(gapComposer, flow, new RealPayDataLoader$fetchData$1(flow, (Continuation) null, this, booleanValue, collectAsState7));
        boolean changed3 = gapComposer.changed(z9) | gapComposer.changed(booleanValue3) | gapComposer.changed(screen);
        Object rememberedValue15 = gapComposer.rememberedValue();
        if (changed3 || rememberedValue15 == neverEqualPolicy) {
            if ((z9 || booleanValue3) && isMainTab(screen)) {
                TabToolbarInternalViewModel.ToolbarButton.Id id = TabToolbarInternalViewModel.ToolbarButton.Id.Moneybot;
                if (booleanValue3) {
                    zzd zzdVar = Icons.Companion;
                    i2 = R.drawable.icon_navigation_moneybot_alt_right;
                } else {
                    i2 = R.drawable.core_tab_payment_generic;
                }
                imageButton = new TabToolbarInternalViewModel.ImageButton(id, i2, booleanValue3 ? TabToolbarInternalViewModel.ButtonBackgroundType.TRANSPARENT : TabToolbarInternalViewModel.ButtonBackgroundType.NONE, 12);
            } else {
                imageButton = null;
            }
            gapComposer.updateRememberedValue(imageButton);
            rememberedValue15 = imageButton;
        }
        TabToolbarInternalViewModel.ImageButton imageButton2 = (TabToolbarInternalViewModel.ImageButton) rememberedValue15;
        if (((BadgingState) collectAsState.getValue()) == null || ((PublicProfile) collectAsState4.getValue()) == null || ((Boolean) collectAsState6.getValue()).booleanValue()) {
            TabToolbarInternalViewModel copy$default = TabToolbarInternalViewModel.copy$default(TabToolbarInternalViewModel.EMPTY, null, null, imageButton2, 23);
            gapComposer.end(false);
            return copy$default;
        }
        boolean z10 = z3;
        boolean changed4 = gapComposer.changed(z10);
        Object rememberedValue16 = gapComposer.rememberedValue();
        if (changed4 || rememberedValue16 == neverEqualPolicy) {
            rememberedValue16 = z10 ? new StateFlowKt$stateFlowOf$1(bool) : StateFlowKt.mapState(Trace.valuesStateExperiment(featureFlagManager, AmplitudeExperiments$HideProfileAvatarBadging.INSTANCE), new TabToolbarsKt$$ExternalSyntheticLambda28(24));
            gapComposer.updateRememberedValue(rememberedValue16);
        }
        MutableState collectAsState9 = Updater.collectAsState((StateFlow) rememberedValue16, null, gapComposer, 1);
        boolean changed5 = gapComposer.changed((BadgingState) collectAsState.getValue()) | gapComposer.changed(((Number) collectAsState2.getValue()).longValue()) | gapComposer.changed(((Boolean) collectAsState9.getValue()).booleanValue());
        Object rememberedValue17 = gapComposer.rememberedValue();
        if (changed5 || rememberedValue17 == neverEqualPolicy) {
            if (!((Boolean) collectAsState9.getValue()).booleanValue()) {
                BadgingState badgingState = (BadgingState) collectAsState.getValue();
                badgingState.getClass();
                j = badgingState.linkedBanks + badgingState.limits + badgingState.identityVerification + badgingState.profileSupport + badgingState.profilePersonal + badgingState.familyAccounts + ((Number) collectAsState2.getValue()).longValue();
            }
            rememberedValue17 = Long.valueOf(j);
            gapComposer.updateRememberedValue(rememberedValue17);
        }
        long longValue = ((Number) rememberedValue17).longValue();
        boolean changed6 = gapComposer.changed((FamilyProfile) collectAsState7.getValue());
        Object rememberedValue18 = gapComposer.rememberedValue();
        if (changed6 || rememberedValue18 == neverEqualPolicy) {
            FamilyProfile familyProfile2 = (FamilyProfile) collectAsState7.getValue();
            tabToolbarPresenter = this;
            SyncValueReader syncValueReader = (SyncValueReader) tabToolbarPresenter.syncValueReader;
            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
            String str2 = ((FeatureFlag$StringAmplitudeExperiment.Value) realFeatureFlagManager.peekCurrentValue(AmplitudeExperiments$MobileLocalTabVisibility.INSTANCE)).value;
            int hashCode = str2.hashCode();
            if (hashCode != -1760914855) {
                if (hashCode != 464944051) {
                    if (hashCode == 1528363547) {
                    }
                }
                a$$ExternalSyntheticBUOutline0.m$1("AmplitudeExperiments.MobileLocalTabVisibility unknown value: ".concat(str2));
                return null;
            }
            if (str2.equals("data_driven")) {
                LocalAccount localAccount = (LocalAccount) syncValueReader.getSingleValue(AndroidSyncValueSpecs.LocalAccount).getValue();
                boolean isEmpty = ((Collection) syncValueReader.getAllValues(AndroidSyncValueSpecs.LocalCard).getValue()).isEmpty();
                boolean enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$GetNeighborhoodsTabContent.INSTANCE)).enabled();
                if (!(localAccount != null ? Intrinsics.areEqual(localAccount.show_geo_tab, Boolean.TRUE) : false) || !enabled) {
                    if (!(localAccount != null ? Intrinsics.areEqual(localAccount.show_tab, Boolean.TRUE) : false)) {
                    }
                }
                z4 = true;
            }
            a$$ExternalSyntheticBUOutline0.m$1("AmplitudeExperiments.MobileLocalTabVisibility unknown value: ".concat(str2));
            return null;
            if (Intrinsics.areEqual(familyProfile2, FamilyProfile.Standard.INSTANCE) && ((Intrinsics.areEqual(screen, PaymentScreens$HomeScreens$PaymentPad.INSTANCE) && z4) || isMainTab(screen))) {
                createListBuilder.add(new TabToolbarInternalViewModel.ImageButton(TabToolbarInternalViewModel.ToolbarButton.Id.Search, R.drawable.core_tab_discover, TabToolbarInternalViewModel.ButtonBackgroundType.TRANSPARENT, 12));
            }
            if (familyProfile2 instanceof FamilyProfile.ManagedAccount) {
                TabToolbarInternalViewModel.ToolbarButton.Id id2 = TabToolbarInternalViewModel.ToolbarButton.Id.QR;
                zzd zzdVar2 = Icons.Companion;
                str = null;
                createListBuilder.add(new TabToolbarInternalViewModel.ImageButton(id2, R.drawable.icon_qr_24, null, 28));
            } else {
                str = null;
            }
            rememberedValue18 = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
            gapComposer.updateRememberedValue(rememberedValue18);
        } else {
            tabToolbarPresenter = this;
            str = null;
        }
        List list = (List) rememberedValue18;
        boolean changed7 = gapComposer.changed(((Boolean) collectAsState8.getValue()).booleanValue()) | gapComposer.changed((PublicProfile) collectAsState4.getValue());
        Object rememberedValue19 = gapComposer.rememberedValue();
        if (changed7 || rememberedValue19 == neverEqualPolicy) {
            if (((Boolean) collectAsState8.getValue()).booleanValue() && isMainTab(screen)) {
                PublicProfile publicProfile = (PublicProfile) collectAsState4.getValue();
                String str3 = (publicProfile == null || (fullCashtag2 = publicProfile.fullCashtag) == null) ? str : fullCashtag2.cashtag_qr_image_url;
                if (str3 != null && str3.length() != 0) {
                    PublicProfile publicProfile2 = (PublicProfile) collectAsState4.getValue();
                    String str4 = (publicProfile2 == null || (fullCashtag = publicProfile2.fullCashtag) == null) ? str : fullCashtag.printable_cashtag_qr_image_url;
                    if (str4 != null && str4.length() != 0) {
                        z5 = true;
                        rememberedValue19 = Boolean.valueOf(z5);
                        gapComposer.updateRememberedValue(rememberedValue19);
                    }
                }
            }
            z5 = false;
            rememberedValue19 = Boolean.valueOf(z5);
            gapComposer.updateRememberedValue(rememberedValue19);
        }
        boolean booleanValue4 = ((Boolean) rememberedValue19).booleanValue();
        Object rememberedValue20 = gapComposer.rememberedValue();
        if (rememberedValue20 == neverEqualPolicy) {
            rememberedValue20 = ((RealBalanceSnapshotManager) tabToolbarPresenter.balanceSnapshotManager).select();
            gapComposer.updateRememberedValue(rememberedValue20);
        }
        String str5 = str;
        MutableState collectAsState10 = Updater.collectAsState((Flow) rememberedValue20, null, null, gapComposer, 48, 2);
        if (imageButton2 == null) {
            gapComposer.startReplaceGroup(725669208);
            boolean changed8 = gapComposer.changed((BalanceSnapshot) collectAsState10.getValue()) | gapComposer.changed(booleanValue3) | gapComposer.changed(screen);
            Object rememberedValue21 = gapComposer.rememberedValue();
            if (changed8 || rememberedValue21 == neverEqualPolicy) {
                if (!booleanValue3 || (!((screen instanceof MoneybotChatScreen) || (screen instanceof MoneybotHomeScreen)) || ((BalanceSnapshot) collectAsState10.getValue()) == null)) {
                    obj = str5;
                } else {
                    TabToolbarInternalViewModel.ToolbarButton.Id id3 = TabToolbarInternalViewModel.ToolbarButton.Id.Search;
                    MoneyFormatter moneyFormatter = (MoneyFormatter) tabToolbarPresenter.moneyFormatter;
                    BalanceSnapshot balanceSnapshot = (BalanceSnapshot) collectAsState10.getValue();
                    balanceSnapshot.getClass();
                    String format2 = moneyFormatter.format(balanceSnapshot.balance);
                    TabToolbarInternalViewModel.ButtonBackgroundType buttonBackgroundType = TabToolbarInternalViewModel.ButtonBackgroundType.NONE;
                    obj = new TabToolbarInternalViewModel.TextButton(format2);
                }
                gapComposer.updateRememberedValue(obj);
                rememberedValue21 = obj;
            }
            z6 = false;
            gapComposer.end(false);
            toolbarButton = (TabToolbarInternalViewModel.TextButton) rememberedValue21;
        } else {
            z6 = false;
            gapComposer.startReplaceGroup(2101617643);
            gapComposer.end(false);
            toolbarButton = imageButton2;
        }
        TabToolbarInternalViewModel.ToolbarButton toolbarButton2 = toolbarButton;
        if (z10) {
            profileButton = str5;
        } else {
            PublicProfile publicProfile3 = (PublicProfile) collectAsState4.getValue();
            publicProfile3.getClass();
            Character monogram2 = FillrWidget.WidgetType.AnonymousClass1.getMonogram(publicProfile3);
            if (monogram2 == null || (valueOf = String.valueOf(monogram2.charValue())) == null) {
                monogram = str5;
            } else {
                Profile profile = (Profile) collectAsState3.getValue();
                monogram = new TabToolbarInternalViewModel.ProfileButton.Monogram(valueOf, new ColorModel.Accented(ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(29, null, profile != null ? profile.profile_id : str5, null, null, null))));
            }
            PublicProfile publicProfile4 = (PublicProfile) collectAsState4.getValue();
            publicProfile4.getClass();
            String str6 = publicProfile4.photoUrl;
            P2pSettingsManager$P2pSettings p2pSettingsManager$P2pSettings = (P2pSettingsManager$P2pSettings) collectAsState5.getValue();
            boolean isRatePlanBusiness = p2pSettingsManager$P2pSettings != null ? CanvasCompatO.isRatePlanBusiness(p2pSettingsManager$P2pSettings) : z6;
            if (longValue < 1) {
                tabToolbarBadgeViewModel$Text = str5;
            } else {
                tabToolbarBadgeViewModel$Text = longValue < 10 ? new TransactorKt(String.valueOf(longValue)) { // from class: com.squareup.cash.tabs.viewmodels.TabToolbarBadgeViewModel$Text
                    public final String text;

                    {
                        r1.getClass();
                        this.text = r1;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        return (obj2 instanceof TabToolbarBadgeViewModel$Text) && Intrinsics.areEqual(this.text, ((TabToolbarBadgeViewModel$Text) obj2).text);
                    }

                    public final int hashCode() {
                        return this.text.hashCode();
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Text(text=", this.text, ")");
                    }
                } : new TransactorKt("9+") { // from class: com.squareup.cash.tabs.viewmodels.TabToolbarBadgeViewModel$Text
                    public final String text;

                    {
                        r1.getClass();
                        this.text = r1;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        return (obj2 instanceof TabToolbarBadgeViewModel$Text) && Intrinsics.areEqual(this.text, ((TabToolbarBadgeViewModel$Text) obj2).text);
                    }

                    public final int hashCode() {
                        return this.text.hashCode();
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Text(text=", this.text, ")");
                    }
                };
            }
            String str7 = ((RealBadgingStateAccessibilityHelper) tabToolbarPresenter.badgingStateAccessibilityHelper).get(longValue);
            PublicProfile publicProfile5 = (PublicProfile) collectAsState4.getValue();
            publicProfile5.getClass();
            FullCashtag fullCashtag3 = publicProfile5.fullCashtag;
            profileButton = new TabToolbarInternalViewModel.ProfileButton(str7, str6, monogram, isRatePlanBusiness, tabToolbarBadgeViewModel$Text, longValue, fullCashtag3 != null ? fullCashtag3.cashtag_display_name : str5);
        }
        TabToolbarInternalViewModel tabToolbarInternalViewModel = new TabToolbarInternalViewModel(profileButton, list, startButtonType, toolbarButton2, booleanValue4);
        gapComposer.end(z6);
        return tabToolbarInternalViewModel;
    }

    public void navigateToFailureScreen(AccountPickerProtoParsingError accountPickerProtoParsingError, BlockersData blockersData) {
        String str = null;
        if (blockersData == null) {
            blockersData = createBlockersData$default(this, ClientScenario.ONBOARDING, null, 6);
        }
        AndroidStringManager androidStringManager = (AndroidStringManager) this.moneybotFlagsHelper;
        Throwable th = accountPickerProtoParsingError;
        if (accountPickerProtoParsingError == null) {
            th = new Exception("Malformed response");
        }
        ((BetterNavigator.ScreenNavigator) this.badges).goTo(new FailureMessageBlockerScreen(blockersData, TextUtilsCompat.errorMessaging(androidStringManager, new ApiResult.Failure.NetworkFailure(th), null).message, str, 4));
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider badger2;
        public final Provider badges;
        public final Provider badgingStateAccessibilityHelper;
        public final Provider balanceSnapshotManager;
        public final Provider bitcoinCapabilityProvider;
        public final Provider familyNavigatorFactory;
        public final Provider familyProfileManager;
        public final Provider featureFlagManager;
        public final Provider moneyFormatterFactory;
        public final Provider moneybotAnalyticsService;
        public final Provider moneybotFlagsHelper;
        public final Provider p2pSettingsManager;
        public final Provider profileManager;
        public final Provider sessionFlags;
        public final Provider sessionManager;
        public final Provider syncValueReader;
        public final Object tabToolbarOutboundNavigatorFactory;

        public MetroFactory(RealBadger2.MetroFactory metroFactory, RealAppMessageManager.MetroFactory metroFactory2, RealSessionFlags.MetroFactory metroFactory3, WalletUiFactory$MetroFactory walletUiFactory$MetroFactory, LambdaProvider lambdaProvider, RealDrawerOpener$MetroFactory realDrawerOpener$MetroFactory, DoubleCheck doubleCheck, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, IntentLauncher.MetroFactory metroFactory4, DoubleCheck doubleCheck4, RealMessageSigner.MetroFactory metroFactory5, DoubleCheck doubleCheck5, DoubleCheck doubleCheck6, DoubleCheck doubleCheck7, DoubleCheck doubleCheck8) {
            this.sessionManager = metroFactory;
            this.profileManager = metroFactory2;
            this.badges = metroFactory3;
            this.badger2 = walletUiFactory$MetroFactory;
            this.moneybotFlagsHelper = lambdaProvider;
            this.featureFlagManager = realDrawerOpener$MetroFactory;
            this.moneybotAnalyticsService = doubleCheck;
            this.sessionFlags = lambdaProvider2;
            this.syncValueReader = doubleCheck2;
            this.p2pSettingsManager = doubleCheck3;
            this.bitcoinCapabilityProvider = metroFactory4;
            this.familyNavigatorFactory = doubleCheck4;
            this.badgingStateAccessibilityHelper = metroFactory5;
            this.familyProfileManager = doubleCheck5;
            this.balanceSnapshotManager = doubleCheck6;
            this.moneyFormatterFactory = doubleCheck7;
            this.tabToolbarOutboundNavigatorFactory = doubleCheck8;
        }

        public MetroFactory(RealBadger2.MetroFactory metroFactory, DoubleCheck doubleCheck, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, InstanceFactory instanceFactory5, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, DoubleCheck doubleCheck6, ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory, InstanceFactory instanceFactory6, InstanceFactory instanceFactory7, DoubleCheck doubleCheck7, LambdaProvider lambdaProvider) {
            this.sessionManager = metroFactory;
            this.profileManager = doubleCheck;
            this.badges = instanceFactory;
            this.tabToolbarOutboundNavigatorFactory = instanceFactory2;
            this.badger2 = instanceFactory3;
            this.featureFlagManager = instanceFactory4;
            this.bitcoinCapabilityProvider = doubleCheck2;
            this.badgingStateAccessibilityHelper = doubleCheck3;
            this.moneyFormatterFactory = instanceFactory5;
            this.moneybotFlagsHelper = doubleCheck4;
            this.moneybotAnalyticsService = doubleCheck5;
            this.sessionFlags = doubleCheck6;
            this.syncValueReader = arcadeModule$ProvideHapticVibratorMetroFactory;
            this.p2pSettingsManager = instanceFactory6;
            this.familyNavigatorFactory = instanceFactory7;
            this.familyProfileManager = doubleCheck7;
            this.balanceSnapshotManager = lambdaProvider;
        }

        public MetroFactory(RealContactSync.MetroFactory metroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, InstanceFactory instanceFactory, LambdaProvider lambdaProvider4, RealEarningsChartRepository$MetroFactory realEarningsChartRepository$MetroFactory, RealBrazeManager.MetroFactory metroFactory2, DoubleCheck doubleCheck3, MoneyUiFactory.MetroFactory metroFactory3, DelegateFactory delegateFactory, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, DoubleCheck doubleCheck6) {
            this.sessionManager = metroFactory;
            this.featureFlagManager = lambdaProvider;
            this.bitcoinCapabilityProvider = doubleCheck;
            this.badgingStateAccessibilityHelper = doubleCheck2;
            this.moneybotFlagsHelper = lambdaProvider2;
            this.moneybotAnalyticsService = lambdaProvider3;
            this.profileManager = musicViewFactory$MetroFactory;
            this.badges = instanceFactory;
            this.sessionFlags = lambdaProvider4;
            this.syncValueReader = realEarningsChartRepository$MetroFactory;
            this.p2pSettingsManager = metroFactory2;
            this.familyNavigatorFactory = doubleCheck3;
            this.badger2 = metroFactory3;
            this.familyProfileManager = delegateFactory;
            this.balanceSnapshotManager = doubleCheck4;
            this.moneyFormatterFactory = doubleCheck5;
            this.tabToolbarOutboundNavigatorFactory = doubleCheck6;
        }

        public MetroFactory(LambdaProvider lambdaProvider, DelegateFactory delegateFactory, Badger.MetroFactory metroFactory, DoubleCheck doubleCheck, InstanceFactory instanceFactory, DoubleCheck doubleCheck2, ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory, RealPasscodeFlowStarter.MetroFactory metroFactory2, BroadwayModule$ProvideBroadwayMetroFactory broadwayModule$ProvideBroadwayMetroFactory, DoubleCheck doubleCheck3, Provider provider, DoubleCheck doubleCheck4, MoneyUiFactory.MetroFactory metroFactory3, InstanceFactory instanceFactory2, Provider provider2, RealSessionFlags.MetroFactory metroFactory4, RealMessageSigner.MetroFactory metroFactory5) {
            this.sessionManager = lambdaProvider;
            this.profileManager = delegateFactory;
            this.badges = metroFactory;
            this.badger2 = doubleCheck;
            this.tabToolbarOutboundNavigatorFactory = instanceFactory;
            this.featureFlagManager = doubleCheck2;
            this.bitcoinCapabilityProvider = arcadeModule$ProvideHapticVibratorMetroFactory;
            this.badgingStateAccessibilityHelper = metroFactory2;
            this.moneybotFlagsHelper = broadwayModule$ProvideBroadwayMetroFactory;
            this.moneybotAnalyticsService = doubleCheck3;
            this.sessionFlags = provider;
            this.syncValueReader = doubleCheck4;
            this.p2pSettingsManager = metroFactory3;
            this.familyNavigatorFactory = instanceFactory2;
            this.familyProfileManager = provider2;
            this.balanceSnapshotManager = metroFactory4;
            this.moneyFormatterFactory = metroFactory5;
        }

        public MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, RealGlobalConfigDataSource.MetroFactory metroFactory, RealBrazeManager.MetroFactory metroFactory2, DoubleCheck doubleCheck2, AndroidFileSaver.MetroFactory metroFactory3, BroadwayModule$ProvideBroadwayMetroFactory broadwayModule$ProvideBroadwayMetroFactory, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3, RealBadger2.MetroFactory metroFactory4, LambdaProvider lambdaProvider4, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, InstanceFactory instanceFactory, LambdaProvider lambdaProvider5, InstanceFactory instanceFactory2) {
            this.bitcoinCapabilityProvider = lambdaProvider;
            this.badgingStateAccessibilityHelper = doubleCheck;
            this.sessionManager = metroFactory;
            this.profileManager = metroFactory2;
            this.moneybotFlagsHelper = doubleCheck2;
            this.moneybotAnalyticsService = metroFactory3;
            this.badges = broadwayModule$ProvideBroadwayMetroFactory;
            this.sessionFlags = lambdaProvider2;
            this.syncValueReader = lambdaProvider3;
            this.badger2 = metroFactory4;
            this.p2pSettingsManager = lambdaProvider4;
            this.familyNavigatorFactory = doubleCheck3;
            this.familyProfileManager = doubleCheck4;
            this.balanceSnapshotManager = doubleCheck5;
            this.featureFlagManager = instanceFactory;
            this.moneyFormatterFactory = lambdaProvider5;
            this.tabToolbarOutboundNavigatorFactory = instanceFactory2;
        }

        public MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DelegateFactory delegateFactory, DoubleCheck doubleCheck2, RealMessageSigner.MetroFactory metroFactory, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck3, RepeatTaskExecutor.MetroFactory metroFactory2, MoneyUiFactory.MetroFactory metroFactory3, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, RealKeyStoreProvider.MetroFactory metroFactory4, DoubleCheck doubleCheck6, LambdaProvider lambdaProvider3, RealCurrentUserSetter.MetroFactory metroFactory5, RealKeyStoreProvider.MetroFactory metroFactory6, DoubleCheck doubleCheck7) {
            this.moneybotAnalyticsService = lambdaProvider;
            this.sessionManager = doubleCheck;
            this.sessionFlags = delegateFactory;
            this.profileManager = doubleCheck2;
            this.badges = metroFactory;
            this.syncValueReader = lambdaProvider2;
            this.badger2 = doubleCheck3;
            this.featureFlagManager = metroFactory2;
            this.bitcoinCapabilityProvider = metroFactory3;
            this.p2pSettingsManager = doubleCheck4;
            this.familyNavigatorFactory = doubleCheck5;
            this.badgingStateAccessibilityHelper = metroFactory4;
            this.familyProfileManager = doubleCheck6;
            this.balanceSnapshotManager = lambdaProvider3;
            this.moneyFormatterFactory = metroFactory5;
            this.moneybotFlagsHelper = metroFactory6;
            this.tabToolbarOutboundNavigatorFactory = doubleCheck7;
        }

        public MetroFactory(Provider provider, Provider provider2, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, DoubleCheck doubleCheck, Provider provider3, Provider provider4, Provider provider5, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, Provider provider6, Provider provider7, RealCashVibrator.MetroFactory metroFactory, Provider provider8, Provider provider9, LambdaProvider lambdaProvider2, Provider provider10) {
            this.sessionManager = provider;
            this.profileManager = provider2;
            this.tabToolbarOutboundNavigatorFactory = instanceFactory;
            this.balanceSnapshotManager = instanceFactory2;
            this.badges = doubleCheck;
            this.badger2 = provider3;
            this.featureFlagManager = provider4;
            this.bitcoinCapabilityProvider = provider5;
            this.badgingStateAccessibilityHelper = doubleCheck2;
            this.moneybotFlagsHelper = lambdaProvider;
            this.moneybotAnalyticsService = provider6;
            this.sessionFlags = provider7;
            this.moneyFormatterFactory = metroFactory;
            this.syncValueReader = provider8;
            this.p2pSettingsManager = provider9;
            this.familyNavigatorFactory = lambdaProvider2;
            this.familyProfileManager = provider10;
        }

        public MetroFactory(DoubleCheck doubleCheck, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, RealTransferManager.MetroFactory metroFactory, DelegateFactory delegateFactory, RealDrawerOpener$MetroFactory realDrawerOpener$MetroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck6, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck7, RealMoneyNavigatorHelper.MetroFactory metroFactory2, InstanceFactory instanceFactory3, LambdaProvider lambdaProvider3) {
            this.featureFlagManager = doubleCheck;
            this.sessionManager = instanceFactory;
            this.profileManager = instanceFactory2;
            this.bitcoinCapabilityProvider = doubleCheck2;
            this.badgingStateAccessibilityHelper = doubleCheck3;
            this.moneybotFlagsHelper = doubleCheck4;
            this.moneybotAnalyticsService = doubleCheck5;
            this.badges = metroFactory;
            this.sessionFlags = delegateFactory;
            this.syncValueReader = realDrawerOpener$MetroFactory;
            this.p2pSettingsManager = lambdaProvider;
            this.familyNavigatorFactory = doubleCheck6;
            this.familyProfileManager = lambdaProvider2;
            this.balanceSnapshotManager = doubleCheck7;
            this.badger2 = metroFactory2;
            this.tabToolbarOutboundNavigatorFactory = instanceFactory3;
            this.moneyFormatterFactory = lambdaProvider3;
        }

        public MetroFactory(InstanceFactory instanceFactory, RealMessageSigner.MetroFactory metroFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, LambdaProvider lambdaProvider, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, InstanceFactory instanceFactory4, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, LambdaProvider lambdaProvider2, TreehouseFlows.MetroFactory metroFactory2, DoubleCheck doubleCheck5, LambdaProvider lambdaProvider3, LambdaProvider lambdaProvider4, DoubleCheck doubleCheck6) {
            this.tabToolbarOutboundNavigatorFactory = instanceFactory;
            this.sessionManager = metroFactory;
            this.profileManager = instanceFactory2;
            this.badges = instanceFactory3;
            this.badgingStateAccessibilityHelper = lambdaProvider;
            this.badger2 = musicViewFactory$MetroFactory;
            this.moneybotFlagsHelper = doubleCheck;
            this.moneybotAnalyticsService = doubleCheck2;
            this.featureFlagManager = instanceFactory4;
            this.sessionFlags = doubleCheck3;
            this.syncValueReader = doubleCheck4;
            this.p2pSettingsManager = lambdaProvider2;
            this.bitcoinCapabilityProvider = metroFactory2;
            this.familyNavigatorFactory = doubleCheck5;
            this.familyProfileManager = lambdaProvider3;
            this.balanceSnapshotManager = lambdaProvider4;
            this.moneyFormatterFactory = doubleCheck6;
        }
    }

    public TabToolbarPresenter(OnboardingAccountPickerScreen onboardingAccountPickerScreen, BetterNavigator.ScreenNavigator screenNavigator, BlockersDataNavigator blockersDataNavigator, RealSelectedAliasRegistrar realSelectedAliasRegistrar, FlowStarter flowStarter, AndroidStringManager androidStringManager, JanusService janusService, ReturningCustomerLoginFlowService returningCustomerLoginFlowService, RealPasskeyRepository realPasskeyRepository, RealPasskeyFeatureManager realPasskeyFeatureManager, RealBackupService realBackupService, Analytics analytics, BooleanPreference booleanPreference, SessionManager sessionManager, RealPreSignInScreenLoader realPreSignInScreenLoader, CoroutineContext coroutineContext, ErrorReporter errorReporter, SampleStrategy sampleStrategy) {
        onboardingAccountPickerScreen.getClass();
        this.profileManager = onboardingAccountPickerScreen;
        this.badges = screenNavigator;
        this.badger2 = blockersDataNavigator;
        this.featureFlagManager = realSelectedAliasRegistrar;
        this.badgingStateAccessibilityHelper = flowStarter;
        this.moneybotFlagsHelper = androidStringManager;
        this.moneybotAnalyticsService = janusService;
        this.sessionFlags = returningCustomerLoginFlowService;
        this.syncValueReader = realPasskeyRepository;
        this.p2pSettingsManager = realPasskeyFeatureManager;
        this.familyNavigatorFactory = realBackupService;
        this.familyProfileManager = analytics;
        this.balanceSnapshotManager = booleanPreference;
        this.sessionManager = sessionManager;
        this.navigator = realPreSignInScreenLoader;
        this.screen = coroutineContext;
        this.tabToolbarOutboundNavigator = errorReporter;
        this.moneyFormatter = sampleStrategy;
    }

    public TabToolbarPresenter(AndroidStringManager androidStringManager, FeatureFlagManager featureFlagManager, ModifiablePermissions modifiablePermissions, CoroutineContext coroutineContext, ProfileScreens.SecurityScreen securityScreen, BetterNavigator.ScreenNavigator screenNavigator, Analytics analytics, AndroidClock androidClock, FlowStarter flowStarter, SyncValueReader syncValueReader, JCAContext jCAContext, RealProfileManager realProfileManager, RealSettingsEligibilityManager realSettingsEligibilityManager, StateFlow stateFlow, RealProfilePasscodePresenter$Factory$Impl realProfilePasscodePresenter$Factory$Impl, TrustedContactSettingPresenter$Factory$Impl trustedContactSettingPresenter$Factory$Impl, RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, CashAccountDatabaseImpl cashAccountDatabaseImpl) {
        securityScreen.getClass();
        this.sessionManager = androidStringManager;
        this.featureFlagManager = featureFlagManager;
        this.badges = modifiablePermissions;
        this.badger2 = coroutineContext;
        this.badgingStateAccessibilityHelper = securityScreen;
        this.moneybotFlagsHelper = screenNavigator;
        this.moneybotAnalyticsService = analytics;
        this.sessionFlags = androidClock;
        this.p2pSettingsManager = flowStarter;
        this.syncValueReader = syncValueReader;
        this.familyNavigatorFactory = jCAContext;
        this.profileManager = realProfileManager;
        this.familyProfileManager = realSettingsEligibilityManager;
        this.balanceSnapshotManager = stateFlow;
        this.navigator = realProfilePasscodePresenter$Factory$Impl.create$1(securityScreen, screenNavigator);
        TransferInPresenter$MetroFactory transferInPresenter$MetroFactory = trustedContactSettingPresenter$Factory$Impl.delegateFactory;
        SyncValueReader syncValueReader2 = (SyncValueReader) transferInPresenter$MetroFactory.analytics.getValue();
        AndroidStringManager androidStringManager2 = (AndroidStringManager) transferInPresenter$MetroFactory.stringManager.lambda.invoke();
        TrustedContactFlowPresenter$Factory$Impl trustedContactFlowPresenter$Factory$Impl = (TrustedContactFlowPresenter$Factory$Impl) transferInPresenter$MetroFactory.moneyFormatterFactory.invoke();
        syncValueReader2.getClass();
        androidStringManager2.getClass();
        trustedContactFlowPresenter$Factory$Impl.getClass();
        this.screen = new InvestingContactPresenter(syncValueReader2, androidStringManager2, trustedContactFlowPresenter$Factory$Impl, screenNavigator, 1);
        this.tabToolbarOutboundNavigator = new RealDisclosureProvider$special$$inlined$map$1(DBUtil.mapToOneNotNull(DBUtil.toFlow(cashAccountDatabaseImpl.investingSettingsQueries.select$2()), coroutineContext), 19);
        this.moneyFormatter = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b2  */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.squareup.cash.onboarding.accountpicker.presenters.AccountPickerPresenter$AccountRemovalStatus$Requested] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        TabToolbarPresenter tabToolbarPresenter;
        MutableState mutableState2;
        Continuation continuation;
        MutableState mutableState3;
        AccountPickerViewModel accountList;
        String str;
        ?? r4;
        List list;
        AccountPickerViewModel accountPickerViewModel;
        boolean z;
        ChangePasswordViewModel.State state;
        ProfileScreens.SecurityScreen.Section section;
        ProfileSecurityViewModel.Ready.Anchor anchor;
        ProfileSecurityViewModel.Ready.Anchor anchor2;
        int i2 = this.$r8$classId;
        int i3 = 21;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation2 = null;
        int i4 = 1;
        switch (i2) {
            case 0:
                return models(flow, composer, i);
            case 1:
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-846914756);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Updater.mutableStateOf$default(null);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState4 = (MutableState) rememberedValue;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = Updater.mutableStateOf$default(null);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                MutableState mutableState5 = (MutableState) rememberedValue2;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = Updater.mutableStateOf$default(null);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                MutableState mutableState6 = (MutableState) rememberedValue3;
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                MutableState mutableState7 = (MutableState) rememberedValue4;
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                MutableState mutableState8 = (MutableState) rememberedValue5;
                Updater.LaunchedEffect(gapComposer, flow, new ZiplineLoader$load$2(flow, (Continuation) null, this, mutableState5, mutableState6, mutableState8, mutableState7, mutableState4, 23));
                boolean changedInstance = gapComposer.changedInstance(this);
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue6 == neverEqualPolicy) {
                    rememberedValue6 = new RealMRIFactory$sign$2(this, mutableState4, continuation2, i3);
                    gapComposer.updateRememberedValue(rememberedValue6);
                }
                Updater.LaunchedEffect(gapComposer, "get-updated-account-list-config", (Function2) rememberedValue6);
                String str2 = (String) mutableState5.getValue();
                ValidatedAccountList validatedAccountList = (ValidatedAccountList) mutableState4.getValue();
                if (str2 != null && validatedAccountList != null) {
                    gapComposer.startReplaceGroup(-1383927846);
                    mutableState = mutableState5;
                    Updater.LaunchedEffect(str2, validatedAccountList, new AnimationsKt$takeUntil$1$1(str2, validatedAccountList, (Continuation) null, this, mutableState5), gapComposer);
                    gapComposer.end(false);
                } else {
                    mutableState = mutableState5;
                    gapComposer.startReplaceGroup(-1383879796);
                    gapComposer.end(false);
                }
                AccountPickerPresenter$AccountRemovalStatus accountPickerPresenter$AccountRemovalStatus = (AccountPickerPresenter$AccountRemovalStatus) mutableState6.getValue();
                ValidatedAccountList validatedAccountList2 = (ValidatedAccountList) mutableState4.getValue();
                if (accountPickerPresenter$AccountRemovalStatus != null && validatedAccountList2 != null) {
                    gapComposer.startReplaceGroup(-1383927846);
                    tabToolbarPresenter = this;
                    mutableState2 = mutableState6;
                    Updater.LaunchedEffect(accountPickerPresenter$AccountRemovalStatus, validatedAccountList2, new DbSessionManager$updateDb$2(accountPickerPresenter$AccountRemovalStatus, validatedAccountList2, null, this, mutableState4, mutableState6), gapComposer);
                    gapComposer.end(false);
                } else {
                    tabToolbarPresenter = this;
                    mutableState2 = mutableState6;
                    gapComposer.startReplaceGroup(-1383879796);
                    gapComposer.end(false);
                }
                Boolean bool = (Boolean) mutableState8.getValue();
                bool.getClass();
                boolean changedInstance2 = gapComposer.changedInstance(tabToolbarPresenter);
                Object rememberedValue7 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue7 == neverEqualPolicy) {
                    continuation = null;
                    rememberedValue7 = new OverlayKt$Overlay$1$1$1$1$1(tabToolbarPresenter, mutableState8, continuation, 5);
                    gapComposer.updateRememberedValue(rememberedValue7);
                } else {
                    continuation = null;
                }
                Updater.LaunchedEffect(gapComposer, bool, (Function2) rememberedValue7);
                ValidatedAccountList validatedAccountList3 = (ValidatedAccountList) mutableState4.getValue();
                if (validatedAccountList3 != null) {
                    gapComposer.startReplaceGroup(-1106477359);
                    mutableState3 = mutableState8;
                    Updater.LaunchedEffect(gapComposer, validatedAccountList3, new MoleculeKt$immediateClockFlow$1$1$1(validatedAccountList3, (Continuation) null, tabToolbarPresenter, mutableState7, mutableState8, 20));
                    gapComposer.end(false);
                } else {
                    mutableState3 = mutableState8;
                    gapComposer.startReplaceGroup(-1106436997);
                    gapComposer.end(false);
                }
                AccountPickerPresenter$AccountRemovalStatus accountPickerPresenter$AccountRemovalStatus2 = (AccountPickerPresenter$AccountRemovalStatus) mutableState2.getValue();
                if (accountPickerPresenter$AccountRemovalStatus2 instanceof AccountPickerPresenter$AccountRemovalStatus.Success) {
                    accountPickerViewModel = AccountPickerViewModel.AccountRemoved.INSTANCE;
                } else {
                    if (accountPickerPresenter$AccountRemovalStatus2 instanceof AccountPickerPresenter$AccountRemovalStatus.Failed) {
                        accountList = new AccountPickerViewModel.AccountRemovalFailed(((AccountPickerPresenter$AccountRemovalStatus.Failed) accountPickerPresenter$AccountRemovalStatus2).accountToken);
                    } else {
                        boolean booleanValue = ((Boolean) mutableState7.getValue()).booleanValue();
                        AndroidStringManager androidStringManager = (AndroidStringManager) tabToolbarPresenter.moneybotFlagsHelper;
                        if (booleanValue) {
                            str = androidStringManager.get(R.string.account_picker_title_edit_mode);
                        } else {
                            str = androidStringManager.get(R.string.account_picker_title);
                        }
                        ValidatedAccountList validatedAccountList4 = (ValidatedAccountList) mutableState4.getValue();
                        if (validatedAccountList4 != null && (list = validatedAccountList4.accounts) != null) {
                            ?? r42 = accountPickerPresenter$AccountRemovalStatus2 instanceof AccountPickerPresenter$AccountRemovalStatus.Requested ? (AccountPickerPresenter$AccountRemovalStatus.Requested) accountPickerPresenter$AccountRemovalStatus2 : continuation;
                            Object obj = r42 != 0 ? r42.accountToken : continuation;
                            List<ValidatedAccount> list2 = list;
                            r4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                            for (ValidatedAccount validatedAccount : list2) {
                                r4.add(new AccountViewModel(validatedAccount.accountId, validatedAccount.title, validatedAccount.subtitle, StackedAvatarViewModelKt.toViewModel(validatedAccount.avatar), validatedAccount.accountId.equals(obj), validatedAccount.isBusiness));
                            }
                        } else {
                            r4 = EmptyList.INSTANCE;
                        }
                        accountList = new AccountPickerViewModel.AccountList(str, r4, ((ValidatedAccountList) mutableState4.getValue()) == null || ((Boolean) mutableState3.getValue()).booleanValue() || ((String) mutableState.getValue()) != null || (accountPickerPresenter$AccountRemovalStatus2 instanceof AccountPickerPresenter$AccountRemovalStatus.InProgress), ((Boolean) mutableState7.getValue()).booleanValue());
                    }
                    accountPickerViewModel = accountList;
                }
                gapComposer.end(false);
                return accountPickerViewModel;
            default:
                FeatureFlagManager featureFlagManager = (FeatureFlagManager) this.featureFlagManager;
                CoroutineContext coroutineContext = (CoroutineContext) this.badger2;
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(-1856065599);
                Object rememberedValue8 = gapComposer2.rememberedValue();
                if (rememberedValue8 == neverEqualPolicy) {
                    rememberedValue8 = (StateFlow) this.balanceSnapshotManager;
                    gapComposer2.updateRememberedValue(rememberedValue8);
                }
                boolean hasPasscode = ((PasscodeSettings) Updater.collectAsState((StateFlow) rememberedValue8, null, gapComposer2, 1).getValue()).getHasPasscode();
                Object rememberedValue9 = gapComposer2.rememberedValue();
                if (rememberedValue9 == neverEqualPolicy) {
                    CashQrScannerPresenter$special$$inlined$filter$1 cashQrScannerPresenter$special$$inlined$filter$1 = new CashQrScannerPresenter$special$$inlined$filter$1(FlowKt.flowOn(((RealProfileManager) this.profileManager).publicProfile(), coroutineContext), 18);
                    gapComposer2.updateRememberedValue(cashQrScannerPresenter$special$$inlined$filter$1);
                    rememberedValue9 = cashQrScannerPresenter$special$$inlined$filter$1;
                }
                MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue9, null, null, gapComposer2, 48, 2);
                Object rememberedValue10 = gapComposer2.rememberedValue();
                if (rememberedValue10 == neverEqualPolicy) {
                    rememberedValue10 = (RealDisclosureProvider$special$$inlined$map$1) this.tabToolbarOutboundNavigator;
                    gapComposer2.updateRememberedValue(rememberedValue10);
                }
                Boolean bool2 = Boolean.FALSE;
                MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue10, bool2, null, gapComposer2, 48, 2);
                boolean changedInstance3 = gapComposer2.changedInstance(this);
                Object rememberedValue11 = gapComposer2.rememberedValue();
                int i5 = 15;
                if (changedInstance3 || rememberedValue11 == neverEqualPolicy) {
                    rememberedValue11 = new RingtoneView.AnonymousClass1(this, continuation2, i5);
                    gapComposer2.updateRememberedValue(rememberedValue11);
                }
                MutableState produceState = Updater.produceState(gapComposer2, null, (Function2) rememberedValue11);
                Object rememberedValue12 = gapComposer2.rememberedValue();
                if (rememberedValue12 == neverEqualPolicy) {
                    rememberedValue12 = new CashQrScannerPresenter$special$$inlined$filter$1(FlowKt.flowOn(new SafeFlow(new SelectPaymentPlanBlockerPresenter$models$1$2(this, continuation2, i4)), coroutineContext), i3);
                    gapComposer2.updateRememberedValue(rememberedValue12);
                }
                MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue12, bool2, null, gapComposer2, 48, 2);
                Object rememberedValue13 = gapComposer2.rememberedValue();
                if (rememberedValue13 == neverEqualPolicy) {
                    rememberedValue13 = StateFlowKt.mapState(((SyncValueReader) this.syncValueReader).getSingleValue(AndroidSyncValueSpecs.PasswordInfo), new OpenSourceKt$$ExternalSyntheticLambda8(i4));
                    gapComposer2.updateRememberedValue(rememberedValue13);
                }
                MutableState collectAsState4 = Updater.collectAsState((StateFlow) rememberedValue13, null, gapComposer2, 1);
                Object rememberedValue14 = gapComposer2.rememberedValue();
                if (rememberedValue14 == neverEqualPolicy) {
                    NullStateSwipeConfigProvider nullStateSwipeConfigProvider = new NullStateSwipeConfigProvider(new CashQrScannerPresenter$special$$inlined$filter$1(flow, 19), 14);
                    gapComposer2.updateRememberedValue(nullStateSwipeConfigProvider);
                    rememberedValue14 = nullStateSwipeConfigProvider;
                }
                ProfilePasscodeSectionViewModel profilePasscodeSectionViewModel = (ProfilePasscodeSectionViewModel) ((TransfersPresenter) this.navigator).models((Flow) rememberedValue14, gapComposer2, 0);
                Object rememberedValue15 = gapComposer2.rememberedValue();
                if (rememberedValue15 == neverEqualPolicy) {
                    NullStateSwipeConfigProvider nullStateSwipeConfigProvider2 = new NullStateSwipeConfigProvider(new CashQrScannerPresenter$special$$inlined$filter$1(flow, 20), i5);
                    gapComposer2.updateRememberedValue(nullStateSwipeConfigProvider2);
                    rememberedValue15 = nullStateSwipeConfigProvider2;
                }
                TrustedContactSettingViewModel models = ((InvestingContactPresenter) this.screen).models((Flow) rememberedValue15, (Composer) gapComposer2, 0);
                Unit unit = Unit.INSTANCE;
                boolean changedInstance4 = gapComposer2.changedInstance(this);
                Object rememberedValue16 = gapComposer2.rememberedValue();
                int i6 = 3;
                if (changedInstance4 || rememberedValue16 == neverEqualPolicy) {
                    rememberedValue16 = new ProfileCropView.AnonymousClass3(this, continuation2, i6);
                    gapComposer2.updateRememberedValue(rememberedValue16);
                }
                Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue16);
                Updater.LaunchedEffect(gapComposer2, flow, new PdfPreviewPresenter$models$1$1(flow, continuation2, this, 29));
                if (((AccountSettingType$SecuritySettings) produceState.getValue()) != null && ((PublicProfile) collectAsState.getValue()) != null) {
                    AccountSettingType$SecuritySettings accountSettingType$SecuritySettings = (AccountSettingType$SecuritySettings) produceState.getValue();
                    if (accountSettingType$SecuritySettings != null) {
                        Map map = accountSettingType$SecuritySettings.cache;
                        if (((Boolean) collectAsState4.getValue()).booleanValue() && map.get(AccountSettingType$SecuritySettings.SecuritySubSetting.TAXES_PASSWORD) != null) {
                            if (!Intrinsics.areEqual(((FeatureFlag$StringFeatureFlag$Value) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$TaxesEntryPoint.INSTANCE)).value, "NONE")) {
                                z = true;
                                if (!((Boolean) collectAsState4.getValue()).booleanValue()) {
                                    state = ChangePasswordViewModel.State.ACTIVE;
                                } else {
                                    state = ChangePasswordViewModel.State.INACTIVE;
                                }
                                ProfileSecurityReadyViewModel$PasswordViewModel profileSecurityReadyViewModel$PasswordViewModel = new ProfileSecurityReadyViewModel$PasswordViewModel(z, new ChangePasswordViewModel(state));
                                ProfileSecurityReadyViewModel$AuthenticatorViewModel profileSecurityReadyViewModel$AuthenticatorViewModel = new ProfileSecurityReadyViewModel$AuthenticatorViewModel(Intrinsics.areEqual(((FeatureFlag$StringFeatureFlag$Value) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$TaxesEntryPoint.INSTANCE)).value, "NONE") && map.get(AccountSettingType$SecuritySettings.SecuritySubSetting.TAXES_AUTH_APP) != null && (((Boolean) collectAsState4.getValue()).booleanValue() || ((Boolean) collectAsState3.getValue()).booleanValue()), ((Boolean) collectAsState3.getValue()).booleanValue(), true);
                                AccountSettingType$SecuritySettings.SecuritySubSetting securitySubSetting = AccountSettingType$SecuritySettings.SecuritySubSetting.SECURITY_LOCK;
                                ProfilePasscodeSectionViewModel profilePasscodeSectionViewModel2 = map.get(securitySubSetting) == null ? profilePasscodeSectionViewModel : null;
                                ProfileSecurityViewModel.Ready.CashPinViewModel cashPinViewModel = map.get(securitySubSetting) == null ? new ProfileSecurityViewModel.Ready.CashPinViewModel(hasPasscode) : null;
                                TrustedContactSettingViewModel trustedContactSettingViewModel = (((Boolean) collectAsState2.getValue()).booleanValue() || map.get(AccountSettingType$SecuritySettings.SecuritySubSetting.INVESTING_TRUSTED_CONTACT) == null) ? null : models;
                                section = ((ProfileScreens.SecurityScreen) this.badgingStateAccessibilityHelper).focusSection;
                                if (section == null) {
                                    int ordinal = section.ordinal();
                                    if (ordinal == 0) {
                                        anchor2 = ProfileSecurityViewModel.Ready.Anchor.SECURITY;
                                    } else if (ordinal == 1) {
                                        anchor2 = ProfileSecurityViewModel.Ready.Anchor.CASHTAG;
                                    } else if (ordinal == 2) {
                                        anchor2 = ProfileSecurityViewModel.Ready.Anchor.REQUESTS;
                                    } else if (ordinal == 3) {
                                        anchor2 = ProfileSecurityViewModel.Ready.Anchor.INVESTING;
                                    } else if (ordinal == 4) {
                                        anchor2 = ProfileSecurityViewModel.Ready.Anchor.TAXES;
                                    } else {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    anchor = anchor2;
                                } else {
                                    anchor = null;
                                }
                                ProfileSecurityViewModel.Ready ready = new ProfileSecurityViewModel.Ready(profileSecurityReadyViewModel$PasswordViewModel, profileSecurityReadyViewModel$AuthenticatorViewModel, trustedContactSettingViewModel, profilePasscodeSectionViewModel2, anchor, cashPinViewModel);
                                gapComposer2.end(false);
                                return ready;
                            }
                        }
                        z = false;
                        if (!((Boolean) collectAsState4.getValue()).booleanValue()) {
                        }
                        ProfileSecurityReadyViewModel$PasswordViewModel profileSecurityReadyViewModel$PasswordViewModel2 = new ProfileSecurityReadyViewModel$PasswordViewModel(z, new ChangePasswordViewModel(state));
                        ProfileSecurityReadyViewModel$AuthenticatorViewModel profileSecurityReadyViewModel$AuthenticatorViewModel2 = new ProfileSecurityReadyViewModel$AuthenticatorViewModel(Intrinsics.areEqual(((FeatureFlag$StringFeatureFlag$Value) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$TaxesEntryPoint.INSTANCE)).value, "NONE") && map.get(AccountSettingType$SecuritySettings.SecuritySubSetting.TAXES_AUTH_APP) != null && (((Boolean) collectAsState4.getValue()).booleanValue() || ((Boolean) collectAsState3.getValue()).booleanValue()), ((Boolean) collectAsState3.getValue()).booleanValue(), true);
                        AccountSettingType$SecuritySettings.SecuritySubSetting securitySubSetting2 = AccountSettingType$SecuritySettings.SecuritySubSetting.SECURITY_LOCK;
                        if (map.get(securitySubSetting2) == null) {
                        }
                        if (map.get(securitySubSetting2) == null) {
                        }
                        if (((Boolean) collectAsState2.getValue()).booleanValue()) {
                        }
                        section = ((ProfileScreens.SecurityScreen) this.badgingStateAccessibilityHelper).focusSection;
                        if (section == null) {
                        }
                        ProfileSecurityViewModel.Ready ready2 = new ProfileSecurityViewModel.Ready(profileSecurityReadyViewModel$PasswordViewModel2, profileSecurityReadyViewModel$AuthenticatorViewModel2, trustedContactSettingViewModel, profilePasscodeSectionViewModel2, anchor, cashPinViewModel);
                        gapComposer2.end(false);
                        return ready2;
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                    return null;
                }
                gapComposer2.end(false);
                return ProfileSecurityViewModel.Loading.INSTANCE;
        }
    }
}
