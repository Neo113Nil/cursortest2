package com.squareup.cash.wallet.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$Vertical;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.layout.ValueInsets;
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
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavHostController;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfoKt;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import com.fillr.browsersdk.model.FillrWidget;
import com.fillr.core.analytics.FillrAnalyticsServiceBuilder;
import com.google.android.gms.common.api.internal.zabr;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagn;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.db.CashAccountDatabaseCallbackKt;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda5;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.tabs.views.TabToolbarsKt;
import com.squareup.cash.upsell.viewmodels.NullStateCarouselViewModel;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.viewmodels.WalletHomeViewModel$WalletScheme;
import com.squareup.cash.work.views.pay.PayCellViewKt;
import com.squareup.util.Strings;
import com.squareup.util.android.ViewGroups$$ExternalSyntheticLambda0;
import com.squareup.util.compose.LifecycleKt$$ExternalSyntheticLambda0;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.core.networking.MarkdownParser$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerState;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.components.ButtonKt$$ExternalSyntheticLambda1;
import com.stripe.android.financialconnections.ui.components.TextKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTypography;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import com.stripe.android.uicore.navigation.NavigationEffectsKt;
import com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStateManagerUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdCaptureRenderer;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdLocalVideoCaptureRenderer;
import defpackage.FinancialConnectionsGenericInfoScreen;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.channels.BufferedChannel$$ExternalSyntheticLambda4;
import kotlinx.coroutines.flow.SharedFlow;
import net.oneformapp.helper.matching.POPMatchingFactory;
import okhttp3.internal.ws.RealWebSocket$connect$1;

