package com.squareup.cash.support.views.article;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda16;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.presenters.ReferralCodePresenter$models$2$1$1;
import com.squareup.cash.blockers.views.CalendarDatePickerKt$$ExternalSyntheticLambda21;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.offers.views.OffersSearchViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda4;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.shopping.views.ShopErrorKt$$ExternalSyntheticLambda0;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda1;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.support.backend.api.activities.SupportTransaction;
import com.squareup.cash.support.backend.api.articles.Article;
import com.squareup.cash.support.backend.api.articles.Link;
import com.squareup.cash.support.presenters.ArticlePresenter$models$1$1;
import com.squareup.cash.support.viewmodels.ArticleViewModel;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda28;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda8;
import com.squareup.cash.tax.views.TaxReturnsViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.tax.views.TaxTooltipView$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda2;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda4;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.webview.android.WebViewProvider;
import com.squareup.cash.work.views.pay.PastPaySectionKt$$ExternalSyntheticLambda1;
import com.squareup.util.cash.Countries;
import com.squareup.workflow1.internal.WorkflowNode$tick$1$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class ArticleViewKt {

    /* renamed from: lambda$-1535952936, reason: not valid java name */
    public static final ComposableLambdaImpl f706lambda$1535952936 = new ComposableLambdaImpl(new ArticleViewKt$$ExternalSyntheticLambda10(11), false, -1535952936);
    public static final ComposableLambdaImpl lambda$361320538 = new ComposableLambdaImpl(new ArticleViewKt$$ExternalSyntheticLambda10(12), false, 361320538);
    public static final ComposableLambdaImpl lambda$870099352 = new ComposableLambdaImpl(new ArticleViewKt$$ExternalSyntheticLambda10(13), false, 870099352);

    static {
        new ComposableLambdaImpl(new ArticleViewKt$$ExternalSyntheticLambda10(14), false, 1267635882);
        new ComposableLambdaImpl(new ArticleViewKt$$ExternalSyntheticLambda10(15), false, 147896459);
        new ComposableLambdaImpl(new ArticleViewKt$$ExternalSyntheticLambda10(16), false, -1620934321);
        new ComposableLambdaImpl(new ArticleViewKt$$ExternalSyntheticLambda10(17), false, 1485424490);
    }

    public static final void Article(ArticleViewModel articleViewModel, RealImageLoader realImageLoader, Function1 function1, WebViewProvider webViewProvider, SupportActivityItemLoader supportActivityItemLoader, Composer composer, int i, int i2) {
        int i3;
        Function1 function12;
        int i4;
        GapComposer gapComposer;
        Function1 function13;
        Function1 function14;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-218976627);
        if ((i & 6) == 0) {
            i3 = i | (gapComposer2.changedInstance(articleViewModel) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i3 | (gapComposer2.changedInstance(realImageLoader) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i4 = i5 | MLKEMEngine.KyberPolyBytes;
            function12 = function1;
        } else {
            function12 = function1;
            i4 = i5 | (gapComposer2.changedInstance(function12) ? 256 : 128);
        }
        int i7 = i4 | (gapComposer2.changedInstance(webViewProvider) ? 2048 : 1024) | (gapComposer2.changedInstance(supportActivityItemLoader) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer2.shouldExecute(i7 & 1, (i7 & 9363) != 9362)) {
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (i6 != 0) {
                Object rememberedValue = gapComposer2.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = new TabToolbarsKt$$ExternalSyntheticLambda28(1);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                function14 = (Function1) rememberedValue;
            } else {
                function14 = function12;
            }
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer2);
            float mo236toPx0680j_4 = ((Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(40.0f);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.derivedStateOf(new WalletHomeViewKt$$ExternalSyntheticLambda5(rememberScrollState, mo236toPx0680j_4, 2));
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            State state = (State) rememberedValue2;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = Updater.mutableStateOf$default(null);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState = (MutableState) rememberedValue3;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
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
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            NavigationType navigationType = NavigationType.BACK;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1288737027, new TaxTooltipView$$ExternalSyntheticLambda0(19, state, mutableState), gapComposer2);
            boolean z = (i7 & 896) == 256;
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (z || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new TabToolbarsKt$$ExternalSyntheticLambda8(9, function14);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            Function1 function15 = function14;
            DBUtil.TitleBarSub(rememberComposableLambda, navigationType, fillMaxWidth, (DynamicColorConfiguration) null, (Function0) rememberedValue4, (Modifier) null, (Function3) null, gapComposer2, 438, 104);
            if (Intrinsics.areEqual(articleViewModel, ArticleViewModel.Loading.INSTANCE)) {
                gapComposer2.startReplaceGroup(1658285516);
                Loading(gapComposer2, 0);
                gapComposer2.end(false);
            } else if (articleViewModel instanceof ArticleViewModel.Error) {
                gapComposer2.startReplaceGroup(1658286436);
                Error((i7 >> 6) & 14, gapComposer2, function15, ((ArticleViewModel.Error) articleViewModel).isRetryable);
                gapComposer2.end(false);
            } else {
                if (!(articleViewModel instanceof ArticleViewModel.Loaded)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 1658284130, false);
                }
                gapComposer2.startReplaceGroup(-132674776);
                gapComposer2.end(false);
                mutableState.setValue(((ArticleViewModel.Loaded) articleViewModel).article.title);
            }
            gapComposer = gapComposer2;
            AnimatedContentKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, articleViewModel instanceof ArticleViewModel.Loaded, null, EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), null, Expect_jvmKt.rememberComposableLambda(-438617381, new SubcomposeAsyncImageKt$$ExternalSyntheticLambda0(articleViewModel, realImageLoader, function15, webViewProvider, rememberScrollState, supportActivityItemLoader, 10), gapComposer2), gapComposer, 1600518, 18);
            gapComposer.end(true);
            function13 = function15;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            function13 = function12;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda3(articleViewModel, realImageLoader, function13, webViewProvider, supportActivityItemLoader, i, i2, 20);
        }
    }

    public static final void ArticleActivityItemRow(String str, SupportActivityItemLoader supportActivityItemLoader, RealImageLoader realImageLoader, Function1 function1, Composer composer, int i) {
        int i2;
        str.getClass();
        supportActivityItemLoader.getClass();
        realImageLoader.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1817365633);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(supportActivityItemLoader) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            Object obj = rememberedValue;
            if (rememberedValue == neverEqualPolicy) {
                SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(1, 0, null, 6);
                MutableSharedFlow$default.tryEmit(Unit.INSTANCE);
                gapComposer.updateRememberedValue(MutableSharedFlow$default);
                obj = MutableSharedFlow$default;
            }
            MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) obj;
            boolean z = (i2 & 14) == 4;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = FlowKt.transformLatest(mutableSharedFlow, new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) null, supportActivityItemLoader, str, 25));
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, SupportActivityItemLoader.State.Failure.INSTANCE$1, null, gapComposer, 0, 2);
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(mutableSharedFlow);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new ReferralCodePresenter$models$2$1$1(mutableSharedFlow, null, 6);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-1163919039, new TaxTooltipView$$ExternalSyntheticLambda0(collectAsState, function1), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4(str, supportActivityItemLoader, realImageLoader, function1, i, 24);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [boolean, int] */
    public static final void ArticleContent(ArticleViewModel.Loaded loaded, Function1 function1, WebViewProvider webViewProvider, Function0 function0, Composer composer, int i) {
        int i2;
        WebViewProvider webViewProvider2;
        Icons icons;
        int i3;
        boolean z;
        Article article;
        Modifier.Companion companion;
        int i4;
        float f;
        GapComposer gapComposer;
        Function1 function12 = function1;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(2033079533);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function12) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            webViewProvider2 = webViewProvider;
            i2 |= gapComposer2.changedInstance(webViewProvider2) ? 256 : 128;
        } else {
            webViewProvider2 = webViewProvider;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? 2048 : 1024;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Article article2 = loaded.article;
            boolean isBlank = StringsKt.isBlank(article2.htmlBody);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion2, 1.0f), RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m302paddingqDBjuR0$default);
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
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-399850610, new SheetKt$$ExternalSyntheticLambda6(loaded, 25), gapComposer2);
            Article.Icon icon = article2.icon;
            if (icon == null) {
                gapComposer2.startReplaceGroup(-1672364291);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-1672364290);
                switch (ArticleUtilsKt$WhenMappings.$EnumSwitchMapping$0[icon.glyph.ordinal()]) {
                    case -1:
                        icons = null;
                        break;
                    case 0:
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    case 1:
                        icons = Icons.CardBasic32;
                        break;
                    case 2:
                        icons = Icons.CurrencyBtc32;
                        break;
                    case 3:
                        icons = Icons.Investing32;
                        break;
                    case 4:
                        icons = Icons.FavoriteFill32;
                        break;
                    case 5:
                        icons = Icons.Deposit32;
                        break;
                    case 6:
                        icons = Icons.LimitsFill32;
                        break;
                    case 7:
                        icons = Icons.InformationFill32;
                        break;
                    case 8:
                        icons = Icons.AvatarFill32;
                        break;
                    case 9:
                        icons = Icons.Fast32;
                        break;
                    case 10:
                        icons = Icons.Borrow32;
                        break;
                    case 11:
                        icons = Icons.CashAppPay32;
                        break;
                    case 12:
                        icons = Icons.Business32;
                        break;
                    case 13:
                        icons = Icons.Taxes32;
                        break;
                    case 14:
                        icons = Icons.Add32;
                        break;
                    case 15:
                        icons = Icons.Atm32;
                        break;
                    case 16:
                        icons = Icons.Family32;
                        break;
                    case 17:
                        icons = Icons.PayLater32;
                        break;
                    case 18:
                        icons = Icons.Savings24;
                        break;
                    case 19:
                        icons = Icons.LogoAfterpay24;
                        break;
                    case 20:
                    case 21:
                        icons = Icons.DocumentFill32;
                        break;
                }
                r19 = icons != null ? Expect_jvmKt.rememberComposableLambda(1465267733, new TaxTooltipView$$ExternalSyntheticLambda0(18, icon, icons), gapComposer2) : null;
                gapComposer2.end(false);
            }
            Countries.PageHeader(rememberComposableLambda, (Modifier) null, r19, (Function2) null, gapComposer2, 6, 10);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            if (isBlank) {
                i3 = i2;
                z = 0;
                article = article2;
                GapComposer gapComposer3 = gapComposer2;
                companion = companion2;
                i4 = 32;
                f = 1.0f;
                gapComposer3.startReplaceGroup(-1671435189);
                gapComposer3.end(false);
                gapComposer = gapComposer3;
            } else {
                gapComposer2.startReplaceGroup(-1671872444);
                String str = loaded.html;
                Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(companion2, 16.0f, 16.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8);
                companion = companion2;
                boolean z2 = (i2 & 7168) == 2048;
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (z2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ArticleViewKt$$ExternalSyntheticLambda26(function0, mutableState, 0);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                article = article2;
                GapComposer gapComposer4 = gapComposer2;
                f = 1.0f;
                z = 0;
                i4 = 32;
                i3 = i2;
                WebView(str, function1, ValueInsets.onGloballyPositioned(m302paddingqDBjuR0$default2, (Function1) rememberedValue2), webViewProvider2, gapComposer4, (i2 & 112) | ((i2 << 3) & 7168));
                function12 = function1;
                gapComposer4.end(false);
                gapComposer = gapComposer4;
            }
            Link link = article.callToAction;
            if (link == null) {
                gapComposer.startReplaceGroup(-1671393650);
                gapComposer.end(z);
                gapComposer2 = gapComposer;
            } else {
                gapComposer.startReplaceGroup(-1671393649);
                ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(SizeKt.fillMaxWidth(companion, f), 16.0f, 32.0f);
                boolean changedInstance = ((i3 & 112) == i4 ? true : z) | gapComposer.changedInstance(link);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new ArticleViewKt$$ExternalSyntheticLambda27(function12, link, z);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                GapComposer gapComposer5 = gapComposer;
                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, m299paddingVpY3zN4, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-1199167727, new TaxReturnsViewKt$$ExternalSyntheticLambda5(link, 8), gapComposer), gapComposer5, 1573296, 56);
                gapComposer2 = gapComposer5;
                gapComposer2.end(z);
            }
            gapComposer2.end(true);
        } else {
            gapComposer2.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4(loaded, function12, webViewProvider, function0, i, 25);
        }
    }

    public static final void ContactOption(final ArticleViewModel.ContactOption contactOption, Function0 function0, Composer composer, int i) {
        ComposableLambdaImpl rememberComposableLambda;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-861162848);
        int i2 = (gapComposer.changedInstance(contactOption) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        final int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = contactOption.subtitle;
            if (str == null) {
                gapComposer.startReplaceGroup(-1062451786);
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(-1062451785);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(173775132, new PastPaySectionKt$$ExternalSyntheticLambda1(str, 3), gapComposer);
                gapComposer.end(false);
            }
            String str2 = contactOption.subtitle;
            boolean z = str2 == null || str2.length() == 0;
            CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
            boolean z2 = z;
            boolean z3 = contactOption.isEnabled;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new TabToolbarsKt$$ExternalSyntheticLambda28(2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(fillMaxWidth, false, (Function1) rememberedValue);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(2039896306, new Function2() { // from class: com.squareup.cash.support.views.article.ArticleViewKt$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Icons icons;
                    int i4;
                    int i5;
                    int i6 = i3;
                    ArticleViewModel.ContactOption contactOption2 = contactOption;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                int ordinal = contactOption2.f1208type.ordinal();
                                if (ordinal == 0) {
                                    icons = Icons.CommSms24;
                                } else if (ordinal == 1) {
                                    icons = Icons.CommPhoneFill24;
                                } else {
                                    if (ordinal != 2) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    icons = Icons.CommEmail24;
                                }
                                Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                int ordinal2 = contactOption2.f1208type.ordinal();
                                if (ordinal2 == 0) {
                                    i4 = 1717401398;
                                    i5 = R.string.support_article_chat;
                                } else if (ordinal2 == 1) {
                                    i4 = 1717403799;
                                    i5 = R.string.support_article_phone;
                                } else {
                                    if (ordinal2 != 2) {
                                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, 1717400254, false);
                                    }
                                    i4 = 1717406231;
                                    i5 = R.string.support_article_email;
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, re$$ExternalSyntheticOutline0.m(gapComposer3, i4, i5, gapComposer3, false), (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer);
            ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-1175528943, new Function2() { // from class: com.squareup.cash.support.views.article.ArticleViewKt$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Icons icons;
                    int i4;
                    int i5;
                    int i6 = r2;
                    ArticleViewModel.ContactOption contactOption2 = contactOption;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                int ordinal = contactOption2.f1208type.ordinal();
                                if (ordinal == 0) {
                                    icons = Icons.CommSms24;
                                } else if (ordinal == 1) {
                                    icons = Icons.CommPhoneFill24;
                                } else {
                                    if (ordinal != 2) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    icons = Icons.CommEmail24;
                                }
                                Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                int ordinal2 = contactOption2.f1208type.ordinal();
                                if (ordinal2 == 0) {
                                    i4 = 1717401398;
                                    i5 = R.string.support_article_chat;
                                } else if (ordinal2 == 1) {
                                    i4 = 1717403799;
                                    i5 = R.string.support_article_phone;
                                } else {
                                    if (ordinal2 != 2) {
                                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, 1717400254, false);
                                    }
                                    i4 = 1717406231;
                                    i5 = R.string.support_article_email;
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, re$$ExternalSyntheticOutline0.m(gapComposer3, i4, i5, gapComposer3, false), (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer);
            r9 = (i2 & 112) != 32 ? 0 : 1;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (r9 != 0 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new AlertBannerKt$$ExternalSyntheticLambda2(7, function0);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda2, rememberComposableLambda3, semantics, (Function0) rememberedValue2, z3, z2, rememberComposableLambda, null, push, 0L, gapComposer, 805306422, 3344);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxTooltipView$$ExternalSyntheticLambda0(contactOption, function0, i, 20);
        }
    }

    public static final void ContactSection(List list, Function1 function1, Composer composer, int i) {
        Function1 function12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        NeverEqualPolicy neverEqualPolicy;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(666004320);
        Applier applier = gapComposer.applier;
        int i2 = (i & 6) == 0 ? (gapComposer.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        } else {
            if (list.isEmpty()) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda16(list, function1, i, 8);
                    return;
                }
                return;
            }
            String stringResource = Room.stringResource(gapComposer, R.string.support_article_contact_options_title);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$14);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$15);
            ModalKt.HorizontalDivider(6, 0, gapComposer, SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 32.0f, 7));
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).sectionTitle;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
            } else {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.text.standard;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, 6);
            boolean changed = gapComposer.changed(stringResource);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy2) {
                rememberedValue = new RealSandboxer$$ExternalSyntheticLambda1(stringResource, 26);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$1;
            NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy2;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer, SemanticsModifierKt.semantics(m302paddingqDBjuR0$default, false, (Function1) rememberedValue), textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$12);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$14, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$16);
            gapComposer.startReplaceGroup(65330248);
            List<ArticleViewModel.ContactOption> list2 = list;
            int i4 = 10;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (ArticleViewModel.ContactOption contactOption : list2) {
                boolean changedInstance = gapComposer.changedInstance(contactOption) | ((i3 & 112) == 32);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance) {
                    neverEqualPolicy = neverEqualPolicy3;
                } else {
                    neverEqualPolicy = neverEqualPolicy3;
                    if (rememberedValue2 != neverEqualPolicy) {
                        ContactOption(contactOption, (Function0) rememberedValue2, gapComposer, 0);
                        arrayList.add(Unit.INSTANCE);
                        neverEqualPolicy3 = neverEqualPolicy;
                    }
                }
                rememberedValue2 = new TaxWebAppBridge$$ExternalSyntheticLambda0(i4, function1, contactOption);
                gapComposer.updateRememberedValue(rememberedValue2);
                ContactOption(contactOption, (Function0) rememberedValue2, gapComposer, 0);
                arrayList.add(Unit.INSTANCE);
                neverEqualPolicy3 = neverEqualPolicy;
            }
            function12 = function1;
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, true, true);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new TabContentViewKt$$ExternalSyntheticLambda16(list, function12, i, 9);
        }
    }

    public static final void Error(int i, Composer composer, Function1 function1, boolean z) {
        int i2;
        Pair pair;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1379133817);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z) {
                gapComposer.startReplaceGroup(-1797291484);
                String stringResource = Room.stringResource(gapComposer, R.string.support_article_retry_button);
                boolean z2 = (i2 & 14) == 4;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z2 || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new TabToolbarsKt$$ExternalSyntheticLambda8(7, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                pair = new Pair(stringResource, (Function0) rememberedValue);
                gapComposer.end(false);
            } else {
                if (z) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1797292464, false);
                }
                gapComposer.startReplaceGroup(-1797288564);
                String stringResource2 = Room.stringResource(gapComposer, R.string.support_article_confirmation_button);
                boolean z3 = (i2 & 14) == 4;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z3 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new TabToolbarsKt$$ExternalSyntheticLambda8(8, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                pair = new Pair(stringResource2, (Function0) rememberedValue2);
                gapComposer.end(false);
            }
            String str = (String) pair.first;
            Function0 function0 = (Function0) pair.second;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxHeight(companion, 1.0f), RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, navigationBarsPadding);
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
            ComposableLambdaImpl composableLambdaImpl = z ? f706lambda$1535952936 : null;
            Countries.PageHeader(lambda$361320538, new LayoutWeightElement(1.0f, true), lambda$870099352, composableLambdaImpl, gapComposer, 390, 0);
            coil3.size.SizeKt.ButtonCta(function0, SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7), null, false, false, null, Expect_jvmKt.rememberComposableLambda(-1597150082, new ShopErrorKt$$ExternalSyntheticLambda0(str, 4), gapComposer), gapComposer, 1572912, 60);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArticleViewKt$$ExternalSyntheticLambda14(function1, z, i);
        }
    }

    public static final void Link(Article.Appearance appearance, final Link link, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        ComposableLambdaImpl composableLambdaImpl;
        ComposableLambdaImpl composableLambdaImpl2;
        boolean z;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1967720625);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(appearance.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(link) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        final int i3 = 1;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Article.Appearance appearance2 = Article.Appearance.ISSUE;
            if (appearance != appearance2) {
                gapComposer2.startReplaceGroup(-1643331889);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-666221101, new Function2() { // from class: com.squareup.cash.support.views.article.ArticleViewKt$$ExternalSyntheticLambda40
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Icons icons;
                        int i4 = r2;
                        Link link2 = link;
                        switch (i4) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Link.Target target = link2.target;
                                    if (!(target instanceof Link.Target.Article)) {
                                        if (!(target instanceof Link.Target.External)) {
                                            if (!(target instanceof Link.Target.ClientRoute) && !(target instanceof Link.Target.ClientScenario)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                break;
                                            } else {
                                                icons = Icons.Hyperlink24;
                                            }
                                        } else {
                                            icons = Icons.LinkOut24;
                                        }
                                    } else {
                                        icons = Icons.DocumentFill24;
                                    }
                                    Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer3, 48, 12);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer3;
                                if (gapComposer4.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                    String str = link2.title;
                                    TextStyle textStyle = ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                                    Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                    if (colors == null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1762997739);
                                        gapComposer4.end(false);
                                    }
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.standard, (Composer) gapComposer4, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer2);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-1643231077);
                gapComposer2.end(false);
                composableLambdaImpl = null;
            }
            CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
            if (appearance != appearance2) {
                composableLambdaImpl2 = composableLambdaImpl;
                z = true;
            } else {
                composableLambdaImpl2 = composableLambdaImpl;
                z = false;
            }
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), 64.0f, RecyclerView.DECELERATION_RATE, 2);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new TabToolbarsKt$$ExternalSyntheticLambda28(4);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m279heightInVpY3zN4$default, false, (Function1) rememberedValue);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1940394400, new Function2() { // from class: com.squareup.cash.support.views.article.ArticleViewKt$$ExternalSyntheticLambda40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Icons icons;
                    int i4 = i3;
                    Link link2 = link;
                    switch (i4) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Link.Target target = link2.target;
                                if (!(target instanceof Link.Target.Article)) {
                                    if (!(target instanceof Link.Target.External)) {
                                        if (!(target instanceof Link.Target.ClientRoute) && !(target instanceof Link.Target.ClientScenario)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            break;
                                        } else {
                                            icons = Icons.Hyperlink24;
                                        }
                                    } else {
                                        icons = Icons.LinkOut24;
                                    }
                                } else {
                                    icons = Icons.DocumentFill24;
                                }
                                Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer3, 48, 12);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                String str = link2.title;
                                TextStyle textStyle = ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                                Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                } else {
                                    gapComposer4.startReplaceGroup(-1762997739);
                                    gapComposer4.end(false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.standard, (Composer) gapComposer4, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2);
            int i4 = (gapComposer2.changedInstance(link) ? 1 : 0) | ((i2 & 896) == 256 ? 1 : 0);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (i4 != 0 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ArticleViewKt$$ExternalSyntheticLambda27(function1, link, 1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            gapComposer = gapComposer2;
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(composableLambdaImpl2, rememberComposableLambda, semantics, (Function0) rememberedValue2, false, z, Expect_jvmKt.rememberComposableLambda(719955174, new TaxTooltipView$$ExternalSyntheticLambda0(21, appearance, link), gapComposer2), null, push, 0L, gapComposer, 817889328, 3376);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(appearance, link, function1, i, 12);
        }
    }

    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v9 */
    public static final void LinksSection(final Article.Appearance appearance, final List list, final Function1 function1, Composer composer, final int i) {
        Article.Appearance appearance2;
        Function1 function12;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        NeverEqualPolicy neverEqualPolicy;
        int i2;
        Arrangement$Top$1 arrangement$Top$1;
        BiasAlignment.Horizontal horizontal;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ?? r11;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        Modifier.Companion companion;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        NeverEqualPolicy neverEqualPolicy2;
        NeverEqualPolicy neverEqualPolicy3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-436640165);
        Applier applier = gapComposer.applier;
        int i3 = (i & 6) == 0 ? (gapComposer.changed(appearance.ordinal()) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(list) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            appearance2 = appearance;
            function12 = function1;
            gapComposer.skipToGroupEnd();
        } else {
            if (list.isEmpty()) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    function2 = new Function2() { // from class: com.squareup.cash.support.views.article.ArticleViewKt$$ExternalSyntheticLambda20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i4;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).intValue();
                            switch (i5) {
                                case 0:
                                    ArticleViewKt.LinksSection(appearance, list, function1, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    ArticleViewKt.LinksSection(appearance, list, function1, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            Arrangement$Top$1 arrangement$Top$12 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion2);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$15);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$16);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$17);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$18);
            Article.Appearance appearance3 = Article.Appearance.ISSUE;
            NeverEqualPolicy neverEqualPolicy4 = Composer.Companion.Empty;
            if (appearance != appearance3) {
                gapComposer.startReplaceGroup(-280374308);
                String stringResource = Room.stringResource(gapComposer, R.string.support_article_related_nodes_title);
                ModalKt.HorizontalDivider(6, 0, gapComposer, SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 32.0f, 7));
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).sectionTitle;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j = colors.semantic.text.standard;
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, 6);
                boolean changed = gapComposer.changed(stringResource);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == neverEqualPolicy4) {
                    neverEqualPolicy3 = neverEqualPolicy4;
                    rememberedValue = new RealSandboxer$$ExternalSyntheticLambda1(stringResource, 27);
                    gapComposer.updateRememberedValue(rememberedValue);
                } else {
                    neverEqualPolicy3 = neverEqualPolicy4;
                }
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                i2 = i3;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$18;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                arrangement$Top$1 = arrangement$Top$12;
                horizontal = horizontal2;
                companion = companion2;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                neverEqualPolicy = neverEqualPolicy3;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer, SemanticsModifierKt.semantics(m302paddingqDBjuR0$default, false, (Function1) rememberedValue), textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                r11 = 0;
                gapComposer.end(false);
            } else {
                neverEqualPolicy = neverEqualPolicy4;
                i2 = i3;
                arrangement$Top$1 = arrangement$Top$12;
                horizontal = horizontal2;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                r11 = 0;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                companion = companion2;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$18;
                gapComposer.startReplaceGroup(-279892847);
                gapComposer.end(false);
            }
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, r11);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$12);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$1);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            gapComposer.startReplaceGroup(-387080768);
            List<Link> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (Link link : list2) {
                int i5 = i2;
                boolean z = (i5 & 896) == 256 ? true : r11;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z) {
                    neverEqualPolicy2 = neverEqualPolicy;
                } else {
                    neverEqualPolicy2 = neverEqualPolicy;
                    if (rememberedValue2 != neverEqualPolicy2) {
                        Link(appearance, link, (Function1) rememberedValue2, gapComposer, i5 & 14);
                        arrayList.add(Unit.INSTANCE);
                        i2 = i5;
                        neverEqualPolicy = neverEqualPolicy2;
                    }
                }
                rememberedValue2 = new ScoreHomeKt$$ExternalSyntheticLambda5(16, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
                Link(appearance, link, (Function1) rememberedValue2, gapComposer, i5 & 14);
                arrayList.add(Unit.INSTANCE);
                i2 = i5;
                neverEqualPolicy = neverEqualPolicy2;
            }
            appearance2 = appearance;
            function12 = function1;
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, (boolean) r11, true, true);
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i6 = 1;
            final Function1 function13 = function12;
            final Article.Appearance appearance4 = appearance2;
            function2 = new Function2() { // from class: com.squareup.cash.support.views.article.ArticleViewKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i6;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i52) {
                        case 0:
                            ArticleViewKt.LinksSection(appearance4, list, function13, composer2, Updater.updateChangedFlags(i | 1));
                            break;
                        default:
                            ArticleViewKt.LinksSection(appearance4, list, function13, composer2, Updater.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r28v5 */
    public static final void LoadedArticle(ArticleViewModel.Loaded loaded, RealImageLoader realImageLoader, Function1 function1, WebViewProvider webViewProvider, ScrollState scrollState, SupportActivityItemLoader supportActivityItemLoader, Composer composer, int i, int i2) {
        Function1 function12;
        int i3;
        GapComposer gapComposer;
        Function1 function13;
        Function1 function14;
        Article article;
        Object articlePresenter$models$1$1;
        Continuation continuation;
        MutableState mutableState;
        NeverEqualPolicy neverEqualPolicy;
        Article article2;
        ?? r28;
        MutableState mutableState2;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        BiasAlignment.Horizontal horizontal;
        Modifier.Companion companion;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        int i4;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        Function1 function15;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-391411751);
        Applier applier = gapComposer2.applier;
        int i5 = i | (gapComposer2.changed(loaded) ? 4 : 2) | (gapComposer2.changedInstance(realImageLoader) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i5 | MLKEMEngine.KyberPolyBytes;
            function12 = function1;
        } else {
            function12 = function1;
            i3 = i5 | (gapComposer2.changedInstance(function12) ? 256 : 128);
        }
        int i7 = i3 | (gapComposer2.changedInstance(webViewProvider) ? 2048 : 1024) | (gapComposer2.changed(scrollState) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer2.changedInstance(supportActivityItemLoader) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer2.shouldExecute(i7 & 1, (74899 & i7) != 74898)) {
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (i6 != 0) {
                Object rememberedValue = gapComposer2.rememberedValue();
                if (rememberedValue == neverEqualPolicy2) {
                    rememberedValue = new TabToolbarsKt$$ExternalSyntheticLambda28(5);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                function14 = (Function1) rememberedValue;
            } else {
                function14 = function12;
            }
            Article article3 = loaded.article;
            boolean isEmpty = article3.links.isEmpty();
            boolean isEmpty2 = article3.contactOptions.isEmpty();
            Object[] objArr = {article3.token};
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = new ArticleViewKt$$ExternalSyntheticLambda7(0);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue2, gapComposer2, 48);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy2) {
                rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState3 = (MutableState) rememberedValue3;
            Integer valueOf = Integer.valueOf(scrollState.value$delegate.getIntValue());
            int i8 = i7 & 57344;
            boolean changed = (i8 == 16384) | gapComposer2.changed(parcelableSnapshotMutableIntState);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changed || rememberedValue4 == neverEqualPolicy2) {
                article = article3;
                rememberedValue4 = new WorkflowNode$tick$1$1(scrollState, parcelableSnapshotMutableIntState, null, 4);
                gapComposer2.updateRememberedValue(rememberedValue4);
            } else {
                article = article3;
            }
            Updater.LaunchedEffect(gapComposer2, valueOf, (Function2) rememberedValue4);
            Boolean bool = (Boolean) mutableState3.getValue();
            bool.getClass();
            boolean changed2 = (i8 == 16384) | gapComposer2.changed(parcelableSnapshotMutableIntState);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue5 == neverEqualPolicy2) {
                continuation = null;
                mutableState = mutableState3;
                neverEqualPolicy = neverEqualPolicy2;
                article2 = article;
                articlePresenter$models$1$1 = new ArticlePresenter$models$1$1(scrollState, mutableState, parcelableSnapshotMutableIntState, continuation, 27);
                gapComposer2.updateRememberedValue(articlePresenter$models$1$1);
            } else {
                neverEqualPolicy = neverEqualPolicy2;
                continuation = null;
                mutableState = mutableState3;
                articlePresenter$models$1$1 = rememberedValue5;
                article2 = article;
            }
            Updater.LaunchedEffect(gapComposer2, bool, (Function2) articlePresenter$models$1$1);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(companion2, scrollState, false, 14);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                r28 = continuation;
            } else {
                r28 = continuation;
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            float f = 32.0f;
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(SpacerKt.m302paddingqDBjuR0$default(ImageKt.m177backgroundbw27NRU(verticalScroll$default, colors.semantic.background.f1047app, ColorKt.RectangleShape), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 32.0f, 7));
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal2, gapComposer2, 0);
            MutableState mutableState4 = mutableState;
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, navigationBarsPadding);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw r28;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$13);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$14);
            Integer valueOf2 = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf2, composeUiNode$Companion$SetModifier$15);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$16);
            SupportTransaction supportTransaction = loaded.transaction;
            if (supportTransaction == null) {
                gapComposer2.startReplaceGroup(1113558936);
                gapComposer2.end(false);
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
                mutableState2 = mutableState4;
                companion = companion2;
                function15 = function14;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$14;
                gapComposer = gapComposer2;
                i4 = i7;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                horizontal = horizontal2;
            } else {
                gapComposer2.startReplaceGroup(1113558937);
                int i9 = i7 << 3;
                int i10 = (i9 & 7168) | ((i7 >> 12) & 112) | (i9 & 896);
                mutableState2 = mutableState4;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
                horizontal = horizontal2;
                companion = companion2;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$14;
                Function1 function16 = function14;
                i4 = i7;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                ArticleActivityItemRow(supportTransaction.entityId, supportActivityItemLoader, realImageLoader, function16, gapComposer2, i10);
                function15 = function16;
                gapComposer = gapComposer2;
                gapComposer.end(false);
            }
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new OverlayKt$$ExternalSyntheticLambda1(28, mutableState2);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            Function0 function0 = (Function0) rememberedValue6;
            int i11 = i4 >> 3;
            int i12 = i11 & 112;
            ArticleContent(loaded, function15, webViewProvider, function0, gapComposer, (i4 & 14) | 3072 | i12 | (i11 & 896));
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            if (isEmpty && isEmpty2) {
                f = RecyclerView.DECELERATION_RATE;
            }
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$SpacedAligned, horizontal, gapComposer, 6);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$15, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$16);
            LinksSection(article2.appearance, article2.links, function15, gapComposer, i4 & 896);
            ContactSection(loaded.displayContactOptions, function15, gapComposer, i12);
            gapComposer.end(true);
            gapComposer.end(true);
            function13 = function15;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            function13 = function12;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OffersSearchViewKt$$ExternalSyntheticLambda6(loaded, realImageLoader, function13, webViewProvider, scrollState, supportActivityItemLoader, i, i2);
        }
    }

    public static final void Loading(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-942655162);
        int i2 = 0;
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, navigationBarsPadding);
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
            ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArticleViewKt$$ExternalSyntheticLambda10(i, i2);
        }
    }

    public static final void WebView(String str, Function1 function1, Modifier modifier, WebViewProvider webViewProvider, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(19250266);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i2 |= gapComposer.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(webViewProvider) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            boolean booleanValue = ((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            boolean z = colors.isLight;
            boolean changed = ((i2 & 112) == 32) | gapComposer.changed(booleanValue) | gapComposer.changedInstance(webViewProvider);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new DialogHostKt$$ExternalSyntheticLambda2(booleanValue, webViewProvider, function1, 10);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            boolean changed2 = gapComposer.changed(booleanValue) | gapComposer.changed(z) | ((i2 & 14) == 4);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new CalendarDatePickerKt$$ExternalSyntheticLambda21(str, booleanValue, z);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            AndroidView_androidKt.AndroidView(function12, modifier2, (Function1) rememberedValue2, gapComposer, (i2 >> 3) & 112, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4((Object) str, function1, modifier, (Object) webViewProvider, i, 26);
        }
    }
}
