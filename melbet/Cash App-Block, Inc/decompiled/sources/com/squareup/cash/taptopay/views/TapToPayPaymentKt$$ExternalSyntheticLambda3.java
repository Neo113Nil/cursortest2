package com.squareup.cash.taptopay.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.pullrefresh.PullRefreshIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.viewmodels.marketingmessages.MarketingMessageBadge;
import app.cash.local.views.marketingmessages.MarketingMessageKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzie;
import com.google.android.libraries.places.api.model.zzco;
import com.miteksystems.misnap.core.DateUtil;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.education.stories.viewmodels.EducationStoryViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlRowState$Enabled;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlRowState$InitialLoading;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryTileContentModel;
import com.squareup.cash.investing.viewmodels.search.InvestingSecurityTileContentModel;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypography;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypographyKt;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.paymentpad.viewmodels.ExchangeRatePreview;
import com.squareup.cash.paymentpad.views.HomeViewKt;
import com.squareup.cash.retro.viewmodels.PaymentPlanSummaryViewModel;
import com.squareup.cash.retro.views.PaymentPlanSummaryViewKt;
import com.squareup.cash.taptopay.viewmodels.TapToPayPaymentViewModel;
import com.squareup.cash.taptopay.views.components.TapToPayPaymentAnimationKt;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.CharsKt;
import kotlinx.serialization.json.JsonElementBuildersKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class TapToPayPaymentKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ TapToPayPaymentKt$$ExternalSyntheticLambda3(long j, Function0 function0, TextStyle textStyle, int i) {
        this.$r8$classId = 13;
        this.f$2 = j;
        this.f$1 = function0;
        this.f$3 = textStyle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [int] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v51 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        ?? r4;
        boolean z2;
        int i;
        int i2 = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        long j = this.f$2;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj3 = this.f$3;
        Object obj4 = this.f$1;
        switch (i2) {
            case 0:
                TapToPayPaymentViewModel tapToPayPaymentViewModel = (TapToPayPaymentViewModel) obj4;
                Function1 function1 = (Function1) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
                Applier applier = gapComposer.applier;
                if (shouldExecute) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        z = false;
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        z = false;
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.surface.keypad.background, rectangleShapeKt$RectangleShape$1);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, z);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
                    TapToPayPaymentAnimationKt.TapToPayPaymentAnimation(SizeKt.fillMaxSize(companion, 1.0f), gapComposer, 6);
                    if (tapToPayPaymentViewModel instanceof TapToPayPaymentViewModel.PaymentInitiated) {
                        gapComposer.startReplaceGroup(505978327);
                        Modifier fillMaxSize2 = SizeKt.fillMaxSize(SpacerKt.navigationBarsPadding(SpacerKt.statusBarsPadding(companion)), 1.0f);
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                        int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxSize2);
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
                        TapToPayKt.m3761TapToPayContentiJQMabo((TapToPayPaymentViewModel.PaymentInitiated) tapToPayPaymentViewModel, this.f$2, function1, gapComposer, 0);
                        gapComposer.end(true);
                        gapComposer.end(false);
                    } else {
                        if (!(tapToPayPaymentViewModel instanceof TapToPayPaymentViewModel.PaymentProcessing)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1678888641, false);
                        }
                        gapComposer.startReplaceGroup(506196598);
                        ArcadeThemeKt.ArcadeTheme(ColorsDarkKt.colorsDark, null, null, Expect_jvmKt.rememberComposableLambda(-643872121, new TapToPayKt$$ExternalSyntheticLambda0(14), gapComposer), gapComposer, 3072, 6);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                PullRefreshIndicatorKt.m510CircularArrowIndicatoriJQMabo((PullRefreshState) obj4, this.f$2, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(385));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                MarketingMessageKt.m1328BadgeFNF3uiM((Modifier) obj4, (MarketingMessageBadge) obj3, this.f$2, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.IconText iconText = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.IconText) obj4;
                TextStyle textStyle = (TextStyle) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    String str = iconText.subtitleText;
                    if (str == null) {
                        gapComposer2.startReplaceGroup(1122435899);
                    } else {
                        gapComposer2.startReplaceGroup(1122435900);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, this.f$2, (Composer) gapComposer2, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    }
                    gapComposer2.end(false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                EducationStoryViewModel educationStoryViewModel = (EducationStoryViewModel) obj4;
                Function1 function12 = (Function1) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Modifier statusBarsPadding = SpacerKt.statusBarsPadding(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion, 1.0f), j, rectangleShapeKt$RectangleShape$1));
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, statusBarsPadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer3.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    if ((educationStoryViewModel instanceof EducationStoryViewModel.NotReady) || educationStoryViewModel == null) {
                        r4 = 0;
                        gapComposer3.startReplaceGroup(803904575);
                        zzie.LoadingIndicator(gapComposer3, 0);
                        gapComposer3.end(false);
                    } else if (educationStoryViewModel instanceof EducationStoryViewModel.Ready) {
                        gapComposer3.startReplaceGroup(803975782);
                        if (((Boolean) gapComposer3.consume(InspectionModeKt.LocalInspectionMode)).booleanValue()) {
                            z2 = false;
                            gapComposer3.startReplaceGroup(804216807);
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(804147615);
                            z2 = false;
                            zzie.StoryWebView((EducationStoryViewModel.Ready) educationStoryViewModel, function12, gapComposer3, 0);
                            gapComposer3.end(false);
                        }
                        if (((EducationStoryViewModel.Ready) educationStoryViewModel).showProgressIndicator) {
                            gapComposer3.startReplaceGroup(804262811);
                            zzie.LoadingIndicator(gapComposer3, z2 ? 1 : 0);
                            gapComposer3.end(z2);
                        } else {
                            gapComposer3.startReplaceGroup(804305095);
                            gapComposer3.end(z2);
                        }
                        gapComposer3.end(z2);
                        r4 = z2;
                    } else {
                        r4 = 0;
                        if (!(educationStoryViewModel instanceof EducationStoryViewModel.Error)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, 1549951294, false);
                        }
                        gapComposer3.startReplaceGroup(804365669);
                        zzie.LoadingError(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.Center), (EducationStoryViewModel.Error) educationStoryViewModel, function12, gapComposer3, 0);
                        gapComposer3.end(false);
                    }
                    zzie.StoryOverlay(r4, gapComposer3, null, function12);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                String str2 = (String) obj4;
                zzco zzcoVar = (zzco) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer4, 48);
                    int hashCode4 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer4, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer4, materializeModifier4, ComposeUiNode.Companion.SetModifier, 1.0f, true);
                    ((DefaultSizes) gapComposer4.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer4, SpacerKt.m302paddingqDBjuR0$default(m, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 11), (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    if (zzcoVar instanceof DependentControlRowState$InitialLoading) {
                        gapComposer4.startReplaceGroup(-977095860);
                        AllowanceViewKt.ShimmeringDetails(gapComposer4, 0);
                        gapComposer4.end(false);
                    } else {
                        boolean z3 = false;
                        if (zzcoVar instanceof DependentControlRowState$Enabled) {
                            gapComposer4.startReplaceGroup(-724252316);
                            String str3 = ((DependentControlRowState$Enabled) zzcoVar).controlRowText;
                            if (str3 == null) {
                                gapComposer4.startReplaceGroup(-976985315);
                                gapComposer4.end(false);
                            } else {
                                gapComposer4.startReplaceGroup(-976985314);
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, this.f$2, (Composer) gapComposer4, (Modifier) null, ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                z3 = false;
                                gapComposer4.end(false);
                            }
                            gapComposer4.end(z3);
                        } else {
                            gapComposer4.startReplaceGroup(-976855207);
                            gapComposer4.end(false);
                        }
                    }
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                JsonElementBuildersKt.m4210InvestingCarouselCard3IgeMak((Function0) obj4, this.f$2, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(385));
                return Unit.INSTANCE;
            case 7:
                InvestingCategoryTileContentModel investingCategoryTileContentModel = (InvestingCategoryTileContentModel) obj4;
                RealImageLoader realImageLoader = (RealImageLoader) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxSize(companion2, 1.0f), 12.0f, RecyclerView.DECELERATION_RATE, 2);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer5, 48);
                    int hashCode5 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer5, m300paddingVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer5.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer5, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, 28.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), 56.0f);
                    long j2 = Color.White;
                    AsyncImageKt.m1441AsyncImagesKDTAoQ(investingCategoryTileContentModel.imageUrl, investingCategoryTileContentModel.title, realImageLoader, ImageKt.m177backgroundbw27NRU(m285size3ABfNKs, j2, RoundedCornerShapeKt.CircleShape), null, null, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer5, 0, 0, 3568);
                    SpacerKt.Spacer(gapComposer5, SizeKt.m285size3ABfNKs(companion2, 14.0f));
                    Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion2, 1.0f), 48.0f);
                    String str4 = investingCategoryTileContentModel.title;
                    MooncakeTypography mooncakeTypography = (MooncakeTypography) gapComposer5.consume(MooncakeTypographyKt.LocalTypography);
                    if (mooncakeTypography == null) {
                        mooncakeTypography = ((Boolean) gapComposer5.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                    }
                    TextStyle textStyle2 = mooncakeTypography.smallTitle;
                    String str5 = investingCategoryTileContentModel.title;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= str5.length()) {
                            i = 1;
                        } else if (CharsKt.isWhitespace(str5.charAt(i3))) {
                            i = 2;
                        } else {
                            i3++;
                        }
                    }
                    KeypadKt.m3639AutoScaleTextgQjefEo(str4, m277height3ABfNKs, textStyle2, j2, i, 3, Room.getSp(8), 0, gapComposer5, 1575984, 128);
                    gapComposer5.end(true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                InvestingSecurityTileContentModel investingSecurityTileContentModel = (InvestingSecurityTileContentModel) obj4;
                RealImageLoader realImageLoader2 = (RealImageLoader) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxSize(companion, 1.0f), 12.0f, RecyclerView.DECELERATION_RATE, 2);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer6, 54);
                    int hashCode6 = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer6.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer6, m300paddingVpY3zN4$default2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$15 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer6.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer6.startReusableNode();
                    if (gapComposer6.inserting) {
                        gapComposer6.createNode(layoutNode$Companion$Constructor$15);
                    } else {
                        gapComposer6.useNode();
                    }
                    Updater.m576setimpl(gapComposer6, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer6, currentCompositionLocalScope6, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer6, Integer.valueOf(hashCode6), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer6, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer6, materializeModifier6, ComposeUiNode.Companion.SetModifier);
                    AsyncImageKt.m1441AsyncImagesKDTAoQ(ComposeUtilsKt.getThemedUrl(investingSecurityTileContentModel.image, gapComposer6), investingSecurityTileContentModel.title, realImageLoader2, ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 40.0f), RoundedCornerShapeKt.CircleShape), j, rectangleShapeKt$RectangleShape$1), null, null, null, gapComposer6, 0, 0, 4080);
                    KeypadKt.m3651TextPdH14aY(1, 0, 3, 0, 196656, 0, 3792, MooncakeTheme.getColors(gapComposer6).label, (Composer) gapComposer6, SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), MooncakeTheme.getTypography(gapComposer6).smallTitle, (TextLineBalancing) null, investingSecurityTileContentModel.title, (Map) null, (Function1) null, false);
                    KeypadKt.m3639AutoScaleTextgQjefEo(investingSecurityTileContentModel.ticker, SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), MooncakeTheme.getTypography(gapComposer6).smallTitle, MooncakeTheme.getColors(gapComposer6).tertiaryLabel, 1, 3, Room.getSp(12), 0, gapComposer6, 1597488, 128);
                    gapComposer6.end(true);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                DateUtil.m2164MooncakeInvestingPreIpoGraphFNF3uiM((Modifier) obj4, (State) obj3, this.f$2, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                HomeViewKt.m3700ExchangeRatePreviewTextiJQMabo((ExchangeRatePreview) obj4, this.f$2, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                PaymentPlanSummaryViewKt.m3736ProgressSection3IgeMak((PaymentPlanSummaryViewModel.ProgressSection) obj4, this.f$2, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                TapToPayKt.m3761TapToPayContentiJQMabo((TapToPayPaymentViewModel.PaymentInitiated) obj4, this.f$2, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                DisclaimerTextKt.OnBreakStatusText(this.f$2, (Function0) obj4, (TextStyle) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ TapToPayPaymentKt$$ExternalSyntheticLambda3(int i, int i2, long j, Object obj, Object obj2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$2 = j;
        this.f$3 = obj2;
    }

    public /* synthetic */ TapToPayPaymentKt$$ExternalSyntheticLambda3(long j, Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$2 = j;
        this.f$1 = obj;
        this.f$3 = obj2;
    }

    public /* synthetic */ TapToPayPaymentKt$$ExternalSyntheticLambda3(int i, int i2, long j, Modifier modifier, Object obj) {
        this.$r8$classId = i2;
        this.f$1 = modifier;
        this.f$3 = obj;
        this.f$2 = j;
    }

    public /* synthetic */ TapToPayPaymentKt$$ExternalSyntheticLambda3(InvestingCategoryTileContentModel investingCategoryTileContentModel, long j, RealImageLoader realImageLoader) {
        this.$r8$classId = 7;
        this.f$1 = investingCategoryTileContentModel;
        this.f$2 = j;
        this.f$3 = realImageLoader;
    }

    public /* synthetic */ TapToPayPaymentKt$$ExternalSyntheticLambda3(TapToPayPaymentViewModel tapToPayPaymentViewModel, long j, Function1 function1) {
        this.$r8$classId = 0;
        this.f$1 = tapToPayPaymentViewModel;
        this.f$2 = j;
        this.f$3 = function1;
    }

    public /* synthetic */ TapToPayPaymentKt$$ExternalSyntheticLambda3(Object obj, Object obj2, long j, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$3 = obj2;
        this.f$2 = j;
    }
}
