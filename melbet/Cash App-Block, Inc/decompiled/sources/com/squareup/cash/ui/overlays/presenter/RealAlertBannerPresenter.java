package com.squareup.cash.ui.overlays.presenter;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.arcade.values.ButtonProminence;
import app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.featureflags.AmplitudeExperiments$IaSuspensionsBanner;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.CellActionCard;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.PromptButtonList;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.TapBehavior;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.TapBehavior$CardButtons$Button$Action$ClientRouteAction;
import com.squareup.cash.moneybot.components.api.PluginContext;
import com.squareup.cash.moneybot.viewmodels.plugins.CellActionCardViewEvent;
import com.squareup.cash.moneybot.viewmodels.plugins.CellActionCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.PromptButtonListViewEvent;
import com.squareup.cash.moneybot.viewmodels.plugins.PromptButtonListViewModel;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.overlays.viewmodels.AlertBannerScreen;
import com.squareup.cash.ui.overlays.viewmodels.AlertBannerViewModel;
import com.squareup.cash.ui.overlays.viewmodels.BannerStyle;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.guardrails.api.v1.AdversityBanner;
import com.withpersona.sdk2.inquiry.logger.Logger$_log$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;
import squareup.cash.ui.arcade.elements.CellDefault;

/* loaded from: classes6.dex */
public final class RealAlertBannerPresenter implements MoleculeCallbackPresenter {
    public final /* synthetic */ int $r8$classId = 0;
    public final Object analytics;
    public final Object featureFlagManager;
    public final Object router;
    public final Object screen;
    public final Object syncValueReader;

