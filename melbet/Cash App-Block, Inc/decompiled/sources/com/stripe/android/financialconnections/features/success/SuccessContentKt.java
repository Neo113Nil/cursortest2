package com.stripe.android.financialconnections.features.success;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.OutlinedTextFieldKt$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda34;
import app.cash.molecule.PlatformKt;
import com.braze.Braze$$ExternalSyntheticLambda34;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda10;
import com.squareup.cash.moneybot.widgets.ComposerKt$$ExternalSyntheticLambda12;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda0;
import com.squareup.cash.shopping.views.ShopErrorKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$8$1;
import com.squareup.cash.work.views.pay.PayCellViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda12;
import com.squareup.util.cash.Countries;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.success.SuccessState;
import com.stripe.android.financialconnections.model.Body$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.components.StringAnnotation;
import com.stripe.android.financialconnections.ui.components.TextKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTypography;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda5;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Function;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class SuccessContentKt {
    public static final EnterTransitionImpl FADE_IN_ANIMATION;
    public static final EnterTransitionImpl SUCCESS_SLIDE_IN_ANIMATION;

    static {
        EnterTransitionImpl fadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 0, null, 6), 2);
        FADE_IN_ANIMATION = fadeIn$default;
        SUCCESS_SLIDE_IN_ANIMATION = fadeIn$default.plus(EnterExitTransitionKt.slideInVertically$default(1, new StripeApiRepository$$ExternalSyntheticLambda5(8)));
    }

    public static final void SpinnerToCheckmark(int i, Composer composer, Modifier modifier, Function0 function0, boolean z) {
        int i2;
        GapComposer gapComposer;
        Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1403936941);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Number) function0.invoke()).floatValue(), AnimatableKt.spring$default(0.5f, 1500.0f, null, 4), "CheckmarkScale", null, gapComposer2, 3120, 20);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (z) {
                gapComposer2.startReplaceGroup(-293447625);
                ListItemKt.m4014LoadingSpinneruFdPcIQ(SizeKt.fillMaxSize(companion, 1.0f), RecyclerView.DECELERATION_RATE, null, gapComposer2, 0, 6);
                gapComposer = gapComposer2;
                gapComposer.end(false);
            } else {
                gapComposer2.startReplaceGroup(-293328058);
                BiasAlignment biasAlignment = Alignment.Companion.Center;
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 56.0f);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ThemeKt.LocalColors;
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m285size3ABfNKs, ((FinancialConnectionsColors) gapComposer2.consume(staticProvidableCompositionLocal)).primary, RoundedCornerShapeKt.CircleShape);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
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
                Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m574initimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                boolean changed = gapComposer2.changed(animateFloatAsState);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda10(animateFloatAsState, 26);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                IconKt.m492Iconww6aTOc(Countries.painterResource(R.drawable.stripe_ic_checkmark, 0, gapComposer2), Room.stringResource(gapComposer2, R.string.stripe_success_pane_title), ColorKt.graphicsLayer(companion, (Function1) rememberedValue), ((FinancialConnectionsColors) gapComposer2.consume(staticProvidableCompositionLocal)).primaryAccent, gapComposer2, Painter.$stable, 0);
                gapComposer = gapComposer2;
                gapComposer.end(true);
                gapComposer.end(false);
            }
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposerKt$$ExternalSyntheticLambda12(z, function0, modifier2, i, 5);
        }
    }

    /* renamed from: SpinnerToSuccessAnimation-8GFhAUE, reason: not valid java name */
    public static final void m4017SpinnerToSuccessAnimation8GFhAUE(boolean z, TextResource textResource, TextResource textResource2, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        float f;
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1548446839);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed((Object) null) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? gapComposer.changed(textResource) : gapComposer.changedInstance(textResource) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? gapComposer.changed(textResource2) : gapComposer.changedInstance(textResource2) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            PlatformHapticFeedback platformHapticFeedback = (PlatformHapticFeedback) gapComposer.consume(CompositionLocalsKt.LocalHapticFeedback);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            Object[] objArr = new Object[0];
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = new Body$$ExternalSyntheticLambda0(10);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            ref$BooleanRef.element = ((Boolean) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue2, gapComposer, 48)).booleanValue();
            Object[] objArr2 = new Object[0];
            int i4 = i3 & 14;
            boolean z3 = i4 == 4;
            Object rememberedValue3 = gapComposer.rememberedValue();
            int i5 = 12;
            if (z3 || rememberedValue3 == obj) {
                rememberedValue3 = new Braze$$ExternalSyntheticLambda34(z, i5);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            MutableFloatState mutableFloatState = (MutableFloatState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue3, gapComposer, 0);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == obj) {
                rememberedValue4 = Updater.mutableStateOf$default(new Dp(RecyclerView.DECELERATION_RATE));
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState = (MutableState) rememberedValue4;
            if (z || ref$BooleanRef.element) {
                f = 0.0f;
                z2 = false;
                gapComposer.startReplaceGroup(-1837288071);
            } else {
                gapComposer.startReplaceGroup(-1830396120);
                f = 0.0f;
                Updater.LaunchedEffect(gapComposer, Unit.INSTANCE, new InquiryViewModel.AnonymousClass1(platformHapticFeedback, ref$BooleanRef, null, i5));
                z2 = false;
            }
            gapComposer.end(z2);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, z2);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            boolean changed = gapComposer.changed(((Dp) mutableState.getValue()).value);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changed || rememberedValue5 == obj) {
                long floatToRawIntBits = (Float.floatToRawIntBits(((88.0f + ((Dp) mutableState.getValue()).value) / 2.0f) * (-1.0f)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f) << 32);
                IntOffset intOffset = new IntOffset((density.mo230roundToPx0680j_4(DpOffset.m1040getYD9Ej5fM(floatToRawIntBits)) & BodyPartID.bodyIdMax) | (density.mo230roundToPx0680j_4(DpOffset.m1039getXD9Ej5fM(floatToRawIntBits)) << 32));
                gapComposer.updateRememberedValue(intOffset);
                rememberedValue5 = intOffset;
            }
            long j = ((IntOffset) rememberedValue5).packedValue;
            if (z) {
                j = 0;
            }
            boolean changedInstance = gapComposer.changedInstance(coroutineScope) | gapComposer.changed(mutableFloatState);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue6 == obj) {
                rememberedValue6 = new HeroCardViewKt$$ExternalSyntheticLambda0(20, coroutineScope, mutableFloatState);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            State animateValueAsState = AnimateAsStateKt.animateValueAsState(new IntOffset(j), AnimatableKt.IntOffsetToVector, AnimateAsStateKt.intOffsetDefaultSpring, null, "SpinnerPositionOffset", (Function1) rememberedValue6, gapComposer, 24576, 8);
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 56.0f);
            boolean changed2 = gapComposer.changed(animateValueAsState);
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue7 == obj) {
                rememberedValue7 = new MoneyTabUIKt$$ExternalSyntheticLambda10(animateValueAsState, 25);
                gapComposer.updateRememberedValue(rememberedValue7);
            }
            CrossfadeKt.Crossfade(Boolean.valueOf(z), OffsetKt.offset(m285size3ABfNKs, (Function1) rememberedValue7), (FiniteAnimationSpec) null, "SpinnerToCheckmarkCrossfade", Expect_jvmKt.rememberComposableLambda(-303768988, new CardAppletTile$$ExternalSyntheticLambda1(mutableFloatState, 23), gapComposer), gapComposer, i4 | 27648, 4);
            AnimatedContentKt.AnimatedVisibility(!z, (Modifier) null, SUCCESS_SLIDE_IN_ANIMATION, (ExitTransitionImpl) null, (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(-167121685, new BasicShieetScope$$ExternalSyntheticLambda0(textResource, textResource2, density, mutableState, 17), gapComposer), (Composer) gapComposer, 196992, 26);
            gapComposer = gapComposer;
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda34(z, textResource, textResource2, modifier2, i);
        }
    }

    public static final void SuccessBody(TextResource textResource, TextResource textResource2, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(2010724275);
        int i2 = i | (gapComposer2.changed(textResource) ? 4 : 2) | (gapComposer2.changed(textResource2) ? 32 : 16) | (gapComposer2.changed(modifier) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterHorizontally, gapComposer2, 54);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
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
            Updater.m574initimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (textResource2 == null) {
                gapComposer2.startReplaceGroup(1501274728);
                gapComposer2.end(false);
                gapComposer = gapComposer2;
            } else {
                gapComposer2.startReplaceGroup(1501274729);
                TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((FinancialConnectionsTypography) gapComposer2.consume(ThemeKt.LocalTypography)).headingXLarge, ((FinancialConnectionsColors) gapComposer2.consume(ThemeKt.LocalColors)).textDefault, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744446);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = new StripeApiRepository$$ExternalSyntheticLambda5(6);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                gapComposer = gapComposer2;
                TextKt.m4020AnnotatedTextrm0N8CA(textResource2, (Function1) rememberedValue, m994copyp1EtxEg$default, null, null, 0, 0, gapComposer, 48, 120);
                gapComposer.end(false);
            }
            if (textResource == null) {
                gapComposer.startReplaceGroup(1501602460);
            } else {
                gapComposer.startReplaceGroup(1501602461);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ThemeKt.LocalTypography;
                TextStyle m994copyp1EtxEg$default2 = TextStyle.m994copyp1EtxEg$default(((FinancialConnectionsTypography) gapComposer.consume(staticProvidableCompositionLocal)).bodyMedium, ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).textDefault, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744446);
                Map mapOf = MapsKt__MapsJVMKt.mapOf(new Pair(StringAnnotation.BOLD, TextStyle.m994copyp1EtxEg$default(((FinancialConnectionsTypography) gapComposer.consume(staticProvidableCompositionLocal)).bodyMediumEmphasized, 0L, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744447).spanStyle));
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new StripeApiRepository$$ExternalSyntheticLambda5(7);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                GapComposer gapComposer3 = gapComposer;
                TextKt.m4020AnnotatedTextrm0N8CA(textResource, (Function1) rememberedValue2, m994copyp1EtxEg$default2, null, mapOf, 0, 0, gapComposer3, (i2 & 14) | 48, 104);
                gapComposer = gapComposer3;
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PayCellViewKt$$ExternalSyntheticLambda0(textResource, textResource2, modifier, i, 22);
        }
    }

    public static final void SuccessContent(Async async, Async async2, Function0 function0, Composer composer, int i) {
        async.getClass();
        async2.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(702297639);
        int i2 = (gapComposer.changedInstance(async) ? 4 : 2) | i | (gapComposer.changed(async2) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            m4018SuccessContentInternal8GFhAUE(async2, async, function0, gapComposer, ((i2 << 6) & 57344) | ((i2 << 3) & 896) | ((i2 << 9) & 7168));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PayCellViewKt$$ExternalSyntheticLambda0((Object) async, (Object) async2, (Function) function0, i, 23);
        }
    }

    /* renamed from: SuccessContentInternal-8GFhAUE, reason: not valid java name */
    public static final void m4018SuccessContentInternal8GFhAUE(Async async, Async async2, Function0 function0, Composer composer, int i) {
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        TextResource textResource;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        TextResource textResource2;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(227504024);
        Applier applier = gapComposer.applier;
        int i2 = i | 54;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? gapComposer.changed(async) : gapComposer.changedInstance(async) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(async2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Object[] objArr = new Object[0];
            boolean z2 = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (z2 || rememberedValue == obj) {
                rememberedValue = new Body$$ExternalSyntheticLambda0(11);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 0);
            boolean z3 = (i2 & 896) == 256 || ((i2 & 512) != 0 && gapComposer.changed(async));
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z3 || rememberedValue2 == obj) {
                rememberedValue2 = Updater.mutableStateOf$default(async.invoke());
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            SuccessState.Payload payload = (SuccessState.Payload) mutableState2.getValue();
            Continuation continuation = null;
            if (payload == null) {
                gapComposer.startReplaceGroup(114432762);
            } else {
                gapComposer.startReplaceGroup(114432763);
                if (payload.skipSuccessPane) {
                    gapComposer.startReplaceGroup(1656807731);
                } else {
                    gapComposer.startReplaceGroup(1662055318);
                    Boolean bool = Boolean.TRUE;
                    boolean changed = gapComposer.changed(mutableState);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed || rememberedValue3 == obj) {
                        rememberedValue3 = new HeroCardViewKt$Render$1$8$1.AnonymousClass3(mutableState, continuation, 22);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    Updater.LaunchedEffect(gapComposer, bool, (Function2) rememberedValue3);
                }
                gapComposer.end(false);
            }
            gapComposer.end(false);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxSize(companion, 1.0f), 24.0f);
            BiasAlignment biasAlignment = Alignment.Companion.TopStart;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m574initimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$14);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$15);
            SuccessState.Payload payload2 = (SuccessState.Payload) mutableState2.getValue();
            TextResource textResource3 = payload2 != null ? payload2.content : null;
            SuccessState.Payload payload3 = (SuccessState.Payload) mutableState2.getValue();
            if (payload3 != null) {
                textResource = payload3.title;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$14;
            } else {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$14;
                textResource = null;
            }
            if (((Boolean) mutableState.getValue()).booleanValue() || ((SuccessState.Payload) mutableState2.getValue()) == null) {
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                textResource2 = textResource3;
                z = true;
            } else {
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                textResource2 = textResource3;
                z = false;
            }
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13 = ownerSnapshotObserver$onCommitAffectingLayout$1;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$1;
            m4017SpinnerToSuccessAnimation8GFhAUE(z, textResource2, textResource, null, gapComposer, i2 & 112);
            Modifier align = BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomCenter);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, align);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$12);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
            SVG$Unit$EnumUnboxingLocalUtility.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$16, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$13);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$15);
            boolean z4 = !((Boolean) mutableState.getValue()).booleanValue();
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-450504524, new BasicShieetScope$$ExternalSyntheticLambda0(async2, function0, mutableState2, mutableState, 16), gapComposer);
            gapComposer = gapComposer;
            AnimatedContentKt.AnimatedVisibility(z4, (Modifier) null, FADE_IN_ANIMATION, (ExitTransitionImpl) null, (String) null, (Function3) rememberComposableLambda, (Composer) gapComposer, 196992, 26);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda12(async, async2, function0, i, 16);
        }
    }

    public static final void SuccessFooter(Modifier modifier, boolean z, boolean z2, String str, Function0 function0, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2107415353);
        int i2 = i | 6 | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changed(z2) ? 256 : 128) | (gapComposer.changed(str) ? 2048 : 1024) | (gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new StripeApiRepository$$ExternalSyntheticLambda5(5);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            TextKt.FinancialConnectionsButton(function0, SizeKt.fillMaxWidth(TestTagKt.testTag(SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue), "done_button"), 1.0f), null, null, z2, z, Expect_jvmKt.rememberComposableLambda(-1959956342, new ShopErrorKt$$ExternalSyntheticLambda0(str, 17), gapComposer), gapComposer, ((i2 >> 12) & 14) | 1572864 | (57344 & (i2 << 6)) | ((i2 << 12) & 458752), 12);
            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
            SpacerKt.Spacer(gapComposer, OffsetKt.windowInsetsBottomHeight(Arrangement$End$1.current(gapComposer).navigationBars));
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OutlinedTextFieldKt$$ExternalSyntheticLambda4(modifier2, z, z2, str, function0, i);
        }
    }
}
