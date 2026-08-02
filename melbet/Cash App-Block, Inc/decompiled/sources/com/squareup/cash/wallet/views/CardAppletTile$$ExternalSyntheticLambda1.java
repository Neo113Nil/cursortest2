package com.squareup.cash.wallet.views;

import android.content.Context;
import android.widget.TextView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.Av1ConfigUtil;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController$NavControllerNavigatorState;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import coil3.Extras;
import coil3.RealImageLoader;
import coil3.SingletonImageLoader;
import coil3.SingletonImageLoaderKt;
import coil3.SingletonImageLoaderKt$$ExternalSyntheticLambda0;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.fillr.home.adapter.FProfileHomeListViewAdapter;
import com.google.android.material.imageview.ShapeableImageView;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.tabs.viewmodels.TabToolbarViewModel$TabToolbarTitle$TextTitle;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.viewmodels.PrepurchaseCardData;
import com.squareup.cash.wallet.viewmodels.PresentationAction;
import com.squareup.cash.wallet.viewmodels.WalletHomeViewModel$WalletScheme;
import com.squareup.cash.work.viewmodels.ClockInBottomSheetViewModel;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.cash.work.viewmodels.DeclareCashTipBottomSheetViewModel;
import com.squareup.cash.work.viewmodels.PayHistorySection;
import com.squareup.cash.work.views.SellerCardKt;
import com.squareup.cash.work.views.SellerCardShape;
import com.squareup.cash.work.views.SellerCardSize;
import com.squareup.cash.work.views.WorkTitleBarViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt;
import com.squareup.util.Strings;
import com.squareup.util.compose.ListsKt$$ExternalSyntheticLambda0;
import com.stripe.android.core.networking.MarkdownParser$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.consent.ConsentState;
import com.stripe.android.financialconnections.features.consent.ui.ConsentLogoHeaderKt;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerState;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationScreenKt;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationState;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationScreenKt;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationState;
import com.stripe.android.financialconnections.features.success.SuccessContentKt;
import com.stripe.android.financialconnections.features.success.SuccessContentKt$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.model.ConsentPane;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetKt;
import com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTypography;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import com.stripe.android.uicore.image.DefaultStripeImageLoader;
import com.stripe.android.uicore.image.StripeImageKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import com.valentinilk.shimmer.ShimmerModifierKt$shimmer$1$1;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.HelpBottomSheetComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextViewStyle;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieReviewItemBinding;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2NavigationTroubleshootingTipsPageItemBinding;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.ui.components.helpbottomsheet.HelpPagerAdapter;
import com.withpersona.sdk2.inquiry.steps.ui.components.helpbottomsheet.HelpPagerItem;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.ImageStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.FinancialConnectionsGenericInfoScreen;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.MutexImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class CardAppletTile$$ExternalSyntheticLambda1 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CardAppletTile$$ExternalSyntheticLambda1(MutexImpl mutexImpl, MutexImpl.CancellableContinuationWithOwner cancellableContinuationWithOwner) {
        this.$r8$classId = 27;
        this.f$0 = mutexImpl;
    }

    private final Object invoke$com$stripe$android$financialconnections$navigation$bottomsheet$BottomSheetNavigator$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3) {
        final BottomSheetNavigator bottomSheetNavigator = (BottomSheetNavigator) this.f$0;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = bottomSheetNavigator.attached$delegate;
        ColumnScope columnScope = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        columnScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(columnScope) ? 4 : 2;
        }
        final int i = 1;
        final int i2 = 0;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            SaveableStateHolderImpl rememberSaveableStateHolder = SaverKt.rememberSaveableStateHolder(gapComposer);
            final MutableState collectAsState = StateFlowsComposeKt.collectAsState(((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue() ? bottomSheetNavigator.getState().transitionsInProgress : FlowKt.MutableStateFlow(EmptySet.INSTANCE), gapComposer);
            Object MutableStateFlow = ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue() ? bottomSheetNavigator.getState().backStack : FlowKt.MutableStateFlow(EmptyList.INSTANCE);
            boolean changedInstance = gapComposer.changedInstance(bottomSheetNavigator);
            Object rememberedValue = gapComposer.rememberedValue();
            Continuation continuation = null;
            Object obj4 = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == obj4) {
                rememberedValue = new ShimmerModifierKt$shimmer$1$1(bottomSheetNavigator, continuation, 12);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState produceState = Updater.produceState(null, MutableStateFlow, (Function2) rememberedValue, gapComposer, 6);
            if (((NavBackStackEntry) produceState.getValue()) != null) {
                gapComposer.startReplaceGroup(-1538897690);
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) produceState.getValue();
                boolean changedInstance2 = gapComposer.changedInstance(bottomSheetNavigator);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == obj4) {
                    rememberedValue2 = new ExoPlayerVideoView.AnonymousClass2(bottomSheetNavigator, continuation, 28);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Updater.LaunchedEffect(gapComposer, navBackStackEntry, (Function2) rememberedValue2);
                boolean changedInstance3 = gapComposer.changedInstance(bottomSheetNavigator) | gapComposer.changed(produceState);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changedInstance3 || rememberedValue3 == obj4) {
                    rememberedValue3 = new ListsKt$$ExternalSyntheticLambda0(29, bottomSheetNavigator, produceState);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                DBUtil.BackHandler(false, (Function0) rememberedValue3, gapComposer, 0, 1);
            } else {
                gapComposer.startReplaceGroup(-1546233716);
            }
            gapComposer.end(false);
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) produceState.getValue();
            ModalBottomSheetState modalBottomSheetState = bottomSheetNavigator.sheetState;
            boolean changed = gapComposer.changed(collectAsState) | gapComposer.changedInstance(bottomSheetNavigator);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed || rememberedValue4 == obj4) {
                rememberedValue4 = new Function1() { // from class: com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        int i3 = i2;
                        State state = collectAsState;
                        BottomSheetNavigator bottomSheetNavigator2 = bottomSheetNavigator;
                        NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) obj5;
                        switch (i3) {
                            case 0:
                                navBackStackEntry3.getClass();
                                Set set = (Set) state.getValue();
                                NavController$NavControllerNavigatorState state2 = bottomSheetNavigator2.getState();
                                Iterator it = set.iterator();
                                while (it.hasNext()) {
                                    state2.markTransitionComplete((NavBackStackEntry) it.next());
                                }
                                break;
                            default:
                                navBackStackEntry3.getClass();
                                if (((Set) state.getValue()).contains(navBackStackEntry3)) {
                                    bottomSheetNavigator2.getState().markTransitionComplete(navBackStackEntry3);
                                } else {
                                    bottomSheetNavigator2.getState().pop(navBackStackEntry3, false);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Function1 function1 = (Function1) rememberedValue4;
            boolean changed2 = gapComposer.changed(collectAsState) | gapComposer.changedInstance(bottomSheetNavigator);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue5 == obj4) {
                rememberedValue5 = new Function1() { // from class: com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        int i3 = i;
                        State state = collectAsState;
                        BottomSheetNavigator bottomSheetNavigator2 = bottomSheetNavigator;
                        NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) obj5;
                        switch (i3) {
                            case 0:
                                navBackStackEntry3.getClass();
                                Set set = (Set) state.getValue();
                                NavController$NavControllerNavigatorState state2 = bottomSheetNavigator2.getState();
                                Iterator it = set.iterator();
                                while (it.hasNext()) {
                                    state2.markTransitionComplete((NavBackStackEntry) it.next());
                                }
                                break;
                            default:
                                navBackStackEntry3.getClass();
                                if (((Set) state.getValue()).contains(navBackStackEntry3)) {
                                    bottomSheetNavigator2.getState().markTransitionComplete(navBackStackEntry3);
                                } else {
                                    bottomSheetNavigator2.getState().pop(navBackStackEntry3, false);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            BottomSheetKt.SheetContentHost(columnScope, navBackStackEntry2, modalBottomSheetState, rememberSaveableStateHolder, function1, (Function1) rememberedValue5, gapComposer, (intValue & 14) | 512);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TextStyle textStyle;
        Image image;
        int i;
        RealImageLoader realImageLoader;
        TextViewStyle helpTextviewStyle;
        int i2 = this.$r8$classId;
        int i3 = 26;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        RealImageLoader realImageLoader2 = null;
        r15 = null;
        String str = null;
        Object obj4 = this.f$0;
        switch (i2) {
            case 0:
                CardAppletTile cardAppletTile = (CardAppletTile) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    SharedUIKt.AppletTileRowUninstalledContent(2131232815, 0, gapComposer, Room.stringResource(gapComposer, R.string.card_applet_uninstalled_row_title), Room.stringResource(gapComposer, R.string.card_applet_uninstalled_row_subtitle), cardAppletTile.onUninstalledClick);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                PrepurchaseCardData.CardHeader cardHeader = (PrepurchaseCardData.CardHeader) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, cardHeader.buttonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                PresentationAction presentationAction = (PresentationAction) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, presentationAction.label, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                CardSchemeViewModel.Module.Accessory accessory = (CardSchemeViewModel.Module.Accessory) obj4;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((CardSchemeViewModel.Module.Accessory.Button) accessory).text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                RoundedCornerShape roundedCornerShape = (RoundedCornerShape) obj4;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                boolean shouldExecute = gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16);
                Applier applier = gapComposer5.applier;
                if (shouldExecute) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.CenterEnd, false);
                    int hashCode = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer5, fillMaxSize);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer5.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer5, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer5, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer5, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m290width3ABfNKs(SizeKt.fillMaxHeight(companion, 1.0f), 88.0f), roundedCornerShape), Strings.getColors(gapComposer5).semantic.text.warning, ColorKt.RectangleShape);
                    Strings.getSizes(gapComposer5).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(m177backgroundbw27NRU, 32.0f, RecyclerView.DECELERATION_RATE, 2);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode2 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer5, m300paddingVpY3zN4$default);
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer5, composeUiNode$Companion$SetModifier$13, gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer5, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Trace.m1191Iconww6aTOc(Icons.Clear24, (String) null, (Modifier) null, Strings.getColors(gapComposer5).semantic.icon.inverse, gapComposer5, 54, 4);
                    gapComposer5.end(true);
                    gapComposer5.end(true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                PrepurchaseCardData.Toggle toggle = (PrepurchaseCardData.Toggle) obj4;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (!gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    gapComposer6.skipToGroupEnd();
                } else if (toggle.loading) {
                    gapComposer6.startReplaceGroup(-1298812753);
                    ProgressCircularKt.ProgressCircular(6, 0, gapComposer6, SpacerKt.m298padding3ABfNKs(companion, 4.0f));
                    gapComposer6.end(false);
                } else {
                    gapComposer6.startReplaceGroup(-1298723380);
                    gapComposer6.end(false);
                }
                return Unit.INSTANCE;
            case 6:
                WalletHomeViewModel$WalletScheme walletHomeViewModel$WalletScheme = (WalletHomeViewModel$WalletScheme) obj4;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    Av1ConfigUtil av1ConfigUtil = walletHomeViewModel$WalletScheme.toolbarViewModel.title;
                    TabToolbarViewModel$TabToolbarTitle$TextTitle tabToolbarViewModel$TabToolbarTitle$TextTitle = av1ConfigUtil instanceof TabToolbarViewModel$TabToolbarTitle$TextTitle ? (TabToolbarViewModel$TabToolbarTitle$TextTitle) av1ConfigUtil : null;
                    String str2 = tabToolbarViewModel$TabToolbarTitle$TextTitle != null ? tabToolbarViewModel$TabToolbarTitle$TextTitle.title : null;
                    if (str2 == null) {
                        gapComposer7.startReplaceGroup(-738571115);
                        gapComposer7.end(false);
                    } else {
                        gapComposer7.startReplaceGroup(-738571114);
                        if (StringsKt.isBlank(str2)) {
                            gapComposer7.startReplaceGroup(-160001001);
                            gapComposer7.end(false);
                        } else {
                            gapComposer7.startReplaceGroup(-160462281);
                            Object rememberedValue = gapComposer7.rememberedValue();
                            if (rememberedValue == neverEqualPolicy) {
                                rememberedValue = new CardAppletTile$$ExternalSyntheticLambda0(i3);
                                gapComposer7.updateRememberedValue(rememberedValue);
                            }
                            Modifier semantics = SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue);
                            if (walletHomeViewModel$WalletScheme.toolbarInternalModel.startButtonType == TabToolbarInternalViewModel.StartButtonType.CLOSE) {
                                gapComposer7.startReplaceGroup(-160221287);
                                textStyle = ((Typography) gapComposer7.consume(ArcadeThemeKt.LocalTypography)).titleBarPageTitle;
                                gapComposer7.end(false);
                            } else {
                                gapComposer7.startReplaceGroup(-160122459);
                                textStyle = (TextStyle) gapComposer7.consume(ArcadeThemeKt.LocalTextStyle);
                                if (textStyle == null) {
                                    gapComposer7.startReplaceGroup(-1100573765);
                                    textStyle = ((Typography) gapComposer7.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                                } else {
                                    gapComposer7.startReplaceGroup(-1100574912);
                                }
                                gapComposer7.end(false);
                                gapComposer7.end(false);
                            }
                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer7, semantics, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                            gapComposer7.end(false);
                        }
                        gapComposer7.end(false);
                    }
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                CardSchemeViewModel cardSchemeViewModel = (CardSchemeViewModel) obj4;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    Object rememberedValue2 = gapComposer8.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = Updater.mutableStateOf$default(new IntSize(0L));
                        gapComposer8.updateRememberedValue(rememberedValue2);
                    }
                    CrossfadeKt.Crossfade(Boolean.valueOf(((CardSchemeViewModel.RetryableError) cardSchemeViewModel).isLoading), (Modifier) null, (FiniteAnimationSpec) null, "loading", Expect_jvmKt.rememberComposableLambda(567699082, new WorkTitleBarViewKt$$ExternalSyntheticLambda4(7, cardSchemeViewModel, (MutableState) rememberedValue2), gapComposer8), gapComposer8, 27648, 6);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                ClockInBottomSheetViewModel clockInBottomSheetViewModel = (ClockInBottomSheetViewModel) obj4;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (!gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    gapComposer9.skipToGroupEnd();
                } else if (clockInBottomSheetViewModel.isClockInButtonLoading) {
                    gapComposer9.startReplaceGroup(-1042133858);
                    ProgressCircularKt.ProgressCircular(6, 0, gapComposer9, SizeKt.m285size3ABfNKs(companion, 24.0f));
                    gapComposer9.end(false);
                } else {
                    gapComposer9.startReplaceGroup(-1042057226);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer9, R.string.work_views_clock_in_button), (Map) null, (Function1) null, false);
                    gapComposer9.end(false);
                }
                return Unit.INSTANCE;
            case 9:
                ClockInOverlayViewModel clockInOverlayViewModel = (ClockInOverlayViewModel) obj4;
                ScrollingScaffoldContentScope scrollingScaffoldContentScope = (ScrollingScaffoldContentScope) obj;
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                scrollingScaffoldContentScope.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((GapComposer) composer10).changed(scrollingScaffoldContentScope) ? 4 : 2;
                }
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 19) != 18)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(scrollingScaffoldContentScope.weight(1.0f, companion, true), 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode3 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer10.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer10, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer10.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer10.startReusableNode();
                    if (gapComposer10.inserting) {
                        gapComposer10.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer10.useNode();
                    }
                    Updater.m576setimpl(gapComposer10, maybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer10, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer10, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer10, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer10, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    SellerCardKt.SellerCard(clockInOverlayViewModel.getSellerCard(), null, SellerCardSize.XLarge, SellerCardShape.Circle, gapComposer10, 3456, 2);
                    gapComposer10.end(true);
                    if (clockInOverlayViewModel instanceof ClockInOverlayViewModel.Loading) {
                        gapComposer10.startReplaceGroup(911911788);
                        VisibleKt.ShimmerBox(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 48.0f), false, null, DisclaimerTextKt.f760lambda$2037180048, gapComposer10, 3078, 6);
                        VisibleKt.ShimmerBox(SizeKt.m277height3ABfNKs(Request$Priority$EnumUnboxingLocalUtility.m(companion, 8.0f, gapComposer10, companion, 1.0f), 48.0f), false, null, DisclaimerTextKt.f766lambda$772016025, gapComposer10, 3078, 6);
                        gapComposer10.end(false);
                    } else {
                        gapComposer10.startReplaceGroup(912113598);
                        gapComposer10.end(false);
                    }
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer10, null);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Integer num = (Integer) obj4;
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer11, num.intValue()), (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                DeclareCashTipBottomSheetViewModel declareCashTipBottomSheetViewModel = (DeclareCashTipBottomSheetViewModel) obj4;
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (!gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    gapComposer12.skipToGroupEnd();
                } else if (declareCashTipBottomSheetViewModel.isLoading) {
                    gapComposer12.startReplaceGroup(40115469);
                    ProgressCircularKt.ProgressCircular(6, 0, gapComposer12, SizeKt.m285size3ABfNKs(companion, 24.0f));
                    gapComposer12.end(false);
                } else {
                    gapComposer12.startReplaceGroup(40199696);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer12, R.string.work_views_save), (Map) null, (Function1) null, false);
                    gapComposer12.end(false);
                }
                return Unit.INSTANCE;
            case 12:
                PayHistorySection payHistorySection = (PayHistorySection) obj4;
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    ViewfinderDefaults.SectionHeader(payHistorySection.title, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer13, 0, 30);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer13, null);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Set set = (Set) obj4;
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    TextKt.m509Text4IGK_g(com.stripe.android.financialconnections.ui.components.TextKt.pluralStringResource(R.string.stripe_account_picker_cta_link_singular, R.string.stripe_account_picker_cta_link_plural, set.size(), new Object[0], gapComposer14), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, gapComposer14, 0, 0, 131070);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                FinancialConnectionsInstitution financialConnectionsInstitution = (FinancialConnectionsInstitution) obj4;
                Composer composer15 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    if (financialConnectionsInstitution != null && (image = financialConnectionsInstitution.icon) != null) {
                        str = image.f809default;
                    }
                    ListItemKt.InstitutionIcon(432, 0, gapComposer15, SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), str, true);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                AccountPickerState.Payload payload = (AccountPickerState.Payload) obj4;
                Composer composer16 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (!gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    gapComposer16.skipToGroupEnd();
                } else if (payload != null) {
                    gapComposer16.startReplaceGroup(-662510875);
                    Object rememberedValue3 = gapComposer16.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new MarkdownParser$$ExternalSyntheticLambda0(12);
                        gapComposer16.updateRememberedValue(rememberedValue3);
                    }
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(TestTagKt.testTag(SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue3), "loaded_picker_title"), 1.0f);
                    int ordinal = payload.selectionMode.ordinal();
                    if (ordinal == 0) {
                        i = R.string.stripe_account_picker_singleselect_account;
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        i = R.string.stripe_account_picker_multiselect_account;
                    }
                    TextKt.m509Text4IGK_g(Room.stringResource(gapComposer16, i), fillMaxWidth2, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((FinancialConnectionsTypography) gapComposer16.consume(ThemeKt.LocalTypography)).headingXLarge, gapComposer16, 0, 0, 65532);
                    gapComposer16.end(false);
                } else {
                    gapComposer16.startReplaceGroup(-661883714);
                    TextKt.m509Text4IGK_g(Room.stringResource(gapComposer16, R.string.stripe_account_picker_retrieving_accounts), SizeKt.fillMaxWidth(companion, 1.0f), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((FinancialConnectionsTypography) gapComposer16.consume(ThemeKt.LocalTypography)).headingXLarge, gapComposer16, 48, 0, 65532);
                    gapComposer16.end(false);
                }
                return Unit.INSTANCE;
            case 16:
                ConsentPane consentPane = (ConsentPane) obj4;
                Composer composer17 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    TextKt.m509Text4IGK_g(consentPane.cta, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, gapComposer17, 0, 0, 131070);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                ConsentState.Payload payload2 = (ConsentState.Payload) obj4;
                Composer composer18 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    SpacerKt.Spacer(gapComposer18, SizeKt.m285size3ABfNKs(companion, 8.0f));
                    ConsentLogoHeaderKt.ConsentLogoHeader(SizeKt.fillMaxWidth(companion, 1.0f), payload2.merchantLogos, payload2.showAnimatedDots, gapComposer18, 6);
                    SpacerKt.Spacer(gapComposer18, SizeKt.m285size3ABfNKs(companion, 32.0f));
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction genericInfoAction = (FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction) obj4;
                Composer composer19 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    TextKt.m509Text4IGK_g(genericInfoAction.label, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, gapComposer19, 0, 0, 131070);
                    Image image2 = genericInfoAction.icon;
                    String str3 = image2 != null ? image2.f809default : null;
                    if (str3 == null) {
                        gapComposer19.startReplaceGroup(2543147);
                    } else {
                        gapComposer19.startReplaceGroup(2543148);
                        SpacerKt.Spacer(gapComposer19, SizeKt.m285size3ABfNKs(companion, 12.0f));
                        StripeImageKt.StripeImage(str3, (DefaultStripeImageLoader) gapComposer19.consume(FinancialConnectionsSheetNativeActivityKt.LocalImageLoader), null, SizeKt.m285size3ABfNKs(companion, 16.0f), null, null, null, null, null, null, gapComposer19, 3456, 0, 2032);
                    }
                    gapComposer19.end(false);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                TextResource.Text text = (TextResource.Text) obj4;
                Composer composer20 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 17) != 16)) {
                    TextKt.m509Text4IGK_g(text.toText(gapComposer20, 0).toString(), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, gapComposer20, 0, 0, 131070);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                LinkAccountPickerState.Payload payload3 = (LinkAccountPickerState.Payload) obj4;
                Composer composer21 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 17) != 16)) {
                    Object rememberedValue4 = gapComposer21.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new MarkdownParser$$ExternalSyntheticLambda0(25);
                        gapComposer21.updateRememberedValue(rememberedValue4);
                    }
                    Modifier testTag = TestTagKt.testTag(SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue4), "loaded_picker_title");
                    TextResource.Text text2 = new TextResource.Text(payload3.title);
                    TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((FinancialConnectionsTypography) gapComposer21.consume(ThemeKt.LocalTypography)).headingXLarge, ((FinancialConnectionsColors) gapComposer21.consume(ThemeKt.LocalColors)).textDefault, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214);
                    Object rememberedValue5 = gapComposer21.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new MarkdownParser$$ExternalSyntheticLambda0(i3);
                        gapComposer21.updateRememberedValue(rememberedValue5);
                    }
                    com.stripe.android.financialconnections.ui.components.TextKt.m4020AnnotatedTextrm0N8CA(text2, (Function1) rememberedValue5, m994copyp1EtxEg$default, testTag, null, 0, 0, gapComposer21, 48, 112);
                    SpacerKt.Spacer(gapComposer21, SizeKt.m285size3ABfNKs(companion, 8.0f));
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                NetworkingLinkVerificationState.Payload payload4 = (NetworkingLinkVerificationState.Payload) obj4;
                Composer composer22 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer22 = (GapComposer) composer22;
                if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    NetworkingLinkVerificationScreenKt.Header(payload4, gapComposer22, 0);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                NetworkingSaveToLinkVerificationState.Payload payload5 = (NetworkingSaveToLinkVerificationState.Payload) obj4;
                Composer composer23 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer23;
                if (gapComposer23.shouldExecute(intValue23 & 1, (intValue23 & 17) != 16)) {
                    NetworkingSaveToLinkVerificationScreenKt.Header(payload5, gapComposer23, 8);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                MutableFloatState mutableFloatState = (MutableFloatState) obj4;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Composer composer24 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                if ((intValue24 & 6) == 0) {
                    intValue24 |= ((GapComposer) composer24).changed(booleanValue) ? 4 : 2;
                }
                GapComposer gapComposer24 = (GapComposer) composer24;
                if (gapComposer24.shouldExecute(intValue24 & 1, (intValue24 & 19) != 18)) {
                    boolean changed = gapComposer24.changed(mutableFloatState);
                    Object rememberedValue6 = gapComposer24.rememberedValue();
                    if (changed || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new SuccessContentKt$$ExternalSyntheticLambda0(mutableFloatState, 0);
                        gapComposer24.updateRememberedValue(rememberedValue6);
                    }
                    SuccessContentKt.SpinnerToCheckmark(intValue24 & 14, gapComposer24, null, (Function0) rememberedValue6, booleanValue);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                return invoke$com$stripe$android$financialconnections$navigation$bottomsheet$BottomSheetNavigator$$ExternalSyntheticLambda0(obj, obj2, obj3);
            case 25:
                FProfileHomeListViewAdapter fProfileHomeListViewAdapter = (FProfileHomeListViewAdapter) obj4;
                SelfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem selfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem = (SelfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem) obj;
                Pi2SelfieReviewItemBinding pi2SelfieReviewItemBinding = (Pi2SelfieReviewItemBinding) obj2;
                selfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem.getClass();
                pi2SelfieReviewItemBinding.getClass();
                ((RecyclerView.ViewHolder) obj3).getClass();
                ShapeableImageView shapeableImageView = pi2SelfieReviewItemBinding.image;
                TextView textView = pi2SelfieReviewItemBinding.label;
                shapeableImageView.setScaleX(-1.0f);
                Selfie.SelfieImage selfieImage = selfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem.selfie;
                String str4 = selfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem.label;
                String str5 = selfieImage.absoluteFilePath;
                Context context = shapeableImageView.getContext();
                AtomicReference atomicReference = SingletonImageLoader.reference;
                Object obj5 = atomicReference.get();
                RealImageLoader realImageLoader3 = obj5 instanceof RealImageLoader ? (RealImageLoader) obj5 : null;
                if (realImageLoader3 == null) {
                    while (true) {
                        Object obj6 = atomicReference.get();
                        if (obj6 instanceof RealImageLoader) {
                            realImageLoader = realImageLoader2;
                            realImageLoader2 = (RealImageLoader) obj6;
                        } else {
                            if (realImageLoader2 == null) {
                                context.getApplicationContext();
                                Extras.Key key = SingletonImageLoaderKt.DefaultSingletonImageLoaderKey;
                                realImageLoader2 = SingletonImageLoaderKt$$ExternalSyntheticLambda0.newImageLoader(context);
                            }
                            realImageLoader = realImageLoader2;
                        }
                        while (!atomicReference.compareAndSet(obj6, realImageLoader2)) {
                            if (atomicReference.get() != obj6) {
                                break;
                            }
                        }
                        realImageLoader3 = realImageLoader2;
                        realImageLoader2 = realImageLoader;
                    }
                }
                ImageRequest.Builder builder = new ImageRequest.Builder(shapeableImageView.getContext());
                builder.data = str5;
                ImageRequests_androidKt.target(builder, shapeableImageView);
                realImageLoader3.enqueue(builder.build());
                if (str4 == null || StringsKt.isBlank(str4)) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                    ExtensionsKt.setMarkdown(textView, str4);
                }
                TextBasedComponentStyle textBasedComponentStyle = (TextBasedComponentStyle) fProfileHomeListViewAdapter.inflater;
                if (textBasedComponentStyle != null) {
                    TextStylingKt.style(textView, textBasedComponentStyle, EmptySet.INSTANCE);
                }
                pi2SelfieReviewItemBinding.rootView.setContentDescription(str4);
                return Unit.INSTANCE;
            case 26:
                HelpBottomSheetComponentStyle helpBottomSheetComponentStyle = (HelpBottomSheetComponentStyle) obj4;
                HelpPagerItem helpPagerItem = (HelpPagerItem) obj;
                Pi2NavigationTroubleshootingTipsPageItemBinding pi2NavigationTroubleshootingTipsPageItemBinding = (Pi2NavigationTroubleshootingTipsPageItemBinding) obj2;
                helpPagerItem.getClass();
                pi2NavigationTroubleshootingTipsPageItemBinding.getClass();
                ((RecyclerView.ViewHolder) obj3).getClass();
                TextView textView2 = pi2NavigationTroubleshootingTipsPageItemBinding.description;
                textView2.setText(helpPagerItem.description);
                if (helpBottomSheetComponentStyle != null && (helpTextviewStyle = helpBottomSheetComponentStyle.getHelpTextviewStyle()) != null) {
                    TextStylingKt.style(textView2, helpTextviewStyle, SetsKt__SetsJVMKt.setOf(TextStyleElements.Margin));
                }
                Integer num2 = helpPagerItem.localAsset;
                if (num2 != null) {
                    int intValue25 = num2.intValue();
                    ThemeableLottieAnimationView themeableLottieAnimationView = pi2NavigationTroubleshootingTipsPageItemBinding.lottieView;
                    themeableLottieAnimationView.setAnimation(intValue25);
                    if (helpBottomSheetComponentStyle != null) {
                        ImageStylingKt.replaceColors(themeableLottieAnimationView, helpBottomSheetComponentStyle.getStrokeColorValue(), helpBottomSheetComponentStyle.getFillColorValue(), null, helpBottomSheetComponentStyle.getBackgroundColorValue(), HelpPagerAdapter.STROKE_COLORS, HelpPagerAdapter.FILL_COLORS, new String[0], HelpPagerAdapter.BACKGROUND_COLORS);
                    }
                    themeableLottieAnimationView.playAnimation();
                }
                return Unit.INSTANCE;
            default:
                MutexImpl mutexImpl = (MutexImpl) obj4;
                MutexImpl.owner$volatile$FU.set(mutexImpl, null);
                mutexImpl.unlock(null);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CardAppletTile$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }
}
