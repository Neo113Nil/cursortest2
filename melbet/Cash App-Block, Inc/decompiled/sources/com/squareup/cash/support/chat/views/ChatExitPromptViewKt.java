package com.squareup.cash.support.chat.views;

import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.local.views.internal.LocalCombinedViewsKt$$ExternalSyntheticLambda3;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.size.DimensionKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.dialog.ArcadeModal2Kt;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.TaxesPasswordViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sharesheet.ShareSheetPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda3;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda9;
import com.squareup.cash.shopping.views.search.ShopHubResultsListKt$$ExternalSyntheticLambda14;
import com.squareup.cash.support.chat.viewmodels.ChatExitPromptSheetViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatImageDetailViewModel;
import com.squareup.cash.support.views.ScreenshotConfirmViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda6;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda4;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class ChatExitPromptViewKt {

    /* renamed from: lambda$-489485958, reason: not valid java name */
    public static final ComposableLambdaImpl f675lambda$489485958;
    public static final ComposableLambdaImpl lambda$1549435119;
    public static final ComposableLambdaImpl lambda$1622549188;

    /* renamed from: lambda$-2126454335, reason: not valid java name */
    public static final ComposableLambdaImpl f672lambda$2126454335 = new ComposableLambdaImpl(new ShopHubResultsListKt$$ExternalSyntheticLambda14(12), false, -2126454335);
    public static final ComposableLambdaImpl lambda$1098965108 = new ComposableLambdaImpl(new ShopHubResultsListKt$$ExternalSyntheticLambda14(13), false, 1098965108);

    /* renamed from: lambda$-2146132973, reason: not valid java name */
    public static final ComposableLambdaImpl f673lambda$2146132973 = new ComposableLambdaImpl(new ShopHubResultsListKt$$ExternalSyntheticLambda14(14), false, -2146132973);
    public static final ComposableLambdaImpl lambda$1317894292 = new ComposableLambdaImpl(new ShopHubResultsListKt$$ExternalSyntheticLambda14(15), false, 1317894292);

    /* renamed from: lambda$-1927203789, reason: not valid java name */
    public static final ComposableLambdaImpl f671lambda$1927203789 = new ComposableLambdaImpl(new ShopHubResultsListKt$$ExternalSyntheticLambda14(16), false, -1927203789);

    /* renamed from: lambda$-1683404344, reason: not valid java name */
    public static final ComposableLambdaImpl f670lambda$1683404344 = new ComposableLambdaImpl(new ShopHubResultsListKt$$ExternalSyntheticLambda14(17), false, -1683404344);

    /* renamed from: lambda$-1233387859, reason: not valid java name */
    public static final ComposableLambdaImpl f669lambda$1233387859 = new ComposableLambdaImpl(new ShopHubResultsListKt$$ExternalSyntheticLambda14(18), false, -1233387859);

    /* renamed from: lambda$-1217920710, reason: not valid java name */
    public static final ComposableLambdaImpl f668lambda$1217920710 = new ComposableLambdaImpl(new ShopHubResultsListKt$$ExternalSyntheticLambda14(19), false, -1217920710);

    /* renamed from: lambda$-24977551, reason: not valid java name */
    public static final ComposableLambdaImpl f674lambda$24977551 = new ComposableLambdaImpl(new ShopHubResultsListKt$$ExternalSyntheticLambda14(20), false, -24977551);

    static {
        new ComposableLambdaImpl(new ShopHubResultsListKt$$ExternalSyntheticLambda14(21), false, 791859541);
        f675lambda$489485958 = new ComposableLambdaImpl(new ShareSheetPresenter$$ExternalSyntheticLambda0(26), false, -489485958);
        lambda$1622549188 = new ComposableLambdaImpl(new ShareSheetPresenter$$ExternalSyntheticLambda0(27), false, 1622549188);
        lambda$1549435119 = new ComposableLambdaImpl(new ShareSheetPresenter$$ExternalSyntheticLambda0(28), false, 1549435119);
    }

    public static final void ExitDialog(Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2140545467);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new SheetKt$$ExternalSyntheticLambda9(11);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new SheetKt$$ExternalSyntheticLambda9(12);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function0 function02 = (Function0) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new SheetKt$$ExternalSyntheticLambda9(13);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            ArcadeModal2Kt.Modal(null, function0, function02, (Function0) rememberedValue3, false, false, Expect_jvmKt.rememberComposableLambda(1615615587, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(22, function1), gapComposer), gapComposer, 1576368, 49);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda1(function1, i, 29, false);
        }
    }

    public static final void ExitPromptContent(ChatExitPromptSheetViewModel.Prompt prompt, Function1 function1, Function1 function12, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1230971768);
        int i2 = (gapComposer.changedInstance(prompt) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda5(13, function12);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier onSizeChanged = RulerKt.onSizeChanged(Modifier.Companion.$$INSTANCE, (Function1) rememberedValue);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, onSizeChanged);
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
            Transformations.SheetHeader(prompt.title, (Modifier) null, (Function2) null, prompt.message, gapComposer, 0, 6);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(559240960, new TabToolbarsKt$$ExternalSyntheticLambda3(5, function1, prompt), gapComposer), gapComposer, 24576, 15);
            gapComposer = gapComposer;
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda6(prompt, function1, function12, i, 2);
        }
    }

    public static final void Image(ChatImageDetailViewModel chatImageDetailViewModel, RealImageLoader realImageLoader, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1564319018);
        int i3 = i & 6;
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        if (i3 == 0) {
            i2 = (gapComposer.changed(columnScopeInstance) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(chatImageDetailViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.f1047app;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier clipToBounds = ClipKt.clipToBounds(SizeKt.fillMaxWidth(columnScopeInstance.weight(1.0f, companion, true), 1.0f));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, clipToBounds);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            boolean changed = ((i2 & 7168) == 2048) | gapComposer.changed(j);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changed || rememberedValue == obj) {
                rememberedValue = new ChatImageDetailViewKt$$ExternalSyntheticLambda2(0, j, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            boolean changedInstance = gapComposer.changedInstance(realImageLoader) | gapComposer.changedInstance(chatImageDetailViewModel);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == obj) {
                rememberedValue2 = new BottomSheet$$ExternalSyntheticLambda3(12, realImageLoader, chatImageDetailViewModel);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            AndroidView_androidKt.AndroidView(function12, fillMaxSize, (Function1) rememberedValue2, gapComposer, 48, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(chatImageDetailViewModel, realImageLoader, function1, i, 8);
        }
    }

    public static final void ImageDetailView(ChatImageDetailViewModel chatImageDetailViewModel, RealImageLoader realImageLoader, Function1 function1, Composer composer, int i) {
        Modifier modifier;
        int i2;
        long j;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1;
        boolean z;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1296216400);
        int i3 = i | (gapComposer.changedInstance(chatImageDetailViewModel) ? 4 : 2) | (gapComposer.changedInstance(realImageLoader) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j2 = colors.semantic.background.subtle;
            Modifier modifier3 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier3, 1.0f);
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$12 = ColorKt.RectangleShape;
            Modifier imePadding = SpacerKt.imePadding(SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, j2, rectangleShapeKt$RectangleShape$12)));
            boolean z2 = chatImageDetailViewModel.showBars;
            if (z2) {
                modifier = modifier3;
            } else {
                modifier3 = SpacerKt.m302paddingqDBjuR0$default(modifier3, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                modifier = modifier3;
            }
            Modifier then = imePadding.then(modifier3);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (z2) {
                gapComposer.startReplaceGroup(-40589900);
                NavigationType navigationType = NavigationType.CLOSE;
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier, j2, rectangleShapeKt$RectangleShape$12);
                boolean z3 = (i3 & 896) == 256;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z3 || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ScreenshotConfirmViewKt$$ExternalSyntheticLambda0(11, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                j = j2;
                z = z2;
                i2 = i3;
                modifier2 = modifier;
                rectangleShapeKt$RectangleShape$1 = rectangleShapeKt$RectangleShape$12;
                DBUtil.TitleBarSub((String) null, navigationType, m177backgroundbw27NRU, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 104);
                gapComposer.end(false);
            } else {
                i2 = i3;
                j = j2;
                rectangleShapeKt$RectangleShape$1 = rectangleShapeKt$RectangleShape$12;
                z = z2;
                modifier2 = modifier;
                gapComposer.startReplaceGroup(-40380216);
                gapComposer.end(false);
            }
            int i4 = i2 << 3;
            Image(chatImageDetailViewModel, realImageLoader, function1, gapComposer, (i4 & 7168) | (i4 & 112) | 6 | (i4 & 896));
            if (z) {
                gapComposer.startReplaceGroup(-40299492);
                SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(ImageKt.m177backgroundbw27NRU(modifier2, j, rectangleShapeKt$RectangleShape$1), 48.0f));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-40226456);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda6(chatImageDetailViewModel, realImageLoader, function1, i, 5);
        }
    }

    public static final void Loading(int i, int i2, Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1929132016);
        int i3 = (gapComposer.changed(i) ? 4 : 2) | i2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            float mo233toDpu2uoSUM = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo233toDpu2uoSUM(i);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), mo233toDpu2uoSUM, RecyclerView.DECELERATION_RATE, 2);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m279heightInVpY3zN4$default);
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
            ProgressCircularKt.ProgressCircular(6, 0, gapComposer, SizeKt.m285size3ABfNKs(companion, 24.0f));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalCombinedViewsKt$$ExternalSyntheticLambda3(i, i2, 12);
        }
    }
}
