package com.squareup.cash.wallet.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.DefaultDraggableState;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.paging.CachedPagingDataKt$cachedIn$5;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.local.views.sheet.EducationalSheetKt$$ExternalSyntheticLambda8;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsh;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.card.onboarding.CardModelView$getActiveHeat$2$2;
import com.squareup.cash.card.onboarding.CardStudioViewKt;
import com.squareup.cash.card.ui.CashCardKt;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda7;
import com.squareup.cash.common.composeui.DensityUtilsKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackKt$spacedBetween$1;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda10;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda14;
import com.squareup.cash.moneybot.genie.TextViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda4;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.viewmodels.PrepurchaseCardData;
import com.squareup.util.Strings;
import com.squareup.util.android.ViewGroups$$ExternalSyntheticLambda0;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.LifecycleKt$$ExternalSyntheticLambda0;
import com.squareup.util.compose.ModifierKt;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class HeroCardViewKt {
    public static final /* synthetic */ int $r8$clinit = 0;
    public static final long DIM_OVERLAY;
    public static final long ICON_BACKGROUND;

    static {
        long j = Color.Black;
        DIM_OVERLAY = Color.m675copywmQWz5c$default(0.3f, j, 14);
        ICON_BACKGROUND = Color.m675copywmQWz5c$default(0.1f, j, 14);
        CardStudioViewKt.WHITE_CARD_THEME.getClass();
    }

    public static final void CardHomeButtons(CardSchemeViewModel.Module.HeroCard heroCard, CardSchemeViewModel.Module.Accessory.Button button, CardSchemeViewModel.Module.Accessory.Button button2, MutableInteractionSourceImpl mutableInteractionSourceImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(764729157);
        int i2 = (gapComposer.changedInstance(heroCard) ? 4 : 2) | i | (gapComposer.changedInstance(button) ? 32 : 16) | (gapComposer.changedInstance(button2) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), 64.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new AdaptiveStackKt$spacedBetween$1(8.0f), Alignment.Companion.Top, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m277height3ABfNKs);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            LockUnlockToggle(rowScopeInstance.weight(1.0f, companion, true), heroCard, button, gapComposer, (i2 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
            CopyNumber(rowScopeInstance.weight(1.0f, companion, true), button2, mutableInteractionSourceImpl, gapComposer, (i2 >> 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LifecycleKt$$ExternalSyntheticLambda0(heroCard, i, button, button2, mutableInteractionSourceImpl, 15);
        }
    }

    public static final void CopyNumber(Modifier modifier, CardSchemeViewModel.Module.Accessory.Button button, MutableInteractionSourceImpl mutableInteractionSourceImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1741114320);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(button) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(mutableInteractionSourceImpl) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(ImageKt.m178borderxT4_qwU(ImageKt.m177backgroundbw27NRU(ModifierKt.clipOffscreen(SizeKt.m277height3ABfNKs(modifier, 64.0f), RoundedCornerShapeKt.RoundedCornerShape(100)), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape), 1.0f, Strings.getColors(gapComposer).semantic.background.standard, RoundedCornerShapeKt.RoundedCornerShape(100)), mutableInteractionSourceImpl, RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer, 0, 15), button.isEnabled, null, new Role(0), button.onClick, 8);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m182clickableO2vRcR0$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new AdaptiveStackKt$spacedBetween$1(8.0f), Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Trace.m1191Iconww6aTOc(Icons.Copy16, (String) null, (Modifier) null, Strings.getColors(gapComposer).semantic.icon.standard, gapComposer, 54, 4);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).helpText, (TextLineBalancing) null, button.text, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(i, 24, modifier, button, mutableInteractionSourceImpl);
        }
    }

    /* renamed from: JustifiedText-cf5BqRc, reason: not valid java name */
    public static final void m3792JustifiedTextcf5BqRc(Modifier modifier, List list, long j, TextStyle textStyle, Composer composer, int i) {
        list.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(463774400);
        long j2 = j;
        TextStyle textStyle2 = textStyle;
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(list) ? 32 : 16) | (gapComposer.changed(j2) ? 256 : 128) | (gapComposer.changed(textStyle2) ? 2048 : 1024);
        boolean z = false;
        boolean z2 = true;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CardAppletTile$$ExternalSyntheticLambda0(19);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(modifier, true, (Function1) rememberedValue);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.Top, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-67185960);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Room.m1165Text25TpFw(3, 1, 0, 0, ((i2 >> 3) & 896) | 1769472 | ((i2 << 3) & 7168), 0, 3986, j2, (Composer) gapComposer, (Modifier) null, textStyle2, (TextLineBalancing) null, (String) it.next(), (Map) null, (Function1) null, false);
                j2 = j;
                textStyle2 = textStyle;
                z = z;
                z2 = true;
                i2 = i2;
            }
            gapComposer.end(z);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextViewKt$$ExternalSyntheticLambda0(modifier, list, j, textStyle, i, 10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0125, code lost:
    
        r7 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01a6, code lost:
    
        if (r8 == r7) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LockUnlockToggle(Modifier modifier, CardSchemeViewModel.Module.HeroCard heroCard, final CardSchemeViewModel.Module.Accessory.Button button, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Object obj;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState;
        final MutableFloatState mutableFloatState;
        Function0 function0;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1536143774);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(heroCard) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(button) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(Boolean.valueOf(!heroCard.cardDetails.isEnabled), gapComposer2);
            final MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(Boolean.valueOf(button.isLoading), gapComposer2);
            ProvidableCompositionLocal providableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer2.consume(providableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Colors.Semantic semantic = colors.semantic;
            Colors.Semantic.Background background = semantic.background;
            Colors.Semantic.Text text = semantic.text;
            State m153animateColorAsStateeuL9pac = SingleValueAnimationKt.m153animateColorAsStateeuL9pac((!((Boolean) rememberUpdatedState2.getValue()).booleanValue() || ((Boolean) rememberUpdatedState.getValue()).booleanValue()) ? ((Boolean) rememberUpdatedState2.getValue()).booleanValue() ? background.subtle : ((Boolean) rememberUpdatedState.getValue()).booleanValue() ? text.standard : background.subtle : text.standard, null, null, gapComposer2, 0, 14);
            boolean changed = gapComposer2.changed(((Boolean) rememberUpdatedState.getValue()).booleanValue()) | gapComposer2.changed(((Boolean) rememberUpdatedState2.getValue()).booleanValue());
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (changed || rememberedValue == obj2) {
                float f = ((Boolean) rememberUpdatedState2.getValue()).booleanValue() ? RecyclerView.DECELERATION_RATE : RecyclerView.DECELERATION_RATE;
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(f, gapComposer2);
            }
            MutableFloatState mutableFloatState2 = (MutableFloatState) rememberedValue;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == obj2) {
                rememberedValue2 = Boxes$$ExternalSyntheticOutline1.m(1, gapComposer2);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) rememberedValue2;
            Modifier clip = ClipKt.clip(modifier, RoundedCornerShapeKt.RoundedCornerShape(100));
            boolean z = button.isEnabled;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == obj2) {
                rememberedValue3 = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
            }
            Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(clip, (MutableInteractionSourceImpl) rememberedValue3, RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer2, 0, 15), z, null, new Role(0), button.onClick, 8);
            boolean changed2 = gapComposer2.changed(m153animateColorAsStateeuL9pac);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changed2) {
                obj = obj2;
            } else {
                obj = obj2;
            }
            rememberedValue4 = new MoneyTabUIKt$$ExternalSyntheticLambda10(m153animateColorAsStateeuL9pac, 22);
            gapComposer2.updateRememberedValue(rememberedValue4);
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ClipKt.drawBehind(m182clickableO2vRcR0$default, (Function1) rememberedValue4), 4.0f);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (rememberedValue5 == obj) {
                parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState2;
                rememberedValue5 = new MoneyTabUIKt$$ExternalSyntheticLambda14(28, parcelableSnapshotMutableIntState);
                gapComposer2.updateRememberedValue(rememberedValue5);
            } else {
                parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState2;
            }
            Modifier onSizeChanged = RulerKt.onSizeChanged(m298padding3ABfNKs, (Function1) rememberedValue5);
            Orientation orientation = Orientation.Horizontal;
            boolean z2 = button.isEnabled;
            boolean changed3 = gapComposer2.changed(((Boolean) rememberUpdatedState.getValue()).booleanValue()) | gapComposer2.changed(((Boolean) rememberUpdatedState2.getValue()).booleanValue());
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (changed3 || rememberedValue6 == obj) {
                mutableFloatState = mutableFloatState2;
                HeroCardViewKt$$ExternalSyntheticLambda0 heroCardViewKt$$ExternalSyntheticLambda0 = new HeroCardViewKt$$ExternalSyntheticLambda0(3, mutableFloatState, parcelableSnapshotMutableIntState);
                CachedPagingDataKt$cachedIn$5 cachedPagingDataKt$cachedIn$5 = DraggableKt.NoOpOnDragStarted;
                rememberedValue6 = new DefaultDraggableState(heroCardViewKt$$ExternalSyntheticLambda0);
                gapComposer2.updateRememberedValue(rememberedValue6);
            } else {
                mutableFloatState = mutableFloatState2;
            }
            DraggableState draggableState = (DraggableState) rememberedValue6;
            boolean changed4 = gapComposer2.changed(rememberUpdatedState) | gapComposer2.changed(mutableFloatState) | gapComposer2.changedInstance(button);
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (changed4 || rememberedValue7 == obj) {
                rememberedValue7 = new CardModelView$getActiveHeat$2$2(button, rememberUpdatedState, mutableFloatState, null);
                gapComposer2.updateRememberedValue(rememberedValue7);
            }
            Modifier draggable$default = DraggableKt.draggable$default(onSizeChanged, draggableState, orientation, z2, null, false, null, (Function3) rememberedValue7, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.CenterStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, draggable$default);
            ComposeUiNode.Companion.getClass();
            Function0 function02 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(function02);
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
            final int i3 = 0;
            AnimatedContentKt.AnimatedVisibility(((Boolean) rememberUpdatedState.getValue()).booleanValue() && !((Boolean) rememberUpdatedState2.getValue()).booleanValue(), (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 10000.0f, null, 5), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 10000.0f, null, 5), 2), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(1089578564, new Function3() { // from class: com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    int i4 = i3;
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    MutableState mutableState = rememberUpdatedState2;
                    CardSchemeViewModel.Module.Accessory.Button button2 = button;
                    MutableFloatState mutableFloatState3 = mutableFloatState;
                    switch (i4) {
                        case 0:
                            Composer composer2 = (Composer) obj4;
                            ((Integer) obj5).getClass();
                            ((AnimatedVisibilityScope) obj3).getClass();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                            if (colors2 == null) {
                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                            } else {
                                gapComposer3.startReplaceGroup(-1762997739);
                                gapComposer3.end(false);
                            }
                            Colors.Semantic.Text text2 = colors2.semantic.text;
                            State m153animateColorAsStateeuL9pac2 = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(((Boolean) mutableState.getValue()).booleanValue() ? text2.disabled : text2.inverse, null, null, composer2, 0, 14);
                            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 64.0f, RecyclerView.DECELERATION_RATE, 10), 1.0f);
                            boolean changed5 = gapComposer3.changed(mutableFloatState3);
                            Object rememberedValue8 = gapComposer3.rememberedValue();
                            if (changed5 || rememberedValue8 == neverEqualPolicy) {
                                rememberedValue8 = new HeroCardViewKt$$ExternalSyntheticLambda33(mutableFloatState3, 0);
                                gapComposer3.updateRememberedValue(rememberedValue8);
                            }
                            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, ((Color) m153animateColorAsStateeuL9pac2.getValue()).value, (Composer) gapComposer3, ColorKt.graphicsLayer(fillMaxWidth, (Function1) rememberedValue8), ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).helpText, (TextLineBalancing) null, button2.text, (Map) null, (Function1) null, false);
                            break;
                        default:
                            ((Integer) obj5).getClass();
                            ((AnimatedVisibilityScope) obj3).getClass();
                            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 64.0f, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 10), 1.0f);
                            GapComposer gapComposer4 = (GapComposer) ((Composer) obj4);
                            boolean changed6 = gapComposer4.changed(mutableFloatState3);
                            Object rememberedValue9 = gapComposer4.rememberedValue();
                            if (changed6 || rememberedValue9 == neverEqualPolicy) {
                                rememberedValue9 = new HeroCardViewKt$$ExternalSyntheticLambda33(mutableFloatState3, 23);
                                gapComposer4.updateRememberedValue(rememberedValue9);
                            }
                            Modifier graphicsLayer = ColorKt.graphicsLayer(fillMaxWidth2, (Function1) rememberedValue9);
                            String str = button2.text;
                            TextStyle textStyle = ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).helpText;
                            Colors colors3 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                            if (colors3 == null) {
                                colors3 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                            } else {
                                gapComposer4.startReplaceGroup(-1762997739);
                                gapComposer4.end(false);
                            }
                            Colors.Semantic.Text text3 = colors3.semantic.text;
                            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, ((Color) SingleValueAnimationKt.m153animateColorAsStateeuL9pac(((Boolean) mutableState.getValue()).booleanValue() ? text3.disabled : text3.subtle, null, null, gapComposer4, 0, 14).getValue()).value, (Composer) gapComposer4, graphicsLayer, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), (Composer) gapComposer2, 200064, 18);
            final int i4 = 1;
            AnimatedContentKt.AnimatedVisibility((((Boolean) rememberUpdatedState.getValue()).booleanValue() || ((Boolean) rememberUpdatedState2.getValue()).booleanValue()) ? false : true, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 10000.0f, null, 5), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 10000.0f, null, 5), 2), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(-388271955, new Function3() { // from class: com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    int i42 = i4;
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    MutableState mutableState = rememberUpdatedState2;
                    CardSchemeViewModel.Module.Accessory.Button button2 = button;
                    MutableFloatState mutableFloatState3 = mutableFloatState;
                    switch (i42) {
                        case 0:
                            Composer composer2 = (Composer) obj4;
                            ((Integer) obj5).getClass();
                            ((AnimatedVisibilityScope) obj3).getClass();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                            if (colors2 == null) {
                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                            } else {
                                gapComposer3.startReplaceGroup(-1762997739);
                                gapComposer3.end(false);
                            }
                            Colors.Semantic.Text text2 = colors2.semantic.text;
                            State m153animateColorAsStateeuL9pac2 = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(((Boolean) mutableState.getValue()).booleanValue() ? text2.disabled : text2.inverse, null, null, composer2, 0, 14);
                            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 64.0f, RecyclerView.DECELERATION_RATE, 10), 1.0f);
                            boolean changed5 = gapComposer3.changed(mutableFloatState3);
                            Object rememberedValue8 = gapComposer3.rememberedValue();
                            if (changed5 || rememberedValue8 == neverEqualPolicy) {
                                rememberedValue8 = new HeroCardViewKt$$ExternalSyntheticLambda33(mutableFloatState3, 0);
                                gapComposer3.updateRememberedValue(rememberedValue8);
                            }
                            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, ((Color) m153animateColorAsStateeuL9pac2.getValue()).value, (Composer) gapComposer3, ColorKt.graphicsLayer(fillMaxWidth, (Function1) rememberedValue8), ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).helpText, (TextLineBalancing) null, button2.text, (Map) null, (Function1) null, false);
                            break;
                        default:
                            ((Integer) obj5).getClass();
                            ((AnimatedVisibilityScope) obj3).getClass();
                            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 64.0f, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 10), 1.0f);
                            GapComposer gapComposer4 = (GapComposer) ((Composer) obj4);
                            boolean changed6 = gapComposer4.changed(mutableFloatState3);
                            Object rememberedValue9 = gapComposer4.rememberedValue();
                            if (changed6 || rememberedValue9 == neverEqualPolicy) {
                                rememberedValue9 = new HeroCardViewKt$$ExternalSyntheticLambda33(mutableFloatState3, 23);
                                gapComposer4.updateRememberedValue(rememberedValue9);
                            }
                            Modifier graphicsLayer = ColorKt.graphicsLayer(fillMaxWidth2, (Function1) rememberedValue9);
                            String str = button2.text;
                            TextStyle textStyle = ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).helpText;
                            Colors colors3 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                            if (colors3 == null) {
                                colors3 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                            } else {
                                gapComposer4.startReplaceGroup(-1762997739);
                                gapComposer4.end(false);
                            }
                            Colors.Semantic.Text text3 = colors3.semantic.text;
                            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, ((Color) SingleValueAnimationKt.m153animateColorAsStateeuL9pac(((Boolean) mutableState.getValue()).booleanValue() ? text3.disabled : text3.subtle, null, null, gapComposer4, 0, 14).getValue()).value, (Composer) gapComposer4, graphicsLayer, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), (Composer) gapComposer2, 200064, 18);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer2, 48);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, companion);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                function0 = function02;
                gapComposer2.createNode(function0);
            } else {
                function0 = function02;
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            int i5 = 0;
            SpacerKt.Spacer(gapComposer2, SizeKt.fillMaxWidth(new LayoutWeightElement(1.0f, false), ((Number) AnimateAsStateKt.animateFloatAsState(RangesKt___RangesKt.coerceIn(((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue(), RecyclerView.DECELERATION_RATE, 1.0f), null, null, null, gapComposer2, 0, 30).getValue()).floatValue()));
            Modifier clip2 = ClipKt.clip(SizeKt.fillMaxWidth(OffsetKt.aspectRatio(1.0f, companion, false), 1.0f), RoundedCornerShapeKt.CircleShape);
            Colors colors2 = (Colors) gapComposer2.consume(providableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip2, colors2.semantic.text.inverse, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(function0);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            CrossfadeKt.Crossfade(Boolean.valueOf((((Boolean) rememberUpdatedState.getValue()).booleanValue() && !((Boolean) rememberUpdatedState2.getValue()).booleanValue()) || (!((Boolean) rememberUpdatedState.getValue()).booleanValue() && ((Boolean) rememberUpdatedState2.getValue()).booleanValue())), (Modifier) null, (FiniteAnimationSpec) null, (String) null, Expect_jvmKt.rememberComposableLambda(1377569107, new HeroCardViewKt$$ExternalSyntheticLambda28(i5, rememberUpdatedState2), gapComposer2), gapComposer2, 24576, 14);
            gapComposer = gapComposer2;
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, true, true, true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(i, 25, modifier, heroCard, button);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0345  */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Render(CardSchemeViewModel.Module.HeroCard heroCard, Modifier modifier, Function1 function1, Composer composer, int i) {
        Function1 function12;
        GapComposer gapComposer;
        int i2;
        ?? r1;
        Object obj;
        boolean z;
        boolean z2;
        MutableState rememberUpdatedState;
        Object rememberedValue;
        Object rememberedValue2;
        MutableInteractionSourceImpl mutableInteractionSourceImpl;
        Object rememberedValue3;
        MutableState mutableState;
        Object rememberedValue4;
        MutableState mutableState2;
        Object rememberedValue5;
        Object rememberedValue6;
        SnapshotStateList snapshotStateList;
        MutableState collectIsPressedAsState;
        Object rememberedValue7;
        MutableState rememberUpdatedState2;
        Object rememberedValue8;
        MutableState mutableState3;
        boolean changed;
        Object rememberedValue9;
        SnapshotStateList snapshotStateList2;
        MutableState mutableState4;
        Modifier.Companion companion;
        MutableState mutableState5;
        boolean changed2;
        Object heroCardViewKt$Render$1$4$1;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        CardSchemeViewModel.Module.Accessory.Button button;
        MutableState mutableState6;
        MutableState mutableState7;
        MutableState mutableState8;
        Object rememberedValue10;
        Continuation continuation;
        Object obj2;
        Object rememberedValue11;
        Object obj3;
        CardSchemeViewModel.Module.Accessory.Button button2;
        boolean changed3;
        Object rememberedValue12;
        CardSchemeViewModel.Module.Accessory.Button button3;
        PrepurchaseCardData.Toggle toggle;
        float f;
        boolean z3;
        heroCard.getClass();
        PrepurchaseCardData prepurchaseCardData = heroCard.prepurchaseCardData;
        modifier.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(975509784);
        int i3 = i | (gapComposer2.changedInstance(heroCard) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(modifier) ? 32 : 16;
        }
        int i4 = i3 | (gapComposer2.changedInstance(function1) ? 256 : 128);
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            Modifier zIndex = ZIndexModifierKt.zIndex(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, zIndex);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            TweenSpec tween$default = AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 90, null, 4);
            EnterTransitionImpl plus = EnterExitTransitionKt.fadeIn$default(tween$default, 2).plus(EnterExitTransitionKt.m147scaleInL8ZKhE$default(tween$default, 0.92f, 4));
            TweenSpec tween$default2 = AnimatableKt.tween$default(90, 0, null, 6);
            ExitTransitionImpl plus2 = EnterExitTransitionKt.fadeOut$default(tween$default2, 2).plus(EnterExitTransitionKt.m148scaleOutL8ZKhE$default(tween$default2, 0.92f, 4));
            MutableState rememberUpdatedState3 = Updater.rememberUpdatedState(Boolean.valueOf(CardTransitionKt.isTransitioningCard(gapComposer2)), gapComposer2);
            float f2 = ((Boolean) rememberUpdatedState3.getValue()).booleanValue() ? -1.0f : 2.0f;
            float m3477toPx8Feqmps = DensityUtilsKt.m3477toPx8Feqmps(64.0f, gapComposer2);
            State cardTransitionState = CardTransitionKt.cardTransitionState(gapComposer2);
            gapComposer2.startReplaceGroup(1282826352);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier zIndex2 = ZIndexModifierKt.zIndex(companion2, f2);
            boolean booleanValue = ((Boolean) rememberUpdatedState3.getValue()).booleanValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (booleanValue) {
                boolean changed4 = gapComposer2.changed(m3477toPx8Feqmps) | gapComposer2.changed(cardTransitionState);
                Object rememberedValue13 = gapComposer2.rememberedValue();
                Object obj4 = rememberedValue13;
                if (changed4 || rememberedValue13 == neverEqualPolicy) {
                    CardTransitionKt$$ExternalSyntheticLambda24 cardTransitionKt$$ExternalSyntheticLambda24 = new CardTransitionKt$$ExternalSyntheticLambda24(m3477toPx8Feqmps, cardTransitionState, 0);
                    gapComposer2.updateRememberedValue(cardTransitionKt$$ExternalSyntheticLambda24);
                    obj4 = cardTransitionKt$$ExternalSyntheticLambda24;
                }
                zIndex2 = zIndex2.then(ColorKt.graphicsLayer(companion2, (Function1) obj4));
            }
            Modifier modifier2 = zIndex2;
            gapComposer2.end(false);
            CardSchemeViewModel.Module.Accessory.Button button4 = heroCard.leftButton;
            CardSchemeViewModel.Module.Accessory.Button button5 = heroCard.rightButton;
            CardSchemeViewModel.Module.HeroCardDetails heroCardDetails = heroCard.cardDetails;
            PrepurchaseCardData.CardHeader cardHeader = prepurchaseCardData != null ? prepurchaseCardData.turnedOnCardHeader : null;
            BiasAlignment biasAlignment = Alignment.Companion.TopCenter;
            Object rememberedValue14 = gapComposer2.rememberedValue();
            if (rememberedValue14 == neverEqualPolicy) {
                i2 = i4;
                r1 = 0;
                HeroCardViewKt$$ExternalSyntheticLambda0 heroCardViewKt$$ExternalSyntheticLambda0 = new HeroCardViewKt$$ExternalSyntheticLambda0(false ? 1 : 0, plus, plus2);
                gapComposer2.updateRememberedValue(heroCardViewKt$$ExternalSyntheticLambda0);
                obj = heroCardViewKt$$ExternalSyntheticLambda0;
            } else {
                i2 = i4;
                r1 = 0;
                obj = rememberedValue14;
            }
            AnimatedContentKt.AnimatedContent(cardHeader, modifier2, (Function1) obj, biasAlignment, null, null, Expect_jvmKt.rememberComposableLambda(-79712028, new HeroCardViewKt$$ExternalSyntheticLambda1(function1, r1, r1), gapComposer2), gapComposer2, 1576320, 48);
            GapComposer gapComposer3 = gapComposer2;
            if (button5 != null) {
                z = true;
                if (button5.isLoading) {
                    z2 = true;
                    MutableState rememberUpdatedState4 = Updater.rememberUpdatedState(Boolean.valueOf(z2), gapComposer3);
                    rememberUpdatedState = Updater.rememberUpdatedState(Boolean.valueOf((!((Boolean) rememberUpdatedState4.getValue()).booleanValue() || ((Boolean) Updater.rememberUpdatedState(Boolean.valueOf((button4 != null || button4.isLoading != z) ? r1 : true), gapComposer3).getValue()).booleanValue() || ((Boolean) Updater.rememberUpdatedState(Boolean.valueOf(heroCard.showCardSpinner), gapComposer3).getValue()).booleanValue()) ? true : r1), gapComposer3);
                    rememberedValue = gapComposer3.rememberedValue();
                    Object obj5 = rememberedValue;
                    if (rememberedValue == neverEqualPolicy) {
                        ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(new InteractiveCardState());
                        gapComposer3.updateRememberedValue(mutableStateOf$default);
                        obj5 = mutableStateOf$default;
                    }
                    MutableState mutableState9 = (MutableState) obj5;
                    rememberedValue2 = gapComposer3.rememberedValue();
                    Object obj6 = rememberedValue2;
                    if (rememberedValue2 == neverEqualPolicy) {
                        obj6 = Recorder$$ExternalSyntheticOutline2.m(gapComposer3);
                    }
                    mutableInteractionSourceImpl = (MutableInteractionSourceImpl) obj6;
                    rememberedValue3 = gapComposer3.rememberedValue();
                    Object obj7 = rememberedValue3;
                    if (rememberedValue3 == neverEqualPolicy) {
                        ParcelableSnapshotMutableState mutableStateOf$default2 = Updater.mutableStateOf$default(null);
                        gapComposer3.updateRememberedValue(mutableStateOf$default2);
                        obj7 = mutableStateOf$default2;
                    }
                    mutableState = (MutableState) obj7;
                    rememberedValue4 = gapComposer3.rememberedValue();
                    Object obj8 = rememberedValue4;
                    if (rememberedValue4 == neverEqualPolicy) {
                        ParcelableSnapshotMutableState mutableStateOf$default3 = Updater.mutableStateOf$default(null);
                        gapComposer3.updateRememberedValue(mutableStateOf$default3);
                        obj8 = mutableStateOf$default3;
                    }
                    mutableState2 = (MutableState) obj8;
                    rememberedValue5 = gapComposer3.rememberedValue();
                    Object obj9 = rememberedValue5;
                    if (rememberedValue5 == neverEqualPolicy) {
                        ParcelableSnapshotMutableState mutableStateOf$default4 = Updater.mutableStateOf$default(Boolean.TRUE);
                        gapComposer3.updateRememberedValue(mutableStateOf$default4);
                        obj9 = mutableStateOf$default4;
                    }
                    MutableState mutableState10 = (MutableState) obj9;
                    rememberedValue6 = gapComposer3.rememberedValue();
                    Object obj10 = rememberedValue6;
                    if (rememberedValue6 == neverEqualPolicy) {
                        SnapshotStateList snapshotStateList3 = new SnapshotStateList();
                        gapComposer3.updateRememberedValue(snapshotStateList3);
                        obj10 = snapshotStateList3;
                    }
                    snapshotStateList = (SnapshotStateList) obj10;
                    collectIsPressedAsState = Room.collectIsPressedAsState(mutableInteractionSourceImpl, gapComposer3, 6);
                    rememberedValue7 = gapComposer3.rememberedValue();
                    Object obj11 = rememberedValue7;
                    if (rememberedValue7 == neverEqualPolicy) {
                        DerivedSnapshotState derivedStateOf = Updater.derivedStateOf(new HeroCardViewKt$$ExternalSyntheticLambda2((State) collectIsPressedAsState, rememberUpdatedState4, 0));
                        gapComposer3.updateRememberedValue(derivedStateOf);
                        obj11 = derivedStateOf;
                    }
                    State state = (State) obj11;
                    MutableState rememberUpdatedState5 = Updater.rememberUpdatedState(Boolean.valueOf(heroCardDetails.isEnabled), gapComposer3);
                    rememberUpdatedState2 = Updater.rememberUpdatedState(Boolean.valueOf(heroCardDetails.isLocked), gapComposer3);
                    MutableState rememberUpdatedState6 = Updater.rememberUpdatedState(Boolean.valueOf(heroCardDetails.showPrepurchaseContourText), gapComposer3);
                    rememberedValue8 = gapComposer3.rememberedValue();
                    Object obj12 = rememberedValue8;
                    if (rememberedValue8 == neverEqualPolicy) {
                        ParcelableSnapshotMutableState mutableStateOf$default5 = Updater.mutableStateOf$default(new InteractiveCardState());
                        gapComposer3.updateRememberedValue(mutableStateOf$default5);
                        obj12 = mutableStateOf$default5;
                    }
                    mutableState3 = (MutableState) obj12;
                    Unit unit = Unit.INSTANCE;
                    changed = gapComposer3.changed(collectIsPressedAsState) | gapComposer3.changed(rememberUpdatedState2);
                    rememberedValue9 = gapComposer3.rememberedValue();
                    if (!changed || rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new TakeUntil$collectSafely$2(mutableState3, snapshotStateList, collectIsPressedAsState, rememberUpdatedState2, null, 11);
                        snapshotStateList2 = snapshotStateList;
                        mutableState4 = collectIsPressedAsState;
                        companion = companion2;
                        mutableState5 = rememberUpdatedState2;
                        gapComposer3.updateRememberedValue(rememberedValue9);
                    } else {
                        companion = companion2;
                        mutableState5 = rememberUpdatedState2;
                        snapshotStateList2 = snapshotStateList;
                        mutableState4 = collectIsPressedAsState;
                    }
                    Updater.LaunchedEffect(gapComposer3, unit, (Function2) rememberedValue9);
                    changed2 = gapComposer3.changed(rememberUpdatedState5) | gapComposer3.changed(rememberUpdatedState6) | gapComposer3.changed(rememberUpdatedState) | gapComposer3.changed(mutableState5);
                    Object rememberedValue15 = gapComposer3.rememberedValue();
                    if (!changed2 || rememberedValue15 == neverEqualPolicy) {
                        mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                        button = button4;
                        mutableState6 = rememberUpdatedState;
                        mutableState7 = mutableState;
                        mutableState8 = mutableState2;
                        heroCardViewKt$Render$1$4$1 = new HeroCardViewKt$Render$1$4$1(state, rememberUpdatedState5, rememberUpdatedState6, mutableState6, mutableState9, mutableState5, (Continuation) null, 0);
                        gapComposer3.updateRememberedValue(heroCardViewKt$Render$1$4$1);
                    } else {
                        mutableState6 = rememberUpdatedState;
                        mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                        mutableState8 = mutableState2;
                        heroCardViewKt$Render$1$4$1 = rememberedValue15;
                        button = button4;
                        mutableState7 = mutableState;
                    }
                    Updater.LaunchedEffect(gapComposer3, unit, (Function2) heroCardViewKt$Render$1$4$1);
                    rememberedValue10 = gapComposer3.rememberedValue();
                    if (rememberedValue10 != neverEqualPolicy) {
                        continuation = null;
                        HeroCardViewKt$Render$1$5$1 heroCardViewKt$Render$1$5$1 = new HeroCardViewKt$Render$1$5$1(mutableState7, snapshotStateList2, continuation, 0);
                        gapComposer3.updateRememberedValue(heroCardViewKt$Render$1$5$1);
                        obj2 = heroCardViewKt$Render$1$5$1;
                    } else {
                        continuation = null;
                        obj2 = rememberedValue10;
                    }
                    Updater.LaunchedEffect(gapComposer3, unit, (Function2) obj2);
                    rememberedValue11 = gapComposer3.rememberedValue();
                    if (rememberedValue11 != neverEqualPolicy) {
                        HeroCardViewKt$Render$1$5$1 heroCardViewKt$Render$1$5$12 = new HeroCardViewKt$Render$1$5$1(mutableState8, snapshotStateList2, continuation, 1);
                        gapComposer3.updateRememberedValue(heroCardViewKt$Render$1$5$12);
                        obj3 = heroCardViewKt$Render$1$5$12;
                    } else {
                        obj3 = rememberedValue11;
                    }
                    Updater.LaunchedEffect(gapComposer3, unit, (Function2) obj3);
                    button2 = button;
                    MutableState mutableState11 = mutableState6;
                    Modifier.Companion companion3 = companion;
                    SnapshotStateList snapshotStateList4 = snapshotStateList2;
                    MutableState mutableState12 = mutableState5;
                    function12 = function1;
                    zzsh.WindowBoundLifecycle(Expect_jvmKt.rememberComposableLambda(680434999, new DateInputKt$$ExternalSyntheticLambda1(mutableState11, function1, heroCard, mutableState12, mutableState7, mutableState10, mutableState9, mutableState8, 13), gapComposer3), gapComposer3, 6);
                    changed3 = gapComposer3.changed(mutableState4);
                    Object rememberedValue16 = gapComposer3.rememberedValue();
                    Object obj13 = rememberedValue16;
                    if (!changed3 || rememberedValue16 == neverEqualPolicy) {
                        HeroCardViewKt$Render$1$8$1 heroCardViewKt$Render$1$8$1 = new HeroCardViewKt$Render$1$8$1(mutableState4, mutableState9, null, 0);
                        gapComposer3.updateRememberedValue(heroCardViewKt$Render$1$8$1);
                        obj13 = heroCardViewKt$Render$1$8$1;
                    }
                    Updater.LaunchedEffect(gapComposer3, unit, (Function2) obj13);
                    rememberedValue12 = gapComposer3.rememberedValue();
                    Object obj14 = rememberedValue12;
                    if (rememberedValue12 == neverEqualPolicy) {
                        CoroutineScope createCompositionCoroutineScope = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer3);
                        gapComposer3.updateRememberedValue(createCompositionCoroutineScope);
                        obj14 = createCompositionCoroutineScope;
                    }
                    CoroutineScope coroutineScope = (CoroutineScope) obj14;
                    if (button5 != null) {
                        gapComposer3.startReplaceGroup(1392558365);
                        gapComposer3.end(false);
                        button3 = null;
                    } else {
                        gapComposer3.startReplaceGroup(-1617646748);
                        boolean changedInstance = gapComposer3.changedInstance(heroCard) | gapComposer3.changed(mutableState12) | gapComposer3.changedInstance(coroutineScope);
                        Object rememberedValue17 = gapComposer3.rememberedValue();
                        if (changedInstance || rememberedValue17 == neverEqualPolicy) {
                            HeroCardViewKt$$ExternalSyntheticLambda4 heroCardViewKt$$ExternalSyntheticLambda4 = new HeroCardViewKt$$ExternalSyntheticLambda4(heroCard, coroutineScope, mutableState12, mutableState7, mutableState10, snapshotStateList4, mutableState3);
                            gapComposer3.updateRememberedValue(heroCardViewKt$$ExternalSyntheticLambda4);
                            rememberedValue17 = heroCardViewKt$$ExternalSyntheticLambda4;
                        }
                        Function0 function0 = (Function0) rememberedValue17;
                        String str = button5.text;
                        CardSchemeViewModel.Module.Accessory.Button.Prominence prominence = button5.prominence;
                        boolean z4 = button5.isDestructive;
                        boolean z5 = button5.isLoading;
                        boolean z6 = button5.isEnabled;
                        String str2 = button5.icon;
                        str.getClass();
                        prominence.getClass();
                        function0.getClass();
                        CardSchemeViewModel.Module.Accessory.Button button6 = new CardSchemeViewModel.Module.Accessory.Button(str, prominence, z4, z5, z6, str2, function0);
                        gapComposer3.end(false);
                        button3 = button6;
                    }
                    if (button2 != null || button3 == null) {
                        gapComposer3.startReplaceGroup(1394105204);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(1393124023);
                        if (prepurchaseCardData != null) {
                            PrepurchaseCardData.Toggle toggle2 = prepurchaseCardData.toggle;
                            if (toggle2.position instanceof PrepurchaseCardData.Toggle.Position.ButtonsRow) {
                                toggle = toggle2;
                                if (toggle != null) {
                                    gapComposer3.startReplaceGroup(-1617621133);
                                    ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                    DefaultSizes.spacing.getClass();
                                    gapComposer3.end(false);
                                    f = 32.0f;
                                } else {
                                    gapComposer3.startReplaceGroup(-1617617873);
                                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                                    ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
                                    DefaultSizes.spacing.getClass();
                                    ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
                                    gapComposer3.end(false);
                                    f = 24.0f;
                                }
                                float f3 = f;
                                SpacerKt.Spacer(gapComposer3, SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion3, 1.0f), f3));
                                if (toggle == null) {
                                    gapComposer3.startReplaceGroup(1393650341);
                                    int i5 = i2;
                                    int i6 = i5 & 896;
                                    boolean z7 = i6 == 256;
                                    Object rememberedValue18 = gapComposer3.rememberedValue();
                                    Object obj15 = rememberedValue18;
                                    if (z7 || rememberedValue18 == neverEqualPolicy) {
                                        HeroCardViewKt$$ExternalSyntheticLambda5 heroCardViewKt$$ExternalSyntheticLambda5 = new HeroCardViewKt$$ExternalSyntheticLambda5(0, function12);
                                        gapComposer3.updateRememberedValue(heroCardViewKt$$ExternalSyntheticLambda5);
                                        obj15 = heroCardViewKt$$ExternalSyntheticLambda5;
                                    }
                                    Function0 function02 = (Function0) obj15;
                                    boolean z8 = i6 == 256;
                                    Object rememberedValue19 = gapComposer3.rememberedValue();
                                    Object obj16 = rememberedValue19;
                                    if (z8 || rememberedValue19 == neverEqualPolicy) {
                                        ViewGroups$$ExternalSyntheticLambda0 viewGroups$$ExternalSyntheticLambda0 = new ViewGroups$$ExternalSyntheticLambda0(7, function12);
                                        gapComposer3.updateRememberedValue(viewGroups$$ExternalSyntheticLambda0);
                                        obj16 = viewGroups$$ExternalSyntheticLambda0;
                                    }
                                    UtilsKt.PrepurchaseCardButtons(heroCard, null, button2, button3, toggle, function02, (Function1) obj16, gapComposer3, i5 & 14);
                                    z3 = false;
                                    gapComposer3.end(false);
                                } else {
                                    z3 = false;
                                    gapComposer3.startReplaceGroup(1393957799);
                                    CardHomeButtons(heroCard, button2, button3, mutableInteractionSourceImpl2, gapComposer3, (i2 & 14) | 3072);
                                    gapComposer3.end(false);
                                }
                                SpacerKt.Spacer(gapComposer3, SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion3, 1.0f), f3));
                                gapComposer3.end(z3);
                            }
                        }
                        toggle = null;
                        if (toggle != null) {
                        }
                        float f32 = f;
                        SpacerKt.Spacer(gapComposer3, SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion3, 1.0f), f32));
                        if (toggle == null) {
                        }
                        SpacerKt.Spacer(gapComposer3, SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion3, 1.0f), f32));
                        gapComposer3.end(z3);
                    }
                    gapComposer3.end(true);
                    gapComposer = gapComposer3;
                }
            } else {
                z = true;
            }
            z2 = r1;
            MutableState rememberUpdatedState42 = Updater.rememberUpdatedState(Boolean.valueOf(z2), gapComposer3);
            rememberUpdatedState = Updater.rememberUpdatedState(Boolean.valueOf((!((Boolean) rememberUpdatedState42.getValue()).booleanValue() || ((Boolean) Updater.rememberUpdatedState(Boolean.valueOf((button4 != null || button4.isLoading != z) ? r1 : true), gapComposer3).getValue()).booleanValue() || ((Boolean) Updater.rememberUpdatedState(Boolean.valueOf(heroCard.showCardSpinner), gapComposer3).getValue()).booleanValue()) ? true : r1), gapComposer3);
            rememberedValue = gapComposer3.rememberedValue();
            Object obj52 = rememberedValue;
            if (rememberedValue == neverEqualPolicy) {
            }
            MutableState mutableState92 = (MutableState) obj52;
            rememberedValue2 = gapComposer3.rememberedValue();
            Object obj62 = rememberedValue2;
            if (rememberedValue2 == neverEqualPolicy) {
            }
            mutableInteractionSourceImpl = (MutableInteractionSourceImpl) obj62;
            rememberedValue3 = gapComposer3.rememberedValue();
            Object obj72 = rememberedValue3;
            if (rememberedValue3 == neverEqualPolicy) {
            }
            mutableState = (MutableState) obj72;
            rememberedValue4 = gapComposer3.rememberedValue();
            Object obj82 = rememberedValue4;
            if (rememberedValue4 == neverEqualPolicy) {
            }
            mutableState2 = (MutableState) obj82;
            rememberedValue5 = gapComposer3.rememberedValue();
            Object obj92 = rememberedValue5;
            if (rememberedValue5 == neverEqualPolicy) {
            }
            MutableState mutableState102 = (MutableState) obj92;
            rememberedValue6 = gapComposer3.rememberedValue();
            Object obj102 = rememberedValue6;
            if (rememberedValue6 == neverEqualPolicy) {
            }
            snapshotStateList = (SnapshotStateList) obj102;
            collectIsPressedAsState = Room.collectIsPressedAsState(mutableInteractionSourceImpl, gapComposer3, 6);
            rememberedValue7 = gapComposer3.rememberedValue();
            Object obj112 = rememberedValue7;
            if (rememberedValue7 == neverEqualPolicy) {
            }
            State state2 = (State) obj112;
            MutableState rememberUpdatedState52 = Updater.rememberUpdatedState(Boolean.valueOf(heroCardDetails.isEnabled), gapComposer3);
            rememberUpdatedState2 = Updater.rememberUpdatedState(Boolean.valueOf(heroCardDetails.isLocked), gapComposer3);
            MutableState rememberUpdatedState62 = Updater.rememberUpdatedState(Boolean.valueOf(heroCardDetails.showPrepurchaseContourText), gapComposer3);
            rememberedValue8 = gapComposer3.rememberedValue();
            Object obj122 = rememberedValue8;
            if (rememberedValue8 == neverEqualPolicy) {
            }
            mutableState3 = (MutableState) obj122;
            Unit unit2 = Unit.INSTANCE;
            changed = gapComposer3.changed(collectIsPressedAsState) | gapComposer3.changed(rememberUpdatedState2);
            rememberedValue9 = gapComposer3.rememberedValue();
            if (changed) {
            }
            rememberedValue9 = new TakeUntil$collectSafely$2(mutableState3, snapshotStateList, collectIsPressedAsState, rememberUpdatedState2, null, 11);
            snapshotStateList2 = snapshotStateList;
            mutableState4 = collectIsPressedAsState;
            companion = companion2;
            mutableState5 = rememberUpdatedState2;
            gapComposer3.updateRememberedValue(rememberedValue9);
            Updater.LaunchedEffect(gapComposer3, unit2, (Function2) rememberedValue9);
            changed2 = gapComposer3.changed(rememberUpdatedState52) | gapComposer3.changed(rememberUpdatedState62) | gapComposer3.changed(rememberUpdatedState) | gapComposer3.changed(mutableState5);
            Object rememberedValue152 = gapComposer3.rememberedValue();
            if (changed2) {
            }
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
            button = button4;
            mutableState6 = rememberUpdatedState;
            mutableState7 = mutableState;
            mutableState8 = mutableState2;
            heroCardViewKt$Render$1$4$1 = new HeroCardViewKt$Render$1$4$1(state2, rememberUpdatedState52, rememberUpdatedState62, mutableState6, mutableState92, mutableState5, (Continuation) null, 0);
            gapComposer3.updateRememberedValue(heroCardViewKt$Render$1$4$1);
            Updater.LaunchedEffect(gapComposer3, unit2, (Function2) heroCardViewKt$Render$1$4$1);
            rememberedValue10 = gapComposer3.rememberedValue();
            if (rememberedValue10 != neverEqualPolicy) {
            }
            Updater.LaunchedEffect(gapComposer3, unit2, (Function2) obj2);
            rememberedValue11 = gapComposer3.rememberedValue();
            if (rememberedValue11 != neverEqualPolicy) {
            }
            Updater.LaunchedEffect(gapComposer3, unit2, (Function2) obj3);
            button2 = button;
            MutableState mutableState112 = mutableState6;
            Modifier.Companion companion32 = companion;
            SnapshotStateList snapshotStateList42 = snapshotStateList2;
            MutableState mutableState122 = mutableState5;
            function12 = function1;
            zzsh.WindowBoundLifecycle(Expect_jvmKt.rememberComposableLambda(680434999, new DateInputKt$$ExternalSyntheticLambda1(mutableState112, function1, heroCard, mutableState122, mutableState7, mutableState102, mutableState92, mutableState8, 13), gapComposer3), gapComposer3, 6);
            changed3 = gapComposer3.changed(mutableState4);
            Object rememberedValue162 = gapComposer3.rememberedValue();
            Object obj132 = rememberedValue162;
            if (!changed3) {
            }
            HeroCardViewKt$Render$1$8$1 heroCardViewKt$Render$1$8$12 = new HeroCardViewKt$Render$1$8$1(mutableState4, mutableState92, null, 0);
            gapComposer3.updateRememberedValue(heroCardViewKt$Render$1$8$12);
            obj132 = heroCardViewKt$Render$1$8$12;
            Updater.LaunchedEffect(gapComposer3, unit2, (Function2) obj132);
            rememberedValue12 = gapComposer3.rememberedValue();
            Object obj142 = rememberedValue12;
            if (rememberedValue12 == neverEqualPolicy) {
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) obj142;
            if (button5 != null) {
            }
            if (button2 != null) {
            }
            gapComposer3.startReplaceGroup(1394105204);
            gapComposer3.end(false);
            gapComposer3.end(true);
            gapComposer = gapComposer3;
        } else {
            function12 = function1;
            GapComposer gapComposer4 = gapComposer2;
            gapComposer4.skipToGroupEnd();
            gapComposer = gapComposer4;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(heroCard, modifier, function12, false, i, 26);
        }
    }

    public static final void SlimCardRender(Modifier modifier, CardSchemeViewModel.Module.HeroCardDetails heroCardDetails, Function0 function0, boolean z, Composer composer, int i) {
        CardSchemeViewModel.Module.HeroCardDetails heroCardDetails2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1127907658);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(heroCardDetails) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128) | (gapComposer.changed(z) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Painter painterResource = Countries.painterResource(R.drawable.prepurchase_card_contour_text, 0, gapComposer);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.text.standard;
            Modifier m292widthInVpY3zN4$default = SizeKt.m292widthInVpY3zN4$default(modifier, RecyclerView.DECELERATION_RATE, PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.wallet_card_max_width), 1);
            boolean changedInstance = gapComposer.changedInstance(heroCardDetails) | gapComposer.changedInstance(painterResource) | gapComposer.changed(j);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                heroCardDetails2 = heroCardDetails;
                CaptureCheckFaceKt$$ExternalSyntheticLambda7 captureCheckFaceKt$$ExternalSyntheticLambda7 = new CaptureCheckFaceKt$$ExternalSyntheticLambda7(heroCardDetails2, painterResource, j, 7);
                gapComposer.updateRememberedValue(captureCheckFaceKt$$ExternalSyntheticLambda7);
                rememberedValue = captureCheckFaceKt$$ExternalSyntheticLambda7;
            } else {
                heroCardDetails2 = heroCardDetails;
            }
            CashCardKt.BaseCashCard(KeypadKt.m3658mooncakeShadowWMci_g0$default(ClipKt.drawWithContent(m292widthInVpY3zN4$default, (Function1) rememberedValue), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0.2f, RoundedCornerShapeKt.RoundedCornerShape(6), 19), heroCardDetails2.cardTheme, Expect_jvmKt.rememberComposableLambda(-1825110788, new EducationalSheetKt$$ExternalSyntheticLambda8(heroCardDetails2, z, function0, 8), gapComposer), gapComposer, MLKEMEngine.KyberPolyBytes);
        } else {
            heroCardDetails2 = heroCardDetails;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HeroCardViewKt$$ExternalSyntheticLambda32(modifier, heroCardDetails2, function0, z, i);
        }
    }
}
