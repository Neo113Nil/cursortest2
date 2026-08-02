package com.squareup.cash.wallet.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.ta$$ExternalSyntheticLambda1;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsc;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.borrow.views.ExpandedLoanHistoryListKt$$ExternalSyntheticLambda5;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$ProjMintCardGridNux;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$DisableFilament;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$EnableBratHype;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$MoneyCardIntroAnimation;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.filament.RealFilamentSupportProvider;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.applets.common.presenters.PromotedAppletTilePresenter$Factory$Impl;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.money.applets.sections.RealPromotedAppletTileStore;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.wallet.viewmodels.CardAppletTileViewModel;
import com.squareup.cash.wallet.workers.CardAppletWorker$setup$1$2$1;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.StateFlowKt$combineState$6;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes7.dex */
public final class CardAppletTilePresenter implements MoleculePresenter {
    public final RealFamilyProfileManager familyProfileManager;
    public final FeatureFlagManager featureFlagManager;
    public final RealFilamentSupportProvider filamentSupportProvider;
    public final Lazy isBratHypeEnabled$delegate;
    public final Lazy isCardAnimationEnabled$delegate;
    public final Lazy isCardGridEnabled$delegate;
    public final boolean isFilamentDisabled;
    public final MoneyAnalyticsService moneyAnalyticsService;
    public final Navigator navigator;
    public final VerifyCheckDialogPresenter promotedAppletTilePresenter;
    public final CardAppletTileRepository repository;
    public final AndroidStringManager stringManager;

