package kotlinx.coroutines;

import androidx.biometric.KeyguardUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.media3.common.util.Util$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.mikepenz.markdown.compose.components.CurrentComponentsBridge;
import com.mikepenz.markdown.compose.components.DefaultMarkdownComponents;
import com.squareup.cash.R;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.globalsearch.views.QuickAccessBarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.history.views.SkipPaymentView$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.components.news.InvestingNewsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentWelcomeViewModel;
import com.squareup.cash.moneybot.views.markdown.MoneybotMarkdownKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.NavigationIconType;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda0;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class ThreadPoolDispatcherKt {
    public static final void DividendReinvestmentWelcome(Modifier modifier, DividendReinvestmentWelcomeViewModel dividendReinvestmentWelcomeViewModel, Function1 function1, Composer composer, int i) {
        Function1 function12;
        Modifier modifier2;
        DividendReinvestmentWelcomeViewModel dividendReinvestmentWelcomeViewModel2 = dividendReinvestmentWelcomeViewModel;
        dividendReinvestmentWelcomeViewModel2.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1088731278);
        Applier applier = gapComposer.applier;
        int i2 = 16;
        int i3 = i | 6 | (gapComposer.changedInstance(dividendReinvestmentWelcomeViewModel2) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            IntrinsicSize intrinsicSize = IntrinsicSize.Max;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(OffsetKt.height(companion, intrinsicSize), MooncakeTheme.getColors(gapComposer).background, ColorKt.RectangleShape));
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
            NavigationIconType navigationIconType = NavigationIconType.CLOSE;
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new InvestingNewsKt$$ExternalSyntheticLambda0(i2, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            KeypadKt.m3654ToolbarA_Dysh8(null, m302paddingqDBjuR0$default, navigationIconType, 0L, (Function0) rememberedValue, null, gapComposer, 24630, 364);
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f, true), ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            ImageKt.Image(Countries.painterResource(R.drawable.investing_components_drip_wheel, 0, gapComposer), null, SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, 7), 154.0f), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 432, 120);
            dividendReinvestmentWelcomeViewModel2 = dividendReinvestmentWelcomeViewModel;
            modifier2 = companion;
            KeypadKt.m3651TextPdH14aY(0, 0, 3, 0, 48, 0, 3824, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 32.0f, 2), MooncakeTheme.getTypography(gapComposer).header1, (TextLineBalancing) null, dividendReinvestmentWelcomeViewModel2.title, (Map) null, (Function1) null, false);
            gapComposer.startReplaceGroup(-2112283058);
            Iterator it = dividendReinvestmentWelcomeViewModel2.sections.iterator();
            while (it.hasNext()) {
                DividendReinvestmentWelcomeSection(SpacerKt.m301paddingqDBjuR0(modifier2, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 32.0f), (DividendReinvestmentWelcomeViewModel.Section) it.next(), gapComposer, 0);
            }
            gapComposer.end(false);
            gapComposer.end(true);
            Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(modifier2, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 18.0f, 7);
            String str = dividendReinvestmentWelcomeViewModel2.disclaimerText;
            TextStyle textStyle = MooncakeTheme.getTypography(gapComposer).smallBody;
            long j = MooncakeTheme.getColors(gapComposer).secondaryLabel;
            SpanStyle spanStyle = new SpanStyle(MooncakeTheme.getColors(gapComposer).secondaryLabel, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Underline, (Shadow) null, 61438);
            boolean z2 = i4 == 256;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new NfcNotAvailableKt$$ExternalSyntheticLambda0(15, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            KeyguardUtils.m14MarkdownTextnvClB8o(str, (Function2) rememberedValue2, m302paddingqDBjuR0$default2, textStyle, j, spanStyle, null, 0, 3, null, 0, gapComposer, MLKEMEngine.KyberPolyBytes, 1728);
            Modifier m302paddingqDBjuR0$default3 = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(modifier2, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 48.0f, 2);
            String str2 = dividendReinvestmentWelcomeViewModel2.ctaLabel;
            boolean z3 = i4 == 256;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z3 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new InvestingNewsKt$$ExternalSyntheticLambda0(17, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Function0 function0 = (Function0) rememberedValue3;
            function12 = function1;
            KeypadKt.m3640ButtonGFipHI0(str2, function0, m302paddingqDBjuR0$default3, null, null, null, null, false, 0, null, null, gapComposer, MLKEMEngine.KyberPolyBytes, 0, 4088);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new QuickAccessBarKt$$ExternalSyntheticLambda1(modifier2, dividendReinvestmentWelcomeViewModel2, function12, i);
        }
    }

    public static final void DividendReinvestmentWelcomeSection(Modifier modifier, DividendReinvestmentWelcomeViewModel.Section section, Composer composer, int i) {
        int i2;
        DividendReinvestmentWelcomeViewModel.Section section2 = section;
        section2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-975283188);
        Applier applier = gapComposer.applier;
        int i3 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changed(section2) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 4.0f, 16.0f, RecyclerView.DECELERATION_RATE, 9);
            int ordinal = section2.icon.ordinal();
            if (ordinal == 0) {
                i2 = R.drawable.icon_investing_16;
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                i2 = R.drawable.icon_bullet_generic_16;
            }
            Painter painterResource = Countries.painterResource(i2, 0, gapComposer);
            long j = MooncakeTheme.getColors(gapComposer).secondaryButtonTint;
            ImageKt.Image(painterResource, null, m302paddingqDBjuR0$default, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 432, 56);
            gapComposer = gapComposer;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            section2 = section;
            KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4082, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer, (Modifier) null, MooncakeTheme.getTypography(gapComposer).smallTitle, (TextLineBalancing) null, section2.title, (Map) null, (Function1) null, false);
            KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4082, MooncakeTheme.getColors(gapComposer).secondaryLabel, (Composer) gapComposer, (Modifier) null, MooncakeTheme.getTypography(gapComposer).smallBody, (TextLineBalancing) null, section2.subtitle, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SkipPaymentView$$ExternalSyntheticLambda1(modifier, section2, i, 29);
        }
    }

    public static DefaultMarkdownComponents markdownComponents$default(int i) {
        ComposableLambdaImpl composableLambdaImpl = CurrentComponentsBridge.text;
        ComposableLambdaImpl composableLambdaImpl2 = CurrentComponentsBridge.eol;
        ComposableLambdaImpl composableLambdaImpl3 = CurrentComponentsBridge.codeFence;
        ComposableLambdaImpl composableLambdaImpl4 = CurrentComponentsBridge.codeBlock;
        ComposableLambdaImpl composableLambdaImpl5 = (i & 16) != 0 ? CurrentComponentsBridge.heading1 : MoneybotMarkdownKt.lambda$1660982986;
        ComposableLambdaImpl composableLambdaImpl6 = (i & 32) != 0 ? CurrentComponentsBridge.heading2 : MoneybotMarkdownKt.f490lambda$1584115095;
        ComposableLambdaImpl composableLambdaImpl7 = (i & 64) != 0 ? CurrentComponentsBridge.heading3 : MoneybotMarkdownKt.f493lambda$534245880;
        ComposableLambdaImpl composableLambdaImpl8 = (i & 128) != 0 ? CurrentComponentsBridge.heading4 : MoneybotMarkdownKt.lambda$515623335;
        ComposableLambdaImpl composableLambdaImpl9 = (i & 256) != 0 ? CurrentComponentsBridge.heading5 : MoneybotMarkdownKt.lambda$1565492550;
        ComposableLambdaImpl composableLambdaImpl10 = (i & 512) != 0 ? CurrentComponentsBridge.heading6 : MoneybotMarkdownKt.f491lambda$1679605531;
        ComposableLambdaImpl composableLambdaImpl11 = (i & 1024) != 0 ? CurrentComponentsBridge.setextHeading1 : MoneybotMarkdownKt.lambda$743377665;
        ComposableLambdaImpl composableLambdaImpl12 = (i & 2048) != 0 ? CurrentComponentsBridge.setextHeading2 : MoneybotMarkdownKt.lambda$1793246880;
        ComposableLambdaImpl composableLambdaImpl13 = CurrentComponentsBridge.blockQuote;
        ComposableLambdaImpl composableLambdaImpl14 = (i & PKIFailureInfo.certRevoked) != 0 ? CurrentComponentsBridge.paragraph : MoneybotMarkdownKt.f492lambda$401981986;
        ComposableLambdaImpl composableLambdaImpl15 = (i & 16384) != 0 ? CurrentComponentsBridge.orderedList : MoneybotMarkdownKt.lambda$647887229;
        ComposableLambdaImpl composableLambdaImpl16 = (i & 32768) != 0 ? CurrentComponentsBridge.unorderedList : MoneybotMarkdownKt.lambda$1697756444;
        ComposableLambdaImpl composableLambdaImpl17 = CurrentComponentsBridge.image;
        ComposableLambdaImpl composableLambdaImpl18 = CurrentComponentsBridge.inlineImage;
        ComposableLambdaImpl composableLambdaImpl19 = (i & PKIFailureInfo.transactionIdInUse) != 0 ? CurrentComponentsBridge.horizontalRule : MoneybotMarkdownKt.lambda$552396793;
        ComposableLambdaImpl composableLambdaImpl20 = (i & PKIFailureInfo.signerNotTrusted) != 0 ? CurrentComponentsBridge.table : MoneybotMarkdownKt.lambda$1602266008;
        ComposableLambdaImpl composableLambdaImpl21 = CurrentComponentsBridge.checkbox;
        composableLambdaImpl.getClass();
        composableLambdaImpl2.getClass();
        composableLambdaImpl3.getClass();
        composableLambdaImpl4.getClass();
        composableLambdaImpl5.getClass();
        composableLambdaImpl6.getClass();
        composableLambdaImpl7.getClass();
        composableLambdaImpl8.getClass();
        composableLambdaImpl9.getClass();
        composableLambdaImpl10.getClass();
        composableLambdaImpl11.getClass();
        composableLambdaImpl12.getClass();
        composableLambdaImpl13.getClass();
        composableLambdaImpl14.getClass();
        composableLambdaImpl15.getClass();
        composableLambdaImpl16.getClass();
        composableLambdaImpl17.getClass();
        composableLambdaImpl18.getClass();
        composableLambdaImpl19.getClass();
        composableLambdaImpl20.getClass();
        composableLambdaImpl21.getClass();
        return new DefaultMarkdownComponents(composableLambdaImpl, composableLambdaImpl2, composableLambdaImpl3, composableLambdaImpl4, composableLambdaImpl5, composableLambdaImpl6, composableLambdaImpl7, composableLambdaImpl8, composableLambdaImpl9, composableLambdaImpl10, composableLambdaImpl11, composableLambdaImpl12, composableLambdaImpl13, composableLambdaImpl14, composableLambdaImpl15, composableLambdaImpl16, composableLambdaImpl17, composableLambdaImpl18, composableLambdaImpl19, composableLambdaImpl20, composableLambdaImpl21);
    }

    public static final ExecutorCoroutineDispatcherImpl newSingleThreadContext(String str) {
        return new ExecutorCoroutineDispatcherImpl(Executors.unconfigurableExecutorService(Executors.newScheduledThreadPool(1, new Util$$ExternalSyntheticLambda0(str, new AtomicInteger()))));
    }
}
