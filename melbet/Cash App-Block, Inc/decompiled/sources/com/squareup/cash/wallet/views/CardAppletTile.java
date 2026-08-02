package com.squareup.cash.wallet.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import androidx.room.Room;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.core.ids.AppletTileInstallationSectionId;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.wallet.viewmodels.CardAppletTileViewModel;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.StateFlowKt$stateFlowOf$1;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public final class CardAppletTile implements AppletTile {
    public final StateFlowKt$stateFlowOf$1 installationSectionId;
    public final DerivedStateFlow installationState;
    public final StateFlow models;
    public final Function0 onClick;
    public final Function0 onPromotedClick;
    public final Function0 onUninstalledClick;

    public CardAppletTile(StateFlow stateFlow, Function0 function0, Function0 function02, Function0 function03) {
        stateFlow.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        this.models = stateFlow;
        this.onClick = function0;
        this.onPromotedClick = function02;
        this.onUninstalledClick = function03;
        this.installationSectionId = new StateFlowKt$stateFlowOf$1(AppletTileInstallationSectionId.CARD_INSTALLED);
        this.installationState = StateFlowKt.mapState(stateFlow, new CardAppletTile$$ExternalSyntheticLambda0(0));
    }

    public final void CardStackOverlayUI(Composer composer, final int i) {
        int i2;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        CardSchemeViewModel.Module.HeroTag activeHeroTag;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(407543263);
        final int i3 = 4;
        final int i4 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        final int i5 = 1;
        final int i6 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            CardRegistry cardRegistry = (CardRegistry) gapComposer.consume(CardTransitionKt.LocalCardRegistry);
            if (cardRegistry == null || (activeHeroTag = cardRegistry.getActiveHeroTag()) == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                } else {
                    function2 = new Function2(this) { // from class: com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda6
                        public final /* synthetic */ CardAppletTile f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i7 = i6;
                            int i8 = i;
                            CardAppletTile cardAppletTile = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i7) {
                                case 0:
                                    cardAppletTile.CardStackOverlayUI(composer2, Updater.updateChangedFlags(i8 | 1));
                                    break;
                                case 1:
                                    cardAppletTile.CardStackOverlayUI(composer2, Updater.updateChangedFlags(i8 | 1));
                                    break;
                                case 2:
                                    cardAppletTile.CardStackOverlayUI(composer2, Updater.updateChangedFlags(i8 | 1));
                                    break;
                                case 3:
                                    cardAppletTile.CardStackOverlayUI(composer2, Updater.updateChangedFlags(i8 | 1));
                                    break;
                                default:
                                    cardAppletTile.CardStackOverlayUI(composer2, Updater.updateChangedFlags(i8 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                }
            } else {
                CardAppletTileViewModel cardAppletTileViewModel = (CardAppletTileViewModel) Updater.collectAsState(this.models, null, gapComposer, 1).getValue();
                if (cardAppletTileViewModel instanceof CardAppletTileViewModel.Installed) {
                    gapComposer.startReplaceGroup(-750989995);
                    CardAppletTileViewModel.Installed installed = (CardAppletTileViewModel.Installed) cardAppletTileViewModel;
                    CardAppletTileViewModel.CardPillViewModel pillModel = CardAppletTileKt.pillModel(activeHeroTag, installed.pill, gapComposer);
                    if (pillModel == null) {
                        gapComposer.end(false);
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        } else {
                            function2 = new Function2(this) { // from class: com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda6
                                public final /* synthetic */ CardAppletTile f$0;

                                {
                                    this.f$0 = this;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    int i7 = i4;
                                    int i8 = i;
                                    CardAppletTile cardAppletTile = this.f$0;
                                    Composer composer2 = (Composer) obj;
                                    ((Integer) obj2).getClass();
                                    switch (i7) {
                                        case 0:
                                            cardAppletTile.CardStackOverlayUI(composer2, Updater.updateChangedFlags(i8 | 1));
                                            break;
                                        case 1:
                                            cardAppletTile.CardStackOverlayUI(composer2, Updater.updateChangedFlags(i8 | 1));
                                            break;
                                        case 2:
                                            cardAppletTile.CardStackOverlayUI(composer2, Updater.updateChangedFlags(i8 | 1));
                                            break;
                                        case 3:
                                            cardAppletTile.CardStackOverlayUI(composer2, Updater.updateChangedFlags(i8 | 1));
                                            break;
                                        default:
                                            cardAppletTile.CardStackOverlayUI(composer2, Updater.updateChangedFlags(i8 | 1));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                        }
                    } else {
                        CardAppletTileKt.CardPillOverlay(installed.model, pillModel, null, gapComposer, 0);
                        gapComposer.end(false);
                    }
                } else if (cardAppletTileViewModel instanceof CardAppletTileViewModel.Uninstalled) {
                    gapComposer.startReplaceGroup(-750756844);
                    Pair pair = (Pair) CollectionsKt.firstOrNull(((CardAppletTileViewModel.Uninstalled) cardAppletTileViewModel).rotatingCards);
                    if (pair == null) {
                        gapComposer.end(false);
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        final int i7 = 3;
                        function2 = new Function2(this) { // from class: com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda6
                            public final /* synthetic */ CardAppletTile f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i72 = i7;
                                int i8 = i;
                                CardAppletTile cardAppletTile = this.f$0;
                                Composer composer2 = (Composer) obj;
                                ((Integer) obj2).getClass();
                                switch (i72) {
                                    case 0:
                                        cardAppletTile.CardStackOverlayUI(composer2, Updater.updateChangedFlags(i8 | 1));
                                        break;
                                    case 1:
                                        cardAppletTile.CardStackOverlayUI(composer2, Updater.updateChangedFlags(i8 | 1));
                                        break;
                                    case 2:
                                        cardAppletTile.CardStackOverlayUI(composer2, Updater.updateChangedFlags(i8 | 1));
                                        break;
                                    case 3:
                                        cardAppletTile.CardStackOverlayUI(composer2, Updater.updateChangedFlags(i8 | 1));
                                        break;
                                    default:
                                        cardAppletTile.CardStackOverlayUI(composer2, Updater.updateChangedFlags(i8 | 1));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        CardSchemeViewModel.Module.HeroCardDetails heroCardDetails = (CardSchemeViewModel.Module.HeroCardDetails) pair.first;
                        CardAppletTileViewModel.CardPillViewModel pillModel2 = CardAppletTileKt.pillModel(activeHeroTag, (CardAppletTileViewModel.CardPillViewModel) pair.second, gapComposer);
                        if (pillModel2 == null) {
                            gapComposer.end(false);
                            endRestartGroup = gapComposer.endRestartGroup();
                            if (endRestartGroup == null) {
                                return;
                            } else {
                                function2 = new Function2(this) { // from class: com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda6
                                    public final /* synthetic */ CardAppletTile f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        int i72 = i3;
                                        int i8 = i;
                                        CardAppletTile cardAppletTile = this.f$0;
                                        Composer composer2 = (Composer) obj;
                                        ((Integer) obj2).getClass();
                                        switch (i72) {
                                            case 0:
                                                cardAppletTile.CardStackOverlayUI(composer2, Updater.updateChangedFlags(i8 | 1));
                                                break;
                                            case 1:
                                                cardAppletTile.CardStackOverlayUI(composer2, Updater.updateChangedFlags(i8 | 1));
                                                break;
                                            case 2:
                                                cardAppletTile.CardStackOverlayUI(composer2, Updater.updateChangedFlags(i8 | 1));
                                                break;
                                            case 3:
                                                cardAppletTile.CardStackOverlayUI(composer2, Updater.updateChangedFlags(i8 | 1));
                                                break;
                                            default:
                                                cardAppletTile.CardStackOverlayUI(composer2, Updater.updateChangedFlags(i8 | 1));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                            }
                        } else {
                            CardAppletTileKt.CardPillOverlay(heroCardDetails, pillModel2, null, gapComposer, 0);
                            gapComposer.end(false);
                        }
                    }
                } else {
                    if (!(cardAppletTileViewModel instanceof CardAppletTileViewModel.Loading) && !(cardAppletTileViewModel instanceof CardAppletTileViewModel.WithCardUi)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 807057173, false);
                    }
                    gapComposer.startReplaceGroup(807077379);
                    gapComposer.end(false);
                }
            }
            endRestartGroup.block = function2;
        }
        gapComposer.skipToGroupEnd();
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new Function2(this) { // from class: com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda6
                public final /* synthetic */ CardAppletTile f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i72 = i5;
                    int i8 = i;
                    CardAppletTile cardAppletTile = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i72) {
                        case 0:
                            cardAppletTile.CardStackOverlayUI(composer2, Updater.updateChangedFlags(i8 | 1));
                            break;
                        case 1:
                            cardAppletTile.CardStackOverlayUI(composer2, Updater.updateChangedFlags(i8 | 1));
                            break;
                        case 2:
                            cardAppletTile.CardStackOverlayUI(composer2, Updater.updateChangedFlags(i8 | 1));
                            break;
                        case 3:
                            cardAppletTile.CardStackOverlayUI(composer2, Updater.updateChangedFlags(i8 | 1));
                            break;
                        default:
                            cardAppletTile.CardStackOverlayUI(composer2, Updater.updateChangedFlags(i8 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final void PromotedUI(AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        int i2;
        appletTileAppearance.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1360207009);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(appletTileAppearance) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            CardAppletTileViewModel cardAppletTileViewModel = (CardAppletTileViewModel) Updater.collectAsState(this.models, null, gapComposer, 1).getValue();
            if (cardAppletTileViewModel instanceof CardAppletTileViewModel.Uninstalled) {
                gapComposer.startReplaceGroup(1089599702);
                PromotedAppletTileViewModel.Loaded loaded = ((CardAppletTileViewModel.Uninstalled) cardAppletTileViewModel).promotedTileModel;
                if (loaded == null) {
                    gapComposer.startReplaceGroup(-1488868833);
                    loaded = new PromotedAppletTileViewModel.Loaded(Room.stringResource(gapComposer, R.string.promoted_card_title), Room.stringResource(gapComposer, R.string.promoted_card_subtitle), 2131233367, null);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1488871127);
                    gapComposer.end(false);
                }
                boolean changedInstance = gapComposer.changedInstance(this);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new AlertBannerKt$$ExternalSyntheticLambda3(this, 15);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                SharedUIKt.PromotedAppletTile(loaded, (Function1) rememberedValue, null, gapComposer, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1488857459);
                UI(appletTileAppearance, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardAppletTile$$ExternalSyntheticLambda2(this, appletTileAppearance, i, 1);
        }
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final void UI(AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        int i2;
        appletTileAppearance.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-44239709);
        if ((i & 48) == 0) {
            i2 = (gapComposer.changedInstance(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
            int ordinal = ((CardAppletTileRenderMode) gapComposer.consume(CardAppletTileKt.LocalCardAppletTileRenderMode)).ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(609925238);
                CardAppletTileKt.UI((CardAppletTileViewModel) Updater.collectAsState(this.models, null, gapComposer, 1).getValue(), this.onClick, TestTagKt.testTag(Modifier.Companion.$$INSTANCE, "card_applet_tile"), gapComposer, MLKEMEngine.KyberPolyBytes);
                gapComposer.end(false);
            } else {
                if (ordinal != 1) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 435314417, false);
                }
                gapComposer.startReplaceGroup(435322967);
                CardStackOverlayUI(gapComposer, (i2 >> 3) & 14);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardAppletTile$$ExternalSyntheticLambda2(this, appletTileAppearance, i, 2);
        }
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final void UninstalledRowUI(AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        int i2;
        appletTileAppearance.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2042402378);
        if ((i & 48) == 0) {
            i2 = (gapComposer.changedInstance(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
            SharedUIKt.AppletTileRow(null, Expect_jvmKt.rememberComposableLambda(910530816, new CardAppletTile$$ExternalSyntheticLambda1(this, 0), gapComposer), gapComposer, 48, 1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardAppletTile$$ExternalSyntheticLambda2(this, appletTileAppearance, i, 0);
        }
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final StateFlow getInstallationSectionId() {
        return this.installationSectionId;
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final StateFlow getInstallationState() {
        return this.installationState;
    }
}