    public CardAppletTilePresenter(Navigator navigator, CardAppletTileRepository cardAppletTileRepository, MoneyAnalyticsService moneyAnalyticsService, AndroidStringManager androidStringManager, RealFilamentSupportProvider realFilamentSupportProvider, FeatureFlagManager featureFlagManager, RealFamilyProfileManager realFamilyProfileManager, PromotedAppletTilePresenter$Factory$Impl promotedAppletTilePresenter$Factory$Impl) {
        navigator.getClass();
        this.navigator = navigator;
        this.repository = cardAppletTileRepository;
        this.moneyAnalyticsService = moneyAnalyticsService;
        this.stringManager = androidStringManager;
        this.filamentSupportProvider = realFilamentSupportProvider;
        this.featureFlagManager = featureFlagManager;
        this.familyProfileManager = realFamilyProfileManager;
        this.promotedAppletTilePresenter = promotedAppletTilePresenter$Factory$Impl.create(AppletId.PROMOTED_CARD);
        this.isFilamentDisabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$DisableFilament.INSTANCE)).enabled();
        final int i = 0;
        this.isCardAnimationEnabled$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.wallet.presenters.CardAppletTilePresenter$$ExternalSyntheticLambda1
            public final /* synthetic */ CardAppletTilePresenter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean enabled;
                int i2 = i;
                CardAppletTilePresenter cardAppletTilePresenter = this.f$0;
                switch (i2) {
                    case 0:
                        enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) cardAppletTilePresenter.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$MoneyCardIntroAnimation.INSTANCE)).enabled();
                        break;
                    case 1:
                        enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) cardAppletTilePresenter.featureFlagManager).peekCurrentValue(AmplitudeExperiments$ProjMintCardGridNux.INSTANCE)).enabled();
                        break;
                    default:
                        enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) cardAppletTilePresenter.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$EnableBratHype.INSTANCE)).enabled();
                        break;
                }
                return Boolean.valueOf(enabled);
            }
        });
        final int i2 = 1;
        this.isCardGridEnabled$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.wallet.presenters.CardAppletTilePresenter$$ExternalSyntheticLambda1
            public final /* synthetic */ CardAppletTilePresenter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean enabled;
                int i22 = i2;
                CardAppletTilePresenter cardAppletTilePresenter = this.f$0;
                switch (i22) {
                    case 0:
                        enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) cardAppletTilePresenter.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$MoneyCardIntroAnimation.INSTANCE)).enabled();
                        break;
                    case 1:
                        enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) cardAppletTilePresenter.featureFlagManager).peekCurrentValue(AmplitudeExperiments$ProjMintCardGridNux.INSTANCE)).enabled();
                        break;
                    default:
                        enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) cardAppletTilePresenter.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$EnableBratHype.INSTANCE)).enabled();
                        break;
                }
                return Boolean.valueOf(enabled);
            }
        });
        final int i3 = 2;
        this.isBratHypeEnabled$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.wallet.presenters.CardAppletTilePresenter$$ExternalSyntheticLambda1
            public final /* synthetic */ CardAppletTilePresenter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean enabled;
                int i22 = i3;
                CardAppletTilePresenter cardAppletTilePresenter = this.f$0;
                switch (i22) {
                    case 0:
                        enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) cardAppletTilePresenter.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$MoneyCardIntroAnimation.INSTANCE)).enabled();
                        break;
                    case 1:
                        enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) cardAppletTilePresenter.featureFlagManager).peekCurrentValue(AmplitudeExperiments$ProjMintCardGridNux.INSTANCE)).enabled();
                        break;
                    default:
                        enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) cardAppletTilePresenter.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$EnableBratHype.INSTANCE)).enabled();
                        break;
                }
                return Boolean.valueOf(enabled);
            }
        });
    }

    public static Icons icon(zzsc zzscVar) {
        if ((zzscVar instanceof CardDetailsModel$CardPillModel$Installed$Expired) || (zzscVar instanceof CardDetailsModel$CardPillModel$Installed$Suspended)) {
            return Icons.AlertFill16;
        }
        if (zzscVar instanceof CardDetailsModel$CardPillModel$Installed$Locked) {
            return Icons.LockLockedFill16;
        }
        if ((zzscVar instanceof CardDetailsModel$CardPillModel$Installed$WithCardInfo) || (zzscVar instanceof CardDetailsModel$CardPillModel$Installed$NullState)) {
            return Icons.CardBasicFill16;
        }
        if (zzscVar instanceof CardDetailsModel$CardPillModel$Installed$WithActiveOffer) {
            return Icons.DiscountTagFill16;
        }
        if ((zzscVar instanceof CardDetailsModel$CardPillModel$Installed$PendingActivation) || (zzscVar instanceof CardDetailsModel$CardPillModel$Installed$Preparing)) {
            return Icons.TimeFill16;
        }
        if (zzscVar instanceof CardDetailsModel$CardPillModel$Installed$Shipped) {
            return Icons.Send16;
        }
        if (zzscVar instanceof CardDetailsModel$CardPillModel$Installed$WithPrepurchaseEnabled) {
            return Icons.PayInFour16;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        int i2;
        ProducerCoroutine producerCoroutine;
        boolean z;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1577358124);
        RealCardAppletTileRepository realCardAppletTileRepository = (RealCardAppletTileRepository) this.repository;
        ReadonlyStateFlow readonlyStateFlow = realCardAppletTileRepository.isCardReadyToAnimate;
        MutableState collectAsState = Updater.collectAsState(readonlyStateFlow, null, gapComposer, 1);
        boolean changed = gapComposer.changed(((Boolean) collectAsState.getValue()).booleanValue());
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (changed || rememberedValue == obj) {
            rememberedValue = Boolean.valueOf(((Boolean) this.isCardAnimationEnabled$delegate.getValue()).booleanValue() && ((Boolean) collectAsState.getValue()).booleanValue());
            gapComposer.updateRememberedValue(rememberedValue);
        }
        boolean booleanValue = ((Boolean) rememberedValue).booleanValue();
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj) {
            rememberedValue2 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue2;
        VerifyCheckDialogPresenter verifyCheckDialogPresenter = this.promotedAppletTilePresenter;
        verifyCheckDialogPresenter.getClass();
        gapComposer.startReplaceGroup(-1613152821);
        boolean changed2 = gapComposer.changed(((AppletId) verifyCheckDialogPresenter.navigator).ordinal());
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue3 == obj) {
            rememberedValue3 = new InviteContactsPresenter$special$$inlined$map$1(((RealPromotedAppletTileStore) verifyCheckDialogPresenter.args).getPromotedAppletTiles(), verifyCheckDialogPresenter, 17);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        PromotedAppletTileViewModel promotedAppletTileViewModel = (PromotedAppletTileViewModel) Updater.collectAsState((Flow) rememberedValue3, PromotedAppletTileViewModel.Loading.INSTANCE, null, gapComposer, 0, 2).getValue();
        gapComposer.end(false);
        PromotedAppletTileViewModel.Loaded loaded = promotedAppletTileViewModel instanceof PromotedAppletTileViewModel.Loaded ? (PromotedAppletTileViewModel.Loaded) promotedAppletTileViewModel : null;
        boolean changed3 = gapComposer.changed(booleanValue) | gapComposer.changed(loaded);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changed3 || rememberedValue4 == obj) {
            ReadonlyStateFlow readonlyStateFlow2 = realCardAppletTileRepository.availabilityState;
            DerivedStateFlow combineState = StateFlowKt.combineState(realCardAppletTileRepository.nullStateCardDetails, realCardAppletTileRepository.cardDetailsModel, CardAppletTilePresenter$models$viewModel$2$1.INSTANCE);
            ReadonlyStateFlow readonlyStateFlow3 = this.familyProfileManager.familyProfile;
            i2 = 1;
            ExpandedLoanHistoryListKt$$ExternalSyntheticLambda5 expandedLoanHistoryListKt$$ExternalSyntheticLambda5 = new ExpandedLoanHistoryListKt$$ExternalSyntheticLambda5(coroutineScope, this, loaded, booleanValue);
            readonlyStateFlow2.getClass();
            readonlyStateFlow.getClass();
            readonlyStateFlow3.getClass();
            producerCoroutine = null;
            z = false;
            Object derivedStateFlow = new DerivedStateFlow(new ta$$ExternalSyntheticLambda1(expandedLoanHistoryListKt$$ExternalSyntheticLambda5, readonlyStateFlow2, combineState, readonlyStateFlow, readonlyStateFlow3, 19), FlowKt.combine(readonlyStateFlow2, combineState, readonlyStateFlow, readonlyStateFlow3, new StateFlowKt$combineState$6(5, 0, ArrayIteratorKt.class, expandedLoanHistoryListKt$$ExternalSyntheticLambda5, "suspendConversion0", "combineState$suspendConversion0$4(Lkotlin/jvm/functions/Function4;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;")));
            gapComposer.updateRememberedValue(derivedStateFlow);
            rememberedValue4 = derivedStateFlow;
        } else {
            producerCoroutine = null;
            i2 = 1;
            z = false;
        }
        MutableState collectAsState2 = Updater.collectAsState((StateFlow) rememberedValue4, producerCoroutine, gapComposer, i2);
        Updater.LaunchedEffect(gapComposer, flow, new CardAppletWorker$setup$1$2$1(flow, producerCoroutine, this, 2));
        CardAppletTileViewModel cardAppletTileViewModel = (CardAppletTileViewModel) collectAsState2.getValue();
        gapComposer.end(z);
        return cardAppletTileViewModel;
    }

    public final String text(zzsc zzscVar, String str) {
        AndroidStringManager androidStringManager = this.stringManager;
        Resources resources = androidStringManager.resources;
        if (zzscVar instanceof CardDetailsModel$CardPillModel$Installed$Expired) {
            return androidStringManager.get(R.string.card_applet_pill_expired_label);
        }
        if (zzscVar instanceof CardDetailsModel$CardPillModel$Installed$Locked) {
            return androidStringManager.get(R.string.card_applet_pill_locked_label);
        }
        if (zzscVar instanceof CardDetailsModel$CardPillModel$Installed$WithActiveOffer) {
            int i = ((CardDetailsModel$CardPillModel$Installed$WithActiveOffer) zzscVar).offerCount;
            Integer valueOf = Integer.valueOf(i);
            Integer valueOf2 = Integer.valueOf(i);
            ArrayMap arrayMap = new ArrayMap(2);
            arrayMap.put("0", valueOf2);
            arrayMap.put("count", valueOf);
            resources.getClass();
            String format2 = new MessageFormat(resources.getString(R.string.card_applet_pill_active_offer_label)).format(arrayMap);
            format2.getClass();
            return format2;
        }
        if (zzscVar instanceof CardDetailsModel$CardPillModel$Installed$WithCardInfo) {
            return Recorder$$ExternalSyntheticOutline2.m("•• ", ((CardDetailsModel$CardPillModel$Installed$WithCardInfo) zzscVar).lastFour);
        }
        if (zzscVar instanceof CardDetailsModel$CardPillModel$Installed$PendingActivation) {
            return androidStringManager.get(R.string.card_applet_pill_pending_label);
        }
        if (zzscVar instanceof CardDetailsModel$CardPillModel$Installed$Suspended) {
            return androidStringManager.get(R.string.card_applet_pill_suspended_label);
        }
        if (zzscVar instanceof CardDetailsModel$CardPillModel$Installed$NullState) {
            if (str == null) {
                return androidStringManager.get(R.string.card_applet_pill_null_state_label);
            }
            resources.getClass();
            String format3 = new MessageFormat(resources.getString(R.string.card_applet_pill_null_state_managed_label)).format(new Object[]{str});
            format3.getClass();
            return format3;
        }
        if (zzscVar instanceof CardDetailsModel$CardPillModel$Installed$Preparing) {
            return androidStringManager.get(R.string.card_applet_pill_preparing_label);
        }
        if (zzscVar instanceof CardDetailsModel$CardPillModel$Installed$Shipped) {
            return androidStringManager.get(R.string.card_applet_pill_shipped_label);
        }
        if (zzscVar instanceof CardDetailsModel$CardPillModel$Installed$WithPrepurchaseEnabled) {
            return androidStringManager.get(R.string.card_applet_pill_prepurchase_enabled_label);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
