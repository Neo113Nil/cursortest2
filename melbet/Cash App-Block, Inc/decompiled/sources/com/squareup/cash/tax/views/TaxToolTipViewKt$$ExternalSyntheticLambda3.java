package com.squareup.cash.tax.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda25;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.ConstraintsSizeResolver$$ExternalSyntheticLambda0;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.card.onboarding.ZoomLevel;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.views.shared.FlowToken;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypography;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypographyKt;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.onboarding.viewmodels.OnboardingLandingViewModel;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.paymentpad.viewmodels.ExchangeRatePreview;
import com.squareup.cash.paymentpad.viewmodels.LitePaymentPadViewModel;
import com.squareup.cash.paymentpad.views.HomeViewKt;
import com.squareup.cash.paymentpad.views.HomeViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.tax.primitives.TaxTooltipModel;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class TaxToolTipViewKt$$ExternalSyntheticLambda3 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ TaxToolTipViewKt$$ExternalSyntheticLambda3(long j, RoundedCornerShape roundedCornerShape, Density density) {
        this.$r8$classId = 4;
        this.f$1 = j;
        this.f$0 = roundedCornerShape;
        this.f$2 = density;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        long j = this.f$1;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj4 = this.f$2;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                TaxTooltipModel taxTooltipModel = (TaxTooltipModel) obj5;
                Function1 function1 = (Function1) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion, 24.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    String str = taxTooltipModel.title;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = MooncakeTypographyKt.LocalTypography;
                    MooncakeTypography mooncakeTypography = (MooncakeTypography) gapComposer.consume(staticProvidableCompositionLocal);
                    if (mooncakeTypography == null) {
                        mooncakeTypography = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                    }
                    TextStyle textStyle = mooncakeTypography.mainTitle;
                    long j2 = this.f$1;
                    KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 3072, 0, 4082, j2, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 8.0f));
                    String str2 = taxTooltipModel.body;
                    MooncakeTypography mooncakeTypography2 = (MooncakeTypography) gapComposer.consume(staticProvidableCompositionLocal);
                    if (mooncakeTypography2 == null) {
                        mooncakeTypography2 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                    }
                    KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 3072, 0, 4082, j2, (Composer) gapComposer, (Modifier) null, mooncakeTypography2.mainBody, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 16.0f));
                    String str3 = taxTooltipModel.button;
                    MooncakePillButton.Size size = MooncakePillButton.Size.SMALL;
                    MooncakePillButton.Style style = MooncakePillButton.Style.PRIMARY;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new TaxReturnsView$$ExternalSyntheticLambda0(5, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    KeypadKt.m3640ButtonGFipHI0(str3, (Function0) rememberedValue, null, null, size, style, null, false, 0, null, null, gapComposer, 221184, 0, 4044);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Density density = (Density) obj5;
                MeasureScope measureScope = (MeasureScope) obj;
                Measurable measurable = (Measurable) obj2;
                measureScope.getClass();
                measurable.getClass();
                long Size = DimensionKt.Size(density.mo236toPx0680j_4(Size.m643getWidthimpl(j)), density.mo236toPx0680j_4(Size.m640getHeightimpl(j)));
                long mo832computeScaleFactorH7hwNQA = ((ContentScale) obj4).mo832computeScaleFactorH7hwNQA(Size, DimensionKt.Size(Constraints.m1025getMaxWidthimpl(r3.value), Constraints.m1024getMaxHeightimpl(r3.value)));
                Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(((Constraints) obj3).value, 0, MathKt__MathJVMKt.roundToInt(ScaleFactor.m857getScaleXimpl(mo832computeScaleFactorH7hwNQA) * Size.m643getWidthimpl(Size)), 0, MathKt__MathJVMKt.roundToInt(ScaleFactor.m858getScaleYimpl(mo832computeScaleFactorH7hwNQA) * Size.m640getHeightimpl(Size)), 5));
                return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new ConstraintsSizeResolver$$ExternalSyntheticLambda0(mo833measureBRTryo0, 9));
            case 2:
                String str4 = (String) obj5;
                String str5 = (String) obj4;
                ZoomLevel zoomLevel = (ZoomLevel) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                zoomLevel.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(zoomLevel.ordinal()) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    ZoomLevel zoomLevel2 = ZoomLevel.FAR;
                    long j3 = this.f$1;
                    if (zoomLevel == zoomLevel2) {
                        gapComposer2.startReplaceGroup(-453097912);
                        ImageKt.Image(Countries.painterResource(R.drawable.ic_grid_medium, 0, gapComposer2), str4, SizeKt.m285size3ABfNKs(companion, 24.0f), null, ContentScale.Companion.Inside, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j3, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j3), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer2, Painter.$stable | 24960, 40);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-452737258);
                        Trace.m1191Iconww6aTOc(Icons.NumberPad24, str5, (Modifier) null, j3, gapComposer2, 6, 4);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                String str6 = (String) obj5;
                TextStyle textStyle2 = (TextStyle) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, this.f$1, (Composer) gapComposer3, (Modifier) null, textStyle2, (TextLineBalancing) null, str6, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                RoundedCornerShape roundedCornerShape = (RoundedCornerShape) obj5;
                Density density2 = (Density) obj4;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                boolean shouldExecute = gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16);
                Applier applier = gapComposer4.applier;
                if (shouldExecute) {
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(companion2, 76.0f);
                    Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m277height3ABfNKs, colors.semantic.background.f1047app, ColorKt.RectangleShape);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer4.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer4, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer4, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer4.consume(staticProvidableCompositionLocal2)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer4, 0);
                    int hashCode3 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer4, m300paddingVpY3zN4$default);
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer4, composeUiNode$Companion$SetModifier$13, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer4, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    ((DefaultSizes) gapComposer4.consume(staticProvidableCompositionLocal2)).getClass();
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(companion2, 16.0f), j, roundedCornerShape), gapComposer4, 0);
                    SpacerKt.Spacer(gapComposer4, SizeKt.m290width3ABfNKs(companion2, 16.0f));
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer4, 0);
                    int hashCode4 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer4, companion2);
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer4, composeUiNode$Companion$SetModifier$13, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer4, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m287sizeVpY3zN4(companion2, 180.0f, density2.mo231toDpGaN1DYA(Room.getSp(16))), j, roundedCornerShape), gapComposer4, 0);
                    ((DefaultSizes) gapComposer4.consume(staticProvidableCompositionLocal2)).getClass();
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m287sizeVpY3zN4(SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), 118.0f, density2.mo231toDpGaN1DYA(Room.getSp(16))), j, roundedCornerShape), gapComposer4, 0);
                    gapComposer4.end(true);
                    gapComposer4.end(true);
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                FlowToken flowToken = (FlowToken) obj5;
                TextStyle textStyle3 = (TextStyle) obj4;
                Composer composer5 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                if (flowToken instanceof FlowToken.Word) {
                    GapComposer gapComposer5 = (GapComposer) composer5;
                    gapComposer5.startReplaceGroup(-1900747321);
                    Room.m1164Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, this.f$1, (Composer) gapComposer5, (Modifier) null, ((FlowToken.Word) flowToken).text, textStyle3, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                    gapComposer5.end(false);
                } else {
                    if (!Intrinsics.areEqual(flowToken, FlowToken.NewLine.INSTANCE)) {
                        throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer5, -1900748736, false);
                    }
                    GapComposer gapComposer6 = (GapComposer) composer5;
                    gapComposer6.startReplaceGroup(-1900744129);
                    SpacerKt.Spacer(gapComposer6, companion);
                    gapComposer6.end(false);
                }
                return Unit.INSTANCE;
            case 6:
                Function1 function12 = (Function1) obj4;
                OnboardingLandingViewModel onboardingLandingViewModel = (OnboardingLandingViewModel) obj5;
                Composer composer6 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer6;
                if (gapComposer7.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    boolean changed2 = gapComposer7.changed(function12);
                    Object rememberedValue2 = gapComposer7.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new DatePickerKt$$ExternalSyntheticLambda25(1, j, function12);
                        gapComposer7.updateRememberedValue(rememberedValue2);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth2, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(277178333, new P2PListViewKt$$ExternalSyntheticLambda12(onboardingLandingViewModel, 19), gapComposer7), gapComposer7, 1573296, 56);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                LitePaymentPadViewModel litePaymentPadViewModel = (LitePaymentPadViewModel) obj5;
                Function1 function13 = (Function1) obj4;
                ColumnScope columnScope = (ColumnScope) obj;
                Composer composer7 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                columnScope.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((GapComposer) composer7).changed(columnScope) ? 4 : 2;
                }
                GapComposer gapComposer8 = (GapComposer) composer7;
                if (gapComposer8.shouldExecute(intValue6 & 1, (intValue6 & 19) != 18)) {
                    ExchangeRatePreview exchangeRatePreview = litePaymentPadViewModel.exchangeRatePreview;
                    if (exchangeRatePreview == null) {
                        gapComposer8.startReplaceGroup(-680364019);
                        gapComposer8.end(false);
                    } else {
                        gapComposer8.startReplaceGroup(-680364018);
                        boolean changed3 = gapComposer8.changed(function13);
                        Object rememberedValue3 = gapComposer8.rememberedValue();
                        if (changed3 || rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = new HomeViewKt$$ExternalSyntheticLambda8(6, function13);
                            gapComposer8.updateRememberedValue(rememberedValue3);
                        }
                        HomeViewKt.m3700ExchangeRatePreviewTextiJQMabo(exchangeRatePreview, this.f$1, (Function0) rememberedValue3, gapComposer8, 0);
                        gapComposer8.end(false);
                    }
                    SpacerKt.Spacer(gapComposer8, columnScope.weight(1.0f, companion, true));
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ TaxToolTipViewKt$$ExternalSyntheticLambda3(Object obj, long j, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
        this.f$2 = obj2;
    }

    public /* synthetic */ TaxToolTipViewKt$$ExternalSyntheticLambda3(Object obj, Object obj2, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = j;
    }

    public /* synthetic */ TaxToolTipViewKt$$ExternalSyntheticLambda3(Function1 function1, long j, OnboardingLandingViewModel onboardingLandingViewModel) {
        this.$r8$classId = 6;
        this.f$2 = function1;
        this.f$1 = j;
        this.f$0 = onboardingLandingViewModel;
    }
}
