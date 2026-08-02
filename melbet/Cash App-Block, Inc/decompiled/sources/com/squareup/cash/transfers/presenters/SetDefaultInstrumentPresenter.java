package com.squareup.cash.transfers.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$AllowedAccountsSectionViewModel;
import com.squareup.cash.cashlynxflow.service.v2.AppService;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientTransfersUseInstrumentCardArt;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$FamiliesDependentAllowlistExperience;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.p2pblocking.presenters.RealAllowlistRepository;
import com.squareup.cash.phoneplans.PhonePlansHomePresenter$models$1$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.storage.AndroidFileSaver$save$2;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.transfers.screens.SetDefaultInstrumentScreen;
import com.squareup.cash.transfers.views.AddMoneyViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.protos.cash.blockly.api.BlocklyService;
import com.squareup.protos.cash.blockly.api.GetAllowlistForCustomerResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes7.dex */
public final class SetDefaultInstrumentPresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId = 0;
    public final Object analytics;
    public final Object appService;
    public final Object args;
    public final Object blockersDataNavigator;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;
    public final boolean useInstrumentCardArt;

    public SetDefaultInstrumentPresenter(BlocklyService blocklyService, SessionManager sessionManager, RealFamilyAccountsManager realFamilyAccountsManager, FeatureFlagManager featureFlagManager, AndroidStringManager androidStringManager, RealAllowlistRepository realAllowlistRepository, BetterNavigator.ScreenNavigator screenNavigator) {
        this.appService = blocklyService;
        this.blockersDataNavigator = realFamilyAccountsManager;
        this.stringManager = androidStringManager;
        this.analytics = realAllowlistRepository;
        this.navigator = screenNavigator;
        this.args = PlatformKt.activeAccountToken(sessionManager);
        this.useInstrumentCardArt = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$FamiliesDependentAllowlistExperience.INSTANCE)).enabled();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$AllowedAccountsSectionViewModel] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        List list;
        switch (this.$r8$classId) {
            case 0:
                m3772models(flow, composer, i);
                return Unit.INSTANCE;
            default:
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(1647056199);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = ((RealFamilyAccountsManager) this.blockersDataNavigator).isSponsored();
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Continuation continuation = null;
                if (((Boolean) Updater.collectAsState((StateFlow) rememberedValue, Boolean.FALSE, null, gapComposer, 48, 2).getValue()).booleanValue() && this.useInstrumentCardArt) {
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = Updater.mutableStateOf$default(null);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    MutableState mutableState = (MutableState) rememberedValue2;
                    Unit unit = Unit.INSTANCE;
                    boolean changedInstance = gapComposer.changedInstance(this);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new AndroidFileSaver$save$2(this, mutableState, continuation, 13);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
                    Updater.LaunchedEffect(gapComposer, flow, new PhonePlansHomePresenter$models$1$1(28, mutableState, (MoleculePresenter) this, (Object) flow, continuation));
                    GetAllowlistForCustomerResponse getAllowlistForCustomerResponse = (GetAllowlistForCustomerResponse) mutableState.getValue();
                    Integer valueOf = (getAllowlistForCustomerResponse == null || (list = getAllowlistForCustomerResponse.allowed_customers) == null) ? null : Integer.valueOf(list.size());
                    AndroidStringManager androidStringManager = this.stringManager;
                    ?? profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel = new ProfilePrivacyReadyViewModel$AllowedAccountsSectionViewModel(((RealAllowlistRepository) this.analytics).isAllowlistOn() ? valueOf : null, androidStringManager.get(R.string.profile_allowed_accounts_title), androidStringManager.get(R.string.profile_allowed_accounts_description));
                    if (valueOf != null) {
                        continuation = profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel;
                    }
                }
                gapComposer.end(false);
                return continuation;
        }
    }

    public SetDefaultInstrumentPresenter(AppService appService, BlockersDataNavigator blockersDataNavigator, Analytics analytics, FeatureFlagManager featureFlagManager, AndroidStringManager androidStringManager, SetDefaultInstrumentScreen setDefaultInstrumentScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        setDefaultInstrumentScreen.getClass();
        this.appService = appService;
        this.blockersDataNavigator = blockersDataNavigator;
        this.analytics = analytics;
        this.stringManager = androidStringManager;
        this.args = setDefaultInstrumentScreen;
        this.navigator = screenNavigator;
        this.useInstrumentCardArt = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$ClientTransfersUseInstrumentCardArt.INSTANCE)).enabled();
    }

    /* renamed from: models, reason: collision with other method in class */
    public void m3772models(Flow flow, Composer composer, int i) {
        int i2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1574699779);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(flow) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Continuation continuation = null;
            Updater.LaunchedEffect(gapComposer, flow, new TaxWebAppBridge.AnonymousClass4(flow, continuation, this, 25));
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(this);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ExoPlayerVideoView.AnonymousClass2(this, continuation, 9);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddMoneyViewKt$$ExternalSyntheticLambda11(this, flow, i, i3);
        }
    }
}