    public RealAlertBannerPresenter(RealMoneybotAnalyticsService realMoneybotAnalyticsService, Analytics analytics, RealRouter$Factory$Impl realRouter$Factory$Impl, CellActionCard cellActionCard, PluginContext pluginContext, BetterNavigator.ScreenNavigator screenNavigator, Function2 function2) {
        function2.getClass();
        this.syncValueReader = realMoneybotAnalyticsService;
        this.analytics = cellActionCard;
        this.featureFlagManager = pluginContext;
        this.screen = function2;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public static CellActionCardViewModel.ButtonGroup.Button toButton(TapBehavior.CardButtons.Button button, String str) {
        CellActionCardViewEvent cellActionCardViewEvent;
        String str2 = button.text;
        String str3 = button.hiddenTapMessage;
        ButtonProminence.Id id = button.prominence;
        TapBehavior$CardButtons$Button$Action$ClientRouteAction tapBehavior$CardButtons$Button$Action$ClientRouteAction = button.action;
        if (tapBehavior$CardButtons$Button$Action$ClientRouteAction != null) {
            cellActionCardViewEvent = new CellActionCardViewEvent.LaunchClientRoute(str, tapBehavior$CardButtons$Button$Action$ClientRouteAction.clientRoute, str3);
        } else {
            cellActionCardViewEvent = null;
            if (tapBehavior$CardButtons$Button$Action$ClientRouteAction != null) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            if (str3 != null) {
                cellActionCardViewEvent = new CellActionCardViewEvent.SendHiddenMessage(str, str3);
            }
        }
        return new CellActionCardViewModel.ButtonGroup.Button(str2, id, cellActionCardViewEvent);
    }

    public Pair[] cdfEventParams() {
        AndroidClock androidClock = (AndroidClock) this.analytics;
        String str = ((PluginContext) this.screen).homeSessionId;
        return str != null ? new Pair[]{new Pair("home_session_id", str), new Pair("occurred_at", String.valueOf(androidClock.millis()))} : new Pair[]{new Pair("occurred_at", String.valueOf(androidClock.millis()))};
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter
    public final UiCallbackModel models(Composer composer) {
        AlertBannerViewModel alertBannerViewModel;
        boolean changedInstance;
        Object rememberedValue;
        MutableState mutableState;
        boolean changed;
        BannerStyle bannerStyle;
        int i = this.$r8$classId;
        Object obj = this.featureFlagManager;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        CellActionCardViewModel.ButtonGroup buttonGroup = null;
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-450587529);
                Object rememberedValue2 = gapComposer.rememberedValue();
                Object obj2 = rememberedValue2;
                if (rememberedValue2 == neverEqualPolicy) {
                    StateFlow singleValue = ((SyncValueReader) this.syncValueReader).getSingleValue(AndroidSyncValueSpecs.AdversityBanner);
                    gapComposer.updateRememberedValue(singleValue);
                    obj2 = singleValue;
                }
                MutableState collectAsState = Updater.collectAsState((StateFlow) obj2, null, null, gapComposer, 48, 2);
                AdversityBanner adversityBanner = (AdversityBanner) collectAsState.getValue();
                Continuation continuation = null;
                if (adversityBanner != null) {
                    if (!((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) obj)).peekCurrentValue(AmplitudeExperiments$IaSuspensionsBanner.INSTANCE)).enabled()) {
                        adversityBanner = null;
                    }
                    if (adversityBanner != null) {
                        String str = adversityBanner.message;
                        str.getClass();
                        AdversityBanner.Style style = adversityBanner.style;
                        style.getClass();
                        int ordinal = style.ordinal();
                        if (ordinal == 0) {
                            bannerStyle = BannerStyle.CRITICAL;
                        } else if (ordinal == 1) {
                            bannerStyle = BannerStyle.SEVERE;
                        } else {
                            if (ordinal != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            bannerStyle = BannerStyle.SUCCESS;
                        }
                        alertBannerViewModel = new AlertBannerViewModel(str, bannerStyle);
                        changedInstance = gapComposer.changedInstance(alertBannerViewModel) | gapComposer.changed(collectAsState) | gapComposer.changedInstance(this);
                        rememberedValue = gapComposer.rememberedValue();
                        if (!changedInstance || rememberedValue == neverEqualPolicy) {
                            mutableState = collectAsState;
                            Logger$_log$2 logger$_log$2 = new Logger$_log$2(alertBannerViewModel, this, mutableState, continuation, 7);
                            gapComposer.updateRememberedValue(logger$_log$2);
                            rememberedValue = logger$_log$2;
                        } else {
                            mutableState = collectAsState;
                        }
                        Updater.LaunchedEffect(gapComposer, alertBannerViewModel, (Function2) rememberedValue);
                        changed = gapComposer.changed(mutableState) | gapComposer.changedInstance(this);
                        Object rememberedValue3 = gapComposer.rememberedValue();
                        Object obj3 = rememberedValue3;
                        if (!changed || rememberedValue3 == neverEqualPolicy) {
                            BottomSheet$$ExternalSyntheticLambda3 bottomSheet$$ExternalSyntheticLambda3 = new BottomSheet$$ExternalSyntheticLambda3(22, this, mutableState);
                            gapComposer.updateRememberedValue(bottomSheet$$ExternalSyntheticLambda3);
                            obj3 = bottomSheet$$ExternalSyntheticLambda3;
                        }
                        UiCallbackModel uiCallbackModel = new UiCallbackModel((Function1) obj3, alertBannerViewModel);
                        gapComposer.end(false);
                        return uiCallbackModel;
                    }
                }
                alertBannerViewModel = null;
                changedInstance = gapComposer.changedInstance(alertBannerViewModel) | gapComposer.changed(collectAsState) | gapComposer.changedInstance(this);
                rememberedValue = gapComposer.rememberedValue();
                if (changedInstance) {
                }
                mutableState = collectAsState;
                Logger$_log$2 logger$_log$22 = new Logger$_log$2(alertBannerViewModel, this, mutableState, continuation, 7);
                gapComposer.updateRememberedValue(logger$_log$22);
                rememberedValue = logger$_log$22;
                Updater.LaunchedEffect(gapComposer, alertBannerViewModel, (Function2) rememberedValue);
                changed = gapComposer.changed(mutableState) | gapComposer.changedInstance(this);
                Object rememberedValue32 = gapComposer.rememberedValue();
                Object obj32 = rememberedValue32;
                if (!changed) {
                }
                BottomSheet$$ExternalSyntheticLambda3 bottomSheet$$ExternalSyntheticLambda32 = new BottomSheet$$ExternalSyntheticLambda3(22, this, mutableState);
                gapComposer.updateRememberedValue(bottomSheet$$ExternalSyntheticLambda32);
                obj32 = bottomSheet$$ExternalSyntheticLambda32;
                UiCallbackModel uiCallbackModel2 = new UiCallbackModel((Function1) obj32, alertBannerViewModel);
                gapComposer.end(false);
                return uiCallbackModel2;
            case 1:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(250456910);
                CellActionCard cellActionCard = (CellActionCard) this.analytics;
                CellDefault cellDefault = cellActionCard.cell;
                TapBehavior.CardButtons cardButtons = cellActionCard.cardButtons;
                if (cardButtons != null) {
                    String str2 = ((PluginContext) obj).requestId;
                    CellActionCardViewModel.ButtonGroup.Button button = toButton(cardButtons.primaryButton, str2);
                    TapBehavior.CardButtons.Button button2 = cardButtons.secondaryButton;
                    buttonGroup = new CellActionCardViewModel.ButtonGroup(button, button2 != null ? toButton(button2, str2) : null);
                }
                CellActionCardViewModel cellActionCardViewModel = new CellActionCardViewModel(cellDefault, buttonGroup);
                boolean changedInstance2 = gapComposer2.changedInstance(this);
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new Overlay$$ExternalSyntheticLambda0(this, 3);
                    gapComposer2.updateRememberedValue(rememberedValue4);
                }
                UiCallbackModel uiCallbackModel3 = new UiCallbackModel((Function1) rememberedValue4, cellActionCardViewModel);
                gapComposer2.end(false);
                return uiCallbackModel3;
            default:
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(-674137522);
                boolean changed2 = gapComposer3.changed(((PluginContext) this.screen).homeSessionId);
                Object rememberedValue5 = gapComposer3.rememberedValue();
                if (changed2 || rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new LinkedHashSet();
                    gapComposer3.updateRememberedValue(rememberedValue5);
                }
                MutableState rememberUpdatedState = Updater.rememberUpdatedState((Set) rememberedValue5, gapComposer3);
                ArrayList arrayList = ((PromptButtonList) obj).buttons;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                int i2 = 0;
                for (Object obj4 : arrayList) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    PromptButtonList.PromptButton promptButton = (PromptButtonList.PromptButton) obj4;
                    String str3 = promptButton.id;
                    List list = promptButton.viewCdfEvents;
                    if (str3 == null) {
                        str3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "prompt-button-");
                    }
                    arrayList2.add(new PromptButtonListViewModel.Button(str3, promptButton.text, new PromptButtonListViewEvent.PromptTapped(str3, promptButton.prompt, promptButton.tapCdfEvents), !list.isEmpty() ? new PromptButtonListViewEvent.PromptRendered(str3, list) : null));
                    i2 = i3;
                }
                PromptButtonListViewModel promptButtonListViewModel = new PromptButtonListViewModel(arrayList2);
                boolean changedInstance3 = gapComposer3.changedInstance(this) | gapComposer3.changed(rememberUpdatedState);
                Object rememberedValue6 = gapComposer3.rememberedValue();
                if (changedInstance3 || rememberedValue6 == neverEqualPolicy) {
                    rememberedValue6 = new MusicViewKt$$ExternalSyntheticLambda6(5, this, rememberUpdatedState);
                    gapComposer3.updateRememberedValue(rememberedValue6);
                }
                UiCallbackModel uiCallbackModel4 = new UiCallbackModel((Function1) rememberedValue6, promptButtonListViewModel);
                gapComposer3.end(false);
                return uiCallbackModel4;
        }
    }

    public RealAlertBannerPresenter(RealMoneybotAnalyticsService realMoneybotAnalyticsService, AndroidClock androidClock, PromptButtonList promptButtonList, PluginContext pluginContext, BetterNavigator.ScreenNavigator screenNavigator, Function2 function2) {
        function2.getClass();
        this.syncValueReader = realMoneybotAnalyticsService;
        this.analytics = androidClock;
        this.featureFlagManager = promptButtonList;
        this.screen = pluginContext;
        this.router = function2;
    }

    public RealAlertBannerPresenter(SyncValueReader syncValueReader, Analytics analytics, FeatureFlagManager featureFlagManager, RealRouter$Factory$Impl realRouter$Factory$Impl, BetterNavigator.ScreenNavigator screenNavigator, AlertBannerScreen alertBannerScreen) {
        this.syncValueReader = syncValueReader;
        this.analytics = analytics;
        this.featureFlagManager = featureFlagManager;
        this.screen = alertBannerScreen;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }
}