/* loaded from: classes7.dex */
public final /* synthetic */ class WalletHomeViewKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ WalletHomeViewKt$$ExternalSyntheticLambda4(SharedFlow sharedFlow, NavHostController navHostController, RealWebSocket$connect$1 realWebSocket$connect$1, Function1 function1, Function1 function12, int i) {
        this.$r8$classId = 10;
        this.f$0 = sharedFlow;
        this.f$1 = navHostController;
        this.f$3 = realWebSocket$connect$1;
        this.f$2 = function1;
        this.f$4 = function12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        int i2 = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj3 = this.f$4;
        Object obj4 = this.f$3;
        Object obj5 = this.f$2;
        Object obj6 = this.f$1;
        Object obj7 = this.f$0;
        switch (i2) {
            case 0:
                ScrollState scrollState = (ScrollState) obj7;
                WalletHomeViewModel$WalletScheme walletHomeViewModel$WalletScheme = (WalletHomeViewModel$WalletScheme) obj6;
                Function1 function1 = (Function1) obj5;
                ElementBoundsRegistry elementBoundsRegistry = (ElementBoundsRegistry) obj4;
                RealImageLoader realImageLoader = (RealImageLoader) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
                Applier applier = gapComposer.applier;
                if (shouldExecute) {
                    float mo236toPx0680j_4 = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(8.0f);
                    long j = Strings.getColors(gapComposer).semantic.background.f1047app;
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = Updater.derivedStateOf(new WalletHomeViewKt$$ExternalSyntheticLambda5(scrollState, mo236toPx0680j_4, 0));
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    GapComposer gapComposer2 = gapComposer;
                    long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(((Number) AnimateAsStateKt.animateFloatAsState(((Number) ((State) rememberedValue).getValue()).floatValue(), null, null, null, gapComposer, 0, 30).getValue()).floatValue(), Strings.getColors(gapComposer2).component.titleBar.background, 14);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    MutableState mutableState = (MutableState) rememberedValue2;
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion2, j, rectangleShapeKt$RectangleShape$1);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
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
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) (rememberedValue3 == neverEqualPolicy ? Boxes$$ExternalSyntheticOutline1.m(0, gapComposer2) : rememberedValue3);
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        rememberedValue4 = new WalletHomeViewKt$$ExternalSyntheticLambda9(0, parcelableSnapshotMutableIntState);
                        gapComposer2.updateRememberedValue(rememberedValue4);
                    } else {
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    }
                    Modifier cardToolbarFadeInOut = CardTransitionKt.cardToolbarFadeInOut(ImageKt.m177backgroundbw27NRU(ValueInsets.layout(fillMaxWidth, (Function3) rememberedValue4), m675copywmQWz5c$default, rectangleShapeKt$RectangleShape$1), gapComposer2);
                    Object rememberedValue5 = gapComposer2.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new CardAppletTile$$ExternalSyntheticLambda0(25);
                        gapComposer2.updateRememberedValue(rememberedValue5);
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(cardToolbarFadeInOut, false, (Function1) rememberedValue5);
                    TabToolbarInternalViewModel tabToolbarInternalViewModel = walletHomeViewModel$WalletScheme.toolbarInternalModel;
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-2031847190, new SheetKt$$ExternalSyntheticLambda5(29, walletHomeViewModel$WalletScheme, function1, mutableState), gapComposer2);
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-350069459, new CardAppletTile$$ExternalSyntheticLambda1(walletHomeViewModel$WalletScheme, 6), gapComposer2);
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue6 = gapComposer2.rememberedValue();
                    if (changed || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new ViewGroups$$ExternalSyntheticLambda0(10, function1);
                        gapComposer2.updateRememberedValue(rememberedValue6);
                    }
                    TabToolbarsKt.TabToolbar(semantics, tabToolbarInternalViewModel, null, false, null, rememberComposableLambda, rememberComposableLambda2, (Function1) rememberedValue6, elementBoundsRegistry, null, null, null, false, gapComposer2, 1769472, 0, 7708);
                    Object rememberedValue7 = gapComposer2.rememberedValue();
                    if (rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new WalletHomeViewKt$$ExternalSyntheticLambda9(2, parcelableSnapshotMutableIntState);
                        gapComposer2.updateRememberedValue(rememberedValue7);
                    }
                    Modifier layout = ValueInsets.layout(companion2, (Function3) rememberedValue7);
                    CardSchemeViewModel cardSchemeViewModel = walletHomeViewModel$WalletScheme.cardSchemeViewModel;
                    if (cardSchemeViewModel instanceof CardSchemeViewModel.HeroNullState) {
                        gapComposer2.startReplaceGroup(-495685961);
                        Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(layout);
                        NullStateCarouselViewModel nullStateCarouselViewModel = ((CardSchemeViewModel.HeroNullState) cardSchemeViewModel).carouselViewModel;
                        boolean changed2 = gapComposer2.changed(function1);
                        Object rememberedValue8 = gapComposer2.rememberedValue();
                        if (changed2 || rememberedValue8 == neverEqualPolicy) {
                            rememberedValue8 = new ViewGroups$$ExternalSyntheticLambda0(11, function1);
                            gapComposer2.updateRememberedValue(rememberedValue8);
                        }
                        TableInfoKt.NullStateCarousel(nullStateCarouselViewModel, (Function1) rememberedValue8, navigationBarsPadding, gapComposer2, 0);
                        gapComposer2.end(false);
                    } else if (cardSchemeViewModel.equals(CardSchemeViewModel.Loading.INSTANCE)) {
                        gapComposer2.startReplaceGroup(-495390035);
                        BiasAlignment biasAlignment = Alignment.Companion.Center;
                        Modifier navigationBarsPadding2 = SpacerKt.navigationBarsPadding(SizeKt.fillMaxSize(layout, 1.0f));
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                        int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, navigationBarsPadding2);
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
                        ProgressCircularKt.ProgressCircular(0, 1, gapComposer2, null);
                        gapComposer2.end(true);
                        gapComposer2.end(false);
                    } else {
                        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13 = ownerSnapshotObserver$onCommitAffectingLayout$1;
                        if (cardSchemeViewModel instanceof CardSchemeViewModel.RetryableError) {
                            gapComposer2.startReplaceGroup(-495045594);
                            Modifier navigationBarsPadding3 = SpacerKt.navigationBarsPadding(SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxSize(layout, 1.0f), 32.0f, RecyclerView.DECELERATION_RATE, 2));
                            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer2, 54);
                            int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
                            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, navigationBarsPadding3);
                            gapComposer2.startReusableNode();
                            if (gapComposer2.inserting) {
                                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                            } else {
                                gapComposer2.useNode();
                            }
                            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$13);
                            Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                            CardSchemeViewModel.RetryableError retryableError = (CardSchemeViewModel.RetryableError) cardSchemeViewModel;
                            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).titleBarPageTitle, (TextLineBalancing) null, retryableError.title, (Map) null, (Function1) null, false);
                            Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, SpacerKt.m300paddingVpY3zN4$default(companion2, RecyclerView.DECELERATION_RATE, 8.0f, 1), Strings.getTypography(gapComposer2).bodyMedium, (TextLineBalancing) null, retryableError.body, (Map) null, (Function1) null, false);
                            coil3.size.SizeKt.ButtonCompact(retryableError.onClick, SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), null, false, !retryableError.isLoading, null, Expect_jvmKt.rememberComposableLambda(908266059, new CardAppletTile$$ExternalSyntheticLambda1(cardSchemeViewModel, 7), gapComposer2), gapComposer2, 1572912, 44);
                            gapComposer2.end(true);
                            gapComposer2.end(false);
                        } else {
                            int i3 = 0;
                            if (cardSchemeViewModel instanceof CardSchemeViewModel.Content) {
                                gapComposer2.startReplaceGroup(-492367318);
                                UtilsKt.WalletScheme(SpacerKt.navigationBarsPadding(ImageKt.verticalScroll$default(NestedScrollModifierKt.nestedScroll(companion2, zzagn.rememberNestedScrollInteropConnection(gapComposer2), null), scrollState, false, 14)), ((CardSchemeViewModel.Content) cardSchemeViewModel).modules, function1, realImageLoader, Expect_jvmKt.rememberComposableLambda(-1060290357, new WalletHomeViewKt$$ExternalSyntheticLambda8(2, parcelableSnapshotMutableIntState), gapComposer2), gapComposer2, 24576);
                                if (((Boolean) mutableState.getValue()).booleanValue()) {
                                    gapComposer2.startReplaceGroup(-491838303);
                                    Object rememberedValue9 = gapComposer2.rememberedValue();
                                    if (rememberedValue9 == neverEqualPolicy) {
                                        rememberedValue9 = new WalletHomeViewKt$$ExternalSyntheticLambda6(0, mutableState);
                                        gapComposer2.updateRememberedValue(rememberedValue9);
                                    }
                                    SheetKt.Sheet((Function0) rememberedValue9, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(1059652192, new BufferedChannel$$ExternalSyntheticLambda4(1, cardSchemeViewModel, function1, realImageLoader), gapComposer2), gapComposer2, 100663302, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                                    z = false;
                                    gapComposer2.end(false);
                                } else {
                                    z = false;
                                    gapComposer2.startReplaceGroup(-491280923);
                                    gapComposer2.end(false);
                                }
                                gapComposer2.end(z);
                            } else {
                                if (!(cardSchemeViewModel instanceof CardSchemeViewModel.CardNullStateBooklet)) {
                                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 815295248, false);
                                }
                                gapComposer2.startReplaceGroup(-491177104);
                                UtilsKt.HeroCardNullState((CardSchemeViewModel.CardNullStateBooklet) cardSchemeViewModel, function1, SizeKt.fillMaxSize(companion2, 1.0f), Expect_jvmKt.rememberComposableLambda(1591300941, new WalletHomeViewKt$$ExternalSyntheticLambda8(i3, parcelableSnapshotMutableIntState), gapComposer2), scrollState, gapComposer2, 3456, 0);
                                gapComposer2 = gapComposer2;
                                gapComposer2.end(false);
                            }
                        }
                    }
                    gapComposer2.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                PayCellViewKt.SummaryTable((String) obj7, (String) obj6, (String) obj5, (String) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                FillrWidget.WidgetType.AnonymousClass1.GenericFooter((FinancialConnectionsGenericInfoScreen.Footer) obj7, (Modifier) obj6, (Function0) obj4, (Function0) obj3, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                Async async = (Async) obj7;
                Async async2 = (Async) obj6;
                Function0 function0 = (Function0) obj4;
                Function1 function12 = (Function1) obj5;
                TextResource.Text text = (TextResource.Text) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    LinkAccountPickerState.Payload payload = (LinkAccountPickerState.Payload) async.invoke();
                    if (payload == null) {
                        gapComposer3.startReplaceGroup(1556637207);
                    } else {
                        gapComposer3.startReplaceGroup(1556637208);
                        ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                        int hashCode4 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer3.currentCompositionLocalScope();
                        Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer3, companion);
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
                        Updater.m576setimpl(gapComposer3, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m574initimpl(gapComposer3, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer3, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                        String str = payload.aboveCta;
                        if (str == null) {
                            gapComposer3.startReplaceGroup(-1458558056);
                        } else {
                            gapComposer3.startReplaceGroup(-1458558055);
                            TextKt.m4020AnnotatedTextrm0N8CA(new TextResource.Text(zabr.fromHtml(str)), function12, TextStyle.m994copyp1EtxEg$default(((FinancialConnectionsTypography) gapComposer3.consume(ThemeKt.LocalTypography)).labelSmall, ((FinancialConnectionsColors) gapComposer3.consume(ThemeKt.LocalColors)).textDefault, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744446), SizeKt.fillMaxWidth(companion, 1.0f), null, 0, 0, gapComposer3, 3072, 112);
                            SpacerKt.Spacer(gapComposer3, SizeKt.m285size3ABfNKs(companion, 12.0f));
                        }
                        gapComposer3.end(false);
                        boolean z4 = !payload.selectedAccountIds.isEmpty();
                        boolean z5 = async2 instanceof Async.Loading;
                        Object rememberedValue10 = gapComposer3.rememberedValue();
                        if (rememberedValue10 == neverEqualPolicy) {
                            rememberedValue10 = new MarkdownParser$$ExternalSyntheticLambda0(24);
                            gapComposer3.updateRememberedValue(rememberedValue10);
                        }
                        TextKt.FinancialConnectionsButton(function0, SizeKt.fillMaxWidth(TestTagKt.testTag(SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue10), "link_account_picker_cta"), 1.0f), null, null, z4, z5, Expect_jvmKt.rememberComposableLambda(-880269207, new CardAppletTile$$ExternalSyntheticLambda1(text, 19), gapComposer3), gapComposer3, 1572864, 12);
                        gapComposer3.end(true);
                    }
                    gapComposer3.end(false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                FillrAnalyticsServiceBuilder.NetworkingLinkSignupContent((NetworkingLinkSignupState) obj7, (Function1) obj5, (Function1) obj6, (Function0) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                CashAccountDatabaseCallbackKt.NoticeSheetContent((NoticeSheetState.NoticeSheetContent) obj7, (Function1) obj5, (Function0) obj6, (Function0) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = (FinancialConnectionsSheetNativeActivity) obj7;
                NavHostController navHostController = (NavHostController) obj6;
                BottomSheetNavigator bottomSheetNavigator = (BottomSheetNavigator) obj5;
                State state = (State) obj4;
                Destination destination = (Destination) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i4 = FinancialConnectionsSheetNativeActivity.$r8$clinit;
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    boolean changedInstance = gapComposer4.changedInstance(financialConnectionsSheetNativeActivity) | gapComposer4.changedInstance(navHostController);
                    Object rememberedValue11 = gapComposer4.rememberedValue();
                    if (changedInstance || rememberedValue11 == neverEqualPolicy) {
                        z2 = true;
                        rememberedValue11 = new StateFlowsKt$$ExternalSyntheticLambda2(1 == true ? 1 : 0, financialConnectionsSheetNativeActivity, navHostController);
                        gapComposer4.updateRememberedValue(rememberedValue11);
                    } else {
                        z2 = true;
                    }
                    DBUtil.BackHandler(z2, (Function0) rememberedValue11, gapComposer4, 6, 0);
                    TextKt.FinancialConnectionsModalBottomSheetLayout(bottomSheetNavigator, Expect_jvmKt.rememberComposableLambda(712780309, new LifecycleKt$$ExternalSyntheticLambda0(financialConnectionsSheetNativeActivity, state, navHostController, destination, 28), gapComposer4), gapComposer4, 48);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Density density = (Density) obj7;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj6;
                Brush brush = (Brush) obj5;
                State state2 = (State) obj4;
                MutableState mutableState2 = (MutableState) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer4;
                boolean shouldExecute2 = gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2);
                Applier applier2 = gapComposer5.applier;
                if (shouldExecute2) {
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode5 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer5, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (applier2 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer5.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer5, maybeCachedBoxMeasurePolicy3, composeUiNode$Companion$SetModifier$15);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$16);
                    Integer valueOf2 = Integer.valueOf(hashCode5);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m574initimpl(gapComposer5, valueOf2, composeUiNode$Companion$SetModifier$17);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$14 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$14);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer5, materializeModifier5, composeUiNode$Companion$SetModifier$18);
                    Modifier alpha = AlphaKt.alpha(companion, 1.0f - ((Number) state2.getValue()).floatValue());
                    gapComposer5.startReplaceGroup(-982635024);
                    PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(16.0f, 16.0f, 16.0f, 16.0f);
                    gapComposer5.end(false);
                    Modifier padding = SpacerKt.padding(alpha, paddingValuesImpl);
                    boolean changed3 = gapComposer5.changed(density);
                    Object rememberedValue12 = gapComposer5.rememberedValue();
                    if (changed3 || rememberedValue12 == neverEqualPolicy) {
                        i = 0;
                        rememberedValue12 = new ButtonKt$$ExternalSyntheticLambda1(density, mutableState2, 0);
                        gapComposer5.updateRememberedValue(rememberedValue12);
                    } else {
                        i = 0;
                    }
                    Modifier onSizeChanged = RulerKt.onSizeChanged(padding, (Function1) rememberedValue12);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer5, i);
                    int hashCode6 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer5, onSizeChanged);
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, rowMeasurePolicy, composeUiNode$Companion$SetModifier$15);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$16);
                    SVG$Unit$EnumUnboxingLocalUtility.m(hashCode6, gapComposer5, composeUiNode$Companion$SetModifier$17, gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$14);
                    Updater.m576setimpl(gapComposer5, materializeModifier6, composeUiNode$Companion$SetModifier$18);
                    composableLambdaImpl.invoke(RowScopeInstance.INSTANCE, (Object) gapComposer5, (Object) 6);
                    gapComposer5.end(true);
                    ListItemKt.m4014LoadingSpinneruFdPcIQ(AlphaKt.alpha(SizeKt.m285size3ABfNKs(companion, ((Dp) mutableState2.getValue()).value), ((Number) state2.getValue()).floatValue()), 2.0f, brush, gapComposer5, 432, 0);
                    gapComposer5.end(true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                ScrollState scrollState2 = (ScrollState) obj7;
                Arrangement$Vertical arrangement$Vertical = (Arrangement$Vertical) obj6;
                PaddingValues paddingValues = (PaddingValues) obj5;
                Function2 function2 = (Function2) obj4;
                ComposableLambdaImpl composableLambdaImpl2 = (ComposableLambdaImpl) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer5;
                boolean shouldExecute3 = gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2);
                Applier applier3 = gapComposer6.applier;
                if (shouldExecute3) {
                    Modifier animateContentSize$default = AnimatedContentKt.animateContentSize$default(ImageKt.verticalScroll$default(companion, scrollState2, false, 14), null, 3);
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Vertical, horizontal, gapComposer6, 0);
                    int hashCode7 = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer6.currentCompositionLocalScope();
                    Modifier materializeModifier7 = PlatformKt.materializeModifier(gapComposer6, animateContentSize$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (applier3 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer6.startReusableNode();
                    if (gapComposer6.inserting) {
                        gapComposer6.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer6.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$19 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer6, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$19);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$110 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer6, currentCompositionLocalScope7, composeUiNode$Companion$SetModifier$110);
                    Integer valueOf3 = Integer.valueOf(hashCode7);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$111 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m574initimpl(gapComposer6, valueOf3, composeUiNode$Companion$SetModifier$111);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$15 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer6, ownerSnapshotObserver$onCommitAffectingLayout$15);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$112 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer6, materializeModifier7, composeUiNode$Companion$SetModifier$112);
                    Modifier padding2 = SpacerKt.padding(companion, paddingValues);
                    ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal, gapComposer6, 0);
                    int hashCode8 = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope8 = gapComposer6.currentCompositionLocalScope();
                    Modifier materializeModifier8 = PlatformKt.materializeModifier(gapComposer6, padding2);
                    gapComposer6.startReusableNode();
                    if (gapComposer6.inserting) {
                        gapComposer6.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer6.useNode();
                    }
                    Updater.m576setimpl(gapComposer6, columnMeasurePolicy4, composeUiNode$Companion$SetModifier$19);
                    Updater.m576setimpl(gapComposer6, currentCompositionLocalScope8, composeUiNode$Companion$SetModifier$110);
                    SVG$Unit$EnumUnboxingLocalUtility.m(hashCode8, gapComposer6, composeUiNode$Companion$SetModifier$111, gapComposer6, ownerSnapshotObserver$onCommitAffectingLayout$15);
                    Updater.m576setimpl(gapComposer6, materializeModifier8, composeUiNode$Companion$SetModifier$112);
                    Recorder$$ExternalSyntheticOutline1.m(6, composableLambdaImpl2, ColumnScopeInstance.INSTANCE, gapComposer6, true);
                    if (function2 == null) {
                        gapComposer6.startReplaceGroup(-1565472710);
                        WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                        SpacerKt.Spacer(gapComposer6, OffsetKt.windowInsetsBottomHeight(Arrangement$End$1.current(gapComposer6).navigationBars));
                        z3 = false;
                    } else {
                        z3 = false;
                        gapComposer6.startReplaceGroup(-1569699808);
                    }
                    gapComposer6.end(z3);
                    gapComposer6.end(true);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                LazyListState lazyListState = (LazyListState) obj7;
                PaddingValues paddingValues2 = (PaddingValues) obj6;
                Arrangement$Vertical arrangement$Vertical2 = (Arrangement$Vertical) obj4;
                Function1 function13 = (Function1) obj5;
                Function2 function22 = (Function2) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer6;
                if (gapComposer7.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    boolean changed4 = gapComposer7.changed(function13) | gapComposer7.changed(function22);
                    Object rememberedValue13 = gapComposer7.rememberedValue();
                    if (changed4 || rememberedValue13 == neverEqualPolicy) {
                        rememberedValue13 = new HeroCardViewKt$$ExternalSyntheticLambda0(26, function13, function22);
                        gapComposer7.updateRememberedValue(rememberedValue13);
                    }
                    LazyDslKt.LazyColumn(null, lazyListState, paddingValues2, arrangement$Vertical2, null, null, false, null, (Function1) rememberedValue13, gapComposer7, 0, 489);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                NavigationEffectsKt.NavigationEffects((SharedFlow) obj7, (NavHostController) obj6, (RealWebSocket$connect$1) obj4, (Function1) obj5, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                GovernmentIdState.CountdownToCapture countdownToCapture = (GovernmentIdState.CountdownToCapture) obj7;
                CaptureRenderer captureRenderer = (CaptureRenderer) obj6;
                GovernmentIdWorkflow.Input input = (GovernmentIdWorkflow.Input) obj5;
                StatefulWorkflow.RenderContext renderContext = (StatefulWorkflow.RenderContext) obj4;
                POPMatchingFactory pOPMatchingFactory = (POPMatchingFactory) obj3;
                List list = (List) obj;
                CameraProperties cameraProperties = (CameraProperties) obj2;
                list.getClass();
                cameraProperties.getClass();
                List list2 = countdownToCapture.idForReview.frames;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Frame) it.next()).absoluteFilePath);
                }
                ArrayList plus = CollectionsKt.plus((Iterable) list, (Collection) arrayList);
                CaptureConfig captureConfig = countdownToCapture.captureConfig;
                GovernmentId.GovernmentIdImage governmentIdImage = countdownToCapture.idForReview;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(plus, 10));
                Iterator it2 = plus.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new Frame((String) it2.next()));
                }
                captureRenderer.onCaptureComplete(input, countdownToCapture, renderContext, captureConfig, pOPMatchingFactory, cameraProperties, GovernmentId.GovernmentIdImage.copy$default(governmentIdImage, arrayList2));
                return Unit.INSTANCE;
            case 12:
                GovernmentIdState.CountdownToCapture countdownToCapture2 = (GovernmentIdState.CountdownToCapture) obj7;
                GovIdCaptureRenderer govIdCaptureRenderer = (GovIdCaptureRenderer) obj6;
                GovernmentIdWorkflow.Input input2 = (GovernmentIdWorkflow.Input) obj5;
                SubtreeManager subtreeManager = (SubtreeManager) obj4;
                POPMatchingFactory pOPMatchingFactory2 = (POPMatchingFactory) obj3;
                List list3 = (List) obj;
                CameraProperties cameraProperties2 = (CameraProperties) obj2;
                list3.getClass();
                cameraProperties2.getClass();
                List list4 = countdownToCapture2.idForReview.frames;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                Iterator it3 = list4.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((Frame) it3.next()).absoluteFilePath);
                }
                ArrayList plus2 = CollectionsKt.plus((Iterable) list3, (Collection) arrayList3);
                CaptureConfig captureConfig2 = countdownToCapture2.captureConfig;
                GovernmentId.GovernmentIdImage governmentIdImage2 = countdownToCapture2.idForReview;
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(plus2, 10));
                Iterator it4 = plus2.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(new Frame((String) it4.next()));
                }
                govIdCaptureRenderer.onCaptureComplete(input2, countdownToCapture2, subtreeManager, captureConfig2, pOPMatchingFactory2, cameraProperties2, GovernmentId.GovernmentIdImage.copy$default(governmentIdImage2, arrayList4));
                return Unit.INSTANCE;
            default:
                GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = (GovernmentIdState.FinalizeLocalVideoCapture) obj6;
                GovernmentIdWorkflow.Input input3 = (GovernmentIdWorkflow.Input) obj5;
                POPMatchingFactory pOPMatchingFactory3 = (POPMatchingFactory) obj4;
                SubtreeManager subtreeManager2 = (SubtreeManager) obj3;
                File file = (File) obj;
                CameraProperties cameraProperties3 = (CameraProperties) obj2;
                file.getClass();
                cameraProperties3.getClass();
                ((GovIdLocalVideoCaptureRenderer) obj7).getClass();
                List list5 = finalizeLocalVideoCapture.uploadingIds;
                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                Iterator it5 = list5.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(((GovernmentId) it5.next()).getSide());
                }
                GovernmentId.Side side = GovernmentId.Side.FRONT;
                boolean contains = arrayList5.contains(side);
                GovernmentId.Side side2 = GovernmentId.Side.BACK;
                boolean contains2 = arrayList5.contains(side2);
                String absolutePath = file.getAbsolutePath();
                absolutePath.getClass();
                List listOf = CollectionsKt__CollectionsJVMKt.listOf(new Frame(absolutePath, "video/*"));
                if (contains && contains2) {
                    side = GovernmentId.Side.FRONT_AND_BACK;
                } else if (!contains && contains2) {
                    side = side2;
                }
                GovernmentIdStateManagerUtilsKt.moveToNextStep$default(finalizeLocalVideoCapture, subtreeManager2, input3, new GovernmentId.GovernmentIdVideo(listOf, side, finalizeLocalVideoCapture.id.idClassKey, GovernmentId.CaptureMethod.MANUAL), finalizeLocalVideoCapture.id, pOPMatchingFactory3, cameraProperties3, false, null, 0, null, 3840);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ WalletHomeViewKt$$ExternalSyntheticLambda4(FinancialConnectionsGenericInfoScreen.Footer footer, Modifier modifier, Function0 function0, Function0 function02, Function1 function1, int i) {
        this.$r8$classId = 2;
        this.f$0 = footer;
        this.f$1 = modifier;
        this.f$3 = function0;
        this.f$4 = function02;
        this.f$2 = function1;
    }

    public /* synthetic */ WalletHomeViewKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
    }

    public /* synthetic */ WalletHomeViewKt$$ExternalSyntheticLambda4(Object obj, Function1 function1, Function function, Function0 function0, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = function1;
        this.f$1 = function;
        this.f$3 = function0;
        this.f$4 = obj2;
    }

    public /* synthetic */ WalletHomeViewKt$$ExternalSyntheticLambda4(String str, String str2, String str3, String str4, Modifier modifier, int i) {
        this.$r8$classId = 1;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = str3;
        this.f$3 = str4;
        this.f$4 = modifier;
    }

    public /* synthetic */ WalletHomeViewKt$$ExternalSyntheticLambda4(int i, Object obj, Object obj2, Object obj3, Object obj4, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$2 = function1;
        this.f$4 = obj4;
    }
}
