package com.squareup.cash.wallet.views;

import android.os.Build;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.OutlinedTextFieldKt$$ExternalSyntheticLambda4;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda3;
import androidx.compose.material.TextFieldKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.LazyWindowInfo;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityImpl;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda30;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsh;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.card.onboarding.CardPillTheme;
import com.squareup.cash.card.onboarding.CardPillThemesKt;
import com.squareup.cash.card.onboarding.StyledCardViewKt;
import com.squareup.cash.card.onboarding.StyledCardViewModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda10;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda3;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.taptopay.views.TapToPayKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.views.TaxReturnsView$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.wallet.viewmodels.CardAppletTileViewModel;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.workers.CardAppletWorker$setup$1$2$1;
import com.squareup.cash.work.views.WorkViewFactory$$ExternalSyntheticLambda12;
import com.squareup.util.compose.LifecycleKt$$ExternalSyntheticLambda0;
import dev.chrisbanes.haze.HazeKt;
import dev.chrisbanes.haze.HazeState;
import dev.chrisbanes.haze.HazeStyle;
import dev.chrisbanes.haze.HazeTint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class CardAppletTileKt {
    public static final StaticProvidableCompositionLocal LocalCardAppletTileRenderMode = new StaticProvidableCompositionLocal(new AlertBannerKt$$ExternalSyntheticLambda0(16));

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardSchemeViewModel.Module.HeroTag.PhysicalTagOrderState.values().length];
            try {
                CardSchemeViewModel.Module.HeroTag.PhysicalTagOrderState physicalTagOrderState = CardSchemeViewModel.Module.HeroTag.PhysicalTagOrderState.PREPARING;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CardSchemeViewModel.Module.HeroTag.PhysicalTagOrderState physicalTagOrderState2 = CardSchemeViewModel.Module.HeroTag.PhysicalTagOrderState.PREPARING;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CardSchemeViewModel.Module.HeroTag.PhysicalTagOrderState physicalTagOrderState3 = CardSchemeViewModel.Module.HeroTag.PhysicalTagOrderState.PREPARING;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void CardAppletTileRow(int i, Composer composer, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Function0 function0) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1036545896);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1155439075, new TaxReturnsView$$ExternalSyntheticLambda1(22, modifier, function0, composableLambdaImpl), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardAppletTileKt$$ExternalSyntheticLambda24(modifier, function0, composableLambdaImpl, i, 0);
        }
    }

    public static final void CardPillOverlay(CardSchemeViewModel.Module.HeroCardDetails heroCardDetails, CardAppletTileViewModel.CardPillViewModel cardPillViewModel, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-72874460);
        int i2 = (gapComposer.changedInstance(heroCardDetails) ? 4 : 2) | i | (gapComposer.changedInstance(cardPillViewModel) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if (cardPillViewModel.isHidden) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new WorkViewFactory$$ExternalSyntheticLambda12(heroCardDetails, cardPillViewModel, i, 17);
                    return;
                }
                return;
            }
            HazeState hazeState = (HazeState) gapComposer.consume(CardTransitionKt.LocalCardPillHazeState);
            HazeState rememberHazeState = HazeKt.rememberHazeState(gapComposer);
            if (hazeState != null) {
                rememberHazeState = hazeState;
            }
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalDensity;
            float density = ((Density) gapComposer.consume(staticProvidableCompositionLocal)).getDensity();
            MutableState cardQuickFadeInOut = CardTransitionKt.cardQuickFadeInOut(0, 1, gapComposer);
            State state = (State) gapComposer.consume(CardTransitionKt.LocalCardPillFadeOpacity);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier then = OffsetKt.aspectRatio(1.5857725f, SizeKt.m292widthInVpY3zN4$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.TopCenter, 2), RecyclerView.DECELERATION_RATE, PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.wallet_card_max_width), 1), false).then(hazeState == null ? HazeKt.hazeSource$default(companion, rememberHazeState) : companion);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Updater.CompositionLocalProvider(staticProvidableCompositionLocal.defaultProvidedValue$runtime(new DensityImpl(density, 1.0f)), Expect_jvmKt.rememberComposableLambda(-1860354838, new CashMapViewKt$$ExternalSyntheticLambda15(cardQuickFadeInOut, state, rememberHazeState, heroCardDetails, cardPillViewModel, 25), gapComposer), gapComposer, 56);
            gapComposer.end(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new TaxReturnsView$$ExternalSyntheticLambda1(heroCardDetails, cardPillViewModel, modifier2, i, 23);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    public static final void CardWithPill(boolean z, boolean z2, CardSchemeViewModel.Module.HeroCardDetails heroCardDetails, CardAppletTileViewModel.CardPillViewModel cardPillViewModel, StyledCardViewModel styledCardViewModel, Composer composer, int i) {
        GapComposer gapComposer;
        int i2;
        HazeState hazeState;
        Object obj;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        Modifier cardTransition;
        boolean z3;
        MutableState mutableState;
        ?? r0;
        int i3;
        Easing easing;
        int i4;
        float f;
        GapComposer gapComposer2;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-1869726902);
        Applier applier = gapComposer3.applier;
        int i5 = i | (gapComposer3.changed(z) ? 4 : 2) | (gapComposer3.changed(z2) ? 32 : 16) | (gapComposer3.changedInstance(heroCardDetails) ? 256 : 128) | (gapComposer3.changedInstance(cardPillViewModel) ? 2048 : 1024) | (gapComposer3.changedInstance(styledCardViewModel) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer3.shouldExecute(i5 & 1, (74899 & i5) != 74898)) {
            BiasAlignment biasAlignment = Alignment.Companion.TopStart;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, companion);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(function0);
            } else {
                gapComposer3.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$14);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$15);
            HazeState rememberHazeState = HazeKt.rememberHazeState(gapComposer3);
            Object rememberedValue = gapComposer3.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (rememberedValue == obj2) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer3.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            String str = heroCardDetails.cardTheme.token;
            if (str == null) {
                gapComposer3.startReplaceGroup(-140836031);
                gapComposer3.end(false);
                z3 = false;
                i2 = i5;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                hazeState = rememberHazeState;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$14;
                obj = obj2;
                cardTransition = null;
            } else {
                gapComposer3.startReplaceGroup(-140836030);
                int i6 = ((i5 << 3) & 896) | 6;
                i2 = i5;
                hazeState = rememberHazeState;
                obj = obj2;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$14;
                cardTransition = CardTransitionKt.cardTransition(i6, 0, gapComposer3, companion, str, z2);
                z3 = false;
                gapComposer3.end(false);
            }
            if (cardTransition == null) {
                cardTransition = companion;
            }
            Modifier then = HazeKt.hazeSource$default(companion, hazeState).then(cardTransition);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z3);
            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, then);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(function0);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$12);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$1, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$15);
            Object rememberedValue2 = gapComposer3.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer3.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState3 = (MutableState) rememberedValue2;
            Object rememberedValue3 = gapComposer3.rememberedValue();
            Object obj3 = rememberedValue3;
            if (rememberedValue3 == obj) {
                InteractiveCardState interactiveCardState = new InteractiveCardState();
                interactiveCardState.touchEnabled$delegate.setValue(Boolean.FALSE);
                gapComposer3.updateRememberedValue(interactiveCardState);
                obj3 = interactiveCardState;
            }
            InteractiveCardState interactiveCardState2 = (InteractiveCardState) obj3;
            float f2 = RecyclerView.DECELERATION_RATE;
            if (!z || ((Boolean) mutableState3.getValue()).booleanValue()) {
                mutableState = mutableState2;
                r0 = 1;
                gapComposer3.startReplaceGroup(-926117540);
                Object transitionType = CardTransitionKt.getTransitionType(gapComposer3);
                MutableState rememberUpdatedState = Updater.rememberUpdatedState(Boolean.valueOf(CardTransitionKt.isTransitioningCard(gapComposer3)), gapComposer3);
                Object rememberedValue4 = gapComposer3.rememberedValue();
                if (rememberedValue4 == obj) {
                    rememberedValue4 = Float.valueOf(((Boolean) rememberUpdatedState.getValue()).booleanValue() ? 0.0f : 1.0f);
                    gapComposer3.updateRememberedValue(rememberedValue4);
                }
                Float valueOf2 = Float.valueOf(((Number) rememberedValue4).floatValue());
                boolean changed = gapComposer3.changed(transitionType) | gapComposer3.changed(rememberUpdatedState);
                Object rememberedValue5 = gapComposer3.rememberedValue();
                if (changed || rememberedValue5 == obj) {
                    rememberedValue5 = new CardAppletWorker$setup$1$2$1(transitionType, rememberUpdatedState, (Continuation) null, 9);
                    gapComposer3.updateRememberedValue(rememberedValue5);
                }
                MutableState produceState = Updater.produceState(gapComposer3, valueOf2, (Function2) rememberedValue5);
                mutableState.setValue(Boolean.TRUE);
                CardRegistry cardRegistry = (CardRegistry) gapComposer3.consume(CardTransitionKt.LocalCardRegistry);
                boolean changed2 = gapComposer3.changed(produceState);
                Object rememberedValue6 = gapComposer3.rememberedValue();
                if (changed2 || rememberedValue6 == obj) {
                    rememberedValue6 = new MoneyTabUIKt$$ExternalSyntheticLambda10(produceState, 20);
                    gapComposer3.updateRememberedValue(rememberedValue6);
                }
                Modifier graphicsLayer = ColorKt.graphicsLayer(companion, (Function1) rememberedValue6);
                boolean changedInstance = gapComposer3.changedInstance(cardRegistry);
                Object rememberedValue7 = gapComposer3.rememberedValue();
                if (changedInstance || rememberedValue7 == obj) {
                    rememberedValue7 = new CardAppletTileKt$$ExternalSyntheticLambda31(cardRegistry, 0);
                    gapComposer3.updateRememberedValue(rememberedValue7);
                }
                i3 = 6;
                easing = null;
                i4 = 0;
                f = 1.0f;
                StyledCardViewKt.m3439StyledCardnSlTg7c(styledCardViewModel, graphicsLayer, (Function1) rememberedValue7, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, false, gapComposer3, (i2 >> 12) & 14, 56);
                GapComposer gapComposer4 = gapComposer3;
                gapComposer4.end(false);
                gapComposer2 = gapComposer4;
            } else {
                gapComposer3.startReplaceGroup(-926723001);
                mutableState = mutableState2;
                r0 = 1;
                zzsh.WindowBoundLifecycle(Expect_jvmKt.rememberComposableLambda(1438372954, new LocalHomeGeoViewKt$$ExternalSyntheticLambda30(interactiveCardState2, heroCardDetails, z2, mutableState, mutableState3), gapComposer3), gapComposer3, 6);
                gapComposer3.end(false);
                i3 = 6;
                f = 1.0f;
                easing = null;
                i4 = 0;
                gapComposer2 = gapComposer3;
            }
            gapComposer2.end(r0);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalDensity;
            float density = ((Density) gapComposer2.consume(staticProvidableCompositionLocal)).getDensity();
            MutableState cardQuickFadeInOut = CardTransitionKt.cardQuickFadeInOut(i4, r0, gapComposer2);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                f2 = f;
            }
            Composer composer2 = gapComposer2;
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f2, AnimatableKt.tween$default(200, i4, easing, i3), null, null, composer2, 0, 28);
            GapComposer gapComposer5 = composer2;
            State state = (State) gapComposer5.consume(CardTransitionKt.LocalCardPillFadeOpacity);
            if (cardPillViewModel.isHidden) {
                gapComposer5.startReplaceGroup(-138418030);
                gapComposer5.end(i4);
            } else {
                gapComposer5.startReplaceGroup(-139122443);
                Updater.CompositionLocalProvider(staticProvidableCompositionLocal.defaultProvidedValue$runtime(new DensityImpl(density, f)), Expect_jvmKt.rememberComposableLambda(-477123541, new WalletHomeViewKt$$ExternalSyntheticLambda2(animateFloatAsState, cardQuickFadeInOut, state, hazeState, heroCardDetails, cardPillViewModel, 1), gapComposer5), gapComposer5, 56);
                gapComposer5.end(i4);
            }
            gapComposer5.end(r0);
            gapComposer = gapComposer5;
        } else {
            gapComposer3.skipToGroupEnd();
            gapComposer = gapComposer3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OutlinedTextFieldKt$$ExternalSyntheticLambda4(z, z2, heroCardDetails, cardPillViewModel, styledCardViewModel, i, 2);
        }
    }

    public static final void LoadingCardWithPill(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-244468220);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier aspectRatio = OffsetKt.aspectRatio(1.5857725f, companion, false);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, aspectRatio);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier clip = ClipKt.clip(SizeKt.m287sizeVpY3zN4(SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 16.0f), 94.0f, 28.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(100.0f));
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(clip, colors.semantic.background.subtle, ColorKt.RectangleShape), gapComposer, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TapToPayKt$$ExternalSyntheticLambda0(i, 26);
        }
    }

    public static final void PillUi(Modifier modifier, HazeState hazeState, CardPillTheme cardPillTheme, CardAppletTileViewModel.CardPillViewModel cardPillViewModel, Composer composer, int i) {
        boolean z;
        Throwable th;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1;
        Modifier.Companion companion;
        Modifier m177backgroundbw27NRU;
        long m675copywmQWz5c$default;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1937811033);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changed(hazeState) ? 32 : 16) | (gapComposer.changed(cardPillTheme.ordinal()) ? 256 : 128) | (gapComposer.changedInstance(cardPillViewModel) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = Build.VERSION.SDK_INT >= 32;
            Color color = cardPillTheme.fallbackColor;
            long j = cardPillTheme.textColor;
            boolean z3 = cardPillTheme.isDark;
            boolean z4 = color != null;
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Modifier clip = ClipKt.clip(modifier, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(100.0f));
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$12 = ColorKt.RectangleShape;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (z2) {
                gapComposer.startReplaceGroup(-672507819);
                long j2 = ((ColorScheme) gapComposer.consume(ColorSchemeKt.LocalColorScheme)).surface;
                z = z2;
                HazeTint hazeTint = new HazeTint(z3 ? CardPillThemesKt.HAZE_ULTRA_THIN_DARK_BACKGROUND_COLOR : CardPillThemesKt.HAZE_ULTRA_THIN_LIGHT_BACKGROUND_COLOR, z3 ? 15 : 18, null);
                if (z3) {
                    th = null;
                    rectangleShapeKt$RectangleShape$1 = rectangleShapeKt$RectangleShape$12;
                    m675copywmQWz5c$default = Color.m675copywmQWz5c$default(0.55f, CardPillThemesKt.HAZE_DARK_COLOR, 14);
                } else {
                    th = null;
                    rectangleShapeKt$RectangleShape$1 = rectangleShapeKt$RectangleShape$12;
                    m675copywmQWz5c$default = Color.m675copywmQWz5c$default(0.44f, CardPillThemesKt.HAZE_ULTRA_THIN_LIGHT_FOREGROUND_COLOR, 14);
                }
                m177backgroundbw27NRU = HazeKt.hazeEffect$default(hazeState, new HazeStyle(j2, CollectionsKt__CollectionsKt.listOf((Object[]) new HazeTint[]{hazeTint, new HazeTint(m675copywmQWz5c$default)}), 24));
                gapComposer.end(false);
                companion = companion2;
            } else {
                z = z2;
                th = null;
                rectangleShapeKt$RectangleShape$1 = rectangleShapeKt$RectangleShape$12;
                gapComposer.startReplaceGroup(-672401334);
                gapComposer.end(false);
                Color color2 = cardPillTheme.fallbackColor;
                companion = companion2;
                m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, color2 != null ? color2.value : Color.Black, rectangleShapeKt$RectangleShape$1);
            }
            Modifier then = clip.then(m177backgroundbw27NRU);
            Color color3 = cardPillTheme.scrimColorLayer;
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(then.then(color3 != null ? ImageKt.m177backgroundbw27NRU(companion, color3.value, rectangleShapeKt$RectangleShape$1) : companion), 12.0f, 4.0f);
            boolean changedInstance = gapComposer.changedInstance(cardPillViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new AlertBannerKt$$ExternalSyntheticLambda3(cardPillViewModel, 16);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m299paddingVpY3zN4, false, (Function1) rememberedValue);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw th;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier.Companion companion3 = companion;
            Trace.m1191Iconww6aTOc(cardPillViewModel.icon, (String) null, (Modifier) null, (z || z4) ? j : Color.White, gapComposer, 48, 4);
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion3, 6.0f));
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new CardAppletTile$$ExternalSyntheticLambda0(11);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, (z || z4) ? j : Color.White, (Composer) gapComposer, SemanticsModifierKt.clearAndSetSemantics(companion3, (Function1) rememberedValue2), ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).helpText, (TextLineBalancing) null, cardPillViewModel.text, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LifecycleKt$$ExternalSyntheticLambda0(modifier, i, hazeState, cardPillTheme, cardPillViewModel, 14);
        }
    }

    public static final void RevolvingCardWithPill(Modifier modifier, final boolean z, final List list, final boolean z2, final boolean z3, final boolean z4, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(464123999);
        int i2 = i | 6 | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changedInstance(list) ? 256 : 128) | (gapComposer.changed(z2) ? 2048 : 1024) | (gapComposer.changed(z3) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(z4) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            UiScopeKt.UiScope(Expect_jvmKt.rememberComposableLambda(-286035236, new Function3() { // from class: com.squareup.cash.wallet.views.CardAppletTileKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i3;
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((UiScope) obj).getClass();
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    boolean shouldExecute = gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16);
                    Applier applier = gapComposer2.applier;
                    if (shouldExecute) {
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = CardTransitionKt.LocalCardRegistry;
                        float m939getContainerSizeYbymL2g = ((int) (((LazyWindowInfo) ((WindowInfo) gapComposer2.consume(CompositionLocalsKt.LocalWindowInfo))).m939getContainerSizeYbymL2g() & BodyPartID.bodyIdMax)) * 0.25f;
                        CardRegistry cardRegistry = (CardRegistry) gapComposer2.consume(CardTransitionKt.LocalCardRegistry);
                        boolean changedInstance = gapComposer2.changedInstance(cardRegistry) | gapComposer2.changed(m939getContainerSizeYbymL2g);
                        Object rememberedValue = gapComposer2.rememberedValue();
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        if (changedInstance || rememberedValue == neverEqualPolicy) {
                            rememberedValue = new TextFieldKt$$ExternalSyntheticLambda0(cardRegistry, m939getContainerSizeYbymL2g, 5);
                            gapComposer2.updateRememberedValue(rememberedValue);
                        }
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        Modifier graphicsLayer = ColorKt.graphicsLayer(companion, (Function1) rememberedValue);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                        int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, graphicsLayer);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer2.useNode();
                        }
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                        Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                        Integer valueOf = Integer.valueOf(hashCode);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                        Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                        Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                        HazeState rememberHazeState = HazeKt.rememberHazeState(gapComposer2);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        final MutableState mutableState = (MutableState) rememberedValue2;
                        final MutableState rememberUpdatedState = Updater.rememberUpdatedState(list, gapComposer2);
                        Object rememberedValue3 = gapComposer2.rememberedValue();
                        if (rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = Updater.mutableStateOf$default(null);
                            gapComposer2.updateRememberedValue(rememberedValue3);
                        }
                        final MutableState mutableState2 = (MutableState) rememberedValue3;
                        Modifier hazeSource$default = HazeKt.hazeSource$default(companion, rememberHazeState);
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                        int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, hazeSource$default);
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer2.useNode();
                        }
                        Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                        final boolean z5 = z;
                        final boolean z6 = z2;
                        final boolean z7 = z3;
                        final boolean z8 = z4;
                        zzsh.WindowBoundLifecycle(Expect_jvmKt.rememberComposableLambda(-1536280559, new Function2() { // from class: com.squareup.cash.wallet.views.CardAppletTileKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer3 = (Composer) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    MutableState mutableState3 = rememberUpdatedState;
                                    List list2 = (List) mutableState3.getValue();
                                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                    Iterator it = list2.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add((CardSchemeViewModel.Module.HeroCardDetails) ((Pair) it.next()).first);
                                    }
                                    boolean changed = gapComposer3.changed(mutableState3);
                                    Object rememberedValue4 = gapComposer3.rememberedValue();
                                    if (changed || rememberedValue4 == Composer.Companion.Empty) {
                                        rememberedValue4 = new CardTransitionKt$$ExternalSyntheticLambda4(17, mutableState, mutableState3, mutableState2);
                                        gapComposer3.updateRememberedValue(rememberedValue4);
                                    }
                                    RevolvingInteractiveCardsKt.RevolvingInteractiveCards(null, arrayList, z5, (Function1) rememberedValue4, CardNuxAnimationsKt.DEFAULT_REVOLVING_CROSSFADE, false, z6, z7, z8, gapComposer3, 0, 33);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer2), gapComposer2, 6);
                        gapComposer2.end(true);
                        Pair pair = (Pair) mutableState2.getValue();
                        if (pair == null) {
                            gapComposer2.startReplaceGroup(555528528);
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(555528529);
                            CardSchemeViewModel.Module.HeroCardDetails heroCardDetails = (CardSchemeViewModel.Module.HeroCardDetails) pair.first;
                            CardAppletTileViewModel.CardPillViewModel cardPillViewModel = (CardAppletTileViewModel.CardPillViewModel) pair.second;
                            CardPillTheme cardPillTheme = CardPillThemesKt.toCardPillTheme(heroCardDetails.cardTheme.id);
                            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = CompositionLocalsKt.LocalDensity;
                            float density = ((Density) gapComposer2.consume(staticProvidableCompositionLocal2)).getDensity();
                            State cardNuxAnimation = CardTransitionKt.cardNuxAnimation(gapComposer2);
                            Object rememberedValue4 = gapComposer2.rememberedValue();
                            if (rememberedValue4 == neverEqualPolicy) {
                                i3 = 0;
                                rememberedValue4 = Updater.derivedStateOf(new CardAppletTileKt$$ExternalSyntheticLambda1(cardNuxAnimation, 0));
                                gapComposer2.updateRememberedValue(rememberedValue4);
                            } else {
                                i3 = 0;
                            }
                            Updater.CompositionLocalProvider(staticProvidableCompositionLocal2.defaultProvidedValue$runtime(new DensityImpl(density, 1.0f)), Expect_jvmKt.rememberComposableLambda(1633356205, new SwipeToDismissKt$$ExternalSyntheticLambda3(cardPillViewModel, cardPillTheme, AnimateAsStateKt.animateFloatAsState((!((Boolean) mutableState.getValue()).booleanValue() || ((Boolean) ((State) rememberedValue4).getValue()).booleanValue()) ? 0.0f : 1.0f, AnimatableKt.tween$default(200, 0, null, 6), null, null, gapComposer2, 0, 28), CardTransitionKt.cardQuickFadeInOut(i3, 1, gapComposer2), (State) gapComposer2.consume(CardTransitionKt.LocalCardPillFadeOpacity), rememberHazeState, 29), gapComposer2), gapComposer2, 56);
                            gapComposer2.end(false);
                        }
                        gapComposer2.end(true);
                    } else {
                        gapComposer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 6);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardAppletTileKt$$ExternalSyntheticLambda22(modifier2, z, list, z2, z3, z4, i);
        }
    }

    public static final void UI(final CardAppletTileViewModel cardAppletTileViewModel, final Function0 function0, final Modifier modifier, Composer composer, final int i) {
        RecomposeScopeImpl recomposeScopeImpl;
        Function2 function2;
        Pair pair;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1145489954);
        int i2 = i | (gapComposer.changedInstance(cardAppletTileViewModel) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier m292widthInVpY3zN4$default = SizeKt.m292widthInVpY3zN4$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth(modifier, 1.0f), Alignment.Companion.TopCenter, 2), RecyclerView.DECELERATION_RATE, PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.wallet_card_max_width), 1);
            if (cardAppletTileViewModel instanceof CardAppletTileViewModel.WithCardUi) {
                gapComposer.startReplaceGroup(-1775692331);
                CardAppletTileViewModel.WithCardUi withCardUi = (CardAppletTileViewModel.WithCardUi) cardAppletTileViewModel;
                if (withCardUi instanceof CardAppletTileViewModel.Installed) {
                    CardAppletTileViewModel.Installed installed = (CardAppletTileViewModel.Installed) cardAppletTileViewModel;
                    pair = new Pair(installed.model, installed.pill);
                } else {
                    if (!(withCardUi instanceof CardAppletTileViewModel.Uninstalled)) {
                        gapComposer.end(false);
                        recomposeScopeImpl = gapComposer.endRestartGroup();
                        if (recomposeScopeImpl != null) {
                            final int i3 = 0;
                            function2 = new Function2(cardAppletTileViewModel, function0, modifier, i, i3) { // from class: com.squareup.cash.wallet.views.CardAppletTileKt$$ExternalSyntheticLambda17
                                public final /* synthetic */ int $r8$classId;
                                public final /* synthetic */ CardAppletTileViewModel f$0;
                                public final /* synthetic */ Function0 f$1;
                                public final /* synthetic */ Modifier f$2;

                                {
                                    this.$r8$classId = i3;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    int i4 = this.$r8$classId;
                                    Composer composer2 = (Composer) obj;
                                    ((Integer) obj2).getClass();
                                    switch (i4) {
                                        case 0:
                                            CardAppletTileKt.UI(this.f$0, this.f$1, this.f$2, composer2, Updater.updateChangedFlags(385));
                                            break;
                                        default:
                                            CardAppletTileKt.UI(this.f$0, this.f$1, this.f$2, composer2, Updater.updateChangedFlags(385));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            recomposeScopeImpl.block = function2;
                        }
                        return;
                    }
                    pair = (Pair) ((CardAppletTileViewModel.Uninstalled) cardAppletTileViewModel).rotatingCards.get(0);
                }
                CardSchemeViewModel.Module.HeroCardDetails heroCardDetails = (CardSchemeViewModel.Module.HeroCardDetails) pair.first;
                String str = heroCardDetails.cashtag;
                if (str == null) {
                    str = "";
                }
                CardSchemeViewModel.Module.CustomizationImage customizationImage = heroCardDetails.customizationImage;
                StyledCardViewModel styledCardViewModel = new StyledCardViewModel(str, customizationImage == null, heroCardDetails.cardTheme, false, null, customizationImage != null ? customizationImage.bytes : null, false, null, null, null, null, null, null, 64984);
                int i4 = i2 & 112;
                boolean changedInstance = gapComposer.changedInstance(cardAppletTileViewModel) | (i4 == 32);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new BottomSheet$$ExternalSyntheticLambda3(27, cardAppletTileViewModel, function0);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                CardAppletTileRow(i4 | MLKEMEngine.KyberPolyBytes, gapComposer, Expect_jvmKt.rememberComposableLambda(-1775057887, new TabToolbarsKt$$ExternalSyntheticLambda3(29, cardAppletTileViewModel, styledCardViewModel), gapComposer), SemanticsModifierKt.semantics(m292widthInVpY3zN4$default, true, (Function1) rememberedValue), function0);
                gapComposer.end(false);
            } else {
                if (!(cardAppletTileViewModel instanceof CardAppletTileViewModel.Loading)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1304207153, false);
                }
                gapComposer.startReplaceGroup(-1773874925);
                CardAppletTileRow((i2 & 112) | MLKEMEngine.KyberPolyBytes, gapComposer, UtilsKt.lambda$1413459481, m292widthInVpY3zN4$default, function0);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        recomposeScopeImpl = gapComposer.endRestartGroup();
        if (recomposeScopeImpl != null) {
            final int i5 = 1;
            function2 = new Function2(cardAppletTileViewModel, function0, modifier, i, i5) { // from class: com.squareup.cash.wallet.views.CardAppletTileKt$$ExternalSyntheticLambda17
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ CardAppletTileViewModel f$0;
                public final /* synthetic */ Function0 f$1;
                public final /* synthetic */ Modifier f$2;

                {
                    this.$r8$classId = i5;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = this.$r8$classId;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            CardAppletTileKt.UI(this.f$0, this.f$1, this.f$2, composer2, Updater.updateChangedFlags(385));
                            break;
                        default:
                            CardAppletTileKt.UI(this.f$0, this.f$1, this.f$2, composer2, Updater.updateChangedFlags(385));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            recomposeScopeImpl.block = function2;
        }
    }

    public static final CardAppletTileViewModel.CardPillViewModel pillModel(CardSchemeViewModel.Module.HeroTag heroTag, CardAppletTileViewModel.CardPillViewModel cardPillViewModel, Composer composer) {
        cardPillViewModel.getClass();
        if (heroTag.isPendingFirstActivation) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(1729460723);
            CardSchemeViewModel.Module.HeroTag.PhysicalTagOrderState physicalTagOrderState = heroTag.tagOrderState;
            int i = physicalTagOrderState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[physicalTagOrderState.ordinal()];
            Pair pair = i != 1 ? i != 2 ? i != 3 ? new Pair(Integer.valueOf(R.string.tag_pill_pending_label), Icons.TimeFill16) : new Pair(Integer.valueOf(R.string.tag_pill_complete_label), Icons.TimeFill16) : new Pair(Integer.valueOf(R.string.tag_pill_activate_label), Icons.TimeFill16) : new Pair(Integer.valueOf(R.string.tag_pill_shipped_label), Icons.Send16);
            int intValue = ((Number) pair.first).intValue();
            Icons icons = (Icons) pair.second;
            String stringResource = Room.stringResource(gapComposer, intValue);
            CardAppletTileViewModel.CardPillViewModel cardPillViewModel2 = new CardAppletTileViewModel.CardPillViewModel(icons, stringResource, stringResource, false);
            gapComposer.end(false);
            return cardPillViewModel2;
        }
        if (heroTag.isLocked) {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(1730120093);
            String stringResource2 = Room.stringResource(gapComposer2, R.string.card_applet_pill_locked_label);
            CardAppletTileViewModel.CardPillViewModel cardPillViewModel3 = new CardAppletTileViewModel.CardPillViewModel(Icons.LockLockedFill16, stringResource2, stringResource2, false);
            gapComposer2.end(false);
            return cardPillViewModel3;
        }
        if (cardPillViewModel.isHidden || cardPillViewModel.icon != Icons.DiscountTagFill16) {
            GapComposer gapComposer3 = (GapComposer) composer;
            gapComposer3.startReplaceGroup(1730421474);
            gapComposer3.end(false);
            return null;
        }
        GapComposer gapComposer4 = (GapComposer) composer;
        gapComposer4.startReplaceGroup(-498370321);
        gapComposer4.end(false);
        return cardPillViewModel;
    }
}
