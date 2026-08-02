package com.squareup.cash.wallet.views;

import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import coil3.size.SizeKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.cash.support.viewmodels.SupportHomeViewEvent;
import com.squareup.cash.support.viewmodels.SupportIncidentDetailsViewEvent;
import com.squareup.cash.support.views.ScreenshotConfirmView;
import com.squareup.cash.support.views.ScreenshotReviewViewKt;
import com.squareup.cash.support.views.ScreenshotReviewViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.support.views.SupportLoadClientScenarioView;
import com.squareup.cash.support.views.home.SupportHomeViewKt;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda8;
import com.squareup.cash.taptopay.views.TapToPayKt;
import com.squareup.cash.transactionpicker.viewmodels.TransactionPickerViewEvent;
import com.squareup.cash.transactionpicker.viewmodels.TransactionViewModel;
import com.squareup.cash.wallet.presenters.CardLockViewEvent;
import com.squareup.cash.wallet.viewmodels.WalletHomeViewEvent;
import com.squareup.cash.work.views.shift.ShiftDetailViewKt;
import com.squareup.cash.work.webview.views.WorkWebViewKt$$ExternalSyntheticLambda14;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public final /* synthetic */ class HeroCardNullStateKt$$ExternalSyntheticLambda8 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ HeroCardNullStateKt$$ExternalSyntheticLambda8(int i, int i2, Function1 function1) {
        this.$r8$classId = i2;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ((String) obj2).getClass();
                function1.invoke(new WalletHomeViewEvent.OpenUrl(str));
                return Unit.INSTANCE;
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = ScreenshotConfirmView.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ScreenshotReviewViewKt.ScreenshotConfirm(function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ModalKt.HorizontalDivider(0, 1, gapComposer2, null);
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(17, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    SizeKt.Button((Function0) rememberedValue, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), ButtonProminence.SUBTLE, false, false, null, ScreenshotReviewViewKt.lambda$383647945, gapComposer2, 1573296, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                ((String) obj2).getClass();
                function1.invoke(new SupportIncidentDetailsViewEvent.OpenUrl(str2));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.SupportIncidentLoading(function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i3 = SupportLoadClientScenarioView.$r8$clinit;
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ScreenshotReviewViewKt.LoadingUi(function1, gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.LoadingUi(function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    SupportHomeViewKt.DisputeCell(function1, gapComposer4, 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(1 & intValue5, (intValue5 & 3) != 2)) {
                    String stringResource = Room.stringResource(gapComposer5, R.string.support_home_header_contact_subtitle);
                    TextStyle textStyle = Strings.getTypography(gapComposer5).bodyMedium;
                    long j = Strings.getColors(gapComposer5).semantic.text.subtle;
                    MarkdownSpanValues markdownSpanValues = new MarkdownSpanValues(SpanStyle.m973copyGSF8kmg$default(Strings.getTypography(gapComposer5).linkMedium.spanStyle, Strings.getColors(gapComposer5).semantic.text.subtle, null, 0L, JpegConstants.COM_MARKER), SpanStyle.m973copyGSF8kmg$default(Strings.getTypography(gapComposer5).linkMedium.spanStyle, Strings.getColors(gapComposer5).semantic.text.subtle, null, 0L, JpegConstants.COM_MARKER));
                    boolean changed2 = gapComposer5.changed(function1);
                    Object rememberedValue2 = gapComposer5.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new HeroCardNullStateKt$$ExternalSyntheticLambda8(9, function1);
                        gapComposer5.updateRememberedValue(rememberedValue2);
                    }
                    LazyDslKt.m304MarkdownTextpCuZGqc(stringResource, (Function2) rememberedValue2, null, textStyle, j, markdownSpanValues, null, null, 0, 0, 0, gapComposer5, 0, 1988);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                ((String) obj).getClass();
                ((String) obj2).getClass();
                function1.invoke(SupportHomeViewEvent.MoreContactOptionsClicked.INSTANCE);
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                SupportHomeViewKt.DisputeCell(function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Modifier fillMaxSize = androidx.compose.foundation.layout.SizeKt.fillMaxSize(SpacerKt.navigationBarsPadding(companion), 1.0f);
                    Colors colors = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                    } else {
                        gapComposer6.startReplaceGroup(-1762997739);
                        gapComposer6.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer6, 0);
                    int hashCode = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer6.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer6, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer6.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer6.startReusableNode();
                    if (gapComposer6.inserting) {
                        gapComposer6.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer6.useNode();
                    }
                    Updater.m576setimpl(gapComposer6, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer6, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer6, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer6, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer6, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    ComposableLambdaImpl composableLambdaImpl = TapToPayKt.lambda$1253802262;
                    NavigationType navigationType = NavigationType.CLOSE;
                    boolean changed3 = gapComposer6.changed(function1);
                    Object rememberedValue3 = gapComposer6.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new TabToolbarsKt$$ExternalSyntheticLambda8(19, function1);
                        gapComposer6.updateRememberedValue(rememberedValue3);
                    }
                    DBUtil.TitleBarSub(composableLambdaImpl, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue3, (Modifier) null, (Function3) null, gapComposer6, 54, 108);
                    TapToPayKt.Body(gapComposer6, 0);
                    SpacerKt.Spacer(gapComposer6, new LayoutWeightElement(1.0f, true));
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    ((DefaultSizes) gapComposer6.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier imePadding = SpacerKt.imePadding(SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2));
                    boolean changed4 = gapComposer6.changed(function1);
                    Object rememberedValue4 = gapComposer6.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new TabToolbarsKt$$ExternalSyntheticLambda8(20, function1);
                        gapComposer6.updateRememberedValue(rememberedValue4);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue4, imePadding, buttonProminence, false, false, null, TapToPayKt.f726lambda$1758694261, gapComposer6, 1573248, 56);
                    gapComposer6.end(true);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Modifier fillMaxSize2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize(SpacerKt.navigationBarsPadding(companion), 1.0f);
                    Colors colors2 = (Colors) gapComposer7.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer7, -1762997026, gapComposer7, false);
                    } else {
                        gapComposer7.startReplaceGroup(-1762997739);
                        gapComposer7.end(false);
                    }
                    Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer7, 0);
                    int hashCode2 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer7, m177backgroundbw27NRU2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer7.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer7, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer7, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    ComposableLambdaImpl composableLambdaImpl2 = TapToPayKt.f717lambda$1035697258;
                    NavigationType navigationType2 = NavigationType.CLOSE;
                    boolean changed5 = gapComposer7.changed(function1);
                    Object rememberedValue5 = gapComposer7.rememberedValue();
                    if (changed5 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new TabToolbarsKt$$ExternalSyntheticLambda8(21, function1);
                        gapComposer7.updateRememberedValue(rememberedValue5);
                    }
                    DBUtil.TitleBarSub(composableLambdaImpl2, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue5, (Modifier) null, (Function3) null, gapComposer7, 54, 108);
                    TapToPayKt.Body$1(gapComposer7, 0);
                    SpacerKt.Spacer(gapComposer7, new LayoutWeightElement(1.0f, true));
                    DimensionKt.ButtonCtaGroup(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), false, null, null, Expect_jvmKt.rememberComposableLambda(-265665138, new WorkWebViewKt$$ExternalSyntheticLambda14(11, function1), gapComposer7), gapComposer7, 24582, 14);
                    gapComposer7.end(true);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                boolean shouldExecute = gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2);
                Applier applier = gapComposer8.applier;
                if (shouldExecute) {
                    Modifier fillMaxSize3 = androidx.compose.foundation.layout.SizeKt.fillMaxSize(SpacerKt.navigationBarsPadding(companion), 1.0f);
                    Colors colors3 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                    } else {
                        gapComposer8.startReplaceGroup(-1762997739);
                        gapComposer8.end(false);
                    }
                    Modifier m177backgroundbw27NRU3 = ImageKt.m177backgroundbw27NRU(fillMaxSize3, colors3.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer8, 0);
                    int hashCode3 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer8, m177backgroundbw27NRU3);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer8.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer8, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode3);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer8, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer8, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer8, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    ComposableLambdaImpl composableLambdaImpl3 = TapToPayKt.f721lambda$1256673354;
                    NavigationType navigationType3 = NavigationType.CLOSE;
                    boolean changed6 = gapComposer8.changed(function1);
                    Object rememberedValue6 = gapComposer8.rememberedValue();
                    if (changed6 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new TabToolbarsKt$$ExternalSyntheticLambda8(24, function1);
                        gapComposer8.updateRememberedValue(rememberedValue6);
                    }
                    DBUtil.TitleBarSub(composableLambdaImpl3, navigationType3, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue6, (Modifier) null, (Function3) null, gapComposer8, 54, 108);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer8.consume(staticProvidableCompositionLocal)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, 1);
                    ((DefaultSizes) gapComposer8.consume(staticProvidableCompositionLocal)).getClass();
                    ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer8, 0);
                    int hashCode4 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer8, m300paddingVpY3zN4$default);
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer8.useNode();
                    }
                    Updater.m576setimpl(gapComposer8, columnMeasurePolicy4, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer8, composeUiNode$Companion$SetModifier$13, gapComposer8, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer8, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                    String stringResource2 = Room.stringResource(gapComposer8, R.string.tap_to_pay_demo_mode_test_amount);
                    stringResource2.getClass();
                    String format2 = new MessageFormat(Room.stringResource(gapComposer8, R.string.tap_to_pay_payment_confirmation_description)).format(new Object[]{stringResource2});
                    format2.getClass();
                    Countries.PageHeader(format2, (Modifier) null, TapToPayKt.lambda$1946565903, (String) null, gapComposer8, MLKEMEngine.KyberPolyBytes, 10);
                    SpacerKt.Spacer(gapComposer8, new LayoutWeightElement(1.0f, true));
                    ButtonProminence buttonProminence2 = ButtonProminence.STANDARD;
                    Modifier fillMaxWidth2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    ((DefaultSizes) gapComposer8.consume(staticProvidableCompositionLocal)).getClass();
                    Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    boolean changed7 = gapComposer8.changed(function1);
                    Object rememberedValue7 = gapComposer8.rememberedValue();
                    if (changed7 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new TabToolbarsKt$$ExternalSyntheticLambda8(25, function1);
                        gapComposer8.updateRememberedValue(rememberedValue7);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue7, m300paddingVpY3zN4$default2, buttonProminence2, false, false, null, TapToPayKt.lambda$811769845, gapComposer8, 1573248, 56);
                    gapComposer8.end(true);
                    gapComposer8.end(true);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    Modifier fillMaxSize4 = androidx.compose.foundation.layout.SizeKt.fillMaxSize(SpacerKt.navigationBarsPadding(companion), 1.0f);
                    Colors colors4 = (Colors) gapComposer9.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                    } else {
                        gapComposer9.startReplaceGroup(-1762997739);
                        gapComposer9.end(false);
                    }
                    Modifier m177backgroundbw27NRU4 = ImageKt.m177backgroundbw27NRU(fillMaxSize4, colors4.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    ColumnMeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer9, 0);
                    int hashCode5 = Long.hashCode(gapComposer9.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer9.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer9, m177backgroundbw27NRU4);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer9.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer9.startReusableNode();
                    if (gapComposer9.inserting) {
                        gapComposer9.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer9.useNode();
                    }
                    Updater.m576setimpl(gapComposer9, columnMeasurePolicy5, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer9, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer9, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer9, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer9, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                    ComposableLambdaImpl composableLambdaImpl4 = TapToPayKt.f725lambda$1754564422;
                    NavigationType navigationType4 = NavigationType.CLOSE;
                    boolean changed8 = gapComposer9.changed(function1);
                    Object rememberedValue8 = gapComposer9.rememberedValue();
                    if (changed8 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new TabToolbarsKt$$ExternalSyntheticLambda8(29, function1);
                        gapComposer9.updateRememberedValue(rememberedValue8);
                    }
                    DBUtil.TitleBarSub(composableLambdaImpl4, navigationType4, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue8, (Modifier) null, (Function3) null, gapComposer9, 54, 108);
                    TapToPayKt.PaymentIncomplete(function1, gapComposer9, 0);
                    gapComposer9.end(true);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                TapToPayKt.PaymentIncomplete(function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                TransactionViewModel transactionViewModel = (TransactionViewModel) obj;
                ((Integer) obj2).getClass();
                transactionViewModel.getClass();
                function1.invoke(new TransactionPickerViewEvent.SelectTransaction(transactionViewModel.token));
                return Unit.INSTANCE;
            case 17:
                TransactionViewModel transactionViewModel2 = (TransactionViewModel) obj;
                ((Integer) obj2).getClass();
                transactionViewModel2.getClass();
                function1.invoke(new TransactionPickerViewEvent.SelectTransaction(transactionViewModel2.token));
                return Unit.INSTANCE;
            case 18:
                String str3 = (String) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                str3.getClass();
                function1.invoke(new CardLockViewEvent.ToggleLock(str3, booleanValue));
                return Unit.INSTANCE;
            case 19:
                String str4 = (String) obj;
                str4.getClass();
                ((String) obj2).getClass();
                function1.invoke(new WalletHomeViewEvent.OpenUrl(str4));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                ShiftDetailViewKt.ErrorShiftDetailView(function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    InstitutionPickerScreenKt.ClearSearchButton(function1, (FinancialConnectionsColors) gapComposer10.consume(ThemeKt.LocalColors), gapComposer10, 0);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ HeroCardNullStateKt$$ExternalSyntheticLambda8(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }
}
