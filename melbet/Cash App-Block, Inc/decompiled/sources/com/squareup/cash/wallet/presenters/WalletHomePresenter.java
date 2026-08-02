package com.squareup.cash.wallet.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.directory.data.Protos_interopKt;
import app.cash.paraphrase.FormattedResource;
import com.squareup.cash.R;
import com.squareup.cash.appmessages.overlay.RealOverlayAppMessageReader;
import com.squareup.cash.banking.real.RealDisclosureProvider;
import com.squareup.cash.blockers.navigation.FlowNavigationHelper;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.businessaccount.kybrestriction.presenters.KybRestrictionBannerPresenter$AssistedInjectionFactory$Impl;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealClientScenarioCompleter;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.filament.RealFilamentSupportProvider;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.prepurchasecashcard.backend.RealPrepurchaseToggleManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter$Factory$Impl;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.tabs.viewmodels.TabToolbarViewModel;
import com.squareup.cash.tabs.viewmodels.TabToolbarViewModel$TabToolbarTitle$TextTitle;
import com.squareup.cash.upsell.presenters.NullStateCarouselPresenter$Factory$Impl;
import com.squareup.cash.upsell.presenters.NullStateSwipeConfigProvider;
import com.squareup.cash.wallet.backend.real.RealWalletAnalyticsHelper;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.data.RealCashAppTagManager;
import com.squareup.cash.wallet.data.RealDeviceLockAnimationBus;
import com.squareup.cash.wallet.data.RealNewTagPeekBus;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.viewmodels.WalletHomeViewModel$WalletScheme;
import com.squareup.cash.work.session.SquareAccountStore$userFlow$$inlined$map$1;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.postcard.app.PostcardClientService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.android.AndroidToaster;
import com.squareup.util.cash.Countries;
import com.squareup.workflow1.internal.WorkflowNode$tick$1$1;
import com.squareup.workflow1.ui.WorkflowLayout$start$1;
import com.withpersona.sdk2.camera.CameraHelper$unbind$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.noties.markwon.MarkwonConfiguration;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes7.dex */
public final class WalletHomePresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final WalletHomeScreen args;
    public final Flow badgingState;
    public final SharedFlowImpl cardSchemeEvents;
    public final CardSchemePresenter cardSchemePresenter;
    public final RealFamilyProfileManager familyProfileManager;
    public final int initialPaymentDevicePage;
    public final IssuedCardManager issuedCardManager;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealOverlayAppMessageReader overlayAppMessageReader;
    public final RealRouter router;
    public final AndroidStringManager stringManager;
    public final TabToolbarPresenter tabToolbarPresenter;
    public final AndroidToaster toaster;

    public WalletHomePresenter(WalletHomeScreen walletHomeScreen, BetterNavigator.ScreenNavigator screenNavigator, Analytics analytics, Flow flow, RealClipboardManager realClipboardManager, IssuedCardManager issuedCardManager, RealOverlayAppMessageReader realOverlayAppMessageReader, AndroidStringManager androidStringManager, AndroidToaster androidToaster, RealFamilyProfileManager realFamilyProfileManager, KeyValue keyValue, CardSchemePresenter$Factory$Impl cardSchemePresenter$Factory$Impl, RealRouter$Factory$Impl realRouter$Factory$Impl, TabToolbarPresenter$Factory$Impl tabToolbarPresenter$Factory$Impl) {
        walletHomeScreen.getClass();
        this.args = walletHomeScreen;
        this.navigator = screenNavigator;
        this.analytics = analytics;
        this.badgingState = flow;
        this.issuedCardManager = issuedCardManager;
        this.overlayAppMessageReader = realOverlayAppMessageReader;
        this.stringManager = androidStringManager;
        this.toaster = androidToaster;
        this.familyProfileManager = realFamilyProfileManager;
        this.tabToolbarPresenter = tabToolbarPresenter$Factory$Impl.create(screenNavigator, new WalletHomeScreen(7, (Integer) null, (String) null));
        Integer num = walletHomeScreen.initialPaymentDevicePage;
        int intValue = num != null ? num.intValue() : ((Number) keyValue.blockingGet()).intValue();
        this.initialPaymentDevicePage = intValue;
        String str = walletHomeScreen.copyId;
        Integer valueOf = Integer.valueOf(intValue);
        CardSchemePresenter.MetroFactory metroFactory = cardSchemePresenter$Factory$Impl.delegateFactory;
        RealClientSyncer realClientSyncer = (RealClientSyncer) metroFactory.clientSyncer.invoke();
        SyncValueReader syncValueReader = (SyncValueReader) metroFactory.syncValueReader.invoke();
        NullStateCarouselPresenter$Factory$Impl nullStateCarouselPresenter$Factory$Impl = (NullStateCarouselPresenter$Factory$Impl) metroFactory.nullStateCarouselPresenterFactory.value;
        AndroidStringManager androidStringManager2 = (AndroidStringManager) metroFactory.stringManager.invoke();
        RealClientScenarioCompleter realClientScenarioCompleter = (RealClientScenarioCompleter) metroFactory.clientScenarioCompleter.invoke();
        RealClipboardManager realClipboardManager2 = (RealClipboardManager) metroFactory.clippy.invoke();
        Analytics analytics2 = (Analytics) metroFactory.analytics.invoke();
        AndroidToaster androidToaster2 = (AndroidToaster) metroFactory.toaster.invoke();
        FlowNavigationHelper flowNavigationHelper = (FlowNavigationHelper) metroFactory.flowNavigationHelper.invoke();
        MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) metroFactory.roundUpsItemPresenter.invoke();
        MarkwonConfiguration markwonConfiguration2 = (MarkwonConfiguration) metroFactory.spendingInsightsListItemPresenter.invoke();
        SessionManager sessionManager = (SessionManager) metroFactory.sessionManager.invoke();
        RealDisclosureProvider realDisclosureProvider = (RealDisclosureProvider) metroFactory.disclosureProvider.invoke();
        RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) metroFactory.featureEligibilityRepository.invoke();
        RealBoostRepository realBoostRepository = (RealBoostRepository) metroFactory.boostRepository.invoke();
        RealWalletAnalyticsHelper realWalletAnalyticsHelper = (RealWalletAnalyticsHelper) metroFactory.analyticsHelper.invoke();
        ErrorReporter errorReporter = (ErrorReporter) metroFactory.errorReporter.invoke();
        IssuedCardManager issuedCardManager2 = (IssuedCardManager) metroFactory.issuedCardManager.invoke();
        RealCashAppTagManager realCashAppTagManager = (RealCashAppTagManager) metroFactory.cashAppTagManager.invoke();
        RealDeviceLockAnimationBus realDeviceLockAnimationBus = (RealDeviceLockAnimationBus) metroFactory.deviceLockAnimationBus.invoke();
        RealNewTagPeekBus realNewTagPeekBus = (RealNewTagPeekBus) metroFactory.newTagPeekBus.invoke();
        KeyValue keyValue2 = (KeyValue) metroFactory.lastViewedPaymentDevicePage.invoke();
        RealNextUpCandidateDismisser realNextUpCandidateDismisser = (RealNextUpCandidateDismisser) metroFactory.nextUpCandidateDismisser.invoke();
        PostcardClientService postcardClientService = (PostcardClientService) metroFactory.postcardService.invoke();
        AppService appService = (AppService) metroFactory.franklinAppService.invoke();
        FlowStarter flowStarter = (FlowStarter) metroFactory.flowStarter.invoke();
        RealFamilyProfileManager realFamilyProfileManager2 = (RealFamilyProfileManager) metroFactory.familyProfileManager.invoke();
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory.featureFlagManager.invoke();
        RealCardCustomizationRepository realCardCustomizationRepository = (RealCardCustomizationRepository) metroFactory.cardCustomizationRepository.invoke();
        RealPrepurchaseToggleManager realPrepurchaseToggleManager = (RealPrepurchaseToggleManager) metroFactory.prepurchaseToggleManager.invoke();
        SyncTopic syncTopic = (SyncTopic) metroFactory.cardTopic.invoke();
        LiteCashAppTagSyncTopicProvider liteCashAppTagSyncTopicProvider = (LiteCashAppTagSyncTopicProvider) metroFactory.cashAppTagSyncTopicProvider.invoke();
        CoroutineContext coroutineContext = (CoroutineContext) metroFactory.ioDispatcher.invoke();
        CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) metroFactory.cashDatabase.invoke();
        RealFilamentSupportProvider realFilamentSupportProvider = (RealFilamentSupportProvider) metroFactory.filamentSupportProvider.invoke();
        RealRouter$Factory$Impl realRouter$Factory$Impl2 = (RealRouter$Factory$Impl) metroFactory.routerFactory.invoke();
        OverdraftListItemPresenter$Factory$Impl overdraftListItemPresenter$Factory$Impl = (OverdraftListItemPresenter$Factory$Impl) metroFactory.overdraftListItemPresenterFactory.value;
        KybRestrictionBannerPresenter$AssistedInjectionFactory$Impl kybRestrictionBannerPresenter$AssistedInjectionFactory$Impl = (KybRestrictionBannerPresenter$AssistedInjectionFactory$Impl) metroFactory.kybRestrictionBannerFactory.invoke();
        realClientSyncer.getClass();
        syncValueReader.getClass();
        nullStateCarouselPresenter$Factory$Impl.getClass();
        androidStringManager2.getClass();
        realClientScenarioCompleter.getClass();
        realClipboardManager2.getClass();
        analytics2.getClass();
        androidToaster2.getClass();
        flowNavigationHelper.getClass();
        sessionManager.getClass();
        realDisclosureProvider.getClass();
        realFeatureEligibilityRepository.getClass();
        realBoostRepository.getClass();
        realWalletAnalyticsHelper.getClass();
        errorReporter.getClass();
        issuedCardManager2.getClass();
        realCashAppTagManager.getClass();
        realDeviceLockAnimationBus.getClass();
        realNewTagPeekBus.getClass();
        keyValue2.getClass();
        realNextUpCandidateDismisser.getClass();
        postcardClientService.getClass();
        appService.getClass();
        flowStarter.getClass();
        realFamilyProfileManager2.getClass();
        featureFlagManager.getClass();
        realCardCustomizationRepository.getClass();
        realPrepurchaseToggleManager.getClass();
        syncTopic.getClass();
        liteCashAppTagSyncTopicProvider.getClass();
        coroutineContext.getClass();
        cashAccountDatabaseImpl.getClass();
        realFilamentSupportProvider.getClass();
        realRouter$Factory$Impl2.getClass();
        overdraftListItemPresenter$Factory$Impl.getClass();
        kybRestrictionBannerPresenter$AssistedInjectionFactory$Impl.getClass();
        this.cardSchemePresenter = new CardSchemePresenter(screenNavigator, str, valueOf, realClientSyncer, syncValueReader, nullStateCarouselPresenter$Factory$Impl, androidStringManager2, realClientScenarioCompleter, realClipboardManager2, analytics2, androidToaster2, flowNavigationHelper, markwonConfiguration, markwonConfiguration2, sessionManager, realDisclosureProvider, realFeatureEligibilityRepository, realBoostRepository, realWalletAnalyticsHelper, errorReporter, issuedCardManager2, realCashAppTagManager, realDeviceLockAnimationBus, realNewTagPeekBus, keyValue2, realNextUpCandidateDismisser, postcardClientService, appService, flowStarter, realFamilyProfileManager2, featureFlagManager, realCardCustomizationRepository, realPrepurchaseToggleManager, syncTopic, liteCashAppTagSyncTopicProvider, coroutineContext, cashAccountDatabaseImpl, realFilamentSupportProvider, realRouter$Factory$Impl2, overdraftListItemPresenter$Factory$Impl, kybRestrictionBannerPresenter$AssistedInjectionFactory$Impl);
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        this.cardSchemeEvents = FlowKt.MutableSharedFlow$default(0, 1, null, 5);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        String str;
        int i2;
        FormattedResource formattedResource;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(742158644);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            NullStateSwipeConfigProvider nullStateSwipeConfigProvider = new NullStateSwipeConfigProvider(new SquareAccountStore$userFlow$$inlined$map$1(flow, 7), 28);
            gapComposer.updateRememberedValue(nullStateSwipeConfigProvider);
            rememberedValue = nullStateSwipeConfigProvider;
        }
        TabToolbarInternalViewModel models = this.tabToolbarPresenter.models((Flow) rememberedValue, (Composer) gapComposer, 64);
        int i3 = 0;
        CardSchemeViewModel models2 = this.cardSchemePresenter.models((Flow) this.cardSchemeEvents, (Composer) gapComposer, 0);
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(models2, gapComposer);
        Continuation continuation = null;
        MutableState collectAsState = Updater.collectAsState(this.familyProfileManager.familyProfile, null, gapComposer, 1);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Boxes$$ExternalSyntheticOutline1.m(this.initialPaymentDevicePage, gapComposer);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue2;
        boolean changed = gapComposer.changed((FamilyProfile) collectAsState.getValue()) | gapComposer.changed(models2) | gapComposer.changed(parcelableSnapshotMutableIntState.getIntValue());
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed || rememberedValue3 == neverEqualPolicy) {
            FamilyProfile familyProfile = (FamilyProfile) collectAsState.getValue();
            int intValue = parcelableSnapshotMutableIntState.getIntValue();
            AndroidStringManager androidStringManager = this.stringManager;
            Resources resources = androidStringManager.resources;
            if (models2 instanceof CardSchemeViewModel.CardNullStateBooklet) {
                str = "";
            } else {
                FamilyProfile.ManagedAccount managedAccount = familyProfile instanceof FamilyProfile.ManagedAccount ? (FamilyProfile.ManagedAccount) familyProfile : null;
                String str2 = managedAccount != null ? managedAccount.firstName : null;
                CardSchemeViewModel.Module.HeroPaymentDevices access$heroPaymentDevices = Protos_interopKt.access$heroPaymentDevices(models2);
                CardSchemeViewModel.Module.HeroTag heroTag = access$heroPaymentDevices != null ? (CardSchemeViewModel.Module.HeroTag) CollectionsKt.getOrNull(intValue - 1, access$heroPaymentDevices.heroTags) : null;
                if (heroTag != null && str2 != null) {
                    TagFormFactor tagFormFactor = heroTag.formFactor;
                    switch (tagFormFactor != null ? WalletHomePresenterKt$WhenMappings.$EnumSwitchMapping$0[tagFormFactor.ordinal()] : -1) {
                        case -1:
                            formattedResource = new FormattedResource(R.string.tab_title_managed_tag_unknown, new Object[]{str2});
                            break;
                        case 0:
                        default:
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        case 1:
                        case 2:
                            formattedResource = new FormattedResource(R.string.tab_title_managed_tag_wand, new Object[]{str2});
                            break;
                        case 3:
                        case 4:
                            formattedResource = new FormattedResource(R.string.tab_title_managed_tag_heart, new Object[]{str2});
                            break;
                        case 5:
                        case 6:
                            formattedResource = new FormattedResource(R.string.tab_title_managed_tag_mini_card, new Object[]{str2});
                            break;
                    }
                    str = Countries.getString(resources, formattedResource);
                } else if (heroTag != null) {
                    TagFormFactor tagFormFactor2 = heroTag.formFactor;
                    switch (tagFormFactor2 != null ? WalletHomePresenterKt$WhenMappings.$EnumSwitchMapping$0[tagFormFactor2.ordinal()] : -1) {
                        case -1:
                            i2 = R.string.tab_title_tag_unknown;
                            break;
                        case 0:
                        default:
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        case 1:
                        case 2:
                            i2 = R.string.tab_title_tag_wand;
                            break;
                        case 3:
                        case 4:
                            i2 = R.string.tab_title_tag_heart;
                            break;
                        case 5:
                        case 6:
                            i2 = R.string.tab_title_tag_mini_card;
                            break;
                    }
                    str = androidStringManager.get(i2);
                } else if (str2 != null) {
                    resources.getClass();
                    str = new MessageFormat(resources.getString(R.string.tab_title_managed_card)).format(new Object[]{str2});
                    str.getClass();
                } else {
                    str = androidStringManager.get(R.string.tab_title_card);
                }
            }
            rememberedValue3 = str;
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        String str3 = (String) rememberedValue3;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = new CameraHelper$unbind$2(this, continuation, 3);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue4);
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = new WalletHomePresenter$models$2$1(this, continuation, i3);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue5);
        Updater.LaunchedEffect(gapComposer, flow, new WorkflowLayout$start$1(flow, (Continuation) null, this, rememberUpdatedState, parcelableSnapshotMutableIntState, 12));
        boolean changedInstance3 = gapComposer.changedInstance(this);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (changedInstance3 || rememberedValue6 == neverEqualPolicy) {
            rememberedValue6 = new WorkflowNode$tick$1$1(this, continuation, 15);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue6);
        WalletHomeViewModel$WalletScheme walletHomeViewModel$WalletScheme = new WalletHomeViewModel$WalletScheme(TabToolbarInternalViewModel.copy$default(models, null, TabToolbarInternalViewModel.StartButtonType.CLOSE, null, 26), new TabToolbarViewModel(new TabToolbarViewModel$TabToolbarTitle$TextTitle(str3)), models2);
        gapComposer.end(false);
        return walletHomeViewModel$WalletScheme;
    }
}
