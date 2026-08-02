package com.squareup.cash.taptopay.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackKt$spacedBetween$1;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda15;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.moneybot.genie.TextViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.moneybot.widgets.ComposerKt$$ExternalSyntheticLambda14;
import com.squareup.cash.music.views.MusicViewKt$LoadedMusicContent$1$1;
import com.squareup.cash.nearby.views.PulsingState$$ExternalSyntheticLambda0;
import com.squareup.cash.nfc.views.NfcTapAnimationKt;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda4;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda13;
import com.squareup.cash.tabs.views.ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.taptopay.viewmodels.TapToPayAvatarViewModel;
import com.squareup.cash.taptopay.viewmodels.TapToPayErrorDialogViewModel;
import com.squareup.cash.taptopay.viewmodels.TapToPayInitiatorNotesViewModel;
import com.squareup.cash.taptopay.viewmodels.TapToPayPaymentRequestViewModel;
import com.squareup.cash.taptopay.viewmodels.TapToPayPaymentViewModel;
import com.squareup.cash.taptopay.views.components.TapToPayButtonKt;
import com.squareup.cash.tax.views.TaxReturnsView$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.views.TaxTooltipView$$ExternalSyntheticLambda0;
import com.squareup.cash.transfers.views.AddMoneyViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda4;
import com.squareup.cash.wallet.views.HeroCardNullStateKt$$ExternalSyntheticLambda8;
import com.squareup.cash.work.views.ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class TapToPayKt {
    public static final ComposableLambdaImpl lambda$1253802262 = new ComposableLambdaImpl(new TapToPayKt$$ExternalSyntheticLambda0(1), false, 1253802262);

    /* renamed from: lambda$-1758694261, reason: not valid java name */
    public static final ComposableLambdaImpl f726lambda$1758694261 = new ComposableLambdaImpl(new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(5), false, -1758694261);

    /* renamed from: lambda$-1552185730, reason: not valid java name */
    public static final ComposableLambdaImpl f724lambda$1552185730 = new ComposableLambdaImpl(new TapToPayKt$$ExternalSyntheticLambda0(2), false, -1552185730);

    /* renamed from: lambda$-104665017, reason: not valid java name */
    public static final ComposableLambdaImpl f718lambda$104665017 = new ComposableLambdaImpl(new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(6), false, -104665017);

    /* renamed from: lambda$-1331597647, reason: not valid java name */
    public static final ComposableLambdaImpl f722lambda$1331597647 = new ComposableLambdaImpl(new TapToPayKt$$ExternalSyntheticLambda0(3), false, -1331597647);

    /* renamed from: lambda$-1035697258, reason: not valid java name */
    public static final ComposableLambdaImpl f717lambda$1035697258 = new ComposableLambdaImpl(new TapToPayKt$$ExternalSyntheticLambda0(4), false, -1035697258);

    /* renamed from: lambda$-731478733, reason: not valid java name */
    public static final ComposableLambdaImpl f727lambda$731478733 = new ComposableLambdaImpl(new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(7), false, -731478733);
    public static final ComposableLambdaImpl lambda$1203116202 = new ComposableLambdaImpl(new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(8), false, 1203116202);

    /* renamed from: lambda$-1256673354, reason: not valid java name */
    public static final ComposableLambdaImpl f721lambda$1256673354 = new ComposableLambdaImpl(new TapToPayKt$$ExternalSyntheticLambda0(5), false, -1256673354);
    public static final ComposableLambdaImpl lambda$1946565903 = new ComposableLambdaImpl(new TapToPayKt$$ExternalSyntheticLambda0(6), false, 1946565903);
    public static final ComposableLambdaImpl lambda$811769845 = new ComposableLambdaImpl(new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(9), false, 811769845);
    public static final ComposableLambdaImpl lambda$524232559 = new ComposableLambdaImpl(new TapToPayKt$$ExternalSyntheticLambda0(7), false, 524232559);
    public static final ComposableLambdaImpl lambda$1043204854 = new ComposableLambdaImpl(new TapToPayKt$$ExternalSyntheticLambda0(8), false, 1043204854);

    /* renamed from: lambda$-1019311384, reason: not valid java name */
    public static final ComposableLambdaImpl f716lambda$1019311384 = new ComposableLambdaImpl(new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(10), false, -1019311384);
    public static final ComposableLambdaImpl lambda$1701690065 = new ComposableLambdaImpl(new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(11), false, 1701690065);

    /* renamed from: lambda$-1754564422, reason: not valid java name */
    public static final ComposableLambdaImpl f725lambda$1754564422 = new ComposableLambdaImpl(new TapToPayKt$$ExternalSyntheticLambda0(9), false, -1754564422);
    public static final ComposableLambdaImpl lambda$259549474 = new ComposableLambdaImpl(new TapToPayKt$$ExternalSyntheticLambda0(10), false, 259549474);
    public static final ComposableLambdaImpl lambda$136898440 = new ComposableLambdaImpl(new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(12), false, 136898440);
    public static final ComposableLambdaImpl lambda$1643923137 = new ComposableLambdaImpl(new TapToPayKt$$ExternalSyntheticLambda0(11), false, 1643923137);

    /* renamed from: lambda$-744323661, reason: not valid java name */
    public static final ComposableLambdaImpl f728lambda$744323661 = new ComposableLambdaImpl(new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(1), false, -744323661);
    public static final ComposableLambdaImpl lambda$741436420 = new ComposableLambdaImpl(new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(2), false, 741436420);

    /* renamed from: lambda$-114869300, reason: not valid java name */
    public static final ComposableLambdaImpl f719lambda$114869300 = new ComposableLambdaImpl(new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(3), false, -114869300);
    public static final ComposableLambdaImpl lambda$340009913 = new ComposableLambdaImpl(new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(4), false, 340009913);

    /* renamed from: lambda$-141184386, reason: not valid java name */
    public static final ComposableLambdaImpl f723lambda$141184386 = new ComposableLambdaImpl(new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(5), false, -141184386);
    public static final ComposableLambdaImpl lambda$750620279 = new ComposableLambdaImpl(new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(6), false, 750620279);

    /* renamed from: lambda$-1191558186, reason: not valid java name */
    public static final ComposableLambdaImpl f720lambda$1191558186 = new ComposableLambdaImpl(new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(7), false, -1191558186);

    public static final void Body(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-757004867);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(Modifier.Companion.$$INSTANCE, ImageKt.rememberScrollState(gapComposer), false, 14);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(verticalScroll$default, 16.0f);
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            Strings.getSizes(gapComposer).getClass();
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new AdaptiveStackKt$spacedBetween$1(16.0f), horizontal, gapComposer, 48);
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
            NfcTapAnimationKt.NfcTapAnimation(null, gapComposer, 0);
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).header, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.tap_to_pay_first_time_title), (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.tap_to_pay_first_time_description), (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TapToPayKt$$ExternalSyntheticLambda0(i, 12);
        }
    }

    public static final void Body$1(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2142643744);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(Modifier.Companion.$$INSTANCE, ImageKt.rememberScrollState(gapComposer), false, 14);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(verticalScroll$default, 16.0f);
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            Strings.getSizes(gapComposer).getClass();
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new AdaptiveStackKt$spacedBetween$1(16.0f), horizontal, gapComposer, 48);
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
            NfcTapAnimationKt.NfcTapAnimation(null, gapComposer, 0);
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).header, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.tap_to_pay_onboarding_complete_title), (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.tap_to_pay_onboarding_complete_description), (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TapToPayKt$$ExternalSyntheticLambda0(i, 13);
        }
    }

    /* renamed from: ExitButton-KTwxG1Y, reason: not valid java name */
    public static final void m3760ExitButtonKTwxG1Y(long j, Modifier modifier, Function0 function0, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(728864690);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Updater.CompositionLocalProvider(Recorder$$ExternalSyntheticOutline2.m(j, ArcadeThemeKt.LocalIconColor), Expect_jvmKt.rememberComposableLambda(1956908146, new ComposerKt$$ExternalSyntheticLambda14(modifier, function0), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda13(j, modifier, function0, i);
        }
    }

    public static final void PaymentIncomplete(Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-142705597);
        int i2 = i | (gapComposer.changedInstance(function1) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, 1);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            Countries.PageHeader(Room.stringResource(gapComposer, R.string.tap_to_pay_payment_error_header), (Modifier) null, lambda$259549474, Room.stringResource(gapComposer, R.string.tap_to_pay_payment_error_description), gapComposer, MLKEMEngine.KyberPolyBytes, 2);
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier imePadding = SpacerKt.imePadding(SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2));
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new TaxReturnsView$$ExternalSyntheticLambda0(1, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, imePadding, buttonProminence, false, false, null, lambda$136898440, gapComposer, 1573248, 56);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HeroCardNullStateKt$$ExternalSyntheticLambda8(i, 15, function1);
        }
    }

    public static final void TapToPay(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2050449892);
        int i2 = 0;
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, f722lambda$1331597647, gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TapToPayKt$$ExternalSyntheticLambda0(i, i2);
        }
    }

    /* renamed from: TapToPayContent-iJQMabo, reason: not valid java name */
    public static final void m3761TapToPayContentiJQMabo(TapToPayPaymentViewModel.PaymentInitiated paymentInitiated, long j, Function1 function1, Composer composer, int i) {
        long j2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(602734220);
        int i2 = i | (gapComposer.changedInstance(paymentInitiated) ? 4 : 2) | (gapComposer.changed(j) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            float f = paymentInitiated.orientation == TapToPayPaymentViewModel.PaymentInitiated.PaymentScreenOrientation.PORTRAIT_UPSIDE_DOWN ? 180.0f : 0.0f;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, 1), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            boolean changed = gapComposer.changed(f);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new PulsingState$$ExternalSyntheticLambda0(f, 12);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier graphicsLayer = ColorKt.graphicsLayer(companion, (Function1) rememberedValue);
            boolean z = (i2 & 896) == 256;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new TaxReturnsView$$ExternalSyntheticLambda0(3, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            int i3 = 14;
            int i4 = (i2 >> 3) & 14;
            m3760ExitButtonKTwxG1Y(j, graphicsLayer, (Function0) rememberedValue2, gapComposer, i4);
            if (1.0f <= 0.0d) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            String str = paymentInitiated.cashtag;
            TapToPayAvatarViewModel tapToPayAvatarViewModel = paymentInitiated.avatarModel;
            boolean changed2 = gapComposer.changed(f);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new PulsingState$$ExternalSyntheticLambda0(f, 13);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            TapToPayButtonKt.TapToPayRecipient(str, tapToPayAvatarViewModel, ColorKt.graphicsLayer(companion, (Function1) rememberedValue3), gapComposer, 0);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 16.0f));
            boolean changed3 = gapComposer.changed(f);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new PulsingState$$ExternalSyntheticLambda0(f, i3);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Modifier graphicsLayer2 = ColorKt.graphicsLayer(companion, (Function1) rememberedValue4);
            String str2 = paymentInitiated.amount;
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).keypadTotal;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, colors.surface.keypad.text, (Composer) gapComposer, graphicsLayer2, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            if (1.0f <= 0.0d) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            boolean changed4 = gapComposer.changed(f);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changed4 || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new PulsingState$$ExternalSyntheticLambda0(f, 15);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            Modifier graphicsLayer3 = ColorKt.graphicsLayer(companion, (Function1) rememberedValue5);
            j2 = j;
            TapToPayButtonKt.m3762TapToPayTapSurface3JVO9M(i4, j2, gapComposer, graphicsLayer3);
            gapComposer.end(true);
        } else {
            j2 = j;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TapToPayPaymentKt$$ExternalSyntheticLambda3(i, 12, j2, paymentInitiated, function1);
        }
    }

    public static final void TapToPayErrorDialog(TapToPayErrorDialogViewModel tapToPayErrorDialogViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        tapToPayErrorDialogViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-492547942);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(tapToPayErrorDialogViewModel.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-404374235, new TaxTooltipView$$ExternalSyntheticLambda0(tapToPayErrorDialogViewModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(tapToPayErrorDialogViewModel, function1, modifier2, i, 13);
        }
    }

    public static final void TapToPayFirstTime(Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(155612475);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-686493818, new HeroCardNullStateKt$$ExternalSyntheticLambda8(11, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TapToPayFirstTimeKt$$ExternalSyntheticLambda1(i, i3, function1);
        }
    }

    public static final void TapToPayInitiatorNotes(TapToPayInitiatorNotesViewModel tapToPayInitiatorNotesViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        GapComposer gapComposer;
        tapToPayInitiatorNotesViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(361397347);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(tapToPayInitiatorNotesViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 18;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            FocusRequester rememberFocusRequesterAndRequestFocus = DBUtil.rememberFocusRequesterAndRequestFocus(gapComposer2);
            gapComposer = gapComposer2;
            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(null, 0L, gapComposer, 0, 3);
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            CharSequence charSequence = m382rememberTextFieldStateLepunE.getValue$foundation().text;
            boolean changed = gapComposer.changed(m382rememberTextFieldStateLepunE) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MusicViewKt$LoadedMusicContent$1$1(function1, m382rememberTextFieldStateLepunE, (Continuation) null, i3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, charSequence, (Function2) rememberedValue);
            function12 = function1;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(449571054, new CashMapViewKt$$ExternalSyntheticLambda15(rememberFocusRequesterAndRequestFocus, delegatingSoftwareKeyboardController, function1, tapToPayInitiatorNotesViewModel, m382rememberTextFieldStateLepunE, 23), gapComposer), gapComposer, 3072, 7);
        } else {
            function12 = function1;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddMoneyViewKt$$ExternalSyntheticLambda11(tapToPayInitiatorNotesViewModel, function12, i, 11);
        }
    }

    public static final void TapToPayOnboardingComplete(Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-786786181);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(2062104070, new HeroCardNullStateKt$$ExternalSyntheticLambda8(12, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TapToPayFirstTimeKt$$ExternalSyntheticLambda1(i, 5, function1);
        }
    }

    public static final void TapToPayPayment(TapToPayPaymentViewModel tapToPayPaymentViewModel, Function1 function1, RealImageLoader realImageLoader, Modifier modifier, Composer composer, int i) {
        int i2;
        RealImageLoader realImageLoader2;
        Modifier modifier2;
        tapToPayPaymentViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-900537170);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(tapToPayPaymentViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            realImageLoader2 = realImageLoader;
            i2 |= gapComposer.changedInstance(realImageLoader2) ? 256 : 128;
        } else {
            realImageLoader2 = realImageLoader;
        }
        int i3 = i2 | 3072;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.surface.keypad.button.icon;
            ChromeConfigKt.ChromeConfig(true, Boolean.TRUE, (Composer) gapComposer, 390, 10);
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new TaxReturnsView$$ExternalSyntheticLambda0(2, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-812363463, new TextViewKt$$ExternalSyntheticLambda0(realImageLoader2, tapToPayPaymentViewModel, j, function1), gapComposer), gapComposer, 3072, 7);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4(tapToPayPaymentViewModel, function1, realImageLoader, modifier2, i, 27);
        }
    }

    public static final void TapToPayPaymentConfirmation(String str, Function1 function1, Composer composer, int i) {
        int i2;
        str.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1548630998);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-807128321, new PoolCreateViewKt$$ExternalSyntheticLambda6(function1, str, 13), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarningsHomeKt$$ExternalSyntheticLambda15(str, function1, i, 3);
        }
    }

    public static final void TapToPayPaymentConfirmationDemo(Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1090934181);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(420812326, new HeroCardNullStateKt$$ExternalSyntheticLambda8(13, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TapToPayFirstTimeKt$$ExternalSyntheticLambda1(i, 6, function1);
        }
    }

    public static final void TapToPayPaymentError(Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-600441569);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-818654422, new HeroCardNullStateKt$$ExternalSyntheticLambda8(14, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TapToPayFirstTimeKt$$ExternalSyntheticLambda1(i, 7, function1);
        }
    }

    public static final void TapToPayPaymentRequest(TapToPayPaymentRequestViewModel tapToPayPaymentRequestViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        tapToPayPaymentRequestViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1042613068);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(tapToPayPaymentRequestViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (tapToPayPaymentRequestViewModel instanceof TapToPayPaymentRequestViewModel.Requesting) {
            gapComposer.startReplaceGroup(1223784747);
            TapToPayPaymentRequestLoading(gapComposer, 0);
            gapComposer.end(false);
        } else if (tapToPayPaymentRequestViewModel instanceof TapToPayPaymentRequestViewModel.Accepted) {
            gapComposer.startReplaceGroup(1223787614);
            TapToPayPaymentConfirmation(((TapToPayPaymentRequestViewModel.Accepted) tapToPayPaymentRequestViewModel).amount, function1, gapComposer, i2 & 112);
            gapComposer.end(false);
        } else if (tapToPayPaymentRequestViewModel instanceof TapToPayPaymentRequestViewModel.DemoMode) {
            gapComposer.startReplaceGroup(1223790868);
            TapToPayPaymentConfirmationDemo(function1, gapComposer, (i2 >> 3) & 14);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-717146346);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddMoneyViewKt$$ExternalSyntheticLambda11(tapToPayPaymentRequestViewModel, function1, i, 12);
        }
    }

    public static final void TapToPayPaymentRequestLoading(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(893077366);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, lambda$1643923137, gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TapToPayKt$$ExternalSyntheticLambda0(i, 15);
        }
    }
}
